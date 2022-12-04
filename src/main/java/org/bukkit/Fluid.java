package org.bukkit;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a fluid type.
 */
public abstract class Fluid extends OldEnum<Fluid> implements Keyed {

    /**
     * Empty.
     */
    public static final Fluid EMPTY = getFluid("empty");
    /**
     * Stationary water.
     */
    public static final Fluid WATER = getFluid("water");
    /**
     * Flowing water.
     */
    public static final Fluid FLOWING_WATER = getFluid("flowing_water");
    /**
     * Stationary lava.
     */
    public static final Fluid LAVA = getFluid("lava");
    /**
     * Flowing lava.
     */
    public static final Fluid FLOWING_LAVA = getFluid("flowing_lava");

    @NotNull
    private static Fluid getFluid(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        Fluid fluid = Registry.FLUID.get(namespacedKey);
        Preconditions.checkNotNull(fluid, "No Fluid found for %s. This is a bug.", namespacedKey);
        return fluid;
    }

    /**
     * @param name of the fluid.
     * @return the fluid with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static Fluid valueOf(@NotNull String name) {
        Fluid fluid = Registry.FLUID.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(fluid != null, "No Fluid found with the name %s", name);
        return fluid;
    }

    /**
     * @return an array of all known Fluid.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static Fluid[] values() {
        return Lists.newArrayList(Registry.FLUID).toArray(new Fluid[0]);
    }
}
