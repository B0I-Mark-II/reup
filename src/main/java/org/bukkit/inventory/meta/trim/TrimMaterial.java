package org.bukkit.inventory.meta.trim;

import org.bukkit.Keyed;
import org.bukkit.MinecraftExperimental;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.ApiStatus;

/**
 * Represents a material that may be used in an {@link ArmorTrim}.
 *
 * @apiNote Armor trims are part of an experimental feature of Minecraft and
 * hence subject to change. Constants in this class may be null if a data pack
 * is not present to enable these features.
 */
@MinecraftExperimental
@ApiStatus.Experimental
public interface TrimMaterial extends Keyed {

    /**
     * {@link ItemType#QUARTZ}.
     */
    public static final TrimMaterial QUARTZ = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("quartz"));
    /**
     * {@link ItemType#IRON_INGOT}.
     */
    public static final TrimMaterial IRON = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("iron"));
    /**
     * {@link ItemType#NETHERITE_INGOT}.
     */
    public static final TrimMaterial NETHERITE = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("netherite"));
    /**
     * {@link ItemType#REDSTONE}.
     */
    public static final TrimMaterial REDSTONE = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("redstone"));
    /**
     * {@link ItemType#COPPER_INGOT}.
     */
    public static final TrimMaterial COPPER = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("copper"));
    /**
     * {@link ItemType#GOLD_INGOT}.
     */
    public static final TrimMaterial GOLD = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("gold"));
    /**
     * {@link ItemType#EMERALD}.
     */
    public static final TrimMaterial EMERALD = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("emerald"));
    /**
     * {@link ItemType#DIAMOND}.
     */
    public static final TrimMaterial DIAMOND = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("diamond"));
    /**
     * {@link ItemType#LAPIS_LAZULI}.
     */
    public static final TrimMaterial LAPIS = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("lapis"));
    /**
     * {@link ItemType#AMETHYST_SHARD}.
     */
    public static final TrimMaterial AMETHYST = Registry.TRIM_MATERIAL.get(NamespacedKey.minecraft("amethyst"));
}
