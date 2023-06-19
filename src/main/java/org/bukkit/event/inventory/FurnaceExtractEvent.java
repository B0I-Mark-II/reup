package org.bukkit.event.inventory;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.NotNull;

/**
 * This event is called when a player takes items out of the furnace
 */
public class FurnaceExtractEvent extends BlockExpEvent {
    private final Player player;
    private final ItemType itemType;
    private final int itemAmount;

    @Deprecated
    public FurnaceExtractEvent(@NotNull Player player, @NotNull Block block, @NotNull Material itemType, int itemAmount, int exp) {
        this(player, block, itemType.asItemType(), itemAmount, exp);
    }

    public FurnaceExtractEvent(@NotNull Player player, @NotNull Block block, @NotNull ItemType itemType, int itemAmount, int exp) {
        super(block, exp);
        this.player = player;
        this.itemType = itemType;
        this.itemAmount = itemAmount;
    }

    /**
     * Get the player that triggered the event
     *
     * @return the relevant player
     */
    @NotNull
    public Player getPlayer() {
        return player;
    }

    /**
     * Get the type of the item being retrieved
     *
     * @return the type of the item
     */
    @NotNull
    public ItemType getItemType() {
        return itemType;
    }

    /**
     * Get the item count being retrieved
     *
     * @return the amount of the item
     */
    public int getItemAmount() {
        return itemAmount;
    }
}
