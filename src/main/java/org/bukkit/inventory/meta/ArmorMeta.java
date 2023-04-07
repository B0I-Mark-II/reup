package org.bukkit.inventory.meta;

import org.bukkit.MinecraftExperimental;
import org.bukkit.inventory.meta.trim.ArmorTrim;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents armor that an entity can equip.
 * <p>
 * <strong>Note: Armor trims are part of an experimental feature of Minecraft
 * and hence subject to change.</strong>
 */
@MinecraftExperimental
@ApiStatus.Experimental
public interface ArmorMeta extends ItemMeta {

    /**
     * Check whether or not this item has an armor trim.
     *
     * @return true if has a trim, false otherwise
     */
    boolean hasTrim();

    /**
     * Set the {@link ArmorTrim}.
     * <p>
     * While vanilla only allows for armor to be trimmed, trims may be applied
     * to any item whether or not the client will actually render a trim.
     *
     * @param trim the trim to set, or null to remove it
     */
    void setTrim(@Nullable ArmorTrim trim);

    /**
     * Get the {@link ArmorTrim}.
     *
     * @return the armor trim, or null if none
     */
    @Nullable
    ArmorTrim getTrim();

    @Override
    @NotNull
    ArmorMeta clone();
}
