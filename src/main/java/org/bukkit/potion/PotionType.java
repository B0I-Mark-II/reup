package org.bukkit.potion;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This enum reflects and matches each potion state that can be obtained from
 * the Creative mode inventory
 */
public abstract class PotionType extends OldEnum<PotionType> implements Keyed {
    public static final PotionType EMPTY = getPotionType("empty");
    public static final PotionType WATER = getPotionType("water");
    public static final PotionType MUNDANE = getPotionType("mundane");
    public static final PotionType THICK = getPotionType("thick");
    public static final PotionType AWKWARD = getPotionType("awkward");
    public static final PotionType NIGHT_VISION = getPotionType("night_vision");
    public static final PotionType LONG_NIGHT_VISION = getPotionType("long_night_vision");
    public static final PotionType INVISIBILITY = getPotionType("invisibility");
    public static final PotionType LONG_INVISIBILITY = getPotionType("long_invisibility");
    public static final PotionType LEAPING = getPotionType("leaping");
    public static final PotionType LONG_LEAPING = getPotionType("long_leaping");
    public static final PotionType STRONG_LEAPING = getPotionType("strong_leaping");
    public static final PotionType FIRE_RESISTANCE = getPotionType("fire_resistance");
    public static final PotionType LONG_FIRE_RESISTANCE = getPotionType("long_fire_resistance");
    public static final PotionType SWIFTNESS = getPotionType("swiftness");
    public static final PotionType LONG_SWIFTNESS = getPotionType("long_swiftness");
    public static final PotionType STRONG_SWIFTNESS = getPotionType("strong_swiftness");
    public static final PotionType SLOWNESS = getPotionType("slowness");
    public static final PotionType LONG_SLOWNESS = getPotionType("long_slowness");
    public static final PotionType STRONG_SLOWNESS = getPotionType("strong_slowness");
    public static final PotionType WATER_BREATHING = getPotionType("water_breathing");
    public static final PotionType LONG_WATER_BREATHING = getPotionType("long_water_breathing");
    public static final PotionType HEALING = getPotionType("healing");
    public static final PotionType STRONG_HEALING = getPotionType("strong_healing");
    public static final PotionType HARMING = getPotionType("harming");
    public static final PotionType STRONG_HARMING = getPotionType("strong_harming");
    public static final PotionType POISON = getPotionType("poison");
    public static final PotionType LONG_POISON = getPotionType("long_poison");
    public static final PotionType STRONG_POISON = getPotionType("strong_poison");
    public static final PotionType REGENERATION = getPotionType("regeneration");
    public static final PotionType LONG_REGENERATION = getPotionType("long_regeneration");
    public static final PotionType STRONG_REGENERATION = getPotionType("strong_regeneration");
    public static final PotionType STRENGTH = getPotionType("strength");
    public static final PotionType LONG_STRENGTH = getPotionType("long_strength");
    public static final PotionType STRONG_STRENGTH = getPotionType("strong_strength");
    public static final PotionType WEAKNESS = getPotionType("weakness");
    public static final PotionType LONG_WEAKNESS = getPotionType("long_weakness");
    public static final PotionType LUCK = getPotionType("luck");
    public static final PotionType TURTLE_MASTER = getPotionType("turtle_master");
    public static final PotionType LONG_TURTLE_MASTER = getPotionType("long_turtle_master");
    public static final PotionType STRONG_TURTLE_MASTER = getPotionType("strong_turtle_master");
    public static final PotionType SLOW_FALLING = getPotionType("slow_falling");
    public static final PotionType LONG_SLOW_FALLING = getPotionType("long_slow_falling");

    @NotNull
    private static PotionType getPotionType(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        PotionType potionType = Registry.POTION.get(namespacedKey);
        Preconditions.checkNotNull(potionType, "No potion type found for %s. This is a bug.", namespacedKey);
        return potionType;
    }

    /**
     * @return the potion effect type of this potion type
     * @deprecated Potions can have multiple effects use {@link #getPotionEffects()}
     */
    @Nullable
    @Deprecated
    public abstract PotionEffectType getEffectType();

    /**
     * @return a list of all effects this potion type has
     */
    @NotNull
    public abstract List<PotionEffect> getPotionEffects();

    /**
     * @return if this potion type is instant
     * @deprecated PotionType can have multiple effects, some of which can be instant and others not.
     * Use {@link PotionEffectType#isInstant()} in combination with {@link #getPotionEffects()} and {@link PotionEffect#getType()}
     */
    @Deprecated
    public abstract boolean isInstant();

    /**
     * Checks if the potion type has an upgraded state.
     * This refers to whether or not the potion type can be Tier 2,
     * such as Potion of Fire Resistance II.
     *
     * @return true if the potion type can be upgraded;
     */
    public abstract boolean isUpgradeable();

    /**
     * Checks if the potion type has an extended state.
     * This refers to the extended duration potions
     *
     * @return true if the potion type can be extended
     */
    public abstract boolean isExtendable();

    public abstract int getMaxLevel();

    /**
     * @param effectType the effect to get by
     * @return the matching potion type
     * @deprecated Misleading
     */
    @Deprecated
    @Nullable
    public static PotionType getByEffect(@Nullable PotionEffectType effectType) {
        if (effectType == null)
            return WATER;
        for (PotionType type : PotionType.values()) {
            if (effectType.equals(type.getEffectType()))
                return type;
        }
        return null;
    }

    /**
     * @param name of the potion type.
     * @return the potion type with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static PotionType valueOf(@NotNull String name) {
        name = convertLegacy(name);
        PotionType potionType = Registry.POTION.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(potionType != null, "No potion type found with the name %s", name);
        return potionType;
    }

    /**
     * @return an array of all known potion types.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static PotionType[] values() {
        return Lists.newArrayList(Registry.POTION).toArray(new PotionType[0]);
    }

    private static String convertLegacy(String from) {
        if (from == null) {
            return null;
        }

        switch (from.toLowerCase()) {
            case "uncraftable":
                return "empty";
            case "jump":
                return "leaping";
            case "speed":
                return "swiftness";
            case "instant_heal":
                return "healing";
            case "instant_damage":
                return "harming";
            case "regen":
                return "regeneration";
        }

        return from;
    }
}
