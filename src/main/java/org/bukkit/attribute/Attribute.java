package org.bukkit.attribute;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Types of attributes which may be present on an {@link Attributable}.
 */
public abstract class Attribute extends OldEnum<Attribute> implements Keyed {

    /**
     * Maximum health of an Entity.
     */
    public static final Attribute GENERIC_MAX_HEALTH = getAttribute("generic.max_health");
    /**
     * Range at which an Entity will follow others.
     */
    public static final Attribute GENERIC_FOLLOW_RANGE = getAttribute("generic.follow_range");
    /**
     * Resistance of an Entity to knockback.
     */
    public static final Attribute GENERIC_KNOCKBACK_RESISTANCE = getAttribute("generic.knockback_resistance");
    /**
     * Movement speed of an Entity.
     */
    public static final Attribute GENERIC_MOVEMENT_SPEED = getAttribute("generic.movement_speed");
    /**
     * Flying speed of an Entity.
     */
    public static final Attribute GENERIC_FLYING_SPEED = getAttribute("generic.flying_speed");
    /**
     * Attack damage of an Entity.
     */
    public static final Attribute GENERIC_ATTACK_DAMAGE = getAttribute("generic.attack_damage");
    /**
     * Attack knockback of an Entity.
     */
    public static final Attribute GENERIC_ATTACK_KNOCKBACK = getAttribute("generic.attack_knockback");
    /**
     * Attack speed of an Entity.
     */
    public static final Attribute GENERIC_ATTACK_SPEED = getAttribute("generic.attack_speed");
    /**
     * Armor bonus of an Entity.
     */
    public static final Attribute GENERIC_ARMOR = getAttribute("generic.armor");
    /**
     * Armor durability bonus of an Entity.
     */
    public static final Attribute GENERIC_ARMOR_TOUGHNESS = getAttribute("generic.armor_toughness");
    /**
     * Luck bonus of an Entity.
     */
    public static final Attribute GENERIC_LUCK = getAttribute("generic.luck");
    /**
     * Strength with which a horse will jump.
     */
    public static final Attribute HORSE_JUMP_STRENGTH = getAttribute("horse.jump_strength");
    /**
     * Chance of a zombie to spawn reinforcements.
     */
    public static final Attribute ZOMBIE_SPAWN_REINFORCEMENTS = getAttribute("zombie.spawn_reinforcements");

    @NotNull
    private static Attribute getAttribute(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        Attribute attribute = Registry.ATTRIBUTE.get(namespacedKey);
        Preconditions.checkNotNull(attribute, "No Attribute found for %s. This is a bug.", namespacedKey);
        return attribute;
    }

    /**
     * @param name of the attribute.
     * @return the attribute with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static Attribute valueOf(@NotNull String name) {
        Attribute attribute = Registry.ATTRIBUTE.get(NamespacedKey.fromString(name.toLowerCase()));
        if (attribute != null) {
            return attribute;
        }

        // Attribute keys can have dots in them which where converted to _. Since converting
        // the _ back to a dot would be to complex (since not all _ need to be converted back) we use the field name.
        try {
            attribute = (Attribute) Attribute.class.getField(name).get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            attribute = null;
        }
        Preconditions.checkArgument(attribute != null, "No Attribute found with the name %s", name);
        return attribute;
    }

    /**
     * @return an array of all known Attributes.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static Attribute[] values() {
        return Lists.newArrayList(Registry.ATTRIBUTE).toArray(new Attribute[0]);
    }
}
