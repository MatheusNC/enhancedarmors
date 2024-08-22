package net.tgd.enhancedarmors.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.tgd.enhancedarmors.EnhancedArmors;
import net.tgd.enhancedarmors.init.ModItems;
import net.tgd.enhancedarmors.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, EnhancedArmors.MOD_ID);
    }

    @Override
    protected void start() {
        add("boss_armor_shard_from_warden", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/warden")).build() }, ModItems.BOSS_ARMOR_SHARD.get()));
    }
}
