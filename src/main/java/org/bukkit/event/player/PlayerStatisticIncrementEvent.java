package org.bukkit.event.player;

import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.block.BlockType;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Called when a player statistic is incremented.
 * <p>
 * This event is not called for some high frequency statistics, e.g. movement
 * based statistics.
 *
 */
public class PlayerStatisticIncrementEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    protected final Statistic statistic;
    private final int initialValue;
    private final int newValue;
    private boolean isCancelled = false;
    private final EntityType<?> entityType;
    private final ItemType itemType;
    private final BlockType<?> blockType;

    public PlayerStatisticIncrementEvent(@NotNull Player player, @NotNull Statistic statistic, int initialValue, int newValue) {
        super(player);
        this.statistic = statistic;
        this.initialValue = initialValue;
        this.newValue = newValue;
        this.entityType = null;
        this.itemType = null;
        this.blockType = null;
    }

    public PlayerStatisticIncrementEvent(@NotNull Player player, @NotNull Statistic statistic, int initialValue, int newValue, @NotNull EntityType<?> entityType) {
        super(player);
        this.statistic = statistic;
        this.initialValue = initialValue;
        this.newValue = newValue;
        this.entityType = entityType;
        this.itemType = null;
        this.blockType = null;
    }

    @Deprecated
    public PlayerStatisticIncrementEvent(@NotNull Player player, @NotNull Statistic statistic, int initialValue, int newValue, @NotNull Material material) {
        super(player);
        this.statistic = statistic;
        this.initialValue = initialValue;
        this.newValue = newValue;
        this.entityType = null;

        if (statistic.getType() == Statistic.Type.BLOCK) {
            this.itemType = null;
            this.blockType = material.asBlockType();
        } else if (statistic.getType() == Statistic.Type.ITEM) {
            this.itemType = material.asItemType();
            this.blockType = null;
        } else {
            throw new IllegalArgumentException("Expected statistic of type block or item, but got " + statistic.getType());
        }
    }

    public PlayerStatisticIncrementEvent(@NotNull Player player, @NotNull Statistic statistic, int initialValue, int newValue, @NotNull ItemType itemType) {
        super(player);
        this.statistic = statistic;
        this.initialValue = initialValue;
        this.newValue = newValue;
        this.entityType = null;
        this.itemType = itemType;
        this.blockType = null;
    }

    public PlayerStatisticIncrementEvent(@NotNull Player player, @NotNull Statistic statistic, int initialValue, int newValue, @NotNull BlockType<?> blockType) {
        super(player);
        this.statistic = statistic;
        this.initialValue = initialValue;
        this.newValue = newValue;
        this.entityType = null;
        this.itemType = null;
        this.blockType = blockType;
    }

    /**
     * Gets the statistic that is being incremented.
     *
     * @return the incremented statistic
     */
    @NotNull
    public Statistic getStatistic() {
        return statistic;
    }

    /**
     * Gets the previous value of the statistic.
     *
     * @return the previous value of the statistic
     */
    public int getPreviousValue() {
        return initialValue;
    }

    /**
     * Gets the new value of the statistic.
     *
     * @return the new value of the statistic
     */
    public int getNewValue() {
        return newValue;
    }

    /**
     * Gets the EntityType if {@link #getStatistic() getStatistic()} is an
     * entity statistic otherwise returns null.
     *
     * @return the EntityType of the statistic
     */
    @Nullable
    public EntityType<?> getEntityType() {
        return entityType;
    }

    /**
     * Gets the Item type if {@link #getStatistic()} is an item statistic.
     *
     * @return the Item Type of the statistic
     */
    @Nullable
    public ItemType getItemType() {
        return itemType;
    }

    /**
     * Gets the Block type if {@link #getStatistic()} is a block statistic.
     *
     * @return the Block Type of the statistic
     */
    @Nullable
    public BlockType<?> getBlockType() {
        return blockType;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.isCancelled = cancel;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @NotNull
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
