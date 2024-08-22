package net.tgd.enhancedarmors.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tgd.enhancedarmors.EnhancedArmors;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnhancedArmors.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ENHANCED_ARMORS_TAB = CREATIVE_MODE_TABS.register("enhanced_armors_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOSS_ARMOR_SHARD.get()))
                    .title(Component.translatable("creativetab.enhanced_armors"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BOSS_ARMOR_SHARD.get());
                        pOutput.accept(ModItems.IRON_BOSS_BOOTS.get());
                        pOutput.accept(ModItems.IRON_BOSS_LEGGINGS.get());
                        pOutput.accept(ModItems.IRON_BOSS_CHESTPLATE.get());
                        pOutput.accept(ModItems.IRON_BOSS_HELMET.get());
                        pOutput.accept(ModItems.GOLD_BOSS_BOOTS.get());
                        pOutput.accept(ModItems.GOLD_BOSS_LEGGINGS.get());
                        pOutput.accept(ModItems.GOLD_BOSS_CHESTPLATE.get());
                        pOutput.accept(ModItems.GOLD_BOSS_HELMET.get());
                        pOutput.accept(ModItems.DIAMOND_BOSS_BOOTS.get());
                        pOutput.accept(ModItems.DIAMOND_BOSS_LEGGINGS.get());
                        pOutput.accept(ModItems.DIAMOND_BOSS_CHESTPLATE.get());
                        pOutput.accept(ModItems.DIAMOND_BOSS_HELMET.get());
                        pOutput.accept(ModItems.NETHERITE_BOSS_BOOTS.get());
                        pOutput.accept(ModItems.NETHERITE_BOSS_LEGGINGS.get());
                        pOutput.accept(ModItems.NETHERITE_BOSS_CHESTPLATE.get());
                        pOutput.accept(ModItems.NETHERITE_BOSS_HELMET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}