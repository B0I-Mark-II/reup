package org.bukkit.entity;

import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Lists;
import org.bukkit.Bukkit;
import org.bukkit.Keyed;
import org.bukkit.Location;
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
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class EntityType<E extends Entity> extends OldEnum<EntityType<E>> implements Keyed, Translatable {
    private static final BiMap<Short, EntityType> ID_MAP = HashBiMap.create();

    // These strings MUST match the strings in nms.EntityTypes and are case sensitive.
    /**
     * An item resting on the ground.
     * <p>
     * Spawn with {@link World#dropItem(Location, ItemStack)} or {@link
     * World#dropItemNaturally(Location, ItemStack)}
     */
    public static final EntityType<Item> ITEM = getEntityType("item", 1);
    /**
     * An experience orb.
     */
    public static final EntityType<ExperienceOrb> EXPERIENCE_ORB = getEntityType("experience_orb", 2);
    /**
     * @see AreaEffectCloud
     */
    public static final EntityType<AreaEffectCloud> AREA_EFFECT_CLOUD = getEntityType("area_effect_cloud", 3);
    /**
     * @see ElderGuardian
     */
    public static final EntityType<ElderGuardian> ELDER_GUARDIAN = getEntityType("elder_guardian", 4);
    /**
     * @see WitherSkeleton
     */
    public static final EntityType<WitherSkeleton> WITHER_SKELETON = getEntityType("wither_skeleton", 5);
    /**
     * @see Stray
     */
    public static final EntityType<Stray> STRAY = getEntityType("stray", 6);
    /**
     * A flying chicken egg.
     */
    public static final EntityType<Egg> EGG = getEntityType("egg", 7);
    /**
     * A leash attached to a fencepost.
     */
    public static final EntityType<LeashHitch> LEASH_KNOT = getEntityType("leash_knot", 8);
    /**
     * A painting on a wall.
     */
    public static final EntityType<Painting> PAINTING = getEntityType("painting", 9);
    /**
     * An arrow projectile; may get stuck in the ground.
     */
    public static final EntityType<Arrow> ARROW = getEntityType("arrow", 10);
    /**
     * A flying snowball.
     */
    public static final EntityType<Snowball> SNOWBALL = getEntityType("snowball", 11);
    /**
     * A flying large fireball, as thrown by a Ghast for example.
     */
    public static final EntityType<Fireball> FIREBALL = getEntityType("fireball", 12);
    /**
     * A flying small fireball, such as thrown by a Blaze or player.
     */
    public static final EntityType<SmallFireball> SMALL_FIREBALL = getEntityType("small_fireball", 13);
    /**
     * A flying ender pearl.
     */
    public static final EntityType<EnderPearl> ENDER_PEARL = getEntityType("ender_pearl", 14);
    /**
     * An ender eye signal.
     */
    public static final EntityType<EnderSignal> EYE_OF_ENDER = getEntityType("eye_of_ender", 15);
    /**
     * A flying splash potion.
     */
    public static final EntityType<ThrownPotion> POTION = getEntityType("potion", 16);
    /**
     * A flying experience bottle.
     */
    public static final EntityType<ThrownExpBottle> EXPERIENCE_BOTTLE = getEntityType("experience_bottle", 17);
    /**
     * An item frame on a wall.
     */
    public static final EntityType<ItemFrame> ITEM_FRAME = getEntityType("item_frame", 18);
    /**
     * A flying wither skull projectile.
     */
    public static final EntityType<WitherSkull> WITHER_SKULL = getEntityType("wither_skull", 19);
    /**
     * Primed TNT that is about to explode.
     */
    public static final EntityType<TNTPrimed> TNT = getEntityType("tnt", 20);
    /**
     * A block that is going to or is about to fall.
     */
    public static final EntityType<FallingBlock> FALLING_BLOCK = getEntityType("falling_block", 21);
    /**
     * Internal representation of a Firework once it has been launched.
     */
    public static final EntityType<Firework> FIREWORK_ROCKET = getEntityType("firework_rocket", 22);
    /**
     * @see Husk
     */
    public static final EntityType<Husk> HUSK = getEntityType("husk", 23);
    /**
     * Like {@link #ARROW} but causes the {@link PotionEffectType#GLOWING} effect on all team members.
     */
    public static final EntityType<SpectralArrow> SPECTRAL_ARROW = getEntityType("spectral_arrow", 24);
    /**
     * Bullet fired by {@link #SHULKER}.
     */
    public static final EntityType<ShulkerBullet> SHULKER_BULLET = getEntityType("shulker_bullet", 25);
    /**
     * Like {@link #FIREBALL} but with added effects.
     */
    public static final EntityType<DragonFireball> DRAGON_FIREBALL = getEntityType("dragon_fireball", 26);
    /**
     * @see ZombieVillager
     */
    public static final EntityType<ZombieVillager> ZOMBIE_VILLAGER = getEntityType("zombie_villager", 27);
    /**
     * @see SkeletonHorse
     */
    public static final EntityType<SkeletonHorse> SKELETON_HORSE = getEntityType("skeleton_horse", 28);
    /**
     * @see ZombieHorse
     */
    public static final EntityType<ZombieHorse> ZOMBIE_HORSE = getEntityType("zombie_horse", 29);
    /**
     * Mechanical entity with an inventory for placing weapons / armor into.
     */
    public static final EntityType<ArmorStand> ARMOR_STAND = getEntityType("armor_stand", 30);
    /**
     * @see Donkey
     */
    public static final EntityType<Donkey> DONKEY = getEntityType("donkey", 31);
    /**
     * @see Mule
     */
    public static final EntityType<Mule> MULE = getEntityType("mule", 32);
    /**
     * @see EvokerFangs
     */
    public static final EntityType<EvokerFangs> EVOKER_FANGS = getEntityType("evoker_fangs", 33);
    /**
     * @see Evoker
     */
    public static final EntityType<Evoker> EVOKER = getEntityType("evoker", 34);
    /**
     * @see Vex
     */
    public static final EntityType<Vex> VEX = getEntityType("vex", 35);
    /**
     * @see Vindicator
     */
    public static final EntityType<Vindicator> VINDICATOR = getEntityType("vindicator", 36);
    /**
     * @see Illusioner
     */
    public static final EntityType<Illusioner> ILLUSIONER = getEntityType("illusioner", 37);
    /**
     * @see CommandMinecart
     */
    public static final EntityType<CommandMinecart> COMMAND_BLOCK_MINECART = getEntityType("command_block_minecart", 40);
    /**
     * A placed boat.
     */
    public static final EntityType<Boat> BOAT = getEntityType("boat", 41);
    /**
     * @see RideableMinecart
     */
    public static final EntityType<RideableMinecart> MINECART = getEntityType("minecart", 42);
    /**
     * @see StorageMinecart
     */
    public static final EntityType<StorageMinecart> CHEST_MINECART = getEntityType("chest_minecart", 43);
    /**
     * @see PoweredMinecart
     */
    public static final EntityType<PoweredMinecart> FURNACE_MINECART = getEntityType("furnace_minecart", 44);
    /**
     * @see ExplosiveMinecart
     */
    public static final EntityType<ExplosiveMinecart> TNT_MINECART = getEntityType("tnt_minecart", 45);
    /**
     * @see HopperMinecart
     */
    public static final EntityType<HopperMinecart> HOPPER_MINECART = getEntityType("hopper_minecart", 46);
    /**
     * @see SpawnerMinecart
     */
    public static final EntityType<SpawnerMinecart> SPAWNER_MINECART = getEntityType("spawner_minecart", 47);
    public static final EntityType<Creeper> CREEPER = getEntityType("creeper", 50);
    public static final EntityType<Skeleton> SKELETON = getEntityType("skeleton", 51);
    public static final EntityType<Spider> SPIDER = getEntityType("spider", 52);
    public static final EntityType<Giant> GIANT = getEntityType("giant", 53);
    public static final EntityType<Zombie> ZOMBIE = getEntityType("zombie", 54);
    public static final EntityType<Slime> SLIME = getEntityType("slime", 55);
    public static final EntityType<Ghast> GHAST = getEntityType("ghast", 56);
    public static final EntityType<PigZombie> ZOMBIFIED_PIGLIN = getEntityType("zombified_piglin", 57);
    public static final EntityType<Enderman> ENDERMAN = getEntityType("enderman", 58);
    public static final EntityType<CaveSpider> CAVE_SPIDER = getEntityType("cave_spider", 59);
    public static final EntityType<Silverfish> SILVERFISH = getEntityType("silverfish", 60);
    public static final EntityType<Blaze> BLAZE = getEntityType("blaze", 61);
    public static final EntityType<MagmaCube> MAGMA_CUBE = getEntityType("magma_cube", 62);
    public static final EntityType<EnderDragon> ENDER_DRAGON = getEntityType("ender_dragon", 63);
    public static final EntityType<Wither> WITHER = getEntityType("wither", 64);
    public static final EntityType<Bat> BAT = getEntityType("bat", 65);
    public static final EntityType<Witch> WITCH = getEntityType("witch", 66);
    public static final EntityType<Endermite> ENDERMITE = getEntityType("endermite", 67);
    public static final EntityType<Guardian> GUARDIAN = getEntityType("guardian", 68);
    public static final EntityType<Shulker> SHULKER = getEntityType("shulker", 69);
    public static final EntityType<Pig> PIG = getEntityType("pig", 90);
    public static final EntityType<Sheep> SHEEP = getEntityType("sheep", 91);
    public static final EntityType<Cow> COW = getEntityType("cow", 92);
    public static final EntityType<Chicken> CHICKEN = getEntityType("chicken", 93);
    public static final EntityType<Squid> SQUID = getEntityType("squid", 94);
    public static final EntityType<Wolf> WOLF = getEntityType("wolf", 95);
    public static final EntityType<MushroomCow> MOOSHROOM = getEntityType("mooshroom", 96);
    public static final EntityType<Snowman> SNOW_GOLEM = getEntityType("snow_golem", 97);
    public static final EntityType<Ocelot> OCELOT = getEntityType("ocelot", 98);
    public static final EntityType<IronGolem> IRON_GOLEM = getEntityType("iron_golem", 99);
    public static final EntityType<Horse> HORSE = getEntityType("horse", 100);
    public static final EntityType<Rabbit> RABBIT = getEntityType("rabbit", 101);
    public static final EntityType<PolarBear> POLAR_BEAR = getEntityType("polar_bear", 102);
    public static final EntityType<Llama> LLAMA = getEntityType("llama", 103);
    public static final EntityType<LlamaSpit> LLAMA_SPIT = getEntityType("llama_spit", 104);
    public static final EntityType<Parrot> PARROT = getEntityType("parrot", 105);
    public static final EntityType<Villager> VILLAGER = getEntityType("villager", 120);
    public static final EntityType<EnderCrystal> END_CRYSTAL = getEntityType("end_crystal", 200);
    public static final EntityType<Turtle> TURTLE = getEntityType("turtle");
    public static final EntityType<Phantom> PHANTOM = getEntityType("phantom");
    public static final EntityType<Trident> TRIDENT = getEntityType("trident");
    public static final EntityType<Cod> COD = getEntityType("cod");
    public static final EntityType<Salmon> SALMON = getEntityType("salmon");
    public static final EntityType<PufferFish> PUFFERFISH = getEntityType("pufferfish");
    public static final EntityType<TropicalFish> TROPICAL_FISH = getEntityType("tropical_fish");
    public static final EntityType<Drowned> DROWNED = getEntityType("drowned");
    public static final EntityType<Dolphin> DOLPHIN = getEntityType("dolphin");
    public static final EntityType<Cat> CAT = getEntityType("cat");
    public static final EntityType<Panda> PANDA = getEntityType("panda");
    public static final EntityType<Pillager> PILLAGER = getEntityType("pillager");
    public static final EntityType<Ravager> RAVAGER = getEntityType("ravager");
    public static final EntityType<TraderLlama> TRADER_LLAMA = getEntityType("trader_llama");
    public static final EntityType<WanderingTrader> WANDERING_TRADER = getEntityType("wandering_trader");
    public static final EntityType<Fox> FOX = getEntityType("fox");
    public static final EntityType<Bee> BEE = getEntityType("bee");
    public static final EntityType<Hoglin> HOGLIN = getEntityType("hoglin");
    public static final EntityType<Piglin> PIGLIN = getEntityType("piglin");
    public static final EntityType<Strider> STRIDER = getEntityType("strider");
    public static final EntityType<Zoglin> ZOGLIN = getEntityType("zoglin");
    public static final EntityType<PiglinBrute> PIGLIN_BRUTE = getEntityType("piglin_brute");
    public static final EntityType<Axolotl> AXOLOTL = getEntityType("axolotl");
    public static final EntityType<GlowItemFrame> GLOW_ITEM_FRAME = getEntityType("glow_item_frame");
    public static final EntityType<GlowSquid> GLOW_SQUID = getEntityType("glow_squid");
    public static final EntityType<Goat> GOAT = getEntityType("goat");
    public static final EntityType<Marker> MARKER = getEntityType("marker");
    public static final EntityType<Allay> ALLAY = getEntityType("allay");
    public static final EntityType<ChestBoat> CHEST_BOAT = getEntityType("chest_boat");
    public static final EntityType<Frog> FROG = getEntityType("frog");
    public static final EntityType<Tadpole> TADPOLE = getEntityType("tadpole");
    public static final EntityType<Warden> WARDEN = getEntityType("warden");
    public static final EntityType<Camel> CAMEL = getEntityType("camel");
    public static final EntityType<BlockDisplay> BLOCK_DISPLAY = getEntityType("block_display");
    public static final EntityType<Interaction> INTERACTION = getEntityType("interaction");
    public static final EntityType<ItemDisplay> ITEM_DISPLAY = getEntityType("item_display");
    public static final EntityType<Sniffer> SNIFFER = getEntityType("sniffer");
    public static final EntityType<TextDisplay> TEXT_DISPLAY = getEntityType("text_display");
    /**
     * A fishing line and bobber.
     */
    public static final EntityType<FishHook> FISHING_BOBBER = getEntityType("fishing_bobber");
    /**
     * A bolt of lightning.
     * <p>
     * Spawn with {@link World#strikeLightning(Location)}.
     */
    public static final EntityType<LightningStrike> LIGHTNING_BOLT = getEntityType("lightning_bolt");
    public static final EntityType<Player> PLAYER = getEntityType("player");
    /**
     * An unknown entity without an Entity Class
     * @deprecated only for backwards compatibility, unknown is no longer returned.
     */
    @Deprecated
    public static final EntityType<Entity> UNKNOWN = Bukkit.getUnsafe().getUnkownEntityType();

    @NotNull
    private static <E extends Entity> EntityType<E> getEntityType(@NotNull String key) {
        return getEntityType(key, -1);
    }

    @NotNull
    private static <E extends Entity> EntityType<E> getEntityType(@NotNull String key, int typeId) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        EntityType<E> entityType = (EntityType<E>) Registry.ENTITY_TYPE.get(namespacedKey);
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
    public abstract Class<E> getEntityClass();

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
    public static EntityType<?> fromName(@Nullable String name) {
        if (name == null) {
            return null;
        }
        name = convertLegacy(name);
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
    public static EntityType<?> fromId(int id) {
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
    public static EntityType<?> valueOf(@NotNull String name) {
        name = convertLegacy(name);
        EntityType<?> entityType = Registry.ENTITY_TYPE.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(entityType != null, "No EntityType found with the name %s", name);
        return entityType;
    }

    /**
     * @return an array of all known EntityTypes.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static EntityType<?>[] values() {
        return Lists.newArrayList(Registry.ENTITY_TYPE).toArray(new EntityType[0]);
    }

    private static String convertLegacy(String from) {
        if (from == null) {
            return null;
        }

        switch (from.toLowerCase()) {
            case "xp_orb":
                return "experience_orb";
            case "eye_of_ender_signal":
            case "ender_signal":
                return "eye_of_ender";
            case "xp_boottle":
            case "thrown_exp_bottle":
                return "experience_bottle";
            case "fireworks_rocket":
            case "firework":
                return "firework_rocket";
            case "evocation_fangs":
                return "evoker_fangs";
            case "evocation_illager":
                return "evoker";
            case "vindication_illager":
                return "vindicator";
            case "illusion_illager":
                return "illusioner";
            case "commandblock_minecart":
            case "minecart_command":
                return "command_block_minecart";
            case "snowman":
                return "snow_golem";
            case "villager_golem":
                return "iron_golem";
            case "ender_crystal":
                return "end_crystal";
            case "dropped_item":
                return "item";
            case "leash_hitch":
                return "leash_knot";
            case "splash_potion":
                return "potion";
            case "primed_tnt":
                return "tnt";
            case "minecart_chest":
                return "chest_minecart";
            case "minecart_furnace":
                return "furnace_minecart";
            case "minecart_tnt":
                return "tnt_minecart";
            case "minecart_hopper":
                return "hopper_minecart";
            case "minecart_mob_spawner":
                return "spawner_minecart";
            case "mushroom_cow":
                return "mooshroom";
            case "fishing_hook":
                return "fishing_bobber";
            case "lightning":
                return "lightning_bolt";
        }

        return from;
    }

    /**
     * Gets if this EntityType is enabled by feature in a world.
     *
     * @param world the world to check
     * @return true if this EntityType can be used to spawn an Entity for this World.
     */
    public boolean isEnabledByFeature(@NotNull World world) {
        return Bukkit.getDataPackManager().isEnabledByFeature(this, world);
    }
}
