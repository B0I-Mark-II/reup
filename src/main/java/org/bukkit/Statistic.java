package org.bukkit;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a countable statistic, which is tracked by the server.
 */
public abstract class Statistic extends OldEnum<Statistic> implements Keyed {

    public static final Statistic DAMAGE_DEALT = getStatistic("damage_dealt");
    public static final Statistic DAMAGE_TAKEN = getStatistic("damage_taken");
    public static final Statistic DEATHS = getStatistic("deaths");
    public static final Statistic MOB_KILLS = getStatistic("mob_kills");
    public static final Statistic PLAYER_KILLS = getStatistic("player_kills");
    public static final Statistic FISH_CAUGHT = getStatistic("fish_caught");
    public static final Statistic ANIMALS_BRED = getStatistic("animals_bred");
    public static final Statistic LEAVE_GAME = getStatistic("leave_game");
    public static final Statistic JUMP = getStatistic("jump");
    public static final Statistic DROP_COUNT = getStatistic("drop_count");
    /**
     * Type: {@link Type#ITEM}
     */
    public static final Statistic DROP = getStatistic("drop");
    /**
     * Type: {@link Type#ITEM}
     */
    public static final Statistic PICKUP = getStatistic("pickup");
    /**
     * Name is misleading, actually records ticks played.
     */
    public static final Statistic PLAY_ONE_MINUTE = getStatistic("play_one_minute");
    public static final Statistic TOTAL_WORLD_TIME = getStatistic("total_world_time");
    public static final Statistic WALK_ONE_CM = getStatistic("walk_one_cm");
    public static final Statistic WALK_ON_WATER_ONE_CM = getStatistic("walk_on_water_one_cm");
    public static final Statistic FALL_ONE_CM = getStatistic("fall_one_cm");
    public static final Statistic SNEAK_TIME = getStatistic("sneak_time");
    public static final Statistic CLIMB_ONE_CM = getStatistic("climb_one_cm");
    public static final Statistic FLY_ONE_CM = getStatistic("fly_one_cm");
    public static final Statistic WALK_UNDER_WATER_ONE_CM = getStatistic("walk_under_water_one_cm");
    public static final Statistic MINECART_ONE_CM = getStatistic("minecart_one_cm");
    public static final Statistic BOAT_ONE_CM = getStatistic("boat_one_cm");
    public static final Statistic PIG_ONE_CM = getStatistic("pig_one_cm");
    public static final Statistic HORSE_ONE_CM = getStatistic("horse_one_cm");
    public static final Statistic SPRINT_ONE_CM = getStatistic("sprint_one_cm");
    public static final Statistic CROUCH_ONE_CM = getStatistic("crouch_one_cm");
    public static final Statistic AVIATE_ONE_CM = getStatistic("aviate_one_cm");
    /**
     * Type: {@link Type#BLOCK}
     */
    public static final Statistic MINE_BLOCK = getStatistic("mine_block");
    /**
     * Type: {@link Type#ITEM}
     */
    public static final Statistic USE_ITEM = getStatistic("use_item");
    /**
     * Type: {@link Type#ITEM}
     */
    public static final Statistic BREAK_ITEM = getStatistic("break_item");
    /**
     * Type: {@link Type#ITEM}
     */
    public static final Statistic CRAFT_ITEM = getStatistic("craft_item");
    /**
     * Type: {@link Type#ENTITY}
     */
    public static final Statistic KILL_ENTITY = getStatistic("kill_entity");
    /**
     * Type: {@link Type#ENTITY}
     */
    public static final Statistic ENTITY_KILLED_BY = getStatistic("entity_killed_by");
    public static final Statistic TIME_SINCE_DEATH = getStatistic("time_since_death");
    public static final Statistic TALKED_TO_VILLAGER = getStatistic("talked_to_villager");
    public static final Statistic TRADED_WITH_VILLAGER = getStatistic("traded_with_villager");
    public static final Statistic CAKE_SLICES_EATEN = getStatistic("cake_slices_eaten");
    public static final Statistic CAULDRON_FILLED = getStatistic("cauldron_filled");
    public static final Statistic CAULDRON_USED = getStatistic("cauldron_used");
    public static final Statistic ARMOR_CLEANED = getStatistic("armor_cleaned");
    public static final Statistic BANNER_CLEANED = getStatistic("banner_cleaned");
    public static final Statistic BREWINGSTAND_INTERACTION = getStatistic("brewingstand_interaction");
    public static final Statistic BEACON_INTERACTION = getStatistic("beacon_interaction");
    public static final Statistic DROPPER_INSPECTED = getStatistic("dropper_inspected");
    public static final Statistic HOPPER_INSPECTED = getStatistic("hopper_inspected");
    public static final Statistic DISPENSER_INSPECTED = getStatistic("dispenser_inspected");
    public static final Statistic NOTEBLOCK_PLAYED = getStatistic("noteblock_played");
    public static final Statistic NOTEBLOCK_TUNED = getStatistic("noteblock_tuned");
    public static final Statistic FLOWER_POTTED = getStatistic("flower_potted");
    public static final Statistic TRAPPED_CHEST_TRIGGERED = getStatistic("trapped_chest_triggered");
    public static final Statistic ENDERCHEST_OPENED = getStatistic("enderchest_opened");
    public static final Statistic ITEM_ENCHANTED = getStatistic("item_enchanted");
    public static final Statistic RECORD_PLAYED = getStatistic("record_played");
    public static final Statistic FURNACE_INTERACTION = getStatistic("furnace_interaction");
    public static final Statistic CRAFTING_TABLE_INTERACTION = getStatistic("crafting_table_interaction");
    public static final Statistic CHEST_OPENED = getStatistic("chest_opened");
    public static final Statistic SLEEP_IN_BED = getStatistic("sleep_in_bed");
    public static final Statistic SHULKER_BOX_OPENED = getStatistic("shulker_box_opened");
    public static final Statistic TIME_SINCE_REST = getStatistic("time_since_rest");
    public static final Statistic SWIM_ONE_CM = getStatistic("swim_one_cm");
    public static final Statistic DAMAGE_DEALT_ABSORBED = getStatistic("damage_dealt_absorbed");
    public static final Statistic DAMAGE_DEALT_RESISTED = getStatistic("damage_dealt_resisted");
    public static final Statistic DAMAGE_BLOCKED_BY_SHIELD = getStatistic("damage_blocked_by_shield");
    public static final Statistic DAMAGE_ABSORBED = getStatistic("damage_absorbed");
    public static final Statistic DAMAGE_RESISTED = getStatistic("damage_resisted");
    public static final Statistic CLEAN_SHULKER_BOX = getStatistic("clean_shulker_box");
    public static final Statistic OPEN_BARREL = getStatistic("open_barrel");
    public static final Statistic INTERACT_WITH_BLAST_FURNACE = getStatistic("interact_with_blast_furnace");
    public static final Statistic INTERACT_WITH_SMOKER = getStatistic("interact_with_smoker");
    public static final Statistic INTERACT_WITH_LECTERN = getStatistic("interact_with_lectern");
    public static final Statistic INTERACT_WITH_CAMPFIRE = getStatistic("interact_with_campfire");
    public static final Statistic INTERACT_WITH_CARTOGRAPHY_TABLE = getStatistic("interact_with_cartography_table");
    public static final Statistic INTERACT_WITH_LOOM = getStatistic("interact_with_loom");
    public static final Statistic INTERACT_WITH_STONECUTTER = getStatistic("interact_with_stonecutter");
    public static final Statistic BELL_RING = getStatistic("bell_ring");
    public static final Statistic RAID_TRIGGER = getStatistic("raid_trigger");
    public static final Statistic RAID_WIN = getStatistic("raid_win");
    public static final Statistic INTERACT_WITH_ANVIL = getStatistic("interact_with_anvil");
    public static final Statistic INTERACT_WITH_GRINDSTONE = getStatistic("interact_with_grindstone");
    public static final Statistic TARGET_HIT = getStatistic("target_hit");
    public static final Statistic INTERACT_WITH_SMITHING_TABLE = getStatistic("interact_with_smithing_table");
    public static final Statistic STRIDER_ONE_CM = getStatistic("strider_one_cm");

    @NotNull
    private static Statistic getStatistic(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        Statistic statistic = Registry.STATISTIC.get(namespacedKey);
        Preconditions.checkNotNull(statistic, "No Statistic found for %s. This is a bug.", namespacedKey);
        return statistic;
    }

    /**
     * Gets the type of this statistic.
     *
     * @return the type of this statistic
     */
    @NotNull
    public abstract Type getType();

    /**
     * Checks if this is a substatistic.
     * <p>
     * A substatistic exists en masse for each block, item, or entitytype, depending on
     * {@link #getType()}.
     * <p>
     * This is a redundant method and equivalent to checking
     * <code>getType() != Type.UNTYPED</code>
     *
     * @return true if this is a substatistic
     */
    public abstract boolean isSubstatistic();

    /**
     * Checks if this is a substatistic dealing with blocks.
     * <p>
     * This is a redundant method and equivalent to checking
     * <code>getType() == Type.BLOCK</code>
     *
     * @return true if this deals with blocks
     */
    public abstract boolean isBlock();

    /**
     * The type of statistic.
     *
     */
    public enum Type {
        /**
         * Statistics of this type do not require a qualifier.
         */
        UNTYPED,

        /**
         * Statistics of this type require an Item Material qualifier.
         */
        ITEM,

        /**
         * Statistics of this type require a Block Material qualifier.
         */
        BLOCK,

        /**
         * Statistics of this type require an EntityType qualifier.
         */
        ENTITY;
    }

    /**
     * @param name of the statistic.
     * @return the statistic with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static Statistic valueOf(@NotNull String name) {
        Statistic statistic = Registry.STATISTIC.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(statistic != null, "No Statistic found with the name %s", name);
        return statistic;
    }

    /**
     * @return an array of all known Statistic.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static Statistic[] values() {
        return Lists.newArrayList(Registry.STATISTIC).toArray(new Statistic[0]);
    }
}
