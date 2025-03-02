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
public class ModelcutterArmedWreck<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hpm", "modelcutter_armed_wreck"), "main");
	public final ModelPart Hull;
	public final ModelPart Decorations;
	public final ModelPart bone22;
	public final ModelPart bone;
	public final ModelPart bone19;
	public final ModelPart chestlid;
	public final ModelPart chest;
	public final ModelPart bone23;
	public final ModelPart chest2;
	public final ModelPart CannonFront;
	public final ModelPart CannonRight;
	public final ModelPart CannonLeft;
	public final ModelPart mast;
	public final ModelPart bone2;
	public final ModelPart bone3;
	public final ModelPart bone4;
	public final ModelPart bone5;
	public final ModelPart bone7;
	public final ModelPart bone8;
	public final ModelPart bone9;
	public final ModelPart bone10;
	public final ModelPart bone15;
	public final ModelPart bone16;
	public final ModelPart bone17;
	public final ModelPart bone18;
	public final ModelPart bone6;
	public final ModelPart bone11;
	public final ModelPart bone12;
	public final ModelPart bone14;
	public final ModelPart bone13;
	public final ModelPart flag;

	public ModelcutterArmedWreck(ModelPart root) {
		this.Hull = root.getChild("Hull");
		this.Decorations = this.Hull.getChild("Decorations");
		this.bone22 = this.Decorations.getChild("bone22");
		this.bone = this.Decorations.getChild("bone");
		this.bone19 = this.Decorations.getChild("bone19");
		this.chestlid = this.bone19.getChild("chestlid");
		this.chest = this.bone19.getChild("chest");
		this.bone23 = this.Decorations.getChild("bone23");
		this.chest2 = this.bone23.getChild("chest2");
		this.CannonFront = this.Hull.getChild("CannonFront");
		this.CannonRight = this.Hull.getChild("CannonRight");
		this.CannonLeft = this.Hull.getChild("CannonLeft");
		this.mast = root.getChild("mast");
		this.bone2 = this.mast.getChild("bone2");
		this.bone3 = this.bone2.getChild("bone3");
		this.bone4 = this.bone2.getChild("bone4");
		this.bone5 = this.bone4.getChild("bone5");
		this.bone7 = this.mast.getChild("bone7");
		this.bone8 = this.bone7.getChild("bone8");
		this.bone9 = this.bone7.getChild("bone9");
		this.bone10 = this.bone9.getChild("bone10");
		this.bone15 = this.mast.getChild("bone15");
		this.bone16 = this.bone15.getChild("bone16");
		this.bone17 = this.bone15.getChild("bone17");
		this.bone18 = this.bone17.getChild("bone18");
		this.bone6 = this.mast.getChild("bone6");
		this.bone11 = this.bone6.getChild("bone11");
		this.bone12 = this.bone6.getChild("bone12");
		this.bone14 = this.bone12.getChild("bone14");
		this.bone13 = this.mast.getChild("bone13");
		this.flag = this.mast.getChild("flag");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Hull = partdefinition.addOrReplaceChild("Hull",
				CubeListBuilder.create().texOffs(39, 169).addBox(7.5F, -9.0F, -27.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(132, 171).addBox(4.5F, -9.0F, -0.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(153, 192)
						.addBox(4.5F, -9.0F, -6.5F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 2).addBox(-4.5F, -3.0F, -27.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)).texOffs(96, 58)
						.addBox(-1.5F, -2.625F, -27.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)).texOffs(60, 2).mirror().addBox(1.5F, -3.0F, -27.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 42)
						.addBox(-10.5F, -10.8938F, 26.5562F, 21.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 181).addBox(-1.6062F, -12.2625F, 25.4875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(73, 179)
						.addBox(-6.8937F, -12.1687F, 25.375F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 49).addBox(-2.3375F, -7.3375F, 26.8188F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 19)
						.addBox(-5.8312F, -10.125F, 26.9312F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 49).addBox(-7.0812F, -6.025F, 26.9312F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(89, 25)
						.addBox(-4.5F, -6.0F, 26.5F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-8.0F, -8.25F, -22.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(65, 197)
						.addBox(12.0F, -14.0F, -27.0F, 0.0F, 4.0F, 55.0F, new CubeDeformation(0.0F)).texOffs(65, 197).mirror().addBox(-12.0F, -14.0F, -27.0F, 0.0F, 4.0F, 55.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 250)
						.addBox(-12.0F, -16.0F, 28.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.0F, -8.0F, 28.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(259, 4)
						.addBox(7.046F, -13.9179F, -18.75F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(259, 4).addBox(7.046F, -13.9179F, -14.25F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(259, 4).mirror()
						.addBox(-11.75F, -13.25F, -14.25F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(259, 4).mirror().addBox(-11.75F, -13.25F, -18.75F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.75F, 24.0F, -11.0F, 0.0F, 0.0F, -0.9163F));
		PartDefinition cube_r1 = Hull.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(259, 4).addBox(-2.5F, -2.1527F, 4.2196F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(259, 4).addBox(-2.5F, -2.1527F, -0.2804F, 5.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.25F, -12.75F, -38.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = Hull
				.addOrReplaceChild(
						"cube_r2", CubeListBuilder.create().texOffs(89, 32).addBox(-11.3384F, -12.3168F, 28.875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 34)
								.addBox(-9.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 114).mirror().addBox(4.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 54.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r3 = Hull
				.addOrReplaceChild(
						"cube_r3", CubeListBuilder.create().texOffs(89, 18).addBox(2.8384F, -12.4668F, 28.8188F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 176)
								.addBox(6.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 114).addBox(-7.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 54.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r4 = Hull.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(14, 29).mirror().addBox(-7.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r5 = Hull.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(89, 122).mirror().addBox(-11.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(105, 171)
						.addBox(-11.7417F, 2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(194, 56).addBox(-8.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r6 = Hull.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(14, 29).addBox(4.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r7 = Hull
				.addOrReplaceChild(
						"cube_r7", CubeListBuilder.create().texOffs(89, 122).addBox(5.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(105, 171).mirror()
								.addBox(8.7417F, 2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(194, 56).mirror().addBox(5.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
						PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r8 = Hull.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(198, 171).mirror().addBox(7.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0105F, 0.0F, -1.309F));
		PartDefinition cube_r9 = Hull.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(194, 73).mirror().addBox(8.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0436F, 0.0F, -0.7854F));
		PartDefinition cube_r10 = Hull.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 106).mirror().addBox(7.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0192F, 0.0F, -1.309F));
		PartDefinition cube_r11 = Hull.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(178, 143).mirror().addBox(5.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0524F, 0.0F, -0.7854F));
		PartDefinition cube_r12 = Hull.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(60, 106).mirror().addBox(5.7417F, 2.7012F, -8.9654F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0087F, 0.0F, -0.7854F));
		PartDefinition cube_r13 = Hull.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(120, 114).mirror().addBox(8.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, -0.7854F));
		PartDefinition cube_r14 = Hull.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(120, 137).mirror().addBox(7.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, -1.309F));
		PartDefinition cube_r15 = Hull.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(120, 25).mirror().addBox(11.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.413F, 0.1451F, -1.2522F));
		PartDefinition cube_r16 = Hull.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(120, 33).mirror().addBox(10.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.333F, 0.1111F, -1.0056F));
		PartDefinition cube_r17 = Hull.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(120, 48).mirror().addBox(14.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.7905F, 0.2962F, -1.1949F));
		PartDefinition cube_r18 = Hull.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 161).mirror().addBox(13.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.7109F, 0.2332F, -1.3086F));
		PartDefinition cube_r19 = Hull.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(120, 114).mirror().addBox(8.4706F, 9.7197F, -26.163F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.3079F, 0.1248F, -0.825F));
		PartDefinition cube_r20 = Hull.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(8.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.736F, 0.1159F, -0.8374F));
		PartDefinition cube_r21 = Hull.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(120, 122).mirror().addBox(9.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.2148F, 0.2404F, -0.3057F));
		PartDefinition cube_r22 = Hull.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(60, 139).mirror().addBox(9.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(30, 28).mirror()
				.addBox(11.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.59F, 0.2404F, -0.3057F));
		PartDefinition cube_r23 = Hull.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(101, 37).mirror().addBox(4.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.5729F, 0.1323F, -0.0849F));
		PartDefinition cube_r24 = Hull.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(147, 25).mirror().addBox(-1.75F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.74F, -7.0236F, -39.4552F, -0.581F, 0.2055F, -0.1332F));
		PartDefinition cube_r25 = Hull.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(0, 131).mirror().addBox(5.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1683F, 0.1721F, -0.0291F));
		PartDefinition cube_r26 = Hull.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(120, 122).addBox(-12.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.2148F, -0.2404F, 0.3057F));
		PartDefinition cube_r27 = Hull.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(30, 28).addBox(-12.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(60, 139).addBox(-11.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.59F, -0.2404F, 0.3057F));
		PartDefinition cube_r28 = Hull.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(120, 114).addBox(-11.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.7854F));
		PartDefinition cube_r29 = Hull.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(194, 73).addBox(-11.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0436F, 0.0F, 0.7854F));
		PartDefinition cube_r30 = Hull.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(60, 106).addBox(-8.7417F, 2.7012F, -8.9654F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0087F, 0.0F, 0.7854F));
		PartDefinition cube_r31 = Hull.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(178, 143).addBox(-8.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0524F, 0.0F, 0.7854F));
		PartDefinition cube_r32 = Hull.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(120, 114).addBox(-11.4706F, 9.7197F, -26.163F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.3079F, -0.1248F, 0.825F));
		PartDefinition cube_r33 = Hull.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(60, 0).addBox(-11.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.736F, -0.1159F, 0.8374F));
		PartDefinition cube_r34 = Hull.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(120, 33).addBox(-13.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.333F, -0.1111F, 1.0056F));
		PartDefinition cube_r35 = Hull.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(120, 48).addBox(-17.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.7905F, -0.2962F, 1.1949F));
		PartDefinition cube_r36 = Hull.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(120, 137).addBox(-10.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 1.309F));
		PartDefinition cube_r37 = Hull.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(120, 25).addBox(-14.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.413F, -0.1451F, 1.2522F));
		PartDefinition cube_r38 = Hull.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 161).addBox(-16.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.7109F, -0.2332F, 1.3086F));
		PartDefinition cube_r39 = Hull.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(198, 171).addBox(-10.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0105F, 0.0F, 1.309F));
		PartDefinition cube_r40 = Hull.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(0, 106).addBox(-10.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0192F, 0.0F, 1.309F));
		PartDefinition cube_r41 = Hull.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(114, 246).mirror().addBox(-0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.9628F, -12.422F, -27.0407F, 0.0F, -0.4363F, 0.0F));
		PartDefinition cube_r42 = Hull.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(140, 238).mirror().addBox(0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.5128F, -12.422F, -32.4907F, 0.0F, -0.7418F, 0.0F));
		PartDefinition cube_r43 = Hull.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(140, 238).addBox(-0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5128F, -12.422F, -32.4907F, 0.0F, 0.7418F, 0.0F));
		PartDefinition cube_r44 = Hull.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(114, 246).addBox(0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9628F, -12.422F, -27.0407F, 0.0F, 0.4363F, 0.0F));
		PartDefinition cube_r45 = Hull.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(66, 40).mirror().addBox(-9.422F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4F, -1.0F, -3.5F, -0.4363F, 0.0F, 1.5708F));
		PartDefinition cube_r46 = Hull.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(120, 0).mirror().addBox(-9.422F, 10.3831F, -24.014F, 2.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.4F, -1.0F, -3.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r47 = Hull.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(66, 40).addBox(7.422F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -1.0F, -3.5F, -0.4363F, 0.0F, -1.5708F));
		PartDefinition cube_r48 = Hull.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(120, 0).addBox(7.422F, 10.3831F, -24.014F, 2.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -1.0F, -3.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r49 = Hull.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(53, 200).mirror().addBox(-9.422F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.9F, -0.7418F, 0.0F, 1.5708F));
		PartDefinition cube_r50 = Hull.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(53, 200).addBox(7.422F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.9F, -0.7418F, 0.0F, -1.5708F));
		PartDefinition cube_r51 = Hull.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(60, 131).addBox(-1.5F, 2.3361F, -29.6709F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1658F, 0.0F, 0.0F));
		PartDefinition cube_r52 = Hull.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 131).addBox(-8.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1683F, -0.1721F, 0.0291F));
		PartDefinition cube_r53 = Hull.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(147, 25).addBox(-0.25F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.74F, -7.0236F, -39.4552F, -0.581F, -0.2055F, 0.1332F));
		PartDefinition cube_r54 = Hull.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(101, 37).addBox(-7.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.5729F, -0.1323F, 0.0849F));
		PartDefinition cube_r55 = Hull.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(67, 223).addBox(-1.0F, 11.6135F, -53.7362F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(41, 222).addBox(-1.5F, 12.6135F, -44.7362F, 3.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r56 = Hull.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(206, 99).addBox(-1.5F, -8.2346F, -23.8801F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(42, 181).addBox(-4.5F, -8.1822F, -23.8806F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r57 = Hull.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(179, 93).addBox(-1.5F, -6.2918F, -38.688F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0698F, 0.0F, 0.0F));
		PartDefinition cube_r58 = Hull.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(146, 12).addBox(-3.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0695F, -0.0061F, -0.0871F));
		PartDefinition cube_r59 = Hull.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(60, 25).addBox(-7.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0697F, -0.003F, -0.0435F));
		PartDefinition cube_r60 = Hull.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(146, 0).addBox(0.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0695F, 0.0061F, 0.0871F));
		PartDefinition cube_r61 = Hull.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(60, 10).addBox(4.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0697F, 0.003F, 0.0435F));
		PartDefinition cube_r62 = Hull.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(89, 9).addBox(-19.7634F, -6.5126F, -25.1741F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.077F, -0.4382F, -0.011F));
		PartDefinition cube_r63 = Hull.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(144, 137).addBox(-28.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1034F, -0.8294F, 0.0326F));
		PartDefinition cube_r64 = Hull.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(84, 131).addBox(25.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.1034F, 0.8294F, -0.0326F));
		PartDefinition cube_r65 = Hull.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(89, 0).addBox(16.7634F, -6.8126F, -25.1741F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.077F, 0.4382F, 0.011F));
		PartDefinition cube_r66 = Hull.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(199, 21).addBox(1.5F, -8.2608F, 4.8799F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -11.5F, -0.0175F, 0.0F, 0.0F));
		PartDefinition cube_r67 = Hull.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(21, 214).addBox(-1.8533F, -8.173F, 4.8808F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -11.5F, -0.0175F, 0.0F, 0.0524F));
		PartDefinition cube_r68 = Hull.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(199, 135).addBox(-4.5F, -8.0F, 5.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(178, 114).addBox(-4.5F, -8.0F, 11.0F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -11.5F, 0.0F, 0.0F, 0.0175F));
		PartDefinition cube_r69 = Hull.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(186, 194).addBox(-7.5F, -7.4724F, 5.2264F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -11.5F, 0.0349F, 0.0F, 0.0F));
		PartDefinition cube_r70 = Hull.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(0, 193).addBox(-1.8533F, -8.173F, 2.8808F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.0524F));
		PartDefinition cube_r71 = Hull.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(135, 174).addBox(-10.7301F, -7.6818F, -24.0F, 3.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0F, 0.0F, 0.0349F));
		PartDefinition cube_r72 = Hull.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(0, 161).addBox(-10.1344F, -8.0386F, 0.2444F, 3.0F, 2.0F, 30.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0349F, 0.0F, -0.0524F));
		PartDefinition cube_r73 = Hull
				.addOrReplaceChild(
						"cube_r73", CubeListBuilder.create().texOffs(42, 167).addBox(4.5F, -8.4147F, -23.7571F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(72, 171)
								.addBox(7.5F, -7.5247F, 3.2273F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(165, 173).addBox(-7.5F, -7.4724F, 3.2264F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, 0.0349F, 0.0F, 0.0F));
		PartDefinition cube_r74 = Hull.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(6, 181).addBox(1.2626F, -7.9425F, -24.1182F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.0349F));
		PartDefinition cube_r75 = Hull.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(178, 0).addBox(1.5F, -8.2608F, 2.8799F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(135, 177).addBox(-7.5F, -7.8419F, -24.1164F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, -3.5F, -0.0175F, 0.0F, 0.0F));
		PartDefinition Decorations = Hull.addOrReplaceChild("Decorations", CubeListBuilder.create(), PartPose.offset(0.25F, 0.0F, 11.0F));
		PartDefinition bone22 = Decorations.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.5195F, -13.625F, -36.1749F, 0.2182F, 0.6981F, 0.0F));
		PartDefinition cube_r76 = bone22.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(206, 222).addBox(-2.0F, 0.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(206, 215).addBox(-2.0F, 0.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(206, 209)
						.addBox(-2.0F, 0.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 3.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 0.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone = Decorations.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.0F, -6.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(206, 222).addBox(-2.0F, -2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(206, 215).addBox(-2.0F, -1.75F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(206, 209)
						.addBox(-2.0F, -1.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238).addBox(-2.5F, 1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, -1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233).addBox(-2.0F, -3.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -13.0F, 12.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition bone19 = Decorations.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(-7.0F, -14.0F, 11.0F, 0.0787F, -0.6194F, 0.3783F));
		PartDefinition chestlid = bone19.addOrReplaceChild("chestlid", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -21.0375F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r78 = chestlid.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(154, 213).addBox(-4.0F, -25.8801F, -1.7618F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -4.1548F, -0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r79 = chestlid.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(154, 213).addBox(-3.99F, 4.6253F, 20.6501F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r80 = chestlid.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(157, 209).addBox(1.09F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(157, 209).addBox(-4.11F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, -1.6548F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r81 = chestlid.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(172, 217).addBox(-4.0F, 21.5677F, 3.9022F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, -4.1548F, 1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r82 = chestlid.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(174, 211).addBox(-4.01F, 13.2483F, 12.9228F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chest = bone19.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(124, 207).addBox(-4.0F, -13.0F, 30.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, -34.0F));
		PartDefinition bone23 = Decorations.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(7.0F, -14.0F, -41.0F, 0.0F, 2.2253F, 0.0F));
		PartDefinition chest2 = bone23.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offset(0.0F, 14.0F, -34.0F));
		PartDefinition chest_r1 = chest2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(124, 207).addBox(-4.0F, -7.0F, 8.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, 25.0F, 0.3927F, -0.5672F, 0.0F));
		PartDefinition CannonFront = Hull.addOrReplaceChild("CannonFront", CubeListBuilder.create().texOffs(255, 23).mirror().addBox(-5.5303F, -2.404F, -3.4696F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(256, 11).mirror()
				.addBox(-0.5303F, -2.654F, -3.9696F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.25F, -14.25F, -39.5F, 1.5708F, -1.4835F, -1.5708F));
		PartDefinition cube_r83 = CannonFront.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(274, 6).mirror().addBox(-0.3532F, -1.1852F, -2.4696F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition CannonRight = Hull.addOrReplaceChild("CannonRight", CubeListBuilder.create().texOffs(255, 23).mirror().addBox(-5.5F, -4.75F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(256, 11).mirror()
				.addBox(-0.5F, -5.0F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-11.25F, -8.25F, -16.5F));
		PartDefinition cube_r84 = CannonRight.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(274, 6).mirror().addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.5236F));
		PartDefinition CannonLeft = Hull.addOrReplaceChild("CannonLeft",
				CubeListBuilder.create().texOffs(255, 23).addBox(0.5795F, -1.9281F, -1.5F, 7.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(256, 11).addBox(-0.4205F, -2.1781F, -2.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.75F, -12.25F, -16.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r85 = CannonLeft.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(274, 6).addBox(0.89F, 0.2515F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5236F));
		PartDefinition mast = partdefinition.addOrReplaceChild("mast", CubeListBuilder.create().texOffs(18, 16).addBox(-0.75F, -70.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, -15.0F, 0.0F, 0.0F, -1.6144F));
		PartDefinition cube_r86 = mast.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(210, 5).addBox(-0.75F, -1.0F, -1.0F, 1.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(152, 270).addBox(0.0F, -46.0F, 0.0F, 0.0F, 65.0F, 49.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -19.0F, 1.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r87 = mast.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(344, 168).addBox(0.0F, -27.0F, -1.0F, 0.0F, 27.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -36.0F, 0.25F, 0.0381F, -0.1704F, -0.2214F));
		PartDefinition cube_r88 = mast.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(224, 19).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.75F, -36.0F, 1.0F, 0.0381F, -0.1704F, -0.2214F));
		PartDefinition cube_r89 = mast.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(232, 268).addBox(-0.1686F, -55.1491F, -1.2716F, 0.0F, 65.0F, 51.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -8.0F, -49.0F, 0.0228F, -0.0945F, 0.0435F));
		PartDefinition bone2 = mast.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, -27.5F, 11.8431F));
		PartDefinition cube_r90 = bone2.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -26.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -38.5F, 7.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -38.5F, -11.9375F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r93 = bone4.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -38.5F, -9.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r94 = bone4.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -38.5F, 0.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r95 = bone5.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -38.5F, -9.4853F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r96 = bone5.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -38.5F, -1.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r97 = bone5.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -38.5F, 12.0625F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone7 = mast.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(0.0F, -9.5F, 11.8431F));
		PartDefinition cube_r98 = bone7.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r99 = bone8.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(16, 106).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r100 = bone8.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(29, 106).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r101 = bone9.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(8, 106).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r102 = bone9.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(12, 106).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r103 = bone10.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(48, 0).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r104 = bone10.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(0, 106).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r105 = bone10.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(4, 106).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone15 = mast.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(0.0F, -26.5F, 11.8431F));
		PartDefinition cube_r106 = bone15.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(272, 230).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r107 = bone16.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(255, 230).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r108 = bone16.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(268, 230).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r109 = bone17.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(247, 230).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r110 = bone17.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(251, 230).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r111 = bone18.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(287, 124).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r112 = bone18.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(239, 230).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r113 = bone18.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(243, 230).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone6 = mast.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3535F, 2.0F, -0.8033F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r114 = bone6.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(298, 106).addBox(-0.5F, -1.5F, -1.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3535F, 1.5F, -0.3535F, 0.0F, -2.3562F, 0.0F));
		PartDefinition bone11 = bone6.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.641F, 10.5F, 11.6464F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r115 = bone11.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(288, 106).addBox(7.9853F, -10.5F, 7.4853F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r116 = bone11.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(294, 106).addBox(0.15F, -10.5F, -11.9375F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone12 = bone6.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.641F, 10.5F, 11.3714F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r117 = bone12.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(280, 106).addBox(7.9853F, -10.5F, -9.4853F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r118 = bone12.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(284, 106).addBox(-11.85F, -10.5F, 0.0625F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone14 = bone12.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r119 = bone14.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(266, 105).addBox(-8.9853F, -10.5F, -9.4853F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r120 = bone14.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(272, 106).addBox(-12.3625F, -10.5F, -1.0625F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r121 = bone14.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(276, 106).addBox(0.15F, -10.5F, 12.0625F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));
		PartDefinition bone13 = mast.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, -8.0F));
		PartDefinition cube_r122 = bone13.addOrReplaceChild("cube_r122",
				CubeListBuilder.create().texOffs(185, 118).addBox(0.125F, -0.5F, -12.0F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(242, 0).addBox(0.125F, 41.5F, -23.0F, 1.0F, 1.0F, 44.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.625F, -59.5F, 5.5F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r123 = bone13.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(298, 220).addBox(3.3072F, 13.9539F, -21.5F, 0.0F, 7.0F, 43.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4195F, -38.5F, 4.8833F, 0.2132F, 0.762F, 0.3038F));
		PartDefinition cube_r124 = bone13.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(298, 205).addBox(0.8247F, -0.5492F, -21.5F, 0.0F, 15.0F, 43.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4195F, -38.5F, 4.8833F, 0.0436F, 0.7844F, 0.0617F));
		PartDefinition cube_r125 = bone13.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(298, 190).addBox(0.8746F, -14.4486F, -21.5F, 0.0F, 14.0F, 43.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4195F, -38.5F, 4.8833F, -0.0436F, 0.7844F, -0.0617F));
		PartDefinition cube_r126 = bone13.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(298, 183).addBox(3.356F, -20.9431F, -21.5F, 0.0F, 7.0F, 43.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.4195F, -38.5F, 4.8833F, -0.2132F, 0.762F, -0.3038F));
		PartDefinition cube_r127 = bone13.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(358, 22).mirror().addBox(-7.125F, -0.5F, 21.0F, 13.0F, 23.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.625F, -17.5F, 32.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition flag = mast.addOrReplaceChild("flag",
				CubeListBuilder.create().texOffs(34, 32).addBox(0.1289F, -18.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31).addBox(0.1289F, -18.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3789F, -51.0F, 0.1616F));
		PartDefinition cube_r128 = flag.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(4, 31).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, -17.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r129 = flag.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(30, 32).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, -17.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));
		return LayerDefinition.create(meshdefinition, 384, 384);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Hull.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mast.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
