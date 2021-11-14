package org.bukkit;

import com.google.common.base.Preconditions;
import java.util.function.Consumer;
import org.apache.commons.lang.Validate;
import org.bukkit.block.BlockType;
import org.bukkit.block.data.BlockData;
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
    Material AIR = getMaterial("air", 9648);
    Material STONE = getMaterial("stone", 22948);
    Material GRANITE = getMaterial("granite", 21091);
    Material POLISHED_GRANITE = getMaterial("polished_granite", 5477);
    Material DIORITE = getMaterial("diorite", 24688);
    Material POLISHED_DIORITE = getMaterial("polished_diorite", 31615);
    Material ANDESITE = getMaterial("andesite", 25975);
    Material POLISHED_ANDESITE = getMaterial("polished_andesite", 8335);
    Material DEEPSLATE = getMaterial("deepslate", 26842);
    Material COBBLED_DEEPSLATE = getMaterial("cobbled_deepslate", 8021);
    Material POLISHED_DEEPSLATE = getMaterial("polished_deepslate", 31772);
    Material CALCITE = getMaterial("calcite", 20311);
    Material TUFF = getMaterial("tuff", 24364);
    Material DRIPSTONE_BLOCK = getMaterial("dripstone_block", 26227);
    Material GRASS_BLOCK = getMaterial("grass_block", 28346);
    Material DIRT = getMaterial("dirt", 10580);
    Material COARSE_DIRT = getMaterial("coarse_dirt", 15411);
    Material PODZOL = getMaterial("podzol", 24068);
    Material ROOTED_DIRT = getMaterial("rooted_dirt", 11410);
    Material CRIMSON_NYLIUM = getMaterial("crimson_nylium", 18139);
    Material WARPED_NYLIUM = getMaterial("warped_nylium", 26396);
    Material COBBLESTONE = getMaterial("cobblestone", 32147);
    Material OAK_PLANKS = getMaterial("oak_planks", 14905);
    Material SPRUCE_PLANKS = getMaterial("spruce_planks", 14593);
    Material BIRCH_PLANKS = getMaterial("birch_planks", 29322);
    Material JUNGLE_PLANKS = getMaterial("jungle_planks", 26445);
    Material ACACIA_PLANKS = getMaterial("acacia_planks", 31312);
    Material DARK_OAK_PLANKS = getMaterial("dark_oak_planks", 20869);
    Material CRIMSON_PLANKS = getMaterial("crimson_planks", 18812);
    Material WARPED_PLANKS = getMaterial("warped_planks", 16045);
    Material OAK_SAPLING = getMaterial("oak_sapling", 9636);
    Material SPRUCE_SAPLING = getMaterial("spruce_sapling", 19874);
    Material BIRCH_SAPLING = getMaterial("birch_sapling", 31533);
    Material JUNGLE_SAPLING = getMaterial("jungle_sapling", 17951);
    Material ACACIA_SAPLING = getMaterial("acacia_sapling", 20806);
    Material DARK_OAK_SAPLING = getMaterial("dark_oak_sapling", 14933);
    Material BEDROCK = getMaterial("bedrock", 23130);
    Material SAND = getMaterial("sand", 11542);
    Material RED_SAND = getMaterial("red_sand", 16279);
    Material GRAVEL = getMaterial("gravel", 7804);
    Material COAL_ORE = getMaterial("coal_ore", 30965);
    Material DEEPSLATE_COAL_ORE = getMaterial("deepslate_coal_ore", 16823);
    Material IRON_ORE = getMaterial("iron_ore", 19834);
    Material DEEPSLATE_IRON_ORE = getMaterial("deepslate_iron_ore", 26021);
    Material COPPER_ORE = getMaterial("copper_ore", 32666);
    Material DEEPSLATE_COPPER_ORE = getMaterial("deepslate_copper_ore", 6588);
    Material GOLD_ORE = getMaterial("gold_ore", 32625);
    Material DEEPSLATE_GOLD_ORE = getMaterial("deepslate_gold_ore", 13582);
    Material REDSTONE_ORE = getMaterial("redstone_ore", 10887);
    Material DEEPSLATE_REDSTONE_ORE = getMaterial("deepslate_redstone_ore", 6331);
    Material EMERALD_ORE = getMaterial("emerald_ore", 16630);
    Material DEEPSLATE_EMERALD_ORE = getMaterial("deepslate_emerald_ore", 5299);
    Material LAPIS_ORE = getMaterial("lapis_ore", 22934);
    Material DEEPSLATE_LAPIS_ORE = getMaterial("deepslate_lapis_ore", 13598);
    Material DIAMOND_ORE = getMaterial("diamond_ore", 9292);
    Material DEEPSLATE_DIAMOND_ORE = getMaterial("deepslate_diamond_ore", 17792);
    Material NETHER_GOLD_ORE = getMaterial("nether_gold_ore", 4185);
    Material NETHER_QUARTZ_ORE = getMaterial("nether_quartz_ore", 4807);
    Material ANCIENT_DEBRIS = getMaterial("ancient_debris", 18198);
    Material COAL_BLOCK = getMaterial("coal_block", 27968);
    Material RAW_IRON_BLOCK = getMaterial("raw_iron_block", 32210);
    Material RAW_COPPER_BLOCK = getMaterial("raw_copper_block", 17504);
    Material RAW_GOLD_BLOCK = getMaterial("raw_gold_block", 23246);
    Material AMETHYST_BLOCK = getMaterial("amethyst_block", 18919);
    Material BUDDING_AMETHYST = getMaterial("budding_amethyst", 13963);
    Material IRON_BLOCK = getMaterial("iron_block", 24754);
    Material COPPER_BLOCK = getMaterial("copper_block", 12880);
    Material GOLD_BLOCK = getMaterial("gold_block", 27392);
    Material DIAMOND_BLOCK = getMaterial("diamond_block", 5944);
    Material NETHERITE_BLOCK = getMaterial("netherite_block", 6527);
    Material EXPOSED_COPPER = getMaterial("exposed_copper", 28488);
    Material WEATHERED_COPPER = getMaterial("weathered_copper", 19699);
    Material OXIDIZED_COPPER = getMaterial("oxidized_copper", 19490);
    Material CUT_COPPER = getMaterial("cut_copper", 32519);
    Material EXPOSED_CUT_COPPER = getMaterial("exposed_cut_copper", 18000);
    Material WEATHERED_CUT_COPPER = getMaterial("weathered_cut_copper", 21158);
    Material OXIDIZED_CUT_COPPER = getMaterial("oxidized_cut_copper", 5382);
    Material CUT_COPPER_STAIRS = getMaterial("cut_copper_stairs", 25925);
    Material EXPOSED_CUT_COPPER_STAIRS = getMaterial("exposed_cut_copper_stairs", 31621);
    Material WEATHERED_CUT_COPPER_STAIRS = getMaterial("weathered_cut_copper_stairs", 5851);
    Material OXIDIZED_CUT_COPPER_STAIRS = getMaterial("oxidized_cut_copper_stairs", 25379);
    Material CUT_COPPER_SLAB = getMaterial("cut_copper_slab", 28988);
    Material EXPOSED_CUT_COPPER_SLAB = getMaterial("exposed_cut_copper_slab", 26694);
    Material WEATHERED_CUT_COPPER_SLAB = getMaterial("weathered_cut_copper_slab", 4602);
    Material OXIDIZED_CUT_COPPER_SLAB = getMaterial("oxidized_cut_copper_slab", 29642);
    Material WAXED_COPPER_BLOCK = getMaterial("waxed_copper_block", 14638);
    Material WAXED_EXPOSED_COPPER = getMaterial("waxed_exposed_copper", 27989);
    Material WAXED_WEATHERED_COPPER = getMaterial("waxed_weathered_copper", 5960);
    Material WAXED_OXIDIZED_COPPER = getMaterial("waxed_oxidized_copper", 25626);
    Material WAXED_CUT_COPPER = getMaterial("waxed_cut_copper", 11030);
    Material WAXED_EXPOSED_CUT_COPPER = getMaterial("waxed_exposed_cut_copper", 30043);
    Material WAXED_WEATHERED_CUT_COPPER = getMaterial("waxed_weathered_cut_copper", 13823);
    Material WAXED_OXIDIZED_CUT_COPPER = getMaterial("waxed_oxidized_cut_copper", 22582);
    Material WAXED_CUT_COPPER_STAIRS = getMaterial("waxed_cut_copper_stairs", 23125);
    Material WAXED_EXPOSED_CUT_COPPER_STAIRS = getMaterial("waxed_exposed_cut_copper_stairs", 15532);
    Material WAXED_WEATHERED_CUT_COPPER_STAIRS = getMaterial("waxed_weathered_cut_copper_stairs", 29701);
    Material WAXED_OXIDIZED_CUT_COPPER_STAIRS = getMaterial("waxed_oxidized_cut_copper_stairs", 9842);
    Material WAXED_CUT_COPPER_SLAB = getMaterial("waxed_cut_copper_slab", 6271);
    Material WAXED_EXPOSED_CUT_COPPER_SLAB = getMaterial("waxed_exposed_cut_copper_slab", 22091);
    Material WAXED_WEATHERED_CUT_COPPER_SLAB = getMaterial("waxed_weathered_cut_copper_slab", 20035);
    Material WAXED_OXIDIZED_CUT_COPPER_SLAB = getMaterial("waxed_oxidized_cut_copper_slab", 11202);
    Material OAK_LOG = getMaterial("oak_log", 26723);
    Material SPRUCE_LOG = getMaterial("spruce_log", 9726);
    Material BIRCH_LOG = getMaterial("birch_log", 26727);
    Material JUNGLE_LOG = getMaterial("jungle_log", 20721);
    Material ACACIA_LOG = getMaterial("acacia_log", 8385);
    Material DARK_OAK_LOG = getMaterial("dark_oak_log", 14831);
    Material CRIMSON_STEM = getMaterial("crimson_stem", 27920);
    Material WARPED_STEM = getMaterial("warped_stem", 28920);
    Material STRIPPED_OAK_LOG = getMaterial("stripped_oak_log", 20523);
    Material STRIPPED_SPRUCE_LOG = getMaterial("stripped_spruce_log", 6140);
    Material STRIPPED_BIRCH_LOG = getMaterial("stripped_birch_log", 8838);
    Material STRIPPED_JUNGLE_LOG = getMaterial("stripped_jungle_log", 15476);
    Material STRIPPED_ACACIA_LOG = getMaterial("stripped_acacia_log", 18167);
    Material STRIPPED_DARK_OAK_LOG = getMaterial("stripped_dark_oak_log", 6492);
    Material STRIPPED_CRIMSON_STEM = getMaterial("stripped_crimson_stem", 16882);
    Material STRIPPED_WARPED_STEM = getMaterial("stripped_warped_stem", 15627);
    Material STRIPPED_OAK_WOOD = getMaterial("stripped_oak_wood", 31455);
    Material STRIPPED_SPRUCE_WOOD = getMaterial("stripped_spruce_wood", 6467);
    Material STRIPPED_BIRCH_WOOD = getMaterial("stripped_birch_wood", 22350);
    Material STRIPPED_JUNGLE_WOOD = getMaterial("stripped_jungle_wood", 30315);
    Material STRIPPED_ACACIA_WOOD = getMaterial("stripped_acacia_wood", 27193);
    Material STRIPPED_DARK_OAK_WOOD = getMaterial("stripped_dark_oak_wood", 16000);
    Material STRIPPED_CRIMSON_HYPHAE = getMaterial("stripped_crimson_hyphae", 27488);
    Material STRIPPED_WARPED_HYPHAE = getMaterial("stripped_warped_hyphae", 7422);
    Material OAK_WOOD = getMaterial("oak_wood", 7378);
    Material SPRUCE_WOOD = getMaterial("spruce_wood", 32328);
    Material BIRCH_WOOD = getMaterial("birch_wood", 20913);
    Material JUNGLE_WOOD = getMaterial("jungle_wood", 10341);
    Material ACACIA_WOOD = getMaterial("acacia_wood", 9541);
    Material DARK_OAK_WOOD = getMaterial("dark_oak_wood", 16995);
    Material CRIMSON_HYPHAE = getMaterial("crimson_hyphae", 6550);
    Material WARPED_HYPHAE = getMaterial("warped_hyphae", 18439);
    Material OAK_LEAVES = getMaterial("oak_leaves", 4385);
    Material SPRUCE_LEAVES = getMaterial("spruce_leaves", 20039);
    Material BIRCH_LEAVES = getMaterial("birch_leaves", 12601);
    Material JUNGLE_LEAVES = getMaterial("jungle_leaves", 5133);
    Material ACACIA_LEAVES = getMaterial("acacia_leaves", 16606);
    Material DARK_OAK_LEAVES = getMaterial("dark_oak_leaves", 22254);
    Material AZALEA_LEAVES = getMaterial("azalea_leaves", 23001);
    Material FLOWERING_AZALEA_LEAVES = getMaterial("flowering_azalea_leaves", 20893);
    Material SPONGE = getMaterial("sponge", 15860);
    Material WET_SPONGE = getMaterial("wet_sponge", 9043);
    Material GLASS = getMaterial("glass", 6195);
    Material TINTED_GLASS = getMaterial("tinted_glass", 19154);
    Material LAPIS_BLOCK = getMaterial("lapis_block", 14485);
    Material SANDSTONE = getMaterial("sandstone", 13141);
    Material CHISELED_SANDSTONE = getMaterial("chiseled_sandstone", 31763);
    Material CUT_SANDSTONE = getMaterial("cut_sandstone", 6118);
    Material COBWEB = getMaterial("cobweb", 9469);
    Material GRASS = getMaterial("grass", 6155);
    Material FERN = getMaterial("fern", 15794);
    Material AZALEA = getMaterial("azalea", 29386);
    Material FLOWERING_AZALEA = getMaterial("flowering_azalea", 28270);
    Material DEAD_BUSH = getMaterial("dead_bush", 22888);
    Material SEAGRASS = getMaterial("seagrass", 23942);
    Material SEA_PICKLE = getMaterial("sea_pickle", 19562);
    Material WHITE_WOOL = getMaterial("white_wool", 8624);
    Material ORANGE_WOOL = getMaterial("orange_wool", 23957);
    Material MAGENTA_WOOL = getMaterial("magenta_wool", 11853);
    Material LIGHT_BLUE_WOOL = getMaterial("light_blue_wool", 21073);
    Material YELLOW_WOOL = getMaterial("yellow_wool", 29507);
    Material LIME_WOOL = getMaterial("lime_wool", 10443);
    Material PINK_WOOL = getMaterial("pink_wool", 7611);
    Material GRAY_WOOL = getMaterial("gray_wool", 27209);
    Material LIGHT_GRAY_WOOL = getMaterial("light_gray_wool", 22936);
    Material CYAN_WOOL = getMaterial("cyan_wool", 12221);
    Material PURPLE_WOOL = getMaterial("purple_wool", 11922);
    Material BLUE_WOOL = getMaterial("blue_wool", 15738);
    Material BROWN_WOOL = getMaterial("brown_wool", 32638);
    Material GREEN_WOOL = getMaterial("green_wool", 25085);
    Material RED_WOOL = getMaterial("red_wool", 11621);
    Material BLACK_WOOL = getMaterial("black_wool", 16693);
    Material DANDELION = getMaterial("dandelion", 30558);
    Material POPPY = getMaterial("poppy", 12851);
    Material BLUE_ORCHID = getMaterial("blue_orchid", 13432);
    Material ALLIUM = getMaterial("allium", 6871);
    Material AZURE_BLUET = getMaterial("azure_bluet", 17608);
    Material RED_TULIP = getMaterial("red_tulip", 16781);
    Material ORANGE_TULIP = getMaterial("orange_tulip", 26038);
    Material WHITE_TULIP = getMaterial("white_tulip", 31495);
    Material PINK_TULIP = getMaterial("pink_tulip", 27319);
    Material OXEYE_DAISY = getMaterial("oxeye_daisy", 11709);
    Material CORNFLOWER = getMaterial("cornflower", 15405);
    Material LILY_OF_THE_VALLEY = getMaterial("lily_of_the_valley", 7185);
    Material WITHER_ROSE = getMaterial("wither_rose", 8619);
    Material SPORE_BLOSSOM = getMaterial("spore_blossom", 20627);
    Material BROWN_MUSHROOM = getMaterial("brown_mushroom", 9665);
    Material RED_MUSHROOM = getMaterial("red_mushroom", 19728);
    Material CRIMSON_FUNGUS = getMaterial("crimson_fungus", 26268);
    Material WARPED_FUNGUS = getMaterial("warped_fungus", 19799);
    Material CRIMSON_ROOTS = getMaterial("crimson_roots", 14064);
    Material WARPED_ROOTS = getMaterial("warped_roots", 13932);
    Material NETHER_SPROUTS = getMaterial("nether_sprouts", 10431);
    Material WEEPING_VINES = getMaterial("weeping_vines", 29267);
    Material TWISTING_VINES = getMaterial("twisting_vines", 27283);
    Material SUGAR_CANE = getMaterial("sugar_cane", 7726);
    Material KELP = getMaterial("kelp", 21916);
    Material MOSS_CARPET = getMaterial("moss_carpet", 8221);
    Material MOSS_BLOCK = getMaterial("moss_block", 9175);
    Material HANGING_ROOTS = getMaterial("hanging_roots", 15498);
    Material BIG_DRIPLEAF = getMaterial("big_dripleaf", 26173);
    Material SMALL_DRIPLEAF = getMaterial("small_dripleaf", 17540);
    Material BAMBOO = getMaterial("bamboo", 18728);
    Material OAK_SLAB = getMaterial("oak_slab", 12002);
    Material SPRUCE_SLAB = getMaterial("spruce_slab", 28798);
    Material BIRCH_SLAB = getMaterial("birch_slab", 13807);
    Material JUNGLE_SLAB = getMaterial("jungle_slab", 19117);
    Material ACACIA_SLAB = getMaterial("acacia_slab", 23730);
    Material DARK_OAK_SLAB = getMaterial("dark_oak_slab", 28852);
    Material CRIMSON_SLAB = getMaterial("crimson_slab", 4691);
    Material WARPED_SLAB = getMaterial("warped_slab", 27150);
    Material STONE_SLAB = getMaterial("stone_slab", 19838);
    Material SMOOTH_STONE_SLAB = getMaterial("smooth_stone_slab", 24129);
    Material SANDSTONE_SLAB = getMaterial("sandstone_slab", 29830);
    Material CUT_SANDSTONE_SLAB = getMaterial("cut_sandstone_slab", 30944);
    Material PETRIFIED_OAK_SLAB = getMaterial("petrified_oak_slab", 18658);
    Material COBBLESTONE_SLAB = getMaterial("cobblestone_slab", 6340);
    Material BRICK_SLAB = getMaterial("brick_slab", 26333);
    Material STONE_BRICK_SLAB = getMaterial("stone_brick_slab", 19676);
    Material NETHER_BRICK_SLAB = getMaterial("nether_brick_slab", 26586);
    Material QUARTZ_SLAB = getMaterial("quartz_slab", 4423);
    Material RED_SANDSTONE_SLAB = getMaterial("red_sandstone_slab", 17550);
    Material CUT_RED_SANDSTONE_SLAB = getMaterial("cut_red_sandstone_slab", 7220);
    Material PURPUR_SLAB = getMaterial("purpur_slab", 11487);
    Material PRISMARINE_SLAB = getMaterial("prismarine_slab", 31323);
    Material PRISMARINE_BRICK_SLAB = getMaterial("prismarine_brick_slab", 25624);
    Material DARK_PRISMARINE_SLAB = getMaterial("dark_prismarine_slab", 7577);
    Material SMOOTH_QUARTZ = getMaterial("smooth_quartz", 14415);
    Material SMOOTH_RED_SANDSTONE = getMaterial("smooth_red_sandstone", 25180);
    Material SMOOTH_SANDSTONE = getMaterial("smooth_sandstone", 30039);
    Material SMOOTH_STONE = getMaterial("smooth_stone", 21910);
    Material BRICKS = getMaterial("bricks", 14165);
    Material BOOKSHELF = getMaterial("bookshelf", 10069);
    Material MOSSY_COBBLESTONE = getMaterial("mossy_cobblestone", 21900);
    Material OBSIDIAN = getMaterial("obsidian", 32723);
    Material TORCH = getMaterial("torch", 6063);
    Material END_ROD = getMaterial("end_rod", 24832);
    Material CHORUS_PLANT = getMaterial("chorus_plant", 28243);
    Material CHORUS_FLOWER = getMaterial("chorus_flower", 28542);
    Material PURPUR_BLOCK = getMaterial("purpur_block", 7538);
    Material PURPUR_PILLAR = getMaterial("purpur_pillar", 26718);
    Material PURPUR_STAIRS = getMaterial("purpur_stairs", 8921);
    Material SPAWNER = getMaterial("spawner", 7018);
    Material OAK_STAIRS = getMaterial("oak_stairs", 5449);
    Material CHEST = getMaterial("chest", 22969);
    Material CRAFTING_TABLE = getMaterial("crafting_table", 20706);
    Material FARMLAND = getMaterial("farmland", 31166);
    Material FURNACE = getMaterial("furnace", 8133);
    Material LADDER = getMaterial("ladder", 23599);
    Material COBBLESTONE_STAIRS = getMaterial("cobblestone_stairs", 24715);
    Material SNOW = getMaterial("snow", 14146);
    Material ICE = getMaterial("ice", 30428);
    Material SNOW_BLOCK = getMaterial("snow_block", 19913);
    Material CACTUS = getMaterial("cactus", 12191);
    Material CLAY = getMaterial("clay", 27880);
    Material JUKEBOX = getMaterial("jukebox", 19264);
    Material OAK_FENCE = getMaterial("oak_fence", 6442);
    Material SPRUCE_FENCE = getMaterial("spruce_fence", 25416);
    Material BIRCH_FENCE = getMaterial("birch_fence", 17347);
    Material JUNGLE_FENCE = getMaterial("jungle_fence", 14358);
    Material ACACIA_FENCE = getMaterial("acacia_fence", 4569);
    Material DARK_OAK_FENCE = getMaterial("dark_oak_fence", 21767);
    Material CRIMSON_FENCE = getMaterial("crimson_fence", 21075);
    Material WARPED_FENCE = getMaterial("warped_fence", 18438);
    Material PUMPKIN = getMaterial("pumpkin", 19170);
    Material CARVED_PUMPKIN = getMaterial("carved_pumpkin", 25833);
    Material JACK_O_LANTERN = getMaterial("jack_o_lantern", 13758);
    Material NETHERRACK = getMaterial("netherrack", 23425);
    Material SOUL_SAND = getMaterial("soul_sand", 16841);
    Material SOUL_SOIL = getMaterial("soul_soil", 31140);
    Material BASALT = getMaterial("basalt", 28478);
    Material POLISHED_BASALT = getMaterial("polished_basalt", 11659);
    Material SMOOTH_BASALT = getMaterial("smooth_basalt", 13617);
    Material SOUL_TORCH = getMaterial("soul_torch", 14292);
    Material GLOWSTONE = getMaterial("glowstone", 32713);
    Material INFESTED_STONE = getMaterial("infested_stone", 18440);
    Material INFESTED_COBBLESTONE = getMaterial("infested_cobblestone", 4348);
    Material INFESTED_STONE_BRICKS = getMaterial("infested_stone_bricks", 19749);
    Material INFESTED_MOSSY_STONE_BRICKS = getMaterial("infested_mossy_stone_bricks", 9850);
    Material INFESTED_CRACKED_STONE_BRICKS = getMaterial("infested_cracked_stone_bricks", 7476);
    Material INFESTED_CHISELED_STONE_BRICKS = getMaterial("infested_chiseled_stone_bricks", 4728);
    Material INFESTED_DEEPSLATE = getMaterial("infested_deepslate", 9472);
    Material STONE_BRICKS = getMaterial("stone_bricks", 6962);
    Material MOSSY_STONE_BRICKS = getMaterial("mossy_stone_bricks", 16415);
    Material CRACKED_STONE_BRICKS = getMaterial("cracked_stone_bricks", 27869);
    Material CHISELED_STONE_BRICKS = getMaterial("chiseled_stone_bricks", 9087);
    Material DEEPSLATE_BRICKS = getMaterial("deepslate_bricks", 13193);
    Material CRACKED_DEEPSLATE_BRICKS = getMaterial("cracked_deepslate_bricks", 17105);
    Material DEEPSLATE_TILES = getMaterial("deepslate_tiles", 11250);
    Material CRACKED_DEEPSLATE_TILES = getMaterial("cracked_deepslate_tiles", 26249);
    Material CHISELED_DEEPSLATE = getMaterial("chiseled_deepslate", 23825);
    Material BROWN_MUSHROOM_BLOCK = getMaterial("brown_mushroom_block", 6291);
    Material RED_MUSHROOM_BLOCK = getMaterial("red_mushroom_block", 20766);
    Material MUSHROOM_STEM = getMaterial("mushroom_stem", 16543);
    Material IRON_BARS = getMaterial("iron_bars", 9378);
    Material CHAIN = getMaterial("chain", 28265);
    Material GLASS_PANE = getMaterial("glass_pane", 5709);
    Material MELON = getMaterial("melon", 25172);
    Material VINE = getMaterial("vine", 14564);
    Material GLOW_LICHEN = getMaterial("glow_lichen", 19165);
    Material BRICK_STAIRS = getMaterial("brick_stairs", 21534);
    Material STONE_BRICK_STAIRS = getMaterial("stone_brick_stairs", 27032);
    Material MYCELIUM = getMaterial("mycelium", 9913);
    Material LILY_PAD = getMaterial("lily_pad", 19271);
    Material NETHER_BRICKS = getMaterial("nether_bricks", 27802);
    Material CRACKED_NETHER_BRICKS = getMaterial("cracked_nether_bricks", 10888);
    Material CHISELED_NETHER_BRICKS = getMaterial("chiseled_nether_bricks", 21613);
    Material NETHER_BRICK_FENCE = getMaterial("nether_brick_fence", 5286);
    Material NETHER_BRICK_STAIRS = getMaterial("nether_brick_stairs", 12085);
    Material ENCHANTING_TABLE = getMaterial("enchanting_table", 16255);
    Material END_PORTAL_FRAME = getMaterial("end_portal_frame", 15480);
    Material END_STONE = getMaterial("end_stone", 29686);
    Material END_STONE_BRICKS = getMaterial("end_stone_bricks", 20314);
    Material DRAGON_EGG = getMaterial("dragon_egg", 29946);
    Material SANDSTONE_STAIRS = getMaterial("sandstone_stairs", 18474);
    Material ENDER_CHEST = getMaterial("ender_chest", 32349);
    Material EMERALD_BLOCK = getMaterial("emerald_block", 9914);
    Material SPRUCE_STAIRS = getMaterial("spruce_stairs", 11192);
    Material BIRCH_STAIRS = getMaterial("birch_stairs", 7657);
    Material JUNGLE_STAIRS = getMaterial("jungle_stairs", 20636);
    Material CRIMSON_STAIRS = getMaterial("crimson_stairs", 32442);
    Material WARPED_STAIRS = getMaterial("warped_stairs", 17721);
    Material COMMAND_BLOCK = getMaterial("command_block", 4355);
    Material BEACON = getMaterial("beacon", 6608);
    Material COBBLESTONE_WALL = getMaterial("cobblestone_wall", 12616);
    Material MOSSY_COBBLESTONE_WALL = getMaterial("mossy_cobblestone_wall", 11536);
    Material BRICK_WALL = getMaterial("brick_wall", 18995);
    Material PRISMARINE_WALL = getMaterial("prismarine_wall", 18184);
    Material RED_SANDSTONE_WALL = getMaterial("red_sandstone_wall", 4753);
    Material MOSSY_STONE_BRICK_WALL = getMaterial("mossy_stone_brick_wall", 18259);
    Material GRANITE_WALL = getMaterial("granite_wall", 23279);
    Material STONE_BRICK_WALL = getMaterial("stone_brick_wall", 29073);
    Material NETHER_BRICK_WALL = getMaterial("nether_brick_wall", 10398);
    Material ANDESITE_WALL = getMaterial("andesite_wall", 14938);
    Material RED_NETHER_BRICK_WALL = getMaterial("red_nether_brick_wall", 4580);
    Material SANDSTONE_WALL = getMaterial("sandstone_wall", 18470);
    Material END_STONE_BRICK_WALL = getMaterial("end_stone_brick_wall", 27225);
    Material DIORITE_WALL = getMaterial("diorite_wall", 17412);
    Material BLACKSTONE_WALL = getMaterial("blackstone_wall", 17327);
    Material POLISHED_BLACKSTONE_WALL = getMaterial("polished_blackstone_wall", 15119);
    Material POLISHED_BLACKSTONE_BRICK_WALL = getMaterial("polished_blackstone_brick_wall", 9540);
    Material COBBLED_DEEPSLATE_WALL = getMaterial("cobbled_deepslate_wall", 21893);
    Material POLISHED_DEEPSLATE_WALL = getMaterial("polished_deepslate_wall", 6574);
    Material DEEPSLATE_BRICK_WALL = getMaterial("deepslate_brick_wall", 13304);
    Material DEEPSLATE_TILE_WALL = getMaterial("deepslate_tile_wall", 17077);
    Material ANVIL = getMaterial("anvil", 18718);
    Material CHIPPED_ANVIL = getMaterial("chipped_anvil", 10623);
    Material DAMAGED_ANVIL = getMaterial("damaged_anvil", 10274);
    Material CHISELED_QUARTZ_BLOCK = getMaterial("chiseled_quartz_block", 30964);
    Material QUARTZ_BLOCK = getMaterial("quartz_block", 11987);
    Material QUARTZ_BRICKS = getMaterial("quartz_bricks", 23358);
    Material QUARTZ_PILLAR = getMaterial("quartz_pillar", 16452);
    Material QUARTZ_STAIRS = getMaterial("quartz_stairs", 24079);
    Material WHITE_TERRACOTTA = getMaterial("white_terracotta", 20975);
    Material ORANGE_TERRACOTTA = getMaterial("orange_terracotta", 18684);
    Material MAGENTA_TERRACOTTA = getMaterial("magenta_terracotta", 25900);
    Material LIGHT_BLUE_TERRACOTTA = getMaterial("light_blue_terracotta", 31779);
    Material YELLOW_TERRACOTTA = getMaterial("yellow_terracotta", 32129);
    Material LIME_TERRACOTTA = getMaterial("lime_terracotta", 24013);
    Material PINK_TERRACOTTA = getMaterial("pink_terracotta", 23727);
    Material GRAY_TERRACOTTA = getMaterial("gray_terracotta", 18004);
    Material LIGHT_GRAY_TERRACOTTA = getMaterial("light_gray_terracotta", 26388);
    Material CYAN_TERRACOTTA = getMaterial("cyan_terracotta", 25940);
    Material PURPLE_TERRACOTTA = getMaterial("purple_terracotta", 10387);
    Material BLUE_TERRACOTTA = getMaterial("blue_terracotta", 5236);
    Material BROWN_TERRACOTTA = getMaterial("brown_terracotta", 23664);
    Material GREEN_TERRACOTTA = getMaterial("green_terracotta", 4105);
    Material RED_TERRACOTTA = getMaterial("red_terracotta", 5086);
    Material BLACK_TERRACOTTA = getMaterial("black_terracotta", 26691);
    Material BARRIER = getMaterial("barrier", 26453);
    Material LIGHT = getMaterial("light", 17829);
    Material HAY_BLOCK = getMaterial("hay_block", 17461);
    Material WHITE_CARPET = getMaterial("white_carpet", 15117);
    Material ORANGE_CARPET = getMaterial("orange_carpet", 24752);
    Material MAGENTA_CARPET = getMaterial("magenta_carpet", 6180);
    Material LIGHT_BLUE_CARPET = getMaterial("light_blue_carpet", 21194);
    Material YELLOW_CARPET = getMaterial("yellow_carpet", 18149);
    Material LIME_CARPET = getMaterial("lime_carpet", 15443);
    Material PINK_CARPET = getMaterial("pink_carpet", 27381);
    Material GRAY_CARPET = getMaterial("gray_carpet", 26991);
    Material LIGHT_GRAY_CARPET = getMaterial("light_gray_carpet", 11317);
    Material CYAN_CARPET = getMaterial("cyan_carpet", 9742);
    Material PURPLE_CARPET = getMaterial("purple_carpet", 5574);
    Material BLUE_CARPET = getMaterial("blue_carpet", 13292);
    Material BROWN_CARPET = getMaterial("brown_carpet", 23352);
    Material GREEN_CARPET = getMaterial("green_carpet", 7780);
    Material RED_CARPET = getMaterial("red_carpet", 5424);
    Material BLACK_CARPET = getMaterial("black_carpet", 6056);
    Material TERRACOTTA = getMaterial("terracotta", 16544);
    Material PACKED_ICE = getMaterial("packed_ice", 28993);
    Material ACACIA_STAIRS = getMaterial("acacia_stairs", 17453);
    Material DARK_OAK_STAIRS = getMaterial("dark_oak_stairs", 22921);
    Material DIRT_PATH = getMaterial("dirt_path", 10846);
    Material SUNFLOWER = getMaterial("sunflower", 7408);
    Material LILAC = getMaterial("lilac", 22837);
    Material ROSE_BUSH = getMaterial("rose_bush", 6080);
    Material PEONY = getMaterial("peony", 21155);
    Material TALL_GRASS = getMaterial("tall_grass", 21559);
    Material LARGE_FERN = getMaterial("large_fern", 30177);
    Material WHITE_STAINED_GLASS = getMaterial("white_stained_glass", 31190);
    Material ORANGE_STAINED_GLASS = getMaterial("orange_stained_glass", 25142);
    Material MAGENTA_STAINED_GLASS = getMaterial("magenta_stained_glass", 26814);
    Material LIGHT_BLUE_STAINED_GLASS = getMaterial("light_blue_stained_glass", 17162);
    Material YELLOW_STAINED_GLASS = getMaterial("yellow_stained_glass", 12182);
    Material LIME_STAINED_GLASS = getMaterial("lime_stained_glass", 24266);
    Material PINK_STAINED_GLASS = getMaterial("pink_stained_glass", 16164);
    Material GRAY_STAINED_GLASS = getMaterial("gray_stained_glass", 29979);
    Material LIGHT_GRAY_STAINED_GLASS = getMaterial("light_gray_stained_glass", 5843);
    Material CYAN_STAINED_GLASS = getMaterial("cyan_stained_glass", 30604);
    Material PURPLE_STAINED_GLASS = getMaterial("purple_stained_glass", 21845);
    Material BLUE_STAINED_GLASS = getMaterial("blue_stained_glass", 7107);
    Material BROWN_STAINED_GLASS = getMaterial("brown_stained_glass", 20945);
    Material GREEN_STAINED_GLASS = getMaterial("green_stained_glass", 22503);
    Material RED_STAINED_GLASS = getMaterial("red_stained_glass", 9717);
    Material BLACK_STAINED_GLASS = getMaterial("black_stained_glass", 13941);
    Material WHITE_STAINED_GLASS_PANE = getMaterial("white_stained_glass_pane", 10557);
    Material ORANGE_STAINED_GLASS_PANE = getMaterial("orange_stained_glass_pane", 21089);
    Material MAGENTA_STAINED_GLASS_PANE = getMaterial("magenta_stained_glass_pane", 14082);
    Material LIGHT_BLUE_STAINED_GLASS_PANE = getMaterial("light_blue_stained_glass_pane", 18721);
    Material YELLOW_STAINED_GLASS_PANE = getMaterial("yellow_stained_glass_pane", 20298);
    Material LIME_STAINED_GLASS_PANE = getMaterial("lime_stained_glass_pane", 10610);
    Material PINK_STAINED_GLASS_PANE = getMaterial("pink_stained_glass_pane", 24637);
    Material GRAY_STAINED_GLASS_PANE = getMaterial("gray_stained_glass_pane", 25272);
    Material LIGHT_GRAY_STAINED_GLASS_PANE = getMaterial("light_gray_stained_glass_pane", 19008);
    Material CYAN_STAINED_GLASS_PANE = getMaterial("cyan_stained_glass_pane", 11784);
    Material PURPLE_STAINED_GLASS_PANE = getMaterial("purple_stained_glass_pane", 10948);
    Material BLUE_STAINED_GLASS_PANE = getMaterial("blue_stained_glass_pane", 28484);
    Material BROWN_STAINED_GLASS_PANE = getMaterial("brown_stained_glass_pane", 17557);
    Material GREEN_STAINED_GLASS_PANE = getMaterial("green_stained_glass_pane", 4767);
    Material RED_STAINED_GLASS_PANE = getMaterial("red_stained_glass_pane", 8630);
    Material BLACK_STAINED_GLASS_PANE = getMaterial("black_stained_glass_pane", 13201);
    Material PRISMARINE = getMaterial("prismarine", 7539);
    Material PRISMARINE_BRICKS = getMaterial("prismarine_bricks", 29118);
    Material DARK_PRISMARINE = getMaterial("dark_prismarine", 19940);
    Material PRISMARINE_STAIRS = getMaterial("prismarine_stairs", 19217);
    Material PRISMARINE_BRICK_STAIRS = getMaterial("prismarine_brick_stairs", 15445);
    Material DARK_PRISMARINE_STAIRS = getMaterial("dark_prismarine_stairs", 26511);
    Material SEA_LANTERN = getMaterial("sea_lantern", 20780);
    Material RED_SANDSTONE = getMaterial("red_sandstone", 9092);
    Material CHISELED_RED_SANDSTONE = getMaterial("chiseled_red_sandstone", 15529);
    Material CUT_RED_SANDSTONE = getMaterial("cut_red_sandstone", 29108);
    Material RED_SANDSTONE_STAIRS = getMaterial("red_sandstone_stairs", 25466);
    Material REPEATING_COMMAND_BLOCK = getMaterial("repeating_command_block", 12405);
    Material CHAIN_COMMAND_BLOCK = getMaterial("chain_command_block", 26798);
    Material MAGMA_BLOCK = getMaterial("magma_block", 25927);
    Material NETHER_WART_BLOCK = getMaterial("nether_wart_block", 15486);
    Material WARPED_WART_BLOCK = getMaterial("warped_wart_block", 15463);
    Material RED_NETHER_BRICKS = getMaterial("red_nether_bricks", 18056);
    Material BONE_BLOCK = getMaterial("bone_block", 17312);
    Material STRUCTURE_VOID = getMaterial("structure_void", 30806);
    Material SHULKER_BOX = getMaterial("shulker_box", 7776);
    Material WHITE_SHULKER_BOX = getMaterial("white_shulker_box", 31750);
    Material ORANGE_SHULKER_BOX = getMaterial("orange_shulker_box", 21673);
    Material MAGENTA_SHULKER_BOX = getMaterial("magenta_shulker_box", 21566);
    Material LIGHT_BLUE_SHULKER_BOX = getMaterial("light_blue_shulker_box", 18226);
    Material YELLOW_SHULKER_BOX = getMaterial("yellow_shulker_box", 28700);
    Material LIME_SHULKER_BOX = getMaterial("lime_shulker_box", 28360);
    Material PINK_SHULKER_BOX = getMaterial("pink_shulker_box", 24968);
    Material GRAY_SHULKER_BOX = getMaterial("gray_shulker_box", 12754);
    Material LIGHT_GRAY_SHULKER_BOX = getMaterial("light_gray_shulker_box", 21345);
    Material CYAN_SHULKER_BOX = getMaterial("cyan_shulker_box", 28123);
    Material PURPLE_SHULKER_BOX = getMaterial("purple_shulker_box", 10373);
    Material BLUE_SHULKER_BOX = getMaterial("blue_shulker_box", 11476);
    Material BROWN_SHULKER_BOX = getMaterial("brown_shulker_box", 24230);
    Material GREEN_SHULKER_BOX = getMaterial("green_shulker_box", 9377);
    Material RED_SHULKER_BOX = getMaterial("red_shulker_box", 32448);
    Material BLACK_SHULKER_BOX = getMaterial("black_shulker_box", 24076);
    Material WHITE_GLAZED_TERRACOTTA = getMaterial("white_glazed_terracotta", 11326);
    Material ORANGE_GLAZED_TERRACOTTA = getMaterial("orange_glazed_terracotta", 27451);
    Material MAGENTA_GLAZED_TERRACOTTA = getMaterial("magenta_glazed_terracotta", 8067);
    Material LIGHT_BLUE_GLAZED_TERRACOTTA = getMaterial("light_blue_glazed_terracotta", 4336);
    Material YELLOW_GLAZED_TERRACOTTA = getMaterial("yellow_glazed_terracotta", 10914);
    Material LIME_GLAZED_TERRACOTTA = getMaterial("lime_glazed_terracotta", 13861);
    Material PINK_GLAZED_TERRACOTTA = getMaterial("pink_glazed_terracotta", 10260);
    Material GRAY_GLAZED_TERRACOTTA = getMaterial("gray_glazed_terracotta", 6256);
    Material LIGHT_GRAY_GLAZED_TERRACOTTA = getMaterial("light_gray_glazed_terracotta", 10707);
    Material CYAN_GLAZED_TERRACOTTA = getMaterial("cyan_glazed_terracotta", 9550);
    Material PURPLE_GLAZED_TERRACOTTA = getMaterial("purple_glazed_terracotta", 4818);
    Material BLUE_GLAZED_TERRACOTTA = getMaterial("blue_glazed_terracotta", 23823);
    Material BROWN_GLAZED_TERRACOTTA = getMaterial("brown_glazed_terracotta", 5655);
    Material GREEN_GLAZED_TERRACOTTA = getMaterial("green_glazed_terracotta", 6958);
    Material RED_GLAZED_TERRACOTTA = getMaterial("red_glazed_terracotta", 24989);
    Material BLACK_GLAZED_TERRACOTTA = getMaterial("black_glazed_terracotta", 29678);
    Material WHITE_CONCRETE = getMaterial("white_concrete", 6281);
    Material ORANGE_CONCRETE = getMaterial("orange_concrete", 19914);
    Material MAGENTA_CONCRETE = getMaterial("magenta_concrete", 20591);
    Material LIGHT_BLUE_CONCRETE = getMaterial("light_blue_concrete", 29481);
    Material YELLOW_CONCRETE = getMaterial("yellow_concrete", 15722);
    Material LIME_CONCRETE = getMaterial("lime_concrete", 5863);
    Material PINK_CONCRETE = getMaterial("pink_concrete", 5227);
    Material GRAY_CONCRETE = getMaterial("gray_concrete", 13959);
    Material LIGHT_GRAY_CONCRETE = getMaterial("light_gray_concrete", 14453);
    Material CYAN_CONCRETE = getMaterial("cyan_concrete", 26522);
    Material PURPLE_CONCRETE = getMaterial("purple_concrete", 20623);
    Material BLUE_CONCRETE = getMaterial("blue_concrete", 18756);
    Material BROWN_CONCRETE = getMaterial("brown_concrete", 19006);
    Material GREEN_CONCRETE = getMaterial("green_concrete", 17949);
    Material RED_CONCRETE = getMaterial("red_concrete", 8032);
    Material BLACK_CONCRETE = getMaterial("black_concrete", 13338);
    Material WHITE_CONCRETE_POWDER = getMaterial("white_concrete_powder", 10363);
    Material ORANGE_CONCRETE_POWDER = getMaterial("orange_concrete_powder", 30159);
    Material MAGENTA_CONCRETE_POWDER = getMaterial("magenta_concrete_powder", 8272);
    Material LIGHT_BLUE_CONCRETE_POWDER = getMaterial("light_blue_concrete_powder", 31206);
    Material YELLOW_CONCRETE_POWDER = getMaterial("yellow_concrete_powder", 10655);
    Material LIME_CONCRETE_POWDER = getMaterial("lime_concrete_powder", 28859);
    Material PINK_CONCRETE_POWDER = getMaterial("pink_concrete_powder", 6421);
    Material GRAY_CONCRETE_POWDER = getMaterial("gray_concrete_powder", 13031);
    Material LIGHT_GRAY_CONCRETE_POWDER = getMaterial("light_gray_concrete_powder", 21589);
    Material CYAN_CONCRETE_POWDER = getMaterial("cyan_concrete_powder", 15734);
    Material PURPLE_CONCRETE_POWDER = getMaterial("purple_concrete_powder", 26808);
    Material BLUE_CONCRETE_POWDER = getMaterial("blue_concrete_powder", 17773);
    Material BROWN_CONCRETE_POWDER = getMaterial("brown_concrete_powder", 21485);
    Material GREEN_CONCRETE_POWDER = getMaterial("green_concrete_powder", 6904);
    Material RED_CONCRETE_POWDER = getMaterial("red_concrete_powder", 13286);
    Material BLACK_CONCRETE_POWDER = getMaterial("black_concrete_powder", 16150);
    Material TURTLE_EGG = getMaterial("turtle_egg", 32101);
    Material DEAD_TUBE_CORAL_BLOCK = getMaterial("dead_tube_coral_block", 28350);
    Material DEAD_BRAIN_CORAL_BLOCK = getMaterial("dead_brain_coral_block", 12979);
    Material DEAD_BUBBLE_CORAL_BLOCK = getMaterial("dead_bubble_coral_block", 28220);
    Material DEAD_FIRE_CORAL_BLOCK = getMaterial("dead_fire_coral_block", 5307);
    Material DEAD_HORN_CORAL_BLOCK = getMaterial("dead_horn_coral_block", 15103);
    Material TUBE_CORAL_BLOCK = getMaterial("tube_coral_block", 23723);
    Material BRAIN_CORAL_BLOCK = getMaterial("brain_coral_block", 30618);
    Material BUBBLE_CORAL_BLOCK = getMaterial("bubble_coral_block", 15437);
    Material FIRE_CORAL_BLOCK = getMaterial("fire_coral_block", 12119);
    Material HORN_CORAL_BLOCK = getMaterial("horn_coral_block", 19958);
    Material TUBE_CORAL = getMaterial("tube_coral", 23048);
    Material BRAIN_CORAL = getMaterial("brain_coral", 31316);
    Material BUBBLE_CORAL = getMaterial("bubble_coral", 12464);
    Material FIRE_CORAL = getMaterial("fire_coral", 29151);
    Material HORN_CORAL = getMaterial("horn_coral", 19511);
    Material DEAD_BRAIN_CORAL = getMaterial("dead_brain_coral", 9116);
    Material DEAD_BUBBLE_CORAL = getMaterial("dead_bubble_coral", 30583);
    Material DEAD_FIRE_CORAL = getMaterial("dead_fire_coral", 8365);
    Material DEAD_HORN_CORAL = getMaterial("dead_horn_coral", 5755);
    Material DEAD_TUBE_CORAL = getMaterial("dead_tube_coral", 18028);
    Material TUBE_CORAL_FAN = getMaterial("tube_coral_fan", 19929);
    Material BRAIN_CORAL_FAN = getMaterial("brain_coral_fan", 13849);
    Material BUBBLE_CORAL_FAN = getMaterial("bubble_coral_fan", 10795);
    Material FIRE_CORAL_FAN = getMaterial("fire_coral_fan", 11112);
    Material HORN_CORAL_FAN = getMaterial("horn_coral_fan", 13610);
    Material DEAD_TUBE_CORAL_FAN = getMaterial("dead_tube_coral_fan", 17628);
    Material DEAD_BRAIN_CORAL_FAN = getMaterial("dead_brain_coral_fan", 26150);
    Material DEAD_BUBBLE_CORAL_FAN = getMaterial("dead_bubble_coral_fan", 17322);
    Material DEAD_FIRE_CORAL_FAN = getMaterial("dead_fire_coral_fan", 27073);
    Material DEAD_HORN_CORAL_FAN = getMaterial("dead_horn_coral_fan", 11387);
    Material BLUE_ICE = getMaterial("blue_ice", 22449);
    Material CONDUIT = getMaterial("conduit", 5148);
    Material POLISHED_GRANITE_STAIRS = getMaterial("polished_granite_stairs", 29588);
    Material SMOOTH_RED_SANDSTONE_STAIRS = getMaterial("smooth_red_sandstone_stairs", 17561);
    Material MOSSY_STONE_BRICK_STAIRS = getMaterial("mossy_stone_brick_stairs", 27578);
    Material POLISHED_DIORITE_STAIRS = getMaterial("polished_diorite_stairs", 4625);
    Material MOSSY_COBBLESTONE_STAIRS = getMaterial("mossy_cobblestone_stairs", 29210);
    Material END_STONE_BRICK_STAIRS = getMaterial("end_stone_brick_stairs", 28831);
    Material STONE_STAIRS = getMaterial("stone_stairs", 23784);
    Material SMOOTH_SANDSTONE_STAIRS = getMaterial("smooth_sandstone_stairs", 21183);
    Material SMOOTH_QUARTZ_STAIRS = getMaterial("smooth_quartz_stairs", 19560);
    Material GRANITE_STAIRS = getMaterial("granite_stairs", 21840);
    Material ANDESITE_STAIRS = getMaterial("andesite_stairs", 17747);
    Material RED_NETHER_BRICK_STAIRS = getMaterial("red_nether_brick_stairs", 26374);
    Material POLISHED_ANDESITE_STAIRS = getMaterial("polished_andesite_stairs", 7573);
    Material DIORITE_STAIRS = getMaterial("diorite_stairs", 13134);
    Material COBBLED_DEEPSLATE_STAIRS = getMaterial("cobbled_deepslate_stairs", 20699);
    Material POLISHED_DEEPSLATE_STAIRS = getMaterial("polished_deepslate_stairs", 19513);
    Material DEEPSLATE_BRICK_STAIRS = getMaterial("deepslate_brick_stairs", 29624);
    Material DEEPSLATE_TILE_STAIRS = getMaterial("deepslate_tile_stairs", 6361);
    Material POLISHED_GRANITE_SLAB = getMaterial("polished_granite_slab", 4521);
    Material SMOOTH_RED_SANDSTONE_SLAB = getMaterial("smooth_red_sandstone_slab", 16304);
    Material MOSSY_STONE_BRICK_SLAB = getMaterial("mossy_stone_brick_slab", 14002);
    Material POLISHED_DIORITE_SLAB = getMaterial("polished_diorite_slab", 18303);
    Material MOSSY_COBBLESTONE_SLAB = getMaterial("mossy_cobblestone_slab", 12139);
    Material END_STONE_BRICK_SLAB = getMaterial("end_stone_brick_slab", 23239);
    Material SMOOTH_SANDSTONE_SLAB = getMaterial("smooth_sandstone_slab", 9030);
    Material SMOOTH_QUARTZ_SLAB = getMaterial("smooth_quartz_slab", 26543);
    Material GRANITE_SLAB = getMaterial("granite_slab", 10901);
    Material ANDESITE_SLAB = getMaterial("andesite_slab", 32124);
    Material RED_NETHER_BRICK_SLAB = getMaterial("red_nether_brick_slab", 12462);
    Material POLISHED_ANDESITE_SLAB = getMaterial("polished_andesite_slab", 24573);
    Material DIORITE_SLAB = getMaterial("diorite_slab", 10715);
    Material COBBLED_DEEPSLATE_SLAB = getMaterial("cobbled_deepslate_slab", 17388);
    Material POLISHED_DEEPSLATE_SLAB = getMaterial("polished_deepslate_slab", 32201);
    Material DEEPSLATE_BRICK_SLAB = getMaterial("deepslate_brick_slab", 23910);
    Material DEEPSLATE_TILE_SLAB = getMaterial("deepslate_tile_slab", 13315);
    Material SCAFFOLDING = getMaterial("scaffolding", 15757);
    Material REDSTONE = getMaterial("redstone", 11233);
    Material REDSTONE_TORCH = getMaterial("redstone_torch", 22547);
    Material REDSTONE_BLOCK = getMaterial("redstone_block", 19496);
    Material REPEATER = getMaterial("repeater", 28823);
    Material COMPARATOR = getMaterial("comparator", 18911);
    Material PISTON = getMaterial("piston", 21130);
    Material STICKY_PISTON = getMaterial("sticky_piston", 18127);
    Material SLIME_BLOCK = getMaterial("slime_block", 31892);
    Material HONEY_BLOCK = getMaterial("honey_block", 30615);
    Material OBSERVER = getMaterial("observer", 10726);
    Material HOPPER = getMaterial("hopper", 31974);
    Material DISPENSER = getMaterial("dispenser", 20871);
    Material DROPPER = getMaterial("dropper", 31273);
    Material LECTERN = getMaterial("lectern", 23490);
    Material TARGET = getMaterial("target", 22637);
    Material LEVER = getMaterial("lever", 15319);
    Material LIGHTNING_ROD = getMaterial("lightning_rod", 30770);
    Material DAYLIGHT_DETECTOR = getMaterial("daylight_detector", 8864);
    Material SCULK_SENSOR = getMaterial("sculk_sensor", 5598);
    Material TRIPWIRE_HOOK = getMaterial("tripwire_hook", 8130);
    Material TRAPPED_CHEST = getMaterial("trapped_chest", 18970);
    Material TNT = getMaterial("tnt", 7896);
    Material REDSTONE_LAMP = getMaterial("redstone_lamp", 8217);
    Material NOTE_BLOCK = getMaterial("note_block", 20979);
    Material STONE_BUTTON = getMaterial("stone_button", 12279);
    Material POLISHED_BLACKSTONE_BUTTON = getMaterial("polished_blackstone_button", 20760);
    Material OAK_BUTTON = getMaterial("oak_button", 13510);
    Material SPRUCE_BUTTON = getMaterial("spruce_button", 23281);
    Material BIRCH_BUTTON = getMaterial("birch_button", 26934);
    Material JUNGLE_BUTTON = getMaterial("jungle_button", 25317);
    Material ACACIA_BUTTON = getMaterial("acacia_button", 13993);
    Material DARK_OAK_BUTTON = getMaterial("dark_oak_button", 6214);
    Material CRIMSON_BUTTON = getMaterial("crimson_button", 26799);
    Material WARPED_BUTTON = getMaterial("warped_button", 25264);
    Material STONE_PRESSURE_PLATE = getMaterial("stone_pressure_plate", 22591);
    Material POLISHED_BLACKSTONE_PRESSURE_PLATE = getMaterial("polished_blackstone_pressure_plate", 32340);
    Material LIGHT_WEIGHTED_PRESSURE_PLATE = getMaterial("light_weighted_pressure_plate", 14875);
    Material HEAVY_WEIGHTED_PRESSURE_PLATE = getMaterial("heavy_weighted_pressure_plate", 16970);
    Material OAK_PRESSURE_PLATE = getMaterial("oak_pressure_plate", 20108);
    Material SPRUCE_PRESSURE_PLATE = getMaterial("spruce_pressure_plate", 15932);
    Material BIRCH_PRESSURE_PLATE = getMaterial("birch_pressure_plate", 9664);
    Material JUNGLE_PRESSURE_PLATE = getMaterial("jungle_pressure_plate", 11376);
    Material ACACIA_PRESSURE_PLATE = getMaterial("acacia_pressure_plate", 17586);
    Material DARK_OAK_PRESSURE_PLATE = getMaterial("dark_oak_pressure_plate", 31375);
    Material CRIMSON_PRESSURE_PLATE = getMaterial("crimson_pressure_plate", 18316);
    Material WARPED_PRESSURE_PLATE = getMaterial("warped_pressure_plate", 29516);
    Material IRON_DOOR = getMaterial("iron_door", 4788);
    Material OAK_DOOR = getMaterial("oak_door", 20341);
    Material SPRUCE_DOOR = getMaterial("spruce_door", 10642);
    Material BIRCH_DOOR = getMaterial("birch_door", 14759);
    Material JUNGLE_DOOR = getMaterial("jungle_door", 28163);
    Material ACACIA_DOOR = getMaterial("acacia_door", 23797);
    Material DARK_OAK_DOOR = getMaterial("dark_oak_door", 10669);
    Material CRIMSON_DOOR = getMaterial("crimson_door", 19544);
    Material WARPED_DOOR = getMaterial("warped_door", 15062);
    Material IRON_TRAPDOOR = getMaterial("iron_trapdoor", 17095);
    Material OAK_TRAPDOOR = getMaterial("oak_trapdoor", 16927);
    Material SPRUCE_TRAPDOOR = getMaterial("spruce_trapdoor", 10289);
    Material BIRCH_TRAPDOOR = getMaterial("birch_trapdoor", 32585);
    Material JUNGLE_TRAPDOOR = getMaterial("jungle_trapdoor", 8626);
    Material ACACIA_TRAPDOOR = getMaterial("acacia_trapdoor", 18343);
    Material DARK_OAK_TRAPDOOR = getMaterial("dark_oak_trapdoor", 10355);
    Material CRIMSON_TRAPDOOR = getMaterial("crimson_trapdoor", 25056);
    Material WARPED_TRAPDOOR = getMaterial("warped_trapdoor", 7708);
    Material OAK_FENCE_GATE = getMaterial("oak_fence_gate", 16689);
    Material SPRUCE_FENCE_GATE = getMaterial("spruce_fence_gate", 26423);
    Material BIRCH_FENCE_GATE = getMaterial("birch_fence_gate", 6322);
    Material JUNGLE_FENCE_GATE = getMaterial("jungle_fence_gate", 21360);
    Material ACACIA_FENCE_GATE = getMaterial("acacia_fence_gate", 14145);
    Material DARK_OAK_FENCE_GATE = getMaterial("dark_oak_fence_gate", 10679);
    Material CRIMSON_FENCE_GATE = getMaterial("crimson_fence_gate", 15602);
    Material WARPED_FENCE_GATE = getMaterial("warped_fence_gate", 11115);
    Material POWERED_RAIL = getMaterial("powered_rail", 11064);
    Material DETECTOR_RAIL = getMaterial("detector_rail", 13475);
    Material RAIL = getMaterial("rail", 13285);
    Material ACTIVATOR_RAIL = getMaterial("activator_rail", 5834);
    Material SADDLE = getMaterial("saddle", 30206);
    Material MINECART = getMaterial("minecart", 14352);
    Material CHEST_MINECART = getMaterial("chest_minecart", 4497);
    Material FURNACE_MINECART = getMaterial("furnace_minecart", 14196);
    Material TNT_MINECART = getMaterial("tnt_minecart", 4277);
    Material HOPPER_MINECART = getMaterial("hopper_minecart", 19024);
    Material CARROT_ON_A_STICK = getMaterial("carrot_on_a_stick", 27809);
    Material WARPED_FUNGUS_ON_A_STICK = getMaterial("warped_fungus_on_a_stick", 11706);
    Material ELYTRA = getMaterial("elytra", 23829);
    Material OAK_BOAT = getMaterial("oak_boat", 17570);
    Material SPRUCE_BOAT = getMaterial("spruce_boat", 31427);
    Material BIRCH_BOAT = getMaterial("birch_boat", 28104);
    Material JUNGLE_BOAT = getMaterial("jungle_boat", 4495);
    Material ACACIA_BOAT = getMaterial("acacia_boat", 27326);
    Material DARK_OAK_BOAT = getMaterial("dark_oak_boat", 28618);
    Material STRUCTURE_BLOCK = getMaterial("structure_block", 26831);
    Material JIGSAW = getMaterial("jigsaw", 17398);
    Material TURTLE_HELMET = getMaterial("turtle_helmet", 30120);
    Material SCUTE = getMaterial("scute", 11914);
    Material FLINT_AND_STEEL = getMaterial("flint_and_steel", 28620);
    Material APPLE = getMaterial("apple", 7720);
    Material BOW = getMaterial("bow", 8745);
    Material ARROW = getMaterial("arrow", 31091);
    Material COAL = getMaterial("coal", 29067);
    Material CHARCOAL = getMaterial("charcoal", 5390);
    Material DIAMOND = getMaterial("diamond", 20865);
    Material EMERALD = getMaterial("emerald", 5654);
    Material LAPIS_LAZULI = getMaterial("lapis_lazuli", 11075);
    Material QUARTZ = getMaterial("quartz", 23608);
    Material AMETHYST_SHARD = getMaterial("amethyst_shard", 7613);
    Material RAW_IRON = getMaterial("raw_iron", 5329);
    Material IRON_INGOT = getMaterial("iron_ingot", 24895);
    Material RAW_COPPER = getMaterial("raw_copper", 6162);
    Material COPPER_INGOT = getMaterial("copper_ingot", 12611);
    Material RAW_GOLD = getMaterial("raw_gold", 19564);
    Material GOLD_INGOT = getMaterial("gold_ingot", 28927);
    Material NETHERITE_INGOT = getMaterial("netherite_ingot", 32457);
    Material NETHERITE_SCRAP = getMaterial("netherite_scrap", 29331);
    Material WOODEN_SWORD = getMaterial("wooden_sword", 7175);
    Material WOODEN_SHOVEL = getMaterial("wooden_shovel", 28432);
    Material WOODEN_PICKAXE = getMaterial("wooden_pickaxe", 12792);
    Material WOODEN_AXE = getMaterial("wooden_axe", 6292);
    Material WOODEN_HOE = getMaterial("wooden_hoe", 16043);
    Material STONE_SWORD = getMaterial("stone_sword", 25084);
    Material STONE_SHOVEL = getMaterial("stone_shovel", 9520);
    Material STONE_PICKAXE = getMaterial("stone_pickaxe", 14611);
    Material STONE_AXE = getMaterial("stone_axe", 6338);
    Material STONE_HOE = getMaterial("stone_hoe", 22855);
    Material GOLDEN_SWORD = getMaterial("golden_sword", 10505);
    Material GOLDEN_SHOVEL = getMaterial("golden_shovel", 15597);
    Material GOLDEN_PICKAXE = getMaterial("golden_pickaxe", 25898);
    Material GOLDEN_AXE = getMaterial("golden_axe", 4878);
    Material GOLDEN_HOE = getMaterial("golden_hoe", 19337);
    Material IRON_SWORD = getMaterial("iron_sword", 10904);
    Material IRON_SHOVEL = getMaterial("iron_shovel", 30045);
    Material IRON_PICKAXE = getMaterial("iron_pickaxe", 8842);
    Material IRON_AXE = getMaterial("iron_axe", 15894);
    Material IRON_HOE = getMaterial("iron_hoe", 11339);
    Material DIAMOND_SWORD = getMaterial("diamond_sword", 27707);
    Material DIAMOND_SHOVEL = getMaterial("diamond_shovel", 25415);
    Material DIAMOND_PICKAXE = getMaterial("diamond_pickaxe", 24291);
    Material DIAMOND_AXE = getMaterial("diamond_axe", 27277);
    Material DIAMOND_HOE = getMaterial("diamond_hoe", 24050);
    Material NETHERITE_SWORD = getMaterial("netherite_sword", 23871);
    Material NETHERITE_SHOVEL = getMaterial("netherite_shovel", 29728);
    Material NETHERITE_PICKAXE = getMaterial("netherite_pickaxe", 9930);
    Material NETHERITE_AXE = getMaterial("netherite_axe", 29533);
    Material NETHERITE_HOE = getMaterial("netherite_hoe", 27385);
    Material STICK = getMaterial("stick", 9773);
    Material BOWL = getMaterial("bowl", 32661);
    Material MUSHROOM_STEW = getMaterial("mushroom_stew", 16336);
    Material STRING = getMaterial("string", 12806);
    Material FEATHER = getMaterial("feather", 30548);
    Material GUNPOWDER = getMaterial("gunpowder", 29974);
    Material WHEAT_SEEDS = getMaterial("wheat_seeds", 28742);
    Material WHEAT = getMaterial("wheat", 27709);
    Material BREAD = getMaterial("bread", 32049);
    Material LEATHER_HELMET = getMaterial("leather_helmet", 11624);
    Material LEATHER_CHESTPLATE = getMaterial("leather_chestplate", 29275);
    Material LEATHER_LEGGINGS = getMaterial("leather_leggings", 28210);
    Material LEATHER_BOOTS = getMaterial("leather_boots", 15282);
    Material CHAINMAIL_HELMET = getMaterial("chainmail_helmet", 26114);
    Material CHAINMAIL_CHESTPLATE = getMaterial("chainmail_chestplate", 23602);
    Material CHAINMAIL_LEGGINGS = getMaterial("chainmail_leggings", 19087);
    Material CHAINMAIL_BOOTS = getMaterial("chainmail_boots", 17953);
    Material IRON_HELMET = getMaterial("iron_helmet", 12025);
    Material IRON_CHESTPLATE = getMaterial("iron_chestplate", 28112);
    Material IRON_LEGGINGS = getMaterial("iron_leggings", 18951);
    Material IRON_BOOTS = getMaterial("iron_boots", 8531);
    Material DIAMOND_HELMET = getMaterial("diamond_helmet", 10755);
    Material DIAMOND_CHESTPLATE = getMaterial("diamond_chestplate", 32099);
    Material DIAMOND_LEGGINGS = getMaterial("diamond_leggings", 26500);
    Material DIAMOND_BOOTS = getMaterial("diamond_boots", 16522);
    Material GOLDEN_HELMET = getMaterial("golden_helmet", 7945);
    Material GOLDEN_CHESTPLATE = getMaterial("golden_chestplate", 4507);
    Material GOLDEN_LEGGINGS = getMaterial("golden_leggings", 21002);
    Material GOLDEN_BOOTS = getMaterial("golden_boots", 7859);
    Material NETHERITE_HELMET = getMaterial("netherite_helmet", 15907);
    Material NETHERITE_CHESTPLATE = getMaterial("netherite_chestplate", 6106);
    Material NETHERITE_LEGGINGS = getMaterial("netherite_leggings", 25605);
    Material NETHERITE_BOOTS = getMaterial("netherite_boots", 8923);
    Material FLINT = getMaterial("flint", 23596);
    Material PORKCHOP = getMaterial("porkchop", 30896);
    Material COOKED_PORKCHOP = getMaterial("cooked_porkchop", 27231);
    Material PAINTING = getMaterial("painting", 23945);
    Material GOLDEN_APPLE = getMaterial("golden_apple", 27732);
    Material ENCHANTED_GOLDEN_APPLE = getMaterial("enchanted_golden_apple", 8280);
    Material OAK_SIGN = getMaterial("oak_sign", 8192);
    Material SPRUCE_SIGN = getMaterial("spruce_sign", 21502);
    Material BIRCH_SIGN = getMaterial("birch_sign", 11351);
    Material JUNGLE_SIGN = getMaterial("jungle_sign", 24717);
    Material ACACIA_SIGN = getMaterial("acacia_sign", 29808);
    Material DARK_OAK_SIGN = getMaterial("dark_oak_sign", 15127);
    Material CRIMSON_SIGN = getMaterial("crimson_sign", 12162);
    Material WARPED_SIGN = getMaterial("warped_sign", 10407);
    Material BUCKET = getMaterial("bucket", 15215);
    Material WATER_BUCKET = getMaterial("water_bucket", 8802);
    Material LAVA_BUCKET = getMaterial("lava_bucket", 9228);
    Material POWDER_SNOW_BUCKET = getMaterial("powder_snow_bucket", 31101);
    Material SNOWBALL = getMaterial("snowball", 19487);
    Material LEATHER = getMaterial("leather", 16414);
    Material MILK_BUCKET = getMaterial("milk_bucket", 9680);
    Material PUFFERFISH_BUCKET = getMaterial("pufferfish_bucket", 8861);
    Material SALMON_BUCKET = getMaterial("salmon_bucket", 9606);
    Material COD_BUCKET = getMaterial("cod_bucket", 28601);
    Material TROPICAL_FISH_BUCKET = getMaterial("tropical_fish_bucket", 29995);
    Material AXOLOTL_BUCKET = getMaterial("axolotl_bucket", 20669);
    Material BRICK = getMaterial("brick", 6820);
    Material CLAY_BALL = getMaterial("clay_ball", 24603);
    Material DRIED_KELP_BLOCK = getMaterial("dried_kelp_block", 12966);
    Material PAPER = getMaterial("paper", 9923);
    Material BOOK = getMaterial("book", 23097);
    Material SLIME_BALL = getMaterial("slime_ball", 5242);
    Material EGG = getMaterial("egg", 21603);
    Material COMPASS = getMaterial("compass", 24139);
    Material BUNDLE = getMaterial("bundle", 16835);
    Material FISHING_ROD = getMaterial("fishing_rod", 4167);
    Material CLOCK = getMaterial("clock", 14980);
    Material SPYGLASS = getMaterial("spyglass", 27490);
    Material GLOWSTONE_DUST = getMaterial("glowstone_dust", 6665);
    Material COD = getMaterial("cod", 24691);
    Material SALMON = getMaterial("salmon", 18516);
    Material TROPICAL_FISH = getMaterial("tropical_fish", 24879);
    Material PUFFERFISH = getMaterial("pufferfish", 8115);
    Material COOKED_COD = getMaterial("cooked_cod", 9681);
    Material COOKED_SALMON = getMaterial("cooked_salmon", 5615);
    Material INK_SAC = getMaterial("ink_sac", 7184);
    Material GLOW_INK_SAC = getMaterial("glow_ink_sac", 9686);
    Material COCOA_BEANS = getMaterial("cocoa_beans", 30186);
    Material WHITE_DYE = getMaterial("white_dye", 10758);
    Material ORANGE_DYE = getMaterial("orange_dye", 13866);
    Material MAGENTA_DYE = getMaterial("magenta_dye", 11788);
    Material LIGHT_BLUE_DYE = getMaterial("light_blue_dye", 28738);
    Material YELLOW_DYE = getMaterial("yellow_dye", 5952);
    Material LIME_DYE = getMaterial("lime_dye", 6147);
    Material PINK_DYE = getMaterial("pink_dye", 31151);
    Material GRAY_DYE = getMaterial("gray_dye", 9184);
    Material LIGHT_GRAY_DYE = getMaterial("light_gray_dye", 27643);
    Material CYAN_DYE = getMaterial("cyan_dye", 8043);
    Material PURPLE_DYE = getMaterial("purple_dye", 6347);
    Material BLUE_DYE = getMaterial("blue_dye", 11588);
    Material BROWN_DYE = getMaterial("brown_dye", 7648);
    Material GREEN_DYE = getMaterial("green_dye", 23215);
    Material RED_DYE = getMaterial("red_dye", 5728);
    Material BLACK_DYE = getMaterial("black_dye", 6202);
    Material BONE_MEAL = getMaterial("bone_meal", 32458);
    Material BONE = getMaterial("bone", 5686);
    Material SUGAR = getMaterial("sugar", 30638);
    Material CAKE = getMaterial("cake", 27048);
    Material WHITE_BED = getMaterial("white_bed", 8185);
    Material ORANGE_BED = getMaterial("orange_bed", 11194);
    Material MAGENTA_BED = getMaterial("magenta_bed", 20061);
    Material LIGHT_BLUE_BED = getMaterial("light_blue_bed", 20957);
    Material YELLOW_BED = getMaterial("yellow_bed", 30410);
    Material LIME_BED = getMaterial("lime_bed", 27860);
    Material PINK_BED = getMaterial("pink_bed", 13795);
    Material GRAY_BED = getMaterial("gray_bed", 15745);
    Material LIGHT_GRAY_BED = getMaterial("light_gray_bed", 5090);
    Material CYAN_BED = getMaterial("cyan_bed", 16746);
    Material PURPLE_BED = getMaterial("purple_bed", 29755);
    Material BLUE_BED = getMaterial("blue_bed", 12714);
    Material BROWN_BED = getMaterial("brown_bed", 26672);
    Material GREEN_BED = getMaterial("green_bed", 13797);
    Material RED_BED = getMaterial("red_bed", 30910);
    Material BLACK_BED = getMaterial("black_bed", 20490);
    Material COOKIE = getMaterial("cookie", 27431);
    Material FILLED_MAP = getMaterial("filled_map", 23504);
    Material SHEARS = getMaterial("shears", 27971);
    Material MELON_SLICE = getMaterial("melon_slice", 5347);
    Material DRIED_KELP = getMaterial("dried_kelp", 21042);
    Material PUMPKIN_SEEDS = getMaterial("pumpkin_seeds", 28985);
    Material MELON_SEEDS = getMaterial("melon_seeds", 18340);
    Material BEEF = getMaterial("beef", 4803);
    Material COOKED_BEEF = getMaterial("cooked_beef", 21595);
    Material CHICKEN = getMaterial("chicken", 17281);
    Material COOKED_CHICKEN = getMaterial("cooked_chicken", 16984);
    Material ROTTEN_FLESH = getMaterial("rotten_flesh", 21591);
    Material ENDER_PEARL = getMaterial("ender_pearl", 5259);
    Material BLAZE_ROD = getMaterial("blaze_rod", 8289);
    Material GHAST_TEAR = getMaterial("ghast_tear", 18222);
    Material GOLD_NUGGET = getMaterial("gold_nugget", 28814);
    Material NETHER_WART = getMaterial("nether_wart", 29227);
    Material POTION = getMaterial("potion", 24020);
    Material GLASS_BOTTLE = getMaterial("glass_bottle", 6116);
    Material SPIDER_EYE = getMaterial("spider_eye", 9318);
    Material FERMENTED_SPIDER_EYE = getMaterial("fermented_spider_eye", 19386);
    Material BLAZE_POWDER = getMaterial("blaze_powder", 18941);
    Material MAGMA_CREAM = getMaterial("magma_cream", 25097);
    Material BREWING_STAND = getMaterial("brewing_stand", 14539);
    Material CAULDRON = getMaterial("cauldron", 26531);
    Material ENDER_EYE = getMaterial("ender_eye", 24860);
    Material GLISTERING_MELON_SLICE = getMaterial("glistering_melon_slice", 20158);
    Material AXOLOTL_SPAWN_EGG = getMaterial("axolotl_spawn_egg", 30381);
    Material BAT_SPAWN_EGG = getMaterial("bat_spawn_egg", 14607);
    Material BEE_SPAWN_EGG = getMaterial("bee_spawn_egg", 22924);
    Material BLAZE_SPAWN_EGG = getMaterial("blaze_spawn_egg", 4759);
    Material CAT_SPAWN_EGG = getMaterial("cat_spawn_egg", 29583);
    Material CAVE_SPIDER_SPAWN_EGG = getMaterial("cave_spider_spawn_egg", 23341);
    Material CHICKEN_SPAWN_EGG = getMaterial("chicken_spawn_egg", 5462);
    Material COD_SPAWN_EGG = getMaterial("cod_spawn_egg", 27248);
    Material COW_SPAWN_EGG = getMaterial("cow_spawn_egg", 14761);
    Material CREEPER_SPAWN_EGG = getMaterial("creeper_spawn_egg", 9653);
    Material DOLPHIN_SPAWN_EGG = getMaterial("dolphin_spawn_egg", 20787);
    Material DONKEY_SPAWN_EGG = getMaterial("donkey_spawn_egg", 14513);
    Material DROWNED_SPAWN_EGG = getMaterial("drowned_spawn_egg", 19368);
    Material ELDER_GUARDIAN_SPAWN_EGG = getMaterial("elder_guardian_spawn_egg", 11418);
    Material ENDERMAN_SPAWN_EGG = getMaterial("enderman_spawn_egg", 29488);
    Material ENDERMITE_SPAWN_EGG = getMaterial("endermite_spawn_egg", 16617);
    Material EVOKER_SPAWN_EGG = getMaterial("evoker_spawn_egg", 21271);
    Material FOX_SPAWN_EGG = getMaterial("fox_spawn_egg", 22376);
    Material GHAST_SPAWN_EGG = getMaterial("ghast_spawn_egg", 9970);
    Material GLOW_SQUID_SPAWN_EGG = getMaterial("glow_squid_spawn_egg", 31578);
    Material GOAT_SPAWN_EGG = getMaterial("goat_spawn_egg", 30639);
    Material GUARDIAN_SPAWN_EGG = getMaterial("guardian_spawn_egg", 20113);
    Material HOGLIN_SPAWN_EGG = getMaterial("hoglin_spawn_egg", 14088);
    Material HORSE_SPAWN_EGG = getMaterial("horse_spawn_egg", 25981);
    Material HUSK_SPAWN_EGG = getMaterial("husk_spawn_egg", 20178);
    Material LLAMA_SPAWN_EGG = getMaterial("llama_spawn_egg", 23640);
    Material MAGMA_CUBE_SPAWN_EGG = getMaterial("magma_cube_spawn_egg", 26638);
    Material MOOSHROOM_SPAWN_EGG = getMaterial("mooshroom_spawn_egg", 22125);
    Material MULE_SPAWN_EGG = getMaterial("mule_spawn_egg", 11229);
    Material OCELOT_SPAWN_EGG = getMaterial("ocelot_spawn_egg", 30080);
    Material PANDA_SPAWN_EGG = getMaterial("panda_spawn_egg", 23759);
    Material PARROT_SPAWN_EGG = getMaterial("parrot_spawn_egg", 23614);
    Material PHANTOM_SPAWN_EGG = getMaterial("phantom_spawn_egg", 24648);
    Material PIG_SPAWN_EGG = getMaterial("pig_spawn_egg", 22584);
    Material PIGLIN_SPAWN_EGG = getMaterial("piglin_spawn_egg", 16193);
    Material PIGLIN_BRUTE_SPAWN_EGG = getMaterial("piglin_brute_spawn_egg", 30230);
    Material PILLAGER_SPAWN_EGG = getMaterial("pillager_spawn_egg", 28659);
    Material POLAR_BEAR_SPAWN_EGG = getMaterial("polar_bear_spawn_egg", 17015);
    Material PUFFERFISH_SPAWN_EGG = getMaterial("pufferfish_spawn_egg", 24570);
    Material RABBIT_SPAWN_EGG = getMaterial("rabbit_spawn_egg", 26496);
    Material RAVAGER_SPAWN_EGG = getMaterial("ravager_spawn_egg", 8726);
    Material SALMON_SPAWN_EGG = getMaterial("salmon_spawn_egg", 18739);
    Material SHEEP_SPAWN_EGG = getMaterial("sheep_spawn_egg", 24488);
    Material SHULKER_SPAWN_EGG = getMaterial("shulker_spawn_egg", 31848);
    Material SILVERFISH_SPAWN_EGG = getMaterial("silverfish_spawn_egg", 14537);
    Material SKELETON_SPAWN_EGG = getMaterial("skeleton_spawn_egg", 15261);
    Material SKELETON_HORSE_SPAWN_EGG = getMaterial("skeleton_horse_spawn_egg", 21356);
    Material SLIME_SPAWN_EGG = getMaterial("slime_spawn_egg", 17196);
    Material SPIDER_SPAWN_EGG = getMaterial("spider_spawn_egg", 14984);
    Material SQUID_SPAWN_EGG = getMaterial("squid_spawn_egg", 10682);
    Material STRAY_SPAWN_EGG = getMaterial("stray_spawn_egg", 30153);
    Material STRIDER_SPAWN_EGG = getMaterial("strider_spawn_egg", 6203);
    Material TRADER_LLAMA_SPAWN_EGG = getMaterial("trader_llama_spawn_egg", 8439);
    Material TROPICAL_FISH_SPAWN_EGG = getMaterial("tropical_fish_spawn_egg", 19713);
    Material TURTLE_SPAWN_EGG = getMaterial("turtle_spawn_egg", 17324);
    Material VEX_SPAWN_EGG = getMaterial("vex_spawn_egg", 27751);
    Material VILLAGER_SPAWN_EGG = getMaterial("villager_spawn_egg", 30348);
    Material VINDICATOR_SPAWN_EGG = getMaterial("vindicator_spawn_egg", 25324);
    Material WANDERING_TRADER_SPAWN_EGG = getMaterial("wandering_trader_spawn_egg", 17904);
    Material WITCH_SPAWN_EGG = getMaterial("witch_spawn_egg", 11837);
    Material WITHER_SKELETON_SPAWN_EGG = getMaterial("wither_skeleton_spawn_egg", 10073);
    Material WOLF_SPAWN_EGG = getMaterial("wolf_spawn_egg", 21692);
    Material ZOGLIN_SPAWN_EGG = getMaterial("zoglin_spawn_egg", 7442);
    Material ZOMBIE_SPAWN_EGG = getMaterial("zombie_spawn_egg", 5814);
    Material ZOMBIE_HORSE_SPAWN_EGG = getMaterial("zombie_horse_spawn_egg", 4275);
    Material ZOMBIE_VILLAGER_SPAWN_EGG = getMaterial("zombie_villager_spawn_egg", 10311);
    Material ZOMBIFIED_PIGLIN_SPAWN_EGG = getMaterial("zombified_piglin_spawn_egg", 6626);
    Material EXPERIENCE_BOTTLE = getMaterial("experience_bottle", 12858);
    Material FIRE_CHARGE = getMaterial("fire_charge", 4842);
    Material WRITABLE_BOOK = getMaterial("writable_book", 13393);
    Material WRITTEN_BOOK = getMaterial("written_book", 24164);
    Material ITEM_FRAME = getMaterial("item_frame", 27318);
    Material GLOW_ITEM_FRAME = getMaterial("glow_item_frame", 26473);
    Material FLOWER_POT = getMaterial("flower_pot", 30567);
    Material CARROT = getMaterial("carrot", 22824);
    Material POTATO = getMaterial("potato", 21088);
    Material BAKED_POTATO = getMaterial("baked_potato", 14624);
    Material POISONOUS_POTATO = getMaterial("poisonous_potato", 32640);
    Material MAP = getMaterial("map", 21655);
    Material GOLDEN_CARROT = getMaterial("golden_carrot", 5300);
    Material SKELETON_SKULL = getMaterial("skeleton_skull", 13270);
    Material WITHER_SKELETON_SKULL = getMaterial("wither_skeleton_skull", 31487);
    Material PLAYER_HEAD = getMaterial("player_head", 21174);
    Material ZOMBIE_HEAD = getMaterial("zombie_head", 9304);
    Material CREEPER_HEAD = getMaterial("creeper_head", 29146);
    Material DRAGON_HEAD = getMaterial("dragon_head", 20084);
    Material NETHER_STAR = getMaterial("nether_star", 12469);
    Material PUMPKIN_PIE = getMaterial("pumpkin_pie", 28725);
    Material FIREWORK_ROCKET = getMaterial("firework_rocket", 23841);
    Material FIREWORK_STAR = getMaterial("firework_star", 12190);
    Material ENCHANTED_BOOK = getMaterial("enchanted_book", 11741);
    Material NETHER_BRICK = getMaterial("nether_brick", 19996);
    Material PRISMARINE_SHARD = getMaterial("prismarine_shard", 10993);
    Material PRISMARINE_CRYSTALS = getMaterial("prismarine_crystals", 31546);
    Material RABBIT = getMaterial("rabbit", 23068);
    Material COOKED_RABBIT = getMaterial("cooked_rabbit", 4454);
    Material RABBIT_STEW = getMaterial("rabbit_stew", 10611);
    Material RABBIT_FOOT = getMaterial("rabbit_foot", 13864);
    Material RABBIT_HIDE = getMaterial("rabbit_hide", 12467);
    Material ARMOR_STAND = getMaterial("armor_stand", 12852);
    Material IRON_HORSE_ARMOR = getMaterial("iron_horse_armor", 30108);
    Material GOLDEN_HORSE_ARMOR = getMaterial("golden_horse_armor", 7996);
    Material DIAMOND_HORSE_ARMOR = getMaterial("diamond_horse_armor", 10321);
    Material LEATHER_HORSE_ARMOR = getMaterial("leather_horse_armor", 30667);
    Material LEAD = getMaterial("lead", 29539);
    Material NAME_TAG = getMaterial("name_tag", 30731);
    Material COMMAND_BLOCK_MINECART = getMaterial("command_block_minecart", 7992);
    Material MUTTON = getMaterial("mutton", 4792);
    Material COOKED_MUTTON = getMaterial("cooked_mutton", 31447);
    Material WHITE_BANNER = getMaterial("white_banner", 17562);
    Material ORANGE_BANNER = getMaterial("orange_banner", 4839);
    Material MAGENTA_BANNER = getMaterial("magenta_banner", 15591);
    Material LIGHT_BLUE_BANNER = getMaterial("light_blue_banner", 18060);
    Material YELLOW_BANNER = getMaterial("yellow_banner", 30382);
    Material LIME_BANNER = getMaterial("lime_banner", 18887);
    Material PINK_BANNER = getMaterial("pink_banner", 19439);
    Material GRAY_BANNER = getMaterial("gray_banner", 12053);
    Material LIGHT_GRAY_BANNER = getMaterial("light_gray_banner", 11417);
    Material CYAN_BANNER = getMaterial("cyan_banner", 9839);
    Material PURPLE_BANNER = getMaterial("purple_banner", 29027);
    Material BLUE_BANNER = getMaterial("blue_banner", 18481);
    Material BROWN_BANNER = getMaterial("brown_banner", 11481);
    Material GREEN_BANNER = getMaterial("green_banner", 10698);
    Material RED_BANNER = getMaterial("red_banner", 26961);
    Material BLACK_BANNER = getMaterial("black_banner", 9365);
    Material END_CRYSTAL = getMaterial("end_crystal", 19090);
    Material CHORUS_FRUIT = getMaterial("chorus_fruit", 7652);
    Material POPPED_CHORUS_FRUIT = getMaterial("popped_chorus_fruit", 27844);
    Material BEETROOT = getMaterial("beetroot", 23305);
    Material BEETROOT_SEEDS = getMaterial("beetroot_seeds", 21282);
    Material BEETROOT_SOUP = getMaterial("beetroot_soup", 16036);
    Material DRAGON_BREATH = getMaterial("dragon_breath", 20154);
    Material SPLASH_POTION = getMaterial("splash_potion", 30248);
    Material SPECTRAL_ARROW = getMaterial("spectral_arrow", 4568);
    Material TIPPED_ARROW = getMaterial("tipped_arrow", 25164);
    Material LINGERING_POTION = getMaterial("lingering_potion", 25857);
    Material SHIELD = getMaterial("shield", 29943);
    Material TOTEM_OF_UNDYING = getMaterial("totem_of_undying", 10139);
    Material SHULKER_SHELL = getMaterial("shulker_shell", 27848);
    Material IRON_NUGGET = getMaterial("iron_nugget", 13715);
    Material KNOWLEDGE_BOOK = getMaterial("knowledge_book", 12646);
    Material DEBUG_STICK = getMaterial("debug_stick", 24562);
    Material MUSIC_DISC_13 = getMaterial("music_disc_13", 16359);
    Material MUSIC_DISC_CAT = getMaterial("music_disc_cat", 16246);
    Material MUSIC_DISC_BLOCKS = getMaterial("music_disc_blocks", 26667);
    Material MUSIC_DISC_CHIRP = getMaterial("music_disc_chirp", 19436);
    Material MUSIC_DISC_FAR = getMaterial("music_disc_far", 31742);
    Material MUSIC_DISC_MALL = getMaterial("music_disc_mall", 11517);
    Material MUSIC_DISC_MELLOHI = getMaterial("music_disc_mellohi", 26117);
    Material MUSIC_DISC_STAL = getMaterial("music_disc_stal", 14989);
    Material MUSIC_DISC_STRAD = getMaterial("music_disc_strad", 16785);
    Material MUSIC_DISC_WARD = getMaterial("music_disc_ward", 24026);
    Material MUSIC_DISC_11 = getMaterial("music_disc_11", 27426);
    Material MUSIC_DISC_WAIT = getMaterial("music_disc_wait", 26499);
    Material MUSIC_DISC_PIGSTEP = getMaterial("music_disc_pigstep", 21323);
    Material TRIDENT = getMaterial("trident", 7534);
    Material PHANTOM_MEMBRANE = getMaterial("phantom_membrane", 18398);
    Material NAUTILUS_SHELL = getMaterial("nautilus_shell", 19989);
    Material HEART_OF_THE_SEA = getMaterial("heart_of_the_sea", 11807);
    Material CROSSBOW = getMaterial("crossbow", 4340);
    Material SUSPICIOUS_STEW = getMaterial("suspicious_stew", 8173);
    Material LOOM = getMaterial("loom", 14276);
    Material FLOWER_BANNER_PATTERN = getMaterial("flower_banner_pattern", 5762);
    Material CREEPER_BANNER_PATTERN = getMaterial("creeper_banner_pattern", 15774);
    Material SKULL_BANNER_PATTERN = getMaterial("skull_banner_pattern", 7680);
    Material MOJANG_BANNER_PATTERN = getMaterial("mojang_banner_pattern", 11903);
    Material GLOBE_BANNER_PATTERN = getMaterial("globe_banner_pattern", 27753);
    Material PIGLIN_BANNER_PATTERN = getMaterial("piglin_banner_pattern", 22028);
    Material COMPOSTER = getMaterial("composter", 31247);
    Material BARREL = getMaterial("barrel", 22396);
    Material SMOKER = getMaterial("smoker", 24781);
    Material BLAST_FURNACE = getMaterial("blast_furnace", 31157);
    Material CARTOGRAPHY_TABLE = getMaterial("cartography_table", 28529);
    Material FLETCHING_TABLE = getMaterial("fletching_table", 30838);
    Material GRINDSTONE = getMaterial("grindstone", 26260);
    Material SMITHING_TABLE = getMaterial("smithing_table", 9082);
    Material STONECUTTER = getMaterial("stonecutter", 25170);
    Material BELL = getMaterial("bell", 20000);
    Material LANTERN = getMaterial("lantern", 5992);
    Material SOUL_LANTERN = getMaterial("soul_lantern", 27778);
    Material SWEET_BERRIES = getMaterial("sweet_berries", 19747);
    Material GLOW_BERRIES = getMaterial("glow_berries", 11584);
    Material CAMPFIRE = getMaterial("campfire", 8488);
    Material SOUL_CAMPFIRE = getMaterial("soul_campfire", 4238);
    Material SHROOMLIGHT = getMaterial("shroomlight", 20424);
    Material HONEYCOMB = getMaterial("honeycomb", 9482);
    Material BEE_NEST = getMaterial("bee_nest", 8825);
    Material BEEHIVE = getMaterial("beehive", 11830);
    Material HONEY_BOTTLE = getMaterial("honey_bottle", 22927);
    Material HONEYCOMB_BLOCK = getMaterial("honeycomb_block", 28780);
    Material LODESTONE = getMaterial("lodestone", 23127);
    Material CRYING_OBSIDIAN = getMaterial("crying_obsidian", 31545);
    Material BLACKSTONE = getMaterial("blackstone", 7354);
    Material BLACKSTONE_SLAB = getMaterial("blackstone_slab", 11948);
    Material BLACKSTONE_STAIRS = getMaterial("blackstone_stairs", 14646);
    Material GILDED_BLACKSTONE = getMaterial("gilded_blackstone", 8498);
    Material POLISHED_BLACKSTONE = getMaterial("polished_blackstone", 18144);
    Material POLISHED_BLACKSTONE_SLAB = getMaterial("polished_blackstone_slab", 23430);
    Material POLISHED_BLACKSTONE_STAIRS = getMaterial("polished_blackstone_stairs", 8653);
    Material CHISELED_POLISHED_BLACKSTONE = getMaterial("chiseled_polished_blackstone", 21942);
    Material POLISHED_BLACKSTONE_BRICKS = getMaterial("polished_blackstone_bricks", 19844);
    Material POLISHED_BLACKSTONE_BRICK_SLAB = getMaterial("polished_blackstone_brick_slab", 12219);
    Material POLISHED_BLACKSTONE_BRICK_STAIRS = getMaterial("polished_blackstone_brick_stairs", 17983);
    Material CRACKED_POLISHED_BLACKSTONE_BRICKS = getMaterial("cracked_polished_blackstone_bricks", 16846);
    Material RESPAWN_ANCHOR = getMaterial("respawn_anchor", 4099);
    Material CANDLE = getMaterial("candle", 16122);
    Material WHITE_CANDLE = getMaterial("white_candle", 26410);
    Material ORANGE_CANDLE = getMaterial("orange_candle", 22668);
    Material MAGENTA_CANDLE = getMaterial("magenta_candle", 25467);
    Material LIGHT_BLUE_CANDLE = getMaterial("light_blue_candle", 28681);
    Material YELLOW_CANDLE = getMaterial("yellow_candle", 14351);
    Material LIME_CANDLE = getMaterial("lime_candle", 21778);
    Material PINK_CANDLE = getMaterial("pink_candle", 28259);
    Material GRAY_CANDLE = getMaterial("gray_candle", 10721);
    Material LIGHT_GRAY_CANDLE = getMaterial("light_gray_candle", 10031);
    Material CYAN_CANDLE = getMaterial("cyan_candle", 24765);
    Material PURPLE_CANDLE = getMaterial("purple_candle", 19606);
    Material BLUE_CANDLE = getMaterial("blue_candle", 29047);
    Material BROWN_CANDLE = getMaterial("brown_candle", 26145);
    Material GREEN_CANDLE = getMaterial("green_candle", 29756);
    Material RED_CANDLE = getMaterial("red_candle", 4214);
    Material BLACK_CANDLE = getMaterial("black_candle", 12617);
    Material SMALL_AMETHYST_BUD = getMaterial("small_amethyst_bud", 14958);
    Material MEDIUM_AMETHYST_BUD = getMaterial("medium_amethyst_bud", 8429);
    Material LARGE_AMETHYST_BUD = getMaterial("large_amethyst_bud", 7279);
    Material AMETHYST_CLUSTER = getMaterial("amethyst_cluster", 13142);
    Material POINTED_DRIPSTONE = getMaterial("pointed_dripstone", 18755);
    Material WATER = getMaterial("water", 24998);
    Material LAVA = getMaterial("lava", 8415);
    Material TALL_SEAGRASS = getMaterial("tall_seagrass", 27189);
    Material PISTON_HEAD = getMaterial("piston_head", 30226);
    Material MOVING_PISTON = getMaterial("moving_piston", 13831);
    Material WALL_TORCH = getMaterial("wall_torch", 25890);
    Material FIRE = getMaterial("fire", 16396);
    Material SOUL_FIRE = getMaterial("soul_fire", 30163);
    Material REDSTONE_WIRE = getMaterial("redstone_wire", 25984);
    Material OAK_WALL_SIGN = getMaterial("oak_wall_sign", 12984);
    Material SPRUCE_WALL_SIGN = getMaterial("spruce_wall_sign", 7352);
    Material BIRCH_WALL_SIGN = getMaterial("birch_wall_sign", 9887);
    Material ACACIA_WALL_SIGN = getMaterial("acacia_wall_sign", 20316);
    Material JUNGLE_WALL_SIGN = getMaterial("jungle_wall_sign", 29629);
    Material DARK_OAK_WALL_SIGN = getMaterial("dark_oak_wall_sign", 9508);
    Material REDSTONE_WALL_TORCH = getMaterial("redstone_wall_torch", 7595);
    Material SOUL_WALL_TORCH = getMaterial("soul_wall_torch", 27500);
    Material NETHER_PORTAL = getMaterial("nether_portal", 19469);
    Material ATTACHED_PUMPKIN_STEM = getMaterial("attached_pumpkin_stem", 12724);
    Material ATTACHED_MELON_STEM = getMaterial("attached_melon_stem", 30882);
    Material PUMPKIN_STEM = getMaterial("pumpkin_stem", 19021);
    Material MELON_STEM = getMaterial("melon_stem", 8247);
    Material WATER_CAULDRON = getMaterial("water_cauldron", 32008);
    Material LAVA_CAULDRON = getMaterial("lava_cauldron", 4514);
    Material POWDER_SNOW_CAULDRON = getMaterial("powder_snow_cauldron", 31571);
    Material END_PORTAL = getMaterial("end_portal", 16782);
    Material COCOA = getMaterial("cocoa", 29709);
    Material TRIPWIRE = getMaterial("tripwire", 8810);
    Material POTTED_OAK_SAPLING = getMaterial("potted_oak_sapling", 11905);
    Material POTTED_SPRUCE_SAPLING = getMaterial("potted_spruce_sapling", 29498);
    Material POTTED_BIRCH_SAPLING = getMaterial("potted_birch_sapling", 32484);
    Material POTTED_JUNGLE_SAPLING = getMaterial("potted_jungle_sapling", 7525);
    Material POTTED_ACACIA_SAPLING = getMaterial("potted_acacia_sapling", 14096);
    Material POTTED_DARK_OAK_SAPLING = getMaterial("potted_dark_oak_sapling", 6486);
    Material POTTED_FERN = getMaterial("potted_fern", 23315);
    Material POTTED_DANDELION = getMaterial("potted_dandelion", 9727);
    Material POTTED_POPPY = getMaterial("potted_poppy", 7457);
    Material POTTED_BLUE_ORCHID = getMaterial("potted_blue_orchid", 6599);
    Material POTTED_ALLIUM = getMaterial("potted_allium", 13184);
    Material POTTED_AZURE_BLUET = getMaterial("potted_azure_bluet", 8754);
    Material POTTED_RED_TULIP = getMaterial("potted_red_tulip", 28594);
    Material POTTED_ORANGE_TULIP = getMaterial("potted_orange_tulip", 28807);
    Material POTTED_WHITE_TULIP = getMaterial("potted_white_tulip", 24330);
    Material POTTED_PINK_TULIP = getMaterial("potted_pink_tulip", 10089);
    Material POTTED_OXEYE_DAISY = getMaterial("potted_oxeye_daisy", 19707);
    Material POTTED_CORNFLOWER = getMaterial("potted_cornflower", 28917);
    Material POTTED_LILY_OF_THE_VALLEY = getMaterial("potted_lily_of_the_valley", 9364);
    Material POTTED_WITHER_ROSE = getMaterial("potted_wither_rose", 26876);
    Material POTTED_RED_MUSHROOM = getMaterial("potted_red_mushroom", 22881);
    Material POTTED_BROWN_MUSHROOM = getMaterial("potted_brown_mushroom", 14481);
    Material POTTED_DEAD_BUSH = getMaterial("potted_dead_bush", 13020);
    Material POTTED_CACTUS = getMaterial("potted_cactus", 8777);
    Material CARROTS = getMaterial("carrots", 17258);
    Material POTATOES = getMaterial("potatoes", 10879);
    Material SKELETON_WALL_SKULL = getMaterial("skeleton_wall_skull", 31650);
    Material WITHER_SKELETON_WALL_SKULL = getMaterial("wither_skeleton_wall_skull", 9326);
    Material ZOMBIE_WALL_HEAD = getMaterial("zombie_wall_head", 16296);
    Material PLAYER_WALL_HEAD = getMaterial("player_wall_head", 13164);
    Material CREEPER_WALL_HEAD = getMaterial("creeper_wall_head", 30123);
    Material DRAGON_WALL_HEAD = getMaterial("dragon_wall_head", 19818);
    Material WHITE_WALL_BANNER = getMaterial("white_wall_banner", 15967);
    Material ORANGE_WALL_BANNER = getMaterial("orange_wall_banner", 9936);
    Material MAGENTA_WALL_BANNER = getMaterial("magenta_wall_banner", 23291);
    Material LIGHT_BLUE_WALL_BANNER = getMaterial("light_blue_wall_banner", 12011);
    Material YELLOW_WALL_BANNER = getMaterial("yellow_wall_banner", 32004);
    Material LIME_WALL_BANNER = getMaterial("lime_wall_banner", 21422);
    Material PINK_WALL_BANNER = getMaterial("pink_wall_banner", 9421);
    Material GRAY_WALL_BANNER = getMaterial("gray_wall_banner", 24275);
    Material LIGHT_GRAY_WALL_BANNER = getMaterial("light_gray_wall_banner", 31088);
    Material CYAN_WALL_BANNER = getMaterial("cyan_wall_banner", 10889);
    Material PURPLE_WALL_BANNER = getMaterial("purple_wall_banner", 14298);
    Material BLUE_WALL_BANNER = getMaterial("blue_wall_banner", 17757);
    Material BROWN_WALL_BANNER = getMaterial("brown_wall_banner", 14731);
    Material GREEN_WALL_BANNER = getMaterial("green_wall_banner", 15046);
    Material RED_WALL_BANNER = getMaterial("red_wall_banner", 4378);
    Material BLACK_WALL_BANNER = getMaterial("black_wall_banner", 4919);
    Material BEETROOTS = getMaterial("beetroots", 22075);
    Material END_GATEWAY = getMaterial("end_gateway", 26605);
    Material FROSTED_ICE = getMaterial("frosted_ice", 21814);
    Material KELP_PLANT = getMaterial("kelp_plant", 29697);
    Material DEAD_TUBE_CORAL_WALL_FAN = getMaterial("dead_tube_coral_wall_fan", 5128);
    Material DEAD_BRAIN_CORAL_WALL_FAN = getMaterial("dead_brain_coral_wall_fan", 23718);
    Material DEAD_BUBBLE_CORAL_WALL_FAN = getMaterial("dead_bubble_coral_wall_fan", 18453);
    Material DEAD_FIRE_CORAL_WALL_FAN = getMaterial("dead_fire_coral_wall_fan", 23375);
    Material DEAD_HORN_CORAL_WALL_FAN = getMaterial("dead_horn_coral_wall_fan", 27550);
    Material TUBE_CORAL_WALL_FAN = getMaterial("tube_coral_wall_fan", 25282);
    Material BRAIN_CORAL_WALL_FAN = getMaterial("brain_coral_wall_fan", 22685);
    Material BUBBLE_CORAL_WALL_FAN = getMaterial("bubble_coral_wall_fan", 20382);
    Material FIRE_CORAL_WALL_FAN = getMaterial("fire_coral_wall_fan", 20100);
    Material HORN_CORAL_WALL_FAN = getMaterial("horn_coral_wall_fan", 28883);
    Material BAMBOO_SAPLING = getMaterial("bamboo_sapling", 8478);
    Material POTTED_BAMBOO = getMaterial("potted_bamboo", 22542);
    Material VOID_AIR = getMaterial("void_air", 13668);
    Material CAVE_AIR = getMaterial("cave_air", 17422);
    Material BUBBLE_COLUMN = getMaterial("bubble_column", 31612);
    Material SWEET_BERRY_BUSH = getMaterial("sweet_berry_bush", 11958);
    Material WEEPING_VINES_PLANT = getMaterial("weeping_vines_plant", 19437);
    Material TWISTING_VINES_PLANT = getMaterial("twisting_vines_plant", 25338);
    Material CRIMSON_WALL_SIGN = getMaterial("crimson_wall_sign", 19242);
    Material WARPED_WALL_SIGN = getMaterial("warped_wall_sign", 13534);
    Material POTTED_CRIMSON_FUNGUS = getMaterial("potted_crimson_fungus", 5548);
    Material POTTED_WARPED_FUNGUS = getMaterial("potted_warped_fungus", 30800);
    Material POTTED_CRIMSON_ROOTS = getMaterial("potted_crimson_roots", 13852);
    Material POTTED_WARPED_ROOTS = getMaterial("potted_warped_roots", 6403);
    Material CANDLE_CAKE = getMaterial("candle_cake", 25423);
    Material WHITE_CANDLE_CAKE = getMaterial("white_candle_cake", 12674);
    Material ORANGE_CANDLE_CAKE = getMaterial("orange_candle_cake", 24982);
    Material MAGENTA_CANDLE_CAKE = getMaterial("magenta_candle_cake", 11022);
    Material LIGHT_BLUE_CANDLE_CAKE = getMaterial("light_blue_candle_cake", 7787);
    Material YELLOW_CANDLE_CAKE = getMaterial("yellow_candle_cake", 17157);
    Material LIME_CANDLE_CAKE = getMaterial("lime_candle_cake", 14309);
    Material PINK_CANDLE_CAKE = getMaterial("pink_candle_cake", 20405);
    Material GRAY_CANDLE_CAKE = getMaterial("gray_candle_cake", 6777);
    Material LIGHT_GRAY_CANDLE_CAKE = getMaterial("light_gray_candle_cake", 11318);
    Material CYAN_CANDLE_CAKE = getMaterial("cyan_candle_cake", 21202);
    Material PURPLE_CANDLE_CAKE = getMaterial("purple_candle_cake", 22663);
    Material BLUE_CANDLE_CAKE = getMaterial("blue_candle_cake", 26425);
    Material BROWN_CANDLE_CAKE = getMaterial("brown_candle_cake", 26024);
    Material GREEN_CANDLE_CAKE = getMaterial("green_candle_cake", 16334);
    Material RED_CANDLE_CAKE = getMaterial("red_candle_cake", 24151);
    Material BLACK_CANDLE_CAKE = getMaterial("black_candle_cake", 15191);
    Material POWDER_SNOW = getMaterial("powder_snow", 24077);
    Material CAVE_VINES = getMaterial("cave_vines", 7339);
    Material CAVE_VINES_PLANT = getMaterial("cave_vines_plant", 30645);
    Material BIG_DRIPLEAF_STEM = getMaterial("big_dripleaf_stem", 13167);
    Material POTTED_AZALEA_BUSH = getMaterial("potted_azalea_bush", 20430);
    Material POTTED_FLOWERING_AZALEA_BUSH = getMaterial("potted_flowering_azalea_bush", 10609);
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

    @Deprecated
    static Material getMaterial(@NotNull String key, int id) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        Material material = Registry.MATERIAL.get(namespacedKey);
        Preconditions.checkNotNull(material, "No Material found for %s. This is a bug.", namespacedKey);
        return material;
    }

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
     */
    @Deprecated // only for Items
    int getMaxStackSize();

    /**
     * Gets the maximum durability of this material
     *
     * @return Maximum durability for this material
     */
    @Deprecated // only for Items
    short getMaxDurability();

    /**
     * Creates a new {@link BlockData} instance for this Material, with all
     * properties initialized to unspecified defaults.
     *
     * @return new data instance
     */
    @NotNull
    @Deprecated // only for Blocks
    BlockData createBlockData();

    /**
     * Creates a new {@link BlockData} instance for this Material, with
     * all properties initialized to unspecified defaults.
     *
     * @param consumer consumer to run on new instance before returning
     * @return new data instance
     */
    @NotNull
    @Deprecated // only for Blocks
    BlockData createBlockData(@Nullable Consumer<BlockData> consumer);

    /**
     * Creates a new {@link BlockData} instance for this Material, with all
     * properties initialized to unspecified defaults, except for those provided
     * in data.
     *
     * @param data data string
     * @return new data instance
     * @throws IllegalArgumentException if the specified data is not valid
     */
    @NotNull
    @Deprecated // only for Blocks
    BlockData createBlockData(@Nullable String data);

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

    @NotNull // TODO
    BlockType<?> asBlockType();

    /**
     * Checks if this Material is edible.
     *
     * @return true if this Material is edible.
     */
    @Deprecated // only for items
    boolean isEdible();

    /**
     * @return True if this material represents a playable music disk.
     */
    @Deprecated // only for items
    boolean isRecord();

    /**
     * Check if the material is a block and solid (can be built upon)
     *
     * @return True if this material is a block and solid
     */
    @Deprecated // only for blocks
    boolean isSolid();

    /**
     * Check if the material is an air block.
     *
     * @return True if this material is an air block.
     */ // TODO CHECK
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
     */
    @Deprecated // only for blocks
    boolean isFlammable();

    /**
     * Check if the material is a block and can burn away
     *
     * @return True if this material is a block and can burn away
     */
    @Deprecated // only for blocks
    boolean isBurnable();

    /**
     * Checks if this Material can be used as fuel in a Furnace
     *
     * @return true if this Material can be used as fuel.
     */
    @Deprecated // only for items
    boolean isFuel();

    /**
     * Check if the material is a block and completely blocks vision
     *
     * @return True if this material is a block and completely blocks vision
     */
    @Deprecated // only for blocks
    boolean isOccluding();

    /**
     * @return True if this material is affected by gravity.
     */
    @Deprecated // only for blocks
    boolean hasGravity();

    /**
     * Checks if this Material is an obtainable item.
     *
     * @return true if this material is an item
     */
    boolean isItem();

    @Contract("-> this") // TODO
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
     */
    boolean isInteractable();

    /**
     * Obtains the block's hardness level (also known as "strength").
     * <br>
     * This number is used to calculate the time required to break each block.
     * <br>
     * Only available when {@link #isBlock()} is true.
     *
     * @return the hardness of that material.
     */
    @Deprecated // only for blocks
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
     */
    @Deprecated // only for blocks
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
     */
    @Deprecated // only for blocks
    float getSlipperiness();

    /**
     * Determines the remaining item in a crafting grid after crafting with this
     * ingredient.
     * <br>
     * Only available when {@link #isItem()} is true.
     *
     * @return the item left behind when crafting, or null if nothing is.
     */
    @Nullable
    @Deprecated // only for items
    Material getCraftingRemainingItem();

    /**
     * Get the best suitable slot for this Material.
     *
     * For most items this will be {@link EquipmentSlot#HAND}.
     *
     * @return the best EquipmentSlot for this Material
     */
    @NotNull
    @Deprecated // only for items
    EquipmentSlot getEquipmentSlot();

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
}
