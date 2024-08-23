package net.tgd.enhancedarmors.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tgd.enhancedarmors.EnhancedArmors;
import net.tgd.enhancedarmors.init.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EnhancedArmors.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BOSS_ARMOR_SHARD);

        trimmedArmorItem(ModItems.IRON_BOSS_BOOTS);
        trimmedArmorItem(ModItems.IRON_BOSS_LEGGINGS);
        trimmedArmorItem(ModItems.IRON_BOSS_CHESTPLATE);
        trimmedArmorItem(ModItems.IRON_BOSS_HELMET);
        trimmedArmorItem(ModItems.GOLD_BOSS_BOOTS);
        trimmedArmorItem(ModItems.GOLD_BOSS_LEGGINGS);
        trimmedArmorItem(ModItems.GOLD_BOSS_CHESTPLATE);
        trimmedArmorItem(ModItems.GOLD_BOSS_HELMET);
        trimmedArmorItem(ModItems.DIAMOND_BOSS_BOOTS);
        trimmedArmorItem(ModItems.DIAMOND_BOSS_LEGGINGS);
        trimmedArmorItem(ModItems.DIAMOND_BOSS_CHESTPLATE);
        trimmedArmorItem(ModItems.DIAMOND_BOSS_HELMET);
        trimmedArmorItem(ModItems.NETHERITE_BOSS_BOOTS);
        trimmedArmorItem(ModItems.NETHERITE_BOSS_LEGGINGS);
        trimmedArmorItem(ModItems.NETHERITE_BOSS_CHESTPLATE);
        trimmedArmorItem(ModItems.NETHERITE_BOSS_HELMET);

        withExistingParent(ModItems.ARMORED_BOSS_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = EnhancedArmors.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + itemRegistryObject.getId().getPath();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.tryBuild(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.tryBuild(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                    // Trimmed armorItem files
                    getBuilder(currentTrimName)
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer0", armorItemResLoc)
                            .texture("layer2", trimResLoc);

                    // Non-trimmed armorItem file (normal variant)
                    this.withExistingParent(itemRegistryObject.getId().getPath(),
                                    mcLoc("item/generated"))
                            .override()
                            .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                            .predicate(mcLoc("trim_type"), trimValue).end()
                            .texture("layer0",
                                    ResourceLocation.tryBuild(MOD_ID,
                                            "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), "item/generated").texture("layer0", EnhancedArmors.MOD_ID + ":item/" + item.getId().getPath());
    }
}
