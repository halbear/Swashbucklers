package hal.studios.hpm.client.model;

import net.minecraft.world.entity.Entity;
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

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelcutterdWreckFrontremade<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hpm", "modelcutterd_wreck_frontremade"), "main");
	public final ModelPart Hull;
	public final ModelPart wheel;
	public final ModelPart Decorations;
	public final ModelPart bone22;
	public final ModelPart bone21;
	public final ModelPart bone20;
	public final ModelPart bone;
	public final ModelPart bone19;
	public final ModelPart chestlid;
	public final ModelPart chest;

	public ModelcutterdWreckFrontremade(ModelPart root) {
		this.Hull = root.getChild("Hull");
		this.wheel = this.Hull.getChild("wheel");
		this.Decorations = this.Hull.getChild("Decorations");
		this.bone22 = this.Decorations.getChild("bone22");
		this.bone21 = this.Decorations.getChild("bone21");
		this.bone20 = this.Decorations.getChild("bone20");
		this.bone = this.Decorations.getChild("bone");
		this.bone19 = this.Decorations.getChild("bone19");
		this.chestlid = this.bone19.getChild("chestlid");
		this.chest = this.bone19.getChild("chest");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Hull = partdefinition.addOrReplaceChild("Hull",
				CubeListBuilder.create().texOffs(44, 174).addBox(7.5F, -9.0F, -27.5F, 3.0F, 2.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(89, 31).addBox(-4.5F, -3.0F, -27.5F, 3.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(126, 88)
						.addBox(-1.5F, -2.625F, -27.5F, 3.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(89, 31).mirror().addBox(1.5F, -3.0F, -27.5F, 3.0F, 2.0F, 25.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0)
						.addBox(-8.0F, -8.5F, -22.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(254, 0).addBox(-10.0F, -8.5F, -13.0F, 22.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, 24.0F, 16.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r1 = Hull.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(194, 56).mirror().addBox(5.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r2 = Hull.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(120, 114).mirror().addBox(8.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, -0.7854F));
		PartDefinition cube_r3 = Hull.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(120, 137).mirror().addBox(7.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, -1.309F));
		PartDefinition cube_r4 = Hull.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(120, 25).mirror().addBox(11.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.413F, 0.1451F, -1.2522F));
		PartDefinition cube_r5 = Hull.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 33).mirror().addBox(10.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.333F, 0.1111F, -1.0056F));
		PartDefinition cube_r6 = Hull.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(120, 48).mirror().addBox(14.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.7905F, 0.2962F, -1.1949F));
		PartDefinition cube_r7 = Hull.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 161).mirror().addBox(13.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.7109F, 0.2332F, -1.3086F));
		PartDefinition cube_r8 = Hull.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(120, 114).mirror().addBox(8.4706F, 9.7197F, -26.163F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.3079F, 0.1248F, -0.825F));
		PartDefinition cube_r9 = Hull.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(8.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.736F, 0.1159F, -0.8374F));
		PartDefinition cube_r10 = Hull.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(120, 122).mirror().addBox(9.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.2148F, 0.2404F, -0.3057F));
		PartDefinition cube_r11 = Hull.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 139).mirror().addBox(9.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 28).mirror()
				.addBox(11.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.59F, 0.2404F, -0.3057F));
		PartDefinition cube_r12 = Hull.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(4.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.5729F, 0.1323F, -0.0849F));
		PartDefinition cube_r13 = Hull.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(147, 25).mirror().addBox(-1.75F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.74F, -7.0236F, -39.4552F, -0.581F, 0.2055F, -0.1332F));
		PartDefinition cube_r14 = Hull.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(5.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1683F, 0.1721F, -0.0291F));
		PartDefinition cube_r15 = Hull.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(94, 148).mirror().addBox(4.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r16 = Hull.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(96, 150).addBox(-7.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r17 = Hull.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(120, 122).addBox(-12.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.2148F, -0.2404F, 0.3057F));
		PartDefinition cube_r18 = Hull.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(30, 28).addBox(-12.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(60, 139).addBox(-11.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.59F, -0.2404F, 0.3057F));
		PartDefinition cube_r19 = Hull.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(120, 114).addBox(-11.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.7854F));
		PartDefinition cube_r20 = Hull.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(194, 56).addBox(-8.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r21 = Hull.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(120, 114).addBox(-11.4706F, 9.7197F, -26.163F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.3079F, -0.1248F, 0.825F));
		PartDefinition cube_r22 = Hull.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(60, 0).addBox(-11.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.736F, -0.1159F, 0.8374F));
		PartDefinition cube_r23 = Hull.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(120, 33).addBox(-13.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.333F, -0.1111F, 1.0056F));
		PartDefinition cube_r24 = Hull.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(120, 48).addBox(-17.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.7905F, -0.2962F, 1.1949F));
		PartDefinition cube_r25 = Hull.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(120, 137).addBox(-10.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 1.309F));
		PartDefinition cube_r26 = Hull.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(120, 25).addBox(-14.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.413F, -0.1451F, 1.2522F));
		PartDefinition cube_r27 = Hull.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 161).addBox(-16.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.7109F, -0.2332F, 1.3086F));
		PartDefinition cube_r28 = Hull.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(114, 246).mirror().addBox(-0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.9628F, -12.422F, -27.0407F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r29 = Hull.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(140, 238).mirror().addBox(0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.5128F, -12.422F, -32.4907F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r30 = Hull.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(140, 238).addBox(-0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5128F, -12.422F, -32.4907F, 0.0F, 0.7418F, 0.0F));
		PartDefinition cube_r31 = Hull.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(114, 246).addBox(0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9628F, -12.422F, -27.0407F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r32 = Hull.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-9.422F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4F, -1.0F, -3.5F, -0.4363F, 0.0F, 1.5708F));
		PartDefinition cube_r33 = Hull.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(148, 28).mirror().addBox(-9.422F, 10.3831F, -24.014F, 2.0F, 2.0F, 26.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4F, -1.0F, -3.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r34 = Hull.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(66, 40).addBox(7.422F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -1.0F, -3.5F, -0.4363F, 0.0F, -1.5708F));
		PartDefinition cube_r35 = Hull.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(150, 30).addBox(7.422F, 10.3831F, -24.014F, 2.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -1.0F, -3.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r36 = Hull.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(53, 200).mirror().addBox(-9.422F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.9F, -0.7418F, 0.0F, 1.5708F));
		PartDefinition cube_r37 = Hull.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(53, 200).addBox(7.422F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.9F, -0.7418F, 0.0F, -1.5708F));
		PartDefinition cube_r38 = Hull.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(60, 131).addBox(-1.5F, 2.3361F, -29.6709F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1658F, 0.0F, 0.0F));
		PartDefinition cube_r39 = Hull.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(0, 131).addBox(-8.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1683F, -0.1721F, 0.0291F));
		PartDefinition cube_r40 = Hull.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(147, 25).addBox(-0.25F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.74F, -7.0236F, -39.4552F, -0.581F, -0.2055F, 0.1332F));
		PartDefinition cube_r41 = Hull.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(101, 37).addBox(-7.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.5729F, -0.1323F, 0.0849F));
		PartDefinition cube_r42 = Hull.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(67, 223).addBox(-1.0F, 11.6135F, -53.7362F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(41, 222).addBox(-1.5F, 12.6135F, -44.7362F, 3.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r43 = Hull.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(206, 99).addBox(-1.5F, -8.2346F, -23.8801F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 181).addBox(-4.5F, -8.1822F, -23.8806F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r44 = Hull.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(179, 93).addBox(-1.5F, -6.2918F, -38.688F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0698F, 0.0F, 0.0F));
		PartDefinition cube_r45 = Hull.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(146, 12).addBox(-3.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0695F, -0.0061F, -0.0871F));
		PartDefinition cube_r46 = Hull.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(60, 25).addBox(-7.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0697F, -0.003F, -0.0435F));
		PartDefinition cube_r47 = Hull.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(146, 0).addBox(0.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0695F, 0.0061F, 0.0871F));
		PartDefinition cube_r48 = Hull.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 10).addBox(4.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0697F, 0.003F, 0.0435F));
		PartDefinition cube_r49 = Hull.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(89, 9).addBox(-19.7634F, -6.5126F, -25.1741F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.077F, -0.4382F, -0.011F));
		PartDefinition cube_r50 = Hull.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(144, 137).addBox(-28.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1034F, -0.8294F, 0.0326F));
		PartDefinition cube_r51 = Hull.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(84, 131).addBox(25.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1034F, 0.8294F, -0.0326F));
		PartDefinition cube_r52 = Hull.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(89, 0).addBox(16.7634F, -6.8126F, -25.1741F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.077F, 0.4382F, 0.011F));
		PartDefinition cube_r53 = Hull.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(135, 174).addBox(-10.7301F, -7.6818F, -24.0F, 3.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.0349F));
		PartDefinition cube_r54 = Hull.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(42, 167).addBox(4.5F, -8.4147F, -23.7571F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0349F, 0.0F, 0.0F));
		PartDefinition cube_r55 = Hull.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(6, 181).addBox(1.2626F, -7.9425F, -24.1182F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.0349F));
		PartDefinition cube_r56 = Hull.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(135, 177).addBox(-7.5F, -7.8419F, -24.1164F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.0F));
		PartDefinition wheel = Hull.addOrReplaceChild("wheel", CubeListBuilder.create(), PartPose.offset(1.3F, -16.0F, 6.25F));
		PartDefinition Decorations = Hull.addOrReplaceChild("Decorations", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7F, 0.0F, 11.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone22 = Decorations.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.5195F, -11.625F, -36.1749F, -1.4822F, 0.1739F, -1.5554F));
		PartDefinition cube_r57 = bone22.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(206, 222).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(206, 215).addBox(-2.0F, 0.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(206, 209)
						.addBox(-2.0F, 0.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 3.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 0.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone21 = Decorations.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.5195F, -15.625F, -43.1749F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r58 = bone21.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(218, 232).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 232).addBox(-2.0F, 0.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 232)
						.addBox(-2.0F, 0.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 3.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 0.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone20 = Decorations.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(6.4805F, -15.625F, -38.1749F, 0.0F, -0.2618F, 0.0F));
		PartDefinition cube_r59 = bone20.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(218, 226).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(218, 220).addBox(-2.0F, 0.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(218, 214)
						.addBox(-2.0F, 0.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 3.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 0.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone = Decorations.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(8.0F, 0.0F, 0.0F));
		PartDefinition bone19 = Decorations.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -14.0F, 11.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition chestlid = bone19.addOrReplaceChild("chestlid", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -21.0375F, -0.4363F, 0.0F, 0.0F));
		PartDefinition chest = bone19.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, -34.0F));
		return LayerDefinition.create(meshdefinition, 384, 384);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Hull.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
