package org.bukkit.block.banner;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.Map;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class PatternType extends OldEnum<PatternType> implements Keyed {
    public static final PatternType BASE = getPatternType("base");
    public static final PatternType SQUARE_BOTTOM_LEFT = getPatternType("square_bottom_left");
    public static final PatternType SQUARE_BOTTOM_RIGHT = getPatternType("square_bottom_right");
    public static final PatternType SQUARE_TOP_LEFT = getPatternType("square_top_left");
    public static final PatternType SQUARE_TOP_RIGHT = getPatternType("square_top_right");
    public static final PatternType STRIPE_BOTTOM = getPatternType("stripe_bottom");
    public static final PatternType STRIPE_TOP = getPatternType("stripe_top");
    public static final PatternType STRIPE_LEFT = getPatternType("stripe_left");
    public static final PatternType STRIPE_RIGHT = getPatternType("stripe_right");
    public static final PatternType STRIPE_CENTER = getPatternType("stripe_center");
    public static final PatternType STRIPE_MIDDLE = getPatternType("stripe_middle");
    public static final PatternType STRIPE_DOWNRIGHT = getPatternType("stripe_downright");
    public static final PatternType STRIPE_DOWNLEFT = getPatternType("stripe_downleft");
    public static final PatternType SMALL_STRIPES = getPatternType("small_stripes");
    public static final PatternType CROSS = getPatternType("cross");
    public static final PatternType STRAIGHT_CROSS = getPatternType("straight_cross");
    public static final PatternType TRIANGLE_BOTTOM = getPatternType("triangle_bottom");
    public static final PatternType TRIANGLE_TOP = getPatternType("triangle_top");
    public static final PatternType TRIANGLES_BOTTOM = getPatternType("triangles_bottom");
    public static final PatternType TRIANGLES_TOP = getPatternType("triangles_top");
    public static final PatternType DIAGONAL_LEFT = getPatternType("diagonal_left");
    public static final PatternType DIAGONAL_UP_RIGHT = getPatternType("diagonal_up_right");
    public static final PatternType DIAGONAL_UP_LEFT = getPatternType("diagonal_up_left");
    public static final PatternType DIAGONAL_RIGHT = getPatternType("diagonal_right");
    public static final PatternType CIRCLE = getPatternType("circle");
    public static final PatternType RHOMBUS = getPatternType("rhombus");
    public static final PatternType HALF_VERTICAL = getPatternType("half_vertical");
    public static final PatternType HALF_HORIZONTAL = getPatternType("half_horizontal");
    public static final PatternType HALF_VERTICAL_RIGHT = getPatternType("half_vertical_right");
    public static final PatternType HALF_HORIZONTAL_BOTTOM = getPatternType("half_horizontal_bottom");
    public static final PatternType BORDER = getPatternType("border");
    public static final PatternType CURLY_BORDER = getPatternType("curly_border");
    public static final PatternType CREEPER = getPatternType("creeper");
    public static final PatternType GRADIENT = getPatternType("gradient");
    public static final PatternType GRADIENT_UP = getPatternType("gradient_up");
    public static final PatternType BRICKS = getPatternType("bricks");
    public static final PatternType SKULL = getPatternType("skull");
    public static final PatternType FLOWER = getPatternType("flower");
    public static final PatternType MOJANG = getPatternType("mojang");
    public static final PatternType GLOBE = getPatternType("globe");
    public static final PatternType PIGLIN = getPatternType("piglin");

    @NotNull
    private static PatternType getPatternType(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        PatternType patternType = Registry.BANNER_PATTERN.get(namespacedKey);
        Preconditions.checkNotNull(patternType, "No pattern type found for %s. This is a bug.", namespacedKey);
        return patternType;
    }

    private static final Map<String, PatternType> byString = new HashMap<String, PatternType>();

    /**
     * Returns the identifier used to represent
     * this pattern type
     *
     * @return the pattern's identifier
     */
    @NotNull
    public abstract String getIdentifier();

    /**
     * Returns the pattern type which matches the passed
     * identifier or null if no matches are found
     *
     * @param identifier the identifier
     * @return the matched pattern type or null
     */
    @Contract("null -> null")
    @Nullable
    public static PatternType getByIdentifier(@Nullable String identifier) {
        if (identifier == null) {
            return null;
        }

        return byString.computeIfAbsent(identifier, id -> {
            for (PatternType patternType : Registry.BANNER_PATTERN) {
                if (identifier.equals(patternType.getIdentifier())) {
                    return patternType;
                }
            }

            return null;
        });
    }

    /**
     * @param name of the pattern type.
     * @return the pattern type with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static PatternType valueOf(@NotNull String name) {
        name = convertLegacy(name);
        PatternType patternType = Registry.BANNER_PATTERN.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(patternType != null, "No pattern type found with the name %s", name);
        return patternType;
    }

    /**
     * @return an array of all known pattern types.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static PatternType[] values() {
        return Lists.newArrayList(Registry.BANNER_PATTERN).toArray(new PatternType[0]);
    }

    private static String convertLegacy(String from) {
        if (from == null) {
            return null;
        }

        switch (from.toLowerCase()) {
            case "stripe_small":
                return "small_stripes";
            case "diagonal_left_mirror":
                return "diagonal_up_left";
            case "diagonal_right_mirror":
                return "diagonal_right";
            case "diagonal_right":
                return "diagonal_up_right";
            case "circle_middle":
                return "circle";
            case "rhombus_middle":
                return "rhombus";
            case "half_vertical_mirror":
                return "half_vertical_right";
            case "half_horizontal_mirror":
                return "half_horizontal_bottom";
        }

        return from;
    }
}
