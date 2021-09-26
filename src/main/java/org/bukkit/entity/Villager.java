package org.bukkit.entity;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.bukkit.Keyed;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a villager NPC
 */
public interface Villager extends AbstractVillager {

    /**
     * Gets the current profession of this villager.
     *
     * @return Current profession.
     */
    @NotNull
    public Profession getProfession();

    /**
     * Sets the new profession of this villager.
     *
     * @param profession New profession.
     */
    public void setProfession(@NotNull Profession profession);

    /**
     * Gets the current type of this villager.
     *
     * @return Current type.
     */
    @NotNull
    public Type getVillagerType();

    /**
     * Sets the new type of this villager.
     *
     * @param type New type.
     */
    public void setVillagerType(@NotNull Type type);

    /**
     * Gets the level of this villager.
     *
     * A villager with a level of 1 and no experience is liable to lose its
     * profession.
     *
     * @return this villager's level
     */
    public int getVillagerLevel();

    /**
     * Sets the level of this villager.
     *
     * A villager with a level of 1 and no experience is liable to lose its
     * profession.
     *
     * @param level the new level
     * @throws IllegalArgumentException if level not between [1, 5]
     */
    public void setVillagerLevel(int level);

    /**
     * Gets the trading experience of this villager.
     *
     * @return trading experience
     */
    public int getVillagerExperience();

    /**
     * Sets the trading experience of this villager.
     *
     * @param experience new experience
     * @throws IllegalArgumentException if experience &lt; 0
     */
    public void setVillagerExperience(int experience);

    /**
     * Attempts to make this villager sleep at the given location.
     * <br>
     * The location must be in the current world and have a bed placed at the
     * location. The villager will put its head on the specified block while
     * sleeping.
     *
     * @param location the location of the bed
     * @return whether the sleep was successful
     */
    public boolean sleep(@NotNull Location location);

    /**
     * Causes this villager to wake up if he's currently sleeping.
     *
     * @throws IllegalStateException if not sleeping
     */
    public void wakeup();

    /**
     * Causes this villager to shake his head.
     */
    public void shakeHead();

    /**
     * Represents Villager type, usually corresponding to what biome they spawn
     * in.
     */
    public abstract class Type extends OldEnum<Type> implements Keyed {

        public static final Type DESERT = getType("desert");
        public static final Type JUNGLE = getType("jungle");
        public static final Type PLAINS = getType("plains");
        public static final Type SAVANNA = getType("savanna");
        public static final Type SNOW = getType("snow");
        public static final Type SWAMP = getType("swamp");
        public static final Type TAIGA = getType("taiga");

        @NotNull
        private static Type getType(@NotNull String key) {
            NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
            Type type = Registry.VILLAGER_TYPE.get(namespacedKey);
            Preconditions.checkNotNull(type, "No villager type found for %s. This is a bug.", namespacedKey);
            return type;
        }

        /**
         * @param name of the villager type.
         * @return the villager type with the given name.
         * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
         */
        @NotNull
        @Deprecated
        public static Type valueOf(@NotNull String name) {
            Type type = Registry.VILLAGER_TYPE.get(NamespacedKey.fromString(name.toLowerCase()));
            Preconditions.checkArgument(type != null, "No villager type found with the name %s", name);
            return type;
        }

        /**
         * @return an array of all known villager types.
         * @deprecated use {@link Registry#iterator()}.
         */
        @NotNull
        @Deprecated
        public static Type[] values() {
            return Lists.newArrayList(Registry.VILLAGER_TYPE).toArray(new Type[0]);
        }
    }

    /**
     * Represents the various different Villager professions there may be.
     * Villagers have different trading options depending on their profession,
     */
    public abstract class Profession extends OldEnum<Profession> implements Keyed {
        public static final Profession NONE = getProfession("none");
        /**
         * Armorer profession. Wears a black apron. Armorers primarily trade for
         * iron armor, chainmail armor, and sometimes diamond armor.
         */
        public static final Profession ARMORER = getProfession("armorer");
        /**
         * Butcher profession. Wears a white apron. Butchers primarily trade for
         * raw and cooked food.
         */
        public static final Profession BUTCHER = getProfession("butcher");
        /**
         * Cartographer profession. Wears a white robe. Cartographers primarily
         * trade for explorer maps and some paper.
         */
        public static final Profession CARTOGRAPHER = getProfession("cartographer");
        /**
         * Cleric profession. Wears a purple robe. Clerics primarily trade for
         * rotten flesh, gold ingot, redstone, lapis, ender pearl, glowstone,
         * and bottle o' enchanting.
         */
        public static final Profession CLERIC = getProfession("cleric");
        /**
         * Farmer profession. Wears a brown robe. Farmers primarily trade for
         * food-related items.
         */
        public static final Profession FARMER = getProfession("farmer");
        /**
         * Fisherman profession. Wears a brown robe. Fisherman primarily trade
         * for fish, as well as possibly selling string and/or coal.
         */
        public static final Profession FISHERMAN = getProfession("fisherman");
        /**
         * Fletcher profession. Wears a brown robe. Fletchers primarily trade
         * for string, bows, and arrows.
         */
        public static final Profession FLETCHER = getProfession("fletcher");
        /**
         * Leatherworker profession. Wears a white apron. Leatherworkers
         * primarily trade for leather, and leather armor, as well as saddles.
         */
        public static final Profession LEATHERWORKER = getProfession("leatherworker");
        /**
         * Librarian profession. Wears a white robe. Librarians primarily trade
         * for paper, books, and enchanted books.
         */
        public static final Profession LIBRARIAN = getProfession("librarian");
        /**
         * Mason profession.
         */
        public static final Profession MASON = getProfession("mason");
        /**
         * Nitwit profession. Wears a green apron, cannot trade. Nitwit
         * villagers do not do anything. They do not have any trades by default.
         */
        public static final Profession NITWIT = getProfession("nitwit");
        /**
         * Sheperd profession. Wears a brown robe. Shepherds primarily trade for
         * wool items, and shears.
         */
        public static final Profession SHEPHERD = getProfession("shepherd");
        /**
         * Toolsmith profession. Wears a black apron. Tool smiths primarily
         * trade for iron and diamond tools.
         */
        public static final Profession TOOLSMITH = getProfession("toolsmith");
        /**
         * Weaponsmith profession. Wears a black apron. Weapon smiths primarily
         * trade for iron and diamond weapons, sometimes enchanted.
         */
        public static final Profession WEAPONSMITH = getProfession("weaponsmith");

        @NotNull
        private static Profession getProfession(@NotNull String key) {
            NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
            Profession profession = Registry.VILLAGER_PROFESSION.get(namespacedKey);
            Preconditions.checkNotNull(profession, "No villager profession found for %s. This is a bug.", namespacedKey);
            return profession;
        }

        /**
         * @param name of the villager profession.
         * @return the villager profession with the given name.
         * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
         */
        @NotNull
        @Deprecated
        public static Profession valueOf(@NotNull String name) {
            Profession profession = Registry.VILLAGER_PROFESSION.get(NamespacedKey.fromString(name.toLowerCase()));
            Preconditions.checkArgument(profession != null, "No villager profession found with the name %s", name);
            return profession;
        }

        /**
         * @return an array of all known villager professions.
         * @deprecated use {@link Registry#iterator()}.
         */
        @NotNull
        @Deprecated
        public static Profession[] values() {
            return Lists.newArrayList(Registry.VILLAGER_PROFESSION).toArray(new Profession[0]);
        }
    }
}
