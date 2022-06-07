package org.bukkit.block;

import java.util.function.Consumer;
import org.bukkit.Material;
import org.bukkit.block.data.Ageable;
import org.bukkit.block.data.AnaloguePowerable;
import org.bukkit.block.data.Bisected;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.Directional;
import org.bukkit.block.data.Levelled;
import org.bukkit.block.data.Lightable;
import org.bukkit.block.data.MultipleFacing;
import org.bukkit.block.data.Orientable;
import org.bukkit.block.data.Powerable;
import org.bukkit.block.data.Rail;
import org.bukkit.block.data.Rotatable;
import org.bukkit.block.data.Snowable;
import org.bukkit.block.data.Waterlogged;
import org.bukkit.block.data.type.AmethystCluster;
import org.bukkit.block.data.type.Bamboo;
import org.bukkit.block.data.type.Bed;
import org.bukkit.block.data.type.Beehive;
import org.bukkit.block.data.type.Bell;
import org.bukkit.block.data.type.BigDripleaf;
import org.bukkit.block.data.type.BrewingStand;
import org.bukkit.block.data.type.BubbleColumn;
import org.bukkit.block.data.type.Cake;
import org.bukkit.block.data.type.Campfire;
import org.bukkit.block.data.type.Candle;
import org.bukkit.block.data.type.CaveVines;
import org.bukkit.block.data.type.CaveVinesPlant;
import org.bukkit.block.data.type.Chain;
import org.bukkit.block.data.type.Chest;
import org.bukkit.block.data.type.Cocoa;
import org.bukkit.block.data.type.CommandBlock;
import org.bukkit.block.data.type.Comparator;
import org.bukkit.block.data.type.CoralWallFan;
import org.bukkit.block.data.type.DaylightDetector;
import org.bukkit.block.data.type.Dispenser;
import org.bukkit.block.data.type.Door;
import org.bukkit.block.data.type.Dripleaf;
import org.bukkit.block.data.type.EndPortalFrame;
import org.bukkit.block.data.type.EnderChest;
import org.bukkit.block.data.type.Farmland;
import org.bukkit.block.data.type.Fence;
import org.bukkit.block.data.type.Fire;
import org.bukkit.block.data.type.Furnace;
import org.bukkit.block.data.type.Gate;
import org.bukkit.block.data.type.GlassPane;
import org.bukkit.block.data.type.GlowLichen;
import org.bukkit.block.data.type.Grindstone;
import org.bukkit.block.data.type.Hopper;
import org.bukkit.block.data.type.Jigsaw;
import org.bukkit.block.data.type.Jukebox;
import org.bukkit.block.data.type.Ladder;
import org.bukkit.block.data.type.Lantern;
import org.bukkit.block.data.type.Leaves;
import org.bukkit.block.data.type.Lectern;
import org.bukkit.block.data.type.Light;
import org.bukkit.block.data.type.LightningRod;
import org.bukkit.block.data.type.MangrovePropagule;
import org.bukkit.block.data.type.NoteBlock;
import org.bukkit.block.data.type.Observer;
import org.bukkit.block.data.type.Piston;
import org.bukkit.block.data.type.PistonHead;
import org.bukkit.block.data.type.PointedDripstone;
import org.bukkit.block.data.type.RedstoneRail;
import org.bukkit.block.data.type.RedstoneWallTorch;
import org.bukkit.block.data.type.RedstoneWire;
import org.bukkit.block.data.type.Repeater;
import org.bukkit.block.data.type.RespawnAnchor;
import org.bukkit.block.data.type.Sapling;
import org.bukkit.block.data.type.Scaffolding;
import org.bukkit.block.data.type.SculkSensor;
import org.bukkit.block.data.type.SeaPickle;
import org.bukkit.block.data.type.Sign;
import org.bukkit.block.data.type.Slab;
import org.bukkit.block.data.type.SmallDripleaf;
import org.bukkit.block.data.type.Snow;
import org.bukkit.block.data.type.Stairs;
import org.bukkit.block.data.type.StructureBlock;
import org.bukkit.block.data.type.Switch;
import org.bukkit.block.data.type.TNT;
import org.bukkit.block.data.type.TechnicalPiston;
import org.bukkit.block.data.type.TrapDoor;
import org.bukkit.block.data.type.Tripwire;
import org.bukkit.block.data.type.TripwireHook;
import org.bukkit.block.data.type.TurtleEgg;
import org.bukkit.block.data.type.Wall;
import org.bukkit.block.data.type.WallSign;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface BlockType<B extends BlockData> extends Material {
    //<editor-fold desc="BlockTypes" defaultstate="collapsed">
    BlockType<BlockData> AIR = asBlockType(Material.AIR);
    BlockType<BlockData> STONE = asBlockType(Material.STONE);
    BlockType<BlockData> GRANITE = asBlockType(Material.GRANITE);
    BlockType<BlockData> POLISHED_GRANITE = asBlockType(Material.POLISHED_GRANITE);
    BlockType<BlockData> DIORITE = asBlockType(Material.DIORITE);
    BlockType<BlockData> POLISHED_DIORITE = asBlockType(Material.POLISHED_DIORITE);
    BlockType<BlockData> ANDESITE = asBlockType(Material.ANDESITE);
    BlockType<BlockData> POLISHED_ANDESITE = asBlockType(Material.POLISHED_ANDESITE);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> DEEPSLATE = asBlockType(Material.DEEPSLATE);
    BlockType<BlockData> COBBLED_DEEPSLATE = asBlockType(Material.COBBLED_DEEPSLATE);
    BlockType<BlockData> POLISHED_DEEPSLATE = asBlockType(Material.POLISHED_DEEPSLATE);
    BlockType<BlockData> CALCITE = asBlockType(Material.CALCITE);
    BlockType<BlockData> TUFF = asBlockType(Material.TUFF);
    BlockType<BlockData> DRIPSTONE_BLOCK = asBlockType(Material.DRIPSTONE_BLOCK);
    /**
     * BlockData: {@link Snowable}
     */
    BlockType<Snowable> GRASS_BLOCK = asBlockType(Material.GRASS_BLOCK);
    BlockType<BlockData> DIRT = asBlockType(Material.DIRT);
    BlockType<BlockData> COARSE_DIRT = asBlockType(Material.COARSE_DIRT);
    /**
     * BlockData: {@link Snowable}
     */
    BlockType<Snowable> PODZOL = asBlockType(Material.PODZOL);
    BlockType<BlockData> ROOTED_DIRT = asBlockType(Material.ROOTED_DIRT);
    BlockType<BlockData> MUD = asBlockType(Material.MUD);
    BlockType<BlockData> CRIMSON_NYLIUM = asBlockType(Material.CRIMSON_NYLIUM);
    BlockType<BlockData> WARPED_NYLIUM = asBlockType(Material.WARPED_NYLIUM);
    BlockType<BlockData> COBBLESTONE = asBlockType(Material.COBBLESTONE);
    BlockType<BlockData> OAK_PLANKS = asBlockType(Material.OAK_PLANKS);
    BlockType<BlockData> SPRUCE_PLANKS = asBlockType(Material.SPRUCE_PLANKS);
    BlockType<BlockData> BIRCH_PLANKS = asBlockType(Material.BIRCH_PLANKS);
    BlockType<BlockData> JUNGLE_PLANKS = asBlockType(Material.JUNGLE_PLANKS);
    BlockType<BlockData> ACACIA_PLANKS = asBlockType(Material.ACACIA_PLANKS);
    BlockType<BlockData> DARK_OAK_PLANKS = asBlockType(Material.DARK_OAK_PLANKS);
    BlockType<BlockData> MANGROVE_PLANKS = asBlockType(Material.MANGROVE_PLANKS);
    BlockType<BlockData> CRIMSON_PLANKS = asBlockType(Material.CRIMSON_PLANKS);
    BlockType<BlockData> WARPED_PLANKS = asBlockType(Material.WARPED_PLANKS);
    /**
     * BlockData: {@link Sapling}
     */
    BlockType<Sapling> OAK_SAPLING = asBlockType(Material.OAK_SAPLING);
    /**
     * BlockData: {@link Sapling}
     */
    BlockType<Sapling> SPRUCE_SAPLING = asBlockType(Material.SPRUCE_SAPLING);
    /**
     * BlockData: {@link Sapling}
     */
    BlockType<Sapling> BIRCH_SAPLING = asBlockType(Material.BIRCH_SAPLING);
    /**
     * BlockData: {@link Sapling}
     */
    BlockType<Sapling> JUNGLE_SAPLING = asBlockType(Material.JUNGLE_SAPLING);
    /**
     * BlockData: {@link Sapling}
     */
    BlockType<Sapling> ACACIA_SAPLING = asBlockType(Material.ACACIA_SAPLING);
    /**
     * BlockData: {@link Sapling}
     */
    BlockType<Sapling> DARK_OAK_SAPLING = asBlockType(Material.DARK_OAK_SAPLING);
    /**
     * BlockData: {@link MangrovePropagule}
     */
    BlockType<MangrovePropagule> MANGROVE_PROPAGULE = asBlockType(Material.MANGROVE_PROPAGULE);
    BlockType<BlockData> BEDROCK = asBlockType(Material.BEDROCK);
    BlockType<BlockData> SAND = asBlockType(Material.SAND);
    BlockType<BlockData> RED_SAND = asBlockType(Material.RED_SAND);
    BlockType<BlockData> GRAVEL = asBlockType(Material.GRAVEL);
    BlockType<BlockData> COAL_ORE = asBlockType(Material.COAL_ORE);
    BlockType<BlockData> DEEPSLATE_COAL_ORE = asBlockType(Material.DEEPSLATE_COAL_ORE);
    BlockType<BlockData> IRON_ORE = asBlockType(Material.IRON_ORE);
    BlockType<BlockData> DEEPSLATE_IRON_ORE = asBlockType(Material.DEEPSLATE_IRON_ORE);
    BlockType<BlockData> COPPER_ORE = asBlockType(Material.COPPER_ORE);
    BlockType<BlockData> DEEPSLATE_COPPER_ORE = asBlockType(Material.DEEPSLATE_COPPER_ORE);
    BlockType<BlockData> GOLD_ORE = asBlockType(Material.GOLD_ORE);
    BlockType<BlockData> DEEPSLATE_GOLD_ORE = asBlockType(Material.DEEPSLATE_GOLD_ORE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> REDSTONE_ORE = asBlockType(Material.REDSTONE_ORE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> DEEPSLATE_REDSTONE_ORE = asBlockType(Material.DEEPSLATE_REDSTONE_ORE);
    BlockType<BlockData> EMERALD_ORE = asBlockType(Material.EMERALD_ORE);
    BlockType<BlockData> DEEPSLATE_EMERALD_ORE = asBlockType(Material.DEEPSLATE_EMERALD_ORE);
    BlockType<BlockData> LAPIS_ORE = asBlockType(Material.LAPIS_ORE);
    BlockType<BlockData> DEEPSLATE_LAPIS_ORE = asBlockType(Material.DEEPSLATE_LAPIS_ORE);
    BlockType<BlockData> DIAMOND_ORE = asBlockType(Material.DIAMOND_ORE);
    BlockType<BlockData> DEEPSLATE_DIAMOND_ORE = asBlockType(Material.DEEPSLATE_DIAMOND_ORE);
    BlockType<BlockData> NETHER_GOLD_ORE = asBlockType(Material.NETHER_GOLD_ORE);
    BlockType<BlockData> NETHER_QUARTZ_ORE = asBlockType(Material.NETHER_QUARTZ_ORE);
    BlockType<BlockData> ANCIENT_DEBRIS = asBlockType(Material.ANCIENT_DEBRIS);
    BlockType<BlockData> COAL_BLOCK = asBlockType(Material.COAL_BLOCK);
    BlockType<BlockData> RAW_IRON_BLOCK = asBlockType(Material.RAW_IRON_BLOCK);
    BlockType<BlockData> RAW_COPPER_BLOCK = asBlockType(Material.RAW_COPPER_BLOCK);
    BlockType<BlockData> RAW_GOLD_BLOCK = asBlockType(Material.RAW_GOLD_BLOCK);
    BlockType<BlockData> AMETHYST_BLOCK = asBlockType(Material.AMETHYST_BLOCK);
    BlockType<BlockData> BUDDING_AMETHYST = asBlockType(Material.BUDDING_AMETHYST);
    BlockType<BlockData> IRON_BLOCK = asBlockType(Material.IRON_BLOCK);
    BlockType<BlockData> COPPER_BLOCK = asBlockType(Material.COPPER_BLOCK);
    BlockType<BlockData> GOLD_BLOCK = asBlockType(Material.GOLD_BLOCK);
    BlockType<BlockData> DIAMOND_BLOCK = asBlockType(Material.DIAMOND_BLOCK);
    BlockType<BlockData> NETHERITE_BLOCK = asBlockType(Material.NETHERITE_BLOCK);
    BlockType<BlockData> EXPOSED_COPPER = asBlockType(Material.EXPOSED_COPPER);
    BlockType<BlockData> WEATHERED_COPPER = asBlockType(Material.WEATHERED_COPPER);
    BlockType<BlockData> OXIDIZED_COPPER = asBlockType(Material.OXIDIZED_COPPER);
    BlockType<BlockData> CUT_COPPER = asBlockType(Material.CUT_COPPER);
    BlockType<BlockData> EXPOSED_CUT_COPPER = asBlockType(Material.EXPOSED_CUT_COPPER);
    BlockType<BlockData> WEATHERED_CUT_COPPER = asBlockType(Material.WEATHERED_CUT_COPPER);
    BlockType<BlockData> OXIDIZED_CUT_COPPER = asBlockType(Material.OXIDIZED_CUT_COPPER);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> CUT_COPPER_STAIRS = asBlockType(Material.CUT_COPPER_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> EXPOSED_CUT_COPPER_STAIRS = asBlockType(Material.EXPOSED_CUT_COPPER_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> WEATHERED_CUT_COPPER_STAIRS = asBlockType(Material.WEATHERED_CUT_COPPER_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> OXIDIZED_CUT_COPPER_STAIRS = asBlockType(Material.OXIDIZED_CUT_COPPER_STAIRS);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> CUT_COPPER_SLAB = asBlockType(Material.CUT_COPPER_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> EXPOSED_CUT_COPPER_SLAB = asBlockType(Material.EXPOSED_CUT_COPPER_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> WEATHERED_CUT_COPPER_SLAB = asBlockType(Material.WEATHERED_CUT_COPPER_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> OXIDIZED_CUT_COPPER_SLAB = asBlockType(Material.OXIDIZED_CUT_COPPER_SLAB);
    BlockType<BlockData> WAXED_COPPER_BLOCK = asBlockType(Material.WAXED_COPPER_BLOCK);
    BlockType<BlockData> WAXED_EXPOSED_COPPER = asBlockType(Material.WAXED_EXPOSED_COPPER);
    BlockType<BlockData> WAXED_WEATHERED_COPPER = asBlockType(Material.WAXED_WEATHERED_COPPER);
    BlockType<BlockData> WAXED_OXIDIZED_COPPER = asBlockType(Material.WAXED_OXIDIZED_COPPER);
    BlockType<BlockData> WAXED_CUT_COPPER = asBlockType(Material.WAXED_CUT_COPPER);
    BlockType<BlockData> WAXED_EXPOSED_CUT_COPPER = asBlockType(Material.WAXED_EXPOSED_CUT_COPPER);
    BlockType<BlockData> WAXED_WEATHERED_CUT_COPPER = asBlockType(Material.WAXED_WEATHERED_CUT_COPPER);
    BlockType<BlockData> WAXED_OXIDIZED_CUT_COPPER = asBlockType(Material.WAXED_OXIDIZED_CUT_COPPER);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> WAXED_CUT_COPPER_STAIRS = asBlockType(Material.WAXED_CUT_COPPER_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> WAXED_EXPOSED_CUT_COPPER_STAIRS = asBlockType(Material.WAXED_EXPOSED_CUT_COPPER_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> WAXED_WEATHERED_CUT_COPPER_STAIRS = asBlockType(Material.WAXED_WEATHERED_CUT_COPPER_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> WAXED_OXIDIZED_CUT_COPPER_STAIRS = asBlockType(Material.WAXED_OXIDIZED_CUT_COPPER_STAIRS);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> WAXED_CUT_COPPER_SLAB = asBlockType(Material.WAXED_CUT_COPPER_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> WAXED_EXPOSED_CUT_COPPER_SLAB = asBlockType(Material.WAXED_EXPOSED_CUT_COPPER_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> WAXED_WEATHERED_CUT_COPPER_SLAB = asBlockType(Material.WAXED_WEATHERED_CUT_COPPER_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> WAXED_OXIDIZED_CUT_COPPER_SLAB = asBlockType(Material.WAXED_OXIDIZED_CUT_COPPER_SLAB);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> OAK_LOG = asBlockType(Material.OAK_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> SPRUCE_LOG = asBlockType(Material.SPRUCE_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> BIRCH_LOG = asBlockType(Material.BIRCH_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> JUNGLE_LOG = asBlockType(Material.JUNGLE_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> ACACIA_LOG = asBlockType(Material.ACACIA_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> DARK_OAK_LOG = asBlockType(Material.DARK_OAK_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> MANGROVE_LOG = asBlockType(Material.MANGROVE_LOG);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> MANGROVE_ROOTS = asBlockType(Material.MANGROVE_ROOTS);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> MUDDY_MANGROVE_ROOTS = asBlockType(Material.MUDDY_MANGROVE_ROOTS);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> CRIMSON_STEM = asBlockType(Material.CRIMSON_STEM);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> WARPED_STEM = asBlockType(Material.WARPED_STEM);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_OAK_LOG = asBlockType(Material.STRIPPED_OAK_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_SPRUCE_LOG = asBlockType(Material.STRIPPED_SPRUCE_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_BIRCH_LOG = asBlockType(Material.STRIPPED_BIRCH_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_JUNGLE_LOG = asBlockType(Material.STRIPPED_JUNGLE_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_ACACIA_LOG = asBlockType(Material.STRIPPED_ACACIA_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_DARK_OAK_LOG = asBlockType(Material.STRIPPED_DARK_OAK_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_MANGROVE_LOG = asBlockType(Material.STRIPPED_MANGROVE_LOG);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_CRIMSON_STEM = asBlockType(Material.STRIPPED_CRIMSON_STEM);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_WARPED_STEM = asBlockType(Material.STRIPPED_WARPED_STEM);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_OAK_WOOD = asBlockType(Material.STRIPPED_OAK_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_SPRUCE_WOOD = asBlockType(Material.STRIPPED_SPRUCE_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_BIRCH_WOOD = asBlockType(Material.STRIPPED_BIRCH_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_JUNGLE_WOOD = asBlockType(Material.STRIPPED_JUNGLE_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_ACACIA_WOOD = asBlockType(Material.STRIPPED_ACACIA_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_DARK_OAK_WOOD = asBlockType(Material.STRIPPED_DARK_OAK_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_MANGROVE_WOOD = asBlockType(Material.STRIPPED_MANGROVE_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_CRIMSON_HYPHAE = asBlockType(Material.STRIPPED_CRIMSON_HYPHAE);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> STRIPPED_WARPED_HYPHAE = asBlockType(Material.STRIPPED_WARPED_HYPHAE);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> OAK_WOOD = asBlockType(Material.OAK_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> SPRUCE_WOOD = asBlockType(Material.SPRUCE_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> BIRCH_WOOD = asBlockType(Material.BIRCH_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> JUNGLE_WOOD = asBlockType(Material.JUNGLE_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> ACACIA_WOOD = asBlockType(Material.ACACIA_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> DARK_OAK_WOOD = asBlockType(Material.DARK_OAK_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> MANGROVE_WOOD = asBlockType(Material.MANGROVE_WOOD);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> CRIMSON_HYPHAE = asBlockType(Material.CRIMSON_HYPHAE);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> WARPED_HYPHAE = asBlockType(Material.WARPED_HYPHAE);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> OAK_LEAVES = asBlockType(Material.OAK_LEAVES);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> SPRUCE_LEAVES = asBlockType(Material.SPRUCE_LEAVES);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> BIRCH_LEAVES = asBlockType(Material.BIRCH_LEAVES);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> JUNGLE_LEAVES = asBlockType(Material.JUNGLE_LEAVES);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> ACACIA_LEAVES = asBlockType(Material.ACACIA_LEAVES);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> DARK_OAK_LEAVES = asBlockType(Material.DARK_OAK_LEAVES);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> MANGROVE_LEAVES = asBlockType(Material.MANGROVE_LEAVES);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> AZALEA_LEAVES = asBlockType(Material.AZALEA_LEAVES);
    /**
     * BlockData: {@link Leaves}
     */
    BlockType<Leaves> FLOWERING_AZALEA_LEAVES = asBlockType(Material.FLOWERING_AZALEA_LEAVES);
    BlockType<BlockData> SPONGE = asBlockType(Material.SPONGE);
    BlockType<BlockData> WET_SPONGE = asBlockType(Material.WET_SPONGE);
    BlockType<BlockData> GLASS = asBlockType(Material.GLASS);
    BlockType<BlockData> TINTED_GLASS = asBlockType(Material.TINTED_GLASS);
    BlockType<BlockData> LAPIS_BLOCK = asBlockType(Material.LAPIS_BLOCK);
    BlockType<BlockData> SANDSTONE = asBlockType(Material.SANDSTONE);
    BlockType<BlockData> CHISELED_SANDSTONE = asBlockType(Material.CHISELED_SANDSTONE);
    BlockType<BlockData> CUT_SANDSTONE = asBlockType(Material.CUT_SANDSTONE);
    BlockType<BlockData> COBWEB = asBlockType(Material.COBWEB);
    BlockType<BlockData> GRASS = asBlockType(Material.GRASS);
    BlockType<BlockData> FERN = asBlockType(Material.FERN);
    BlockType<BlockData> AZALEA = asBlockType(Material.AZALEA);
    BlockType<BlockData> FLOWERING_AZALEA = asBlockType(Material.FLOWERING_AZALEA);
    BlockType<BlockData> DEAD_BUSH = asBlockType(Material.DEAD_BUSH);
    BlockType<BlockData> SEAGRASS = asBlockType(Material.SEAGRASS);
    /**
     * BlockData: {@link SeaPickle}
     */
    BlockType<SeaPickle> SEA_PICKLE = asBlockType(Material.SEA_PICKLE);
    BlockType<BlockData> WHITE_WOOL = asBlockType(Material.WHITE_WOOL);
    BlockType<BlockData> ORANGE_WOOL = asBlockType(Material.ORANGE_WOOL);
    BlockType<BlockData> MAGENTA_WOOL = asBlockType(Material.MAGENTA_WOOL);
    BlockType<BlockData> LIGHT_BLUE_WOOL = asBlockType(Material.LIGHT_BLUE_WOOL);
    BlockType<BlockData> YELLOW_WOOL = asBlockType(Material.YELLOW_WOOL);
    BlockType<BlockData> LIME_WOOL = asBlockType(Material.LIME_WOOL);
    BlockType<BlockData> PINK_WOOL = asBlockType(Material.PINK_WOOL);
    BlockType<BlockData> GRAY_WOOL = asBlockType(Material.GRAY_WOOL);
    BlockType<BlockData> LIGHT_GRAY_WOOL = asBlockType(Material.LIGHT_GRAY_WOOL);
    BlockType<BlockData> CYAN_WOOL = asBlockType(Material.CYAN_WOOL);
    BlockType<BlockData> PURPLE_WOOL = asBlockType(Material.PURPLE_WOOL);
    BlockType<BlockData> BLUE_WOOL = asBlockType(Material.BLUE_WOOL);
    BlockType<BlockData> BROWN_WOOL = asBlockType(Material.BROWN_WOOL);
    BlockType<BlockData> GREEN_WOOL = asBlockType(Material.GREEN_WOOL);
    BlockType<BlockData> RED_WOOL = asBlockType(Material.RED_WOOL);
    BlockType<BlockData> BLACK_WOOL = asBlockType(Material.BLACK_WOOL);
    BlockType<BlockData> DANDELION = asBlockType(Material.DANDELION);
    BlockType<BlockData> POPPY = asBlockType(Material.POPPY);
    BlockType<BlockData> BLUE_ORCHID = asBlockType(Material.BLUE_ORCHID);
    BlockType<BlockData> ALLIUM = asBlockType(Material.ALLIUM);
    BlockType<BlockData> AZURE_BLUET = asBlockType(Material.AZURE_BLUET);
    BlockType<BlockData> RED_TULIP = asBlockType(Material.RED_TULIP);
    BlockType<BlockData> ORANGE_TULIP = asBlockType(Material.ORANGE_TULIP);
    BlockType<BlockData> WHITE_TULIP = asBlockType(Material.WHITE_TULIP);
    BlockType<BlockData> PINK_TULIP = asBlockType(Material.PINK_TULIP);
    BlockType<BlockData> OXEYE_DAISY = asBlockType(Material.OXEYE_DAISY);
    BlockType<BlockData> CORNFLOWER = asBlockType(Material.CORNFLOWER);
    BlockType<BlockData> LILY_OF_THE_VALLEY = asBlockType(Material.LILY_OF_THE_VALLEY);
    BlockType<BlockData> WITHER_ROSE = asBlockType(Material.WITHER_ROSE);
    BlockType<BlockData> SPORE_BLOSSOM = asBlockType(Material.SPORE_BLOSSOM);
    BlockType<BlockData> BROWN_MUSHROOM = asBlockType(Material.BROWN_MUSHROOM);
    BlockType<BlockData> RED_MUSHROOM = asBlockType(Material.RED_MUSHROOM);
    BlockType<BlockData> CRIMSON_FUNGUS = asBlockType(Material.CRIMSON_FUNGUS);
    BlockType<BlockData> WARPED_FUNGUS = asBlockType(Material.WARPED_FUNGUS);
    BlockType<BlockData> CRIMSON_ROOTS = asBlockType(Material.CRIMSON_ROOTS);
    BlockType<BlockData> WARPED_ROOTS = asBlockType(Material.WARPED_ROOTS);
    BlockType<BlockData> NETHER_SPROUTS = asBlockType(Material.NETHER_SPROUTS);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> WEEPING_VINES = asBlockType(Material.WEEPING_VINES);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> TWISTING_VINES = asBlockType(Material.TWISTING_VINES);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> SUGAR_CANE = asBlockType(Material.SUGAR_CANE);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> KELP = asBlockType(Material.KELP);
    BlockType<BlockData> MOSS_CARPET = asBlockType(Material.MOSS_CARPET);
    BlockType<BlockData> MOSS_BLOCK = asBlockType(Material.MOSS_BLOCK);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> HANGING_ROOTS = asBlockType(Material.HANGING_ROOTS);
    /**
     * BlockData: {@link BigDripleaf}
     */
    BlockType<BigDripleaf> BIG_DRIPLEAF = asBlockType(Material.BIG_DRIPLEAF);
    /**
     * BlockData: {@link SmallDripleaf}
     */
    BlockType<SmallDripleaf> SMALL_DRIPLEAF = asBlockType(Material.SMALL_DRIPLEAF);
    /**
     * BlockData: {@link Bamboo}
     */
    BlockType<Bamboo> BAMBOO = asBlockType(Material.BAMBOO);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> OAK_SLAB = asBlockType(Material.OAK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> SPRUCE_SLAB = asBlockType(Material.SPRUCE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> BIRCH_SLAB = asBlockType(Material.BIRCH_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> JUNGLE_SLAB = asBlockType(Material.JUNGLE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> ACACIA_SLAB = asBlockType(Material.ACACIA_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> DARK_OAK_SLAB = asBlockType(Material.DARK_OAK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> MANGROVE_SLAB = asBlockType(Material.MANGROVE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> CRIMSON_SLAB = asBlockType(Material.CRIMSON_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> WARPED_SLAB = asBlockType(Material.WARPED_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> STONE_SLAB = asBlockType(Material.STONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> SMOOTH_STONE_SLAB = asBlockType(Material.SMOOTH_STONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> SANDSTONE_SLAB = asBlockType(Material.SANDSTONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> CUT_SANDSTONE_SLAB = asBlockType(Material.CUT_SANDSTONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> PETRIFIED_OAK_SLAB = asBlockType(Material.PETRIFIED_OAK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> COBBLESTONE_SLAB = asBlockType(Material.COBBLESTONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> BRICK_SLAB = asBlockType(Material.BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> STONE_BRICK_SLAB = asBlockType(Material.STONE_BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> MUD_BRICK_SLAB = asBlockType(Material.MUD_BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> NETHER_BRICK_SLAB = asBlockType(Material.NETHER_BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> QUARTZ_SLAB = asBlockType(Material.QUARTZ_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> RED_SANDSTONE_SLAB = asBlockType(Material.RED_SANDSTONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> CUT_RED_SANDSTONE_SLAB = asBlockType(Material.CUT_RED_SANDSTONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> PURPUR_SLAB = asBlockType(Material.PURPUR_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> PRISMARINE_SLAB = asBlockType(Material.PRISMARINE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> PRISMARINE_BRICK_SLAB = asBlockType(Material.PRISMARINE_BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> DARK_PRISMARINE_SLAB = asBlockType(Material.DARK_PRISMARINE_SLAB);
    BlockType<BlockData> SMOOTH_QUARTZ = asBlockType(Material.SMOOTH_QUARTZ);
    BlockType<BlockData> SMOOTH_RED_SANDSTONE = asBlockType(Material.SMOOTH_RED_SANDSTONE);
    BlockType<BlockData> SMOOTH_SANDSTONE = asBlockType(Material.SMOOTH_SANDSTONE);
    BlockType<BlockData> SMOOTH_STONE = asBlockType(Material.SMOOTH_STONE);
    BlockType<BlockData> BRICKS = asBlockType(Material.BRICKS);
    BlockType<BlockData> BOOKSHELF = asBlockType(Material.BOOKSHELF);
    BlockType<BlockData> MOSSY_COBBLESTONE = asBlockType(Material.MOSSY_COBBLESTONE);
    BlockType<BlockData> OBSIDIAN = asBlockType(Material.OBSIDIAN);
    BlockType<BlockData> TORCH = asBlockType(Material.TORCH);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> END_ROD = asBlockType(Material.END_ROD);
    /**
     * BlockData: {@link MultipleFacing}
     */
    BlockType<MultipleFacing> CHORUS_PLANT = asBlockType(Material.CHORUS_PLANT);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> CHORUS_FLOWER = asBlockType(Material.CHORUS_FLOWER);
    BlockType<BlockData> PURPUR_BLOCK = asBlockType(Material.PURPUR_BLOCK);
    BlockType<BlockData> PURPUR_PILLAR = asBlockType(Material.PURPUR_PILLAR);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> PURPUR_STAIRS = asBlockType(Material.PURPUR_STAIRS);
    BlockType<BlockData> SPAWNER = asBlockType(Material.SPAWNER);
    /**
     * BlockData: {@link Chest}
     */
    BlockType<Chest> CHEST = asBlockType(Material.CHEST);
    BlockType<BlockData> CRAFTING_TABLE = asBlockType(Material.CRAFTING_TABLE);
    /**
     * BlockData: {@link Farmland}
     */
    BlockType<Farmland> FARMLAND = asBlockType(Material.FARMLAND);
    /**
     * BlockData: {@link Furnace}
     */
    BlockType<Furnace> FURNACE = asBlockType(Material.FURNACE);
    /**
     * BlockData: {@link Ladder}
     */
    BlockType<Ladder> LADDER = asBlockType(Material.LADDER);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> COBBLESTONE_STAIRS = asBlockType(Material.COBBLESTONE_STAIRS);
    /**
     * BlockData: {@link Snow}
     */
    BlockType<Snow> SNOW = asBlockType(Material.SNOW);
    BlockType<BlockData> ICE = asBlockType(Material.ICE);
    BlockType<BlockData> SNOW_BLOCK = asBlockType(Material.SNOW_BLOCK);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> CACTUS = asBlockType(Material.CACTUS);
    BlockType<BlockData> CLAY = asBlockType(Material.CLAY);
    /**
     * BlockData: {@link Jukebox}
     */
    BlockType<Jukebox> JUKEBOX = asBlockType(Material.JUKEBOX);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> OAK_FENCE = asBlockType(Material.OAK_FENCE);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> SPRUCE_FENCE = asBlockType(Material.SPRUCE_FENCE);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> BIRCH_FENCE = asBlockType(Material.BIRCH_FENCE);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> JUNGLE_FENCE = asBlockType(Material.JUNGLE_FENCE);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> ACACIA_FENCE = asBlockType(Material.ACACIA_FENCE);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> DARK_OAK_FENCE = asBlockType(Material.DARK_OAK_FENCE);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> MANGROVE_FENCE = asBlockType(Material.MANGROVE_FENCE);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> CRIMSON_FENCE = asBlockType(Material.CRIMSON_FENCE);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> WARPED_FENCE = asBlockType(Material.WARPED_FENCE);
    BlockType<BlockData> PUMPKIN = asBlockType(Material.PUMPKIN);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> CARVED_PUMPKIN = asBlockType(Material.CARVED_PUMPKIN);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> JACK_O_LANTERN = asBlockType(Material.JACK_O_LANTERN);
    BlockType<BlockData> NETHERRACK = asBlockType(Material.NETHERRACK);
    BlockType<BlockData> SOUL_SAND = asBlockType(Material.SOUL_SAND);
    BlockType<BlockData> SOUL_SOIL = asBlockType(Material.SOUL_SOIL);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> BASALT = asBlockType(Material.BASALT);
    BlockType<BlockData> POLISHED_BASALT = asBlockType(Material.POLISHED_BASALT);
    BlockType<BlockData> SMOOTH_BASALT = asBlockType(Material.SMOOTH_BASALT);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> SOUL_TORCH = asBlockType(Material.SOUL_TORCH);
    BlockType<BlockData> GLOWSTONE = asBlockType(Material.GLOWSTONE);
    BlockType<BlockData> INFESTED_STONE = asBlockType(Material.INFESTED_STONE);
    BlockType<BlockData> INFESTED_COBBLESTONE = asBlockType(Material.INFESTED_COBBLESTONE);
    BlockType<BlockData> INFESTED_STONE_BRICKS = asBlockType(Material.INFESTED_STONE_BRICKS);
    BlockType<BlockData> INFESTED_MOSSY_STONE_BRICKS = asBlockType(Material.INFESTED_MOSSY_STONE_BRICKS);
    BlockType<BlockData> INFESTED_CRACKED_STONE_BRICKS = asBlockType(Material.INFESTED_CRACKED_STONE_BRICKS);
    BlockType<BlockData> INFESTED_CHISELED_STONE_BRICKS = asBlockType(Material.INFESTED_CHISELED_STONE_BRICKS);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> INFESTED_DEEPSLATE = asBlockType(Material.INFESTED_DEEPSLATE);
    BlockType<BlockData> STONE_BRICKS = asBlockType(Material.STONE_BRICKS);
    BlockType<BlockData> MOSSY_STONE_BRICKS = asBlockType(Material.MOSSY_STONE_BRICKS);
    BlockType<BlockData> CRACKED_STONE_BRICKS = asBlockType(Material.CRACKED_STONE_BRICKS);
    BlockType<BlockData> CHISELED_STONE_BRICKS = asBlockType(Material.CHISELED_STONE_BRICKS);
    BlockType<BlockData> PACKED_MUD = asBlockType(Material.PACKED_MUD);
    BlockType<BlockData> MUD_BRICKS = asBlockType(Material.MUD_BRICKS);
    BlockType<BlockData> DEEPSLATE_BRICKS = asBlockType(Material.DEEPSLATE_BRICKS);
    BlockType<BlockData> CRACKED_DEEPSLATE_BRICKS = asBlockType(Material.CRACKED_DEEPSLATE_BRICKS);
    BlockType<BlockData> DEEPSLATE_TILES = asBlockType(Material.DEEPSLATE_TILES);
    BlockType<BlockData> CRACKED_DEEPSLATE_TILES = asBlockType(Material.CRACKED_DEEPSLATE_TILES);
    BlockType<BlockData> CHISELED_DEEPSLATE = asBlockType(Material.CHISELED_DEEPSLATE);
    BlockType<BlockData> REINFORCED_DEEPSLATE = asBlockType(Material.REINFORCED_DEEPSLATE);
    /**
     * BlockData: {@link MultipleFacing}
     */
    BlockType<MultipleFacing> BROWN_MUSHROOM_BLOCK = asBlockType(Material.BROWN_MUSHROOM_BLOCK);
    /**
     * BlockData: {@link MultipleFacing}
     */
    BlockType<MultipleFacing> RED_MUSHROOM_BLOCK = asBlockType(Material.RED_MUSHROOM_BLOCK);
    /**
     * BlockData: {@link MultipleFacing}
     */
    BlockType<MultipleFacing> MUSHROOM_STEM = asBlockType(Material.MUSHROOM_STEM);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> IRON_BARS = asBlockType(Material.IRON_BARS);
    /**
     * BlockData: {@link Chain}
     */
    BlockType<Chain> CHAIN = asBlockType(Material.CHAIN);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> GLASS_PANE = asBlockType(Material.GLASS_PANE);
    BlockType<BlockData> MELON = asBlockType(Material.MELON);
    /**
     * BlockData: {@link MultipleFacing}
     */
    BlockType<MultipleFacing> VINE = asBlockType(Material.VINE);
    /**
     * BlockData: {@link GlowLichen}
     */
    BlockType<GlowLichen> GLOW_LICHEN = asBlockType(Material.GLOW_LICHEN);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> BRICK_STAIRS = asBlockType(Material.BRICK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> STONE_BRICK_STAIRS = asBlockType(Material.STONE_BRICK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> MUD_BRICK_STAIRS = asBlockType(Material.MUD_BRICK_STAIRS);
    /**
     * BlockData: {@link Snowable}
     */
    BlockType<Snowable> MYCELIUM = asBlockType(Material.MYCELIUM);
    BlockType<BlockData> LILY_PAD = asBlockType(Material.LILY_PAD);
    BlockType<BlockData> NETHER_BRICKS = asBlockType(Material.NETHER_BRICKS);
    BlockType<BlockData> CRACKED_NETHER_BRICKS = asBlockType(Material.CRACKED_NETHER_BRICKS);
    BlockType<BlockData> CHISELED_NETHER_BRICKS = asBlockType(Material.CHISELED_NETHER_BRICKS);
    /**
     * BlockData: {@link Fence}
     */
    BlockType<Fence> NETHER_BRICK_FENCE = asBlockType(Material.NETHER_BRICK_FENCE);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> NETHER_BRICK_STAIRS = asBlockType(Material.NETHER_BRICK_STAIRS);
    BlockType<BlockData> SCULK = asBlockType(Material.SCULK);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> SCULK_VEIN = asBlockType(Material.SCULK_VEIN);
    BlockType<BlockData> SCULK_CATALYST = asBlockType(Material.SCULK_CATALYST);
    BlockType<BlockData> SCULK_SHRIEKER = asBlockType(Material.SCULK_SHRIEKER);
    BlockType<BlockData> ENCHANTING_TABLE = asBlockType(Material.ENCHANTING_TABLE);
    /**
     * BlockData: {@link EndPortalFrame}
     */
    BlockType<EndPortalFrame> END_PORTAL_FRAME = asBlockType(Material.END_PORTAL_FRAME);
    BlockType<BlockData> END_STONE = asBlockType(Material.END_STONE);
    BlockType<BlockData> END_STONE_BRICKS = asBlockType(Material.END_STONE_BRICKS);
    BlockType<BlockData> DRAGON_EGG = asBlockType(Material.DRAGON_EGG);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> SANDSTONE_STAIRS = asBlockType(Material.SANDSTONE_STAIRS);
    /**
     * BlockData: {@link EnderChest}
     */
    BlockType<EnderChest> ENDER_CHEST = asBlockType(Material.ENDER_CHEST);
    BlockType<BlockData> EMERALD_BLOCK = asBlockType(Material.EMERALD_BLOCK);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> OAK_STAIRS = asBlockType(Material.OAK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> SPRUCE_STAIRS = asBlockType(Material.SPRUCE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> BIRCH_STAIRS = asBlockType(Material.BIRCH_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> JUNGLE_STAIRS = asBlockType(Material.JUNGLE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> ACACIA_STAIRS = asBlockType(Material.ACACIA_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> DARK_OAK_STAIRS = asBlockType(Material.DARK_OAK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> MANGROVE_STAIRS = asBlockType(Material.MANGROVE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> CRIMSON_STAIRS = asBlockType(Material.CRIMSON_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> WARPED_STAIRS = asBlockType(Material.WARPED_STAIRS);
    /**
     * BlockData: {@link CommandBlock}
     */
    BlockType<CommandBlock> COMMAND_BLOCK = asBlockType(Material.COMMAND_BLOCK);
    BlockType<BlockData> BEACON = asBlockType(Material.BEACON);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> COBBLESTONE_WALL = asBlockType(Material.COBBLESTONE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> MOSSY_COBBLESTONE_WALL = asBlockType(Material.MOSSY_COBBLESTONE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> BRICK_WALL = asBlockType(Material.BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> PRISMARINE_WALL = asBlockType(Material.PRISMARINE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> RED_SANDSTONE_WALL = asBlockType(Material.RED_SANDSTONE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> MOSSY_STONE_BRICK_WALL = asBlockType(Material.MOSSY_STONE_BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> GRANITE_WALL = asBlockType(Material.GRANITE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> STONE_BRICK_WALL = asBlockType(Material.STONE_BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> MUD_BRICK_WALL = asBlockType(Material.MUD_BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> NETHER_BRICK_WALL = asBlockType(Material.NETHER_BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> ANDESITE_WALL = asBlockType(Material.ANDESITE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> RED_NETHER_BRICK_WALL = asBlockType(Material.RED_NETHER_BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> SANDSTONE_WALL = asBlockType(Material.SANDSTONE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> END_STONE_BRICK_WALL = asBlockType(Material.END_STONE_BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> DIORITE_WALL = asBlockType(Material.DIORITE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> BLACKSTONE_WALL = asBlockType(Material.BLACKSTONE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> POLISHED_BLACKSTONE_WALL = asBlockType(Material.POLISHED_BLACKSTONE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> POLISHED_BLACKSTONE_BRICK_WALL = asBlockType(Material.POLISHED_BLACKSTONE_BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> COBBLED_DEEPSLATE_WALL = asBlockType(Material.COBBLED_DEEPSLATE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> POLISHED_DEEPSLATE_WALL = asBlockType(Material.POLISHED_DEEPSLATE_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> DEEPSLATE_BRICK_WALL = asBlockType(Material.DEEPSLATE_BRICK_WALL);
    /**
     * BlockData: {@link Wall}
     */
    BlockType<Wall> DEEPSLATE_TILE_WALL = asBlockType(Material.DEEPSLATE_TILE_WALL);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> ANVIL = asBlockType(Material.ANVIL);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> CHIPPED_ANVIL = asBlockType(Material.CHIPPED_ANVIL);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> DAMAGED_ANVIL = asBlockType(Material.DAMAGED_ANVIL);
    BlockType<BlockData> CHISELED_QUARTZ_BLOCK = asBlockType(Material.CHISELED_QUARTZ_BLOCK);
    BlockType<BlockData> QUARTZ_BLOCK = asBlockType(Material.QUARTZ_BLOCK);
    BlockType<BlockData> QUARTZ_BRICKS = asBlockType(Material.QUARTZ_BRICKS);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> QUARTZ_PILLAR = asBlockType(Material.QUARTZ_PILLAR);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> QUARTZ_STAIRS = asBlockType(Material.QUARTZ_STAIRS);
    BlockType<BlockData> WHITE_TERRACOTTA = asBlockType(Material.WHITE_TERRACOTTA);
    BlockType<BlockData> ORANGE_TERRACOTTA = asBlockType(Material.ORANGE_TERRACOTTA);
    BlockType<BlockData> MAGENTA_TERRACOTTA = asBlockType(Material.MAGENTA_TERRACOTTA);
    BlockType<BlockData> LIGHT_BLUE_TERRACOTTA = asBlockType(Material.LIGHT_BLUE_TERRACOTTA);
    BlockType<BlockData> YELLOW_TERRACOTTA = asBlockType(Material.YELLOW_TERRACOTTA);
    BlockType<BlockData> LIME_TERRACOTTA = asBlockType(Material.LIME_TERRACOTTA);
    BlockType<BlockData> PINK_TERRACOTTA = asBlockType(Material.PINK_TERRACOTTA);
    BlockType<BlockData> GRAY_TERRACOTTA = asBlockType(Material.GRAY_TERRACOTTA);
    BlockType<BlockData> LIGHT_GRAY_TERRACOTTA = asBlockType(Material.LIGHT_GRAY_TERRACOTTA);
    BlockType<BlockData> CYAN_TERRACOTTA = asBlockType(Material.CYAN_TERRACOTTA);
    BlockType<BlockData> PURPLE_TERRACOTTA = asBlockType(Material.PURPLE_TERRACOTTA);
    BlockType<BlockData> BLUE_TERRACOTTA = asBlockType(Material.BLUE_TERRACOTTA);
    BlockType<BlockData> BROWN_TERRACOTTA = asBlockType(Material.BROWN_TERRACOTTA);
    BlockType<BlockData> GREEN_TERRACOTTA = asBlockType(Material.GREEN_TERRACOTTA);
    BlockType<BlockData> RED_TERRACOTTA = asBlockType(Material.RED_TERRACOTTA);
    BlockType<BlockData> BLACK_TERRACOTTA = asBlockType(Material.BLACK_TERRACOTTA);
    BlockType<BlockData> BARRIER = asBlockType(Material.BARRIER);
    /**
     * BlockData: {@link Light}
     */
    BlockType<Light> LIGHT = asBlockType(Material.LIGHT);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> HAY_BLOCK = asBlockType(Material.HAY_BLOCK);
    BlockType<BlockData> WHITE_CARPET = asBlockType(Material.WHITE_CARPET);
    BlockType<BlockData> ORANGE_CARPET = asBlockType(Material.ORANGE_CARPET);
    BlockType<BlockData> MAGENTA_CARPET = asBlockType(Material.MAGENTA_CARPET);
    BlockType<BlockData> LIGHT_BLUE_CARPET = asBlockType(Material.LIGHT_BLUE_CARPET);
    BlockType<BlockData> YELLOW_CARPET = asBlockType(Material.YELLOW_CARPET);
    BlockType<BlockData> LIME_CARPET = asBlockType(Material.LIME_CARPET);
    BlockType<BlockData> PINK_CARPET = asBlockType(Material.PINK_CARPET);
    BlockType<BlockData> GRAY_CARPET = asBlockType(Material.GRAY_CARPET);
    BlockType<BlockData> LIGHT_GRAY_CARPET = asBlockType(Material.LIGHT_GRAY_CARPET);
    BlockType<BlockData> CYAN_CARPET = asBlockType(Material.CYAN_CARPET);
    BlockType<BlockData> PURPLE_CARPET = asBlockType(Material.PURPLE_CARPET);
    BlockType<BlockData> BLUE_CARPET = asBlockType(Material.BLUE_CARPET);
    BlockType<BlockData> BROWN_CARPET = asBlockType(Material.BROWN_CARPET);
    BlockType<BlockData> GREEN_CARPET = asBlockType(Material.GREEN_CARPET);
    BlockType<BlockData> RED_CARPET = asBlockType(Material.RED_CARPET);
    BlockType<BlockData> BLACK_CARPET = asBlockType(Material.BLACK_CARPET);
    BlockType<BlockData> TERRACOTTA = asBlockType(Material.TERRACOTTA);
    BlockType<BlockData> PACKED_ICE = asBlockType(Material.PACKED_ICE);
    BlockType<BlockData> DIRT_PATH = asBlockType(Material.DIRT_PATH);
    /**
     * BlockData: {@link Bisected}
     */
    BlockType<Bisected> SUNFLOWER = asBlockType(Material.SUNFLOWER);
    /**
     * BlockData: {@link Bisected}
     */
    BlockType<Bisected> LILAC = asBlockType(Material.LILAC);
    /**
     * BlockData: {@link Bisected}
     */
    BlockType<Bisected> ROSE_BUSH = asBlockType(Material.ROSE_BUSH);
    /**
     * BlockData: {@link Bisected}
     */
    BlockType<Bisected> PEONY = asBlockType(Material.PEONY);
    /**
     * BlockData: {@link Bisected}
     */
    BlockType<Bisected> TALL_GRASS = asBlockType(Material.TALL_GRASS);
    /**
     * BlockData: {@link Bisected}
     */
    BlockType<Bisected> LARGE_FERN = asBlockType(Material.LARGE_FERN);
    BlockType<BlockData> WHITE_STAINED_GLASS = asBlockType(Material.WHITE_STAINED_GLASS);
    BlockType<BlockData> ORANGE_STAINED_GLASS = asBlockType(Material.ORANGE_STAINED_GLASS);
    BlockType<BlockData> MAGENTA_STAINED_GLASS = asBlockType(Material.MAGENTA_STAINED_GLASS);
    BlockType<BlockData> LIGHT_BLUE_STAINED_GLASS = asBlockType(Material.LIGHT_BLUE_STAINED_GLASS);
    BlockType<BlockData> YELLOW_STAINED_GLASS = asBlockType(Material.YELLOW_STAINED_GLASS);
    BlockType<BlockData> LIME_STAINED_GLASS = asBlockType(Material.LIME_STAINED_GLASS);
    BlockType<BlockData> PINK_STAINED_GLASS = asBlockType(Material.PINK_STAINED_GLASS);
    BlockType<BlockData> GRAY_STAINED_GLASS = asBlockType(Material.GRAY_STAINED_GLASS);
    BlockType<BlockData> LIGHT_GRAY_STAINED_GLASS = asBlockType(Material.LIGHT_GRAY_STAINED_GLASS);
    BlockType<BlockData> CYAN_STAINED_GLASS = asBlockType(Material.CYAN_STAINED_GLASS);
    BlockType<BlockData> PURPLE_STAINED_GLASS = asBlockType(Material.PURPLE_STAINED_GLASS);
    BlockType<BlockData> BLUE_STAINED_GLASS = asBlockType(Material.BLUE_STAINED_GLASS);
    BlockType<BlockData> BROWN_STAINED_GLASS = asBlockType(Material.BROWN_STAINED_GLASS);
    BlockType<BlockData> GREEN_STAINED_GLASS = asBlockType(Material.GREEN_STAINED_GLASS);
    BlockType<BlockData> RED_STAINED_GLASS = asBlockType(Material.RED_STAINED_GLASS);
    BlockType<BlockData> BLACK_STAINED_GLASS = asBlockType(Material.BLACK_STAINED_GLASS);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> WHITE_STAINED_GLASS_PANE = asBlockType(Material.WHITE_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> ORANGE_STAINED_GLASS_PANE = asBlockType(Material.ORANGE_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> MAGENTA_STAINED_GLASS_PANE = asBlockType(Material.MAGENTA_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> LIGHT_BLUE_STAINED_GLASS_PANE = asBlockType(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> YELLOW_STAINED_GLASS_PANE = asBlockType(Material.YELLOW_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> LIME_STAINED_GLASS_PANE = asBlockType(Material.LIME_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> PINK_STAINED_GLASS_PANE = asBlockType(Material.PINK_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> GRAY_STAINED_GLASS_PANE = asBlockType(Material.GRAY_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> LIGHT_GRAY_STAINED_GLASS_PANE = asBlockType(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> CYAN_STAINED_GLASS_PANE = asBlockType(Material.CYAN_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> PURPLE_STAINED_GLASS_PANE = asBlockType(Material.PURPLE_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> BLUE_STAINED_GLASS_PANE = asBlockType(Material.BLUE_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> BROWN_STAINED_GLASS_PANE = asBlockType(Material.BROWN_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> GREEN_STAINED_GLASS_PANE = asBlockType(Material.GREEN_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> RED_STAINED_GLASS_PANE = asBlockType(Material.RED_STAINED_GLASS_PANE);
    /**
     * BlockData: {@link GlassPane}
     */
    BlockType<GlassPane> BLACK_STAINED_GLASS_PANE = asBlockType(Material.BLACK_STAINED_GLASS_PANE);
    BlockType<BlockData> PRISMARINE = asBlockType(Material.PRISMARINE);
    BlockType<BlockData> PRISMARINE_BRICKS = asBlockType(Material.PRISMARINE_BRICKS);
    BlockType<BlockData> DARK_PRISMARINE = asBlockType(Material.DARK_PRISMARINE);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> PRISMARINE_STAIRS = asBlockType(Material.PRISMARINE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> PRISMARINE_BRICK_STAIRS = asBlockType(Material.PRISMARINE_BRICK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> DARK_PRISMARINE_STAIRS = asBlockType(Material.DARK_PRISMARINE_STAIRS);
    BlockType<BlockData> SEA_LANTERN = asBlockType(Material.SEA_LANTERN);
    BlockType<BlockData> RED_SANDSTONE = asBlockType(Material.RED_SANDSTONE);
    BlockType<BlockData> CHISELED_RED_SANDSTONE = asBlockType(Material.CHISELED_RED_SANDSTONE);
    BlockType<BlockData> CUT_RED_SANDSTONE = asBlockType(Material.CUT_RED_SANDSTONE);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> RED_SANDSTONE_STAIRS = asBlockType(Material.RED_SANDSTONE_STAIRS);
    /**
     * BlockData: {@link CommandBlock}
     */
    BlockType<CommandBlock> REPEATING_COMMAND_BLOCK = asBlockType(Material.REPEATING_COMMAND_BLOCK);
    /**
     * BlockData: {@link CommandBlock}
     */
    BlockType<CommandBlock> CHAIN_COMMAND_BLOCK = asBlockType(Material.CHAIN_COMMAND_BLOCK);
    BlockType<BlockData> MAGMA_BLOCK = asBlockType(Material.MAGMA_BLOCK);
    BlockType<BlockData> NETHER_WART_BLOCK = asBlockType(Material.NETHER_WART_BLOCK);
    BlockType<BlockData> WARPED_WART_BLOCK = asBlockType(Material.WARPED_WART_BLOCK);
    BlockType<BlockData> RED_NETHER_BRICKS = asBlockType(Material.RED_NETHER_BRICKS);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> BONE_BLOCK = asBlockType(Material.BONE_BLOCK);
    BlockType<BlockData> STRUCTURE_VOID = asBlockType(Material.STRUCTURE_VOID);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> SHULKER_BOX = asBlockType(Material.SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> WHITE_SHULKER_BOX = asBlockType(Material.WHITE_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> ORANGE_SHULKER_BOX = asBlockType(Material.ORANGE_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> MAGENTA_SHULKER_BOX = asBlockType(Material.MAGENTA_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIGHT_BLUE_SHULKER_BOX = asBlockType(Material.LIGHT_BLUE_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> YELLOW_SHULKER_BOX = asBlockType(Material.YELLOW_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIME_SHULKER_BOX = asBlockType(Material.LIME_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> PINK_SHULKER_BOX = asBlockType(Material.PINK_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> GRAY_SHULKER_BOX = asBlockType(Material.GRAY_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIGHT_GRAY_SHULKER_BOX = asBlockType(Material.LIGHT_GRAY_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> CYAN_SHULKER_BOX = asBlockType(Material.CYAN_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> PURPLE_SHULKER_BOX = asBlockType(Material.PURPLE_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BLUE_SHULKER_BOX = asBlockType(Material.BLUE_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BROWN_SHULKER_BOX = asBlockType(Material.BROWN_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> GREEN_SHULKER_BOX = asBlockType(Material.GREEN_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> RED_SHULKER_BOX = asBlockType(Material.RED_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BLACK_SHULKER_BOX = asBlockType(Material.BLACK_SHULKER_BOX);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> WHITE_GLAZED_TERRACOTTA = asBlockType(Material.WHITE_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> ORANGE_GLAZED_TERRACOTTA = asBlockType(Material.ORANGE_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> MAGENTA_GLAZED_TERRACOTTA = asBlockType(Material.MAGENTA_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIGHT_BLUE_GLAZED_TERRACOTTA = asBlockType(Material.LIGHT_BLUE_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> YELLOW_GLAZED_TERRACOTTA = asBlockType(Material.YELLOW_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIME_GLAZED_TERRACOTTA = asBlockType(Material.LIME_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> PINK_GLAZED_TERRACOTTA = asBlockType(Material.PINK_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> GRAY_GLAZED_TERRACOTTA = asBlockType(Material.GRAY_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIGHT_GRAY_GLAZED_TERRACOTTA = asBlockType(Material.LIGHT_GRAY_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> CYAN_GLAZED_TERRACOTTA = asBlockType(Material.CYAN_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> PURPLE_GLAZED_TERRACOTTA = asBlockType(Material.PURPLE_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BLUE_GLAZED_TERRACOTTA = asBlockType(Material.BLUE_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BROWN_GLAZED_TERRACOTTA = asBlockType(Material.BROWN_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> GREEN_GLAZED_TERRACOTTA = asBlockType(Material.GREEN_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> RED_GLAZED_TERRACOTTA = asBlockType(Material.RED_GLAZED_TERRACOTTA);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BLACK_GLAZED_TERRACOTTA = asBlockType(Material.BLACK_GLAZED_TERRACOTTA);
    BlockType<BlockData> WHITE_CONCRETE = asBlockType(Material.WHITE_CONCRETE);
    BlockType<BlockData> ORANGE_CONCRETE = asBlockType(Material.ORANGE_CONCRETE);
    BlockType<BlockData> MAGENTA_CONCRETE = asBlockType(Material.MAGENTA_CONCRETE);
    BlockType<BlockData> LIGHT_BLUE_CONCRETE = asBlockType(Material.LIGHT_BLUE_CONCRETE);
    BlockType<BlockData> YELLOW_CONCRETE = asBlockType(Material.YELLOW_CONCRETE);
    BlockType<BlockData> LIME_CONCRETE = asBlockType(Material.LIME_CONCRETE);
    BlockType<BlockData> PINK_CONCRETE = asBlockType(Material.PINK_CONCRETE);
    BlockType<BlockData> GRAY_CONCRETE = asBlockType(Material.GRAY_CONCRETE);
    BlockType<BlockData> LIGHT_GRAY_CONCRETE = asBlockType(Material.LIGHT_GRAY_CONCRETE);
    BlockType<BlockData> CYAN_CONCRETE = asBlockType(Material.CYAN_CONCRETE);
    BlockType<BlockData> PURPLE_CONCRETE = asBlockType(Material.PURPLE_CONCRETE);
    BlockType<BlockData> BLUE_CONCRETE = asBlockType(Material.BLUE_CONCRETE);
    BlockType<BlockData> BROWN_CONCRETE = asBlockType(Material.BROWN_CONCRETE);
    BlockType<BlockData> GREEN_CONCRETE = asBlockType(Material.GREEN_CONCRETE);
    BlockType<BlockData> RED_CONCRETE = asBlockType(Material.RED_CONCRETE);
    BlockType<BlockData> BLACK_CONCRETE = asBlockType(Material.BLACK_CONCRETE);
    BlockType<BlockData> WHITE_CONCRETE_POWDER = asBlockType(Material.WHITE_CONCRETE_POWDER);
    BlockType<BlockData> ORANGE_CONCRETE_POWDER = asBlockType(Material.ORANGE_CONCRETE_POWDER);
    BlockType<BlockData> MAGENTA_CONCRETE_POWDER = asBlockType(Material.MAGENTA_CONCRETE_POWDER);
    BlockType<BlockData> LIGHT_BLUE_CONCRETE_POWDER = asBlockType(Material.LIGHT_BLUE_CONCRETE_POWDER);
    BlockType<BlockData> YELLOW_CONCRETE_POWDER = asBlockType(Material.YELLOW_CONCRETE_POWDER);
    BlockType<BlockData> LIME_CONCRETE_POWDER = asBlockType(Material.LIME_CONCRETE_POWDER);
    BlockType<BlockData> PINK_CONCRETE_POWDER = asBlockType(Material.PINK_CONCRETE_POWDER);
    BlockType<BlockData> GRAY_CONCRETE_POWDER = asBlockType(Material.GRAY_CONCRETE_POWDER);
    BlockType<BlockData> LIGHT_GRAY_CONCRETE_POWDER = asBlockType(Material.LIGHT_GRAY_CONCRETE_POWDER);
    BlockType<BlockData> CYAN_CONCRETE_POWDER = asBlockType(Material.CYAN_CONCRETE_POWDER);
    BlockType<BlockData> PURPLE_CONCRETE_POWDER = asBlockType(Material.PURPLE_CONCRETE_POWDER);
    BlockType<BlockData> BLUE_CONCRETE_POWDER = asBlockType(Material.BLUE_CONCRETE_POWDER);
    BlockType<BlockData> BROWN_CONCRETE_POWDER = asBlockType(Material.BROWN_CONCRETE_POWDER);
    BlockType<BlockData> GREEN_CONCRETE_POWDER = asBlockType(Material.GREEN_CONCRETE_POWDER);
    BlockType<BlockData> RED_CONCRETE_POWDER = asBlockType(Material.RED_CONCRETE_POWDER);
    BlockType<BlockData> BLACK_CONCRETE_POWDER = asBlockType(Material.BLACK_CONCRETE_POWDER);
    /**
     * BlockData: {@link TurtleEgg}
     */
    BlockType<TurtleEgg> TURTLE_EGG = asBlockType(Material.TURTLE_EGG);
    BlockType<BlockData> DEAD_TUBE_CORAL_BLOCK = asBlockType(Material.DEAD_TUBE_CORAL_BLOCK);
    BlockType<BlockData> DEAD_BRAIN_CORAL_BLOCK = asBlockType(Material.DEAD_BRAIN_CORAL_BLOCK);
    BlockType<BlockData> DEAD_BUBBLE_CORAL_BLOCK = asBlockType(Material.DEAD_BUBBLE_CORAL_BLOCK);
    BlockType<BlockData> DEAD_FIRE_CORAL_BLOCK = asBlockType(Material.DEAD_FIRE_CORAL_BLOCK);
    BlockType<BlockData> DEAD_HORN_CORAL_BLOCK = asBlockType(Material.DEAD_HORN_CORAL_BLOCK);
    BlockType<BlockData> TUBE_CORAL_BLOCK = asBlockType(Material.TUBE_CORAL_BLOCK);
    BlockType<BlockData> BRAIN_CORAL_BLOCK = asBlockType(Material.BRAIN_CORAL_BLOCK);
    BlockType<BlockData> BUBBLE_CORAL_BLOCK = asBlockType(Material.BUBBLE_CORAL_BLOCK);
    BlockType<BlockData> FIRE_CORAL_BLOCK = asBlockType(Material.FIRE_CORAL_BLOCK);
    BlockType<BlockData> HORN_CORAL_BLOCK = asBlockType(Material.HORN_CORAL_BLOCK);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> TUBE_CORAL = asBlockType(Material.TUBE_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> BRAIN_CORAL = asBlockType(Material.BRAIN_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> BUBBLE_CORAL = asBlockType(Material.BUBBLE_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> FIRE_CORAL = asBlockType(Material.FIRE_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> HORN_CORAL = asBlockType(Material.HORN_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_BRAIN_CORAL = asBlockType(Material.DEAD_BRAIN_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_BUBBLE_CORAL = asBlockType(Material.DEAD_BUBBLE_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_FIRE_CORAL = asBlockType(Material.DEAD_FIRE_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_HORN_CORAL = asBlockType(Material.DEAD_HORN_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_TUBE_CORAL = asBlockType(Material.DEAD_TUBE_CORAL);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> TUBE_CORAL_FAN = asBlockType(Material.TUBE_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> BRAIN_CORAL_FAN = asBlockType(Material.BRAIN_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> BUBBLE_CORAL_FAN = asBlockType(Material.BUBBLE_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> FIRE_CORAL_FAN = asBlockType(Material.FIRE_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> HORN_CORAL_FAN = asBlockType(Material.HORN_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_TUBE_CORAL_FAN = asBlockType(Material.DEAD_TUBE_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_BRAIN_CORAL_FAN = asBlockType(Material.DEAD_BRAIN_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_BUBBLE_CORAL_FAN = asBlockType(Material.DEAD_BUBBLE_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_FIRE_CORAL_FAN = asBlockType(Material.DEAD_FIRE_CORAL_FAN);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> DEAD_HORN_CORAL_FAN = asBlockType(Material.DEAD_HORN_CORAL_FAN);
    BlockType<BlockData> BLUE_ICE = asBlockType(Material.BLUE_ICE);
    /**
     * BlockData: {@link Waterlogged}
     */
    BlockType<Waterlogged> CONDUIT = asBlockType(Material.CONDUIT);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> POLISHED_GRANITE_STAIRS = asBlockType(Material.POLISHED_GRANITE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> SMOOTH_RED_SANDSTONE_STAIRS = asBlockType(Material.SMOOTH_RED_SANDSTONE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> MOSSY_STONE_BRICK_STAIRS = asBlockType(Material.MOSSY_STONE_BRICK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> POLISHED_DIORITE_STAIRS = asBlockType(Material.POLISHED_DIORITE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> MOSSY_COBBLESTONE_STAIRS = asBlockType(Material.MOSSY_COBBLESTONE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> END_STONE_BRICK_STAIRS = asBlockType(Material.END_STONE_BRICK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> STONE_STAIRS = asBlockType(Material.STONE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> SMOOTH_SANDSTONE_STAIRS = asBlockType(Material.SMOOTH_SANDSTONE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> SMOOTH_QUARTZ_STAIRS = asBlockType(Material.SMOOTH_QUARTZ_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> GRANITE_STAIRS = asBlockType(Material.GRANITE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> ANDESITE_STAIRS = asBlockType(Material.ANDESITE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> RED_NETHER_BRICK_STAIRS = asBlockType(Material.RED_NETHER_BRICK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> POLISHED_ANDESITE_STAIRS = asBlockType(Material.POLISHED_ANDESITE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> DIORITE_STAIRS = asBlockType(Material.DIORITE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> COBBLED_DEEPSLATE_STAIRS = asBlockType(Material.COBBLED_DEEPSLATE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> POLISHED_DEEPSLATE_STAIRS = asBlockType(Material.POLISHED_DEEPSLATE_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> DEEPSLATE_BRICK_STAIRS = asBlockType(Material.DEEPSLATE_BRICK_STAIRS);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> DEEPSLATE_TILE_STAIRS = asBlockType(Material.DEEPSLATE_TILE_STAIRS);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> POLISHED_GRANITE_SLAB = asBlockType(Material.POLISHED_GRANITE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> SMOOTH_RED_SANDSTONE_SLAB = asBlockType(Material.SMOOTH_RED_SANDSTONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> MOSSY_STONE_BRICK_SLAB = asBlockType(Material.MOSSY_STONE_BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> POLISHED_DIORITE_SLAB = asBlockType(Material.POLISHED_DIORITE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> MOSSY_COBBLESTONE_SLAB = asBlockType(Material.MOSSY_COBBLESTONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> END_STONE_BRICK_SLAB = asBlockType(Material.END_STONE_BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> SMOOTH_SANDSTONE_SLAB = asBlockType(Material.SMOOTH_SANDSTONE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> SMOOTH_QUARTZ_SLAB = asBlockType(Material.SMOOTH_QUARTZ_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> GRANITE_SLAB = asBlockType(Material.GRANITE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> ANDESITE_SLAB = asBlockType(Material.ANDESITE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> RED_NETHER_BRICK_SLAB = asBlockType(Material.RED_NETHER_BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> POLISHED_ANDESITE_SLAB = asBlockType(Material.POLISHED_ANDESITE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> DIORITE_SLAB = asBlockType(Material.DIORITE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> COBBLED_DEEPSLATE_SLAB = asBlockType(Material.COBBLED_DEEPSLATE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> POLISHED_DEEPSLATE_SLAB = asBlockType(Material.POLISHED_DEEPSLATE_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> DEEPSLATE_BRICK_SLAB = asBlockType(Material.DEEPSLATE_BRICK_SLAB);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> DEEPSLATE_TILE_SLAB = asBlockType(Material.DEEPSLATE_TILE_SLAB);
    /**
     * BlockData: {@link Scaffolding}
     */
    BlockType<Scaffolding> SCAFFOLDING = asBlockType(Material.SCAFFOLDING);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> REDSTONE_TORCH = asBlockType(Material.REDSTONE_TORCH);
    BlockType<BlockData> REDSTONE_BLOCK = asBlockType(Material.REDSTONE_BLOCK);
    /**
     * BlockData: {@link Repeater}
     */
    BlockType<Repeater> REPEATER = asBlockType(Material.REPEATER);
    /**
     * BlockData: {@link Comparator}
     */
    BlockType<Comparator> COMPARATOR = asBlockType(Material.COMPARATOR);
    /**
     * BlockData: {@link Piston}
     */
    BlockType<Piston> PISTON = asBlockType(Material.PISTON);
    /**
     * BlockData: {@link Piston}
     */
    BlockType<Piston> STICKY_PISTON = asBlockType(Material.STICKY_PISTON);
    BlockType<BlockData> SLIME_BLOCK = asBlockType(Material.SLIME_BLOCK);
    BlockType<BlockData> HONEY_BLOCK = asBlockType(Material.HONEY_BLOCK);
    /**
     * BlockData: {@link Observer}
     */
    BlockType<Observer> OBSERVER = asBlockType(Material.OBSERVER);
    /**
     * BlockData: {@link Hopper}
     */
    BlockType<Hopper> HOPPER = asBlockType(Material.HOPPER);
    /**
     * BlockData: {@link Dispenser}
     */
    BlockType<Dispenser> DISPENSER = asBlockType(Material.DISPENSER);
    /**
     * BlockData: {@link Dispenser}
     */
    BlockType<Dispenser> DROPPER = asBlockType(Material.DROPPER);
    /**
     * BlockData: {@link Lectern}
     */
    BlockType<Lectern> LECTERN = asBlockType(Material.LECTERN);
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    BlockType<AnaloguePowerable> TARGET = asBlockType(Material.TARGET);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> LEVER = asBlockType(Material.LEVER);
    /**
     * BlockData: {@link LightningRod}
     */
    BlockType<LightningRod> LIGHTNING_ROD = asBlockType(Material.LIGHTNING_ROD);
    /**
     * BlockData: {@link DaylightDetector}
     */
    BlockType<DaylightDetector> DAYLIGHT_DETECTOR = asBlockType(Material.DAYLIGHT_DETECTOR);
    /**
     * BlockData: {@link SculkSensor}
     */
    BlockType<SculkSensor> SCULK_SENSOR = asBlockType(Material.SCULK_SENSOR);
    /**
     * BlockData: {@link TripwireHook}
     */
    BlockType<TripwireHook> TRIPWIRE_HOOK = asBlockType(Material.TRIPWIRE_HOOK);
    /**
     * BlockData: {@link Chest}
     */
    BlockType<Chest> TRAPPED_CHEST = asBlockType(Material.TRAPPED_CHEST);
    /**
     * BlockData: {@link TNT}
     */
    BlockType<TNT> TNT = asBlockType(Material.TNT);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> REDSTONE_LAMP = asBlockType(Material.REDSTONE_LAMP);
    /**
     * BlockData: {@link NoteBlock}
     */
    BlockType<NoteBlock> NOTE_BLOCK = asBlockType(Material.NOTE_BLOCK);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> STONE_BUTTON = asBlockType(Material.STONE_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> POLISHED_BLACKSTONE_BUTTON = asBlockType(Material.POLISHED_BLACKSTONE_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> OAK_BUTTON = asBlockType(Material.OAK_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> SPRUCE_BUTTON = asBlockType(Material.SPRUCE_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> BIRCH_BUTTON = asBlockType(Material.BIRCH_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> JUNGLE_BUTTON = asBlockType(Material.JUNGLE_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> ACACIA_BUTTON = asBlockType(Material.ACACIA_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> DARK_OAK_BUTTON = asBlockType(Material.DARK_OAK_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> MANGROVE_BUTTON = asBlockType(Material.MANGROVE_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> CRIMSON_BUTTON = asBlockType(Material.CRIMSON_BUTTON);
    /**
     * BlockData: {@link Switch}
     */
    BlockType<Switch> WARPED_BUTTON = asBlockType(Material.WARPED_BUTTON);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> STONE_PRESSURE_PLATE = asBlockType(Material.STONE_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> POLISHED_BLACKSTONE_PRESSURE_PLATE = asBlockType(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE);
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    BlockType<AnaloguePowerable> LIGHT_WEIGHTED_PRESSURE_PLATE = asBlockType(Material.LIGHT_WEIGHTED_PRESSURE_PLATE);
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    BlockType<AnaloguePowerable> HEAVY_WEIGHTED_PRESSURE_PLATE = asBlockType(Material.HEAVY_WEIGHTED_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> OAK_PRESSURE_PLATE = asBlockType(Material.OAK_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> SPRUCE_PRESSURE_PLATE = asBlockType(Material.SPRUCE_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> BIRCH_PRESSURE_PLATE = asBlockType(Material.BIRCH_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> JUNGLE_PRESSURE_PLATE = asBlockType(Material.JUNGLE_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> ACACIA_PRESSURE_PLATE = asBlockType(Material.ACACIA_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> DARK_OAK_PRESSURE_PLATE = asBlockType(Material.DARK_OAK_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> MANGROVE_PRESSURE_PLATE = asBlockType(Material.MANGROVE_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> CRIMSON_PRESSURE_PLATE = asBlockType(Material.CRIMSON_PRESSURE_PLATE);
    /**
     * BlockData: {@link Powerable}
     */
    BlockType<Powerable> WARPED_PRESSURE_PLATE = asBlockType(Material.WARPED_PRESSURE_PLATE);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> IRON_DOOR = asBlockType(Material.IRON_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> OAK_DOOR = asBlockType(Material.OAK_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> SPRUCE_DOOR = asBlockType(Material.SPRUCE_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> BIRCH_DOOR = asBlockType(Material.BIRCH_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> JUNGLE_DOOR = asBlockType(Material.JUNGLE_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> ACACIA_DOOR = asBlockType(Material.ACACIA_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> DARK_OAK_DOOR = asBlockType(Material.DARK_OAK_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> MANGROVE_DOOR = asBlockType(Material.MANGROVE_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> CRIMSON_DOOR = asBlockType(Material.CRIMSON_DOOR);
    /**
     * BlockData: {@link Door}
     */
    BlockType<Door> WARPED_DOOR = asBlockType(Material.WARPED_DOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> IRON_TRAPDOOR = asBlockType(Material.IRON_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> OAK_TRAPDOOR = asBlockType(Material.OAK_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> SPRUCE_TRAPDOOR = asBlockType(Material.SPRUCE_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> BIRCH_TRAPDOOR = asBlockType(Material.BIRCH_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> JUNGLE_TRAPDOOR = asBlockType(Material.JUNGLE_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> ACACIA_TRAPDOOR = asBlockType(Material.ACACIA_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> DARK_OAK_TRAPDOOR = asBlockType(Material.DARK_OAK_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> MANGROVE_TRAPDOOR = asBlockType(Material.MANGROVE_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> CRIMSON_TRAPDOOR = asBlockType(Material.CRIMSON_TRAPDOOR);
    /**
     * BlockData: {@link TrapDoor}
     */
    BlockType<TrapDoor> WARPED_TRAPDOOR = asBlockType(Material.WARPED_TRAPDOOR);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> OAK_FENCE_GATE = asBlockType(Material.OAK_FENCE_GATE);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> SPRUCE_FENCE_GATE = asBlockType(Material.SPRUCE_FENCE_GATE);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> BIRCH_FENCE_GATE = asBlockType(Material.BIRCH_FENCE_GATE);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> JUNGLE_FENCE_GATE = asBlockType(Material.JUNGLE_FENCE_GATE);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> ACACIA_FENCE_GATE = asBlockType(Material.ACACIA_FENCE_GATE);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> DARK_OAK_FENCE_GATE = asBlockType(Material.DARK_OAK_FENCE_GATE);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> MANGROVE_FENCE_GATE = asBlockType(Material.MANGROVE_FENCE_GATE);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> CRIMSON_FENCE_GATE = asBlockType(Material.CRIMSON_FENCE_GATE);
    /**
     * BlockData: {@link Gate}
     */
    BlockType<Gate> WARPED_FENCE_GATE = asBlockType(Material.WARPED_FENCE_GATE);
    /**
     * BlockData: {@link RedstoneRail}
     */
    BlockType<RedstoneRail> POWERED_RAIL = asBlockType(Material.POWERED_RAIL);
    /**
     * BlockData: {@link RedstoneRail}
     */
    BlockType<RedstoneRail> DETECTOR_RAIL = asBlockType(Material.DETECTOR_RAIL);
    /**
     * BlockData: {@link Rail}
     */
    BlockType<Rail> RAIL = asBlockType(Material.RAIL);
    /**
     * BlockData: {@link RedstoneRail}
     */
    BlockType<RedstoneRail> ACTIVATOR_RAIL = asBlockType(Material.ACTIVATOR_RAIL);
    /**
     * BlockData: {@link StructureBlock}
     */
    BlockType<StructureBlock> STRUCTURE_BLOCK = asBlockType(Material.STRUCTURE_BLOCK);
    /**
     * BlockData: {@link Jigsaw}
     */
    BlockType<Jigsaw> JIGSAW = asBlockType(Material.JIGSAW);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> WHEAT = asBlockType(Material.WHEAT);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> OAK_SIGN = asBlockType(Material.OAK_SIGN);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> SPRUCE_SIGN = asBlockType(Material.SPRUCE_SIGN);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> BIRCH_SIGN = asBlockType(Material.BIRCH_SIGN);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> JUNGLE_SIGN = asBlockType(Material.JUNGLE_SIGN);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> ACACIA_SIGN = asBlockType(Material.ACACIA_SIGN);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> DARK_OAK_SIGN = asBlockType(Material.DARK_OAK_SIGN);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> MANGROVE_SIGN = asBlockType(Material.MANGROVE_SIGN);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> CRIMSON_SIGN = asBlockType(Material.CRIMSON_SIGN);
    /**
     * BlockData: {@link Sign}
     */
    BlockType<Sign> WARPED_SIGN = asBlockType(Material.WARPED_SIGN);
    BlockType<BlockData> DRIED_KELP_BLOCK = asBlockType(Material.DRIED_KELP_BLOCK);
    /**
     * BlockData: {@link Cake}
     */
    BlockType<Cake> CAKE = asBlockType(Material.CAKE);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<BlockData> WHITE_BED = asBlockType(Material.WHITE_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<BlockData> ORANGE_BED = asBlockType(Material.ORANGE_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<BlockData> MAGENTA_BED = asBlockType(Material.MAGENTA_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<BlockData> LIGHT_BLUE_BED = asBlockType(Material.LIGHT_BLUE_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> YELLOW_BED = asBlockType(Material.YELLOW_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> LIME_BED = asBlockType(Material.LIME_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> PINK_BED = asBlockType(Material.PINK_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> GRAY_BED = asBlockType(Material.GRAY_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> LIGHT_GRAY_BED = asBlockType(Material.LIGHT_GRAY_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> CYAN_BED = asBlockType(Material.CYAN_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> PURPLE_BED = asBlockType(Material.PURPLE_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> BLUE_BED = asBlockType(Material.BLUE_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> BROWN_BED = asBlockType(Material.BROWN_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> GREEN_BED = asBlockType(Material.GREEN_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> RED_BED = asBlockType(Material.RED_BED);
    /**
     * BlockData: {@link Bed}
     */
    BlockType<Bed> BLACK_BED = asBlockType(Material.BLACK_BED);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> NETHER_WART = asBlockType(Material.NETHER_WART);
    /**
     * BlockData: {@link BrewingStand}
     */
    BlockType<BrewingStand> BREWING_STAND = asBlockType(Material.BREWING_STAND);
    BlockType<BlockData> CAULDRON = asBlockType(Material.CAULDRON);
    BlockType<BlockData> FLOWER_POT = asBlockType(Material.FLOWER_POT);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> SKELETON_SKULL = asBlockType(Material.SKELETON_SKULL);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> WITHER_SKELETON_SKULL = asBlockType(Material.WITHER_SKELETON_SKULL);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> PLAYER_HEAD = asBlockType(Material.PLAYER_HEAD);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> ZOMBIE_HEAD = asBlockType(Material.ZOMBIE_HEAD);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> CREEPER_HEAD = asBlockType(Material.CREEPER_HEAD);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> DRAGON_HEAD = asBlockType(Material.DRAGON_HEAD);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> WHITE_BANNER = asBlockType(Material.WHITE_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> ORANGE_BANNER = asBlockType(Material.ORANGE_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> MAGENTA_BANNER = asBlockType(Material.MAGENTA_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> LIGHT_BLUE_BANNER = asBlockType(Material.LIGHT_BLUE_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> YELLOW_BANNER = asBlockType(Material.YELLOW_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> LIME_BANNER = asBlockType(Material.LIME_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> PINK_BANNER = asBlockType(Material.PINK_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> GRAY_BANNER = asBlockType(Material.GRAY_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> LIGHT_GRAY_BANNER = asBlockType(Material.LIGHT_GRAY_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> CYAN_BANNER = asBlockType(Material.CYAN_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> PURPLE_BANNER = asBlockType(Material.PURPLE_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> BLUE_BANNER = asBlockType(Material.BLUE_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> BROWN_BANNER = asBlockType(Material.BROWN_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> GREEN_BANNER = asBlockType(Material.GREEN_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> RED_BANNER = asBlockType(Material.RED_BANNER);
    /**
     * BlockData: {@link Rotatable}
     */
    BlockType<Rotatable> BLACK_BANNER = asBlockType(Material.BLACK_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LOOM = asBlockType(Material.LOOM);
    /**
     * BlockData: {@link Levelled}
     */
    BlockType<Levelled> COMPOSTER = asBlockType(Material.COMPOSTER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BARREL = asBlockType(Material.BARREL);
    /**
     * BlockData: {@link Furnace}
     */
    BlockType<Furnace> SMOKER = asBlockType(Material.SMOKER);
    BlockType<BlockData> BLAST_FURNACE = asBlockType(Material.BLAST_FURNACE);
    BlockType<BlockData> CARTOGRAPHY_TABLE = asBlockType(Material.CARTOGRAPHY_TABLE);
    BlockType<BlockData> FLETCHING_TABLE = asBlockType(Material.FLETCHING_TABLE);
    /**
     * BlockData: {@link Grindstone}
     */
    BlockType<Grindstone> GRINDSTONE = asBlockType(Material.GRINDSTONE);
    BlockType<BlockData> SMITHING_TABLE = asBlockType(Material.SMITHING_TABLE);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> STONECUTTER = asBlockType(Material.STONECUTTER);
    /**
     * BlockData: {@link Bell}
     */
    BlockType<Bell> BELL = asBlockType(Material.BELL);
    /**
     * BlockData: {@link Lantern}
     */
    BlockType<Lantern> LANTERN = asBlockType(Material.LANTERN);
    /**
     * BlockData: {@link Lantern}
     */
    BlockType<Lantern> SOUL_LANTERN = asBlockType(Material.SOUL_LANTERN);
    /**
     * BlockData: {@link Campfire}
     */
    BlockType<Campfire> CAMPFIRE = asBlockType(Material.CAMPFIRE);
    /**
     * BlockData: {@link Campfire}
     */
    BlockType<Campfire> SOUL_CAMPFIRE = asBlockType(Material.SOUL_CAMPFIRE);
    BlockType<BlockData> SHROOMLIGHT = asBlockType(Material.SHROOMLIGHT);
    /**
     * BlockData: {@link Beehive}
     */
    BlockType<Beehive> BEE_NEST = asBlockType(Material.BEE_NEST);
    /**
     * BlockData: {@link Beehive}
     */
    BlockType<Beehive> BEEHIVE = asBlockType(Material.BEEHIVE);
    BlockType<BlockData> HONEYCOMB_BLOCK = asBlockType(Material.HONEYCOMB_BLOCK);
    BlockType<BlockData> LODESTONE = asBlockType(Material.LODESTONE);
    BlockType<BlockData> CRYING_OBSIDIAN = asBlockType(Material.CRYING_OBSIDIAN);
    BlockType<BlockData> BLACKSTONE = asBlockType(Material.BLACKSTONE);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> BLACKSTONE_SLAB = asBlockType(Material.BLACKSTONE_SLAB);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> BLACKSTONE_STAIRS = asBlockType(Material.BLACKSTONE_STAIRS);
    BlockType<BlockData> GILDED_BLACKSTONE = asBlockType(Material.GILDED_BLACKSTONE);
    BlockType<BlockData> POLISHED_BLACKSTONE = asBlockType(Material.POLISHED_BLACKSTONE);
    /**
     * BlockData: {@link Slab}
     */
    BlockType<Slab> POLISHED_BLACKSTONE_SLAB = asBlockType(Material.POLISHED_BLACKSTONE_SLAB);
    /**
     * BlockData: {@link Stairs}
     */
    BlockType<Stairs> POLISHED_BLACKSTONE_STAIRS = asBlockType(Material.POLISHED_BLACKSTONE_STAIRS);
    BlockType<BlockData> CHISELED_POLISHED_BLACKSTONE = asBlockType(Material.CHISELED_POLISHED_BLACKSTONE);
    BlockType<BlockData> POLISHED_BLACKSTONE_BRICKS = asBlockType(Material.POLISHED_BLACKSTONE_BRICKS);
    BlockType<BlockData> POLISHED_BLACKSTONE_BRICK_SLAB = asBlockType(Material.POLISHED_BLACKSTONE_BRICK_SLAB);
    BlockType<BlockData> POLISHED_BLACKSTONE_BRICK_STAIRS = asBlockType(Material.POLISHED_BLACKSTONE_BRICK_STAIRS);
    BlockType<BlockData> CRACKED_POLISHED_BLACKSTONE_BRICKS = asBlockType(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS);
    /**
     * BlockData: {@link RespawnAnchor}
     */
    BlockType<RespawnAnchor> RESPAWN_ANCHOR = asBlockType(Material.RESPAWN_ANCHOR);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> CANDLE = asBlockType(Material.CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> WHITE_CANDLE = asBlockType(Material.WHITE_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> ORANGE_CANDLE = asBlockType(Material.ORANGE_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> MAGENTA_CANDLE = asBlockType(Material.MAGENTA_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> LIGHT_BLUE_CANDLE = asBlockType(Material.LIGHT_BLUE_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> YELLOW_CANDLE = asBlockType(Material.YELLOW_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> LIME_CANDLE = asBlockType(Material.LIME_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> PINK_CANDLE = asBlockType(Material.PINK_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> GRAY_CANDLE = asBlockType(Material.GRAY_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> LIGHT_GRAY_CANDLE = asBlockType(Material.LIGHT_GRAY_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> CYAN_CANDLE = asBlockType(Material.CYAN_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> PURPLE_CANDLE = asBlockType(Material.PURPLE_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> BLUE_CANDLE = asBlockType(Material.BLUE_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> BROWN_CANDLE = asBlockType(Material.BROWN_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> GREEN_CANDLE = asBlockType(Material.GREEN_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> RED_CANDLE = asBlockType(Material.RED_CANDLE);
    /**
     * BlockData: {@link Candle}
     */
    BlockType<Candle> BLACK_CANDLE = asBlockType(Material.BLACK_CANDLE);
    /**
     * BlockData: {@link AmethystCluster}
     */
    BlockType<AmethystCluster> SMALL_AMETHYST_BUD = asBlockType(Material.SMALL_AMETHYST_BUD);
    /**
     * BlockData: {@link AmethystCluster}
     */
    BlockType<AmethystCluster> MEDIUM_AMETHYST_BUD = asBlockType(Material.MEDIUM_AMETHYST_BUD);
    /**
     * BlockData: {@link AmethystCluster}
     */
    BlockType<AmethystCluster> LARGE_AMETHYST_BUD = asBlockType(Material.LARGE_AMETHYST_BUD);
    /**
     * BlockData: {@link AmethystCluster}
     */
    BlockType<AmethystCluster> AMETHYST_CLUSTER = asBlockType(Material.AMETHYST_CLUSTER);
    /**
     * BlockData: {@link PointedDripstone}
     */
    BlockType<PointedDripstone> POINTED_DRIPSTONE = asBlockType(Material.POINTED_DRIPSTONE);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> OCHRE_FROGLIGHT = asBlockType(Material.OCHRE_FROGLIGHT);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> VERDANT_FROGLIGHT = asBlockType(Material.VERDANT_FROGLIGHT);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> PEARLESCENT_FROGLIGHT = asBlockType(Material.PEARLESCENT_FROGLIGHT);
    BlockType<BlockData> FROGSPAWN = asBlockType(Material.FROGSPAWN);
    /**
     * BlockData: {@link Levelled}
     */
    BlockType<Levelled> WATER = asBlockType(Material.WATER);
    /**
     * BlockData: {@link Levelled}
     */
    BlockType<Levelled> LAVA = asBlockType(Material.LAVA);
    /**
     * BlockData: {@link Bisected}
     */
    BlockType<Bisected> TALL_SEAGRASS = asBlockType(Material.TALL_SEAGRASS);
    /**
     * BlockData: {@link PistonHead}
     */
    BlockType<PistonHead> PISTON_HEAD = asBlockType(Material.PISTON_HEAD);
    /**
     * BlockData: {@link TechnicalPiston}
     */
    BlockType<TechnicalPiston> MOVING_PISTON = asBlockType(Material.MOVING_PISTON);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> WALL_TORCH = asBlockType(Material.WALL_TORCH);
    /**
     * BlockData: {@link Fire}
     */
    BlockType<Fire> FIRE = asBlockType(Material.FIRE);
    /**
     * BlockData: {@link Fire}
     */
    BlockType<Fire> SOUL_FIRE = asBlockType(Material.SOUL_FIRE);
    /**
     * BlockData: {@link RedstoneWire}
     */
    BlockType<RedstoneWire> REDSTONE_WIRE = asBlockType(Material.REDSTONE_WIRE);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> OAK_WALL_SIGN = asBlockType(Material.OAK_WALL_SIGN);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> SPRUCE_WALL_SIGN = asBlockType(Material.SPRUCE_WALL_SIGN);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> BIRCH_WALL_SIGN = asBlockType(Material.BIRCH_WALL_SIGN);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> ACACIA_WALL_SIGN = asBlockType(Material.ACACIA_WALL_SIGN);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> JUNGLE_WALL_SIGN = asBlockType(Material.JUNGLE_WALL_SIGN);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> DARK_OAK_WALL_SIGN = asBlockType(Material.DARK_OAK_WALL_SIGN);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> MANGROVE_WALL_SIGN = asBlockType(Material.MANGROVE_WALL_SIGN);
    /**
     * BlockData: {@link RedstoneWallTorch}
     */
    BlockType<RedstoneWallTorch> REDSTONE_WALL_TORCH = asBlockType(Material.REDSTONE_WALL_TORCH);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> SOUL_WALL_TORCH = asBlockType(Material.SOUL_WALL_TORCH);
    /**
     * BlockData: {@link Orientable}
     */
    BlockType<Orientable> NETHER_PORTAL = asBlockType(Material.NETHER_PORTAL);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> ATTACHED_PUMPKIN_STEM = asBlockType(Material.ATTACHED_PUMPKIN_STEM);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> ATTACHED_MELON_STEM = asBlockType(Material.ATTACHED_MELON_STEM);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> PUMPKIN_STEM = asBlockType(Material.PUMPKIN_STEM);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> MELON_STEM = asBlockType(Material.MELON_STEM);
    /**
     * BlockData: {@link Levelled}
     */
    BlockType<Levelled> WATER_CAULDRON = asBlockType(Material.WATER_CAULDRON);
    BlockType<BlockData> LAVA_CAULDRON = asBlockType(Material.LAVA_CAULDRON);
    /**
     * BlockData: {@link Levelled}
     */
    BlockType<Levelled> POWDER_SNOW_CAULDRON = asBlockType(Material.POWDER_SNOW_CAULDRON);
    BlockType<BlockData> END_PORTAL = asBlockType(Material.END_PORTAL);
    /**
     * BlockData: {@link Cocoa}
     */
    BlockType<Cocoa> COCOA = asBlockType(Material.COCOA);
    /**
     * BlockData: {@link Tripwire}
     */
    BlockType<Tripwire> TRIPWIRE = asBlockType(Material.TRIPWIRE);
    BlockType<BlockData> POTTED_OAK_SAPLING = asBlockType(Material.POTTED_OAK_SAPLING);
    BlockType<BlockData> POTTED_SPRUCE_SAPLING = asBlockType(Material.POTTED_SPRUCE_SAPLING);
    BlockType<BlockData> POTTED_BIRCH_SAPLING = asBlockType(Material.POTTED_BIRCH_SAPLING);
    BlockType<BlockData> POTTED_JUNGLE_SAPLING = asBlockType(Material.POTTED_JUNGLE_SAPLING);
    BlockType<BlockData> POTTED_ACACIA_SAPLING = asBlockType(Material.POTTED_ACACIA_SAPLING);
    BlockType<BlockData> POTTED_DARK_OAK_SAPLING = asBlockType(Material.POTTED_DARK_OAK_SAPLING);
    BlockType<BlockData> POTTED_MANGROVE_PROPAGULE = asBlockType(Material.POTTED_MANGROVE_PROPAGULE);
    BlockType<BlockData> POTTED_FERN = asBlockType(Material.POTTED_FERN);
    BlockType<BlockData> POTTED_DANDELION = asBlockType(Material.POTTED_DANDELION);
    BlockType<BlockData> POTTED_POPPY = asBlockType(Material.POTTED_POPPY);
    BlockType<BlockData> POTTED_BLUE_ORCHID = asBlockType(Material.POTTED_BLUE_ORCHID);
    BlockType<BlockData> POTTED_ALLIUM = asBlockType(Material.POTTED_ALLIUM);
    BlockType<BlockData> POTTED_AZURE_BLUET = asBlockType(Material.POTTED_AZURE_BLUET);
    BlockType<BlockData> POTTED_RED_TULIP = asBlockType(Material.POTTED_RED_TULIP);
    BlockType<BlockData> POTTED_ORANGE_TULIP = asBlockType(Material.POTTED_ORANGE_TULIP);
    BlockType<BlockData> POTTED_WHITE_TULIP = asBlockType(Material.POTTED_WHITE_TULIP);
    BlockType<BlockData> POTTED_PINK_TULIP = asBlockType(Material.POTTED_PINK_TULIP);
    BlockType<BlockData> POTTED_OXEYE_DAISY = asBlockType(Material.POTTED_OXEYE_DAISY);
    BlockType<BlockData> POTTED_CORNFLOWER = asBlockType(Material.POTTED_CORNFLOWER);
    BlockType<BlockData> POTTED_LILY_OF_THE_VALLEY = asBlockType(Material.POTTED_LILY_OF_THE_VALLEY);
    BlockType<BlockData> POTTED_WITHER_ROSE = asBlockType(Material.POTTED_WITHER_ROSE);
    BlockType<BlockData> POTTED_RED_MUSHROOM = asBlockType(Material.POTTED_RED_MUSHROOM);
    BlockType<BlockData> POTTED_BROWN_MUSHROOM = asBlockType(Material.POTTED_BROWN_MUSHROOM);
    BlockType<BlockData> POTTED_DEAD_BUSH = asBlockType(Material.POTTED_DEAD_BUSH);
    BlockType<BlockData> POTTED_CACTUS = asBlockType(Material.POTTED_CACTUS);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> CARROTS = asBlockType(Material.CARROTS);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> POTATOES = asBlockType(Material.POTATOES);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> SKELETON_WALL_SKULL = asBlockType(Material.SKELETON_WALL_SKULL);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> WITHER_SKELETON_WALL_SKULL = asBlockType(Material.WITHER_SKELETON_WALL_SKULL);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> ZOMBIE_WALL_HEAD = asBlockType(Material.ZOMBIE_WALL_HEAD);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> PLAYER_WALL_HEAD = asBlockType(Material.PLAYER_WALL_HEAD);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> CREEPER_WALL_HEAD = asBlockType(Material.CREEPER_WALL_HEAD);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> DRAGON_WALL_HEAD = asBlockType(Material.DRAGON_WALL_HEAD);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> WHITE_WALL_BANNER = asBlockType(Material.WHITE_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> ORANGE_WALL_BANNER = asBlockType(Material.ORANGE_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> MAGENTA_WALL_BANNER = asBlockType(Material.MAGENTA_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIGHT_BLUE_WALL_BANNER = asBlockType(Material.LIGHT_BLUE_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> YELLOW_WALL_BANNER = asBlockType(Material.YELLOW_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIME_WALL_BANNER = asBlockType(Material.LIME_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> PINK_WALL_BANNER = asBlockType(Material.PINK_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> GRAY_WALL_BANNER = asBlockType(Material.GRAY_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> LIGHT_GRAY_WALL_BANNER = asBlockType(Material.LIGHT_GRAY_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> CYAN_WALL_BANNER = asBlockType(Material.CYAN_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> PURPLE_WALL_BANNER = asBlockType(Material.PURPLE_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BLUE_WALL_BANNER = asBlockType(Material.BLUE_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BROWN_WALL_BANNER = asBlockType(Material.BROWN_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> GREEN_WALL_BANNER = asBlockType(Material.GREEN_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> RED_WALL_BANNER = asBlockType(Material.RED_WALL_BANNER);
    /**
     * BlockData: {@link Directional}
     */
    BlockType<Directional> BLACK_WALL_BANNER = asBlockType(Material.BLACK_WALL_BANNER);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> BEETROOTS = asBlockType(Material.BEETROOTS);
    BlockType<BlockData> END_GATEWAY = asBlockType(Material.END_GATEWAY);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> FROSTED_ICE = asBlockType(Material.FROSTED_ICE);
    BlockType<BlockData> KELP_PLANT = asBlockType(Material.KELP_PLANT);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> DEAD_TUBE_CORAL_WALL_FAN = asBlockType(Material.DEAD_TUBE_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> DEAD_BRAIN_CORAL_WALL_FAN = asBlockType(Material.DEAD_BRAIN_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> DEAD_BUBBLE_CORAL_WALL_FAN = asBlockType(Material.DEAD_BUBBLE_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> DEAD_FIRE_CORAL_WALL_FAN = asBlockType(Material.DEAD_FIRE_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> DEAD_HORN_CORAL_WALL_FAN = asBlockType(Material.DEAD_HORN_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> TUBE_CORAL_WALL_FAN = asBlockType(Material.TUBE_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> BRAIN_CORAL_WALL_FAN = asBlockType(Material.BRAIN_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> BUBBLE_CORAL_WALL_FAN = asBlockType(Material.BUBBLE_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> FIRE_CORAL_WALL_FAN = asBlockType(Material.FIRE_CORAL_WALL_FAN);
    /**
     * BlockData: {@link CoralWallFan}
     */
    BlockType<CoralWallFan> HORN_CORAL_WALL_FAN = asBlockType(Material.HORN_CORAL_WALL_FAN);
    BlockType<BlockData> BAMBOO_SAPLING = asBlockType(Material.BAMBOO_SAPLING);
    BlockType<BlockData> POTTED_BAMBOO = asBlockType(Material.POTTED_BAMBOO);
    BlockType<BlockData> VOID_AIR = asBlockType(Material.VOID_AIR);
    BlockType<BlockData> CAVE_AIR = asBlockType(Material.CAVE_AIR);
    /**
     * BlockData: {@link BubbleColumn}
     */
    BlockType<BubbleColumn> BUBBLE_COLUMN = asBlockType(Material.BUBBLE_COLUMN);
    /**
     * BlockData: {@link Ageable}
     */
    BlockType<Ageable> SWEET_BERRY_BUSH = asBlockType(Material.SWEET_BERRY_BUSH);
    BlockType<BlockData> WEEPING_VINES_PLANT = asBlockType(Material.WEEPING_VINES_PLANT);
    BlockType<BlockData> TWISTING_VINES_PLANT = asBlockType(Material.TWISTING_VINES_PLANT);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> CRIMSON_WALL_SIGN = asBlockType(Material.CRIMSON_WALL_SIGN);
    /**
     * BlockData: {@link WallSign}
     */
    BlockType<WallSign> WARPED_WALL_SIGN = asBlockType(Material.WARPED_WALL_SIGN);
    BlockType<BlockData> POTTED_CRIMSON_FUNGUS = asBlockType(Material.POTTED_CRIMSON_FUNGUS);
    BlockType<BlockData> POTTED_WARPED_FUNGUS = asBlockType(Material.POTTED_WARPED_FUNGUS);
    BlockType<BlockData> POTTED_CRIMSON_ROOTS = asBlockType(Material.POTTED_CRIMSON_ROOTS);
    BlockType<BlockData> POTTED_WARPED_ROOTS = asBlockType(Material.POTTED_WARPED_ROOTS);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> CANDLE_CAKE = asBlockType(Material.CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> WHITE_CANDLE_CAKE = asBlockType(Material.WHITE_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> ORANGE_CANDLE_CAKE = asBlockType(Material.ORANGE_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> MAGENTA_CANDLE_CAKE = asBlockType(Material.MAGENTA_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> LIGHT_BLUE_CANDLE_CAKE = asBlockType(Material.LIGHT_BLUE_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> YELLOW_CANDLE_CAKE = asBlockType(Material.YELLOW_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> LIME_CANDLE_CAKE = asBlockType(Material.LIME_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> PINK_CANDLE_CAKE = asBlockType(Material.PINK_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> GRAY_CANDLE_CAKE = asBlockType(Material.GRAY_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> LIGHT_GRAY_CANDLE_CAKE = asBlockType(Material.LIGHT_GRAY_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> CYAN_CANDLE_CAKE = asBlockType(Material.CYAN_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> PURPLE_CANDLE_CAKE = asBlockType(Material.PURPLE_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> BLUE_CANDLE_CAKE = asBlockType(Material.BLUE_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> BROWN_CANDLE_CAKE = asBlockType(Material.BROWN_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> GREEN_CANDLE_CAKE = asBlockType(Material.GREEN_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> RED_CANDLE_CAKE = asBlockType(Material.RED_CANDLE_CAKE);
    /**
     * BlockData: {@link Lightable}
     */
    BlockType<Lightable> BLACK_CANDLE_CAKE = asBlockType(Material.BLACK_CANDLE_CAKE);
    BlockType<BlockData> POWDER_SNOW = asBlockType(Material.POWDER_SNOW);
    /**
     * BlockData: {@link CaveVines}
     */
    BlockType<CaveVines> CAVE_VINES = asBlockType(Material.CAVE_VINES);
    /**
     * BlockData: {@link CaveVinesPlant}
     */
    BlockType<CaveVinesPlant> CAVE_VINES_PLANT = asBlockType(Material.CAVE_VINES_PLANT);
    /**
     * BlockData: {@link Dripleaf}
     */
    BlockType<Dripleaf> BIG_DRIPLEAF_STEM = asBlockType(Material.BIG_DRIPLEAF_STEM);
    BlockType<BlockData> POTTED_AZALEA_BUSH = asBlockType(Material.POTTED_AZALEA_BUSH);
    BlockType<BlockData> POTTED_FLOWERING_AZALEA_BUSH = asBlockType(Material.POTTED_FLOWERING_AZALEA_BUSH);
    //</editor-fold>

    @Contract("null -> null; !null -> !null")
    @Nullable
    static <B extends BlockData> BlockType<B> asBlockType(@Nullable Material material) {
        if (material == null) {
            return null;
        }

        return (BlockType<B>) material.asBlockType();
    }

    /**
     * Gets the BlockData class of this BlockType
     *
     * @return the BlockData class of this BlockType
     */
    @NotNull
    Class<B> getBlockDataClass();

    /**
     * Creates a new {@link BlockData} instance for this Material, with all
     * properties initialized to unspecified defaults.
     *
     * @return new data instance
     */
    @NotNull
    B createBlockData();

    /**
     * Creates a new {@link BlockData} instance for this Material, with
     * all properties initialized to unspecified defaults.
     *
     * @param consumer consumer to run on new instance before returning
     * @return new data instance
     */
    @NotNull
    B createBlockData(@Nullable Consumer<BlockData> consumer);

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
    B createBlockData(@Nullable String data);

    /**
     * Check if the material is a block and solid (can be built upon)
     *
     * @return True if this material is a block and solid
     */
    boolean isSolid();

    /**
     * Check if the material is a block and can catch fire
     *
     * @return True if this material is a block and can catch fire
     */
    boolean isFlammable();

    /**
     * Check if the material is a block and can burn away
     *
     * @return True if this material is a block and can burn away
     */
    boolean isBurnable();

    /**
     * Check if the material is a block and completely blocks vision
     *
     * @return True if this material is a block and completely blocks vision
     */
    boolean isOccluding();

    /**
     * @return True if this material is affected by gravity.
     */
    boolean hasGravity();

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
    float getSlipperiness();
}
