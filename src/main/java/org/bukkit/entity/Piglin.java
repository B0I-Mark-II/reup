package org.bukkit.entity;

import java.util.Set;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a Piglin.
 */
public interface Piglin extends PiglinAbstract, InventoryHolder {

    /**
     * Get whether the piglin is able to hunt hoglins.
     *
     * @return Whether the piglin is able to hunt hoglins
     */
    public boolean isAbleToHunt();

    /**
     * Sets whether the piglin is able to hunt hoglins.
     *
     * @param flag Whether the piglin is able to hunt hoglins.
     */
    public void setIsAbleToHunt(boolean flag);

    /**
     * Adds an item type to the allowed list of item types to barter with.
     *
     * @param itemType The item type to add
     *
     * @return true if the item has been added successfully, false otherwise
     */
    public boolean addBarterItem(@NotNull ItemType itemType);

    /**
     * Removes an item type from the allowed list of item types to barter with.
     *
     * <strong>Note:</strong> It's not possible to override the default
     * bartering item gold_ingots as payment. To block gold_ingots see
     * {@link org.bukkit.event.entity.PiglinBarterEvent}.
     *
     * @param itemType The item type to remove
     *
     * @return true if the item has been removed successfully, false otherwise
     */
    public boolean removeBarterItem(@NotNull ItemType itemType);

    /**
     * Adds an item type the piglin will pickup and store in his inventory.
     *
     * @param itemType The item type you want the piglin to be interested in
     *
     * @return true if the item has been added successfully, false otherwise
     */
    public boolean addItemOfInterest(@NotNull ItemType itemType);

    /**
     * Removes an item type from the list of item types the piglin will pickup.
     *
     * <strong>Note:</strong> It's not possible to override the default list of
     * item the piglin will pickup. To cancel pickup see
     * {@link org.bukkit.event.entity.EntityPickupItemEvent}.
     *
     * @param itemType The item type you want removed from the interest list
     * @return true if the item has been removed successfully, false otherwise
     */
    public boolean removeItemOfInterest(@NotNull ItemType itemType);

    /**
     * Returns a immutable set of item types the piglins will pickup.
     * <br>
     * <strong>Note:</strong> This set will not include the items that are set
     * by default. To interact with those items see
     * {@link org.bukkit.event.entity.EntityPickupItemEvent}.
     *
     * @return An immutable item type set
     */
    @NotNull
    public Set<ItemType> getInterestList();

    /**
     * Returns a immutable set of item types the piglins will barter with.
     *
     * <strong>Note:</strong> This set will not include the items that are set
     * by default. To interact with those items see
     * {@link org.bukkit.event.entity.PiglinBarterEvent}.
     *
     * @return An immutable item type set
     */
    @NotNull
    public Set<ItemType> getBarterList();
}
