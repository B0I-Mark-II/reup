package org.bukkit.entity;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.bukkit.DyeColor;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Meow.
 */
public interface Cat extends Tameable, Sittable {

    /**
     * Gets the current type of this cat.
     *
     * @return Type of the cat.
     */
    @NotNull
    public Type getCatType();

    /**
     * Sets the current type of this cat.
     *
     * @param type New type of this cat.
     */
    public void setCatType(@NotNull Type type);

    /**
     * Get the collar color of this cat
     *
     * @return the color of the collar
     */
    @NotNull
    public DyeColor getCollarColor();

    /**
     * Set the collar color of this cat
     *
     * @param color the color to apply
     */
    public void setCollarColor(@NotNull DyeColor color);

    /**
     * Represents the various different cat types there are.
     */
    abstract class Type extends OldEnum<Type> implements Keyed {
        public static final Type TABBY = getType("tabby");
        public static final Type BLACK = getType("black");
        public static final Type RED = getType("red");
        public static final Type SIAMESE = getType("siamese");
        public static final Type BRITISH_SHORTHAIR = getType("british_shorthair");
        public static final Type CALICO = getType("calico");
        public static final Type PERSIAN = getType("persian");
        public static final Type RAGDOLL = getType("ragdoll");
        public static final Type WHITE = getType("white");
        public static final Type JELLIE = getType("jellie");
        public static final Type ALL_BLACK = getType("all_black");

        @NotNull
        private static Type getType(@NotNull String key) {
            NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
            Type type = Registry.CAT_TYPE.get(namespacedKey);
            Preconditions.checkNotNull(type, "No cat type found for %s. This is a bug.", namespacedKey);
            return type;
        }

        /**
         * @param name of the cat type.
         * @return the cat type with the given name.
         * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
         */
        @NotNull
        @Deprecated
        public static Type valueOf(@NotNull String name) {
            Type type = Registry.CAT_TYPE.get(NamespacedKey.fromString(name.toLowerCase()));
            Preconditions.checkArgument(type != null, "No cat type found with the name %s", name);
            return type;
        }

        /**
         * @return an array of all known cat types.
         * @deprecated use {@link Registry#iterator()}.
         */
        @NotNull
        @Deprecated
        public static Type[] values() {
            return Lists.newArrayList(Registry.CAT_TYPE).toArray(new Type[0]);
        }
    }
}
