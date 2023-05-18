package org.bukkit.inventory.meta;

import org.bukkit.Color;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents leather armor ({@link ItemType#LEATHER_BOOTS}, {@link
 * ItemType#LEATHER_CHESTPLATE}, {@link ItemType#LEATHER_HELMET}, or {@link
 * ItemType#LEATHER_LEGGINGS}) that can be colored.
 */
public interface LeatherArmorMeta extends ItemMeta {

    /**
     * Gets the color of the armor. If it has not been set otherwise, it will
     * be {@link ItemFactory#getDefaultLeatherColor()}.
     *
     * @return the color of the armor, never null
     */
    @NotNull
    Color getColor();

    /**
     * Sets the color of the armor.
     *
     * @param color the color to set. Setting it to null is equivalent to
     *     setting it to {@link ItemFactory#getDefaultLeatherColor()}.
     */
    void setColor(@Nullable Color color);

    @Override
    @NotNull
    LeatherArmorMeta clone();
}
