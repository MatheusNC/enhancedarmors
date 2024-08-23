package net.tgd.enhancedarmors.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tgd.enhancedarmors.EnhancedArmors;
import net.tgd.enhancedarmors.entity.ModEntities;
import net.tgd.enhancedarmors.entity.custom.ArmoredBossEntity;

@Mod.EventBusSubscriber(modid = EnhancedArmors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ARMORED_BOSS.get(), ArmoredBossEntity.createAttributes().build());
    }
}
