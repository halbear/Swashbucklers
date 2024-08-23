package hal.studios.hpm.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcutterdamaged<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hpm", "modelcutterdamaged"), "main");
	public final ModelPart wheel;
	public final ModelPart bone23;

	public Modelcutterdamaged(ModelPart root) {
		this.wheel = root.getChild("wheel");
		this.bone23 = root.getChild("bone23");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition wheel = partdefinition.addOrReplaceChild("wheel", CubeListBuilder.create().texOffs(183, 222).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 12.25F, -4.125F, -0.1309F, 0.0F, 0.0F));
		PartDefinition bone23 = partdefinition.addOrReplaceChild("bone23",
				CubeListBuilder.create().texOffs(0, 250).addBox(-12.0F, -16.0F, 17.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -8.0F, 17.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(65, 197)
						.addBox(12.0F, -14.0F, -38.0F, 0.0F, 4.0F, 55.0F, new CubeDeformation(0.0F)).texOffs(65, 197).mirror().addBox(-12.0F, -14.0F, -38.0F, 0.0F, 4.0F, 55.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 16)
						.addBox(-1.0F, -17.0F, -7.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, -8.0F, -27.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -16.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 169).addBox(7.5F, -9.0F, -38.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(132, 171)
						.addBox(4.5F, -9.0F, -11.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(60, 2).addBox(-4.5F, -3.0F, -38.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)).texOffs(96, 58)
						.addBox(-1.5F, -2.625F, -38.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)).texOffs(60, 2).mirror().addBox(1.5F, -3.0F, -38.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 42)
						.addBox(-10.5F, -10.8937F, 15.5562F, 21.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 70).addBox(-1.6062F, -12.2625F, 14.4875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 70)
						.addBox(-6.8938F, -12.1688F, 14.375F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 49).addBox(-2.3375F, -7.3375F, 15.8188F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 19)
						.addBox(-5.8312F, -10.125F, 15.9313F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 49).addBox(-7.8312F, -6.025F, 15.9313F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(89, 25)
						.addBox(-4.5F, -6.0F, 15.5F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 28.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
		PartDefinition cube_r1 = bone23
				.addOrReplaceChild(
						"cube_r1", CubeListBuilder.create().texOffs(89, 32).addBox(-11.3384F, -12.3168F, 28.875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 34)
								.addBox(-9.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 114).mirror().addBox(4.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 54.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r2 = bone23
				.addOrReplaceChild(
						"cube_r2", CubeListBuilder.create().texOffs(89, 18).addBox(2.8384F, -12.4668F, 28.8188F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(103, 66)
								.addBox(6.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 114).addBox(-7.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 54.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r3 = bone23.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(30, 28).addBox(-7.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r4 = bone23
				.addOrReplaceChild(
						"cube_r4", CubeListBuilder.create().texOffs(0, 139).addBox(-11.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(105, 171)
								.addBox(-11.7417F, 2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(194, 56).addBox(-8.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r5 = bone23.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 29).addBox(4.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r6 = bone23
				.addOrReplaceChild(
						"cube_r6", CubeListBuilder.create().texOffs(89, 122).addBox(5.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(105, 171).mirror()
								.addBox(8.7417F, 2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(194, 56).mirror().addBox(5.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r7 = bone23.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(198, 171).mirror().addBox(7.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0105F, 0.0F, -1.309F));
		PartDefinition cube_r8 = bone23.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(194, 73).mirror().addBox(8.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0436F, 0.0F, -0.7854F));
		PartDefinition cube_r9 = bone23.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(7.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0192F, 0.0F, -1.309F));
		PartDefinition cube_r10 = bone23.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(178, 143).mirror().addBox(5.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0524F, 0.0F, -0.7854F));
		PartDefinition cube_r11 = bone23.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(5.7417F, 2.7012F, -8.9654F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0087F, 0.0F, -0.7854F));
		PartDefinition cube_r12 = bone23.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(120, 114).mirror().addBox(8.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0175F, 0.0F, -0.7854F));
		PartDefinition cube_r13 = bone23.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(120, 137).mirror().addBox(7.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0175F, 0.0F, -1.309F));
		PartDefinition cube_r14 = bone23.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(120, 25).mirror().addBox(11.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.413F, 0.1451F, -1.2522F));
		PartDefinition cube_r15 = bone23.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(120, 33).mirror().addBox(10.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.333F, 0.1111F, -1.0056F));
		PartDefinition cube_r16 = bone23.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(120, 48).mirror().addBox(14.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.7905F, 0.2962F, -1.1949F));
		PartDefinition cube_r17 = bone23.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 161).mirror().addBox(13.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.7109F, 0.2332F, -1.3086F));
		PartDefinition cube_r18 = bone23.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(120, 114).mirror().addBox(8.4706F, 9.7197F, -26.1629F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.3079F, 0.1248F, -0.825F));
		PartDefinition cube_r19 = bone23.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(8.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.736F, 0.1159F, -0.8374F));
		PartDefinition cube_r20 = bone23.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(120, 122).mirror().addBox(9.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.2148F, 0.2404F, -0.3057F));
		PartDefinition cube_r21 = bone23.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(60, 139).mirror().addBox(9.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 28).mirror()
				.addBox(11.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.59F, 0.2404F, -0.3057F));
		PartDefinition cube_r22 = bone23.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(4.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.5729F, 0.1323F, -0.0849F));
		PartDefinition cube_r23 = bone23.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(147, 25).mirror().addBox(-1.75F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.74F, -7.0236F, -50.4552F, -0.581F, 0.2055F, -0.1332F));
		PartDefinition cube_r24 = bone23.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(5.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.1683F, 0.1721F, -0.0291F));
		PartDefinition cube_r25 = bone23.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(120, 122).addBox(-12.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.2148F, -0.2404F, 0.3057F));
		PartDefinition cube_r26 = bone23.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(30, 28).addBox(-12.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(60, 139).addBox(-11.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.59F, -0.2404F, 0.3057F));
		PartDefinition cube_r27 = bone23.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(120, 114).addBox(-11.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0175F, 0.0F, 0.7854F));
		PartDefinition cube_r28 = bone23.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(194, 73).addBox(-11.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0436F, 0.0F, 0.7854F));
		PartDefinition cube_r29 = bone23.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(60, 106).addBox(-8.7417F, 2.7012F, -8.9654F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0087F, 0.0F, 0.7854F));
		PartDefinition cube_r30 = bone23.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(178, 143).addBox(-8.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0524F, 0.0F, 0.7854F));
		PartDefinition cube_r31 = bone23.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(120, 114).addBox(-11.4706F, 9.7197F, -26.1629F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.3079F, -0.1248F, 0.825F));
		PartDefinition cube_r32 = bone23.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(60, 0).addBox(-11.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.736F, -0.1159F, 0.8374F));
		PartDefinition cube_r33 = bone23.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(120, 33).addBox(-13.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.333F, -0.1111F, 1.0056F));
		PartDefinition cube_r34 = bone23.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(120, 48).addBox(-17.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.7905F, -0.2962F, 1.1949F));
		PartDefinition cube_r35 = bone23.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(120, 137).addBox(-10.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0175F, 0.0F, 1.309F));
		PartDefinition cube_r36 = bone23.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(131, 60).addBox(-9.922F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.4363F, 0.0F, 1.5708F));
		PartDefinition cube_r37 = bone23.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(120, 25).addBox(-14.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.413F, -0.1451F, 1.2522F));
		PartDefinition cube_r38 = bone23.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(120, 115).addBox(-9.922F, 10.3831F, -24.014F, 2.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r39 = bone23.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(85, 200).addBox(-9.922F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.7418F, 0.0F, 1.5708F));
		PartDefinition cube_r40 = bone23.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 161).addBox(-16.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.7109F, -0.2332F, 1.3086F));
		PartDefinition cube_r41 = bone23.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(198, 171).addBox(-10.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0105F, 0.0F, 1.309F));
		PartDefinition cube_r42 = bone23.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 106).addBox(-10.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0192F, 0.0F, 1.309F));
		PartDefinition cube_r43 = bone23.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(114, 246).mirror().addBox(-0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.9628F, -12.422F, -38.0407F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r44 = bone23.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(132, 238).mirror().addBox(0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.5128F, -12.422F, -43.4907F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r45 = bone23.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(132, 238).addBox(-0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5128F, -12.422F, -43.4907F, 0.0F, 0.7418F, 0.0F));
		PartDefinition cube_r46 = bone23.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(114, 246).addBox(0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9628F, -12.422F, -38.0407F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r47 = bone23.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 40).addBox(7.422F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.4363F, 0.0F, -1.5708F));
		PartDefinition cube_r48 = bone23.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(120, 0).addBox(7.422F, 10.3831F, -24.014F, 2.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r49 = bone23.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(53, 200).addBox(7.422F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.7418F, 0.0F, -1.5708F));
		PartDefinition cube_r50 = bone23.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 131).addBox(-1.5F, 2.3361F, -29.6709F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.1658F, 0.0F, 0.0F));
		PartDefinition cube_r51 = bone23.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(0, 131).addBox(-8.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.1683F, -0.1721F, 0.0291F));
		PartDefinition cube_r52 = bone23.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(147, 25).addBox(-0.25F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.74F, -7.0236F, -50.4552F, -0.581F, -0.2055F, 0.1332F));
		PartDefinition cube_r53 = bone23.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(101, 37).addBox(-7.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.5729F, -0.1323F, 0.0849F));
		PartDefinition cube_r54 = bone23.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(67, 223).addBox(-1.0F, 11.6135F, -53.7362F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(41, 222).addBox(-1.5F, 12.6135F, -44.7362F, 3.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r55 = bone23.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(190, 12).addBox(-1.5F, -8.2346F, -23.8801F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(36, 175).addBox(-4.5F, -8.1822F, -23.8806F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r56 = bone23.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(179, 93).addBox(-1.5F, -6.2918F, -38.688F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0698F, 0.0F, 0.0F));
		PartDefinition cube_r57 = bone23.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(146, 12).addBox(-3.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0695F, -0.0061F, -0.0871F));
		PartDefinition cube_r58 = bone23.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(60, 25).addBox(-7.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0697F, -0.003F, -0.0435F));
		PartDefinition cube_r59 = bone23.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(146, 0).addBox(0.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0695F, 0.0061F, 0.0871F));
		PartDefinition cube_r60 = bone23.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(60, 10).addBox(4.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0697F, 0.003F, 0.0435F));
		PartDefinition cube_r61 = bone23.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(89, 9).addBox(-19.7634F, -6.5126F, -25.1741F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.077F, -0.4382F, -0.011F));
		PartDefinition cube_r62 = bone23.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(144, 137).addBox(-28.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.1034F, -0.8294F, 0.0326F));
		PartDefinition cube_r63 = bone23.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(84, 131).addBox(25.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.1034F, 0.8294F, -0.0326F));
		PartDefinition cube_r64 = bone23.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(89, 0).addBox(16.7634F, -6.8126F, -25.1741F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.077F, 0.4382F, 0.011F));
		PartDefinition cube_r65 = bone23.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(0, 193).addBox(-1.8533F, -8.173F, 2.8808F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0175F, 0.0F, 0.0524F));
		PartDefinition cube_r66 = bone23.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(135, 174).addBox(-10.7301F, -7.6818F, -24.0F, 3.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, 0.0349F));
		PartDefinition cube_r67 = bone23.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(0, 161).addBox(-10.1344F, -8.0386F, 0.2444F, 3.0F, 2.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0349F, 0.0F, -0.0524F));
		PartDefinition cube_r68 = bone23
				.addOrReplaceChild(
						"cube_r68", CubeListBuilder.create().texOffs(36, 161).addBox(4.5F, -8.4147F, -23.7571F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(72, 171)
								.addBox(7.5F, -7.5247F, 3.2273F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(165, 173).addBox(-7.5F, -7.4724F, 3.2264F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0349F, 0.0F, 0.0F));
		PartDefinition cube_r69 = bone23.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(178, 114).addBox(-4.5F, -8.0F, 3.0F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, 0.0F, 0.0F, 0.0175F));
		PartDefinition cube_r70 = bone23.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 175).addBox(1.2626F, -7.9425F, -24.1182F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0175F, 0.0F, 0.0349F));
		PartDefinition cube_r71 = bone23.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(178, 0).addBox(1.5F, -8.2608F, 2.8799F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(129, 171).addBox(-7.5F, -7.8419F, -24.1164F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -14.5F, -0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r72 = bone23.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(238, 123).addBox(0.3098F, -14.1271F, -4.9048F, 0.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.688F, -13.7857F, -31.2702F, -0.0118F, 0.0129F, 0.4799F));
		PartDefinition cube_r73 = bone23.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(238, 92).mirror().addBox(-0.2846F, -31.1356F, -5.118F, 0.0F, 31.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.688F, -13.7857F, -7.2702F, -0.0169F, -0.0045F, 0.0873F));
		PartDefinition cube_r74 = bone23.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(238, 92).addBox(0.2846F, -31.1356F, -5.118F, 0.0F, 31.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.688F, -13.7857F, -7.2702F, -0.0164F, -0.006F, -0.6981F));
		PartDefinition cube_r75 = bone23.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(238, 123).mirror().addBox(-0.3098F, -14.1271F, -4.9048F, 0.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.688F, -13.7857F, -31.2702F, -0.0118F, -0.0129F, -0.4799F));
		PartDefinition mast = bone23.addOrReplaceChild("mast", CubeListBuilder.create().texOffs(18, 16).addBox(-0.75F, -39.0F, -18.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, -13.0F));
		PartDefinition bone2 = mast.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -13.5F, -6.1569F));
		PartDefinition cube_r76 = bone2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r77 = bone3.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r78 = bone3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r81 = bone5.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone7 = mast.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, 4.5F, -6.1569F));
		PartDefinition cube_r84 = bone7.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r85 = bone8.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(16, 106).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r86 = bone8.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(29, 106).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r87 = bone9.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(8, 106).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r88 = bone9.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(12, 106).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r89 = bone10.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(48, 0).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r90 = bone10.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(0, 106).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r91 = bone10.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(4, 106).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone22 = bone23.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5195F, -15.625F, -36.1749F, 0.0F, 1.4835F, 0.0F));
		PartDefinition cube_r92 = bone22.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(207, 222).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 215).addBox(-2.0F, 0.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 209)
						.addBox(-2.0F, 0.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 3.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 0.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone21 = bone23.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5195F, -15.625F, -43.1749F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r93 = bone21.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(218, 232).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 232).addBox(-2.0F, 0.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 232)
						.addBox(-2.0F, 0.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 3.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 0.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone20 = bone23.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4805F, -15.625F, -38.1749F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r94 = bone20.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(218, 226).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(218, 220).addBox(-2.0F, 0.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(218, 214)
						.addBox(-2.0F, 0.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 3.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 0.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone = bone23.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(8.0F, 0.0F, 0.0F));
		PartDefinition cube_r95 = bone.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(207, 222).addBox(-2.0F, -2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 215).addBox(-2.0F, -1.75F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 209)
						.addBox(-2.0F, -1.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, -1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -3.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -13.0F, 12.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone19 = bone23.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -14.0F, 11.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition chestlid = bone19.addOrReplaceChild("chestlid", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -0.0375F, -1.309F, 0.0F, 0.0F));
		PartDefinition cube_r96 = chestlid.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(154, 213).addBox(-4.0F, -25.8801F, -1.7618F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.9376F, -23.1872F, -0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r97 = chestlid.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(154, 213).addBox(-3.99F, 4.6253F, 20.6501F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.9376F, -18.1872F, 0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r98 = chestlid.addOrReplaceChild("cube_r98",
				CubeListBuilder.create().texOffs(157, 209).addBox(1.09F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(157, 209).addBox(-4.11F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 9.4376F, -20.6872F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r99 = chestlid.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(172, 217).addBox(-4.0F, 21.5677F, 3.9022F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 10.9376F, -23.1872F, 1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r100 = chestlid.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(174, 211).addBox(-4.01F, 13.2483F, 12.9228F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 10.9376F, -18.1872F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chest = bone19.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(124, 207).addBox(-4.0F, -13.0F, 30.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, -34.0F));
		PartDefinition mast2 = bone23.addOrReplaceChild("mast2",
				CubeListBuilder.create().texOffs(18, 16).addBox(-0.625F, -39.6667F, -0.1667F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 0).addBox(-0.5F, -15.6667F, 0.5833F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -9.3333F, -7.5833F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r101 = mast2.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(42, 42).addBox(0.0F, -7.0F, -61.0F, 0.0F, 31.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.125F, -27.6667F, -36.4167F, 0.0F, 3.1416F, 0.0F));
		PartDefinition bone6 = mast2.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(0.125F, -14.1667F, 12.4265F));
		PartDefinition cube_r102 = bone6.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone11 = bone6.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r103 = bone11.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r104 = bone11.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone12 = bone6.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r105 = bone12.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r106 = bone12.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone14 = bone12.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r107 = bone14.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r108 = bone14.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r109 = bone14.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone15 = mast2.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(0.125F, 3.8333F, 12.4265F));
		PartDefinition cube_r110 = bone15.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r111 = bone16.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(16, 106).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r112 = bone16.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(29, 106).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r113 = bone17.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(8, 106).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r114 = bone17.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(12, 106).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r115 = bone18.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(48, 0).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r116 = bone18.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 106).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r117 = bone18.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(4, 106).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition flag2 = mast2.addOrReplaceChild("flag2",
				CubeListBuilder.create().texOffs(0, 17).addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.2539F, -37.6667F, 0.7449F, -0.9163F, 0.0F, 0.0F));
		PartDefinition cube_r118 = flag2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(10, 0).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, 0.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r119 = flag2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, 0.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));
		PartDefinition flag = bone23.addOrReplaceChild("flag",
				CubeListBuilder.create().texOffs(34, 32).addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3789F, -47.0F, -30.8384F));
		PartDefinition cube_r120 = flag.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(4, 31).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, 0.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r121 = flag.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(30, 32).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, 0.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone13 = bone23.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -39.0F));
		PartDefinition cube_r122 = bone13.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(68, 64).addBox(-17.0F, -1.5F, -0.25F, 34.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.7375F, 7.25F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r123 = bone13.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(68, 58).addBox(-17.0F, -3.992F, 0.0261F, 34.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.9875F, 6.3625F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r124 = bone13.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(0, 58).addBox(-17.0F, -5.425F, -0.325F, 34.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -35.334F, 6.0363F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r125 = bone13.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 66).addBox(-17.0F, -0.008F, 0.0261F, 34.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -41.825F, 6.3875F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r126 = bone13.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(68, 62).addBox(-17.0F, -0.5F, -0.25F, 34.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -43.075F, 7.275F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r127 = bone13.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(156, 56).addBox(0.125F, -0.5F, -18.0F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -24.5F, 7.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r128 = bone13.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(118, 194).addBox(0.0F, -7.0F, -25.0F, 0.0F, 31.0F, 25.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -37.0F, -5.0F, 0.0F, 3.1416F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		wheel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone23.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.wheel.zRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
