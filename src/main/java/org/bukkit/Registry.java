package org.bukkit;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import org.bukkit.advancement.Advancement;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Biome;
import org.bukkit.boss.KeyedBossBar;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.entity.memory.MemoryKey;
import org.bukkit.loot.LootTables;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a registry of Bukkit objects that may be retrieved by
 * {@link NamespacedKey}.
 *
 * @param <T> type of item in the registry
 */
public interface Registry<T extends Keyed> extends Iterable<T> {

    /**
     * Server advancements.
     *
     * @see Bukkit#getAdvancement(org.bukkit.NamespacedKey)
     * @see Bukkit#advancementIterator()
     */
    Registry<Advancement> ADVANCEMENT = new Registry<Advancement>() {

        @Nullable
        @Override
        public Advancement get(@NotNull NamespacedKey key) {
            return Bukkit.getAdvancement(key);
        }

        @NotNull
        @Override
        public Iterator<Advancement> iterator() {
            return Bukkit.advancementIterator();
        }
    };
    /**
     * Server art.
     *
     * @see Art
     */
    Registry<Art> ART = Objects.requireNonNull(Bukkit.getRegistry(Art.class), "No registry present for Art. This is a bug.");
    /**
     * Attribute.
     *
     * @see Attribute
     */
    Registry<Attribute> ATTRIBUTE = Objects.requireNonNull(Bukkit.getRegistry(Attribute.class), "No registry present for Attribute. This is a bug.");
    /**
     * Server biomes.
     *
     * @see Biome
     */
    Registry<Biome> BIOME = Objects.requireNonNull(Bukkit.getRegistry(Biome.class), "No registry present for Biome. This is a bug.");
    /**
     * Custom boss bars.
     *
     * @see Bukkit#getBossBar(org.bukkit.NamespacedKey)
     * @see Bukkit#getBossBars()
     */
    Registry<KeyedBossBar> BOSS_BARS = new Registry<KeyedBossBar>() {

        @Nullable
        @Override
        public KeyedBossBar get(@NotNull NamespacedKey key) {
            return Bukkit.getBossBar(key);
        }

        @NotNull
        @Override
        public Iterator<KeyedBossBar> iterator() {
            return Bukkit.getBossBars();
        }
    };
    /**
     * Server enchantments.
     *
     * @see Enchantment#getByKey(org.bukkit.NamespacedKey)
     */
    Registry<Enchantment> ENCHANTMENT = Objects.requireNonNull(Bukkit.getRegistry(Enchantment.class), "No registry present for Enchantment. This is a bug.");
    /**
     * Server entity types.
     *
     * @see EntityType
     */
    Registry<EntityType> ENTITY_TYPE = Objects.requireNonNull(Bukkit.getRegistry(EntityType.class), "No registry present for EntityType. This is a bug.");
    /**
     * Default server loot tables.
     *
     * @see LootTables
     */
    Registry<LootTables> LOOT_TABLES = new SimpleRegistry<>(LootTables.class);
    /**
     * Server materials.
     *
     * @see Material
     */
    Registry<Material> MATERIAL = Objects.requireNonNull(Bukkit.getRegistry(Material.class), "No registry present for Material. This is a bug.");
    /**
     * Server statistics.
     *
     * @see Statistic
     */
    Registry<Statistic> STATISTIC = new SimpleRegistry<>(Statistic.class);
    /**
     * Sound keys.
     *
     * @see Sound
     */
    Registry<Sound> SOUNDS = Objects.requireNonNull(Bukkit.getRegistry(Sound.class), "No registry present for Sound. This is a bug.");
    /**
     * Villager profession.
     *
     * @see Villager.Profession
     */
    Registry<Villager.Profession> VILLAGER_PROFESSION = Objects.requireNonNull(Bukkit.getRegistry(Villager.Profession.class), "No registry present for Villager Profession. This is a bug.");
    /**
     * Villager type.
     *
     * @see Villager.Type
     */
    Registry<Villager.Type> VILLAGER_TYPE = Objects.requireNonNull(Bukkit.getRegistry(Villager.Type.class), "No registry present for Villager Type. This is a bug.");
    /**
     * Memory Keys.
     *
     * @see MemoryKey
     */
    Registry<MemoryKey> MEMORY_MODULE_TYPE = new Registry<MemoryKey>() {

        @NotNull
        @Override
        public Iterator iterator() {
            return MemoryKey.values().iterator();
        }

        @Nullable
        @Override
        public MemoryKey get(@NotNull NamespacedKey key) {
            return MemoryKey.getByKey(key);
        }
    };
    /**
     * Server fluids.
     *
     * @see Fluid
     */
    Registry<Fluid> FLUID = Objects.requireNonNull(Bukkit.getRegistry(Fluid.class), "No registry present for Fluid. This is a bug.");
    /**
     * Game events.
     *
     * @see GameEvent
     */
    Registry<GameEvent> GAME_EVENT = new Registry<GameEvent>() {

        @NotNull
        @Override
        public Iterator iterator() {
            return GameEvent.values().iterator();
        }

        @Nullable
        @Override
        public GameEvent get(@NotNull NamespacedKey key) {
            return GameEvent.getByKey(key);
        }
    };

    /**
     * Server potion effect types.
     *
     * @see PotionEffectType
     */
    Registry<PotionEffectType> POTION_EFFECT_TYPE = Objects.requireNonNull(Bukkit.getRegistry(PotionEffectType.class), "No registry present for Potion Effect Type. This is a bug.");

    /**
     * Get the object by its key.
     *
     * @param key non-null key
     * @return item or null if does not exist
     */
    @Nullable
    T get(@NotNull NamespacedKey key);

    static final class SimpleRegistry<T extends Enum<T> & Keyed> implements Registry<T> {

        private final Map<NamespacedKey, T> map;

        protected SimpleRegistry(@NotNull Class<T> type) {
            this(type, Predicates.<T>alwaysTrue());
        }

        protected SimpleRegistry(@NotNull Class<T> type, @NotNull Predicate<T> predicate) {
            ImmutableMap.Builder<NamespacedKey, T> builder = ImmutableMap.builder();

            for (T entry : type.getEnumConstants()) {
                if (predicate.test(entry)) {
                    builder.put(entry.getKey(), entry);
                }
            }

            map = builder.build();
        }

        @Nullable
        @Override
        public T get(@NotNull NamespacedKey key) {
            return map.get(key);
        }

        @NotNull
        @Override
        public Iterator<T> iterator() {
            return map.values().iterator();
        }
    }
}
