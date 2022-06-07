package org.bukkit.block;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

/**
 * Represent a Biome from the world.
 * Listed Biomes are present at the default server.
 * Depending on the server there might be additional biomes present (for example biomes created by data packs),
 * which you can get via {@link Registry#BIOME}.
 */
public abstract class Biome extends OldEnum<Biome> implements Keyed {

    public static final Biome OCEAN = getBiome("ocean");
    public static final Biome PLAINS = getBiome("plains");
    public static final Biome DESERT = getBiome("desert");
    public static final Biome WINDSWEPT_HILLS = getBiome("windswept_hills");
    public static final Biome FOREST = getBiome("forest");
    public static final Biome TAIGA = getBiome("taiga");
    public static final Biome SWAMP = getBiome("swamp");
    public static final Biome MANGROVE_SWAMP = getBiome("mangrove_swamp");
    public static final Biome RIVER = getBiome("river");
    public static final Biome NETHER_WASTES = getBiome("nether_wastes");
    public static final Biome THE_END = getBiome("the_end");
    public static final Biome FROZEN_OCEAN = getBiome("frozen_ocean");
    public static final Biome FROZEN_RIVER = getBiome("frozen_river");
    public static final Biome SNOWY_PLAINS = getBiome("snowy_plains");
    public static final Biome MUSHROOM_FIELDS = getBiome("mushroom_fields");
    public static final Biome BEACH = getBiome("beach");
    public static final Biome JUNGLE = getBiome("jungle");
    public static final Biome SPARSE_JUNGLE = getBiome("sparse_jungle");
    public static final Biome DEEP_OCEAN = getBiome("deep_ocean");
    public static final Biome STONY_SHORE = getBiome("stony_shore");
    public static final Biome SNOWY_BEACH = getBiome("snowy_beach");
    public static final Biome BIRCH_FOREST = getBiome("birch_forest");
    public static final Biome DARK_FOREST = getBiome("dark_forest");
    public static final Biome SNOWY_TAIGA = getBiome("snowy_taiga");
    public static final Biome OLD_GROWTH_PINE_TAIGA = getBiome("old_growth_pine_taiga");
    public static final Biome WINDSWEPT_FOREST = getBiome("windswept_forest");
    public static final Biome SAVANNA = getBiome("savanna");
    public static final Biome SAVANNA_PLATEAU = getBiome("savanna_plateau");
    public static final Biome BADLANDS = getBiome("badlands");
    public static final Biome WOODED_BADLANDS = getBiome("wooded_badlands");
    public static final Biome SMALL_END_ISLANDS = getBiome("small_end_islands");
    public static final Biome END_MIDLANDS = getBiome("end_midlands");
    public static final Biome END_HIGHLANDS = getBiome("end_highlands");
    public static final Biome END_BARRENS = getBiome("end_barrens");
    public static final Biome WARM_OCEAN = getBiome("warm_ocean");
    public static final Biome LUKEWARM_OCEAN = getBiome("lukewarm_ocean");
    public static final Biome COLD_OCEAN = getBiome("cold_ocean");
    public static final Biome DEEP_LUKEWARM_OCEAN = getBiome("deep_lukewarm_ocean");
    public static final Biome DEEP_COLD_OCEAN = getBiome("deep_cold_ocean");
    public static final Biome DEEP_FROZEN_OCEAN = getBiome("deep_frozen_ocean");
    public static final Biome THE_VOID = getBiome("the_void");
    public static final Biome SUNFLOWER_PLAINS = getBiome("sunflower_plains");
    public static final Biome WINDSWEPT_GRAVELLY_HILLS = getBiome("windswept_gravelly_hills");
    public static final Biome FLOWER_FOREST = getBiome("flower_forest");
    public static final Biome ICE_SPIKES = getBiome("ice_spikes");
    public static final Biome OLD_GROWTH_BIRCH_FOREST = getBiome("old_growth_birch_forest");
    public static final Biome OLD_GROWTH_SPRUCE_TAIGA = getBiome("old_growth_spruce_taiga");
    public static final Biome WINDSWEPT_SAVANNA = getBiome("windswept_savanna");
    public static final Biome ERODED_BADLANDS = getBiome("eroded_badlands");
    public static final Biome BAMBOO_JUNGLE = getBiome("bamboo_jungle");
    public static final Biome SOUL_SAND_VALLEY = getBiome("soul_sand_valley");
    public static final Biome CRIMSON_FOREST = getBiome("crimson_forest");
    public static final Biome WARPED_FOREST = getBiome("warped_forest");
    public static final Biome BASALT_DELTAS = getBiome("basalt_deltas");
    public static final Biome DRIPSTONE_CAVES = getBiome("dripstone_caves");
    public static final Biome LUSH_CAVES = getBiome("lush_caves");
    public static final Biome DEEP_DARK = getBiome("deep_dark");
    public static final Biome MEADOW = getBiome("meadow");
    public static final Biome GROVE = getBiome("grove");
    public static final Biome SNOWY_SLOPES = getBiome("snowy_slopes");
    public static final Biome FROZEN_PEAKS = getBiome("frozen_peaks");
    public static final Biome JAGGED_PEAKS = getBiome("jagged_peaks");
    public static final Biome STONY_PEAKS = getBiome("stony_peaks");

    /**
     * Represents a custom Biome.
     *
     * @deprecated only for backwards compatibility, custom is no longer returned.
     */
    @Deprecated
    public static final Biome CUSTOM = getBiome("custom");

    @NotNull
    private static Biome getBiome(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        Biome biome = Registry.BIOME.get(namespacedKey);
        Preconditions.checkNotNull(biome, "No Biome found for %s. This is a bug.", namespacedKey);
        return biome;
    }

    /**
     * @param name of the biome.
     * @return the biome with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static Biome valueOf(@NotNull String name) {
        Biome biome = Registry.BIOME.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(biome != null, "No Biome found with the name %s", name);
        return biome;
    }

    /**
     * @return an array of all known Biomes.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static Biome[] values() {
        return Lists.newArrayList(Registry.BIOME).toArray(new Biome[0]);
    }
}
