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
public class ModelcutterRearWreckremade<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hpm", "modelcutter_rear_wreckremade"), "main");
	public final ModelPart Hull;
	public final ModelPart wheel;
	public final ModelPart mast;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone5;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart bone10;
	public final ModelPart bone6;
	public final ModelPart bone11;
	public final ModelPart bone12;
	public final ModelPart bone14;
	public final ModelPart bone13;
	public final ModelPart flag;
	public final ModelPart Decorations;
	public final ModelPart bone;
	public final ModelPart bone19;
	public final ModelPart chestlid;
	public final ModelPart chest;

	public ModelcutterRearWreckremade(ModelPart root) {
		this.Hull = root.getChild("Hull");
		this.wheel = root.getChild("wheel");
		this.mast = root.getChild("mast");
		this.bone2 = this.mast.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone2.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone7 = this.mast.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone7.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone6 = this.mast.getChild("bone6");
		this.bone11 = this.bone6.getChild("bone11");
		this.bone12 = this.bone6.getChild("bone12");
		this.bone14 = this.bone12.getChild("bone14");
		this.bone13 = this.mast.getChild("bone13");
		this.flag = this.mast.getChild("flag");
		this.Decorations = root.getChild("Decorations");
		this.bone = this.Decorations.getChild("bone");
		this.bone19 = this.Decorations.getChild("bone19");
		this.chestlid = this.bone19.getChild("chestlid");
		this.chest = this.bone19.getChild("chest");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Hull = partdefinition.addOrReplaceChild("Hull",
				CubeListBuilder.create().texOffs(132, 171).addBox(4.5F, -9.0F, -0.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(153, 192).addBox(4.5F, -9.0F, -6.5F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(85, 27)
						.addBox(-4.5F, -3.0F, -2.5F, 3.0F, 2.0F, 29.0F, new CubeDeformation(0.0F)).texOffs(123, 85).addBox(-1.5F, -2.625F, -0.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(83, 25).mirror()
						.addBox(1.5F, -3.0F, -4.5F, 3.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 42).addBox(-10.5F, -10.8938F, 26.5562F, 21.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 181)
						.addBox(-1.6062F, -12.2625F, 25.4875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(73, 179).addBox(-6.8937F, -12.1687F, 25.375F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-2.3375F, -7.3375F, 26.8188F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 19).addBox(-5.8312F, -10.125F, 26.9312F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 49)
						.addBox(-7.0812F, -6.025F, 26.9312F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(89, 25).addBox(-4.5F, -6.0F, 26.5F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -16.5F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 16).addBox(-1.0F, -17.0F, 4.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 250)
						.addBox(-12.0F, -16.0F, 28.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -8.0F, 28.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(254, 0)
						.addBox(-10.0F, -9.0F, 3.0F, 22.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.3F, 24.0F, -11.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r1 = Hull
				.addOrReplaceChild(
						"cube_r1", CubeListBuilder.create().texOffs(89, 32).addBox(-11.3384F, -12.3168F, 28.875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 34)
								.addBox(-9.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(79, 133).mirror().addBox(4.3467F, 0.1647F, -5.0F, 3.0F, 1.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r2 = Hull
				.addOrReplaceChild(
						"cube_r2", CubeListBuilder.create().texOffs(89, 18).addBox(2.8384F, -12.4668F, 28.8188F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 176)
								.addBox(6.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(90, 144).addBox(-7.3467F, 0.1647F, 6.0F, 3.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r3 = Hull.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(14, 29).mirror().addBox(-7.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r4 = Hull.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(89, 122).mirror().addBox(-11.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 171).addBox(-11.7417F,
				2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r5 = Hull.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(14, 29).addBox(4.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r6 = Hull.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(89, 122).addBox(5.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(105, 171).mirror()
				.addBox(8.7417F, 2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r7 = Hull.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(198, 171).mirror().addBox(7.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0105F, 0.0F, -1.309F));
		PartDefinition cube_r8 = Hull.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(194, 73).mirror().addBox(8.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0436F, 0.0F, -0.7854F));
		PartDefinition cube_r9 = Hull.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(7.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0192F, 0.0F, -1.309F));
		PartDefinition cube_r10 = Hull.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(178, 143).mirror().addBox(5.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0524F, 0.0F, -0.7854F));
		PartDefinition cube_r11 = Hull.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(5.7417F, 2.7012F, -8.9654F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0087F, 0.0F, -0.7854F));
		PartDefinition cube_r12 = Hull.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(194, 73).addBox(-11.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0436F, 0.0F, 0.7854F));
		PartDefinition cube_r13 = Hull.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(181, 146).addBox(-1.5F, -1.0F, -6.5F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.6318F, -3.6096F, 2.4825F, -0.0785F, 0.0F, 0.7854F));
		PartDefinition cube_r14 = Hull.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(178, 143).addBox(-8.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0524F, 0.0F, 0.7854F));
		PartDefinition cube_r15 = Hull.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 106).addBox(-10.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0192F, 0.0F, 1.309F));
		PartDefinition cube_r16 = Hull.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(141, 21).mirror().addBox(-9.422F, 10.3831F, -3.014F, 2.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4F, -1.0F, -3.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r17 = Hull.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(134, 14).addBox(7.422F, 10.3831F, -10.014F, 2.0F, 2.0F, 40.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -1.0F, -3.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r18 = Hull.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(199, 21).addBox(1.5F, -8.2608F, 4.8799F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -11.5F, -0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r19 = Hull.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(21, 214).addBox(-1.8533F, -8.173F, 4.8808F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -11.5F, -0.0175F, 0.0F, 0.0524F));
		PartDefinition cube_r20 = Hull.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(206, 99).addBox(-4.5F, -8.0F, 5.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(72, 172).addBox(-4.5F, -8.0F, 11.0F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -11.5F, 0.0F, 0.0F, 0.0175F));
		PartDefinition cube_r21 = Hull.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(186, 194).addBox(-7.5F, -7.4724F, 5.2264F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -11.5F, 0.0349F, 0.0F, 0.0F));
		PartDefinition cube_r22 = Hull.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 193).addBox(-1.8533F, -8.173F, 2.8808F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.0524F));
		PartDefinition cube_r23 = Hull.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 161).addBox(-10.1344F, -8.0386F, 0.2444F, 3.0F, 2.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0349F, 0.0F, -0.0524F));
		PartDefinition cube_r24 = Hull.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(72, 171).addBox(7.5F, -7.5247F, 3.2273F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(165, 173).addBox(-7.5F, -7.4724F, 3.2264F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0349F, 0.0F, 0.0F));
		PartDefinition cube_r25 = Hull.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(178, 0).addBox(1.5F, -8.2608F, 2.8799F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.0F));
		PartDefinition wheel = partdefinition.addOrReplaceChild("wheel", CubeListBuilder.create().texOffs(183, 222).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -4.75F));
		PartDefinition mast = partdefinition.addOrReplaceChild("mast", CubeListBuilder.create().texOffs(18, 16).addBox(-0.75F, -53.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -15.0F, 0.0F, 0.0F, 1.5272F));
		PartDefinition cube_r26 = mast.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(210, 5).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, -15).addBox(0.75F, -28.0F, -43.0F, 0.0F, 47.0F, 74.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.75F, -19.0F, 1.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition bone2 = mast.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -27.5F, 11.8431F));
		PartDefinition cube_r27 = bone2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r28 = bone3.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r29 = bone3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r30 = bone4.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r31 = bone4.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r32 = bone5.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r33 = bone5.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r34 = bone5.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone7 = mast.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, -9.5F, 11.8431F));
		PartDefinition cube_r35 = bone7.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r36 = bone8.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(16, 106).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r37 = bone8.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(29, 106).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r38 = bone9.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(8, 106).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r39 = bone9.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(12, 106).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r40 = bone10.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(48, 0).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r41 = bone10.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(0, 106).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r42 = bone10.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(4, 106).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone6 = mast.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3535F, 2.0F, -0.8033F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r43 = bone6.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(298, 106).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3535F, 1.5F, -0.3535F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone11 = bone6.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.641F, 10.5F, 11.6464F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r44 = bone11.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(288, 106).addBox(7.9853F, -10.5F, 7.4853F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r45 = bone11.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(294, 106).addBox(0.15F, -10.5F, -11.9375F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone12 = bone6.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.641F, 10.5F, 11.3714F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r46 = bone12.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(280, 106).addBox(7.9853F, -10.5F, -9.4853F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r47 = bone12.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(284, 106).addBox(-11.85F, -10.5F, 0.0625F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone14 = bone12.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r48 = bone14.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(266, 105).addBox(-8.9853F, -10.5F, -9.4853F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r49 = bone14.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(272, 106).addBox(-12.3625F, -10.5F, -1.0625F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r50 = bone14.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(276, 106).addBox(0.15F, -10.5F, 12.0625F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone13 = mast.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -8.0F));
		PartDefinition cube_r51 = bone13.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(108, 245).addBox(-17.0F, -1.5F, -0.25F, 34.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.7375F, 7.25F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r52 = bone13.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(108, 241).addBox(-17.0F, -3.992F, 0.0261F, 34.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.9875F, 6.3625F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r53 = bone13.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(108, 233).addBox(-17.0F, -5.425F, -0.325F, 34.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -35.334F, 6.0363F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r54 = bone13.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(108, 229).addBox(-17.0F, -0.008F, 0.0261F, 34.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -41.825F, 6.3875F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r55 = bone13.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(108, 227).addBox(-17.0F, -0.5F, -0.25F, 34.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -43.075F, 7.275F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r56 = bone13.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(185, 118).addBox(0.125F, -0.5F, -12.0F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -43.5F, 7.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r57 = bone13.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(156, 56).addBox(0.125F, -0.5F, -18.0F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -24.5F, 7.0F, 0.0F, -1.5708F, 0.0873F));
		PartDefinition flag = mast.addOrReplaceChild("flag",
				CubeListBuilder.create().texOffs(34, 32).addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3789F, -51.0F, 0.1616F));
		PartDefinition cube_r58 = flag.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(4, 31).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, 0.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r59 = flag.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(30, 32).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, 0.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));
		PartDefinition Decorations = partdefinition.addOrReplaceChild("Decorations", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bone = Decorations.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(8.0F, 0.0F, 0.0F));
		PartDefinition cube_r60 = bone.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(206, 222).addBox(-2.0F, -2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(206, 215).addBox(-2.0F, -1.75F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(206, 209)
						.addBox(-2.0F, -1.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, -1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -3.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -13.0F, 12.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone19 = Decorations.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-6.0F, -14.0F, 11.0F, 0.0F, -0.6545F, 0.0F));
		PartDefinition chestlid = bone19.addOrReplaceChild("chestlid", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -21.0375F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r61 = chestlid.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(154, 213).addBox(-4.0F, -25.8801F, -1.7618F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -4.1548F, -0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r62 = chestlid.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(154, 213).addBox(-3.99F, 4.6253F, 20.6501F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r63 = chestlid.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(157, 209).addBox(1.09F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(157, 209).addBox(-4.11F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, -1.6548F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r64 = chestlid.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(172, 217).addBox(-4.0F, 21.5677F, 3.9022F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, -4.1548F, 1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r65 = chestlid.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(174, 211).addBox(-4.01F, 13.2483F, 12.9228F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chest = bone19.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(124, 207).addBox(-4.0F, -13.0F, 30.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, -34.0F));
		return LayerDefinition.create(meshdefinition, 384, 384);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Hull.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wheel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mast.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Decorations.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
