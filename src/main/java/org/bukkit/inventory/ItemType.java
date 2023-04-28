package org.bukkit.inventory;

import com.google.common.collect.Multimap;
import org.bukkit.Material;
import org.bukkit.MinecraftExperimental;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ItemType extends Material {
    //<editor-fold desc="ItemTypes" defaultstate="collapsed">
    ItemType AIR = asItemType(Material.AIR);
    ItemType STONE = asItemType(Material.STONE);
    ItemType GRANITE = asItemType(Material.GRANITE);
    ItemType POLISHED_GRANITE = asItemType(Material.POLISHED_GRANITE);
    ItemType DIORITE = asItemType(Material.DIORITE);
    ItemType POLISHED_DIORITE = asItemType(Material.POLISHED_DIORITE);
    ItemType ANDESITE = asItemType(Material.ANDESITE);
    ItemType POLISHED_ANDESITE = asItemType(Material.POLISHED_ANDESITE);
    ItemType DEEPSLATE = asItemType(Material.DEEPSLATE);
    ItemType COBBLED_DEEPSLATE = asItemType(Material.COBBLED_DEEPSLATE);
    ItemType POLISHED_DEEPSLATE = asItemType(Material.POLISHED_DEEPSLATE);
    ItemType CALCITE = asItemType(Material.CALCITE);
    ItemType TUFF = asItemType(Material.TUFF);
    ItemType DRIPSTONE_BLOCK = asItemType(Material.DRIPSTONE_BLOCK);
    ItemType GRASS_BLOCK = asItemType(Material.GRASS_BLOCK);
    ItemType DIRT = asItemType(Material.DIRT);
    ItemType COARSE_DIRT = asItemType(Material.COARSE_DIRT);
    ItemType PODZOL = asItemType(Material.PODZOL);
    ItemType ROOTED_DIRT = asItemType(Material.ROOTED_DIRT);
    ItemType MUD = asItemType(Material.MUD);
    ItemType CRIMSON_NYLIUM = asItemType(Material.CRIMSON_NYLIUM);
    ItemType WARPED_NYLIUM = asItemType(Material.WARPED_NYLIUM);
    ItemType COBBLESTONE = asItemType(Material.COBBLESTONE);
    ItemType OAK_PLANKS = asItemType(Material.OAK_PLANKS);
    ItemType SPRUCE_PLANKS = asItemType(Material.SPRUCE_PLANKS);
    ItemType BIRCH_PLANKS = asItemType(Material.BIRCH_PLANKS);
    ItemType JUNGLE_PLANKS = asItemType(Material.JUNGLE_PLANKS);
    ItemType ACACIA_PLANKS = asItemType(Material.ACACIA_PLANKS);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_PLANKS = asItemType(Material.CHERRY_PLANKS);
    ItemType DARK_OAK_PLANKS = asItemType(Material.DARK_OAK_PLANKS);
    ItemType MANGROVE_PLANKS = asItemType(Material.MANGROVE_PLANKS);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_PLANKS = asItemType(Material.BAMBOO_PLANKS);
    ItemType CRIMSON_PLANKS = asItemType(Material.CRIMSON_PLANKS);
    ItemType WARPED_PLANKS = asItemType(Material.WARPED_PLANKS);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_MOSAIC = asItemType(Material.BAMBOO_MOSAIC);
    ItemType OAK_SAPLING = asItemType(Material.OAK_SAPLING);
    ItemType SPRUCE_SAPLING = asItemType(Material.SPRUCE_SAPLING);
    ItemType BIRCH_SAPLING = asItemType(Material.BIRCH_SAPLING);
    ItemType JUNGLE_SAPLING = asItemType(Material.JUNGLE_SAPLING);
    ItemType ACACIA_SAPLING = asItemType(Material.ACACIA_SAPLING);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_SAPLING = asItemType(Material.CHERRY_SAPLING);
    ItemType DARK_OAK_SAPLING = asItemType(Material.DARK_OAK_SAPLING);
    ItemType MANGROVE_PROPAGULE = asItemType(Material.MANGROVE_PROPAGULE);
    ItemType BEDROCK = asItemType(Material.BEDROCK);
    ItemType SAND = asItemType(Material.SAND);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SUSPICIOUS_SAND = asItemType(Material.SUSPICIOUS_SAND);
    ItemType RED_SAND = asItemType(Material.RED_SAND);
    ItemType GRAVEL = asItemType(Material.GRAVEL);
    ItemType COAL_ORE = asItemType(Material.COAL_ORE);
    ItemType DEEPSLATE_COAL_ORE = asItemType(Material.DEEPSLATE_COAL_ORE);
    ItemType IRON_ORE = asItemType(Material.IRON_ORE);
    ItemType DEEPSLATE_IRON_ORE = asItemType(Material.DEEPSLATE_IRON_ORE);
    ItemType COPPER_ORE = asItemType(Material.COPPER_ORE);
    ItemType DEEPSLATE_COPPER_ORE = asItemType(Material.DEEPSLATE_COPPER_ORE);
    ItemType GOLD_ORE = asItemType(Material.GOLD_ORE);
    ItemType DEEPSLATE_GOLD_ORE = asItemType(Material.DEEPSLATE_GOLD_ORE);
    ItemType REDSTONE_ORE = asItemType(Material.REDSTONE_ORE);
    ItemType DEEPSLATE_REDSTONE_ORE = asItemType(Material.DEEPSLATE_REDSTONE_ORE);
    ItemType EMERALD_ORE = asItemType(Material.EMERALD_ORE);
    ItemType DEEPSLATE_EMERALD_ORE = asItemType(Material.DEEPSLATE_EMERALD_ORE);
    ItemType LAPIS_ORE = asItemType(Material.LAPIS_ORE);
    ItemType DEEPSLATE_LAPIS_ORE = asItemType(Material.DEEPSLATE_LAPIS_ORE);
    ItemType DIAMOND_ORE = asItemType(Material.DIAMOND_ORE);
    ItemType DEEPSLATE_DIAMOND_ORE = asItemType(Material.DEEPSLATE_DIAMOND_ORE);
    ItemType NETHER_GOLD_ORE = asItemType(Material.NETHER_GOLD_ORE);
    ItemType NETHER_QUARTZ_ORE = asItemType(Material.NETHER_QUARTZ_ORE);
    ItemType ANCIENT_DEBRIS = asItemType(Material.ANCIENT_DEBRIS);
    ItemType COAL_BLOCK = asItemType(Material.COAL_BLOCK);
    ItemType RAW_IRON_BLOCK = asItemType(Material.RAW_IRON_BLOCK);
    ItemType RAW_COPPER_BLOCK = asItemType(Material.RAW_COPPER_BLOCK);
    ItemType RAW_GOLD_BLOCK = asItemType(Material.RAW_GOLD_BLOCK);
    ItemType AMETHYST_BLOCK = asItemType(Material.AMETHYST_BLOCK);
    ItemType BUDDING_AMETHYST = asItemType(Material.BUDDING_AMETHYST);
    ItemType IRON_BLOCK = asItemType(Material.IRON_BLOCK);
    ItemType COPPER_BLOCK = asItemType(Material.COPPER_BLOCK);
    ItemType GOLD_BLOCK = asItemType(Material.GOLD_BLOCK);
    ItemType DIAMOND_BLOCK = asItemType(Material.DIAMOND_BLOCK);
    ItemType NETHERITE_BLOCK = asItemType(Material.NETHERITE_BLOCK);
    ItemType EXPOSED_COPPER = asItemType(Material.EXPOSED_COPPER);
    ItemType WEATHERED_COPPER = asItemType(Material.WEATHERED_COPPER);
    ItemType OXIDIZED_COPPER = asItemType(Material.OXIDIZED_COPPER);
    ItemType CUT_COPPER = asItemType(Material.CUT_COPPER);
    ItemType EXPOSED_CUT_COPPER = asItemType(Material.EXPOSED_CUT_COPPER);
    ItemType WEATHERED_CUT_COPPER = asItemType(Material.WEATHERED_CUT_COPPER);
    ItemType OXIDIZED_CUT_COPPER = asItemType(Material.OXIDIZED_CUT_COPPER);
    ItemType CUT_COPPER_STAIRS = asItemType(Material.CUT_COPPER_STAIRS);
    ItemType EXPOSED_CUT_COPPER_STAIRS = asItemType(Material.EXPOSED_CUT_COPPER_STAIRS);
    ItemType WEATHERED_CUT_COPPER_STAIRS = asItemType(Material.WEATHERED_CUT_COPPER_STAIRS);
    ItemType OXIDIZED_CUT_COPPER_STAIRS = asItemType(Material.OXIDIZED_CUT_COPPER_STAIRS);
    ItemType CUT_COPPER_SLAB = asItemType(Material.CUT_COPPER_SLAB);
    ItemType EXPOSED_CUT_COPPER_SLAB = asItemType(Material.EXPOSED_CUT_COPPER_SLAB);
    ItemType WEATHERED_CUT_COPPER_SLAB = asItemType(Material.WEATHERED_CUT_COPPER_SLAB);
    ItemType OXIDIZED_CUT_COPPER_SLAB = asItemType(Material.OXIDIZED_CUT_COPPER_SLAB);
    ItemType WAXED_COPPER_BLOCK = asItemType(Material.WAXED_COPPER_BLOCK);
    ItemType WAXED_EXPOSED_COPPER = asItemType(Material.WAXED_EXPOSED_COPPER);
    ItemType WAXED_WEATHERED_COPPER = asItemType(Material.WAXED_WEATHERED_COPPER);
    ItemType WAXED_OXIDIZED_COPPER = asItemType(Material.WAXED_OXIDIZED_COPPER);
    ItemType WAXED_CUT_COPPER = asItemType(Material.WAXED_CUT_COPPER);
    ItemType WAXED_EXPOSED_CUT_COPPER = asItemType(Material.WAXED_EXPOSED_CUT_COPPER);
    ItemType WAXED_WEATHERED_CUT_COPPER = asItemType(Material.WAXED_WEATHERED_CUT_COPPER);
    ItemType WAXED_OXIDIZED_CUT_COPPER = asItemType(Material.WAXED_OXIDIZED_CUT_COPPER);
    ItemType WAXED_CUT_COPPER_STAIRS = asItemType(Material.WAXED_CUT_COPPER_STAIRS);
    ItemType WAXED_EXPOSED_CUT_COPPER_STAIRS = asItemType(Material.WAXED_EXPOSED_CUT_COPPER_STAIRS);
    ItemType WAXED_WEATHERED_CUT_COPPER_STAIRS = asItemType(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS);
    ItemType WAXED_OXIDIZED_CUT_COPPER_STAIRS = asItemType(Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS);
    ItemType WAXED_CUT_COPPER_SLAB = asItemType(Material.WAXED_CUT_COPPER_SLAB);
    ItemType WAXED_EXPOSED_CUT_COPPER_SLAB = asItemType(Material.WAXED_EXPOSED_CUT_COPPER_SLAB);
    ItemType WAXED_WEATHERED_CUT_COPPER_SLAB = asItemType(Material.WAXED_WEATHERED_CUT_COPPER_SLAB);
    ItemType WAXED_OXIDIZED_CUT_COPPER_SLAB = asItemType(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB);
    ItemType OAK_LOG = asItemType(Material.OAK_LOG);
    ItemType SPRUCE_LOG = asItemType(Material.SPRUCE_LOG);
    ItemType BIRCH_LOG = asItemType(Material.BIRCH_LOG);
    ItemType JUNGLE_LOG = asItemType(Material.JUNGLE_LOG);
    ItemType ACACIA_LOG = asItemType(Material.ACACIA_LOG);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_LOG = asItemType(Material.CHERRY_LOG);
    ItemType DARK_OAK_LOG = asItemType(Material.DARK_OAK_LOG);
    ItemType MANGROVE_LOG = asItemType(Material.MANGROVE_LOG);
    ItemType MANGROVE_ROOTS = asItemType(Material.MANGROVE_ROOTS);
    ItemType MUDDY_MANGROVE_ROOTS = asItemType(Material.MUDDY_MANGROVE_ROOTS);
    ItemType CRIMSON_STEM = asItemType(Material.CRIMSON_STEM);
    ItemType WARPED_STEM = asItemType(Material.WARPED_STEM);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_BLOCK = asItemType(Material.BAMBOO_BLOCK);
    ItemType STRIPPED_OAK_LOG = asItemType(Material.STRIPPED_OAK_LOG);
    ItemType STRIPPED_SPRUCE_LOG = asItemType(Material.STRIPPED_SPRUCE_LOG);
    ItemType STRIPPED_BIRCH_LOG = asItemType(Material.STRIPPED_BIRCH_LOG);
    ItemType STRIPPED_JUNGLE_LOG = asItemType(Material.STRIPPED_JUNGLE_LOG);
    ItemType STRIPPED_ACACIA_LOG = asItemType(Material.STRIPPED_ACACIA_LOG);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType STRIPPED_CHERRY_LOG = asItemType(Material.STRIPPED_CHERRY_LOG);
    ItemType STRIPPED_DARK_OAK_LOG = asItemType(Material.STRIPPED_DARK_OAK_LOG);
    ItemType STRIPPED_MANGROVE_LOG = asItemType(Material.STRIPPED_MANGROVE_LOG);
    ItemType STRIPPED_CRIMSON_STEM = asItemType(Material.STRIPPED_CRIMSON_STEM);
    ItemType STRIPPED_WARPED_STEM = asItemType(Material.STRIPPED_WARPED_STEM);
    ItemType STRIPPED_OAK_WOOD = asItemType(Material.STRIPPED_OAK_WOOD);
    ItemType STRIPPED_SPRUCE_WOOD = asItemType(Material.STRIPPED_SPRUCE_WOOD);
    ItemType STRIPPED_BIRCH_WOOD = asItemType(Material.STRIPPED_BIRCH_WOOD);
    ItemType STRIPPED_JUNGLE_WOOD = asItemType(Material.STRIPPED_JUNGLE_WOOD);
    ItemType STRIPPED_ACACIA_WOOD = asItemType(Material.STRIPPED_ACACIA_WOOD);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType STRIPPED_CHERRY_WOOD = asItemType(Material.STRIPPED_CHERRY_WOOD);
    ItemType STRIPPED_DARK_OAK_WOOD = asItemType(Material.STRIPPED_DARK_OAK_WOOD);
    ItemType STRIPPED_MANGROVE_WOOD = asItemType(Material.STRIPPED_MANGROVE_WOOD);
    ItemType STRIPPED_CRIMSON_HYPHAE = asItemType(Material.STRIPPED_CRIMSON_HYPHAE);
    ItemType STRIPPED_WARPED_HYPHAE = asItemType(Material.STRIPPED_WARPED_HYPHAE);
    ItemType STRIPPED_BAMBOO_BLOCK = asItemType(Material.STRIPPED_BAMBOO_BLOCK);
    ItemType OAK_WOOD = asItemType(Material.OAK_WOOD);
    ItemType SPRUCE_WOOD = asItemType(Material.SPRUCE_WOOD);
    ItemType BIRCH_WOOD = asItemType(Material.BIRCH_WOOD);
    ItemType JUNGLE_WOOD = asItemType(Material.JUNGLE_WOOD);
    ItemType ACACIA_WOOD = asItemType(Material.ACACIA_WOOD);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_WOOD = asItemType(Material.CHERRY_WOOD);
    ItemType DARK_OAK_WOOD = asItemType(Material.DARK_OAK_WOOD);
    ItemType MANGROVE_WOOD = asItemType(Material.MANGROVE_WOOD);
    ItemType CRIMSON_HYPHAE = asItemType(Material.CRIMSON_HYPHAE);
    ItemType WARPED_HYPHAE = asItemType(Material.WARPED_HYPHAE);
    ItemType OAK_LEAVES = asItemType(Material.OAK_LEAVES);
    ItemType SPRUCE_LEAVES = asItemType(Material.SPRUCE_LEAVES);
    ItemType BIRCH_LEAVES = asItemType(Material.BIRCH_LEAVES);
    ItemType JUNGLE_LEAVES = asItemType(Material.JUNGLE_LEAVES);
    ItemType ACACIA_LEAVES = asItemType(Material.ACACIA_LEAVES);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_LEAVES = asItemType(Material.CHERRY_LEAVES);
    ItemType DARK_OAK_LEAVES = asItemType(Material.DARK_OAK_LEAVES);
    ItemType MANGROVE_LEAVES = asItemType(Material.MANGROVE_LEAVES);
    ItemType AZALEA_LEAVES = asItemType(Material.AZALEA_LEAVES);
    ItemType FLOWERING_AZALEA_LEAVES = asItemType(Material.FLOWERING_AZALEA_LEAVES);
    ItemType SPONGE = asItemType(Material.SPONGE);
    ItemType WET_SPONGE = asItemType(Material.WET_SPONGE);
    ItemType GLASS = asItemType(Material.GLASS);
    ItemType TINTED_GLASS = asItemType(Material.TINTED_GLASS);
    ItemType LAPIS_BLOCK = asItemType(Material.LAPIS_BLOCK);
    ItemType SANDSTONE = asItemType(Material.SANDSTONE);
    ItemType CHISELED_SANDSTONE = asItemType(Material.CHISELED_SANDSTONE);
    ItemType CUT_SANDSTONE = asItemType(Material.CUT_SANDSTONE);
    ItemType COBWEB = asItemType(Material.COBWEB);
    ItemType GRASS = asItemType(Material.GRASS);
    ItemType FERN = asItemType(Material.FERN);
    ItemType AZALEA = asItemType(Material.AZALEA);
    ItemType FLOWERING_AZALEA = asItemType(Material.FLOWERING_AZALEA);
    ItemType DEAD_BUSH = asItemType(Material.DEAD_BUSH);
    ItemType SEAGRASS = asItemType(Material.SEAGRASS);
    ItemType SEA_PICKLE = asItemType(Material.SEA_PICKLE);
    ItemType WHITE_WOOL = asItemType(Material.WHITE_WOOL);
    ItemType ORANGE_WOOL = asItemType(Material.ORANGE_WOOL);
    ItemType MAGENTA_WOOL = asItemType(Material.MAGENTA_WOOL);
    ItemType LIGHT_BLUE_WOOL = asItemType(Material.LIGHT_BLUE_WOOL);
    ItemType YELLOW_WOOL = asItemType(Material.YELLOW_WOOL);
    ItemType LIME_WOOL = asItemType(Material.LIME_WOOL);
    ItemType PINK_WOOL = asItemType(Material.PINK_WOOL);
    ItemType GRAY_WOOL = asItemType(Material.GRAY_WOOL);
    ItemType LIGHT_GRAY_WOOL = asItemType(Material.LIGHT_GRAY_WOOL);
    ItemType CYAN_WOOL = asItemType(Material.CYAN_WOOL);
    ItemType PURPLE_WOOL = asItemType(Material.PURPLE_WOOL);
    ItemType BLUE_WOOL = asItemType(Material.BLUE_WOOL);
    ItemType BROWN_WOOL = asItemType(Material.BROWN_WOOL);
    ItemType GREEN_WOOL = asItemType(Material.GREEN_WOOL);
    ItemType RED_WOOL = asItemType(Material.RED_WOOL);
    ItemType BLACK_WOOL = asItemType(Material.BLACK_WOOL);
    ItemType DANDELION = asItemType(Material.DANDELION);
    ItemType POPPY = asItemType(Material.POPPY);
    ItemType BLUE_ORCHID = asItemType(Material.BLUE_ORCHID);
    ItemType ALLIUM = asItemType(Material.ALLIUM);
    ItemType AZURE_BLUET = asItemType(Material.AZURE_BLUET);
    ItemType RED_TULIP = asItemType(Material.RED_TULIP);
    ItemType ORANGE_TULIP = asItemType(Material.ORANGE_TULIP);
    ItemType WHITE_TULIP = asItemType(Material.WHITE_TULIP);
    ItemType PINK_TULIP = asItemType(Material.PINK_TULIP);
    ItemType OXEYE_DAISY = asItemType(Material.OXEYE_DAISY);
    ItemType CORNFLOWER = asItemType(Material.CORNFLOWER);
    ItemType LILY_OF_THE_VALLEY = asItemType(Material.LILY_OF_THE_VALLEY);
    ItemType WITHER_ROSE = asItemType(Material.WITHER_ROSE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType TORCHFLOWER = asItemType(Material.TORCHFLOWER);
    ItemType SPORE_BLOSSOM = asItemType(Material.SPORE_BLOSSOM);
    ItemType BROWN_MUSHROOM = asItemType(Material.BROWN_MUSHROOM);
    ItemType RED_MUSHROOM = asItemType(Material.RED_MUSHROOM);
    ItemType CRIMSON_FUNGUS = asItemType(Material.CRIMSON_FUNGUS);
    ItemType WARPED_FUNGUS = asItemType(Material.WARPED_FUNGUS);
    ItemType CRIMSON_ROOTS = asItemType(Material.CRIMSON_ROOTS);
    ItemType WARPED_ROOTS = asItemType(Material.WARPED_ROOTS);
    ItemType NETHER_SPROUTS = asItemType(Material.NETHER_SPROUTS);
    ItemType WEEPING_VINES = asItemType(Material.WEEPING_VINES);
    ItemType TWISTING_VINES = asItemType(Material.TWISTING_VINES);
    ItemType SUGAR_CANE = asItemType(Material.SUGAR_CANE);
    ItemType KELP = asItemType(Material.KELP);
    ItemType MOSS_CARPET = asItemType(Material.MOSS_CARPET);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType PINK_PETALS = asItemType(Material.PINK_PETALS);
    ItemType MOSS_BLOCK = asItemType(Material.MOSS_BLOCK);
    ItemType HANGING_ROOTS = asItemType(Material.HANGING_ROOTS);
    ItemType BIG_DRIPLEAF = asItemType(Material.BIG_DRIPLEAF);
    ItemType SMALL_DRIPLEAF = asItemType(Material.SMALL_DRIPLEAF);
    ItemType BAMBOO = asItemType(Material.BAMBOO);
    ItemType OAK_SLAB = asItemType(Material.OAK_SLAB);
    ItemType SPRUCE_SLAB = asItemType(Material.SPRUCE_SLAB);
    ItemType BIRCH_SLAB = asItemType(Material.BIRCH_SLAB);
    ItemType JUNGLE_SLAB = asItemType(Material.JUNGLE_SLAB);
    ItemType ACACIA_SLAB = asItemType(Material.ACACIA_SLAB);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_SLAB = asItemType(Material.CHERRY_SLAB);
    ItemType DARK_OAK_SLAB = asItemType(Material.DARK_OAK_SLAB);
    ItemType MANGROVE_SLAB = asItemType(Material.MANGROVE_SLAB);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_SLAB = asItemType(Material.BAMBOO_SLAB);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_MOSAIC_SLAB = asItemType(Material.BAMBOO_MOSAIC_SLAB);
    ItemType CRIMSON_SLAB = asItemType(Material.CRIMSON_SLAB);
    ItemType WARPED_SLAB = asItemType(Material.WARPED_SLAB);
    ItemType STONE_SLAB = asItemType(Material.STONE_SLAB);
    ItemType SMOOTH_STONE_SLAB = asItemType(Material.SMOOTH_STONE_SLAB);
    ItemType SANDSTONE_SLAB = asItemType(Material.SANDSTONE_SLAB);
    ItemType CUT_SANDSTONE_SLAB = asItemType(Material.CUT_SANDSTONE_SLAB);
    ItemType PETRIFIED_OAK_SLAB = asItemType(Material.PETRIFIED_OAK_SLAB);
    ItemType COBBLESTONE_SLAB = asItemType(Material.COBBLESTONE_SLAB);
    ItemType BRICK_SLAB = asItemType(Material.BRICK_SLAB);
    ItemType STONE_BRICK_SLAB = asItemType(Material.STONE_BRICK_SLAB);
    ItemType MUD_BRICK_SLAB = asItemType(Material.MUD_BRICK_SLAB);
    ItemType NETHER_BRICK_SLAB = asItemType(Material.NETHER_BRICK_SLAB);
    ItemType QUARTZ_SLAB = asItemType(Material.QUARTZ_SLAB);
    ItemType RED_SANDSTONE_SLAB = asItemType(Material.RED_SANDSTONE_SLAB);
    ItemType CUT_RED_SANDSTONE_SLAB = asItemType(Material.CUT_RED_SANDSTONE_SLAB);
    ItemType PURPUR_SLAB = asItemType(Material.PURPUR_SLAB);
    ItemType PRISMARINE_SLAB = asItemType(Material.PRISMARINE_SLAB);
    ItemType PRISMARINE_BRICK_SLAB = asItemType(Material.PRISMARINE_BRICK_SLAB);
    ItemType DARK_PRISMARINE_SLAB = asItemType(Material.DARK_PRISMARINE_SLAB);
    ItemType SMOOTH_QUARTZ = asItemType(Material.SMOOTH_QUARTZ);
    ItemType SMOOTH_RED_SANDSTONE = asItemType(Material.SMOOTH_RED_SANDSTONE);
    ItemType SMOOTH_SANDSTONE = asItemType(Material.SMOOTH_SANDSTONE);
    ItemType SMOOTH_STONE = asItemType(Material.SMOOTH_STONE);
    ItemType BRICKS = asItemType(Material.BRICKS);
    ItemType BOOKSHELF = asItemType(Material.BOOKSHELF);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHISELED_BOOKSHELF = asItemType(Material.CHISELED_BOOKSHELF);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType DECORATED_POT = asItemType(Material.DECORATED_POT);
    ItemType MOSSY_COBBLESTONE = asItemType(Material.MOSSY_COBBLESTONE);
    ItemType OBSIDIAN = asItemType(Material.OBSIDIAN);
    ItemType TORCH = asItemType(Material.TORCH);
    ItemType END_ROD = asItemType(Material.END_ROD);
    ItemType CHORUS_PLANT = asItemType(Material.CHORUS_PLANT);
    ItemType CHORUS_FLOWER = asItemType(Material.CHORUS_FLOWER);
    ItemType PURPUR_BLOCK = asItemType(Material.PURPUR_BLOCK);
    ItemType PURPUR_PILLAR = asItemType(Material.PURPUR_PILLAR);
    ItemType PURPUR_STAIRS = asItemType(Material.PURPUR_STAIRS);
    ItemType SPAWNER = asItemType(Material.SPAWNER);
    ItemType CHEST = asItemType(Material.CHEST);
    ItemType CRAFTING_TABLE = asItemType(Material.CRAFTING_TABLE);
    ItemType FARMLAND = asItemType(Material.FARMLAND);
    ItemType FURNACE = asItemType(Material.FURNACE);
    ItemType LADDER = asItemType(Material.LADDER);
    ItemType COBBLESTONE_STAIRS = asItemType(Material.COBBLESTONE_STAIRS);
    ItemType SNOW = asItemType(Material.SNOW);
    ItemType ICE = asItemType(Material.ICE);
    ItemType SNOW_BLOCK = asItemType(Material.SNOW_BLOCK);
    ItemType CACTUS = asItemType(Material.CACTUS);
    ItemType CLAY = asItemType(Material.CLAY);
    ItemType JUKEBOX = asItemType(Material.JUKEBOX);
    ItemType OAK_FENCE = asItemType(Material.OAK_FENCE);
    ItemType SPRUCE_FENCE = asItemType(Material.SPRUCE_FENCE);
    ItemType BIRCH_FENCE = asItemType(Material.BIRCH_FENCE);
    ItemType JUNGLE_FENCE = asItemType(Material.JUNGLE_FENCE);
    ItemType ACACIA_FENCE = asItemType(Material.ACACIA_FENCE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_FENCE = asItemType(Material.CHERRY_FENCE);
    ItemType DARK_OAK_FENCE = asItemType(Material.DARK_OAK_FENCE);
    ItemType MANGROVE_FENCE = asItemType(Material.MANGROVE_FENCE);
    ItemType BAMBOO_FENCE = asItemType(Material.BAMBOO_FENCE);
    ItemType CRIMSON_FENCE = asItemType(Material.CRIMSON_FENCE);
    ItemType WARPED_FENCE = asItemType(Material.WARPED_FENCE);
    ItemType PUMPKIN = asItemType(Material.PUMPKIN);
    ItemType CARVED_PUMPKIN = asItemType(Material.CARVED_PUMPKIN);
    ItemType JACK_O_LANTERN = asItemType(Material.JACK_O_LANTERN);
    ItemType NETHERRACK = asItemType(Material.NETHERRACK);
    ItemType SOUL_SAND = asItemType(Material.SOUL_SAND);
    ItemType SOUL_SOIL = asItemType(Material.SOUL_SOIL);
    ItemType BASALT = asItemType(Material.BASALT);
    ItemType POLISHED_BASALT = asItemType(Material.POLISHED_BASALT);
    ItemType SMOOTH_BASALT = asItemType(Material.SMOOTH_BASALT);
    ItemType SOUL_TORCH = asItemType(Material.SOUL_TORCH);
    ItemType GLOWSTONE = asItemType(Material.GLOWSTONE);
    ItemType INFESTED_STONE = asItemType(Material.INFESTED_STONE);
    ItemType INFESTED_COBBLESTONE = asItemType(Material.INFESTED_COBBLESTONE);
    ItemType INFESTED_STONE_BRICKS = asItemType(Material.INFESTED_STONE_BRICKS);
    ItemType INFESTED_MOSSY_STONE_BRICKS = asItemType(Material.INFESTED_MOSSY_STONE_BRICKS);
    ItemType INFESTED_CRACKED_STONE_BRICKS = asItemType(Material.INFESTED_CRACKED_STONE_BRICKS);
    ItemType INFESTED_CHISELED_STONE_BRICKS = asItemType(Material.INFESTED_CHISELED_STONE_BRICKS);
    ItemType INFESTED_DEEPSLATE = asItemType(Material.INFESTED_DEEPSLATE);
    ItemType STONE_BRICKS = asItemType(Material.STONE_BRICKS);
    ItemType MOSSY_STONE_BRICKS = asItemType(Material.MOSSY_STONE_BRICKS);
    ItemType CRACKED_STONE_BRICKS = asItemType(Material.CRACKED_STONE_BRICKS);
    ItemType CHISELED_STONE_BRICKS = asItemType(Material.CHISELED_STONE_BRICKS);
    ItemType PACKED_MUD = asItemType(Material.PACKED_MUD);
    ItemType MUD_BRICKS = asItemType(Material.MUD_BRICKS);
    ItemType DEEPSLATE_BRICKS = asItemType(Material.DEEPSLATE_BRICKS);
    ItemType CRACKED_DEEPSLATE_BRICKS = asItemType(Material.CRACKED_DEEPSLATE_BRICKS);
    ItemType DEEPSLATE_TILES = asItemType(Material.DEEPSLATE_TILES);
    ItemType CRACKED_DEEPSLATE_TILES = asItemType(Material.CRACKED_DEEPSLATE_TILES);
    ItemType CHISELED_DEEPSLATE = asItemType(Material.CHISELED_DEEPSLATE);
    ItemType REINFORCED_DEEPSLATE = asItemType(Material.REINFORCED_DEEPSLATE);
    ItemType BROWN_MUSHROOM_BLOCK = asItemType(Material.BROWN_MUSHROOM_BLOCK);
    ItemType RED_MUSHROOM_BLOCK = asItemType(Material.RED_MUSHROOM_BLOCK);
    ItemType MUSHROOM_STEM = asItemType(Material.MUSHROOM_STEM);
    ItemType IRON_BARS = asItemType(Material.IRON_BARS);
    ItemType CHAIN = asItemType(Material.CHAIN);
    ItemType GLASS_PANE = asItemType(Material.GLASS_PANE);
    ItemType MELON = asItemType(Material.MELON);
    ItemType VINE = asItemType(Material.VINE);
    ItemType GLOW_LICHEN = asItemType(Material.GLOW_LICHEN);
    ItemType BRICK_STAIRS = asItemType(Material.BRICK_STAIRS);
    ItemType STONE_BRICK_STAIRS = asItemType(Material.STONE_BRICK_STAIRS);
    ItemType MUD_BRICK_STAIRS = asItemType(Material.MUD_BRICK_STAIRS);
    ItemType MYCELIUM = asItemType(Material.MYCELIUM);
    ItemType LILY_PAD = asItemType(Material.LILY_PAD);
    ItemType NETHER_BRICKS = asItemType(Material.NETHER_BRICKS);
    ItemType CRACKED_NETHER_BRICKS = asItemType(Material.CRACKED_NETHER_BRICKS);
    ItemType CHISELED_NETHER_BRICKS = asItemType(Material.CHISELED_NETHER_BRICKS);
    ItemType NETHER_BRICK_FENCE = asItemType(Material.NETHER_BRICK_FENCE);
    ItemType NETHER_BRICK_STAIRS = asItemType(Material.NETHER_BRICK_STAIRS);
    ItemType SCULK = asItemType(Material.SCULK);
    ItemType SCULK_VEIN = asItemType(Material.SCULK_VEIN);
    ItemType SCULK_CATALYST = asItemType(Material.SCULK_CATALYST);
    ItemType SCULK_SHRIEKER = asItemType(Material.SCULK_SHRIEKER);
    ItemType ENCHANTING_TABLE = asItemType(Material.ENCHANTING_TABLE);
    ItemType END_PORTAL_FRAME = asItemType(Material.END_PORTAL_FRAME);
    ItemType END_STONE = asItemType(Material.END_STONE);
    ItemType END_STONE_BRICKS = asItemType(Material.END_STONE_BRICKS);
    ItemType DRAGON_EGG = asItemType(Material.DRAGON_EGG);
    ItemType SANDSTONE_STAIRS = asItemType(Material.SANDSTONE_STAIRS);
    ItemType ENDER_CHEST = asItemType(Material.ENDER_CHEST);
    ItemType EMERALD_BLOCK = asItemType(Material.EMERALD_BLOCK);
    ItemType OAK_STAIRS = asItemType(Material.OAK_STAIRS);
    ItemType SPRUCE_STAIRS = asItemType(Material.SPRUCE_STAIRS);
    ItemType BIRCH_STAIRS = asItemType(Material.BIRCH_STAIRS);
    ItemType JUNGLE_STAIRS = asItemType(Material.JUNGLE_STAIRS);
    ItemType ACACIA_STAIRS = asItemType(Material.ACACIA_STAIRS);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_STAIRS = asItemType(Material.CHERRY_STAIRS);
    ItemType DARK_OAK_STAIRS = asItemType(Material.DARK_OAK_STAIRS);
    ItemType MANGROVE_STAIRS = asItemType(Material.MANGROVE_STAIRS);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_STAIRS = asItemType(Material.BAMBOO_STAIRS);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_MOSAIC_STAIRS = asItemType(Material.BAMBOO_MOSAIC_STAIRS);
    ItemType CRIMSON_STAIRS = asItemType(Material.CRIMSON_STAIRS);
    ItemType WARPED_STAIRS = asItemType(Material.WARPED_STAIRS);
    ItemType COMMAND_BLOCK = asItemType(Material.COMMAND_BLOCK);
    ItemType BEACON = asItemType(Material.BEACON);
    ItemType COBBLESTONE_WALL = asItemType(Material.COBBLESTONE_WALL);
    ItemType MOSSY_COBBLESTONE_WALL = asItemType(Material.MOSSY_COBBLESTONE_WALL);
    ItemType BRICK_WALL = asItemType(Material.BRICK_WALL);
    ItemType PRISMARINE_WALL = asItemType(Material.PRISMARINE_WALL);
    ItemType RED_SANDSTONE_WALL = asItemType(Material.RED_SANDSTONE_WALL);
    ItemType MOSSY_STONE_BRICK_WALL = asItemType(Material.MOSSY_STONE_BRICK_WALL);
    ItemType GRANITE_WALL = asItemType(Material.GRANITE_WALL);
    ItemType STONE_BRICK_WALL = asItemType(Material.STONE_BRICK_WALL);
    ItemType MUD_BRICK_WALL = asItemType(Material.MUD_BRICK_WALL);
    ItemType NETHER_BRICK_WALL = asItemType(Material.NETHER_BRICK_WALL);
    ItemType ANDESITE_WALL = asItemType(Material.ANDESITE_WALL);
    ItemType RED_NETHER_BRICK_WALL = asItemType(Material.RED_NETHER_BRICK_WALL);
    ItemType SANDSTONE_WALL = asItemType(Material.SANDSTONE_WALL);
    ItemType END_STONE_BRICK_WALL = asItemType(Material.END_STONE_BRICK_WALL);
    ItemType DIORITE_WALL = asItemType(Material.DIORITE_WALL);
    ItemType BLACKSTONE_WALL = asItemType(Material.BLACKSTONE_WALL);
    ItemType POLISHED_BLACKSTONE_WALL = asItemType(Material.POLISHED_BLACKSTONE_WALL);
    ItemType POLISHED_BLACKSTONE_BRICK_WALL = asItemType(Material.POLISHED_BLACKSTONE_BRICK_WALL);
    ItemType COBBLED_DEEPSLATE_WALL = asItemType(Material.COBBLED_DEEPSLATE_WALL);
    ItemType POLISHED_DEEPSLATE_WALL = asItemType(Material.POLISHED_DEEPSLATE_WALL);
    ItemType DEEPSLATE_BRICK_WALL = asItemType(Material.DEEPSLATE_BRICK_WALL);
    ItemType DEEPSLATE_TILE_WALL = asItemType(Material.DEEPSLATE_TILE_WALL);
    ItemType ANVIL = asItemType(Material.ANVIL);
    ItemType CHIPPED_ANVIL = asItemType(Material.CHIPPED_ANVIL);
    ItemType DAMAGED_ANVIL = asItemType(Material.DAMAGED_ANVIL);
    ItemType CHISELED_QUARTZ_BLOCK = asItemType(Material.CHISELED_QUARTZ_BLOCK);
    ItemType QUARTZ_BLOCK = asItemType(Material.QUARTZ_BLOCK);
    ItemType QUARTZ_BRICKS = asItemType(Material.QUARTZ_BRICKS);
    ItemType QUARTZ_PILLAR = asItemType(Material.QUARTZ_PILLAR);
    ItemType QUARTZ_STAIRS = asItemType(Material.QUARTZ_STAIRS);
    ItemType WHITE_TERRACOTTA = asItemType(Material.WHITE_TERRACOTTA);
    ItemType ORANGE_TERRACOTTA = asItemType(Material.ORANGE_TERRACOTTA);
    ItemType MAGENTA_TERRACOTTA = asItemType(Material.MAGENTA_TERRACOTTA);
    ItemType LIGHT_BLUE_TERRACOTTA = asItemType(Material.LIGHT_BLUE_TERRACOTTA);
    ItemType YELLOW_TERRACOTTA = asItemType(Material.YELLOW_TERRACOTTA);
    ItemType LIME_TERRACOTTA = asItemType(Material.LIME_TERRACOTTA);
    ItemType PINK_TERRACOTTA = asItemType(Material.PINK_TERRACOTTA);
    ItemType GRAY_TERRACOTTA = asItemType(Material.GRAY_TERRACOTTA);
    ItemType LIGHT_GRAY_TERRACOTTA = asItemType(Material.LIGHT_GRAY_TERRACOTTA);
    ItemType CYAN_TERRACOTTA = asItemType(Material.CYAN_TERRACOTTA);
    ItemType PURPLE_TERRACOTTA = asItemType(Material.PURPLE_TERRACOTTA);
    ItemType BLUE_TERRACOTTA = asItemType(Material.BLUE_TERRACOTTA);
    ItemType BROWN_TERRACOTTA = asItemType(Material.BROWN_TERRACOTTA);
    ItemType GREEN_TERRACOTTA = asItemType(Material.GREEN_TERRACOTTA);
    ItemType RED_TERRACOTTA = asItemType(Material.RED_TERRACOTTA);
    ItemType BLACK_TERRACOTTA = asItemType(Material.BLACK_TERRACOTTA);
    ItemType BARRIER = asItemType(Material.BARRIER);
    ItemType LIGHT = asItemType(Material.LIGHT);
    ItemType HAY_BLOCK = asItemType(Material.HAY_BLOCK);
    ItemType WHITE_CARPET = asItemType(Material.WHITE_CARPET);
    ItemType ORANGE_CARPET = asItemType(Material.ORANGE_CARPET);
    ItemType MAGENTA_CARPET = asItemType(Material.MAGENTA_CARPET);
    ItemType LIGHT_BLUE_CARPET = asItemType(Material.LIGHT_BLUE_CARPET);
    ItemType YELLOW_CARPET = asItemType(Material.YELLOW_CARPET);
    ItemType LIME_CARPET = asItemType(Material.LIME_CARPET);
    ItemType PINK_CARPET = asItemType(Material.PINK_CARPET);
    ItemType GRAY_CARPET = asItemType(Material.GRAY_CARPET);
    ItemType LIGHT_GRAY_CARPET = asItemType(Material.LIGHT_GRAY_CARPET);
    ItemType CYAN_CARPET = asItemType(Material.CYAN_CARPET);
    ItemType PURPLE_CARPET = asItemType(Material.PURPLE_CARPET);
    ItemType BLUE_CARPET = asItemType(Material.BLUE_CARPET);
    ItemType BROWN_CARPET = asItemType(Material.BROWN_CARPET);
    ItemType GREEN_CARPET = asItemType(Material.GREEN_CARPET);
    ItemType RED_CARPET = asItemType(Material.RED_CARPET);
    ItemType BLACK_CARPET = asItemType(Material.BLACK_CARPET);
    ItemType TERRACOTTA = asItemType(Material.TERRACOTTA);
    ItemType PACKED_ICE = asItemType(Material.PACKED_ICE);
    ItemType DIRT_PATH = asItemType(Material.DIRT_PATH);
    ItemType SUNFLOWER = asItemType(Material.SUNFLOWER);
    ItemType LILAC = asItemType(Material.LILAC);
    ItemType ROSE_BUSH = asItemType(Material.ROSE_BUSH);
    ItemType PEONY = asItemType(Material.PEONY);
    ItemType TALL_GRASS = asItemType(Material.TALL_GRASS);
    ItemType LARGE_FERN = asItemType(Material.LARGE_FERN);
    ItemType WHITE_STAINED_GLASS = asItemType(Material.WHITE_STAINED_GLASS);
    ItemType ORANGE_STAINED_GLASS = asItemType(Material.ORANGE_STAINED_GLASS);
    ItemType MAGENTA_STAINED_GLASS = asItemType(Material.MAGENTA_STAINED_GLASS);
    ItemType LIGHT_BLUE_STAINED_GLASS = asItemType(Material.LIGHT_BLUE_STAINED_GLASS);
    ItemType YELLOW_STAINED_GLASS = asItemType(Material.YELLOW_STAINED_GLASS);
    ItemType LIME_STAINED_GLASS = asItemType(Material.LIME_STAINED_GLASS);
    ItemType PINK_STAINED_GLASS = asItemType(Material.PINK_STAINED_GLASS);
    ItemType GRAY_STAINED_GLASS = asItemType(Material.GRAY_STAINED_GLASS);
    ItemType LIGHT_GRAY_STAINED_GLASS = asItemType(Material.LIGHT_GRAY_STAINED_GLASS);
    ItemType CYAN_STAINED_GLASS = asItemType(Material.CYAN_STAINED_GLASS);
    ItemType PURPLE_STAINED_GLASS = asItemType(Material.PURPLE_STAINED_GLASS);
    ItemType BLUE_STAINED_GLASS = asItemType(Material.BLUE_STAINED_GLASS);
    ItemType BROWN_STAINED_GLASS = asItemType(Material.BROWN_STAINED_GLASS);
    ItemType GREEN_STAINED_GLASS = asItemType(Material.GREEN_STAINED_GLASS);
    ItemType RED_STAINED_GLASS = asItemType(Material.RED_STAINED_GLASS);
    ItemType BLACK_STAINED_GLASS = asItemType(Material.BLACK_STAINED_GLASS);
    ItemType WHITE_STAINED_GLASS_PANE = asItemType(Material.WHITE_STAINED_GLASS_PANE);
    ItemType ORANGE_STAINED_GLASS_PANE = asItemType(Material.ORANGE_STAINED_GLASS_PANE);
    ItemType MAGENTA_STAINED_GLASS_PANE = asItemType(Material.MAGENTA_STAINED_GLASS_PANE);
    ItemType LIGHT_BLUE_STAINED_GLASS_PANE = asItemType(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
    ItemType YELLOW_STAINED_GLASS_PANE = asItemType(Material.YELLOW_STAINED_GLASS_PANE);
    ItemType LIME_STAINED_GLASS_PANE = asItemType(Material.LIME_STAINED_GLASS_PANE);
    ItemType PINK_STAINED_GLASS_PANE = asItemType(Material.PINK_STAINED_GLASS_PANE);
    ItemType GRAY_STAINED_GLASS_PANE = asItemType(Material.GRAY_STAINED_GLASS_PANE);
    ItemType LIGHT_GRAY_STAINED_GLASS_PANE = asItemType(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
    ItemType CYAN_STAINED_GLASS_PANE = asItemType(Material.CYAN_STAINED_GLASS_PANE);
    ItemType PURPLE_STAINED_GLASS_PANE = asItemType(Material.PURPLE_STAINED_GLASS_PANE);
    ItemType BLUE_STAINED_GLASS_PANE = asItemType(Material.BLUE_STAINED_GLASS_PANE);
    ItemType BROWN_STAINED_GLASS_PANE = asItemType(Material.BROWN_STAINED_GLASS_PANE);
    ItemType GREEN_STAINED_GLASS_PANE = asItemType(Material.GREEN_STAINED_GLASS_PANE);
    ItemType RED_STAINED_GLASS_PANE = asItemType(Material.RED_STAINED_GLASS_PANE);
    ItemType BLACK_STAINED_GLASS_PANE = asItemType(Material.BLACK_STAINED_GLASS_PANE);
    ItemType PRISMARINE = asItemType(Material.PRISMARINE);
    ItemType PRISMARINE_BRICKS = asItemType(Material.PRISMARINE_BRICKS);
    ItemType DARK_PRISMARINE = asItemType(Material.DARK_PRISMARINE);
    ItemType PRISMARINE_STAIRS = asItemType(Material.PRISMARINE_STAIRS);
    ItemType PRISMARINE_BRICK_STAIRS = asItemType(Material.PRISMARINE_BRICK_STAIRS);
    ItemType DARK_PRISMARINE_STAIRS = asItemType(Material.DARK_PRISMARINE_STAIRS);
    ItemType SEA_LANTERN = asItemType(Material.SEA_LANTERN);
    ItemType RED_SANDSTONE = asItemType(Material.RED_SANDSTONE);
    ItemType CHISELED_RED_SANDSTONE = asItemType(Material.CHISELED_RED_SANDSTONE);
    ItemType CUT_RED_SANDSTONE = asItemType(Material.CUT_RED_SANDSTONE);
    ItemType RED_SANDSTONE_STAIRS = asItemType(Material.RED_SANDSTONE_STAIRS);
    ItemType REPEATING_COMMAND_BLOCK = asItemType(Material.REPEATING_COMMAND_BLOCK);
    ItemType CHAIN_COMMAND_BLOCK = asItemType(Material.CHAIN_COMMAND_BLOCK);
    ItemType MAGMA_BLOCK = asItemType(Material.MAGMA_BLOCK);
    ItemType NETHER_WART_BLOCK = asItemType(Material.NETHER_WART_BLOCK);
    ItemType WARPED_WART_BLOCK = asItemType(Material.WARPED_WART_BLOCK);
    ItemType RED_NETHER_BRICKS = asItemType(Material.RED_NETHER_BRICKS);
    ItemType BONE_BLOCK = asItemType(Material.BONE_BLOCK);
    ItemType STRUCTURE_VOID = asItemType(Material.STRUCTURE_VOID);
    ItemType SHULKER_BOX = asItemType(Material.SHULKER_BOX);
    ItemType WHITE_SHULKER_BOX = asItemType(Material.WHITE_SHULKER_BOX);
    ItemType ORANGE_SHULKER_BOX = asItemType(Material.ORANGE_SHULKER_BOX);
    ItemType MAGENTA_SHULKER_BOX = asItemType(Material.MAGENTA_SHULKER_BOX);
    ItemType LIGHT_BLUE_SHULKER_BOX = asItemType(Material.LIGHT_BLUE_SHULKER_BOX);
    ItemType YELLOW_SHULKER_BOX = asItemType(Material.YELLOW_SHULKER_BOX);
    ItemType LIME_SHULKER_BOX = asItemType(Material.LIME_SHULKER_BOX);
    ItemType PINK_SHULKER_BOX = asItemType(Material.PINK_SHULKER_BOX);
    ItemType GRAY_SHULKER_BOX = asItemType(Material.GRAY_SHULKER_BOX);
    ItemType LIGHT_GRAY_SHULKER_BOX = asItemType(Material.LIGHT_GRAY_SHULKER_BOX);
    ItemType CYAN_SHULKER_BOX = asItemType(Material.CYAN_SHULKER_BOX);
    ItemType PURPLE_SHULKER_BOX = asItemType(Material.PURPLE_SHULKER_BOX);
    ItemType BLUE_SHULKER_BOX = asItemType(Material.BLUE_SHULKER_BOX);
    ItemType BROWN_SHULKER_BOX = asItemType(Material.BROWN_SHULKER_BOX);
    ItemType GREEN_SHULKER_BOX = asItemType(Material.GREEN_SHULKER_BOX);
    ItemType RED_SHULKER_BOX = asItemType(Material.RED_SHULKER_BOX);
    ItemType BLACK_SHULKER_BOX = asItemType(Material.BLACK_SHULKER_BOX);
    ItemType WHITE_GLAZED_TERRACOTTA = asItemType(Material.WHITE_GLAZED_TERRACOTTA);
    ItemType ORANGE_GLAZED_TERRACOTTA = asItemType(Material.ORANGE_GLAZED_TERRACOTTA);
    ItemType MAGENTA_GLAZED_TERRACOTTA = asItemType(Material.MAGENTA_GLAZED_TERRACOTTA);
    ItemType LIGHT_BLUE_GLAZED_TERRACOTTA = asItemType(Material.LIGHT_BLUE_GLAZED_TERRACOTTA);
    ItemType YELLOW_GLAZED_TERRACOTTA = asItemType(Material.YELLOW_GLAZED_TERRACOTTA);
    ItemType LIME_GLAZED_TERRACOTTA = asItemType(Material.LIME_GLAZED_TERRACOTTA);
    ItemType PINK_GLAZED_TERRACOTTA = asItemType(Material.PINK_GLAZED_TERRACOTTA);
    ItemType GRAY_GLAZED_TERRACOTTA = asItemType(Material.GRAY_GLAZED_TERRACOTTA);
    ItemType LIGHT_GRAY_GLAZED_TERRACOTTA = asItemType(Material.LIGHT_GRAY_GLAZED_TERRACOTTA);
    ItemType CYAN_GLAZED_TERRACOTTA = asItemType(Material.CYAN_GLAZED_TERRACOTTA);
    ItemType PURPLE_GLAZED_TERRACOTTA = asItemType(Material.PURPLE_GLAZED_TERRACOTTA);
    ItemType BLUE_GLAZED_TERRACOTTA = asItemType(Material.BLUE_GLAZED_TERRACOTTA);
    ItemType BROWN_GLAZED_TERRACOTTA = asItemType(Material.BROWN_GLAZED_TERRACOTTA);
    ItemType GREEN_GLAZED_TERRACOTTA = asItemType(Material.GREEN_GLAZED_TERRACOTTA);
    ItemType RED_GLAZED_TERRACOTTA = asItemType(Material.RED_GLAZED_TERRACOTTA);
    ItemType BLACK_GLAZED_TERRACOTTA = asItemType(Material.BLACK_GLAZED_TERRACOTTA);
    ItemType WHITE_CONCRETE = asItemType(Material.WHITE_CONCRETE);
    ItemType ORANGE_CONCRETE = asItemType(Material.ORANGE_CONCRETE);
    ItemType MAGENTA_CONCRETE = asItemType(Material.MAGENTA_CONCRETE);
    ItemType LIGHT_BLUE_CONCRETE = asItemType(Material.LIGHT_BLUE_CONCRETE);
    ItemType YELLOW_CONCRETE = asItemType(Material.YELLOW_CONCRETE);
    ItemType LIME_CONCRETE = asItemType(Material.LIME_CONCRETE);
    ItemType PINK_CONCRETE = asItemType(Material.PINK_CONCRETE);
    ItemType GRAY_CONCRETE = asItemType(Material.GRAY_CONCRETE);
    ItemType LIGHT_GRAY_CONCRETE = asItemType(Material.LIGHT_GRAY_CONCRETE);
    ItemType CYAN_CONCRETE = asItemType(Material.CYAN_CONCRETE);
    ItemType PURPLE_CONCRETE = asItemType(Material.PURPLE_CONCRETE);
    ItemType BLUE_CONCRETE = asItemType(Material.BLUE_CONCRETE);
    ItemType BROWN_CONCRETE = asItemType(Material.BROWN_CONCRETE);
    ItemType GREEN_CONCRETE = asItemType(Material.GREEN_CONCRETE);
    ItemType RED_CONCRETE = asItemType(Material.RED_CONCRETE);
    ItemType BLACK_CONCRETE = asItemType(Material.BLACK_CONCRETE);
    ItemType WHITE_CONCRETE_POWDER = asItemType(Material.WHITE_CONCRETE_POWDER);
    ItemType ORANGE_CONCRETE_POWDER = asItemType(Material.ORANGE_CONCRETE_POWDER);
    ItemType MAGENTA_CONCRETE_POWDER = asItemType(Material.MAGENTA_CONCRETE_POWDER);
    ItemType LIGHT_BLUE_CONCRETE_POWDER = asItemType(Material.LIGHT_BLUE_CONCRETE_POWDER);
    ItemType YELLOW_CONCRETE_POWDER = asItemType(Material.YELLOW_CONCRETE_POWDER);
    ItemType LIME_CONCRETE_POWDER = asItemType(Material.LIME_CONCRETE_POWDER);
    ItemType PINK_CONCRETE_POWDER = asItemType(Material.PINK_CONCRETE_POWDER);
    ItemType GRAY_CONCRETE_POWDER = asItemType(Material.GRAY_CONCRETE_POWDER);
    ItemType LIGHT_GRAY_CONCRETE_POWDER = asItemType(Material.LIGHT_GRAY_CONCRETE_POWDER);
    ItemType CYAN_CONCRETE_POWDER = asItemType(Material.CYAN_CONCRETE_POWDER);
    ItemType PURPLE_CONCRETE_POWDER = asItemType(Material.PURPLE_CONCRETE_POWDER);
    ItemType BLUE_CONCRETE_POWDER = asItemType(Material.BLUE_CONCRETE_POWDER);
    ItemType BROWN_CONCRETE_POWDER = asItemType(Material.BROWN_CONCRETE_POWDER);
    ItemType GREEN_CONCRETE_POWDER = asItemType(Material.GREEN_CONCRETE_POWDER);
    ItemType RED_CONCRETE_POWDER = asItemType(Material.RED_CONCRETE_POWDER);
    ItemType BLACK_CONCRETE_POWDER = asItemType(Material.BLACK_CONCRETE_POWDER);
    ItemType TURTLE_EGG = asItemType(Material.TURTLE_EGG);
    ItemType DEAD_TUBE_CORAL_BLOCK = asItemType(Material.DEAD_TUBE_CORAL_BLOCK);
    ItemType DEAD_BRAIN_CORAL_BLOCK = asItemType(Material.DEAD_BRAIN_CORAL_BLOCK);
    ItemType DEAD_BUBBLE_CORAL_BLOCK = asItemType(Material.DEAD_BUBBLE_CORAL_BLOCK);
    ItemType DEAD_FIRE_CORAL_BLOCK = asItemType(Material.DEAD_FIRE_CORAL_BLOCK);
    ItemType DEAD_HORN_CORAL_BLOCK = asItemType(Material.DEAD_HORN_CORAL_BLOCK);
    ItemType TUBE_CORAL_BLOCK = asItemType(Material.TUBE_CORAL_BLOCK);
    ItemType BRAIN_CORAL_BLOCK = asItemType(Material.BRAIN_CORAL_BLOCK);
    ItemType BUBBLE_CORAL_BLOCK = asItemType(Material.BUBBLE_CORAL_BLOCK);
    ItemType FIRE_CORAL_BLOCK = asItemType(Material.FIRE_CORAL_BLOCK);
    ItemType HORN_CORAL_BLOCK = asItemType(Material.HORN_CORAL_BLOCK);
    ItemType TUBE_CORAL = asItemType(Material.TUBE_CORAL);
    ItemType BRAIN_CORAL = asItemType(Material.BRAIN_CORAL);
    ItemType BUBBLE_CORAL = asItemType(Material.BUBBLE_CORAL);
    ItemType FIRE_CORAL = asItemType(Material.FIRE_CORAL);
    ItemType HORN_CORAL = asItemType(Material.HORN_CORAL);
    ItemType DEAD_BRAIN_CORAL = asItemType(Material.DEAD_BRAIN_CORAL);
    ItemType DEAD_BUBBLE_CORAL = asItemType(Material.DEAD_BUBBLE_CORAL);
    ItemType DEAD_FIRE_CORAL = asItemType(Material.DEAD_FIRE_CORAL);
    ItemType DEAD_HORN_CORAL = asItemType(Material.DEAD_HORN_CORAL);
    ItemType DEAD_TUBE_CORAL = asItemType(Material.DEAD_TUBE_CORAL);
    ItemType TUBE_CORAL_FAN = asItemType(Material.TUBE_CORAL_FAN);
    ItemType BRAIN_CORAL_FAN = asItemType(Material.BRAIN_CORAL_FAN);
    ItemType BUBBLE_CORAL_FAN = asItemType(Material.BUBBLE_CORAL_FAN);
    ItemType FIRE_CORAL_FAN = asItemType(Material.FIRE_CORAL_FAN);
    ItemType HORN_CORAL_FAN = asItemType(Material.HORN_CORAL_FAN);
    ItemType DEAD_TUBE_CORAL_FAN = asItemType(Material.DEAD_TUBE_CORAL_FAN);
    ItemType DEAD_BRAIN_CORAL_FAN = asItemType(Material.DEAD_BRAIN_CORAL_FAN);
    ItemType DEAD_BUBBLE_CORAL_FAN = asItemType(Material.DEAD_BUBBLE_CORAL_FAN);
    ItemType DEAD_FIRE_CORAL_FAN = asItemType(Material.DEAD_FIRE_CORAL_FAN);
    ItemType DEAD_HORN_CORAL_FAN = asItemType(Material.DEAD_HORN_CORAL_FAN);
    ItemType BLUE_ICE = asItemType(Material.BLUE_ICE);
    ItemType CONDUIT = asItemType(Material.CONDUIT);
    ItemType POLISHED_GRANITE_STAIRS = asItemType(Material.POLISHED_GRANITE_STAIRS);
    ItemType SMOOTH_RED_SANDSTONE_STAIRS = asItemType(Material.SMOOTH_RED_SANDSTONE_STAIRS);
    ItemType MOSSY_STONE_BRICK_STAIRS = asItemType(Material.MOSSY_STONE_BRICK_STAIRS);
    ItemType POLISHED_DIORITE_STAIRS = asItemType(Material.POLISHED_DIORITE_STAIRS);
    ItemType MOSSY_COBBLESTONE_STAIRS = asItemType(Material.MOSSY_COBBLESTONE_STAIRS);
    ItemType END_STONE_BRICK_STAIRS = asItemType(Material.END_STONE_BRICK_STAIRS);
    ItemType STONE_STAIRS = asItemType(Material.STONE_STAIRS);
    ItemType SMOOTH_SANDSTONE_STAIRS = asItemType(Material.SMOOTH_SANDSTONE_STAIRS);
    ItemType SMOOTH_QUARTZ_STAIRS = asItemType(Material.SMOOTH_QUARTZ_STAIRS);
    ItemType GRANITE_STAIRS = asItemType(Material.GRANITE_STAIRS);
    ItemType ANDESITE_STAIRS = asItemType(Material.ANDESITE_STAIRS);
    ItemType RED_NETHER_BRICK_STAIRS = asItemType(Material.RED_NETHER_BRICK_STAIRS);
    ItemType POLISHED_ANDESITE_STAIRS = asItemType(Material.POLISHED_ANDESITE_STAIRS);
    ItemType DIORITE_STAIRS = asItemType(Material.DIORITE_STAIRS);
    ItemType COBBLED_DEEPSLATE_STAIRS = asItemType(Material.COBBLED_DEEPSLATE_STAIRS);
    ItemType POLISHED_DEEPSLATE_STAIRS = asItemType(Material.POLISHED_DEEPSLATE_STAIRS);
    ItemType DEEPSLATE_BRICK_STAIRS = asItemType(Material.DEEPSLATE_BRICK_STAIRS);
    ItemType DEEPSLATE_TILE_STAIRS = asItemType(Material.DEEPSLATE_TILE_STAIRS);
    ItemType POLISHED_GRANITE_SLAB = asItemType(Material.POLISHED_GRANITE_SLAB);
    ItemType SMOOTH_RED_SANDSTONE_SLAB = asItemType(Material.SMOOTH_RED_SANDSTONE_SLAB);
    ItemType MOSSY_STONE_BRICK_SLAB = asItemType(Material.MOSSY_STONE_BRICK_SLAB);
    ItemType POLISHED_DIORITE_SLAB = asItemType(Material.POLISHED_DIORITE_SLAB);
    ItemType MOSSY_COBBLESTONE_SLAB = asItemType(Material.MOSSY_COBBLESTONE_SLAB);
    ItemType END_STONE_BRICK_SLAB = asItemType(Material.END_STONE_BRICK_SLAB);
    ItemType SMOOTH_SANDSTONE_SLAB = asItemType(Material.SMOOTH_SANDSTONE_SLAB);
    ItemType SMOOTH_QUARTZ_SLAB = asItemType(Material.SMOOTH_QUARTZ_SLAB);
    ItemType GRANITE_SLAB = asItemType(Material.GRANITE_SLAB);
    ItemType ANDESITE_SLAB = asItemType(Material.ANDESITE_SLAB);
    ItemType RED_NETHER_BRICK_SLAB = asItemType(Material.RED_NETHER_BRICK_SLAB);
    ItemType POLISHED_ANDESITE_SLAB = asItemType(Material.POLISHED_ANDESITE_SLAB);
    ItemType DIORITE_SLAB = asItemType(Material.DIORITE_SLAB);
    ItemType COBBLED_DEEPSLATE_SLAB = asItemType(Material.COBBLED_DEEPSLATE_SLAB);
    ItemType POLISHED_DEEPSLATE_SLAB = asItemType(Material.POLISHED_DEEPSLATE_SLAB);
    ItemType DEEPSLATE_BRICK_SLAB = asItemType(Material.DEEPSLATE_BRICK_SLAB);
    ItemType DEEPSLATE_TILE_SLAB = asItemType(Material.DEEPSLATE_TILE_SLAB);
    ItemType SCAFFOLDING = asItemType(Material.SCAFFOLDING);
    ItemType REDSTONE = asItemType(Material.REDSTONE);
    ItemType REDSTONE_TORCH = asItemType(Material.REDSTONE_TORCH);
    ItemType REDSTONE_BLOCK = asItemType(Material.REDSTONE_BLOCK);
    ItemType REPEATER = asItemType(Material.REPEATER);
    ItemType COMPARATOR = asItemType(Material.COMPARATOR);
    ItemType PISTON = asItemType(Material.PISTON);
    ItemType STICKY_PISTON = asItemType(Material.STICKY_PISTON);
    ItemType SLIME_BLOCK = asItemType(Material.SLIME_BLOCK);
    ItemType HONEY_BLOCK = asItemType(Material.HONEY_BLOCK);
    ItemType OBSERVER = asItemType(Material.OBSERVER);
    ItemType HOPPER = asItemType(Material.HOPPER);
    ItemType DISPENSER = asItemType(Material.DISPENSER);
    ItemType DROPPER = asItemType(Material.DROPPER);
    ItemType LECTERN = asItemType(Material.LECTERN);
    ItemType TARGET = asItemType(Material.TARGET);
    ItemType LEVER = asItemType(Material.LEVER);
    ItemType LIGHTNING_ROD = asItemType(Material.LIGHTNING_ROD);
    ItemType DAYLIGHT_DETECTOR = asItemType(Material.DAYLIGHT_DETECTOR);
    ItemType SCULK_SENSOR = asItemType(Material.SCULK_SENSOR);
    ItemType TRIPWIRE_HOOK = asItemType(Material.TRIPWIRE_HOOK);
    ItemType TRAPPED_CHEST = asItemType(Material.TRAPPED_CHEST);
    ItemType TNT = asItemType(Material.TNT);
    ItemType REDSTONE_LAMP = asItemType(Material.REDSTONE_LAMP);
    ItemType NOTE_BLOCK = asItemType(Material.NOTE_BLOCK);
    ItemType STONE_BUTTON = asItemType(Material.STONE_BUTTON);
    ItemType POLISHED_BLACKSTONE_BUTTON = asItemType(Material.POLISHED_BLACKSTONE_BUTTON);
    ItemType OAK_BUTTON = asItemType(Material.OAK_BUTTON);
    ItemType SPRUCE_BUTTON = asItemType(Material.SPRUCE_BUTTON);
    ItemType BIRCH_BUTTON = asItemType(Material.BIRCH_BUTTON);
    ItemType JUNGLE_BUTTON = asItemType(Material.JUNGLE_BUTTON);
    ItemType ACACIA_BUTTON = asItemType(Material.ACACIA_BUTTON);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_BUTTON = asItemType(Material.CHERRY_BUTTON);
    ItemType DARK_OAK_BUTTON = asItemType(Material.DARK_OAK_BUTTON);
    ItemType MANGROVE_BUTTON = asItemType(Material.MANGROVE_BUTTON);
    ItemType BAMBOO_BUTTON = asItemType(Material.BAMBOO_BUTTON);
    ItemType CRIMSON_BUTTON = asItemType(Material.CRIMSON_BUTTON);
    ItemType WARPED_BUTTON = asItemType(Material.WARPED_BUTTON);
    ItemType STONE_PRESSURE_PLATE = asItemType(Material.STONE_PRESSURE_PLATE);
    ItemType POLISHED_BLACKSTONE_PRESSURE_PLATE = asItemType(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE);
    ItemType LIGHT_WEIGHTED_PRESSURE_PLATE = asItemType(Material.LIGHT_WEIGHTED_PRESSURE_PLATE);
    ItemType HEAVY_WEIGHTED_PRESSURE_PLATE = asItemType(Material.HEAVY_WEIGHTED_PRESSURE_PLATE);
    ItemType OAK_PRESSURE_PLATE = asItemType(Material.OAK_PRESSURE_PLATE);
    ItemType SPRUCE_PRESSURE_PLATE = asItemType(Material.SPRUCE_PRESSURE_PLATE);
    ItemType BIRCH_PRESSURE_PLATE = asItemType(Material.BIRCH_PRESSURE_PLATE);
    ItemType JUNGLE_PRESSURE_PLATE = asItemType(Material.JUNGLE_PRESSURE_PLATE);
    ItemType ACACIA_PRESSURE_PLATE = asItemType(Material.ACACIA_PRESSURE_PLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_PRESSURE_PLATE = asItemType(Material.CHERRY_PRESSURE_PLATE);
    ItemType DARK_OAK_PRESSURE_PLATE = asItemType(Material.DARK_OAK_PRESSURE_PLATE);
    ItemType MANGROVE_PRESSURE_PLATE = asItemType(Material.MANGROVE_PRESSURE_PLATE);
    ItemType BAMBOO_PRESSURE_PLATE = asItemType(Material.BAMBOO_PRESSURE_PLATE);
    ItemType CRIMSON_PRESSURE_PLATE = asItemType(Material.CRIMSON_PRESSURE_PLATE);
    ItemType WARPED_PRESSURE_PLATE = asItemType(Material.WARPED_PRESSURE_PLATE);
    ItemType IRON_DOOR = asItemType(Material.IRON_DOOR);
    ItemType OAK_DOOR = asItemType(Material.OAK_DOOR);
    ItemType SPRUCE_DOOR = asItemType(Material.SPRUCE_DOOR);
    ItemType BIRCH_DOOR = asItemType(Material.BIRCH_DOOR);
    ItemType JUNGLE_DOOR = asItemType(Material.JUNGLE_DOOR);
    ItemType ACACIA_DOOR = asItemType(Material.ACACIA_DOOR);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_DOOR = asItemType(Material.CHERRY_DOOR);
    ItemType DARK_OAK_DOOR = asItemType(Material.DARK_OAK_DOOR);
    ItemType MANGROVE_DOOR = asItemType(Material.MANGROVE_DOOR);
    ItemType BAMBOO_DOOR = asItemType(Material.BAMBOO_DOOR);
    ItemType CRIMSON_DOOR = asItemType(Material.CRIMSON_DOOR);
    ItemType WARPED_DOOR = asItemType(Material.WARPED_DOOR);
    ItemType IRON_TRAPDOOR = asItemType(Material.IRON_TRAPDOOR);
    ItemType OAK_TRAPDOOR = asItemType(Material.OAK_TRAPDOOR);
    ItemType SPRUCE_TRAPDOOR = asItemType(Material.SPRUCE_TRAPDOOR);
    ItemType BIRCH_TRAPDOOR = asItemType(Material.BIRCH_TRAPDOOR);
    ItemType JUNGLE_TRAPDOOR = asItemType(Material.JUNGLE_TRAPDOOR);
    ItemType ACACIA_TRAPDOOR = asItemType(Material.ACACIA_TRAPDOOR);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_TRAPDOOR = asItemType(Material.CHERRY_TRAPDOOR);
    ItemType DARK_OAK_TRAPDOOR = asItemType(Material.DARK_OAK_TRAPDOOR);
    ItemType MANGROVE_TRAPDOOR = asItemType(Material.MANGROVE_TRAPDOOR);
    ItemType BAMBOO_TRAPDOOR = asItemType(Material.BAMBOO_TRAPDOOR);
    ItemType CRIMSON_TRAPDOOR = asItemType(Material.CRIMSON_TRAPDOOR);
    ItemType WARPED_TRAPDOOR = asItemType(Material.WARPED_TRAPDOOR);
    ItemType OAK_FENCE_GATE = asItemType(Material.OAK_FENCE_GATE);
    ItemType SPRUCE_FENCE_GATE = asItemType(Material.SPRUCE_FENCE_GATE);
    ItemType BIRCH_FENCE_GATE = asItemType(Material.BIRCH_FENCE_GATE);
    ItemType JUNGLE_FENCE_GATE = asItemType(Material.JUNGLE_FENCE_GATE);
    ItemType ACACIA_FENCE_GATE = asItemType(Material.ACACIA_FENCE_GATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_FENCE_GATE = asItemType(Material.CHERRY_FENCE_GATE);
    ItemType DARK_OAK_FENCE_GATE = asItemType(Material.DARK_OAK_FENCE_GATE);
    ItemType MANGROVE_FENCE_GATE = asItemType(Material.MANGROVE_FENCE_GATE);
    ItemType BAMBOO_FENCE_GATE = asItemType(Material.BAMBOO_FENCE_GATE);
    ItemType CRIMSON_FENCE_GATE = asItemType(Material.CRIMSON_FENCE_GATE);
    ItemType WARPED_FENCE_GATE = asItemType(Material.WARPED_FENCE_GATE);
    ItemType POWERED_RAIL = asItemType(Material.POWERED_RAIL);
    ItemType DETECTOR_RAIL = asItemType(Material.DETECTOR_RAIL);
    ItemType RAIL = asItemType(Material.RAIL);
    ItemType ACTIVATOR_RAIL = asItemType(Material.ACTIVATOR_RAIL);
    ItemType SADDLE = asItemType(Material.SADDLE);
    ItemType MINECART = asItemType(Material.MINECART);
    ItemType CHEST_MINECART = asItemType(Material.CHEST_MINECART);
    ItemType FURNACE_MINECART = asItemType(Material.FURNACE_MINECART);
    ItemType TNT_MINECART = asItemType(Material.TNT_MINECART);
    ItemType HOPPER_MINECART = asItemType(Material.HOPPER_MINECART);
    ItemType CARROT_ON_A_STICK = asItemType(Material.CARROT_ON_A_STICK);
    ItemType WARPED_FUNGUS_ON_A_STICK = asItemType(Material.WARPED_FUNGUS_ON_A_STICK);
    ItemType ELYTRA = asItemType(Material.ELYTRA);
    ItemType OAK_BOAT = asItemType(Material.OAK_BOAT);
    ItemType OAK_CHEST_BOAT = asItemType(Material.OAK_CHEST_BOAT);
    ItemType SPRUCE_BOAT = asItemType(Material.SPRUCE_BOAT);
    ItemType SPRUCE_CHEST_BOAT = asItemType(Material.SPRUCE_CHEST_BOAT);
    ItemType BIRCH_BOAT = asItemType(Material.BIRCH_BOAT);
    ItemType BIRCH_CHEST_BOAT = asItemType(Material.BIRCH_CHEST_BOAT);
    ItemType JUNGLE_BOAT = asItemType(Material.JUNGLE_BOAT);
    ItemType JUNGLE_CHEST_BOAT = asItemType(Material.JUNGLE_CHEST_BOAT);
    ItemType ACACIA_BOAT = asItemType(Material.ACACIA_BOAT);
    ItemType ACACIA_CHEST_BOAT = asItemType(Material.ACACIA_CHEST_BOAT);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_BOAT = asItemType(Material.CHERRY_BOAT);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_CHEST_BOAT = asItemType(Material.CHERRY_CHEST_BOAT);
    ItemType DARK_OAK_BOAT = asItemType(Material.DARK_OAK_BOAT);
    ItemType DARK_OAK_CHEST_BOAT = asItemType(Material.DARK_OAK_CHEST_BOAT);
    ItemType MANGROVE_BOAT = asItemType(Material.MANGROVE_BOAT);
    ItemType MANGROVE_CHEST_BOAT = asItemType(Material.MANGROVE_CHEST_BOAT);
    ItemType BAMBOO_RAFT = asItemType(Material.BAMBOO_RAFT);
    ItemType BAMBOO_CHEST_RAFT = asItemType(Material.BAMBOO_CHEST_RAFT);
    ItemType STRUCTURE_BLOCK = asItemType(Material.STRUCTURE_BLOCK);
    ItemType JIGSAW = asItemType(Material.JIGSAW);
    ItemType TURTLE_HELMET = asItemType(Material.TURTLE_HELMET);
    ItemType SCUTE = asItemType(Material.SCUTE);
    ItemType FLINT_AND_STEEL = asItemType(Material.FLINT_AND_STEEL);
    ItemType APPLE = asItemType(Material.APPLE);
    ItemType BOW = asItemType(Material.BOW);
    ItemType ARROW = asItemType(Material.ARROW);
    ItemType COAL = asItemType(Material.COAL);
    ItemType CHARCOAL = asItemType(Material.CHARCOAL);
    ItemType DIAMOND = asItemType(Material.DIAMOND);
    ItemType EMERALD = asItemType(Material.EMERALD);
    ItemType LAPIS_LAZULI = asItemType(Material.LAPIS_LAZULI);
    ItemType QUARTZ = asItemType(Material.QUARTZ);
    ItemType AMETHYST_SHARD = asItemType(Material.AMETHYST_SHARD);
    ItemType RAW_IRON = asItemType(Material.RAW_IRON);
    ItemType IRON_INGOT = asItemType(Material.IRON_INGOT);
    ItemType RAW_COPPER = asItemType(Material.RAW_COPPER);
    ItemType COPPER_INGOT = asItemType(Material.COPPER_INGOT);
    ItemType RAW_GOLD = asItemType(Material.RAW_GOLD);
    ItemType GOLD_INGOT = asItemType(Material.GOLD_INGOT);
    ItemType NETHERITE_INGOT = asItemType(Material.NETHERITE_INGOT);
    ItemType NETHERITE_SCRAP = asItemType(Material.NETHERITE_SCRAP);
    ItemType WOODEN_SWORD = asItemType(Material.WOODEN_SWORD);
    ItemType WOODEN_SHOVEL = asItemType(Material.WOODEN_SHOVEL);
    ItemType WOODEN_PICKAXE = asItemType(Material.WOODEN_PICKAXE);
    ItemType WOODEN_AXE = asItemType(Material.WOODEN_AXE);
    ItemType WOODEN_HOE = asItemType(Material.WOODEN_HOE);
    ItemType STONE_SWORD = asItemType(Material.STONE_SWORD);
    ItemType STONE_SHOVEL = asItemType(Material.STONE_SHOVEL);
    ItemType STONE_PICKAXE = asItemType(Material.STONE_PICKAXE);
    ItemType STONE_AXE = asItemType(Material.STONE_AXE);
    ItemType STONE_HOE = asItemType(Material.STONE_HOE);
    ItemType GOLDEN_SWORD = asItemType(Material.GOLDEN_SWORD);
    ItemType GOLDEN_SHOVEL = asItemType(Material.GOLDEN_SHOVEL);
    ItemType GOLDEN_PICKAXE = asItemType(Material.GOLDEN_PICKAXE);
    ItemType GOLDEN_AXE = asItemType(Material.GOLDEN_AXE);
    ItemType GOLDEN_HOE = asItemType(Material.GOLDEN_HOE);
    ItemType IRON_SWORD = asItemType(Material.IRON_SWORD);
    ItemType IRON_SHOVEL = asItemType(Material.IRON_SHOVEL);
    ItemType IRON_PICKAXE = asItemType(Material.IRON_PICKAXE);
    ItemType IRON_AXE = asItemType(Material.IRON_AXE);
    ItemType IRON_HOE = asItemType(Material.IRON_HOE);
    ItemType DIAMOND_SWORD = asItemType(Material.DIAMOND_SWORD);
    ItemType DIAMOND_SHOVEL = asItemType(Material.DIAMOND_SHOVEL);
    ItemType DIAMOND_PICKAXE = asItemType(Material.DIAMOND_PICKAXE);
    ItemType DIAMOND_AXE = asItemType(Material.DIAMOND_AXE);
    ItemType DIAMOND_HOE = asItemType(Material.DIAMOND_HOE);
    ItemType NETHERITE_SWORD = asItemType(Material.NETHERITE_SWORD);
    ItemType NETHERITE_SHOVEL = asItemType(Material.NETHERITE_SHOVEL);
    ItemType NETHERITE_PICKAXE = asItemType(Material.NETHERITE_PICKAXE);
    ItemType NETHERITE_AXE = asItemType(Material.NETHERITE_AXE);
    ItemType NETHERITE_HOE = asItemType(Material.NETHERITE_HOE);
    ItemType STICK = asItemType(Material.STICK);
    ItemType BOWL = asItemType(Material.BOWL);
    ItemType MUSHROOM_STEW = asItemType(Material.MUSHROOM_STEW);
    ItemType STRING = asItemType(Material.STRING);
    ItemType FEATHER = asItemType(Material.FEATHER);
    ItemType GUNPOWDER = asItemType(Material.GUNPOWDER);
    ItemType WHEAT_SEEDS = asItemType(Material.WHEAT_SEEDS);
    ItemType WHEAT = asItemType(Material.WHEAT);
    ItemType BREAD = asItemType(Material.BREAD);
    ItemType LEATHER_HELMET = asItemType(Material.LEATHER_HELMET);
    ItemType LEATHER_CHESTPLATE = asItemType(Material.LEATHER_CHESTPLATE);
    ItemType LEATHER_LEGGINGS = asItemType(Material.LEATHER_LEGGINGS);
    ItemType LEATHER_BOOTS = asItemType(Material.LEATHER_BOOTS);
    ItemType CHAINMAIL_HELMET = asItemType(Material.CHAINMAIL_HELMET);
    ItemType CHAINMAIL_CHESTPLATE = asItemType(Material.CHAINMAIL_CHESTPLATE);
    ItemType CHAINMAIL_LEGGINGS = asItemType(Material.CHAINMAIL_LEGGINGS);
    ItemType CHAINMAIL_BOOTS = asItemType(Material.CHAINMAIL_BOOTS);
    ItemType IRON_HELMET = asItemType(Material.IRON_HELMET);
    ItemType IRON_CHESTPLATE = asItemType(Material.IRON_CHESTPLATE);
    ItemType IRON_LEGGINGS = asItemType(Material.IRON_LEGGINGS);
    ItemType IRON_BOOTS = asItemType(Material.IRON_BOOTS);
    ItemType DIAMOND_HELMET = asItemType(Material.DIAMOND_HELMET);
    ItemType DIAMOND_CHESTPLATE = asItemType(Material.DIAMOND_CHESTPLATE);
    ItemType DIAMOND_LEGGINGS = asItemType(Material.DIAMOND_LEGGINGS);
    ItemType DIAMOND_BOOTS = asItemType(Material.DIAMOND_BOOTS);
    ItemType GOLDEN_HELMET = asItemType(Material.GOLDEN_HELMET);
    ItemType GOLDEN_CHESTPLATE = asItemType(Material.GOLDEN_CHESTPLATE);
    ItemType GOLDEN_LEGGINGS = asItemType(Material.GOLDEN_LEGGINGS);
    ItemType GOLDEN_BOOTS = asItemType(Material.GOLDEN_BOOTS);
    ItemType NETHERITE_HELMET = asItemType(Material.NETHERITE_HELMET);
    ItemType NETHERITE_CHESTPLATE = asItemType(Material.NETHERITE_CHESTPLATE);
    ItemType NETHERITE_LEGGINGS = asItemType(Material.NETHERITE_LEGGINGS);
    ItemType NETHERITE_BOOTS = asItemType(Material.NETHERITE_BOOTS);
    ItemType FLINT = asItemType(Material.FLINT);
    ItemType PORKCHOP = asItemType(Material.PORKCHOP);
    ItemType COOKED_PORKCHOP = asItemType(Material.COOKED_PORKCHOP);
    ItemType PAINTING = asItemType(Material.PAINTING);
    ItemType GOLDEN_APPLE = asItemType(Material.GOLDEN_APPLE);
    ItemType ENCHANTED_GOLDEN_APPLE = asItemType(Material.ENCHANTED_GOLDEN_APPLE);
    ItemType OAK_SIGN = asItemType(Material.OAK_SIGN);
    ItemType SPRUCE_SIGN = asItemType(Material.SPRUCE_SIGN);
    ItemType BIRCH_SIGN = asItemType(Material.BIRCH_SIGN);
    ItemType JUNGLE_SIGN = asItemType(Material.JUNGLE_SIGN);
    ItemType ACACIA_SIGN = asItemType(Material.ACACIA_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_SIGN = asItemType(Material.CHERRY_SIGN);
    ItemType DARK_OAK_SIGN = asItemType(Material.DARK_OAK_SIGN);
    ItemType MANGROVE_SIGN = asItemType(Material.MANGROVE_SIGN);
    ItemType BAMBOO_SIGN = asItemType(Material.BAMBOO_SIGN);
    ItemType CRIMSON_SIGN = asItemType(Material.CRIMSON_SIGN);
    ItemType WARPED_SIGN = asItemType(Material.WARPED_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType OAK_HANGING_SIGN = asItemType(Material.OAK_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SPRUCE_HANGING_SIGN = asItemType(Material.SPRUCE_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BIRCH_HANGING_SIGN = asItemType(Material.BIRCH_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType JUNGLE_HANGING_SIGN = asItemType(Material.JUNGLE_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType ACACIA_HANGING_SIGN = asItemType(Material.ACACIA_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CHERRY_HANGING_SIGN = asItemType(Material.CHERRY_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType DARK_OAK_HANGING_SIGN = asItemType(Material.DARK_OAK_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType MANGROVE_HANGING_SIGN = asItemType(Material.MANGROVE_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BAMBOO_HANGING_SIGN = asItemType(Material.BAMBOO_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CRIMSON_HANGING_SIGN = asItemType(Material.CRIMSON_HANGING_SIGN);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType WARPED_HANGING_SIGN = asItemType(Material.WARPED_HANGING_SIGN);
    ItemType BUCKET = asItemType(Material.BUCKET);
    ItemType WATER_BUCKET = asItemType(Material.WATER_BUCKET);
    ItemType LAVA_BUCKET = asItemType(Material.LAVA_BUCKET);
    ItemType POWDER_SNOW_BUCKET = asItemType(Material.POWDER_SNOW_BUCKET);
    ItemType SNOWBALL = asItemType(Material.SNOWBALL);
    ItemType LEATHER = asItemType(Material.LEATHER);
    ItemType MILK_BUCKET = asItemType(Material.MILK_BUCKET);
    ItemType PUFFERFISH_BUCKET = asItemType(Material.PUFFERFISH_BUCKET);
    ItemType SALMON_BUCKET = asItemType(Material.SALMON_BUCKET);
    ItemType COD_BUCKET = asItemType(Material.COD_BUCKET);
    ItemType TROPICAL_FISH_BUCKET = asItemType(Material.TROPICAL_FISH_BUCKET);
    ItemType AXOLOTL_BUCKET = asItemType(Material.AXOLOTL_BUCKET);
    ItemType TADPOLE_BUCKET = asItemType(Material.TADPOLE_BUCKET);
    ItemType BRICK = asItemType(Material.BRICK);
    ItemType CLAY_BALL = asItemType(Material.CLAY_BALL);
    ItemType DRIED_KELP_BLOCK = asItemType(Material.DRIED_KELP_BLOCK);
    ItemType PAPER = asItemType(Material.PAPER);
    ItemType BOOK = asItemType(Material.BOOK);
    ItemType SLIME_BALL = asItemType(Material.SLIME_BALL);
    ItemType EGG = asItemType(Material.EGG);
    ItemType COMPASS = asItemType(Material.COMPASS);
    ItemType RECOVERY_COMPASS = asItemType(Material.RECOVERY_COMPASS);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BUNDLE = asItemType(Material.BUNDLE);
    ItemType FISHING_ROD = asItemType(Material.FISHING_ROD);
    ItemType CLOCK = asItemType(Material.CLOCK);
    ItemType SPYGLASS = asItemType(Material.SPYGLASS);
    ItemType GLOWSTONE_DUST = asItemType(Material.GLOWSTONE_DUST);
    ItemType COD = asItemType(Material.COD);
    ItemType SALMON = asItemType(Material.SALMON);
    ItemType TROPICAL_FISH = asItemType(Material.TROPICAL_FISH);
    ItemType PUFFERFISH = asItemType(Material.PUFFERFISH);
    ItemType COOKED_COD = asItemType(Material.COOKED_COD);
    ItemType COOKED_SALMON = asItemType(Material.COOKED_SALMON);
    ItemType INK_SAC = asItemType(Material.INK_SAC);
    ItemType GLOW_INK_SAC = asItemType(Material.GLOW_INK_SAC);
    ItemType COCOA_BEANS = asItemType(Material.COCOA_BEANS);
    ItemType WHITE_DYE = asItemType(Material.WHITE_DYE);
    ItemType ORANGE_DYE = asItemType(Material.ORANGE_DYE);
    ItemType MAGENTA_DYE = asItemType(Material.MAGENTA_DYE);
    ItemType LIGHT_BLUE_DYE = asItemType(Material.LIGHT_BLUE_DYE);
    ItemType YELLOW_DYE = asItemType(Material.YELLOW_DYE);
    ItemType LIME_DYE = asItemType(Material.LIME_DYE);
    ItemType PINK_DYE = asItemType(Material.PINK_DYE);
    ItemType GRAY_DYE = asItemType(Material.GRAY_DYE);
    ItemType LIGHT_GRAY_DYE = asItemType(Material.LIGHT_GRAY_DYE);
    ItemType CYAN_DYE = asItemType(Material.CYAN_DYE);
    ItemType PURPLE_DYE = asItemType(Material.PURPLE_DYE);
    ItemType BLUE_DYE = asItemType(Material.BLUE_DYE);
    ItemType BROWN_DYE = asItemType(Material.BROWN_DYE);
    ItemType GREEN_DYE = asItemType(Material.GREEN_DYE);
    ItemType RED_DYE = asItemType(Material.RED_DYE);
    ItemType BLACK_DYE = asItemType(Material.BLACK_DYE);
    ItemType BONE_MEAL = asItemType(Material.BONE_MEAL);
    ItemType BONE = asItemType(Material.BONE);
    ItemType SUGAR = asItemType(Material.SUGAR);
    ItemType CAKE = asItemType(Material.CAKE);
    ItemType WHITE_BED = asItemType(Material.WHITE_BED);
    ItemType ORANGE_BED = asItemType(Material.ORANGE_BED);
    ItemType MAGENTA_BED = asItemType(Material.MAGENTA_BED);
    ItemType LIGHT_BLUE_BED = asItemType(Material.LIGHT_BLUE_BED);
    ItemType YELLOW_BED = asItemType(Material.YELLOW_BED);
    ItemType LIME_BED = asItemType(Material.LIME_BED);
    ItemType PINK_BED = asItemType(Material.PINK_BED);
    ItemType GRAY_BED = asItemType(Material.GRAY_BED);
    ItemType LIGHT_GRAY_BED = asItemType(Material.LIGHT_GRAY_BED);
    ItemType CYAN_BED = asItemType(Material.CYAN_BED);
    ItemType PURPLE_BED = asItemType(Material.PURPLE_BED);
    ItemType BLUE_BED = asItemType(Material.BLUE_BED);
    ItemType BROWN_BED = asItemType(Material.BROWN_BED);
    ItemType GREEN_BED = asItemType(Material.GREEN_BED);
    ItemType RED_BED = asItemType(Material.RED_BED);
    ItemType BLACK_BED = asItemType(Material.BLACK_BED);
    ItemType COOKIE = asItemType(Material.COOKIE);
    ItemType FILLED_MAP = asItemType(Material.FILLED_MAP);
    ItemType SHEARS = asItemType(Material.SHEARS);
    ItemType MELON_SLICE = asItemType(Material.MELON_SLICE);
    ItemType DRIED_KELP = asItemType(Material.DRIED_KELP);
    ItemType PUMPKIN_SEEDS = asItemType(Material.PUMPKIN_SEEDS);
    ItemType MELON_SEEDS = asItemType(Material.MELON_SEEDS);
    ItemType BEEF = asItemType(Material.BEEF);
    ItemType COOKED_BEEF = asItemType(Material.COOKED_BEEF);
    ItemType CHICKEN = asItemType(Material.CHICKEN);
    ItemType COOKED_CHICKEN = asItemType(Material.COOKED_CHICKEN);
    ItemType ROTTEN_FLESH = asItemType(Material.ROTTEN_FLESH);
    ItemType ENDER_PEARL = asItemType(Material.ENDER_PEARL);
    ItemType BLAZE_ROD = asItemType(Material.BLAZE_ROD);
    ItemType GHAST_TEAR = asItemType(Material.GHAST_TEAR);
    ItemType GOLD_NUGGET = asItemType(Material.GOLD_NUGGET);
    ItemType NETHER_WART = asItemType(Material.NETHER_WART);
    ItemType POTION = asItemType(Material.POTION);
    ItemType GLASS_BOTTLE = asItemType(Material.GLASS_BOTTLE);
    ItemType SPIDER_EYE = asItemType(Material.SPIDER_EYE);
    ItemType FERMENTED_SPIDER_EYE = asItemType(Material.FERMENTED_SPIDER_EYE);
    ItemType BLAZE_POWDER = asItemType(Material.BLAZE_POWDER);
    ItemType MAGMA_CREAM = asItemType(Material.MAGMA_CREAM);
    ItemType BREWING_STAND = asItemType(Material.BREWING_STAND);
    ItemType CAULDRON = asItemType(Material.CAULDRON);
    ItemType ENDER_EYE = asItemType(Material.ENDER_EYE);
    ItemType GLISTERING_MELON_SLICE = asItemType(Material.GLISTERING_MELON_SLICE);
    ItemType ALLAY_SPAWN_EGG = asItemType(Material.ALLAY_SPAWN_EGG);
    ItemType AXOLOTL_SPAWN_EGG = asItemType(Material.AXOLOTL_SPAWN_EGG);
    ItemType BAT_SPAWN_EGG = asItemType(Material.BAT_SPAWN_EGG);
    ItemType BEE_SPAWN_EGG = asItemType(Material.BEE_SPAWN_EGG);
    ItemType BLAZE_SPAWN_EGG = asItemType(Material.BLAZE_SPAWN_EGG);
    ItemType CAT_SPAWN_EGG = asItemType(Material.CAT_SPAWN_EGG);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType CAMEL_SPAWN_EGG = asItemType(Material.CAMEL_SPAWN_EGG);
    ItemType CAVE_SPIDER_SPAWN_EGG = asItemType(Material.CAVE_SPIDER_SPAWN_EGG);
    ItemType CHICKEN_SPAWN_EGG = asItemType(Material.CHICKEN_SPAWN_EGG);
    ItemType COD_SPAWN_EGG = asItemType(Material.COD_SPAWN_EGG);
    ItemType COW_SPAWN_EGG = asItemType(Material.COW_SPAWN_EGG);
    ItemType CREEPER_SPAWN_EGG = asItemType(Material.CREEPER_SPAWN_EGG);
    ItemType DOLPHIN_SPAWN_EGG = asItemType(Material.DOLPHIN_SPAWN_EGG);
    ItemType DONKEY_SPAWN_EGG = asItemType(Material.DONKEY_SPAWN_EGG);
    ItemType DROWNED_SPAWN_EGG = asItemType(Material.DROWNED_SPAWN_EGG);
    ItemType ELDER_GUARDIAN_SPAWN_EGG = asItemType(Material.ELDER_GUARDIAN_SPAWN_EGG);
    ItemType ENDER_DRAGON_SPAWN_EGG = asItemType(Material.ENDER_DRAGON_SPAWN_EGG);
    ItemType ENDERMAN_SPAWN_EGG = asItemType(Material.ENDERMAN_SPAWN_EGG);
    ItemType ENDERMITE_SPAWN_EGG = asItemType(Material.ENDERMITE_SPAWN_EGG);
    ItemType EVOKER_SPAWN_EGG = asItemType(Material.EVOKER_SPAWN_EGG);
    ItemType FOX_SPAWN_EGG = asItemType(Material.FOX_SPAWN_EGG);
    ItemType FROG_SPAWN_EGG = asItemType(Material.FROG_SPAWN_EGG);
    ItemType GHAST_SPAWN_EGG = asItemType(Material.GHAST_SPAWN_EGG);
    ItemType GLOW_SQUID_SPAWN_EGG = asItemType(Material.GLOW_SQUID_SPAWN_EGG);
    ItemType GOAT_SPAWN_EGG = asItemType(Material.GOAT_SPAWN_EGG);
    ItemType GUARDIAN_SPAWN_EGG = asItemType(Material.GUARDIAN_SPAWN_EGG);
    ItemType HOGLIN_SPAWN_EGG = asItemType(Material.HOGLIN_SPAWN_EGG);
    ItemType HORSE_SPAWN_EGG = asItemType(Material.HORSE_SPAWN_EGG);
    ItemType HUSK_SPAWN_EGG = asItemType(Material.HUSK_SPAWN_EGG);
    ItemType IRON_GOLEM_SPAWN_EGG = asItemType(Material.IRON_GOLEM_SPAWN_EGG);
    ItemType LLAMA_SPAWN_EGG = asItemType(Material.LLAMA_SPAWN_EGG);
    ItemType MAGMA_CUBE_SPAWN_EGG = asItemType(Material.MAGMA_CUBE_SPAWN_EGG);
    ItemType MOOSHROOM_SPAWN_EGG = asItemType(Material.MOOSHROOM_SPAWN_EGG);
    ItemType MULE_SPAWN_EGG = asItemType(Material.MULE_SPAWN_EGG);
    ItemType OCELOT_SPAWN_EGG = asItemType(Material.OCELOT_SPAWN_EGG);
    ItemType PANDA_SPAWN_EGG = asItemType(Material.PANDA_SPAWN_EGG);
    ItemType PARROT_SPAWN_EGG = asItemType(Material.PARROT_SPAWN_EGG);
    ItemType PHANTOM_SPAWN_EGG = asItemType(Material.PHANTOM_SPAWN_EGG);
    ItemType PIG_SPAWN_EGG = asItemType(Material.PIG_SPAWN_EGG);
    ItemType PIGLIN_SPAWN_EGG = asItemType(Material.PIGLIN_SPAWN_EGG);
    ItemType PIGLIN_BRUTE_SPAWN_EGG = asItemType(Material.PIGLIN_BRUTE_SPAWN_EGG);
    ItemType PILLAGER_SPAWN_EGG = asItemType(Material.PILLAGER_SPAWN_EGG);
    ItemType POLAR_BEAR_SPAWN_EGG = asItemType(Material.POLAR_BEAR_SPAWN_EGG);
    ItemType PUFFERFISH_SPAWN_EGG = asItemType(Material.PUFFERFISH_SPAWN_EGG);
    ItemType RABBIT_SPAWN_EGG = asItemType(Material.RABBIT_SPAWN_EGG);
    ItemType RAVAGER_SPAWN_EGG = asItemType(Material.RAVAGER_SPAWN_EGG);
    ItemType SALMON_SPAWN_EGG = asItemType(Material.SALMON_SPAWN_EGG);
    ItemType SHEEP_SPAWN_EGG = asItemType(Material.SHEEP_SPAWN_EGG);
    ItemType SHULKER_SPAWN_EGG = asItemType(Material.SHULKER_SPAWN_EGG);
    ItemType SILVERFISH_SPAWN_EGG = asItemType(Material.SILVERFISH_SPAWN_EGG);
    ItemType SKELETON_SPAWN_EGG = asItemType(Material.SKELETON_SPAWN_EGG);
    ItemType SKELETON_HORSE_SPAWN_EGG = asItemType(Material.SKELETON_HORSE_SPAWN_EGG);
    ItemType SLIME_SPAWN_EGG = asItemType(Material.SLIME_SPAWN_EGG);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SNIFFER_SPAWN_EGG = asItemType(Material.SNIFFER_SPAWN_EGG);
    ItemType SNOW_GOLEM_SPAWN_EGG = asItemType(Material.SNOW_GOLEM_SPAWN_EGG);
    ItemType SPIDER_SPAWN_EGG = asItemType(Material.SPIDER_SPAWN_EGG);
    ItemType SQUID_SPAWN_EGG = asItemType(Material.SQUID_SPAWN_EGG);
    ItemType STRAY_SPAWN_EGG = asItemType(Material.STRAY_SPAWN_EGG);
    ItemType STRIDER_SPAWN_EGG = asItemType(Material.STRIDER_SPAWN_EGG);
    ItemType TADPOLE_SPAWN_EGG = asItemType(Material.TADPOLE_SPAWN_EGG);
    ItemType TRADER_LLAMA_SPAWN_EGG = asItemType(Material.TRADER_LLAMA_SPAWN_EGG);
    ItemType TROPICAL_FISH_SPAWN_EGG = asItemType(Material.TROPICAL_FISH_SPAWN_EGG);
    ItemType TURTLE_SPAWN_EGG = asItemType(Material.TURTLE_SPAWN_EGG);
    ItemType VEX_SPAWN_EGG = asItemType(Material.VEX_SPAWN_EGG);
    ItemType VILLAGER_SPAWN_EGG = asItemType(Material.VILLAGER_SPAWN_EGG);
    ItemType VINDICATOR_SPAWN_EGG = asItemType(Material.VINDICATOR_SPAWN_EGG);
    ItemType WANDERING_TRADER_SPAWN_EGG = asItemType(Material.WANDERING_TRADER_SPAWN_EGG);
    ItemType WARDEN_SPAWN_EGG = asItemType(Material.WARDEN_SPAWN_EGG);
    ItemType WITCH_SPAWN_EGG = asItemType(Material.WITCH_SPAWN_EGG);
    ItemType WITHER_SPAWN_EGG = asItemType(Material.WITHER_SPAWN_EGG);
    ItemType WITHER_SKELETON_SPAWN_EGG = asItemType(Material.WITHER_SKELETON_SPAWN_EGG);
    ItemType WOLF_SPAWN_EGG = asItemType(Material.WOLF_SPAWN_EGG);
    ItemType ZOGLIN_SPAWN_EGG = asItemType(Material.ZOGLIN_SPAWN_EGG);
    ItemType ZOMBIE_SPAWN_EGG = asItemType(Material.ZOMBIE_SPAWN_EGG);
    ItemType ZOMBIE_HORSE_SPAWN_EGG = asItemType(Material.ZOMBIE_HORSE_SPAWN_EGG);
    ItemType ZOMBIE_VILLAGER_SPAWN_EGG = asItemType(Material.ZOMBIE_VILLAGER_SPAWN_EGG);
    ItemType ZOMBIFIED_PIGLIN_SPAWN_EGG = asItemType(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);
    ItemType EXPERIENCE_BOTTLE = asItemType(Material.EXPERIENCE_BOTTLE);
    ItemType FIRE_CHARGE = asItemType(Material.FIRE_CHARGE);
    ItemType WRITABLE_BOOK = asItemType(Material.WRITABLE_BOOK);
    ItemType WRITTEN_BOOK = asItemType(Material.WRITTEN_BOOK);
    ItemType ITEM_FRAME = asItemType(Material.ITEM_FRAME);
    ItemType GLOW_ITEM_FRAME = asItemType(Material.GLOW_ITEM_FRAME);
    ItemType FLOWER_POT = asItemType(Material.FLOWER_POT);
    ItemType CARROT = asItemType(Material.CARROT);
    ItemType POTATO = asItemType(Material.POTATO);
    ItemType BAKED_POTATO = asItemType(Material.BAKED_POTATO);
    ItemType POISONOUS_POTATO = asItemType(Material.POISONOUS_POTATO);
    ItemType MAP = asItemType(Material.MAP);
    ItemType GOLDEN_CARROT = asItemType(Material.GOLDEN_CARROT);
    ItemType SKELETON_SKULL = asItemType(Material.SKELETON_SKULL);
    ItemType WITHER_SKELETON_SKULL = asItemType(Material.WITHER_SKELETON_SKULL);
    ItemType PLAYER_HEAD = asItemType(Material.PLAYER_HEAD);
    ItemType ZOMBIE_HEAD = asItemType(Material.ZOMBIE_HEAD);
    ItemType CREEPER_HEAD = asItemType(Material.CREEPER_HEAD);
    ItemType DRAGON_HEAD = asItemType(Material.DRAGON_HEAD);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType PIGLIN_HEAD = asItemType(Material.PIGLIN_HEAD);
    ItemType NETHER_STAR = asItemType(Material.NETHER_STAR);
    ItemType PUMPKIN_PIE = asItemType(Material.PUMPKIN_PIE);
    ItemType FIREWORK_ROCKET = asItemType(Material.FIREWORK_ROCKET);
    ItemType FIREWORK_STAR = asItemType(Material.FIREWORK_STAR);
    ItemType ENCHANTED_BOOK = asItemType(Material.ENCHANTED_BOOK);
    ItemType NETHER_BRICK = asItemType(Material.NETHER_BRICK);
    ItemType PRISMARINE_SHARD = asItemType(Material.PRISMARINE_SHARD);
    ItemType PRISMARINE_CRYSTALS = asItemType(Material.PRISMARINE_CRYSTALS);
    ItemType RABBIT = asItemType(Material.RABBIT);
    ItemType COOKED_RABBIT = asItemType(Material.COOKED_RABBIT);
    ItemType RABBIT_STEW = asItemType(Material.RABBIT_STEW);
    ItemType RABBIT_FOOT = asItemType(Material.RABBIT_FOOT);
    ItemType RABBIT_HIDE = asItemType(Material.RABBIT_HIDE);
    ItemType ARMOR_STAND = asItemType(Material.ARMOR_STAND);
    ItemType IRON_HORSE_ARMOR = asItemType(Material.IRON_HORSE_ARMOR);
    ItemType GOLDEN_HORSE_ARMOR = asItemType(Material.GOLDEN_HORSE_ARMOR);
    ItemType DIAMOND_HORSE_ARMOR = asItemType(Material.DIAMOND_HORSE_ARMOR);
    ItemType LEATHER_HORSE_ARMOR = asItemType(Material.LEATHER_HORSE_ARMOR);
    ItemType LEAD = asItemType(Material.LEAD);
    ItemType NAME_TAG = asItemType(Material.NAME_TAG);
    ItemType COMMAND_BLOCK_MINECART = asItemType(Material.COMMAND_BLOCK_MINECART);
    ItemType MUTTON = asItemType(Material.MUTTON);
    ItemType COOKED_MUTTON = asItemType(Material.COOKED_MUTTON);
    ItemType WHITE_BANNER = asItemType(Material.WHITE_BANNER);
    ItemType ORANGE_BANNER = asItemType(Material.ORANGE_BANNER);
    ItemType MAGENTA_BANNER = asItemType(Material.MAGENTA_BANNER);
    ItemType LIGHT_BLUE_BANNER = asItemType(Material.LIGHT_BLUE_BANNER);
    ItemType YELLOW_BANNER = asItemType(Material.YELLOW_BANNER);
    ItemType LIME_BANNER = asItemType(Material.LIME_BANNER);
    ItemType PINK_BANNER = asItemType(Material.PINK_BANNER);
    ItemType GRAY_BANNER = asItemType(Material.GRAY_BANNER);
    ItemType LIGHT_GRAY_BANNER = asItemType(Material.LIGHT_GRAY_BANNER);
    ItemType CYAN_BANNER = asItemType(Material.CYAN_BANNER);
    ItemType PURPLE_BANNER = asItemType(Material.PURPLE_BANNER);
    ItemType BLUE_BANNER = asItemType(Material.BLUE_BANNER);
    ItemType BROWN_BANNER = asItemType(Material.BROWN_BANNER);
    ItemType GREEN_BANNER = asItemType(Material.GREEN_BANNER);
    ItemType RED_BANNER = asItemType(Material.RED_BANNER);
    ItemType BLACK_BANNER = asItemType(Material.BLACK_BANNER);
    ItemType END_CRYSTAL = asItemType(Material.END_CRYSTAL);
    ItemType CHORUS_FRUIT = asItemType(Material.CHORUS_FRUIT);
    ItemType POPPED_CHORUS_FRUIT = asItemType(Material.POPPED_CHORUS_FRUIT);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType TORCHFLOWER_SEEDS = asItemType(Material.TORCHFLOWER_SEEDS);
    ItemType BEETROOT = asItemType(Material.BEETROOT);
    ItemType BEETROOT_SEEDS = asItemType(Material.BEETROOT_SEEDS);
    ItemType BEETROOT_SOUP = asItemType(Material.BEETROOT_SOUP);
    ItemType DRAGON_BREATH = asItemType(Material.DRAGON_BREATH);
    ItemType SPLASH_POTION = asItemType(Material.SPLASH_POTION);
    ItemType SPECTRAL_ARROW = asItemType(Material.SPECTRAL_ARROW);
    ItemType TIPPED_ARROW = asItemType(Material.TIPPED_ARROW);
    ItemType LINGERING_POTION = asItemType(Material.LINGERING_POTION);
    ItemType SHIELD = asItemType(Material.SHIELD);
    ItemType TOTEM_OF_UNDYING = asItemType(Material.TOTEM_OF_UNDYING);
    ItemType SHULKER_SHELL = asItemType(Material.SHULKER_SHELL);
    ItemType IRON_NUGGET = asItemType(Material.IRON_NUGGET);
    ItemType KNOWLEDGE_BOOK = asItemType(Material.KNOWLEDGE_BOOK);
    ItemType DEBUG_STICK = asItemType(Material.DEBUG_STICK);
    ItemType MUSIC_DISC_13 = asItemType(Material.MUSIC_DISC_13);
    ItemType MUSIC_DISC_CAT = asItemType(Material.MUSIC_DISC_CAT);
    ItemType MUSIC_DISC_BLOCKS = asItemType(Material.MUSIC_DISC_BLOCKS);
    ItemType MUSIC_DISC_CHIRP = asItemType(Material.MUSIC_DISC_CHIRP);
    ItemType MUSIC_DISC_FAR = asItemType(Material.MUSIC_DISC_FAR);
    ItemType MUSIC_DISC_MALL = asItemType(Material.MUSIC_DISC_MALL);
    ItemType MUSIC_DISC_MELLOHI = asItemType(Material.MUSIC_DISC_MELLOHI);
    ItemType MUSIC_DISC_STAL = asItemType(Material.MUSIC_DISC_STAL);
    ItemType MUSIC_DISC_STRAD = asItemType(Material.MUSIC_DISC_STRAD);
    ItemType MUSIC_DISC_WARD = asItemType(Material.MUSIC_DISC_WARD);
    ItemType MUSIC_DISC_11 = asItemType(Material.MUSIC_DISC_11);
    ItemType MUSIC_DISC_WAIT = asItemType(Material.MUSIC_DISC_WAIT);
    ItemType MUSIC_DISC_OTHERSIDE = asItemType(Material.MUSIC_DISC_OTHERSIDE);
    ItemType MUSIC_DISC_5 = asItemType(Material.MUSIC_DISC_5);
    ItemType MUSIC_DISC_PIGSTEP = asItemType(Material.MUSIC_DISC_PIGSTEP);
    ItemType DISC_FRAGMENT_5 = asItemType(Material.DISC_FRAGMENT_5);
    ItemType TRIDENT = asItemType(Material.TRIDENT);
    ItemType PHANTOM_MEMBRANE = asItemType(Material.PHANTOM_MEMBRANE);
    ItemType NAUTILUS_SHELL = asItemType(Material.NAUTILUS_SHELL);
    ItemType HEART_OF_THE_SEA = asItemType(Material.HEART_OF_THE_SEA);
    ItemType CROSSBOW = asItemType(Material.CROSSBOW);
    ItemType SUSPICIOUS_STEW = asItemType(Material.SUSPICIOUS_STEW);
    ItemType LOOM = asItemType(Material.LOOM);
    ItemType FLOWER_BANNER_PATTERN = asItemType(Material.FLOWER_BANNER_PATTERN);
    ItemType CREEPER_BANNER_PATTERN = asItemType(Material.CREEPER_BANNER_PATTERN);
    ItemType SKULL_BANNER_PATTERN = asItemType(Material.SKULL_BANNER_PATTERN);
    ItemType MOJANG_BANNER_PATTERN = asItemType(Material.MOJANG_BANNER_PATTERN);
    ItemType GLOBE_BANNER_PATTERN = asItemType(Material.GLOBE_BANNER_PATTERN);
    ItemType PIGLIN_BANNER_PATTERN = asItemType(Material.PIGLIN_BANNER_PATTERN);
    ItemType GOAT_HORN = asItemType(Material.GOAT_HORN);
    ItemType COMPOSTER = asItemType(Material.COMPOSTER);
    ItemType BARREL = asItemType(Material.BARREL);
    ItemType SMOKER = asItemType(Material.SMOKER);
    ItemType BLAST_FURNACE = asItemType(Material.BLAST_FURNACE);
    ItemType CARTOGRAPHY_TABLE = asItemType(Material.CARTOGRAPHY_TABLE);
    ItemType FLETCHING_TABLE = asItemType(Material.FLETCHING_TABLE);
    ItemType GRINDSTONE = asItemType(Material.GRINDSTONE);
    ItemType SMITHING_TABLE = asItemType(Material.SMITHING_TABLE);
    ItemType STONECUTTER = asItemType(Material.STONECUTTER);
    ItemType BELL = asItemType(Material.BELL);
    ItemType LANTERN = asItemType(Material.LANTERN);
    ItemType SOUL_LANTERN = asItemType(Material.SOUL_LANTERN);
    ItemType SWEET_BERRIES = asItemType(Material.SWEET_BERRIES);
    ItemType GLOW_BERRIES = asItemType(Material.GLOW_BERRIES);
    ItemType CAMPFIRE = asItemType(Material.CAMPFIRE);
    ItemType SOUL_CAMPFIRE = asItemType(Material.SOUL_CAMPFIRE);
    ItemType SHROOMLIGHT = asItemType(Material.SHROOMLIGHT);
    ItemType HONEYCOMB = asItemType(Material.HONEYCOMB);
    ItemType BEE_NEST = asItemType(Material.BEE_NEST);
    ItemType BEEHIVE = asItemType(Material.BEEHIVE);
    ItemType HONEY_BOTTLE = asItemType(Material.HONEY_BOTTLE);
    ItemType HONEYCOMB_BLOCK = asItemType(Material.HONEYCOMB_BLOCK);
    ItemType LODESTONE = asItemType(Material.LODESTONE);
    ItemType CRYING_OBSIDIAN = asItemType(Material.CRYING_OBSIDIAN);
    ItemType BLACKSTONE = asItemType(Material.BLACKSTONE);
    ItemType BLACKSTONE_SLAB = asItemType(Material.BLACKSTONE_SLAB);
    ItemType BLACKSTONE_STAIRS = asItemType(Material.BLACKSTONE_STAIRS);
    ItemType GILDED_BLACKSTONE = asItemType(Material.GILDED_BLACKSTONE);
    ItemType POLISHED_BLACKSTONE = asItemType(Material.POLISHED_BLACKSTONE);
    ItemType POLISHED_BLACKSTONE_SLAB = asItemType(Material.POLISHED_BLACKSTONE_SLAB);
    ItemType POLISHED_BLACKSTONE_STAIRS = asItemType(Material.POLISHED_BLACKSTONE_STAIRS);
    ItemType CHISELED_POLISHED_BLACKSTONE = asItemType(Material.CHISELED_POLISHED_BLACKSTONE);
    ItemType POLISHED_BLACKSTONE_BRICKS = asItemType(Material.POLISHED_BLACKSTONE_BRICKS);
    ItemType POLISHED_BLACKSTONE_BRICK_SLAB = asItemType(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
    ItemType POLISHED_BLACKSTONE_BRICK_STAIRS = asItemType(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
    ItemType CRACKED_POLISHED_BLACKSTONE_BRICKS = asItemType(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    ItemType RESPAWN_ANCHOR = asItemType(Material.RESPAWN_ANCHOR);
    ItemType CANDLE = asItemType(Material.CANDLE);
    ItemType WHITE_CANDLE = asItemType(Material.WHITE_CANDLE);
    ItemType ORANGE_CANDLE = asItemType(Material.ORANGE_CANDLE);
    ItemType MAGENTA_CANDLE = asItemType(Material.MAGENTA_CANDLE);
    ItemType LIGHT_BLUE_CANDLE = asItemType(Material.LIGHT_BLUE_CANDLE);
    ItemType YELLOW_CANDLE = asItemType(Material.YELLOW_CANDLE);
    ItemType LIME_CANDLE = asItemType(Material.LIME_CANDLE);
    ItemType PINK_CANDLE = asItemType(Material.PINK_CANDLE);
    ItemType GRAY_CANDLE = asItemType(Material.GRAY_CANDLE);
    ItemType LIGHT_GRAY_CANDLE = asItemType(Material.LIGHT_GRAY_CANDLE);
    ItemType CYAN_CANDLE = asItemType(Material.CYAN_CANDLE);
    ItemType PURPLE_CANDLE = asItemType(Material.PURPLE_CANDLE);
    ItemType BLUE_CANDLE = asItemType(Material.BLUE_CANDLE);
    ItemType BROWN_CANDLE = asItemType(Material.BROWN_CANDLE);
    ItemType GREEN_CANDLE = asItemType(Material.GREEN_CANDLE);
    ItemType RED_CANDLE = asItemType(Material.RED_CANDLE);
    ItemType BLACK_CANDLE = asItemType(Material.BLACK_CANDLE);
    ItemType SMALL_AMETHYST_BUD = asItemType(Material.SMALL_AMETHYST_BUD);
    ItemType MEDIUM_AMETHYST_BUD = asItemType(Material.MEDIUM_AMETHYST_BUD);
    ItemType LARGE_AMETHYST_BUD = asItemType(Material.LARGE_AMETHYST_BUD);
    ItemType AMETHYST_CLUSTER = asItemType(Material.AMETHYST_CLUSTER);
    ItemType POINTED_DRIPSTONE = asItemType(Material.POINTED_DRIPSTONE);
    ItemType OCHRE_FROGLIGHT = asItemType(Material.OCHRE_FROGLIGHT);
    ItemType VERDANT_FROGLIGHT = asItemType(Material.VERDANT_FROGLIGHT);
    ItemType PEARLESCENT_FROGLIGHT = asItemType(Material.PEARLESCENT_FROGLIGHT);
    ItemType FROGSPAWN = asItemType(Material.FROGSPAWN);
    ItemType ECHO_SHARD = asItemType(Material.ECHO_SHARD);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType BRUSH = asItemType(Material.BRUSH);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType NETHERITE_UPGRADE_SMITHING_TEMPLATE = asItemType(Material.NETHERITE_UPGRADE_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType DUNE_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType COAST_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.COAST_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType WILD_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.WILD_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType WARD_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.WARD_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType EYE_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.EYE_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType VEX_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.VEX_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType TIDE_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.TIDE_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType RIB_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.RIB_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE = asItemType(Material.SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType POTTERY_SHARD_ARCHER = asItemType(Material.POTTERY_SHARD_ARCHER);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType POTTERY_SHARD_PRIZE = asItemType(Material.POTTERY_SHARD_PRIZE);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType POTTERY_SHARD_ARMS_UP = asItemType(Material.POTTERY_SHARD_ARMS_UP);
    @MinecraftExperimental
    @ApiStatus.Experimental
    ItemType POTTERY_SHARD_SKULL = asItemType(Material.POTTERY_SHARD_SKULL);
    //</editor-fold>

    @Contract("null -> null; !null -> !null")
    @Nullable
    static ItemType asItemType(@Nullable Material material) {
        if (material == null) {
            return null;
        }

        return material.asItemType();
    }

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
     * <br>
     * Only available when {@link #isItem()} is true.
     *
     * @return the item left behind when crafting, or null if nothing is.
     */
    @Nullable
    Material getCraftingRemainingItem();

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

    /**
     * Get the translation key of the item associated with this material, or
     * null if this material does not have an associated item.
     *
     * @return the translation key of the item associated with this material, or
     * null if this material does not have an associated item
     */
    @Nullable
    String getItemTranslationKey();
}
