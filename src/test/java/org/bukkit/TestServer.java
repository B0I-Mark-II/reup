package org.bukkit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.SimplePluginManager;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public final class TestServer {

    static {
        try {
            TestServer server = new TestServer();
            Server instance = Mockito.mock(Mockito.withSettings().stubOnly());

            Mockito.when(instance.isPrimaryThread()).then(mock -> Thread.currentThread().equals(server.creatingThread));

            Mockito.when(instance.getPluginManager()).then(mock -> server.pluginManager);

            Mockito.when(instance.getLogger()).then(new Answer<Logger>() {
                final Logger logger = Logger.getLogger(TestServer.class.getCanonicalName());
                @Override
                public Logger answer(InvocationOnMock invocationOnMock) {
                    return logger;
                }
            });

            Mockito.when(instance.getName()).then(mock -> TestServer.class.getSimpleName());

            Mockito.when(instance.getVersion()).then(mock -> "Version_" + TestServer.class.getPackage().getImplementationVersion());

            Mockito.when(instance.getBukkitVersion()).then(mock -> "BukkitVersion_" + TestServer.class.getPackage().getImplementationVersion());

            Mockito.when(instance.getRegistry(Mockito.any())).then(new Answer<Object>() {
                private final Map<Class<? extends Keyed>, Registry<?>> registers = new HashMap<>();
                @Override
                public Object answer(InvocationOnMock invocationOnMock) {
                    return registers.computeIfAbsent(invocationOnMock.getArgument(0), aClass -> new Registry<Keyed>() {
                        private final Map<NamespacedKey, Keyed> cache = new HashMap<>();
                        @Override
                        public Keyed get(NamespacedKey key) {
                            return cache.computeIfAbsent(key, key2 -> Mockito.mock(aClass, Mockito.withSettings().stubOnly()));
                        }

                        @Override
                        public Iterator<Keyed> iterator() {
                            throw new UnsupportedOperationException("Not supported");
                        }
                    });
                }
            });

            UnsafeValues unsafeValues = Mockito.mock(Mockito.withSettings().stubOnly());

            Mockito.when(unsafeValues.createLegacyMaterial(Mockito.any(), Mockito.anyInt(), Mockito.anyInt(), Mockito.anyShort(), Mockito.any())).then(new Answer<Object>() {
                Map<String, Material> materials = new HashMap<>();
                @Override
                public Object answer(InvocationOnMock invocationOnMock) {
                    return materials.computeIfAbsent(invocationOnMock.getArgument(0), name -> Mockito.mock(Material.class, Mockito.withSettings().name(name).stubOnly()));
                }
            });

            Mockito.when(instance.getUnsafe()).then(mock -> unsafeValues);

            Bukkit.setServer(instance);
            server.pluginManager = new SimplePluginManager(instance, new SimpleCommandMap(instance));
        } catch (Throwable t) {
            throw new Error(t);
        }
    }

    private Thread creatingThread = Thread.currentThread();
    private PluginManager pluginManager;
    private TestServer() {}

    public static void setup() {}

    public static Server getInstance() {
        return Bukkit.getServer();
    }
}
