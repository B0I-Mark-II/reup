package org.bukkit.entity;

import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Lists;
import org.bukkit.Keyed;
import org.bukkit.Location;
import org.bukkit.MinecraftExperimental;
import org.bukkit.NamespacedKey;
import org.bukkit.Registry;
import org.bukkit.Translatable;
import org.bukkit.World;
import org.bukkit.entity.minecart.CommandMinecart;
import org.bukkit.entity.minecart.ExplosiveMinecart;
import org.bukkit.entity.minecart.HopperMinecart;
import org.bukkit.entity.minecart.PoweredMinecart;
import org.bukkit.entity.minecart.RideableMinecart;
import org.bukkit.entity.minecart.SpawnerMinecart;
import org.bukkit.entity.minecart.StorageMinecart;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class EntityType extends OldEnum<EntityType> implements Keyed, Translatable {
    private static final BiMap<Short, EntityType> ID_MAP = HashBiMap.create();

    // These strings MUST match the strings in nms.EntityTypes and are case sensitive.
    /**
     * An item resting on the ground.
     * <p>
     * Spawn with {@link World#dropItem(Location, ItemStack)} or {@link
     * World#dropItemNaturally(Location, ItemStack)}
     */
    public static final EntityType ITEM = getEntityType("item", 1);
    /**
     * An experience orb.
     */
    public static final EntityType EXPERIENCE_ORB = getEntityType("experience_orb", 2);
    /**
     * @see AreaEffectCloud
     */
    public static final EntityType AREA_EFFECT_CLOUD = getEntityType("area_effect_cloud", 3);
    /**
     * @see ElderGuardian
     */
    public static final EntityType ELDER_GUARDIAN = getEntityType("elder_guardian", 4);
    /**
     * @see WitherSkeleton
     */
    public static final EntityType WITHER_SKELETON = getEntityType("wither_skeleton", 5);
    /**
     * @see Stray
     */
    public static final EntityType STRAY = getEntityType("stray", 6);
    /**
     * A flying chicken egg.
     */
    public static final EntityType EGG = getEntityType("egg", 7);
    /**
     * A leash attached to a fencepost.
     */
    public static final EntityType LEASH_KNOT = getEntityType("leash_knot", 8);
    /**
     * A painting on a wall.
     */
    public static final EntityType PAINTING = getEntityType("painting", 9);
    /**
     * An arrow projectile; may get stuck in the ground.
     */
    public static final EntityType ARROW = getEntityType("arrow", 10);
    /**
     * A flying snowball.
     */
    public static final EntityType SNOWBALL = getEntityType("snowball", 11);
    /**
     * A flying large fireball, as thrown by a Ghast for example.
     */
    public static final EntityType FIREBALL = getEntityType("fireball", 12);
    /**
     * A flying small fireball, such as thrown by a Blaze or player.
     */
    public static final EntityType SMALL_FIREBALL = getEntityType("small_fireball", 13);
    /**
     * A flying ender pearl.
     */
    public static final EntityType ENDER_PEARL = getEntityType("ender_pearl", 14);
    /**
     * An ender eye signal.
     */
    public static final EntityType EYE_OF_ENDER = getEntityType("eye_of_ender", 15);
    /**
     * A flying splash potion.
     */
    public static final EntityType POTION = getEntityType("potion", 16);
    /**
     * A flying experience bottle.
     */
    public static final EntityType EXPERIENCE_BOTTLE = getEntityType("experience_bottle", 17);
    /**
     * An item frame on a wall.
     */
    public static final EntityType ITEM_FRAME = getEntityType("item_frame", 18);
    /**
     * A flying wither skull projectile.
     */
    public static final EntityType WITHER_SKULL = getEntityType("wither_skull", 19);
    /**
     * Primed TNT that is about to explode.
     */
    public static final EntityType TNT = getEntityType("tnt", 20);
    /**
     * A block that is going to or is about to fall.
     */
    public static final EntityType FALLING_BLOCK = getEntityType("falling_block", 21);
    /**
     * Internal representation of a Firework once it has been launched.
     */
    public static final EntityType FIREWORK_ROCKET = getEntityType("firework_rocket", 22);
    /**
     * @see Husk
     */
    public static final EntityType HUSK = getEntityType("husk", 23);
    /**
     * Like {@link #ARROW} but causes the {@link PotionEffectType#GLOWING} effect on all team members.
     */
    public static final EntityType SPECTRAL_ARROW = getEntityType("spectral_arrow", 24);
    /**
     * Bullet fired by {@link #SHULKER}.
     */
    public static final EntityType SHULKER_BULLET = getEntityType("shulker_bullet", 25);
    /**
     * Like {@link #FIREBALL} but with added effects.
     */
    public static final EntityType DRAGON_FIREBALL = getEntityType("dragon_fireball", 26);
    /**
     * @see ZombieVillager
     */
    public static final EntityType ZOMBIE_VILLAGER = getEntityType("zombie_villager", 27);
    /**
     * @see SkeletonHorse
     */
    public static final EntityType SKELETON_HORSE = getEntityType("skeleton_horse", 28);
    /**
     * @see ZombieHorse
     */
    public static final EntityType ZOMBIE_HORSE = getEntityType("zombie_horse", 29);
    /**
     * Mechanical entity with an inventory for placing weapons / armor into.
     */
    public static final EntityType ARMOR_STAND = getEntityType("armor_stand", 30);
    /**
     * @see Donkey
     */
    public static final EntityType DONKEY = getEntityType("donkey", 31);
    /**
     * @see Mule
     */
    public static final EntityType MULE = getEntityType("mule", 32);
    /**
     * @see EvokerFangs
     */
    public static final EntityType EVOKER_FANGS = getEntityType("evoker_fangs", 33);
    /**
     * @see Evoker
     */
    public static final EntityType EVOKER = getEntityType("evoker", 34);
    /**
     * @see Vex
     */
    public static final EntityType VEX = getEntityType("vex", 35);
    /**
     * @see Vindicator
     */
    public static final EntityType VINDICATOR = getEntityType("vindicator", 36);
    /**
     * @see Illusioner
     */
    public static final EntityType ILLUSIONER = getEntityType("illusioner", 37);
    /**
     * @see CommandMinecart
     */
    public static final EntityType COMMAND_BLOCK_MINECART = getEntityType("command_block_minecart", 40);
    /**
     * A placed boat.
     */
    public static final EntityType BOAT = getEntityType("boat", 41);
    /**
     * @see RideableMinecart
     */
    public static final EntityType MINECART = getEntityType("minecart", 42);
    /**
     * @see StorageMinecart
     */
    public static final EntityType CHEST_MINECART = getEntityType("chest_minecart", 43);
    /**
     * @see PoweredMinecart
     */
    public static final EntityType FURNACE_MINECART = getEntityType("furnace_minecart", 44);
    /**
     * @see ExplosiveMinecart
     */
    public static final EntityType TNT_MINECART = getEntityType("tnt_minecart", 45);
    /**
     * @see HopperMinecart
     */
    public static final EntityType HOPPER_MINECART = getEntityType("hopper_minecart", 46);
    /**
     * @see SpawnerMinecart
     */
    public static final EntityType SPAWNER_MINECART = getEntityType("spawner_minecart", 47);
    public static final EntityType CREEPER = getEntityType("creeper", 50);
    public static final EntityType SKELETON = getEntityType("skeleton", 51);
    public static final EntityType SPIDER = getEntityType("spider", 52);
    public static final EntityType GIANT = getEntityType("giant", 53);
    public static final EntityType ZOMBIE = getEntityType("zombie", 54);
    public static final EntityType SLIME = getEntityType("slime", 55);
    public static final EntityType GHAST = getEntityType("ghast", 56);
    public static final EntityType ZOMBIFIED_PIGLIN = getEntityType("zombified_piglin", 57);
    public static final EntityType ENDERMAN = getEntityType("enderman", 58);
    public static final EntityType CAVE_SPIDER = getEntityType("cave_spider", 59);
    public static final EntityType SILVERFISH = getEntityType("silverfish", 60);
    public static final EntityType BLAZE = getEntityType("blaze", 61);
    public static final EntityType MAGMA_CUBE = getEntityType("magma_cube", 62);
    public static final EntityType ENDER_DRAGON = getEntityType("ender_dragon", 63);
    public static final EntityType WITHER = getEntityType("wither", 64);
    public static final EntityType BAT = getEntityType("bat", 65);
    public static final EntityType WITCH = getEntityType("witch", 66);
    public static final EntityType ENDERMITE = getEntityType("endermite", 67);
    public static final EntityType GUARDIAN = getEntityType("guardian", 68);
    public static final EntityType SHULKER = getEntityType("shulker", 69);
    public static final EntityType PIG = getEntityType("pig", 90);
    public static final EntityType SHEEP = getEntityType("sheep", 91);
    public static final EntityType COW = getEntityType("cow", 92);
    public static final EntityType CHICKEN = getEntityType("chicken", 93);
    public static final EntityType SQUID = getEntityType("squid", 94);
    public static final EntityType WOLF = getEntityType("wolf", 95);
    public static final EntityType MOOSHROOM = getEntityType("mooshroom", 96);
    public static final EntityType SNOW_GOLEM = getEntityType("snow_golem", 97);
    public static final EntityType OCELOT = getEntityType("ocelot", 98);
    public static final EntityType IRON_GOLEM = getEntityType("iron_golem", 99);
    public static final EntityType HORSE = getEntityType("horse", 100);
    public static final EntityType RABBIT = getEntityType("rabbit", 101);
    public static final EntityType POLAR_BEAR = getEntityType("polar_bear", 102);
    public static final EntityType LLAMA = getEntityType("llama", 103);
    public static final EntityType LLAMA_SPIT = getEntityType("llama_spit", 104);
    public static final EntityType PARROT = getEntityType("parrot", 105);
    public static final EntityType VILLAGER = getEntityType("villager", 120);
    public static final EntityType END_CRYSTAL = getEntityType("end_crystal", 200);
    public static final EntityType TURTLE = getEntityType("turtle");
    public static final EntityType PHANTOM = getEntityType("phantom");
    public static final EntityType TRIDENT = getEntityType("trident");
    public static final EntityType COD = getEntityType("cod");
    public static final EntityType SALMON = getEntityType("salmon");
    public static final EntityType PUFFERFISH = getEntityType("pufferfish");
    public static final EntityType TROPICAL_FISH = getEntityType("tropical_fish");
    public static final EntityType DROWNED = getEntityType("drowned");
    public static final EntityType DOLPHIN = getEntityType("dolphin");
    public static final EntityType CAT = getEntityType("cat");
    public static final EntityType PANDA = getEntityType("panda");
    public static final EntityType PILLAGER = getEntityType("pillager");
    public static final EntityType RAVAGER = getEntityType("ravager");
    public static final EntityType TRADER_LLAMA = getEntityType("trader_llama");
    public static final EntityType WANDERING_TRADER = getEntityType("wandering_trader");
    public static final EntityType FOX = getEntityType("fox");
    public static final EntityType BEE = getEntityType("bee");
    public static final EntityType HOGLIN = getEntityType("hoglin");
    public static final EntityType PIGLIN = getEntityType("piglin");
    public static final EntityType STRIDER = getEntityType("strider");
    public static final EntityType ZOGLIN = getEntityType("zoglin");
    public static final EntityType PIGLIN_BRUTE = getEntityType("piglin_brute");
    public static final EntityType AXOLOTL = getEntityType("axolotl");
    public static final EntityType GLOW_ITEM_FRAME = getEntityType("glow_item_frame");
    public static final EntityType GLOW_SQUID = getEntityType("glow_squid");
    public static final EntityType GOAT = getEntityType("goat");
    public static final EntityType MARKER = getEntityType("marker");
    public static final EntityType ALLAY = getEntityType("allay");
    public static final EntityType CHEST_BOAT = getEntityType("chest_boat");
    public static final EntityType FROG = getEntityType("frog");
    public static final EntityType TADPOLE = getEntityType("tadpole");
    public static final EntityType WARDEN = getEntityType("warden");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final EntityType CAMEL = getEntityType("camel");
    public static final EntityType BLOCK_DISPLAY = getEntityType("block_display");
    public static final EntityType INTERACTION = getEntityType("interaction");
    public static final EntityType ITEM_DISPLAY = getEntityType("item_display");
    @MinecraftExperimental
    @ApiStatus.Experimental
    public static final EntityType SNIFFER = getEntityType("sniffer");
    public static final EntityType TEXT_DISPLAY = getEntityType("text_display");
    /**
     * A fishing line and bobber.
     */
    public static final EntityType FISHING_BOBBER = getEntityType("fishing_bobber");
    /**
     * A bolt of lightning.
     * <p>
     * Spawn with {@link World#strikeLightning(Location)}.
     */
    public static final EntityType LIGHTNING_BOLT = getEntityType("lightning_bolt");
    public static final EntityType PLAYER = getEntityType("player");
    /**
     * An unknown entity without an Entity Class
     * @deprecated only for backwards compatibility, unknown is no longer returned.
     */
    @Deprecated
    public static final EntityType UNKNOWN = getEntityType("unknown");

    private static EntityType getEntityType(@NotNull String key) {
        return getEntityType(key, -1);
    }

    private static EntityType getEntityType(@NotNull String key, int typeId) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        EntityType entityType = Registry.ENTITY_TYPE.get(namespacedKey);
        Preconditions.checkNotNull(entityType, "No EntityType found for %s. This is a bug.", namespacedKey);
        if (typeId > 0) {
            ID_MAP.put((short) typeId, entityType);
        }
        return entityType;
    }

    /**
     * Some entities cannot be spawned using {@link
     * World#spawnEntity(Location, EntityType)} or {@link
     * World#spawn(Location, Class)}, usually because they require additional
     * information in order to spawn.
     *
     * @return False if the entity type cannot be spawned
     */
    public abstract boolean isSpawnable();

    public abstract boolean isAlive();

    @Nullable
    public abstract Class<? extends Entity> getEntityClass();

    /**
     * Gets the entity type name.
     *
     * @return the entity type's name
     * @deprecated Magic value
     */
    @Deprecated
    @Nullable
    public abstract String getName();

    /**
     * Gets the entity type id.
     *
     * @return the raw type id
     * @deprecated Magic value
     */
    @Deprecated
    public short getTypeId() {
        return ID_MAP.inverse().getOrDefault(this, (short) -1);
    }

    /**
     * Gets an entity type from its name.
     *
     * @param name the entity type's name
     * @return the matching entity type or null
     * @deprecated Magic value
     */
    @Deprecated
    @Contract("null -> null")
    @Nullable
    public static EntityType fromName(@Nullable String name) {
        if (name == null) {
            return null;
        }
        return Registry.ENTITY_TYPE.get(NamespacedKey.fromString(name.toLowerCase(java.util.Locale.ENGLISH)));
    }

    /**
     * Gets an entity from its id.
     *
     * @param id the raw type id
     * @return the matching entity type or null
     * @deprecated Magic value
     */
    @Deprecated
    @Nullable
    public static EntityType fromId(int id) {
        if (id > Short.MAX_VALUE) {
            return null;
        }
        return ID_MAP.get((short) id);
    }

    /**
     * @param name of the entityType.
     * @return the entityType with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static EntityType valueOf(@NotNull String name) {
        EntityType entityType = Registry.ENTITY_TYPE.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(entityType != null, "No EntityType found with the name %s", name);
        return entityType;
    }

    /**
     * @return an array of all known EntityTypes.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static EntityType[] values() {
        return Lists.newArrayList(Registry.ENTITY_TYPE).toArray(new EntityType[0]);
    }
}
