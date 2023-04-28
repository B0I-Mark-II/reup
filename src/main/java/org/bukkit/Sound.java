package org.bukkit;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/**
 * An Enum of Sounds the server is able to send to players.
 * <p>
 * WARNING: At any time, sounds may be added/removed from this Enum or even
 * MineCraft itself! There is no guarantee the sounds will play. There is no
 * guarantee values will not be removed from this class. As such, you should not
 * depend on the ordinal values of this class.
 */
public abstract class Sound extends OldEnum<Sound> implements Keyed {

    public static final Sound ENTITY_ALLAY_AMBIENT_WITH_ITEM = getSound("entity.allay.ambient_with_item");
    public static final Sound ENTITY_ALLAY_AMBIENT_WITHOUT_ITEM = getSound("entity.allay.ambient_without_item");
    public static final Sound ENTITY_ALLAY_DEATH = getSound("entity.allay.death");
    public static final Sound ENTITY_ALLAY_HURT = getSound("entity.allay.hurt");
    public static final Sound ENTITY_ALLAY_ITEM_GIVEN = getSound("entity.allay.item_given");
    public static final Sound ENTITY_ALLAY_ITEM_TAKEN = getSound("entity.allay.item_taken");
    public static final Sound ENTITY_ALLAY_ITEM_THROWN = getSound("entity.allay.item_thrown");
    public static final Sound AMBIENT_CAVE = getSound("ambient.cave");
    public static final Sound AMBIENT_BASALT_DELTAS_ADDITIONS = getSound("ambient.basalt_deltas.additions");
    public static final Sound AMBIENT_BASALT_DELTAS_LOOP = getSound("ambient.basalt_deltas.loop");
    public static final Sound AMBIENT_BASALT_DELTAS_MOOD = getSound("ambient.basalt_deltas.mood");
    public static final Sound AMBIENT_CRIMSON_FOREST_ADDITIONS = getSound("ambient.crimson_forest.additions");
    public static final Sound AMBIENT_CRIMSON_FOREST_LOOP = getSound("ambient.crimson_forest.loop");
    public static final Sound AMBIENT_CRIMSON_FOREST_MOOD = getSound("ambient.crimson_forest.mood");
    public static final Sound AMBIENT_NETHER_WASTES_ADDITIONS = getSound("ambient.nether_wastes.additions");
    public static final Sound AMBIENT_NETHER_WASTES_LOOP = getSound("ambient.nether_wastes.loop");
    public static final Sound AMBIENT_NETHER_WASTES_MOOD = getSound("ambient.nether_wastes.mood");
    public static final Sound AMBIENT_SOUL_SAND_VALLEY_ADDITIONS = getSound("ambient.soul_sand_valley.additions");
    public static final Sound AMBIENT_SOUL_SAND_VALLEY_LOOP = getSound("ambient.soul_sand_valley.loop");
    public static final Sound AMBIENT_SOUL_SAND_VALLEY_MOOD = getSound("ambient.soul_sand_valley.mood");
    public static final Sound AMBIENT_WARPED_FOREST_ADDITIONS = getSound("ambient.warped_forest.additions");
    public static final Sound AMBIENT_WARPED_FOREST_LOOP = getSound("ambient.warped_forest.loop");
    public static final Sound AMBIENT_WARPED_FOREST_MOOD = getSound("ambient.warped_forest.mood");
    public static final Sound AMBIENT_UNDERWATER_ENTER = getSound("ambient.underwater.enter");
    public static final Sound AMBIENT_UNDERWATER_EXIT = getSound("ambient.underwater.exit");
    public static final Sound AMBIENT_UNDERWATER_LOOP = getSound("ambient.underwater.loop");
    public static final Sound AMBIENT_UNDERWATER_LOOP_ADDITIONS = getSound("ambient.underwater.loop.additions");
    public static final Sound AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE = getSound("ambient.underwater.loop.additions.rare");
    public static final Sound AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE = getSound("ambient.underwater.loop.additions.ultra_rare");
    public static final Sound BLOCK_AMETHYST_BLOCK_BREAK = getSound("block.amethyst_block.break");
    public static final Sound BLOCK_AMETHYST_BLOCK_CHIME = getSound("block.amethyst_block.chime");
    public static final Sound BLOCK_AMETHYST_BLOCK_FALL = getSound("block.amethyst_block.fall");
    public static final Sound BLOCK_AMETHYST_BLOCK_HIT = getSound("block.amethyst_block.hit");
    public static final Sound BLOCK_AMETHYST_BLOCK_PLACE = getSound("block.amethyst_block.place");
    public static final Sound BLOCK_AMETHYST_BLOCK_STEP = getSound("block.amethyst_block.step");
    public static final Sound BLOCK_AMETHYST_CLUSTER_BREAK = getSound("block.amethyst_cluster.break");
    public static final Sound BLOCK_AMETHYST_CLUSTER_FALL = getSound("block.amethyst_cluster.fall");
    public static final Sound BLOCK_AMETHYST_CLUSTER_HIT = getSound("block.amethyst_cluster.hit");
    public static final Sound BLOCK_AMETHYST_CLUSTER_PLACE = getSound("block.amethyst_cluster.place");
    public static final Sound BLOCK_AMETHYST_CLUSTER_STEP = getSound("block.amethyst_cluster.step");
    public static final Sound BLOCK_ANCIENT_DEBRIS_BREAK = getSound("block.ancient_debris.break");
    public static final Sound BLOCK_ANCIENT_DEBRIS_STEP = getSound("block.ancient_debris.step");
    public static final Sound BLOCK_ANCIENT_DEBRIS_PLACE = getSound("block.ancient_debris.place");
    public static final Sound BLOCK_ANCIENT_DEBRIS_HIT = getSound("block.ancient_debris.hit");
    public static final Sound BLOCK_ANCIENT_DEBRIS_FALL = getSound("block.ancient_debris.fall");
    public static final Sound BLOCK_ANVIL_BREAK = getSound("block.anvil.break");
    public static final Sound BLOCK_ANVIL_DESTROY = getSound("block.anvil.destroy");
    public static final Sound BLOCK_ANVIL_FALL = getSound("block.anvil.fall");
    public static final Sound BLOCK_ANVIL_HIT = getSound("block.anvil.hit");
    public static final Sound BLOCK_ANVIL_LAND = getSound("block.anvil.land");
    public static final Sound BLOCK_ANVIL_PLACE = getSound("block.anvil.place");
    public static final Sound BLOCK_ANVIL_STEP = getSound("block.anvil.step");
    public static final Sound BLOCK_ANVIL_USE = getSound("block.anvil.use");
    public static final Sound ITEM_ARMOR_EQUIP_CHAIN = getSound("item.armor.equip_chain");
    public static final Sound ITEM_ARMOR_EQUIP_DIAMOND = getSound("item.armor.equip_diamond");
    public static final Sound ITEM_ARMOR_EQUIP_ELYTRA = getSound("item.armor.equip_elytra");
    public static final Sound ITEM_ARMOR_EQUIP_GENERIC = getSound("item.armor.equip_generic");
    public static final Sound ITEM_ARMOR_EQUIP_GOLD = getSound("item.armor.equip_gold");
    public static final Sound ITEM_ARMOR_EQUIP_IRON = getSound("item.armor.equip_iron");
    public static final Sound ITEM_ARMOR_EQUIP_LEATHER = getSound("item.armor.equip_leather");
    public static final Sound ITEM_ARMOR_EQUIP_NETHERITE = getSound("item.armor.equip_netherite");
    public static final Sound ITEM_ARMOR_EQUIP_TURTLE = getSound("item.armor.equip_turtle");
    public static final Sound ENTITY_ARMOR_STAND_BREAK = getSound("entity.armor_stand.break");
    public static final Sound ENTITY_ARMOR_STAND_FALL = getSound("entity.armor_stand.fall");
    public static final Sound ENTITY_ARMOR_STAND_HIT = getSound("entity.armor_stand.hit");
    public static final Sound ENTITY_ARMOR_STAND_PLACE = getSound("entity.armor_stand.place");
    public static final Sound ENTITY_ARROW_HIT = getSound("entity.arrow.hit");
    public static final Sound ENTITY_ARROW_HIT_PLAYER = getSound("entity.arrow.hit_player");
    public static final Sound ENTITY_ARROW_SHOOT = getSound("entity.arrow.shoot");
    public static final Sound ITEM_AXE_STRIP = getSound("item.axe.strip");
    public static final Sound ITEM_AXE_SCRAPE = getSound("item.axe.scrape");
    public static final Sound ITEM_AXE_WAX_OFF = getSound("item.axe.wax_off");
    public static final Sound ENTITY_AXOLOTL_ATTACK = getSound("entity.axolotl.attack");
    public static final Sound ENTITY_AXOLOTL_DEATH = getSound("entity.axolotl.death");
    public static final Sound ENTITY_AXOLOTL_HURT = getSound("entity.axolotl.hurt");
    public static final Sound ENTITY_AXOLOTL_IDLE_AIR = getSound("entity.axolotl.idle_air");
    public static final Sound ENTITY_AXOLOTL_IDLE_WATER = getSound("entity.axolotl.idle_water");
    public static final Sound ENTITY_AXOLOTL_SPLASH = getSound("entity.axolotl.splash");
    public static final Sound ENTITY_AXOLOTL_SWIM = getSound("entity.axolotl.swim");
    public static final Sound BLOCK_AZALEA_BREAK = getSound("block.azalea.break");
    public static final Sound BLOCK_AZALEA_FALL = getSound("block.azalea.fall");
    public static final Sound BLOCK_AZALEA_HIT = getSound("block.azalea.hit");
    public static final Sound BLOCK_AZALEA_PLACE = getSound("block.azalea.place");
    public static final Sound BLOCK_AZALEA_STEP = getSound("block.azalea.step");
    public static final Sound BLOCK_AZALEA_LEAVES_BREAK = getSound("block.azalea_leaves.break");
    public static final Sound BLOCK_AZALEA_LEAVES_FALL = getSound("block.azalea_leaves.fall");
    public static final Sound BLOCK_AZALEA_LEAVES_HIT = getSound("block.azalea_leaves.hit");
    public static final Sound BLOCK_AZALEA_LEAVES_PLACE = getSound("block.azalea_leaves.place");
    public static final Sound BLOCK_AZALEA_LEAVES_STEP = getSound("block.azalea_leaves.step");
    public static final Sound BLOCK_BAMBOO_BREAK = getSound("block.bamboo.break");
    public static final Sound BLOCK_BAMBOO_FALL = getSound("block.bamboo.fall");
    public static final Sound BLOCK_BAMBOO_HIT = getSound("block.bamboo.hit");
    public static final Sound BLOCK_BAMBOO_PLACE = getSound("block.bamboo.place");
    public static final Sound BLOCK_BAMBOO_STEP = getSound("block.bamboo.step");
    public static final Sound BLOCK_BAMBOO_SAPLING_BREAK = getSound("block.bamboo_sapling.break");
    public static final Sound BLOCK_BAMBOO_SAPLING_HIT = getSound("block.bamboo_sapling.hit");
    public static final Sound BLOCK_BAMBOO_SAPLING_PLACE = getSound("block.bamboo_sapling.place");
    public static final Sound BLOCK_BAMBOO_WOOD_BREAK = getSound("block.bamboo_wood.break");
    public static final Sound BLOCK_BAMBOO_WOOD_FALL = getSound("block.bamboo_wood.fall");
    public static final Sound BLOCK_BAMBOO_WOOD_HIT = getSound("block.bamboo_wood.hit");
    public static final Sound BLOCK_BAMBOO_WOOD_PLACE = getSound("block.bamboo_wood.place");
    public static final Sound BLOCK_BAMBOO_WOOD_STEP = getSound("block.bamboo_wood.step");
    public static final Sound BLOCK_BAMBOO_WOOD_DOOR_CLOSE = getSound("block.bamboo_wood_door.close");
    public static final Sound BLOCK_BAMBOO_WOOD_DOOR_OPEN = getSound("block.bamboo_wood_door.open");
    public static final Sound BLOCK_BAMBOO_WOOD_TRAPDOOR_CLOSE = getSound("block.bamboo_wood_trapdoor.close");
    public static final Sound BLOCK_BAMBOO_WOOD_TRAPDOOR_OPEN = getSound("block.bamboo_wood_trapdoor.open");
    public static final Sound BLOCK_BAMBOO_WOOD_BUTTON_CLICK_OFF = getSound("block.bamboo_wood_button.click_off");
    public static final Sound BLOCK_BAMBOO_WOOD_BUTTON_CLICK_ON = getSound("block.bamboo_wood_button.click_on");
    public static final Sound BLOCK_BAMBOO_WOOD_PRESSURE_PLATE_CLICK_OFF = getSound("block.bamboo_wood_pressure_plate.click_off");
    public static final Sound BLOCK_BAMBOO_WOOD_PRESSURE_PLATE_CLICK_ON = getSound("block.bamboo_wood_pressure_plate.click_on");
    public static final Sound BLOCK_BAMBOO_WOOD_FENCE_GATE_CLOSE = getSound("block.bamboo_wood_fence_gate.close");
    public static final Sound BLOCK_BAMBOO_WOOD_FENCE_GATE_OPEN = getSound("block.bamboo_wood_fence_gate.open");
    public static final Sound BLOCK_BARREL_CLOSE = getSound("block.barrel.close");
    public static final Sound BLOCK_BARREL_OPEN = getSound("block.barrel.open");
    public static final Sound BLOCK_BASALT_BREAK = getSound("block.basalt.break");
    public static final Sound BLOCK_BASALT_STEP = getSound("block.basalt.step");
    public static final Sound BLOCK_BASALT_PLACE = getSound("block.basalt.place");
    public static final Sound BLOCK_BASALT_HIT = getSound("block.basalt.hit");
    public static final Sound BLOCK_BASALT_FALL = getSound("block.basalt.fall");
    public static final Sound ENTITY_BAT_AMBIENT = getSound("entity.bat.ambient");
    public static final Sound ENTITY_BAT_DEATH = getSound("entity.bat.death");
    public static final Sound ENTITY_BAT_HURT = getSound("entity.bat.hurt");
    public static final Sound ENTITY_BAT_LOOP = getSound("entity.bat.loop");
    public static final Sound ENTITY_BAT_TAKEOFF = getSound("entity.bat.takeoff");
    public static final Sound BLOCK_BEACON_ACTIVATE = getSound("block.beacon.activate");
    public static final Sound BLOCK_BEACON_AMBIENT = getSound("block.beacon.ambient");
    public static final Sound BLOCK_BEACON_DEACTIVATE = getSound("block.beacon.deactivate");
    public static final Sound BLOCK_BEACON_POWER_SELECT = getSound("block.beacon.power_select");
    public static final Sound ENTITY_BEE_DEATH = getSound("entity.bee.death");
    public static final Sound ENTITY_BEE_HURT = getSound("entity.bee.hurt");
    public static final Sound ENTITY_BEE_LOOP_AGGRESSIVE = getSound("entity.bee.loop_aggressive");
    public static final Sound ENTITY_BEE_LOOP = getSound("entity.bee.loop");
    public static final Sound ENTITY_BEE_STING = getSound("entity.bee.sting");
    public static final Sound ENTITY_BEE_POLLINATE = getSound("entity.bee.pollinate");
    public static final Sound BLOCK_BEEHIVE_DRIP = getSound("block.beehive.drip");
    public static final Sound BLOCK_BEEHIVE_ENTER = getSound("block.beehive.enter");
    public static final Sound BLOCK_BEEHIVE_EXIT = getSound("block.beehive.exit");
    public static final Sound BLOCK_BEEHIVE_SHEAR = getSound("block.beehive.shear");
    public static final Sound BLOCK_BEEHIVE_WORK = getSound("block.beehive.work");
    public static final Sound BLOCK_BELL_USE = getSound("block.bell.use");
    public static final Sound BLOCK_BELL_RESONATE = getSound("block.bell.resonate");
    public static final Sound BLOCK_BIG_DRIPLEAF_BREAK = getSound("block.big_dripleaf.break");
    public static final Sound BLOCK_BIG_DRIPLEAF_FALL = getSound("block.big_dripleaf.fall");
    public static final Sound BLOCK_BIG_DRIPLEAF_HIT = getSound("block.big_dripleaf.hit");
    public static final Sound BLOCK_BIG_DRIPLEAF_PLACE = getSound("block.big_dripleaf.place");
    public static final Sound BLOCK_BIG_DRIPLEAF_STEP = getSound("block.big_dripleaf.step");
    public static final Sound ENTITY_BLAZE_AMBIENT = getSound("entity.blaze.ambient");
    public static final Sound ENTITY_BLAZE_BURN = getSound("entity.blaze.burn");
    public static final Sound ENTITY_BLAZE_DEATH = getSound("entity.blaze.death");
    public static final Sound ENTITY_BLAZE_HURT = getSound("entity.blaze.hurt");
    public static final Sound ENTITY_BLAZE_SHOOT = getSound("entity.blaze.shoot");
    public static final Sound ENTITY_BOAT_PADDLE_LAND = getSound("entity.boat.paddle_land");
    public static final Sound ENTITY_BOAT_PADDLE_WATER = getSound("entity.boat.paddle_water");
    public static final Sound BLOCK_BONE_BLOCK_BREAK = getSound("block.bone_block.break");
    public static final Sound BLOCK_BONE_BLOCK_FALL = getSound("block.bone_block.fall");
    public static final Sound BLOCK_BONE_BLOCK_HIT = getSound("block.bone_block.hit");
    public static final Sound BLOCK_BONE_BLOCK_PLACE = getSound("block.bone_block.place");
    public static final Sound BLOCK_BONE_BLOCK_STEP = getSound("block.bone_block.step");
    public static final Sound ITEM_BONE_MEAL_USE = getSound("item.bone_meal.use");
    public static final Sound ITEM_BOOK_PAGE_TURN = getSound("item.book.page_turn");
    public static final Sound ITEM_BOOK_PUT = getSound("item.book.put");
    public static final Sound BLOCK_BLASTFURNACE_FIRE_CRACKLE = getSound("block.blastfurnace.fire_crackle");
    public static final Sound ITEM_BOTTLE_EMPTY = getSound("item.bottle.empty");
    public static final Sound ITEM_BOTTLE_FILL = getSound("item.bottle.fill");
    public static final Sound ITEM_BOTTLE_FILL_DRAGONBREATH = getSound("item.bottle.fill_dragonbreath");
    public static final Sound BLOCK_BREWING_STAND_BREW = getSound("block.brewing_stand.brew");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ITEM_BRUSH_BRUSHING = getSound("item.brush.brushing");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ITEM_BRUSH_BRUSH_SAND_COMPLETED = getSound("item.brush.brush_sand_completed");
    public static final Sound BLOCK_BUBBLE_COLUMN_BUBBLE_POP = getSound("block.bubble_column.bubble_pop");
    public static final Sound BLOCK_BUBBLE_COLUMN_UPWARDS_AMBIENT = getSound("block.bubble_column.upwards_ambient");
    public static final Sound BLOCK_BUBBLE_COLUMN_UPWARDS_INSIDE = getSound("block.bubble_column.upwards_inside");
    public static final Sound BLOCK_BUBBLE_COLUMN_WHIRLPOOL_AMBIENT = getSound("block.bubble_column.whirlpool_ambient");
    public static final Sound BLOCK_BUBBLE_COLUMN_WHIRLPOOL_INSIDE = getSound("block.bubble_column.whirlpool_inside");
    public static final Sound ITEM_BUCKET_EMPTY = getSound("item.bucket.empty");
    public static final Sound ITEM_BUCKET_EMPTY_AXOLOTL = getSound("item.bucket.empty_axolotl");
    public static final Sound ITEM_BUCKET_EMPTY_FISH = getSound("item.bucket.empty_fish");
    public static final Sound ITEM_BUCKET_EMPTY_LAVA = getSound("item.bucket.empty_lava");
    public static final Sound ITEM_BUCKET_EMPTY_POWDER_SNOW = getSound("item.bucket.empty_powder_snow");
    public static final Sound ITEM_BUCKET_EMPTY_TADPOLE = getSound("item.bucket.empty_tadpole");
    public static final Sound ITEM_BUCKET_FILL = getSound("item.bucket.fill");
    public static final Sound ITEM_BUCKET_FILL_AXOLOTL = getSound("item.bucket.fill_axolotl");
    public static final Sound ITEM_BUCKET_FILL_FISH = getSound("item.bucket.fill_fish");
    public static final Sound ITEM_BUCKET_FILL_LAVA = getSound("item.bucket.fill_lava");
    public static final Sound ITEM_BUCKET_FILL_POWDER_SNOW = getSound("item.bucket.fill_powder_snow");
    public static final Sound ITEM_BUCKET_FILL_TADPOLE = getSound("item.bucket.fill_tadpole");
    public static final Sound ITEM_BUNDLE_DROP_CONTENTS = getSound("item.bundle.drop_contents");
    public static final Sound ITEM_BUNDLE_INSERT = getSound("item.bundle.insert");
    public static final Sound ITEM_BUNDLE_REMOVE_ONE = getSound("item.bundle.remove_one");
    public static final Sound BLOCK_CAKE_ADD_CANDLE = getSound("block.cake.add_candle");
    public static final Sound BLOCK_CALCITE_BREAK = getSound("block.calcite.break");
    public static final Sound BLOCK_CALCITE_STEP = getSound("block.calcite.step");
    public static final Sound BLOCK_CALCITE_PLACE = getSound("block.calcite.place");
    public static final Sound BLOCK_CALCITE_HIT = getSound("block.calcite.hit");
    public static final Sound BLOCK_CALCITE_FALL = getSound("block.calcite.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_AMBIENT = getSound("entity.camel.ambient");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_DASH = getSound("entity.camel.dash");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_DASH_READY = getSound("entity.camel.dash_ready");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_DEATH = getSound("entity.camel.death");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_EAT = getSound("entity.camel.eat");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_HURT = getSound("entity.camel.hurt");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_SADDLE = getSound("entity.camel.saddle");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_SIT = getSound("entity.camel.sit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_STAND = getSound("entity.camel.stand");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_STEP = getSound("entity.camel.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_CAMEL_STEP_SAND = getSound("entity.camel.step_sand");
    public static final Sound BLOCK_CAMPFIRE_CRACKLE = getSound("block.campfire.crackle");
    public static final Sound BLOCK_CANDLE_AMBIENT = getSound("block.candle.ambient");
    public static final Sound BLOCK_CANDLE_BREAK = getSound("block.candle.break");
    public static final Sound BLOCK_CANDLE_EXTINGUISH = getSound("block.candle.extinguish");
    public static final Sound BLOCK_CANDLE_FALL = getSound("block.candle.fall");
    public static final Sound BLOCK_CANDLE_HIT = getSound("block.candle.hit");
    public static final Sound BLOCK_CANDLE_PLACE = getSound("block.candle.place");
    public static final Sound BLOCK_CANDLE_STEP = getSound("block.candle.step");
    public static final Sound ENTITY_CAT_AMBIENT = getSound("entity.cat.ambient");
    public static final Sound ENTITY_CAT_STRAY_AMBIENT = getSound("entity.cat.stray_ambient");
    public static final Sound ENTITY_CAT_DEATH = getSound("entity.cat.death");
    public static final Sound ENTITY_CAT_EAT = getSound("entity.cat.eat");
    public static final Sound ENTITY_CAT_HISS = getSound("entity.cat.hiss");
    public static final Sound ENTITY_CAT_BEG_FOR_FOOD = getSound("entity.cat.beg_for_food");
    public static final Sound ENTITY_CAT_HURT = getSound("entity.cat.hurt");
    public static final Sound ENTITY_CAT_PURR = getSound("entity.cat.purr");
    public static final Sound ENTITY_CAT_PURREOW = getSound("entity.cat.purreow");
    public static final Sound BLOCK_CAVE_VINES_BREAK = getSound("block.cave_vines.break");
    public static final Sound BLOCK_CAVE_VINES_FALL = getSound("block.cave_vines.fall");
    public static final Sound BLOCK_CAVE_VINES_HIT = getSound("block.cave_vines.hit");
    public static final Sound BLOCK_CAVE_VINES_PLACE = getSound("block.cave_vines.place");
    public static final Sound BLOCK_CAVE_VINES_STEP = getSound("block.cave_vines.step");
    public static final Sound BLOCK_CAVE_VINES_PICK_BERRIES = getSound("block.cave_vines.pick_berries");
    public static final Sound BLOCK_CHAIN_BREAK = getSound("block.chain.break");
    public static final Sound BLOCK_CHAIN_FALL = getSound("block.chain.fall");
    public static final Sound BLOCK_CHAIN_HIT = getSound("block.chain.hit");
    public static final Sound BLOCK_CHAIN_PLACE = getSound("block.chain.place");
    public static final Sound BLOCK_CHAIN_STEP = getSound("block.chain.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_BREAK = getSound("block.cherry_wood.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_FALL = getSound("block.cherry_wood.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_HIT = getSound("block.cherry_wood.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_PLACE = getSound("block.cherry_wood.place");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_STEP = getSound("block.cherry_wood.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_SAPLING_BREAK = getSound("block.cherry_sapling.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_SAPLING_FALL = getSound("block.cherry_sapling.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_SAPLING_HIT = getSound("block.cherry_sapling.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_SAPLING_PLACE = getSound("block.cherry_sapling.place");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_SAPLING_STEP = getSound("block.cherry_sapling.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_LEAVES_BREAK = getSound("block.cherry_leaves.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_LEAVES_FALL = getSound("block.cherry_leaves.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_LEAVES_HIT = getSound("block.cherry_leaves.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_LEAVES_PLACE = getSound("block.cherry_leaves.place");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_LEAVES_STEP = getSound("block.cherry_leaves.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_STEP = getSound("block.cherry_wood_hanging_sign.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_BREAK = getSound("block.cherry_wood_hanging_sign.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_FALL = getSound("block.cherry_wood_hanging_sign.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_HIT = getSound("block.cherry_wood_hanging_sign.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_HANGING_SIGN_PLACE = getSound("block.cherry_wood_hanging_sign.place");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_DOOR_CLOSE = getSound("block.cherry_wood_door.close");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_DOOR_OPEN = getSound("block.cherry_wood_door.open");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_TRAPDOOR_CLOSE = getSound("block.cherry_wood_trapdoor.close");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_TRAPDOOR_OPEN = getSound("block.cherry_wood_trapdoor.open");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_BUTTON_CLICK_OFF = getSound("block.cherry_wood_button.click_off");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_BUTTON_CLICK_ON = getSound("block.cherry_wood_button.click_on");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF = getSound("block.cherry_wood_pressure_plate.click_off");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON = getSound("block.cherry_wood_pressure_plate.click_on");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_FENCE_GATE_CLOSE = getSound("block.cherry_wood_fence_gate.close");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHERRY_WOOD_FENCE_GATE_OPEN = getSound("block.cherry_wood_fence_gate.open");
    public static final Sound BLOCK_CHEST_CLOSE = getSound("block.chest.close");
    public static final Sound BLOCK_CHEST_LOCKED = getSound("block.chest.locked");
    public static final Sound BLOCK_CHEST_OPEN = getSound("block.chest.open");
    public static final Sound ENTITY_CHICKEN_AMBIENT = getSound("entity.chicken.ambient");
    public static final Sound ENTITY_CHICKEN_DEATH = getSound("entity.chicken.death");
    public static final Sound ENTITY_CHICKEN_EGG = getSound("entity.chicken.egg");
    public static final Sound ENTITY_CHICKEN_HURT = getSound("entity.chicken.hurt");
    public static final Sound ENTITY_CHICKEN_STEP = getSound("entity.chicken.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_BREAK = getSound("block.chiseled_bookshelf.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_FALL = getSound("block.chiseled_bookshelf.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_HIT = getSound("block.chiseled_bookshelf.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_INSERT = getSound("block.chiseled_bookshelf.insert");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_INSERT_ENCHANTED = getSound("block.chiseled_bookshelf.insert.enchanted");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_STEP = getSound("block.chiseled_bookshelf.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_PICKUP = getSound("block.chiseled_bookshelf.pickup");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_PICKUP_ENCHANTED = getSound("block.chiseled_bookshelf.pickup.enchanted");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_CHISELED_BOOKSHELF_PLACE = getSound("block.chiseled_bookshelf.place");
    public static final Sound BLOCK_CHORUS_FLOWER_DEATH = getSound("block.chorus_flower.death");
    public static final Sound BLOCK_CHORUS_FLOWER_GROW = getSound("block.chorus_flower.grow");
    public static final Sound ITEM_CHORUS_FRUIT_TELEPORT = getSound("item.chorus_fruit.teleport");
    public static final Sound ENTITY_COD_AMBIENT = getSound("entity.cod.ambient");
    public static final Sound ENTITY_COD_DEATH = getSound("entity.cod.death");
    public static final Sound ENTITY_COD_FLOP = getSound("entity.cod.flop");
    public static final Sound ENTITY_COD_HURT = getSound("entity.cod.hurt");
    public static final Sound BLOCK_COMPARATOR_CLICK = getSound("block.comparator.click");
    public static final Sound BLOCK_COMPOSTER_EMPTY = getSound("block.composter.empty");
    public static final Sound BLOCK_COMPOSTER_FILL = getSound("block.composter.fill");
    public static final Sound BLOCK_COMPOSTER_FILL_SUCCESS = getSound("block.composter.fill_success");
    public static final Sound BLOCK_COMPOSTER_READY = getSound("block.composter.ready");
    public static final Sound BLOCK_CONDUIT_ACTIVATE = getSound("block.conduit.activate");
    public static final Sound BLOCK_CONDUIT_AMBIENT = getSound("block.conduit.ambient");
    public static final Sound BLOCK_CONDUIT_AMBIENT_SHORT = getSound("block.conduit.ambient.short");
    public static final Sound BLOCK_CONDUIT_ATTACK_TARGET = getSound("block.conduit.attack.target");
    public static final Sound BLOCK_CONDUIT_DEACTIVATE = getSound("block.conduit.deactivate");
    public static final Sound BLOCK_COPPER_BREAK = getSound("block.copper.break");
    public static final Sound BLOCK_COPPER_STEP = getSound("block.copper.step");
    public static final Sound BLOCK_COPPER_PLACE = getSound("block.copper.place");
    public static final Sound BLOCK_COPPER_HIT = getSound("block.copper.hit");
    public static final Sound BLOCK_COPPER_FALL = getSound("block.copper.fall");
    public static final Sound BLOCK_CORAL_BLOCK_BREAK = getSound("block.coral_block.break");
    public static final Sound BLOCK_CORAL_BLOCK_FALL = getSound("block.coral_block.fall");
    public static final Sound BLOCK_CORAL_BLOCK_HIT = getSound("block.coral_block.hit");
    public static final Sound BLOCK_CORAL_BLOCK_PLACE = getSound("block.coral_block.place");
    public static final Sound BLOCK_CORAL_BLOCK_STEP = getSound("block.coral_block.step");
    public static final Sound ENTITY_COW_AMBIENT = getSound("entity.cow.ambient");
    public static final Sound ENTITY_COW_DEATH = getSound("entity.cow.death");
    public static final Sound ENTITY_COW_HURT = getSound("entity.cow.hurt");
    public static final Sound ENTITY_COW_MILK = getSound("entity.cow.milk");
    public static final Sound ENTITY_COW_STEP = getSound("entity.cow.step");
    public static final Sound ENTITY_CREEPER_DEATH = getSound("entity.creeper.death");
    public static final Sound ENTITY_CREEPER_HURT = getSound("entity.creeper.hurt");
    public static final Sound ENTITY_CREEPER_PRIMED = getSound("entity.creeper.primed");
    public static final Sound BLOCK_CROP_BREAK = getSound("block.crop.break");
    public static final Sound ITEM_CROP_PLANT = getSound("item.crop.plant");
    public static final Sound ITEM_CROSSBOW_HIT = getSound("item.crossbow.hit");
    public static final Sound ITEM_CROSSBOW_LOADING_END = getSound("item.crossbow.loading_end");
    public static final Sound ITEM_CROSSBOW_LOADING_MIDDLE = getSound("item.crossbow.loading_middle");
    public static final Sound ITEM_CROSSBOW_LOADING_START = getSound("item.crossbow.loading_start");
    public static final Sound ITEM_CROSSBOW_QUICK_CHARGE_1 = getSound("item.crossbow.quick_charge_1");
    public static final Sound ITEM_CROSSBOW_QUICK_CHARGE_2 = getSound("item.crossbow.quick_charge_2");
    public static final Sound ITEM_CROSSBOW_QUICK_CHARGE_3 = getSound("item.crossbow.quick_charge_3");
    public static final Sound ITEM_CROSSBOW_SHOOT = getSound("item.crossbow.shoot");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_DECORATED_POT_BREAK = getSound("block.decorated_pot.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_DECORATED_POT_FALL = getSound("block.decorated_pot.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_DECORATED_POT_HIT = getSound("block.decorated_pot.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_DECORATED_POT_STEP = getSound("block.decorated_pot.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_DECORATED_POT_PLACE = getSound("block.decorated_pot.place");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_DECORATED_POT_SHATTER = getSound("block.decorated_pot.shatter");
    public static final Sound BLOCK_DEEPSLATE_BRICKS_BREAK = getSound("block.deepslate_bricks.break");
    public static final Sound BLOCK_DEEPSLATE_BRICKS_FALL = getSound("block.deepslate_bricks.fall");
    public static final Sound BLOCK_DEEPSLATE_BRICKS_HIT = getSound("block.deepslate_bricks.hit");
    public static final Sound BLOCK_DEEPSLATE_BRICKS_PLACE = getSound("block.deepslate_bricks.place");
    public static final Sound BLOCK_DEEPSLATE_BRICKS_STEP = getSound("block.deepslate_bricks.step");
    public static final Sound BLOCK_DEEPSLATE_BREAK = getSound("block.deepslate.break");
    public static final Sound BLOCK_DEEPSLATE_FALL = getSound("block.deepslate.fall");
    public static final Sound BLOCK_DEEPSLATE_HIT = getSound("block.deepslate.hit");
    public static final Sound BLOCK_DEEPSLATE_PLACE = getSound("block.deepslate.place");
    public static final Sound BLOCK_DEEPSLATE_STEP = getSound("block.deepslate.step");
    public static final Sound BLOCK_DEEPSLATE_TILES_BREAK = getSound("block.deepslate_tiles.break");
    public static final Sound BLOCK_DEEPSLATE_TILES_FALL = getSound("block.deepslate_tiles.fall");
    public static final Sound BLOCK_DEEPSLATE_TILES_HIT = getSound("block.deepslate_tiles.hit");
    public static final Sound BLOCK_DEEPSLATE_TILES_PLACE = getSound("block.deepslate_tiles.place");
    public static final Sound BLOCK_DEEPSLATE_TILES_STEP = getSound("block.deepslate_tiles.step");
    public static final Sound BLOCK_DISPENSER_DISPENSE = getSound("block.dispenser.dispense");
    public static final Sound BLOCK_DISPENSER_FAIL = getSound("block.dispenser.fail");
    public static final Sound BLOCK_DISPENSER_LAUNCH = getSound("block.dispenser.launch");
    public static final Sound ENTITY_DOLPHIN_AMBIENT = getSound("entity.dolphin.ambient");
    public static final Sound ENTITY_DOLPHIN_AMBIENT_WATER = getSound("entity.dolphin.ambient_water");
    public static final Sound ENTITY_DOLPHIN_ATTACK = getSound("entity.dolphin.attack");
    public static final Sound ENTITY_DOLPHIN_DEATH = getSound("entity.dolphin.death");
    public static final Sound ENTITY_DOLPHIN_EAT = getSound("entity.dolphin.eat");
    public static final Sound ENTITY_DOLPHIN_HURT = getSound("entity.dolphin.hurt");
    public static final Sound ENTITY_DOLPHIN_JUMP = getSound("entity.dolphin.jump");
    public static final Sound ENTITY_DOLPHIN_PLAY = getSound("entity.dolphin.play");
    public static final Sound ENTITY_DOLPHIN_SPLASH = getSound("entity.dolphin.splash");
    public static final Sound ENTITY_DOLPHIN_SWIM = getSound("entity.dolphin.swim");
    public static final Sound ENTITY_DONKEY_AMBIENT = getSound("entity.donkey.ambient");
    public static final Sound ENTITY_DONKEY_ANGRY = getSound("entity.donkey.angry");
    public static final Sound ENTITY_DONKEY_CHEST = getSound("entity.donkey.chest");
    public static final Sound ENTITY_DONKEY_DEATH = getSound("entity.donkey.death");
    public static final Sound ENTITY_DONKEY_EAT = getSound("entity.donkey.eat");
    public static final Sound ENTITY_DONKEY_HURT = getSound("entity.donkey.hurt");
    public static final Sound BLOCK_DRIPSTONE_BLOCK_BREAK = getSound("block.dripstone_block.break");
    public static final Sound BLOCK_DRIPSTONE_BLOCK_STEP = getSound("block.dripstone_block.step");
    public static final Sound BLOCK_DRIPSTONE_BLOCK_PLACE = getSound("block.dripstone_block.place");
    public static final Sound BLOCK_DRIPSTONE_BLOCK_HIT = getSound("block.dripstone_block.hit");
    public static final Sound BLOCK_DRIPSTONE_BLOCK_FALL = getSound("block.dripstone_block.fall");
    public static final Sound BLOCK_POINTED_DRIPSTONE_BREAK = getSound("block.pointed_dripstone.break");
    public static final Sound BLOCK_POINTED_DRIPSTONE_STEP = getSound("block.pointed_dripstone.step");
    public static final Sound BLOCK_POINTED_DRIPSTONE_PLACE = getSound("block.pointed_dripstone.place");
    public static final Sound BLOCK_POINTED_DRIPSTONE_HIT = getSound("block.pointed_dripstone.hit");
    public static final Sound BLOCK_POINTED_DRIPSTONE_FALL = getSound("block.pointed_dripstone.fall");
    public static final Sound BLOCK_POINTED_DRIPSTONE_LAND = getSound("block.pointed_dripstone.land");
    public static final Sound BLOCK_POINTED_DRIPSTONE_DRIP_LAVA = getSound("block.pointed_dripstone.drip_lava");
    public static final Sound BLOCK_POINTED_DRIPSTONE_DRIP_WATER = getSound("block.pointed_dripstone.drip_water");
    public static final Sound BLOCK_POINTED_DRIPSTONE_DRIP_LAVA_INTO_CAULDRON = getSound("block.pointed_dripstone.drip_lava_into_cauldron");
    public static final Sound BLOCK_POINTED_DRIPSTONE_DRIP_WATER_INTO_CAULDRON = getSound("block.pointed_dripstone.drip_water_into_cauldron");
    public static final Sound BLOCK_BIG_DRIPLEAF_TILT_DOWN = getSound("block.big_dripleaf.tilt_down");
    public static final Sound BLOCK_BIG_DRIPLEAF_TILT_UP = getSound("block.big_dripleaf.tilt_up");
    public static final Sound ENTITY_DROWNED_AMBIENT = getSound("entity.drowned.ambient");
    public static final Sound ENTITY_DROWNED_AMBIENT_WATER = getSound("entity.drowned.ambient_water");
    public static final Sound ENTITY_DROWNED_DEATH = getSound("entity.drowned.death");
    public static final Sound ENTITY_DROWNED_DEATH_WATER = getSound("entity.drowned.death_water");
    public static final Sound ENTITY_DROWNED_HURT = getSound("entity.drowned.hurt");
    public static final Sound ENTITY_DROWNED_HURT_WATER = getSound("entity.drowned.hurt_water");
    public static final Sound ENTITY_DROWNED_SHOOT = getSound("entity.drowned.shoot");
    public static final Sound ENTITY_DROWNED_STEP = getSound("entity.drowned.step");
    public static final Sound ENTITY_DROWNED_SWIM = getSound("entity.drowned.swim");
    public static final Sound ITEM_DYE_USE = getSound("item.dye.use");
    public static final Sound ENTITY_EGG_THROW = getSound("entity.egg.throw");
    public static final Sound ENTITY_ELDER_GUARDIAN_AMBIENT = getSound("entity.elder_guardian.ambient");
    public static final Sound ENTITY_ELDER_GUARDIAN_AMBIENT_LAND = getSound("entity.elder_guardian.ambient_land");
    public static final Sound ENTITY_ELDER_GUARDIAN_CURSE = getSound("entity.elder_guardian.curse");
    public static final Sound ENTITY_ELDER_GUARDIAN_DEATH = getSound("entity.elder_guardian.death");
    public static final Sound ENTITY_ELDER_GUARDIAN_DEATH_LAND = getSound("entity.elder_guardian.death_land");
    public static final Sound ENTITY_ELDER_GUARDIAN_FLOP = getSound("entity.elder_guardian.flop");
    public static final Sound ENTITY_ELDER_GUARDIAN_HURT = getSound("entity.elder_guardian.hurt");
    public static final Sound ENTITY_ELDER_GUARDIAN_HURT_LAND = getSound("entity.elder_guardian.hurt_land");
    public static final Sound ITEM_ELYTRA_FLYING = getSound("item.elytra.flying");
    public static final Sound BLOCK_ENCHANTMENT_TABLE_USE = getSound("block.enchantment_table.use");
    public static final Sound BLOCK_ENDER_CHEST_CLOSE = getSound("block.ender_chest.close");
    public static final Sound BLOCK_ENDER_CHEST_OPEN = getSound("block.ender_chest.open");
    public static final Sound ENTITY_ENDER_DRAGON_AMBIENT = getSound("entity.ender_dragon.ambient");
    public static final Sound ENTITY_ENDER_DRAGON_DEATH = getSound("entity.ender_dragon.death");
    public static final Sound ENTITY_DRAGON_FIREBALL_EXPLODE = getSound("entity.dragon_fireball.explode");
    public static final Sound ENTITY_ENDER_DRAGON_FLAP = getSound("entity.ender_dragon.flap");
    public static final Sound ENTITY_ENDER_DRAGON_GROWL = getSound("entity.ender_dragon.growl");
    public static final Sound ENTITY_ENDER_DRAGON_HURT = getSound("entity.ender_dragon.hurt");
    public static final Sound ENTITY_ENDER_DRAGON_SHOOT = getSound("entity.ender_dragon.shoot");
    public static final Sound ENTITY_ENDER_EYE_DEATH = getSound("entity.ender_eye.death");
    public static final Sound ENTITY_ENDER_EYE_LAUNCH = getSound("entity.ender_eye.launch");
    public static final Sound ENTITY_ENDERMAN_AMBIENT = getSound("entity.enderman.ambient");
    public static final Sound ENTITY_ENDERMAN_DEATH = getSound("entity.enderman.death");
    public static final Sound ENTITY_ENDERMAN_HURT = getSound("entity.enderman.hurt");
    public static final Sound ENTITY_ENDERMAN_SCREAM = getSound("entity.enderman.scream");
    public static final Sound ENTITY_ENDERMAN_STARE = getSound("entity.enderman.stare");
    public static final Sound ENTITY_ENDERMAN_TELEPORT = getSound("entity.enderman.teleport");
    public static final Sound ENTITY_ENDERMITE_AMBIENT = getSound("entity.endermite.ambient");
    public static final Sound ENTITY_ENDERMITE_DEATH = getSound("entity.endermite.death");
    public static final Sound ENTITY_ENDERMITE_HURT = getSound("entity.endermite.hurt");
    public static final Sound ENTITY_ENDERMITE_STEP = getSound("entity.endermite.step");
    public static final Sound ENTITY_ENDER_PEARL_THROW = getSound("entity.ender_pearl.throw");
    public static final Sound BLOCK_END_GATEWAY_SPAWN = getSound("block.end_gateway.spawn");
    public static final Sound BLOCK_END_PORTAL_FRAME_FILL = getSound("block.end_portal_frame.fill");
    public static final Sound BLOCK_END_PORTAL_SPAWN = getSound("block.end_portal.spawn");
    public static final Sound ENTITY_EVOKER_AMBIENT = getSound("entity.evoker.ambient");
    public static final Sound ENTITY_EVOKER_CAST_SPELL = getSound("entity.evoker.cast_spell");
    public static final Sound ENTITY_EVOKER_CELEBRATE = getSound("entity.evoker.celebrate");
    public static final Sound ENTITY_EVOKER_DEATH = getSound("entity.evoker.death");
    public static final Sound ENTITY_EVOKER_FANGS_ATTACK = getSound("entity.evoker_fangs.attack");
    public static final Sound ENTITY_EVOKER_HURT = getSound("entity.evoker.hurt");
    public static final Sound ENTITY_EVOKER_PREPARE_ATTACK = getSound("entity.evoker.prepare_attack");
    public static final Sound ENTITY_EVOKER_PREPARE_SUMMON = getSound("entity.evoker.prepare_summon");
    public static final Sound ENTITY_EVOKER_PREPARE_WOLOLO = getSound("entity.evoker.prepare_wololo");
    public static final Sound ENTITY_EXPERIENCE_BOTTLE_THROW = getSound("entity.experience_bottle.throw");
    public static final Sound ENTITY_EXPERIENCE_ORB_PICKUP = getSound("entity.experience_orb.pickup");
    public static final Sound BLOCK_FENCE_GATE_CLOSE = getSound("block.fence_gate.close");
    public static final Sound BLOCK_FENCE_GATE_OPEN = getSound("block.fence_gate.open");
    public static final Sound ITEM_FIRECHARGE_USE = getSound("item.firecharge.use");
    public static final Sound ENTITY_FIREWORK_ROCKET_BLAST = getSound("entity.firework_rocket.blast");
    public static final Sound ENTITY_FIREWORK_ROCKET_BLAST_FAR = getSound("entity.firework_rocket.blast_far");
    public static final Sound ENTITY_FIREWORK_ROCKET_LARGE_BLAST = getSound("entity.firework_rocket.large_blast");
    public static final Sound ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR = getSound("entity.firework_rocket.large_blast_far");
    public static final Sound ENTITY_FIREWORK_ROCKET_LAUNCH = getSound("entity.firework_rocket.launch");
    public static final Sound ENTITY_FIREWORK_ROCKET_SHOOT = getSound("entity.firework_rocket.shoot");
    public static final Sound ENTITY_FIREWORK_ROCKET_TWINKLE = getSound("entity.firework_rocket.twinkle");
    public static final Sound ENTITY_FIREWORK_ROCKET_TWINKLE_FAR = getSound("entity.firework_rocket.twinkle_far");
    public static final Sound BLOCK_FIRE_AMBIENT = getSound("block.fire.ambient");
    public static final Sound BLOCK_FIRE_EXTINGUISH = getSound("block.fire.extinguish");
    public static final Sound ENTITY_FISH_SWIM = getSound("entity.fish.swim");
    public static final Sound ENTITY_FISHING_BOBBER_RETRIEVE = getSound("entity.fishing_bobber.retrieve");
    public static final Sound ENTITY_FISHING_BOBBER_SPLASH = getSound("entity.fishing_bobber.splash");
    public static final Sound ENTITY_FISHING_BOBBER_THROW = getSound("entity.fishing_bobber.throw");
    public static final Sound ITEM_FLINTANDSTEEL_USE = getSound("item.flintandsteel.use");
    public static final Sound BLOCK_FLOWERING_AZALEA_BREAK = getSound("block.flowering_azalea.break");
    public static final Sound BLOCK_FLOWERING_AZALEA_FALL = getSound("block.flowering_azalea.fall");
    public static final Sound BLOCK_FLOWERING_AZALEA_HIT = getSound("block.flowering_azalea.hit");
    public static final Sound BLOCK_FLOWERING_AZALEA_PLACE = getSound("block.flowering_azalea.place");
    public static final Sound BLOCK_FLOWERING_AZALEA_STEP = getSound("block.flowering_azalea.step");
    public static final Sound ENTITY_FOX_AGGRO = getSound("entity.fox.aggro");
    public static final Sound ENTITY_FOX_AMBIENT = getSound("entity.fox.ambient");
    public static final Sound ENTITY_FOX_BITE = getSound("entity.fox.bite");
    public static final Sound ENTITY_FOX_DEATH = getSound("entity.fox.death");
    public static final Sound ENTITY_FOX_EAT = getSound("entity.fox.eat");
    public static final Sound ENTITY_FOX_HURT = getSound("entity.fox.hurt");
    public static final Sound ENTITY_FOX_SCREECH = getSound("entity.fox.screech");
    public static final Sound ENTITY_FOX_SLEEP = getSound("entity.fox.sleep");
    public static final Sound ENTITY_FOX_SNIFF = getSound("entity.fox.sniff");
    public static final Sound ENTITY_FOX_SPIT = getSound("entity.fox.spit");
    public static final Sound ENTITY_FOX_TELEPORT = getSound("entity.fox.teleport");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_SUSPICIOUS_SAND_BREAK = getSound("block.suspicious_sand.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_SUSPICIOUS_SAND_STEP = getSound("block.suspicious_sand.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_SUSPICIOUS_SAND_PLACE = getSound("block.suspicious_sand.place");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_SUSPICIOUS_SAND_HIT = getSound("block.suspicious_sand.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_SUSPICIOUS_SAND_FALL = getSound("block.suspicious_sand.fall");
    public static final Sound BLOCK_FROGLIGHT_BREAK = getSound("block.froglight.break");
    public static final Sound BLOCK_FROGLIGHT_FALL = getSound("block.froglight.fall");
    public static final Sound BLOCK_FROGLIGHT_HIT = getSound("block.froglight.hit");
    public static final Sound BLOCK_FROGLIGHT_PLACE = getSound("block.froglight.place");
    public static final Sound BLOCK_FROGLIGHT_STEP = getSound("block.froglight.step");
    public static final Sound BLOCK_FROGSPAWN_STEP = getSound("block.frogspawn.step");
    public static final Sound BLOCK_FROGSPAWN_BREAK = getSound("block.frogspawn.break");
    public static final Sound BLOCK_FROGSPAWN_FALL = getSound("block.frogspawn.fall");
    public static final Sound BLOCK_FROGSPAWN_HATCH = getSound("block.frogspawn.hatch");
    public static final Sound BLOCK_FROGSPAWN_HIT = getSound("block.frogspawn.hit");
    public static final Sound BLOCK_FROGSPAWN_PLACE = getSound("block.frogspawn.place");
    public static final Sound ENTITY_FROG_AMBIENT = getSound("entity.frog.ambient");
    public static final Sound ENTITY_FROG_DEATH = getSound("entity.frog.death");
    public static final Sound ENTITY_FROG_EAT = getSound("entity.frog.eat");
    public static final Sound ENTITY_FROG_HURT = getSound("entity.frog.hurt");
    public static final Sound ENTITY_FROG_LAY_SPAWN = getSound("entity.frog.lay_spawn");
    public static final Sound ENTITY_FROG_LONG_JUMP = getSound("entity.frog.long_jump");
    public static final Sound ENTITY_FROG_STEP = getSound("entity.frog.step");
    public static final Sound ENTITY_FROG_TONGUE = getSound("entity.frog.tongue");
    public static final Sound BLOCK_ROOTS_BREAK = getSound("block.roots.break");
    public static final Sound BLOCK_ROOTS_STEP = getSound("block.roots.step");
    public static final Sound BLOCK_ROOTS_PLACE = getSound("block.roots.place");
    public static final Sound BLOCK_ROOTS_HIT = getSound("block.roots.hit");
    public static final Sound BLOCK_ROOTS_FALL = getSound("block.roots.fall");
    public static final Sound BLOCK_FURNACE_FIRE_CRACKLE = getSound("block.furnace.fire_crackle");
    public static final Sound ENTITY_GENERIC_BIG_FALL = getSound("entity.generic.big_fall");
    public static final Sound ENTITY_GENERIC_BURN = getSound("entity.generic.burn");
    public static final Sound ENTITY_GENERIC_DEATH = getSound("entity.generic.death");
    public static final Sound ENTITY_GENERIC_DRINK = getSound("entity.generic.drink");
    public static final Sound ENTITY_GENERIC_EAT = getSound("entity.generic.eat");
    public static final Sound ENTITY_GENERIC_EXPLODE = getSound("entity.generic.explode");
    public static final Sound ENTITY_GENERIC_EXTINGUISH_FIRE = getSound("entity.generic.extinguish_fire");
    public static final Sound ENTITY_GENERIC_HURT = getSound("entity.generic.hurt");
    public static final Sound ENTITY_GENERIC_SMALL_FALL = getSound("entity.generic.small_fall");
    public static final Sound ENTITY_GENERIC_SPLASH = getSound("entity.generic.splash");
    public static final Sound ENTITY_GENERIC_SWIM = getSound("entity.generic.swim");
    public static final Sound ENTITY_GHAST_AMBIENT = getSound("entity.ghast.ambient");
    public static final Sound ENTITY_GHAST_DEATH = getSound("entity.ghast.death");
    public static final Sound ENTITY_GHAST_HURT = getSound("entity.ghast.hurt");
    public static final Sound ENTITY_GHAST_SCREAM = getSound("entity.ghast.scream");
    public static final Sound ENTITY_GHAST_SHOOT = getSound("entity.ghast.shoot");
    public static final Sound ENTITY_GHAST_WARN = getSound("entity.ghast.warn");
    public static final Sound BLOCK_GILDED_BLACKSTONE_BREAK = getSound("block.gilded_blackstone.break");
    public static final Sound BLOCK_GILDED_BLACKSTONE_FALL = getSound("block.gilded_blackstone.fall");
    public static final Sound BLOCK_GILDED_BLACKSTONE_HIT = getSound("block.gilded_blackstone.hit");
    public static final Sound BLOCK_GILDED_BLACKSTONE_PLACE = getSound("block.gilded_blackstone.place");
    public static final Sound BLOCK_GILDED_BLACKSTONE_STEP = getSound("block.gilded_blackstone.step");
    public static final Sound BLOCK_GLASS_BREAK = getSound("block.glass.break");
    public static final Sound BLOCK_GLASS_FALL = getSound("block.glass.fall");
    public static final Sound BLOCK_GLASS_HIT = getSound("block.glass.hit");
    public static final Sound BLOCK_GLASS_PLACE = getSound("block.glass.place");
    public static final Sound BLOCK_GLASS_STEP = getSound("block.glass.step");
    public static final Sound ITEM_GLOW_INK_SAC_USE = getSound("item.glow_ink_sac.use");
    public static final Sound ENTITY_GLOW_ITEM_FRAME_ADD_ITEM = getSound("entity.glow_item_frame.add_item");
    public static final Sound ENTITY_GLOW_ITEM_FRAME_BREAK = getSound("entity.glow_item_frame.break");
    public static final Sound ENTITY_GLOW_ITEM_FRAME_PLACE = getSound("entity.glow_item_frame.place");
    public static final Sound ENTITY_GLOW_ITEM_FRAME_REMOVE_ITEM = getSound("entity.glow_item_frame.remove_item");
    public static final Sound ENTITY_GLOW_ITEM_FRAME_ROTATE_ITEM = getSound("entity.glow_item_frame.rotate_item");
    public static final Sound ENTITY_GLOW_SQUID_AMBIENT = getSound("entity.glow_squid.ambient");
    public static final Sound ENTITY_GLOW_SQUID_DEATH = getSound("entity.glow_squid.death");
    public static final Sound ENTITY_GLOW_SQUID_HURT = getSound("entity.glow_squid.hurt");
    public static final Sound ENTITY_GLOW_SQUID_SQUIRT = getSound("entity.glow_squid.squirt");
    public static final Sound ENTITY_GOAT_AMBIENT = getSound("entity.goat.ambient");
    public static final Sound ENTITY_GOAT_DEATH = getSound("entity.goat.death");
    public static final Sound ENTITY_GOAT_EAT = getSound("entity.goat.eat");
    public static final Sound ENTITY_GOAT_HURT = getSound("entity.goat.hurt");
    public static final Sound ENTITY_GOAT_LONG_JUMP = getSound("entity.goat.long_jump");
    public static final Sound ENTITY_GOAT_MILK = getSound("entity.goat.milk");
    public static final Sound ENTITY_GOAT_PREPARE_RAM = getSound("entity.goat.prepare_ram");
    public static final Sound ENTITY_GOAT_RAM_IMPACT = getSound("entity.goat.ram_impact");
    public static final Sound ENTITY_GOAT_HORN_BREAK = getSound("entity.goat.horn_break");
    public static final Sound ITEM_GOAT_HORN_PLAY = getSound("item.goat_horn.play");
    public static final Sound ENTITY_GOAT_SCREAMING_AMBIENT = getSound("entity.goat.screaming.ambient");
    public static final Sound ENTITY_GOAT_SCREAMING_DEATH = getSound("entity.goat.screaming.death");
    public static final Sound ENTITY_GOAT_SCREAMING_EAT = getSound("entity.goat.screaming.eat");
    public static final Sound ENTITY_GOAT_SCREAMING_HURT = getSound("entity.goat.screaming.hurt");
    public static final Sound ENTITY_GOAT_SCREAMING_LONG_JUMP = getSound("entity.goat.screaming.long_jump");
    public static final Sound ENTITY_GOAT_SCREAMING_MILK = getSound("entity.goat.screaming.milk");
    public static final Sound ENTITY_GOAT_SCREAMING_PREPARE_RAM = getSound("entity.goat.screaming.prepare_ram");
    public static final Sound ENTITY_GOAT_SCREAMING_RAM_IMPACT = getSound("entity.goat.screaming.ram_impact");
    public static final Sound ENTITY_GOAT_SCREAMING_HORN_BREAK = getSound("entity.goat.screaming.horn_break");
    public static final Sound ENTITY_GOAT_STEP = getSound("entity.goat.step");
    public static final Sound BLOCK_GRASS_BREAK = getSound("block.grass.break");
    public static final Sound BLOCK_GRASS_FALL = getSound("block.grass.fall");
    public static final Sound BLOCK_GRASS_HIT = getSound("block.grass.hit");
    public static final Sound BLOCK_GRASS_PLACE = getSound("block.grass.place");
    public static final Sound BLOCK_GRASS_STEP = getSound("block.grass.step");
    public static final Sound BLOCK_GRAVEL_BREAK = getSound("block.gravel.break");
    public static final Sound BLOCK_GRAVEL_FALL = getSound("block.gravel.fall");
    public static final Sound BLOCK_GRAVEL_HIT = getSound("block.gravel.hit");
    public static final Sound BLOCK_GRAVEL_PLACE = getSound("block.gravel.place");
    public static final Sound BLOCK_GRAVEL_STEP = getSound("block.gravel.step");
    public static final Sound BLOCK_GRINDSTONE_USE = getSound("block.grindstone.use");
    public static final Sound BLOCK_GROWING_PLANT_CROP = getSound("block.growing_plant.crop");
    public static final Sound ENTITY_GUARDIAN_AMBIENT = getSound("entity.guardian.ambient");
    public static final Sound ENTITY_GUARDIAN_AMBIENT_LAND = getSound("entity.guardian.ambient_land");
    public static final Sound ENTITY_GUARDIAN_ATTACK = getSound("entity.guardian.attack");
    public static final Sound ENTITY_GUARDIAN_DEATH = getSound("entity.guardian.death");
    public static final Sound ENTITY_GUARDIAN_DEATH_LAND = getSound("entity.guardian.death_land");
    public static final Sound ENTITY_GUARDIAN_FLOP = getSound("entity.guardian.flop");
    public static final Sound ENTITY_GUARDIAN_HURT = getSound("entity.guardian.hurt");
    public static final Sound ENTITY_GUARDIAN_HURT_LAND = getSound("entity.guardian.hurt_land");
    public static final Sound BLOCK_HANGING_ROOTS_BREAK = getSound("block.hanging_roots.break");
    public static final Sound BLOCK_HANGING_ROOTS_FALL = getSound("block.hanging_roots.fall");
    public static final Sound BLOCK_HANGING_ROOTS_HIT = getSound("block.hanging_roots.hit");
    public static final Sound BLOCK_HANGING_ROOTS_PLACE = getSound("block.hanging_roots.place");
    public static final Sound BLOCK_HANGING_ROOTS_STEP = getSound("block.hanging_roots.step");
    public static final Sound BLOCK_HANGING_SIGN_STEP = getSound("block.hanging_sign.step");
    public static final Sound BLOCK_HANGING_SIGN_BREAK = getSound("block.hanging_sign.break");
    public static final Sound BLOCK_HANGING_SIGN_FALL = getSound("block.hanging_sign.fall");
    public static final Sound BLOCK_HANGING_SIGN_HIT = getSound("block.hanging_sign.hit");
    public static final Sound BLOCK_HANGING_SIGN_PLACE = getSound("block.hanging_sign.place");
    public static final Sound BLOCK_NETHER_WOOD_HANGING_SIGN_STEP = getSound("block.nether_wood_hanging_sign.step");
    public static final Sound BLOCK_NETHER_WOOD_HANGING_SIGN_BREAK = getSound("block.nether_wood_hanging_sign.break");
    public static final Sound BLOCK_NETHER_WOOD_HANGING_SIGN_FALL = getSound("block.nether_wood_hanging_sign.fall");
    public static final Sound BLOCK_NETHER_WOOD_HANGING_SIGN_HIT = getSound("block.nether_wood_hanging_sign.hit");
    public static final Sound BLOCK_NETHER_WOOD_HANGING_SIGN_PLACE = getSound("block.nether_wood_hanging_sign.place");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_STEP = getSound("block.bamboo_wood_hanging_sign.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_BREAK = getSound("block.bamboo_wood_hanging_sign.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_FALL = getSound("block.bamboo_wood_hanging_sign.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_HIT = getSound("block.bamboo_wood_hanging_sign.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_BAMBOO_WOOD_HANGING_SIGN_PLACE = getSound("block.bamboo_wood_hanging_sign.place");
    public static final Sound ITEM_HOE_TILL = getSound("item.hoe.till");
    public static final Sound ENTITY_HOGLIN_AMBIENT = getSound("entity.hoglin.ambient");
    public static final Sound ENTITY_HOGLIN_ANGRY = getSound("entity.hoglin.angry");
    public static final Sound ENTITY_HOGLIN_ATTACK = getSound("entity.hoglin.attack");
    public static final Sound ENTITY_HOGLIN_CONVERTED_TO_ZOMBIFIED = getSound("entity.hoglin.converted_to_zombified");
    public static final Sound ENTITY_HOGLIN_DEATH = getSound("entity.hoglin.death");
    public static final Sound ENTITY_HOGLIN_HURT = getSound("entity.hoglin.hurt");
    public static final Sound ENTITY_HOGLIN_RETREAT = getSound("entity.hoglin.retreat");
    public static final Sound ENTITY_HOGLIN_STEP = getSound("entity.hoglin.step");
    public static final Sound BLOCK_HONEY_BLOCK_BREAK = getSound("block.honey_block.break");
    public static final Sound BLOCK_HONEY_BLOCK_FALL = getSound("block.honey_block.fall");
    public static final Sound BLOCK_HONEY_BLOCK_HIT = getSound("block.honey_block.hit");
    public static final Sound BLOCK_HONEY_BLOCK_PLACE = getSound("block.honey_block.place");
    public static final Sound BLOCK_HONEY_BLOCK_SLIDE = getSound("block.honey_block.slide");
    public static final Sound BLOCK_HONEY_BLOCK_STEP = getSound("block.honey_block.step");
    public static final Sound ITEM_HONEYCOMB_WAX_ON = getSound("item.honeycomb.wax_on");
    public static final Sound ITEM_HONEY_BOTTLE_DRINK = getSound("item.honey_bottle.drink");
    public static final Sound ITEM_GOAT_HORN_SOUND_0 = getSound("item.goat_horn.sound.0");
    public static final Sound ITEM_GOAT_HORN_SOUND_1 = getSound("item.goat_horn.sound.1");
    public static final Sound ITEM_GOAT_HORN_SOUND_2 = getSound("item.goat_horn.sound.2");
    public static final Sound ITEM_GOAT_HORN_SOUND_3 = getSound("item.goat_horn.sound.3");
    public static final Sound ITEM_GOAT_HORN_SOUND_4 = getSound("item.goat_horn.sound.4");
    public static final Sound ITEM_GOAT_HORN_SOUND_5 = getSound("item.goat_horn.sound.5");
    public static final Sound ITEM_GOAT_HORN_SOUND_6 = getSound("item.goat_horn.sound.6");
    public static final Sound ITEM_GOAT_HORN_SOUND_7 = getSound("item.goat_horn.sound.7");
    public static final Sound ENTITY_HORSE_AMBIENT = getSound("entity.horse.ambient");
    public static final Sound ENTITY_HORSE_ANGRY = getSound("entity.horse.angry");
    public static final Sound ENTITY_HORSE_ARMOR = getSound("entity.horse.armor");
    public static final Sound ENTITY_HORSE_BREATHE = getSound("entity.horse.breathe");
    public static final Sound ENTITY_HORSE_DEATH = getSound("entity.horse.death");
    public static final Sound ENTITY_HORSE_EAT = getSound("entity.horse.eat");
    public static final Sound ENTITY_HORSE_GALLOP = getSound("entity.horse.gallop");
    public static final Sound ENTITY_HORSE_HURT = getSound("entity.horse.hurt");
    public static final Sound ENTITY_HORSE_JUMP = getSound("entity.horse.jump");
    public static final Sound ENTITY_HORSE_LAND = getSound("entity.horse.land");
    public static final Sound ENTITY_HORSE_SADDLE = getSound("entity.horse.saddle");
    public static final Sound ENTITY_HORSE_STEP = getSound("entity.horse.step");
    public static final Sound ENTITY_HORSE_STEP_WOOD = getSound("entity.horse.step_wood");
    public static final Sound ENTITY_HOSTILE_BIG_FALL = getSound("entity.hostile.big_fall");
    public static final Sound ENTITY_HOSTILE_DEATH = getSound("entity.hostile.death");
    public static final Sound ENTITY_HOSTILE_HURT = getSound("entity.hostile.hurt");
    public static final Sound ENTITY_HOSTILE_SMALL_FALL = getSound("entity.hostile.small_fall");
    public static final Sound ENTITY_HOSTILE_SPLASH = getSound("entity.hostile.splash");
    public static final Sound ENTITY_HOSTILE_SWIM = getSound("entity.hostile.swim");
    public static final Sound ENTITY_HUSK_AMBIENT = getSound("entity.husk.ambient");
    public static final Sound ENTITY_HUSK_CONVERTED_TO_ZOMBIE = getSound("entity.husk.converted_to_zombie");
    public static final Sound ENTITY_HUSK_DEATH = getSound("entity.husk.death");
    public static final Sound ENTITY_HUSK_HURT = getSound("entity.husk.hurt");
    public static final Sound ENTITY_HUSK_STEP = getSound("entity.husk.step");
    public static final Sound ENTITY_ILLUSIONER_AMBIENT = getSound("entity.illusioner.ambient");
    public static final Sound ENTITY_ILLUSIONER_CAST_SPELL = getSound("entity.illusioner.cast_spell");
    public static final Sound ENTITY_ILLUSIONER_DEATH = getSound("entity.illusioner.death");
    public static final Sound ENTITY_ILLUSIONER_HURT = getSound("entity.illusioner.hurt");
    public static final Sound ENTITY_ILLUSIONER_MIRROR_MOVE = getSound("entity.illusioner.mirror_move");
    public static final Sound ENTITY_ILLUSIONER_PREPARE_BLINDNESS = getSound("entity.illusioner.prepare_blindness");
    public static final Sound ENTITY_ILLUSIONER_PREPARE_MIRROR = getSound("entity.illusioner.prepare_mirror");
    public static final Sound ITEM_INK_SAC_USE = getSound("item.ink_sac.use");
    public static final Sound BLOCK_IRON_DOOR_CLOSE = getSound("block.iron_door.close");
    public static final Sound BLOCK_IRON_DOOR_OPEN = getSound("block.iron_door.open");
    public static final Sound ENTITY_IRON_GOLEM_ATTACK = getSound("entity.iron_golem.attack");
    public static final Sound ENTITY_IRON_GOLEM_DAMAGE = getSound("entity.iron_golem.damage");
    public static final Sound ENTITY_IRON_GOLEM_DEATH = getSound("entity.iron_golem.death");
    public static final Sound ENTITY_IRON_GOLEM_HURT = getSound("entity.iron_golem.hurt");
    public static final Sound ENTITY_IRON_GOLEM_REPAIR = getSound("entity.iron_golem.repair");
    public static final Sound ENTITY_IRON_GOLEM_STEP = getSound("entity.iron_golem.step");
    public static final Sound BLOCK_IRON_TRAPDOOR_CLOSE = getSound("block.iron_trapdoor.close");
    public static final Sound BLOCK_IRON_TRAPDOOR_OPEN = getSound("block.iron_trapdoor.open");
    public static final Sound ENTITY_ITEM_FRAME_ADD_ITEM = getSound("entity.item_frame.add_item");
    public static final Sound ENTITY_ITEM_FRAME_BREAK = getSound("entity.item_frame.break");
    public static final Sound ENTITY_ITEM_FRAME_PLACE = getSound("entity.item_frame.place");
    public static final Sound ENTITY_ITEM_FRAME_REMOVE_ITEM = getSound("entity.item_frame.remove_item");
    public static final Sound ENTITY_ITEM_FRAME_ROTATE_ITEM = getSound("entity.item_frame.rotate_item");
    public static final Sound ENTITY_ITEM_BREAK = getSound("entity.item.break");
    public static final Sound ENTITY_ITEM_PICKUP = getSound("entity.item.pickup");
    public static final Sound BLOCK_LADDER_BREAK = getSound("block.ladder.break");
    public static final Sound BLOCK_LADDER_FALL = getSound("block.ladder.fall");
    public static final Sound BLOCK_LADDER_HIT = getSound("block.ladder.hit");
    public static final Sound BLOCK_LADDER_PLACE = getSound("block.ladder.place");
    public static final Sound BLOCK_LADDER_STEP = getSound("block.ladder.step");
    public static final Sound BLOCK_LANTERN_BREAK = getSound("block.lantern.break");
    public static final Sound BLOCK_LANTERN_FALL = getSound("block.lantern.fall");
    public static final Sound BLOCK_LANTERN_HIT = getSound("block.lantern.hit");
    public static final Sound BLOCK_LANTERN_PLACE = getSound("block.lantern.place");
    public static final Sound BLOCK_LANTERN_STEP = getSound("block.lantern.step");
    public static final Sound BLOCK_LARGE_AMETHYST_BUD_BREAK = getSound("block.large_amethyst_bud.break");
    public static final Sound BLOCK_LARGE_AMETHYST_BUD_PLACE = getSound("block.large_amethyst_bud.place");
    public static final Sound BLOCK_LAVA_AMBIENT = getSound("block.lava.ambient");
    public static final Sound BLOCK_LAVA_EXTINGUISH = getSound("block.lava.extinguish");
    public static final Sound BLOCK_LAVA_POP = getSound("block.lava.pop");
    public static final Sound ENTITY_LEASH_KNOT_BREAK = getSound("entity.leash_knot.break");
    public static final Sound ENTITY_LEASH_KNOT_PLACE = getSound("entity.leash_knot.place");
    public static final Sound BLOCK_LEVER_CLICK = getSound("block.lever.click");
    public static final Sound ENTITY_LIGHTNING_BOLT_IMPACT = getSound("entity.lightning_bolt.impact");
    public static final Sound ENTITY_LIGHTNING_BOLT_THUNDER = getSound("entity.lightning_bolt.thunder");
    public static final Sound ENTITY_LINGERING_POTION_THROW = getSound("entity.lingering_potion.throw");
    public static final Sound ENTITY_LLAMA_AMBIENT = getSound("entity.llama.ambient");
    public static final Sound ENTITY_LLAMA_ANGRY = getSound("entity.llama.angry");
    public static final Sound ENTITY_LLAMA_CHEST = getSound("entity.llama.chest");
    public static final Sound ENTITY_LLAMA_DEATH = getSound("entity.llama.death");
    public static final Sound ENTITY_LLAMA_EAT = getSound("entity.llama.eat");
    public static final Sound ENTITY_LLAMA_HURT = getSound("entity.llama.hurt");
    public static final Sound ENTITY_LLAMA_SPIT = getSound("entity.llama.spit");
    public static final Sound ENTITY_LLAMA_STEP = getSound("entity.llama.step");
    public static final Sound ENTITY_LLAMA_SWAG = getSound("entity.llama.swag");
    public static final Sound ENTITY_MAGMA_CUBE_DEATH_SMALL = getSound("entity.magma_cube.death_small");
    public static final Sound BLOCK_LODESTONE_BREAK = getSound("block.lodestone.break");
    public static final Sound BLOCK_LODESTONE_STEP = getSound("block.lodestone.step");
    public static final Sound BLOCK_LODESTONE_PLACE = getSound("block.lodestone.place");
    public static final Sound BLOCK_LODESTONE_HIT = getSound("block.lodestone.hit");
    public static final Sound BLOCK_LODESTONE_FALL = getSound("block.lodestone.fall");
    public static final Sound ITEM_LODESTONE_COMPASS_LOCK = getSound("item.lodestone_compass.lock");
    public static final Sound ENTITY_MAGMA_CUBE_DEATH = getSound("entity.magma_cube.death");
    public static final Sound ENTITY_MAGMA_CUBE_HURT = getSound("entity.magma_cube.hurt");
    public static final Sound ENTITY_MAGMA_CUBE_HURT_SMALL = getSound("entity.magma_cube.hurt_small");
    public static final Sound ENTITY_MAGMA_CUBE_JUMP = getSound("entity.magma_cube.jump");
    public static final Sound ENTITY_MAGMA_CUBE_SQUISH = getSound("entity.magma_cube.squish");
    public static final Sound ENTITY_MAGMA_CUBE_SQUISH_SMALL = getSound("entity.magma_cube.squish_small");
    public static final Sound BLOCK_MANGROVE_ROOTS_BREAK = getSound("block.mangrove_roots.break");
    public static final Sound BLOCK_MANGROVE_ROOTS_FALL = getSound("block.mangrove_roots.fall");
    public static final Sound BLOCK_MANGROVE_ROOTS_HIT = getSound("block.mangrove_roots.hit");
    public static final Sound BLOCK_MANGROVE_ROOTS_PLACE = getSound("block.mangrove_roots.place");
    public static final Sound BLOCK_MANGROVE_ROOTS_STEP = getSound("block.mangrove_roots.step");
    public static final Sound BLOCK_MEDIUM_AMETHYST_BUD_BREAK = getSound("block.medium_amethyst_bud.break");
    public static final Sound BLOCK_MEDIUM_AMETHYST_BUD_PLACE = getSound("block.medium_amethyst_bud.place");
    public static final Sound BLOCK_METAL_BREAK = getSound("block.metal.break");
    public static final Sound BLOCK_METAL_FALL = getSound("block.metal.fall");
    public static final Sound BLOCK_METAL_HIT = getSound("block.metal.hit");
    public static final Sound BLOCK_METAL_PLACE = getSound("block.metal.place");
    public static final Sound BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF = getSound("block.metal_pressure_plate.click_off");
    public static final Sound BLOCK_METAL_PRESSURE_PLATE_CLICK_ON = getSound("block.metal_pressure_plate.click_on");
    public static final Sound BLOCK_METAL_STEP = getSound("block.metal.step");
    public static final Sound ENTITY_MINECART_INSIDE_UNDERWATER = getSound("entity.minecart.inside.underwater");
    public static final Sound ENTITY_MINECART_INSIDE = getSound("entity.minecart.inside");
    public static final Sound ENTITY_MINECART_RIDING = getSound("entity.minecart.riding");
    public static final Sound ENTITY_MOOSHROOM_CONVERT = getSound("entity.mooshroom.convert");
    public static final Sound ENTITY_MOOSHROOM_EAT = getSound("entity.mooshroom.eat");
    public static final Sound ENTITY_MOOSHROOM_MILK = getSound("entity.mooshroom.milk");
    public static final Sound ENTITY_MOOSHROOM_SUSPICIOUS_MILK = getSound("entity.mooshroom.suspicious_milk");
    public static final Sound ENTITY_MOOSHROOM_SHEAR = getSound("entity.mooshroom.shear");
    public static final Sound BLOCK_MOSS_CARPET_BREAK = getSound("block.moss_carpet.break");
    public static final Sound BLOCK_MOSS_CARPET_FALL = getSound("block.moss_carpet.fall");
    public static final Sound BLOCK_MOSS_CARPET_HIT = getSound("block.moss_carpet.hit");
    public static final Sound BLOCK_MOSS_CARPET_PLACE = getSound("block.moss_carpet.place");
    public static final Sound BLOCK_MOSS_CARPET_STEP = getSound("block.moss_carpet.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_PINK_PETALS_BREAK = getSound("block.pink_petals.break");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_PINK_PETALS_FALL = getSound("block.pink_petals.fall");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_PINK_PETALS_HIT = getSound("block.pink_petals.hit");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_PINK_PETALS_PLACE = getSound("block.pink_petals.place");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound BLOCK_PINK_PETALS_STEP = getSound("block.pink_petals.step");
    public static final Sound BLOCK_MOSS_BREAK = getSound("block.moss.break");
    public static final Sound BLOCK_MOSS_FALL = getSound("block.moss.fall");
    public static final Sound BLOCK_MOSS_HIT = getSound("block.moss.hit");
    public static final Sound BLOCK_MOSS_PLACE = getSound("block.moss.place");
    public static final Sound BLOCK_MOSS_STEP = getSound("block.moss.step");
    public static final Sound BLOCK_MUD_BREAK = getSound("block.mud.break");
    public static final Sound BLOCK_MUD_FALL = getSound("block.mud.fall");
    public static final Sound BLOCK_MUD_HIT = getSound("block.mud.hit");
    public static final Sound BLOCK_MUD_PLACE = getSound("block.mud.place");
    public static final Sound BLOCK_MUD_STEP = getSound("block.mud.step");
    public static final Sound BLOCK_MUD_BRICKS_BREAK = getSound("block.mud_bricks.break");
    public static final Sound BLOCK_MUD_BRICKS_FALL = getSound("block.mud_bricks.fall");
    public static final Sound BLOCK_MUD_BRICKS_HIT = getSound("block.mud_bricks.hit");
    public static final Sound BLOCK_MUD_BRICKS_PLACE = getSound("block.mud_bricks.place");
    public static final Sound BLOCK_MUD_BRICKS_STEP = getSound("block.mud_bricks.step");
    public static final Sound BLOCK_MUDDY_MANGROVE_ROOTS_BREAK = getSound("block.muddy_mangrove_roots.break");
    public static final Sound BLOCK_MUDDY_MANGROVE_ROOTS_FALL = getSound("block.muddy_mangrove_roots.fall");
    public static final Sound BLOCK_MUDDY_MANGROVE_ROOTS_HIT = getSound("block.muddy_mangrove_roots.hit");
    public static final Sound BLOCK_MUDDY_MANGROVE_ROOTS_PLACE = getSound("block.muddy_mangrove_roots.place");
    public static final Sound BLOCK_MUDDY_MANGROVE_ROOTS_STEP = getSound("block.muddy_mangrove_roots.step");
    public static final Sound ENTITY_MULE_AMBIENT = getSound("entity.mule.ambient");
    public static final Sound ENTITY_MULE_ANGRY = getSound("entity.mule.angry");
    public static final Sound ENTITY_MULE_CHEST = getSound("entity.mule.chest");
    public static final Sound ENTITY_MULE_DEATH = getSound("entity.mule.death");
    public static final Sound ENTITY_MULE_EAT = getSound("entity.mule.eat");
    public static final Sound ENTITY_MULE_HURT = getSound("entity.mule.hurt");
    public static final Sound MUSIC_CREATIVE = getSound("music.creative");
    public static final Sound MUSIC_CREDITS = getSound("music.credits");
    public static final Sound MUSIC_DISC_5 = getSound("music_disc.5");
    public static final Sound MUSIC_DISC_11 = getSound("music_disc.11");
    public static final Sound MUSIC_DISC_13 = getSound("music_disc.13");
    public static final Sound MUSIC_DISC_BLOCKS = getSound("music_disc.blocks");
    public static final Sound MUSIC_DISC_CAT = getSound("music_disc.cat");
    public static final Sound MUSIC_DISC_CHIRP = getSound("music_disc.chirp");
    public static final Sound MUSIC_DISC_FAR = getSound("music_disc.far");
    public static final Sound MUSIC_DISC_MALL = getSound("music_disc.mall");
    public static final Sound MUSIC_DISC_MELLOHI = getSound("music_disc.mellohi");
    public static final Sound MUSIC_DISC_PIGSTEP = getSound("music_disc.pigstep");
    public static final Sound MUSIC_DISC_STAL = getSound("music_disc.stal");
    public static final Sound MUSIC_DISC_STRAD = getSound("music_disc.strad");
    public static final Sound MUSIC_DISC_WAIT = getSound("music_disc.wait");
    public static final Sound MUSIC_DISC_WARD = getSound("music_disc.ward");
    public static final Sound MUSIC_DISC_OTHERSIDE = getSound("music_disc.otherside");
    public static final Sound MUSIC_DRAGON = getSound("music.dragon");
    public static final Sound MUSIC_END = getSound("music.end");
    public static final Sound MUSIC_GAME = getSound("music.game");
    public static final Sound MUSIC_MENU = getSound("music.menu");
    public static final Sound MUSIC_NETHER_BASALT_DELTAS = getSound("music.nether.basalt_deltas");
    public static final Sound MUSIC_NETHER_CRIMSON_FOREST = getSound("music.nether.crimson_forest");
    public static final Sound MUSIC_OVERWORLD_DEEP_DARK = getSound("music.overworld.deep_dark");
    public static final Sound MUSIC_OVERWORLD_DRIPSTONE_CAVES = getSound("music.overworld.dripstone_caves");
    public static final Sound MUSIC_OVERWORLD_GROVE = getSound("music.overworld.grove");
    public static final Sound MUSIC_OVERWORLD_JAGGED_PEAKS = getSound("music.overworld.jagged_peaks");
    public static final Sound MUSIC_OVERWORLD_LUSH_CAVES = getSound("music.overworld.lush_caves");
    public static final Sound MUSIC_OVERWORLD_SWAMP = getSound("music.overworld.swamp");
    public static final Sound MUSIC_OVERWORLD_JUNGLE_AND_FOREST = getSound("music.overworld.jungle_and_forest");
    public static final Sound MUSIC_OVERWORLD_OLD_GROWTH_TAIGA = getSound("music.overworld.old_growth_taiga");
    public static final Sound MUSIC_OVERWORLD_MEADOW = getSound("music.overworld.meadow");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound MUSIC_OVERWORLD_CHERRY_GROVE = getSound("music.overworld.cherry_grove");
    public static final Sound MUSIC_NETHER_NETHER_WASTES = getSound("music.nether.nether_wastes");
    public static final Sound MUSIC_OVERWORLD_FROZEN_PEAKS = getSound("music.overworld.frozen_peaks");
    public static final Sound MUSIC_OVERWORLD_SNOWY_SLOPES = getSound("music.overworld.snowy_slopes");
    public static final Sound MUSIC_NETHER_SOUL_SAND_VALLEY = getSound("music.nether.soul_sand_valley");
    public static final Sound MUSIC_OVERWORLD_STONY_PEAKS = getSound("music.overworld.stony_peaks");
    public static final Sound MUSIC_NETHER_WARPED_FOREST = getSound("music.nether.warped_forest");
    public static final Sound MUSIC_UNDER_WATER = getSound("music.under_water");
    public static final Sound BLOCK_NETHER_BRICKS_BREAK = getSound("block.nether_bricks.break");
    public static final Sound BLOCK_NETHER_BRICKS_STEP = getSound("block.nether_bricks.step");
    public static final Sound BLOCK_NETHER_BRICKS_PLACE = getSound("block.nether_bricks.place");
    public static final Sound BLOCK_NETHER_BRICKS_HIT = getSound("block.nether_bricks.hit");
    public static final Sound BLOCK_NETHER_BRICKS_FALL = getSound("block.nether_bricks.fall");
    public static final Sound BLOCK_NETHER_WART_BREAK = getSound("block.nether_wart.break");
    public static final Sound ITEM_NETHER_WART_PLANT = getSound("item.nether_wart.plant");
    public static final Sound BLOCK_NETHER_WOOD_BREAK = getSound("block.nether_wood.break");
    public static final Sound BLOCK_NETHER_WOOD_FALL = getSound("block.nether_wood.fall");
    public static final Sound BLOCK_NETHER_WOOD_HIT = getSound("block.nether_wood.hit");
    public static final Sound BLOCK_NETHER_WOOD_PLACE = getSound("block.nether_wood.place");
    public static final Sound BLOCK_NETHER_WOOD_STEP = getSound("block.nether_wood.step");
    public static final Sound BLOCK_NETHER_WOOD_DOOR_CLOSE = getSound("block.nether_wood_door.close");
    public static final Sound BLOCK_NETHER_WOOD_DOOR_OPEN = getSound("block.nether_wood_door.open");
    public static final Sound BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE = getSound("block.nether_wood_trapdoor.close");
    public static final Sound BLOCK_NETHER_WOOD_TRAPDOOR_OPEN = getSound("block.nether_wood_trapdoor.open");
    public static final Sound BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF = getSound("block.nether_wood_button.click_off");
    public static final Sound BLOCK_NETHER_WOOD_BUTTON_CLICK_ON = getSound("block.nether_wood_button.click_on");
    public static final Sound BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF = getSound("block.nether_wood_pressure_plate.click_off");
    public static final Sound BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON = getSound("block.nether_wood_pressure_plate.click_on");
    public static final Sound BLOCK_NETHER_WOOD_FENCE_GATE_CLOSE = getSound("block.nether_wood_fence_gate.close");
    public static final Sound BLOCK_NETHER_WOOD_FENCE_GATE_OPEN = getSound("block.nether_wood_fence_gate.open");
    public static final Sound INTENTIONALLY_EMPTY = getSound("intentionally_empty");
    public static final Sound BLOCK_PACKED_MUD_BREAK = getSound("block.packed_mud.break");
    public static final Sound BLOCK_PACKED_MUD_FALL = getSound("block.packed_mud.fall");
    public static final Sound BLOCK_PACKED_MUD_HIT = getSound("block.packed_mud.hit");
    public static final Sound BLOCK_PACKED_MUD_PLACE = getSound("block.packed_mud.place");
    public static final Sound BLOCK_PACKED_MUD_STEP = getSound("block.packed_mud.step");
    public static final Sound BLOCK_STEM_BREAK = getSound("block.stem.break");
    public static final Sound BLOCK_STEM_STEP = getSound("block.stem.step");
    public static final Sound BLOCK_STEM_PLACE = getSound("block.stem.place");
    public static final Sound BLOCK_STEM_HIT = getSound("block.stem.hit");
    public static final Sound BLOCK_STEM_FALL = getSound("block.stem.fall");
    public static final Sound BLOCK_NYLIUM_BREAK = getSound("block.nylium.break");
    public static final Sound BLOCK_NYLIUM_STEP = getSound("block.nylium.step");
    public static final Sound BLOCK_NYLIUM_PLACE = getSound("block.nylium.place");
    public static final Sound BLOCK_NYLIUM_HIT = getSound("block.nylium.hit");
    public static final Sound BLOCK_NYLIUM_FALL = getSound("block.nylium.fall");
    public static final Sound BLOCK_NETHER_SPROUTS_BREAK = getSound("block.nether_sprouts.break");
    public static final Sound BLOCK_NETHER_SPROUTS_STEP = getSound("block.nether_sprouts.step");
    public static final Sound BLOCK_NETHER_SPROUTS_PLACE = getSound("block.nether_sprouts.place");
    public static final Sound BLOCK_NETHER_SPROUTS_HIT = getSound("block.nether_sprouts.hit");
    public static final Sound BLOCK_NETHER_SPROUTS_FALL = getSound("block.nether_sprouts.fall");
    public static final Sound BLOCK_FUNGUS_BREAK = getSound("block.fungus.break");
    public static final Sound BLOCK_FUNGUS_STEP = getSound("block.fungus.step");
    public static final Sound BLOCK_FUNGUS_PLACE = getSound("block.fungus.place");
    public static final Sound BLOCK_FUNGUS_HIT = getSound("block.fungus.hit");
    public static final Sound BLOCK_FUNGUS_FALL = getSound("block.fungus.fall");
    public static final Sound BLOCK_WEEPING_VINES_BREAK = getSound("block.weeping_vines.break");
    public static final Sound BLOCK_WEEPING_VINES_STEP = getSound("block.weeping_vines.step");
    public static final Sound BLOCK_WEEPING_VINES_PLACE = getSound("block.weeping_vines.place");
    public static final Sound BLOCK_WEEPING_VINES_HIT = getSound("block.weeping_vines.hit");
    public static final Sound BLOCK_WEEPING_VINES_FALL = getSound("block.weeping_vines.fall");
    public static final Sound BLOCK_WART_BLOCK_BREAK = getSound("block.wart_block.break");
    public static final Sound BLOCK_WART_BLOCK_STEP = getSound("block.wart_block.step");
    public static final Sound BLOCK_WART_BLOCK_PLACE = getSound("block.wart_block.place");
    public static final Sound BLOCK_WART_BLOCK_HIT = getSound("block.wart_block.hit");
    public static final Sound BLOCK_WART_BLOCK_FALL = getSound("block.wart_block.fall");
    public static final Sound BLOCK_NETHERITE_BLOCK_BREAK = getSound("block.netherite_block.break");
    public static final Sound BLOCK_NETHERITE_BLOCK_STEP = getSound("block.netherite_block.step");
    public static final Sound BLOCK_NETHERITE_BLOCK_PLACE = getSound("block.netherite_block.place");
    public static final Sound BLOCK_NETHERITE_BLOCK_HIT = getSound("block.netherite_block.hit");
    public static final Sound BLOCK_NETHERITE_BLOCK_FALL = getSound("block.netherite_block.fall");
    public static final Sound BLOCK_NETHERRACK_BREAK = getSound("block.netherrack.break");
    public static final Sound BLOCK_NETHERRACK_STEP = getSound("block.netherrack.step");
    public static final Sound BLOCK_NETHERRACK_PLACE = getSound("block.netherrack.place");
    public static final Sound BLOCK_NETHERRACK_HIT = getSound("block.netherrack.hit");
    public static final Sound BLOCK_NETHERRACK_FALL = getSound("block.netherrack.fall");
    public static final Sound BLOCK_NOTE_BLOCK_BASEDRUM = getSound("block.note_block.basedrum");
    public static final Sound BLOCK_NOTE_BLOCK_BASS = getSound("block.note_block.bass");
    public static final Sound BLOCK_NOTE_BLOCK_BELL = getSound("block.note_block.bell");
    public static final Sound BLOCK_NOTE_BLOCK_CHIME = getSound("block.note_block.chime");
    public static final Sound BLOCK_NOTE_BLOCK_FLUTE = getSound("block.note_block.flute");
    public static final Sound BLOCK_NOTE_BLOCK_GUITAR = getSound("block.note_block.guitar");
    public static final Sound BLOCK_NOTE_BLOCK_HARP = getSound("block.note_block.harp");
    public static final Sound BLOCK_NOTE_BLOCK_HAT = getSound("block.note_block.hat");
    public static final Sound BLOCK_NOTE_BLOCK_PLING = getSound("block.note_block.pling");
    public static final Sound BLOCK_NOTE_BLOCK_SNARE = getSound("block.note_block.snare");
    public static final Sound BLOCK_NOTE_BLOCK_XYLOPHONE = getSound("block.note_block.xylophone");
    public static final Sound BLOCK_NOTE_BLOCK_IRON_XYLOPHONE = getSound("block.note_block.iron_xylophone");
    public static final Sound BLOCK_NOTE_BLOCK_COW_BELL = getSound("block.note_block.cow_bell");
    public static final Sound BLOCK_NOTE_BLOCK_DIDGERIDOO = getSound("block.note_block.didgeridoo");
    public static final Sound BLOCK_NOTE_BLOCK_BIT = getSound("block.note_block.bit");
    public static final Sound BLOCK_NOTE_BLOCK_BANJO = getSound("block.note_block.banjo");
    public static final Sound BLOCK_NOTE_BLOCK_IMITATE_ZOMBIE = getSound("block.note_block.imitate.zombie");
    public static final Sound BLOCK_NOTE_BLOCK_IMITATE_SKELETON = getSound("block.note_block.imitate.skeleton");
    public static final Sound BLOCK_NOTE_BLOCK_IMITATE_CREEPER = getSound("block.note_block.imitate.creeper");
    public static final Sound BLOCK_NOTE_BLOCK_IMITATE_ENDER_DRAGON = getSound("block.note_block.imitate.ender_dragon");
    public static final Sound BLOCK_NOTE_BLOCK_IMITATE_WITHER_SKELETON = getSound("block.note_block.imitate.wither_skeleton");
    public static final Sound BLOCK_NOTE_BLOCK_IMITATE_PIGLIN = getSound("block.note_block.imitate.piglin");
    public static final Sound ENTITY_OCELOT_HURT = getSound("entity.ocelot.hurt");
    public static final Sound ENTITY_OCELOT_AMBIENT = getSound("entity.ocelot.ambient");
    public static final Sound ENTITY_OCELOT_DEATH = getSound("entity.ocelot.death");
    public static final Sound ENTITY_PAINTING_BREAK = getSound("entity.painting.break");
    public static final Sound ENTITY_PAINTING_PLACE = getSound("entity.painting.place");
    public static final Sound ENTITY_PANDA_PRE_SNEEZE = getSound("entity.panda.pre_sneeze");
    public static final Sound ENTITY_PANDA_SNEEZE = getSound("entity.panda.sneeze");
    public static final Sound ENTITY_PANDA_AMBIENT = getSound("entity.panda.ambient");
    public static final Sound ENTITY_PANDA_DEATH = getSound("entity.panda.death");
    public static final Sound ENTITY_PANDA_EAT = getSound("entity.panda.eat");
    public static final Sound ENTITY_PANDA_STEP = getSound("entity.panda.step");
    public static final Sound ENTITY_PANDA_CANT_BREED = getSound("entity.panda.cant_breed");
    public static final Sound ENTITY_PANDA_AGGRESSIVE_AMBIENT = getSound("entity.panda.aggressive_ambient");
    public static final Sound ENTITY_PANDA_WORRIED_AMBIENT = getSound("entity.panda.worried_ambient");
    public static final Sound ENTITY_PANDA_HURT = getSound("entity.panda.hurt");
    public static final Sound ENTITY_PANDA_BITE = getSound("entity.panda.bite");
    public static final Sound ENTITY_PARROT_AMBIENT = getSound("entity.parrot.ambient");
    public static final Sound ENTITY_PARROT_DEATH = getSound("entity.parrot.death");
    public static final Sound ENTITY_PARROT_EAT = getSound("entity.parrot.eat");
    public static final Sound ENTITY_PARROT_FLY = getSound("entity.parrot.fly");
    public static final Sound ENTITY_PARROT_HURT = getSound("entity.parrot.hurt");
    public static final Sound ENTITY_PARROT_IMITATE_BLAZE = getSound("entity.parrot.imitate.blaze");
    public static final Sound ENTITY_PARROT_IMITATE_CREEPER = getSound("entity.parrot.imitate.creeper");
    public static final Sound ENTITY_PARROT_IMITATE_DROWNED = getSound("entity.parrot.imitate.drowned");
    public static final Sound ENTITY_PARROT_IMITATE_ELDER_GUARDIAN = getSound("entity.parrot.imitate.elder_guardian");
    public static final Sound ENTITY_PARROT_IMITATE_ENDER_DRAGON = getSound("entity.parrot.imitate.ender_dragon");
    public static final Sound ENTITY_PARROT_IMITATE_ENDERMITE = getSound("entity.parrot.imitate.endermite");
    public static final Sound ENTITY_PARROT_IMITATE_EVOKER = getSound("entity.parrot.imitate.evoker");
    public static final Sound ENTITY_PARROT_IMITATE_GHAST = getSound("entity.parrot.imitate.ghast");
    public static final Sound ENTITY_PARROT_IMITATE_GUARDIAN = getSound("entity.parrot.imitate.guardian");
    public static final Sound ENTITY_PARROT_IMITATE_HOGLIN = getSound("entity.parrot.imitate.hoglin");
    public static final Sound ENTITY_PARROT_IMITATE_HUSK = getSound("entity.parrot.imitate.husk");
    public static final Sound ENTITY_PARROT_IMITATE_ILLUSIONER = getSound("entity.parrot.imitate.illusioner");
    public static final Sound ENTITY_PARROT_IMITATE_MAGMA_CUBE = getSound("entity.parrot.imitate.magma_cube");
    public static final Sound ENTITY_PARROT_IMITATE_PHANTOM = getSound("entity.parrot.imitate.phantom");
    public static final Sound ENTITY_PARROT_IMITATE_PIGLIN = getSound("entity.parrot.imitate.piglin");
    public static final Sound ENTITY_PARROT_IMITATE_PIGLIN_BRUTE = getSound("entity.parrot.imitate.piglin_brute");
    public static final Sound ENTITY_PARROT_IMITATE_PILLAGER = getSound("entity.parrot.imitate.pillager");
    public static final Sound ENTITY_PARROT_IMITATE_RAVAGER = getSound("entity.parrot.imitate.ravager");
    public static final Sound ENTITY_PARROT_IMITATE_SHULKER = getSound("entity.parrot.imitate.shulker");
    public static final Sound ENTITY_PARROT_IMITATE_SILVERFISH = getSound("entity.parrot.imitate.silverfish");
    public static final Sound ENTITY_PARROT_IMITATE_SKELETON = getSound("entity.parrot.imitate.skeleton");
    public static final Sound ENTITY_PARROT_IMITATE_SLIME = getSound("entity.parrot.imitate.slime");
    public static final Sound ENTITY_PARROT_IMITATE_SPIDER = getSound("entity.parrot.imitate.spider");
    public static final Sound ENTITY_PARROT_IMITATE_STRAY = getSound("entity.parrot.imitate.stray");
    public static final Sound ENTITY_PARROT_IMITATE_VEX = getSound("entity.parrot.imitate.vex");
    public static final Sound ENTITY_PARROT_IMITATE_VINDICATOR = getSound("entity.parrot.imitate.vindicator");
    public static final Sound ENTITY_PARROT_IMITATE_WARDEN = getSound("entity.parrot.imitate.warden");
    public static final Sound ENTITY_PARROT_IMITATE_WITCH = getSound("entity.parrot.imitate.witch");
    public static final Sound ENTITY_PARROT_IMITATE_WITHER = getSound("entity.parrot.imitate.wither");
    public static final Sound ENTITY_PARROT_IMITATE_WITHER_SKELETON = getSound("entity.parrot.imitate.wither_skeleton");
    public static final Sound ENTITY_PARROT_IMITATE_ZOGLIN = getSound("entity.parrot.imitate.zoglin");
    public static final Sound ENTITY_PARROT_IMITATE_ZOMBIE = getSound("entity.parrot.imitate.zombie");
    public static final Sound ENTITY_PARROT_IMITATE_ZOMBIE_VILLAGER = getSound("entity.parrot.imitate.zombie_villager");
    public static final Sound ENTITY_PARROT_STEP = getSound("entity.parrot.step");
    public static final Sound ENTITY_PHANTOM_AMBIENT = getSound("entity.phantom.ambient");
    public static final Sound ENTITY_PHANTOM_BITE = getSound("entity.phantom.bite");
    public static final Sound ENTITY_PHANTOM_DEATH = getSound("entity.phantom.death");
    public static final Sound ENTITY_PHANTOM_FLAP = getSound("entity.phantom.flap");
    public static final Sound ENTITY_PHANTOM_HURT = getSound("entity.phantom.hurt");
    public static final Sound ENTITY_PHANTOM_SWOOP = getSound("entity.phantom.swoop");
    public static final Sound ENTITY_PIG_AMBIENT = getSound("entity.pig.ambient");
    public static final Sound ENTITY_PIG_DEATH = getSound("entity.pig.death");
    public static final Sound ENTITY_PIG_HURT = getSound("entity.pig.hurt");
    public static final Sound ENTITY_PIG_SADDLE = getSound("entity.pig.saddle");
    public static final Sound ENTITY_PIG_STEP = getSound("entity.pig.step");
    public static final Sound ENTITY_PIGLIN_ADMIRING_ITEM = getSound("entity.piglin.admiring_item");
    public static final Sound ENTITY_PIGLIN_AMBIENT = getSound("entity.piglin.ambient");
    public static final Sound ENTITY_PIGLIN_ANGRY = getSound("entity.piglin.angry");
    public static final Sound ENTITY_PIGLIN_CELEBRATE = getSound("entity.piglin.celebrate");
    public static final Sound ENTITY_PIGLIN_DEATH = getSound("entity.piglin.death");
    public static final Sound ENTITY_PIGLIN_JEALOUS = getSound("entity.piglin.jealous");
    public static final Sound ENTITY_PIGLIN_HURT = getSound("entity.piglin.hurt");
    public static final Sound ENTITY_PIGLIN_RETREAT = getSound("entity.piglin.retreat");
    public static final Sound ENTITY_PIGLIN_STEP = getSound("entity.piglin.step");
    public static final Sound ENTITY_PIGLIN_CONVERTED_TO_ZOMBIFIED = getSound("entity.piglin.converted_to_zombified");
    public static final Sound ENTITY_PIGLIN_BRUTE_AMBIENT = getSound("entity.piglin_brute.ambient");
    public static final Sound ENTITY_PIGLIN_BRUTE_ANGRY = getSound("entity.piglin_brute.angry");
    public static final Sound ENTITY_PIGLIN_BRUTE_DEATH = getSound("entity.piglin_brute.death");
    public static final Sound ENTITY_PIGLIN_BRUTE_HURT = getSound("entity.piglin_brute.hurt");
    public static final Sound ENTITY_PIGLIN_BRUTE_STEP = getSound("entity.piglin_brute.step");
    public static final Sound ENTITY_PIGLIN_BRUTE_CONVERTED_TO_ZOMBIFIED = getSound("entity.piglin_brute.converted_to_zombified");
    public static final Sound ENTITY_PILLAGER_AMBIENT = getSound("entity.pillager.ambient");
    public static final Sound ENTITY_PILLAGER_CELEBRATE = getSound("entity.pillager.celebrate");
    public static final Sound ENTITY_PILLAGER_DEATH = getSound("entity.pillager.death");
    public static final Sound ENTITY_PILLAGER_HURT = getSound("entity.pillager.hurt");
    public static final Sound BLOCK_PISTON_CONTRACT = getSound("block.piston.contract");
    public static final Sound BLOCK_PISTON_EXTEND = getSound("block.piston.extend");
    public static final Sound ENTITY_PLAYER_ATTACK_CRIT = getSound("entity.player.attack.crit");
    public static final Sound ENTITY_PLAYER_ATTACK_KNOCKBACK = getSound("entity.player.attack.knockback");
    public static final Sound ENTITY_PLAYER_ATTACK_NODAMAGE = getSound("entity.player.attack.nodamage");
    public static final Sound ENTITY_PLAYER_ATTACK_STRONG = getSound("entity.player.attack.strong");
    public static final Sound ENTITY_PLAYER_ATTACK_SWEEP = getSound("entity.player.attack.sweep");
    public static final Sound ENTITY_PLAYER_ATTACK_WEAK = getSound("entity.player.attack.weak");
    public static final Sound ENTITY_PLAYER_BIG_FALL = getSound("entity.player.big_fall");
    public static final Sound ENTITY_PLAYER_BREATH = getSound("entity.player.breath");
    public static final Sound ENTITY_PLAYER_BURP = getSound("entity.player.burp");
    public static final Sound ENTITY_PLAYER_DEATH = getSound("entity.player.death");
    public static final Sound ENTITY_PLAYER_HURT = getSound("entity.player.hurt");
    public static final Sound ENTITY_PLAYER_HURT_DROWN = getSound("entity.player.hurt_drown");
    public static final Sound ENTITY_PLAYER_HURT_FREEZE = getSound("entity.player.hurt_freeze");
    public static final Sound ENTITY_PLAYER_HURT_ON_FIRE = getSound("entity.player.hurt_on_fire");
    public static final Sound ENTITY_PLAYER_HURT_SWEET_BERRY_BUSH = getSound("entity.player.hurt_sweet_berry_bush");
    public static final Sound ENTITY_PLAYER_LEVELUP = getSound("entity.player.levelup");
    public static final Sound ENTITY_PLAYER_SMALL_FALL = getSound("entity.player.small_fall");
    public static final Sound ENTITY_PLAYER_SPLASH = getSound("entity.player.splash");
    public static final Sound ENTITY_PLAYER_SPLASH_HIGH_SPEED = getSound("entity.player.splash.high_speed");
    public static final Sound ENTITY_PLAYER_SWIM = getSound("entity.player.swim");
    public static final Sound ENTITY_POLAR_BEAR_AMBIENT = getSound("entity.polar_bear.ambient");
    public static final Sound ENTITY_POLAR_BEAR_AMBIENT_BABY = getSound("entity.polar_bear.ambient_baby");
    public static final Sound ENTITY_POLAR_BEAR_DEATH = getSound("entity.polar_bear.death");
    public static final Sound ENTITY_POLAR_BEAR_HURT = getSound("entity.polar_bear.hurt");
    public static final Sound ENTITY_POLAR_BEAR_STEP = getSound("entity.polar_bear.step");
    public static final Sound ENTITY_POLAR_BEAR_WARNING = getSound("entity.polar_bear.warning");
    public static final Sound BLOCK_POLISHED_DEEPSLATE_BREAK = getSound("block.polished_deepslate.break");
    public static final Sound BLOCK_POLISHED_DEEPSLATE_FALL = getSound("block.polished_deepslate.fall");
    public static final Sound BLOCK_POLISHED_DEEPSLATE_HIT = getSound("block.polished_deepslate.hit");
    public static final Sound BLOCK_POLISHED_DEEPSLATE_PLACE = getSound("block.polished_deepslate.place");
    public static final Sound BLOCK_POLISHED_DEEPSLATE_STEP = getSound("block.polished_deepslate.step");
    public static final Sound BLOCK_PORTAL_AMBIENT = getSound("block.portal.ambient");
    public static final Sound BLOCK_PORTAL_TRAVEL = getSound("block.portal.travel");
    public static final Sound BLOCK_PORTAL_TRIGGER = getSound("block.portal.trigger");
    public static final Sound BLOCK_POWDER_SNOW_BREAK = getSound("block.powder_snow.break");
    public static final Sound BLOCK_POWDER_SNOW_FALL = getSound("block.powder_snow.fall");
    public static final Sound BLOCK_POWDER_SNOW_HIT = getSound("block.powder_snow.hit");
    public static final Sound BLOCK_POWDER_SNOW_PLACE = getSound("block.powder_snow.place");
    public static final Sound BLOCK_POWDER_SNOW_STEP = getSound("block.powder_snow.step");
    public static final Sound ENTITY_PUFFER_FISH_AMBIENT = getSound("entity.puffer_fish.ambient");
    public static final Sound ENTITY_PUFFER_FISH_BLOW_OUT = getSound("entity.puffer_fish.blow_out");
    public static final Sound ENTITY_PUFFER_FISH_BLOW_UP = getSound("entity.puffer_fish.blow_up");
    public static final Sound ENTITY_PUFFER_FISH_DEATH = getSound("entity.puffer_fish.death");
    public static final Sound ENTITY_PUFFER_FISH_FLOP = getSound("entity.puffer_fish.flop");
    public static final Sound ENTITY_PUFFER_FISH_HURT = getSound("entity.puffer_fish.hurt");
    public static final Sound ENTITY_PUFFER_FISH_STING = getSound("entity.puffer_fish.sting");
    public static final Sound BLOCK_PUMPKIN_CARVE = getSound("block.pumpkin.carve");
    public static final Sound ENTITY_RABBIT_AMBIENT = getSound("entity.rabbit.ambient");
    public static final Sound ENTITY_RABBIT_ATTACK = getSound("entity.rabbit.attack");
    public static final Sound ENTITY_RABBIT_DEATH = getSound("entity.rabbit.death");
    public static final Sound ENTITY_RABBIT_HURT = getSound("entity.rabbit.hurt");
    public static final Sound ENTITY_RABBIT_JUMP = getSound("entity.rabbit.jump");
    public static final Sound EVENT_RAID_HORN = getSound("event.raid.horn");
    public static final Sound ENTITY_RAVAGER_AMBIENT = getSound("entity.ravager.ambient");
    public static final Sound ENTITY_RAVAGER_ATTACK = getSound("entity.ravager.attack");
    public static final Sound ENTITY_RAVAGER_CELEBRATE = getSound("entity.ravager.celebrate");
    public static final Sound ENTITY_RAVAGER_DEATH = getSound("entity.ravager.death");
    public static final Sound ENTITY_RAVAGER_HURT = getSound("entity.ravager.hurt");
    public static final Sound ENTITY_RAVAGER_STEP = getSound("entity.ravager.step");
    public static final Sound ENTITY_RAVAGER_STUNNED = getSound("entity.ravager.stunned");
    public static final Sound ENTITY_RAVAGER_ROAR = getSound("entity.ravager.roar");
    public static final Sound BLOCK_NETHER_GOLD_ORE_BREAK = getSound("block.nether_gold_ore.break");
    public static final Sound BLOCK_NETHER_GOLD_ORE_FALL = getSound("block.nether_gold_ore.fall");
    public static final Sound BLOCK_NETHER_GOLD_ORE_HIT = getSound("block.nether_gold_ore.hit");
    public static final Sound BLOCK_NETHER_GOLD_ORE_PLACE = getSound("block.nether_gold_ore.place");
    public static final Sound BLOCK_NETHER_GOLD_ORE_STEP = getSound("block.nether_gold_ore.step");
    public static final Sound BLOCK_NETHER_ORE_BREAK = getSound("block.nether_ore.break");
    public static final Sound BLOCK_NETHER_ORE_FALL = getSound("block.nether_ore.fall");
    public static final Sound BLOCK_NETHER_ORE_HIT = getSound("block.nether_ore.hit");
    public static final Sound BLOCK_NETHER_ORE_PLACE = getSound("block.nether_ore.place");
    public static final Sound BLOCK_NETHER_ORE_STEP = getSound("block.nether_ore.step");
    public static final Sound BLOCK_REDSTONE_TORCH_BURNOUT = getSound("block.redstone_torch.burnout");
    public static final Sound BLOCK_RESPAWN_ANCHOR_AMBIENT = getSound("block.respawn_anchor.ambient");
    public static final Sound BLOCK_RESPAWN_ANCHOR_CHARGE = getSound("block.respawn_anchor.charge");
    public static final Sound BLOCK_RESPAWN_ANCHOR_DEPLETE = getSound("block.respawn_anchor.deplete");
    public static final Sound BLOCK_RESPAWN_ANCHOR_SET_SPAWN = getSound("block.respawn_anchor.set_spawn");
    public static final Sound BLOCK_ROOTED_DIRT_BREAK = getSound("block.rooted_dirt.break");
    public static final Sound BLOCK_ROOTED_DIRT_FALL = getSound("block.rooted_dirt.fall");
    public static final Sound BLOCK_ROOTED_DIRT_HIT = getSound("block.rooted_dirt.hit");
    public static final Sound BLOCK_ROOTED_DIRT_PLACE = getSound("block.rooted_dirt.place");
    public static final Sound BLOCK_ROOTED_DIRT_STEP = getSound("block.rooted_dirt.step");
    public static final Sound ENTITY_SALMON_AMBIENT = getSound("entity.salmon.ambient");
    public static final Sound ENTITY_SALMON_DEATH = getSound("entity.salmon.death");
    public static final Sound ENTITY_SALMON_FLOP = getSound("entity.salmon.flop");
    public static final Sound ENTITY_SALMON_HURT = getSound("entity.salmon.hurt");
    public static final Sound BLOCK_SAND_BREAK = getSound("block.sand.break");
    public static final Sound BLOCK_SAND_FALL = getSound("block.sand.fall");
    public static final Sound BLOCK_SAND_HIT = getSound("block.sand.hit");
    public static final Sound BLOCK_SAND_PLACE = getSound("block.sand.place");
    public static final Sound BLOCK_SAND_STEP = getSound("block.sand.step");
    public static final Sound BLOCK_SCAFFOLDING_BREAK = getSound("block.scaffolding.break");
    public static final Sound BLOCK_SCAFFOLDING_FALL = getSound("block.scaffolding.fall");
    public static final Sound BLOCK_SCAFFOLDING_HIT = getSound("block.scaffolding.hit");
    public static final Sound BLOCK_SCAFFOLDING_PLACE = getSound("block.scaffolding.place");
    public static final Sound BLOCK_SCAFFOLDING_STEP = getSound("block.scaffolding.step");
    public static final Sound BLOCK_SCULK_SPREAD = getSound("block.sculk.spread");
    public static final Sound BLOCK_SCULK_CHARGE = getSound("block.sculk.charge");
    public static final Sound BLOCK_SCULK_BREAK = getSound("block.sculk.break");
    public static final Sound BLOCK_SCULK_FALL = getSound("block.sculk.fall");
    public static final Sound BLOCK_SCULK_HIT = getSound("block.sculk.hit");
    public static final Sound BLOCK_SCULK_PLACE = getSound("block.sculk.place");
    public static final Sound BLOCK_SCULK_STEP = getSound("block.sculk.step");
    public static final Sound BLOCK_SCULK_CATALYST_BLOOM = getSound("block.sculk_catalyst.bloom");
    public static final Sound BLOCK_SCULK_CATALYST_BREAK = getSound("block.sculk_catalyst.break");
    public static final Sound BLOCK_SCULK_CATALYST_FALL = getSound("block.sculk_catalyst.fall");
    public static final Sound BLOCK_SCULK_CATALYST_HIT = getSound("block.sculk_catalyst.hit");
    public static final Sound BLOCK_SCULK_CATALYST_PLACE = getSound("block.sculk_catalyst.place");
    public static final Sound BLOCK_SCULK_CATALYST_STEP = getSound("block.sculk_catalyst.step");
    public static final Sound BLOCK_SCULK_SENSOR_CLICKING = getSound("block.sculk_sensor.clicking");
    public static final Sound BLOCK_SCULK_SENSOR_CLICKING_STOP = getSound("block.sculk_sensor.clicking_stop");
    public static final Sound BLOCK_SCULK_SENSOR_BREAK = getSound("block.sculk_sensor.break");
    public static final Sound BLOCK_SCULK_SENSOR_FALL = getSound("block.sculk_sensor.fall");
    public static final Sound BLOCK_SCULK_SENSOR_HIT = getSound("block.sculk_sensor.hit");
    public static final Sound BLOCK_SCULK_SENSOR_PLACE = getSound("block.sculk_sensor.place");
    public static final Sound BLOCK_SCULK_SENSOR_STEP = getSound("block.sculk_sensor.step");
    public static final Sound BLOCK_SCULK_SHRIEKER_BREAK = getSound("block.sculk_shrieker.break");
    public static final Sound BLOCK_SCULK_SHRIEKER_FALL = getSound("block.sculk_shrieker.fall");
    public static final Sound BLOCK_SCULK_SHRIEKER_HIT = getSound("block.sculk_shrieker.hit");
    public static final Sound BLOCK_SCULK_SHRIEKER_PLACE = getSound("block.sculk_shrieker.place");
    public static final Sound BLOCK_SCULK_SHRIEKER_SHRIEK = getSound("block.sculk_shrieker.shriek");
    public static final Sound BLOCK_SCULK_SHRIEKER_STEP = getSound("block.sculk_shrieker.step");
    public static final Sound BLOCK_SCULK_VEIN_BREAK = getSound("block.sculk_vein.break");
    public static final Sound BLOCK_SCULK_VEIN_FALL = getSound("block.sculk_vein.fall");
    public static final Sound BLOCK_SCULK_VEIN_HIT = getSound("block.sculk_vein.hit");
    public static final Sound BLOCK_SCULK_VEIN_PLACE = getSound("block.sculk_vein.place");
    public static final Sound BLOCK_SCULK_VEIN_STEP = getSound("block.sculk_vein.step");
    public static final Sound ENTITY_SHEEP_AMBIENT = getSound("entity.sheep.ambient");
    public static final Sound ENTITY_SHEEP_DEATH = getSound("entity.sheep.death");
    public static final Sound ENTITY_SHEEP_HURT = getSound("entity.sheep.hurt");
    public static final Sound ENTITY_SHEEP_SHEAR = getSound("entity.sheep.shear");
    public static final Sound ENTITY_SHEEP_STEP = getSound("entity.sheep.step");
    public static final Sound ITEM_SHIELD_BLOCK = getSound("item.shield.block");
    public static final Sound ITEM_SHIELD_BREAK = getSound("item.shield.break");
    public static final Sound BLOCK_SHROOMLIGHT_BREAK = getSound("block.shroomlight.break");
    public static final Sound BLOCK_SHROOMLIGHT_STEP = getSound("block.shroomlight.step");
    public static final Sound BLOCK_SHROOMLIGHT_PLACE = getSound("block.shroomlight.place");
    public static final Sound BLOCK_SHROOMLIGHT_HIT = getSound("block.shroomlight.hit");
    public static final Sound BLOCK_SHROOMLIGHT_FALL = getSound("block.shroomlight.fall");
    public static final Sound ITEM_SHOVEL_FLATTEN = getSound("item.shovel.flatten");
    public static final Sound ENTITY_SHULKER_AMBIENT = getSound("entity.shulker.ambient");
    public static final Sound BLOCK_SHULKER_BOX_CLOSE = getSound("block.shulker_box.close");
    public static final Sound BLOCK_SHULKER_BOX_OPEN = getSound("block.shulker_box.open");
    public static final Sound ENTITY_SHULKER_BULLET_HIT = getSound("entity.shulker_bullet.hit");
    public static final Sound ENTITY_SHULKER_BULLET_HURT = getSound("entity.shulker_bullet.hurt");
    public static final Sound ENTITY_SHULKER_CLOSE = getSound("entity.shulker.close");
    public static final Sound ENTITY_SHULKER_DEATH = getSound("entity.shulker.death");
    public static final Sound ENTITY_SHULKER_HURT = getSound("entity.shulker.hurt");
    public static final Sound ENTITY_SHULKER_HURT_CLOSED = getSound("entity.shulker.hurt_closed");
    public static final Sound ENTITY_SHULKER_OPEN = getSound("entity.shulker.open");
    public static final Sound ENTITY_SHULKER_SHOOT = getSound("entity.shulker.shoot");
    public static final Sound ENTITY_SHULKER_TELEPORT = getSound("entity.shulker.teleport");
    public static final Sound ENTITY_SILVERFISH_AMBIENT = getSound("entity.silverfish.ambient");
    public static final Sound ENTITY_SILVERFISH_DEATH = getSound("entity.silverfish.death");
    public static final Sound ENTITY_SILVERFISH_HURT = getSound("entity.silverfish.hurt");
    public static final Sound ENTITY_SILVERFISH_STEP = getSound("entity.silverfish.step");
    public static final Sound ENTITY_SKELETON_AMBIENT = getSound("entity.skeleton.ambient");
    public static final Sound ENTITY_SKELETON_CONVERTED_TO_STRAY = getSound("entity.skeleton.converted_to_stray");
    public static final Sound ENTITY_SKELETON_DEATH = getSound("entity.skeleton.death");
    public static final Sound ENTITY_SKELETON_HORSE_AMBIENT = getSound("entity.skeleton_horse.ambient");
    public static final Sound ENTITY_SKELETON_HORSE_DEATH = getSound("entity.skeleton_horse.death");
    public static final Sound ENTITY_SKELETON_HORSE_HURT = getSound("entity.skeleton_horse.hurt");
    public static final Sound ENTITY_SKELETON_HORSE_SWIM = getSound("entity.skeleton_horse.swim");
    public static final Sound ENTITY_SKELETON_HORSE_AMBIENT_WATER = getSound("entity.skeleton_horse.ambient_water");
    public static final Sound ENTITY_SKELETON_HORSE_GALLOP_WATER = getSound("entity.skeleton_horse.gallop_water");
    public static final Sound ENTITY_SKELETON_HORSE_JUMP_WATER = getSound("entity.skeleton_horse.jump_water");
    public static final Sound ENTITY_SKELETON_HORSE_STEP_WATER = getSound("entity.skeleton_horse.step_water");
    public static final Sound ENTITY_SKELETON_HURT = getSound("entity.skeleton.hurt");
    public static final Sound ENTITY_SKELETON_SHOOT = getSound("entity.skeleton.shoot");
    public static final Sound ENTITY_SKELETON_STEP = getSound("entity.skeleton.step");
    public static final Sound ENTITY_SLIME_ATTACK = getSound("entity.slime.attack");
    public static final Sound ENTITY_SLIME_DEATH = getSound("entity.slime.death");
    public static final Sound ENTITY_SLIME_HURT = getSound("entity.slime.hurt");
    public static final Sound ENTITY_SLIME_JUMP = getSound("entity.slime.jump");
    public static final Sound ENTITY_SLIME_SQUISH = getSound("entity.slime.squish");
    public static final Sound BLOCK_SLIME_BLOCK_BREAK = getSound("block.slime_block.break");
    public static final Sound BLOCK_SLIME_BLOCK_FALL = getSound("block.slime_block.fall");
    public static final Sound BLOCK_SLIME_BLOCK_HIT = getSound("block.slime_block.hit");
    public static final Sound BLOCK_SLIME_BLOCK_PLACE = getSound("block.slime_block.place");
    public static final Sound BLOCK_SLIME_BLOCK_STEP = getSound("block.slime_block.step");
    public static final Sound BLOCK_SMALL_AMETHYST_BUD_BREAK = getSound("block.small_amethyst_bud.break");
    public static final Sound BLOCK_SMALL_AMETHYST_BUD_PLACE = getSound("block.small_amethyst_bud.place");
    public static final Sound BLOCK_SMALL_DRIPLEAF_BREAK = getSound("block.small_dripleaf.break");
    public static final Sound BLOCK_SMALL_DRIPLEAF_FALL = getSound("block.small_dripleaf.fall");
    public static final Sound BLOCK_SMALL_DRIPLEAF_HIT = getSound("block.small_dripleaf.hit");
    public static final Sound BLOCK_SMALL_DRIPLEAF_PLACE = getSound("block.small_dripleaf.place");
    public static final Sound BLOCK_SMALL_DRIPLEAF_STEP = getSound("block.small_dripleaf.step");
    public static final Sound BLOCK_SOUL_SAND_BREAK = getSound("block.soul_sand.break");
    public static final Sound BLOCK_SOUL_SAND_STEP = getSound("block.soul_sand.step");
    public static final Sound BLOCK_SOUL_SAND_PLACE = getSound("block.soul_sand.place");
    public static final Sound BLOCK_SOUL_SAND_HIT = getSound("block.soul_sand.hit");
    public static final Sound BLOCK_SOUL_SAND_FALL = getSound("block.soul_sand.fall");
    public static final Sound BLOCK_SOUL_SOIL_BREAK = getSound("block.soul_soil.break");
    public static final Sound BLOCK_SOUL_SOIL_STEP = getSound("block.soul_soil.step");
    public static final Sound BLOCK_SOUL_SOIL_PLACE = getSound("block.soul_soil.place");
    public static final Sound BLOCK_SOUL_SOIL_HIT = getSound("block.soul_soil.hit");
    public static final Sound BLOCK_SOUL_SOIL_FALL = getSound("block.soul_soil.fall");
    public static final Sound PARTICLE_SOUL_ESCAPE = getSound("particle.soul_escape");
    public static final Sound BLOCK_SPORE_BLOSSOM_BREAK = getSound("block.spore_blossom.break");
    public static final Sound BLOCK_SPORE_BLOSSOM_FALL = getSound("block.spore_blossom.fall");
    public static final Sound BLOCK_SPORE_BLOSSOM_HIT = getSound("block.spore_blossom.hit");
    public static final Sound BLOCK_SPORE_BLOSSOM_PLACE = getSound("block.spore_blossom.place");
    public static final Sound BLOCK_SPORE_BLOSSOM_STEP = getSound("block.spore_blossom.step");
    public static final Sound ENTITY_STRIDER_AMBIENT = getSound("entity.strider.ambient");
    public static final Sound ENTITY_STRIDER_HAPPY = getSound("entity.strider.happy");
    public static final Sound ENTITY_STRIDER_RETREAT = getSound("entity.strider.retreat");
    public static final Sound ENTITY_STRIDER_DEATH = getSound("entity.strider.death");
    public static final Sound ENTITY_STRIDER_HURT = getSound("entity.strider.hurt");
    public static final Sound ENTITY_STRIDER_STEP = getSound("entity.strider.step");
    public static final Sound ENTITY_STRIDER_STEP_LAVA = getSound("entity.strider.step_lava");
    public static final Sound ENTITY_STRIDER_EAT = getSound("entity.strider.eat");
    public static final Sound ENTITY_STRIDER_SADDLE = getSound("entity.strider.saddle");
    public static final Sound ENTITY_SLIME_DEATH_SMALL = getSound("entity.slime.death_small");
    public static final Sound ENTITY_SLIME_HURT_SMALL = getSound("entity.slime.hurt_small");
    public static final Sound ENTITY_SLIME_JUMP_SMALL = getSound("entity.slime.jump_small");
    public static final Sound ENTITY_SLIME_SQUISH_SMALL = getSound("entity.slime.squish_small");
    public static final Sound BLOCK_SMITHING_TABLE_USE = getSound("block.smithing_table.use");
    public static final Sound BLOCK_SMOKER_SMOKE = getSound("block.smoker.smoke");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_STEP = getSound("entity.sniffer.step");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_EAT = getSound("entity.sniffer.eat");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_IDLE = getSound("entity.sniffer.idle");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_HURT = getSound("entity.sniffer.hurt");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_DEATH = getSound("entity.sniffer.death");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_DROP_SEED = getSound("entity.sniffer.drop_seed");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_SCENTING = getSound("entity.sniffer.scenting");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_SNIFFING = getSound("entity.sniffer.sniffing");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_SEARCHING = getSound("entity.sniffer.searching");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_DIGGING = getSound("entity.sniffer.digging");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_DIGGING_STOP = getSound("entity.sniffer.digging_stop");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final Sound ENTITY_SNIFFER_HAPPY = getSound("entity.sniffer.happy");
    public static final Sound ENTITY_SNOWBALL_THROW = getSound("entity.snowball.throw");
    public static final Sound BLOCK_SNOW_BREAK = getSound("block.snow.break");
    public static final Sound BLOCK_SNOW_FALL = getSound("block.snow.fall");
    public static final Sound ENTITY_SNOW_GOLEM_AMBIENT = getSound("entity.snow_golem.ambient");
    public static final Sound ENTITY_SNOW_GOLEM_DEATH = getSound("entity.snow_golem.death");
    public static final Sound ENTITY_SNOW_GOLEM_HURT = getSound("entity.snow_golem.hurt");
    public static final Sound ENTITY_SNOW_GOLEM_SHOOT = getSound("entity.snow_golem.shoot");
    public static final Sound ENTITY_SNOW_GOLEM_SHEAR = getSound("entity.snow_golem.shear");
    public static final Sound BLOCK_SNOW_HIT = getSound("block.snow.hit");
    public static final Sound BLOCK_SNOW_PLACE = getSound("block.snow.place");
    public static final Sound BLOCK_SNOW_STEP = getSound("block.snow.step");
    public static final Sound ENTITY_SPIDER_AMBIENT = getSound("entity.spider.ambient");
    public static final Sound ENTITY_SPIDER_DEATH = getSound("entity.spider.death");
    public static final Sound ENTITY_SPIDER_HURT = getSound("entity.spider.hurt");
    public static final Sound ENTITY_SPIDER_STEP = getSound("entity.spider.step");
    public static final Sound ENTITY_SPLASH_POTION_BREAK = getSound("entity.splash_potion.break");
    public static final Sound ENTITY_SPLASH_POTION_THROW = getSound("entity.splash_potion.throw");
    public static final Sound ITEM_SPYGLASS_USE = getSound("item.spyglass.use");
    public static final Sound ITEM_SPYGLASS_STOP_USING = getSound("item.spyglass.stop_using");
    public static final Sound ENTITY_SQUID_AMBIENT = getSound("entity.squid.ambient");
    public static final Sound ENTITY_SQUID_DEATH = getSound("entity.squid.death");
    public static final Sound ENTITY_SQUID_HURT = getSound("entity.squid.hurt");
    public static final Sound ENTITY_SQUID_SQUIRT = getSound("entity.squid.squirt");
    public static final Sound BLOCK_STONE_BREAK = getSound("block.stone.break");
    public static final Sound BLOCK_STONE_BUTTON_CLICK_OFF = getSound("block.stone_button.click_off");
    public static final Sound BLOCK_STONE_BUTTON_CLICK_ON = getSound("block.stone_button.click_on");
    public static final Sound BLOCK_STONE_FALL = getSound("block.stone.fall");
    public static final Sound BLOCK_STONE_HIT = getSound("block.stone.hit");
    public static final Sound BLOCK_STONE_PLACE = getSound("block.stone.place");
    public static final Sound BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF = getSound("block.stone_pressure_plate.click_off");
    public static final Sound BLOCK_STONE_PRESSURE_PLATE_CLICK_ON = getSound("block.stone_pressure_plate.click_on");
    public static final Sound BLOCK_STONE_STEP = getSound("block.stone.step");
    public static final Sound ENTITY_STRAY_AMBIENT = getSound("entity.stray.ambient");
    public static final Sound ENTITY_STRAY_DEATH = getSound("entity.stray.death");
    public static final Sound ENTITY_STRAY_HURT = getSound("entity.stray.hurt");
    public static final Sound ENTITY_STRAY_STEP = getSound("entity.stray.step");
    public static final Sound BLOCK_SWEET_BERRY_BUSH_BREAK = getSound("block.sweet_berry_bush.break");
    public static final Sound BLOCK_SWEET_BERRY_BUSH_PLACE = getSound("block.sweet_berry_bush.place");
    public static final Sound BLOCK_SWEET_BERRY_BUSH_PICK_BERRIES = getSound("block.sweet_berry_bush.pick_berries");
    public static final Sound ENTITY_TADPOLE_DEATH = getSound("entity.tadpole.death");
    public static final Sound ENTITY_TADPOLE_FLOP = getSound("entity.tadpole.flop");
    public static final Sound ENTITY_TADPOLE_GROW_UP = getSound("entity.tadpole.grow_up");
    public static final Sound ENTITY_TADPOLE_HURT = getSound("entity.tadpole.hurt");
    public static final Sound ENCHANT_THORNS_HIT = getSound("enchant.thorns.hit");
    public static final Sound ENTITY_TNT_PRIMED = getSound("entity.tnt.primed");
    public static final Sound ITEM_TOTEM_USE = getSound("item.totem.use");
    public static final Sound ITEM_TRIDENT_HIT = getSound("item.trident.hit");
    public static final Sound ITEM_TRIDENT_HIT_GROUND = getSound("item.trident.hit_ground");
    public static final Sound ITEM_TRIDENT_RETURN = getSound("item.trident.return");
    public static final Sound ITEM_TRIDENT_RIPTIDE_1 = getSound("item.trident.riptide_1");
    public static final Sound ITEM_TRIDENT_RIPTIDE_2 = getSound("item.trident.riptide_2");
    public static final Sound ITEM_TRIDENT_RIPTIDE_3 = getSound("item.trident.riptide_3");
    public static final Sound ITEM_TRIDENT_THROW = getSound("item.trident.throw");
    public static final Sound ITEM_TRIDENT_THUNDER = getSound("item.trident.thunder");
    public static final Sound BLOCK_TRIPWIRE_ATTACH = getSound("block.tripwire.attach");
    public static final Sound BLOCK_TRIPWIRE_CLICK_OFF = getSound("block.tripwire.click_off");
    public static final Sound BLOCK_TRIPWIRE_CLICK_ON = getSound("block.tripwire.click_on");
    public static final Sound BLOCK_TRIPWIRE_DETACH = getSound("block.tripwire.detach");
    public static final Sound ENTITY_TROPICAL_FISH_AMBIENT = getSound("entity.tropical_fish.ambient");
    public static final Sound ENTITY_TROPICAL_FISH_DEATH = getSound("entity.tropical_fish.death");
    public static final Sound ENTITY_TROPICAL_FISH_FLOP = getSound("entity.tropical_fish.flop");
    public static final Sound ENTITY_TROPICAL_FISH_HURT = getSound("entity.tropical_fish.hurt");
    public static final Sound BLOCK_TUFF_BREAK = getSound("block.tuff.break");
    public static final Sound BLOCK_TUFF_STEP = getSound("block.tuff.step");
    public static final Sound BLOCK_TUFF_PLACE = getSound("block.tuff.place");
    public static final Sound BLOCK_TUFF_HIT = getSound("block.tuff.hit");
    public static final Sound BLOCK_TUFF_FALL = getSound("block.tuff.fall");
    public static final Sound ENTITY_TURTLE_AMBIENT_LAND = getSound("entity.turtle.ambient_land");
    public static final Sound ENTITY_TURTLE_DEATH = getSound("entity.turtle.death");
    public static final Sound ENTITY_TURTLE_DEATH_BABY = getSound("entity.turtle.death_baby");
    public static final Sound ENTITY_TURTLE_EGG_BREAK = getSound("entity.turtle.egg_break");
    public static final Sound ENTITY_TURTLE_EGG_CRACK = getSound("entity.turtle.egg_crack");
    public static final Sound ENTITY_TURTLE_EGG_HATCH = getSound("entity.turtle.egg_hatch");
    public static final Sound ENTITY_TURTLE_HURT = getSound("entity.turtle.hurt");
    public static final Sound ENTITY_TURTLE_HURT_BABY = getSound("entity.turtle.hurt_baby");
    public static final Sound ENTITY_TURTLE_LAY_EGG = getSound("entity.turtle.lay_egg");
    public static final Sound ENTITY_TURTLE_SHAMBLE = getSound("entity.turtle.shamble");
    public static final Sound ENTITY_TURTLE_SHAMBLE_BABY = getSound("entity.turtle.shamble_baby");
    public static final Sound ENTITY_TURTLE_SWIM = getSound("entity.turtle.swim");
    public static final Sound UI_BUTTON_CLICK = getSound("ui.button.click");
    public static final Sound UI_LOOM_SELECT_PATTERN = getSound("ui.loom.select_pattern");
    public static final Sound UI_LOOM_TAKE_RESULT = getSound("ui.loom.take_result");
    public static final Sound UI_CARTOGRAPHY_TABLE_TAKE_RESULT = getSound("ui.cartography_table.take_result");
    public static final Sound UI_STONECUTTER_TAKE_RESULT = getSound("ui.stonecutter.take_result");
    public static final Sound UI_STONECUTTER_SELECT_RECIPE = getSound("ui.stonecutter.select_recipe");
    public static final Sound UI_TOAST_CHALLENGE_COMPLETE = getSound("ui.toast.challenge_complete");
    public static final Sound UI_TOAST_IN = getSound("ui.toast.in");
    public static final Sound UI_TOAST_OUT = getSound("ui.toast.out");
    public static final Sound ENTITY_VEX_AMBIENT = getSound("entity.vex.ambient");
    public static final Sound ENTITY_VEX_CHARGE = getSound("entity.vex.charge");
    public static final Sound ENTITY_VEX_DEATH = getSound("entity.vex.death");
    public static final Sound ENTITY_VEX_HURT = getSound("entity.vex.hurt");
    public static final Sound ENTITY_VILLAGER_AMBIENT = getSound("entity.villager.ambient");
    public static final Sound ENTITY_VILLAGER_CELEBRATE = getSound("entity.villager.celebrate");
    public static final Sound ENTITY_VILLAGER_DEATH = getSound("entity.villager.death");
    public static final Sound ENTITY_VILLAGER_HURT = getSound("entity.villager.hurt");
    public static final Sound ENTITY_VILLAGER_NO = getSound("entity.villager.no");
    public static final Sound ENTITY_VILLAGER_TRADE = getSound("entity.villager.trade");
    public static final Sound ENTITY_VILLAGER_YES = getSound("entity.villager.yes");
    public static final Sound ENTITY_VILLAGER_WORK_ARMORER = getSound("entity.villager.work_armorer");
    public static final Sound ENTITY_VILLAGER_WORK_BUTCHER = getSound("entity.villager.work_butcher");
    public static final Sound ENTITY_VILLAGER_WORK_CARTOGRAPHER = getSound("entity.villager.work_cartographer");
    public static final Sound ENTITY_VILLAGER_WORK_CLERIC = getSound("entity.villager.work_cleric");
    public static final Sound ENTITY_VILLAGER_WORK_FARMER = getSound("entity.villager.work_farmer");
    public static final Sound ENTITY_VILLAGER_WORK_FISHERMAN = getSound("entity.villager.work_fisherman");
    public static final Sound ENTITY_VILLAGER_WORK_FLETCHER = getSound("entity.villager.work_fletcher");
    public static final Sound ENTITY_VILLAGER_WORK_LEATHERWORKER = getSound("entity.villager.work_leatherworker");
    public static final Sound ENTITY_VILLAGER_WORK_LIBRARIAN = getSound("entity.villager.work_librarian");
    public static final Sound ENTITY_VILLAGER_WORK_MASON = getSound("entity.villager.work_mason");
    public static final Sound ENTITY_VILLAGER_WORK_SHEPHERD = getSound("entity.villager.work_shepherd");
    public static final Sound ENTITY_VILLAGER_WORK_TOOLSMITH = getSound("entity.villager.work_toolsmith");
    public static final Sound ENTITY_VILLAGER_WORK_WEAPONSMITH = getSound("entity.villager.work_weaponsmith");
    public static final Sound ENTITY_VINDICATOR_AMBIENT = getSound("entity.vindicator.ambient");
    public static final Sound ENTITY_VINDICATOR_CELEBRATE = getSound("entity.vindicator.celebrate");
    public static final Sound ENTITY_VINDICATOR_DEATH = getSound("entity.vindicator.death");
    public static final Sound ENTITY_VINDICATOR_HURT = getSound("entity.vindicator.hurt");
    public static final Sound BLOCK_VINE_BREAK = getSound("block.vine.break");
    public static final Sound BLOCK_VINE_FALL = getSound("block.vine.fall");
    public static final Sound BLOCK_VINE_HIT = getSound("block.vine.hit");
    public static final Sound BLOCK_VINE_PLACE = getSound("block.vine.place");
    public static final Sound BLOCK_VINE_STEP = getSound("block.vine.step");
    public static final Sound BLOCK_LILY_PAD_PLACE = getSound("block.lily_pad.place");
    public static final Sound ENTITY_WANDERING_TRADER_AMBIENT = getSound("entity.wandering_trader.ambient");
    public static final Sound ENTITY_WANDERING_TRADER_DEATH = getSound("entity.wandering_trader.death");
    public static final Sound ENTITY_WANDERING_TRADER_DISAPPEARED = getSound("entity.wandering_trader.disappeared");
    public static final Sound ENTITY_WANDERING_TRADER_DRINK_MILK = getSound("entity.wandering_trader.drink_milk");
    public static final Sound ENTITY_WANDERING_TRADER_DRINK_POTION = getSound("entity.wandering_trader.drink_potion");
    public static final Sound ENTITY_WANDERING_TRADER_HURT = getSound("entity.wandering_trader.hurt");
    public static final Sound ENTITY_WANDERING_TRADER_NO = getSound("entity.wandering_trader.no");
    public static final Sound ENTITY_WANDERING_TRADER_REAPPEARED = getSound("entity.wandering_trader.reappeared");
    public static final Sound ENTITY_WANDERING_TRADER_TRADE = getSound("entity.wandering_trader.trade");
    public static final Sound ENTITY_WANDERING_TRADER_YES = getSound("entity.wandering_trader.yes");
    public static final Sound ENTITY_WARDEN_AGITATED = getSound("entity.warden.agitated");
    public static final Sound ENTITY_WARDEN_AMBIENT = getSound("entity.warden.ambient");
    public static final Sound ENTITY_WARDEN_ANGRY = getSound("entity.warden.angry");
    public static final Sound ENTITY_WARDEN_ATTACK_IMPACT = getSound("entity.warden.attack_impact");
    public static final Sound ENTITY_WARDEN_DEATH = getSound("entity.warden.death");
    public static final Sound ENTITY_WARDEN_DIG = getSound("entity.warden.dig");
    public static final Sound ENTITY_WARDEN_EMERGE = getSound("entity.warden.emerge");
    public static final Sound ENTITY_WARDEN_HEARTBEAT = getSound("entity.warden.heartbeat");
    public static final Sound ENTITY_WARDEN_HURT = getSound("entity.warden.hurt");
    public static final Sound ENTITY_WARDEN_LISTENING = getSound("entity.warden.listening");
    public static final Sound ENTITY_WARDEN_LISTENING_ANGRY = getSound("entity.warden.listening_angry");
    public static final Sound ENTITY_WARDEN_NEARBY_CLOSE = getSound("entity.warden.nearby_close");
    public static final Sound ENTITY_WARDEN_NEARBY_CLOSER = getSound("entity.warden.nearby_closer");
    public static final Sound ENTITY_WARDEN_NEARBY_CLOSEST = getSound("entity.warden.nearby_closest");
    public static final Sound ENTITY_WARDEN_ROAR = getSound("entity.warden.roar");
    public static final Sound ENTITY_WARDEN_SNIFF = getSound("entity.warden.sniff");
    public static final Sound ENTITY_WARDEN_SONIC_BOOM = getSound("entity.warden.sonic_boom");
    public static final Sound ENTITY_WARDEN_SONIC_CHARGE = getSound("entity.warden.sonic_charge");
    public static final Sound ENTITY_WARDEN_STEP = getSound("entity.warden.step");
    public static final Sound ENTITY_WARDEN_TENDRIL_CLICKS = getSound("entity.warden.tendril_clicks");
    public static final Sound BLOCK_WATER_AMBIENT = getSound("block.water.ambient");
    public static final Sound WEATHER_RAIN = getSound("weather.rain");
    public static final Sound WEATHER_RAIN_ABOVE = getSound("weather.rain.above");
    public static final Sound BLOCK_WET_GRASS_BREAK = getSound("block.wet_grass.break");
    public static final Sound BLOCK_WET_GRASS_FALL = getSound("block.wet_grass.fall");
    public static final Sound BLOCK_WET_GRASS_HIT = getSound("block.wet_grass.hit");
    public static final Sound BLOCK_WET_GRASS_PLACE = getSound("block.wet_grass.place");
    public static final Sound BLOCK_WET_GRASS_STEP = getSound("block.wet_grass.step");
    public static final Sound ENTITY_WITCH_AMBIENT = getSound("entity.witch.ambient");
    public static final Sound ENTITY_WITCH_CELEBRATE = getSound("entity.witch.celebrate");
    public static final Sound ENTITY_WITCH_DEATH = getSound("entity.witch.death");
    public static final Sound ENTITY_WITCH_DRINK = getSound("entity.witch.drink");
    public static final Sound ENTITY_WITCH_HURT = getSound("entity.witch.hurt");
    public static final Sound ENTITY_WITCH_THROW = getSound("entity.witch.throw");
    public static final Sound ENTITY_WITHER_AMBIENT = getSound("entity.wither.ambient");
    public static final Sound ENTITY_WITHER_BREAK_BLOCK = getSound("entity.wither.break_block");
    public static final Sound ENTITY_WITHER_DEATH = getSound("entity.wither.death");
    public static final Sound ENTITY_WITHER_HURT = getSound("entity.wither.hurt");
    public static final Sound ENTITY_WITHER_SHOOT = getSound("entity.wither.shoot");
    public static final Sound ENTITY_WITHER_SKELETON_AMBIENT = getSound("entity.wither_skeleton.ambient");
    public static final Sound ENTITY_WITHER_SKELETON_DEATH = getSound("entity.wither_skeleton.death");
    public static final Sound ENTITY_WITHER_SKELETON_HURT = getSound("entity.wither_skeleton.hurt");
    public static final Sound ENTITY_WITHER_SKELETON_STEP = getSound("entity.wither_skeleton.step");
    public static final Sound ENTITY_WITHER_SPAWN = getSound("entity.wither.spawn");
    public static final Sound ENTITY_WOLF_AMBIENT = getSound("entity.wolf.ambient");
    public static final Sound ENTITY_WOLF_DEATH = getSound("entity.wolf.death");
    public static final Sound ENTITY_WOLF_GROWL = getSound("entity.wolf.growl");
    public static final Sound ENTITY_WOLF_HOWL = getSound("entity.wolf.howl");
    public static final Sound ENTITY_WOLF_HURT = getSound("entity.wolf.hurt");
    public static final Sound ENTITY_WOLF_PANT = getSound("entity.wolf.pant");
    public static final Sound ENTITY_WOLF_SHAKE = getSound("entity.wolf.shake");
    public static final Sound ENTITY_WOLF_STEP = getSound("entity.wolf.step");
    public static final Sound ENTITY_WOLF_WHINE = getSound("entity.wolf.whine");
    public static final Sound BLOCK_WOODEN_DOOR_CLOSE = getSound("block.wooden_door.close");
    public static final Sound BLOCK_WOODEN_DOOR_OPEN = getSound("block.wooden_door.open");
    public static final Sound BLOCK_WOODEN_TRAPDOOR_CLOSE = getSound("block.wooden_trapdoor.close");
    public static final Sound BLOCK_WOODEN_TRAPDOOR_OPEN = getSound("block.wooden_trapdoor.open");
    public static final Sound BLOCK_WOODEN_BUTTON_CLICK_OFF = getSound("block.wooden_button.click_off");
    public static final Sound BLOCK_WOODEN_BUTTON_CLICK_ON = getSound("block.wooden_button.click_on");
    public static final Sound BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF = getSound("block.wooden_pressure_plate.click_off");
    public static final Sound BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON = getSound("block.wooden_pressure_plate.click_on");
    public static final Sound BLOCK_WOOD_BREAK = getSound("block.wood.break");
    public static final Sound BLOCK_WOOD_FALL = getSound("block.wood.fall");
    public static final Sound BLOCK_WOOD_HIT = getSound("block.wood.hit");
    public static final Sound BLOCK_WOOD_PLACE = getSound("block.wood.place");
    public static final Sound BLOCK_WOOD_STEP = getSound("block.wood.step");
    public static final Sound BLOCK_WOOL_BREAK = getSound("block.wool.break");
    public static final Sound BLOCK_WOOL_FALL = getSound("block.wool.fall");
    public static final Sound BLOCK_WOOL_HIT = getSound("block.wool.hit");
    public static final Sound BLOCK_WOOL_PLACE = getSound("block.wool.place");
    public static final Sound BLOCK_WOOL_STEP = getSound("block.wool.step");
    public static final Sound ENTITY_ZOGLIN_AMBIENT = getSound("entity.zoglin.ambient");
    public static final Sound ENTITY_ZOGLIN_ANGRY = getSound("entity.zoglin.angry");
    public static final Sound ENTITY_ZOGLIN_ATTACK = getSound("entity.zoglin.attack");
    public static final Sound ENTITY_ZOGLIN_DEATH = getSound("entity.zoglin.death");
    public static final Sound ENTITY_ZOGLIN_HURT = getSound("entity.zoglin.hurt");
    public static final Sound ENTITY_ZOGLIN_STEP = getSound("entity.zoglin.step");
    public static final Sound ENTITY_ZOMBIE_AMBIENT = getSound("entity.zombie.ambient");
    public static final Sound ENTITY_ZOMBIE_ATTACK_WOODEN_DOOR = getSound("entity.zombie.attack_wooden_door");
    public static final Sound ENTITY_ZOMBIE_ATTACK_IRON_DOOR = getSound("entity.zombie.attack_iron_door");
    public static final Sound ENTITY_ZOMBIE_BREAK_WOODEN_DOOR = getSound("entity.zombie.break_wooden_door");
    public static final Sound ENTITY_ZOMBIE_CONVERTED_TO_DROWNED = getSound("entity.zombie.converted_to_drowned");
    public static final Sound ENTITY_ZOMBIE_DEATH = getSound("entity.zombie.death");
    public static final Sound ENTITY_ZOMBIE_DESTROY_EGG = getSound("entity.zombie.destroy_egg");
    public static final Sound ENTITY_ZOMBIE_HORSE_AMBIENT = getSound("entity.zombie_horse.ambient");
    public static final Sound ENTITY_ZOMBIE_HORSE_DEATH = getSound("entity.zombie_horse.death");
    public static final Sound ENTITY_ZOMBIE_HORSE_HURT = getSound("entity.zombie_horse.hurt");
    public static final Sound ENTITY_ZOMBIE_HURT = getSound("entity.zombie.hurt");
    public static final Sound ENTITY_ZOMBIE_INFECT = getSound("entity.zombie.infect");
    public static final Sound ENTITY_ZOMBIFIED_PIGLIN_AMBIENT = getSound("entity.zombified_piglin.ambient");
    public static final Sound ENTITY_ZOMBIFIED_PIGLIN_ANGRY = getSound("entity.zombified_piglin.angry");
    public static final Sound ENTITY_ZOMBIFIED_PIGLIN_DEATH = getSound("entity.zombified_piglin.death");
    public static final Sound ENTITY_ZOMBIFIED_PIGLIN_HURT = getSound("entity.zombified_piglin.hurt");
    public static final Sound ENTITY_ZOMBIE_STEP = getSound("entity.zombie.step");
    public static final Sound ENTITY_ZOMBIE_VILLAGER_AMBIENT = getSound("entity.zombie_villager.ambient");
    public static final Sound ENTITY_ZOMBIE_VILLAGER_CONVERTED = getSound("entity.zombie_villager.converted");
    public static final Sound ENTITY_ZOMBIE_VILLAGER_CURE = getSound("entity.zombie_villager.cure");
    public static final Sound ENTITY_ZOMBIE_VILLAGER_DEATH = getSound("entity.zombie_villager.death");
    public static final Sound ENTITY_ZOMBIE_VILLAGER_HURT = getSound("entity.zombie_villager.hurt");
    public static final Sound ENTITY_ZOMBIE_VILLAGER_STEP = getSound("entity.zombie_villager.step");

    private static Sound getSound(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        Sound sound = Registry.SOUNDS.get(namespacedKey);
        Preconditions.checkNotNull(sound, "No sound found for %s. This is a bug.", namespacedKey);
        return sound;
    }

    /**
     * @param name of the sound.
     * @return the sound with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static Sound valueOf(@NotNull String name) {
        Sound sound = Registry.SOUNDS.get(NamespacedKey.fromString(name.toLowerCase()));
        if (sound != null) {
            return sound;
        }

        // Sound keys can have dots in them which where converted to _. Since converting
        // the _ back to a dot would be to complex (since not all _ need to be converted back) we use the field name.
        try {
            sound = (Sound) Sound.class.getField(name).get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            sound = null;
        }

        Preconditions.checkArgument(sound != null, "No sound found with the name %s", name);
        return sound;
    }

    /**
     * @return an array of all known sounds.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static Sound[] values() {
        return Lists.newArrayList(Registry.SOUNDS).toArray(new Sound[0]);
    }
}
