package org.bukkit;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multimap;
import java.util.function.Consumer;
import org.apache.commons.lang.Validate;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.block.BlockType;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.CreativeCategory;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemType;
import org.bukkit.material.MaterialData;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An interface of all material IDs accepted by the official server and client
 */
public interface Material extends Keyed, Comparable<Material> {
    //<editor-fold desc="Materials" defaultstate="collapsed">
    Material AIR = getMaterial("air");
    Material STONE = getMaterial("stone");
    Material GRANITE = getMaterial("granite");
    Material POLISHED_GRANITE = getMaterial("polished_granite");
    Material DIORITE = getMaterial("diorite");
    Material POLISHED_DIORITE = getMaterial("polished_diorite");
    Material ANDESITE = getMaterial("andesite");
    Material POLISHED_ANDESITE = getMaterial("polished_andesite");
    Material DEEPSLATE = getMaterial("deepslate");
    Material COBBLED_DEEPSLATE = getMaterial("cobbled_deepslate");
    Material POLISHED_DEEPSLATE = getMaterial("polished_deepslate");
    Material CALCITE = getMaterial("calcite");
    Material TUFF = getMaterial("tuff");
    Material DRIPSTONE_BLOCK = getMaterial("dripstone_block");
    Material GRASS_BLOCK = getMaterial("grass_block");
    Material DIRT = getMaterial("dirt");
    Material COARSE_DIRT = getMaterial("coarse_dirt");
    Material PODZOL = getMaterial("podzol");
    Material ROOTED_DIRT = getMaterial("rooted_dirt");
    Material CRIMSON_NYLIUM = getMaterial("crimson_nylium");
    Material WARPED_NYLIUM = getMaterial("warped_nylium");
    Material COBBLESTONE = getMaterial("cobblestone");
    Material OAK_PLANKS = getMaterial("oak_planks");
    Material SPRUCE_PLANKS = getMaterial("spruce_planks");
    Material BIRCH_PLANKS = getMaterial("birch_planks");
    Material JUNGLE_PLANKS = getMaterial("jungle_planks");
    Material ACACIA_PLANKS = getMaterial("acacia_planks");
    Material DARK_OAK_PLANKS = getMaterial("dark_oak_planks");
    Material CRIMSON_PLANKS = getMaterial("crimson_planks");
    Material WARPED_PLANKS = getMaterial("warped_planks");
    Material OAK_SAPLING = getMaterial("oak_sapling");
    Material SPRUCE_SAPLING = getMaterial("spruce_sapling");
    Material BIRCH_SAPLING = getMaterial("birch_sapling");
    Material JUNGLE_SAPLING = getMaterial("jungle_sapling");
    Material ACACIA_SAPLING = getMaterial("acacia_sapling");
    Material DARK_OAK_SAPLING = getMaterial("dark_oak_sapling");
    Material BEDROCK = getMaterial("bedrock");
    Material SAND = getMaterial("sand");
    Material RED_SAND = getMaterial("red_sand");
    Material GRAVEL = getMaterial("gravel");
    Material COAL_ORE = getMaterial("coal_ore");
    Material DEEPSLATE_COAL_ORE = getMaterial("deepslate_coal_ore");
    Material IRON_ORE = getMaterial("iron_ore");
    Material DEEPSLATE_IRON_ORE = getMaterial("deepslate_iron_ore");
    Material COPPER_ORE = getMaterial("copper_ore");
    Material DEEPSLATE_COPPER_ORE = getMaterial("deepslate_copper_ore");
    Material GOLD_ORE = getMaterial("gold_ore");
    Material DEEPSLATE_GOLD_ORE = getMaterial("deepslate_gold_ore");
    Material REDSTONE_ORE = getMaterial("redstone_ore");
    Material DEEPSLATE_REDSTONE_ORE = getMaterial("deepslate_redstone_ore");
    Material EMERALD_ORE = getMaterial("emerald_ore");
    Material DEEPSLATE_EMERALD_ORE = getMaterial("deepslate_emerald_ore");
    Material LAPIS_ORE = getMaterial("lapis_ore");
    Material DEEPSLATE_LAPIS_ORE = getMaterial("deepslate_lapis_ore");
    Material DIAMOND_ORE = getMaterial("diamond_ore");
    Material DEEPSLATE_DIAMOND_ORE = getMaterial("deepslate_diamond_ore");
    Material NETHER_GOLD_ORE = getMaterial("nether_gold_ore");
    Material NETHER_QUARTZ_ORE = getMaterial("nether_quartz_ore");
    Material ANCIENT_DEBRIS = getMaterial("ancient_debris");
    Material COAL_BLOCK = getMaterial("coal_block");
    Material RAW_IRON_BLOCK = getMaterial("raw_iron_block");
    Material RAW_COPPER_BLOCK = getMaterial("raw_copper_block");
    Material RAW_GOLD_BLOCK = getMaterial("raw_gold_block");
    Material AMETHYST_BLOCK = getMaterial("amethyst_block");
    Material BUDDING_AMETHYST = getMaterial("budding_amethyst");
    Material IRON_BLOCK = getMaterial("iron_block");
    Material COPPER_BLOCK = getMaterial("copper_block");
    Material GOLD_BLOCK = getMaterial("gold_block");
    Material DIAMOND_BLOCK = getMaterial("diamond_block");
    Material NETHERITE_BLOCK = getMaterial("netherite_block");
    Material EXPOSED_COPPER = getMaterial("exposed_copper");
    Material WEATHERED_COPPER = getMaterial("weathered_copper");
    Material OXIDIZED_COPPER = getMaterial("oxidized_copper");
    Material CUT_COPPER = getMaterial("cut_copper");
    Material EXPOSED_CUT_COPPER = getMaterial("exposed_cut_copper");
    Material WEATHERED_CUT_COPPER = getMaterial("weathered_cut_copper");
    Material OXIDIZED_CUT_COPPER = getMaterial("oxidized_cut_copper");
    Material CUT_COPPER_STAIRS = getMaterial("cut_copper_stairs");
    Material EXPOSED_CUT_COPPER_STAIRS = getMaterial("exposed_cut_copper_stairs");
    Material WEATHERED_CUT_COPPER_STAIRS = getMaterial("weathered_cut_copper_stairs");
    Material OXIDIZED_CUT_COPPER_STAIRS = getMaterial("oxidized_cut_copper_stairs");
    Material CUT_COPPER_SLAB = getMaterial("cut_copper_slab");
    Material EXPOSED_CUT_COPPER_SLAB = getMaterial("exposed_cut_copper_slab");
    Material WEATHERED_CUT_COPPER_SLAB = getMaterial("weathered_cut_copper_slab");
    Material OXIDIZED_CUT_COPPER_SLAB = getMaterial("oxidized_cut_copper_slab");
    Material WAXED_COPPER_BLOCK = getMaterial("waxed_copper_block");
    Material WAXED_EXPOSED_COPPER = getMaterial("waxed_exposed_copper");
    Material WAXED_WEATHERED_COPPER = getMaterial("waxed_weathered_copper");
    Material WAXED_OXIDIZED_COPPER = getMaterial("waxed_oxidized_copper");
    Material WAXED_CUT_COPPER = getMaterial("waxed_cut_copper");
    Material WAXED_EXPOSED_CUT_COPPER = getMaterial("waxed_exposed_cut_copper");
    Material WAXED_WEATHERED_CUT_COPPER = getMaterial("waxed_weathered_cut_copper");
    Material WAXED_OXIDIZED_CUT_COPPER = getMaterial("waxed_oxidized_cut_copper");
    Material WAXED_CUT_COPPER_STAIRS = getMaterial("waxed_cut_copper_stairs");
    Material WAXED_EXPOSED_CUT_COPPER_STAIRS = getMaterial("waxed_exposed_cut_copper_stairs");
    Material WAXED_WEATHERED_CUT_COPPER_STAIRS = getMaterial("waxed_weathered_cut_copper_stairs");
    Material WAXED_OXIDIZED_CUT_COPPER_STAIRS = getMaterial("waxed_oxidized_cut_copper_stairs");
    Material WAXED_CUT_COPPER_SLAB = getMaterial("waxed_cut_copper_slab");
    Material WAXED_EXPOSED_CUT_COPPER_SLAB = getMaterial("waxed_exposed_cut_copper_slab");
    Material WAXED_WEATHERED_CUT_COPPER_SLAB = getMaterial("waxed_weathered_cut_copper_slab");
    Material WAXED_OXIDIZED_CUT_COPPER_SLAB = getMaterial("waxed_oxidized_cut_copper_slab");
    Material OAK_LOG = getMaterial("oak_log");
    Material SPRUCE_LOG = getMaterial("spruce_log");
    Material BIRCH_LOG = getMaterial("birch_log");
    Material JUNGLE_LOG = getMaterial("jungle_log");
    Material ACACIA_LOG = getMaterial("acacia_log");
    Material DARK_OAK_LOG = getMaterial("dark_oak_log");
    Material CRIMSON_STEM = getMaterial("crimson_stem");
    Material WARPED_STEM = getMaterial("warped_stem");
    Material STRIPPED_OAK_LOG = getMaterial("stripped_oak_log");
    Material STRIPPED_SPRUCE_LOG = getMaterial("stripped_spruce_log");
    Material STRIPPED_BIRCH_LOG = getMaterial("stripped_birch_log");
    Material STRIPPED_JUNGLE_LOG = getMaterial("stripped_jungle_log");
    Material STRIPPED_ACACIA_LOG = getMaterial("stripped_acacia_log");
    Material STRIPPED_DARK_OAK_LOG = getMaterial("stripped_dark_oak_log");
    Material STRIPPED_CRIMSON_STEM = getMaterial("stripped_crimson_stem");
    Material STRIPPED_WARPED_STEM = getMaterial("stripped_warped_stem");
    Material STRIPPED_OAK_WOOD = getMaterial("stripped_oak_wood");
    Material STRIPPED_SPRUCE_WOOD = getMaterial("stripped_spruce_wood");
    Material STRIPPED_BIRCH_WOOD = getMaterial("stripped_birch_wood");
    Material STRIPPED_JUNGLE_WOOD = getMaterial("stripped_jungle_wood");
    Material STRIPPED_ACACIA_WOOD = getMaterial("stripped_acacia_wood");
    Material STRIPPED_DARK_OAK_WOOD = getMaterial("stripped_dark_oak_wood");
    Material STRIPPED_CRIMSON_HYPHAE = getMaterial("stripped_crimson_hyphae");
    Material STRIPPED_WARPED_HYPHAE = getMaterial("stripped_warped_hyphae");
    Material OAK_WOOD = getMaterial("oak_wood");
    Material SPRUCE_WOOD = getMaterial("spruce_wood");
    Material BIRCH_WOOD = getMaterial("birch_wood");
    Material JUNGLE_WOOD = getMaterial("jungle_wood");
    Material ACACIA_WOOD = getMaterial("acacia_wood");
    Material DARK_OAK_WOOD = getMaterial("dark_oak_wood");
    Material CRIMSON_HYPHAE = getMaterial("crimson_hyphae");
    Material WARPED_HYPHAE = getMaterial("warped_hyphae");
    Material OAK_LEAVES = getMaterial("oak_leaves");
    Material SPRUCE_LEAVES = getMaterial("spruce_leaves");
    Material BIRCH_LEAVES = getMaterial("birch_leaves");
    Material JUNGLE_LEAVES = getMaterial("jungle_leaves");
    Material ACACIA_LEAVES = getMaterial("acacia_leaves");
    Material DARK_OAK_LEAVES = getMaterial("dark_oak_leaves");
    Material AZALEA_LEAVES = getMaterial("azalea_leaves");
    Material FLOWERING_AZALEA_LEAVES = getMaterial("flowering_azalea_leaves");
    Material SPONGE = getMaterial("sponge");
    Material WET_SPONGE = getMaterial("wet_sponge");
    Material GLASS = getMaterial("glass");
    Material TINTED_GLASS = getMaterial("tinted_glass");
    Material LAPIS_BLOCK = getMaterial("lapis_block");
    Material SANDSTONE = getMaterial("sandstone");
    Material CHISELED_SANDSTONE = getMaterial("chiseled_sandstone");
    Material CUT_SANDSTONE = getMaterial("cut_sandstone");
    Material COBWEB = getMaterial("cobweb");
    Material GRASS = getMaterial("grass");
    Material FERN = getMaterial("fern");
    Material AZALEA = getMaterial("azalea");
    Material FLOWERING_AZALEA = getMaterial("flowering_azalea");
    Material DEAD_BUSH = getMaterial("dead_bush");
    Material SEAGRASS = getMaterial("seagrass");
    Material SEA_PICKLE = getMaterial("sea_pickle");
    Material WHITE_WOOL = getMaterial("white_wool");
    Material ORANGE_WOOL = getMaterial("orange_wool");
    Material MAGENTA_WOOL = getMaterial("magenta_wool");
    Material LIGHT_BLUE_WOOL = getMaterial("light_blue_wool");
    Material YELLOW_WOOL = getMaterial("yellow_wool");
    Material LIME_WOOL = getMaterial("lime_wool");
    Material PINK_WOOL = getMaterial("pink_wool");
    Material GRAY_WOOL = getMaterial("gray_wool");
    Material LIGHT_GRAY_WOOL = getMaterial("light_gray_wool");
    Material CYAN_WOOL = getMaterial("cyan_wool");
    Material PURPLE_WOOL = getMaterial("purple_wool");
    Material BLUE_WOOL = getMaterial("blue_wool");
    Material BROWN_WOOL = getMaterial("brown_wool");
    Material GREEN_WOOL = getMaterial("green_wool");
    Material RED_WOOL = getMaterial("red_wool");
    Material BLACK_WOOL = getMaterial("black_wool");
    Material DANDELION = getMaterial("dandelion");
    Material POPPY = getMaterial("poppy");
    Material BLUE_ORCHID = getMaterial("blue_orchid");
    Material ALLIUM = getMaterial("allium");
    Material AZURE_BLUET = getMaterial("azure_bluet");
    Material RED_TULIP = getMaterial("red_tulip");
    Material ORANGE_TULIP = getMaterial("orange_tulip");
    Material WHITE_TULIP = getMaterial("white_tulip");
    Material PINK_TULIP = getMaterial("pink_tulip");
    Material OXEYE_DAISY = getMaterial("oxeye_daisy");
    Material CORNFLOWER = getMaterial("cornflower");
    Material LILY_OF_THE_VALLEY = getMaterial("lily_of_the_valley");
    Material WITHER_ROSE = getMaterial("wither_rose");
    Material SPORE_BLOSSOM = getMaterial("spore_blossom");
    Material BROWN_MUSHROOM = getMaterial("brown_mushroom");
    Material RED_MUSHROOM = getMaterial("red_mushroom");
    Material CRIMSON_FUNGUS = getMaterial("crimson_fungus");
    Material WARPED_FUNGUS = getMaterial("warped_fungus");
    Material CRIMSON_ROOTS = getMaterial("crimson_roots");
    Material WARPED_ROOTS = getMaterial("warped_roots");
    Material NETHER_SPROUTS = getMaterial("nether_sprouts");
    Material WEEPING_VINES = getMaterial("weeping_vines");
    Material TWISTING_VINES = getMaterial("twisting_vines");
    Material SUGAR_CANE = getMaterial("sugar_cane");
    Material KELP = getMaterial("kelp");
    Material MOSS_CARPET = getMaterial("moss_carpet");
    Material MOSS_BLOCK = getMaterial("moss_block");
    Material HANGING_ROOTS = getMaterial("hanging_roots");
    Material BIG_DRIPLEAF = getMaterial("big_dripleaf");
    Material SMALL_DRIPLEAF = getMaterial("small_dripleaf");
    Material BAMBOO = getMaterial("bamboo");
    Material OAK_SLAB = getMaterial("oak_slab");
    Material SPRUCE_SLAB = getMaterial("spruce_slab");
    Material BIRCH_SLAB = getMaterial("birch_slab");
    Material JUNGLE_SLAB = getMaterial("jungle_slab");
    Material ACACIA_SLAB = getMaterial("acacia_slab");
    Material DARK_OAK_SLAB = getMaterial("dark_oak_slab");
    Material CRIMSON_SLAB = getMaterial("crimson_slab");
    Material WARPED_SLAB = getMaterial("warped_slab");
    Material STONE_SLAB = getMaterial("stone_slab");
    Material SMOOTH_STONE_SLAB = getMaterial("smooth_stone_slab");
    Material SANDSTONE_SLAB = getMaterial("sandstone_slab");
    Material CUT_SANDSTONE_SLAB = getMaterial("cut_sandstone_slab");
    Material PETRIFIED_OAK_SLAB = getMaterial("petrified_oak_slab");
    Material COBBLESTONE_SLAB = getMaterial("cobblestone_slab");
    Material BRICK_SLAB = getMaterial("brick_slab");
    Material STONE_BRICK_SLAB = getMaterial("stone_brick_slab");
    Material NETHER_BRICK_SLAB = getMaterial("nether_brick_slab");
    Material QUARTZ_SLAB = getMaterial("quartz_slab");
    Material RED_SANDSTONE_SLAB = getMaterial("red_sandstone_slab");
    Material CUT_RED_SANDSTONE_SLAB = getMaterial("cut_red_sandstone_slab");
    Material PURPUR_SLAB = getMaterial("purpur_slab");
    Material PRISMARINE_SLAB = getMaterial("prismarine_slab");
    Material PRISMARINE_BRICK_SLAB = getMaterial("prismarine_brick_slab");
    Material DARK_PRISMARINE_SLAB = getMaterial("dark_prismarine_slab");
    Material SMOOTH_QUARTZ = getMaterial("smooth_quartz");
    Material SMOOTH_RED_SANDSTONE = getMaterial("smooth_red_sandstone");
    Material SMOOTH_SANDSTONE = getMaterial("smooth_sandstone");
    Material SMOOTH_STONE = getMaterial("smooth_stone");
    Material BRICKS = getMaterial("bricks");
    Material BOOKSHELF = getMaterial("bookshelf");
    Material MOSSY_COBBLESTONE = getMaterial("mossy_cobblestone");
    Material OBSIDIAN = getMaterial("obsidian");
    Material TORCH = getMaterial("torch");
    Material END_ROD = getMaterial("end_rod");
    Material CHORUS_PLANT = getMaterial("chorus_plant");
    Material CHORUS_FLOWER = getMaterial("chorus_flower");
    Material PURPUR_BLOCK = getMaterial("purpur_block");
    Material PURPUR_PILLAR = getMaterial("purpur_pillar");
    Material PURPUR_STAIRS = getMaterial("purpur_stairs");
    Material SPAWNER = getMaterial("spawner");
    Material OAK_STAIRS = getMaterial("oak_stairs");
    Material CHEST = getMaterial("chest");
    Material CRAFTING_TABLE = getMaterial("crafting_table");
    Material FARMLAND = getMaterial("farmland");
    Material FURNACE = getMaterial("furnace");
    Material LADDER = getMaterial("ladder");
    Material COBBLESTONE_STAIRS = getMaterial("cobblestone_stairs");
    Material SNOW = getMaterial("snow");
    Material ICE = getMaterial("ice");
    Material SNOW_BLOCK = getMaterial("snow_block");
    Material CACTUS = getMaterial("cactus");
    Material CLAY = getMaterial("clay");
    Material JUKEBOX = getMaterial("jukebox");
    Material OAK_FENCE = getMaterial("oak_fence");
    Material SPRUCE_FENCE = getMaterial("spruce_fence");
    Material BIRCH_FENCE = getMaterial("birch_fence");
    Material JUNGLE_FENCE = getMaterial("jungle_fence");
    Material ACACIA_FENCE = getMaterial("acacia_fence");
    Material DARK_OAK_FENCE = getMaterial("dark_oak_fence");
    Material CRIMSON_FENCE = getMaterial("crimson_fence");
    Material WARPED_FENCE = getMaterial("warped_fence");
    Material PUMPKIN = getMaterial("pumpkin");
    Material CARVED_PUMPKIN = getMaterial("carved_pumpkin");
    Material JACK_O_LANTERN = getMaterial("jack_o_lantern");
    Material NETHERRACK = getMaterial("netherrack");
    Material SOUL_SAND = getMaterial("soul_sand");
    Material SOUL_SOIL = getMaterial("soul_soil");
    Material BASALT = getMaterial("basalt");
    Material POLISHED_BASALT = getMaterial("polished_basalt");
    Material SMOOTH_BASALT = getMaterial("smooth_basalt");
    Material SOUL_TORCH = getMaterial("soul_torch");
    Material GLOWSTONE = getMaterial("glowstone");
    Material INFESTED_STONE = getMaterial("infested_stone");
    Material INFESTED_COBBLESTONE = getMaterial("infested_cobblestone");
    Material INFESTED_STONE_BRICKS = getMaterial("infested_stone_bricks");
    Material INFESTED_MOSSY_STONE_BRICKS = getMaterial("infested_mossy_stone_bricks");
    Material INFESTED_CRACKED_STONE_BRICKS = getMaterial("infested_cracked_stone_bricks");
    Material INFESTED_CHISELED_STONE_BRICKS = getMaterial("infested_chiseled_stone_bricks");
    Material INFESTED_DEEPSLATE = getMaterial("infested_deepslate");
    Material STONE_BRICKS = getMaterial("stone_bricks");
    Material MOSSY_STONE_BRICKS = getMaterial("mossy_stone_bricks");
    Material CRACKED_STONE_BRICKS = getMaterial("cracked_stone_bricks");
    Material CHISELED_STONE_BRICKS = getMaterial("chiseled_stone_bricks");
    Material DEEPSLATE_BRICKS = getMaterial("deepslate_bricks");
    Material CRACKED_DEEPSLATE_BRICKS = getMaterial("cracked_deepslate_bricks");
    Material DEEPSLATE_TILES = getMaterial("deepslate_tiles");
    Material CRACKED_DEEPSLATE_TILES = getMaterial("cracked_deepslate_tiles");
    Material CHISELED_DEEPSLATE = getMaterial("chiseled_deepslate");
    Material BROWN_MUSHROOM_BLOCK = getMaterial("brown_mushroom_block");
    Material RED_MUSHROOM_BLOCK = getMaterial("red_mushroom_block");
    Material MUSHROOM_STEM = getMaterial("mushroom_stem");
    Material IRON_BARS = getMaterial("iron_bars");
    Material CHAIN = getMaterial("chain");
    Material GLASS_PANE = getMaterial("glass_pane");
    Material MELON = getMaterial("melon");
    Material VINE = getMaterial("vine");
    Material GLOW_LICHEN = getMaterial("glow_lichen");
    Material BRICK_STAIRS = getMaterial("brick_stairs");
    Material STONE_BRICK_STAIRS = getMaterial("stone_brick_stairs");
    Material MYCELIUM = getMaterial("mycelium");
    Material LILY_PAD = getMaterial("lily_pad");
    Material NETHER_BRICKS = getMaterial("nether_bricks");
    Material CRACKED_NETHER_BRICKS = getMaterial("cracked_nether_bricks");
    Material CHISELED_NETHER_BRICKS = getMaterial("chiseled_nether_bricks");
    Material NETHER_BRICK_FENCE = getMaterial("nether_brick_fence");
    Material NETHER_BRICK_STAIRS = getMaterial("nether_brick_stairs");
    Material ENCHANTING_TABLE = getMaterial("enchanting_table");
    Material END_PORTAL_FRAME = getMaterial("end_portal_frame");
    Material END_STONE = getMaterial("end_stone");
    Material END_STONE_BRICKS = getMaterial("end_stone_bricks");
    Material DRAGON_EGG = getMaterial("dragon_egg");
    Material SANDSTONE_STAIRS = getMaterial("sandstone_stairs");
    Material ENDER_CHEST = getMaterial("ender_chest");
    Material EMERALD_BLOCK = getMaterial("emerald_block");
    Material SPRUCE_STAIRS = getMaterial("spruce_stairs");
    Material BIRCH_STAIRS = getMaterial("birch_stairs");
    Material JUNGLE_STAIRS = getMaterial("jungle_stairs");
    Material CRIMSON_STAIRS = getMaterial("crimson_stairs");
    Material WARPED_STAIRS = getMaterial("warped_stairs");
    Material COMMAND_BLOCK = getMaterial("command_block");
    Material BEACON = getMaterial("beacon");
    Material COBBLESTONE_WALL = getMaterial("cobblestone_wall");
    Material MOSSY_COBBLESTONE_WALL = getMaterial("mossy_cobblestone_wall");
    Material BRICK_WALL = getMaterial("brick_wall");
    Material PRISMARINE_WALL = getMaterial("prismarine_wall");
    Material RED_SANDSTONE_WALL = getMaterial("red_sandstone_wall");
    Material MOSSY_STONE_BRICK_WALL = getMaterial("mossy_stone_brick_wall");
    Material GRANITE_WALL = getMaterial("granite_wall");
    Material STONE_BRICK_WALL = getMaterial("stone_brick_wall");
    Material NETHER_BRICK_WALL = getMaterial("nether_brick_wall");
    Material ANDESITE_WALL = getMaterial("andesite_wall");
    Material RED_NETHER_BRICK_WALL = getMaterial("red_nether_brick_wall");
    Material SANDSTONE_WALL = getMaterial("sandstone_wall");
    Material END_STONE_BRICK_WALL = getMaterial("end_stone_brick_wall");
    Material DIORITE_WALL = getMaterial("diorite_wall");
    Material BLACKSTONE_WALL = getMaterial("blackstone_wall");
    Material POLISHED_BLACKSTONE_WALL = getMaterial("polished_blackstone_wall");
    Material POLISHED_BLACKSTONE_BRICK_WALL = getMaterial("polished_blackstone_brick_wall");
    Material COBBLED_DEEPSLATE_WALL = getMaterial("cobbled_deepslate_wall");
    Material POLISHED_DEEPSLATE_WALL = getMaterial("polished_deepslate_wall");
    Material DEEPSLATE_BRICK_WALL = getMaterial("deepslate_brick_wall");
    Material DEEPSLATE_TILE_WALL = getMaterial("deepslate_tile_wall");
    Material ANVIL = getMaterial("anvil");
    Material CHIPPED_ANVIL = getMaterial("chipped_anvil");
    Material DAMAGED_ANVIL = getMaterial("damaged_anvil");
    Material CHISELED_QUARTZ_BLOCK = getMaterial("chiseled_quartz_block");
    Material QUARTZ_BLOCK = getMaterial("quartz_block");
    Material QUARTZ_BRICKS = getMaterial("quartz_bricks");
    Material QUARTZ_PILLAR = getMaterial("quartz_pillar");
    Material QUARTZ_STAIRS = getMaterial("quartz_stairs");
    Material WHITE_TERRACOTTA = getMaterial("white_terracotta");
    Material ORANGE_TERRACOTTA = getMaterial("orange_terracotta");
    Material MAGENTA_TERRACOTTA = getMaterial("magenta_terracotta");
    Material LIGHT_BLUE_TERRACOTTA = getMaterial("light_blue_terracotta");
    Material YELLOW_TERRACOTTA = getMaterial("yellow_terracotta");
    Material LIME_TERRACOTTA = getMaterial("lime_terracotta");
    Material PINK_TERRACOTTA = getMaterial("pink_terracotta");
    Material GRAY_TERRACOTTA = getMaterial("gray_terracotta");
    Material LIGHT_GRAY_TERRACOTTA = getMaterial("light_gray_terracotta");
    Material CYAN_TERRACOTTA = getMaterial("cyan_terracotta");
    Material PURPLE_TERRACOTTA = getMaterial("purple_terracotta");
    Material BLUE_TERRACOTTA = getMaterial("blue_terracotta");
    Material BROWN_TERRACOTTA = getMaterial("brown_terracotta");
    Material GREEN_TERRACOTTA = getMaterial("green_terracotta");
    Material RED_TERRACOTTA = getMaterial("red_terracotta");
    Material BLACK_TERRACOTTA = getMaterial("black_terracotta");
    Material BARRIER = getMaterial("barrier");
    Material LIGHT = getMaterial("light");
    Material HAY_BLOCK = getMaterial("hay_block");
    Material WHITE_CARPET = getMaterial("white_carpet");
    Material ORANGE_CARPET = getMaterial("orange_carpet");
    Material MAGENTA_CARPET = getMaterial("magenta_carpet");
    Material LIGHT_BLUE_CARPET = getMaterial("light_blue_carpet");
    Material YELLOW_CARPET = getMaterial("yellow_carpet");
    Material LIME_CARPET = getMaterial("lime_carpet");
    Material PINK_CARPET = getMaterial("pink_carpet");
    Material GRAY_CARPET = getMaterial("gray_carpet");
    Material LIGHT_GRAY_CARPET = getMaterial("light_gray_carpet");
    Material CYAN_CARPET = getMaterial("cyan_carpet");
    Material PURPLE_CARPET = getMaterial("purple_carpet");
    Material BLUE_CARPET = getMaterial("blue_carpet");
    Material BROWN_CARPET = getMaterial("brown_carpet");
    Material GREEN_CARPET = getMaterial("green_carpet");
    Material RED_CARPET = getMaterial("red_carpet");
    Material BLACK_CARPET = getMaterial("black_carpet");
    Material TERRACOTTA = getMaterial("terracotta");
    Material PACKED_ICE = getMaterial("packed_ice");
    Material ACACIA_STAIRS = getMaterial("acacia_stairs");
    Material DARK_OAK_STAIRS = getMaterial("dark_oak_stairs");
    Material DIRT_PATH = getMaterial("dirt_path");
    Material SUNFLOWER = getMaterial("sunflower");
    Material LILAC = getMaterial("lilac");
    Material ROSE_BUSH = getMaterial("rose_bush");
    Material PEONY = getMaterial("peony");
    Material TALL_GRASS = getMaterial("tall_grass");
    Material LARGE_FERN = getMaterial("large_fern");
    Material WHITE_STAINED_GLASS = getMaterial("white_stained_glass");
    Material ORANGE_STAINED_GLASS = getMaterial("orange_stained_glass");
    Material MAGENTA_STAINED_GLASS = getMaterial("magenta_stained_glass");
    Material LIGHT_BLUE_STAINED_GLASS = getMaterial("light_blue_stained_glass");
    Material YELLOW_STAINED_GLASS = getMaterial("yellow_stained_glass");
    Material LIME_STAINED_GLASS = getMaterial("lime_stained_glass");
    Material PINK_STAINED_GLASS = getMaterial("pink_stained_glass");
    Material GRAY_STAINED_GLASS = getMaterial("gray_stained_glass");
    Material LIGHT_GRAY_STAINED_GLASS = getMaterial("light_gray_stained_glass");
    Material CYAN_STAINED_GLASS = getMaterial("cyan_stained_glass");
    Material PURPLE_STAINED_GLASS = getMaterial("purple_stained_glass");
    Material BLUE_STAINED_GLASS = getMaterial("blue_stained_glass");
    Material BROWN_STAINED_GLASS = getMaterial("brown_stained_glass");
    Material GREEN_STAINED_GLASS = getMaterial("green_stained_glass");
    Material RED_STAINED_GLASS = getMaterial("red_stained_glass");
    Material BLACK_STAINED_GLASS = getMaterial("black_stained_glass");
    Material WHITE_STAINED_GLASS_PANE = getMaterial("white_stained_glass_pane");
    Material ORANGE_STAINED_GLASS_PANE = getMaterial("orange_stained_glass_pane");
    Material MAGENTA_STAINED_GLASS_PANE = getMaterial("magenta_stained_glass_pane");
    Material LIGHT_BLUE_STAINED_GLASS_PANE = getMaterial("light_blue_stained_glass_pane");
    Material YELLOW_STAINED_GLASS_PANE = getMaterial("yellow_stained_glass_pane");
    Material LIME_STAINED_GLASS_PANE = getMaterial("lime_stained_glass_pane");
    Material PINK_STAINED_GLASS_PANE = getMaterial("pink_stained_glass_pane");
    Material GRAY_STAINED_GLASS_PANE = getMaterial("gray_stained_glass_pane");
    Material LIGHT_GRAY_STAINED_GLASS_PANE = getMaterial("light_gray_stained_glass_pane");
    Material CYAN_STAINED_GLASS_PANE = getMaterial("cyan_stained_glass_pane");
    Material PURPLE_STAINED_GLASS_PANE = getMaterial("purple_stained_glass_pane");
    Material BLUE_STAINED_GLASS_PANE = getMaterial("blue_stained_glass_pane");
    Material BROWN_STAINED_GLASS_PANE = getMaterial("brown_stained_glass_pane");
    Material GREEN_STAINED_GLASS_PANE = getMaterial("green_stained_glass_pane");
    Material RED_STAINED_GLASS_PANE = getMaterial("red_stained_glass_pane");
    Material BLACK_STAINED_GLASS_PANE = getMaterial("black_stained_glass_pane");
    Material PRISMARINE = getMaterial("prismarine");
    Material PRISMARINE_BRICKS = getMaterial("prismarine_bricks");
    Material DARK_PRISMARINE = getMaterial("dark_prismarine");
    Material PRISMARINE_STAIRS = getMaterial("prismarine_stairs");
    Material PRISMARINE_BRICK_STAIRS = getMaterial("prismarine_brick_stairs");
    Material DARK_PRISMARINE_STAIRS = getMaterial("dark_prismarine_stairs");
    Material SEA_LANTERN = getMaterial("sea_lantern");
    Material RED_SANDSTONE = getMaterial("red_sandstone");
    Material CHISELED_RED_SANDSTONE = getMaterial("chiseled_red_sandstone");
    Material CUT_RED_SANDSTONE = getMaterial("cut_red_sandstone");
    Material RED_SANDSTONE_STAIRS = getMaterial("red_sandstone_stairs");
    Material REPEATING_COMMAND_BLOCK = getMaterial("repeating_command_block");
    Material CHAIN_COMMAND_BLOCK = getMaterial("chain_command_block");
    Material MAGMA_BLOCK = getMaterial("magma_block");
    Material NETHER_WART_BLOCK = getMaterial("nether_wart_block");
    Material WARPED_WART_BLOCK = getMaterial("warped_wart_block");
    Material RED_NETHER_BRICKS = getMaterial("red_nether_bricks");
    Material BONE_BLOCK = getMaterial("bone_block");
    Material STRUCTURE_VOID = getMaterial("structure_void");
    Material SHULKER_BOX = getMaterial("shulker_box");
    Material WHITE_SHULKER_BOX = getMaterial("white_shulker_box");
    Material ORANGE_SHULKER_BOX = getMaterial("orange_shulker_box");
    Material MAGENTA_SHULKER_BOX = getMaterial("magenta_shulker_box");
    Material LIGHT_BLUE_SHULKER_BOX = getMaterial("light_blue_shulker_box");
    Material YELLOW_SHULKER_BOX = getMaterial("yellow_shulker_box");
    Material LIME_SHULKER_BOX = getMaterial("lime_shulker_box");
    Material PINK_SHULKER_BOX = getMaterial("pink_shulker_box");
    Material GRAY_SHULKER_BOX = getMaterial("gray_shulker_box");
    Material LIGHT_GRAY_SHULKER_BOX = getMaterial("light_gray_shulker_box");
    Material CYAN_SHULKER_BOX = getMaterial("cyan_shulker_box");
    Material PURPLE_SHULKER_BOX = getMaterial("purple_shulker_box");
    Material BLUE_SHULKER_BOX = getMaterial("blue_shulker_box");
    Material BROWN_SHULKER_BOX = getMaterial("brown_shulker_box");
    Material GREEN_SHULKER_BOX = getMaterial("green_shulker_box");
    Material RED_SHULKER_BOX = getMaterial("red_shulker_box");
    Material BLACK_SHULKER_BOX = getMaterial("black_shulker_box");
    Material WHITE_GLAZED_TERRACOTTA = getMaterial("white_glazed_terracotta");
    Material ORANGE_GLAZED_TERRACOTTA = getMaterial("orange_glazed_terracotta");
    Material MAGENTA_GLAZED_TERRACOTTA = getMaterial("magenta_glazed_terracotta");
    Material LIGHT_BLUE_GLAZED_TERRACOTTA = getMaterial("light_blue_glazed_terracotta");
    Material YELLOW_GLAZED_TERRACOTTA = getMaterial("yellow_glazed_terracotta");
    Material LIME_GLAZED_TERRACOTTA = getMaterial("lime_glazed_terracotta");
    Material PINK_GLAZED_TERRACOTTA = getMaterial("pink_glazed_terracotta");
    Material GRAY_GLAZED_TERRACOTTA = getMaterial("gray_glazed_terracotta");
    Material LIGHT_GRAY_GLAZED_TERRACOTTA = getMaterial("light_gray_glazed_terracotta");
    Material CYAN_GLAZED_TERRACOTTA = getMaterial("cyan_glazed_terracotta");
    Material PURPLE_GLAZED_TERRACOTTA = getMaterial("purple_glazed_terracotta");
    Material BLUE_GLAZED_TERRACOTTA = getMaterial("blue_glazed_terracotta");
    Material BROWN_GLAZED_TERRACOTTA = getMaterial("brown_glazed_terracotta");
    Material GREEN_GLAZED_TERRACOTTA = getMaterial("green_glazed_terracotta");
    Material RED_GLAZED_TERRACOTTA = getMaterial("red_glazed_terracotta");
    Material BLACK_GLAZED_TERRACOTTA = getMaterial("black_glazed_terracotta");
    Material WHITE_CONCRETE = getMaterial("white_concrete");
    Material ORANGE_CONCRETE = getMaterial("orange_concrete");
    Material MAGENTA_CONCRETE = getMaterial("magenta_concrete");
    Material LIGHT_BLUE_CONCRETE = getMaterial("light_blue_concrete");
    Material YELLOW_CONCRETE = getMaterial("yellow_concrete");
    Material LIME_CONCRETE = getMaterial("lime_concrete");
    Material PINK_CONCRETE = getMaterial("pink_concrete");
    Material GRAY_CONCRETE = getMaterial("gray_concrete");
    Material LIGHT_GRAY_CONCRETE = getMaterial("light_gray_concrete");
    Material CYAN_CONCRETE = getMaterial("cyan_concrete");
    Material PURPLE_CONCRETE = getMaterial("purple_concrete");
    Material BLUE_CONCRETE = getMaterial("blue_concrete");
    Material BROWN_CONCRETE = getMaterial("brown_concrete");
    Material GREEN_CONCRETE = getMaterial("green_concrete");
    Material RED_CONCRETE = getMaterial("red_concrete");
    Material BLACK_CONCRETE = getMaterial("black_concrete");
    Material WHITE_CONCRETE_POWDER = getMaterial("white_concrete_powder");
    Material ORANGE_CONCRETE_POWDER = getMaterial("orange_concrete_powder");
    Material MAGENTA_CONCRETE_POWDER = getMaterial("magenta_concrete_powder");
    Material LIGHT_BLUE_CONCRETE_POWDER = getMaterial("light_blue_concrete_powder");
    Material YELLOW_CONCRETE_POWDER = getMaterial("yellow_concrete_powder");
    Material LIME_CONCRETE_POWDER = getMaterial("lime_concrete_powder");
    Material PINK_CONCRETE_POWDER = getMaterial("pink_concrete_powder");
    Material GRAY_CONCRETE_POWDER = getMaterial("gray_concrete_powder");
    Material LIGHT_GRAY_CONCRETE_POWDER = getMaterial("light_gray_concrete_powder");
    Material CYAN_CONCRETE_POWDER = getMaterial("cyan_concrete_powder");
    Material PURPLE_CONCRETE_POWDER = getMaterial("purple_concrete_powder");
    Material BLUE_CONCRETE_POWDER = getMaterial("blue_concrete_powder");
    Material BROWN_CONCRETE_POWDER = getMaterial("brown_concrete_powder");
    Material GREEN_CONCRETE_POWDER = getMaterial("green_concrete_powder");
    Material RED_CONCRETE_POWDER = getMaterial("red_concrete_powder");
    Material BLACK_CONCRETE_POWDER = getMaterial("black_concrete_powder");
    Material TURTLE_EGG = getMaterial("turtle_egg");
    Material DEAD_TUBE_CORAL_BLOCK = getMaterial("dead_tube_coral_block");
    Material DEAD_BRAIN_CORAL_BLOCK = getMaterial("dead_brain_coral_block");
    Material DEAD_BUBBLE_CORAL_BLOCK = getMaterial("dead_bubble_coral_block");
    Material DEAD_FIRE_CORAL_BLOCK = getMaterial("dead_fire_coral_block");
    Material DEAD_HORN_CORAL_BLOCK = getMaterial("dead_horn_coral_block");
    Material TUBE_CORAL_BLOCK = getMaterial("tube_coral_block");
    Material BRAIN_CORAL_BLOCK = getMaterial("brain_coral_block");
    Material BUBBLE_CORAL_BLOCK = getMaterial("bubble_coral_block");
    Material FIRE_CORAL_BLOCK = getMaterial("fire_coral_block");
    Material HORN_CORAL_BLOCK = getMaterial("horn_coral_block");
    Material TUBE_CORAL = getMaterial("tube_coral");
    Material BRAIN_CORAL = getMaterial("brain_coral");
    Material BUBBLE_CORAL = getMaterial("bubble_coral");
    Material FIRE_CORAL = getMaterial("fire_coral");
    Material HORN_CORAL = getMaterial("horn_coral");
    Material DEAD_BRAIN_CORAL = getMaterial("dead_brain_coral");
    Material DEAD_BUBBLE_CORAL = getMaterial("dead_bubble_coral");
    Material DEAD_FIRE_CORAL = getMaterial("dead_fire_coral");
    Material DEAD_HORN_CORAL = getMaterial("dead_horn_coral");
    Material DEAD_TUBE_CORAL = getMaterial("dead_tube_coral");
    Material TUBE_CORAL_FAN = getMaterial("tube_coral_fan");
    Material BRAIN_CORAL_FAN = getMaterial("brain_coral_fan");
    Material BUBBLE_CORAL_FAN = getMaterial("bubble_coral_fan");
    Material FIRE_CORAL_FAN = getMaterial("fire_coral_fan");
    Material HORN_CORAL_FAN = getMaterial("horn_coral_fan");
    Material DEAD_TUBE_CORAL_FAN = getMaterial("dead_tube_coral_fan");
    Material DEAD_BRAIN_CORAL_FAN = getMaterial("dead_brain_coral_fan");
    Material DEAD_BUBBLE_CORAL_FAN = getMaterial("dead_bubble_coral_fan");
    Material DEAD_FIRE_CORAL_FAN = getMaterial("dead_fire_coral_fan");
    Material DEAD_HORN_CORAL_FAN = getMaterial("dead_horn_coral_fan");
    Material BLUE_ICE = getMaterial("blue_ice");
    Material CONDUIT = getMaterial("conduit");
    Material POLISHED_GRANITE_STAIRS = getMaterial("polished_granite_stairs");
    Material SMOOTH_RED_SANDSTONE_STAIRS = getMaterial("smooth_red_sandstone_stairs");
    Material MOSSY_STONE_BRICK_STAIRS = getMaterial("mossy_stone_brick_stairs");
    Material POLISHED_DIORITE_STAIRS = getMaterial("polished_diorite_stairs");
    Material MOSSY_COBBLESTONE_STAIRS = getMaterial("mossy_cobblestone_stairs");
    Material END_STONE_BRICK_STAIRS = getMaterial("end_stone_brick_stairs");
    Material STONE_STAIRS = getMaterial("stone_stairs");
    Material SMOOTH_SANDSTONE_STAIRS = getMaterial("smooth_sandstone_stairs");
    Material SMOOTH_QUARTZ_STAIRS = getMaterial("smooth_quartz_stairs");
    Material GRANITE_STAIRS = getMaterial("granite_stairs");
    Material ANDESITE_STAIRS = getMaterial("andesite_stairs");
    Material RED_NETHER_BRICK_STAIRS = getMaterial("red_nether_brick_stairs");
    Material POLISHED_ANDESITE_STAIRS = getMaterial("polished_andesite_stairs");
    Material DIORITE_STAIRS = getMaterial("diorite_stairs");
    Material COBBLED_DEEPSLATE_STAIRS = getMaterial("cobbled_deepslate_stairs");
    Material POLISHED_DEEPSLATE_STAIRS = getMaterial("polished_deepslate_stairs");
    Material DEEPSLATE_BRICK_STAIRS = getMaterial("deepslate_brick_stairs");
    Material DEEPSLATE_TILE_STAIRS = getMaterial("deepslate_tile_stairs");
    Material POLISHED_GRANITE_SLAB = getMaterial("polished_granite_slab");
    Material SMOOTH_RED_SANDSTONE_SLAB = getMaterial("smooth_red_sandstone_slab");
    Material MOSSY_STONE_BRICK_SLAB = getMaterial("mossy_stone_brick_slab");
    Material POLISHED_DIORITE_SLAB = getMaterial("polished_diorite_slab");
    Material MOSSY_COBBLESTONE_SLAB = getMaterial("mossy_cobblestone_slab");
    Material END_STONE_BRICK_SLAB = getMaterial("end_stone_brick_slab");
    Material SMOOTH_SANDSTONE_SLAB = getMaterial("smooth_sandstone_slab");
    Material SMOOTH_QUARTZ_SLAB = getMaterial("smooth_quartz_slab");
    Material GRANITE_SLAB = getMaterial("granite_slab");
    Material ANDESITE_SLAB = getMaterial("andesite_slab");
    Material RED_NETHER_BRICK_SLAB = getMaterial("red_nether_brick_slab");
    Material POLISHED_ANDESITE_SLAB = getMaterial("polished_andesite_slab");
    Material DIORITE_SLAB = getMaterial("diorite_slab");
    Material COBBLED_DEEPSLATE_SLAB = getMaterial("cobbled_deepslate_slab");
    Material POLISHED_DEEPSLATE_SLAB = getMaterial("polished_deepslate_slab");
    Material DEEPSLATE_BRICK_SLAB = getMaterial("deepslate_brick_slab");
    Material DEEPSLATE_TILE_SLAB = getMaterial("deepslate_tile_slab");
    Material SCAFFOLDING = getMaterial("scaffolding");
    Material REDSTONE = getMaterial("redstone");
    Material REDSTONE_TORCH = getMaterial("redstone_torch");
    Material REDSTONE_BLOCK = getMaterial("redstone_block");
    Material REPEATER = getMaterial("repeater");
    Material COMPARATOR = getMaterial("comparator");
    Material PISTON = getMaterial("piston");
    Material STICKY_PISTON = getMaterial("sticky_piston");
    Material SLIME_BLOCK = getMaterial("slime_block");
    Material HONEY_BLOCK = getMaterial("honey_block");
    Material OBSERVER = getMaterial("observer");
    Material HOPPER = getMaterial("hopper");
    Material DISPENSER = getMaterial("dispenser");
    Material DROPPER = getMaterial("dropper");
    Material LECTERN = getMaterial("lectern");
    Material TARGET = getMaterial("target");
    Material LEVER = getMaterial("lever");
    Material LIGHTNING_ROD = getMaterial("lightning_rod");
    Material DAYLIGHT_DETECTOR = getMaterial("daylight_detector");
    Material SCULK_SENSOR = getMaterial("sculk_sensor");
    Material TRIPWIRE_HOOK = getMaterial("tripwire_hook");
    Material TRAPPED_CHEST = getMaterial("trapped_chest");
    Material TNT = getMaterial("tnt");
    Material REDSTONE_LAMP = getMaterial("redstone_lamp");
    Material NOTE_BLOCK = getMaterial("note_block");
    Material STONE_BUTTON = getMaterial("stone_button");
    Material POLISHED_BLACKSTONE_BUTTON = getMaterial("polished_blackstone_button");
    Material OAK_BUTTON = getMaterial("oak_button");
    Material SPRUCE_BUTTON = getMaterial("spruce_button");
    Material BIRCH_BUTTON = getMaterial("birch_button");
    Material JUNGLE_BUTTON = getMaterial("jungle_button");
    Material ACACIA_BUTTON = getMaterial("acacia_button");
    Material DARK_OAK_BUTTON = getMaterial("dark_oak_button");
    Material CRIMSON_BUTTON = getMaterial("crimson_button");
    Material WARPED_BUTTON = getMaterial("warped_button");
    Material STONE_PRESSURE_PLATE = getMaterial("stone_pressure_plate");
    Material POLISHED_BLACKSTONE_PRESSURE_PLATE = getMaterial("polished_blackstone_pressure_plate");
    Material LIGHT_WEIGHTED_PRESSURE_PLATE = getMaterial("light_weighted_pressure_plate");
    Material HEAVY_WEIGHTED_PRESSURE_PLATE = getMaterial("heavy_weighted_pressure_plate");
    Material OAK_PRESSURE_PLATE = getMaterial("oak_pressure_plate");
    Material SPRUCE_PRESSURE_PLATE = getMaterial("spruce_pressure_plate");
    Material BIRCH_PRESSURE_PLATE = getMaterial("birch_pressure_plate");
    Material JUNGLE_PRESSURE_PLATE = getMaterial("jungle_pressure_plate");
    Material ACACIA_PRESSURE_PLATE = getMaterial("acacia_pressure_plate");
    Material DARK_OAK_PRESSURE_PLATE = getMaterial("dark_oak_pressure_plate");
    Material CRIMSON_PRESSURE_PLATE = getMaterial("crimson_pressure_plate");
    Material WARPED_PRESSURE_PLATE = getMaterial("warped_pressure_plate");
    Material IRON_DOOR = getMaterial("iron_door");
    Material OAK_DOOR = getMaterial("oak_door");
    Material SPRUCE_DOOR = getMaterial("spruce_door");
    Material BIRCH_DOOR = getMaterial("birch_door");
    Material JUNGLE_DOOR = getMaterial("jungle_door");
    Material ACACIA_DOOR = getMaterial("acacia_door");
    Material DARK_OAK_DOOR = getMaterial("dark_oak_door");
    Material CRIMSON_DOOR = getMaterial("crimson_door");
    Material WARPED_DOOR = getMaterial("warped_door");
    Material IRON_TRAPDOOR = getMaterial("iron_trapdoor");
    Material OAK_TRAPDOOR = getMaterial("oak_trapdoor");
    Material SPRUCE_TRAPDOOR = getMaterial("spruce_trapdoor");
    Material BIRCH_TRAPDOOR = getMaterial("birch_trapdoor");
    Material JUNGLE_TRAPDOOR = getMaterial("jungle_trapdoor");
    Material ACACIA_TRAPDOOR = getMaterial("acacia_trapdoor");
    Material DARK_OAK_TRAPDOOR = getMaterial("dark_oak_trapdoor");
    Material CRIMSON_TRAPDOOR = getMaterial("crimson_trapdoor");
    Material WARPED_TRAPDOOR = getMaterial("warped_trapdoor");
    Material OAK_FENCE_GATE = getMaterial("oak_fence_gate");
    Material SPRUCE_FENCE_GATE = getMaterial("spruce_fence_gate");
    Material BIRCH_FENCE_GATE = getMaterial("birch_fence_gate");
    Material JUNGLE_FENCE_GATE = getMaterial("jungle_fence_gate");
    Material ACACIA_FENCE_GATE = getMaterial("acacia_fence_gate");
    Material DARK_OAK_FENCE_GATE = getMaterial("dark_oak_fence_gate");
    Material CRIMSON_FENCE_GATE = getMaterial("crimson_fence_gate");
    Material WARPED_FENCE_GATE = getMaterial("warped_fence_gate");
    Material POWERED_RAIL = getMaterial("powered_rail");
    Material DETECTOR_RAIL = getMaterial("detector_rail");
    Material RAIL = getMaterial("rail");
    Material ACTIVATOR_RAIL = getMaterial("activator_rail");
    Material SADDLE = getMaterial("saddle");
    Material MINECART = getMaterial("minecart");
    Material CHEST_MINECART = getMaterial("chest_minecart");
    Material FURNACE_MINECART = getMaterial("furnace_minecart");
    Material TNT_MINECART = getMaterial("tnt_minecart");
    Material HOPPER_MINECART = getMaterial("hopper_minecart");
    Material CARROT_ON_A_STICK = getMaterial("carrot_on_a_stick");
    Material WARPED_FUNGUS_ON_A_STICK = getMaterial("warped_fungus_on_a_stick");
    Material ELYTRA = getMaterial("elytra");
    Material OAK_BOAT = getMaterial("oak_boat");
    Material SPRUCE_BOAT = getMaterial("spruce_boat");
    Material BIRCH_BOAT = getMaterial("birch_boat");
    Material JUNGLE_BOAT = getMaterial("jungle_boat");
    Material ACACIA_BOAT = getMaterial("acacia_boat");
    Material DARK_OAK_BOAT = getMaterial("dark_oak_boat");
    Material STRUCTURE_BLOCK = getMaterial("structure_block");
    Material JIGSAW = getMaterial("jigsaw");
    Material TURTLE_HELMET = getMaterial("turtle_helmet");
    Material SCUTE = getMaterial("scute");
    Material FLINT_AND_STEEL = getMaterial("flint_and_steel");
    Material APPLE = getMaterial("apple");
    Material BOW = getMaterial("bow");
    Material ARROW = getMaterial("arrow");
    Material COAL = getMaterial("coal");
    Material CHARCOAL = getMaterial("charcoal");
    Material DIAMOND = getMaterial("diamond");
    Material EMERALD = getMaterial("emerald");
    Material LAPIS_LAZULI = getMaterial("lapis_lazuli");
    Material QUARTZ = getMaterial("quartz");
    Material AMETHYST_SHARD = getMaterial("amethyst_shard");
    Material RAW_IRON = getMaterial("raw_iron");
    Material IRON_INGOT = getMaterial("iron_ingot");
    Material RAW_COPPER = getMaterial("raw_copper");
    Material COPPER_INGOT = getMaterial("copper_ingot");
    Material RAW_GOLD = getMaterial("raw_gold");
    Material GOLD_INGOT = getMaterial("gold_ingot");
    Material NETHERITE_INGOT = getMaterial("netherite_ingot");
    Material NETHERITE_SCRAP = getMaterial("netherite_scrap");
    Material WOODEN_SWORD = getMaterial("wooden_sword");
    Material WOODEN_SHOVEL = getMaterial("wooden_shovel");
    Material WOODEN_PICKAXE = getMaterial("wooden_pickaxe");
    Material WOODEN_AXE = getMaterial("wooden_axe");
    Material WOODEN_HOE = getMaterial("wooden_hoe");
    Material STONE_SWORD = getMaterial("stone_sword");
    Material STONE_SHOVEL = getMaterial("stone_shovel");
    Material STONE_PICKAXE = getMaterial("stone_pickaxe");
    Material STONE_AXE = getMaterial("stone_axe");
    Material STONE_HOE = getMaterial("stone_hoe");
    Material GOLDEN_SWORD = getMaterial("golden_sword");
    Material GOLDEN_SHOVEL = getMaterial("golden_shovel");
    Material GOLDEN_PICKAXE = getMaterial("golden_pickaxe");
    Material GOLDEN_AXE = getMaterial("golden_axe");
    Material GOLDEN_HOE = getMaterial("golden_hoe");
    Material IRON_SWORD = getMaterial("iron_sword");
    Material IRON_SHOVEL = getMaterial("iron_shovel");
    Material IRON_PICKAXE = getMaterial("iron_pickaxe");
    Material IRON_AXE = getMaterial("iron_axe");
    Material IRON_HOE = getMaterial("iron_hoe");
    Material DIAMOND_SWORD = getMaterial("diamond_sword");
    Material DIAMOND_SHOVEL = getMaterial("diamond_shovel");
    Material DIAMOND_PICKAXE = getMaterial("diamond_pickaxe");
    Material DIAMOND_AXE = getMaterial("diamond_axe");
    Material DIAMOND_HOE = getMaterial("diamond_hoe");
    Material NETHERITE_SWORD = getMaterial("netherite_sword");
    Material NETHERITE_SHOVEL = getMaterial("netherite_shovel");
    Material NETHERITE_PICKAXE = getMaterial("netherite_pickaxe");
    Material NETHERITE_AXE = getMaterial("netherite_axe");
    Material NETHERITE_HOE = getMaterial("netherite_hoe");
    Material STICK = getMaterial("stick");
    Material BOWL = getMaterial("bowl");
    Material MUSHROOM_STEW = getMaterial("mushroom_stew");
    Material STRING = getMaterial("string");
    Material FEATHER = getMaterial("feather");
    Material GUNPOWDER = getMaterial("gunpowder");
    Material WHEAT_SEEDS = getMaterial("wheat_seeds");
    Material WHEAT = getMaterial("wheat");
    Material BREAD = getMaterial("bread");
    Material LEATHER_HELMET = getMaterial("leather_helmet");
    Material LEATHER_CHESTPLATE = getMaterial("leather_chestplate");
    Material LEATHER_LEGGINGS = getMaterial("leather_leggings");
    Material LEATHER_BOOTS = getMaterial("leather_boots");
    Material CHAINMAIL_HELMET = getMaterial("chainmail_helmet");
    Material CHAINMAIL_CHESTPLATE = getMaterial("chainmail_chestplate");
    Material CHAINMAIL_LEGGINGS = getMaterial("chainmail_leggings");
    Material CHAINMAIL_BOOTS = getMaterial("chainmail_boots");
    Material IRON_HELMET = getMaterial("iron_helmet");
    Material IRON_CHESTPLATE = getMaterial("iron_chestplate");
    Material IRON_LEGGINGS = getMaterial("iron_leggings");
    Material IRON_BOOTS = getMaterial("iron_boots");
    Material DIAMOND_HELMET = getMaterial("diamond_helmet");
    Material DIAMOND_CHESTPLATE = getMaterial("diamond_chestplate");
    Material DIAMOND_LEGGINGS = getMaterial("diamond_leggings");
    Material DIAMOND_BOOTS = getMaterial("diamond_boots");
    Material GOLDEN_HELMET = getMaterial("golden_helmet");
    Material GOLDEN_CHESTPLATE = getMaterial("golden_chestplate");
    Material GOLDEN_LEGGINGS = getMaterial("golden_leggings");
    Material GOLDEN_BOOTS = getMaterial("golden_boots");
    Material NETHERITE_HELMET = getMaterial("netherite_helmet");
    Material NETHERITE_CHESTPLATE = getMaterial("netherite_chestplate");
    Material NETHERITE_LEGGINGS = getMaterial("netherite_leggings");
    Material NETHERITE_BOOTS = getMaterial("netherite_boots");
    Material FLINT = getMaterial("flint");
    Material PORKCHOP = getMaterial("porkchop");
    Material COOKED_PORKCHOP = getMaterial("cooked_porkchop");
    Material PAINTING = getMaterial("painting");
    Material GOLDEN_APPLE = getMaterial("golden_apple");
    Material ENCHANTED_GOLDEN_APPLE = getMaterial("enchanted_golden_apple");
    Material OAK_SIGN = getMaterial("oak_sign");
    Material SPRUCE_SIGN = getMaterial("spruce_sign");
    Material BIRCH_SIGN = getMaterial("birch_sign");
    Material JUNGLE_SIGN = getMaterial("jungle_sign");
    Material ACACIA_SIGN = getMaterial("acacia_sign");
    Material DARK_OAK_SIGN = getMaterial("dark_oak_sign");
    Material CRIMSON_SIGN = getMaterial("crimson_sign");
    Material WARPED_SIGN = getMaterial("warped_sign");
    Material BUCKET = getMaterial("bucket");
    Material WATER_BUCKET = getMaterial("water_bucket");
    Material LAVA_BUCKET = getMaterial("lava_bucket");
    Material POWDER_SNOW_BUCKET = getMaterial("powder_snow_bucket");
    Material SNOWBALL = getMaterial("snowball");
    Material LEATHER = getMaterial("leather");
    Material MILK_BUCKET = getMaterial("milk_bucket");
    Material PUFFERFISH_BUCKET = getMaterial("pufferfish_bucket");
    Material SALMON_BUCKET = getMaterial("salmon_bucket");
    Material COD_BUCKET = getMaterial("cod_bucket");
    Material TROPICAL_FISH_BUCKET = getMaterial("tropical_fish_bucket");
    Material AXOLOTL_BUCKET = getMaterial("axolotl_bucket");
    Material BRICK = getMaterial("brick");
    Material CLAY_BALL = getMaterial("clay_ball");
    Material DRIED_KELP_BLOCK = getMaterial("dried_kelp_block");
    Material PAPER = getMaterial("paper");
    Material BOOK = getMaterial("book");
    Material SLIME_BALL = getMaterial("slime_ball");
    Material EGG = getMaterial("egg");
    Material COMPASS = getMaterial("compass");
    Material BUNDLE = getMaterial("bundle");
    Material FISHING_ROD = getMaterial("fishing_rod");
    Material CLOCK = getMaterial("clock");
    Material SPYGLASS = getMaterial("spyglass");
    Material GLOWSTONE_DUST = getMaterial("glowstone_dust");
    Material COD = getMaterial("cod");
    Material SALMON = getMaterial("salmon");
    Material TROPICAL_FISH = getMaterial("tropical_fish");
    Material PUFFERFISH = getMaterial("pufferfish");
    Material COOKED_COD = getMaterial("cooked_cod");
    Material COOKED_SALMON = getMaterial("cooked_salmon");
    Material INK_SAC = getMaterial("ink_sac");
    Material GLOW_INK_SAC = getMaterial("glow_ink_sac");
    Material COCOA_BEANS = getMaterial("cocoa_beans");
    Material WHITE_DYE = getMaterial("white_dye");
    Material ORANGE_DYE = getMaterial("orange_dye");
    Material MAGENTA_DYE = getMaterial("magenta_dye");
    Material LIGHT_BLUE_DYE = getMaterial("light_blue_dye");
    Material YELLOW_DYE = getMaterial("yellow_dye");
    Material LIME_DYE = getMaterial("lime_dye");
    Material PINK_DYE = getMaterial("pink_dye");
    Material GRAY_DYE = getMaterial("gray_dye");
    Material LIGHT_GRAY_DYE = getMaterial("light_gray_dye");
    Material CYAN_DYE = getMaterial("cyan_dye");
    Material PURPLE_DYE = getMaterial("purple_dye");
    Material BLUE_DYE = getMaterial("blue_dye");
    Material BROWN_DYE = getMaterial("brown_dye");
    Material GREEN_DYE = getMaterial("green_dye");
    Material RED_DYE = getMaterial("red_dye");
    Material BLACK_DYE = getMaterial("black_dye");
    Material BONE_MEAL = getMaterial("bone_meal");
    Material BONE = getMaterial("bone");
    Material SUGAR = getMaterial("sugar");
    Material CAKE = getMaterial("cake");
    Material WHITE_BED = getMaterial("white_bed");
    Material ORANGE_BED = getMaterial("orange_bed");
    Material MAGENTA_BED = getMaterial("magenta_bed");
    Material LIGHT_BLUE_BED = getMaterial("light_blue_bed");
    Material YELLOW_BED = getMaterial("yellow_bed");
    Material LIME_BED = getMaterial("lime_bed");
    Material PINK_BED = getMaterial("pink_bed");
    Material GRAY_BED = getMaterial("gray_bed");
    Material LIGHT_GRAY_BED = getMaterial("light_gray_bed");
    Material CYAN_BED = getMaterial("cyan_bed");
    Material PURPLE_BED = getMaterial("purple_bed");
    Material BLUE_BED = getMaterial("blue_bed");
    Material BROWN_BED = getMaterial("brown_bed");
    Material GREEN_BED = getMaterial("green_bed");
    Material RED_BED = getMaterial("red_bed");
    Material BLACK_BED = getMaterial("black_bed");
    Material COOKIE = getMaterial("cookie");
    Material FILLED_MAP = getMaterial("filled_map");
    Material SHEARS = getMaterial("shears");
    Material MELON_SLICE = getMaterial("melon_slice");
    Material DRIED_KELP = getMaterial("dried_kelp");
    Material PUMPKIN_SEEDS = getMaterial("pumpkin_seeds");
    Material MELON_SEEDS = getMaterial("melon_seeds");
    Material BEEF = getMaterial("beef");
    Material COOKED_BEEF = getMaterial("cooked_beef");
    Material CHICKEN = getMaterial("chicken");
    Material COOKED_CHICKEN = getMaterial("cooked_chicken");
    Material ROTTEN_FLESH = getMaterial("rotten_flesh");
    Material ENDER_PEARL = getMaterial("ender_pearl");
    Material BLAZE_ROD = getMaterial("blaze_rod");
    Material GHAST_TEAR = getMaterial("ghast_tear");
    Material GOLD_NUGGET = getMaterial("gold_nugget");
    Material NETHER_WART = getMaterial("nether_wart");
    Material POTION = getMaterial("potion");
    Material GLASS_BOTTLE = getMaterial("glass_bottle");
    Material SPIDER_EYE = getMaterial("spider_eye");
    Material FERMENTED_SPIDER_EYE = getMaterial("fermented_spider_eye");
    Material BLAZE_POWDER = getMaterial("blaze_powder");
    Material MAGMA_CREAM = getMaterial("magma_cream");
    Material BREWING_STAND = getMaterial("brewing_stand");
    Material CAULDRON = getMaterial("cauldron");
    Material ENDER_EYE = getMaterial("ender_eye");
    Material GLISTERING_MELON_SLICE = getMaterial("glistering_melon_slice");
    Material AXOLOTL_SPAWN_EGG = getMaterial("axolotl_spawn_egg");
    Material BAT_SPAWN_EGG = getMaterial("bat_spawn_egg");
    Material BEE_SPAWN_EGG = getMaterial("bee_spawn_egg");
    Material BLAZE_SPAWN_EGG = getMaterial("blaze_spawn_egg");
    Material CAT_SPAWN_EGG = getMaterial("cat_spawn_egg");
    Material CAVE_SPIDER_SPAWN_EGG = getMaterial("cave_spider_spawn_egg");
    Material CHICKEN_SPAWN_EGG = getMaterial("chicken_spawn_egg");
    Material COD_SPAWN_EGG = getMaterial("cod_spawn_egg");
    Material COW_SPAWN_EGG = getMaterial("cow_spawn_egg");
    Material CREEPER_SPAWN_EGG = getMaterial("creeper_spawn_egg");
    Material DOLPHIN_SPAWN_EGG = getMaterial("dolphin_spawn_egg");
    Material DONKEY_SPAWN_EGG = getMaterial("donkey_spawn_egg");
    Material DROWNED_SPAWN_EGG = getMaterial("drowned_spawn_egg");
    Material ELDER_GUARDIAN_SPAWN_EGG = getMaterial("elder_guardian_spawn_egg");
    Material ENDERMAN_SPAWN_EGG = getMaterial("enderman_spawn_egg");
    Material ENDERMITE_SPAWN_EGG = getMaterial("endermite_spawn_egg");
    Material EVOKER_SPAWN_EGG = getMaterial("evoker_spawn_egg");
    Material FOX_SPAWN_EGG = getMaterial("fox_spawn_egg");
    Material GHAST_SPAWN_EGG = getMaterial("ghast_spawn_egg");
    Material GLOW_SQUID_SPAWN_EGG = getMaterial("glow_squid_spawn_egg");
    Material GOAT_SPAWN_EGG = getMaterial("goat_spawn_egg");
    Material GUARDIAN_SPAWN_EGG = getMaterial("guardian_spawn_egg");
    Material HOGLIN_SPAWN_EGG = getMaterial("hoglin_spawn_egg");
    Material HORSE_SPAWN_EGG = getMaterial("horse_spawn_egg");
    Material HUSK_SPAWN_EGG = getMaterial("husk_spawn_egg");
    Material LLAMA_SPAWN_EGG = getMaterial("llama_spawn_egg");
    Material MAGMA_CUBE_SPAWN_EGG = getMaterial("magma_cube_spawn_egg");
    Material MOOSHROOM_SPAWN_EGG = getMaterial("mooshroom_spawn_egg");
    Material MULE_SPAWN_EGG = getMaterial("mule_spawn_egg");
    Material OCELOT_SPAWN_EGG = getMaterial("ocelot_spawn_egg");
    Material PANDA_SPAWN_EGG = getMaterial("panda_spawn_egg");
    Material PARROT_SPAWN_EGG = getMaterial("parrot_spawn_egg");
    Material PHANTOM_SPAWN_EGG = getMaterial("phantom_spawn_egg");
    Material PIG_SPAWN_EGG = getMaterial("pig_spawn_egg");
    Material PIGLIN_SPAWN_EGG = getMaterial("piglin_spawn_egg");
    Material PIGLIN_BRUTE_SPAWN_EGG = getMaterial("piglin_brute_spawn_egg");
    Material PILLAGER_SPAWN_EGG = getMaterial("pillager_spawn_egg");
    Material POLAR_BEAR_SPAWN_EGG = getMaterial("polar_bear_spawn_egg");
    Material PUFFERFISH_SPAWN_EGG = getMaterial("pufferfish_spawn_egg");
    Material RABBIT_SPAWN_EGG = getMaterial("rabbit_spawn_egg");
    Material RAVAGER_SPAWN_EGG = getMaterial("ravager_spawn_egg");
    Material SALMON_SPAWN_EGG = getMaterial("salmon_spawn_egg");
    Material SHEEP_SPAWN_EGG = getMaterial("sheep_spawn_egg");
    Material SHULKER_SPAWN_EGG = getMaterial("shulker_spawn_egg");
    Material SILVERFISH_SPAWN_EGG = getMaterial("silverfish_spawn_egg");
    Material SKELETON_SPAWN_EGG = getMaterial("skeleton_spawn_egg");
    Material SKELETON_HORSE_SPAWN_EGG = getMaterial("skeleton_horse_spawn_egg");
    Material SLIME_SPAWN_EGG = getMaterial("slime_spawn_egg");
    Material SPIDER_SPAWN_EGG = getMaterial("spider_spawn_egg");
    Material SQUID_SPAWN_EGG = getMaterial("squid_spawn_egg");
    Material STRAY_SPAWN_EGG = getMaterial("stray_spawn_egg");
    Material STRIDER_SPAWN_EGG = getMaterial("strider_spawn_egg");
    Material TRADER_LLAMA_SPAWN_EGG = getMaterial("trader_llama_spawn_egg");
    Material TROPICAL_FISH_SPAWN_EGG = getMaterial("tropical_fish_spawn_egg");
    Material TURTLE_SPAWN_EGG = getMaterial("turtle_spawn_egg");
    Material VEX_SPAWN_EGG = getMaterial("vex_spawn_egg");
    Material VILLAGER_SPAWN_EGG = getMaterial("villager_spawn_egg");
    Material VINDICATOR_SPAWN_EGG = getMaterial("vindicator_spawn_egg");
    Material WANDERING_TRADER_SPAWN_EGG = getMaterial("wandering_trader_spawn_egg");
    Material WITCH_SPAWN_EGG = getMaterial("witch_spawn_egg");
    Material WITHER_SKELETON_SPAWN_EGG = getMaterial("wither_skeleton_spawn_egg");
    Material WOLF_SPAWN_EGG = getMaterial("wolf_spawn_egg");
    Material ZOGLIN_SPAWN_EGG = getMaterial("zoglin_spawn_egg");
    Material ZOMBIE_SPAWN_EGG = getMaterial("zombie_spawn_egg");
    Material ZOMBIE_HORSE_SPAWN_EGG = getMaterial("zombie_horse_spawn_egg");
    Material ZOMBIE_VILLAGER_SPAWN_EGG = getMaterial("zombie_villager_spawn_egg");
    Material ZOMBIFIED_PIGLIN_SPAWN_EGG = getMaterial("zombified_piglin_spawn_egg");
    Material EXPERIENCE_BOTTLE = getMaterial("experience_bottle");
    Material FIRE_CHARGE = getMaterial("fire_charge");
    Material WRITABLE_BOOK = getMaterial("writable_book");
    Material WRITTEN_BOOK = getMaterial("written_book");
    Material ITEM_FRAME = getMaterial("item_frame");
    Material GLOW_ITEM_FRAME = getMaterial("glow_item_frame");
    Material FLOWER_POT = getMaterial("flower_pot");
    Material CARROT = getMaterial("carrot");
    Material POTATO = getMaterial("potato");
    Material BAKED_POTATO = getMaterial("baked_potato");
    Material POISONOUS_POTATO = getMaterial("poisonous_potato");
    Material MAP = getMaterial("map");
    Material GOLDEN_CARROT = getMaterial("golden_carrot");
    Material SKELETON_SKULL = getMaterial("skeleton_skull");
    Material WITHER_SKELETON_SKULL = getMaterial("wither_skeleton_skull");
    Material PLAYER_HEAD = getMaterial("player_head");
    Material ZOMBIE_HEAD = getMaterial("zombie_head");
    Material CREEPER_HEAD = getMaterial("creeper_head");
    Material DRAGON_HEAD = getMaterial("dragon_head");
    Material NETHER_STAR = getMaterial("nether_star");
    Material PUMPKIN_PIE = getMaterial("pumpkin_pie");
    Material FIREWORK_ROCKET = getMaterial("firework_rocket");
    Material FIREWORK_STAR = getMaterial("firework_star");
    Material ENCHANTED_BOOK = getMaterial("enchanted_book");
    Material NETHER_BRICK = getMaterial("nether_brick");
    Material PRISMARINE_SHARD = getMaterial("prismarine_shard");
    Material PRISMARINE_CRYSTALS = getMaterial("prismarine_crystals");
    Material RABBIT = getMaterial("rabbit");
    Material COOKED_RABBIT = getMaterial("cooked_rabbit");
    Material RABBIT_STEW = getMaterial("rabbit_stew");
    Material RABBIT_FOOT = getMaterial("rabbit_foot");
    Material RABBIT_HIDE = getMaterial("rabbit_hide");
    Material ARMOR_STAND = getMaterial("armor_stand");
    Material IRON_HORSE_ARMOR = getMaterial("iron_horse_armor");
    Material GOLDEN_HORSE_ARMOR = getMaterial("golden_horse_armor");
    Material DIAMOND_HORSE_ARMOR = getMaterial("diamond_horse_armor");
    Material LEATHER_HORSE_ARMOR = getMaterial("leather_horse_armor");
    Material LEAD = getMaterial("lead");
    Material NAME_TAG = getMaterial("name_tag");
    Material COMMAND_BLOCK_MINECART = getMaterial("command_block_minecart");
    Material MUTTON = getMaterial("mutton");
    Material COOKED_MUTTON = getMaterial("cooked_mutton");
    Material WHITE_BANNER = getMaterial("white_banner");
    Material ORANGE_BANNER = getMaterial("orange_banner");
    Material MAGENTA_BANNER = getMaterial("magenta_banner");
    Material LIGHT_BLUE_BANNER = getMaterial("light_blue_banner");
    Material YELLOW_BANNER = getMaterial("yellow_banner");
    Material LIME_BANNER = getMaterial("lime_banner");
    Material PINK_BANNER = getMaterial("pink_banner");
    Material GRAY_BANNER = getMaterial("gray_banner");
    Material LIGHT_GRAY_BANNER = getMaterial("light_gray_banner");
    Material CYAN_BANNER = getMaterial("cyan_banner");
    Material PURPLE_BANNER = getMaterial("purple_banner");
    Material BLUE_BANNER = getMaterial("blue_banner");
    Material BROWN_BANNER = getMaterial("brown_banner");
    Material GREEN_BANNER = getMaterial("green_banner");
    Material RED_BANNER = getMaterial("red_banner");
    Material BLACK_BANNER = getMaterial("black_banner");
    Material END_CRYSTAL = getMaterial("end_crystal");
    Material CHORUS_FRUIT = getMaterial("chorus_fruit");
    Material POPPED_CHORUS_FRUIT = getMaterial("popped_chorus_fruit");
    Material BEETROOT = getMaterial("beetroot");
    Material BEETROOT_SEEDS = getMaterial("beetroot_seeds");
    Material BEETROOT_SOUP = getMaterial("beetroot_soup");
    Material DRAGON_BREATH = getMaterial("dragon_breath");
    Material SPLASH_POTION = getMaterial("splash_potion");
    Material SPECTRAL_ARROW = getMaterial("spectral_arrow");
    Material TIPPED_ARROW = getMaterial("tipped_arrow");
    Material LINGERING_POTION = getMaterial("lingering_potion");
    Material SHIELD = getMaterial("shield");
    Material TOTEM_OF_UNDYING = getMaterial("totem_of_undying");
    Material SHULKER_SHELL = getMaterial("shulker_shell");
    Material IRON_NUGGET = getMaterial("iron_nugget");
    Material KNOWLEDGE_BOOK = getMaterial("knowledge_book");
    Material DEBUG_STICK = getMaterial("debug_stick");
    Material MUSIC_DISC_13 = getMaterial("music_disc_13");
    Material MUSIC_DISC_CAT = getMaterial("music_disc_cat");
    Material MUSIC_DISC_BLOCKS = getMaterial("music_disc_blocks");
    Material MUSIC_DISC_CHIRP = getMaterial("music_disc_chirp");
    Material MUSIC_DISC_FAR = getMaterial("music_disc_far");
    Material MUSIC_DISC_MALL = getMaterial("music_disc_mall");
    Material MUSIC_DISC_MELLOHI = getMaterial("music_disc_mellohi");
    Material MUSIC_DISC_STAL = getMaterial("music_disc_stal");
    Material MUSIC_DISC_STRAD = getMaterial("music_disc_strad");
    Material MUSIC_DISC_WARD = getMaterial("music_disc_ward");
    Material MUSIC_DISC_11 = getMaterial("music_disc_11");
    Material MUSIC_DISC_WAIT = getMaterial("music_disc_wait");
    Material MUSIC_DISC_OTHERSIDE = getMaterial("music_disc_otherside");
    Material MUSIC_DISC_PIGSTEP = getMaterial("music_disc_pigstep");
    Material TRIDENT = getMaterial("trident");
    Material PHANTOM_MEMBRANE = getMaterial("phantom_membrane");
    Material NAUTILUS_SHELL = getMaterial("nautilus_shell");
    Material HEART_OF_THE_SEA = getMaterial("heart_of_the_sea");
    Material CROSSBOW = getMaterial("crossbow");
    Material SUSPICIOUS_STEW = getMaterial("suspicious_stew");
    Material LOOM = getMaterial("loom");
    Material FLOWER_BANNER_PATTERN = getMaterial("flower_banner_pattern");
    Material CREEPER_BANNER_PATTERN = getMaterial("creeper_banner_pattern");
    Material SKULL_BANNER_PATTERN = getMaterial("skull_banner_pattern");
    Material MOJANG_BANNER_PATTERN = getMaterial("mojang_banner_pattern");
    Material GLOBE_BANNER_PATTERN = getMaterial("globe_banner_pattern");
    Material PIGLIN_BANNER_PATTERN = getMaterial("piglin_banner_pattern");
    Material COMPOSTER = getMaterial("composter");
    Material BARREL = getMaterial("barrel");
    Material SMOKER = getMaterial("smoker");
    Material BLAST_FURNACE = getMaterial("blast_furnace");
    Material CARTOGRAPHY_TABLE = getMaterial("cartography_table");
    Material FLETCHING_TABLE = getMaterial("fletching_table");
    Material GRINDSTONE = getMaterial("grindstone");
    Material SMITHING_TABLE = getMaterial("smithing_table");
    Material STONECUTTER = getMaterial("stonecutter");
    Material BELL = getMaterial("bell");
    Material LANTERN = getMaterial("lantern");
    Material SOUL_LANTERN = getMaterial("soul_lantern");
    Material SWEET_BERRIES = getMaterial("sweet_berries");
    Material GLOW_BERRIES = getMaterial("glow_berries");
    Material CAMPFIRE = getMaterial("campfire");
    Material SOUL_CAMPFIRE = getMaterial("soul_campfire");
    Material SHROOMLIGHT = getMaterial("shroomlight");
    Material HONEYCOMB = getMaterial("honeycomb");
    Material BEE_NEST = getMaterial("bee_nest");
    Material BEEHIVE = getMaterial("beehive");
    Material HONEY_BOTTLE = getMaterial("honey_bottle");
    Material HONEYCOMB_BLOCK = getMaterial("honeycomb_block");
    Material LODESTONE = getMaterial("lodestone");
    Material CRYING_OBSIDIAN = getMaterial("crying_obsidian");
    Material BLACKSTONE = getMaterial("blackstone");
    Material BLACKSTONE_SLAB = getMaterial("blackstone_slab");
    Material BLACKSTONE_STAIRS = getMaterial("blackstone_stairs");
    Material GILDED_BLACKSTONE = getMaterial("gilded_blackstone");
    Material POLISHED_BLACKSTONE = getMaterial("polished_blackstone");
    Material POLISHED_BLACKSTONE_SLAB = getMaterial("polished_blackstone_slab");
    Material POLISHED_BLACKSTONE_STAIRS = getMaterial("polished_blackstone_stairs");
    Material CHISELED_POLISHED_BLACKSTONE = getMaterial("chiseled_polished_blackstone");
    Material POLISHED_BLACKSTONE_BRICKS = getMaterial("polished_blackstone_bricks");
    Material POLISHED_BLACKSTONE_BRICK_SLAB = getMaterial("polished_blackstone_brick_slab");
    Material POLISHED_BLACKSTONE_BRICK_STAIRS = getMaterial("polished_blackstone_brick_stairs");
    Material CRACKED_POLISHED_BLACKSTONE_BRICKS = getMaterial("cracked_polished_blackstone_bricks");
    Material RESPAWN_ANCHOR = getMaterial("respawn_anchor");
    Material CANDLE = getMaterial("candle");
    Material WHITE_CANDLE = getMaterial("white_candle");
    Material ORANGE_CANDLE = getMaterial("orange_candle");
    Material MAGENTA_CANDLE = getMaterial("magenta_candle");
    Material LIGHT_BLUE_CANDLE = getMaterial("light_blue_candle");
    Material YELLOW_CANDLE = getMaterial("yellow_candle");
    Material LIME_CANDLE = getMaterial("lime_candle");
    Material PINK_CANDLE = getMaterial("pink_candle");
    Material GRAY_CANDLE = getMaterial("gray_candle");
    Material LIGHT_GRAY_CANDLE = getMaterial("light_gray_candle");
    Material CYAN_CANDLE = getMaterial("cyan_candle");
    Material PURPLE_CANDLE = getMaterial("purple_candle");
    Material BLUE_CANDLE = getMaterial("blue_candle");
    Material BROWN_CANDLE = getMaterial("brown_candle");
    Material GREEN_CANDLE = getMaterial("green_candle");
    Material RED_CANDLE = getMaterial("red_candle");
    Material BLACK_CANDLE = getMaterial("black_candle");
    Material SMALL_AMETHYST_BUD = getMaterial("small_amethyst_bud");
    Material MEDIUM_AMETHYST_BUD = getMaterial("medium_amethyst_bud");
    Material LARGE_AMETHYST_BUD = getMaterial("large_amethyst_bud");
    Material AMETHYST_CLUSTER = getMaterial("amethyst_cluster");
    Material POINTED_DRIPSTONE = getMaterial("pointed_dripstone");
    Material WATER = getMaterial("water");
    Material LAVA = getMaterial("lava");
    Material TALL_SEAGRASS = getMaterial("tall_seagrass");
    Material PISTON_HEAD = getMaterial("piston_head");
    Material MOVING_PISTON = getMaterial("moving_piston");
    Material WALL_TORCH = getMaterial("wall_torch");
    Material FIRE = getMaterial("fire");
    Material SOUL_FIRE = getMaterial("soul_fire");
    Material REDSTONE_WIRE = getMaterial("redstone_wire");
    Material OAK_WALL_SIGN = getMaterial("oak_wall_sign");
    Material SPRUCE_WALL_SIGN = getMaterial("spruce_wall_sign");
    Material BIRCH_WALL_SIGN = getMaterial("birch_wall_sign");
    Material ACACIA_WALL_SIGN = getMaterial("acacia_wall_sign");
    Material JUNGLE_WALL_SIGN = getMaterial("jungle_wall_sign");
    Material DARK_OAK_WALL_SIGN = getMaterial("dark_oak_wall_sign");
    Material REDSTONE_WALL_TORCH = getMaterial("redstone_wall_torch");
    Material SOUL_WALL_TORCH = getMaterial("soul_wall_torch");
    Material NETHER_PORTAL = getMaterial("nether_portal");
    Material ATTACHED_PUMPKIN_STEM = getMaterial("attached_pumpkin_stem");
    Material ATTACHED_MELON_STEM = getMaterial("attached_melon_stem");
    Material PUMPKIN_STEM = getMaterial("pumpkin_stem");
    Material MELON_STEM = getMaterial("melon_stem");
    Material WATER_CAULDRON = getMaterial("water_cauldron");
    Material LAVA_CAULDRON = getMaterial("lava_cauldron");
    Material POWDER_SNOW_CAULDRON = getMaterial("powder_snow_cauldron");
    Material END_PORTAL = getMaterial("end_portal");
    Material COCOA = getMaterial("cocoa");
    Material TRIPWIRE = getMaterial("tripwire");
    Material POTTED_OAK_SAPLING = getMaterial("potted_oak_sapling");
    Material POTTED_SPRUCE_SAPLING = getMaterial("potted_spruce_sapling");
    Material POTTED_BIRCH_SAPLING = getMaterial("potted_birch_sapling");
    Material POTTED_JUNGLE_SAPLING = getMaterial("potted_jungle_sapling");
    Material POTTED_ACACIA_SAPLING = getMaterial("potted_acacia_sapling");
    Material POTTED_DARK_OAK_SAPLING = getMaterial("potted_dark_oak_sapling");
    Material POTTED_FERN = getMaterial("potted_fern");
    Material POTTED_DANDELION = getMaterial("potted_dandelion");
    Material POTTED_POPPY = getMaterial("potted_poppy");
    Material POTTED_BLUE_ORCHID = getMaterial("potted_blue_orchid");
    Material POTTED_ALLIUM = getMaterial("potted_allium");
    Material POTTED_AZURE_BLUET = getMaterial("potted_azure_bluet");
    Material POTTED_RED_TULIP = getMaterial("potted_red_tulip");
    Material POTTED_ORANGE_TULIP = getMaterial("potted_orange_tulip");
    Material POTTED_WHITE_TULIP = getMaterial("potted_white_tulip");
    Material POTTED_PINK_TULIP = getMaterial("potted_pink_tulip");
    Material POTTED_OXEYE_DAISY = getMaterial("potted_oxeye_daisy");
    Material POTTED_CORNFLOWER = getMaterial("potted_cornflower");
    Material POTTED_LILY_OF_THE_VALLEY = getMaterial("potted_lily_of_the_valley");
    Material POTTED_WITHER_ROSE = getMaterial("potted_wither_rose");
    Material POTTED_RED_MUSHROOM = getMaterial("potted_red_mushroom");
    Material POTTED_BROWN_MUSHROOM = getMaterial("potted_brown_mushroom");
    Material POTTED_DEAD_BUSH = getMaterial("potted_dead_bush");
    Material POTTED_CACTUS = getMaterial("potted_cactus");
    Material CARROTS = getMaterial("carrots");
    Material POTATOES = getMaterial("potatoes");
    Material SKELETON_WALL_SKULL = getMaterial("skeleton_wall_skull");
    Material WITHER_SKELETON_WALL_SKULL = getMaterial("wither_skeleton_wall_skull");
    Material ZOMBIE_WALL_HEAD = getMaterial("zombie_wall_head");
    Material PLAYER_WALL_HEAD = getMaterial("player_wall_head");
    Material CREEPER_WALL_HEAD = getMaterial("creeper_wall_head");
    Material DRAGON_WALL_HEAD = getMaterial("dragon_wall_head");
    Material WHITE_WALL_BANNER = getMaterial("white_wall_banner");
    Material ORANGE_WALL_BANNER = getMaterial("orange_wall_banner");
    Material MAGENTA_WALL_BANNER = getMaterial("magenta_wall_banner");
    Material LIGHT_BLUE_WALL_BANNER = getMaterial("light_blue_wall_banner");
    Material YELLOW_WALL_BANNER = getMaterial("yellow_wall_banner");
    Material LIME_WALL_BANNER = getMaterial("lime_wall_banner");
    Material PINK_WALL_BANNER = getMaterial("pink_wall_banner");
    Material GRAY_WALL_BANNER = getMaterial("gray_wall_banner");
    Material LIGHT_GRAY_WALL_BANNER = getMaterial("light_gray_wall_banner");
    Material CYAN_WALL_BANNER = getMaterial("cyan_wall_banner");
    Material PURPLE_WALL_BANNER = getMaterial("purple_wall_banner");
    Material BLUE_WALL_BANNER = getMaterial("blue_wall_banner");
    Material BROWN_WALL_BANNER = getMaterial("brown_wall_banner");
    Material GREEN_WALL_BANNER = getMaterial("green_wall_banner");
    Material RED_WALL_BANNER = getMaterial("red_wall_banner");
    Material BLACK_WALL_BANNER = getMaterial("black_wall_banner");
    Material BEETROOTS = getMaterial("beetroots");
    Material END_GATEWAY = getMaterial("end_gateway");
    Material FROSTED_ICE = getMaterial("frosted_ice");
    Material KELP_PLANT = getMaterial("kelp_plant");
    Material DEAD_TUBE_CORAL_WALL_FAN = getMaterial("dead_tube_coral_wall_fan");
    Material DEAD_BRAIN_CORAL_WALL_FAN = getMaterial("dead_brain_coral_wall_fan");
    Material DEAD_BUBBLE_CORAL_WALL_FAN = getMaterial("dead_bubble_coral_wall_fan");
    Material DEAD_FIRE_CORAL_WALL_FAN = getMaterial("dead_fire_coral_wall_fan");
    Material DEAD_HORN_CORAL_WALL_FAN = getMaterial("dead_horn_coral_wall_fan");
    Material TUBE_CORAL_WALL_FAN = getMaterial("tube_coral_wall_fan");
    Material BRAIN_CORAL_WALL_FAN = getMaterial("brain_coral_wall_fan");
    Material BUBBLE_CORAL_WALL_FAN = getMaterial("bubble_coral_wall_fan");
    Material FIRE_CORAL_WALL_FAN = getMaterial("fire_coral_wall_fan");
    Material HORN_CORAL_WALL_FAN = getMaterial("horn_coral_wall_fan");
    Material BAMBOO_SAPLING = getMaterial("bamboo_sapling");
    Material POTTED_BAMBOO = getMaterial("potted_bamboo");
    Material VOID_AIR = getMaterial("void_air");
    Material CAVE_AIR = getMaterial("cave_air");
    Material BUBBLE_COLUMN = getMaterial("bubble_column");
    Material SWEET_BERRY_BUSH = getMaterial("sweet_berry_bush");
    Material WEEPING_VINES_PLANT = getMaterial("weeping_vines_plant");
    Material TWISTING_VINES_PLANT = getMaterial("twisting_vines_plant");
    Material CRIMSON_WALL_SIGN = getMaterial("crimson_wall_sign");
    Material WARPED_WALL_SIGN = getMaterial("warped_wall_sign");
    Material POTTED_CRIMSON_FUNGUS = getMaterial("potted_crimson_fungus");
    Material POTTED_WARPED_FUNGUS = getMaterial("potted_warped_fungus");
    Material POTTED_CRIMSON_ROOTS = getMaterial("potted_crimson_roots");
    Material POTTED_WARPED_ROOTS = getMaterial("potted_warped_roots");
    Material CANDLE_CAKE = getMaterial("candle_cake");
    Material WHITE_CANDLE_CAKE = getMaterial("white_candle_cake");
    Material ORANGE_CANDLE_CAKE = getMaterial("orange_candle_cake");
    Material MAGENTA_CANDLE_CAKE = getMaterial("magenta_candle_cake");
    Material LIGHT_BLUE_CANDLE_CAKE = getMaterial("light_blue_candle_cake");
    Material YELLOW_CANDLE_CAKE = getMaterial("yellow_candle_cake");
    Material LIME_CANDLE_CAKE = getMaterial("lime_candle_cake");
    Material PINK_CANDLE_CAKE = getMaterial("pink_candle_cake");
    Material GRAY_CANDLE_CAKE = getMaterial("gray_candle_cake");
    Material LIGHT_GRAY_CANDLE_CAKE = getMaterial("light_gray_candle_cake");
    Material CYAN_CANDLE_CAKE = getMaterial("cyan_candle_cake");
    Material PURPLE_CANDLE_CAKE = getMaterial("purple_candle_cake");
    Material BLUE_CANDLE_CAKE = getMaterial("blue_candle_cake");
    Material BROWN_CANDLE_CAKE = getMaterial("brown_candle_cake");
    Material GREEN_CANDLE_CAKE = getMaterial("green_candle_cake");
    Material RED_CANDLE_CAKE = getMaterial("red_candle_cake");
    Material BLACK_CANDLE_CAKE = getMaterial("black_candle_cake");
    Material POWDER_SNOW = getMaterial("powder_snow");
    Material CAVE_VINES = getMaterial("cave_vines");
    Material CAVE_VINES_PLANT = getMaterial("cave_vines_plant");
    Material BIG_DRIPLEAF_STEM = getMaterial("big_dripleaf_stem");
    Material POTTED_AZALEA_BUSH = getMaterial("potted_azalea_bush");
    Material POTTED_FLOWERING_AZALEA_BUSH = getMaterial("potted_flowering_azalea_bush");
    // ----- Legacy Separator -----
    @Deprecated
    Material LEGACY_AIR = Bukkit.getUnsafe().createLegacyMaterial("legacy_air", 0, 0, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone", 1, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GRASS = Bukkit.getUnsafe().createLegacyMaterial("legacy_grass", 2, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DIRT = Bukkit.getUnsafe().createLegacyMaterial("legacy_dirt", 3, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COBBLESTONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_cobblestone", 4, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood", 5, 64, (short) 0, org.bukkit.material.Wood.class);
    @Deprecated
    Material LEGACY_SAPLING = Bukkit.getUnsafe().createLegacyMaterial("legacy_sapling", 6, 64, (short) 0, org.bukkit.material.Sapling.class);
    @Deprecated
    Material LEGACY_BEDROCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_bedrock", 7, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WATER = Bukkit.getUnsafe().createLegacyMaterial("legacy_water", 8, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STATIONARY_WATER = Bukkit.getUnsafe().createLegacyMaterial("legacy_stationary_water", 9, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LAVA = Bukkit.getUnsafe().createLegacyMaterial("legacy_lava", 10, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STATIONARY_LAVA = Bukkit.getUnsafe().createLegacyMaterial("legacy_stationary_lava", 11, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SAND = Bukkit.getUnsafe().createLegacyMaterial("legacy_sand", 12, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GRAVEL = Bukkit.getUnsafe().createLegacyMaterial("legacy_gravel", 13, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_ore", 14, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_ore", 15, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COAL_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_coal_ore", 16, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LOG = Bukkit.getUnsafe().createLegacyMaterial("legacy_log", 17, 64, (short) 0, org.bukkit.material.Tree.class);
    @Deprecated
    Material LEGACY_LEAVES = Bukkit.getUnsafe().createLegacyMaterial("legacy_leaves", 18, 64, (short) 0, org.bukkit.material.Leaves.class);
    @Deprecated
    Material LEGACY_SPONGE = Bukkit.getUnsafe().createLegacyMaterial("legacy_sponge", 19, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GLASS = Bukkit.getUnsafe().createLegacyMaterial("legacy_glass", 20, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LAPIS_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_lapis_ore", 21, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LAPIS_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_lapis_block", 22, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DISPENSER = Bukkit.getUnsafe().createLegacyMaterial("legacy_dispenser", 23, 64, (short) 0, org.bukkit.material.Dispenser.class);
    @Deprecated
    Material LEGACY_SANDSTONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_sandstone", 24, 64, (short) 0, org.bukkit.material.Sandstone.class);
    @Deprecated
    Material LEGACY_NOTE_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_note_block", 25, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BED_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_bed_block", 26, 64, (short) 0, org.bukkit.material.Bed.class);
    @Deprecated
    Material LEGACY_POWERED_RAIL = Bukkit.getUnsafe().createLegacyMaterial("legacy_powered_rail", 27, 64, (short) 0, org.bukkit.material.PoweredRail.class);
    @Deprecated
    Material LEGACY_DETECTOR_RAIL = Bukkit.getUnsafe().createLegacyMaterial("legacy_detector_rail", 28, 64, (short) 0, org.bukkit.material.DetectorRail.class);
    @Deprecated
    Material LEGACY_PISTON_STICKY_BASE = Bukkit.getUnsafe().createLegacyMaterial("legacy_piston_sticky_base", 29, 64, (short) 0, org.bukkit.material.PistonBaseMaterial.class);
    @Deprecated
    Material LEGACY_WEB = Bukkit.getUnsafe().createLegacyMaterial("legacy_web", 30, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LONG_GRASS = Bukkit.getUnsafe().createLegacyMaterial("legacy_long_grass", 31, 64, (short) 0, org.bukkit.material.LongGrass.class);
    @Deprecated
    Material LEGACY_DEAD_BUSH = Bukkit.getUnsafe().createLegacyMaterial("legacy_dead_bush", 32, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PISTON_BASE = Bukkit.getUnsafe().createLegacyMaterial("legacy_piston_base", 33, 64, (short) 0, org.bukkit.material.PistonBaseMaterial.class);
    @Deprecated
    Material LEGACY_PISTON_EXTENSION = Bukkit.getUnsafe().createLegacyMaterial("legacy_piston_extension", 34, 64, (short) 0, org.bukkit.material.PistonExtensionMaterial.class);
    @Deprecated
    Material LEGACY_WOOL = Bukkit.getUnsafe().createLegacyMaterial("legacy_wool", 35, 64, (short) 0, org.bukkit.material.Wool.class);
    @Deprecated
    Material LEGACY_PISTON_MOVING_PIECE = Bukkit.getUnsafe().createLegacyMaterial("legacy_piston_moving_piece", 36, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_YELLOW_FLOWER = Bukkit.getUnsafe().createLegacyMaterial("legacy_yellow_flower", 37, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RED_ROSE = Bukkit.getUnsafe().createLegacyMaterial("legacy_red_rose", 38, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BROWN_MUSHROOM = Bukkit.getUnsafe().createLegacyMaterial("legacy_brown_mushroom", 39, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RED_MUSHROOM = Bukkit.getUnsafe().createLegacyMaterial("legacy_red_mushroom", 40, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_block", 41, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_block", 42, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DOUBLE_STEP = Bukkit.getUnsafe().createLegacyMaterial("legacy_double_step", 43, 64, (short) 0, org.bukkit.material.Step.class);
    @Deprecated
    Material LEGACY_STEP = Bukkit.getUnsafe().createLegacyMaterial("legacy_step", 44, 64, (short) 0, org.bukkit.material.Step.class);
    @Deprecated
    Material LEGACY_BRICK = Bukkit.getUnsafe().createLegacyMaterial("legacy_brick", 45, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_TNT = Bukkit.getUnsafe().createLegacyMaterial("legacy_tnt", 46, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOOKSHELF = Bukkit.getUnsafe().createLegacyMaterial("legacy_bookshelf", 47, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MOSSY_COBBLESTONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_mossy_cobblestone", 48, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_OBSIDIAN = Bukkit.getUnsafe().createLegacyMaterial("legacy_obsidian", 49, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_TORCH = Bukkit.getUnsafe().createLegacyMaterial("legacy_torch", 50, 64, (short) 0, org.bukkit.material.Torch.class);
    @Deprecated
    Material LEGACY_FIRE = Bukkit.getUnsafe().createLegacyMaterial("legacy_fire", 51, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MOB_SPAWNER = Bukkit.getUnsafe().createLegacyMaterial("legacy_mob_spawner", 52, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_stairs", 53, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_CHEST = Bukkit.getUnsafe().createLegacyMaterial("legacy_chest", 54, 64, (short) 0, org.bukkit.material.Chest.class);
    @Deprecated
    Material LEGACY_REDSTONE_WIRE = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_wire", 55, 64, (short) 0, org.bukkit.material.RedstoneWire.class);
    @Deprecated
    Material LEGACY_DIAMOND_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_ore", 56, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_block", 57, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WORKBENCH = Bukkit.getUnsafe().createLegacyMaterial("legacy_workbench", 58, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CROPS = Bukkit.getUnsafe().createLegacyMaterial("legacy_crops", 59, 64, (short) 0, org.bukkit.material.Crops.class);
    @Deprecated
    Material LEGACY_SOIL = Bukkit.getUnsafe().createLegacyMaterial("legacy_soil", 60, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FURNACE = Bukkit.getUnsafe().createLegacyMaterial("legacy_furnace", 61, 64, (short) 0, org.bukkit.material.Furnace.class);
    @Deprecated
    Material LEGACY_BURNING_FURNACE = Bukkit.getUnsafe().createLegacyMaterial("legacy_burning_furnace", 62, 64, (short) 0, org.bukkit.material.Furnace.class);
    @Deprecated
    Material LEGACY_SIGN_POST = Bukkit.getUnsafe().createLegacyMaterial("legacy_sign_post", 63, 64, (short) 0, org.bukkit.material.Sign.class);
    @Deprecated
    Material LEGACY_WOODEN_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_wooden_door", 64, 64, (short) 0, org.bukkit.material.Door.class);
    @Deprecated
    Material LEGACY_LADDER = Bukkit.getUnsafe().createLegacyMaterial("legacy_ladder", 65, 64, (short) 0, org.bukkit.material.Ladder.class);
    @Deprecated
    Material LEGACY_RAILS = Bukkit.getUnsafe().createLegacyMaterial("legacy_rails", 66, 64, (short) 0, org.bukkit.material.Rails.class);
    @Deprecated
    Material LEGACY_COBBLESTONE_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_cobblestone_stairs", 67, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_WALL_SIGN = Bukkit.getUnsafe().createLegacyMaterial("legacy_wall_sign", 68, 64, (short) 0, org.bukkit.material.Sign.class);
    @Deprecated
    Material LEGACY_LEVER = Bukkit.getUnsafe().createLegacyMaterial("legacy_lever", 69, 64, (short) 0, org.bukkit.material.Lever.class);
    @Deprecated
    Material LEGACY_STONE_PLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone_plate", 70, 64, (short) 0, org.bukkit.material.PressurePlate.class);
    @Deprecated
    Material LEGACY_IRON_DOOR_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_door_block", 71, 64, (short) 0, org.bukkit.material.Door.class);
    @Deprecated
    Material LEGACY_WOOD_PLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_plate", 72, 64, (short) 0, org.bukkit.material.PressurePlate.class);
    @Deprecated
    Material LEGACY_REDSTONE_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_ore", 73, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GLOWING_REDSTONE_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_glowing_redstone_ore", 74, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_REDSTONE_TORCH_OFF = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_torch_off", 75, 64, (short) 0, org.bukkit.material.RedstoneTorch.class);
    @Deprecated
    Material LEGACY_REDSTONE_TORCH_ON = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_torch_on", 76, 64, (short) 0, org.bukkit.material.RedstoneTorch.class);
    @Deprecated
    Material LEGACY_STONE_BUTTON = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone_button", 77, 64, (short) 0, org.bukkit.material.Button.class);
    @Deprecated
    Material LEGACY_SNOW = Bukkit.getUnsafe().createLegacyMaterial("legacy_snow", 78, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ICE = Bukkit.getUnsafe().createLegacyMaterial("legacy_ice", 79, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SNOW_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_snow_block", 80, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CACTUS = Bukkit.getUnsafe().createLegacyMaterial("legacy_cactus", 81, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CLAY = Bukkit.getUnsafe().createLegacyMaterial("legacy_clay", 82, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SUGAR_CANE_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_sugar_cane_block", 83, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_JUKEBOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_jukebox", 84, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FENCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_fence", 85, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PUMPKIN = Bukkit.getUnsafe().createLegacyMaterial("legacy_pumpkin", 86, 64, (short) 0, org.bukkit.material.Pumpkin.class);
    @Deprecated
    Material LEGACY_NETHERRACK = Bukkit.getUnsafe().createLegacyMaterial("legacy_netherrack", 87, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SOUL_SAND = Bukkit.getUnsafe().createLegacyMaterial("legacy_soul_sand", 88, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GLOWSTONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_glowstone", 89, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PORTAL = Bukkit.getUnsafe().createLegacyMaterial("legacy_portal", 90, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_JACK_O_LANTERN = Bukkit.getUnsafe().createLegacyMaterial("legacy_jack_o_lantern", 91, 64, (short) 0, org.bukkit.material.Pumpkin.class);
    @Deprecated
    Material LEGACY_CAKE_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_cake_block", 92, 64, (short) 0, org.bukkit.material.Cake.class);
    @Deprecated
    Material LEGACY_DIODE_BLOCK_OFF = Bukkit.getUnsafe().createLegacyMaterial("legacy_diode_block_off", 93, 64, (short) 0, org.bukkit.material.Diode.class);
    @Deprecated
    Material LEGACY_DIODE_BLOCK_ON = Bukkit.getUnsafe().createLegacyMaterial("legacy_diode_block_on", 94, 64, (short) 0, org.bukkit.material.Diode.class);
    @Deprecated
    Material LEGACY_STAINED_GLASS = Bukkit.getUnsafe().createLegacyMaterial("legacy_stained_glass", 95, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_TRAP_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_trap_door", 96, 64, (short) 0, org.bukkit.material.TrapDoor.class);
    @Deprecated
    Material LEGACY_MONSTER_EGGS = Bukkit.getUnsafe().createLegacyMaterial("legacy_monster_eggs", 97, 64, (short) 0, org.bukkit.material.MonsterEggs.class);
    @Deprecated
    Material LEGACY_SMOOTH_BRICK = Bukkit.getUnsafe().createLegacyMaterial("legacy_smooth_brick", 98, 64, (short) 0, org.bukkit.material.SmoothBrick.class);
    @Deprecated
    Material LEGACY_HUGE_MUSHROOM_1 = Bukkit.getUnsafe().createLegacyMaterial("legacy_huge_mushroom_1", 99, 64, (short) 0, org.bukkit.material.Mushroom.class);
    @Deprecated
    Material LEGACY_HUGE_MUSHROOM_2 = Bukkit.getUnsafe().createLegacyMaterial("legacy_huge_mushroom_2", 100, 64, (short) 0, org.bukkit.material.Mushroom.class);
    @Deprecated
    Material LEGACY_IRON_FENCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_fence", 101, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_THIN_GLASS = Bukkit.getUnsafe().createLegacyMaterial("legacy_thin_glass", 102, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MELON_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_melon_block", 103, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PUMPKIN_STEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_pumpkin_stem", 104, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MELON_STEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_melon_stem", 105, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_VINE = Bukkit.getUnsafe().createLegacyMaterial("legacy_vine", 106, 64, (short) 0, org.bukkit.material.Vine.class);
    @Deprecated
    Material LEGACY_FENCE_GATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_fence_gate", 107, 64, (short) 0, org.bukkit.material.Gate.class);
    @Deprecated
    Material LEGACY_BRICK_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_brick_stairs", 108, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_SMOOTH_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_smooth_stairs", 109, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_MYCEL = Bukkit.getUnsafe().createLegacyMaterial("legacy_mycel", 110, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WATER_LILY = Bukkit.getUnsafe().createLegacyMaterial("legacy_water_lily", 111, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_NETHER_BRICK = Bukkit.getUnsafe().createLegacyMaterial("legacy_nether_brick", 112, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_NETHER_FENCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_nether_fence", 113, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_NETHER_BRICK_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_nether_brick_stairs", 114, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_NETHER_WARTS = Bukkit.getUnsafe().createLegacyMaterial("legacy_nether_warts", 115, 64, (short) 0, org.bukkit.material.NetherWarts.class);
    @Deprecated
    Material LEGACY_ENCHANTMENT_TABLE = Bukkit.getUnsafe().createLegacyMaterial("legacy_enchantment_table", 116, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BREWING_STAND = Bukkit.getUnsafe().createLegacyMaterial("legacy_brewing_stand", 117, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CAULDRON = Bukkit.getUnsafe().createLegacyMaterial("legacy_cauldron", 118, 64, (short) 0, org.bukkit.material.Cauldron.class);
    @Deprecated
    Material LEGACY_ENDER_PORTAL = Bukkit.getUnsafe().createLegacyMaterial("legacy_ender_portal", 119, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ENDER_PORTAL_FRAME = Bukkit.getUnsafe().createLegacyMaterial("legacy_ender_portal_frame", 120, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ENDER_STONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_ender_stone", 121, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DRAGON_EGG = Bukkit.getUnsafe().createLegacyMaterial("legacy_dragon_egg", 122, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_REDSTONE_LAMP_OFF = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_lamp_off", 123, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_REDSTONE_LAMP_ON = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_lamp_on", 124, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD_DOUBLE_STEP = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_double_step", 125, 64, (short) 0, org.bukkit.material.Wood.class);
    @Deprecated
    Material LEGACY_WOOD_STEP = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_step", 126, 64, (short) 0, org.bukkit.material.WoodenStep.class);
    @Deprecated
    Material LEGACY_COCOA = Bukkit.getUnsafe().createLegacyMaterial("legacy_cocoa", 127, 64, (short) 0, org.bukkit.material.CocoaPlant.class);
    @Deprecated
    Material LEGACY_SANDSTONE_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_sandstone_stairs", 128, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_EMERALD_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_emerald_ore", 129, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ENDER_CHEST = Bukkit.getUnsafe().createLegacyMaterial("legacy_ender_chest", 130, 64, (short) 0, org.bukkit.material.EnderChest.class);
    @Deprecated
    Material LEGACY_TRIPWIRE_HOOK = Bukkit.getUnsafe().createLegacyMaterial("legacy_tripwire_hook", 131, 64, (short) 0, org.bukkit.material.TripwireHook.class);
    @Deprecated
    Material LEGACY_TRIPWIRE = Bukkit.getUnsafe().createLegacyMaterial("legacy_tripwire", 132, 64, (short) 0, org.bukkit.material.Tripwire.class);
    @Deprecated
    Material LEGACY_EMERALD_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_emerald_block", 133, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SPRUCE_WOOD_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_spruce_wood_stairs", 134, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_BIRCH_WOOD_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_birch_wood_stairs", 135, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_JUNGLE_WOOD_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_jungle_wood_stairs", 136, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_COMMAND = Bukkit.getUnsafe().createLegacyMaterial("legacy_command", 137, 64, (short) 0, org.bukkit.material.Command.class);
    @Deprecated
    Material LEGACY_BEACON = Bukkit.getUnsafe().createLegacyMaterial("legacy_beacon", 138, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COBBLE_WALL = Bukkit.getUnsafe().createLegacyMaterial("legacy_cobble_wall", 139, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FLOWER_POT = Bukkit.getUnsafe().createLegacyMaterial("legacy_flower_pot", 140, 64, (short) 0, org.bukkit.material.FlowerPot.class);
    @Deprecated
    Material LEGACY_CARROT = Bukkit.getUnsafe().createLegacyMaterial("legacy_carrot", 141, 64, (short) 0, org.bukkit.material.Crops.class);
    @Deprecated
    Material LEGACY_POTATO = Bukkit.getUnsafe().createLegacyMaterial("legacy_potato", 142, 64, (short) 0, org.bukkit.material.Crops.class);
    @Deprecated
    Material LEGACY_WOOD_BUTTON = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_button", 143, 64, (short) 0, org.bukkit.material.Button.class);
    @Deprecated
    Material LEGACY_SKULL = Bukkit.getUnsafe().createLegacyMaterial("legacy_skull", 144, 64, (short) 0, org.bukkit.material.Skull.class);
    @Deprecated
    Material LEGACY_ANVIL = Bukkit.getUnsafe().createLegacyMaterial("legacy_anvil", 145, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_TRAPPED_CHEST = Bukkit.getUnsafe().createLegacyMaterial("legacy_trapped_chest", 146, 64, (short) 0, org.bukkit.material.Chest.class);
    @Deprecated
    Material LEGACY_GOLD_PLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_plate", 147, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_PLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_plate", 148, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_REDSTONE_COMPARATOR_OFF = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_comparator_off", 149, 64, (short) 0, org.bukkit.material.Comparator.class);
    @Deprecated
    Material LEGACY_REDSTONE_COMPARATOR_ON = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_comparator_on", 150, 64, (short) 0, org.bukkit.material.Comparator.class);
    @Deprecated
    Material LEGACY_DAYLIGHT_DETECTOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_daylight_detector", 151, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_REDSTONE_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_block", 152, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_QUARTZ_ORE = Bukkit.getUnsafe().createLegacyMaterial("legacy_quartz_ore", 153, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_HOPPER = Bukkit.getUnsafe().createLegacyMaterial("legacy_hopper", 154, 64, (short) 0, org.bukkit.material.Hopper.class);
    @Deprecated
    Material LEGACY_QUARTZ_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_quartz_block", 155, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_QUARTZ_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_quartz_stairs", 156, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_ACTIVATOR_RAIL = Bukkit.getUnsafe().createLegacyMaterial("legacy_activator_rail", 157, 64, (short) 0, org.bukkit.material.PoweredRail.class);
    @Deprecated
    Material LEGACY_DROPPER = Bukkit.getUnsafe().createLegacyMaterial("legacy_dropper", 158, 64, (short) 0, org.bukkit.material.Dispenser.class);
    @Deprecated
    Material LEGACY_STAINED_CLAY = Bukkit.getUnsafe().createLegacyMaterial("legacy_stained_clay", 159, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STAINED_GLASS_PANE = Bukkit.getUnsafe().createLegacyMaterial("legacy_stained_glass_pane", 160, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LEAVES_2 = Bukkit.getUnsafe().createLegacyMaterial("legacy_leaves_2", 161, 64, (short) 0, org.bukkit.material.Leaves.class);
    @Deprecated
    Material LEGACY_LOG_2 = Bukkit.getUnsafe().createLegacyMaterial("legacy_log_2", 162, 64, (short) 0, org.bukkit.material.Tree.class);
    @Deprecated
    Material LEGACY_ACACIA_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_acacia_stairs", 163, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_DARK_OAK_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_dark_oak_stairs", 164, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_SLIME_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_slime_block", 165, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BARRIER = Bukkit.getUnsafe().createLegacyMaterial("legacy_barrier", 166, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_TRAPDOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_trapdoor", 167, 64, (short) 0, org.bukkit.material.TrapDoor.class);
    @Deprecated
    Material LEGACY_PRISMARINE = Bukkit.getUnsafe().createLegacyMaterial("legacy_prismarine", 168, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SEA_LANTERN = Bukkit.getUnsafe().createLegacyMaterial("legacy_sea_lantern", 169, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_HAY_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_hay_block", 170, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CARPET = Bukkit.getUnsafe().createLegacyMaterial("legacy_carpet", 171, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_HARD_CLAY = Bukkit.getUnsafe().createLegacyMaterial("legacy_hard_clay", 172, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COAL_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_coal_block", 173, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PACKED_ICE = Bukkit.getUnsafe().createLegacyMaterial("legacy_packed_ice", 174, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DOUBLE_PLANT = Bukkit.getUnsafe().createLegacyMaterial("legacy_double_plant", 175, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STANDING_BANNER = Bukkit.getUnsafe().createLegacyMaterial("legacy_standing_banner", 176, 64, (short) 0, org.bukkit.material.Banner.class);
    @Deprecated
    Material LEGACY_WALL_BANNER = Bukkit.getUnsafe().createLegacyMaterial("legacy_wall_banner", 177, 64, (short) 0, org.bukkit.material.Banner.class);
    @Deprecated
    Material LEGACY_DAYLIGHT_DETECTOR_INVERTED = Bukkit.getUnsafe().createLegacyMaterial("legacy_daylight_detector_inverted", 178, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RED_SANDSTONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_red_sandstone", 179, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RED_SANDSTONE_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_red_sandstone_stairs", 180, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_DOUBLE_STONE_SLAB2 = Bukkit.getUnsafe().createLegacyMaterial("legacy_double_stone_slab2", 181, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STONE_SLAB2 = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone_slab2", 182, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SPRUCE_FENCE_GATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_spruce_fence_gate", 183, 64, (short) 0, org.bukkit.material.Gate.class);
    @Deprecated
    Material LEGACY_BIRCH_FENCE_GATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_birch_fence_gate", 184, 64, (short) 0, org.bukkit.material.Gate.class);
    @Deprecated
    Material LEGACY_JUNGLE_FENCE_GATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_jungle_fence_gate", 185, 64, (short) 0, org.bukkit.material.Gate.class);
    @Deprecated
    Material LEGACY_DARK_OAK_FENCE_GATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_dark_oak_fence_gate", 186, 64, (short) 0, org.bukkit.material.Gate.class);
    @Deprecated
    Material LEGACY_ACACIA_FENCE_GATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_acacia_fence_gate", 187, 64, (short) 0, org.bukkit.material.Gate.class);
    @Deprecated
    Material LEGACY_SPRUCE_FENCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_spruce_fence", 188, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BIRCH_FENCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_birch_fence", 189, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_JUNGLE_FENCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_jungle_fence", 190, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DARK_OAK_FENCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_dark_oak_fence", 191, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ACACIA_FENCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_acacia_fence", 192, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SPRUCE_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_spruce_door", 193, 64, (short) 0, org.bukkit.material.Door.class);
    @Deprecated
    Material LEGACY_BIRCH_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_birch_door", 194, 64, (short) 0, org.bukkit.material.Door.class);
    @Deprecated
    Material LEGACY_JUNGLE_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_jungle_door", 195, 64, (short) 0, org.bukkit.material.Door.class);
    @Deprecated
    Material LEGACY_ACACIA_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_acacia_door", 196, 64, (short) 0, org.bukkit.material.Door.class);
    @Deprecated
    Material LEGACY_DARK_OAK_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_dark_oak_door", 197, 64, (short) 0, org.bukkit.material.Door.class);
    @Deprecated
    Material LEGACY_END_ROD = Bukkit.getUnsafe().createLegacyMaterial("legacy_end_rod", 198, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CHORUS_PLANT = Bukkit.getUnsafe().createLegacyMaterial("legacy_chorus_plant", 199, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CHORUS_FLOWER = Bukkit.getUnsafe().createLegacyMaterial("legacy_chorus_flower", 200, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PURPUR_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_purpur_block", 201, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PURPUR_PILLAR = Bukkit.getUnsafe().createLegacyMaterial("legacy_purpur_pillar", 202, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PURPUR_STAIRS = Bukkit.getUnsafe().createLegacyMaterial("legacy_purpur_stairs", 203, 64, (short) 0, org.bukkit.material.Stairs.class);
    @Deprecated
    Material LEGACY_PURPUR_DOUBLE_SLAB = Bukkit.getUnsafe().createLegacyMaterial("legacy_purpur_double_slab", 204, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PURPUR_SLAB = Bukkit.getUnsafe().createLegacyMaterial("legacy_purpur_slab", 205, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_END_BRICKS = Bukkit.getUnsafe().createLegacyMaterial("legacy_end_bricks", 206, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BEETROOT_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_beetroot_block", 207, 64, (short) 0, org.bukkit.material.Crops.class);
    @Deprecated
    Material LEGACY_GRASS_PATH = Bukkit.getUnsafe().createLegacyMaterial("legacy_grass_path", 208, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_END_GATEWAY = Bukkit.getUnsafe().createLegacyMaterial("legacy_end_gateway", 209, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COMMAND_REPEATING = Bukkit.getUnsafe().createLegacyMaterial("legacy_command_repeating", 210, 64, (short) 0, org.bukkit.material.Command.class);
    @Deprecated
    Material LEGACY_COMMAND_CHAIN = Bukkit.getUnsafe().createLegacyMaterial("legacy_command_chain", 211, 64, (short) 0, org.bukkit.material.Command.class);
    @Deprecated
    Material LEGACY_FROSTED_ICE = Bukkit.getUnsafe().createLegacyMaterial("legacy_frosted_ice", 212, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MAGMA = Bukkit.getUnsafe().createLegacyMaterial("legacy_magma", 213, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_NETHER_WART_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_nether_wart_block", 214, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RED_NETHER_BRICK = Bukkit.getUnsafe().createLegacyMaterial("legacy_red_nether_brick", 215, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BONE_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_bone_block", 216, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STRUCTURE_VOID = Bukkit.getUnsafe().createLegacyMaterial("legacy_structure_void", 217, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_OBSERVER = Bukkit.getUnsafe().createLegacyMaterial("legacy_observer", 218, 64, (short) 0, org.bukkit.material.Observer.class);
    @Deprecated
    Material LEGACY_WHITE_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_white_shulker_box", 219, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ORANGE_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_orange_shulker_box", 220, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MAGENTA_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_magenta_shulker_box", 221, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LIGHT_BLUE_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_light_blue_shulker_box", 222, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_YELLOW_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_yellow_shulker_box", 223, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LIME_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_lime_shulker_box", 224, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PINK_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_pink_shulker_box", 225, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GRAY_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_gray_shulker_box", 226, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SILVER_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_silver_shulker_box", 227, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CYAN_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_cyan_shulker_box", 228, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PURPLE_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_purple_shulker_box", 229, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BLUE_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_blue_shulker_box", 230, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BROWN_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_brown_shulker_box", 231, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GREEN_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_green_shulker_box", 232, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RED_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_red_shulker_box", 233, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BLACK_SHULKER_BOX = Bukkit.getUnsafe().createLegacyMaterial("legacy_black_shulker_box", 234, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WHITE_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_white_glazed_terracotta", 235, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ORANGE_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_orange_glazed_terracotta", 236, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MAGENTA_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_magenta_glazed_terracotta", 237, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LIGHT_BLUE_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_light_blue_glazed_terracotta", 238, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_YELLOW_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_yellow_glazed_terracotta", 239, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LIME_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_lime_glazed_terracotta", 240, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PINK_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_pink_glazed_terracotta", 241, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GRAY_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_gray_glazed_terracotta", 242, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SILVER_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_silver_glazed_terracotta", 243, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CYAN_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_cyan_glazed_terracotta", 244, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PURPLE_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_purple_glazed_terracotta", 245, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BLUE_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_blue_glazed_terracotta", 246, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BROWN_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_brown_glazed_terracotta", 247, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GREEN_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_green_glazed_terracotta", 248, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RED_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_red_glazed_terracotta", 249, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BLACK_GLAZED_TERRACOTTA = Bukkit.getUnsafe().createLegacyMaterial("legacy_black_glazed_terracotta", 250, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CONCRETE = Bukkit.getUnsafe().createLegacyMaterial("legacy_concrete", 251, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CONCRETE_POWDER = Bukkit.getUnsafe().createLegacyMaterial("legacy_concrete_powder", 252, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STRUCTURE_BLOCK = Bukkit.getUnsafe().createLegacyMaterial("legacy_structure_block", 255, 64, (short) 0, MaterialData.class);
    // ----- Item Separator -----
    @Deprecated
    Material LEGACY_IRON_SPADE = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_spade", 256, 1, (short) 250, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_PICKAXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_pickaxe", 257, 1, (short) 250, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_AXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_axe", 258, 1, (short) 250, MaterialData.class);
    @Deprecated
    Material LEGACY_FLINT_AND_STEEL = Bukkit.getUnsafe().createLegacyMaterial("legacy_flint_and_steel", 259, 1, (short) 64, MaterialData.class);
    @Deprecated
    Material LEGACY_APPLE = Bukkit.getUnsafe().createLegacyMaterial("legacy_apple", 260, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOW = Bukkit.getUnsafe().createLegacyMaterial("legacy_bow", 261, 1, (short) 384, MaterialData.class);
    @Deprecated
    Material LEGACY_ARROW = Bukkit.getUnsafe().createLegacyMaterial("legacy_arrow", 262, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COAL = Bukkit.getUnsafe().createLegacyMaterial("legacy_coal", 263, 64, (short) 0, org.bukkit.material.Coal.class);
    @Deprecated
    Material LEGACY_DIAMOND = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond", 264, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_INGOT = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_ingot", 265, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_INGOT = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_ingot", 266, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_SWORD = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_sword", 267, 1, (short) 250, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD_SWORD = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_sword", 268, 1, (short) 59, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD_SPADE = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_spade", 269, 1, (short) 59, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD_PICKAXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_pickaxe", 270, 1, (short) 59, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD_AXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_axe", 271, 1, (short) 59, MaterialData.class);
    @Deprecated
    Material LEGACY_STONE_SWORD = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone_sword", 272, 1, (short) 131, MaterialData.class);
    @Deprecated
    Material LEGACY_STONE_SPADE = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone_spade", 273, 1, (short) 131, MaterialData.class);
    @Deprecated
    Material LEGACY_STONE_PICKAXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone_pickaxe", 274, 1, (short) 131, MaterialData.class);
    @Deprecated
    Material LEGACY_STONE_AXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone_axe", 275, 1, (short) 131, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_SWORD = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_sword", 276, 1, (short) 1561, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_SPADE = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_spade", 277, 1, (short) 1561, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_PICKAXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_pickaxe", 278, 1, (short) 1561, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_AXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_axe", 279, 1, (short) 1561, MaterialData.class);
    @Deprecated
    Material LEGACY_STICK = Bukkit.getUnsafe().createLegacyMaterial("legacy_stick", 280, 1, (short) 1561, MaterialData.class);
    @Deprecated
    Material LEGACY_BOWL = Bukkit.getUnsafe().createLegacyMaterial("legacy_bowl", 281, 1, (short) 1561, MaterialData.class);
    @Deprecated
    Material LEGACY_MUSHROOM_SOUP = Bukkit.getUnsafe().createLegacyMaterial("legacy_mushroom_soup", 282, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_SWORD = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_sword", 283, 1, (short) 32, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_SPADE = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_spade", 284, 1, (short) 32, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_PICKAXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_pickaxe", 285, 1, (short) 32, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_AXE = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_axe", 286, 1, (short) 32, MaterialData.class);
    @Deprecated
    Material LEGACY_STRING = Bukkit.getUnsafe().createLegacyMaterial("legacy_string", 287, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FEATHER = Bukkit.getUnsafe().createLegacyMaterial("legacy_feather", 288, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SULPHUR = Bukkit.getUnsafe().createLegacyMaterial("legacy_sulphur", 289, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD_HOE = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_hoe", 290, 1, (short) 59, MaterialData.class);
    @Deprecated
    Material LEGACY_STONE_HOE = Bukkit.getUnsafe().createLegacyMaterial("legacy_stone_hoe", 291, 1, (short) 131, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_HOE = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_hoe", 292, 1, (short) 250, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_HOE = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_hoe", 293, 1, (short) 1561, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_HOE = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_hoe", 294, 1, (short) 32, MaterialData.class);
    @Deprecated
    Material LEGACY_SEEDS = Bukkit.getUnsafe().createLegacyMaterial("legacy_seeds", 295, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WHEAT = Bukkit.getUnsafe().createLegacyMaterial("legacy_wheat", 296, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BREAD = Bukkit.getUnsafe().createLegacyMaterial("legacy_bread", 297, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LEATHER_HELMET = Bukkit.getUnsafe().createLegacyMaterial("legacy_leather_helmet", 298, 1, (short) 55, MaterialData.class);
    @Deprecated
    Material LEGACY_LEATHER_CHESTPLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_leather_chestplate", 299, 1, (short) 80, MaterialData.class);
    @Deprecated
    Material LEGACY_LEATHER_LEGGINGS = Bukkit.getUnsafe().createLegacyMaterial("legacy_leather_leggings", 300, 1, (short) 75, MaterialData.class);
    @Deprecated
    Material LEGACY_LEATHER_BOOTS = Bukkit.getUnsafe().createLegacyMaterial("legacy_leather_boots", 301, 1, (short) 65, MaterialData.class);
    @Deprecated
    Material LEGACY_CHAINMAIL_HELMET = Bukkit.getUnsafe().createLegacyMaterial("legacy_chainmail_helmet", 302, 1, (short) 165, MaterialData.class);
    @Deprecated
    Material LEGACY_CHAINMAIL_CHESTPLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_chainmail_chestplate", 303, 1, (short) 240, MaterialData.class);
    @Deprecated
    Material LEGACY_CHAINMAIL_LEGGINGS = Bukkit.getUnsafe().createLegacyMaterial("legacy_chainmail_leggings", 304, 1, (short) 225, MaterialData.class);
    @Deprecated
    Material LEGACY_CHAINMAIL_BOOTS = Bukkit.getUnsafe().createLegacyMaterial("legacy_chainmail_boots", 305, 1, (short) 195, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_HELMET = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_helmet", 306, 1, (short) 165, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_CHESTPLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_chestplate", 307, 1, (short) 240, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_LEGGINGS = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_leggings", 308, 1, (short) 255, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_BOOTS = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_boots", 309, 1, (short) 195, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_HELMET = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_helmet", 310, 1, (short) 363, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_CHESTPLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_chestplate", 311, 1, (short) 528, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_LEGGINGS = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_leggings", 312, 1, (short) 495, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_BOOTS = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_boots", 313, 1, (short) 429, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_HELMET = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_helmet", 314, 1, (short) 77, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_CHESTPLATE = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_chestplate", 315, 1, (short) 112, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_LEGGINGS = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_leggings", 316, 1, (short) 105, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_BOOTS = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_boots", 317, 1, (short) 91, MaterialData.class);
    @Deprecated
    Material LEGACY_FLINT = Bukkit.getUnsafe().createLegacyMaterial("legacy_flint", 318, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PORK = Bukkit.getUnsafe().createLegacyMaterial("legacy_pork", 319, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GRILLED_PORK = Bukkit.getUnsafe().createLegacyMaterial("legacy_grilled_pork", 320, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PAINTING = Bukkit.getUnsafe().createLegacyMaterial("legacy_painting", 321, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLDEN_APPLE = Bukkit.getUnsafe().createLegacyMaterial("legacy_golden_apple", 322, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SIGN = Bukkit.getUnsafe().createLegacyMaterial("legacy_sign", 323, 16, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WOOD_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_wood_door", 324, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BUCKET = Bukkit.getUnsafe().createLegacyMaterial("legacy_bucket", 325, 16, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WATER_BUCKET = Bukkit.getUnsafe().createLegacyMaterial("legacy_water_bucket", 326, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LAVA_BUCKET = Bukkit.getUnsafe().createLegacyMaterial("legacy_lava_bucket", 327, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MINECART = Bukkit.getUnsafe().createLegacyMaterial("legacy_minecart", 328, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SADDLE = Bukkit.getUnsafe().createLegacyMaterial("legacy_saddle", 329, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_DOOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_door", 330, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_REDSTONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone", 331, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SNOW_BALL = Bukkit.getUnsafe().createLegacyMaterial("legacy_snow_ball", 332, 16, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOAT = Bukkit.getUnsafe().createLegacyMaterial("legacy_boat", 333, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LEATHER = Bukkit.getUnsafe().createLegacyMaterial("legacy_leather", 334, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MILK_BUCKET = Bukkit.getUnsafe().createLegacyMaterial("legacy_milk_bucket", 335, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CLAY_BRICK = Bukkit.getUnsafe().createLegacyMaterial("legacy_clay_brick", 336, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CLAY_BALL = Bukkit.getUnsafe().createLegacyMaterial("legacy_clay_ball", 337, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SUGAR_CANE = Bukkit.getUnsafe().createLegacyMaterial("legacy_sugar_cane", 338, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PAPER = Bukkit.getUnsafe().createLegacyMaterial("legacy_paper", 339, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOOK = Bukkit.getUnsafe().createLegacyMaterial("legacy_book", 340, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SLIME_BALL = Bukkit.getUnsafe().createLegacyMaterial("legacy_slime_ball", 341, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_STORAGE_MINECART = Bukkit.getUnsafe().createLegacyMaterial("legacy_storage_minecart", 342, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_POWERED_MINECART = Bukkit.getUnsafe().createLegacyMaterial("legacy_powered_minecart", 343, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_EGG = Bukkit.getUnsafe().createLegacyMaterial("legacy_egg", 344, 16, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COMPASS = Bukkit.getUnsafe().createLegacyMaterial("legacy_compass", 345, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FISHING_ROD = Bukkit.getUnsafe().createLegacyMaterial("legacy_fishing_rod", 346, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WATCH = Bukkit.getUnsafe().createLegacyMaterial("legacy_watch", 347, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GLOWSTONE_DUST = Bukkit.getUnsafe().createLegacyMaterial("legacy_glowstone_dust", 348, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RAW_FISH = Bukkit.getUnsafe().createLegacyMaterial("legacy_raw_fish", 349, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COOKED_FISH = Bukkit.getUnsafe().createLegacyMaterial("legacy_cooked_fish", 350, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_INK_SACK = Bukkit.getUnsafe().createLegacyMaterial("legacy_ink_sack", 351, 64, (short) 0, org.bukkit.material.Dye.class);
    @Deprecated
    Material LEGACY_BONE = Bukkit.getUnsafe().createLegacyMaterial("legacy_bone", 352, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SUGAR = Bukkit.getUnsafe().createLegacyMaterial("legacy_sugar", 353, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CAKE = Bukkit.getUnsafe().createLegacyMaterial("legacy_cake", 354, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BED = Bukkit.getUnsafe().createLegacyMaterial("legacy_bed", 355, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DIODE = Bukkit.getUnsafe().createLegacyMaterial("legacy_diode", 356, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COOKIE = Bukkit.getUnsafe().createLegacyMaterial("legacy_cookie", 357, 64, (short) 0, MaterialData.class);
    /**
     * @see org.bukkit.map.MapView
     */
    @Deprecated
    Material LEGACY_MAP = Bukkit.getUnsafe().createLegacyMaterial("legacy_map", 358, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SHEARS = Bukkit.getUnsafe().createLegacyMaterial("legacy_shears", 359, 1, (short) 238, MaterialData.class);
    @Deprecated
    Material LEGACY_MELON = Bukkit.getUnsafe().createLegacyMaterial("legacy_melon", 360, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PUMPKIN_SEEDS = Bukkit.getUnsafe().createLegacyMaterial("legacy_pumpkin_seeds", 361, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MELON_SEEDS = Bukkit.getUnsafe().createLegacyMaterial("legacy_melon_seeds", 362, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RAW_BEEF = Bukkit.getUnsafe().createLegacyMaterial("legacy_raw_beef", 363, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COOKED_BEEF = Bukkit.getUnsafe().createLegacyMaterial("legacy_cooked_beef", 364, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RAW_CHICKEN = Bukkit.getUnsafe().createLegacyMaterial("legacy_raw_chicken", 365, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COOKED_CHICKEN = Bukkit.getUnsafe().createLegacyMaterial("legacy_cooked_chicken", 366, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ROTTEN_FLESH = Bukkit.getUnsafe().createLegacyMaterial("legacy_rotten_flesh", 367, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ENDER_PEARL = Bukkit.getUnsafe().createLegacyMaterial("legacy_ender_pearl", 368, 16, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BLAZE_ROD = Bukkit.getUnsafe().createLegacyMaterial("legacy_blaze_rod", 369, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GHAST_TEAR = Bukkit.getUnsafe().createLegacyMaterial("legacy_ghast_tear", 370, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_NUGGET = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_nugget", 371, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_NETHER_STALK = Bukkit.getUnsafe().createLegacyMaterial("legacy_nether_stalk", 372, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_POTION = Bukkit.getUnsafe().createLegacyMaterial("legacy_potion", 373, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GLASS_BOTTLE = Bukkit.getUnsafe().createLegacyMaterial("legacy_glass_bottle", 374, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SPIDER_EYE = Bukkit.getUnsafe().createLegacyMaterial("legacy_spider_eye", 375, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FERMENTED_SPIDER_EYE = Bukkit.getUnsafe().createLegacyMaterial("legacy_fermented_spider_eye", 376, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BLAZE_POWDER = Bukkit.getUnsafe().createLegacyMaterial("legacy_blaze_powder", 377, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MAGMA_CREAM = Bukkit.getUnsafe().createLegacyMaterial("legacy_magma_cream", 378, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BREWING_STAND_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_brewing_stand_item", 379, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CAULDRON_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_cauldron_item", 380, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_EYE_OF_ENDER = Bukkit.getUnsafe().createLegacyMaterial("legacy_eye_of_ender", 381, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SPECKLED_MELON = Bukkit.getUnsafe().createLegacyMaterial("legacy_speckled_melon", 382, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MONSTER_EGG = Bukkit.getUnsafe().createLegacyMaterial("legacy_monster_egg", 383, 64, (short) 0, org.bukkit.material.SpawnEgg.class);
    @Deprecated
    Material LEGACY_EXP_BOTTLE = Bukkit.getUnsafe().createLegacyMaterial("legacy_exp_bottle", 384, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FIREBALL = Bukkit.getUnsafe().createLegacyMaterial("legacy_fireball", 385, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOOK_AND_QUILL = Bukkit.getUnsafe().createLegacyMaterial("legacy_book_and_quill", 386, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_WRITTEN_BOOK = Bukkit.getUnsafe().createLegacyMaterial("legacy_written_book", 387, 16, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_EMERALD = Bukkit.getUnsafe().createLegacyMaterial("legacy_emerald", 388, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ITEM_FRAME = Bukkit.getUnsafe().createLegacyMaterial("legacy_item_frame", 389, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FLOWER_POT_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_flower_pot_item", 390, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CARROT_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_carrot_item", 391, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_POTATO_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_potato_item", 392, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BAKED_POTATO = Bukkit.getUnsafe().createLegacyMaterial("legacy_baked_potato", 393, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_POISONOUS_POTATO = Bukkit.getUnsafe().createLegacyMaterial("legacy_poisonous_potato", 394, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_EMPTY_MAP = Bukkit.getUnsafe().createLegacyMaterial("legacy_empty_map", 395, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLDEN_CARROT = Bukkit.getUnsafe().createLegacyMaterial("legacy_golden_carrot", 396, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SKULL_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_skull_item", 397, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CARROT_STICK = Bukkit.getUnsafe().createLegacyMaterial("legacy_carrot_stick", 398, 1, (short) 25, MaterialData.class);
    @Deprecated
    Material LEGACY_NETHER_STAR = Bukkit.getUnsafe().createLegacyMaterial("legacy_nether_star", 399, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PUMPKIN_PIE = Bukkit.getUnsafe().createLegacyMaterial("legacy_pumpkin_pie", 400, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FIREWORK = Bukkit.getUnsafe().createLegacyMaterial("legacy_firework", 401, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_FIREWORK_CHARGE = Bukkit.getUnsafe().createLegacyMaterial("legacy_firework_charge", 402, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ENCHANTED_BOOK = Bukkit.getUnsafe().createLegacyMaterial("legacy_enchanted_book", 403, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_REDSTONE_COMPARATOR = Bukkit.getUnsafe().createLegacyMaterial("legacy_redstone_comparator", 404, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_NETHER_BRICK_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_nether_brick_item", 405, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_QUARTZ = Bukkit.getUnsafe().createLegacyMaterial("legacy_quartz", 406, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_EXPLOSIVE_MINECART = Bukkit.getUnsafe().createLegacyMaterial("legacy_explosive_minecart", 407, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_HOPPER_MINECART = Bukkit.getUnsafe().createLegacyMaterial("legacy_hopper_minecart", 408, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PRISMARINE_SHARD = Bukkit.getUnsafe().createLegacyMaterial("legacy_prismarine_shard", 409, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_PRISMARINE_CRYSTALS = Bukkit.getUnsafe().createLegacyMaterial("legacy_prismarine_crystals", 410, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RABBIT = Bukkit.getUnsafe().createLegacyMaterial("legacy_rabbit", 411, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COOKED_RABBIT = Bukkit.getUnsafe().createLegacyMaterial("legacy_cooked_rabbit", 412, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RABBIT_STEW = Bukkit.getUnsafe().createLegacyMaterial("legacy_rabbit_stew", 413, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RABBIT_FOOT = Bukkit.getUnsafe().createLegacyMaterial("legacy_rabbit_foot", 414, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RABBIT_HIDE = Bukkit.getUnsafe().createLegacyMaterial("legacy_rabbit_hide", 415, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ARMOR_STAND = Bukkit.getUnsafe().createLegacyMaterial("legacy_armor_stand", 416, 16, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_BARDING = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_barding", 417, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_BARDING = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_barding", 418, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DIAMOND_BARDING = Bukkit.getUnsafe().createLegacyMaterial("legacy_diamond_barding", 419, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LEASH = Bukkit.getUnsafe().createLegacyMaterial("legacy_leash", 420, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_NAME_TAG = Bukkit.getUnsafe().createLegacyMaterial("legacy_name_tag", 421, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COMMAND_MINECART = Bukkit.getUnsafe().createLegacyMaterial("legacy_command_minecart", 422, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_MUTTON = Bukkit.getUnsafe().createLegacyMaterial("legacy_mutton", 423, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_COOKED_MUTTON = Bukkit.getUnsafe().createLegacyMaterial("legacy_cooked_mutton", 424, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BANNER = Bukkit.getUnsafe().createLegacyMaterial("legacy_banner", 425, 16, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_END_CRYSTAL = Bukkit.getUnsafe().createLegacyMaterial("legacy_end_crystal", 426, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SPRUCE_DOOR_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_spruce_door_item", 427, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BIRCH_DOOR_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_birch_door_item", 428, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_JUNGLE_DOOR_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_jungle_door_item", 429, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_ACACIA_DOOR_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_acacia_door_item", 430, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DARK_OAK_DOOR_ITEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_dark_oak_door_item", 431, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CHORUS_FRUIT = Bukkit.getUnsafe().createLegacyMaterial("legacy_chorus_fruit", 432, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_CHORUS_FRUIT_POPPED = Bukkit.getUnsafe().createLegacyMaterial("legacy_chorus_fruit_popped", 433, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BEETROOT = Bukkit.getUnsafe().createLegacyMaterial("legacy_beetroot", 434, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BEETROOT_SEEDS = Bukkit.getUnsafe().createLegacyMaterial("legacy_beetroot_seeds", 435, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BEETROOT_SOUP = Bukkit.getUnsafe().createLegacyMaterial("legacy_beetroot_soup", 436, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_DRAGONS_BREATH = Bukkit.getUnsafe().createLegacyMaterial("legacy_dragons_breath", 437, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SPLASH_POTION = Bukkit.getUnsafe().createLegacyMaterial("legacy_splash_potion", 438, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SPECTRAL_ARROW = Bukkit.getUnsafe().createLegacyMaterial("legacy_spectral_arrow", 439, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_TIPPED_ARROW = Bukkit.getUnsafe().createLegacyMaterial("legacy_tipped_arrow", 440, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_LINGERING_POTION = Bukkit.getUnsafe().createLegacyMaterial("legacy_lingering_potion", 441, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SHIELD = Bukkit.getUnsafe().createLegacyMaterial("legacy_shield", 442, 1, (short) 336, MaterialData.class);
    @Deprecated
    Material LEGACY_ELYTRA = Bukkit.getUnsafe().createLegacyMaterial("legacy_elytra", 443, 1, (short) 431, MaterialData.class);
    @Deprecated
    Material LEGACY_BOAT_SPRUCE = Bukkit.getUnsafe().createLegacyMaterial("legacy_boat_spruce", 444, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOAT_BIRCH = Bukkit.getUnsafe().createLegacyMaterial("legacy_boat_birch", 445, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOAT_JUNGLE = Bukkit.getUnsafe().createLegacyMaterial("legacy_boat_jungle", 446, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOAT_ACACIA = Bukkit.getUnsafe().createLegacyMaterial("legacy_boat_acacia", 447, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_BOAT_DARK_OAK = Bukkit.getUnsafe().createLegacyMaterial("legacy_boat_dark_oak", 448, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_TOTEM = Bukkit.getUnsafe().createLegacyMaterial("legacy_totem", 449, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_SHULKER_SHELL = Bukkit.getUnsafe().createLegacyMaterial("legacy_shulker_shell", 450, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_IRON_NUGGET = Bukkit.getUnsafe().createLegacyMaterial("legacy_iron_nugget", 452, 64, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_KNOWLEDGE_BOOK = Bukkit.getUnsafe().createLegacyMaterial("legacy_knowledge_book", 453, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GOLD_RECORD = Bukkit.getUnsafe().createLegacyMaterial("legacy_gold_record", 2256, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_GREEN_RECORD = Bukkit.getUnsafe().createLegacyMaterial("legacy_green_record", 2257, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_3 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_3", 2258, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_4 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_4", 2259, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_5 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_5", 2260, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_6 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_6", 2261, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_7 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_7", 2262, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_8 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_8", 2263, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_9 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_9", 2264, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_10 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_10", 2265, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_11 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_11", 2266, 1, (short) 0, MaterialData.class);
    @Deprecated
    Material LEGACY_RECORD_12 = Bukkit.getUnsafe().createLegacyMaterial("legacy_record_12", 2267, 1, (short) 0, MaterialData.class);
    //</editor-fold>

    @Deprecated
    String LEGACY_PREFIX = "LEGACY_";

    /**
     * Attempts to get the Material with the given name.
     * <p>
     * This is a normal lookup, names must be the precise name they are given
     * in the enum.
     *
     * @param name Name of the material to get
     * @return Material if found, or null
     */
    @Nullable
    static Material getMaterial(@NotNull final String name) {
        return getMaterial(name, false);
    }

    /**
     * Attempts to get the Material with the given name.
     * <p>
     * This is a normal lookup, names must be the precise name they are given in
     * the enum (but optionally including the LEGACY_PREFIX if legacyName is
     * true).
     * <p>
     * If legacyName is true, then the lookup will be against legacy materials,
     * but the returned Material will be a modern material (ie this method is
     * useful for updating stored data).
     *
     * @param name Name of the material to get
     * @param legacyName whether this is a legacy name lookup
     * @return Material if found, or null
     */
    @Nullable
    static Material getMaterial(@NotNull String name, boolean legacyName) {
        if (legacyName) {
            if (!name.startsWith(LEGACY_PREFIX)) {
                name = LEGACY_PREFIX + name;
            }

            Material match = Bukkit.getUnsafe().getLegacyMaterial(name);
            return Bukkit.getUnsafe().fromLegacy(match);
        }

        if (name == null) {
            return null;
        }

        if (name.startsWith(LEGACY_PREFIX)) {
            return Bukkit.getUnsafe().getLegacyMaterial(name);
        } else {
            return Registry.MATERIAL.get(NamespacedKey.fromString(name.toLowerCase(java.util.Locale.ENGLISH)));
        }
    }

    /**
     * Attempts to match the Material with the given name.
     * <p>
     * This is a match lookup; names will be stripped of the "minecraft:"
     * namespace, converted to uppercase, then stripped of special characters in
     * an attempt to format it like the enum.
     *
     * @param name Name of the material to get
     * @return Material if found, or null
     */
    @Nullable
    static Material matchMaterial(@NotNull final String name) {
        return matchMaterial(name, false);
    }

    /**
     * Attempts to match the Material with the given name.
     * <p>
     * This is a match lookup; names will be stripped of the "minecraft:"
     * namespace, converted to uppercase, then stripped of special characters in
     * an attempt to format it like the enum.
     *
     * @param name Name of the material to get
     * @param legacyName whether this is a legacy name (see
     * {@link #getMaterial(java.lang.String, boolean)}
     * @return Material if found, or null
     */
    @Nullable
    static Material matchMaterial(@NotNull final String name, boolean legacyName) {
        Validate.notNull(name, "Name cannot be null");

        String filtered = name;
        if (filtered.startsWith(NamespacedKey.MINECRAFT + ":")) {
            filtered = filtered.substring((NamespacedKey.MINECRAFT + ":").length());
        }

        filtered = filtered.toUpperCase(java.util.Locale.ENGLISH);

        filtered = filtered.replaceAll("\\s+", "_").replaceAll("\\W", "");
        return getMaterial(filtered, legacyName);
    }

    /**
     * @param name of the material.
     * @return the material with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static Material valueOf(@NotNull String name) {
        Material material = Registry.MATERIAL.get(NamespacedKey.fromString(name.toLowerCase()));
        if (material == null) {
            material = Bukkit.getUnsafe().getLegacyMaterial(name);
        }
        Preconditions.checkArgument(material != null, "No Material found with the name %s", name);
        return material;
    }

    /**
     * Do not use for any reason.
     *
     * @return ID of this material
     * @deprecated Magic value
     */
    @Deprecated
    int getId();

    /**
     * Do not use for any reason.
     *
     * @return legacy status
     */
    @Deprecated
    boolean isLegacy();

    /**
     * Gets the maximum amount of this material that can be held in a stack
     *
     * @return Maximum stack size for this material
     * @see Material#asItemType()
     * @see ItemType#getMaxStackSize()
     * @deprecated Can only get max stack size from ItemType
     */
    @Deprecated
    int getMaxStackSize();

    /**
     * Gets the maximum durability of this material
     *
     * @return Maximum durability for this material
     * @see Material#asItemType()
     * @see ItemType#getMaxDurability()
     * @deprecated Can only get max stack durability from ItemType
     */
    @Deprecated
    short getMaxDurability();

    /**
     * Creates a new {@link BlockData} instance for this Material, with all
     * properties initialized to unspecified defaults.
     *
     * @return new data instance
     * @see Material#asBlockType()
     * @see BlockType#createBlockData()
     * @deprecated Can only create BlockData from BlockType
     */
    @NotNull
    @Deprecated
    BlockData createBlockData();

    /**
     * Creates a new {@link BlockData} instance for this Material, with
     * all properties initialized to unspecified defaults.
     *
     * @param consumer consumer to run on new instance before returning
     * @return new data instance
     * @see Material#asBlockType()
     * @see BlockType#createBlockData(Consumer)
     * @deprecated Can only create BlockData from BlockType
     */
    @NotNull
    @Deprecated
    BlockData createBlockData(@Nullable Consumer<BlockData> consumer);

    /**
     * Creates a new {@link BlockData} instance for this Material, with all
     * properties initialized to unspecified defaults, except for those provided
     * in data.
     *
     * @param data data string
     * @return new data instance
     * @throws IllegalArgumentException if the specified data is not valid
     * @see Material#asBlockType()
     * @see BlockType#createBlockData(String)
     * @deprecated Can only create BlockData from BlockType
     */
    @NotNull
    @Deprecated
    BlockData createBlockData(@Nullable String data);

    /**
     * Gets the BlockData class of this Material
     *
     * @return the BlockData class of this Material
     * @see Material#asBlockType()
     * @see BlockType#getBlockDataClass()
     * @deprecated Can only get BlockData class from BlockType
     */
    @NotNull
    @Deprecated
    Class<?> getBlockDataClass();

    /**
     * Gets the MaterialData class associated with this Material
     *
     * @return MaterialData associated with this Material
     */
    @NotNull
    @Deprecated
    Class<? extends MaterialData> getData();

    /**
     * Constructs a new MaterialData relevant for this Material, with the
     * given initial data
     *
     * @param raw Initial data to construct the MaterialData with
     * @return New MaterialData with the given data
     * @deprecated Magic value
     */
    @Deprecated
    @NotNull
    MaterialData getNewData(final byte raw);

    /**
     * Checks if this Material is a placable block
     *
     * @return true if this material is a block
     */
    boolean isBlock();

    /**
     * Returns the same Material as BlockType.
     *
     * @return this Material as BlockType
     * @throws IllegalStateException if this Material is not a block
     * @see Material#isBlock()
     */
    @Contract("-> this")
    @NotNull
    BlockType<?> asBlockType();

    /**
     * Checks if this Material is edible.
     *
     * @return true if this Material is edible.
     * @see Material#asItemType()
     * @see ItemType#isEdible()
     * @deprecated Can only check ItemType if it is edible
     */
    @Deprecated
    boolean isEdible();

    /**
     * @return True if this material represents a playable music disk.
     * @see Material#asItemType()
     * @see ItemType#isEdible()
     * @deprecated Can only check ItemType if it is a record
     */
    @Deprecated
    boolean isRecord();

    /**
     * Check if the material is a block and solid (can be built upon)
     *
     * @return True if this material is a block and solid
     * @see Material#asBlockType()
     * @see BlockType#isSolid()
     * @deprecated Can only check BlockType if it is solid
     */
    @Deprecated
    boolean isSolid();

    /**
     * Check if the material is an air block.
     *
     * @return True if this material is an air block.
     */
    boolean isAir();

    /**
     * Check if the material is a block and does not block any light
     *
     * @return True if this material is a block and does not block any light
     * @deprecated currently does not have an implementation which is well
     * linked to the underlying server. Contributions welcome.
     */
    @Deprecated
    boolean isTransparent();

    /**
     * Check if the material is a block and can catch fire
     *
     * @return True if this material is a block and can catch fire
     * @see Material#asBlockType()
     * @see BlockType#isFlammable()
     * @deprecated Can only check BlockType if it is flammable
     */
    @Deprecated
    boolean isFlammable();

    /**
     * Check if the material is a block and can burn away
     *
     * @return True if this material is a block and can burn away
     * @see Material#asBlockType()
     * @see BlockType#isBurnable()
     * @deprecated Can only check BlockType if it is burnable
     */
    @Deprecated
    boolean isBurnable();

    /**
     * Checks if this Material can be used as fuel in a Furnace
     *
     * @return true if this Material can be used as fuel.
     * @see Material#asItemType()
     * @see ItemType#isFuel()
     * @deprecated Can only check ItemType if it is fuel
     */
    @Deprecated
    boolean isFuel();

    /**
     * Check if the material is a block and completely blocks vision
     *
     * @return True if this material is a block and completely blocks vision
     * @see Material#asBlockType()
     * @see BlockType#isOccluding()
     * @deprecated Can only check BlockType if it is occluding
     */
    @Deprecated
    boolean isOccluding();

    /**
     * @return True if this material is affected by gravity.
     * @see Material#asBlockType()
     * @see BlockType#hasGravity()
     * @deprecated Can only check BlockType if it has gravity
     */
    @Deprecated
    boolean hasGravity();

    /**
     * Checks if this Material is an obtainable item.
     *
     * @return true if this material is an item
     */
    boolean isItem();

    /**
     * Returns the same Material as ItemType.
     *
     * @return this Material as ItemType
     * @throws IllegalStateException if this Material is not an item
     * @see Material#isItem()
     */
    @Contract("-> this")
    @NotNull
    ItemType asItemType();

    /**
     * Checks if this Material can be interacted with.
     *
     * Interactable materials include those with functionality when they are
     * interacted with by a player such as chests, furnaces, etc.
     *
     * Some blocks such as piston heads and stairs are considered interactable
     * though may not perform any additional functionality.
     *
     * Note that the interactability of some materials may be dependant on their
     * state as well. This method will return true if there is at least one
     * state in which additional interact handling is performed for the
     * material.
     *
     * @return true if this material can be interacted with.
     * @see Material#asBlockType()
     * @see BlockType#isInteractable()
     * @deprecated Can only check BlockType if it is interactable
     */
    @Deprecated
    boolean isInteractable();

    /**
     * Obtains the block's hardness level (also known as "strength").
     * <br>
     * This number is used to calculate the time required to break each block.
     * <br>
     * Only available when {@link #isBlock()} is true.
     *
     * @return the hardness of that material.
     * @see Material#asBlockType()
     * @see BlockType#getHardness()
     * @deprecated Can only get hardness from BlockType
     */
    @Deprecated
    float getHardness();

    /**
     * Obtains the blast resistance value (also known as block "durability").
     * <br>
     * This value is used in explosions to calculate whether a block should be
     * broken or not.
     * <br>
     * Only available when {@link #isBlock()} is true.
     *
     * @return the blast resistance of that material.
     * @see Material#asBlockType()
     * @see BlockType#getBlastResistance()
     * @deprecated Can only get blast resistance from BlockType
     */
    @Deprecated
    float getBlastResistance();

    /**
     * Returns a value that represents how 'slippery' the block is.
     *
     * Blocks with higher slipperiness, like {@link Material#ICE} can be slid on
     * further by the player and other entities.
     *
     * Most blocks have a default slipperiness of {@code 0.6f}.
     *
     * Only available when {@link #isBlock()} is true.
     *
     * @return the slipperiness of this block
     * @see Material#asBlockType()
     * @see BlockType#getSlipperiness()
     * @deprecated Can only get slipperiness from BlockType
     */
    @Deprecated
    float getSlipperiness();

    /**
     * Determines the remaining item in a crafting grid after crafting with this
     * ingredient.
     * <br>
     * Only available when {@link #isItem()} is true.
     *
     * @return the item left behind when crafting, or null if nothing is.
     * @see Material#asItemType()
     * @see ItemType#getCraftingRemainingItem()
     * @deprecated Can only get crafting remaining item from ItemType
     */
    @Nullable
    @Deprecated
    Material getCraftingRemainingItem();

    /**
     * Get the best suitable slot for this Material.
     *
     * For most items this will be {@link EquipmentSlot#HAND}.
     *
     * @return the best EquipmentSlot for this Material
     * @see Material#asItemType()
     * @see ItemType#getCraftingRemainingItem()
     * @deprecated Can only get equipment slot from ItemType
     */
    @NotNull
    @Deprecated
    EquipmentSlot getEquipmentSlot();

    /**
     * Return an immutable copy of all default {@link Attribute}s and their
     * {@link AttributeModifier}s for a given {@link EquipmentSlot}.
     *
     * Default attributes are those that are always preset on some items, such
     * as the attack damage on weapons or the armor value on armor.
     *
     * Only available when {@link #isItem()} is true.
     *
     * @param slot the {@link EquipmentSlot} to check
     * @return the immutable {@link Multimap} with the respective default
     * Attributes and modifiers, or an empty map if no attributes are set.
     * @see Material#asItemType()
     * @see ItemType#getDefaultAttributeModifiers()
     * @deprecated Can only get default attribute modifiers from ItemType
     */
    @NotNull
    @Deprecated
    Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(@NotNull EquipmentSlot slot);

    /**
     * @param other to compare to.
     * @return negative if this old enum is lower, zero if equal and positive if higher than the given old enum.
     * @deprecated only for backwards compatibility, old enums can not be compared.
     */
    @Deprecated
    @Override
    public abstract int compareTo(@NotNull Material other);

    /**
     * @return the name of the old enum.
     * @deprecated only for backwards compatibility.
     */
    @NotNull
    @Deprecated
    public abstract String name();

    /**
     * @return the ordinal of the old enum.
     * @deprecated only for backwards compatibility, it is not guaranteed that an old enum always has the same ordinal.
     */
    @Deprecated
    public abstract int ordinal();

    /**
     * Get the {@link CreativeCategory} to which this material belongs.
     *
     * @return the creative category. null if does not belong to a category
     */
    @Nullable
    public CreativeCategory getCreativeCategory() {
        return Bukkit.getUnsafe().getCreativeCategory(this);
    }
}
