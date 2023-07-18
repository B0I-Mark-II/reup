package org.bukkit;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.OldEnum;
import org.jetbrains.annotations.NotNull;

public abstract class Particle<D> extends OldEnum<Particle<D>> implements Keyed {
    public static final Particle<Void> POOF = getParticle("poof");
    public static final Particle<Void> EXPLOSION = getParticle("explosion");
    public static final Particle<Void> EXPLOSION_EMITTER = getParticle("explosion_emitter");
    public static final Particle<Void> FIREWORK = getParticle("firework");
    public static final Particle<Void> BUBBLE = getParticle("bubble");
    public static final Particle<Void> SPLASH = getParticle("splash");
    public static final Particle<Void> FISHING = getParticle("fishing");
    public static final Particle<Void> UNDERWATER = getParticle("underwater");
    public static final Particle<Void> CRIT = getParticle("crit");
    public static final Particle<Void> ENCHANTED_HIT = getParticle("enchanted_hit");
    public static final Particle<Void> SMOKE = getParticle("smoke");
    public static final Particle<Void> LARGE_SMOKE = getParticle("large_smoke");
    public static final Particle<Void> EFFECT = getParticle("effect");
    public static final Particle<Void> INSTANT_EFFECT = getParticle("instant_effect");
    public static final Particle<Void> ENTITY_EFFECT = getParticle("entity_effect");
    public static final Particle<Void> AMBIENT_ENTITY_EFFECT = getParticle("ambient_entity_effect");
    public static final Particle<Void> WITCH = getParticle("witch");
    public static final Particle<Void> DRIPPING_WATER = getParticle("dripping_water");
    public static final Particle<Void> DRIPPING_LAVA = getParticle("dripping_lava");
    public static final Particle<Void> ANGRY_VILLAGER = getParticle("angry_villager");
    public static final Particle<Void> HAPPY_VILLAGER = getParticle("happy_villager");
    public static final Particle<Void> MYCELIUM = getParticle("mycelium");
    public static final Particle<Void> NOTE = getParticle("note");
    public static final Particle<Void> PORTAL = getParticle("portal");
    public static final Particle<Void> ENCHANT = getParticle("enchant");
    public static final Particle<Void> FLAME = getParticle("flame");
    public static final Particle<Void> LAVA = getParticle("lava");
    public static final Particle<Void> CLOUD = getParticle("cloud");
    /**
     * Uses {@link Particle.DustOptions} as DataType
     */
    public static final Particle<DustOptions> DUST = getParticle("dust");
    public static final Particle<Void> ITEM_SNOWBALL = getParticle("item_snowball");
    public static final Particle<Void> ITEM_SLIME = getParticle("item_slime");
    public static final Particle<Void> HEART = getParticle("heart");
    /**
     * Uses {@link ItemStack} as DataType
     */
    public static final Particle<ItemStack> ITEM = getParticle("item");
    /**
     * Uses {@link BlockData} as DataType
     */
    public static final Particle<BlockData> BLOCK = getParticle("block");
    public static final Particle<Void> RAIN = getParticle("rain");
    public static final Particle<Void> ELDER_GUARDIAN = getParticle("elder_guardian");
    public static final Particle<Void> DRAGON_BREATH = getParticle("dragon_breath");
    public static final Particle<Void> END_ROD = getParticle("end_rod");
    public static final Particle<Void> DAMAGE_INDICATOR = getParticle("damage_indicator");
    public static final Particle<Void> SWEEP_ATTACK = getParticle("sweep_attack");
    /**
     * Uses {@link BlockData} as DataType
     */
    public static final Particle<BlockData> FALLING_DUST = getParticle("falling_dust");
    public static final Particle<Void> TOTEM_OF_UNDYING = getParticle("totem_of_undying");
    public static final Particle<Void> SPIT = getParticle("spit");
    public static final Particle<Void> SQUID_INK = getParticle("squid_ink");
    public static final Particle<Void> BUBBLE_POP = getParticle("bubble_pop");
    public static final Particle<Void> CURRENT_DOWN = getParticle("current_down");
    public static final Particle<Void> BUBBLE_COLUMN_UP = getParticle("bubble_column_up");
    public static final Particle<Void> NAUTILUS = getParticle("nautilus");
    public static final Particle<Void> DOLPHIN = getParticle("dolphin");
    public static final Particle<Void> SNEEZE = getParticle("sneeze");
    public static final Particle<Void> CAMPFIRE_COSY_SMOKE = getParticle("campfire_cosy_smoke");
    public static final Particle<Void> CAMPFIRE_SIGNAL_SMOKE = getParticle("campfire_signal_smoke");
    public static final Particle<Void> COMPOSTER = getParticle("composter");
    public static final Particle<Void> FLASH = getParticle("flash");
    public static final Particle<Void> FALLING_LAVA = getParticle("falling_lava");
    public static final Particle<Void> LANDING_LAVA = getParticle("landing_lava");
    public static final Particle<Void> FALLING_WATER = getParticle("falling_water");
    public static final Particle<Void> DRIPPING_HONEY = getParticle("dripping_honey");
    public static final Particle<Void> FALLING_HONEY = getParticle("falling_honey");
    public static final Particle<Void> LANDING_HONEY = getParticle("landing_honey");
    public static final Particle<Void> FALLING_NECTAR = getParticle("falling_nectar");
    public static final Particle<Void> SOUL_FIRE_FLAME = getParticle("soul_fire_flame");
    public static final Particle<Void> ASH = getParticle("ash");
    public static final Particle<Void> CRIMSON_SPORE = getParticle("crimson_spore");
    public static final Particle<Void> WARPED_SPORE = getParticle("warped_spore");
    public static final Particle<Void> SOUL = getParticle("soul");
    public static final Particle<Void> DRIPPING_OBSIDIAN_TEAR = getParticle("dripping_obsidian_tear");
    public static final Particle<Void> FALLING_OBSIDIAN_TEAR = getParticle("falling_obsidian_tear");
    public static final Particle<Void> LANDING_OBSIDIAN_TEAR = getParticle("landing_obsidian_tear");
    public static final Particle<Void> REVERSE_PORTAL = getParticle("reverse_portal");
    public static final Particle<Void> WHITE_ASH = getParticle("white_ash");
    /**
     * Uses {@link DustTransition} as DataType
     */
    public static final Particle<DustTransition> DUST_COLOR_TRANSITION = getParticle("dust_color_transition");
    /**
     * Uses {@link Vibration} as DataType
     */
    public static final Particle<Vibration> VIBRATION = getParticle("vibration");
    public static final Particle<Void> FALLING_SPORE_BLOSSOM = getParticle("falling_spore_blossom");
    public static final Particle<Void> SPORE_BLOSSOM_AIR = getParticle("spore_blossom_air");
    public static final Particle<Void> SMALL_FLAME = getParticle("small_flame");
    public static final Particle<Void> SNOWFLAKE = getParticle("snowflake");
    public static final Particle<Void> DRIPPING_DRIPSTONE_LAVA = getParticle("dripping_dripstone_lava");
    public static final Particle<Void> FALLING_DRIPSTONE_LAVA = getParticle("falling_dripstone_lava");
    public static final Particle<Void> DRIPPING_DRIPSTONE_WATER = getParticle("dripping_dripstone_water");
    public static final Particle<Void> FALLING_DRIPSTONE_WATER = getParticle("falling_dripstone_water");
    public static final Particle<Void> GLOW_SQUID_INK = getParticle("glow_squid_ink");
    public static final Particle<Void> GLOW = getParticle("glow");
    public static final Particle<Void> WAX_ON = getParticle("wax_on");
    public static final Particle<Void> WAX_OFF = getParticle("wax_off");
    public static final Particle<Void> ELECTRIC_SPARK = getParticle("electric_spark");
    public static final Particle<Void> SCRAPE = getParticle("scrape");
    public static final Particle<Void> SONIC_BOOM = getParticle("sonic_boom");
    public static final Particle<Void> SCULK_SOUL = getParticle("sculk_soul");
    public static final Particle<Float> SCULK_CHARGE = getParticle("sculk_charge");
    public static final Particle<Void> SCULK_CHARGE_POP = getParticle("sculk_charge_pop");
    public static final Particle<Integer> SHRIEK = getParticle("shriek");
    public static final Particle<Void> CHERRY_LEAVES = getParticle("cherry_leaves");
    public static final Particle<Void> EGG_CRACK = getParticle("egg_crack");
    /**
     * Uses {@link BlockData} as DataType
     */
    public static final Particle<BlockData> BLOCK_MARKER = getParticle("block_marker");

    @NotNull
    private static <D> Particle<D> getParticle(@NotNull String key) {
        NamespacedKey namespacedKey = NamespacedKey.minecraft(key);
        Particle<D> particle = (Particle<D>) Registry.PARTICLE_TYPE.get(namespacedKey);
        Preconditions.checkNotNull(particle, "No particle found for %s. This is a bug.", namespacedKey);
        return particle;
    }

    /**
     * Returns the required data type for the particle
     * @return the required data type
     */
    @NotNull
    public abstract Class<D> getDataType();

    /**
     * Options which can be applied to redstone dust particles - a particle
     * color and size.
     */
    public static class DustOptions {

        private final Color color;
        private final float size;

        public DustOptions(@NotNull Color color, float size) {
            Preconditions.checkArgument(color != null, "color");
            this.color = color;
            this.size = size;
        }

        /**
         * The color of the particles to be displayed.
         *
         * @return particle color
         */
        @NotNull
        public Color getColor() {
            return color;
        }

        /**
         * Relative size of the particle.
         *
         * @return relative particle size
         */
        public float getSize() {
            return size;
        }
    }

    /**
     * Options which can be applied to a color transitioning dust particles.
     */
    public static class DustTransition extends DustOptions {

        private final Color toColor;

        public DustTransition(@NotNull Color fromColor, @NotNull Color toColor, float size) {
            super(fromColor, size);

            Preconditions.checkArgument(toColor != null, "toColor");
            this.toColor = toColor;
        }

        /**
         * The final of the particles to be displayed.
         *
         * @return final particle color
         */
        @NotNull
        public Color getToColor() {
            return toColor;
        }
    }

    /**
     * @param name of the particle.
     * @return the particle with the given name.
     * @deprecated only for backwards compatibility, use {@link Registry#get(NamespacedKey)} instead.
     */
    @NotNull
    @Deprecated
    public static Particle<?> valueOf(@NotNull String name) {
        name = convertLegacy(name);
        Particle<?> particle = Registry.PARTICLE_TYPE.get(NamespacedKey.fromString(name.toLowerCase()));
        Preconditions.checkArgument(particle != null, "No particle found with the name %s", name);
        return particle;
    }

    /**
     * @return an array of all known particles.
     * @deprecated use {@link Registry#iterator()}.
     */
    @NotNull
    @Deprecated
    public static Particle<?>[] values() {
        return Lists.newArrayList(Registry.PARTICLE_TYPE).toArray(new Particle[0]);
    }

    private static String convertLegacy(String from) {
        if (from == null) {
            return null;
        }

        switch (from.toLowerCase()) {
            case "explosion_normal":
                return "poof";
            case "explosion_large":
                return "explosion";
            case "explosion_huge":
                return "explosion_emitter";
            case "fireworks_spark":
                return "firework";
            case "water_bubble":
                return "bubble";
            case "water_splash":
                return "splash";
            case "water_wake":
                return "fishing";
            case "suspended":
                return "underwater";
            case "suspended_depth":
                return "underwater";
            case "crit_magic":
                return "enchanted_hit";
            case "smoke_normal":
                return "smoke";
            case "smoke_large":
                return "large_smoke";
            case "spell":
                return "effect";
            case "spell_instant":
                return "instant_effect";
            case "spell_mob":
                return "entity_effect";
            case "spell_mob_ambient":
                return "ambient_entity_effect";
            case "spell_witch":
                return "witch";
            case "drip_water":
                return "dripping_water";
            case "drip_lava":
                return "dripping_lava";
            case "villager_angry":
                return "angry_villager";
            case "villager_happy":
                return "happy_villager";
            case "town_aura":
                return "mycelium";
            case "enchantment_table":
                return "enchant";
            case "redstone":
                return "dust";
            case "snowball":
                return "item_snowball";
            case "snow_shovel":
                return "item_snowball";
            case "slime":
                return "item_slime";
            case "item_crack":
                return "item";
            case "block_crack":
                return "block";
            case "block_dust":
                return "block";
            case "water_drop":
                return "rain";
            case "mob_appearance":
                return "elder_guardian";
            case "totem":
                return "totem_of_undying";
        }

        return from;
    }
}
