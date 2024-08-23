package net.tgd.enhancedarmors.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.tgd.enhancedarmors.EnhancedArmors;
import net.tgd.enhancedarmors.entity.custom.ArmoredBossEntity;

public class ArmoredBossRenderer extends MobRenderer<ArmoredBossEntity, ArmoredBossModel<ArmoredBossEntity>> {
    public ArmoredBossRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ArmoredBossModel<>(pContext.bakeLayer(ModModelLayers.ARMORED_BOSS_LAYER)), 2F);
    }

    @Override
    public ResourceLocation getTextureLocation(ArmoredBossEntity armoredBossEntity) {
        return new ResourceLocation(EnhancedArmors.MOD_ID, "textures/entity/armored_boss.png");
    }

    @Override
    public void render(ArmoredBossEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        pPoseStack.translate(0.0D, -1.5D, 0.0D);
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
