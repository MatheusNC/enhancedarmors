package net.tgd.enhancedarmors.entity.client;


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.tgd.enhancedarmors.entity.animations.ModAnimationDefinitions;
import net.tgd.enhancedarmors.entity.custom.ArmoredBossEntity;

public class ArmoredBossModel<T extends Entity> extends HierarchicalModel<T> {

	private final ModelPart armored_boss;
	private final ModelPart body;
	private final ModelPart torso;
	private final ModelPart upper_torso;
	private final ModelPart bottom_torso;
	private final ModelPart head;
	private final ModelPart right_leg;
	private final ModelPart upper_bone;
	private final ModelPart bottom_bone;
	private final ModelPart left_leg;
	private final ModelPart upper_bone2;
	private final ModelPart bottom_bone2;
	private final ModelPart left_arm;
	private final ModelPart upper_arm;
	private final ModelPart bottom_arm;
	private final ModelPart left_hand;
	private final ModelPart right_arm;
	private final ModelPart upper_arm2;
	private final ModelPart bottom_arm2;
	private final ModelPart right_hand;

	public ArmoredBossModel(ModelPart root) {
		this.armored_boss = root.getChild("armored_boss");
		this.body = armored_boss.getChild("body");
		this.torso = body.getChild("torso");
		this.upper_torso = torso.getChild("upper_torso");
		this.bottom_torso = torso.getChild("bottom_torso");
		this.head = torso.getChild("head");
		this.right_leg = body.getChild("right_leg");
		this.upper_bone = right_leg.getChild("upper_bone");
		this.bottom_bone = right_leg.getChild("bottom_bone");
		this.left_leg = body.getChild("left_leg");
		this.upper_bone2 = left_leg.getChild("upper_bone2");
		this.bottom_bone2 = left_leg.getChild("bottom_bone2");
		this.left_arm = body.getChild("left_arm");
		this.upper_arm = left_arm.getChild("upper_arm");
		this.bottom_arm = left_arm.getChild("bottom_arm");
		this.left_hand = bottom_arm.getChild("left_hand");
		this.right_arm = body.getChild("right_arm");
		this.upper_arm2 = right_arm.getChild("upper_arm2");
		this.bottom_arm2 = right_arm.getChild("bottom_arm2");
		this.right_hand = bottom_arm2.getChild("right_hand");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition armored_boss = partdefinition.addOrReplaceChild("armored_boss", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = armored_boss.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition upper_torso = torso.addOrReplaceChild("upper_torso", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -12.1667F, -3.0F, 16.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(93, 26).addBox(-7.0F, -11.1667F, -4.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(96, 70).addBox(-7.0F, -5.1667F, -4.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(37, 49).addBox(1.0F, -5.1667F, -4.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(92, 91).addBox(1.0F, -11.1667F, -4.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 60).addBox(-7.0F, -11.1667F, 8.0F, 14.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.8333F, -3.0F));

		PartDefinition bottom_torso = torso.addOrReplaceChild("bottom_torso", CubeListBuilder.create().texOffs(0, 25).addBox(-7.0F, 0.0F, -5.0F, 14.0F, 8.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(97, 40).addBox(-6.0F, 1.0F, -6.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(96, 77).addBox(-6.0F, 5.0F, -6.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(94, 21).addBox(1.0F, 5.0F, -6.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(44, 76).addBox(1.0F, 1.0F, -6.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(76, 0).addBox(-6.0F, 1.0F, 4.0F, 12.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -22.0F, 0.0F));

		PartDefinition cube_r1 = bottom_torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(87, 61).addBox(-7.0F, -2.0F, -1.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.0F, 3.0F, 3.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = bottom_torso.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(71, 91).addBox(-1.0F, -2.0F, -1.0F, 8.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, 3.0F, 3.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create().texOffs(49, 49).addBox(-5.0F, -4.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(45, 0).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(-6.0F, -7.0F, -6.0F, 12.0F, 3.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(37, 32).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F))
				.texOffs(45, 13).addBox(-6.0F, -3.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -33.0F, 0.0F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-3.5F, -15.9F, 0.2F));

		PartDefinition upper_bone = right_leg.addOrReplaceChild("upper_bone", CubeListBuilder.create().texOffs(80, 43).addBox(-2.5F, -0.1F, -3.2F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(45, 100).addBox(-1.5F, 0.9F, -4.2F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(36, 100).addBox(-1.5F, 0.9F, 2.8F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(-3.5F, 0.9F, -1.2F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(39, 25).addBox(2.5F, 0.9F, -1.2F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_bone = right_leg.addOrReplaceChild("bottom_bone", CubeListBuilder.create().texOffs(48, 87).addBox(-2.5F, -0.1F, -3.2F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(19, 87).addBox(-1.5F, -0.1F, -4.2F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(71, 76).addBox(-1.5F, -0.1F, 2.8F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 100).addBox(-3.5F, -0.1F, -1.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 99).addBox(2.5F, -0.1F, -1.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(25, 76).addBox(-2.5F, 5.9F, -5.2F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(3.5F, -15.9F, 0.2F));

		PartDefinition upper_bone2 = left_leg.addOrReplaceChild("upper_bone2", CubeListBuilder.create().texOffs(79, 76).addBox(-2.5F, -0.1F, -3.2F, 5.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(91, 99).addBox(-1.5F, 0.9F, -4.2F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 99).addBox(-1.5F, 0.9F, 2.8F, 3.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 25).addBox(2.5F, 0.9F, -1.2F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-3.5F, 0.9F, -1.2F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_bone2 = left_leg.addOrReplaceChild("bottom_bone2", CubeListBuilder.create().texOffs(25, 87).addBox(-2.5F, -0.1F, -3.2F, 5.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(19, 73).addBox(-1.5F, -0.1F, -4.2F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 61).addBox(-1.5F, -0.1F, 2.8F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 99).addBox(2.5F, -0.1F, -1.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(45, 0).addBox(-3.5F, -0.1F, -1.2F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(52, 76).addBox(-2.5F, 5.9F, -5.2F, 5.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(8.25F, -33.25F, 0.0F));

		PartDefinition upper_arm = left_arm.addOrReplaceChild("upper_arm", CubeListBuilder.create().texOffs(60, 61).addBox(-0.25F, -1.75F, -3.0F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_arm = left_arm.addOrReplaceChild("bottom_arm", CubeListBuilder.create().texOffs(74, 28).addBox(-0.25F, -0.75F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition left_hand = bottom_arm.addOrReplaceChild("left_hand", CubeListBuilder.create().texOffs(28, 76).addBox(-4.05F, 2.5F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 76).addBox(-2.05F, 2.5F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(74, 31).addBox(-0.05F, 2.5F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(73, 28).addBox(1.95F, 2.5F, -2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(28, 73).addBox(1.95F, 2.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 73).addBox(1.95F, 2.5F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(68, 28).addBox(0.95F, 2.5F, 3.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 63).addBox(-1.05F, 2.5F, 3.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(63, 28).addBox(-3.05F, 2.5F, 3.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 87).addBox(-4.05F, 0.5F, -2.85F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(3.8F, 5.75F, -0.15F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-8.25F, -33.25F, 0.0F));

		PartDefinition upper_arm2 = right_arm.addOrReplaceChild("upper_arm2", CubeListBuilder.create().texOffs(33, 61).addBox(-6.75F, -1.75F, -3.0F, 7.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bottom_arm2 = right_arm.addOrReplaceChild("bottom_arm2", CubeListBuilder.create().texOffs(0, 73).addBox(-5.75F, 0.25F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 6.0F, 0.0F));

		PartDefinition right_hand = bottom_arm2.addOrReplaceChild("right_hand", CubeListBuilder.create().texOffs(33, 60).addBox(3.05F, 2.5F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 28).addBox(1.05F, 2.5F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 55).addBox(-0.95F, 2.5F, -3.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 52).addBox(-2.95F, 2.5F, -2.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(54, 49).addBox(-2.95F, 2.5F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 28).addBox(-2.95F, 2.5F, 1.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(48, 28).addBox(-1.95F, 2.5F, 3.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 44).addBox(0.05F, 2.5F, 3.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(2.05F, 2.5F, 3.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 9).addBox(-1.95F, 0.5F, -2.85F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.8F, 6.75F, -0.15F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.WALK, limbSwing, limbSwingAmount, 2.0f, 2.5f);
		this.animate(((ArmoredBossEntity) entity).idleAnimationState, ModAnimationDefinitions.IDLE, ageInTicks, 1.0f);
		this.animate(((ArmoredBossEntity) entity).attackAnimationState, ModAnimationDefinitions.ATTACK2, ageInTicks, 1.0f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return body;
	}
}