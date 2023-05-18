package org.bukkit.block;

import java.util.List;
import org.bukkit.MinecraftExperimental;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a captured state of a decorated pot.
 */
@MinecraftExperimental
@ApiStatus.Experimental
public interface DecoratedPot extends TileState {

    /**
     * Gets the shards which will be dropped when this pot is broken.
     *
     * @return shards
     */
    @NotNull
    public List<ItemType> getShards();

    /**
     * Add a shard item which will be dropped when this pot is broken.
     *
     * @param itemType shard item
     */
    public void addShard(@NotNull ItemType itemType);

    /**
     * Set the shards which will be dropped when this pot is broken.
     *
     * @param shard list of items
     */
    public void setShards(@Nullable List<ItemType> shard);
}
