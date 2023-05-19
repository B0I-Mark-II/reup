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

public interface ItemType extends Keyed, Translatable {
    //<editor-fold desc="ItemTypes" defaultstate="collapsed">
    ItemType AIR = getItemType("air");
    ItemType STONE = getItemType("stone");
    ItemType GRANITE = getItemType("granite");
    ItemType POLISHED_GRANITE = getItemType("polished_granite");
    ItemType DIORITE = getItemType("diorite");
    ItemType POLISHED_DIORITE = getItemType("polished_diorite");
    ItemType ANDESITE = getItemType("andesite");
    ItemType POLISHED_ANDESITE = getItemType("polished_andesite");
    ItemType DEEPSLATE = getItemType("deepslate");
    ItemType COBBLED_DEEPSLATE = getItemType("cobbled_deepslate");
    ItemType POLISHED_DEEPSLATE = getItemType("polished_deepslate");
    ItemType CALCITE = getItemType("calcite");
    ItemType TUFF = getItemType("tuff");
    ItemType DRIPSTONE_BLOCK = getItemType("dripstone_block");
    ItemType GRASS_BLOCK = getItemType("grass_block");
    ItemType DIRT = getItemType("dirt");
    ItemType COARSE_DIRT = getItemType("coarse_dirt");
    ItemType PODZOL = getItemType("podzol");
    ItemType ROOTED_DIRT = getItemType("rooted_dirt");
    ItemType MUD = getItemType("mud");
    ItemType CRIMSON_NYLIUM = getItemType("crimson_nylium");
    ItemType WARPED_NYLIUM = getItemType("warped_nylium");
    ItemType COBBLESTONE = getItemType("cobblestone");
    ItemType OAK_PLANKS = getItemType("oak_planks");
    ItemType SPRUCE_PLANKS = getItemType("spruce_planks");
    ItemType BIRCH_PLANKS = getItemType("birch_planks");
    ItemType JUNGLE_PLANKS = getItemType("jungle_planks");
    ItemType ACACIA_PLANKS = getItemType("acacia_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_PLANKS = getItemType("cherry_planks");
    ItemType DARK_OAK_PLANKS = getItemType("dark_oak_planks");
    ItemType MANGROVE_PLANKS = getItemType("mangrove_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_PLANKS = getItemType("bamboo_planks");
    ItemType CRIMSON_PLANKS = getItemType("crimson_planks");
    ItemType WARPED_PLANKS = getItemType("warped_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_MOSAIC = getItemType("bamboo_mosaic");
    ItemType OAK_SAPLING = getItemType("oak_sapling");
    ItemType SPRUCE_SAPLING = getItemType("spruce_sapling");
    ItemType BIRCH_SAPLING = getItemType("birch_sapling");
    ItemType JUNGLE_SAPLING = getItemType("jungle_sapling");
    ItemType ACACIA_SAPLING = getItemType("acacia_sapling");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_SAPLING = getItemType("cherry_sapling");
    ItemType DARK_OAK_SAPLING = getItemType("dark_oak_sapling");
    ItemType MANGROVE_PROPAGULE = getItemType("mangrove_propagule");
    ItemType BEDROCK = getItemType("bedrock");
    ItemType SAND = getItemType("sand");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SUSPICIOUS_SAND = getItemType("suspicious_sand");
    ItemType RED_SAND = getItemType("red_sand");
    ItemType GRAVEL = getItemType("gravel");
    ItemType COAL_ORE = getItemType("coal_ore");
    ItemType DEEPSLATE_COAL_ORE = getItemType("deepslate_coal_ore");
    ItemType IRON_ORE = getItemType("iron_ore");
    ItemType DEEPSLATE_IRON_ORE = getItemType("deepslate_iron_ore");
    ItemType COPPER_ORE = getItemType("copper_ore");
    ItemType DEEPSLATE_COPPER_ORE = getItemType("deepslate_copper_ore");
    ItemType GOLD_ORE = getItemType("gold_ore");
    ItemType DEEPSLATE_GOLD_ORE = getItemType("deepslate_gold_ore");
    ItemType REDSTONE_ORE = getItemType("redstone_ore");
    ItemType DEEPSLATE_REDSTONE_ORE = getItemType("deepslate_redstone_ore");
    ItemType EMERALD_ORE = getItemType("emerald_ore");
    ItemType DEEPSLATE_EMERALD_ORE = getItemType("deepslate_emerald_ore");
    ItemType LAPIS_ORE = getItemType("lapis_ore");
    ItemType DEEPSLATE_LAPIS_ORE = getItemType("deepslate_lapis_ore");
    ItemType DIAMOND_ORE = getItemType("diamond_ore");
    ItemType DEEPSLATE_DIAMOND_ORE = getItemType("deepslate_diamond_ore");
    ItemType NETHER_GOLD_ORE = getItemType("nether_gold_ore");
    ItemType NETHER_QUARTZ_ORE = getItemType("nether_quartz_ore");
    ItemType ANCIENT_DEBRIS = getItemType("ancient_debris");
    ItemType COAL_BLOCK = getItemType("coal_block");
    ItemType RAW_IRON_BLOCK = getItemType("raw_iron_block");
    ItemType RAW_COPPER_BLOCK = getItemType("raw_copper_block");
    ItemType RAW_GOLD_BLOCK = getItemType("raw_gold_block");
    ItemType AMETHYST_BLOCK = getItemType("amethyst_block");
    ItemType BUDDING_AMETHYST = getItemType("budding_amethyst");
    ItemType IRON_BLOCK = getItemType("iron_block");
    ItemType COPPER_BLOCK = getItemType("copper_block");
    ItemType GOLD_BLOCK = getItemType("gold_block");
    ItemType DIAMOND_BLOCK = getItemType("diamond_block");
    ItemType NETHERITE_BLOCK = getItemType("netherite_block");
    ItemType EXPOSED_COPPER = getItemType("exposed_copper");
    ItemType WEATHERED_COPPER = getItemType("weathered_copper");
    ItemType OXIDIZED_COPPER = getItemType("oxidized_copper");
    ItemType CUT_COPPER = getItemType("cut_copper");
    ItemType EXPOSED_CUT_COPPER = getItemType("exposed_cut_copper");
    ItemType WEATHERED_CUT_COPPER = getItemType("weathered_cut_copper");
    ItemType OXIDIZED_CUT_COPPER = getItemType("oxidized_cut_copper");
    ItemType CUT_COPPER_STAIRS = getItemType("cut_copper_stairs");
    ItemType EXPOSED_CUT_COPPER_STAIRS = getItemType("exposed_cut_copper_stairs");
    ItemType WEATHERED_CUT_COPPER_STAIRS = getItemType("weathered_cut_copper_stairs");
    ItemType OXIDIZED_CUT_COPPER_STAIRS = getItemType("oxidized_cut_copper_stairs");
    ItemType CUT_COPPER_SLAB = getItemType("cut_copper_slab");
    ItemType EXPOSED_CUT_COPPER_SLAB = getItemType("exposed_cut_copper_slab");
    ItemType WEATHERED_CUT_COPPER_SLAB = getItemType("weathered_cut_copper_slab");
    ItemType OXIDIZED_CUT_COPPER_SLAB = getItemType("oxidized_cut_copper_slab");
    ItemType WAXED_COPPER_BLOCK = getItemType("waxed_copper_block");
    ItemType WAXED_EXPOSED_COPPER = getItemType("waxed_exposed_copper");
    ItemType WAXED_WEATHERED_COPPER = getItemType("waxed_weathered_copper");
    ItemType WAXED_OXIDIZED_COPPER = getItemType("waxed_oxidized_copper");
    ItemType WAXED_CUT_COPPER = getItemType("waxed_cut_copper");
    ItemType WAXED_EXPOSED_CUT_COPPER = getItemType("waxed_exposed_cut_copper");
    ItemType WAXED_WEATHERED_CUT_COPPER = getItemType("waxed_weathered_cut_copper");
    ItemType WAXED_OXIDIZED_CUT_COPPER = getItemType("waxed_oxidized_cut_copper");
    ItemType WAXED_CUT_COPPER_STAIRS = getItemType("waxed_cut_copper_stairs");
    ItemType WAXED_EXPOSED_CUT_COPPER_STAIRS = getItemType("waxed_exposed_cut_copper_stairs");
    ItemType WAXED_WEATHERED_CUT_COPPER_STAIRS = getItemType("waxed_weathered_cut_copper_stairs");
    ItemType WAXED_OXIDIZED_CUT_COPPER_STAIRS = getItemType("waxed_oxidized_cut_copper_stairs");
    ItemType WAXED_CUT_COPPER_SLAB = getItemType("waxed_cut_copper_slab");
    ItemType WAXED_EXPOSED_CUT_COPPER_SLAB = getItemType("waxed_exposed_cut_copper_slab");
    ItemType WAXED_WEATHERED_CUT_COPPER_SLAB = getItemType("waxed_weathered_cut_copper_slab");
    ItemType WAXED_OXIDIZED_CUT_COPPER_SLAB = getItemType("waxed_oxidized_cut_copper_slab");
    ItemType OAK_LOG = getItemType("oak_log");
    ItemType SPRUCE_LOG = getItemType("spruce_log");
    ItemType BIRCH_LOG = getItemType("birch_log");
    ItemType JUNGLE_LOG = getItemType("jungle_log");
    ItemType ACACIA_LOG = getItemType("acacia_log");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_LOG = getItemType("cherry_log");
    ItemType DARK_OAK_LOG = getItemType("dark_oak_log");
    ItemType MANGROVE_LOG = getItemType("mangrove_log");
    ItemType MANGROVE_ROOTS = getItemType("mangrove_roots");
    ItemType MUDDY_MANGROVE_ROOTS = getItemType("muddy_mangrove_roots");
    ItemType CRIMSON_STEM = getItemType("crimson_stem");
    ItemType WARPED_STEM = getItemType("warped_stem");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_BLOCK = getItemType("bamboo_block");
    ItemType STRIPPED_OAK_LOG = getItemType("stripped_oak_log");
    ItemType STRIPPED_SPRUCE_LOG = getItemType("stripped_spruce_log");
    ItemType STRIPPED_BIRCH_LOG = getItemType("stripped_birch_log");
    ItemType STRIPPED_JUNGLE_LOG = getItemType("stripped_jungle_log");
    ItemType STRIPPED_ACACIA_LOG = getItemType("stripped_acacia_log");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType STRIPPED_CHERRY_LOG = getItemType("stripped_cherry_log");
    ItemType STRIPPED_DARK_OAK_LOG = getItemType("stripped_dark_oak_log");
    ItemType STRIPPED_MANGROVE_LOG = getItemType("stripped_mangrove_log");
    ItemType STRIPPED_CRIMSON_STEM = getItemType("stripped_crimson_stem");
    ItemType STRIPPED_WARPED_STEM = getItemType("stripped_warped_stem");
    ItemType STRIPPED_OAK_WOOD = getItemType("stripped_oak_wood");
    ItemType STRIPPED_SPRUCE_WOOD = getItemType("stripped_spruce_wood");
    ItemType STRIPPED_BIRCH_WOOD = getItemType("stripped_birch_wood");
    ItemType STRIPPED_JUNGLE_WOOD = getItemType("stripped_jungle_wood");
    ItemType STRIPPED_ACACIA_WOOD = getItemType("stripped_acacia_wood");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType STRIPPED_CHERRY_WOOD = getItemType("stripped_cherry_wood");
    ItemType STRIPPED_DARK_OAK_WOOD = getItemType("stripped_dark_oak_wood");
    ItemType STRIPPED_MANGROVE_WOOD = getItemType("stripped_mangrove_wood");
    ItemType STRIPPED_CRIMSON_HYPHAE = getItemType("stripped_crimson_hyphae");
    ItemType STRIPPED_WARPED_HYPHAE = getItemType("stripped_warped_hyphae");
    ItemType STRIPPED_BAMBOO_BLOCK = getItemType("stripped_bamboo_block");
    ItemType OAK_WOOD = getItemType("oak_wood");
    ItemType SPRUCE_WOOD = getItemType("spruce_wood");
    ItemType BIRCH_WOOD = getItemType("birch_wood");
    ItemType JUNGLE_WOOD = getItemType("jungle_wood");
    ItemType ACACIA_WOOD = getItemType("acacia_wood");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_WOOD = getItemType("cherry_wood");
    ItemType DARK_OAK_WOOD = getItemType("dark_oak_wood");
    ItemType MANGROVE_WOOD = getItemType("mangrove_wood");
    ItemType CRIMSON_HYPHAE = getItemType("crimson_hyphae");
    ItemType WARPED_HYPHAE = getItemType("warped_hyphae");
    ItemType OAK_LEAVES = getItemType("oak_leaves");
    ItemType SPRUCE_LEAVES = getItemType("spruce_leaves");
    ItemType BIRCH_LEAVES = getItemType("birch_leaves");
    ItemType JUNGLE_LEAVES = getItemType("jungle_leaves");
    ItemType ACACIA_LEAVES = getItemType("acacia_leaves");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_LEAVES = getItemType("cherry_leaves");
    ItemType DARK_OAK_LEAVES = getItemType("dark_oak_leaves");
    ItemType MANGROVE_LEAVES = getItemType("mangrove_leaves");
    ItemType AZALEA_LEAVES = getItemType("azalea_leaves");
    ItemType FLOWERING_AZALEA_LEAVES = getItemType("flowering_azalea_leaves");
    ItemType SPONGE = getItemType("sponge");
    ItemType WET_SPONGE = getItemType("wet_sponge");
    ItemType GLASS = getItemType("glass");
    ItemType TINTED_GLASS = getItemType("tinted_glass");
    ItemType LAPIS_BLOCK = getItemType("lapis_block");
    ItemType SANDSTONE = getItemType("sandstone");
    ItemType CHISELED_SANDSTONE = getItemType("chiseled_sandstone");
    ItemType CUT_SANDSTONE = getItemType("cut_sandstone");
    ItemType COBWEB = getItemType("cobweb");
    ItemType GRASS = getItemType("grass");
    ItemType FERN = getItemType("fern");
    ItemType AZALEA = getItemType("azalea");
    ItemType FLOWERING_AZALEA = getItemType("flowering_azalea");
    ItemType DEAD_BUSH = getItemType("dead_bush");
    ItemType SEAGRASS = getItemType("seagrass");
    ItemType SEA_PICKLE = getItemType("sea_pickle");
    ItemType WHITE_WOOL = getItemType("white_wool");
    ItemType ORANGE_WOOL = getItemType("orange_wool");
    ItemType MAGENTA_WOOL = getItemType("magenta_wool");
    ItemType LIGHT_BLUE_WOOL = getItemType("light_blue_wool");
    ItemType YELLOW_WOOL = getItemType("yellow_wool");
    ItemType LIME_WOOL = getItemType("lime_wool");
    ItemType PINK_WOOL = getItemType("pink_wool");
    ItemType GRAY_WOOL = getItemType("gray_wool");
    ItemType LIGHT_GRAY_WOOL = getItemType("light_gray_wool");
    ItemType CYAN_WOOL = getItemType("cyan_wool");
    ItemType PURPLE_WOOL = getItemType("purple_wool");
    ItemType BLUE_WOOL = getItemType("blue_wool");
    ItemType BROWN_WOOL = getItemType("brown_wool");
    ItemType GREEN_WOOL = getItemType("green_wool");
    ItemType RED_WOOL = getItemType("red_wool");
    ItemType BLACK_WOOL = getItemType("black_wool");
    ItemType DANDELION = getItemType("dandelion");
    ItemType POPPY = getItemType("poppy");
    ItemType BLUE_ORCHID = getItemType("blue_orchid");
    ItemType ALLIUM = getItemType("allium");
    ItemType AZURE_BLUET = getItemType("azure_bluet");
    ItemType RED_TULIP = getItemType("red_tulip");
    ItemType ORANGE_TULIP = getItemType("orange_tulip");
    ItemType WHITE_TULIP = getItemType("white_tulip");
    ItemType PINK_TULIP = getItemType("pink_tulip");
    ItemType OXEYE_DAISY = getItemType("oxeye_daisy");
    ItemType CORNFLOWER = getItemType("cornflower");
    ItemType LILY_OF_THE_VALLEY = getItemType("lily_of_the_valley");
    ItemType WITHER_ROSE = getItemType("wither_rose");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType TORCHFLOWER = getItemType("torchflower");
    ItemType SPORE_BLOSSOM = getItemType("spore_blossom");
    ItemType BROWN_MUSHROOM = getItemType("brown_mushroom");
    ItemType RED_MUSHROOM = getItemType("red_mushroom");
    ItemType CRIMSON_FUNGUS = getItemType("crimson_fungus");
    ItemType WARPED_FUNGUS = getItemType("warped_fungus");
    ItemType CRIMSON_ROOTS = getItemType("crimson_roots");
    ItemType WARPED_ROOTS = getItemType("warped_roots");
    ItemType NETHER_SPROUTS = getItemType("nether_sprouts");
    ItemType WEEPING_VINES = getItemType("weeping_vines");
    ItemType TWISTING_VINES = getItemType("twisting_vines");
    ItemType SUGAR_CANE = getItemType("sugar_cane");
    ItemType KELP = getItemType("kelp");
    ItemType MOSS_CARPET = getItemType("moss_carpet");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType PINK_PETALS = getItemType("pink_petals");
    ItemType MOSS_BLOCK = getItemType("moss_block");
    ItemType HANGING_ROOTS = getItemType("hanging_roots");
    ItemType BIG_DRIPLEAF = getItemType("big_dripleaf");
    ItemType SMALL_DRIPLEAF = getItemType("small_dripleaf");
    ItemType BAMBOO = getItemType("bamboo");
    ItemType OAK_SLAB = getItemType("oak_slab");
    ItemType SPRUCE_SLAB = getItemType("spruce_slab");
    ItemType BIRCH_SLAB = getItemType("birch_slab");
    ItemType JUNGLE_SLAB = getItemType("jungle_slab");
    ItemType ACACIA_SLAB = getItemType("acacia_slab");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_SLAB = getItemType("cherry_slab");
    ItemType DARK_OAK_SLAB = getItemType("dark_oak_slab");
    ItemType MANGROVE_SLAB = getItemType("mangrove_slab");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_SLAB = getItemType("bamboo_slab");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_MOSAIC_SLAB = getItemType("bamboo_mosaic_slab");
    ItemType CRIMSON_SLAB = getItemType("crimson_slab");
    ItemType WARPED_SLAB = getItemType("warped_slab");
    ItemType STONE_SLAB = getItemType("stone_slab");
    ItemType SMOOTH_STONE_SLAB = getItemType("smooth_stone_slab");
    ItemType SANDSTONE_SLAB = getItemType("sandstone_slab");
    ItemType CUT_SANDSTONE_SLAB = getItemType("cut_sandstone_slab");
    ItemType PETRIFIED_OAK_SLAB = getItemType("petrified_oak_slab");
    ItemType COBBLESTONE_SLAB = getItemType("cobblestone_slab");
    ItemType BRICK_SLAB = getItemType("brick_slab");
    ItemType STONE_BRICK_SLAB = getItemType("stone_brick_slab");
    ItemType MUD_BRICK_SLAB = getItemType("mud_brick_slab");
    ItemType NETHER_BRICK_SLAB = getItemType("nether_brick_slab");
    ItemType QUARTZ_SLAB = getItemType("quartz_slab");
    ItemType RED_SANDSTONE_SLAB = getItemType("red_sandstone_slab");
    ItemType CUT_RED_SANDSTONE_SLAB = getItemType("cut_red_sandstone_slab");
    ItemType PURPUR_SLAB = getItemType("purpur_slab");
    ItemType PRISMARINE_SLAB = getItemType("prismarine_slab");
    ItemType PRISMARINE_BRICK_SLAB = getItemType("prismarine_brick_slab");
    ItemType DARK_PRISMARINE_SLAB = getItemType("dark_prismarine_slab");
    ItemType SMOOTH_QUARTZ = getItemType("smooth_quartz");
    ItemType SMOOTH_RED_SANDSTONE = getItemType("smooth_red_sandstone");
    ItemType SMOOTH_SANDSTONE = getItemType("smooth_sandstone");
    ItemType SMOOTH_STONE = getItemType("smooth_stone");
    ItemType BRICKS = getItemType("bricks");
    ItemType BOOKSHELF = getItemType("bookshelf");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHISELED_BOOKSHELF = getItemType("chiseled_bookshelf");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType DECORATED_POT = getItemType("decorated_pot");
    ItemType MOSSY_COBBLESTONE = getItemType("mossy_cobblestone");
    ItemType OBSIDIAN = getItemType("obsidian");
    ItemType TORCH = getItemType("torch");
    ItemType END_ROD = getItemType("end_rod");
    ItemType CHORUS_PLANT = getItemType("chorus_plant");
    ItemType CHORUS_FLOWER = getItemType("chorus_flower");
    ItemType PURPUR_BLOCK = getItemType("purpur_block");
    ItemType PURPUR_PILLAR = getItemType("purpur_pillar");
    ItemType PURPUR_STAIRS = getItemType("purpur_stairs");
    ItemType SPAWNER = getItemType("spawner");
    ItemType CHEST = getItemType("chest");
    ItemType CRAFTING_TABLE = getItemType("crafting_table");
    ItemType FARMLAND = getItemType("farmland");
    ItemType FURNACE = getItemType("furnace");
    ItemType LADDER = getItemType("ladder");
    ItemType COBBLESTONE_STAIRS = getItemType("cobblestone_stairs");
    ItemType SNOW = getItemType("snow");
    ItemType ICE = getItemType("ice");
    ItemType SNOW_BLOCK = getItemType("snow_block");
    ItemType CACTUS = getItemType("cactus");
    ItemType CLAY = getItemType("clay");
    ItemType JUKEBOX = getItemType("jukebox");
    ItemType OAK_FENCE = getItemType("oak_fence");
    ItemType SPRUCE_FENCE = getItemType("spruce_fence");
    ItemType BIRCH_FENCE = getItemType("birch_fence");
    ItemType JUNGLE_FENCE = getItemType("jungle_fence");
    ItemType ACACIA_FENCE = getItemType("acacia_fence");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_FENCE = getItemType("cherry_fence");
    ItemType DARK_OAK_FENCE = getItemType("dark_oak_fence");
    ItemType MANGROVE_FENCE = getItemType("mangrove_fence");
    ItemType BAMBOO_FENCE = getItemType("bamboo_fence");
    ItemType CRIMSON_FENCE = getItemType("crimson_fence");
    ItemType WARPED_FENCE = getItemType("warped_fence");
    ItemType PUMPKIN = getItemType("pumpkin");
    ItemType CARVED_PUMPKIN = getItemType("carved_pumpkin");
    ItemType JACK_O_LANTERN = getItemType("jack_o_lantern");
    ItemType NETHERRACK = getItemType("netherrack");
    ItemType SOUL_SAND = getItemType("soul_sand");
    ItemType SOUL_SOIL = getItemType("soul_soil");
    ItemType BASALT = getItemType("basalt");
    ItemType POLISHED_BASALT = getItemType("polished_basalt");
    ItemType SMOOTH_BASALT = getItemType("smooth_basalt");
    ItemType SOUL_TORCH = getItemType("soul_torch");
    ItemType GLOWSTONE = getItemType("glowstone");
    ItemType INFESTED_STONE = getItemType("infested_stone");
    ItemType INFESTED_COBBLESTONE = getItemType("infested_cobblestone");
    ItemType INFESTED_STONE_BRICKS = getItemType("infested_stone_bricks");
    ItemType INFESTED_MOSSY_STONE_BRICKS = getItemType("infested_mossy_stone_bricks");
    ItemType INFESTED_CRACKED_STONE_BRICKS = getItemType("infested_cracked_stone_bricks");
    ItemType INFESTED_CHISELED_STONE_BRICKS = getItemType("infested_chiseled_stone_bricks");
    ItemType INFESTED_DEEPSLATE = getItemType("infested_deepslate");
    ItemType STONE_BRICKS = getItemType("stone_bricks");
    ItemType MOSSY_STONE_BRICKS = getItemType("mossy_stone_bricks");
    ItemType CRACKED_STONE_BRICKS = getItemType("cracked_stone_bricks");
    ItemType CHISELED_STONE_BRICKS = getItemType("chiseled_stone_bricks");
    ItemType PACKED_MUD = getItemType("packed_mud");
    ItemType MUD_BRICKS = getItemType("mud_bricks");
    ItemType DEEPSLATE_BRICKS = getItemType("deepslate_bricks");
    ItemType CRACKED_DEEPSLATE_BRICKS = getItemType("cracked_deepslate_bricks");
    ItemType DEEPSLATE_TILES = getItemType("deepslate_tiles");
    ItemType CRACKED_DEEPSLATE_TILES = getItemType("cracked_deepslate_tiles");
    ItemType CHISELED_DEEPSLATE = getItemType("chiseled_deepslate");
    ItemType REINFORCED_DEEPSLATE = getItemType("reinforced_deepslate");
    ItemType BROWN_MUSHROOM_BLOCK = getItemType("brown_mushroom_block");
    ItemType RED_MUSHROOM_BLOCK = getItemType("red_mushroom_block");
    ItemType MUSHROOM_STEM = getItemType("mushroom_stem");
    ItemType IRON_BARS = getItemType("iron_bars");
    ItemType CHAIN = getItemType("chain");
    ItemType GLASS_PANE = getItemType("glass_pane");
    ItemType MELON = getItemType("melon");
    ItemType VINE = getItemType("vine");
    ItemType GLOW_LICHEN = getItemType("glow_lichen");
    ItemType BRICK_STAIRS = getItemType("brick_stairs");
    ItemType STONE_BRICK_STAIRS = getItemType("stone_brick_stairs");
    ItemType MUD_BRICK_STAIRS = getItemType("mud_brick_stairs");
    ItemType MYCELIUM = getItemType("mycelium");
    ItemType LILY_PAD = getItemType("lily_pad");
    ItemType NETHER_BRICKS = getItemType("nether_bricks");
    ItemType CRACKED_NETHER_BRICKS = getItemType("cracked_nether_bricks");
    ItemType CHISELED_NETHER_BRICKS = getItemType("chiseled_nether_bricks");
    ItemType NETHER_BRICK_FENCE = getItemType("nether_brick_fence");
    ItemType NETHER_BRICK_STAIRS = getItemType("nether_brick_stairs");
    ItemType SCULK = getItemType("sculk");
    ItemType SCULK_VEIN = getItemType("sculk_vein");
    ItemType SCULK_CATALYST = getItemType("sculk_catalyst");
    ItemType SCULK_SHRIEKER = getItemType("sculk_shrieker");
    ItemType ENCHANTING_TABLE = getItemType("enchanting_table");
    ItemType END_PORTAL_FRAME = getItemType("end_portal_frame");
    ItemType END_STONE = getItemType("end_stone");
    ItemType END_STONE_BRICKS = getItemType("end_stone_bricks");
    ItemType DRAGON_EGG = getItemType("dragon_egg");
    ItemType SANDSTONE_STAIRS = getItemType("sandstone_stairs");
    ItemType ENDER_CHEST = getItemType("ender_chest");
    ItemType EMERALD_BLOCK = getItemType("emerald_block");
    ItemType OAK_STAIRS = getItemType("oak_stairs");
    ItemType SPRUCE_STAIRS = getItemType("spruce_stairs");
    ItemType BIRCH_STAIRS = getItemType("birch_stairs");
    ItemType JUNGLE_STAIRS = getItemType("jungle_stairs");
    ItemType ACACIA_STAIRS = getItemType("acacia_stairs");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_STAIRS = getItemType("cherry_stairs");
    ItemType DARK_OAK_STAIRS = getItemType("dark_oak_stairs");
    ItemType MANGROVE_STAIRS = getItemType("mangrove_stairs");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_STAIRS = getItemType("bamboo_stairs");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_MOSAIC_STAIRS = getItemType("bamboo_mosaic_stairs");
    ItemType CRIMSON_STAIRS = getItemType("crimson_stairs");
    ItemType WARPED_STAIRS = getItemType("warped_stairs");
    ItemType COMMAND_BLOCK = getItemType("command_block");
    ItemType BEACON = getItemType("beacon");
    ItemType COBBLESTONE_WALL = getItemType("cobblestone_wall");
    ItemType MOSSY_COBBLESTONE_WALL = getItemType("mossy_cobblestone_wall");
    ItemType BRICK_WALL = getItemType("brick_wall");
    ItemType PRISMARINE_WALL = getItemType("prismarine_wall");
    ItemType RED_SANDSTONE_WALL = getItemType("red_sandstone_wall");
    ItemType MOSSY_STONE_BRICK_WALL = getItemType("mossy_stone_brick_wall");
    ItemType GRANITE_WALL = getItemType("granite_wall");
    ItemType STONE_BRICK_WALL = getItemType("stone_brick_wall");
    ItemType MUD_BRICK_WALL = getItemType("mud_brick_wall");
    ItemType NETHER_BRICK_WALL = getItemType("nether_brick_wall");
    ItemType ANDESITE_WALL = getItemType("andesite_wall");
    ItemType RED_NETHER_BRICK_WALL = getItemType("red_nether_brick_wall");
    ItemType SANDSTONE_WALL = getItemType("sandstone_wall");
    ItemType END_STONE_BRICK_WALL = getItemType("end_stone_brick_wall");
    ItemType DIORITE_WALL = getItemType("diorite_wall");
    ItemType BLACKSTONE_WALL = getItemType("blackstone_wall");
    ItemType POLISHED_BLACKSTONE_WALL = getItemType("polished_blackstone_wall");
    ItemType POLISHED_BLACKSTONE_BRICK_WALL = getItemType("polished_blackstone_brick_wall");
    ItemType COBBLED_DEEPSLATE_WALL = getItemType("cobbled_deepslate_wall");
    ItemType POLISHED_DEEPSLATE_WALL = getItemType("polished_deepslate_wall");
    ItemType DEEPSLATE_BRICK_WALL = getItemType("deepslate_brick_wall");
    ItemType DEEPSLATE_TILE_WALL = getItemType("deepslate_tile_wall");
    ItemType ANVIL = getItemType("anvil");
    ItemType CHIPPED_ANVIL = getItemType("chipped_anvil");
    ItemType DAMAGED_ANVIL = getItemType("damaged_anvil");
    ItemType CHISELED_QUARTZ_BLOCK = getItemType("chiseled_quartz_block");
    ItemType QUARTZ_BLOCK = getItemType("quartz_block");
    ItemType QUARTZ_BRICKS = getItemType("quartz_bricks");
    ItemType QUARTZ_PILLAR = getItemType("quartz_pillar");
    ItemType QUARTZ_STAIRS = getItemType("quartz_stairs");
    ItemType WHITE_TERRACOTTA = getItemType("white_terracotta");
    ItemType ORANGE_TERRACOTTA = getItemType("orange_terracotta");
    ItemType MAGENTA_TERRACOTTA = getItemType("magenta_terracotta");
    ItemType LIGHT_BLUE_TERRACOTTA = getItemType("light_blue_terracotta");
    ItemType YELLOW_TERRACOTTA = getItemType("yellow_terracotta");
    ItemType LIME_TERRACOTTA = getItemType("lime_terracotta");
    ItemType PINK_TERRACOTTA = getItemType("pink_terracotta");
    ItemType GRAY_TERRACOTTA = getItemType("gray_terracotta");
    ItemType LIGHT_GRAY_TERRACOTTA = getItemType("light_gray_terracotta");
    ItemType CYAN_TERRACOTTA = getItemType("cyan_terracotta");
    ItemType PURPLE_TERRACOTTA = getItemType("purple_terracotta");
    ItemType BLUE_TERRACOTTA = getItemType("blue_terracotta");
    ItemType BROWN_TERRACOTTA = getItemType("brown_terracotta");
    ItemType GREEN_TERRACOTTA = getItemType("green_terracotta");
    ItemType RED_TERRACOTTA = getItemType("red_terracotta");
    ItemType BLACK_TERRACOTTA = getItemType("black_terracotta");
    ItemType BARRIER = getItemType("barrier");
    ItemType LIGHT = getItemType("light");
    ItemType HAY_BLOCK = getItemType("hay_block");
    ItemType WHITE_CARPET = getItemType("white_carpet");
    ItemType ORANGE_CARPET = getItemType("orange_carpet");
    ItemType MAGENTA_CARPET = getItemType("magenta_carpet");
    ItemType LIGHT_BLUE_CARPET = getItemType("light_blue_carpet");
    ItemType YELLOW_CARPET = getItemType("yellow_carpet");
    ItemType LIME_CARPET = getItemType("lime_carpet");
    ItemType PINK_CARPET = getItemType("pink_carpet");
    ItemType GRAY_CARPET = getItemType("gray_carpet");
    ItemType LIGHT_GRAY_CARPET = getItemType("light_gray_carpet");
    ItemType CYAN_CARPET = getItemType("cyan_carpet");
    ItemType PURPLE_CARPET = getItemType("purple_carpet");
    ItemType BLUE_CARPET = getItemType("blue_carpet");
    ItemType BROWN_CARPET = getItemType("brown_carpet");
    ItemType GREEN_CARPET = getItemType("green_carpet");
    ItemType RED_CARPET = getItemType("red_carpet");
    ItemType BLACK_CARPET = getItemType("black_carpet");
    ItemType TERRACOTTA = getItemType("terracotta");
    ItemType PACKED_ICE = getItemType("packed_ice");
    ItemType DIRT_PATH = getItemType("dirt_path");
    ItemType SUNFLOWER = getItemType("sunflower");
    ItemType LILAC = getItemType("lilac");
    ItemType ROSE_BUSH = getItemType("rose_bush");
    ItemType PEONY = getItemType("peony");
    ItemType TALL_GRASS = getItemType("tall_grass");
    ItemType LARGE_FERN = getItemType("large_fern");
    ItemType WHITE_STAINED_GLASS = getItemType("white_stained_glass");
    ItemType ORANGE_STAINED_GLASS = getItemType("orange_stained_glass");
    ItemType MAGENTA_STAINED_GLASS = getItemType("magenta_stained_glass");
    ItemType LIGHT_BLUE_STAINED_GLASS = getItemType("light_blue_stained_glass");
    ItemType YELLOW_STAINED_GLASS = getItemType("yellow_stained_glass");
    ItemType LIME_STAINED_GLASS = getItemType("lime_stained_glass");
    ItemType PINK_STAINED_GLASS = getItemType("pink_stained_glass");
    ItemType GRAY_STAINED_GLASS = getItemType("gray_stained_glass");
    ItemType LIGHT_GRAY_STAINED_GLASS = getItemType("light_gray_stained_glass");
    ItemType CYAN_STAINED_GLASS = getItemType("cyan_stained_glass");
    ItemType PURPLE_STAINED_GLASS = getItemType("purple_stained_glass");
    ItemType BLUE_STAINED_GLASS = getItemType("blue_stained_glass");
    ItemType BROWN_STAINED_GLASS = getItemType("brown_stained_glass");
    ItemType GREEN_STAINED_GLASS = getItemType("green_stained_glass");
    ItemType RED_STAINED_GLASS = getItemType("red_stained_glass");
    ItemType BLACK_STAINED_GLASS = getItemType("black_stained_glass");
    ItemType WHITE_STAINED_GLASS_PANE = getItemType("white_stained_glass_pane");
    ItemType ORANGE_STAINED_GLASS_PANE = getItemType("orange_stained_glass_pane");
    ItemType MAGENTA_STAINED_GLASS_PANE = getItemType("magenta_stained_glass_pane");
    ItemType LIGHT_BLUE_STAINED_GLASS_PANE = getItemType("light_blue_stained_glass_pane");
    ItemType YELLOW_STAINED_GLASS_PANE = getItemType("yellow_stained_glass_pane");
    ItemType LIME_STAINED_GLASS_PANE = getItemType("lime_stained_glass_pane");
    ItemType PINK_STAINED_GLASS_PANE = getItemType("pink_stained_glass_pane");
    ItemType GRAY_STAINED_GLASS_PANE = getItemType("gray_stained_glass_pane");
    ItemType LIGHT_GRAY_STAINED_GLASS_PANE = getItemType("light_gray_stained_glass_pane");
    ItemType CYAN_STAINED_GLASS_PANE = getItemType("cyan_stained_glass_pane");
    ItemType PURPLE_STAINED_GLASS_PANE = getItemType("purple_stained_glass_pane");
    ItemType BLUE_STAINED_GLASS_PANE = getItemType("blue_stained_glass_pane");
    ItemType BROWN_STAINED_GLASS_PANE = getItemType("brown_stained_glass_pane");
    ItemType GREEN_STAINED_GLASS_PANE = getItemType("green_stained_glass_pane");
    ItemType RED_STAINED_GLASS_PANE = getItemType("red_stained_glass_pane");
    ItemType BLACK_STAINED_GLASS_PANE = getItemType("black_stained_glass_pane");
    ItemType PRISMARINE = getItemType("prismarine");
    ItemType PRISMARINE_BRICKS = getItemType("prismarine_bricks");
    ItemType DARK_PRISMARINE = getItemType("dark_prismarine");
    ItemType PRISMARINE_STAIRS = getItemType("prismarine_stairs");
    ItemType PRISMARINE_BRICK_STAIRS = getItemType("prismarine_brick_stairs");
    ItemType DARK_PRISMARINE_STAIRS = getItemType("dark_prismarine_stairs");
    ItemType SEA_LANTERN = getItemType("sea_lantern");
    ItemType RED_SANDSTONE = getItemType("red_sandstone");
    ItemType CHISELED_RED_SANDSTONE = getItemType("chiseled_red_sandstone");
    ItemType CUT_RED_SANDSTONE = getItemType("cut_red_sandstone");
    ItemType RED_SANDSTONE_STAIRS = getItemType("red_sandstone_stairs");
    ItemType REPEATING_COMMAND_BLOCK = getItemType("repeating_command_block");
    ItemType CHAIN_COMMAND_BLOCK = getItemType("chain_command_block");
    ItemType MAGMA_BLOCK = getItemType("magma_block");
    ItemType NETHER_WART_BLOCK = getItemType("nether_wart_block");
    ItemType WARPED_WART_BLOCK = getItemType("warped_wart_block");
    ItemType RED_NETHER_BRICKS = getItemType("red_nether_bricks");
    ItemType BONE_BLOCK = getItemType("bone_block");
    ItemType STRUCTURE_VOID = getItemType("structure_void");
    ItemType SHULKER_BOX = getItemType("shulker_box");
    ItemType WHITE_SHULKER_BOX = getItemType("white_shulker_box");
    ItemType ORANGE_SHULKER_BOX = getItemType("orange_shulker_box");
    ItemType MAGENTA_SHULKER_BOX = getItemType("magenta_shulker_box");
    ItemType LIGHT_BLUE_SHULKER_BOX = getItemType("light_blue_shulker_box");
    ItemType YELLOW_SHULKER_BOX = getItemType("yellow_shulker_box");
    ItemType LIME_SHULKER_BOX = getItemType("lime_shulker_box");
    ItemType PINK_SHULKER_BOX = getItemType("pink_shulker_box");
    ItemType GRAY_SHULKER_BOX = getItemType("gray_shulker_box");
    ItemType LIGHT_GRAY_SHULKER_BOX = getItemType("light_gray_shulker_box");
    ItemType CYAN_SHULKER_BOX = getItemType("cyan_shulker_box");
    ItemType PURPLE_SHULKER_BOX = getItemType("purple_shulker_box");
    ItemType BLUE_SHULKER_BOX = getItemType("blue_shulker_box");
    ItemType BROWN_SHULKER_BOX = getItemType("brown_shulker_box");
    ItemType GREEN_SHULKER_BOX = getItemType("green_shulker_box");
    ItemType RED_SHULKER_BOX = getItemType("red_shulker_box");
    ItemType BLACK_SHULKER_BOX = getItemType("black_shulker_box");
    ItemType WHITE_GLAZED_TERRACOTTA = getItemType("white_glazed_terracotta");
    ItemType ORANGE_GLAZED_TERRACOTTA = getItemType("orange_glazed_terracotta");
    ItemType MAGENTA_GLAZED_TERRACOTTA = getItemType("magenta_glazed_terracotta");
    ItemType LIGHT_BLUE_GLAZED_TERRACOTTA = getItemType("light_blue_glazed_terracotta");
    ItemType YELLOW_GLAZED_TERRACOTTA = getItemType("yellow_glazed_terracotta");
    ItemType LIME_GLAZED_TERRACOTTA = getItemType("lime_glazed_terracotta");
    ItemType PINK_GLAZED_TERRACOTTA = getItemType("pink_glazed_terracotta");
    ItemType GRAY_GLAZED_TERRACOTTA = getItemType("gray_glazed_terracotta");
    ItemType LIGHT_GRAY_GLAZED_TERRACOTTA = getItemType("light_gray_glazed_terracotta");
    ItemType CYAN_GLAZED_TERRACOTTA = getItemType("cyan_glazed_terracotta");
    ItemType PURPLE_GLAZED_TERRACOTTA = getItemType("purple_glazed_terracotta");
    ItemType BLUE_GLAZED_TERRACOTTA = getItemType("blue_glazed_terracotta");
    ItemType BROWN_GLAZED_TERRACOTTA = getItemType("brown_glazed_terracotta");
    ItemType GREEN_GLAZED_TERRACOTTA = getItemType("green_glazed_terracotta");
    ItemType RED_GLAZED_TERRACOTTA = getItemType("red_glazed_terracotta");
    ItemType BLACK_GLAZED_TERRACOTTA = getItemType("black_glazed_terracotta");
    ItemType WHITE_CONCRETE = getItemType("white_concrete");
    ItemType ORANGE_CONCRETE = getItemType("orange_concrete");
    ItemType MAGENTA_CONCRETE = getItemType("magenta_concrete");
    ItemType LIGHT_BLUE_CONCRETE = getItemType("light_blue_concrete");
    ItemType YELLOW_CONCRETE = getItemType("yellow_concrete");
    ItemType LIME_CONCRETE = getItemType("lime_concrete");
    ItemType PINK_CONCRETE = getItemType("pink_concrete");
    ItemType GRAY_CONCRETE = getItemType("gray_concrete");
    ItemType LIGHT_GRAY_CONCRETE = getItemType("light_gray_concrete");
    ItemType CYAN_CONCRETE = getItemType("cyan_concrete");
    ItemType PURPLE_CONCRETE = getItemType("purple_concrete");
    ItemType BLUE_CONCRETE = getItemType("blue_concrete");
    ItemType BROWN_CONCRETE = getItemType("brown_concrete");
    ItemType GREEN_CONCRETE = getItemType("green_concrete");
    ItemType RED_CONCRETE = getItemType("red_concrete");
    ItemType BLACK_CONCRETE = getItemType("black_concrete");
    ItemType WHITE_CONCRETE_POWDER = getItemType("white_concrete_powder");
    ItemType ORANGE_CONCRETE_POWDER = getItemType("orange_concrete_powder");
    ItemType MAGENTA_CONCRETE_POWDER = getItemType("magenta_concrete_powder");
    ItemType LIGHT_BLUE_CONCRETE_POWDER = getItemType("light_blue_concrete_powder");
    ItemType YELLOW_CONCRETE_POWDER = getItemType("yellow_concrete_powder");
    ItemType LIME_CONCRETE_POWDER = getItemType("lime_concrete_powder");
    ItemType PINK_CONCRETE_POWDER = getItemType("pink_concrete_powder");
    ItemType GRAY_CONCRETE_POWDER = getItemType("gray_concrete_powder");
    ItemType LIGHT_GRAY_CONCRETE_POWDER = getItemType("light_gray_concrete_powder");
    ItemType CYAN_CONCRETE_POWDER = getItemType("cyan_concrete_powder");
    ItemType PURPLE_CONCRETE_POWDER = getItemType("purple_concrete_powder");
    ItemType BLUE_CONCRETE_POWDER = getItemType("blue_concrete_powder");
    ItemType BROWN_CONCRETE_POWDER = getItemType("brown_concrete_powder");
    ItemType GREEN_CONCRETE_POWDER = getItemType("green_concrete_powder");
    ItemType RED_CONCRETE_POWDER = getItemType("red_concrete_powder");
    ItemType BLACK_CONCRETE_POWDER = getItemType("black_concrete_powder");
    ItemType TURTLE_EGG = getItemType("turtle_egg");
    ItemType DEAD_TUBE_CORAL_BLOCK = getItemType("dead_tube_coral_block");
    ItemType DEAD_BRAIN_CORAL_BLOCK = getItemType("dead_brain_coral_block");
    ItemType DEAD_BUBBLE_CORAL_BLOCK = getItemType("dead_bubble_coral_block");
    ItemType DEAD_FIRE_CORAL_BLOCK = getItemType("dead_fire_coral_block");
    ItemType DEAD_HORN_CORAL_BLOCK = getItemType("dead_horn_coral_block");
    ItemType TUBE_CORAL_BLOCK = getItemType("tube_coral_block");
    ItemType BRAIN_CORAL_BLOCK = getItemType("brain_coral_block");
    ItemType BUBBLE_CORAL_BLOCK = getItemType("bubble_coral_block");
    ItemType FIRE_CORAL_BLOCK = getItemType("fire_coral_block");
    ItemType HORN_CORAL_BLOCK = getItemType("horn_coral_block");
    ItemType TUBE_CORAL = getItemType("tube_coral");
    ItemType BRAIN_CORAL = getItemType("brain_coral");
    ItemType BUBBLE_CORAL = getItemType("bubble_coral");
    ItemType FIRE_CORAL = getItemType("fire_coral");
    ItemType HORN_CORAL = getItemType("horn_coral");
    ItemType DEAD_BRAIN_CORAL = getItemType("dead_brain_coral");
    ItemType DEAD_BUBBLE_CORAL = getItemType("dead_bubble_coral");
    ItemType DEAD_FIRE_CORAL = getItemType("dead_fire_coral");
    ItemType DEAD_HORN_CORAL = getItemType("dead_horn_coral");
    ItemType DEAD_TUBE_CORAL = getItemType("dead_tube_coral");
    ItemType TUBE_CORAL_FAN = getItemType("tube_coral_fan");
    ItemType BRAIN_CORAL_FAN = getItemType("brain_coral_fan");
    ItemType BUBBLE_CORAL_FAN = getItemType("bubble_coral_fan");
    ItemType FIRE_CORAL_FAN = getItemType("fire_coral_fan");
    ItemType HORN_CORAL_FAN = getItemType("horn_coral_fan");
    ItemType DEAD_TUBE_CORAL_FAN = getItemType("dead_tube_coral_fan");
    ItemType DEAD_BRAIN_CORAL_FAN = getItemType("dead_brain_coral_fan");
    ItemType DEAD_BUBBLE_CORAL_FAN = getItemType("dead_bubble_coral_fan");
    ItemType DEAD_FIRE_CORAL_FAN = getItemType("dead_fire_coral_fan");
    ItemType DEAD_HORN_CORAL_FAN = getItemType("dead_horn_coral_fan");
    ItemType BLUE_ICE = getItemType("blue_ice");
    ItemType CONDUIT = getItemType("conduit");
    ItemType POLISHED_GRANITE_STAIRS = getItemType("polished_granite_stairs");
    ItemType SMOOTH_RED_SANDSTONE_STAIRS = getItemType("smooth_red_sandstone_stairs");
    ItemType MOSSY_STONE_BRICK_STAIRS = getItemType("mossy_stone_brick_stairs");
    ItemType POLISHED_DIORITE_STAIRS = getItemType("polished_diorite_stairs");
    ItemType MOSSY_COBBLESTONE_STAIRS = getItemType("mossy_cobblestone_stairs");
    ItemType END_STONE_BRICK_STAIRS = getItemType("end_stone_brick_stairs");
    ItemType STONE_STAIRS = getItemType("stone_stairs");
    ItemType SMOOTH_SANDSTONE_STAIRS = getItemType("smooth_sandstone_stairs");
    ItemType SMOOTH_QUARTZ_STAIRS = getItemType("smooth_quartz_stairs");
    ItemType GRANITE_STAIRS = getItemType("granite_stairs");
    ItemType ANDESITE_STAIRS = getItemType("andesite_stairs");
    ItemType RED_NETHER_BRICK_STAIRS = getItemType("red_nether_brick_stairs");
    ItemType POLISHED_ANDESITE_STAIRS = getItemType("polished_andesite_stairs");
    ItemType DIORITE_STAIRS = getItemType("diorite_stairs");
    ItemType COBBLED_DEEPSLATE_STAIRS = getItemType("cobbled_deepslate_stairs");
    ItemType POLISHED_DEEPSLATE_STAIRS = getItemType("polished_deepslate_stairs");
    ItemType DEEPSLATE_BRICK_STAIRS = getItemType("deepslate_brick_stairs");
    ItemType DEEPSLATE_TILE_STAIRS = getItemType("deepslate_tile_stairs");
    ItemType POLISHED_GRANITE_SLAB = getItemType("polished_granite_slab");
    ItemType SMOOTH_RED_SANDSTONE_SLAB = getItemType("smooth_red_sandstone_slab");
    ItemType MOSSY_STONE_BRICK_SLAB = getItemType("mossy_stone_brick_slab");
    ItemType POLISHED_DIORITE_SLAB = getItemType("polished_diorite_slab");
    ItemType MOSSY_COBBLESTONE_SLAB = getItemType("mossy_cobblestone_slab");
    ItemType END_STONE_BRICK_SLAB = getItemType("end_stone_brick_slab");
    ItemType SMOOTH_SANDSTONE_SLAB = getItemType("smooth_sandstone_slab");
    ItemType SMOOTH_QUARTZ_SLAB = getItemType("smooth_quartz_slab");
    ItemType GRANITE_SLAB = getItemType("granite_slab");
    ItemType ANDESITE_SLAB = getItemType("andesite_slab");
    ItemType RED_NETHER_BRICK_SLAB = getItemType("red_nether_brick_slab");
    ItemType POLISHED_ANDESITE_SLAB = getItemType("polished_andesite_slab");
    ItemType DIORITE_SLAB = getItemType("diorite_slab");
    ItemType COBBLED_DEEPSLATE_SLAB = getItemType("cobbled_deepslate_slab");
    ItemType POLISHED_DEEPSLATE_SLAB = getItemType("polished_deepslate_slab");
    ItemType DEEPSLATE_BRICK_SLAB = getItemType("deepslate_brick_slab");
    ItemType DEEPSLATE_TILE_SLAB = getItemType("deepslate_tile_slab");
    ItemType SCAFFOLDING = getItemType("scaffolding");
    ItemType REDSTONE = getItemType("redstone");
    ItemType REDSTONE_TORCH = getItemType("redstone_torch");
    ItemType REDSTONE_BLOCK = getItemType("redstone_block");
    ItemType REPEATER = getItemType("repeater");
    ItemType COMPARATOR = getItemType("comparator");
    ItemType PISTON = getItemType("piston");
    ItemType STICKY_PISTON = getItemType("sticky_piston");
    ItemType SLIME_BLOCK = getItemType("slime_block");
    ItemType HONEY_BLOCK = getItemType("honey_block");
    ItemType OBSERVER = getItemType("observer");
    ItemType HOPPER = getItemType("hopper");
    ItemType DISPENSER = getItemType("dispenser");
    ItemType DROPPER = getItemType("dropper");
    ItemType LECTERN = getItemType("lectern");
    ItemType TARGET = getItemType("target");
    ItemType LEVER = getItemType("lever");
    ItemType LIGHTNING_ROD = getItemType("lightning_rod");
    ItemType DAYLIGHT_DETECTOR = getItemType("daylight_detector");
    ItemType SCULK_SENSOR = getItemType("sculk_sensor");
    ItemType TRIPWIRE_HOOK = getItemType("tripwire_hook");
    ItemType TRAPPED_CHEST = getItemType("trapped_chest");
    ItemType TNT = getItemType("tnt");
    ItemType REDSTONE_LAMP = getItemType("redstone_lamp");
    ItemType NOTE_BLOCK = getItemType("note_block");
    ItemType STONE_BUTTON = getItemType("stone_button");
    ItemType POLISHED_BLACKSTONE_BUTTON = getItemType("polished_blackstone_button");
    ItemType OAK_BUTTON = getItemType("oak_button");
    ItemType SPRUCE_BUTTON = getItemType("spruce_button");
    ItemType BIRCH_BUTTON = getItemType("birch_button");
    ItemType JUNGLE_BUTTON = getItemType("jungle_button");
    ItemType ACACIA_BUTTON = getItemType("acacia_button");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_BUTTON = getItemType("cherry_button");
    ItemType DARK_OAK_BUTTON = getItemType("dark_oak_button");
    ItemType MANGROVE_BUTTON = getItemType("mangrove_button");
    ItemType BAMBOO_BUTTON = getItemType("bamboo_button");
    ItemType CRIMSON_BUTTON = getItemType("crimson_button");
    ItemType WARPED_BUTTON = getItemType("warped_button");
    ItemType STONE_PRESSURE_PLATE = getItemType("stone_pressure_plate");
    ItemType POLISHED_BLACKSTONE_PRESSURE_PLATE = getItemType("polished_blackstone_pressure_plate");
    ItemType LIGHT_WEIGHTED_PRESSURE_PLATE = getItemType("light_weighted_pressure_plate");
    ItemType HEAVY_WEIGHTED_PRESSURE_PLATE = getItemType("heavy_weighted_pressure_plate");
    ItemType OAK_PRESSURE_PLATE = getItemType("oak_pressure_plate");
    ItemType SPRUCE_PRESSURE_PLATE = getItemType("spruce_pressure_plate");
    ItemType BIRCH_PRESSURE_PLATE = getItemType("birch_pressure_plate");
    ItemType JUNGLE_PRESSURE_PLATE = getItemType("jungle_pressure_plate");
    ItemType ACACIA_PRESSURE_PLATE = getItemType("acacia_pressure_plate");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_PRESSURE_PLATE = getItemType("cherry_pressure_plate");
    ItemType DARK_OAK_PRESSURE_PLATE = getItemType("dark_oak_pressure_plate");
    ItemType MANGROVE_PRESSURE_PLATE = getItemType("mangrove_pressure_plate");
    ItemType BAMBOO_PRESSURE_PLATE = getItemType("bamboo_pressure_plate");
    ItemType CRIMSON_PRESSURE_PLATE = getItemType("crimson_pressure_plate");
    ItemType WARPED_PRESSURE_PLATE = getItemType("warped_pressure_plate");
    ItemType IRON_DOOR = getItemType("iron_door");
    ItemType OAK_DOOR = getItemType("oak_door");
    ItemType SPRUCE_DOOR = getItemType("spruce_door");
    ItemType BIRCH_DOOR = getItemType("birch_door");
    ItemType JUNGLE_DOOR = getItemType("jungle_door");
    ItemType ACACIA_DOOR = getItemType("acacia_door");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_DOOR = getItemType("cherry_door");
    ItemType DARK_OAK_DOOR = getItemType("dark_oak_door");
    ItemType MANGROVE_DOOR = getItemType("mangrove_door");
    ItemType BAMBOO_DOOR = getItemType("bamboo_door");
    ItemType CRIMSON_DOOR = getItemType("crimson_door");
    ItemType WARPED_DOOR = getItemType("warped_door");
    ItemType IRON_TRAPDOOR = getItemType("iron_trapdoor");
    ItemType OAK_TRAPDOOR = getItemType("oak_trapdoor");
    ItemType SPRUCE_TRAPDOOR = getItemType("spruce_trapdoor");
    ItemType BIRCH_TRAPDOOR = getItemType("birch_trapdoor");
    ItemType JUNGLE_TRAPDOOR = getItemType("jungle_trapdoor");
    ItemType ACACIA_TRAPDOOR = getItemType("acacia_trapdoor");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_TRAPDOOR = getItemType("cherry_trapdoor");
    ItemType DARK_OAK_TRAPDOOR = getItemType("dark_oak_trapdoor");
    ItemType MANGROVE_TRAPDOOR = getItemType("mangrove_trapdoor");
    ItemType BAMBOO_TRAPDOOR = getItemType("bamboo_trapdoor");
    ItemType CRIMSON_TRAPDOOR = getItemType("crimson_trapdoor");
    ItemType WARPED_TRAPDOOR = getItemType("warped_trapdoor");
    ItemType OAK_FENCE_GATE = getItemType("oak_fence_gate");
    ItemType SPRUCE_FENCE_GATE = getItemType("spruce_fence_gate");
    ItemType BIRCH_FENCE_GATE = getItemType("birch_fence_gate");
    ItemType JUNGLE_FENCE_GATE = getItemType("jungle_fence_gate");
    ItemType ACACIA_FENCE_GATE = getItemType("acacia_fence_gate");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_FENCE_GATE = getItemType("cherry_fence_gate");
    ItemType DARK_OAK_FENCE_GATE = getItemType("dark_oak_fence_gate");
    ItemType MANGROVE_FENCE_GATE = getItemType("mangrove_fence_gate");
    ItemType BAMBOO_FENCE_GATE = getItemType("bamboo_fence_gate");
    ItemType CRIMSON_FENCE_GATE = getItemType("crimson_fence_gate");
    ItemType WARPED_FENCE_GATE = getItemType("warped_fence_gate");
    ItemType POWERED_RAIL = getItemType("powered_rail");
    ItemType DETECTOR_RAIL = getItemType("detector_rail");
    ItemType RAIL = getItemType("rail");
    ItemType ACTIVATOR_RAIL = getItemType("activator_rail");
    ItemType SADDLE = getItemType("saddle");
    ItemType MINECART = getItemType("minecart");
    ItemType CHEST_MINECART = getItemType("chest_minecart");
    ItemType FURNACE_MINECART = getItemType("furnace_minecart");
    ItemType TNT_MINECART = getItemType("tnt_minecart");
    ItemType HOPPER_MINECART = getItemType("hopper_minecart");
    ItemType CARROT_ON_A_STICK = getItemType("carrot_on_a_stick");
    ItemType WARPED_FUNGUS_ON_A_STICK = getItemType("warped_fungus_on_a_stick");
    ItemType ELYTRA = getItemType("elytra");
    ItemType OAK_BOAT = getItemType("oak_boat");
    ItemType OAK_CHEST_BOAT = getItemType("oak_chest_boat");
    ItemType SPRUCE_BOAT = getItemType("spruce_boat");
    ItemType SPRUCE_CHEST_BOAT = getItemType("spruce_chest_boat");
    ItemType BIRCH_BOAT = getItemType("birch_boat");
    ItemType BIRCH_CHEST_BOAT = getItemType("birch_chest_boat");
    ItemType JUNGLE_BOAT = getItemType("jungle_boat");
    ItemType JUNGLE_CHEST_BOAT = getItemType("jungle_chest_boat");
    ItemType ACACIA_BOAT = getItemType("acacia_boat");
    ItemType ACACIA_CHEST_BOAT = getItemType("acacia_chest_boat");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_BOAT = getItemType("cherry_boat");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_CHEST_BOAT = getItemType("cherry_chest_boat");
    ItemType DARK_OAK_BOAT = getItemType("dark_oak_boat");
    ItemType DARK_OAK_CHEST_BOAT = getItemType("dark_oak_chest_boat");
    ItemType MANGROVE_BOAT = getItemType("mangrove_boat");
    ItemType MANGROVE_CHEST_BOAT = getItemType("mangrove_chest_boat");
    ItemType BAMBOO_RAFT = getItemType("bamboo_raft");
    ItemType BAMBOO_CHEST_RAFT = getItemType("bamboo_chest_raft");
    ItemType STRUCTURE_BLOCK = getItemType("structure_block");
    ItemType JIGSAW = getItemType("jigsaw");
    ItemType TURTLE_HELMET = getItemType("turtle_helmet");
    ItemType SCUTE = getItemType("scute");
    ItemType FLINT_AND_STEEL = getItemType("flint_and_steel");
    ItemType APPLE = getItemType("apple");
    ItemType BOW = getItemType("bow");
    ItemType ARROW = getItemType("arrow");
    ItemType COAL = getItemType("coal");
    ItemType CHARCOAL = getItemType("charcoal");
    ItemType DIAMOND = getItemType("diamond");
    ItemType EMERALD = getItemType("emerald");
    ItemType LAPIS_LAZULI = getItemType("lapis_lazuli");
    ItemType QUARTZ = getItemType("quartz");
    ItemType AMETHYST_SHARD = getItemType("amethyst_shard");
    ItemType RAW_IRON = getItemType("raw_iron");
    ItemType IRON_INGOT = getItemType("iron_ingot");
    ItemType RAW_COPPER = getItemType("raw_copper");
    ItemType COPPER_INGOT = getItemType("copper_ingot");
    ItemType RAW_GOLD = getItemType("raw_gold");
    ItemType GOLD_INGOT = getItemType("gold_ingot");
    ItemType NETHERITE_INGOT = getItemType("netherite_ingot");
    ItemType NETHERITE_SCRAP = getItemType("netherite_scrap");
    ItemType WOODEN_SWORD = getItemType("wooden_sword");
    ItemType WOODEN_SHOVEL = getItemType("wooden_shovel");
    ItemType WOODEN_PICKAXE = getItemType("wooden_pickaxe");
    ItemType WOODEN_AXE = getItemType("wooden_axe");
    ItemType WOODEN_HOE = getItemType("wooden_hoe");
    ItemType STONE_SWORD = getItemType("stone_sword");
    ItemType STONE_SHOVEL = getItemType("stone_shovel");
    ItemType STONE_PICKAXE = getItemType("stone_pickaxe");
    ItemType STONE_AXE = getItemType("stone_axe");
    ItemType STONE_HOE = getItemType("stone_hoe");
    ItemType GOLDEN_SWORD = getItemType("golden_sword");
    ItemType GOLDEN_SHOVEL = getItemType("golden_shovel");
    ItemType GOLDEN_PICKAXE = getItemType("golden_pickaxe");
    ItemType GOLDEN_AXE = getItemType("golden_axe");
    ItemType GOLDEN_HOE = getItemType("golden_hoe");
    ItemType IRON_SWORD = getItemType("iron_sword");
    ItemType IRON_SHOVEL = getItemType("iron_shovel");
    ItemType IRON_PICKAXE = getItemType("iron_pickaxe");
    ItemType IRON_AXE = getItemType("iron_axe");
    ItemType IRON_HOE = getItemType("iron_hoe");
    ItemType DIAMOND_SWORD = getItemType("diamond_sword");
    ItemType DIAMOND_SHOVEL = getItemType("diamond_shovel");
    ItemType DIAMOND_PICKAXE = getItemType("diamond_pickaxe");
    ItemType DIAMOND_AXE = getItemType("diamond_axe");
    ItemType DIAMOND_HOE = getItemType("diamond_hoe");
    ItemType NETHERITE_SWORD = getItemType("netherite_sword");
    ItemType NETHERITE_SHOVEL = getItemType("netherite_shovel");
    ItemType NETHERITE_PICKAXE = getItemType("netherite_pickaxe");
    ItemType NETHERITE_AXE = getItemType("netherite_axe");
    ItemType NETHERITE_HOE = getItemType("netherite_hoe");
    ItemType STICK = getItemType("stick");
    ItemType BOWL = getItemType("bowl");
    ItemType MUSHROOM_STEW = getItemType("mushroom_stew");
    ItemType STRING = getItemType("string");
    ItemType FEATHER = getItemType("feather");
    ItemType GUNPOWDER = getItemType("gunpowder");
    ItemType WHEAT_SEEDS = getItemType("wheat_seeds");
    ItemType WHEAT = getItemType("wheat");
    ItemType BREAD = getItemType("bread");
    ItemType LEATHER_HELMET = getItemType("leather_helmet");
    ItemType LEATHER_CHESTPLATE = getItemType("leather_chestplate");
    ItemType LEATHER_LEGGINGS = getItemType("leather_leggings");
    ItemType LEATHER_BOOTS = getItemType("leather_boots");
    ItemType CHAINMAIL_HELMET = getItemType("chainmail_helmet");
    ItemType CHAINMAIL_CHESTPLATE = getItemType("chainmail_chestplate");
    ItemType CHAINMAIL_LEGGINGS = getItemType("chainmail_leggings");
    ItemType CHAINMAIL_BOOTS = getItemType("chainmail_boots");
    ItemType IRON_HELMET = getItemType("iron_helmet");
    ItemType IRON_CHESTPLATE = getItemType("iron_chestplate");
    ItemType IRON_LEGGINGS = getItemType("iron_leggings");
    ItemType IRON_BOOTS = getItemType("iron_boots");
    ItemType DIAMOND_HELMET = getItemType("diamond_helmet");
    ItemType DIAMOND_CHESTPLATE = getItemType("diamond_chestplate");
    ItemType DIAMOND_LEGGINGS = getItemType("diamond_leggings");
    ItemType DIAMOND_BOOTS = getItemType("diamond_boots");
    ItemType GOLDEN_HELMET = getItemType("golden_helmet");
    ItemType GOLDEN_CHESTPLATE = getItemType("golden_chestplate");
    ItemType GOLDEN_LEGGINGS = getItemType("golden_leggings");
    ItemType GOLDEN_BOOTS = getItemType("golden_boots");
    ItemType NETHERITE_HELMET = getItemType("netherite_helmet");
    ItemType NETHERITE_CHESTPLATE = getItemType("netherite_chestplate");
    ItemType NETHERITE_LEGGINGS = getItemType("netherite_leggings");
    ItemType NETHERITE_BOOTS = getItemType("netherite_boots");
    ItemType FLINT = getItemType("flint");
    ItemType PORKCHOP = getItemType("porkchop");
    ItemType COOKED_PORKCHOP = getItemType("cooked_porkchop");
    ItemType PAINTING = getItemType("painting");
    ItemType GOLDEN_APPLE = getItemType("golden_apple");
    ItemType ENCHANTED_GOLDEN_APPLE = getItemType("enchanted_golden_apple");
    ItemType OAK_SIGN = getItemType("oak_sign");
    ItemType SPRUCE_SIGN = getItemType("spruce_sign");
    ItemType BIRCH_SIGN = getItemType("birch_sign");
    ItemType JUNGLE_SIGN = getItemType("jungle_sign");
    ItemType ACACIA_SIGN = getItemType("acacia_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_SIGN = getItemType("cherry_sign");
    ItemType DARK_OAK_SIGN = getItemType("dark_oak_sign");
    ItemType MANGROVE_SIGN = getItemType("mangrove_sign");
    ItemType BAMBOO_SIGN = getItemType("bamboo_sign");
    ItemType CRIMSON_SIGN = getItemType("crimson_sign");
    ItemType WARPED_SIGN = getItemType("warped_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType OAK_HANGING_SIGN = getItemType("oak_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SPRUCE_HANGING_SIGN = getItemType("spruce_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BIRCH_HANGING_SIGN = getItemType("birch_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType JUNGLE_HANGING_SIGN = getItemType("jungle_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType ACACIA_HANGING_SIGN = getItemType("acacia_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_HANGING_SIGN = getItemType("cherry_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType DARK_OAK_HANGING_SIGN = getItemType("dark_oak_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType MANGROVE_HANGING_SIGN = getItemType("mangrove_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_HANGING_SIGN = getItemType("bamboo_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CRIMSON_HANGING_SIGN = getItemType("crimson_hanging_sign");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType WARPED_HANGING_SIGN = getItemType("warped_hanging_sign");
    ItemType BUCKET = getItemType("bucket");
    ItemType WATER_BUCKET = getItemType("water_bucket");
    ItemType LAVA_BUCKET = getItemType("lava_bucket");
    ItemType POWDER_SNOW_BUCKET = getItemType("powder_snow_bucket");
    ItemType SNOWBALL = getItemType("snowball");
    ItemType LEATHER = getItemType("leather");
    ItemType MILK_BUCKET = getItemType("milk_bucket");
    ItemType PUFFERFISH_BUCKET = getItemType("pufferfish_bucket");
    ItemType SALMON_BUCKET = getItemType("salmon_bucket");
    ItemType COD_BUCKET = getItemType("cod_bucket");
    ItemType TROPICAL_FISH_BUCKET = getItemType("tropical_fish_bucket");
    ItemType AXOLOTL_BUCKET = getItemType("axolotl_bucket");
    ItemType TADPOLE_BUCKET = getItemType("tadpole_bucket");
    ItemType BRICK = getItemType("brick");
    ItemType CLAY_BALL = getItemType("clay_ball");
    ItemType DRIED_KELP_BLOCK = getItemType("dried_kelp_block");
    ItemType PAPER = getItemType("paper");
    ItemType BOOK = getItemType("book");
    ItemType SLIME_BALL = getItemType("slime_ball");
    ItemType EGG = getItemType("egg");
    ItemType COMPASS = getItemType("compass");
    ItemType RECOVERY_COMPASS = getItemType("recovery_compass");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BUNDLE = getItemType("bundle");
    ItemType FISHING_ROD = getItemType("fishing_rod");
    ItemType CLOCK = getItemType("clock");
    ItemType SPYGLASS = getItemType("spyglass");
    ItemType GLOWSTONE_DUST = getItemType("glowstone_dust");
    ItemType COD = getItemType("cod");
    ItemType SALMON = getItemType("salmon");
    ItemType TROPICAL_FISH = getItemType("tropical_fish");
    ItemType PUFFERFISH = getItemType("pufferfish");
    ItemType COOKED_COD = getItemType("cooked_cod");
    ItemType COOKED_SALMON = getItemType("cooked_salmon");
    ItemType INK_SAC = getItemType("ink_sac");
    ItemType GLOW_INK_SAC = getItemType("glow_ink_sac");
    ItemType COCOA_BEANS = getItemType("cocoa_beans");
    ItemType WHITE_DYE = getItemType("white_dye");
    ItemType ORANGE_DYE = getItemType("orange_dye");
    ItemType MAGENTA_DYE = getItemType("magenta_dye");
    ItemType LIGHT_BLUE_DYE = getItemType("light_blue_dye");
    ItemType YELLOW_DYE = getItemType("yellow_dye");
    ItemType LIME_DYE = getItemType("lime_dye");
    ItemType PINK_DYE = getItemType("pink_dye");
    ItemType GRAY_DYE = getItemType("gray_dye");
    ItemType LIGHT_GRAY_DYE = getItemType("light_gray_dye");
    ItemType CYAN_DYE = getItemType("cyan_dye");
    ItemType PURPLE_DYE = getItemType("purple_dye");
    ItemType BLUE_DYE = getItemType("blue_dye");
    ItemType BROWN_DYE = getItemType("brown_dye");
    ItemType GREEN_DYE = getItemType("green_dye");
    ItemType RED_DYE = getItemType("red_dye");
    ItemType BLACK_DYE = getItemType("black_dye");
    ItemType BONE_MEAL = getItemType("bone_meal");
    ItemType BONE = getItemType("bone");
    ItemType SUGAR = getItemType("sugar");
    ItemType CAKE = getItemType("cake");
    ItemType WHITE_BED = getItemType("white_bed");
    ItemType ORANGE_BED = getItemType("orange_bed");
    ItemType MAGENTA_BED = getItemType("magenta_bed");
    ItemType LIGHT_BLUE_BED = getItemType("light_blue_bed");
    ItemType YELLOW_BED = getItemType("yellow_bed");
    ItemType LIME_BED = getItemType("lime_bed");
    ItemType PINK_BED = getItemType("pink_bed");
    ItemType GRAY_BED = getItemType("gray_bed");
    ItemType LIGHT_GRAY_BED = getItemType("light_gray_bed");
    ItemType CYAN_BED = getItemType("cyan_bed");
    ItemType PURPLE_BED = getItemType("purple_bed");
    ItemType BLUE_BED = getItemType("blue_bed");
    ItemType BROWN_BED = getItemType("brown_bed");
    ItemType GREEN_BED = getItemType("green_bed");
    ItemType RED_BED = getItemType("red_bed");
    ItemType BLACK_BED = getItemType("black_bed");
    ItemType COOKIE = getItemType("cookie");
    ItemType FILLED_MAP = getItemType("filled_map");
    ItemType SHEARS = getItemType("shears");
    ItemType MELON_SLICE = getItemType("melon_slice");
    ItemType DRIED_KELP = getItemType("dried_kelp");
    ItemType PUMPKIN_SEEDS = getItemType("pumpkin_seeds");
    ItemType MELON_SEEDS = getItemType("melon_seeds");
    ItemType BEEF = getItemType("beef");
    ItemType COOKED_BEEF = getItemType("cooked_beef");
    ItemType CHICKEN = getItemType("chicken");
    ItemType COOKED_CHICKEN = getItemType("cooked_chicken");
    ItemType ROTTEN_FLESH = getItemType("rotten_flesh");
    ItemType ENDER_PEARL = getItemType("ender_pearl");
    ItemType BLAZE_ROD = getItemType("blaze_rod");
    ItemType GHAST_TEAR = getItemType("ghast_tear");
    ItemType GOLD_NUGGET = getItemType("gold_nugget");
    ItemType NETHER_WART = getItemType("nether_wart");
    ItemType POTION = getItemType("potion");
    ItemType GLASS_BOTTLE = getItemType("glass_bottle");
    ItemType SPIDER_EYE = getItemType("spider_eye");
    ItemType FERMENTED_SPIDER_EYE = getItemType("fermented_spider_eye");
    ItemType BLAZE_POWDER = getItemType("blaze_powder");
    ItemType MAGMA_CREAM = getItemType("magma_cream");
    ItemType BREWING_STAND = getItemType("brewing_stand");
    ItemType CAULDRON = getItemType("cauldron");
    ItemType ENDER_EYE = getItemType("ender_eye");
    ItemType GLISTERING_MELON_SLICE = getItemType("glistering_melon_slice");
    ItemType ALLAY_SPAWN_EGG = getItemType("allay_spawn_egg");
    ItemType AXOLOTL_SPAWN_EGG = getItemType("axolotl_spawn_egg");
    ItemType BAT_SPAWN_EGG = getItemType("bat_spawn_egg");
    ItemType BEE_SPAWN_EGG = getItemType("bee_spawn_egg");
    ItemType BLAZE_SPAWN_EGG = getItemType("blaze_spawn_egg");
    ItemType CAT_SPAWN_EGG = getItemType("cat_spawn_egg");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CAMEL_SPAWN_EGG = getItemType("camel_spawn_egg");
    ItemType CAVE_SPIDER_SPAWN_EGG = getItemType("cave_spider_spawn_egg");
    ItemType CHICKEN_SPAWN_EGG = getItemType("chicken_spawn_egg");
    ItemType COD_SPAWN_EGG = getItemType("cod_spawn_egg");
    ItemType COW_SPAWN_EGG = getItemType("cow_spawn_egg");
    ItemType CREEPER_SPAWN_EGG = getItemType("creeper_spawn_egg");
    ItemType DOLPHIN_SPAWN_EGG = getItemType("dolphin_spawn_egg");
    ItemType DONKEY_SPAWN_EGG = getItemType("donkey_spawn_egg");
    ItemType DROWNED_SPAWN_EGG = getItemType("drowned_spawn_egg");
    ItemType ELDER_GUARDIAN_SPAWN_EGG = getItemType("elder_guardian_spawn_egg");
    ItemType ENDER_DRAGON_SPAWN_EGG = getItemType("ender_dragon_spawn_egg");
    ItemType ENDERMAN_SPAWN_EGG = getItemType("enderman_spawn_egg");
    ItemType ENDERMITE_SPAWN_EGG = getItemType("endermite_spawn_egg");
    ItemType EVOKER_SPAWN_EGG = getItemType("evoker_spawn_egg");
    ItemType FOX_SPAWN_EGG = getItemType("fox_spawn_egg");
    ItemType FROG_SPAWN_EGG = getItemType("frog_spawn_egg");
    ItemType GHAST_SPAWN_EGG = getItemType("ghast_spawn_egg");
    ItemType GLOW_SQUID_SPAWN_EGG = getItemType("glow_squid_spawn_egg");
    ItemType GOAT_SPAWN_EGG = getItemType("goat_spawn_egg");
    ItemType GUARDIAN_SPAWN_EGG = getItemType("guardian_spawn_egg");
    ItemType HOGLIN_SPAWN_EGG = getItemType("hoglin_spawn_egg");
    ItemType HORSE_SPAWN_EGG = getItemType("horse_spawn_egg");
    ItemType HUSK_SPAWN_EGG = getItemType("husk_spawn_egg");
    ItemType IRON_GOLEM_SPAWN_EGG = getItemType("iron_golem_spawn_egg");
    ItemType LLAMA_SPAWN_EGG = getItemType("llama_spawn_egg");
    ItemType MAGMA_CUBE_SPAWN_EGG = getItemType("magma_cube_spawn_egg");
    ItemType MOOSHROOM_SPAWN_EGG = getItemType("mooshroom_spawn_egg");
    ItemType MULE_SPAWN_EGG = getItemType("mule_spawn_egg");
    ItemType OCELOT_SPAWN_EGG = getItemType("ocelot_spawn_egg");
    ItemType PANDA_SPAWN_EGG = getItemType("panda_spawn_egg");
    ItemType PARROT_SPAWN_EGG = getItemType("parrot_spawn_egg");
    ItemType PHANTOM_SPAWN_EGG = getItemType("phantom_spawn_egg");
    ItemType PIG_SPAWN_EGG = getItemType("pig_spawn_egg");
    ItemType PIGLIN_SPAWN_EGG = getItemType("piglin_spawn_egg");
    ItemType PIGLIN_BRUTE_SPAWN_EGG = getItemType("piglin_brute_spawn_egg");
    ItemType PILLAGER_SPAWN_EGG = getItemType("pillager_spawn_egg");
    ItemType POLAR_BEAR_SPAWN_EGG = getItemType("polar_bear_spawn_egg");
    ItemType PUFFERFISH_SPAWN_EGG = getItemType("pufferfish_spawn_egg");
    ItemType RABBIT_SPAWN_EGG = getItemType("rabbit_spawn_egg");
    ItemType RAVAGER_SPAWN_EGG = getItemType("ravager_spawn_egg");
    ItemType SALMON_SPAWN_EGG = getItemType("salmon_spawn_egg");
    ItemType SHEEP_SPAWN_EGG = getItemType("sheep_spawn_egg");
    ItemType SHULKER_SPAWN_EGG = getItemType("shulker_spawn_egg");
    ItemType SILVERFISH_SPAWN_EGG = getItemType("silverfish_spawn_egg");
    ItemType SKELETON_SPAWN_EGG = getItemType("skeleton_spawn_egg");
    ItemType SKELETON_HORSE_SPAWN_EGG = getItemType("skeleton_horse_spawn_egg");
    ItemType SLIME_SPAWN_EGG = getItemType("slime_spawn_egg");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SNIFFER_SPAWN_EGG = getItemType("sniffer_spawn_egg");
    ItemType SNOW_GOLEM_SPAWN_EGG = getItemType("snow_golem_spawn_egg");
    ItemType SPIDER_SPAWN_EGG = getItemType("spider_spawn_egg");
    ItemType SQUID_SPAWN_EGG = getItemType("squid_spawn_egg");
    ItemType STRAY_SPAWN_EGG = getItemType("stray_spawn_egg");
    ItemType STRIDER_SPAWN_EGG = getItemType("strider_spawn_egg");
    ItemType TADPOLE_SPAWN_EGG = getItemType("tadpole_spawn_egg");
    ItemType TRADER_LLAMA_SPAWN_EGG = getItemType("trader_llama_spawn_egg");
    ItemType TROPICAL_FISH_SPAWN_EGG = getItemType("tropical_fish_spawn_egg");
    ItemType TURTLE_SPAWN_EGG = getItemType("turtle_spawn_egg");
    ItemType VEX_SPAWN_EGG = getItemType("vex_spawn_egg");
    ItemType VILLAGER_SPAWN_EGG = getItemType("villager_spawn_egg");
    ItemType VINDICATOR_SPAWN_EGG = getItemType("vindicator_spawn_egg");
    ItemType WANDERING_TRADER_SPAWN_EGG = getItemType("wandering_trader_spawn_egg");
    ItemType WARDEN_SPAWN_EGG = getItemType("warden_spawn_egg");
    ItemType WITCH_SPAWN_EGG = getItemType("witch_spawn_egg");
    ItemType WITHER_SPAWN_EGG = getItemType("wither_spawn_egg");
    ItemType WITHER_SKELETON_SPAWN_EGG = getItemType("wither_skeleton_spawn_egg");
    ItemType WOLF_SPAWN_EGG = getItemType("wolf_spawn_egg");
    ItemType ZOGLIN_SPAWN_EGG = getItemType("zoglin_spawn_egg");
    ItemType ZOMBIE_SPAWN_EGG = getItemType("zombie_spawn_egg");
    ItemType ZOMBIE_HORSE_SPAWN_EGG = getItemType("zombie_horse_spawn_egg");
    ItemType ZOMBIE_VILLAGER_SPAWN_EGG = getItemType("zombie_villager_spawn_egg");
    ItemType ZOMBIFIED_PIGLIN_SPAWN_EGG = getItemType("zombified_piglin_spawn_egg");
    ItemType EXPERIENCE_BOTTLE = getItemType("experience_bottle");
    ItemType FIRE_CHARGE = getItemType("fire_charge");
    ItemType WRITABLE_BOOK = getItemType("writable_book");
    ItemType WRITTEN_BOOK = getItemType("written_book");
    ItemType ITEM_FRAME = getItemType("item_frame");
    ItemType GLOW_ITEM_FRAME = getItemType("glow_item_frame");
    ItemType FLOWER_POT = getItemType("flower_pot");
    ItemType CARROT = getItemType("carrot");
    ItemType POTATO = getItemType("potato");
    ItemType BAKED_POTATO = getItemType("baked_potato");
    ItemType POISONOUS_POTATO = getItemType("poisonous_potato");
    ItemType MAP = getItemType("map");
    ItemType GOLDEN_CARROT = getItemType("golden_carrot");
    ItemType SKELETON_SKULL = getItemType("skeleton_skull");
    ItemType WITHER_SKELETON_SKULL = getItemType("wither_skeleton_skull");
    ItemType PLAYER_HEAD = getItemType("player_head");
    ItemType ZOMBIE_HEAD = getItemType("zombie_head");
    ItemType CREEPER_HEAD = getItemType("creeper_head");
    ItemType DRAGON_HEAD = getItemType("dragon_head");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType PIGLIN_HEAD = getItemType("piglin_head");
    ItemType NETHER_STAR = getItemType("nether_star");
    ItemType PUMPKIN_PIE = getItemType("pumpkin_pie");
    ItemType FIREWORK_ROCKET = getItemType("firework_rocket");
    ItemType FIREWORK_STAR = getItemType("firework_star");
    ItemType ENCHANTED_BOOK = getItemType("enchanted_book");
    ItemType NETHER_BRICK = getItemType("nether_brick");
    ItemType PRISMARINE_SHARD = getItemType("prismarine_shard");
    ItemType PRISMARINE_CRYSTALS = getItemType("prismarine_crystals");
    ItemType RABBIT = getItemType("rabbit");
    ItemType COOKED_RABBIT = getItemType("cooked_rabbit");
    ItemType RABBIT_STEW = getItemType("rabbit_stew");
    ItemType RABBIT_FOOT = getItemType("rabbit_foot");
    ItemType RABBIT_HIDE = getItemType("rabbit_hide");
    ItemType ARMOR_STAND = getItemType("armor_stand");
    ItemType IRON_HORSE_ARMOR = getItemType("iron_horse_armor");
    ItemType GOLDEN_HORSE_ARMOR = getItemType("golden_horse_armor");
    ItemType DIAMOND_HORSE_ARMOR = getItemType("diamond_horse_armor");
    ItemType LEATHER_HORSE_ARMOR = getItemType("leather_horse_armor");
    ItemType LEAD = getItemType("lead");
    ItemType NAME_TAG = getItemType("name_tag");
    ItemType COMMAND_BLOCK_MINECART = getItemType("command_block_minecart");
    ItemType MUTTON = getItemType("mutton");
    ItemType COOKED_MUTTON = getItemType("cooked_mutton");
    ItemType WHITE_BANNER = getItemType("white_banner");
    ItemType ORANGE_BANNER = getItemType("orange_banner");
    ItemType MAGENTA_BANNER = getItemType("magenta_banner");
    ItemType LIGHT_BLUE_BANNER = getItemType("light_blue_banner");
    ItemType YELLOW_BANNER = getItemType("yellow_banner");
    ItemType LIME_BANNER = getItemType("lime_banner");
    ItemType PINK_BANNER = getItemType("pink_banner");
    ItemType GRAY_BANNER = getItemType("gray_banner");
    ItemType LIGHT_GRAY_BANNER = getItemType("light_gray_banner");
    ItemType CYAN_BANNER = getItemType("cyan_banner");
    ItemType PURPLE_BANNER = getItemType("purple_banner");
    ItemType BLUE_BANNER = getItemType("blue_banner");
    ItemType BROWN_BANNER = getItemType("brown_banner");
    ItemType GREEN_BANNER = getItemType("green_banner");
    ItemType RED_BANNER = getItemType("red_banner");
    ItemType BLACK_BANNER = getItemType("black_banner");
    ItemType END_CRYSTAL = getItemType("end_crystal");
    ItemType CHORUS_FRUIT = getItemType("chorus_fruit");
    ItemType POPPED_CHORUS_FRUIT = getItemType("popped_chorus_fruit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType TORCHFLOWER_SEEDS = getItemType("torchflower_seeds");
    ItemType BEETROOT = getItemType("beetroot");
    ItemType BEETROOT_SEEDS = getItemType("beetroot_seeds");
    ItemType BEETROOT_SOUP = getItemType("beetroot_soup");
    ItemType DRAGON_BREATH = getItemType("dragon_breath");
    ItemType SPLASH_POTION = getItemType("splash_potion");
    ItemType SPECTRAL_ARROW = getItemType("spectral_arrow");
    ItemType TIPPED_ARROW = getItemType("tipped_arrow");
    ItemType LINGERING_POTION = getItemType("lingering_potion");
    ItemType SHIELD = getItemType("shield");
    ItemType TOTEM_OF_UNDYING = getItemType("totem_of_undying");
    ItemType SHULKER_SHELL = getItemType("shulker_shell");
    ItemType IRON_NUGGET = getItemType("iron_nugget");
    ItemType KNOWLEDGE_BOOK = getItemType("knowledge_book");
    ItemType DEBUG_STICK = getItemType("debug_stick");
    ItemType MUSIC_DISC_13 = getItemType("music_disc_13");
    ItemType MUSIC_DISC_CAT = getItemType("music_disc_cat");
    ItemType MUSIC_DISC_BLOCKS = getItemType("music_disc_blocks");
    ItemType MUSIC_DISC_CHIRP = getItemType("music_disc_chirp");
    ItemType MUSIC_DISC_FAR = getItemType("music_disc_far");
    ItemType MUSIC_DISC_MALL = getItemType("music_disc_mall");
    ItemType MUSIC_DISC_MELLOHI = getItemType("music_disc_mellohi");
    ItemType MUSIC_DISC_STAL = getItemType("music_disc_stal");
    ItemType MUSIC_DISC_STRAD = getItemType("music_disc_strad");
    ItemType MUSIC_DISC_WARD = getItemType("music_disc_ward");
    ItemType MUSIC_DISC_11 = getItemType("music_disc_11");
    ItemType MUSIC_DISC_WAIT = getItemType("music_disc_wait");
    ItemType MUSIC_DISC_OTHERSIDE = getItemType("music_disc_otherside");
    ItemType MUSIC_DISC_5 = getItemType("music_disc_5");
    ItemType MUSIC_DISC_PIGSTEP = getItemType("music_disc_pigstep");
    ItemType DISC_FRAGMENT_5 = getItemType("disc_fragment_5");
    ItemType TRIDENT = getItemType("trident");
    ItemType PHANTOM_MEMBRANE = getItemType("phantom_membrane");
    ItemType NAUTILUS_SHELL = getItemType("nautilus_shell");
    ItemType HEART_OF_THE_SEA = getItemType("heart_of_the_sea");
    ItemType CROSSBOW = getItemType("crossbow");
    ItemType SUSPICIOUS_STEW = getItemType("suspicious_stew");
    ItemType LOOM = getItemType("loom");
    ItemType FLOWER_BANNER_PATTERN = getItemType("flower_banner_pattern");
    ItemType CREEPER_BANNER_PATTERN = getItemType("creeper_banner_pattern");
    ItemType SKULL_BANNER_PATTERN = getItemType("skull_banner_pattern");
    ItemType MOJANG_BANNER_PATTERN = getItemType("mojang_banner_pattern");
    ItemType GLOBE_BANNER_PATTERN = getItemType("globe_banner_pattern");
    ItemType PIGLIN_BANNER_PATTERN = getItemType("piglin_banner_pattern");
    ItemType GOAT_HORN = getItemType("goat_horn");
    ItemType COMPOSTER = getItemType("composter");
    ItemType BARREL = getItemType("barrel");
    ItemType SMOKER = getItemType("smoker");
    ItemType BLAST_FURNACE = getItemType("blast_furnace");
    ItemType CARTOGRAPHY_TABLE = getItemType("cartography_table");
    ItemType FLETCHING_TABLE = getItemType("fletching_table");
    ItemType GRINDSTONE = getItemType("grindstone");
    ItemType SMITHING_TABLE = getItemType("smithing_table");
    ItemType STONECUTTER = getItemType("stonecutter");
    ItemType BELL = getItemType("bell");
    ItemType LANTERN = getItemType("lantern");
    ItemType SOUL_LANTERN = getItemType("soul_lantern");
    ItemType SWEET_BERRIES = getItemType("sweet_berries");
    ItemType GLOW_BERRIES = getItemType("glow_berries");
    ItemType CAMPFIRE = getItemType("campfire");
    ItemType SOUL_CAMPFIRE = getItemType("soul_campfire");
    ItemType SHROOMLIGHT = getItemType("shroomlight");
    ItemType HONEYCOMB = getItemType("honeycomb");
    ItemType BEE_NEST = getItemType("bee_nest");
    ItemType BEEHIVE = getItemType("beehive");
    ItemType HONEY_BOTTLE = getItemType("honey_bottle");
    ItemType HONEYCOMB_BLOCK = getItemType("honeycomb_block");
    ItemType LODESTONE = getItemType("lodestone");
    ItemType CRYING_OBSIDIAN = getItemType("crying_obsidian");
    ItemType BLACKSTONE = getItemType("blackstone");
    ItemType BLACKSTONE_SLAB = getItemType("blackstone_slab");
    ItemType BLACKSTONE_STAIRS = getItemType("blackstone_stairs");
    ItemType GILDED_BLACKSTONE = getItemType("gilded_blackstone");
    ItemType POLISHED_BLACKSTONE = getItemType("polished_blackstone");
    ItemType POLISHED_BLACKSTONE_SLAB = getItemType("polished_blackstone_slab");
    ItemType POLISHED_BLACKSTONE_STAIRS = getItemType("polished_blackstone_stairs");
    ItemType CHISELED_POLISHED_BLACKSTONE = getItemType("chiseled_polished_blackstone");
    ItemType POLISHED_BLACKSTONE_BRICKS = getItemType("polished_blackstone_bricks");
    ItemType POLISHED_BLACKSTONE_BRICK_SLAB = getItemType("polished_blackstone_brick_slab");
    ItemType POLISHED_BLACKSTONE_BRICK_STAIRS = getItemType("polished_blackstone_brick_stairs");
    ItemType CRACKED_POLISHED_BLACKSTONE_BRICKS = getItemType("cracked_polished_blackstone_bricks");
    ItemType RESPAWN_ANCHOR = getItemType("respawn_anchor");
    ItemType CANDLE = getItemType("candle");
    ItemType WHITE_CANDLE = getItemType("white_candle");
    ItemType ORANGE_CANDLE = getItemType("orange_candle");
    ItemType MAGENTA_CANDLE = getItemType("magenta_candle");
    ItemType LIGHT_BLUE_CANDLE = getItemType("light_blue_candle");
    ItemType YELLOW_CANDLE = getItemType("yellow_candle");
    ItemType LIME_CANDLE = getItemType("lime_candle");
    ItemType PINK_CANDLE = getItemType("pink_candle");
    ItemType GRAY_CANDLE = getItemType("gray_candle");
    ItemType LIGHT_GRAY_CANDLE = getItemType("light_gray_candle");
    ItemType CYAN_CANDLE = getItemType("cyan_candle");
    ItemType PURPLE_CANDLE = getItemType("purple_candle");
    ItemType BLUE_CANDLE = getItemType("blue_candle");
    ItemType BROWN_CANDLE = getItemType("brown_candle");
    ItemType GREEN_CANDLE = getItemType("green_candle");
    ItemType RED_CANDLE = getItemType("red_candle");
    ItemType BLACK_CANDLE = getItemType("black_candle");
    ItemType SMALL_AMETHYST_BUD = getItemType("small_amethyst_bud");
    ItemType MEDIUM_AMETHYST_BUD = getItemType("medium_amethyst_bud");
    ItemType LARGE_AMETHYST_BUD = getItemType("large_amethyst_bud");
    ItemType AMETHYST_CLUSTER = getItemType("amethyst_cluster");
    ItemType POINTED_DRIPSTONE = getItemType("pointed_dripstone");
    ItemType OCHRE_FROGLIGHT = getItemType("ochre_froglight");
    ItemType VERDANT_FROGLIGHT = getItemType("verdant_froglight");
    ItemType PEARLESCENT_FROGLIGHT = getItemType("pearlescent_froglight");
    ItemType FROGSPAWN = getItemType("frogspawn");
    ItemType ECHO_SHARD = getItemType("echo_shard");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BRUSH = getItemType("brush");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType NETHERITE_UPGRADE_SMITHING_TEMPLATE = getItemType("netherite_upgrade_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("sentry_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType DUNE_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("dune_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType COAST_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("coast_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType WILD_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("wild_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType WARD_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("ward_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType EYE_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("eye_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType VEX_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("vex_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType TIDE_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("tide_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("snout_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType RIB_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("rib_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE = getItemType("spire_armor_trim_smithing_template");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType POTTERY_SHARD_ARCHER = getItemType("pottery_shard_archer");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType POTTERY_SHARD_PRIZE = getItemType("pottery_shard_prize");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType POTTERY_SHARD_ARMS_UP = getItemType("pottery_shard_arms_up");
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType POTTERY_SHARD_SKULL = getItemType("pottery_shard_skull");
    //</editor-fold>

    @NotNull
    private static ItemType getItemType(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        ItemType itemType = Registry.ITEM.get(namespacedKey);
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
    boolean hasBlockType();

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
    BlockType<?> getBlockType();

    /**
     * Gets the maximum amount of this material that can be held in a stack
     *
     * @return Maximum stack size for this material
     */
    int getMaxStackSize();

    /**
     * Gets the maximum durability of this material
     *
     * @return Maximum durability for this material
     */
    short getMaxDurability();

    /**
     * Checks if this Material is edible.
     *
     * @return true if this Material is edible.
     */
    boolean isEdible();

    /**
     * @return True if this material represents a playable music disk.
     */
    boolean isRecord();

    /**
     * Checks if this Material can be used as fuel in a Furnace
     *
     * @return true if this Material can be used as fuel.
     */
    boolean isFuel();

    /**
     * Determines the remaining item in a crafting grid after crafting with this
     * ingredient.
     *
     * @return the item left behind when crafting, or null if nothing is.
     */
    @Nullable
    ItemType getCraftingRemainingItem();

    /**
     * Get the best suitable slot for this Material.
     *
     * For most items this will be {@link EquipmentSlot#HAND}.
     *
     * @return the best EquipmentSlot for this Material
     */
    @NotNull
    EquipmentSlot getEquipmentSlot();

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
    Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(@NotNull EquipmentSlot slot);

    /**
     * Get the {@link CreativeCategory} to which this material belongs.
     *
     * @return the creative category. null if does not belong to a category
     */
    @Nullable
    CreativeCategory getCreativeCategory();
}
