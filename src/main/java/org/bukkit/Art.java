package org.bukkit;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Map;
import org.apache.commons.lang.Validate;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Represents the art on a painting.
 * Listed Arts are present at the default server.
 */
public abstract class Art extends OldEnum<Art> implements Keyed {
    @Deprecated
    private static final Map<Integer, Art> BY_ID = Maps.newHashMap();

    public static final Art KEBAB = getArt("kebab");
    public static final Art AZTEC = getArt("aztec");
    public static final Art ALBAN = getArt("alban");
    public static final Art AZTEC2 = getArt("aztec2");
    public static final Art BOMB = getArt("bomb");
    public static final Art PLANT = getArt("plant");
    public static final Art WASTELAND = getArt("wasteland");
    public static final Art POOL = getArt("pool");
    public static final Art COURBET = getArt("courbet");
    public static final Art SEA = getArt("sea");
    public static final Art SUNSET = getArt("sunset");
    public static final Art CREEBET = getArt("creebet");
    public static final Art WANDERER = getArt("wanderer");
    public static final Art GRAHAM = getArt("graham");
    public static final Art MATCH = getArt("match");
    public static final Art BUST = getArt("bust");
    public static final Art STAGE = getArt("stage");
    public static final Art VOID = getArt("void");
    public static final Art SKULL_AND_ROSES = getArt("skull_and_roses");
    public static final Art WITHER = getArt("wither");
    public static final Art FIGHTERS = getArt("fighters");
    public static final Art POINTER = getArt("pointer");
    public static final Art PIGSCENE = getArt("pigscene");
    public static final Art BURNING_SKULL = getArt("burning_skull");
    public static final Art SKELETON = getArt("skeleton");
    public static final Art DONKEY_KONG = getArt("donkey_kong");

    @NotNull
    private static Art getArt(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        Art art = Registry.ART.get(namespacedKey);
        Preconditions.checkNotNull(art, "No Art found for %s. This is a bug.", namespacedKey);
        BY_ID.put(art.ordinal(), art);
        return art;
    }

    /**
     * Get a painting by its unique name
     * <p>
     * This ignores underscores and capitalization
     *
     * @param name The name
     * @return The painting
     */
    @Nullable
    public static Art getByName(@NotNull String name) {
        Validate.notNull(name, "Name cannot be null");

        return Registry.ART.get(NamespacedKey.fromString(name.toLowerCase(java.util.Locale.ENGLISH)));
    }

    /**
     * Gets the width of the painting, in blocks
     *
     * @return The width of the painting, in blocks
     */
    public abstract int getBlockWidth();

    /**
     * Gets the height of the painting, in blocks
     *
     * @return The height of the painting, in blocks
     */
    public abstract int getBlockHeight();

    /**
     * Get the ID of this painting.
     *
     * @return The ID of this painting
     * @deprecated Magic value
     */
    @Deprecated
    public abstract int getId();

    /**
     * Get a painting by its numeric ID
     *
     * @param id The ID
     * @return The painting
     * @deprecated Magic value
     */
    @Deprecated
    @Nullable
    public static Art getById(int id) {
        return BY_ID.get(id);
    }

    /**
     * @param name of the art.
     * @return the art with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static Art valueOf(@NotNull String name) {
        Art art = Registry.ART.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(art != null, "No Art found with the name %s", name);
        return art;
    }

    /**
     * @return an array of all known Arts.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static Art[] values() {
        return Lists.newArrayList(Registry.ART).toArray(new Art[0]);
    }
}
