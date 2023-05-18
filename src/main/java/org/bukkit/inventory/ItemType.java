package org.bukkit.inventory;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import org.bukkit.Keyed;
import org.bukkit.MinecraftExperimental;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.Translatable;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.block.BlockType;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ItemType implements Keyed, Translatable {
    //<editor-fold desc="ItemTypes" defaultstate="collapsed">
    public static final ItemType AIR = getItemType("air");
    public static final ItemType STONE = getItemType("stone");
    public static final ItemType GRANITE = getItemType("granite");
    public static final ItemType POLISHED_GRANITE = getItemType("polished_granite");
    public static final ItemType DIORITE = getItemType("diorite");
    public static final ItemType POLISHED_DIORITE = getItemType("polished_diorite");
    public static final ItemType ANDESITE = getItemType("andesite");
    public static final ItemType POLISHED_ANDESITE = getItemType("polished_andesite");
    public static final ItemType DEEPSLATE = getItemType("deepslate");
    public static final ItemType COBBLED_DEEPSLATE = getItemType("cobbled_deepslate");
    public static final ItemType POLISHED_DEEPSLATE = getItemType("polished_deepslate");
    public static final ItemType CALCITE = getItemType("calcite");
    public static final ItemType TUFF = getItemType("tuff");
    public static final ItemType DRIPSTONE_BLOCK = getItemType("dripstone_block");
    public static final ItemType GRASS_BLOCK = getItemType("grass_block");
    public static final ItemType DIRT = getItemType("dirt");
    public static final ItemType COARSE_DIRT = getItemType("coarse_dirt");
    public static final ItemType PODZOL = getItemType("podzol");
    public static final ItemType ROOTED_DIRT = getItemType("rooted_dirt");
    public static final ItemType MUD = getItemType("mud");
    public static final ItemType CRIMSON_NYLIUM = getItemType("crimson_nylium");
    public static final ItemType WARPED_NYLIUM = getItemType("warped_nylium");
    public static final ItemType COBBLESTONE = getItemType("cobblestone");
    public static final ItemType OAK_PLANKS = getItemType("oak_planks");
    public static final ItemType SPRUCE_PLANKS = getItemType("spruce_planks");
    public static final ItemType BIRCH_PLANKS = getItemType("birch_planks");
    public static final ItemType JUNGLE_PLANKS = getItemType("jungle_planks");
    public static final ItemType ACACIA_PLANKS = getItemType("acacia_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_PLANKS = getItemType("cherry_planks");
    public static final ItemType DARK_OAK_PLANKS = getItemType("dark_oak_planks");
    public static final ItemType MANGROVE_PLANKS = getItemType("mangrove_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BAMBOO_PLANKS = getItemType("bamboo_planks");
    public static final ItemType CRIMSON_PLANKS = getItemType("crimson_planks");
    public static final ItemType WARPED_PLANKS = getItemType("warped_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BAMBOO_MOSAIC = getItemType("bamboo_mosaic");
    public static final ItemType OAK_SAPLING = getItemType("oak_sapling");
    public static final ItemType SPRUCE_SAPLING = getItemType("spruce_sapling");
    public static final ItemType BIRCH_SAPLING = getItemType("birch_sapling");
    public static final ItemType JUNGLE_SAPLING = getItemType("jungle_sapling");
    public static final ItemType ACACIA_SAPLING = getItemType("acacia_sapling");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_SAPLING = getItemType("cherry_sapling");
    public static final ItemType DARK_OAK_SAPLING = getItemType("dark_oak_sapling");
    public static final ItemType MANGROVE_PROPAGULE = getItemType("mangrove_propagule");
    public static final ItemType BEDROCK = getItemType("bedrock");
    public static final ItemType SAND = getItemType("sand");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType SUSPICIOUS_SAND = getItemType("suspicious_sand");
    public static final ItemType RED_SAND = getItemType("red_sand");
    public static final ItemType GRAVEL = getItemType("gravel");
    public static final ItemType COAL_ORE = getItemType("coal_ore");
    public static final ItemType DEEPSLATE_COAL_ORE = getItemType("deepslate_coal_ore");
    public static final ItemType IRON_ORE = getItemType("iron_ore");
    public static final ItemType DEEPSLATE_IRON_ORE = getItemType("deepslate_iron_ore");
    public static final ItemType COPPER_ORE = getItemType("copper_ore");
    public static final ItemType DEEPSLATE_COPPER_ORE = getItemType("deepslate_copper_ore");
    public static final ItemType GOLD_ORE = getItemType("gold_ore");
    public static final ItemType DEEPSLATE_GOLD_ORE = getItemType("deepslate_gold_ore");
    public static final ItemType REDSTONE_ORE = getItemType("redstone_ore");
    public static final ItemType DEEPSLATE_REDSTONE_ORE = getItemType("deepslate_redstone_ore");
    public static final ItemType EMERALD_ORE = getItemType("emerald_ore");
    public static final ItemType DEEPSLATE_EMERALD_ORE = getItemType("deepslate_emerald_ore");
    public static final ItemType LAPIS_ORE = getItemType("lapis_ore");
    public static final ItemType DEEPSLATE_LAPIS_ORE = getItemType("deepslate_lapis_ore");
    public static final ItemType DIAMOND_ORE = getItemType("diamond_ore");
    public static final ItemType DEEPSLATE_DIAMOND_ORE = getItemType("deepslate_diamond_ore");
    public static final ItemType NETHER_GOLD_ORE = getItemType("nether_gold_ore");
    public static final ItemType NETHER_QUARTZ_ORE = getItemType("nether_quartz_ore");
    public static final ItemType ANCIENT_DEBRIS = getItemType("ancient_debris");
    public static final ItemType COAL_BLOCK = getItemType("coal_block");
    public static final ItemType RAW_IRON_BLOCK = getItemType("raw_iron_block");
    public static final ItemType RAW_COPPER_BLOCK = getItemType("raw_copper_block");
    public static final ItemType RAW_GOLD_BLOCK = getItemType("raw_gold_block");
    public static final ItemType AMETHYST_BLOCK = getItemType("amethyst_block");
    public static final ItemType BUDDING_AMETHYST = getItemType("budding_amethyst");
    public static final ItemType IRON_BLOCK = getItemType("iron_block");
    public static final ItemType COPPER_BLOCK = getItemType("copper_block");
    public static final ItemType GOLD_BLOCK = getItemType("gold_block");
    public static final ItemType DIAMOND_BLOCK = getItemType("diamond_block");
    public static final ItemType NETHERITE_BLOCK = getItemType("netherite_block");
    public static final ItemType EXPOSED_COPPER = getItemType("exposed_copper");
    public static final ItemType WEATHERED_COPPER = getItemType("weathered_copper");
    public static final ItemType OXIDIZED_COPPER = getItemType("oxidized_copper");
    public static final ItemType CUT_COPPER = getItemType("cut_copper");
    public static final ItemType EXPOSED_CUT_COPPER = getItemType("exposed_cut_copper");
    public static final ItemType WEATHERED_CUT_COPPER = getItemType("weathered_cut_copper");
    public static final ItemType OXIDIZED_CUT_COPPER = getItemType("oxidized_cut_copper");
    public static final ItemType CUT_COPPER_STAIRS = getItemType("cut_copper_stairs");
    public static final ItemType EXPOSED_CUT_COPPER_STAIRS = getItemType("exposed_cut_copper_stairs");
    public static final ItemType WEATHERED_CUT_COPPER_STAIRS = getItemType("weathered_cut_copper_stairs");
    public static final ItemType OXIDIZED_CUT_COPPER_STAIRS = getItemType("oxidized_cut_copper_stairs");
    public static final ItemType CUT_COPPER_SLAB = getItemType("cut_copper_slab");
    public static final ItemType EXPOSED_CUT_COPPER_SLAB = getItemType("exposed_cut_copper_slab");
    public static final ItemType WEATHERED_CUT_COPPER_SLAB = getItemType("weathered_cut_copper_slab");
    public static final ItemType OXIDIZED_CUT_COPPER_SLAB = getItemType("oxidized_cut_copper_slab");
    public static final ItemType WAXED_COPPER_BLOCK = getItemType("waxed_copper_block");
    public static final ItemType WAXED_EXPOSED_COPPER = getItemType("waxed_exposed_copper");
    public static final ItemType WAXED_WEATHERED_COPPER = getItemType("waxed_weathered_copper");
    public static final ItemType WAXED_OXIDIZED_COPPER = getItemType("waxed_oxidized_copper");
    public static final ItemType WAXED_CUT_COPPER = getItemType("waxed_cut_copper");
    public static final ItemType WAXED_EXPOSED_CUT_COPPER = getItemType("waxed_exposed_cut_copper");
    public static final ItemType WAXED_WEATHERED_CUT_COPPER = getItemType("waxed_weathered_cut_copper");
    public static final ItemType WAXED_OXIDIZED_CUT_COPPER = getItemType("waxed_oxidized_cut_copper");
    public static final ItemType WAXED_CUT_COPPER_STAIRS = getItemType("waxed_cut_copper_stairs");
    public static final ItemType WAXED_EXPOSED_CUT_COPPER_STAIRS = getItemType("waxed_exposed_cut_copper_stairs");
    public static final ItemType WAXED_WEATHERED_CUT_COPPER_STAIRS = getItemType("waxed_weathered_cut_copper_stairs");
    public static final ItemType WAXED_OXIDIZED_CUT_COPPER_STAIRS = getItemType("waxed_oxidized_cut_copper_stairs");
    public static final ItemType WAXED_CUT_COPPER_SLAB = getItemType("waxed_cut_copper_slab");
    public static final ItemType WAXED_EXPOSED_CUT_COPPER_SLAB = getItemType("waxed_exposed_cut_copper_slab");
    public static final ItemType WAXED_WEATHERED_CUT_COPPER_SLAB = getItemType("waxed_weathered_cut_copper_slab");
    public static final ItemType WAXED_OXIDIZED_CUT_COPPER_SLAB = getItemType("waxed_oxidized_cut_copper_slab");
    public static final ItemType OAK_LOG = getItemType("oak_log");
    public static final ItemType SPRUCE_LOG = getItemType("spruce_log");
    public static final ItemType BIRCH_LOG = getItemType("birch_log");
    public static final ItemType JUNGLE_LOG = getItemType("jungle_log");
    public static final ItemType ACACIA_LOG = getItemType("acacia_log");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_LOG = getItemType("cherry_log");
    public static final ItemType DARK_OAK_LOG = getItemType("dark_oak_log");
    public static final ItemType MANGROVE_LOG = getItemType("mangrove_log");
    public static final ItemType MANGROVE_ROOTS = getItemType("mangrove_roots");
    public static final ItemType MUDDY_MANGROVE_ROOTS = getItemType("muddy_mangrove_roots");
    public static final ItemType CRIMSON_STEM = getItemType("crimson_stem");
    public static final ItemType WARPED_STEM = getItemType("warped_stem");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BAMBOO_BLOCK = getItemType("bamboo_block");
    public static final ItemType STRIPPED_OAK_LOG = getItemType("stripped_oak_log");
    public static final ItemType STRIPPED_SPRUCE_LOG = getItemType("stripped_spruce_log");
    public static final ItemType STRIPPED_BIRCH_LOG = getItemType("stripped_birch_log");
    public static final ItemType STRIPPED_JUNGLE_LOG = getItemType("stripped_jungle_log");
    public static final ItemType STRIPPED_ACACIA_LOG = getItemType("stripped_acacia_log");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType STRIPPED_CHERRY_LOG = getItemType("stripped_cherry_log");
    public static final ItemType STRIPPED_DARK_OAK_LOG = getItemType("stripped_dark_oak_log");
    public static final ItemType STRIPPED_MANGROVE_LOG = getItemType("stripped_mangrove_log");
    public static final ItemType STRIPPED_CRIMSON_STEM = getItemType("stripped_crimson_stem");
    public static final ItemType STRIPPED_WARPED_STEM = getItemType("stripped_warped_stem");
    public static final ItemType STRIPPED_OAK_WOOD = getItemType("stripped_oak_wood");
    public static final ItemType STRIPPED_SPRUCE_WOOD = getItemType("stripped_spruce_wood");
    public static final ItemType STRIPPED_BIRCH_WOOD = getItemType("stripped_birch_wood");
    public static final ItemType STRIPPED_JUNGLE_WOOD = getItemType("stripped_jungle_wood");
    public static final ItemType STRIPPED_ACACIA_WOOD = getItemType("stripped_acacia_wood");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType STRIPPED_CHERRY_WOOD = getItemType("stripped_cherry_wood");
    public static final ItemType STRIPPED_DARK_OAK_WOOD = getItemType("stripped_dark_oak_wood");
    public static final ItemType STRIPPED_MANGROVE_WOOD = getItemType("stripped_mangrove_wood");
    public static final ItemType STRIPPED_CRIMSON_HYPHAE = getItemType("stripped_crimson_hyphae");
    public static final ItemType STRIPPED_WARPED_HYPHAE = getItemType("stripped_warped_hyphae");
    public static final ItemType STRIPPED_BAMBOO_BLOCK = getItemType("stripped_bamboo_block");
    public static final ItemType OAK_WOOD = getItemType("oak_wood");
    public static final ItemType SPRUCE_WOOD = getItemType("spruce_wood");
    public static final ItemType BIRCH_WOOD = getItemType("birch_wood");
    public static final ItemType JUNGLE_WOOD = getItemType("jungle_wood");
    public static final ItemType ACACIA_WOOD = getItemType("acacia_wood");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_WOOD = getItemType("cherry_wood");
    public static final ItemType DARK_OAK_WOOD = getItemType("dark_oak_wood");
    public static final ItemType MANGROVE_WOOD = getItemType("mangrove_wood");
    public static final ItemType CRIMSON_HYPHAE = getItemType("crimson_hyphae");
    public static final ItemType WARPED_HYPHAE = getItemType("warped_hyphae");
    public static final ItemType OAK_LEAVES = getItemType("oak_leaves");
    public static final ItemType SPRUCE_LEAVES = getItemType("spruce_leaves");
    public static final ItemType BIRCH_LEAVES = getItemType("birch_leaves");
    public static final ItemType JUNGLE_LEAVES = getItemType("jungle_leaves");
    public static final ItemType ACACIA_LEAVES = getItemType("acacia_leaves");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_LEAVES = getItemType("cherry_leaves");
    public static final ItemType DARK_OAK_LEAVES = getItemType("dark_oak_leaves");
    public static final ItemType MANGROVE_LEAVES = getItemType("mangrove_leaves");
    public static final ItemType AZALEA_LEAVES = getItemType("azalea_leaves");
    public static final ItemType FLOWERING_AZALEA_LEAVES = getItemType("flowering_azalea_leaves");
    public static final ItemType SPONGE = getItemType("sponge");
    public static final ItemType WET_SPONGE = getItemType("wet_sponge");
    public static final ItemType GLASS = getItemType("glass");
    public static final ItemType TINTED_GLASS = getItemType("tinted_glass");
    public static final ItemType LAPIS_BLOCK = getItemType("lapis_block");
    public static final ItemType SANDSTONE = getItemType("sandstone");
    public static final ItemType CHISELED_SANDSTONE = getItemType("chiseled_sandstone");
    public static final ItemType CUT_SANDSTONE = getItemType("cut_sandstone");
    public static final ItemType COBWEB = getItemType("cobweb");
    public static final ItemType GRASS = getItemType("grass");
    public static final ItemType FERN = getItemType("fern");
    public static final ItemType AZALEA = getItemType("azalea");
    public static final ItemType FLOWERING_AZALEA = getItemType("flowering_azalea");
    public static final ItemType DEAD_BUSH = getItemType("dead_bush");
    public static final ItemType SEAGRASS = getItemType("seagrass");
    public static final ItemType SEA_PICKLE = getItemType("sea_pickle");
    public static final ItemType WHITE_WOOL = getItemType("white_wool");
    public static final ItemType ORANGE_WOOL = getItemType("orange_wool");
    public static final ItemType MAGENTA_WOOL = getItemType("magenta_wool");
    public static final ItemType LIGHT_BLUE_WOOL = getItemType("light_blue_wool");
    public static final ItemType YELLOW_WOOL = getItemType("yellow_wool");
    public static final ItemType LIME_WOOL = getItemType("lime_wool");
    public static final ItemType PINK_WOOL = getItemType("pink_wool");
    public static final ItemType GRAY_WOOL = getItemType("gray_wool");
    public static final ItemType LIGHT_GRAY_WOOL = getItemType("light_gray_wool");
    public static final ItemType CYAN_WOOL = getItemType("cyan_wool");
    public static final ItemType PURPLE_WOOL = getItemType("purple_wool");
    public static final ItemType BLUE_WOOL = getItemType("blue_wool");
    public static final ItemType BROWN_WOOL = getItemType("brown_wool");
    public static final ItemType GREEN_WOOL = getItemType("green_wool");
    public static final ItemType RED_WOOL = getItemType("red_wool");
    public static final ItemType BLACK_WOOL = getItemType("black_wool");
    public static final ItemType DANDELION = getItemType("dandelion");
    public static final ItemType POPPY = getItemType("poppy");
    public static final ItemType BLUE_ORCHID = getItemType("blue_orchid");
    public static final ItemType ALLIUM = getItemType("allium");
    public static final ItemType AZURE_BLUET = getItemType("azure_bluet");
    public static final ItemType RED_TULIP = getItemType("red_tulip");
    public static final ItemType ORANGE_TULIP = getItemType("orange_tulip");
    public static final ItemType WHITE_TULIP = getItemType("white_tulip");
    public static final ItemType PINK_TULIP = getItemType("pink_tulip");
    public static final ItemType OXEYE_DAISY = getItemType("oxeye_daisy");
    public static final ItemType CORNFLOWER = getItemType("cornflower");
    public static final ItemType LILY_OF_THE_VALLEY = getItemType("lily_of_the_valley");
    public static final ItemType WITHER_ROSE = getItemType("wither_rose");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType TORCHFLOWER = getItemType("torchflower");
    public static final ItemType SPORE_BLOSSOM = getItemType("spore_blossom");
    public static final ItemType BROWN_MUSHROOM = getItemType("brown_mushroom");
    public static final ItemType RED_MUSHROOM = getItemType("red_mushroom");
    public static final ItemType CRIMSON_FUNGUS = getItemType("crimson_fungus");
    public static final ItemType WARPED_FUNGUS = getItemType("warped_fungus");
    public static final ItemType CRIMSON_ROOTS = getItemType("crimson_roots");
    public static final ItemType WARPED_ROOTS = getItemType("warped_roots");
    public static final ItemType NETHER_SPROUTS = getItemType("nether_sprouts");
    public static final ItemType WEEPING_VINES = getItemType("weeping_vines");
    public static final ItemType TWISTING_VINES = getItemType("twisting_vines");
    public static final ItemType SUGAR_CANE = getItemType("sugar_cane");
    public static final ItemType KELP = getItemType("kelp");
    public static final ItemType MOSS_CARPET = getItemType("moss_carpet");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType PINK_PETALS = getItemType("pink_petals");
    public static final ItemType MOSS_BLOCK = getItemType("moss_block");
    public static final ItemType HANGING_ROOTS = getItemType("hanging_roots");
    public static final ItemType BIG_DRIPLEAF = getItemType("big_dripleaf");
    public static final ItemType SMALL_DRIPLEAF = getItemType("small_dripleaf");
    public static final ItemType BAMBOO = getItemType("bamboo");
    public static final ItemType OAK_SLAB = getItemType("oak_slab");
    public static final ItemType SPRUCE_SLAB = getItemType("spruce_slab");
    public static final ItemType BIRCH_SLAB = getItemType("birch_slab");
    public static final ItemType JUNGLE_SLAB = getItemType("jungle_slab");
    public static final ItemType ACACIA_SLAB = getItemType("acacia_slab");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_SLAB = getItemType("cherry_slab");
    public static final ItemType DARK_OAK_SLAB = getItemType("dark_oak_slab");
    public static final ItemType MANGROVE_SLAB = getItemType("mangrove_slab");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BAMBOO_SLAB = getItemType("bamboo_slab");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BAMBOO_MOSAIC_SLAB = getItemType("bamboo_mosaic_slab");
    public static final ItemType CRIMSON_SLAB = getItemType("crimson_slab");
    public static final ItemType WARPED_SLAB = getItemType("warped_slab");
    public static final ItemType STONE_SLAB = getItemType("stone_slab");
    public static final ItemType SMOOTH_STONE_SLAB = getItemType("smooth_stone_slab");
    public static final ItemType SANDSTONE_SLAB = getItemType("sandstone_slab");
    public static final ItemType CUT_SANDSTONE_SLAB = getItemType("cut_sandstone_slab");
    public static final ItemType PETRIFIED_OAK_SLAB = getItemType("petrified_oak_slab");
    public static final ItemType COBBLESTONE_SLAB = getItemType("cobblestone_slab");
    public static final ItemType BRICK_SLAB = getItemType("brick_slab");
    public static final ItemType STONE_BRICK_SLAB = getItemType("stone_brick_slab");
    public static final ItemType MUD_BRICK_SLAB = getItemType("mud_brick_slab");
    public static final ItemType NETHER_BRICK_SLAB = getItemType("nether_brick_slab");
    public static final ItemType QUARTZ_SLAB = getItemType("quartz_slab");
    public static final ItemType RED_SANDSTONE_SLAB = getItemType("red_sandstone_slab");
    public static final ItemType CUT_RED_SANDSTONE_SLAB = getItemType("cut_red_sandstone_slab");
    public static final ItemType PURPUR_SLAB = getItemType("purpur_slab");
    public static final ItemType PRISMARINE_SLAB = getItemType("prismarine_slab");
    public static final ItemType PRISMARINE_BRICK_SLAB = getItemType("prismarine_brick_slab");
    public static final ItemType DARK_PRISMARINE_SLAB = getItemType("dark_prismarine_slab");
    public static final ItemType SMOOTH_QUARTZ = getItemType("smooth_quartz");
    public static final ItemType SMOOTH_RED_SANDSTONE = getItemType("smooth_red_sandstone");
    public static final ItemType SMOOTH_SANDSTONE = getItemType("smooth_sandstone");
    public static final ItemType SMOOTH_STONE = getItemType("smooth_stone");
    public static final ItemType BRICKS = getItemType("bricks");
    public static final ItemType BOOKSHELF = getItemType("bookshelf");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHISELED_BOOKSHELF = getItemType("chiseled_bookshelf");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType DECORATED_POT = getItemType("decorated_pot");
    public static final ItemType MOSSY_COBBLESTONE = getItemType("mossy_cobblestone");
    public static final ItemType OBSIDIAN = getItemType("obsidian");
    public static final ItemType TORCH = getItemType("torch");
    public static final ItemType END_ROD = getItemType("end_rod");
    public static final ItemType CHORUS_PLANT = getItemType("chorus_plant");
    public static final ItemType CHORUS_FLOWER = getItemType("chorus_flower");
    public static final ItemType PURPUR_BLOCK = getItemType("purpur_block");
    public static final ItemType PURPUR_PILLAR = getItemType("purpur_pillar");
    public static final ItemType PURPUR_STAIRS = getItemType("purpur_stairs");
    public static final ItemType SPAWNER = getItemType("spawner");
    public static final ItemType CHEST = getItemType("chest");
    public static final ItemType CRAFTING_TABLE = getItemType("crafting_table");
    public static final ItemType FARMLAND = getItemType("farmland");
    public static final ItemType FURNACE = getItemType("furnace");
    public static final ItemType LADDER = getItemType("ladder");
    public static final ItemType COBBLESTONE_STAIRS = getItemType("cobblestone_stairs");
    public static final ItemType SNOW = getItemType("snow");
    public static final ItemType ICE = getItemType("ice");
    public static final ItemType SNOW_BLOCK = getItemType("snow_block");
    public static final ItemType CACTUS = getItemType("cactus");
    public static final ItemType CLAY = getItemType("clay");
    public static final ItemType JUKEBOX = getItemType("jukebox");
    public static final ItemType OAK_FENCE = getItemType("oak_fence");
    public static final ItemType SPRUCE_FENCE = getItemType("spruce_fence");
    public static final ItemType BIRCH_FENCE = getItemType("birch_fence");
    public static final ItemType JUNGLE_FENCE = getItemType("jungle_fence");
    public static final ItemType ACACIA_FENCE = getItemType("acacia_fence");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_FENCE = getItemType("cherry_fence");
    public static final ItemType DARK_OAK_FENCE = getItemType("dark_oak_fence");
    public static final ItemType MANGROVE_FENCE = getItemType("mangrove_fence");
    public static final ItemType BAMBOO_FENCE = getItemType("bamboo_fence");
    public static final ItemType CRIMSON_FENCE = getItemType("crimson_fence");
    public static final ItemType WARPED_FENCE = getItemType("warped_fence");
    public static final ItemType PUMPKIN = getItemType("pumpkin");
    public static final ItemType CARVED_PUMPKIN = getItemType("carved_pumpkin");
    public static final ItemType JACK_O_LANTERN = getItemType("jack_o_lantern");
    public static final ItemType NETHERRACK = getItemType("netherrack");
    public static final ItemType SOUL_SAND = getItemType("soul_sand");
    public static final ItemType SOUL_SOIL = getItemType("soul_soil");
    public static final ItemType BASALT = getItemType("basalt");
    public static final ItemType POLISHED_BASALT = getItemType("polished_basalt");
    public static final ItemType SMOOTH_BASALT = getItemType("smooth_basalt");
    public static final ItemType SOUL_TORCH = getItemType("soul_torch");
    public static final ItemType GLOWSTONE = getItemType("glowstone");
    public static final ItemType INFESTED_STONE = getItemType("infested_stone");
    public static final ItemType INFESTED_COBBLESTONE = getItemType("infested_cobblestone");
    public static final ItemType INFESTED_STONE_BRICKS = getItemType("infested_stone_bricks");
    public static final ItemType INFESTED_MOSSY_STONE_BRICKS = getItemType("infested_mossy_stone_bricks");
    public static final ItemType INFESTED_CRACKED_STONE_BRICKS = getItemType("infested_cracked_stone_bricks");
    public static final ItemType INFESTED_CHISELED_STONE_BRICKS = getItemType("infested_chiseled_stone_bricks");
    public static final ItemType INFESTED_DEEPSLATE = getItemType("infested_deepslate");
    public static final ItemType STONE_BRICKS = getItemType("stone_bricks");
    public static final ItemType MOSSY_STONE_BRICKS = getItemType("mossy_stone_bricks");
    public static final ItemType CRACKED_STONE_BRICKS = getItemType("cracked_stone_bricks");
    public static final ItemType CHISELED_STONE_BRICKS = getItemType("chiseled_stone_bricks");
    public static final ItemType PACKED_MUD = getItemType("packed_mud");
    public static final ItemType MUD_BRICKS = getItemType("mud_bricks");
    public static final ItemType DEEPSLATE_BRICKS = getItemType("deepslate_bricks");
    public static final ItemType CRACKED_DEEPSLATE_BRICKS = getItemType("cracked_deepslate_bricks");
    public static final ItemType DEEPSLATE_TILES = getItemType("deepslate_tiles");
    public static final ItemType CRACKED_DEEPSLATE_TILES = getItemType("cracked_deepslate_tiles");
    public static final ItemType CHISELED_DEEPSLATE = getItemType("chiseled_deepslate");
    public static final ItemType REINFORCED_DEEPSLATE = getItemType("reinforced_deepslate");
    public static final ItemType BROWN_MUSHROOM_BLOCK = getItemType("brown_mushroom_block");
    public static final ItemType RED_MUSHROOM_BLOCK = getItemType("red_mushroom_block");
    public static final ItemType MUSHROOM_STEM = getItemType("mushroom_stem");
    public static final ItemType IRON_BARS = getItemType("iron_bars");
    public static final ItemType CHAIN = getItemType("chain");
    public static final ItemType GLASS_PANE = getItemType("glass_pane");
    public static final ItemType MELON = getItemType("melon");
    public static final ItemType VINE = getItemType("vine");
    public static final ItemType GLOW_LICHEN = getItemType("glow_lichen");
    public static final ItemType BRICK_STAIRS = getItemType("brick_stairs");
    public static final ItemType STONE_BRICK_STAIRS = getItemType("stone_brick_stairs");
    public static final ItemType MUD_BRICK_STAIRS = getItemType("mud_brick_stairs");
    public static final ItemType MYCELIUM = getItemType("mycelium");
    public static final ItemType LILY_PAD = getItemType("lily_pad");
    public static final ItemType NETHER_BRICKS = getItemType("nether_bricks");
    public static final ItemType CRACKED_NETHER_BRICKS = getItemType("cracked_nether_bricks");
    public static final ItemType CHISELED_NETHER_BRICKS = getItemType("chiseled_nether_bricks");
    public static final ItemType NETHER_BRICK_FENCE = getItemType("nether_brick_fence");
    public static final ItemType NETHER_BRICK_STAIRS = getItemType("nether_brick_stairs");
    public static final ItemType SCULK = getItemType("sculk");
    public static final ItemType SCULK_VEIN = getItemType("sculk_vein");
    public static final ItemType SCULK_CATALYST = getItemType("sculk_catalyst");
    public static final ItemType SCULK_SHRIEKER = getItemType("sculk_shrieker");
    public static final ItemType ENCHANTING_TABLE = getItemType("enchanting_table");
    public static final ItemType END_PORTAL_FRAME = getItemType("end_portal_frame");
    public static final ItemType END_STONE = getItemType("end_stone");
    public static final ItemType END_STONE_BRICKS = getItemType("end_stone_bricks");
    public static final ItemType DRAGON_EGG = getItemType("dragon_egg");
    public static final ItemType SANDSTONE_STAIRS = getItemType("sandstone_stairs");
    public static final ItemType ENDER_CHEST = getItemType("ender_chest");
    public static final ItemType EMERALD_BLOCK = getItemType("emerald_block");
    public static final ItemType OAK_STAIRS = getItemType("oak_stairs");
    public static final ItemType SPRUCE_STAIRS = getItemType("spruce_stairs");
    public static final ItemType BIRCH_STAIRS = getItemType("birch_stairs");
    public static final ItemType JUNGLE_STAIRS = getItemType("jungle_stairs");
    public static final ItemType ACACIA_STAIRS = getItemType("acacia_stairs");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_STAIRS = getItemType("cherry_stairs");
    public static final ItemType DARK_OAK_STAIRS = getItemType("dark_oak_stairs");
    public static final ItemType MANGROVE_STAIRS = getItemType("mangrove_stairs");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BAMBOO_STAIRS = getItemType("bamboo_stairs");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BAMBOO_MOSAIC_STAIRS = getItemType("bamboo_mosaic_stairs");
    public static final ItemType CRIMSON_STAIRS = getItemType("crimson_stairs");
    public static final ItemType WARPED_STAIRS = getItemType("warped_stairs");
    public static final ItemType COMMAND_BLOCK = getItemType("command_block");
    public static final ItemType BEACON = getItemType("beacon");
    public static final ItemType COBBLESTONE_WALL = getItemType("cobblestone_wall");
    public static final ItemType MOSSY_COBBLESTONE_WALL = getItemType("mossy_cobblestone_wall");
    public static final ItemType BRICK_WALL = getItemType("brick_wall");
    public static final ItemType PRISMARINE_WALL = getItemType("prismarine_wall");
    public static final ItemType RED_SANDSTONE_WALL = getItemType("red_sandstone_wall");
    public static final ItemType MOSSY_STONE_BRICK_WALL = getItemType("mossy_stone_brick_wall");
    public static final ItemType GRANITE_WALL = getItemType("granite_wall");
    public static final ItemType STONE_BRICK_WALL = getItemType("stone_brick_wall");
    public static final ItemType MUD_BRICK_WALL = getItemType("mud_brick_wall");
    public static final ItemType NETHER_BRICK_WALL = getItemType("nether_brick_wall");
    public static final ItemType ANDESITE_WALL = getItemType("andesite_wall");
    public static final ItemType RED_NETHER_BRICK_WALL = getItemType("red_nether_brick_wall");
    public static final ItemType SANDSTONE_WALL = getItemType("sandstone_wall");
    public static final ItemType END_STONE_BRICK_WALL = getItemType("end_stone_brick_wall");
    public static final ItemType DIORITE_WALL = getItemType("diorite_wall");
    public static final ItemType BLACKSTONE_WALL = getItemType("blackstone_wall");
    public static final ItemType POLISHED_BLACKSTONE_WALL = getItemType("polished_blackstone_wall");
    public static final ItemType POLISHED_BLACKSTONE_BRICK_WALL = getItemType("polished_blackstone_brick_wall");
    public static final ItemType COBBLED_DEEPSLATE_WALL = getItemType("cobbled_deepslate_wall");
    public static final ItemType POLISHED_DEEPSLATE_WALL = getItemType("polished_deepslate_wall");
    public static final ItemType DEEPSLATE_BRICK_WALL = getItemType("deepslate_brick_wall");
    public static final ItemType DEEPSLATE_TILE_WALL = getItemType("deepslate_tile_wall");
    public static final ItemType ANVIL = getItemType("anvil");
    public static final ItemType CHIPPED_ANVIL = getItemType("chipped_anvil");
    public static final ItemType DAMAGED_ANVIL = getItemType("damaged_anvil");
    public static final ItemType CHISELED_QUARTZ_BLOCK = getItemType("chiseled_quartz_block");
    public static final ItemType QUARTZ_BLOCK = getItemType("quartz_block");
    public static final ItemType QUARTZ_BRICKS = getItemType("quartz_bricks");
    public static final ItemType QUARTZ_PILLAR = getItemType("quartz_pillar");
    public static final ItemType QUARTZ_STAIRS = getItemType("quartz_stairs");
    public static final ItemType WHITE_TERRACOTTA = getItemType("white_terracotta");
    public static final ItemType ORANGE_TERRACOTTA = getItemType("orange_terracotta");
    public static final ItemType MAGENTA_TERRACOTTA = getItemType("magenta_terracotta");
    public static final ItemType LIGHT_BLUE_TERRACOTTA = getItemType("light_blue_terracotta");
    public static final ItemType YELLOW_TERRACOTTA = getItemType("yellow_terracotta");
    public static final ItemType LIME_TERRACOTTA = getItemType("lime_terracotta");
    public static final ItemType PINK_TERRACOTTA = getItemType("pink_terracotta");
    public static final ItemType GRAY_TERRACOTTA = getItemType("gray_terracotta");
    public static final ItemType LIGHT_GRAY_TERRACOTTA = getItemType("light_gray_terracotta");
    public static final ItemType CYAN_TERRACOTTA = getItemType("cyan_terracotta");
    public static final ItemType PURPLE_TERRACOTTA = getItemType("purple_terracotta");
    public static final ItemType BLUE_TERRACOTTA = getItemType("blue_terracotta");
    public static final ItemType BROWN_TERRACOTTA = getItemType("brown_terracotta");
    public static final ItemType GREEN_TERRACOTTA = getItemType("green_terracotta");
    public static final ItemType RED_TERRACOTTA = getItemType("red_terracotta");
    public static final ItemType BLACK_TERRACOTTA = getItemType("black_terracotta");
    public static final ItemType BARRIER = getItemType("barrier");
    public static final ItemType LIGHT = getItemType("light");
    public static final ItemType HAY_BLOCK = getItemType("hay_block");
    public static final ItemType WHITE_CARPET = getItemType("white_carpet");
    public static final ItemType ORANGE_CARPET = getItemType("orange_carpet");
    public static final ItemType MAGENTA_CARPET = getItemType("magenta_carpet");
    public static final ItemType LIGHT_BLUE_CARPET = getItemType("light_blue_carpet");
    public static final ItemType YELLOW_CARPET = getItemType("yellow_carpet");
    public static final ItemType LIME_CARPET = getItemType("lime_carpet");
    public static final ItemType PINK_CARPET = getItemType("pink_carpet");
    public static final ItemType GRAY_CARPET = getItemType("gray_carpet");
    public static final ItemType LIGHT_GRAY_CARPET = getItemType("light_gray_carpet");
    public static final ItemType CYAN_CARPET = getItemType("cyan_carpet");
    public static final ItemType PURPLE_CARPET = getItemType("purple_carpet");
    public static final ItemType BLUE_CARPET = getItemType("blue_carpet");
    public static final ItemType BROWN_CARPET = getItemType("brown_carpet");
    public static final ItemType GREEN_CARPET = getItemType("green_carpet");
    public static final ItemType RED_CARPET = getItemType("red_carpet");
    public static final ItemType BLACK_CARPET = getItemType("black_carpet");
    public static final ItemType TERRACOTTA = getItemType("terracotta");
    public static final ItemType PACKED_ICE = getItemType("packed_ice");
    public static final ItemType DIRT_PATH = getItemType("dirt_path");
    public static final ItemType SUNFLOWER = getItemType("sunflower");
    public static final ItemType LILAC = getItemType("lilac");
    public static final ItemType ROSE_BUSH = getItemType("rose_bush");
    public static final ItemType PEONY = getItemType("peony");
    public static final ItemType TALL_GRASS = getItemType("tall_grass");
    public static final ItemType LARGE_FERN = getItemType("large_fern");
    public static final ItemType WHITE_STAINED_GLASS = getItemType("white_stained_glass");
    public static final ItemType ORANGE_STAINED_GLASS = getItemType("orange_stained_glass");
    public static final ItemType MAGENTA_STAINED_GLASS = getItemType("magenta_stained_glass");
    public static final ItemType LIGHT_BLUE_STAINED_GLASS = getItemType("light_blue_stained_glass");
    public static final ItemType YELLOW_STAINED_GLASS = getItemType("yellow_stained_glass");
    public static final ItemType LIME_STAINED_GLASS = getItemType("lime_stained_glass");
    public static final ItemType PINK_STAINED_GLASS = getItemType("pink_stained_glass");
    public static final ItemType GRAY_STAINED_GLASS = getItemType("gray_stained_glass");
    public static final ItemType LIGHT_GRAY_STAINED_GLASS = getItemType("light_gray_stained_glass");
    public static final ItemType CYAN_STAINED_GLASS = getItemType("cyan_stained_glass");
    public static final ItemType PURPLE_STAINED_GLASS = getItemType("purple_stained_glass");
    public static final ItemType BLUE_STAINED_GLASS = getItemType("blue_stained_glass");
    public static final ItemType BROWN_STAINED_GLASS = getItemType("brown_stained_glass");
    public static final ItemType GREEN_STAINED_GLASS = getItemType("green_stained_glass");
    public static final ItemType RED_STAINED_GLASS = getItemType("red_stained_glass");
    public static final ItemType BLACK_STAINED_GLASS = getItemType("black_stained_glass");
    public static final ItemType WHITE_STAINED_GLASS_PANE = getItemType("white_stained_glass_pane");
    public static final ItemType ORANGE_STAINED_GLASS_PANE = getItemType("orange_stained_glass_pane");
    public static final ItemType MAGENTA_STAINED_GLASS_PANE = getItemType("magenta_stained_glass_pane");
    public static final ItemType LIGHT_BLUE_STAINED_GLASS_PANE = getItemType("light_blue_stained_glass_pane");
    public static final ItemType YELLOW_STAINED_GLASS_PANE = getItemType("yellow_stained_glass_pane");
    public static final ItemType LIME_STAINED_GLASS_PANE = getItemType("lime_stained_glass_pane");
    public static final ItemType PINK_STAINED_GLASS_PANE = getItemType("pink_stained_glass_pane");
    public static final ItemType GRAY_STAINED_GLASS_PANE = getItemType("gray_stained_glass_pane");
    public static final ItemType LIGHT_GRAY_STAINED_GLASS_PANE = getItemType("light_gray_stained_glass_pane");
    public static final ItemType CYAN_STAINED_GLASS_PANE = getItemType("cyan_stained_glass_pane");
    public static final ItemType PURPLE_STAINED_GLASS_PANE = getItemType("purple_stained_glass_pane");
    public static final ItemType BLUE_STAINED_GLASS_PANE = getItemType("blue_stained_glass_pane");
    public static final ItemType BROWN_STAINED_GLASS_PANE = getItemType("brown_stained_glass_pane");
    public static final ItemType GREEN_STAINED_GLASS_PANE = getItemType("green_stained_glass_pane");
    public static final ItemType RED_STAINED_GLASS_PANE = getItemType("red_stained_glass_pane");
    public static final ItemType BLACK_STAINED_GLASS_PANE = getItemType("black_stained_glass_pane");
    public static final ItemType PRISMARINE = getItemType("prismarine");
    public static final ItemType PRISMARINE_BRICKS = getItemType("prismarine_bricks");
    public static final ItemType DARK_PRISMARINE = getItemType("dark_prismarine");
    public static final ItemType PRISMARINE_STAIRS = getItemType("prismarine_stairs");
    public static final ItemType PRISMARINE_BRICK_STAIRS = getItemType("prismarine_brick_stairs");
    public static final ItemType DARK_PRISMARINE_STAIRS = getItemType("dark_prismarine_stairs");
    public static final ItemType SEA_LANTERN = getItemType("sea_lantern");
    public static final ItemType RED_SANDSTONE = getItemType("red_sandstone");
    public static final ItemType CHISELED_RED_SANDSTONE = getItemType("chiseled_red_sandstone");
    public static final ItemType CUT_RED_SANDSTONE = getItemType("cut_red_sandstone");
    public static final ItemType RED_SANDSTONE_STAIRS = getItemType("red_sandstone_stairs");
    public static final ItemType REPEATING_COMMAND_BLOCK = getItemType("repeating_command_block");
    public static final ItemType CHAIN_COMMAND_BLOCK = getItemType("chain_command_block");
    public static final ItemType MAGMA_BLOCK = getItemType("magma_block");
    public static final ItemType NETHER_WART_BLOCK = getItemType("nether_wart_block");
    public static final ItemType WARPED_WART_BLOCK = getItemType("warped_wart_block");
    public static final ItemType RED_NETHER_BRICKS = getItemType("red_nether_bricks");
    public static final ItemType BONE_BLOCK = getItemType("bone_block");
    public static final ItemType STRUCTURE_VOID = getItemType("structure_void");
    public static final ItemType SHULKER_BOX = getItemType("shulker_box");
    public static final ItemType WHITE_SHULKER_BOX = getItemType("white_shulker_box");
    public static final ItemType ORANGE_SHULKER_BOX = getItemType("orange_shulker_box");
    public static final ItemType MAGENTA_SHULKER_BOX = getItemType("magenta_shulker_box");
    public static final ItemType LIGHT_BLUE_SHULKER_BOX = getItemType("light_blue_shulker_box");
    public static final ItemType YELLOW_SHULKER_BOX = getItemType("yellow_shulker_box");
    public static final ItemType LIME_SHULKER_BOX = getItemType("lime_shulker_box");
    public static final ItemType PINK_SHULKER_BOX = getItemType("pink_shulker_box");
    public static final ItemType GRAY_SHULKER_BOX = getItemType("gray_shulker_box");
    public static final ItemType LIGHT_GRAY_SHULKER_BOX = getItemType("light_gray_shulker_box");
    public static final ItemType CYAN_SHULKER_BOX = getItemType("cyan_shulker_box");
    public static final ItemType PURPLE_SHULKER_BOX = getItemType("purple_shulker_box");
    public static final ItemType BLUE_SHULKER_BOX = getItemType("blue_shulker_box");
    public static final ItemType BROWN_SHULKER_BOX = getItemType("brown_shulker_box");
    public static final ItemType GREEN_SHULKER_BOX = getItemType("green_shulker_box");
    public static final ItemType RED_SHULKER_BOX = getItemType("red_shulker_box");
    public static final ItemType BLACK_SHULKER_BOX = getItemType("black_shulker_box");
    public static final ItemType WHITE_GLAZED_TERRACOTTA = getItemType("white_glazed_terracotta");
    public static final ItemType ORANGE_GLAZED_TERRACOTTA = getItemType("orange_glazed_terracotta");
    public static final ItemType MAGENTA_GLAZED_TERRACOTTA = getItemType("magenta_glazed_terracotta");
    public static final ItemType LIGHT_BLUE_GLAZED_TERRACOTTA = getItemType("light_blue_glazed_terracotta");
    public static final ItemType YELLOW_GLAZED_TERRACOTTA = getItemType("yellow_glazed_terracotta");
    public static final ItemType LIME_GLAZED_TERRACOTTA = getItemType("lime_glazed_terracotta");
    public static final ItemType PINK_GLAZED_TERRACOTTA = getItemType("pink_glazed_terracotta");
    public static final ItemType GRAY_GLAZED_TERRACOTTA = getItemType("gray_glazed_terracotta");
    public static final ItemType LIGHT_GRAY_GLAZED_TERRACOTTA = getItemType("light_gray_glazed_terracotta");
    public static final ItemType CYAN_GLAZED_TERRACOTTA = getItemType("cyan_glazed_terracotta");
    public static final ItemType PURPLE_GLAZED_TERRACOTTA = getItemType("purple_glazed_terracotta");
    public static final ItemType BLUE_GLAZED_TERRACOTTA = getItemType("blue_glazed_terracotta");
    public static final ItemType BROWN_GLAZED_TERRACOTTA = getItemType("brown_glazed_terracotta");
    public static final ItemType GREEN_GLAZED_TERRACOTTA = getItemType("green_glazed_terracotta");
    public static final ItemType RED_GLAZED_TERRACOTTA = getItemType("red_glazed_terracotta");
    public static final ItemType BLACK_GLAZED_TERRACOTTA = getItemType("black_glazed_terracotta");
    public static final ItemType WHITE_CONCRETE = getItemType("white_concrete");
    public static final ItemType ORANGE_CONCRETE = getItemType("orange_concrete");
    public static final ItemType MAGENTA_CONCRETE = getItemType("magenta_concrete");
    public static final ItemType LIGHT_BLUE_CONCRETE = getItemType("light_blue_concrete");
    public static final ItemType YELLOW_CONCRETE = getItemType("yellow_concrete");
    public static final ItemType LIME_CONCRETE = getItemType("lime_concrete");
    public static final ItemType PINK_CONCRETE = getItemType("pink_concrete");
    public static final ItemType GRAY_CONCRETE = getItemType("gray_concrete");
    public static final ItemType LIGHT_GRAY_CONCRETE = getItemType("light_gray_concrete");
    public static final ItemType CYAN_CONCRETE = getItemType("cyan_concrete");
    public static final ItemType PURPLE_CONCRETE = getItemType("purple_concrete");
    public static final ItemType BLUE_CONCRETE = getItemType("blue_concrete");
    public static final ItemType BROWN_CONCRETE = getItemType("brown_concrete");
    public static final ItemType GREEN_CONCRETE = getItemType("green_concrete");
    public static final ItemType RED_CONCRETE = getItemType("red_concrete");
    public static final ItemType BLACK_CONCRETE = getItemType("black_concrete");
    public static final ItemType WHITE_CONCRETE_POWDER = getItemType("white_concrete_powder");
    public static final ItemType ORANGE_CONCRETE_POWDER = getItemType("orange_concrete_powder");
    public static final ItemType MAGENTA_CONCRETE_POWDER = getItemType("magenta_concrete_powder");
    public static final ItemType LIGHT_BLUE_CONCRETE_POWDER = getItemType("light_blue_concrete_powder");
    public static final ItemType YELLOW_CONCRETE_POWDER = getItemType("yellow_concrete_powder");
    public static final ItemType LIME_CONCRETE_POWDER = getItemType("lime_concrete_powder");
    public static final ItemType PINK_CONCRETE_POWDER = getItemType("pink_concrete_powder");
    public static final ItemType GRAY_CONCRETE_POWDER = getItemType("gray_concrete_powder");
    public static final ItemType LIGHT_GRAY_CONCRETE_POWDER = getItemType("light_gray_concrete_powder");
    public static final ItemType CYAN_CONCRETE_POWDER = getItemType("cyan_concrete_powder");
    public static final ItemType PURPLE_CONCRETE_POWDER = getItemType("purple_concrete_powder");
    public static final ItemType BLUE_CONCRETE_POWDER = getItemType("blue_concrete_powder");
    public static final ItemType BROWN_CONCRETE_POWDER = getItemType("brown_concrete_powder");
    public static final ItemType GREEN_CONCRETE_POWDER = getItemType("green_concrete_powder");
    public static final ItemType RED_CONCRETE_POWDER = getItemType("red_concrete_powder");
    public static final ItemType BLACK_CONCRETE_POWDER = getItemType("black_concrete_powder");
    public static final ItemType TURTLE_EGG = getItemType("turtle_egg");
    public static final ItemType DEAD_TUBE_CORAL_BLOCK = getItemType("dead_tube_coral_block");
    public static final ItemType DEAD_BRAIN_CORAL_BLOCK = getItemType("dead_brain_coral_block");
    public static final ItemType DEAD_BUBBLE_CORAL_BLOCK = getItemType("dead_bubble_coral_block");
    public static final ItemType DEAD_FIRE_CORAL_BLOCK = getItemType("dead_fire_coral_block");
    public static final ItemType DEAD_HORN_CORAL_BLOCK = getItemType("dead_horn_coral_block");
    public static final ItemType TUBE_CORAL_BLOCK = getItemType("tube_coral_block");
    public static final ItemType BRAIN_CORAL_BLOCK = getItemType("brain_coral_block");
    public static final ItemType BUBBLE_CORAL_BLOCK = getItemType("bubble_coral_block");
    public static final ItemType FIRE_CORAL_BLOCK = getItemType("fire_coral_block");
    public static final ItemType HORN_CORAL_BLOCK = getItemType("horn_coral_block");
    public static final ItemType TUBE_CORAL = getItemType("tube_coral");
    public static final ItemType BRAIN_CORAL = getItemType("brain_coral");
    public static final ItemType BUBBLE_CORAL = getItemType("bubble_coral");
    public static final ItemType FIRE_CORAL = getItemType("fire_coral");
    public static final ItemType HORN_CORAL = getItemType("horn_coral");
    public static final ItemType DEAD_BRAIN_CORAL = getItemType("dead_brain_coral");
    public static final ItemType DEAD_BUBBLE_CORAL = getItemType("dead_bubble_coral");
    public static final ItemType DEAD_FIRE_CORAL = getItemType("dead_fire_coral");
    public static final ItemType DEAD_HORN_CORAL = getItemType("dead_horn_coral");
    public static final ItemType DEAD_TUBE_CORAL = getItemType("dead_tube_coral");
    public static final ItemType TUBE_CORAL_FAN = getItemType("tube_coral_fan");
    public static final ItemType BRAIN_CORAL_FAN = getItemType("brain_coral_fan");
    public static final ItemType BUBBLE_CORAL_FAN = getItemType("bubble_coral_fan");
    public static final ItemType FIRE_CORAL_FAN = getItemType("fire_coral_fan");
    public static final ItemType HORN_CORAL_FAN = getItemType("horn_coral_fan");
    public static final ItemType DEAD_TUBE_CORAL_FAN = getItemType("dead_tube_coral_fan");
    public static final ItemType DEAD_BRAIN_CORAL_FAN = getItemType("dead_brain_coral_fan");
    public static final ItemType DEAD_BUBBLE_CORAL_FAN = getItemType("dead_bubble_coral_fan");
    public static final ItemType DEAD_FIRE_CORAL_FAN = getItemType("dead_fire_coral_fan");
    public static final ItemType DEAD_HORN_CORAL_FAN = getItemType("dead_horn_coral_fan");
    public static final ItemType BLUE_ICE = getItemType("blue_ice");
    public static final ItemType CONDUIT = getItemType("conduit");
    public static final ItemType POLISHED_GRANITE_STAIRS = getItemType("polished_granite_stairs");
    public static final ItemType SMOOTH_RED_SANDSTONE_STAIRS = getItemType("smooth_red_sandstone_stairs");
    public static final ItemType MOSSY_STONE_BRICK_STAIRS = getItemType("mossy_stone_brick_stairs");
    public static final ItemType POLISHED_DIORITE_STAIRS = getItemType("polished_diorite_stairs");
    public static final ItemType MOSSY_COBBLESTONE_STAIRS = getItemType("mossy_cobblestone_stairs");
    public static final ItemType END_STONE_BRICK_STAIRS = getItemType("end_stone_brick_stairs");
    public static final ItemType STONE_STAIRS = getItemType("stone_stairs");
    public static final ItemType SMOOTH_SANDSTONE_STAIRS = getItemType("smooth_sandstone_stairs");
    public static final ItemType SMOOTH_QUARTZ_STAIRS = getItemType("smooth_quartz_stairs");
    public static final ItemType GRANITE_STAIRS = getItemType("granite_stairs");
    public static final ItemType ANDESITE_STAIRS = getItemType("andesite_stairs");
    public static final ItemType RED_NETHER_BRICK_STAIRS = getItemType("red_nether_brick_stairs");
    public static final ItemType POLISHED_ANDESITE_STAIRS = getItemType("polished_andesite_stairs");
    public static final ItemType DIORITE_STAIRS = getItemType("diorite_stairs");
    public static final ItemType COBBLED_DEEPSLATE_STAIRS = getItemType("cobbled_deepslate_stairs");
    public static final ItemType POLISHED_DEEPSLATE_STAIRS = getItemType("polished_deepslate_stairs");
    public static final ItemType DEEPSLATE_BRICK_STAIRS = getItemType("deepslate_brick_stairs");
    public static final ItemType DEEPSLATE_TILE_STAIRS = getItemType("deepslate_tile_stairs");
    public static final ItemType POLISHED_GRANITE_SLAB = getItemType("polished_granite_slab");
    public static final ItemType SMOOTH_RED_SANDSTONE_SLAB = getItemType("smooth_red_sandstone_slab");
    public static final ItemType MOSSY_STONE_BRICK_SLAB = getItemType("mossy_stone_brick_slab");
    public static final ItemType POLISHED_DIORITE_SLAB = getItemType("polished_diorite_slab");
    public static final ItemType MOSSY_COBBLESTONE_SLAB = getItemType("mossy_cobblestone_slab");
    public static final ItemType END_STONE_BRICK_SLAB = getItemType("end_stone_brick_slab");
    public static final ItemType SMOOTH_SANDSTONE_SLAB = getItemType("smooth_sandstone_slab");
    public static final ItemType SMOOTH_QUARTZ_SLAB = getItemType("smooth_quartz_slab");
    public static final ItemType GRANITE_SLAB = getItemType("granite_slab");
    public static final ItemType ANDESITE_SLAB = getItemType("andesite_slab");
    public static final ItemType RED_NETHER_BRICK_SLAB = getItemType("red_nether_brick_slab");
    public static final ItemType POLISHED_ANDESITE_SLAB = getItemType("polished_andesite_slab");
    public static final ItemType DIORITE_SLAB = getItemType("diorite_slab");
    public static final ItemType COBBLED_DEEPSLATE_SLAB = getItemType("cobbled_deepslate_slab");
    public static final ItemType POLISHED_DEEPSLATE_SLAB = getItemType("polished_deepslate_slab");
    public static final ItemType DEEPSLATE_BRICK_SLAB = getItemType("deepslate_brick_slab");
    public static final ItemType DEEPSLATE_TILE_SLAB = getItemType("deepslate_tile_slab");
    public static final ItemType SCAFFOLDING = getItemType("scaffolding");
    public static final ItemType REDSTONE = getItemType("redstone");
    public static final ItemType REDSTONE_TORCH = getItemType("redstone_torch");
    public static final ItemType REDSTONE_BLOCK = getItemType("redstone_block");
    public static final ItemType REPEATER = getItemType("repeater");
    public static final ItemType COMPARATOR = getItemType("comparator");
    public static final ItemType PISTON = getItemType("piston");
    public static final ItemType STICKY_PISTON = getItemType("sticky_piston");
    public static final ItemType SLIME_BLOCK = getItemType("slime_block");
    public static final ItemType HONEY_BLOCK = getItemType("honey_block");
    public static final ItemType OBSERVER = getItemType("observer");
    public static final ItemType HOPPER = getItemType("hopper");
    public static final ItemType DISPENSER = getItemType("dispenser");
    public static final ItemType DROPPER = getItemType("dropper");
    public static final ItemType LECTERN = getItemType("lectern");
    public static final ItemType TARGET = getItemType("target");
    public static final ItemType LEVER = getItemType("lever");
    public static final ItemType LIGHTNING_ROD = getItemType("lightning_rod");
    public static final ItemType DAYLIGHT_DETECTOR = getItemType("daylight_detector");
    public static final ItemType SCULK_SENSOR = getItemType("sculk_sensor");
    public static final ItemType TRIPWIRE_HOOK = getItemType("tripwire_hook");
    public static final ItemType TRAPPED_CHEST = getItemType("trapped_chest");
    public static final ItemType TNT = getItemType("tnt");
    public static final ItemType REDSTONE_LAMP = getItemType("redstone_lamp");
    public static final ItemType NOTE_BLOCK = getItemType("note_block");
    public static final ItemType STONE_BUTTON = getItemType("stone_button");
    public static final ItemType POLISHED_BLACKSTONE_BUTTON = getItemType("polished_blackstone_button");
    public static final ItemType OAK_BUTTON = getItemType("oak_button");
    public static final ItemType SPRUCE_BUTTON = getItemType("spruce_button");
    public static final ItemType BIRCH_BUTTON = getItemType("birch_button");
    public static final ItemType JUNGLE_BUTTON = getItemType("jungle_button");
    public static final ItemType ACACIA_BUTTON = getItemType("acacia_button");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_BUTTON = getItemType("cherry_button");
    public static final ItemType DARK_OAK_BUTTON = getItemType("dark_oak_button");
    public static final ItemType MANGROVE_BUTTON = getItemType("mangrove_button");
    public static final ItemType BAMBOO_BUTTON = getItemType("bamboo_button");
    public static final ItemType CRIMSON_BUTTON = getItemType("crimson_button");
    public static final ItemType WARPED_BUTTON = getItemType("warped_button");
    public static final ItemType STONE_PRESSURE_PLATE = getItemType("stone_pressure_plate");
    public static final ItemType POLISHED_BLACKSTONE_PRESSURE_PLATE = getItemType("polished_blackstone_pressure_plate");
    public static final ItemType LIGHT_WEIGHTED_PRESSURE_PLATE = getItemType("light_weighted_pressure_plate");
    public static final ItemType HEAVY_WEIGHTED_PRESSURE_PLATE = getItemType("heavy_weighted_pressure_plate");
    public static final ItemType OAK_PRESSURE_PLATE = getItemType("oak_pressure_plate");
    public static final ItemType SPRUCE_PRESSURE_PLATE = getItemType("spruce_pressure_plate");
    public static final ItemType BIRCH_PRESSURE_PLATE = getItemType("birch_pressure_plate");
    public static final ItemType JUNGLE_PRESSURE_PLATE = getItemType("jungle_pressure_plate");
    public static final ItemType ACACIA_PRESSURE_PLATE = getItemType("acacia_pressure_plate");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_PRESSURE_PLATE = getItemType("cherry_pressure_plate");
    public static final ItemType DARK_OAK_PRESSURE_PLATE = getItemType("dark_oak_pressure_plate");
    public static final ItemType MANGROVE_PRESSURE_PLATE = getItemType("mangrove_pressure_plate");
    public static final ItemType BAMBOO_PRESSURE_PLATE = getItemType("bamboo_pressure_plate");
    public static final ItemType CRIMSON_PRESSURE_PLATE = getItemType("crimson_pressure_plate");
    public static final ItemType WARPED_PRESSURE_PLATE = getItemType("warped_pressure_plate");
    public static final ItemType IRON_DOOR = getItemType("iron_door");
    public static final ItemType OAK_DOOR = getItemType("oak_door");
    public static final ItemType SPRUCE_DOOR = getItemType("spruce_door");
    public static final ItemType BIRCH_DOOR = getItemType("birch_door");
    public static final ItemType JUNGLE_DOOR = getItemType("jungle_door");
    public static final ItemType ACACIA_DOOR = getItemType("acacia_door");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_DOOR = getItemType("cherry_door");
    public static final ItemType DARK_OAK_DOOR = getItemType("dark_oak_door");
    public static final ItemType MANGROVE_DOOR = getItemType("mangrove_door");
    public static final ItemType BAMBOO_DOOR = getItemType("bamboo_door");
    public static final ItemType CRIMSON_DOOR = getItemType("crimson_door");
    public static final ItemType WARPED_DOOR = getItemType("warped_door");
    public static final ItemType IRON_TRAPDOOR = getItemType("iron_trapdoor");
    public static final ItemType OAK_TRAPDOOR = getItemType("oak_trapdoor");
    public static final ItemType SPRUCE_TRAPDOOR = getItemType("spruce_trapdoor");
    public static final ItemType BIRCH_TRAPDOOR = getItemType("birch_trapdoor");
    public static final ItemType JUNGLE_TRAPDOOR = getItemType("jungle_trapdoor");
    public static final ItemType ACACIA_TRAPDOOR = getItemType("acacia_trapdoor");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_TRAPDOOR = getItemType("cherry_trapdoor");
    public static final ItemType DARK_OAK_TRAPDOOR = getItemType("dark_oak_trapdoor");
    public static final ItemType MANGROVE_TRAPDOOR = getItemType("mangrove_trapdoor");
    public static final ItemType BAMBOO_TRAPDOOR = getItemType("bamboo_trapdoor");
    public static final ItemType CRIMSON_TRAPDOOR = getItemType("crimson_trapdoor");
    public static final ItemType WARPED_TRAPDOOR = getItemType("warped_trapdoor");
    public static final ItemType OAK_FENCE_GATE = getItemType("oak_fence_gate");
    public static final ItemType SPRUCE_FENCE_GATE = getItemType("spruce_fence_gate");
    public static final ItemType BIRCH_FENCE_GATE = getItemType("birch_fence_gate");
    public static final ItemType JUNGLE_FENCE_GATE = getItemType("jungle_fence_gate");
    public static final ItemType ACACIA_FENCE_GATE = getItemType("acacia_fence_gate");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_FENCE_GATE = getItemType("cherry_fence_gate");
    public static final ItemType DARK_OAK_FENCE_GATE = getItemType("dark_oak_fence_gate");
    public static final ItemType MANGROVE_FENCE_GATE = getItemType("mangrove_fence_gate");
    public static final ItemType BAMBOO_FENCE_GATE = getItemType("bamboo_fence_gate");
    public static final ItemType CRIMSON_FENCE_GATE = getItemType("crimson_fence_gate");
    public static final ItemType WARPED_FENCE_GATE = getItemType("warped_fence_gate");
    public static final ItemType POWERED_RAIL = getItemType("powered_rail");
    public static final ItemType DETECTOR_RAIL = getItemType("detector_rail");
    public static final ItemType RAIL = getItemType("rail");
    public static final ItemType ACTIVATOR_RAIL = getItemType("activator_rail");
    public static final ItemType SADDLE = getItemType("saddle");
    public static final ItemType MINECART = getItemType("minecart");
    public static final ItemType CHEST_MINECART = getItemType("chest_minecart");
    public static final ItemType FURNACE_MINECART = getItemType("furnace_minecart");
    public static final ItemType TNT_MINECART = getItemType("tnt_minecart");
    public static final ItemType HOPPER_MINECART = getItemType("hopper_minecart");
    public static final ItemType CARROT_ON_A_STICK = getItemType("carrot_on_a_stick");
    public static final ItemType WARPED_FUNGUS_ON_A_STICK = getItemType("warped_fungus_on_a_stick");
    public static final ItemType ELYTRA = getItemType("elytra");
    public static final ItemType OAK_BOAT = getItemType("oak_boat");
    public static final ItemType OAK_CHEST_BOAT = getItemType("oak_chest_boat");
    public static final ItemType SPRUCE_BOAT = getItemType("spruce_boat");
    public static final ItemType SPRUCE_CHEST_BOAT = getItemType("spruce_chest_boat");
    public static final ItemType BIRCH_BOAT = getItemType("birch_boat");
    public static final ItemType BIRCH_CHEST_BOAT = getItemType("birch_chest_boat");
    public static final ItemType JUNGLE_BOAT = getItemType("jungle_boat");
    public static final ItemType JUNGLE_CHEST_BOAT = getItemType("jungle_chest_boat");
    public static final ItemType ACACIA_BOAT = getItemType("acacia_boat");
    public static final ItemType ACACIA_CHEST_BOAT = getItemType("acacia_chest_boat");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_BOAT = getItemType("cherry_boat");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_CHEST_BOAT = getItemType("cherry_chest_boat");
    public static final ItemType DARK_OAK_BOAT = getItemType("dark_oak_boat");
    public static final ItemType DARK_OAK_CHEST_BOAT = getItemType("dark_oak_chest_boat");
    public static final ItemType MANGROVE_BOAT = getItemType("mangrove_boat");
    public static final ItemType MANGROVE_CHEST_BOAT = getItemType("mangrove_chest_boat");
    public static final ItemType BAMBOO_RAFT = getItemType("bamboo_raft");
    public static final ItemType BAMBOO_CHEST_RAFT = getItemType("bamboo_chest_raft");
    public static final ItemType STRUCTURE_BLOCK = getItemType("structure_block");
    public static final ItemType JIGSAW = getItemType("jigsaw");
    public static final ItemType TURTLE_HELMET = getItemType("turtle_helmet");
    public static final ItemType SCUTE = getItemType("scute");
    public static final ItemType FLINT_AND_STEEL = getItemType("flint_and_steel");
    public static final ItemType APPLE = getItemType("apple");
    public static final ItemType BOW = getItemType("bow");
    public static final ItemType ARROW = getItemType("arrow");
    public static final ItemType COAL = getItemType("coal");
    public static final ItemType CHARCOAL = getItemType("charcoal");
    public static final ItemType DIAMOND = getItemType("diamond");
    public static final ItemType EMERALD = getItemType("emerald");
    public static final ItemType LAPIS_LAZULI = getItemType("lapis_lazuli");
    public static final ItemType QUARTZ = getItemType("quartz");
    public static final ItemType AMETHYST_SHARD = getItemType("amethyst_shard");
    public static final ItemType RAW_IRON = getItemType("raw_iron");
    public static final ItemType IRON_INGOT = getItemType("iron_ingot");
    public static final ItemType RAW_COPPER = getItemType("raw_copper");
    public static final ItemType COPPER_INGOT = getItemType("copper_ingot");
    public static final ItemType RAW_GOLD = getItemType("raw_gold");
    public static final ItemType GOLD_INGOT = getItemType("gold_ingot");
    public static final ItemType NETHERITE_INGOT = getItemType("netherite_ingot");
    public static final ItemType NETHERITE_SCRAP = getItemType("netherite_scrap");
    public static final ItemType WOODEN_SWORD = getItemType("wooden_sword");
    public static final ItemType WOODEN_SHOVEL = getItemType("wooden_shovel");
    public static final ItemType WOODEN_PICKAXE = getItemType("wooden_pickaxe");
    public static final ItemType WOODEN_AXE = getItemType("wooden_axe");
    public static final ItemType WOODEN_HOE = getItemType("wooden_hoe");
    public static final ItemType STONE_SWORD = getItemType("stone_sword");
    public static final ItemType STONE_SHOVEL = getItemType("stone_shovel");
    public static final ItemType STONE_PICKAXE = getItemType("stone_pickaxe");
    public static final ItemType STONE_AXE = getItemType("stone_axe");
    public static final ItemType STONE_HOE = getItemType("stone_hoe");
    public static final ItemType GOLDEN_SWORD = getItemType("golden_sword");
    public static final ItemType GOLDEN_SHOVEL = getItemType("golden_shovel");
    public static final ItemType GOLDEN_PICKAXE = getItemType("golden_pickaxe");
    public static final ItemType GOLDEN_AXE = getItemType("golden_axe");
    public static final ItemType GOLDEN_HOE = getItemType("golden_hoe");
    public static final ItemType IRON_SWORD = getItemType("iron_sword");
    public static final ItemType IRON_SHOVEL = getItemType("iron_shovel");
    public static final ItemType IRON_PICKAXE = getItemType("iron_pickaxe");
    public static final ItemType IRON_AXE = getItemType("iron_axe");
    public static final ItemType IRON_HOE = getItemType("iron_hoe");
    public static final ItemType DIAMOND_SWORD = getItemType("diamond_sword");
    public static final ItemType DIAMOND_SHOVEL = getItemType("diamond_shovel");
    public static final ItemType DIAMOND_PICKAXE = getItemType("diamond_pickaxe");
    public static final ItemType DIAMOND_AXE = getItemType("diamond_axe");
    public static final ItemType DIAMOND_HOE = getItemType("diamond_hoe");
    public static final ItemType NETHERITE_SWORD = getItemType("netherite_sword");
    public static final ItemType NETHERITE_SHOVEL = getItemType("netherite_shovel");
    public static final ItemType NETHERITE_PICKAXE = getItemType("netherite_pickaxe");
    public static final ItemType NETHERITE_AXE = getItemType("netherite_axe");
    public static final ItemType NETHERITE_HOE = getItemType("netherite_hoe");
    public static final ItemType STICK = getItemType("stick");
    public static final ItemType BOWL = getItemType("bowl");
    public static final ItemType MUSHROOM_STEW = getItemType("mushroom_stew");
    public static final ItemType STRING = getItemType("string");
    public static final ItemType FEATHER = getItemType("feather");
    public static final ItemType GUNPOWDER = getItemType("gunpowder");
    public static final ItemType WHEAT_SEEDS = getItemType("wheat_seeds");
    public static final ItemType WHEAT = getItemType("wheat");
    public static final ItemType BREAD = getItemType("bread");
    public static final ItemType LEATHER_HELMET = getItemType("leather_helmet");
    public static final ItemType LEATHER_CHESTPLATE = getItemType("leather_chestplate");
    public static final ItemType LEATHER_LEGGINGS = getItemType("leather_leggings");
    public static final ItemType LEATHER_BOOTS = getItemType("leather_boots");
    public static final ItemType CHAINMAIL_HELMET = getItemType("chainmail_helmet");
    public static final ItemType CHAINMAIL_CHESTPLATE = getItemType("chainmail_chestplate");
    public static final ItemType CHAINMAIL_LEGGINGS = getItemType("chainmail_leggings");
    public static final ItemType CHAINMAIL_BOOTS = getItemType("chainmail_boots");
    public static final ItemType IRON_HELMET = getItemType("iron_helmet");
    public static final ItemType IRON_CHESTPLATE = getItemType("iron_chestplate");
    public static final ItemType IRON_LEGGINGS = getItemType("iron_leggings");
    public static final ItemType IRON_BOOTS = getItemType("iron_boots");
    public static final ItemType DIAMOND_HELMET = getItemType("diamond_helmet");
    public static final ItemType DIAMOND_CHESTPLATE = getItemType("diamond_chestplate");
    public static final ItemType DIAMOND_LEGGINGS = getItemType("diamond_leggings");
    public static final ItemType DIAMOND_BOOTS = getItemType("diamond_boots");
    public static final ItemType GOLDEN_HELMET = getItemType("golden_helmet");
    public static final ItemType GOLDEN_CHESTPLATE = getItemType("golden_chestplate");
    public static final ItemType GOLDEN_LEGGINGS = getItemType("golden_leggings");
    public static final ItemType GOLDEN_BOOTS = getItemType("golden_boots");
    public static final ItemType NETHERITE_HELMET = getItemType("netherite_helmet");
    public static final ItemType NETHERITE_CHESTPLATE = getItemType("netherite_chestplate");
    public static final ItemType NETHERITE_LEGGINGS = getItemType("netherite_leggings");
    public static final ItemType NETHERITE_BOOTS = getItemType("netherite_boots");
    public static final ItemType FLINT = getItemType("flint");
    public static final ItemType PORKCHOP = getItemType("porkchop");
    public static final ItemType COOKED_PORKCHOP = getItemType("cooked_porkchop");
    public static final ItemType PAINTING = getItemType("painting");
    public static final ItemType GOLDEN_APPLE = getItemType("golden_apple");
    public static final ItemType ENCHANTED_GOLDEN_APPLE = getItemType("enchanted_golden_apple");
    public static final ItemType OAK_SIGN = getItemType("oak_sign");
    public static final ItemType SPRUCE_SIGN = getItemType("spruce_sign");
    public static final ItemType BIRCH_SIGN = getItemType("birch_sign");
    public static final ItemType JUNGLE_SIGN = getItemType("jungle_sign");
    public static final ItemType ACACIA_SIGN = getItemType("acacia_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_SIGN = getItemType("cherry_sign");
    public static final ItemType DARK_OAK_SIGN = getItemType("dark_oak_sign");
    public static final ItemType MANGROVE_SIGN = getItemType("mangrove_sign");
    public static final ItemType BAMBOO_SIGN = getItemType("bamboo_sign");
    public static final ItemType CRIMSON_SIGN = getItemType("crimson_sign");
    public static final ItemType WARPED_SIGN = getItemType("warped_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType OAK_HANGING_SIGN = getItemType("oak_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType SPRUCE_HANGING_SIGN = getItemType("spruce_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BIRCH_HANGING_SIGN = getItemType("birch_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType JUNGLE_HANGING_SIGN = getItemType("jungle_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType ACACIA_HANGING_SIGN = getItemType("acacia_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CHERRY_HANGING_SIGN = getItemType("cherry_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType DARK_OAK_HANGING_SIGN = getItemType("dark_oak_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType MANGROVE_HANGING_SIGN = getItemType("mangrove_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BAMBOO_HANGING_SIGN = getItemType("bamboo_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CRIMSON_HANGING_SIGN = getItemType("crimson_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType WARPED_HANGING_SIGN = getItemType("warped_hanging_sign");
    public static final ItemType BUCKET = getItemType("bucket");
    public static final ItemType WATER_BUCKET = getItemType("water_bucket");
    public static final ItemType LAVA_BUCKET = getItemType("lava_bucket");
    public static final ItemType POWDER_SNOW_BUCKET = getItemType("powder_snow_bucket");
    public static final ItemType SNOWBALL = getItemType("snowball");
    public static final ItemType LEATHER = getItemType("leather");
    public static final ItemType MILK_BUCKET = getItemType("milk_bucket");
    public static final ItemType PUFFERFISH_BUCKET = getItemType("pufferfish_bucket");
    public static final ItemType SALMON_BUCKET = getItemType("salmon_bucket");
    public static final ItemType COD_BUCKET = getItemType("cod_bucket");
    public static final ItemType TROPICAL_FISH_BUCKET = getItemType("tropical_fish_bucket");
    public static final ItemType AXOLOTL_BUCKET = getItemType("axolotl_bucket");
    public static final ItemType TADPOLE_BUCKET = getItemType("tadpole_bucket");
    public static final ItemType BRICK = getItemType("brick");
    public static final ItemType CLAY_BALL = getItemType("clay_ball");
    public static final ItemType DRIED_KELP_BLOCK = getItemType("dried_kelp_block");
    public static final ItemType PAPER = getItemType("paper");
    public static final ItemType BOOK = getItemType("book");
    public static final ItemType SLIME_BALL = getItemType("slime_ball");
    public static final ItemType EGG = getItemType("egg");
    public static final ItemType COMPASS = getItemType("compass");
    public static final ItemType RECOVERY_COMPASS = getItemType("recovery_compass");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BUNDLE = getItemType("bundle");
    public static final ItemType FISHING_ROD = getItemType("fishing_rod");
    public static final ItemType CLOCK = getItemType("clock");
    public static final ItemType SPYGLASS = getItemType("spyglass");
    public static final ItemType GLOWSTONE_DUST = getItemType("glowstone_dust");
    public static final ItemType COD = getItemType("cod");
    public static final ItemType SALMON = getItemType("salmon");
    public static final ItemType TROPICAL_FISH = getItemType("tropical_fish");
    public static final ItemType PUFFERFISH = getItemType("pufferfish");
    public static final ItemType COOKED_COD = getItemType("cooked_cod");
    public static final ItemType COOKED_SALMON = getItemType("cooked_salmon");
    public static final ItemType INK_SAC = getItemType("ink_sac");
    public static final ItemType GLOW_INK_SAC = getItemType("glow_ink_sac");
    public static final ItemType COCOA_BEANS = getItemType("cocoa_beans");
    public static final ItemType WHITE_DYE = getItemType("white_dye");
    public static final ItemType ORANGE_DYE = getItemType("orange_dye");
    public static final ItemType MAGENTA_DYE = getItemType("magenta_dye");
    public static final ItemType LIGHT_BLUE_DYE = getItemType("light_blue_dye");
    public static final ItemType YELLOW_DYE = getItemType("yellow_dye");
    public static final ItemType LIME_DYE = getItemType("lime_dye");
    public static final ItemType PINK_DYE = getItemType("pink_dye");
    public static final ItemType GRAY_DYE = getItemType("gray_dye");
    public static final ItemType LIGHT_GRAY_DYE = getItemType("light_gray_dye");
    public static final ItemType CYAN_DYE = getItemType("cyan_dye");
    public static final ItemType PURPLE_DYE = getItemType("purple_dye");
    public static final ItemType BLUE_DYE = getItemType("blue_dye");
    public static final ItemType BROWN_DYE = getItemType("brown_dye");
    public static final ItemType GREEN_DYE = getItemType("green_dye");
    public static final ItemType RED_DYE = getItemType("red_dye");
    public static final ItemType BLACK_DYE = getItemType("black_dye");
    public static final ItemType BONE_MEAL = getItemType("bone_meal");
    public static final ItemType BONE = getItemType("bone");
    public static final ItemType SUGAR = getItemType("sugar");
    public static final ItemType CAKE = getItemType("cake");
    public static final ItemType WHITE_BED = getItemType("white_bed");
    public static final ItemType ORANGE_BED = getItemType("orange_bed");
    public static final ItemType MAGENTA_BED = getItemType("magenta_bed");
    public static final ItemType LIGHT_BLUE_BED = getItemType("light_blue_bed");
    public static final ItemType YELLOW_BED = getItemType("yellow_bed");
    public static final ItemType LIME_BED = getItemType("lime_bed");
    public static final ItemType PINK_BED = getItemType("pink_bed");
    public static final ItemType GRAY_BED = getItemType("gray_bed");
    public static final ItemType LIGHT_GRAY_BED = getItemType("light_gray_bed");
    public static final ItemType CYAN_BED = getItemType("cyan_bed");
    public static final ItemType PURPLE_BED = getItemType("purple_bed");
    public static final ItemType BLUE_BED = getItemType("blue_bed");
    public static final ItemType BROWN_BED = getItemType("brown_bed");
    public static final ItemType GREEN_BED = getItemType("green_bed");
    public static final ItemType RED_BED = getItemType("red_bed");
    public static final ItemType BLACK_BED = getItemType("black_bed");
    public static final ItemType COOKIE = getItemType("cookie");
    public static final ItemType FILLED_MAP = getItemType("filled_map");
    public static final ItemType SHEARS = getItemType("shears");
    public static final ItemType MELON_SLICE = getItemType("melon_slice");
    public static final ItemType DRIED_KELP = getItemType("dried_kelp");
    public static final ItemType PUMPKIN_SEEDS = getItemType("pumpkin_seeds");
    public static final ItemType MELON_SEEDS = getItemType("melon_seeds");
    public static final ItemType BEEF = getItemType("beef");
    public static final ItemType COOKED_BEEF = getItemType("cooked_beef");
    public static final ItemType CHICKEN = getItemType("chicken");
    public static final ItemType COOKED_CHICKEN = getItemType("cooked_chicken");
    public static final ItemType ROTTEN_FLESH = getItemType("rotten_flesh");
    public static final ItemType ENDER_PEARL = getItemType("ender_pearl");
    public static final ItemType BLAZE_ROD = getItemType("blaze_rod");
    public static final ItemType GHAST_TEAR = getItemType("ghast_tear");
    public static final ItemType GOLD_NUGGET = getItemType("gold_nugget");
    public static final ItemType NETHER_WART = getItemType("nether_wart");
    public static final ItemType POTION = getItemType("potion");
    public static final ItemType GLASS_BOTTLE = getItemType("glass_bottle");
    public static final ItemType SPIDER_EYE = getItemType("spider_eye");
    public static final ItemType FERMENTED_SPIDER_EYE = getItemType("fermented_spider_eye");
    public static final ItemType BLAZE_POWDER = getItemType("blaze_powder");
    public static final ItemType MAGMA_CREAM = getItemType("magma_cream");
    public static final ItemType BREWING_STAND = getItemType("brewing_stand");
    public static final ItemType CAULDRON = getItemType("cauldron");
    public static final ItemType ENDER_EYE = getItemType("ender_eye");
    public static final ItemType GLISTERING_MELON_SLICE = getItemType("glistering_melon_slice");
    public static final ItemType ALLAY_SPAWN_EGG = getItemType("allay_spawn_egg");
    public static final ItemType AXOLOTL_SPAWN_EGG = getItemType("axolotl_spawn_egg");
    public static final ItemType BAT_SPAWN_EGG = getItemType("bat_spawn_egg");
    public static final ItemType BEE_SPAWN_EGG = getItemType("bee_spawn_egg");
    public static final ItemType BLAZE_SPAWN_EGG = getItemType("blaze_spawn_egg");
    public static final ItemType CAT_SPAWN_EGG = getItemType("cat_spawn_egg");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType CAMEL_SPAWN_EGG = getItemType("camel_spawn_egg");
    public static final ItemType CAVE_SPIDER_SPAWN_EGG = getItemType("cave_spider_spawn_egg");
    public static final ItemType CHICKEN_SPAWN_EGG = getItemType("chicken_spawn_egg");
    public static final ItemType COD_SPAWN_EGG = getItemType("cod_spawn_egg");
    public static final ItemType COW_SPAWN_EGG = getItemType("cow_spawn_egg");
    public static final ItemType CREEPER_SPAWN_EGG = getItemType("creeper_spawn_egg");
    public static final ItemType DOLPHIN_SPAWN_EGG = getItemType("dolphin_spawn_egg");
    public static final ItemType DONKEY_SPAWN_EGG = getItemType("donkey_spawn_egg");
    public static final ItemType DROWNED_SPAWN_EGG = getItemType("drowned_spawn_egg");
    public static final ItemType ELDER_GUARDIAN_SPAWN_EGG = getItemType("elder_guardian_spawn_egg");
    public static final ItemType ENDER_DRAGON_SPAWN_EGG = getItemType("ender_dragon_spawn_egg");
    public static final ItemType ENDERMAN_SPAWN_EGG = getItemType("enderman_spawn_egg");
    public static final ItemType ENDERMITE_SPAWN_EGG = getItemType("endermite_spawn_egg");
    public static final ItemType EVOKER_SPAWN_EGG = getItemType("evoker_spawn_egg");
    public static final ItemType FOX_SPAWN_EGG = getItemType("fox_spawn_egg");
    public static final ItemType FROG_SPAWN_EGG = getItemType("frog_spawn_egg");
    public static final ItemType GHAST_SPAWN_EGG = getItemType("ghast_spawn_egg");
    public static final ItemType GLOW_SQUID_SPAWN_EGG = getItemType("glow_squid_spawn_egg");
    public static final ItemType GOAT_SPAWN_EGG = getItemType("goat_spawn_egg");
    public static final ItemType GUARDIAN_SPAWN_EGG = getItemType("guardian_spawn_egg");
    public static final ItemType HOGLIN_SPAWN_EGG = getItemType("hoglin_spawn_egg");
    public static final ItemType HORSE_SPAWN_EGG = getItemType("horse_spawn_egg");
    public static final ItemType HUSK_SPAWN_EGG = getItemType("husk_spawn_egg");
    public static final ItemType IRON_GOLEM_SPAWN_EGG = getItemType("iron_golem_spawn_egg");
    public static final ItemType LLAMA_SPAWN_EGG = getItemType("llama_spawn_egg");
    public static final ItemType MAGMA_CUBE_SPAWN_EGG = getItemType("magma_cube_spawn_egg");
    public static final ItemType MOOSHROOM_SPAWN_EGG = getItemType("mooshroom_spawn_egg");
    public static final ItemType MULE_SPAWN_EGG = getItemType("mule_spawn_egg");
    public static final ItemType OCELOT_SPAWN_EGG = getItemType("ocelot_spawn_egg");
    public static final ItemType PANDA_SPAWN_EGG = getItemType("panda_spawn_egg");
    public static final ItemType PARROT_SPAWN_EGG = getItemType("parrot_spawn_egg");
    public static final ItemType PHANTOM_SPAWN_EGG = getItemType("phantom_spawn_egg");
    public static final ItemType PIG_SPAWN_EGG = getItemType("pig_spawn_egg");
    public static final ItemType PIGLIN_SPAWN_EGG = getItemType("piglin_spawn_egg");
    public static final ItemType PIGLIN_BRUTE_SPAWN_EGG = getItemType("piglin_brute_spawn_egg");
    public static final ItemType PILLAGER_SPAWN_EGG = getItemType("pillager_spawn_egg");
    public static final ItemType POLAR_BEAR_SPAWN_EGG = getItemType("polar_bear_spawn_egg");
    public static final ItemType PUFFERFISH_SPAWN_EGG = getItemType("pufferfish_spawn_egg");
    public static final ItemType RABBIT_SPAWN_EGG = getItemType("rabbit_spawn_egg");
    public static final ItemType RAVAGER_SPAWN_EGG = getItemType("ravager_spawn_egg");
    public static final ItemType SALMON_SPAWN_EGG = getItemType("salmon_spawn_egg");
    public static final ItemType SHEEP_SPAWN_EGG = getItemType("sheep_spawn_egg");
    public static final ItemType SHULKER_SPAWN_EGG = getItemType("shulker_spawn_egg");
    public static final ItemType SILVERFISH_SPAWN_EGG = getItemType("silverfish_spawn_egg");
    public static final ItemType SKELETON_SPAWN_EGG = getItemType("skeleton_spawn_egg");
    public static final ItemType SKELETON_HORSE_SPAWN_EGG = getItemType("skeleton_horse_spawn_egg");
    public static final ItemType SLIME_SPAWN_EGG = getItemType("slime_spawn_egg");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType SNIFFER_SPAWN_EGG = getItemType("sniffer_spawn_egg");
    public static final ItemType SNOW_GOLEM_SPAWN_EGG = getItemType("snow_golem_spawn_egg");
    public static final ItemType SPIDER_SPAWN_EGG = getItemType("spider_spawn_egg");
    public static final ItemType SQUID_SPAWN_EGG = getItemType("squid_spawn_egg");
    public static final ItemType STRAY_SPAWN_EGG = getItemType("stray_spawn_egg");
    public static final ItemType STRIDER_SPAWN_EGG = getItemType("strider_spawn_egg");
    public static final ItemType TADPOLE_SPAWN_EGG = getItemType("tadpole_spawn_egg");
    public static final ItemType TRADER_LLAMA_SPAWN_EGG = getItemType("trader_llama_spawn_egg");
    public static final ItemType TROPICAL_FISH_SPAWN_EGG = getItemType("tropical_fish_spawn_egg");
    public static final ItemType TURTLE_SPAWN_EGG = getItemType("turtle_spawn_egg");
    public static final ItemType VEX_SPAWN_EGG = getItemType("vex_spawn_egg");
    public static final ItemType VILLAGER_SPAWN_EGG = getItemType("villager_spawn_egg");
    public static final ItemType VINDICATOR_SPAWN_EGG = getItemType("vindicator_spawn_egg");
    public static final ItemType WANDERING_TRADER_SPAWN_EGG = getItemType("wandering_trader_spawn_egg");
    public static final ItemType WARDEN_SPAWN_EGG = getItemType("warden_spawn_egg");
    public static final ItemType WITCH_SPAWN_EGG = getItemType("witch_spawn_egg");
    public static final ItemType WITHER_SPAWN_EGG = getItemType("wither_spawn_egg");
    public static final ItemType WITHER_SKELETON_SPAWN_EGG = getItemType("wither_skeleton_spawn_egg");
    public static final ItemType WOLF_SPAWN_EGG = getItemType("wolf_spawn_egg");
    public static final ItemType ZOGLIN_SPAWN_EGG = getItemType("zoglin_spawn_egg");
    public static final ItemType ZOMBIE_SPAWN_EGG = getItemType("zombie_spawn_egg");
    public static final ItemType ZOMBIE_HORSE_SPAWN_EGG = getItemType("zombie_horse_spawn_egg");
    public static final ItemType ZOMBIE_VILLAGER_SPAWN_EGG = getItemType("zombie_villager_spawn_egg");
    public static final ItemType ZOMBIFIED_PIGLIN_SPAWN_EGG = getItemType("zombified_piglin_spawn_egg");
    public static final ItemType EXPERIENCE_BOTTLE = getItemType("experience_bottle");
    public static final ItemType FIRE_CHARGE = getItemType("fire_charge");
    public static final ItemType WRITABLE_BOOK = getItemType("writable_book");
    public static final ItemType WRITTEN_BOOK = getItemType("written_book");
    public static final ItemType ITEM_FRAME = getItemType("item_frame");
    public static final ItemType GLOW_ITEM_FRAME = getItemType("glow_item_frame");
    public static final ItemType FLOWER_POT = getItemType("flower_pot");
    public static final ItemType CARROT = getItemType("carrot");
    public static final ItemType POTATO = getItemType("potato");
    public static final ItemType BAKED_POTATO = getItemType("baked_potato");
    public static final ItemType POISONOUS_POTATO = getItemType("poisonous_potato");
    public static final ItemType MAP = getItemType("map");
    public static final ItemType GOLDEN_CARROT = getItemType("golden_carrot");
    public static final ItemType SKELETON_SKULL = getItemType("skeleton_skull");
    public static final ItemType WITHER_SKELETON_SKULL = getItemType("wither_skeleton_skull");
    public static final ItemType PLAYER_HEAD = getItemType("player_head");
    public static final ItemType ZOMBIE_HEAD = getItemType("zombie_head");
    public static final ItemType CREEPER_HEAD = getItemType("creeper_head");
    public static final ItemType DRAGON_HEAD = getItemType("dragon_head");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType PIGLIN_HEAD = getItemType("piglin_head");
    public static final ItemType NETHER_STAR = getItemType("nether_star");
    public static final ItemType PUMPKIN_PIE = getItemType("pumpkin_pie");
    public static final ItemType FIREWORK_ROCKET = getItemType("firework_rocket");
    public static final ItemType FIREWORK_STAR = getItemType("firework_star");
    public static final ItemType ENCHANTED_BOOK = getItemType("enchanted_book");
    public static final ItemType NETHER_BRICK = getItemType("nether_brick");
    public static final ItemType PRISMARINE_SHARD = getItemType("prismarine_shard");
    public static final ItemType PRISMARINE_CRYSTALS = getItemType("prismarine_crystals");
    public static final ItemType RABBIT = getItemType("rabbit");
    public static final ItemType COOKED_RABBIT = getItemType("cooked_rabbit");
    public static final ItemType RABBIT_STEW = getItemType("rabbit_stew");
    public static final ItemType RABBIT_FOOT = getItemType("rabbit_foot");
    public static final ItemType RABBIT_HIDE = getItemType("rabbit_hide");
    public static final ItemType ARMOR_STAND = getItemType("armor_stand");
    public static final ItemType IRON_HORSE_ARMOR = getItemType("iron_horse_armor");
    public static final ItemType GOLDEN_HORSE_ARMOR = getItemType("golden_horse_armor");
    public static final ItemType DIAMOND_HORSE_ARMOR = getItemType("diamond_horse_armor");
    public static final ItemType LEATHER_HORSE_ARMOR = getItemType("leather_horse_armor");
    public static final ItemType LEAD = getItemType("lead");
    public static final ItemType NAME_TAG = getItemType("name_tag");
    public static final ItemType COMMAND_BLOCK_MINECART = getItemType("command_block_minecart");
    public static final ItemType MUTTON = getItemType("mutton");
    public static final ItemType COOKED_MUTTON = getItemType("cooked_mutton");
    public static final ItemType WHITE_BANNER = getItemType("white_banner");
    public static final ItemType ORANGE_BANNER = getItemType("orange_banner");
    public static final ItemType MAGENTA_BANNER = getItemType("magenta_banner");
    public static final ItemType LIGHT_BLUE_BANNER = getItemType("light_blue_banner");
    public static final ItemType YELLOW_BANNER = getItemType("yellow_banner");
    public static final ItemType LIME_BANNER = getItemType("lime_banner");
    public static final ItemType PINK_BANNER = getItemType("pink_banner");
    public static final ItemType GRAY_BANNER = getItemType("gray_banner");
    public static final ItemType LIGHT_GRAY_BANNER = getItemType("light_gray_banner");
    public static final ItemType CYAN_BANNER = getItemType("cyan_banner");
    public static final ItemType PURPLE_BANNER = getItemType("purple_banner");
    public static final ItemType BLUE_BANNER = getItemType("blue_banner");
    public static final ItemType BROWN_BANNER = getItemType("brown_banner");
    public static final ItemType GREEN_BANNER = getItemType("green_banner");
    public static final ItemType RED_BANNER = getItemType("red_banner");
    public static final ItemType BLACK_BANNER = getItemType("black_banner");
    public static final ItemType END_CRYSTAL = getItemType("end_crystal");
    public static final ItemType CHORUS_FRUIT = getItemType("chorus_fruit");
    public static final ItemType POPPED_CHORUS_FRUIT = getItemType("popped_chorus_fruit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType TORCHFLOWER_SEEDS = getItemType("torchflower_seeds");
    public static final ItemType BEETROOT = getItemType("beetroot");
    public static final ItemType BEETROOT_SEEDS = getItemType("beetroot_seeds");
    public static final ItemType BEETROOT_SOUP = getItemType("beetroot_soup");
    public static final ItemType DRAGON_BREATH = getItemType("dragon_breath");
    public static final ItemType SPLASH_POTION = getItemType("splash_potion");
    public static final ItemType SPECTRAL_ARROW = getItemType("spectral_arrow");
    public static final ItemType TIPPED_ARROW = getItemType("tipped_arrow");
    public static final ItemType LINGERING_POTION = getItemType("lingering_potion");
    public static final ItemType SHIELD = getItemType("shield");
    public static final ItemType TOTEM_OF_UNDYING = getItemType("totem_of_undying");
    public static final ItemType SHULKER_SHELL = getItemType("shulker_shell");
    public static final ItemType IRON_NUGGET = getItemType("iron_nugget");
    public static final ItemType KNOWLEDGE_BOOK = getItemType("knowledge_book");
    public static final ItemType DEBUG_STICK = getItemType("debug_stick");
    public static final ItemType MUSIC_DISC_13 = getItemType("music_disc_13");
    public static final ItemType MUSIC_DISC_CAT = getItemType("music_disc_cat");
    public static final ItemType MUSIC_DISC_BLOCKS = getItemType("music_disc_blocks");
    public static final ItemType MUSIC_DISC_CHIRP = getItemType("music_disc_chirp");
    public static final ItemType MUSIC_DISC_FAR = getItemType("music_disc_far");
    public static final ItemType MUSIC_DISC_MALL = getItemType("music_disc_mall");
    public static final ItemType MUSIC_DISC_MELLOHI = getItemType("music_disc_mellohi");
    public static final ItemType MUSIC_DISC_STAL = getItemType("music_disc_stal");
    public static final ItemType MUSIC_DISC_STRAD = getItemType("music_disc_strad");
    public static final ItemType MUSIC_DISC_WARD = getItemType("music_disc_ward");
    public static final ItemType MUSIC_DISC_11 = getItemType("music_disc_11");
    public static final ItemType MUSIC_DISC_WAIT = getItemType("music_disc_wait");
    public static final ItemType MUSIC_DISC_OTHERSIDE = getItemType("music_disc_otherside");
    public static final ItemType MUSIC_DISC_5 = getItemType("music_disc_5");
    public static final ItemType MUSIC_DISC_PIGSTEP = getItemType("music_disc_pigstep");
    public static final ItemType DISC_FRAGMENT_5 = getItemType("disc_fragment_5");
    public static final ItemType TRIDENT = getItemType("trident");
    public static final ItemType PHANTOM_MEMBRANE = getItemType("phantom_membrane");
    public static final ItemType NAUTILUS_SHELL = getItemType("nautilus_shell");
    public static final ItemType HEART_OF_THE_SEA = getItemType("heart_of_the_sea");
    public static final ItemType CROSSBOW = getItemType("crossbow");
    public static final ItemType SUSPICIOUS_STEW = getItemType("suspicious_stew");
    public static final ItemType LOOM = getItemType("loom");
    public static final ItemType FLOWER_BANNER_PATTERN = getItemType("flower_banner_pattern");
    public static final ItemType CREEPER_BANNER_PATTERN = getItemType("creeper_banner_pattern");
    public static final ItemType SKULL_BANNER_PATTERN = getItemType("skull_banner_pattern");
    public static final ItemType MOJANG_BANNER_PATTERN = getItemType("mojang_banner_pattern");
    public static final ItemType GLOBE_BANNER_PATTERN = getItemType("globe_banner_pattern");
    public static final ItemType PIGLIN_BANNER_PATTERN = getItemType("piglin_banner_pattern");
    public static final ItemType GOAT_HORN = getItemType("goat_horn");
    public static final ItemType COMPOSTER = getItemType("composter");
    public static final ItemType BARREL = getItemType("barrel");
    public static final ItemType SMOKER = getItemType("smoker");
    public static final ItemType BLAST_FURNACE = getItemType("blast_furnace");
    public static final ItemType CARTOGRAPHY_TABLE = getItemType("cartography_table");
    public static final ItemType FLETCHING_TABLE = getItemType("fletching_table");
    public static final ItemType GRINDSTONE = getItemType("grindstone");
    public static final ItemType SMITHING_TABLE = getItemType("smithing_table");
    public static final ItemType STONECUTTER = getItemType("stonecutter");
    public static final ItemType BELL = getItemType("bell");
    public static final ItemType LANTERN = getItemType("lantern");
    public static final ItemType SOUL_LANTERN = getItemType("soul_lantern");
    public static final ItemType SWEET_BERRIES = getItemType("sweet_berries");
    public static final ItemType GLOW_BERRIES = getItemType("glow_berries");
    public static final ItemType CAMPFIRE = getItemType("campfire");
    public static final ItemType SOUL_CAMPFIRE = getItemType("soul_campfire");
    public static final ItemType SHROOMLIGHT = getItemType("shroomlight");
    public static final ItemType HONEYCOMB = getItemType("honeycomb");
    public static final ItemType BEE_NEST = getItemType("bee_nest");
    public static final ItemType BEEHIVE = getItemType("beehive");
    public static final ItemType HONEY_BOTTLE = getItemType("honey_bottle");
    public static final ItemType HONEYCOMB_BLOCK = getItemType("honeycomb_block");
    public static final ItemType LODESTONE = getItemType("lodestone");
    public static final ItemType CRYING_OBSIDIAN = getItemType("crying_obsidian");
    public static final ItemType BLACKSTONE = getItemType("blackstone");
    public static final ItemType BLACKSTONE_SLAB = getItemType("blackstone_slab");
    public static final ItemType BLACKSTONE_STAIRS = getItemType("blackstone_stairs");
    public static final ItemType GILDED_BLACKSTONE = getItemType("gilded_blackstone");
    public static final ItemType POLISHED_BLACKSTONE = getItemType("polished_blackstone");
    public static final ItemType POLISHED_BLACKSTONE_SLAB = getItemType("polished_blackstone_slab");
    public static final ItemType POLISHED_BLACKSTONE_STAIRS = getItemType("polished_blackstone_stairs");
    public static final ItemType CHISELED_POLISHED_BLACKSTONE = getItemType("chiseled_polished_blackstone");
    public static final ItemType POLISHED_BLACKSTONE_BRICKS = getItemType("polished_blackstone_bricks");
    public static final ItemType POLISHED_BLACKSTONE_BRICK_SLAB = getItemType("polished_blackstone_brick_slab");
    public static final ItemType POLISHED_BLACKSTONE_BRICK_STAIRS = getItemType("polished_blackstone_brick_stairs");
    public static final ItemType CRACKED_POLISHED_BLACKSTONE_BRICKS = getItemType("cracked_polished_blackstone_bricks");
    public static final ItemType RESPAWN_ANCHOR = getItemType("respawn_anchor");
    public static final ItemType CANDLE = getItemType("candle");
    public static final ItemType WHITE_CANDLE = getItemType("white_candle");
    public static final ItemType ORANGE_CANDLE = getItemType("orange_candle");
    public static final ItemType MAGENTA_CANDLE = getItemType("magenta_candle");
    public static final ItemType LIGHT_BLUE_CANDLE = getItemType("light_blue_candle");
    public static final ItemType YELLOW_CANDLE = getItemType("yellow_candle");
    public static final ItemType LIME_CANDLE = getItemType("lime_candle");
    public static final ItemType PINK_CANDLE = getItemType("pink_candle");
    public static final ItemType GRAY_CANDLE = getItemType("gray_candle");
    public static final ItemType LIGHT_GRAY_CANDLE = getItemType("light_gray_candle");
    public static final ItemType CYAN_CANDLE = getItemType("cyan_candle");
    public static final ItemType PURPLE_CANDLE = getItemType("purple_candle");
    public static final ItemType BLUE_CANDLE = getItemType("blue_candle");
    public static final ItemType BROWN_CANDLE = getItemType("brown_candle");
    public static final ItemType GREEN_CANDLE = getItemType("green_candle");
    public static final ItemType RED_CANDLE = getItemType("red_candle");
    public static final ItemType BLACK_CANDLE = getItemType("black_candle");
    public static final ItemType SMALL_AMETHYST_BUD = getItemType("small_amethyst_bud");
    public static final ItemType MEDIUM_AMETHYST_BUD = getItemType("medium_amethyst_bud");
    public static final ItemType LARGE_AMETHYST_BUD = getItemType("large_amethyst_bud");
    public static final ItemType AMETHYST_CLUSTER = getItemType("amethyst_cluster");
    public static final ItemType POINTED_DRIPSTONE = getItemType("pointed_dripstone");
    public static final ItemType OCHRE_FROGLIGHT = getItemType("ochre_froglight");
    public static final ItemType VERDANT_FROGLIGHT = getItemType("verdant_froglight");
    public static final ItemType PEARLESCENT_FROGLIGHT = getItemType("pearlescent_froglight");
    public static final ItemType FROGSPAWN = getItemType("frogspawn");
    public static final ItemType ECHO_SHARD = getItemType("echo_shard");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType BRUSH = getItemType("brush");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType NETHERITE_UPGRADE_SMITHING_TEMPLATE = getItemType("netherite_upgrade_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("sentry_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType DUNE_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("dune_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType COAST_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("coast_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType WILD_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("wild_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType WARD_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("ward_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType EYE_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("eye_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType VEX_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("vex_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType TIDE_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("tide_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("snout_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType RIB_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("rib_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("spire_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType POTTERY_SHARD_ARCHER = getItemType("pottery_shard_archer");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType POTTERY_SHARD_PRIZE = getItemType("pottery_shard_prize");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType POTTERY_SHARD_ARMS_UP = getItemType("pottery_shard_arms_up");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final ItemType POTTERY_SHARD_SKULL = getItemType("pottery_shard_skull");
    //</editor-fold>

    @NotNull
    private static ItemType getItemType(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        ItemType itemType = Registry.ITEM_TYPE.get(namespacedKey);
        Preconditions.checkNotNull(itemType, "No ItemType found for %s. This is a bug.", namespacedKey);
        return itemType;
    }

    /**
     * Returns true if this ItemType has a corresponding {@link BlockType}.
     * <p>
     * Where corresponding means, that they have the same {@link NamespacedKey}
     * returned by {@link #getKey()}.
     *
     * @return true if there is a BlockType with the same key, otherwise false
     * @see #getBlockType()
     */
    public abstract boolean hasBlockType();

    /**
     * Returns the corresponding {@link BlockType} for the given ItemType.
     * <p>
     * Where corresponding means, that they have the same {@link NamespacedKey}
     * returned by {@link #getKey()}.
     * <p>
     * If there is no corresponding {@link BlockType} an error will be thrown.
     *
     * @return the corresponding BlockType
     * @see #hasBlockType()
     */
    @NotNull
    public abstract BlockType<?> getBlockType();

    /**
     * Gets the maximum amount of this material that can be held in a stack
     *
     * @return Maximum stack size for this material
     */
    public abstract int getMaxStackSize();

    /**
     * Gets the maximum durability of this material
     *
     * @return Maximum durability for this material
     */
    public abstract short getMaxDurability();

    /**
     * Checks if this Material is edible.
     *
     * @return true if this Material is edible.
     */
    public abstract boolean isEdible();

    /**
     * @return True if this material represents a playable music disk.
     */
    public abstract boolean isRecord();

    /**
     * Checks if this Material can be used as fuel in a Furnace
     *
     * @return true if this Material can be used as fuel.
     */
    public abstract boolean isFuel();

    /**
     * Determines the remaining item in a crafting grid after crafting with this
     * ingredient.
     *
     * @return the item left behind when crafting, or null if nothing is.
     */
    @Nullable
    public abstract ItemType getCraftingRemainingItem();

    /**
     * Get the best suitable slot for this Material.
     *
     * For most items this will be {@link EquipmentSlot#HAND}.
     *
     * @return the best EquipmentSlot for this Material
     */
    @NotNull
    public abstract EquipmentSlot getEquipmentSlot();

    /**
     * Return an immutable copy of all default {@link Attribute}s and their
     * {@link AttributeModifier}s for a given {@link EquipmentSlot}.
     *
     * Default attributes are those that are always preset on some items, such
     * as the attack damage on weapons or the armor value on armor.
     *
     * @param slot the {@link EquipmentSlot} to check
     * @return the immutable {@link Multimap} with the respective default
     * Attributes and modifiers, or an empty map if no attributes are set.
     */
    @NotNull
    public abstract Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(@NotNull EquipmentSlot slot);

    /**
     * Get the {@link CreativeCategory} to which this material belongs.
     *
     * @return the creative category. null if does not belong to a category
     */
    @Nullable
    public abstract CreativeCategory getCreativeCategory();
}
