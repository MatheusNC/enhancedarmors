package net.tgd.enhancedarmors.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tgd.enhancedarmors.EnhancedArmors;
import net.tgd.enhancedarmors.entity.client.ArmoredBossModel;
import net.tgd.enhancedarmors.entity.client.ModModelLayers;

@Mod.EventBusSubscriber(modid = EnhancedArmors.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.ARMORED_BOSS_LAYER, ArmoredBossModel::createBodyLayer);
    }
}
