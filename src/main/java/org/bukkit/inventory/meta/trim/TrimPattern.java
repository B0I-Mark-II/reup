package org.bukkit.inventory.meta.trim;

import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.inventory.ItemType;

/**
 * Represents a pattern that may be used in an {@link ArmorTrim}.
 */
public interface TrimPattern extends Keyed {

    /**
     * {@link ItemType#SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern SENTRY = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("sentry"));
    /**
     * {@link ItemType#DUNE_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern DUNE = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("dune"));
    /**
     * {@link ItemType#COAST_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern COAST = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("coast"));
    /**
     * {@link ItemType#WILD_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern WILD = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("wild"));
    /**
     * {@link ItemType#WARD_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern WARD = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("ward"));
    /**
     * {@link ItemType#EYE_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern EYE = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("eye"));
    /**
     * {@link ItemType#VEX_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern VEX = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("vex"));
    /**
     * {@link ItemType#TIDE_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern TIDE = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("tide"));
    /**
     * {@link ItemType#SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern SNOUT = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("snout"));
    /**
     * {@link ItemType#RIB_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern RIB = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("rib"));
    /**
     * {@link ItemType#SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern SPIRE = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("spire"));
    /**
     * {@link Material#WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern WAYFINDER = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("wayfinder"));
    /**
     * {@link Material#SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern SHAPER = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("shaper"));
    /**
     * {@link Material#SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern SILENCE = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("silence"));
    /**
     * {@link Material#RAISER_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern RAISER = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("raiser"));
    /**
     * {@link Material#HOST_ARMOR_TRIM_SMITHING_TEMPLATE}.
     */
    public static final TrimPattern HOST = Registry.TRIM_PATTERN.get(NamespacedKey.minecraft("host"));
}
