package org.bukkit.block;

import com.google.common.base.Preconditions;
import java.util.function.Consumer;
import org.bukkit.Keyed;
import org.bukkit.MinecraftExperimental;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.Translatable;
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
import org.bukkit.block.data.type.Barrel;
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
import org.bukkit.block.data.type.ChiseledBookshelf;
import org.bukkit.block.data.type.Cocoa;
import org.bukkit.block.data.type.CommandBlock;
import org.bukkit.block.data.type.Comparator;
import org.bukkit.block.data.type.CoralWallFan;
import org.bukkit.block.data.type.DaylightDetector;
import org.bukkit.block.data.type.DecoratedPot;
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
import org.bukkit.block.data.type.HangingSign;
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
import org.bukkit.block.data.type.PinkPetals;
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
import org.bukkit.block.data.type.SculkCatalyst;
import org.bukkit.block.data.type.SculkSensor;
import org.bukkit.block.data.type.SculkShrieker;
import org.bukkit.block.data.type.SculkVein;
import org.bukkit.block.data.type.SeaPickle;
import org.bukkit.block.data.type.Sign;
import org.bukkit.block.data.type.Slab;
import org.bukkit.block.data.type.SmallDripleaf;
import org.bukkit.block.data.type.Snow;
import org.bukkit.block.data.type.Stairs;
import org.bukkit.block.data.type.StructureBlock;
import org.bukkit.block.data.type.SuspiciousSand;
import org.bukkit.block.data.type.Switch;
import org.bukkit.block.data.type.TNT;
import org.bukkit.block.data.type.TechnicalPiston;
import org.bukkit.block.data.type.TrapDoor;
import org.bukkit.block.data.type.Tripwire;
import org.bukkit.block.data.type.TripwireHook;
import org.bukkit.block.data.type.TurtleEgg;
import org.bukkit.block.data.type.Wall;
import org.bukkit.block.data.type.WallHangingSign;
import org.bukkit.block.data.type.WallSign;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class BlockType<B extends BlockData> implements Keyed, Translatable {
    //<editor-fold desc="BlockTypes" defaultstate="collapsed">
    public static final BlockType<BlockData> AIR = getBlockType("air");
    public static final BlockType<BlockData> STONE = getBlockType("stone");
    public static final BlockType<BlockData> GRANITE = getBlockType("granite");
    public static final BlockType<BlockData> POLISHED_GRANITE = getBlockType("polished_granite");
    public static final BlockType<BlockData> DIORITE = getBlockType("diorite");
    public static final BlockType<BlockData> POLISHED_DIORITE = getBlockType("polished_diorite");
    public static final BlockType<BlockData> ANDESITE = getBlockType("andesite");
    public static final BlockType<BlockData> POLISHED_ANDESITE = getBlockType("polished_andesite");
    /**
     * BlockData: {@link Snowable}
     */
    public static final BlockType<Snowable> GRASS_BLOCK = getBlockType("grass_block");
    public static final BlockType<BlockData> DIRT = getBlockType("dirt");
    public static final BlockType<BlockData> COARSE_DIRT = getBlockType("coarse_dirt");
    /**
     * BlockData: {@link Snowable}
     */
    public static final BlockType<Snowable> PODZOL = getBlockType("podzol");
    public static final BlockType<BlockData> COBBLESTONE = getBlockType("cobblestone");
    public static final BlockType<BlockData> OAK_PLANKS = getBlockType("oak_planks");
    public static final BlockType<BlockData> SPRUCE_PLANKS = getBlockType("spruce_planks");
    public static final BlockType<BlockData> BIRCH_PLANKS = getBlockType("birch_planks");
    public static final BlockType<BlockData> JUNGLE_PLANKS = getBlockType("jungle_planks");
    public static final BlockType<BlockData> ACACIA_PLANKS = getBlockType("acacia_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<BlockData> CHERRY_PLANKS = getBlockType("cherry_planks");
    public static final BlockType<BlockData> DARK_OAK_PLANKS = getBlockType("dark_oak_planks");
    public static final BlockType<BlockData> MANGROVE_PLANKS = getBlockType("mangrove_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<BlockData> BAMBOO_PLANKS = getBlockType("bamboo_planks");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<BlockData> BAMBOO_MOSAIC = getBlockType("bamboo_mosaic");
    /**
     * BlockData: {@link Sapling}
     */
    public static final BlockType<Sapling> OAK_SAPLING = getBlockType("oak_sapling");
    /**
     * BlockData: {@link Sapling}
     */
    public static final BlockType<Sapling> SPRUCE_SAPLING = getBlockType("spruce_sapling");
    /**
     * BlockData: {@link Sapling}
     */
    public static final BlockType<Sapling> BIRCH_SAPLING = getBlockType("birch_sapling");
    /**
     * BlockData: {@link Sapling}
     */
    public static final BlockType<Sapling> JUNGLE_SAPLING = getBlockType("jungle_sapling");
    /**
     * BlockData: {@link Sapling}
     */
    public static final BlockType<Sapling> ACACIA_SAPLING = getBlockType("acacia_sapling");
    /**
     * BlockData: {@link Sapling}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Sapling> CHERRY_SAPLING = getBlockType("cherry_sapling");
    /**
     * BlockData: {@link Sapling}
     */
    public static final BlockType<Sapling> DARK_OAK_SAPLING = getBlockType("dark_oak_sapling");
    /**
     * BlockData: {@link MangrovePropagule}
     */
    public static final BlockType<MangrovePropagule> MANGROVE_PROPAGULE = getBlockType("mangrove_propagule");
    public static final BlockType<BlockData> BEDROCK = getBlockType("bedrock");
    /**
     * BlockData: {@link Levelled}
     */
    public static final BlockType<Levelled> WATER = getBlockType("water");
    /**
     * BlockData: {@link Levelled}
     */
    public static final BlockType<Levelled> LAVA = getBlockType("lava");
    public static final BlockType<BlockData> SAND = getBlockType("sand");
    /**
     * BlockData: {@link SuspiciousSand}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<SuspiciousSand> SUSPICIOUS_SAND = getBlockType("suspicious_sand");
    public static final BlockType<BlockData> RED_SAND = getBlockType("red_sand");
    public static final BlockType<BlockData> GRAVEL = getBlockType("gravel");
    public static final BlockType<BlockData> GOLD_ORE = getBlockType("gold_ore");
    public static final BlockType<BlockData> DEEPSLATE_GOLD_ORE = getBlockType("deepslate_gold_ore");
    public static final BlockType<BlockData> IRON_ORE = getBlockType("iron_ore");
    public static final BlockType<BlockData> DEEPSLATE_IRON_ORE = getBlockType("deepslate_iron_ore");
    public static final BlockType<BlockData> COAL_ORE = getBlockType("coal_ore");
    public static final BlockType<BlockData> DEEPSLATE_COAL_ORE = getBlockType("deepslate_coal_ore");
    public static final BlockType<BlockData> NETHER_GOLD_ORE = getBlockType("nether_gold_ore");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> OAK_LOG = getBlockType("oak_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> SPRUCE_LOG = getBlockType("spruce_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> BIRCH_LOG = getBlockType("birch_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> JUNGLE_LOG = getBlockType("jungle_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> ACACIA_LOG = getBlockType("acacia_log");
    /**
     * BlockData: {@link Orientable}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Orientable> CHERRY_LOG = getBlockType("cherry_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> DARK_OAK_LOG = getBlockType("dark_oak_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> MANGROVE_LOG = getBlockType("mangrove_log");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> MANGROVE_ROOTS = getBlockType("mangrove_roots");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> MUDDY_MANGROVE_ROOTS = getBlockType("muddy_mangrove_roots");
    /**
     * BlockData: {@link Orientable}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Orientable> BAMBOO_BLOCK = getBlockType("bamboo_block");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_SPRUCE_LOG = getBlockType("stripped_spruce_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_BIRCH_LOG = getBlockType("stripped_birch_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_JUNGLE_LOG = getBlockType("stripped_jungle_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_ACACIA_LOG = getBlockType("stripped_acacia_log");
    /**
     * BlockData: {@link Orientable}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Orientable> STRIPPED_CHERRY_LOG = getBlockType("stripped_cherry_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_DARK_OAK_LOG = getBlockType("stripped_dark_oak_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_OAK_LOG = getBlockType("stripped_oak_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_MANGROVE_LOG = getBlockType("stripped_mangrove_log");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_BAMBOO_BLOCK = getBlockType("stripped_bamboo_block");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> OAK_WOOD = getBlockType("oak_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> SPRUCE_WOOD = getBlockType("spruce_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> BIRCH_WOOD = getBlockType("birch_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> JUNGLE_WOOD = getBlockType("jungle_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> ACACIA_WOOD = getBlockType("acacia_wood");
    /**
     * BlockData: {@link Orientable}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Orientable> CHERRY_WOOD = getBlockType("cherry_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> DARK_OAK_WOOD = getBlockType("dark_oak_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> MANGROVE_WOOD = getBlockType("mangrove_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_OAK_WOOD = getBlockType("stripped_oak_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_SPRUCE_WOOD = getBlockType("stripped_spruce_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_BIRCH_WOOD = getBlockType("stripped_birch_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_JUNGLE_WOOD = getBlockType("stripped_jungle_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_ACACIA_WOOD = getBlockType("stripped_acacia_wood");
    /**
     * BlockData: {@link Orientable}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Orientable> STRIPPED_CHERRY_WOOD = getBlockType("stripped_cherry_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_DARK_OAK_WOOD = getBlockType("stripped_dark_oak_wood");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_MANGROVE_WOOD = getBlockType("stripped_mangrove_wood");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> OAK_LEAVES = getBlockType("oak_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> SPRUCE_LEAVES = getBlockType("spruce_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> BIRCH_LEAVES = getBlockType("birch_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> JUNGLE_LEAVES = getBlockType("jungle_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> ACACIA_LEAVES = getBlockType("acacia_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Leaves> CHERRY_LEAVES = getBlockType("cherry_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> DARK_OAK_LEAVES = getBlockType("dark_oak_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> MANGROVE_LEAVES = getBlockType("mangrove_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> AZALEA_LEAVES = getBlockType("azalea_leaves");
    /**
     * BlockData: {@link Leaves}
     */
    public static final BlockType<Leaves> FLOWERING_AZALEA_LEAVES = getBlockType("flowering_azalea_leaves");
    public static final BlockType<BlockData> SPONGE = getBlockType("sponge");
    public static final BlockType<BlockData> WET_SPONGE = getBlockType("wet_sponge");
    public static final BlockType<BlockData> GLASS = getBlockType("glass");
    public static final BlockType<BlockData> LAPIS_ORE = getBlockType("lapis_ore");
    public static final BlockType<BlockData> DEEPSLATE_LAPIS_ORE = getBlockType("deepslate_lapis_ore");
    public static final BlockType<BlockData> LAPIS_BLOCK = getBlockType("lapis_block");
    /**
     * BlockData: {@link Dispenser}
     */
    public static final BlockType<Dispenser> DISPENSER = getBlockType("dispenser");
    public static final BlockType<BlockData> SANDSTONE = getBlockType("sandstone");
    public static final BlockType<BlockData> CHISELED_SANDSTONE = getBlockType("chiseled_sandstone");
    public static final BlockType<BlockData> CUT_SANDSTONE = getBlockType("cut_sandstone");
    /**
     * BlockData: {@link NoteBlock}
     */
    public static final BlockType<NoteBlock> NOTE_BLOCK = getBlockType("note_block");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> WHITE_BED = getBlockType("white_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> ORANGE_BED = getBlockType("orange_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> MAGENTA_BED = getBlockType("magenta_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> LIGHT_BLUE_BED = getBlockType("light_blue_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> YELLOW_BED = getBlockType("yellow_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> LIME_BED = getBlockType("lime_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> PINK_BED = getBlockType("pink_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> GRAY_BED = getBlockType("gray_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> LIGHT_GRAY_BED = getBlockType("light_gray_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> CYAN_BED = getBlockType("cyan_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> PURPLE_BED = getBlockType("purple_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> BLUE_BED = getBlockType("blue_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> BROWN_BED = getBlockType("brown_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> GREEN_BED = getBlockType("green_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> RED_BED = getBlockType("red_bed");
    /**
     * BlockData: {@link Bed}
     */
    public static final BlockType<Bed> BLACK_BED = getBlockType("black_bed");
    /**
     * BlockData: {@link RedstoneRail}
     */
    public static final BlockType<RedstoneRail> POWERED_RAIL = getBlockType("powered_rail");
    /**
     * BlockData: {@link RedstoneRail}
     */
    public static final BlockType<RedstoneRail> DETECTOR_RAIL = getBlockType("detector_rail");
    /**
     * BlockData: {@link Piston}
     */
    public static final BlockType<Piston> STICKY_PISTON = getBlockType("sticky_piston");
    public static final BlockType<BlockData> COBWEB = getBlockType("cobweb");
    public static final BlockType<BlockData> GRASS = getBlockType("grass");
    public static final BlockType<BlockData> FERN = getBlockType("fern");
    public static final BlockType<BlockData> DEAD_BUSH = getBlockType("dead_bush");
    public static final BlockType<BlockData> SEAGRASS = getBlockType("seagrass");
    /**
     * BlockData: {@link Bisected}
     */
    public static final BlockType<Bisected> TALL_SEAGRASS = getBlockType("tall_seagrass");
    /**
     * BlockData: {@link Piston}
     */
    public static final BlockType<Piston> PISTON = getBlockType("piston");
    /**
     * BlockData: {@link PistonHead}
     */
    public static final BlockType<PistonHead> PISTON_HEAD = getBlockType("piston_head");
    public static final BlockType<BlockData> WHITE_WOOL = getBlockType("white_wool");
    public static final BlockType<BlockData> ORANGE_WOOL = getBlockType("orange_wool");
    public static final BlockType<BlockData> MAGENTA_WOOL = getBlockType("magenta_wool");
    public static final BlockType<BlockData> LIGHT_BLUE_WOOL = getBlockType("light_blue_wool");
    public static final BlockType<BlockData> YELLOW_WOOL = getBlockType("yellow_wool");
    public static final BlockType<BlockData> LIME_WOOL = getBlockType("lime_wool");
    public static final BlockType<BlockData> PINK_WOOL = getBlockType("pink_wool");
    public static final BlockType<BlockData> GRAY_WOOL = getBlockType("gray_wool");
    public static final BlockType<BlockData> LIGHT_GRAY_WOOL = getBlockType("light_gray_wool");
    public static final BlockType<BlockData> CYAN_WOOL = getBlockType("cyan_wool");
    public static final BlockType<BlockData> PURPLE_WOOL = getBlockType("purple_wool");
    public static final BlockType<BlockData> BLUE_WOOL = getBlockType("blue_wool");
    public static final BlockType<BlockData> BROWN_WOOL = getBlockType("brown_wool");
    public static final BlockType<BlockData> GREEN_WOOL = getBlockType("green_wool");
    public static final BlockType<BlockData> RED_WOOL = getBlockType("red_wool");
    public static final BlockType<BlockData> BLACK_WOOL = getBlockType("black_wool");
    /**
     * BlockData: {@link TechnicalPiston}
     */
    public static final BlockType<TechnicalPiston> MOVING_PISTON = getBlockType("moving_piston");
    public static final BlockType<BlockData> DANDELION = getBlockType("dandelion");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<BlockData> TORCHFLOWER = getBlockType("torchflower");
    public static final BlockType<BlockData> POPPY = getBlockType("poppy");
    public static final BlockType<BlockData> BLUE_ORCHID = getBlockType("blue_orchid");
    public static final BlockType<BlockData> ALLIUM = getBlockType("allium");
    public static final BlockType<BlockData> AZURE_BLUET = getBlockType("azure_bluet");
    public static final BlockType<BlockData> RED_TULIP = getBlockType("red_tulip");
    public static final BlockType<BlockData> ORANGE_TULIP = getBlockType("orange_tulip");
    public static final BlockType<BlockData> WHITE_TULIP = getBlockType("white_tulip");
    public static final BlockType<BlockData> PINK_TULIP = getBlockType("pink_tulip");
    public static final BlockType<BlockData> OXEYE_DAISY = getBlockType("oxeye_daisy");
    public static final BlockType<BlockData> CORNFLOWER = getBlockType("cornflower");
    public static final BlockType<BlockData> WITHER_ROSE = getBlockType("wither_rose");
    public static final BlockType<BlockData> LILY_OF_THE_VALLEY = getBlockType("lily_of_the_valley");
    public static final BlockType<BlockData> BROWN_MUSHROOM = getBlockType("brown_mushroom");
    public static final BlockType<BlockData> RED_MUSHROOM = getBlockType("red_mushroom");
    public static final BlockType<BlockData> GOLD_BLOCK = getBlockType("gold_block");
    public static final BlockType<BlockData> IRON_BLOCK = getBlockType("iron_block");
    public static final BlockType<BlockData> BRICKS = getBlockType("bricks");
    /**
     * BlockData: {@link TNT}
     */
    public static final BlockType<TNT> TNT = getBlockType("tnt");
    public static final BlockType<BlockData> BOOKSHELF = getBlockType("bookshelf");
    /**
     * BlockData: {@link ChiseledBookshelf}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<ChiseledBookshelf> CHISELED_BOOKSHELF = getBlockType("chiseled_bookshelf");
    public static final BlockType<BlockData> MOSSY_COBBLESTONE = getBlockType("mossy_cobblestone");
    public static final BlockType<BlockData> OBSIDIAN = getBlockType("obsidian");
    public static final BlockType<BlockData> TORCH = getBlockType("torch");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> WALL_TORCH = getBlockType("wall_torch");
    /**
     * BlockData: {@link Fire}
     */
    public static final BlockType<Fire> FIRE = getBlockType("fire");
    public static final BlockType<BlockData> SOUL_FIRE = getBlockType("soul_fire");
    public static final BlockType<BlockData> SPAWNER = getBlockType("spawner");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> OAK_STAIRS = getBlockType("oak_stairs");
    /**
     * BlockData: {@link Chest}
     */
    public static final BlockType<Chest> CHEST = getBlockType("chest");
    /**
     * BlockData: {@link RedstoneWire}
     */
    public static final BlockType<RedstoneWire> REDSTONE_WIRE = getBlockType("redstone_wire");
    public static final BlockType<BlockData> DIAMOND_ORE = getBlockType("diamond_ore");
    public static final BlockType<BlockData> DEEPSLATE_DIAMOND_ORE = getBlockType("deepslate_diamond_ore");
    public static final BlockType<BlockData> DIAMOND_BLOCK = getBlockType("diamond_block");
    public static final BlockType<BlockData> CRAFTING_TABLE = getBlockType("crafting_table");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> WHEAT = getBlockType("wheat");
    /**
     * BlockData: {@link Farmland}
     */
    public static final BlockType<Farmland> FARMLAND = getBlockType("farmland");
    /**
     * BlockData: {@link Furnace}
     */
    public static final BlockType<Furnace> FURNACE = getBlockType("furnace");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> OAK_SIGN = getBlockType("oak_sign");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> SPRUCE_SIGN = getBlockType("spruce_sign");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> BIRCH_SIGN = getBlockType("birch_sign");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> ACACIA_SIGN = getBlockType("acacia_sign");
    /**
     * BlockData: {@link Sign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Sign> CHERRY_SIGN = getBlockType("cherry_sign");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> JUNGLE_SIGN = getBlockType("jungle_sign");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> DARK_OAK_SIGN = getBlockType("dark_oak_sign");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> MANGROVE_SIGN = getBlockType("mangrove_sign");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> BAMBOO_SIGN = getBlockType("bamboo_sign");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> OAK_DOOR = getBlockType("oak_door");
    /**
     * BlockData: {@link Ladder}
     */
    public static final BlockType<Ladder> LADDER = getBlockType("ladder");
    /**
     * BlockData: {@link Rail}
     */
    public static final BlockType<Rail> RAIL = getBlockType("rail");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> COBBLESTONE_STAIRS = getBlockType("cobblestone_stairs");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> OAK_WALL_SIGN = getBlockType("oak_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> SPRUCE_WALL_SIGN = getBlockType("spruce_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> BIRCH_WALL_SIGN = getBlockType("birch_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> ACACIA_WALL_SIGN = getBlockType("acacia_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallSign> CHERRY_WALL_SIGN = getBlockType("cherry_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> JUNGLE_WALL_SIGN = getBlockType("jungle_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> DARK_OAK_WALL_SIGN = getBlockType("dark_oak_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> MANGROVE_WALL_SIGN = getBlockType("mangrove_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> BAMBOO_WALL_SIGN = getBlockType("bamboo_wall_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> OAK_HANGING_SIGN = getBlockType("oak_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> SPRUCE_HANGING_SIGN = getBlockType("spruce_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> BIRCH_HANGING_SIGN = getBlockType("birch_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> ACACIA_HANGING_SIGN = getBlockType("acacia_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> CHERRY_HANGING_SIGN = getBlockType("cherry_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> JUNGLE_HANGING_SIGN = getBlockType("jungle_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> DARK_OAK_HANGING_SIGN = getBlockType("dark_oak_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> CRIMSON_HANGING_SIGN = getBlockType("crimson_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> WARPED_HANGING_SIGN = getBlockType("warped_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> MANGROVE_HANGING_SIGN = getBlockType("mangrove_hanging_sign");
    /**
     * BlockData: {@link HangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<HangingSign> BAMBOO_HANGING_SIGN = getBlockType("bamboo_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> OAK_WALL_HANGING_SIGN = getBlockType("oak_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> SPRUCE_WALL_HANGING_SIGN = getBlockType("spruce_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> BIRCH_WALL_HANGING_SIGN = getBlockType("birch_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> ACACIA_WALL_HANGING_SIGN = getBlockType("acacia_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> CHERRY_WALL_HANGING_SIGN = getBlockType("cherry_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> JUNGLE_WALL_HANGING_SIGN = getBlockType("jungle_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> DARK_OAK_WALL_HANGING_SIGN = getBlockType("dark_oak_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> MANGROVE_WALL_HANGING_SIGN = getBlockType("mangrove_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> CRIMSON_WALL_HANGING_SIGN = getBlockType("crimson_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> WARPED_WALL_HANGING_SIGN = getBlockType("warped_wall_hanging_sign");
    /**
     * BlockData: {@link WallHangingSign}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<WallHangingSign> BAMBOO_WALL_HANGING_SIGN = getBlockType("bamboo_wall_hanging_sign");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> LEVER = getBlockType("lever");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> STONE_PRESSURE_PLATE = getBlockType("stone_pressure_plate");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> IRON_DOOR = getBlockType("iron_door");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> OAK_PRESSURE_PLATE = getBlockType("oak_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> SPRUCE_PRESSURE_PLATE = getBlockType("spruce_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> BIRCH_PRESSURE_PLATE = getBlockType("birch_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> JUNGLE_PRESSURE_PLATE = getBlockType("jungle_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> ACACIA_PRESSURE_PLATE = getBlockType("acacia_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Powerable> CHERRY_PRESSURE_PLATE = getBlockType("cherry_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> DARK_OAK_PRESSURE_PLATE = getBlockType("dark_oak_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> MANGROVE_PRESSURE_PLATE = getBlockType("mangrove_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> BAMBOO_PRESSURE_PLATE = getBlockType("bamboo_pressure_plate");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> REDSTONE_ORE = getBlockType("redstone_ore");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> DEEPSLATE_REDSTONE_ORE = getBlockType("deepslate_redstone_ore");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> REDSTONE_TORCH = getBlockType("redstone_torch");
    /**
     * BlockData: {@link RedstoneWallTorch}
     */
    public static final BlockType<RedstoneWallTorch> REDSTONE_WALL_TORCH = getBlockType("redstone_wall_torch");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> STONE_BUTTON = getBlockType("stone_button");
    /**
     * BlockData: {@link Snow}
     */
    public static final BlockType<Snow> SNOW = getBlockType("snow");
    public static final BlockType<BlockData> ICE = getBlockType("ice");
    public static final BlockType<BlockData> SNOW_BLOCK = getBlockType("snow_block");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> CACTUS = getBlockType("cactus");
    public static final BlockType<BlockData> CLAY = getBlockType("clay");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> SUGAR_CANE = getBlockType("sugar_cane");
    /**
     * BlockData: {@link Jukebox}
     */
    public static final BlockType<Jukebox> JUKEBOX = getBlockType("jukebox");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> OAK_FENCE = getBlockType("oak_fence");
    public static final BlockType<BlockData> PUMPKIN = getBlockType("pumpkin");
    public static final BlockType<BlockData> NETHERRACK = getBlockType("netherrack");
    public static final BlockType<BlockData> SOUL_SAND = getBlockType("soul_sand");
    public static final BlockType<BlockData> SOUL_SOIL = getBlockType("soul_soil");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> BASALT = getBlockType("basalt");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> POLISHED_BASALT = getBlockType("polished_basalt");
    public static final BlockType<BlockData> SOUL_TORCH = getBlockType("soul_torch");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> SOUL_WALL_TORCH = getBlockType("soul_wall_torch");
    public static final BlockType<BlockData> GLOWSTONE = getBlockType("glowstone");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> NETHER_PORTAL = getBlockType("nether_portal");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> CARVED_PUMPKIN = getBlockType("carved_pumpkin");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> JACK_O_LANTERN = getBlockType("jack_o_lantern");
    /**
     * BlockData: {@link Cake}
     */
    public static final BlockType<Cake> CAKE = getBlockType("cake");
    /**
     * BlockData: {@link Repeater}
     */
    public static final BlockType<Repeater> REPEATER = getBlockType("repeater");
    public static final BlockType<BlockData> WHITE_STAINED_GLASS = getBlockType("white_stained_glass");
    public static final BlockType<BlockData> ORANGE_STAINED_GLASS = getBlockType("orange_stained_glass");
    public static final BlockType<BlockData> MAGENTA_STAINED_GLASS = getBlockType("magenta_stained_glass");
    public static final BlockType<BlockData> LIGHT_BLUE_STAINED_GLASS = getBlockType("light_blue_stained_glass");
    public static final BlockType<BlockData> YELLOW_STAINED_GLASS = getBlockType("yellow_stained_glass");
    public static final BlockType<BlockData> LIME_STAINED_GLASS = getBlockType("lime_stained_glass");
    public static final BlockType<BlockData> PINK_STAINED_GLASS = getBlockType("pink_stained_glass");
    public static final BlockType<BlockData> GRAY_STAINED_GLASS = getBlockType("gray_stained_glass");
    public static final BlockType<BlockData> LIGHT_GRAY_STAINED_GLASS = getBlockType("light_gray_stained_glass");
    public static final BlockType<BlockData> CYAN_STAINED_GLASS = getBlockType("cyan_stained_glass");
    public static final BlockType<BlockData> PURPLE_STAINED_GLASS = getBlockType("purple_stained_glass");
    public static final BlockType<BlockData> BLUE_STAINED_GLASS = getBlockType("blue_stained_glass");
    public static final BlockType<BlockData> BROWN_STAINED_GLASS = getBlockType("brown_stained_glass");
    public static final BlockType<BlockData> GREEN_STAINED_GLASS = getBlockType("green_stained_glass");
    public static final BlockType<BlockData> RED_STAINED_GLASS = getBlockType("red_stained_glass");
    public static final BlockType<BlockData> BLACK_STAINED_GLASS = getBlockType("black_stained_glass");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> OAK_TRAPDOOR = getBlockType("oak_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> SPRUCE_TRAPDOOR = getBlockType("spruce_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> BIRCH_TRAPDOOR = getBlockType("birch_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> JUNGLE_TRAPDOOR = getBlockType("jungle_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> ACACIA_TRAPDOOR = getBlockType("acacia_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<TrapDoor> CHERRY_TRAPDOOR = getBlockType("cherry_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> DARK_OAK_TRAPDOOR = getBlockType("dark_oak_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> MANGROVE_TRAPDOOR = getBlockType("mangrove_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> BAMBOO_TRAPDOOR = getBlockType("bamboo_trapdoor");
    public static final BlockType<BlockData> STONE_BRICKS = getBlockType("stone_bricks");
    public static final BlockType<BlockData> MOSSY_STONE_BRICKS = getBlockType("mossy_stone_bricks");
    public static final BlockType<BlockData> CRACKED_STONE_BRICKS = getBlockType("cracked_stone_bricks");
    public static final BlockType<BlockData> CHISELED_STONE_BRICKS = getBlockType("chiseled_stone_bricks");
    public static final BlockType<BlockData> PACKED_MUD = getBlockType("packed_mud");
    public static final BlockType<BlockData> MUD_BRICKS = getBlockType("mud_bricks");
    public static final BlockType<BlockData> INFESTED_STONE = getBlockType("infested_stone");
    public static final BlockType<BlockData> INFESTED_COBBLESTONE = getBlockType("infested_cobblestone");
    public static final BlockType<BlockData> INFESTED_STONE_BRICKS = getBlockType("infested_stone_bricks");
    public static final BlockType<BlockData> INFESTED_MOSSY_STONE_BRICKS = getBlockType("infested_mossy_stone_bricks");
    public static final BlockType<BlockData> INFESTED_CRACKED_STONE_BRICKS = getBlockType("infested_cracked_stone_bricks");
    public static final BlockType<BlockData> INFESTED_CHISELED_STONE_BRICKS = getBlockType("infested_chiseled_stone_bricks");
    /**
     * BlockData: {@link MultipleFacing}
     */
    public static final BlockType<MultipleFacing> BROWN_MUSHROOM_BLOCK = getBlockType("brown_mushroom_block");
    /**
     * BlockData: {@link MultipleFacing}
     */
    public static final BlockType<MultipleFacing> RED_MUSHROOM_BLOCK = getBlockType("red_mushroom_block");
    /**
     * BlockData: {@link MultipleFacing}
     */
    public static final BlockType<MultipleFacing> MUSHROOM_STEM = getBlockType("mushroom_stem");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> IRON_BARS = getBlockType("iron_bars");
    /**
     * BlockData: {@link Chain}
     */
    public static final BlockType<Chain> CHAIN = getBlockType("chain");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> GLASS_PANE = getBlockType("glass_pane");
    public static final BlockType<BlockData> MELON = getBlockType("melon");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> ATTACHED_PUMPKIN_STEM = getBlockType("attached_pumpkin_stem");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> ATTACHED_MELON_STEM = getBlockType("attached_melon_stem");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> PUMPKIN_STEM = getBlockType("pumpkin_stem");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> MELON_STEM = getBlockType("melon_stem");
    /**
     * BlockData: {@link MultipleFacing}
     */
    public static final BlockType<MultipleFacing> VINE = getBlockType("vine");
    /**
     * BlockData: {@link GlowLichen}
     */
    public static final BlockType<GlowLichen> GLOW_LICHEN = getBlockType("glow_lichen");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> OAK_FENCE_GATE = getBlockType("oak_fence_gate");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> BRICK_STAIRS = getBlockType("brick_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> STONE_BRICK_STAIRS = getBlockType("stone_brick_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> MUD_BRICK_STAIRS = getBlockType("mud_brick_stairs");
    /**
     * BlockData: {@link Snowable}
     */
    public static final BlockType<Snowable> MYCELIUM = getBlockType("mycelium");
    public static final BlockType<BlockData> LILY_PAD = getBlockType("lily_pad");
    public static final BlockType<BlockData> NETHER_BRICKS = getBlockType("nether_bricks");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> NETHER_BRICK_FENCE = getBlockType("nether_brick_fence");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> NETHER_BRICK_STAIRS = getBlockType("nether_brick_stairs");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> NETHER_WART = getBlockType("nether_wart");
    public static final BlockType<BlockData> ENCHANTING_TABLE = getBlockType("enchanting_table");
    /**
     * BlockData: {@link BrewingStand}
     */
    public static final BlockType<BrewingStand> BREWING_STAND = getBlockType("brewing_stand");
    public static final BlockType<BlockData> CAULDRON = getBlockType("cauldron");
    /**
     * BlockData: {@link Levelled}
     */
    public static final BlockType<Levelled> WATER_CAULDRON = getBlockType("water_cauldron");
    public static final BlockType<BlockData> LAVA_CAULDRON = getBlockType("lava_cauldron");
    /**
     * BlockData: {@link Levelled}
     */
    public static final BlockType<Levelled> POWDER_SNOW_CAULDRON = getBlockType("powder_snow_cauldron");
    public static final BlockType<BlockData> END_PORTAL = getBlockType("end_portal");
    /**
     * BlockData: {@link EndPortalFrame}
     */
    public static final BlockType<EndPortalFrame> END_PORTAL_FRAME = getBlockType("end_portal_frame");
    public static final BlockType<BlockData> END_STONE = getBlockType("end_stone");
    public static final BlockType<BlockData> DRAGON_EGG = getBlockType("dragon_egg");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> REDSTONE_LAMP = getBlockType("redstone_lamp");
    /**
     * BlockData: {@link Cocoa}
     */
    public static final BlockType<Cocoa> COCOA = getBlockType("cocoa");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> SANDSTONE_STAIRS = getBlockType("sandstone_stairs");
    public static final BlockType<BlockData> EMERALD_ORE = getBlockType("emerald_ore");
    public static final BlockType<BlockData> DEEPSLATE_EMERALD_ORE = getBlockType("deepslate_emerald_ore");
    /**
     * BlockData: {@link EnderChest}
     */
    public static final BlockType<EnderChest> ENDER_CHEST = getBlockType("ender_chest");
    /**
     * BlockData: {@link TripwireHook}
     */
    public static final BlockType<TripwireHook> TRIPWIRE_HOOK = getBlockType("tripwire_hook");
    /**
     * BlockData: {@link Tripwire}
     */
    public static final BlockType<Tripwire> TRIPWIRE = getBlockType("tripwire");
    public static final BlockType<BlockData> EMERALD_BLOCK = getBlockType("emerald_block");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> SPRUCE_STAIRS = getBlockType("spruce_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> BIRCH_STAIRS = getBlockType("birch_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> JUNGLE_STAIRS = getBlockType("jungle_stairs");
    /**
     * BlockData: {@link CommandBlock}
     */
    public static final BlockType<CommandBlock> COMMAND_BLOCK = getBlockType("command_block");
    public static final BlockType<BlockData> BEACON = getBlockType("beacon");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> COBBLESTONE_WALL = getBlockType("cobblestone_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> MOSSY_COBBLESTONE_WALL = getBlockType("mossy_cobblestone_wall");
    public static final BlockType<BlockData> FLOWER_POT = getBlockType("flower_pot");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<BlockData> POTTED_TORCHFLOWER = getBlockType("potted_torchflower");
    public static final BlockType<BlockData> POTTED_OAK_SAPLING = getBlockType("potted_oak_sapling");
    public static final BlockType<BlockData> POTTED_SPRUCE_SAPLING = getBlockType("potted_spruce_sapling");
    public static final BlockType<BlockData> POTTED_BIRCH_SAPLING = getBlockType("potted_birch_sapling");
    public static final BlockType<BlockData> POTTED_JUNGLE_SAPLING = getBlockType("potted_jungle_sapling");
    public static final BlockType<BlockData> POTTED_ACACIA_SAPLING = getBlockType("potted_acacia_sapling");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<BlockData> POTTED_CHERRY_SAPLING = getBlockType("potted_cherry_sapling");
    public static final BlockType<BlockData> POTTED_DARK_OAK_SAPLING = getBlockType("potted_dark_oak_sapling");
    public static final BlockType<BlockData> POTTED_MANGROVE_PROPAGULE = getBlockType("potted_mangrove_propagule");
    public static final BlockType<BlockData> POTTED_FERN = getBlockType("potted_fern");
    public static final BlockType<BlockData> POTTED_DANDELION = getBlockType("potted_dandelion");
    public static final BlockType<BlockData> POTTED_POPPY = getBlockType("potted_poppy");
    public static final BlockType<BlockData> POTTED_BLUE_ORCHID = getBlockType("potted_blue_orchid");
    public static final BlockType<BlockData> POTTED_ALLIUM = getBlockType("potted_allium");
    public static final BlockType<BlockData> POTTED_AZURE_BLUET = getBlockType("potted_azure_bluet");
    public static final BlockType<BlockData> POTTED_RED_TULIP = getBlockType("potted_red_tulip");
    public static final BlockType<BlockData> POTTED_ORANGE_TULIP = getBlockType("potted_orange_tulip");
    public static final BlockType<BlockData> POTTED_WHITE_TULIP = getBlockType("potted_white_tulip");
    public static final BlockType<BlockData> POTTED_PINK_TULIP = getBlockType("potted_pink_tulip");
    public static final BlockType<BlockData> POTTED_OXEYE_DAISY = getBlockType("potted_oxeye_daisy");
    public static final BlockType<BlockData> POTTED_CORNFLOWER = getBlockType("potted_cornflower");
    public static final BlockType<BlockData> POTTED_LILY_OF_THE_VALLEY = getBlockType("potted_lily_of_the_valley");
    public static final BlockType<BlockData> POTTED_WITHER_ROSE = getBlockType("potted_wither_rose");
    public static final BlockType<BlockData> POTTED_RED_MUSHROOM = getBlockType("potted_red_mushroom");
    public static final BlockType<BlockData> POTTED_BROWN_MUSHROOM = getBlockType("potted_brown_mushroom");
    public static final BlockType<BlockData> POTTED_DEAD_BUSH = getBlockType("potted_dead_bush");
    public static final BlockType<BlockData> POTTED_CACTUS = getBlockType("potted_cactus");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> CARROTS = getBlockType("carrots");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> POTATOES = getBlockType("potatoes");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> OAK_BUTTON = getBlockType("oak_button");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> SPRUCE_BUTTON = getBlockType("spruce_button");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> BIRCH_BUTTON = getBlockType("birch_button");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> JUNGLE_BUTTON = getBlockType("jungle_button");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> ACACIA_BUTTON = getBlockType("acacia_button");
    /**
     * BlockData: {@link Switch}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Switch> CHERRY_BUTTON = getBlockType("cherry_button");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> DARK_OAK_BUTTON = getBlockType("dark_oak_button");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> MANGROVE_BUTTON = getBlockType("mangrove_button");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> BAMBOO_BUTTON = getBlockType("bamboo_button");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> SKELETON_SKULL = getBlockType("skeleton_skull");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> SKELETON_WALL_SKULL = getBlockType("skeleton_wall_skull");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> WITHER_SKELETON_SKULL = getBlockType("wither_skeleton_skull");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> WITHER_SKELETON_WALL_SKULL = getBlockType("wither_skeleton_wall_skull");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> ZOMBIE_HEAD = getBlockType("zombie_head");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> ZOMBIE_WALL_HEAD = getBlockType("zombie_wall_head");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> PLAYER_HEAD = getBlockType("player_head");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> PLAYER_WALL_HEAD = getBlockType("player_wall_head");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> CREEPER_HEAD = getBlockType("creeper_head");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> CREEPER_WALL_HEAD = getBlockType("creeper_wall_head");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> DRAGON_HEAD = getBlockType("dragon_head");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> DRAGON_WALL_HEAD = getBlockType("dragon_wall_head");
    /**
     * BlockData: {@link Rotatable}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Rotatable> PIGLIN_HEAD = getBlockType("piglin_head");
    /**
     * BlockData: {@link Directional}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Directional> PIGLIN_WALL_HEAD = getBlockType("piglin_wall_head");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> ANVIL = getBlockType("anvil");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> CHIPPED_ANVIL = getBlockType("chipped_anvil");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> DAMAGED_ANVIL = getBlockType("damaged_anvil");
    /**
     * BlockData: {@link Chest}
     */
    public static final BlockType<Chest> TRAPPED_CHEST = getBlockType("trapped_chest");
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    public static final BlockType<AnaloguePowerable> LIGHT_WEIGHTED_PRESSURE_PLATE = getBlockType("light_weighted_pressure_plate");
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    public static final BlockType<AnaloguePowerable> HEAVY_WEIGHTED_PRESSURE_PLATE = getBlockType("heavy_weighted_pressure_plate");
    /**
     * BlockData: {@link Comparator}
     */
    public static final BlockType<Comparator> COMPARATOR = getBlockType("comparator");
    /**
     * BlockData: {@link DaylightDetector}
     */
    public static final BlockType<DaylightDetector> DAYLIGHT_DETECTOR = getBlockType("daylight_detector");
    public static final BlockType<BlockData> REDSTONE_BLOCK = getBlockType("redstone_block");
    public static final BlockType<BlockData> NETHER_QUARTZ_ORE = getBlockType("nether_quartz_ore");
    /**
     * BlockData: {@link Hopper}
     */
    public static final BlockType<Hopper> HOPPER = getBlockType("hopper");
    public static final BlockType<BlockData> QUARTZ_BLOCK = getBlockType("quartz_block");
    public static final BlockType<BlockData> CHISELED_QUARTZ_BLOCK = getBlockType("chiseled_quartz_block");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> QUARTZ_PILLAR = getBlockType("quartz_pillar");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> QUARTZ_STAIRS = getBlockType("quartz_stairs");
    /**
     * BlockData: {@link RedstoneRail}
     */
    public static final BlockType<RedstoneRail> ACTIVATOR_RAIL = getBlockType("activator_rail");
    /**
     * BlockData: {@link Dispenser}
     */
    public static final BlockType<Dispenser> DROPPER = getBlockType("dropper");
    public static final BlockType<BlockData> WHITE_TERRACOTTA = getBlockType("white_terracotta");
    public static final BlockType<BlockData> ORANGE_TERRACOTTA = getBlockType("orange_terracotta");
    public static final BlockType<BlockData> MAGENTA_TERRACOTTA = getBlockType("magenta_terracotta");
    public static final BlockType<BlockData> LIGHT_BLUE_TERRACOTTA = getBlockType("light_blue_terracotta");
    public static final BlockType<BlockData> YELLOW_TERRACOTTA = getBlockType("yellow_terracotta");
    public static final BlockType<BlockData> LIME_TERRACOTTA = getBlockType("lime_terracotta");
    public static final BlockType<BlockData> PINK_TERRACOTTA = getBlockType("pink_terracotta");
    public static final BlockType<BlockData> GRAY_TERRACOTTA = getBlockType("gray_terracotta");
    public static final BlockType<BlockData> LIGHT_GRAY_TERRACOTTA = getBlockType("light_gray_terracotta");
    public static final BlockType<BlockData> CYAN_TERRACOTTA = getBlockType("cyan_terracotta");
    public static final BlockType<BlockData> PURPLE_TERRACOTTA = getBlockType("purple_terracotta");
    public static final BlockType<BlockData> BLUE_TERRACOTTA = getBlockType("blue_terracotta");
    public static final BlockType<BlockData> BROWN_TERRACOTTA = getBlockType("brown_terracotta");
    public static final BlockType<BlockData> GREEN_TERRACOTTA = getBlockType("green_terracotta");
    public static final BlockType<BlockData> RED_TERRACOTTA = getBlockType("red_terracotta");
    public static final BlockType<BlockData> BLACK_TERRACOTTA = getBlockType("black_terracotta");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> WHITE_STAINED_GLASS_PANE = getBlockType("white_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> ORANGE_STAINED_GLASS_PANE = getBlockType("orange_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> MAGENTA_STAINED_GLASS_PANE = getBlockType("magenta_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> LIGHT_BLUE_STAINED_GLASS_PANE = getBlockType("light_blue_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> YELLOW_STAINED_GLASS_PANE = getBlockType("yellow_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> LIME_STAINED_GLASS_PANE = getBlockType("lime_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> PINK_STAINED_GLASS_PANE = getBlockType("pink_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> GRAY_STAINED_GLASS_PANE = getBlockType("gray_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> LIGHT_GRAY_STAINED_GLASS_PANE = getBlockType("light_gray_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> CYAN_STAINED_GLASS_PANE = getBlockType("cyan_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> PURPLE_STAINED_GLASS_PANE = getBlockType("purple_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> BLUE_STAINED_GLASS_PANE = getBlockType("blue_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> BROWN_STAINED_GLASS_PANE = getBlockType("brown_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> GREEN_STAINED_GLASS_PANE = getBlockType("green_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> RED_STAINED_GLASS_PANE = getBlockType("red_stained_glass_pane");
    /**
     * BlockData: {@link GlassPane}
     */
    public static final BlockType<GlassPane> BLACK_STAINED_GLASS_PANE = getBlockType("black_stained_glass_pane");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> ACACIA_STAIRS = getBlockType("acacia_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Stairs> CHERRY_STAIRS = getBlockType("cherry_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> DARK_OAK_STAIRS = getBlockType("dark_oak_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> MANGROVE_STAIRS = getBlockType("mangrove_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Stairs> BAMBOO_STAIRS = getBlockType("bamboo_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Stairs> BAMBOO_MOSAIC_STAIRS = getBlockType("bamboo_mosaic_stairs");
    public static final BlockType<BlockData> SLIME_BLOCK = getBlockType("slime_block");
    public static final BlockType<BlockData> BARRIER = getBlockType("barrier");
    /**
     * BlockData: {@link Light}
     */
    public static final BlockType<Light> LIGHT = getBlockType("light");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> IRON_TRAPDOOR = getBlockType("iron_trapdoor");
    public static final BlockType<BlockData> PRISMARINE = getBlockType("prismarine");
    public static final BlockType<BlockData> PRISMARINE_BRICKS = getBlockType("prismarine_bricks");
    public static final BlockType<BlockData> DARK_PRISMARINE = getBlockType("dark_prismarine");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> PRISMARINE_STAIRS = getBlockType("prismarine_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> PRISMARINE_BRICK_STAIRS = getBlockType("prismarine_brick_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> DARK_PRISMARINE_STAIRS = getBlockType("dark_prismarine_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> PRISMARINE_SLAB = getBlockType("prismarine_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> PRISMARINE_BRICK_SLAB = getBlockType("prismarine_brick_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> DARK_PRISMARINE_SLAB = getBlockType("dark_prismarine_slab");
    public static final BlockType<BlockData> SEA_LANTERN = getBlockType("sea_lantern");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> HAY_BLOCK = getBlockType("hay_block");
    public static final BlockType<BlockData> WHITE_CARPET = getBlockType("white_carpet");
    public static final BlockType<BlockData> ORANGE_CARPET = getBlockType("orange_carpet");
    public static final BlockType<BlockData> MAGENTA_CARPET = getBlockType("magenta_carpet");
    public static final BlockType<BlockData> LIGHT_BLUE_CARPET = getBlockType("light_blue_carpet");
    public static final BlockType<BlockData> YELLOW_CARPET = getBlockType("yellow_carpet");
    public static final BlockType<BlockData> LIME_CARPET = getBlockType("lime_carpet");
    public static final BlockType<BlockData> PINK_CARPET = getBlockType("pink_carpet");
    public static final BlockType<BlockData> GRAY_CARPET = getBlockType("gray_carpet");
    public static final BlockType<BlockData> LIGHT_GRAY_CARPET = getBlockType("light_gray_carpet");
    public static final BlockType<BlockData> CYAN_CARPET = getBlockType("cyan_carpet");
    public static final BlockType<BlockData> PURPLE_CARPET = getBlockType("purple_carpet");
    public static final BlockType<BlockData> BLUE_CARPET = getBlockType("blue_carpet");
    public static final BlockType<BlockData> BROWN_CARPET = getBlockType("brown_carpet");
    public static final BlockType<BlockData> GREEN_CARPET = getBlockType("green_carpet");
    public static final BlockType<BlockData> RED_CARPET = getBlockType("red_carpet");
    public static final BlockType<BlockData> BLACK_CARPET = getBlockType("black_carpet");
    public static final BlockType<BlockData> TERRACOTTA = getBlockType("terracotta");
    public static final BlockType<BlockData> COAL_BLOCK = getBlockType("coal_block");
    public static final BlockType<BlockData> PACKED_ICE = getBlockType("packed_ice");
    /**
     * BlockData: {@link Bisected}
     */
    public static final BlockType<Bisected> SUNFLOWER = getBlockType("sunflower");
    /**
     * BlockData: {@link Bisected}
     */
    public static final BlockType<Bisected> LILAC = getBlockType("lilac");
    /**
     * BlockData: {@link Bisected}
     */
    public static final BlockType<Bisected> ROSE_BUSH = getBlockType("rose_bush");
    /**
     * BlockData: {@link Bisected}
     */
    public static final BlockType<Bisected> PEONY = getBlockType("peony");
    /**
     * BlockData: {@link Bisected}
     */
    public static final BlockType<Bisected> TALL_GRASS = getBlockType("tall_grass");
    /**
     * BlockData: {@link Bisected}
     */
    public static final BlockType<Bisected> LARGE_FERN = getBlockType("large_fern");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> WHITE_BANNER = getBlockType("white_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> ORANGE_BANNER = getBlockType("orange_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> MAGENTA_BANNER = getBlockType("magenta_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> LIGHT_BLUE_BANNER = getBlockType("light_blue_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> YELLOW_BANNER = getBlockType("yellow_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> LIME_BANNER = getBlockType("lime_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> PINK_BANNER = getBlockType("pink_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> GRAY_BANNER = getBlockType("gray_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> LIGHT_GRAY_BANNER = getBlockType("light_gray_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> CYAN_BANNER = getBlockType("cyan_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> PURPLE_BANNER = getBlockType("purple_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> BLUE_BANNER = getBlockType("blue_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> BROWN_BANNER = getBlockType("brown_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> GREEN_BANNER = getBlockType("green_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> RED_BANNER = getBlockType("red_banner");
    /**
     * BlockData: {@link Rotatable}
     */
    public static final BlockType<Rotatable> BLACK_BANNER = getBlockType("black_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> WHITE_WALL_BANNER = getBlockType("white_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> ORANGE_WALL_BANNER = getBlockType("orange_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> MAGENTA_WALL_BANNER = getBlockType("magenta_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIGHT_BLUE_WALL_BANNER = getBlockType("light_blue_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> YELLOW_WALL_BANNER = getBlockType("yellow_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIME_WALL_BANNER = getBlockType("lime_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> PINK_WALL_BANNER = getBlockType("pink_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> GRAY_WALL_BANNER = getBlockType("gray_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIGHT_GRAY_WALL_BANNER = getBlockType("light_gray_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> CYAN_WALL_BANNER = getBlockType("cyan_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> PURPLE_WALL_BANNER = getBlockType("purple_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BLUE_WALL_BANNER = getBlockType("blue_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BROWN_WALL_BANNER = getBlockType("brown_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> GREEN_WALL_BANNER = getBlockType("green_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> RED_WALL_BANNER = getBlockType("red_wall_banner");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BLACK_WALL_BANNER = getBlockType("black_wall_banner");
    public static final BlockType<BlockData> RED_SANDSTONE = getBlockType("red_sandstone");
    public static final BlockType<BlockData> CHISELED_RED_SANDSTONE = getBlockType("chiseled_red_sandstone");
    public static final BlockType<BlockData> CUT_RED_SANDSTONE = getBlockType("cut_red_sandstone");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> RED_SANDSTONE_STAIRS = getBlockType("red_sandstone_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> OAK_SLAB = getBlockType("oak_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> SPRUCE_SLAB = getBlockType("spruce_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> BIRCH_SLAB = getBlockType("birch_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> JUNGLE_SLAB = getBlockType("jungle_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> ACACIA_SLAB = getBlockType("acacia_slab");
    /**
     * BlockData: {@link Slab}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Slab> CHERRY_SLAB = getBlockType("cherry_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> DARK_OAK_SLAB = getBlockType("dark_oak_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> MANGROVE_SLAB = getBlockType("mangrove_slab");
    /**
     * BlockData: {@link Slab}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Slab> BAMBOO_SLAB = getBlockType("bamboo_slab");
    /**
     * BlockData: {@link Slab}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Slab> BAMBOO_MOSAIC_SLAB = getBlockType("bamboo_mosaic_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> STONE_SLAB = getBlockType("stone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> SMOOTH_STONE_SLAB = getBlockType("smooth_stone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> SANDSTONE_SLAB = getBlockType("sandstone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> CUT_SANDSTONE_SLAB = getBlockType("cut_sandstone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> PETRIFIED_OAK_SLAB = getBlockType("petrified_oak_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> COBBLESTONE_SLAB = getBlockType("cobblestone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> BRICK_SLAB = getBlockType("brick_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> STONE_BRICK_SLAB = getBlockType("stone_brick_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> MUD_BRICK_SLAB = getBlockType("mud_brick_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> NETHER_BRICK_SLAB = getBlockType("nether_brick_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> QUARTZ_SLAB = getBlockType("quartz_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> RED_SANDSTONE_SLAB = getBlockType("red_sandstone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> CUT_RED_SANDSTONE_SLAB = getBlockType("cut_red_sandstone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> PURPUR_SLAB = getBlockType("purpur_slab");
    public static final BlockType<BlockData> SMOOTH_STONE = getBlockType("smooth_stone");
    public static final BlockType<BlockData> SMOOTH_SANDSTONE = getBlockType("smooth_sandstone");
    public static final BlockType<BlockData> SMOOTH_QUARTZ = getBlockType("smooth_quartz");
    public static final BlockType<BlockData> SMOOTH_RED_SANDSTONE = getBlockType("smooth_red_sandstone");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> SPRUCE_FENCE_GATE = getBlockType("spruce_fence_gate");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> BIRCH_FENCE_GATE = getBlockType("birch_fence_gate");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> JUNGLE_FENCE_GATE = getBlockType("jungle_fence_gate");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> ACACIA_FENCE_GATE = getBlockType("acacia_fence_gate");
    /**
     * BlockData: {@link Gate}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Gate> CHERRY_FENCE_GATE = getBlockType("cherry_fence_gate");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> DARK_OAK_FENCE_GATE = getBlockType("dark_oak_fence_gate");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> MANGROVE_FENCE_GATE = getBlockType("mangrove_fence_gate");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> BAMBOO_FENCE_GATE = getBlockType("bamboo_fence_gate");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> SPRUCE_FENCE = getBlockType("spruce_fence");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> BIRCH_FENCE = getBlockType("birch_fence");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> JUNGLE_FENCE = getBlockType("jungle_fence");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> ACACIA_FENCE = getBlockType("acacia_fence");
    /**
     * BlockData: {@link Fence}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Fence> CHERRY_FENCE = getBlockType("cherry_fence");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> DARK_OAK_FENCE = getBlockType("dark_oak_fence");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> MANGROVE_FENCE = getBlockType("mangrove_fence");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> BAMBOO_FENCE = getBlockType("bamboo_fence");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> SPRUCE_DOOR = getBlockType("spruce_door");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> BIRCH_DOOR = getBlockType("birch_door");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> JUNGLE_DOOR = getBlockType("jungle_door");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> ACACIA_DOOR = getBlockType("acacia_door");
    /**
     * BlockData: {@link Door}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Door> CHERRY_DOOR = getBlockType("cherry_door");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> DARK_OAK_DOOR = getBlockType("dark_oak_door");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> MANGROVE_DOOR = getBlockType("mangrove_door");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> BAMBOO_DOOR = getBlockType("bamboo_door");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> END_ROD = getBlockType("end_rod");
    /**
     * BlockData: {@link MultipleFacing}
     */
    public static final BlockType<MultipleFacing> CHORUS_PLANT = getBlockType("chorus_plant");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> CHORUS_FLOWER = getBlockType("chorus_flower");
    public static final BlockType<BlockData> PURPUR_BLOCK = getBlockType("purpur_block");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> PURPUR_PILLAR = getBlockType("purpur_pillar");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> PURPUR_STAIRS = getBlockType("purpur_stairs");
    public static final BlockType<BlockData> END_STONE_BRICKS = getBlockType("end_stone_bricks");
    /**
     * BlockData: {@link Ageable}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<Ageable> TORCHFLOWER_CROP = getBlockType("torchflower_crop");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> BEETROOTS = getBlockType("beetroots");
    public static final BlockType<BlockData> DIRT_PATH = getBlockType("dirt_path");
    public static final BlockType<BlockData> END_GATEWAY = getBlockType("end_gateway");
    /**
     * BlockData: {@link CommandBlock}
     */
    public static final BlockType<CommandBlock> REPEATING_COMMAND_BLOCK = getBlockType("repeating_command_block");
    /**
     * BlockData: {@link CommandBlock}
     */
    public static final BlockType<CommandBlock> CHAIN_COMMAND_BLOCK = getBlockType("chain_command_block");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> FROSTED_ICE = getBlockType("frosted_ice");
    public static final BlockType<BlockData> MAGMA_BLOCK = getBlockType("magma_block");
    public static final BlockType<BlockData> NETHER_WART_BLOCK = getBlockType("nether_wart_block");
    public static final BlockType<BlockData> RED_NETHER_BRICKS = getBlockType("red_nether_bricks");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> BONE_BLOCK = getBlockType("bone_block");
    public static final BlockType<BlockData> STRUCTURE_VOID = getBlockType("structure_void");
    /**
     * BlockData: {@link Observer}
     */
    public static final BlockType<Observer> OBSERVER = getBlockType("observer");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> SHULKER_BOX = getBlockType("shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> WHITE_SHULKER_BOX = getBlockType("white_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> ORANGE_SHULKER_BOX = getBlockType("orange_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> MAGENTA_SHULKER_BOX = getBlockType("magenta_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIGHT_BLUE_SHULKER_BOX = getBlockType("light_blue_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> YELLOW_SHULKER_BOX = getBlockType("yellow_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIME_SHULKER_BOX = getBlockType("lime_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> PINK_SHULKER_BOX = getBlockType("pink_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> GRAY_SHULKER_BOX = getBlockType("gray_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIGHT_GRAY_SHULKER_BOX = getBlockType("light_gray_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> CYAN_SHULKER_BOX = getBlockType("cyan_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> PURPLE_SHULKER_BOX = getBlockType("purple_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BLUE_SHULKER_BOX = getBlockType("blue_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BROWN_SHULKER_BOX = getBlockType("brown_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> GREEN_SHULKER_BOX = getBlockType("green_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> RED_SHULKER_BOX = getBlockType("red_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BLACK_SHULKER_BOX = getBlockType("black_shulker_box");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> WHITE_GLAZED_TERRACOTTA = getBlockType("white_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> ORANGE_GLAZED_TERRACOTTA = getBlockType("orange_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> MAGENTA_GLAZED_TERRACOTTA = getBlockType("magenta_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIGHT_BLUE_GLAZED_TERRACOTTA = getBlockType("light_blue_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> YELLOW_GLAZED_TERRACOTTA = getBlockType("yellow_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIME_GLAZED_TERRACOTTA = getBlockType("lime_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> PINK_GLAZED_TERRACOTTA = getBlockType("pink_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> GRAY_GLAZED_TERRACOTTA = getBlockType("gray_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LIGHT_GRAY_GLAZED_TERRACOTTA = getBlockType("light_gray_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> CYAN_GLAZED_TERRACOTTA = getBlockType("cyan_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> PURPLE_GLAZED_TERRACOTTA = getBlockType("purple_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BLUE_GLAZED_TERRACOTTA = getBlockType("blue_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BROWN_GLAZED_TERRACOTTA = getBlockType("brown_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> GREEN_GLAZED_TERRACOTTA = getBlockType("green_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> RED_GLAZED_TERRACOTTA = getBlockType("red_glazed_terracotta");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> BLACK_GLAZED_TERRACOTTA = getBlockType("black_glazed_terracotta");
    public static final BlockType<BlockData> WHITE_CONCRETE = getBlockType("white_concrete");
    public static final BlockType<BlockData> ORANGE_CONCRETE = getBlockType("orange_concrete");
    public static final BlockType<BlockData> MAGENTA_CONCRETE = getBlockType("magenta_concrete");
    public static final BlockType<BlockData> LIGHT_BLUE_CONCRETE = getBlockType("light_blue_concrete");
    public static final BlockType<BlockData> YELLOW_CONCRETE = getBlockType("yellow_concrete");
    public static final BlockType<BlockData> LIME_CONCRETE = getBlockType("lime_concrete");
    public static final BlockType<BlockData> PINK_CONCRETE = getBlockType("pink_concrete");
    public static final BlockType<BlockData> GRAY_CONCRETE = getBlockType("gray_concrete");
    public static final BlockType<BlockData> LIGHT_GRAY_CONCRETE = getBlockType("light_gray_concrete");
    public static final BlockType<BlockData> CYAN_CONCRETE = getBlockType("cyan_concrete");
    public static final BlockType<BlockData> PURPLE_CONCRETE = getBlockType("purple_concrete");
    public static final BlockType<BlockData> BLUE_CONCRETE = getBlockType("blue_concrete");
    public static final BlockType<BlockData> BROWN_CONCRETE = getBlockType("brown_concrete");
    public static final BlockType<BlockData> GREEN_CONCRETE = getBlockType("green_concrete");
    public static final BlockType<BlockData> RED_CONCRETE = getBlockType("red_concrete");
    public static final BlockType<BlockData> BLACK_CONCRETE = getBlockType("black_concrete");
    public static final BlockType<BlockData> WHITE_CONCRETE_POWDER = getBlockType("white_concrete_powder");
    public static final BlockType<BlockData> ORANGE_CONCRETE_POWDER = getBlockType("orange_concrete_powder");
    public static final BlockType<BlockData> MAGENTA_CONCRETE_POWDER = getBlockType("magenta_concrete_powder");
    public static final BlockType<BlockData> LIGHT_BLUE_CONCRETE_POWDER = getBlockType("light_blue_concrete_powder");
    public static final BlockType<BlockData> YELLOW_CONCRETE_POWDER = getBlockType("yellow_concrete_powder");
    public static final BlockType<BlockData> LIME_CONCRETE_POWDER = getBlockType("lime_concrete_powder");
    public static final BlockType<BlockData> PINK_CONCRETE_POWDER = getBlockType("pink_concrete_powder");
    public static final BlockType<BlockData> GRAY_CONCRETE_POWDER = getBlockType("gray_concrete_powder");
    public static final BlockType<BlockData> LIGHT_GRAY_CONCRETE_POWDER = getBlockType("light_gray_concrete_powder");
    public static final BlockType<BlockData> CYAN_CONCRETE_POWDER = getBlockType("cyan_concrete_powder");
    public static final BlockType<BlockData> PURPLE_CONCRETE_POWDER = getBlockType("purple_concrete_powder");
    public static final BlockType<BlockData> BLUE_CONCRETE_POWDER = getBlockType("blue_concrete_powder");
    public static final BlockType<BlockData> BROWN_CONCRETE_POWDER = getBlockType("brown_concrete_powder");
    public static final BlockType<BlockData> GREEN_CONCRETE_POWDER = getBlockType("green_concrete_powder");
    public static final BlockType<BlockData> RED_CONCRETE_POWDER = getBlockType("red_concrete_powder");
    public static final BlockType<BlockData> BLACK_CONCRETE_POWDER = getBlockType("black_concrete_powder");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> KELP = getBlockType("kelp");
    public static final BlockType<BlockData> KELP_PLANT = getBlockType("kelp_plant");
    public static final BlockType<BlockData> DRIED_KELP_BLOCK = getBlockType("dried_kelp_block");
    /**
     * BlockData: {@link TurtleEgg}
     */
    public static final BlockType<TurtleEgg> TURTLE_EGG = getBlockType("turtle_egg");
    public static final BlockType<BlockData> DEAD_TUBE_CORAL_BLOCK = getBlockType("dead_tube_coral_block");
    public static final BlockType<BlockData> DEAD_BRAIN_CORAL_BLOCK = getBlockType("dead_brain_coral_block");
    public static final BlockType<BlockData> DEAD_BUBBLE_CORAL_BLOCK = getBlockType("dead_bubble_coral_block");
    public static final BlockType<BlockData> DEAD_FIRE_CORAL_BLOCK = getBlockType("dead_fire_coral_block");
    public static final BlockType<BlockData> DEAD_HORN_CORAL_BLOCK = getBlockType("dead_horn_coral_block");
    public static final BlockType<BlockData> TUBE_CORAL_BLOCK = getBlockType("tube_coral_block");
    public static final BlockType<BlockData> BRAIN_CORAL_BLOCK = getBlockType("brain_coral_block");
    public static final BlockType<BlockData> BUBBLE_CORAL_BLOCK = getBlockType("bubble_coral_block");
    public static final BlockType<BlockData> FIRE_CORAL_BLOCK = getBlockType("fire_coral_block");
    public static final BlockType<BlockData> HORN_CORAL_BLOCK = getBlockType("horn_coral_block");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_TUBE_CORAL = getBlockType("dead_tube_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_BRAIN_CORAL = getBlockType("dead_brain_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_BUBBLE_CORAL = getBlockType("dead_bubble_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_FIRE_CORAL = getBlockType("dead_fire_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_HORN_CORAL = getBlockType("dead_horn_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> TUBE_CORAL = getBlockType("tube_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> BRAIN_CORAL = getBlockType("brain_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> BUBBLE_CORAL = getBlockType("bubble_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> FIRE_CORAL = getBlockType("fire_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> HORN_CORAL = getBlockType("horn_coral");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_TUBE_CORAL_FAN = getBlockType("dead_tube_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_BRAIN_CORAL_FAN = getBlockType("dead_brain_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_BUBBLE_CORAL_FAN = getBlockType("dead_bubble_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_FIRE_CORAL_FAN = getBlockType("dead_fire_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> DEAD_HORN_CORAL_FAN = getBlockType("dead_horn_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> TUBE_CORAL_FAN = getBlockType("tube_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> BRAIN_CORAL_FAN = getBlockType("brain_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> BUBBLE_CORAL_FAN = getBlockType("bubble_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> FIRE_CORAL_FAN = getBlockType("fire_coral_fan");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> HORN_CORAL_FAN = getBlockType("horn_coral_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> DEAD_TUBE_CORAL_WALL_FAN = getBlockType("dead_tube_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> DEAD_BRAIN_CORAL_WALL_FAN = getBlockType("dead_brain_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> DEAD_BUBBLE_CORAL_WALL_FAN = getBlockType("dead_bubble_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> DEAD_FIRE_CORAL_WALL_FAN = getBlockType("dead_fire_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> DEAD_HORN_CORAL_WALL_FAN = getBlockType("dead_horn_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> TUBE_CORAL_WALL_FAN = getBlockType("tube_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> BRAIN_CORAL_WALL_FAN = getBlockType("brain_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> BUBBLE_CORAL_WALL_FAN = getBlockType("bubble_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> FIRE_CORAL_WALL_FAN = getBlockType("fire_coral_wall_fan");
    /**
     * BlockData: {@link CoralWallFan}
     */
    public static final BlockType<CoralWallFan> HORN_CORAL_WALL_FAN = getBlockType("horn_coral_wall_fan");
    /**
     * BlockData: {@link SeaPickle}
     */
    public static final BlockType<SeaPickle> SEA_PICKLE = getBlockType("sea_pickle");
    public static final BlockType<BlockData> BLUE_ICE = getBlockType("blue_ice");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> CONDUIT = getBlockType("conduit");
    public static final BlockType<BlockData> BAMBOO_SAPLING = getBlockType("bamboo_sapling");
    /**
     * BlockData: {@link Bamboo}
     */
    public static final BlockType<Bamboo> BAMBOO = getBlockType("bamboo");
    public static final BlockType<BlockData> POTTED_BAMBOO = getBlockType("potted_bamboo");
    public static final BlockType<BlockData> VOID_AIR = getBlockType("void_air");
    public static final BlockType<BlockData> CAVE_AIR = getBlockType("cave_air");
    /**
     * BlockData: {@link BubbleColumn}
     */
    public static final BlockType<BubbleColumn> BUBBLE_COLUMN = getBlockType("bubble_column");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> POLISHED_GRANITE_STAIRS = getBlockType("polished_granite_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> SMOOTH_RED_SANDSTONE_STAIRS = getBlockType("smooth_red_sandstone_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> MOSSY_STONE_BRICK_STAIRS = getBlockType("mossy_stone_brick_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> POLISHED_DIORITE_STAIRS = getBlockType("polished_diorite_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> MOSSY_COBBLESTONE_STAIRS = getBlockType("mossy_cobblestone_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> END_STONE_BRICK_STAIRS = getBlockType("end_stone_brick_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> STONE_STAIRS = getBlockType("stone_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> SMOOTH_SANDSTONE_STAIRS = getBlockType("smooth_sandstone_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> SMOOTH_QUARTZ_STAIRS = getBlockType("smooth_quartz_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> GRANITE_STAIRS = getBlockType("granite_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> ANDESITE_STAIRS = getBlockType("andesite_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> RED_NETHER_BRICK_STAIRS = getBlockType("red_nether_brick_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> POLISHED_ANDESITE_STAIRS = getBlockType("polished_andesite_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> DIORITE_STAIRS = getBlockType("diorite_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> POLISHED_GRANITE_SLAB = getBlockType("polished_granite_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> SMOOTH_RED_SANDSTONE_SLAB = getBlockType("smooth_red_sandstone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> MOSSY_STONE_BRICK_SLAB = getBlockType("mossy_stone_brick_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> POLISHED_DIORITE_SLAB = getBlockType("polished_diorite_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> MOSSY_COBBLESTONE_SLAB = getBlockType("mossy_cobblestone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> END_STONE_BRICK_SLAB = getBlockType("end_stone_brick_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> SMOOTH_SANDSTONE_SLAB = getBlockType("smooth_sandstone_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> SMOOTH_QUARTZ_SLAB = getBlockType("smooth_quartz_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> GRANITE_SLAB = getBlockType("granite_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> ANDESITE_SLAB = getBlockType("andesite_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> RED_NETHER_BRICK_SLAB = getBlockType("red_nether_brick_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> POLISHED_ANDESITE_SLAB = getBlockType("polished_andesite_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> DIORITE_SLAB = getBlockType("diorite_slab");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> BRICK_WALL = getBlockType("brick_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> PRISMARINE_WALL = getBlockType("prismarine_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> RED_SANDSTONE_WALL = getBlockType("red_sandstone_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> MOSSY_STONE_BRICK_WALL = getBlockType("mossy_stone_brick_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> GRANITE_WALL = getBlockType("granite_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> STONE_BRICK_WALL = getBlockType("stone_brick_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> MUD_BRICK_WALL = getBlockType("mud_brick_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> NETHER_BRICK_WALL = getBlockType("nether_brick_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> ANDESITE_WALL = getBlockType("andesite_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> RED_NETHER_BRICK_WALL = getBlockType("red_nether_brick_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> SANDSTONE_WALL = getBlockType("sandstone_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> END_STONE_BRICK_WALL = getBlockType("end_stone_brick_wall");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> DIORITE_WALL = getBlockType("diorite_wall");
    /**
     * BlockData: {@link Scaffolding}
     */
    public static final BlockType<Scaffolding> SCAFFOLDING = getBlockType("scaffolding");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> LOOM = getBlockType("loom");
    /**
     * BlockData: {@link Barrel}
     */
    public static final BlockType<Barrel> BARREL = getBlockType("barrel");
    /**
     * BlockData: {@link Furnace}
     */
    public static final BlockType<Furnace> SMOKER = getBlockType("smoker");
    /**
     * BlockData: {@link Furnace}
     */
    public static final BlockType<Furnace> BLAST_FURNACE = getBlockType("blast_furnace");
    public static final BlockType<BlockData> CARTOGRAPHY_TABLE = getBlockType("cartography_table");
    public static final BlockType<BlockData> FLETCHING_TABLE = getBlockType("fletching_table");
    /**
     * BlockData: {@link Grindstone}
     */
    public static final BlockType<Grindstone> GRINDSTONE = getBlockType("grindstone");
    /**
     * BlockData: {@link Lectern}
     */
    public static final BlockType<Lectern> LECTERN = getBlockType("lectern");
    public static final BlockType<BlockData> SMITHING_TABLE = getBlockType("smithing_table");
    /**
     * BlockData: {@link Directional}
     */
    public static final BlockType<Directional> STONECUTTER = getBlockType("stonecutter");
    /**
     * BlockData: {@link Bell}
     */
    public static final BlockType<Bell> BELL = getBlockType("bell");
    /**
     * BlockData: {@link Lantern}
     */
    public static final BlockType<Lantern> LANTERN = getBlockType("lantern");
    /**
     * BlockData: {@link Lantern}
     */
    public static final BlockType<Lantern> SOUL_LANTERN = getBlockType("soul_lantern");
    /**
     * BlockData: {@link Campfire}
     */
    public static final BlockType<Campfire> CAMPFIRE = getBlockType("campfire");
    /**
     * BlockData: {@link Campfire}
     */
    public static final BlockType<Campfire> SOUL_CAMPFIRE = getBlockType("soul_campfire");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> SWEET_BERRY_BUSH = getBlockType("sweet_berry_bush");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> WARPED_STEM = getBlockType("warped_stem");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_WARPED_STEM = getBlockType("stripped_warped_stem");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> WARPED_HYPHAE = getBlockType("warped_hyphae");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_WARPED_HYPHAE = getBlockType("stripped_warped_hyphae");
    public static final BlockType<BlockData> WARPED_NYLIUM = getBlockType("warped_nylium");
    public static final BlockType<BlockData> WARPED_FUNGUS = getBlockType("warped_fungus");
    public static final BlockType<BlockData> WARPED_WART_BLOCK = getBlockType("warped_wart_block");
    public static final BlockType<BlockData> WARPED_ROOTS = getBlockType("warped_roots");
    public static final BlockType<BlockData> NETHER_SPROUTS = getBlockType("nether_sprouts");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> CRIMSON_STEM = getBlockType("crimson_stem");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_CRIMSON_STEM = getBlockType("stripped_crimson_stem");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> CRIMSON_HYPHAE = getBlockType("crimson_hyphae");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> STRIPPED_CRIMSON_HYPHAE = getBlockType("stripped_crimson_hyphae");
    public static final BlockType<BlockData> CRIMSON_NYLIUM = getBlockType("crimson_nylium");
    public static final BlockType<BlockData> CRIMSON_FUNGUS = getBlockType("crimson_fungus");
    public static final BlockType<BlockData> SHROOMLIGHT = getBlockType("shroomlight");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> WEEPING_VINES = getBlockType("weeping_vines");
    public static final BlockType<BlockData> WEEPING_VINES_PLANT = getBlockType("weeping_vines_plant");
    /**
     * BlockData: {@link Ageable}
     */
    public static final BlockType<Ageable> TWISTING_VINES = getBlockType("twisting_vines");
    public static final BlockType<BlockData> TWISTING_VINES_PLANT = getBlockType("twisting_vines_plant");
    public static final BlockType<BlockData> CRIMSON_ROOTS = getBlockType("crimson_roots");
    public static final BlockType<BlockData> CRIMSON_PLANKS = getBlockType("crimson_planks");
    public static final BlockType<BlockData> WARPED_PLANKS = getBlockType("warped_planks");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> CRIMSON_SLAB = getBlockType("crimson_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> WARPED_SLAB = getBlockType("warped_slab");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> CRIMSON_PRESSURE_PLATE = getBlockType("crimson_pressure_plate");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> WARPED_PRESSURE_PLATE = getBlockType("warped_pressure_plate");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> CRIMSON_FENCE = getBlockType("crimson_fence");
    /**
     * BlockData: {@link Fence}
     */
    public static final BlockType<Fence> WARPED_FENCE = getBlockType("warped_fence");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> CRIMSON_TRAPDOOR = getBlockType("crimson_trapdoor");
    /**
     * BlockData: {@link TrapDoor}
     */
    public static final BlockType<TrapDoor> WARPED_TRAPDOOR = getBlockType("warped_trapdoor");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> CRIMSON_FENCE_GATE = getBlockType("crimson_fence_gate");
    /**
     * BlockData: {@link Gate}
     */
    public static final BlockType<Gate> WARPED_FENCE_GATE = getBlockType("warped_fence_gate");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> CRIMSON_STAIRS = getBlockType("crimson_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> WARPED_STAIRS = getBlockType("warped_stairs");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> CRIMSON_BUTTON = getBlockType("crimson_button");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> WARPED_BUTTON = getBlockType("warped_button");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> CRIMSON_DOOR = getBlockType("crimson_door");
    /**
     * BlockData: {@link Door}
     */
    public static final BlockType<Door> WARPED_DOOR = getBlockType("warped_door");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> CRIMSON_SIGN = getBlockType("crimson_sign");
    /**
     * BlockData: {@link Sign}
     */
    public static final BlockType<Sign> WARPED_SIGN = getBlockType("warped_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> CRIMSON_WALL_SIGN = getBlockType("crimson_wall_sign");
    /**
     * BlockData: {@link WallSign}
     */
    public static final BlockType<WallSign> WARPED_WALL_SIGN = getBlockType("warped_wall_sign");
    /**
     * BlockData: {@link StructureBlock}
     */
    public static final BlockType<StructureBlock> STRUCTURE_BLOCK = getBlockType("structure_block");
    /**
     * BlockData: {@link Jigsaw}
     */
    public static final BlockType<Jigsaw> JIGSAW = getBlockType("jigsaw");
    /**
     * BlockData: {@link Levelled}
     */
    public static final BlockType<Levelled> COMPOSTER = getBlockType("composter");
    /**
     * BlockData: {@link AnaloguePowerable}
     */
    public static final BlockType<AnaloguePowerable> TARGET = getBlockType("target");
    /**
     * BlockData: {@link Beehive}
     */
    public static final BlockType<Beehive> BEE_NEST = getBlockType("bee_nest");
    /**
     * BlockData: {@link Beehive}
     */
    public static final BlockType<Beehive> BEEHIVE = getBlockType("beehive");
    public static final BlockType<BlockData> HONEY_BLOCK = getBlockType("honey_block");
    public static final BlockType<BlockData> HONEYCOMB_BLOCK = getBlockType("honeycomb_block");
    public static final BlockType<BlockData> NETHERITE_BLOCK = getBlockType("netherite_block");
    public static final BlockType<BlockData> ANCIENT_DEBRIS = getBlockType("ancient_debris");
    public static final BlockType<BlockData> CRYING_OBSIDIAN = getBlockType("crying_obsidian");
    /**
     * BlockData: {@link RespawnAnchor}
     */
    public static final BlockType<RespawnAnchor> RESPAWN_ANCHOR = getBlockType("respawn_anchor");
    public static final BlockType<BlockData> POTTED_CRIMSON_FUNGUS = getBlockType("potted_crimson_fungus");
    public static final BlockType<BlockData> POTTED_WARPED_FUNGUS = getBlockType("potted_warped_fungus");
    public static final BlockType<BlockData> POTTED_CRIMSON_ROOTS = getBlockType("potted_crimson_roots");
    public static final BlockType<BlockData> POTTED_WARPED_ROOTS = getBlockType("potted_warped_roots");
    public static final BlockType<BlockData> LODESTONE = getBlockType("lodestone");
    public static final BlockType<BlockData> BLACKSTONE = getBlockType("blackstone");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> BLACKSTONE_STAIRS = getBlockType("blackstone_stairs");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> BLACKSTONE_WALL = getBlockType("blackstone_wall");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> BLACKSTONE_SLAB = getBlockType("blackstone_slab");
    public static final BlockType<BlockData> POLISHED_BLACKSTONE = getBlockType("polished_blackstone");
    public static final BlockType<BlockData> POLISHED_BLACKSTONE_BRICKS = getBlockType("polished_blackstone_bricks");
    public static final BlockType<BlockData> CRACKED_POLISHED_BLACKSTONE_BRICKS = getBlockType("cracked_polished_blackstone_bricks");
    public static final BlockType<BlockData> CHISELED_POLISHED_BLACKSTONE = getBlockType("chiseled_polished_blackstone");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> POLISHED_BLACKSTONE_BRICK_SLAB = getBlockType("polished_blackstone_brick_slab");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> POLISHED_BLACKSTONE_BRICK_STAIRS = getBlockType("polished_blackstone_brick_stairs");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> POLISHED_BLACKSTONE_BRICK_WALL = getBlockType("polished_blackstone_brick_wall");
    public static final BlockType<BlockData> GILDED_BLACKSTONE = getBlockType("gilded_blackstone");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> POLISHED_BLACKSTONE_STAIRS = getBlockType("polished_blackstone_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> POLISHED_BLACKSTONE_SLAB = getBlockType("polished_blackstone_slab");
    /**
     * BlockData: {@link Powerable}
     */
    public static final BlockType<Powerable> POLISHED_BLACKSTONE_PRESSURE_PLATE = getBlockType("polished_blackstone_pressure_plate");
    /**
     * BlockData: {@link Switch}
     */
    public static final BlockType<Switch> POLISHED_BLACKSTONE_BUTTON = getBlockType("polished_blackstone_button");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> POLISHED_BLACKSTONE_WALL = getBlockType("polished_blackstone_wall");
    public static final BlockType<BlockData> CHISELED_NETHER_BRICKS = getBlockType("chiseled_nether_bricks");
    public static final BlockType<BlockData> CRACKED_NETHER_BRICKS = getBlockType("cracked_nether_bricks");
    public static final BlockType<BlockData> QUARTZ_BRICKS = getBlockType("quartz_bricks");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> CANDLE = getBlockType("candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> WHITE_CANDLE = getBlockType("white_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> ORANGE_CANDLE = getBlockType("orange_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> MAGENTA_CANDLE = getBlockType("magenta_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> LIGHT_BLUE_CANDLE = getBlockType("light_blue_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> YELLOW_CANDLE = getBlockType("yellow_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> LIME_CANDLE = getBlockType("lime_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> PINK_CANDLE = getBlockType("pink_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> GRAY_CANDLE = getBlockType("gray_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> LIGHT_GRAY_CANDLE = getBlockType("light_gray_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> CYAN_CANDLE = getBlockType("cyan_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> PURPLE_CANDLE = getBlockType("purple_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> BLUE_CANDLE = getBlockType("blue_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> BROWN_CANDLE = getBlockType("brown_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> GREEN_CANDLE = getBlockType("green_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> RED_CANDLE = getBlockType("red_candle");
    /**
     * BlockData: {@link Candle}
     */
    public static final BlockType<Candle> BLACK_CANDLE = getBlockType("black_candle");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> CANDLE_CAKE = getBlockType("candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> WHITE_CANDLE_CAKE = getBlockType("white_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> ORANGE_CANDLE_CAKE = getBlockType("orange_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> MAGENTA_CANDLE_CAKE = getBlockType("magenta_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> LIGHT_BLUE_CANDLE_CAKE = getBlockType("light_blue_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> YELLOW_CANDLE_CAKE = getBlockType("yellow_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> LIME_CANDLE_CAKE = getBlockType("lime_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> PINK_CANDLE_CAKE = getBlockType("pink_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> GRAY_CANDLE_CAKE = getBlockType("gray_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> LIGHT_GRAY_CANDLE_CAKE = getBlockType("light_gray_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> CYAN_CANDLE_CAKE = getBlockType("cyan_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> PURPLE_CANDLE_CAKE = getBlockType("purple_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> BLUE_CANDLE_CAKE = getBlockType("blue_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> BROWN_CANDLE_CAKE = getBlockType("brown_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> GREEN_CANDLE_CAKE = getBlockType("green_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> RED_CANDLE_CAKE = getBlockType("red_candle_cake");
    /**
     * BlockData: {@link Lightable}
     */
    public static final BlockType<Lightable> BLACK_CANDLE_CAKE = getBlockType("black_candle_cake");
    public static final BlockType<BlockData> AMETHYST_BLOCK = getBlockType("amethyst_block");
    public static final BlockType<BlockData> BUDDING_AMETHYST = getBlockType("budding_amethyst");
    /**
     * BlockData: {@link AmethystCluster}
     */
    public static final BlockType<AmethystCluster> AMETHYST_CLUSTER = getBlockType("amethyst_cluster");
    /**
     * BlockData: {@link AmethystCluster}
     */
    public static final BlockType<AmethystCluster> LARGE_AMETHYST_BUD = getBlockType("large_amethyst_bud");
    /**
     * BlockData: {@link AmethystCluster}
     */
    public static final BlockType<AmethystCluster> MEDIUM_AMETHYST_BUD = getBlockType("medium_amethyst_bud");
    /**
     * BlockData: {@link AmethystCluster}
     */
    public static final BlockType<AmethystCluster> SMALL_AMETHYST_BUD = getBlockType("small_amethyst_bud");
    public static final BlockType<BlockData> TUFF = getBlockType("tuff");
    public static final BlockType<BlockData> CALCITE = getBlockType("calcite");
    public static final BlockType<BlockData> TINTED_GLASS = getBlockType("tinted_glass");
    public static final BlockType<BlockData> POWDER_SNOW = getBlockType("powder_snow");
    /**
     * BlockData: {@link SculkSensor}
     */
    public static final BlockType<SculkSensor> SCULK_SENSOR = getBlockType("sculk_sensor");
    public static final BlockType<BlockData> SCULK = getBlockType("sculk");
    /**
     * BlockData: {@link SculkVein}
     */
    public static final BlockType<SculkVein> SCULK_VEIN = getBlockType("sculk_vein");
    /**
     * BlockData: {@link SculkCatalyst}
     */
    public static final BlockType<SculkCatalyst> SCULK_CATALYST = getBlockType("sculk_catalyst");
    /**
     * BlockData: {@link SculkShrieker}
     */
    public static final BlockType<SculkShrieker> SCULK_SHRIEKER = getBlockType("sculk_shrieker");
    public static final BlockType<BlockData> OXIDIZED_COPPER = getBlockType("oxidized_copper");
    public static final BlockType<BlockData> WEATHERED_COPPER = getBlockType("weathered_copper");
    public static final BlockType<BlockData> EXPOSED_COPPER = getBlockType("exposed_copper");
    public static final BlockType<BlockData> COPPER_BLOCK = getBlockType("copper_block");
    public static final BlockType<BlockData> COPPER_ORE = getBlockType("copper_ore");
    public static final BlockType<BlockData> DEEPSLATE_COPPER_ORE = getBlockType("deepslate_copper_ore");
    public static final BlockType<BlockData> OXIDIZED_CUT_COPPER = getBlockType("oxidized_cut_copper");
    public static final BlockType<BlockData> WEATHERED_CUT_COPPER = getBlockType("weathered_cut_copper");
    public static final BlockType<BlockData> EXPOSED_CUT_COPPER = getBlockType("exposed_cut_copper");
    public static final BlockType<BlockData> CUT_COPPER = getBlockType("cut_copper");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> OXIDIZED_CUT_COPPER_STAIRS = getBlockType("oxidized_cut_copper_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> WEATHERED_CUT_COPPER_STAIRS = getBlockType("weathered_cut_copper_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> EXPOSED_CUT_COPPER_STAIRS = getBlockType("exposed_cut_copper_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> CUT_COPPER_STAIRS = getBlockType("cut_copper_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> OXIDIZED_CUT_COPPER_SLAB = getBlockType("oxidized_cut_copper_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> WEATHERED_CUT_COPPER_SLAB = getBlockType("weathered_cut_copper_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> EXPOSED_CUT_COPPER_SLAB = getBlockType("exposed_cut_copper_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> CUT_COPPER_SLAB = getBlockType("cut_copper_slab");
    public static final BlockType<BlockData> WAXED_COPPER_BLOCK = getBlockType("waxed_copper_block");
    public static final BlockType<BlockData> WAXED_WEATHERED_COPPER = getBlockType("waxed_weathered_copper");
    public static final BlockType<BlockData> WAXED_EXPOSED_COPPER = getBlockType("waxed_exposed_copper");
    public static final BlockType<BlockData> WAXED_OXIDIZED_COPPER = getBlockType("waxed_oxidized_copper");
    public static final BlockType<BlockData> WAXED_OXIDIZED_CUT_COPPER = getBlockType("waxed_oxidized_cut_copper");
    public static final BlockType<BlockData> WAXED_WEATHERED_CUT_COPPER = getBlockType("waxed_weathered_cut_copper");
    public static final BlockType<BlockData> WAXED_EXPOSED_CUT_COPPER = getBlockType("waxed_exposed_cut_copper");
    public static final BlockType<BlockData> WAXED_CUT_COPPER = getBlockType("waxed_cut_copper");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> WAXED_OXIDIZED_CUT_COPPER_STAIRS = getBlockType("waxed_oxidized_cut_copper_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> WAXED_WEATHERED_CUT_COPPER_STAIRS = getBlockType("waxed_weathered_cut_copper_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> WAXED_EXPOSED_CUT_COPPER_STAIRS = getBlockType("waxed_exposed_cut_copper_stairs");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> WAXED_CUT_COPPER_STAIRS = getBlockType("waxed_cut_copper_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> WAXED_OXIDIZED_CUT_COPPER_SLAB = getBlockType("waxed_oxidized_cut_copper_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> WAXED_WEATHERED_CUT_COPPER_SLAB = getBlockType("waxed_weathered_cut_copper_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> WAXED_EXPOSED_CUT_COPPER_SLAB = getBlockType("waxed_exposed_cut_copper_slab");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> WAXED_CUT_COPPER_SLAB = getBlockType("waxed_cut_copper_slab");
    /**
     * BlockData: {@link LightningRod}
     */
    public static final BlockType<LightningRod> LIGHTNING_ROD = getBlockType("lightning_rod");
    /**
     * BlockData: {@link PointedDripstone}
     */
    public static final BlockType<PointedDripstone> POINTED_DRIPSTONE = getBlockType("pointed_dripstone");
    public static final BlockType<BlockData> DRIPSTONE_BLOCK = getBlockType("dripstone_block");
    /**
     * BlockData: {@link CaveVines}
     */
    public static final BlockType<CaveVines> CAVE_VINES = getBlockType("cave_vines");
    /**
     * BlockData: {@link CaveVinesPlant}
     */
    public static final BlockType<CaveVinesPlant> CAVE_VINES_PLANT = getBlockType("cave_vines_plant");
    public static final BlockType<BlockData> SPORE_BLOSSOM = getBlockType("spore_blossom");
    public static final BlockType<BlockData> AZALEA = getBlockType("azalea");
    public static final BlockType<BlockData> FLOWERING_AZALEA = getBlockType("flowering_azalea");
    public static final BlockType<BlockData> MOSS_CARPET = getBlockType("moss_carpet");
    /**
     * BlockData: {@link PinkPetals}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<PinkPetals> PINK_PETALS = getBlockType("pink_petals");
    public static final BlockType<BlockData> MOSS_BLOCK = getBlockType("moss_block");
    /**
     * BlockData: {@link BigDripleaf}
     */
    public static final BlockType<BigDripleaf> BIG_DRIPLEAF = getBlockType("big_dripleaf");
    /**
     * BlockData: {@link Dripleaf}
     */
    public static final BlockType<Dripleaf> BIG_DRIPLEAF_STEM = getBlockType("big_dripleaf_stem");
    /**
     * BlockData: {@link SmallDripleaf}
     */
    public static final BlockType<SmallDripleaf> SMALL_DRIPLEAF = getBlockType("small_dripleaf");
    /**
     * BlockData: {@link Waterlogged}
     */
    public static final BlockType<Waterlogged> HANGING_ROOTS = getBlockType("hanging_roots");
    public static final BlockType<BlockData> ROOTED_DIRT = getBlockType("rooted_dirt");
    public static final BlockType<BlockData> MUD = getBlockType("mud");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> DEEPSLATE = getBlockType("deepslate");
    public static final BlockType<BlockData> COBBLED_DEEPSLATE = getBlockType("cobbled_deepslate");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> COBBLED_DEEPSLATE_STAIRS = getBlockType("cobbled_deepslate_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> COBBLED_DEEPSLATE_SLAB = getBlockType("cobbled_deepslate_slab");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> COBBLED_DEEPSLATE_WALL = getBlockType("cobbled_deepslate_wall");
    public static final BlockType<BlockData> POLISHED_DEEPSLATE = getBlockType("polished_deepslate");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> POLISHED_DEEPSLATE_STAIRS = getBlockType("polished_deepslate_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> POLISHED_DEEPSLATE_SLAB = getBlockType("polished_deepslate_slab");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> POLISHED_DEEPSLATE_WALL = getBlockType("polished_deepslate_wall");
    public static final BlockType<BlockData> DEEPSLATE_TILES = getBlockType("deepslate_tiles");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> DEEPSLATE_TILE_STAIRS = getBlockType("deepslate_tile_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> DEEPSLATE_TILE_SLAB = getBlockType("deepslate_tile_slab");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> DEEPSLATE_TILE_WALL = getBlockType("deepslate_tile_wall");
    public static final BlockType<BlockData> DEEPSLATE_BRICKS = getBlockType("deepslate_bricks");
    /**
     * BlockData: {@link Stairs}
     */
    public static final BlockType<Stairs> DEEPSLATE_BRICK_STAIRS = getBlockType("deepslate_brick_stairs");
    /**
     * BlockData: {@link Slab}
     */
    public static final BlockType<Slab> DEEPSLATE_BRICK_SLAB = getBlockType("deepslate_brick_slab");
    /**
     * BlockData: {@link Wall}
     */
    public static final BlockType<Wall> DEEPSLATE_BRICK_WALL = getBlockType("deepslate_brick_wall");
    public static final BlockType<BlockData> CHISELED_DEEPSLATE = getBlockType("chiseled_deepslate");
    public static final BlockType<BlockData> CRACKED_DEEPSLATE_BRICKS = getBlockType("cracked_deepslate_bricks");
    public static final BlockType<BlockData> CRACKED_DEEPSLATE_TILES = getBlockType("cracked_deepslate_tiles");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> INFESTED_DEEPSLATE = getBlockType("infested_deepslate");
    public static final BlockType<BlockData> SMOOTH_BASALT = getBlockType("smooth_basalt");
    public static final BlockType<BlockData> RAW_IRON_BLOCK = getBlockType("raw_iron_block");
    public static final BlockType<BlockData> RAW_COPPER_BLOCK = getBlockType("raw_copper_block");
    public static final BlockType<BlockData> RAW_GOLD_BLOCK = getBlockType("raw_gold_block");
    public static final BlockType<BlockData> POTTED_AZALEA_BUSH = getBlockType("potted_azalea_bush");
    public static final BlockType<BlockData> POTTED_FLOWERING_AZALEA_BUSH = getBlockType("potted_flowering_azalea_bush");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> OCHRE_FROGLIGHT = getBlockType("ochre_froglight");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> VERDANT_FROGLIGHT = getBlockType("verdant_froglight");
    /**
     * BlockData: {@link Orientable}
     */
    public static final BlockType<Orientable> PEARLESCENT_FROGLIGHT = getBlockType("pearlescent_froglight");
    public static final BlockType<BlockData> FROGSPAWN = getBlockType("frogspawn");
    public static final BlockType<BlockData> REINFORCED_DEEPSLATE = getBlockType("reinforced_deepslate");
    /**
     * BlockData: {@link DecoratedPot}
     */
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final BlockType<DecoratedPot> DECORATED_POT = getBlockType("decorated_pot");
    //</editor-fold>

    @NotNull
    private static <B extends BlockData> BlockType<B> getBlockType(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        BlockType<?> blockType = Registry.BLOCK_TYPE.get(namespacedKey);
        Preconditions.checkNotNull(blockType, "No BlockType found for %s. This is a bug.", namespacedKey);
        return (BlockType<B>) blockType;
    }

    /**
     * Returns true if this BlockType has a corresponding {@link ItemType}.
     * <p>
     * Where corresponding means, that they have the same {@link NamespacedKey}
     * returned by {@link #getKey()}.
     *
     * @return true if there is a ItemType with the same key, otherwise false
     * @see #getItemType()
     */
    public abstract boolean hasItemType();

    /**
     * Returns the corresponding {@link ItemType} for the given BlockType.
     * <p>
     * Where corresponding means, that they have the same {@link NamespacedKey}
     * returned by {@link #getKey()}.
     * <p>
     * If there is no corresponding {@link ItemType} an error will be thrown.
     *
     * @return the corresponding ItemType
     * @see #hasItemType()
     * @see BlockData#getPlacementType()
     */
    @NotNull
    public abstract ItemType getItemType();

    /**
     * Gets the BlockData class of this BlockType
     *
     * @return the BlockData class of this BlockType
     */
    @NotNull
    public abstract Class<B> getBlockDataClass();

    /**
     * Creates a new {@link BlockData} instance for this block type, with all
     * properties initialized to unspecified defaults.
     *
     * @return new data instance
     */
    @NotNull
    public abstract B createBlockData();

    /**
     * Creates a new {@link BlockData} instance for this block type, with
     * all properties initialized to unspecified defaults.
     *
     * @param consumer consumer to run on new instance before returning
     * @return new data instance
     */
    @NotNull
    public abstract B createBlockData(@Nullable Consumer<B> consumer);

    /**
     * Creates a new {@link BlockData} instance for this block type, with all
     * properties initialized to unspecified defaults, except for those provided
     * in data.
     *
     * @param data data string
     * @return new data instance
     * @throws IllegalArgumentException if the specified data is not valid
     */
    @NotNull
    public abstract B createBlockData(@Nullable String data);

    /**
     * Check if the blockt type is solid (can be built upon)
     *
     * @return True if this block type is solid
     */
    public abstract boolean isSolid();

    /**
     * Check if the block type can catch fire
     *
     * @return True if this block type can catch fire
     */
    public abstract boolean isFlammable();

    /**
     * Check if the block type can burn away
     *
     * @return True if this block type can burn away
     */
    public abstract boolean isBurnable();

    /**
     * Check if the block type is occludes light in the lighting engine.
     * <p>
     * Generally speaking, most full blocks will occlude light. Non-full blocks are
     * not occluding (e.g. anvils, chests, tall grass, stairs, etc.), nor are specific
     * full blocks such as barriers or spawners which block light despite their texture.
     * <p>
     * An occluding block will have the following effects:
     * <ul>
     *   <li>Chests cannot be opened if an occluding block is above it.
     *   <li>Mobs cannot spawn inside of occluding blocks.
     *   <li>Only occluding blocks can be "powered" ({@link Block#isBlockPowered()}).
     * </ul>
     * This list may be inconclusive. For a full list of the side effects of an occluding
     * block, see the <a href="https://minecraft.fandom.com/wiki/Opacity">Minecraft Wiki</a>.
     *
     * @return True if this block type occludes light
     */
    public abstract boolean isOccluding();

    /**
     * @return True if this block type is affected by gravity.
     */
    public abstract boolean hasGravity();

    /**
     * Checks if this block type can be interacted with.
     * <p>
     * Interactable block types include those with functionality when they are
     * interacted with by a player such as chests, furnaces, etc.
     * <p>
     * Some blocks such as piston heads and stairs are considered interactable
     * though may not perform any additional functionality.
     * <p>
     * Note that the interactability of some block types may be dependant on their
     * state as well. This method will return true if there is at least one
     * state in which additional interact handling is performed for the
     * block type.
     *
     * @return true if this block type can be interacted with.
     */
    public abstract boolean isInteractable();

    /**
     * Obtains the block's hardness level (also known as "strength").
     * <br>
     * This number is used to calculate the time required to break each block.
     *
     * @return the hardness of that block type.
     */
    public abstract float getHardness();

    /**
     * Obtains the blast resistance value (also known as block "durability").
     * <br>
     * This value is used in explosions to calculate whether a block should be
     * broken or not.
     *
     * @return the blast resistance of that block type.
     */
    public abstract float getBlastResistance();

    /**
     * Returns a value that represents how 'slippery' the block is.
     * <p>
     * Blocks with higher slipperiness, like {@link BlockType#ICE} can be slid on
     * further by the player and other entities.
     * <p>
     * Most blocks have a default slipperiness of {@code 0.6f}.
     *
     * @return the slipperiness of this block
     */
    public abstract float getSlipperiness();

    /**
     * Check if the block type is an air block.
     *
     * @return True if this block type is an air block.
     */
    public abstract boolean isAir();
}
