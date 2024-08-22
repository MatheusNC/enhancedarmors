package net.tgd.enhancedarmors.init;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tgd.enhancedarmors.EnhancedArmors;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedArmors.MOD_ID);

    public static final RegistryObject<Item> BOSS_ARMOR_SHARD = ITEMS.register("boss_armor_shard",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_BOSS_HELMET = ITEMS.register("iron_boss_helmet",
            () -> new ArmorItem(ModArmorMaterials.IRON_BOSS_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> IRON_BOSS_CHESTPLATE = ITEMS.register("iron_boss_chestplate",
            () -> new ArmorItem(ModArmorMaterials.IRON_BOSS_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> IRON_BOSS_LEGGINGS = ITEMS.register("iron_boss_leggings",
            () -> new ArmorItem(ModArmorMaterials.IRON_BOSS_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> IRON_BOSS_BOOTS = ITEMS.register("iron_boss_boots",
            () -> new ArmorItem(ModArmorMaterials.IRON_BOSS_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GOLD_BOSS_HELMET = ITEMS.register("gold_boss_helmet",
            () -> new ArmorItem(ModArmorMaterials.GOLD_BOSS_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BOSS_CHESTPLATE = ITEMS.register("gold_boss_chestplate",
            () -> new ArmorItem(ModArmorMaterials.GOLD_BOSS_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BOSS_LEGGINGS = ITEMS.register("gold_boss_leggings",
            () -> new ArmorItem(ModArmorMaterials.GOLD_BOSS_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_BOSS_BOOTS = ITEMS.register("gold_boss_boots",
            () -> new ArmorItem(ModArmorMaterials.GOLD_BOSS_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_BOSS_HELMET = ITEMS.register("diamond_boss_helmet",
            () -> new ArmorItem(ModArmorMaterials.DIAMOND_BOSS_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BOSS_CHESTPLATE = ITEMS.register("diamond_boss_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DIAMOND_BOSS_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BOSS_LEGGINGS = ITEMS.register("diamond_boss_leggings",
            () -> new ArmorItem(ModArmorMaterials.DIAMOND_BOSS_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_BOSS_BOOTS = ITEMS.register("diamond_boss_boots",
            () -> new ArmorItem(ModArmorMaterials.DIAMOND_BOSS_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_BOSS_HELMET = ITEMS.register("netherite_boss_helmet",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_BOSS_ARMOR, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BOSS_CHESTPLATE = ITEMS.register("netherite_boss_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_BOSS_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BOSS_LEGGINGS = ITEMS.register("netherite_boss_leggings",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_BOSS_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_BOSS_BOOTS = ITEMS.register("netherite_boss_boots",
            () -> new ArmorItem(ModArmorMaterials.NETHERITE_BOSS_ARMOR, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}