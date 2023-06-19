package org.bukkit.enchantments;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the applicable target for a {@link Enchantment}
 */
public enum EnchantmentTarget {
    /**
     * Allows the Enchantment to be placed on all items
     *
     * @deprecated this target no longer exists in Vanilla
     */
    @Deprecated
    ALL {
        @Override
        public boolean includes(@NotNull ItemType item) {
            for (EnchantmentTarget target : EnchantmentTarget.values()) {
                if (target != this && target.includes(item)) {
                    return true;
                }
            }

            return false;
        }
    },

    /**
     * Allows the Enchantment to be placed on armor
     */
    ARMOR {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return ARMOR_FEET.includes(item)
                || ARMOR_LEGS.includes(item)
                || ARMOR_HEAD.includes(item)
                || ARMOR_TORSO.includes(item);
        }
    },

    /**
     * Allows the Enchantment to be placed on feet slot armor
     */
    ARMOR_FEET {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.LEATHER_BOOTS)
                || item.equals(ItemType.CHAINMAIL_BOOTS)
                || item.equals(ItemType.IRON_BOOTS)
                || item.equals(ItemType.DIAMOND_BOOTS)
                || item.equals(ItemType.GOLDEN_BOOTS)
                || item.equals(ItemType.NETHERITE_BOOTS);
        }
    },

    /**
     * Allows the Enchantment to be placed on leg slot armor
     */
    ARMOR_LEGS {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.LEATHER_LEGGINGS)
                || item.equals(ItemType.CHAINMAIL_LEGGINGS)
                || item.equals(ItemType.IRON_LEGGINGS)
                || item.equals(ItemType.DIAMOND_LEGGINGS)
                || item.equals(ItemType.GOLDEN_LEGGINGS)
                || item.equals(ItemType.NETHERITE_LEGGINGS);
        }
    },

    /**
     * Allows the Enchantment to be placed on torso slot armor
     */
    ARMOR_TORSO {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.LEATHER_CHESTPLATE)
                || item.equals(ItemType.CHAINMAIL_CHESTPLATE)
                || item.equals(ItemType.IRON_CHESTPLATE)
                || item.equals(ItemType.DIAMOND_CHESTPLATE)
                || item.equals(ItemType.GOLDEN_CHESTPLATE)
                || item.equals(ItemType.NETHERITE_CHESTPLATE);
        }
    },

    /**
     * Allows the Enchantment to be placed on head slot armor
     */
    ARMOR_HEAD {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.LEATHER_HELMET)
                || item.equals(ItemType.CHAINMAIL_HELMET)
                || item.equals(ItemType.DIAMOND_HELMET)
                || item.equals(ItemType.IRON_HELMET)
                || item.equals(ItemType.GOLDEN_HELMET)
                || item.equals(ItemType.TURTLE_HELMET)
                || item.equals(ItemType.NETHERITE_HELMET);
        }
    },

    /**
     * Allows the Enchantment to be placed on weapons (swords)
     */
    WEAPON {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.WOODEN_SWORD)
                || item.equals(ItemType.STONE_SWORD)
                || item.equals(ItemType.IRON_SWORD)
                || item.equals(ItemType.DIAMOND_SWORD)
                || item.equals(ItemType.GOLDEN_SWORD)
                || item.equals(ItemType.NETHERITE_SWORD);
        }
    },

    /**
     * Allows the Enchantment to be placed on tools (spades, pickaxe, axes)
     */
    TOOL {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.WOODEN_SHOVEL)
                || item.equals(ItemType.STONE_SHOVEL)
                || item.equals(ItemType.IRON_SHOVEL)
                || item.equals(ItemType.DIAMOND_SHOVEL)
                || item.equals(ItemType.GOLDEN_SHOVEL)
                || item.equals(ItemType.NETHERITE_SHOVEL)
                || item.equals(ItemType.WOODEN_PICKAXE)
                || item.equals(ItemType.STONE_PICKAXE)
                || item.equals(ItemType.IRON_PICKAXE)
                || item.equals(ItemType.DIAMOND_PICKAXE)
                || item.equals(ItemType.GOLDEN_PICKAXE)
                || item.equals(ItemType.NETHERITE_PICKAXE)
                || item.equals(ItemType.WOODEN_AXE)
                || item.equals(ItemType.STONE_AXE)
                || item.equals(ItemType.IRON_AXE)
                || item.equals(ItemType.DIAMOND_AXE)
                || item.equals(ItemType.GOLDEN_AXE)
                || item.equals(ItemType.NETHERITE_AXE)
                || item.equals(ItemType.WOODEN_HOE)
                || item.equals(ItemType.STONE_HOE)
                || item.equals(ItemType.IRON_HOE)
                || item.equals(ItemType.DIAMOND_HOE)
                || item.equals(ItemType.GOLDEN_HOE)
                || item.equals(ItemType.NETHERITE_HOE);
        }
    },

    /**
     * Allows the Enchantment to be placed on bows.
     */
    BOW {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.BOW);
        }
    },

    /**
     * Allows the Enchantment to be placed on fishing rods.
     */
    FISHING_ROD {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.FISHING_ROD);
        }
    },

    /**
     * Allows the enchantment to be placed on items with durability.
     */
    BREAKABLE {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.getMaxDurability() > 0 && item.getMaxStackSize() == 1;
        }
    },

    /**
     * Allows the enchantment to be placed on wearable items.
     */
    WEARABLE {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return ARMOR.includes(item)
                    || item.equals(ItemType.ELYTRA)
                    || item.equals(ItemType.CARVED_PUMPKIN)
                    || item.equals(ItemType.SKELETON_SKULL)
                    || item.equals(ItemType.WITHER_SKELETON_SKULL)
                    || item.equals(ItemType.ZOMBIE_HEAD)
                    || item.equals(ItemType.PIGLIN_HEAD)
                    || item.equals(ItemType.PLAYER_HEAD)
                    || item.equals(ItemType.CREEPER_HEAD)
                    || item.equals(ItemType.DRAGON_HEAD)
                    || item.equals(ItemType.SHIELD);
        }
    },

    /**
     * Allow the Enchantment to be placed on tridents.
     */
    TRIDENT {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.TRIDENT);
        }
    },

    /**
     * Allow the Enchantment to be placed on crossbows.
     */
    CROSSBOW {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return item.equals(ItemType.CROSSBOW);
        }
    },

    /**
     * Allow the Enchantment to be placed on vanishing items.
     */
    VANISHABLE {
        @Override
        public boolean includes(@NotNull ItemType item) {
            return BREAKABLE.includes(item) || (WEARABLE.includes(item) && !item.equals(ItemType.ELYTRA)) || item.equals(ItemType.COMPASS);
        }
    };

    /**
     * Check whether this target includes the specified item.
     *
     * @param item The item to check
     * @return True if the target includes the item
     */
    public abstract boolean includes(@NotNull ItemType item);

    /**
     * Check whether this target includes the specified item.
     *
     * @param item The item to check
     * @return True if the target includes the item
     */
    public boolean includes(@NotNull ItemStack item) {
        return includes(item.getType());
    }
}
