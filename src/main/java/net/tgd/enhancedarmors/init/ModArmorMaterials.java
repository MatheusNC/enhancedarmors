package net.tgd.enhancedarmors.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.tgd.enhancedarmors.EnhancedArmors;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    IRON_BOSS_ARMOR("iron_boss_armor", 15, new int[]{3, 6, 7, 3}, 9, SoundEvents.ARMOR_EQUIP_IRON,
            1.0F, 0.0F, () -> Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get())),
    GOLD_BOSS_ARMOR("gold_boss_armor", 15, new int[]{2, 4, 6, 3}, 25, SoundEvents.ARMOR_EQUIP_GOLD,
            1.0F, 0.0F, () -> Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get())),
    DIAMOND_BOSS_ARMOR("diamond_boss_armor", 33, new int[]{4, 7, 9, 4}, 10, SoundEvents.ARMOR_EQUIP_DIAMOND,
            3.0F, 0.1F, () -> Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get())),
    NETHERITE_BOSS_ARMOR("netherite_boss_armor", 37, new int[]{4, 7, 9, 4}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            4.0F, 0.2F, () -> Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 16, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return EnhancedArmors.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
