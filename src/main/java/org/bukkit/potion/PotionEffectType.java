package org.bukkit.potion;

import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Lists;
import org.apache.commons.lang.Validate;
import org.bukkit.Color;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a type of potion and its effect on an entity.
 */
public abstract class PotionEffectType implements Keyed {
    protected static final BiMap<Integer, PotionEffectType> ID_MAP = HashBiMap.create();

    /**
     * Increases movement speed.
     */
    public static final PotionEffectType SPEED = getPotionEffectType("speed", 1);

    /**
     * Decreases movement speed.
     */
    public static final PotionEffectType SLOWNESS = getPotionEffectType("slowness", 2);

    /**
     * Increases dig speed.
     */
    public static final PotionEffectType HASTE = getPotionEffectType("haste", 3);

    /**
     * Decreases dig speed.
     */
    public static final PotionEffectType MINING_FATIGUE = getPotionEffectType("mining_fatigue", 4);

    /**
     * Increases damage dealt.
     */
    public static final PotionEffectType STRENGTH = getPotionEffectType("strength", 5);

    /**
     * Heals an entity.
     */
    public static final PotionEffectType INSTANT_HEALTH = getPotionEffectType("instant_health", 6);

    /**
     * Hurts an entity.
     */
    public static final PotionEffectType INSTANT_DAMAGE = getPotionEffectType("instant_damage", 7);

    /**
     * Increases jump height.
     */
    public static final PotionEffectType JUMP_BOOST = getPotionEffectType("jump_boost", 8);

    /**
     * Warps vision on the client.
     */
    public static final PotionEffectType NAUSEA = getPotionEffectType("nausea", 9);

    /**
     * Regenerates health.
     */
    public static final PotionEffectType REGENERATION = getPotionEffectType("regeneration", 10);

    /**
     * Decreases damage dealt to an entity.
     */
    public static final PotionEffectType RESISTANCE = getPotionEffectType("resistance", 11);

    /**
     * Stops fire damage.
     */
    public static final PotionEffectType FIRE_RESISTANCE = getPotionEffectType("fire_resistance", 12);

    /**
     * Allows breathing underwater.
     */
    public static final PotionEffectType WATER_BREATHING = getPotionEffectType("water_breathing", 13);

    /**
     * Grants invisibility.
     */
    public static final PotionEffectType INVISIBILITY = getPotionEffectType("invisibility", 14);

    /**
     * Blinds an entity.
     */
    public static final PotionEffectType BLINDNESS = getPotionEffectType("blindness", 15);

    /**
     * Allows an entity to see in the dark.
     */
    public static final PotionEffectType NIGHT_VISION = getPotionEffectType("night_vision", 16);

    /**
     * Increases hunger.
     */
    public static final PotionEffectType HUNGER = getPotionEffectType("hunger", 17);

    /**
     * Decreases damage dealt by an entity.
     */
    public static final PotionEffectType WEAKNESS = getPotionEffectType("weakness", 18);

    /**
     * Deals damage to an entity over time.
     */
    public static final PotionEffectType POISON = getPotionEffectType("poison", 19);

    /**
     * Deals damage to an entity over time and gives the health to the
     * shooter.
     */
    public static final PotionEffectType WITHER = getPotionEffectType("wither", 20);

    /**
     * Increases the maximum health of an entity.
     */
    public static final PotionEffectType HEALTH_BOOST = getPotionEffectType("health_boost", 21);

    /**
     * Increases the maximum health of an entity with health that cannot be
     * regenerated, but is refilled every 30 seconds.
     */
    public static final PotionEffectType ABSORPTION = getPotionEffectType("absorption", 22);

    /**
     * Increases the food level of an entity each tick.
     */
    public static final PotionEffectType SATURATION = getPotionEffectType("saturation", 23);

    /**
     * Outlines the entity so that it can be seen from afar.
     */
    public static final PotionEffectType GLOWING = getPotionEffectType("glowing", 24);

    /**
     * Causes the entity to float into the air.
     */
    public static final PotionEffectType LEVITATION = getPotionEffectType("levitation", 25);

    /**
     * Loot table luck.
     */
    public static final PotionEffectType LUCK = getPotionEffectType("luck", 26);

    /**
     * Loot table unluck.
     */
    public static final PotionEffectType UNLUCK = getPotionEffectType("unluck", 27);

    /**
     * Slows entity fall rate.
     */
    public static final PotionEffectType SLOW_FALLING = getPotionEffectType("slow_falling", 28);

    /**
     * Effects granted by a nearby conduit. Includes enhanced underwater abilities.
     */
    public static final PotionEffectType CONDUIT_POWER = getPotionEffectType("conduit_power", 29);

    /**
     * Squee'ek uh'k kk'kkkk squeek eee'eek.
     */
    public static final PotionEffectType DOLPHINS_GRACE = getPotionEffectType("dolphins_grace", 30);

    /**
     * oof.
     */
    public static final PotionEffectType BAD_OMEN = getPotionEffectType("bad_omen", 31);

    /**
     * \o/.
     */
    public static final PotionEffectType HERO_OF_THE_VILLAGE = getPotionEffectType("hero_of_the_village", 32);

    private static PotionEffectType getPotionEffectType(@NotNull String key, int typeId) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        PotionEffectType potionEffectType = Registry.POTION_EFFECT_TYPE.get(namespacedKey);
        Preconditions.checkNotNull(potionEffectType, "No PotionEffectType found for %s. This is a bug.", namespacedKey);
        if (typeId > 0) {
            ID_MAP.put(typeId, potionEffectType);
        }
        return potionEffectType;
    }

    /**
     * Creates a PotionEffect from this PotionEffectType, applying duration
     * modifiers and checks.
     *
     * @param duration time in ticks
     * @param amplifier the effect's amplifier
     * @return a resulting potion effect
     * @see PotionBrewer#createEffect(PotionEffectType, int, int)
     */
    @NotNull
    public PotionEffect createEffect(int duration, int amplifier) {
        return new PotionEffect(this, isInstant() ? 1 : (int) (duration * getDurationModifier()), amplifier);
    }

    /**
     * Returns whether the effect of this type happens once, immediately.
     *
     * @return whether this type is normally instant
     */
    public abstract boolean isInstant();

    /**
     * Returns the color of this effect type.
     *
     * @return the color
     */
    @NotNull
    public abstract Color getColor();

    /**
     * Returns the duration modifier applied to effects of this type.
     *
     * @return duration modifier
     * @deprecated unused, always 1.0
     */
    @Deprecated
    public abstract double getDurationModifier();

    /**
     * Returns the unique ID of this type.
     *
     * @return Unique ID
     * @deprecated Magic value
     */
    @Deprecated
    public abstract int getId();

    /**
     * Returns the name of this effect type.
     *
     * @return The name of this effect type
     * @deprecated only for backwards compatibility, use {@link #getKey()} instead.
     */
    @NotNull
    @Deprecated
    public abstract String getName();

    /**
     * Gets the effect type specified by the unique id.
     *
     * @param id Unique ID to fetch
     * @return Resulting type, or null if not found.
     * @deprecated Magic value
     */
    @Deprecated
    @Nullable
    public static PotionEffectType getById(int id) {
        return ID_MAP.get(id);
    }

    /**
     * Gets the effect type specified by the given name.
     *
     * @param name Name of PotionEffectType to fetch
     * @return Resulting PotionEffectType, or null if not found.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @Nullable
    @Deprecated
    public static PotionEffectType getByName(@NotNull String name) {
        Validate.notNull(name, "name cannot be null");
        return Registry.POTION_EFFECT_TYPE.get(NamespacedKey.fromString(name.toLowerCase(java.util.Locale.ENGLISH)));
    }

    /**
     * @return an array of all known PotionEffectTypes.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static PotionEffectType[] values() {
        return Lists.newArrayList(Registry.POTION_EFFECT_TYPE).toArray(new PotionEffectType[0]);
    }

    /**
     * Registers an effect type with the given object.
     * <p>
     * Generally not to be used from within a plugin.
     *
     * @param type PotionType to register
     * @deprecated only for backwards compatibility, has no effect.
     */
    @Deprecated
    public static void registerPotionEffectType(@NotNull PotionEffectType type) {}

    /**
     * Stops accepting any effect type registrations.
     * @deprecated only for backwards compatibility, has no effect.
     */
    @Deprecated
    public static void stopAcceptingRegistrations() {}
}
