package org.bukkit.enchantments;

import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * A simple wrapper for ease of selecting {@link Enchantment}s
 * @deprecated only for backwards compatibility, EnchantmentWrapper is no longer used.
 */
@Deprecated
public class EnchantmentWrapper extends Enchantment {
    public EnchantmentWrapper(@NotNull String name) {
    }

    /**
     * Gets the enchantment bound to this wrapper
     *
     * @return Enchantment
     */
    @NotNull
    public Enchantment getEnchantment() {
        return Enchantment.getByKey(getKey());
    }

    @Override
    public int getMaxLevel() {
        return getEnchantment().getMaxLevel();
    }

    @Override
    public int getStartLevel() {
        return getEnchantment().getStartLevel();
    }

    @NotNull
    @Override
    public EnchantmentTarget getItemTarget() {
        return getEnchantment().getItemTarget();
    }

    @Override
    public boolean canEnchantItem(@NotNull ItemStack item) {
        return getEnchantment().canEnchantItem(item);
    }

    @NotNull
    @Override
    public String getName() {
        return getEnchantment().getName();
    }

    @Override
    public boolean isTreasure() {
        return getEnchantment().isTreasure();
    }

    @Override
    public boolean isCursed() {
        return getEnchantment().isCursed();
    }

    @Override
    public boolean conflictsWith(@NotNull Enchantment other) {
        return getEnchantment().conflictsWith(other);
    }

    @NotNull
    @Override
    public NamespacedKey getKey() {
        return getEnchantment().getKey();
    }
}
