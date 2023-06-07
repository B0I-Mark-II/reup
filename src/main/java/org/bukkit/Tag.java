package org.bukkit;

import java.util.Set;
import org.bukkit.block.BlockType;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemType;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a tag that may be defined by the server or a resource pack to
 * group like things together.
 *
 * Note that whilst all tags defined within this interface must be present in
 * implementations, their existence is not guaranteed across future versions.
 *
 * @param <T> the type of things grouped by this tag
 */
public interface Tag<T extends Keyed> extends Keyed {

    /**
     * Key for the built in block registry.
     */
    String REGISTRY_BLOCKS = "blocks";
    /**
     * Vanilla block tag representing all colors of wool.
     */
    Tag<BlockType> WOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wool"), BlockType.class);
    /**
     * Vanilla block tag representing all plank variants.
     */
    Tag<BlockType> PLANKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("planks"), BlockType.class);
    /**
     * Vanilla block tag representing all regular/mossy/cracked/chiseled stone
     * bricks.
     */
    Tag<BlockType> STONE_BRICKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stone_bricks"), BlockType.class);
    /**
     * Vanilla block tag representing all wooden buttons.
     */
    Tag<BlockType> WOODEN_BUTTONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_buttons"), BlockType.class);
    /**
     * Vanilla block tag representing all stone buttons.
     */
    Tag<BlockType> STONE_BUTTONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stone_buttons"), BlockType.class);
    /**
     * Vanilla block tag representing all buttons (inherits from
     * {@link #WOODEN_BUTTONS}.
     */
    Tag<BlockType> BUTTONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("buttons"), BlockType.class);
    /**
     * Vanilla block tag representing all colors of carpet.
     */
    Tag<BlockType> WOOL_CARPETS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wool_carpets"), BlockType.class);
    /**
     * @deprecated {@link #WOOL_CARPETS}.
     */
    @Deprecated
    Tag<BlockType> CARPETS = WOOL_CARPETS;
    /**
     * Vanilla block tag representing all wooden doors.
     */
    Tag<BlockType> WOODEN_DOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_doors"), BlockType.class);
    /**
     * Vanilla block tag representing all wooden stairs.
     */
    Tag<BlockType> WOODEN_STAIRS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_stairs"), BlockType.class);
    /**
     * Vanilla block tag representing all wooden slabs.
     */
    Tag<BlockType> WOODEN_SLABS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_slabs"), BlockType.class);
    /**
     * Vanilla block tag representing all wooden fences.
     */
    Tag<BlockType> WOODEN_FENCES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_fences"), BlockType.class);
    /**
     * Vanilla block tag representing all pressure plates.
     */
    Tag<BlockType> PRESSURE_PLATES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("pressure_plates"), BlockType.class);
    /**
     * Vanilla block tag representing all wooden pressure plates.
     */
    Tag<BlockType> WOODEN_PRESSURE_PLATES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_pressure_plates"), BlockType.class);
    /**
     * Vanilla block tag representing all stone pressure plates.
     */
    Tag<BlockType> STONE_PRESSURE_PLATES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stone_pressure_plates"), BlockType.class);
    /**
     * Vanilla block tag representing all wooden trapdoors.
     */
    Tag<BlockType> WOODEN_TRAPDOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wooden_trapdoors"), BlockType.class);
    /**
     * Vanilla block tag representing all doors (inherits from
     * {@link #WOODEN_DOORS}.
     */
    Tag<BlockType> DOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("doors"), BlockType.class);
    /**
     * Vanilla block tag representing all sapling variants.
     */
    Tag<BlockType> SAPLINGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("saplings"), BlockType.class);
    /**
     * Vanilla block tag representing all log and bark variants that burn.
     */
    Tag<BlockType> LOGS_THAT_BURN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("logs_that_burn"), BlockType.class);
    /**
     * Vanilla block tag representing all log and bark variants.
     */
    Tag<BlockType> LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("logs"), BlockType.class);
    /**
     * Vanilla block tag representing all dark oak log and bark variants.
     */
    Tag<BlockType> DARK_OAK_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dark_oak_logs"), BlockType.class);
    /**
     * Vanilla block tag representing all oak log and bark variants.
     */
    Tag<BlockType> OAK_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("oak_logs"), BlockType.class);
    /**
     * Vanilla block tag representing all birch log and bark variants.
     */
    Tag<BlockType> BIRCH_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("birch_logs"), BlockType.class);
    /**
     * Vanilla block tag representing all acacia log and bark variants.
     */
    Tag<BlockType> ACACIA_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("acacia_logs"), BlockType.class);
    /**
     * Vanilla block tag representing all cherry log and bark variants.
     */
    Tag<BlockType> CHERRY_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cherry_logs"), BlockType.class);
    /**
     * Vanilla block tag representing all jungle log and bark variants.
     */
    Tag<BlockType> JUNGLE_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("jungle_logs"), BlockType.class);
    /**
     * Vanilla block tag representing all spruce log and bark variants.
     */
    Tag<BlockType> SPRUCE_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("spruce_logs"), BlockType.class);
    /**
     * Vanilla block tag representing all mangrove log and bark variants.
     */
    Tag<BlockType> MANGROVE_LOGS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mangrove_logs"), BlockType.class);
    /**
     * Vanilla block tag representing all crimson stems.
     */
    Tag<BlockType> CRIMSON_STEMS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("crimson_stems"), BlockType.class);
    /**
     * Vanilla block tag representing all warped stems.
     */
    Tag<BlockType> WARPED_STEMS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("warped_stems"), BlockType.class);
    /**
     * Vanilla block tag representing all bamboo blocks.
     */
    Tag<BlockType> BAMBOO_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("bamboo_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all banner blocks.
     */
    Tag<BlockType> BANNERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("banners"), BlockType.class);
    /**
     * Vanilla block tag representing all sand blocks.
     */
    Tag<BlockType> SAND = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sand"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which smelt to glass in a furnace.
     */
    Tag<BlockType> SMELTS_TO_GLASS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("smelts_to_glass"), BlockType.class);
    /**
     * Vanilla block tag representing all stairs.
     */
    Tag<BlockType> STAIRS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stairs"), BlockType.class);
    /**
     * Vanilla block tag representing all slabs.
     */
    Tag<BlockType> SLABS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("slabs"), BlockType.class);
    /**
     * Vanilla block tag representing all walls.
     */
    Tag<BlockType> WALLS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("walls"), BlockType.class);
    /**
     * Vanilla block tag representing all damaged and undamaged anvils.
     */
    Tag<BlockType> ANVIL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("anvil"), BlockType.class);
    /**
     * Vanilla block tag representing all Minecart rails.
     */
    Tag<BlockType> RAILS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("rails"), BlockType.class);
    /**
     * Vanilla block tag representing all leaves fans.
     */
    Tag<BlockType> LEAVES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("leaves"), BlockType.class);
    /**
     * Vanilla block tag representing all trapdoors (inherits from
     * {@link #WOODEN_TRAPDOORS}.
     */
    Tag<BlockType> TRAPDOORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("trapdoors"), BlockType.class);
    /**
     * Vanilla block tag representing all empty and filled flower pots.
     */
    Tag<BlockType> FLOWER_POTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("flower_pots"), BlockType.class);
    /**
     * Vanilla block tag representing all small flowers.
     */
    Tag<BlockType> SMALL_FLOWERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("small_flowers"), BlockType.class);
    /**
     * Vanilla block tag representing all beds.
     */
    Tag<BlockType> BEDS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("beds"), BlockType.class);
    /**
     * Vanilla block tag representing all fences.
     */
    Tag<BlockType> FENCES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fences"), BlockType.class);
    /**
     * Vanilla block tag representing all tall flowers.
     */
    Tag<BlockType> TALL_FLOWERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("tall_flowers"), BlockType.class);
    /**
     * Vanilla block tag representing all flowers.
     */
    Tag<BlockType> FLOWERS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("flowers"), BlockType.class);
    /**
     * Vanilla block tag representing all piglin repellents.
     */
    Tag<BlockType> PIGLIN_REPELLENTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("piglin_repellents"), BlockType.class);
    /**
     * Vanilla block tag representing all gold ores.
     */
    Tag<BlockType> GOLD_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("gold_ores"), BlockType.class);
    /**
     * Vanilla block tag representing all iron ores.
     */
    Tag<BlockType> IRON_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("iron_ores"), BlockType.class);
    /**
     * Vanilla block tag representing all diamond ores.
     */
    Tag<BlockType> DIAMOND_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("diamond_ores"), BlockType.class);
    /**
     * Vanilla block tag representing all redstone ores.
     */
    Tag<BlockType> REDSTONE_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("redstone_ores"), BlockType.class);
    /**
     * Vanilla block tag representing all lapis ores.
     */
    Tag<BlockType> LAPIS_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("lapis_ores"), BlockType.class);
    /**
     * Vanilla block tag representing all coal ores.
     */
    Tag<BlockType> COAL_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("coal_ores"), BlockType.class);
    /**
     * Vanilla block tag representing all emerald ores.
     */
    Tag<BlockType> EMERALD_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("emerald_ores"), BlockType.class);
    /**
     * Vanilla block tag representing all copper ores.
     */
    Tag<BlockType> COPPER_ORES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("copper_ores"), BlockType.class);
    /**
     * Vanilla block tag representing all candles.
     */
    Tag<BlockType> CANDLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("candles"), BlockType.class);
    /**
     * Vanilla block tag representing all dirt.
     */
    Tag<BlockType> DIRT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dirt"), BlockType.class);
    /**
     * Vanilla block tag representing all terracotta.
     */
    Tag<BlockType> TERRACOTTA = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("terracotta"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which complete the find tree
     * tutorial.
     */
    Tag<BlockType> COMPLETES_FIND_TREE_TUTORIAL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("completes_find_tree_tutorial"), BlockType.class);
    /**
     * Vanilla block tag denoting blocks that enderman may pick up and hold.
     */
    Tag<BlockType> ENDERMAN_HOLDABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("enderman_holdable"), BlockType.class);
    /**
     * Vanilla block tag denoting ice blocks.
     */
    Tag<BlockType> ICE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("ice"), BlockType.class);
    /**
     * Vanilla block tag denoting all valid mob spawn positions.
     */
    Tag<BlockType> VALID_SPAWN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("valid_spawn"), BlockType.class);
    /**
     * Vanilla block tag denoting impermeable blocks which do not drip fluids.
     */
    Tag<BlockType> IMPERMEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("impermeable"), BlockType.class);
    /**
     * Vanilla block tag denoting all underwater blocks which may be bonemealed.
     */
    Tag<BlockType> UNDERWATER_BONEMEALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("underwater_bonemeals"), BlockType.class);
    /**
     * Vanilla block tag representing all coral blocks.
     */
    Tag<BlockType> CORAL_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("coral_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all wall corals.
     */
    Tag<BlockType> WALL_CORALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wall_corals"), BlockType.class);
    /**
     * Vanilla block tag representing all coral plants.
     */
    Tag<BlockType> CORAL_PLANTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("coral_plants"), BlockType.class);
    /**
     * Vanilla block tag representing all coral.
     */
    Tag<BlockType> CORALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("corals"), BlockType.class);
    /**
     * Vanilla block tag denoting all blocks bamboo may be planted on.
     */
    Tag<BlockType> BAMBOO_PLANTABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("bamboo_plantable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all standing signs.
     */
    Tag<BlockType> STANDING_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("standing_signs"), BlockType.class);
    /**
     * Vanilla block tag representing all wall signs.
     */
    Tag<BlockType> WALL_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wall_signs"), BlockType.class);
    /**
     * Vanilla block tag representing all regular signs.
     */
    Tag<BlockType> SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("signs"), BlockType.class);
    /**
     * Vanilla block tag representing all ceiling signs.
     */
    Tag<BlockType> CEILING_HANGING_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("ceiling_hanging_signs"), BlockType.class);
    /**
     * Vanilla block tag representing all wall hanging signs.
     */
    Tag<BlockType> WALL_HANGING_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wall_hanging_signs"), BlockType.class);
    /**
     * Vanilla block tag representing all hanging signs.
     */
    Tag<BlockType> ALL_HANGING_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("all_hanging_signs"), BlockType.class);
    /**
     * Vanilla block tag representing all signs, regardless of type.
     */
    Tag<BlockType> ALL_SIGNS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("all_signs"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks immune to dragons.
     */
    Tag<BlockType> DRAGON_IMMUNE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dragon_immune"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks transparent to the ender
     * dragon.
     */
    Tag<BlockType> DRAGON_TRANSPARENT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dragon_transparent"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks immune to withers.
     */
    Tag<BlockType> WITHER_IMMUNE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wither_immune"), BlockType.class);
    /**
     * Vanilla block tag representing all base blocks used for wither summoning.
     */
    Tag<BlockType> WITHER_SUMMON_BASE_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wither_summon_base_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all beehives.
     */
    Tag<BlockType> BEEHIVES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("beehives"), BlockType.class);
    /**
     * Vanilla block tag representing all crops.
     */
    Tag<BlockType> CROPS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("crops"), BlockType.class);
    /**
     * Vanilla block tag representing all bee growables.
     */
    Tag<BlockType> BEE_GROWABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("bee_growables"), BlockType.class);
    /**
     * Vanilla block tag representing all portals.
     */
    Tag<BlockType> PORTALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("portals"), BlockType.class);
    /**
     * Vanilla block tag representing all fire blocks.
     */
    Tag<BlockType> FIRE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fire"), BlockType.class);
    /**
     * Vanilla block tag representing all nylium blocks.
     */
    Tag<BlockType> NYLIUM = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("nylium"), BlockType.class);
    /**
     * Vanilla block tag representing all wart blocks.
     */
    Tag<BlockType> WART_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wart_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all beacon base blocks.
     */
    Tag<BlockType> BEACON_BASE_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("beacon_base_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks affected by the soul speed
     * enchantment.
     */
    Tag<BlockType> SOUL_SPEED_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("soul_speed_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all wall post overrides.
     */
    Tag<BlockType> WALL_POST_OVERRIDE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wall_post_override"), BlockType.class);
    /**
     * Vanilla block tag representing all climbable blocks.
     */
    Tag<BlockType> CLIMBABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("climbable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which reset fall damage.
     */
    Tag<BlockType> FALL_DAMAGE_RESETTING = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fall_damage_resetting"), BlockType.class);
    /**
     * Vanilla block tag representing all shulker boxes.
     */
    Tag<BlockType> SHULKER_BOXES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("shulker_boxes"), BlockType.class);
    /**
     * Vanilla block tag representing all hoglin repellents.
     */
    Tag<BlockType> HOGLIN_REPELLENTS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("hoglin_repellents"), BlockType.class);
    /**
     * Vanilla block tag representing all soul fire base blocks.
     */
    Tag<BlockType> SOUL_FIRE_BASE_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("soul_fire_base_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all warm strider blocks.
     */
    Tag<BlockType> STRIDER_WARM_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("strider_warm_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all campfires.
     */
    Tag<BlockType> CAMPFIRES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("campfires"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks guarded by piglins.
     */
    Tag<BlockType> GUARDED_BY_PIGLINS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("guarded_by_piglins"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that prevent inside mob
     * spawning.
     */
    Tag<BlockType> PREVENT_MOB_SPAWNING_INSIDE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("prevent_mob_spawning_inside"), BlockType.class);
    /**
     * Vanilla block tag representing all fence gates.
     */
    Tag<BlockType> FENCE_GATES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("fence_gates"), BlockType.class);
    /**
     * Vanilla block tag representing all unstable bottom center blocks.
     */
    Tag<BlockType> UNSTABLE_BOTTOM_CENTER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("unstable_bottom_center"), BlockType.class);
    Tag<BlockType> MUSHROOM_GROW_BLOCK = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mushroom_grow_block"), BlockType.class);

    /**
     * Vanilla block tag representing all blocks that burn forever in the
     * overworld.
     */
    Tag<BlockType> INFINIBURN_OVERWORLD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("infiniburn_overworld"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that burn forever in the
     * nether.
     */
    Tag<BlockType> INFINIBURN_NETHER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("infiniburn_nether"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that burn forever in the end.
     */
    Tag<BlockType> INFINIBURN_END = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("infiniburn_end"), BlockType.class);
    /**
     * Vanilla block tag representing the overworld base BlockType.
     */
    Tag<BlockType> BASE_STONE_OVERWORLD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("base_stone_overworld"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that may be replaced by ores.
     */
    Tag<BlockType> STONE_ORE_REPLACEABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("stone_ore_replaceables"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that may be replaced by
     * deepslate ores.
     */
    Tag<BlockType> DEEPSLATE_ORE_REPLACEABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("deepslate_ore_replaceables"), BlockType.class);
    /**
     * Vanilla block tag representing the nether base BlockType.
     */
    Tag<BlockType> BASE_STONE_NETHER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("base_stone_nether"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks replaceable by the overworld
     * carver.
     */
    Tag<BlockType> OVERWORLD_CARVER_REPLACEABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("overworld_carver_replaceables"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks replaceable by the nether
     * carver.
     */
    Tag<BlockType> NETHER_CARVER_REPLACEABLES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("nether_carver_replaceables"), BlockType.class);
    /**
     * Vanilla block tag representing all candle cakes.
     */
    Tag<BlockType> CANDLE_CAKES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("candle_cakes"), BlockType.class);
    /**
     * Vanilla block tag representing all cauldrons.
     */
    Tag<BlockType> CAULDRONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cauldrons"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that make crystal sounds.
     */
    Tag<BlockType> CRYSTAL_SOUND_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("crystal_sound_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that play muffled step sounds.
     */
    Tag<BlockType> INSIDE_STEP_SOUND_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("inside_step_sound_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that play combination step sounds.
     */
    Tag<BlockType> COMBINATION_STEP_SOUND_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("combination_step_sound_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that block vibration signals.
     */
    Tag<BlockType> OCCLUDES_VIBRATION_SIGNALS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("occludes_vibration_signals"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that dampen the propagation of
     * vibration signals.
     */
    Tag<BlockType> DAMPENS_VIBRATIONS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dampens_vibrations"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that are replaceable by
     * dripstone.
     */
    Tag<BlockType> DRIPSTONE_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dripstone_replaceable_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all cave vines.
     */
    Tag<BlockType> CAVE_VINES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("cave_vines"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks replaceable by moss.
     */
    Tag<BlockType> MOSS_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("moss_replaceable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks replaceable by lush ground.
     */
    Tag<BlockType> LUSH_GROUND_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("lush_ground_replaceable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks replaceable by azalea root.
     */
    Tag<BlockType> AZALEA_ROOT_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("azalea_root_replaceable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which small dripleaf can be
     * placed on.
     */
    Tag<BlockType> SMALL_DRIPLEAF_PLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("small_dripleaf_placeable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which big dripleaf can be
     * placed on.
     */
    Tag<BlockType> BIG_DRIPLEAF_PLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("big_dripleaf_placeable"), BlockType.class);
    /**
     * Vanilla block tag representing all snow blocks.
     */
    Tag<BlockType> SNOW = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("snow"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks mineable with an axe.
     */
    Tag<BlockType> MINEABLE_AXE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mineable/axe"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks mineable with a hoe.
     */
    Tag<BlockType> MINEABLE_HOE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mineable/hoe"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks mineable with a pickaxe.
     */
    Tag<BlockType> MINEABLE_PICKAXE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mineable/pickaxe"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks mineable with a shovel.
     */
    Tag<BlockType> MINEABLE_SHOVEL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mineable/shovel"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks that can be efficiently mined with a sword.
     */
    Tag<BlockType> SWORD_EFFICIENT = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sword_efficient"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which require a diamond tool.
     */
    Tag<BlockType> NEEDS_DIAMOND_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("needs_diamond_tool"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which require an iron tool.
     */
    Tag<BlockType> NEEDS_IRON_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("needs_iron_tool"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which require a stone tool.
     */
    Tag<BlockType> NEEDS_STONE_TOOL = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("needs_stone_tool"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which will not be replaced by
     * world generation features.
     */
    Tag<BlockType> FEATURES_CANNOT_REPLACE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("features_cannot_replace"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which lava pools will not
     * replace.
     */
    Tag<BlockType> LAVA_POOL_STONE_CANNOT_REPLACE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("lava_pool_stone_cannot_replace"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which geodes will not spawn in.
     */
    Tag<BlockType> GEODE_INVALID_BLOCKS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("geode_invalid_blocks"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which frogs prefer to jump to.
     */
    Tag<BlockType> FROG_PREFER_JUMP_TO = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("frog_prefer_jump_to"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which can be replaced by skulk.
     */
    Tag<BlockType> SCULK_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sculk_replaceable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which can be replaced by skulk
     * during world generation.
     */
    Tag<BlockType> SCULK_REPLACEABLE_WORLD_GEN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sculk_replaceable_world_gen"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which can be replaced by
     * ancient cities.
     */
    Tag<BlockType> ANCIENT_CITY_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("ancient_city_replaceable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which resonate vibrations.
     */
    Tag<BlockType> VIBRATION_RESONATORS = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("vibration_resonators"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which animals will spawn on.
     */
    Tag<BlockType> ANIMALS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("animals_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which axolotls will spawn on.
     */
    Tag<BlockType> AXOLOTLS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("axolotls_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which goats will spawn on.
     */
    Tag<BlockType> GOATS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("goats_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which mooshrooms will spawn on.
     */
    Tag<BlockType> MOOSHROOMS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mooshrooms_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which parrots will spawn on.
     */
    Tag<BlockType> PARROTS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("parrots_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which polar bears will spawn
     * on.
     */
    Tag<BlockType> POLAR_BEARS_SPAWNABLE_ON_ALTERNATE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("polar_bears_spawnable_on_alternate"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which rabbits will spawn on.
     */
    Tag<BlockType> RABBITS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("rabbits_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which foxes will spawn on.
     */
    Tag<BlockType> FOXES_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("foxes_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which wolves will spawn on.
     */
    Tag<BlockType> WOLVES_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("wolves_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which frogs will spawn on.
     */
    Tag<BlockType> FROGS_SPAWNABLE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("frogs_spawnable_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which azaleas will grow on.
     */
    Tag<BlockType> AZALEA_GROWS_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("azalea_grows_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which may be converted to mud.
     */
    Tag<BlockType> CONVERTABLE_TO_MUD = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("convertable_to_mud"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which mangrove logs can grow
     * through.
     */
    Tag<BlockType> MANGROVE_LOGS_CAN_GROW_THROUGH = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mangrove_logs_can_grow_through"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which mangrove roots can grow
     * through.
     */
    Tag<BlockType> MANGROVE_ROOTS_CAN_GROW_THROUGH = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("mangrove_roots_can_grow_through"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which dead bushes may be placed
     * on.
     */
    Tag<BlockType> DEAD_BUSH_MAY_PLACE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("dead_bush_may_place_on"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which snap dropped goat horns.
     */
    Tag<BlockType> SNAPS_GOAT_HORN = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("snaps_goat_horn"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks replaceable by growing trees.
     */
    Tag<BlockType> REPLACEABLE_BY_TREES = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("replaceable_by_trees"), BlockType.class);
    /**
     * Vanilla block tag representing blocks which snow cannot survive on.
     */
    Tag<BlockType> SNOW_LAYER_CANNOT_SURVIVE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("snow_layer_cannot_survive_on"), BlockType.class);
    /**
     * Vanilla block tag representing blocks which snow can survive on.
     */
    Tag<BlockType> SNOW_LAYER_CAN_SURVIVE_ON = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("snow_layer_can_survive_on"), BlockType.class);
    /**
     * Vanilla block tag representing blocks which cannot be dismounted into.
     */
    Tag<BlockType> INVALID_SPAWN_INSIDE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("invalid_spawn_inside"), BlockType.class);
    /**
     * Vanilla block tag representing blocks which can be dug by sniffers.
     */
    Tag<BlockType> SNIFFER_DIGGABLE_BLOCK = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sniffer_diggable_block"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which booster sniffer egg hatching.
     */
    Tag<BlockType> SNIFFER_EGG_HATCH_BOOST = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("sniffer_egg_hatch_boost"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which can be replaced by trail ruins.
     */
    Tag<BlockType> TRAIL_RUINS_REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("trail_ruins_replaceable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which are replaceable.
     */
    Tag<BlockType> REPLACEABLE = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("replaceable"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which provide enchantment power.
     */
    Tag<BlockType> ENCHANTMENT_POWER_PROVIDER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("enchantment_power_provider"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which transmit enchantment power.
     */
    Tag<BlockType> ENCHANTMENT_POWER_TRANSMITTER = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("enchantment_power_transmitter"), BlockType.class);
    /**
     * Vanilla block tag representing all blocks which do not destroy farmland when placed.
     */
    Tag<BlockType> MAINTAINS_FARMLAND = Bukkit.getTag(REGISTRY_BLOCKS, NamespacedKey.minecraft("maintains_farmland"), BlockType.class);
    /**
     * Key for the built in item registry.
     */
    String REGISTRY_ITEMS = "items";
    /**
     * Vanilla item tag representing all items loved by piglins.
     */
    Tag<ItemType> ITEMS_PIGLIN_LOVED = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("piglin_loved"), ItemType.class);
    /**
     * Vanilla item tag representing all items ignored by piglin babies.
     */
    Tag<ItemType> IGNORED_BY_PIGLIN_BABIES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("ignored_by_piglin_babies"), ItemType.class);
    /**
     * Vanilla item tag representing all piglin food.
     */
    Tag<ItemType> PIGLIN_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("piglin_food"), ItemType.class);
    /**
     * Vanilla item tag representing all fox food.
     */
    Tag<ItemType> FOX_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("fox_food"), ItemType.class);
    /**
     * Vanilla item tag representing all banner items.
     */
    Tag<ItemType> ITEMS_BANNERS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("banners"), ItemType.class);
    /**
     * Vanilla item tag representing all boat items.
     */
    Tag<ItemType> ITEMS_BOATS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("boats"), ItemType.class);
    /**
     * Vanilla item tag representing all chest boat items.
     */
    Tag<ItemType> ITEMS_CHEST_BOATS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("chest_boats"), ItemType.class);
    /**
     * Vanilla item tag representing all fish items.
     */
    Tag<ItemType> ITEMS_FISHES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("fishes"), ItemType.class);
    /**
     * Vanilla item tag representing all music disc items.
     */
    Tag<ItemType> ITEMS_MUSIC_DISCS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("music_discs"), ItemType.class);
    /**
     * Vanilla item tag representing all music disc items dropped by creepers.
     */
    Tag<ItemType> ITEMS_CREEPER_DROP_MUSIC_DISCS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("creeper_drop_music_discs"), ItemType.class);
    /**
     * Vanilla item tag representing all coal items.
     */
    Tag<ItemType> ITEMS_COALS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("coals"), ItemType.class);
    /**
     * Vanilla item tag representing all arrow items.
     */
    Tag<ItemType> ITEMS_ARROWS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("arrows"), ItemType.class);
    /**
     * Vanilla item tag representing all books that may be placed on lecterns.
     */
    Tag<ItemType> ITEMS_LECTERN_BOOKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("lectern_books"), ItemType.class);
    /**
     * Vanilla item tag representing all books that may be placed on bookshelves.
     */
    Tag<ItemType> ITEMS_BOOKSHELF_BOOKS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("bookshelf_books"), ItemType.class);
    /**
     * Vanilla item tag representing all items that may be placed in beacons.
     */
    Tag<ItemType> ITEMS_BEACON_PAYMENT_ITEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("beacon_payment_items"), ItemType.class);
    /**
     * Vanilla item tag representing all stone tool ItemTypes.
     */
    Tag<ItemType> ITEMS_STONE_TOOL_ItemTypeS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("stone_tool_materials"), ItemType.class);
    /**
     * Vanilla item tag representing all furnace ItemTypes.
     */
    Tag<ItemType> ITEMS_FURNACE_ItemTypeS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("furnace_materials"), ItemType.class);
    /**
     * Vanilla item tag representing all compasses.
     */
    Tag<ItemType> ITEMS_COMPASSES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("compasses"), ItemType.class);
    /**
     * Vanilla item tag representing all hanging signs.
     */
    Tag<ItemType> ITEMS_HANGING_SIGNS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("hanging_signs"), ItemType.class);
    /**
     * Vanilla item tag representing all items which will ignite creepers when
     * interacted with.
     */
    Tag<ItemType> ITEMS_CREEPER_IGNITERS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("creeper_igniters"), ItemType.class);
    /**
     * Vanilla item tag representing all items which modify note block sounds when placed on top.
     */
    Tag<ItemType> ITEMS_NOTE_BLOCK_TOP_INSTRUMENTS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("noteblock_top_instruments"), ItemType.class);
    /**
     * Vanilla item tag representing all trimmable armor items.
     */
    Tag<ItemType> ITEMS_TRIMMABLE_ARMOR = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("trimmable_armor"), ItemType.class);
    /**
     * Vanilla item tag representing all ItemTypes which can be used for trimming armor.
     */
    Tag<ItemType> ITEMS_TRIM_ItemTypeS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("trim_materials"), ItemType.class);
    /**
     * Vanilla item tag representing all trimming templates.
     */
    Tag<ItemType> ITEMS_TRIM_TEMPLATES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("trim_templates"), ItemType.class);
    /**
     * Vanilla item tag representing all food for sniffers.
     */
    Tag<ItemType> ITEMS_SNIFFER_FOOD = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("sniffer_food"), ItemType.class);
    /**
     * Vanilla item tag representing all decorated pot sherds.
     */
    Tag<ItemType> ITEMS_DECORATED_POT_SHERDS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("decorated_pot_sherds"), ItemType.class);
    /**
     * Vanilla item tag representing all decorated pot ingredients.
     */
    Tag<ItemType> ITEMS_DECORATED_POT_INGREDIENTS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("decorated_pot_ingredients"), ItemType.class);
    /**
     * Vanilla item tag representing all swords.
     */
    Tag<ItemType> ITEMS_SWORDS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("swords"), ItemType.class);
    /**
     * Vanilla item tag representing all axes.
     */
    Tag<ItemType> ITEMS_AXES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("axes"), ItemType.class);
    /**
     * Vanilla item tag representing all hoes.
     */
    Tag<ItemType> ITEMS_HOES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("hoes"), ItemType.class);
    /**
     * Vanilla item tag representing all pickaxes.
     */
    Tag<ItemType> ITEMS_PICKAXES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("pickaxes"), ItemType.class);
    /**
     * Vanilla item tag representing all shovels.
     */
    Tag<ItemType> ITEMS_SHOVELS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("shovels"), ItemType.class);
    /**
     * Vanilla item tag representing all tools.
     */
    Tag<ItemType> ITEMS_TOOLS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("tools"), ItemType.class);
    /**
     * Vanilla item tag representing all items which break decorated pots.
     */
    Tag<ItemType> ITEMS_BREAKS_DECORATED_POTS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("breaks_decorated_pots"), ItemType.class);
    /**
     * Vanilla item tag representing all seeds planteable by villagers.
     */
    Tag<ItemType> ITEMS_VILLAGER_PLANTABLE_SEEDS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("villager_plantable_seeds"), ItemType.class);
    /**
     * Vanilla item tag representing all items that confer freeze immunity on
     * the wearer.
     */
    Tag<ItemType> FREEZE_IMMUNE_WEARABLES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("freeze_immune_wearables"), ItemType.class);
    /**
     * Vanilla item tag representing all items which tempt axolotls.
     */
    Tag<ItemType> AXOLOTL_TEMPT_ITEMS = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("axolotl_tempt_items"), ItemType.class);
    /**
     * Vanilla item tag representing all items which are preferred for
     * harvesting clusters (unused).
     */
    Tag<ItemType> CLUSTER_MAX_HARVESTABLES = Bukkit.getTag(REGISTRY_ITEMS, NamespacedKey.minecraft("cluster_max_harvestables"), ItemType.class);
    /**
     * Key for the built in fluid registry.
     */
    String REGISTRY_FLUIDS = "fluids";
    /**
     * Vanilla fluid tag representing lava and flowing lava.
     */
    Tag<Fluid> FLUIDS_LAVA = Bukkit.getTag(REGISTRY_FLUIDS, NamespacedKey.minecraft("lava"), Fluid.class);
    /**
     * Vanilla fluid tag representing water and flowing water.
     */
    Tag<Fluid> FLUIDS_WATER = Bukkit.getTag(REGISTRY_FLUIDS, NamespacedKey.minecraft("water"), Fluid.class);
    /**
     * Key for the built in entity registry.
     */
    String REGISTRY_ENTITY_TYPES = "entity_types";
    /**
     * Vanilla tag representing skeletons.
     */
    Tag<EntityType> ENTITY_TYPES_SKELETONS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("skeletons"), EntityType.class);
    /**
     * Vanilla tag representing raiders.
     */
    Tag<EntityType> ENTITY_TYPES_RAIDERS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("raiders"), EntityType.class);
    /**
     * Vanilla tag representing entities which can live in beehives.
     */
    Tag<EntityType> ENTITY_TYPES_BEEHIVE_INHABITORS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("beehive_inhabitors"), EntityType.class);
    /**
     * Vanilla tag representing arrows.
     */
    Tag<EntityType> ENTITY_TYPES_ARROWS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("arrows"), EntityType.class);
    /**
     * Vanilla tag representing projectiles.
     */
    Tag<EntityType> ENTITY_TYPES_IMPACT_PROJECTILES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("impact_projectiles"), EntityType.class);
    /**
     * Vanilla tag representing mobs which can walk on powder snow.
     */
    Tag<EntityType> ENTITY_TYPES_POWDER_SNOW_WALKABLE_MOBS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("powder_snow_walkable_mobs"), EntityType.class);
    /**
     * Vanilla tag representing which entities axolotls are always hostile to.
     */
    Tag<EntityType> ENTITY_TYPES_AXOLOTL_ALWAYS_HOSTILES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("axolotl_always_hostiles"), EntityType.class);
    /**
     * Vanilla tag representing axolotl targets.
     */
    Tag<EntityType> ENTITY_TYPES_AXOLOTL_HUNT_TARGETS = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("axolotl_hunt_targets"), EntityType.class);
    /**
     * Vanilla tag representing entities immune from freezing.
     */
    Tag<EntityType> ENTITY_TYPES_FREEZE_IMMUNE_ENTITY_TYPES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("freeze_immune_entity_types"), EntityType.class);
    /**
     * Vanilla tag representing entities extra susceptible to freezing.
     */
    Tag<EntityType> ENTITY_TYPES_FREEZE_HURTS_EXTRA_TYPES = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("freeze_hurts_extra_types"), EntityType.class);
    /**
     * Vanilla tag representing entities which can be eaten by frogs.
     */
    Tag<EntityType> ENTITY_TYPES_FROG_FOOD = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("frog_food"), EntityType.class);
    /**
     * Vanilla tag representing entities which are immune from fall damage.
     */
    Tag<EntityType> ENTITY_TYPES_FALL_DAMAGE_IMMUNE = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("fall_damage_immune"), EntityType.class);
    /**
     * Vanilla tag representing entities which are dismounted when underwater.
     */
    Tag<EntityType> ENTITY_TYPES_DISMOUNTS_UNDERWATER = Bukkit.getTag(REGISTRY_ENTITY_TYPES, NamespacedKey.minecraft("dismounts_underwater"), EntityType.class);

    /**
     * Returns whether or not this tag has an entry for the specified item.
     *
     * @param item to check
     * @return if it is tagged
     */
    boolean isTagged(@NotNull T item);

    /**
     * Gets an immutable set of all tagged items.
     *
     * @return set of tagged items
     */
    @NotNull
    Set<T> getValues();

}
