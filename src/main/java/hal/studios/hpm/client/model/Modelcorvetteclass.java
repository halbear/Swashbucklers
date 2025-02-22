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

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcorvetteclass<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("hpm", "modelcorvetteclass"), "main");
	public final ModelPart bone24;
	public final ModelPart bone23;
	public final ModelPart bone22;
	public final ModelPart bone9;
	public final ModelPart bone3;
	public final ModelPart sail;
	public final ModelPart sail2;
	public final ModelPart sail3;
	public final ModelPart bone11;
	public final ModelPart bone12;
	public final ModelPart bone13;
	public final ModelPart bone14;
	public final ModelPart bone26;
	public final ModelPart bone27;
	public final ModelPart bone28;
	public final ModelPart bone29;
	public final ModelPart bone30;
	public final ModelPart treasurechest;
	public final ModelPart goldbarrel;
	public final ModelPart bone33;
	public final ModelPart hexadecagon;
	public final ModelPart treasurechest2;
	public final ModelPart bone34;
	public final ModelPart bone54;
	public final ModelPart lifeboat2;
	public final ModelPart lifeboat4;
	public final ModelPart bone16;
	public final ModelPart bone;
	public final ModelPart bone25;
	public final ModelPart bone61;
	public final ModelPart lifeboat3;
	public final ModelPart greenbarrel;
	public final ModelPart redbarrel;
	public final ModelPart closedchest;
	public final ModelPart valuablecargo;
	public final ModelPart redbarrel3;
	public final ModelPart redbarrel4;
	public final ModelPart redbarrel5;
	public final ModelPart redbarrel6;
	public final ModelPart redbarrel7;
	public final ModelPart redbarrel8;
	public final ModelPart redbarrel9;
	public final ModelPart redbarrel10;
	public final ModelPart cargo;
	public final ModelPart cargo2;
	public final ModelPart valuablecargo2;
	public final ModelPart algar;
	public final ModelPart algar2;
	public final ModelPart algar3;
	public final ModelPart algar4;
	public final ModelPart algar5;
	public final ModelPart algar6;
	public final ModelPart algar7;
	public final ModelPart algar8;
	public final ModelPart algar9;
	public final ModelPart algar10;
	public final ModelPart algar11;
	public final ModelPart bb_main;

	public Modelcorvetteclass(ModelPart root) {
		this.bone24 = root.getChild("bone24");
		this.bone23 = root.getChild("bone23");
		this.bone22 = root.getChild("bone22");
		this.bone9 = root.getChild("bone9");
		this.bone3 = root.getChild("bone3");
		this.sail = root.getChild("sail");
		this.sail2 = root.getChild("sail2");
		this.sail3 = root.getChild("sail3");
		this.bone11 = root.getChild("bone11");
		this.bone12 = root.getChild("bone12");
		this.bone13 = root.getChild("bone13");
		this.bone14 = root.getChild("bone14");
		this.bone26 = root.getChild("bone26");
		this.bone27 = root.getChild("bone27");
		this.bone28 = root.getChild("bone28");
		this.bone29 = root.getChild("bone29");
		this.bone30 = root.getChild("bone30");
		this.treasurechest = root.getChild("treasurechest");
		this.goldbarrel = root.getChild("goldbarrel");
		this.bone33 = root.getChild("bone33");
		this.hexadecagon = root.getChild("hexadecagon");
		this.treasurechest2 = root.getChild("treasurechest2");
		this.bone34 = root.getChild("bone34");
		this.bone54 = root.getChild("bone54");
		this.lifeboat2 = root.getChild("lifeboat2");
		this.lifeboat4 = root.getChild("lifeboat4");
		this.bone16 = root.getChild("bone16");
		this.bone = root.getChild("bone");
		this.bone25 = root.getChild("bone25");
		this.bone61 = root.getChild("bone61");
		this.lifeboat3 = root.getChild("lifeboat3");
		this.greenbarrel = root.getChild("greenbarrel");
		this.redbarrel = root.getChild("redbarrel");
		this.closedchest = root.getChild("closedchest");
		this.valuablecargo = root.getChild("valuablecargo");
		this.redbarrel3 = root.getChild("redbarrel3");
		this.redbarrel4 = root.getChild("redbarrel4");
		this.redbarrel5 = root.getChild("redbarrel5");
		this.redbarrel6 = root.getChild("redbarrel6");
		this.redbarrel7 = root.getChild("redbarrel7");
		this.redbarrel8 = root.getChild("redbarrel8");
		this.redbarrel9 = root.getChild("redbarrel9");
		this.redbarrel10 = root.getChild("redbarrel10");
		this.cargo = root.getChild("cargo");
		this.cargo2 = root.getChild("cargo2");
		this.valuablecargo2 = root.getChild("valuablecargo2");
		this.algar = root.getChild("algar");
		this.algar2 = root.getChild("algar2");
		this.algar3 = root.getChild("algar3");
		this.algar4 = root.getChild("algar4");
		this.algar5 = root.getChild("algar5");
		this.algar6 = root.getChild("algar6");
		this.algar7 = root.getChild("algar7");
		this.algar8 = root.getChild("algar8");
		this.algar9 = root.getChild("algar9");
		this.algar10 = root.getChild("algar10");
		this.algar11 = root.getChild("algar11");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone24 = partdefinition.addOrReplaceChild("bone24", CubeListBuilder.create().texOffs(281, 131).mirror().addBox(2.5175F, 1.8519F, -55.1111F, 1.0F, 3.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 611).mirror()
				.addBox(2.5925F, -1.1481F, -55.1111F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(210, 793).mirror().addBox(2.905F, -1.1481F, -15.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(675, 85).mirror().addBox(2.505F, -1.1481F, 29.8889F, 1.0F, 3.0F, 64.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(594, 0).mirror().addBox(2.5925F, 7.8519F, -55.1111F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(141, 794).mirror().addBox(2.5925F, -2.1481F, -87.1111F, 1.0F, 4.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(883, 0).mirror()
				.addBox(2.5175F, 1.8519F, -87.1111F, 1.0F, 3.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(882, 371).mirror().addBox(2.5925F, 7.8519F, -87.1111F, 1.0F, 3.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(792, 648).mirror().addBox(2.905F, 7.8519F, -15.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(661, 674).mirror().addBox(2.505F, 7.8519F, 29.8889F, 1.0F, 3.0F, 64.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(392, 745).mirror().addBox(2.805F, 1.8519F, 45.8889F, 1.0F, 3.0F, 48.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(584, 792).mirror()
				.addBox(2.805F, 4.8519F, -21.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(252, 654).mirror().addBox(2.705F, 4.8519F, 23.8889F, 1.0F, 3.0F, 70.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(792, 51)
				.mirror().addBox(2.305F, 1.8519F, 0.8889F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(180, 586).mirror().addBox(2.505F, -1.1481F, 93.8889F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-13.0333F, 31.0F, 22.1111F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r1 = bone24.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(591, 596).mirror().addBox(1.9687F, -2.8852F, -5.9552F, 1.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5333F, 7.5F, -81.1111F, 0.0F, 0.0175F, 0.0873F));
		PartDefinition cube_r2 = bone24.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(455, 16).mirror().addBox(2.938F, -2.6481F, -9.1897F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3208F, 10.5F, -98.1111F, 0.0F, -0.0611F, 0.0F));
		PartDefinition cube_r3 = bone24.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(485, 215).mirror().addBox(3.1658F, -3.3608F, -9.3051F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0639F, 7.4589F, -98.107F, -0.013F, -0.0952F, 0.2187F));
		PartDefinition cube_r4 = bone24.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(412, 16).mirror().addBox(4.9871F, -1.3215F, 2.4597F, 1.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9085F, 6.2676F, -107.237F, 0.1411F, -0.1485F, -0.1232F));
		PartDefinition cube_r5 = bone24.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(499, 0).mirror().addBox(4.2531F, -1.2504F, -9.1392F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3208F, 1.0F, -98.6111F, 0.1547F, -0.2242F, 0.2691F));
		PartDefinition cube_r6 = bone24.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(627, 179).mirror().addBox(1.9687F, -2.8852F, -5.9552F, 1.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5333F, 7.5F, -49.1111F, 0.0F, 0.0175F, 0.0873F));
		PartDefinition bone23 = partdefinition.addOrReplaceChild("bone23",
				CubeListBuilder.create().texOffs(281, 131).addBox(-3.5175F, 1.8519F, -55.1111F, 1.0F, 3.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(0, 611).addBox(-3.5925F, -1.1481F, -55.1111F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F))
						.texOffs(210, 793).addBox(-3.905F, -1.1481F, -15.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(675, 85).addBox(-3.505F, -1.1481F, 29.8889F, 1.0F, 3.0F, 64.0F, new CubeDeformation(0.0F)).texOffs(594, 0)
						.addBox(-3.5925F, 7.8519F, -55.1111F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(141, 794).addBox(-3.5925F, -2.1481F, -87.1111F, 1.0F, 4.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(883, 0)
						.addBox(-3.5175F, 1.8519F, -87.1111F, 1.0F, 3.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(882, 371).addBox(-3.5925F, 7.8519F, -87.1111F, 1.0F, 3.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(792, 648)
						.addBox(-3.905F, 7.8519F, -15.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(661, 674).addBox(-3.505F, 7.8519F, 29.8889F, 1.0F, 3.0F, 64.0F, new CubeDeformation(0.0F)).texOffs(392, 745)
						.addBox(-3.805F, 1.8519F, 45.8889F, 1.0F, 3.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(584, 792).addBox(-3.805F, 4.8519F, -21.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(252, 654)
						.addBox(-3.705F, 4.8519F, 23.8889F, 1.0F, 3.0F, 70.0F, new CubeDeformation(0.0F)).texOffs(792, 51).addBox(-3.305F, 1.8519F, 0.8889F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(180, 586)
						.addBox(-14.505F, -1.1481F, 93.8889F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.0333F, 31.0F, 22.1111F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r7 = bone23.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(591, 596).addBox(-2.9687F, -2.8852F, -5.9552F, 1.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5333F, 7.5F, -81.1111F, 0.0F, -0.0175F, -0.0873F));
		PartDefinition cube_r8 = bone23.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(455, 16).addBox(-3.938F, -2.6481F, -9.1897F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3208F, 10.5F, -98.1111F, 0.0F, 0.0611F, 0.0F));
		PartDefinition cube_r9 = bone23.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(485, 215).addBox(-4.1658F, -3.3608F, -9.3051F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0639F, 7.4589F, -98.107F, -0.013F, 0.0952F, -0.2187F));
		PartDefinition cube_r10 = bone23.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(412, 16).addBox(-5.9871F, -1.3215F, 2.4597F, 1.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9085F, 6.2676F, -107.237F, 0.1411F, 0.1485F, 0.1232F));
		PartDefinition cube_r11 = bone23.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(499, 0).addBox(-5.2531F, -1.2504F, -9.1392F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3208F, 1.0F, -98.6111F, 0.1547F, 0.2242F, -0.2691F));
		PartDefinition cube_r12 = bone23.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(627, 179).addBox(-2.9687F, -2.8852F, -5.9552F, 1.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5333F, 7.5F, -49.1111F, 0.0F, -0.0175F, -0.0873F));
		PartDefinition bone22 = partdefinition.addOrReplaceChild("bone22",
				CubeListBuilder.create().texOffs(281, 72).mirror().addBox(1.6742F, 0.7019F, -55.1111F, 1.0F, 3.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(574, 475).mirror()
						.addBox(1.7492F, -2.2981F, -55.1111F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(163, 790).mirror().addBox(2.0617F, -2.2981F, -15.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(531, 674).mirror().addBox(1.6617F, -2.2981F, 29.8889F, 1.0F, 3.0F, 64.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(94, 570).mirror()
						.addBox(1.7492F, 6.7019F, -55.1111F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(537, 789).mirror().addBox(2.0617F, 6.7019F, -15.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(668, 588).mirror().addBox(1.6617F, 6.7019F, 29.8889F, 1.0F, 3.0F, 64.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(566, 111).mirror()
						.addBox(1.6617F, -2.2981F, 93.9889F, 10.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(641, 741).mirror().addBox(1.9617F, 0.7019F, 45.8889F, 1.0F, 3.0F, 48.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(445, 789).mirror().addBox(1.9617F, 3.7019F, -21.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(110, 654).mirror()
						.addBox(1.9617F, 3.7019F, 23.8889F, 1.0F, 3.0F, 70.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 789).mirror().addBox(1.4617F, 0.7019F, 0.8889F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-21.0333F, 22.0F, 22.1111F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r13 = bone22.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(438, 215).mirror().addBox(4.4482F, -3.4012F, -9.8775F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3883F, 10.6448F, -98.8297F, 0.0802F, -0.3085F, 0.0826F));
		PartDefinition cube_r14 = bone22.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(255, 607).mirror().addBox(1.2081F, -2.9099F, 11.0645F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.6115F, 9.7818F, -98.8646F, 0.0258F, -0.0042F, 0.001F));
		PartDefinition cube_r15 = bone22.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(438, 259).mirror().addBox(4.8954F, -2.1248F, -9.7873F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4731F, 6.829F, -99.0556F, 0.1214F, -0.3244F, 0.0689F));
		PartDefinition cube_r16 = bone22.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(516, 633).mirror().addBox(0.6698F, -2.9194F, 11.1827F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.4731F, 6.829F, -99.0556F, 0.0324F, -0.0192F, 0.0792F));
		PartDefinition cube_r17 = bone22.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(514, 558).mirror().addBox(5.1922F, -2.4814F, -11.4009F, 1.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0404F, 2.2996F, -98.5559F, 0.1573F, -0.3457F, 0.1702F));
		PartDefinition cube_r18 = bone22.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(346, 881).mirror().addBox(1.4402F, -3.3111F, -5.5048F, 1.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0965F, 1.4155F, -82.5869F, 0.0262F, -0.0401F, 0.1745F));
		PartDefinition cube_r19 = bone22.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(394, 475).mirror().addBox(5.1607F, -3.4951F, -10.9177F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.3337F, 4.7261F, -99.0056F, 0.1205F, -0.3635F, 0.2756F));
		PartDefinition cube_r20 = bone22.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(591, 633).mirror().addBox(-2.682F, 10.2734F, 30.2905F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.0415F, -8.1671F, -118.5094F, 0.0262F, -0.0349F, 0.1748F));
		PartDefinition cube_r21 = bone22.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(516, 596).mirror().addBox(1.0285F, -3.9575F, -5.9716F, 1.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5333F, 7.5F, -49.1111F, 0.0F, 0.0175F, 0.0873F));
		PartDefinition bone9 = partdefinition.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(281, 72).addBox(-2.6742F, 0.7019F, -55.1111F, 1.0F, 3.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(574, 475).addBox(-2.7492F, -2.2981F, -55.1111F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F))
						.texOffs(163, 790).addBox(-3.0617F, -2.2981F, -15.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(531, 674).addBox(-2.6617F, -2.2981F, 29.8889F, 1.0F, 3.0F, 64.0F, new CubeDeformation(0.0F)).texOffs(94, 570)
						.addBox(-2.7492F, 6.7019F, -55.1111F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(537, 789).addBox(-3.0617F, 6.7019F, -15.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(668, 588)
						.addBox(-2.6617F, 6.7019F, 29.8889F, 1.0F, 3.0F, 64.0F, new CubeDeformation(0.0F)).texOffs(566, 111).addBox(-11.6617F, -2.2981F, 93.9889F, 10.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(641, 741)
						.addBox(-2.9617F, 0.7019F, 45.8889F, 1.0F, 3.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(445, 789).addBox(-2.9617F, 3.7019F, -21.1111F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(110, 654)
						.addBox(-2.9617F, 3.7019F, 23.8889F, 1.0F, 3.0F, 70.0F, new CubeDeformation(0.0F)).texOffs(0, 789).addBox(-2.4617F, 0.7019F, 0.8889F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0333F, 22.0F, 22.1111F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r22 = bone9.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(438, 215).addBox(-5.4482F, -3.4012F, -9.8775F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3883F, 10.6448F, -98.8297F, 0.0802F, 0.3085F, -0.0826F));
		PartDefinition cube_r23 = bone9.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(255, 607).addBox(-2.2081F, -2.9099F, 11.0645F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6115F, 9.7818F, -98.8646F, 0.0258F, 0.0042F, -0.001F));
		PartDefinition cube_r24 = bone9.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(438, 259).addBox(-5.8954F, -2.1248F, -9.7873F, 1.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4731F, 6.829F, -99.0556F, 0.1214F, 0.3244F, -0.0689F));
		PartDefinition cube_r25 = bone9.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(516, 633).addBox(-1.6698F, -2.9194F, 11.1827F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4731F, 6.829F, -99.0556F, 0.0324F, 0.0192F, -0.0792F));
		PartDefinition cube_r26 = bone9.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(514, 558).addBox(-6.1922F, -2.4814F, -11.4009F, 1.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0404F, 2.2996F, -98.5559F, 0.1573F, 0.3457F, -0.1702F));
		PartDefinition cube_r27 = bone9.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(346, 881).addBox(-2.4402F, -3.3111F, -5.5048F, 1.0F, 2.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0965F, 1.4155F, -82.5869F, 0.0262F, 0.0401F, -0.1745F));
		PartDefinition cube_r28 = bone9.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(394, 475).addBox(-6.1607F, -3.4951F, -10.9177F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3337F, 4.7261F, -99.0056F, 0.1205F, 0.3635F, -0.2756F));
		PartDefinition cube_r29 = bone9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(591, 633).addBox(1.682F, 10.2734F, 30.2905F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0415F, -8.1671F, -118.5094F, 0.0262F, 0.0349F, -0.1748F));
		PartDefinition cube_r30 = bone9.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(516, 596).addBox(-2.0285F, -3.9575F, -5.9716F, 1.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5333F, 7.5F, -49.1111F, 0.0F, -0.0175F, -0.0873F));
		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(772, 880).addBox(-0.5F, -19.5F, -22.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).texOffs(674, 880).addBox(-0.5F, -16.5F, -22.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offset(20.5F, 20.5F, -44.0F));
		PartDefinition cube_r31 = bone3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(514, 534).addBox(-1.058F, -1.4265F, -21.0341F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8756F, -3.0F, -21.9591F, 0.0062F, 0.3923F, 0.1331F));
		PartDefinition cube_r32 = bone3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(130, 879).addBox(-0.5F, -1.5F, -33.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0057F, 0.0433F, 0.131F));
		PartDefinition cube_r33 = bone3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(136, 570).addBox(-0.468F, -1.1759F, -15.2654F, 1.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.6129F, -6.9984F, -41.096F, 0.1019F, 0.7262F, 0.2041F));
		PartDefinition cube_r34 = bone3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(545, 0).addBox(-0.9272F, -1.4586F, -21.018F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5777F, -6.0165F, -21.9797F, 0.0372F, 0.3778F, 0.1821F));
		PartDefinition cube_r35 = bone3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(880, 423).addBox(-0.5F, -1.5F, -33.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 11.0F, 0.0023F, 0.0304F, 0.0873F));
		PartDefinition cube_r36 = bone3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(397, 534).addBox(-1.0351F, -1.4104F, -21.0141F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0539F, -8.9794F, -21.9926F, 0.0388F, 0.3706F, 0.1672F));
		PartDefinition cube_r37 = bone3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(412, 37).addBox(-1.105F, -1.1664F, -17.2161F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5081F, -9.6671F, -41.3983F, 0.0933F, 0.7192F, 0.1873F));
		PartDefinition cube_r38 = bone3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(507, 880).addBox(-0.375F, -1.5F, -33.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, 11.0F, 0.0036F, 0.0215F, 0.1658F));
		PartDefinition cube_r39 = bone3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(532, 215).addBox(-0.7189F, -1.3101F, -18.2664F, 1.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2825F, -12.514F, -41.3631F, 0.1757F, 0.6911F, 0.3133F));
		PartDefinition cube_r40 = bone3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(336, 558).addBox(-0.9124F, -1.4777F, -21.004F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1257F, -12.0262F, -21.9984F, 0.0485F, 0.3546F, 0.1788F));
		PartDefinition cube_r41 = bone3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(880, 513).addBox(-0.5F, -1.5F, -33.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, 11.0F, -0.0003F, 0.0087F, 0.0393F));
		PartDefinition cube_r42 = bone3.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(0, 570).addBox(-0.651F, -1.4689F, -18.2692F, 1.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2505F, -15.0936F, -41.2304F, 0.0174F, 0.6842F, 0.0525F));
		PartDefinition cube_r43 = bone3.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(397, 558).addBox(-1.0F, -1.5F, -21.0F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -15.0F, -22.0F, 0.0145F, 0.3661F, 0.0467F));
		PartDefinition cube_r44 = bone3.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(455, 534).addBox(-0.8386F, -1.5F, -21.265F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.7435F, -18.0F, -41.4293F, 0.0F, 0.6981F, 0.0F));
		PartDefinition cube_r45 = bone3.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(455, 558).addBox(-1.0F, -1.5F, -21.0F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -18.0F, -22.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone6 = bone3.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-8.6129F, -0.9984F, -52.096F));
		PartDefinition cube_r46 = bone6.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(94, 570).addBox(-0.9227F, -1.1394F, -15.3683F, 1.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.2251F, 0.7307F, 0.3829F));
		PartDefinition bone7 = bone3.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.3629F, 1.7516F, -52.096F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r47 = bone7.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(478, 558).addBox(-9.2904F, -2.0836F, -5.6814F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2217F, 0.7137F, 0.3778F));
		PartDefinition bone8 = bone3.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(-9.3629F, 4.7516F, -52.096F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r48 = bone8.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(309, 16).addBox(-10.2904F, -2.0836F, -5.6814F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2217F, 0.7137F, 0.3778F));
		PartDefinition bone10 = bone3.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.3629F, 7.5016F, -52.096F, 0.0F, 0.0436F, 0.0F));
		PartDefinition cube_r49 = bone10.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(432, 16).addBox(-8.6852F, -2.3041F, -0.886F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 2.0F, 0.0F, 0.1844F, 0.6835F, 0.3687F));
		PartDefinition cube_r50 = bone10.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(169, 146).addBox(-7.9949F, 0.4331F, 5.872F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4122F, 4.5475F, -1.6111F, 0.3677F, 0.4737F, 1.0042F));
		PartDefinition cube_r51 = bone10.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(180, 605).addBox(-10.2265F, -2.1905F, -4.1465F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.2289F, 0.7172F, 0.4363F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition sail = partdefinition.addOrReplaceChild("sail",
				CubeListBuilder.create().texOffs(86, 0).addBox(-0.5F, -189.0F, -41.5F, 1.0F, 27.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(234, 324).addBox(-49.0F, -77.0F, -44.0F, 99.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(660, 551)
						.addBox(-42.0F, -111.0F, -44.0F, 84.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 8).addBox(-25.0F, -152.0F, -44.0F, 50.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 89)
						.addBox(-16.0F, -180.0F, -42.25F, 32.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition octagon8768 = sail.addOrReplaceChild("octagon8768",
				CubeListBuilder.create().texOffs(325, 131).addBox(-0.8284F, -44.0F, 9.0F, 1.0F, 43.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(558, 534).addBox(-2.0F, -44.0F, 10.1716F, 4.0F, 43.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -74.0F, -52.0F));
		PartDefinition octagon_r1 = octagon8768.addOrReplaceChild("octagon_r1",
				CubeListBuilder.create().texOffs(380, 593).addBox(-2.0F, -41.0F, -0.8284F, 4.0F, 43.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(383, 131).addBox(-0.8284F, -41.0F, -2.0F, 1.0F, 43.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition octagon5677 = octagon8768.addOrReplaceChild("octagon5677",
				CubeListBuilder.create().texOffs(396, 16).addBox(-0.6213F, -46.5F, 9.5F, 1.0F, 45.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(380, 534).addBox(-1.5F, -46.5F, 10.3787F, 3.0F, 45.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -42.0F, 0.0F));
		PartDefinition octagon_r2 = octagon5677.addOrReplaceChild("octagon_r2",
				CubeListBuilder.create().texOffs(610, 179).addBox(-1.5F, -43.5F, -0.6213F, 3.0F, 45.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(438, 475).addBox(-0.6213F, -43.5F, -1.5F, 1.0F, 45.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition flag = sail.addOrReplaceChild("flag",
				CubeListBuilder.create().texOffs(124, 148).addBox(0.1289F, -136.5F, -4.0991F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 148).addBox(0.1289F, -136.5F, -9.9116F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3789F, -51.0F, -30.8384F));
		PartDefinition cube_r52 = flag.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(107, 148).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, -135.0F, -5.9741F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r53 = flag.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(116, 148).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, -135.0F, -7.9116F, 0.0F, -0.2618F, 0.0F));
		PartDefinition octagon4565 = sail.addOrReplaceChild("octagon4565",
				CubeListBuilder.create().texOffs(575, 883).addBox(-1.0355F, -83.5F, 8.5F, 2.0F, 83.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 885).addBox(-2.5F, -83.5F, 9.9645F, 5.0F, 83.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, -52.0F));
		PartDefinition octagon_r3 = octagon4565.addOrReplaceChild("octagon_r3",
				CubeListBuilder.create().texOffs(42, 885).addBox(-2.5F, -80.5F, -1.0355F, 5.0F, 83.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(198, 884).addBox(-1.0355F, -80.5F, -2.5F, 2.0F, 83.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone35 = sail.addOrReplaceChild("bone35", CubeListBuilder.create(), PartPose.offset(0.5F, -75.0F, -43.5F));
		PartDefinition cube_r54 = bone35.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(594, 167).addBox(-56.5F, 0.0F, 0.0F, 112.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r55 = bone35.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(574, 580).addBox(-56.5F, 0.0734F, 0.0151F, 112.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r56 = bone35.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(574, 568).addBox(-56.5F, -0.0482F, 0.0046F, 112.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r57 = bone35.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(532, 267).addBox(-56.5F, -0.0984F, 0.0546F, 112.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.25F, -5.25F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone38 = sail.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offset(0.5F, -109.0F, -43.5F));
		PartDefinition cube_r58 = bone38.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(627, 257).addBox(-49.5F, 0.0F, 0.0F, 99.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r59 = bone38.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(412, 196).addBox(-49.5F, 0.0734F, 0.0151F, 99.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r60 = bone38.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(0, 201).addBox(-49.5F, -0.0482F, 0.0046F, 99.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r61 = bone38.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(412, 204).addBox(-49.5F, 0.9016F, 1.9046F, 99.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.25F, -5.25F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone47 = sail.addOrReplaceChild("bone47", CubeListBuilder.create(), PartPose.offset(0.5F, -179.25F, -41.75F));
		PartDefinition cube_r62 = bone47.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(340, 314).addBox(-21.5F, 0.0F, 0.0F, 42.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r63 = bone47.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(230, 310).addBox(-21.5F, 0.0734F, 0.0151F, 42.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r64 = bone47.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(412, 160).addBox(-21.5F, -0.0482F, 0.0046F, 42.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone48 = bone47.addOrReplaceChild("bone48", CubeListBuilder.create(), PartPose.offset(0.0F, 18.25F, -5.55F));
		PartDefinition cube_r65 = bone48.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(412, 68).addBox(-21.5F, 0.8016F, 1.6546F, 42.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone50 = sail.addOrReplaceChild("bone50", CubeListBuilder.create(), PartPose.offset(0.5F, -150.0F, -43.5F));
		PartDefinition cube_r66 = bone50.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(729, 362).addBox(-34.5F, 0.0F, 0.0F, 69.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r67 = bone50.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(732, 527).addBox(-34.5F, 0.0734F, 0.0151F, 69.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r68 = bone50.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(729, 337).addBox(-34.5F, -0.0482F, 0.0046F, 69.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0611F, 0.0F, 0.0F));
		PartDefinition cube_r69 = bone50.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(732, 535).addBox(-34.5F, 0.9016F, 1.9046F, 69.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 30.25F, -5.25F, 0.5236F, 0.0F, 0.0F));
		PartDefinition sail2 = partdefinition.addOrReplaceChild("sail2",
				CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -193.0F, -41.5F, 1.0F, 31.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 320).addBox(-49.0F, -77.0F, -44.0F, 99.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(594, 173)
						.addBox(-42.0F, -118.0F, -44.0F, 84.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 4).addBox(-25.0F, -158.0F, -44.0F, 50.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 91)
						.addBox(-16.0F, -183.0F, -42.25F, 32.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 86.0F));
		PartDefinition octagon2 = sail2.addOrReplaceChild("octagon2",
				CubeListBuilder.create().texOffs(173, 97).addBox(-0.8284F, -44.0F, 9.0F, 1.0F, 43.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(441, 534).addBox(-2.0F, -44.0F, 10.1716F, 4.0F, 43.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -74.0F, -52.0F));
		PartDefinition octagon_r4 = octagon2.addOrReplaceChild("octagon_r4",
				CubeListBuilder.create().texOffs(557, 475).addBox(-2.0F, -41.0F, -0.8284F, 4.0F, 43.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(183, 97).addBox(-0.8284F, -41.0F, -2.0F, 1.0F, 43.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition octagon3 = octagon2.addOrReplaceChild("octagon3",
				CubeListBuilder.create().texOffs(388, 16).addBox(-0.6213F, -46.5F, 9.5F, 1.0F, 45.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(484, 88).addBox(-1.5F, -46.5F, 10.3787F, 3.0F, 45.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -42.0F, 0.0F));
		PartDefinition octagon_r5 = octagon3.addOrReplaceChild("octagon_r5",
				CubeListBuilder.create().texOffs(499, 475).addBox(-1.5F, -43.5F, -0.6213F, 3.0F, 45.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(393, 128).addBox(-0.6213F, -43.5F, -1.5F, 1.0F, 45.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition flag2 = sail2.addOrReplaceChild("flag2",
				CubeListBuilder.create().texOffs(42, 148).addBox(0.1289F, -136.5F, -4.0991F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 95).addBox(0.1289F, -136.5F, -9.9116F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3789F, -55.0F, -30.8384F));
		PartDefinition cube_r70 = flag2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(81, 95).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, -135.0F, -5.9741F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r71 = flag2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(89, 95).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, -135.0F, -7.9116F, 0.0F, -0.2618F, 0.0F));
		PartDefinition octagon4 = sail2.addOrReplaceChild("octagon4",
				CubeListBuilder.create().texOffs(412, 215).addBox(-1.0355F, -83.5F, 8.5F, 2.0F, 83.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 885).addBox(-2.5F, -83.5F, 9.9645F, 5.0F, 83.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, -52.0F));
		PartDefinition octagon_r6 = octagon4.addOrReplaceChild("octagon_r6",
				CubeListBuilder.create().texOffs(14, 885).addBox(-2.5F, -80.5F, -1.0355F, 5.0F, 83.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(840, 880).addBox(-1.0355F, -80.5F, -2.5F, 2.0F, 83.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone39 = sail2.addOrReplaceChild("bone39", CubeListBuilder.create(), PartPose.offset(0.5F, -116.0F, -43.5F));
		PartDefinition cube_r72 = bone39.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(627, 251).addBox(-49.5F, 0.0F, 0.0F, 99.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r73 = bone39.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(281, 0).addBox(-49.5F, 0.0734F, 0.0151F, 99.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r74 = bone39.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(412, 179).addBox(-49.5F, -0.0482F, 0.0046F, 99.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0611F, 0.0F, 0.0F));
		PartDefinition cube_r75 = bone39.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(281, 8).addBox(-49.5F, 0.9016F, 1.9046F, 99.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 30.25F, -5.25F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone36 = sail2.addOrReplaceChild("bone36", CubeListBuilder.create(), PartPose.offset(0.5F, -75.0F, -43.5F));
		PartDefinition cube_r76 = bone36.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(594, 167).addBox(-56.5F, 0.0F, 0.0F, 112.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r77 = bone36.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(574, 580).addBox(-56.5F, 0.0734F, 0.0151F, 112.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r78 = bone36.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(574, 568).addBox(-56.5F, -0.0482F, 0.0046F, 112.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r79 = bone36.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(532, 267).addBox(-56.5F, -0.0984F, 0.0546F, 112.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.25F, -5.25F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone45 = sail2.addOrReplaceChild("bone45", CubeListBuilder.create(), PartPose.offset(0.5F, -182.25F, -41.75F));
		PartDefinition cube_r80 = bone45.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(340, 314).addBox(-21.5F, 0.0F, 0.0F, 42.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r81 = bone45.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(230, 310).addBox(-21.5F, 0.0734F, 0.0151F, 42.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r82 = bone45.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(412, 160).addBox(-21.5F, -0.0482F, 0.0046F, 42.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone46 = bone45.addOrReplaceChild("bone46", CubeListBuilder.create(), PartPose.offset(0.0F, 18.25F, -5.55F));
		PartDefinition cube_r83 = bone46.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(412, 68).addBox(-21.5F, 0.8016F, 1.6546F, 42.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone49 = sail2.addOrReplaceChild("bone49", CubeListBuilder.create(), PartPose.offset(0.5F, -156.0F, -43.5F));
		PartDefinition cube_r84 = bone49.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(729, 362).addBox(-34.5F, 0.0F, 0.0F, 69.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r85 = bone49.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(732, 527).addBox(-34.5F, 0.0734F, 0.0151F, 69.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r86 = bone49.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(729, 337).addBox(-34.5F, -0.0482F, 0.0046F, 69.0F, 17.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0611F, 0.0F, 0.0F));
		PartDefinition cube_r87 = bone49.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(732, 535).addBox(-34.5F, 0.9016F, 1.9046F, 69.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 30.25F, -5.25F, 0.5236F, 0.0F, 0.0F));
		PartDefinition sail3 = partdefinition.addOrReplaceChild("sail3",
				CubeListBuilder.create().texOffs(86, 28).addBox(-0.5F, -163.0F, -41.5F, 1.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(281, 198).addBox(-29.0F, -77.0F, -44.0F, 58.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(592, 600)
						.addBox(-1.0F, -50.0F, -40.0F, 2.0F, 2.0F, 72.0F, new CubeDeformation(0.0F)).texOffs(609, 617).addBox(-1.0F, -81.0F, -189.0F, 2.0F, 2.0F, 55.0F, new CubeDeformation(0.0F)).texOffs(574, 588)
						.addBox(-37.0F, -107.0F, -44.0F, 74.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 0).addBox(-25.0F, -131.0F, -44.0F, 50.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(-16.0F, -156.0F, -42.25F, 32.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 147.0F));
		PartDefinition octagon5 = sail3.addOrReplaceChild("octagon5",
				CubeListBuilder.create().texOffs(594, 0).addBox(-0.8284F, -34.0F, 9.0F, 1.0F, 33.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(574, 518).addBox(-2.0F, -34.0F, 10.1716F, 4.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -74.0F, -52.0F));
		PartDefinition octagon_r7 = octagon5.addOrReplaceChild("octagon_r7",
				CubeListBuilder.create().texOffs(584, 518).addBox(-2.0F, -31.0F, -0.8284F, 4.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(604, 0).addBox(-0.8284F, -31.0F, -2.0F, 1.0F, 33.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition octagon6 = sail3.addOrReplaceChild("octagon6",
				CubeListBuilder.create().texOffs(479, 0).addBox(-0.6213F, -34.5F, 9.5F, 1.0F, 33.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(126, 570).addBox(-1.5F, -34.5F, 10.3787F, 3.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -106.0F, -52.0F));
		PartDefinition octagon_r8 = octagon6.addOrReplaceChild("octagon_r8",
				CubeListBuilder.create().texOffs(168, 570).addBox(-1.5F, -31.5F, -0.6213F, 3.0F, 33.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(487, 0).addBox(-0.6213F, -31.5F, -1.5F, 1.0F, 33.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition flag3 = sail3.addOrReplaceChild("flag3",
				CubeListBuilder.create().texOffs(88, 53).addBox(0.1289F, -136.5F, -4.0991F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 0).addBox(0.1289F, -136.5F, -9.9116F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3789F, -25.0F, -30.8384F));
		PartDefinition cube_r88 = flag3.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(81, 0).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, -135.0F, -5.9741F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r89 = flag3.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(88, 50).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, -135.0F, -7.9116F, 0.0F, -0.2618F, 0.0F));
		PartDefinition bone41 = flag3.addOrReplaceChild("bone41", CubeListBuilder.create(), PartPose.offset(0.8789F, -105.0F, -12.6616F));
		PartDefinition cube_r90 = bone41.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(396, 654).addBox(-29.5F, 0.0F, 0.0F, 58.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r91 = bone41.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(281, 190).addBox(-29.5F, 0.0734F, 0.0151F, 58.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r92 = bone41.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(396, 660).addBox(-29.5F, -0.0482F, 0.0046F, 58.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone42 = bone41.addOrReplaceChild("bone42", CubeListBuilder.create(), PartPose.offset(0.0F, 18.25F, -5.55F));
		PartDefinition cube_r93 = bone42.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(281, 202).addBox(-29.5F, 0.8016F, 1.6546F, 58.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition octagon7 = sail3.addOrReplaceChild("octagon7",
				CubeListBuilder.create().texOffs(72, 0).addBox(-1.0355F, -83.5F, 8.5F, 2.0F, 83.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(212, 884).addBox(-2.5F, -83.5F, 9.9645F, 5.0F, 83.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 7.0F, -52.0F));
		PartDefinition octagon_r9 = octagon7.addOrReplaceChild("octagon_r9",
				CubeListBuilder.create().texOffs(226, 884).addBox(-2.5F, -80.5F, -1.0355F, 5.0F, 83.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 97).addBox(-1.0355F, -80.5F, -2.5F, 2.0F, 83.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition bone40 = sail3.addOrReplaceChild("bone40", CubeListBuilder.create(), PartPose.offset(0.5F, -105.0F, -43.5F));
		PartDefinition cube_r94 = bone40.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(680, 75).addBox(-39.5F, 0.0F, 0.0F, 78.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r95 = bone40.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(662, 395).addBox(-39.5F, 0.0734F, 0.0151F, 78.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r96 = bone40.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(675, 152).addBox(-39.5F, -0.0482F, 0.0046F, 78.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r97 = bone40.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(680, 67).addBox(-39.5F, 0.8016F, 1.6546F, 78.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 21.25F, -5.25F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone37 = sail3.addOrReplaceChild("bone37", CubeListBuilder.create(), PartPose.offset(0.5F, -75.0F, -43.5F));
		PartDefinition cube_r98 = bone37.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(180, 646).addBox(-37.5F, 0.0F, 0.0F, 73.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r99 = bone37.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(729, 354).addBox(-37.5F, 0.0734F, 0.0151F, 73.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r100 = bone37.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(729, 325).addBox(-37.5F, -0.0482F, 0.0046F, 73.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, -0.0873F, 0.0F, 0.0F));
		PartDefinition cube_r101 = bone37.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(662, 371).addBox(-37.5F, -0.0984F, 0.0546F, 73.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 25.25F, -5.25F, 0.1309F, 0.0F, 0.0F));
		PartDefinition bone43 = sail3.addOrReplaceChild("bone43", CubeListBuilder.create(), PartPose.offset(0.5F, -155.25F, -41.75F));
		PartDefinition cube_r102 = bone43.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(340, 314).addBox(-21.5F, 0.0F, 0.0F, 42.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition cube_r103 = bone43.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(230, 310).addBox(-21.5F, 0.0734F, 0.0151F, 42.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.25F, -2.75F, -0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r104 = bone43.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(412, 160).addBox(-21.5F, -0.0482F, 0.0046F, 42.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.25F, -4.15F, 0.0873F, 0.0F, 0.0F));
		PartDefinition bone44 = bone43.addOrReplaceChild("bone44", CubeListBuilder.create(), PartPose.offset(0.0F, 18.25F, -5.55F));
		PartDefinition cube_r105 = bone44.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(412, 68).addBox(-21.5F, 0.8016F, 1.6546F, 42.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition bone11 = partdefinition.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offset(22.0F, 2.5F, -77.0F));
		PartDefinition cube_r106 = bone11.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(344, 45).mirror().addBox(1.0F, -6.5F, -20.0F, 0.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-44.0F, -3.0F, 11.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r107 = bone11.addOrReplaceChild("cube_r107",
				CubeListBuilder.create().texOffs(344, 45).addBox(-1.0F, -6.5F, -20.0F, 0.0F, 5.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(336, 593).addBox(-2.0F, -1.5F, -20.0F, 2.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone12 = partdefinition.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(15.1625F, 2.5F, -95.8125F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r108 = bone12.addOrReplaceChild("cube_r108",
				CubeListBuilder.create().texOffs(281, 19).addBox(-8.0707F, -9.5F, -15.5735F, 0.0F, 5.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(281, 16).addBox(-9.0707F, -4.5F, -15.5735F, 2.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.1625F, 2.5F, -95.8125F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone14 = partdefinition.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 27.5F, 103.25F, 0.5672F, 0.0F, 0.0F));
		PartDefinition cube_r109 = bone14.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(518, 23).addBox(-2.0F, 12.7154F, 4.1366F, 4.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition bone26 = partdefinition.addOrReplaceChild("bone26",
				CubeListBuilder.create().texOffs(491, 596).addBox(-2.0F, -5.5F, 11.5F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 150).addBox(-2.0F, -2.5F, 11.5F, 4.0F, 12.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 25.9487F, 111.1315F));
		PartDefinition cube_r110 = bone26.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(438, 246).addBox(-2.0F, 0.0F, 0.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, 18.5F, -0.2182F, 0.0F, 0.0F));
		PartDefinition cube_r111 = bone26.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(184, 150).addBox(-2.0F, 0.0631F, 0.0193F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.7F, 22.4F, -0.7854F, 0.0F, 0.0F));
		PartDefinition bone27 = partdefinition.addOrReplaceChild("bone27",
				CubeListBuilder.create().texOffs(499, 43).addBox(14.0F, -24.0F, -31.0F, 4.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(499, 129).addBox(6.0F, -24.0F, -38.0F, 4.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(499, 88)
						.addBox(10.0F, -24.0F, -35.0F, 4.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(839, 48).addBox(2.0F, -24.0F, -33.0F, 4.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(839, 620)
						.addBox(-2.0F, -24.0F, -39.0F, 4.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(146, 838).addBox(-6.0F, -24.0F, -24.0F, 4.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(492, 789)
						.addBox(-10.0F, -24.0F, -31.0F, 4.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(751, 787).addBox(-18.0F, -24.0F, -33.0F, 4.0F, 1.0F, 41.0F, new CubeDeformation(0.0F)).texOffs(442, 745)
						.addBox(-14.0F, -24.0F, -39.0F, 4.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(0, 570).addBox(-20.0F, -24.0F, -37.0F, 2.0F, 1.0F, 40.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bone28 = partdefinition.addOrReplaceChild("bone28",
				CubeListBuilder.create().texOffs(0, 570).addBox(14.0F, -24.0F, -31.0F, 4.0F, 1.0F, 86.0F, new CubeDeformation(0.0F)).texOffs(0, 571).mirror().addBox(-18.0F, -24.0F, -32.0F, 4.0F, 1.0F, 86.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(597, 674).addBox(6.0F, -24.0F, -38.0F, 4.0F, 1.0F, 60.0F, new CubeDeformation(0.0F)).texOffs(340, 215).addBox(10.0F, -24.0F, -35.0F, 4.0F, 1.0F, 90.0F, new CubeDeformation(0.0F)).texOffs(281, 16)
						.addBox(2.0F, -24.0F, -33.0F, 4.0F, 1.0F, 55.0F, new CubeDeformation(0.0F)).texOffs(730, 721).addBox(-2.0F, -24.0F, -39.0F, 4.0F, 1.0F, 61.0F, new CubeDeformation(0.0F)).texOffs(693, 783)
						.addBox(-6.0F, -24.0F, -24.0F, 4.0F, 1.0F, 46.0F, new CubeDeformation(0.0F)).texOffs(336, 534).addBox(-10.0F, -24.0F, -31.0F, 4.0F, 1.0F, 53.0F, new CubeDeformation(0.0F)).texOffs(0, 97)
						.addBox(-14.0F, -24.0F, -39.0F, 4.0F, 1.0F, 93.0F, new CubeDeformation(0.0F)).texOffs(437, 215).addBox(-20.0F, -24.0F, -37.0F, 2.0F, 1.0F, 91.0F, new CubeDeformation(0.0F)).texOffs(94, 570)
						.addBox(18.0F, -24.0F, -27.0F, 2.0F, 1.0F, 82.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 40.0F));
		PartDefinition bone29 = partdefinition.addOrReplaceChild("bone29",
				CubeListBuilder.create().texOffs(788, 420).addBox(14.0F, -24.0F, -35.0F, 4.0F, 1.0F, 44.0F, new CubeDeformation(0.0F)).texOffs(278, 730).addBox(6.0F, -24.0F, -48.0F, 4.0F, 1.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(72, 657)
						.addBox(10.0F, -24.0F, -45.0F, 4.0F, 1.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(144, 727).addBox(2.0F, -24.0F, -55.0F, 4.0F, 1.0F, 62.0F, new CubeDeformation(0.0F)).texOffs(729, 263)
						.addBox(-2.0F, -24.0F, -60.0F, 4.0F, 1.0F, 61.0F, new CubeDeformation(0.0F)).texOffs(627, 179).addBox(-6.0F, -24.0F, -55.0F, 4.0F, 1.0F, 71.0F, new CubeDeformation(0.0F)).texOffs(336, 593)
						.addBox(-10.0F, -24.0F, -49.0F, 4.0F, 1.0F, 58.0F, new CubeDeformation(0.0F)).texOffs(497, 837).addBox(-18.0F, -24.0F, -35.0F, 4.0F, 1.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(295, 781)
						.addBox(-14.0F, -24.0F, -45.0F, 4.0F, 1.0F, 46.0F, new CubeDeformation(0.0F)).texOffs(180, 570).addBox(-20.0F, -24.0F, -31.0F, 2.0F, 1.0F, 34.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -40.0F));
		PartDefinition bone30 = partdefinition.addOrReplaceChild("bone30",
				CubeListBuilder.create().texOffs(446, 837).addBox(14.0F, -24.0F, -40.0F, 4.0F, 1.0F, 43.0F, new CubeDeformation(0.0F)).texOffs(732, 478).addBox(6.0F, -24.0F, -39.0F, 4.0F, 1.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(587, 741)
						.addBox(10.0F, -24.0F, -40.0F, 4.0F, 1.0F, 47.0F, new CubeDeformation(0.0F)).texOffs(402, 596).addBox(2.0F, -24.0F, -39.0F, 4.0F, 1.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(732, 420)
						.addBox(-2.0F, -24.0F, -39.0F, 4.0F, 1.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(455, 534).addBox(-6.0F, -24.0F, -39.0F, 4.0F, 1.0F, 51.0F, new CubeDeformation(0.0F)).texOffs(336, 730)
						.addBox(-10.0F, -24.0F, -39.0F, 4.0F, 1.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(747, 783).addBox(-18.0F, -24.0F, -41.0F, 4.0F, 1.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(485, 741)
						.addBox(-14.0F, -24.0F, -41.0F, 4.0F, 1.0F, 47.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 135.0F));
		PartDefinition treasurechest = partdefinition.addOrReplaceChild("treasurechest", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, -1.0F, -34.5F, 0.0F, 2.8798F, 0.0F));
		PartDefinition chestlid = treasurechest.addOrReplaceChild("chestlid", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.0F, -9.0F, -35.5375F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r112 = chestlid.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1752F, -40.6185F, 7.3784F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -4.1548F, -0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r113 = chestlid.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1852F, 18.9272F, 30.4592F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r114 = chestlid.addOrReplaceChild("cube_r114",
				CubeListBuilder.create().texOffs(70, 1006).addBox(13.2652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 1006).addBox(8.0652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, -1.6548F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r115 = chestlid.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(50, 1016).addBox(8.1752F, 37.9844F, -1.6883F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, -4.1548F, 1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r116 = chestlid.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(52, 1010).addBox(8.1652F, 30.5871F, 13.2844F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chest = treasurechest.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(2, 1006).addBox(8.1752F, -6.0F, 45.8671F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 2.0F, -48.5F));
		PartDefinition goldbarrel = partdefinition.addOrReplaceChild("goldbarrel",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(140, 18).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 12)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0995F, -5.4833F, -58.7568F, 0.0F, 0.7854F, 0.0F));
		PartDefinition bone33 = partdefinition.addOrReplaceChild("bone33", CubeListBuilder.create().texOffs(0, 0).addBox(-22.0F, -72.0F, -150.0F, 0.0F, 144.0F, 331.0F, new CubeDeformation(0.0F)), PartPose.offset(22.0F, -72.0F, -2.0F));
		PartDefinition cube_r117 = bone33.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(0, 309).mirror().addBox(10.0F, -65.0F, -50.0F, 0.0F, 95.0F, 166.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r118 = bone33.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 309).addBox(-10.0F, -65.0F, -50.0F, 0.0F, 95.0F, 166.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-44.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r119 = bone33.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(340, 179).addBox(0.0F, -1.0F, -17.0F, 0.0F, 53.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(340, 179)
				.addBox(0.0F, -1.0F, 129.0F, 0.0F, 53.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(340, 179).addBox(0.0F, -1.0F, 68.0F, 0.0F, 53.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-25.0F, 21.0F, -39.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition cube_r120 = bone33.addOrReplaceChild("cube_r120",
				CubeListBuilder.create().texOffs(340, 179).mirror().addBox(0.0F, -1.0F, -17.0F, 0.0F, 53.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(340, 179).mirror()
						.addBox(0.0F, -1.0F, 130.0F, 0.0F, 53.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(340, 179).mirror().addBox(0.0F, -1.0F, 69.0F, 0.0F, 53.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-19.0F, 21.0F, -39.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition hexadecagon = partdefinition.addOrReplaceChild("hexadecagon",
				CubeListBuilder.create().texOffs(629, 674).addBox(-1.5913F, -39.0F, 0.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(668, 596).addBox(-1.5913F, -39.0F, 15.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(206, 663)
						.addBox(7.0F, -39.0F, 6.4087F, 1.0F, 41.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(182, 663).addBox(-8.0F, -39.0F, 6.4087F, 1.0F, 41.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, 12.0F, -0.1309F, 0.0F, 0.0F));
		PartDefinition hexadecagon_r1 = hexadecagon.addOrReplaceChild("hexadecagon_r1",
				CubeListBuilder.create().texOffs(239, 660).addBox(-8.0F, -25.0F, -1.5913F, 1.0F, 41.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(198, 663).addBox(7.0F, -25.0F, -1.5913F, 1.0F, 41.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(230, 663)
						.addBox(-1.5913F, -25.0F, 7.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(621, 674).addBox(-1.5913F, -25.0F, -8.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 8.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition hexadecagon_r2 = hexadecagon.addOrReplaceChild("hexadecagon_r2",
				CubeListBuilder.create().texOffs(190, 663).addBox(-8.0F, -25.0F, -1.5913F, 1.0F, 41.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(214, 663).addBox(7.0F, -25.0F, -1.5913F, 1.0F, 41.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(597, 674)
						.addBox(-1.5913F, -25.0F, 7.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(637, 674).addBox(-1.5913F, -25.0F, -8.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 8.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition hexadecagon_r3 = hexadecagon.addOrReplaceChild("hexadecagon_r3",
				CubeListBuilder.create().texOffs(222, 663).addBox(-1.5913F, -25.0F, 7.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(613, 674).addBox(-1.5913F, -25.0F, -8.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 8.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition hexadecagon_r4 = hexadecagon.addOrReplaceChild("hexadecagon_r4",
				CubeListBuilder.create().texOffs(605, 674).addBox(-1.5913F, -25.0F, 7.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(645, 674).addBox(-1.5913F, -25.0F, -8.0F, 3.0F, 41.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.0F, 8.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition treasurechest2 = partdefinition.addOrReplaceChild("treasurechest2", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 0.0F, -7.5F, 0.0F, -2.2689F, 0.0F));
		PartDefinition chestlid4 = treasurechest2.addOrReplaceChild("chestlid4", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.0F, -9.0F, -35.5375F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r121 = chestlid4.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1752F, -40.6185F, 7.3784F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -4.1548F, -0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r122 = chestlid4.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1852F, 18.9272F, 30.4592F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r123 = chestlid4.addOrReplaceChild("cube_r123",
				CubeListBuilder.create().texOffs(70, 1006).addBox(13.2652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 1006).addBox(8.0652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, -1.6548F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r124 = chestlid4.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 1016).addBox(8.1752F, 37.9844F, -1.6883F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, -4.1548F, 1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r125 = chestlid4.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(52, 1010).addBox(8.1652F, 30.5871F, 13.2844F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chest4 = treasurechest2.addOrReplaceChild("chest4", CubeListBuilder.create().texOffs(2, 1006).addBox(8.1752F, -6.0F, 45.8671F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 2.0F, -48.5F));
		PartDefinition bone34 = partdefinition.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.1625F, 2.5F, -95.8125F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone54 = partdefinition.addOrReplaceChild("bone54", CubeListBuilder.create().texOffs(50, 137).mirror().addBox(-10.4F, -36.0F, -16.0F, 3.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(58, 150).addBox(-10.0F,
				-34.0F, -16.0125F, 2.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r126 = bone54.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(339, 95).addBox(-2.0F, -3.0F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -34.0F, -14.0F, -0.48F, 0.0F, 0.0F));
		PartDefinition captianswheel = bone54.addOrReplaceChild("captianswheel",
				CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -35.0F, -14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 12).addBox(-2.0F, -37.0F, -16.0F, 4.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 2.0F, 0.0F));
		PartDefinition octagon8 = captianswheel.addOrReplaceChild("octagon8", CubeListBuilder.create().texOffs(80, 52).addBox(-0.5F, 14.0F, -31.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, 2.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r127 = octagon8
				.addOrReplaceChild(
						"cube_r127", CubeListBuilder.create().texOffs(982, 319).addBox(-6.75F, 0.25F, -7.25F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(982, 319)
								.addBox(-6.75F, -0.25F, -7.25F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(1012, 46).addBox(-1.25F, -0.5F, -1.75F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 14.0F, -24.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r128 = octagon8.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(0, 0).addBox(-24.5F, 14.0F, -7.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r129 = octagon8.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(14, 8).addBox(-17.4706F, 14.0F, 9.9706F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, -0.7854F, 3.1416F));
		PartDefinition cube_r130 = octagon8.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(14, 14).addBox(-0.5F, 14.0F, 17.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r131 = octagon8.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(16, 8).addBox(-17.4706F, 14.0F, -23.9706F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r132 = octagon8.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(16, 14).addBox(16.4706F, 14.0F, 9.9706F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition cube_r133 = octagon8.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(18, 0).addBox(23.5F, 14.0F, -7.0F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r134 = octagon8.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(20, 0).addBox(16.4706F, 14.0F, -23.9706F, 1.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition lifeboat2 = partdefinition.addOrReplaceChild("lifeboat2",
				CubeListBuilder.create().texOffs(336, 523).addBox(-7.0F, -9.2625F, 31.0375F, 14.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(455, 486).addBox(-0.7375F, -10.175F, 30.325F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(78, 187).addBox(-4.2625F, -10.1125F, 30.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(181, 187).addBox(-1.225F, -7.225F, 31.2125F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(101, 91)
						.addBox(-3.8875F, -8.75F, 31.2875F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 160).addBox(-4.8875F, -6.35F, 31.2875F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(354, 96)
						.addBox(-3.0F, -6.0F, 31.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-22.5F, -6.0F, 64.0F));
		PartDefinition cube_r135 = lifeboat2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(394, 488).addBox(-2.5F, -0.4F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -9.0F, 31.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r136 = lifeboat2.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(417, 488).addBox(-2.5F, -0.5F, -1.2875F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -9.0F, 31.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r137 = lifeboat2.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(112, 12).addBox(-1.175F, -0.6375F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2875F, -7.8875F, 31.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r138 = lifeboat2.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(206, 48).addBox(-0.825F, -0.6375F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2875F, -7.8875F, 31.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r139 = lifeboat2.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(206, 24).addBox(-2.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -3.0F, 31.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r140 = lifeboat2.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(373, 90).addBox(-3.9347F, -3.1007F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -3.525F, 31.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r141 = lifeboat2.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(206, 28).addBox(0.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -3.0F, 31.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r142 = lifeboat2.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(373, 94).addBox(-0.0653F, -3.1007F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -3.525F, 31.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition bone2 = lifeboat2.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(574, 518).addBox(-8.5305F, 0.6607F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(255, 570)
				.addBox(-10.5305F, 0.4107F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(340, 268).addBox(-6.5305F, 0.4107F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5305F, -4.4107F, 0.5F));
		PartDefinition cube_r143 = bone2.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(81, 97).addBox(-2.0F, -0.1699F, -3.9726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5305F, 0.5875F, -5.39F, -0.1683F, 0.1721F, -0.0291F));
		PartDefinition cube_r144 = bone2.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(116, 150).addBox(0.0F, -0.1699F, -3.9726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5305F, 0.5875F, -5.39F, -0.1683F, -0.1721F, 0.0291F));
		PartDefinition cube_r145 = bone2.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(116, 155).addBox(-1.0F, -0.75F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5305F, 1.4107F, -5.5F, -0.1658F, 0.0F, 0.0F));
		PartDefinition cube_r146 = bone2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(548, 520).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0105F, 0.0F, -1.309F));
		PartDefinition cube_r147 = bone2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(438, 226).addBox(-0.75F, -1.0F, -3.5F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3234F, -2.8706F, -12.0905F, -0.7109F, 0.2332F, -1.3086F));
		PartDefinition cube_r148 = bone2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(384, 176).addBox(-0.1294F, -1.1304F, -8.8794F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9F, -4.0F, -9.2875F, -0.7418F, 0.0F, -1.5708F));
		PartDefinition cube_r149 = bone2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(845, 226).addBox(-0.1294F, -1.0251F, -0.0093F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -4.0F, -5.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r150 = bone2.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(160, 16).addBox(-0.75F, -0.6625F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8017F, -2.8706F, -6.9935F, -0.413F, 0.1451F, -1.2522F));
		PartDefinition cube_r151 = bone2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(292, 72).addBox(-0.1294F, -1.0251F, -4.0093F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -4.0F, -5.5F, -0.4363F, 0.0F, -1.5708F));
		PartDefinition cube_r152 = bone2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(420, 566).addBox(-1.1294F, -1.0251F, -0.0093F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.0F, -5.5F, -0.0175F, 0.0F, -1.309F));
		PartDefinition cube_r153 = bone2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(217, 320).addBox(-0.1946F, -1.0851F, -2.6872F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2448F, -0.9311F, -9.0F, -0.7905F, 0.2962F, -1.1949F));
		PartDefinition cube_r154 = bone2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(185, 191).addBox(0.0808F, -0.995F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2448F, -0.4311F, -5.5F, -0.333F, 0.1111F, -1.0056F));
		PartDefinition cube_r155 = bone2.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(184, 144).addBox(-1.0083F, -0.6987F, -5.0843F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2448F, -0.4311F, -9.0F, -0.736F, 0.1159F, -0.8374F));
		PartDefinition cube_r156 = bone2.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(293, 16).addBox(-1.9192F, -0.995F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2448F, -0.4311F, -5.5F, -0.3079F, 0.1248F, -0.825F));
		PartDefinition cube_r157 = bone2.addOrReplaceChild("cube_r157",
				CubeListBuilder.create().texOffs(14, 613).addBox(-0.0613F, -1.0347F, -16.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(582, 540).addBox(1.9387F, -1.0347F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5305F, 0.9107F, 10.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r158 = bone2.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(339, 90).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2448F, -0.1311F, 23.0F, 0.0524F, 0.0F, -0.7854F));
		PartDefinition cube_r159 = bone2.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(340, 288).addBox(-1.0F, -0.5F, -7.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2448F, -0.1311F, 12.0F, -0.0087F, 0.0F, -0.7854F));
		PartDefinition cube_r160 = bone2.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(484, 614).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7687F, -1.4835F, 13.5F, 0.0436F, 0.0F, -0.7854F));
		PartDefinition cube_r161 = bone2.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(537, 564).addBox(-1.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8306F, -1.5453F, 1.5F, -0.0175F, 0.0F, -0.7854F));
		PartDefinition cube_r162 = bone2.addOrReplaceChild("cube_r162",
				CubeListBuilder.create().texOffs(179, 97).addBox(-1.7346F, -0.9168F, -3.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(359, 276).addBox(-0.7346F, -0.9168F, -7.0245F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0065F, 0.3564F, -9.25F, -0.59F, 0.2404F, -0.3057F));
		PartDefinition cube_r163 = bone2.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(325, 178).addBox(-1.9659F, -0.7588F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.694F, 0.6689F, -5.5F, -0.2148F, 0.2404F, -0.3057F));
		PartDefinition cube_r164 = bone2.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(594, 43).addBox(0.0F, -1.0F, -16.0F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5305F, 1.4107F, 10.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r165 = bone2.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(455, 39).addBox(-1.0F, -0.375F, -5.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 21.0F, -0.0192F, 0.0F, -1.309F));
		PartDefinition cube_r166 = bone2.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(485, 238).addBox(-1.0F, -0.375F, -5.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.061F, -3.0F, 21.0F, -0.0192F, 0.0F, 1.309F));
		PartDefinition cube_r167 = bone2.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(551, 236).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.061F, -3.0F, 11.0F, 0.0105F, 0.0F, 1.309F));
		PartDefinition cube_r168 = bone2.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(438, 270).addBox(-1.25F, -1.0F, -3.5F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7376F, -2.8706F, -12.0905F, -0.7109F, -0.2332F, 1.3086F));
		PartDefinition cube_r169 = bone2.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(455, 16).addBox(-0.8706F, -1.1304F, -8.8794F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.161F, -4.0F, -9.2875F, -0.7418F, 0.0F, 1.5708F));
		PartDefinition cube_r170 = bone2.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(845, 266).addBox(-0.8706F, -1.0251F, -0.0093F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.811F, -4.0F, -5.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r171 = bone2.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(441, 28).addBox(-1.25F, -0.6625F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2593F, -2.8706F, -6.9935F, -0.413F, -0.1451F, 1.2522F));
		PartDefinition cube_r172 = bone2.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(322, 310).addBox(-0.8706F, -1.0251F, -4.0093F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.811F, -4.0F, -5.5F, -0.4363F, 0.0F, 1.5708F));
		PartDefinition cube_r173 = bone2.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(136, 588).addBox(-0.8706F, -1.0251F, -0.0093F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.561F, -3.0F, -5.5F, -0.0175F, 0.0F, 1.309F));
		PartDefinition cube_r174 = bone2.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(346, 115).addBox(-1.8054F, -1.0851F, -2.6872F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.8162F, -0.9311F, -9.0F, -0.7905F, -0.2962F, 1.1949F));
		PartDefinition cube_r175 = bone2.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(468, 292).addBox(-2.0808F, -0.995F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.8162F, -0.4311F, -5.5F, -0.333F, -0.1111F, 1.0056F));
		PartDefinition cube_r176 = bone2.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(354, 90).addBox(-0.9917F, -0.6987F, -5.0843F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.8162F, -0.4311F, -9.0F, -0.736F, -0.1159F, 0.8374F));
		PartDefinition cube_r177 = bone2.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(484, 134).addBox(-0.0808F, -0.995F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.8162F, -0.4311F, -5.5F, -0.3079F, -0.1248F, 0.825F));
		PartDefinition cube_r178 = bone2.addOrReplaceChild("cube_r178",
				CubeListBuilder.create().texOffs(614, 518).addBox(-1.9387F, -1.0347F, -16.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 591).addBox(-3.9387F, -1.0347F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.5305F, 0.9107F, 10.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r179 = bone2.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(373, 90).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.8162F, -0.1311F, 23.0F, 0.0524F, 0.0F, 0.7854F));
		PartDefinition cube_r180 = bone2.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(499, 23).addBox(-1.0F, -0.5F, -7.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.8162F, -0.1311F, 12.0F, -0.0087F, 0.0F, 0.7854F));
		PartDefinition cube_r181 = bone2.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(614, 529).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2923F, -1.4835F, 13.5F, 0.0436F, 0.0F, 0.7854F));
		PartDefinition cube_r182 = bone2.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(218, 570).addBox(-1.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2304F, -1.5453F, 1.5F, -0.0175F, 0.0F, 0.7854F));
		PartDefinition cube_r183 = bone2.addOrReplaceChild("cube_r183",
				CubeListBuilder.create().texOffs(189, 97).addBox(0.7346F, -0.9168F, -3.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(359, 288).addBox(-0.2654F, -0.9168F, -7.0245F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0545F, 0.3564F, -9.25F, -0.59F, -0.2404F, 0.3057F));
		PartDefinition cube_r184 = bone2.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(485, 52).addBox(-0.0341F, -0.7588F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.367F, 0.6689F, -5.5F, -0.2148F, -0.2404F, 0.3057F));
		PartDefinition cube_r185 = bone2.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(594, 85).addBox(-2.0F, -1.0F, -16.0F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5305F, 1.4107F, 10.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone51 = bone2.addOrReplaceChild("bone51", CubeListBuilder.create(), PartPose.offset(-7.5305F, 3.7607F, -30.425F));
		PartDefinition cube_r186 = bone51.addOrReplaceChild("cube_r186",
				CubeListBuilder.create().texOffs(359, 268).addBox(0.0F, -0.9388F, -8.9294F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(164, 27).addBox(0.0F, -0.9388F, -1.9294F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3125F, -3.0902F, 20.9695F, -0.5729F, -0.1323F, 0.0849F));
		PartDefinition cube_r187 = bone51.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(160, 21).addBox(-2.0F, -0.9388F, -1.9294F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3125F, -3.0902F, 20.9695F, -0.5729F, 0.1323F, -0.0849F));
		PartDefinition cube_r188 = bone51.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(16, 591).addBox(-1.0F, -1.7485F, -10.0036F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 21.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition bone53 = lifeboat2.addOrReplaceChild("bone53",
				CubeListBuilder.create().texOffs(281, 159).addBox(-32.0F, -48.0F, 84.25F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 84.0F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.75F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 83.5F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.4F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 83.65F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.9F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 84.15F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(22.5F, 27.0F, -89.0F));
		PartDefinition bone55 = lifeboat2.addOrReplaceChild("bone55",
				CubeListBuilder.create().texOffs(281, 159).addBox(-32.0F, -48.0F, 84.25F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 84.0F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.75F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 83.5F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.4F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 83.65F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.9F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 84.15F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(22.5F, 27.0F, -72.0F));
		PartDefinition bone52 = lifeboat2.addOrReplaceChild("bone52",
				CubeListBuilder.create().texOffs(281, 159).addBox(-32.0F, -48.0F, 84.25F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 84.0F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.75F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 83.5F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.4F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 83.65F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159)
						.addBox(-32.0F, -48.0F, 83.9F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(281, 159).addBox(-32.0F, -48.0F, 84.15F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(22.5F, 27.0F, -58.0F));
		PartDefinition lifeboat4 = partdefinition.addOrReplaceChild("lifeboat4",
				CubeListBuilder.create().texOffs(336, 523).addBox(-7.0F, -9.2625F, 31.0375F, 14.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(455, 486).addBox(-0.7375F, -10.175F, 30.325F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(78, 187).addBox(-4.2625F, -10.1125F, 30.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(181, 187).addBox(-1.225F, -7.225F, 31.2125F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(101, 91)
						.addBox(-3.8875F, -8.75F, 31.2875F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 160).addBox(-4.8875F, -6.35F, 31.2875F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(354, 96)
						.addBox(-3.0F, -6.0F, 31.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 132.0F));
		PartDefinition cube_r189 = lifeboat4.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(394, 488).addBox(-2.5F, -0.4F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -9.0F, 31.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r190 = lifeboat4.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(417, 488).addBox(-2.5F, -0.5F, -1.2875F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.5F, -9.0F, 31.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r191 = lifeboat4.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(112, 12).addBox(-1.175F, -0.6375F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2875F, -7.8875F, 31.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r192 = lifeboat4.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(206, 48).addBox(-0.825F, -0.6375F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2875F, -7.8875F, 31.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r193 = lifeboat4.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(206, 24).addBox(-2.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -3.0F, 31.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r194 = lifeboat4.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(373, 90).addBox(-3.9347F, -3.1007F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -3.525F, 31.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r195 = lifeboat4.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(206, 28).addBox(0.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -3.0F, 31.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r196 = lifeboat4.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(373, 94).addBox(-0.0653F, -3.1007F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -3.525F, 31.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition bone5 = lifeboat4.addOrReplaceChild("bone5", CubeListBuilder.create().texOffs(574, 518).addBox(-8.5305F, 0.6607F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(255, 570)
				.addBox(-10.5305F, 0.4107F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(340, 268).addBox(-6.5305F, 0.4107F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5305F, -4.4107F, 0.5F));
		PartDefinition cube_r197 = bone5.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(81, 97).addBox(-2.0F, -0.1699F, -3.9726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5305F, 0.5875F, -5.39F, -0.1683F, 0.1721F, -0.0291F));
		PartDefinition cube_r198 = bone5.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(116, 150).addBox(0.0F, -0.1699F, -3.9726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5305F, 0.5875F, -5.39F, -0.1683F, -0.1721F, 0.0291F));
		PartDefinition cube_r199 = bone5.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(116, 155).addBox(-1.0F, -0.75F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5305F, 1.4107F, -5.5F, -0.1658F, 0.0F, 0.0F));
		PartDefinition cube_r200 = bone5.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(548, 520).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0105F, 0.0F, -1.309F));
		PartDefinition cube_r201 = bone5.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(438, 226).addBox(-0.75F, -1.0F, -3.5F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3234F, -2.8706F, -12.0905F, -0.7109F, 0.2332F, -1.3086F));
		PartDefinition cube_r202 = bone5.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(384, 176).addBox(-0.1294F, -1.1304F, -8.8794F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.9F, -4.0F, -9.2875F, -0.7418F, 0.0F, -1.5708F));
		PartDefinition cube_r203 = bone5.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(845, 226).addBox(-0.1294F, -1.0251F, -0.0093F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -4.0F, -5.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r204 = bone5.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(160, 16).addBox(-0.75F, -0.6625F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8017F, -2.8706F, -6.9935F, -0.413F, 0.1451F, -1.2522F));
		PartDefinition cube_r205 = bone5.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(292, 72).addBox(-0.1294F, -1.0251F, -4.0093F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.75F, -4.0F, -5.5F, -0.4363F, 0.0F, -1.5708F));
		PartDefinition cube_r206 = bone5.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(420, 566).addBox(-1.1294F, -1.0251F, -0.0093F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -3.0F, -5.5F, -0.0175F, 0.0F, -1.309F));
		PartDefinition cube_r207 = bone5.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(217, 320).addBox(-0.1946F, -1.0851F, -2.6872F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2448F, -0.9311F, -9.0F, -0.7905F, 0.2962F, -1.1949F));
		PartDefinition cube_r208 = bone5.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(185, 191).addBox(0.0808F, -0.995F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2448F, -0.4311F, -5.5F, -0.333F, 0.1111F, -1.0056F));
		PartDefinition cube_r209 = bone5.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(184, 144).addBox(-1.0083F, -0.6987F, -5.0843F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2448F, -0.4311F, -9.0F, -0.736F, 0.1159F, -0.8374F));
		PartDefinition cube_r210 = bone5.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(293, 16).addBox(-1.9192F, -0.995F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.2448F, -0.4311F, -5.5F, -0.3079F, 0.1248F, -0.825F));
		PartDefinition cube_r211 = bone5.addOrReplaceChild("cube_r211",
				CubeListBuilder.create().texOffs(14, 613).addBox(-0.0613F, -1.0347F, -16.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(582, 540).addBox(1.9387F, -1.0347F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5305F, 0.9107F, 10.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r212 = bone5.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(339, 90).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2448F, -0.1311F, 23.0F, 0.0524F, 0.0F, -0.7854F));
		PartDefinition cube_r213 = bone5.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(340, 288).addBox(-1.0F, -0.5F, -7.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.2448F, -0.1311F, 12.0F, -0.0087F, 0.0F, -0.7854F));
		PartDefinition cube_r214 = bone5.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(484, 614).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7687F, -1.4835F, 13.5F, 0.0436F, 0.0F, -0.7854F));
		PartDefinition cube_r215 = bone5.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(537, 564).addBox(-1.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.8306F, -1.5453F, 1.5F, -0.0175F, 0.0F, -0.7854F));
		PartDefinition cube_r216 = bone5.addOrReplaceChild("cube_r216",
				CubeListBuilder.create().texOffs(179, 97).addBox(-1.7346F, -0.9168F, -3.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(359, 276).addBox(-0.7346F, -0.9168F, -7.0245F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0065F, 0.3564F, -9.25F, -0.59F, 0.2404F, -0.3057F));
		PartDefinition cube_r217 = bone5.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(325, 178).addBox(-1.9659F, -0.7588F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.694F, 0.6689F, -5.5F, -0.2148F, 0.2404F, -0.3057F));
		PartDefinition cube_r218 = bone5.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(594, 43).addBox(0.0F, -1.0F, -16.0F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5305F, 1.4107F, 10.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r219 = bone5.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(455, 39).addBox(-1.0F, -0.375F, -5.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 21.0F, -0.0192F, 0.0F, -1.309F));
		PartDefinition cube_r220 = bone5.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(485, 238).addBox(-1.0F, -0.375F, -5.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.061F, -3.0F, 21.0F, -0.0192F, 0.0F, 1.309F));
		PartDefinition cube_r221 = bone5.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(551, 236).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.061F, -3.0F, 11.0F, 0.0105F, 0.0F, 1.309F));
		PartDefinition cube_r222 = bone5.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(438, 270).addBox(-1.25F, -1.0F, -3.5F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7376F, -2.8706F, -12.0905F, -0.7109F, -0.2332F, 1.3086F));
		PartDefinition cube_r223 = bone5.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(455, 16).addBox(-0.8706F, -1.1304F, -8.8794F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.161F, -4.0F, -9.2875F, -0.7418F, 0.0F, 1.5708F));
		PartDefinition cube_r224 = bone5.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(845, 266).addBox(-0.8706F, -1.0251F, -0.0093F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.811F, -4.0F, -5.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r225 = bone5.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(441, 28).addBox(-1.25F, -0.6625F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2593F, -2.8706F, -6.9935F, -0.413F, -0.1451F, 1.2522F));
		PartDefinition cube_r226 = bone5.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(322, 310).addBox(-0.8706F, -1.0251F, -4.0093F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.811F, -4.0F, -5.5F, -0.4363F, 0.0F, 1.5708F));
		PartDefinition cube_r227 = bone5.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(136, 588).addBox(-0.8706F, -1.0251F, -0.0093F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.561F, -3.0F, -5.5F, -0.0175F, 0.0F, 1.309F));
		PartDefinition cube_r228 = bone5.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(346, 115).addBox(-1.8054F, -1.0851F, -2.6872F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.8162F, -0.9311F, -9.0F, -0.7905F, -0.2962F, 1.1949F));
		PartDefinition cube_r229 = bone5.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(468, 292).addBox(-2.0808F, -0.995F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.8162F, -0.4311F, -5.5F, -0.333F, -0.1111F, 1.0056F));
		PartDefinition cube_r230 = bone5.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(354, 90).addBox(-0.9917F, -0.6987F, -5.0843F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.8162F, -0.4311F, -9.0F, -0.736F, -0.1159F, 0.8374F));
		PartDefinition cube_r231 = bone5.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(484, 134).addBox(-0.0808F, -0.995F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.8162F, -0.4311F, -5.5F, -0.3079F, -0.1248F, 0.825F));
		PartDefinition cube_r232 = bone5.addOrReplaceChild("cube_r232",
				CubeListBuilder.create().texOffs(614, 518).addBox(-1.9387F, -1.0347F, -16.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 591).addBox(-3.9387F, -1.0347F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.5305F, 0.9107F, 10.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r233 = bone5.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(373, 90).addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.8162F, -0.1311F, 23.0F, 0.0524F, 0.0F, 0.7854F));
		PartDefinition cube_r234 = bone5.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(499, 23).addBox(-1.0F, -0.5F, -7.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.8162F, -0.1311F, 12.0F, -0.0087F, 0.0F, 0.7854F));
		PartDefinition cube_r235 = bone5.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(614, 529).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2923F, -1.4835F, 13.5F, 0.0436F, 0.0F, 0.7854F));
		PartDefinition cube_r236 = bone5.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(218, 570).addBox(-1.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2304F, -1.5453F, 1.5F, -0.0175F, 0.0F, 0.7854F));
		PartDefinition cube_r237 = bone5.addOrReplaceChild("cube_r237",
				CubeListBuilder.create().texOffs(189, 97).addBox(0.7346F, -0.9168F, -3.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(359, 288).addBox(-0.2654F, -0.9168F, -7.0245F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0545F, 0.3564F, -9.25F, -0.59F, -0.2404F, 0.3057F));
		PartDefinition cube_r238 = bone5.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(485, 52).addBox(-0.0341F, -0.7588F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.367F, 0.6689F, -5.5F, -0.2148F, -0.2404F, 0.3057F));
		PartDefinition cube_r239 = bone5.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(594, 85).addBox(-2.0F, -1.0F, -16.0F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5305F, 1.4107F, 10.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition bone15 = bone5.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(-7.5305F, 3.7607F, -30.425F));
		PartDefinition cube_r240 = bone15.addOrReplaceChild("cube_r240",
				CubeListBuilder.create().texOffs(359, 268).addBox(0.0F, -0.9388F, -8.9294F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(164, 27).addBox(0.0F, -0.9388F, -1.9294F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3125F, -3.0902F, 20.9695F, -0.5729F, -0.1323F, 0.0849F));
		PartDefinition cube_r241 = bone15.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(160, 21).addBox(-2.0F, -0.9388F, -1.9294F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.3125F, -3.0902F, 20.9695F, -0.5729F, 0.1323F, -0.0849F));
		PartDefinition cube_r242 = bone15.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(16, 591).addBox(-1.0F, -1.7485F, -10.0036F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 21.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition bone64 = lifeboat4.addOrReplaceChild("bone64",
				CubeListBuilder.create().texOffs(545, 24).addBox(-11.0F, -48.0F, 147.0F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.8F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.45F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.65F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.6F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.4F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.05F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.25F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 27.0F, -136.0F));
		PartDefinition bone63 = bone64.addOrReplaceChild("bone63",
				CubeListBuilder.create().texOffs(545, 24).addBox(-11.0F, -48.0F, 147.0F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.8F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.45F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.65F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.6F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.4F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.05F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.25F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -15.0F));
		PartDefinition bone62 = bone64.addOrReplaceChild("bone62",
				CubeListBuilder.create().texOffs(545, 24).addBox(-11.0F, -48.0F, 147.0F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.8F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.45F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.65F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.6F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.4F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24)
						.addBox(-11.0F, -48.0F, 146.05F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(545, 24).addBox(-11.0F, -48.0F, 146.25F, 22.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 15.0F));
		PartDefinition bone16 = partdefinition.addOrReplaceChild("bone16", CubeListBuilder.create().texOffs(772, 880).mirror().addBox(-0.5F, -19.5F, -22.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(674, 880).mirror()
				.addBox(-0.5F, -16.5F, -22.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-20.5F, 20.5F, -44.0F));
		PartDefinition cube_r243 = bone16.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(514, 534).mirror().addBox(0.058F, -1.4265F, -21.0341F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8756F, -3.0F, -21.9591F, 0.0062F, -0.3923F, -0.1331F));
		PartDefinition cube_r244 = bone16.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(130, 879).mirror().addBox(-0.5F, -1.5F, -33.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0057F, -0.0433F, -0.131F));
		PartDefinition cube_r245 = bone16.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(136, 570).mirror().addBox(-0.532F, -1.1759F, -15.2654F, 1.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(8.6129F, -6.9984F, -41.096F, 0.1019F, -0.7262F, -0.2041F));
		PartDefinition cube_r246 = bone16.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(545, 0).mirror().addBox(-0.0728F, -1.4586F, -21.018F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5777F, -6.0165F, -21.9797F, 0.0372F, -0.3778F, -0.1821F));
		PartDefinition cube_r247 = bone16.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(880, 423).mirror().addBox(-0.5F, -1.5F, -33.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -6.0F, 11.0F, 0.0023F, -0.0304F, -0.0873F));
		PartDefinition cube_r248 = bone16.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(397, 534).mirror().addBox(0.0351F, -1.4104F, -21.0141F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0539F, -8.9794F, -21.9926F, 0.0388F, -0.3706F, -0.1672F));
		PartDefinition cube_r249 = bone16.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(412, 37).mirror().addBox(0.105F, -1.1664F, -17.2161F, 1.0F, 3.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5081F, -9.6671F, -41.3983F, 0.0933F, -0.7192F, -0.1873F));
		PartDefinition cube_r250 = bone16.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(507, 880).mirror().addBox(-0.625F, -1.5F, -33.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -9.0F, 11.0F, 0.0036F, -0.0215F, -0.1658F));
		PartDefinition cube_r251 = bone16.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(532, 215).mirror().addBox(-0.2811F, -1.3101F, -18.2664F, 1.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.2825F, -12.514F, -41.3631F, 0.1757F, -0.6911F, -0.3133F));
		PartDefinition cube_r252 = bone16.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(336, 558).mirror().addBox(-0.0876F, -1.4777F, -21.004F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.1257F, -12.0262F, -21.9984F, 0.0485F, -0.3546F, -0.1788F));
		PartDefinition cube_r253 = bone16.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(880, 513).mirror().addBox(-0.5F, -1.5F, -33.0F, 1.0F, 3.0F, 33.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -12.0F, 11.0F, -0.0003F, -0.0087F, -0.0393F));
		PartDefinition cube_r254 = bone16.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(0, 570).mirror().addBox(-0.349F, -1.4689F, -18.2692F, 1.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.2505F, -15.0936F, -41.2304F, 0.0174F, -0.6842F, -0.0525F));
		PartDefinition cube_r255 = bone16.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(397, 558).mirror().addBox(0.0F, -1.5F, -21.0F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, -15.0F, -22.0F, 0.0145F, -0.3661F, -0.0467F));
		PartDefinition cube_r256 = bone16.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(455, 534).mirror().addBox(-0.1614F, -1.5F, -21.265F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.7435F, -18.0F, -41.4293F, 0.0F, -0.6981F, 0.0F));
		PartDefinition cube_r257 = bone16.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(455, 558).mirror().addBox(0.0F, -1.5F, -21.0F, 1.0F, 3.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, -18.0F, -22.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition bone17 = bone16.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(8.6129F, -0.9984F, -52.096F));
		PartDefinition cube_r258 = bone17.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(94, 570).mirror().addBox(-0.0773F, -1.1394F, -15.3683F, 1.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.2251F, -0.7307F, -0.3829F));
		PartDefinition bone18 = bone16.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(9.3629F, 1.7516F, -52.096F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r259 = bone18.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(478, 558).mirror().addBox(8.2904F, -2.0836F, -5.6814F, 1.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2217F, -0.7137F, -0.3778F));
		PartDefinition bone19 = bone16.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(9.3629F, 4.7516F, -52.096F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r260 = bone19.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(309, 16).mirror().addBox(9.2904F, -2.0836F, -5.6814F, 1.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2217F, -0.7137F, -0.3778F));
		PartDefinition bone20 = bone16.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(10.3629F, 7.5016F, -52.096F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r261 = bone20.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(432, 16).mirror().addBox(7.6852F, -2.3041F, -0.886F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.0F, 2.0F, 0.0F, 0.1844F, -0.6835F, -0.3687F));
		PartDefinition cube_r262 = bone20.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(169, 146).mirror().addBox(6.9949F, 0.4331F, 5.872F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.4122F, 4.5475F, -1.6111F, 0.3677F, -0.4737F, -1.0042F));
		PartDefinition cube_r263 = bone20.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(180, 605).mirror().addBox(9.2265F, -2.1905F, -4.1465F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.2289F, -0.7172F, -0.4363F));
		PartDefinition bone21 = bone16.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 837).addBox(-0.5F, 4.5F, -60.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(660, 478).addBox(-0.5F, 1.5F, -7.5F, 1.0F, 3.0F, 70.0F, new CubeDeformation(0.0F)).texOffs(662, 303)
						.addBox(-0.6F, 4.5F, -15.5F, 1.0F, 3.0F, 65.0F, new CubeDeformation(0.0F)).texOffs(0, 730).addBox(-0.2125F, -4.5F, -101.5F, 1.0F, 3.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(842, 832)
						.addBox(-0.2875F, -7.5F, -101.5F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(788, 475).addBox(-0.5F, -10.5F, -101.5F, 1.0F, 3.0F, 46.0F, new CubeDeformation(0.0F)).texOffs(678, 832)
						.addBox(-0.5F, -10.5F, -55.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(795, 832).addBox(-0.6F, -7.5F, -61.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(834, 572)
						.addBox(-0.5F, -1.5F, -67.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(833, 524).addBox(0.0F, -4.5F, -45.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(435, 596)
						.addBox(-0.2F, -7.5F, -16.5F, 1.0F, 3.0F, 79.0F, new CubeDeformation(0.0F)).texOffs(516, 596).addBox(-0.5F, -10.5F, -10.5F, 1.0F, 3.0F, 73.0F, new CubeDeformation(0.0F)).texOffs(727, 655)
						.addBox(-0.5F, -4.5F, -0.5F, 1.0F, 3.0F, 63.0F, new CubeDeformation(0.0F)),
				PartPose.offset(20.5F, 11.5F, 68.5F));
		PartDefinition cube_r264 = bone.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(412, 88).addBox(-0.5F, -1.5F, -22.5F, 1.0F, 3.0F, 85.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0087F, 0.0F));
		PartDefinition cube_r265 = bone.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(869, 126).addBox(-0.5F, -1.5F, -17.0F, 1.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -84.5F, 0.0F, -0.0175F, -0.0873F));
		PartDefinition cube_r266 = bone.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(741, 81).addBox(-0.5F, -1.5F, -24.5F, 1.0F, 3.0F, 49.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -77.0F, 0.0F, -0.0044F, 0.0873F));
		PartDefinition cube_r267 = bone.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(836, 465).addBox(-0.5F, -1.5F, -22.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -30.0F, 0.0F, -0.0087F, 0.0436F));
		PartDefinition cube_r268 = bone.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(532, 215).addBox(-0.5F, -1.5F, -20.5F, 1.0F, 3.0F, 41.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, -81.0F, 0.0F, 0.0087F, -0.0436F));
		PartDefinition bone25 = partdefinition.addOrReplaceChild("bone25", CubeListBuilder.create().texOffs(0, 837).mirror().addBox(-0.5F, 4.5F, -60.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(660, 478).mirror()
				.addBox(-0.5F, 1.5F, -7.5F, 1.0F, 3.0F, 70.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(662, 303).mirror().addBox(-0.4F, 4.5F, -15.5F, 1.0F, 3.0F, 65.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 730).mirror()
				.addBox(-0.7875F, -4.5F, -101.5F, 1.0F, 3.0F, 56.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(842, 832).mirror().addBox(-0.7125F, -7.5F, -101.5F, 1.0F, 3.0F, 40.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(788, 475)
				.mirror().addBox(-0.5F, -10.5F, -101.5F, 1.0F, 3.0F, 46.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(678, 832).mirror().addBox(-0.5F, -10.5F, -55.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(795, 832).mirror().addBox(-0.4F, -7.5F, -61.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(834, 572).mirror().addBox(-0.5F, -1.5F, -67.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(833, 524).mirror().addBox(-1.0F, -4.5F, -45.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(435, 596).mirror().addBox(-0.8F, -7.5F, -16.5F, 1.0F, 3.0F, 79.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(516, 596).mirror().addBox(-0.5F, -10.5F, -10.5F, 1.0F, 3.0F, 73.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(727, 655).mirror().addBox(-0.5F, -4.5F, -0.5F, 1.0F, 3.0F, 63.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-20.5F, 11.5F, 68.5F));
		PartDefinition cube_r269 = bone25.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(412, 88).mirror().addBox(-0.5F, -1.5F, -22.5F, 1.0F, 3.0F, 85.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0087F, 0.0F));
		PartDefinition cube_r270 = bone25.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(869, 126).mirror().addBox(-0.5F, -1.5F, -17.0F, 1.0F, 3.0F, 34.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -84.5F, 0.0F, 0.0175F, 0.0873F));
		PartDefinition cube_r271 = bone25.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(741, 81).mirror().addBox(-0.5F, -1.5F, -24.5F, 1.0F, 3.0F, 49.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, -77.0F, 0.0F, 0.0044F, -0.0873F));
		PartDefinition cube_r272 = bone25.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(836, 465).mirror().addBox(-0.5F, -1.5F, -22.5F, 1.0F, 3.0F, 45.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 3.0F, -30.0F, 0.0F, 0.0087F, -0.0436F));
		PartDefinition cube_r273 = bone25.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(532, 215).mirror().addBox(-0.5F, -1.5F, -20.5F, 1.0F, 3.0F, 41.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 6.0F, -81.0F, 0.0F, -0.0087F, 0.0436F));
		PartDefinition bone61 = partdefinition.addOrReplaceChild("bone61", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.1625F, 2.5F, -95.8125F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r274 = bone61.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(281, 19).mirror().addBox(8.0707F, -9.5F, -15.5735F, 0.0F, 5.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 16).mirror()
				.addBox(7.0707F, -4.5F, -15.5735F, 2.0F, 3.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition lifeboat3 = partdefinition.addOrReplaceChild("lifeboat3",
				CubeListBuilder.create().texOffs(336, 523).mirror().addBox(-7.0F, -9.2625F, 31.0375F, 14.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(455, 486).mirror()
						.addBox(-4.2625F, -10.175F, 30.325F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(78, 187).mirror().addBox(-0.7375F, -10.1125F, 30.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(181, 187).mirror().addBox(-5.775F, -7.225F, 31.2125F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(101, 91).mirror()
						.addBox(-2.1125F, -8.75F, 31.2875F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(21, 160).mirror().addBox(-2.1125F, -6.35F, 31.2875F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(354, 96).mirror().addBox(-3.0F, -6.0F, 31.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(22.5F, -6.0F, 64.0F));
		PartDefinition cube_r275 = lifeboat3.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(394, 488).mirror().addBox(-2.5F, -0.4F, -1.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(6.5F, -9.0F, 31.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r276 = lifeboat3.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(417, 488).mirror().addBox(-2.5F, -0.5F, -1.2875F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-6.5F, -9.0F, 31.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r277 = lifeboat3.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(112, 12).mirror().addBox(-0.825F, -0.6375F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-7.2875F, -7.8875F, 31.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r278 = lifeboat3.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(206, 48).mirror().addBox(-1.175F, -0.6375F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.2875F, -7.8875F, 31.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r279 = lifeboat3.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(206, 24).mirror().addBox(0.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.0F, -3.0F, 31.5F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r280 = lifeboat3.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(373, 90).mirror().addBox(-0.0653F, -3.1007F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, -3.525F, 31.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r281 = lifeboat3.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(206, 28).mirror().addBox(-2.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.0F, -3.0F, 31.5F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r282 = lifeboat3.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(373, 94).mirror().addBox(-3.9347F, -3.1007F, -0.5F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.0F, -3.525F, 31.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition bone56 = lifeboat3.addOrReplaceChild("bone56",
				CubeListBuilder.create().texOffs(574, 518).mirror().addBox(6.5305F, 0.6607F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(255, 570).mirror()
						.addBox(8.5305F, 0.4107F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(340, 268).mirror().addBox(4.5305F, 0.4107F, -5.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-7.5305F, -4.4107F, 0.5F));
		PartDefinition cube_r283 = bone56.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(81, 97).mirror().addBox(0.0F, -0.1699F, -3.9726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5305F, 0.5875F, -5.39F, -0.1683F, -0.1721F, 0.0291F));
		PartDefinition cube_r284 = bone56.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(116, 150).mirror().addBox(-2.0F, -0.1699F, -3.9726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.5305F, 0.5875F, -5.39F, -0.1683F, 0.1721F, -0.0291F));
		PartDefinition cube_r285 = bone56.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(116, 155).mirror().addBox(-1.0F, -0.75F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(7.5305F, 1.4107F, -5.5F, -0.1658F, 0.0F, 0.0F));
		PartDefinition cube_r286 = bone56.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(548, 520).mirror().addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 11.0F, 0.0105F, 0.0F, 1.309F));
		PartDefinition cube_r287 = bone56.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(438, 226).mirror().addBox(-1.25F, -1.0F, -3.5F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.3234F, -2.8706F, -12.0905F, -0.7109F, -0.2332F, 1.3086F));
		PartDefinition cube_r288 = bone56.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(384, 176).mirror().addBox(-0.8706F, -1.1304F, -8.8794F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.9F, -4.0F, -9.2875F, -0.7418F, 0.0F, 1.5708F));
		PartDefinition cube_r289 = bone56.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(845, 226).mirror().addBox(-0.8706F, -1.0251F, -0.0093F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.75F, -4.0F, -5.5F, 0.0F, 0.0F, 1.5708F));
		PartDefinition cube_r290 = bone56.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(160, 16).mirror().addBox(-1.25F, -0.6625F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8017F, -2.8706F, -6.9935F, -0.413F, -0.1451F, 1.2522F));
		PartDefinition cube_r291 = bone56.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(292, 72).mirror().addBox(-0.8706F, -1.0251F, -4.0093F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.75F, -4.0F, -5.5F, -0.4363F, 0.0F, 1.5708F));
		PartDefinition cube_r292 = bone56.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(420, 566).mirror().addBox(-0.8706F, -1.0251F, -0.0093F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.5F, -3.0F, -5.5F, -0.0175F, 0.0F, 1.309F));
		PartDefinition cube_r293 = bone56.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(217, 320).mirror().addBox(-1.8054F, -1.0851F, -2.6872F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2448F, -0.9311F, -9.0F, -0.7905F, -0.2962F, 1.1949F));
		PartDefinition cube_r294 = bone56.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(185, 191).mirror().addBox(-2.0808F, -0.995F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2448F, -0.4311F, -5.5F, -0.333F, -0.1111F, 1.0056F));
		PartDefinition cube_r295 = bone56.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(184, 144).mirror().addBox(-0.9917F, -0.6987F, -5.0843F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(3.2448F, -0.4311F, -9.0F, -0.736F, -0.1159F, 0.8374F));
		PartDefinition cube_r296 = bone56.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(293, 16).mirror().addBox(-0.0808F, -0.995F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.2448F, -0.4311F, -5.5F, -0.3079F, -0.1248F, 0.825F));
		PartDefinition cube_r297 = bone56.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(14, 613).mirror().addBox(-1.9387F, -1.0347F, -16.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(582, 540).mirror()
				.addBox(-3.9387F, -1.0347F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5305F, 0.9107F, 10.5F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r298 = bone56.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(339, 90).mirror().addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2448F, -0.1311F, 23.0F, 0.0524F, 0.0F, 0.7854F));
		PartDefinition cube_r299 = bone56.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(340, 288).mirror().addBox(-1.0F, -0.5F, -7.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.2448F, -0.1311F, 12.0F, -0.0087F, 0.0F, 0.7854F));
		PartDefinition cube_r300 = bone56.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(484, 614).mirror().addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.7687F, -1.4835F, 13.5F, 0.0436F, 0.0F, 0.7854F));
		PartDefinition cube_r301 = bone56.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(537, 564).mirror().addBox(-1.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.8306F, -1.5453F, 1.5F, -0.0175F, 0.0F, 0.7854F));
		PartDefinition cube_r302 = bone56.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(179, 97).mirror().addBox(0.7346F, -0.9168F, -3.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(359, 276).mirror()
				.addBox(-0.2654F, -0.9168F, -7.0245F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(4.0065F, 0.3564F, -9.25F, -0.59F, -0.2404F, 0.3057F));
		PartDefinition cube_r303 = bone56.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(325, 178).mirror().addBox(-0.0341F, -0.7588F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.694F, 0.6689F, -5.5F, -0.2148F, -0.2404F, 0.3057F));
		PartDefinition cube_r304 = bone56.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(594, 43).mirror().addBox(-2.0F, -1.0F, -16.0F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(4.5305F, 1.4107F, 10.5F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r305 = bone56.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(455, 39).mirror().addBox(-1.0F, -0.375F, -5.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 21.0F, -0.0192F, 0.0F, 1.309F));
		PartDefinition cube_r306 = bone56.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(485, 238).mirror().addBox(-1.0F, -0.375F, -5.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(15.061F, -3.0F, 21.0F, -0.0192F, 0.0F, -1.309F));
		PartDefinition cube_r307 = bone56.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(551, 236).mirror().addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(15.061F, -3.0F, 11.0F, 0.0105F, 0.0F, -1.309F));
		PartDefinition cube_r308 = bone56.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(438, 270).mirror().addBox(-0.75F, -1.0F, -3.5F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.7376F, -2.8706F, -12.0905F, -0.7109F, 0.2332F, -1.3086F));
		PartDefinition cube_r309 = bone56.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(455, 16).mirror().addBox(-0.1294F, -1.1304F, -8.8794F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(14.161F, -4.0F, -9.2875F, -0.7418F, 0.0F, -1.5708F));
		PartDefinition cube_r310 = bone56.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(845, 266).mirror().addBox(-0.1294F, -1.0251F, -0.0093F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(15.811F, -4.0F, -5.5F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r311 = bone56.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(441, 28).mirror().addBox(-0.75F, -0.6625F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(14.2593F, -2.8706F, -6.9935F, -0.413F, 0.1451F, -1.2522F));
		PartDefinition cube_r312 = bone56.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(322, 310).mirror().addBox(-0.1294F, -1.0251F, -4.0093F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(15.811F, -4.0F, -5.5F, -0.4363F, 0.0F, -1.5708F));
		PartDefinition cube_r313 = bone56.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(136, 588).mirror().addBox(-1.1294F, -1.0251F, -0.0093F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(15.561F, -3.0F, -5.5F, -0.0175F, 0.0F, -1.309F));
		PartDefinition cube_r314 = bone56.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(346, 115).mirror().addBox(-0.1946F, -1.0851F, -2.6872F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.8162F, -0.9311F, -9.0F, -0.7905F, 0.2962F, -1.1949F));
		PartDefinition cube_r315 = bone56.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(468, 292).mirror().addBox(0.0808F, -0.995F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.8162F, -0.4311F, -5.5F, -0.333F, 0.1111F, -1.0056F));
		PartDefinition cube_r316 = bone56.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(354, 90).mirror().addBox(-1.0083F, -0.6987F, -5.0843F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.8162F, -0.4311F, -9.0F, -0.736F, 0.1159F, -0.8374F));
		PartDefinition cube_r317 = bone56.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(484, 134).mirror().addBox(-1.9192F, -0.995F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.8162F, -0.4311F, -5.5F, -0.3079F, 0.1248F, -0.825F));
		PartDefinition cube_r318 = bone56.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(614, 518).mirror().addBox(-0.0613F, -1.0347F, -16.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 591).mirror()
				.addBox(1.9387F, -1.0347F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(12.5305F, 0.9107F, 10.5F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r319 = bone56.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(373, 90).mirror().addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.8162F, -0.1311F, 23.0F, 0.0524F, 0.0F, -0.7854F));
		PartDefinition cube_r320 = bone56.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(499, 23).mirror().addBox(-1.0F, -0.5F, -7.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.8162F, -0.1311F, 12.0F, -0.0087F, 0.0F, -0.7854F));
		PartDefinition cube_r321 = bone56.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(614, 529).mirror().addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(14.2923F, -1.4835F, 13.5F, 0.0436F, 0.0F, -0.7854F));
		PartDefinition cube_r322 = bone56.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(218, 570).mirror().addBox(-1.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(14.2304F, -1.5453F, 1.5F, -0.0175F, 0.0F, -0.7854F));
		PartDefinition cube_r323 = bone56.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(189, 97).mirror().addBox(-1.7346F, -0.9168F, -3.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(359, 288).mirror()
				.addBox(-0.7346F, -0.9168F, -7.0245F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(11.0545F, 0.3564F, -9.25F, -0.59F, 0.2404F, -0.3057F));
		PartDefinition cube_r324 = bone56.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(485, 52).mirror().addBox(-1.9659F, -0.7588F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(12.367F, 0.6689F, -5.5F, -0.2148F, 0.2404F, -0.3057F));
		PartDefinition cube_r325 = bone56.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(594, 85).mirror().addBox(0.0F, -1.0F, -16.0F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(10.5305F, 1.4107F, 10.5F, 0.0F, 0.0F, -0.2618F));
		PartDefinition bone57 = bone56.addOrReplaceChild("bone57", CubeListBuilder.create(), PartPose.offset(7.5305F, 3.7607F, -30.425F));
		PartDefinition cube_r326 = bone57.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(359, 268).mirror().addBox(-1.0F, -0.9388F, -8.9294F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(164, 27).mirror()
				.addBox(-2.0F, -0.9388F, -1.9294F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.3125F, -3.0902F, 20.9695F, -0.5729F, 0.1323F, -0.0849F));
		PartDefinition cube_r327 = bone57.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(160, 21).mirror().addBox(0.0F, -0.9388F, -1.9294F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.3125F, -3.0902F, 20.9695F, -0.5729F, -0.1323F, 0.0849F));
		PartDefinition cube_r328 = bone57.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(16, 591).mirror().addBox(-1.0F, -1.7485F, -10.0036F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -3.0F, 21.0F, -0.5672F, 0.0F, 0.0F));
		PartDefinition bone58 = lifeboat3.addOrReplaceChild("bone58",
				CubeListBuilder.create().texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 84.25F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror()
						.addBox(10.0F, -48.0F, 84.0F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.75F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159)
						.mirror().addBox(10.0F, -48.0F, 83.5F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.4F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.65F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.9F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 84.15F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-22.5F, 27.0F, -89.0F));
		PartDefinition bone59 = lifeboat3.addOrReplaceChild("bone59",
				CubeListBuilder.create().texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 84.25F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror()
						.addBox(10.0F, -48.0F, 84.0F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.75F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159)
						.mirror().addBox(10.0F, -48.0F, 83.5F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.4F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.65F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.9F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 84.15F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-22.5F, 27.0F, -72.0F));
		PartDefinition bone60 = lifeboat3.addOrReplaceChild("bone60",
				CubeListBuilder.create().texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 84.25F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror()
						.addBox(10.0F, -48.0F, 84.0F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.75F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159)
						.mirror().addBox(10.0F, -48.0F, 83.5F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.4F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.65F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 83.9F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(281, 159).mirror().addBox(10.0F, -48.0F, 84.15F, 22.0F, 28.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-22.5F, 27.0F, -58.0F));
		PartDefinition greenbarrel = partdefinition.addOrReplaceChild("greenbarrel",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1008).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.4005F, -5.4833F, -58.7568F, 0.0F, -0.2182F, 0.0F));
		PartDefinition redbarrel = partdefinition.addOrReplaceChild("redbarrel",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.9005F, -5.4833F, -41.7568F));
		PartDefinition closedchest = partdefinition.addOrReplaceChild("closedchest", CubeListBuilder.create(), PartPose.offset(-2.0F, -1.0F, 101.5F));
		PartDefinition chestlid2 = closedchest.addOrReplaceChild("chestlid2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1736F, -3.9964F, 2.3387F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r329 = chestlid2.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1752F, -40.6185F, 7.3784F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, -40.5969F, -0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r330 = chestlid2.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1852F, 18.9272F, 30.4592F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, -35.5969F, 0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r331 = chestlid2.addOrReplaceChild("cube_r331",
				CubeListBuilder.create().texOffs(70, 1006).addBox(13.2652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 1006).addBox(8.0652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1636F, 12.035F, -38.0969F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r332 = chestlid2.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(50, 1016).addBox(-4.0F, -0.342F, -1.9397F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0083F, 0.1903F, -4.6678F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r333 = chestlid2.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(52, 1010).addBox(8.1652F, 30.5871F, 13.2844F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, -35.5969F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chest2 = closedchest.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(2, 1006).addBox(8.1752F, -6.0F, 45.8671F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 2.0F, -48.5F));
		PartDefinition valuablecargo = partdefinition.addOrReplaceChild("valuablecargo", CubeListBuilder.create(), PartPose.offset(-11.9005F, -4.4833F, 129.2432F));
		PartDefinition goldbarrel2 = valuablecargo.addOrReplaceChild("goldbarrel2",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(140, 18).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 12)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition greenbarrel2 = valuablecargo.addOrReplaceChild("greenbarrel2",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1008).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(10.5F, 0.0F, 7.0F));
		PartDefinition redbarrel2 = valuablecargo.addOrReplaceChild("redbarrel2",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, -3.0F, 0.0F, -0.3054F, 0.0F));
		PartDefinition treasurechest3 = valuablecargo.addOrReplaceChild("treasurechest3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9005F, 4.4833F, -12.7432F, 0.0F, -0.6981F, 0.0F));
		PartDefinition chestlid5 = treasurechest3.addOrReplaceChild("chestlid5", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.0F, -9.0F, -35.5375F, -0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r334 = chestlid5.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1752F, -40.6185F, 7.3784F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -4.1548F, -0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r335 = chestlid5.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1852F, 18.9272F, 30.4592F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r336 = chestlid5.addOrReplaceChild("cube_r336",
				CubeListBuilder.create().texOffs(70, 1006).addBox(13.2652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 1006).addBox(8.0652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, -1.6548F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r337 = chestlid5.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(50, 1016).addBox(8.1752F, 37.9844F, -1.6883F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, -4.1548F, 1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r338 = chestlid5.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(52, 1010).addBox(8.1652F, 30.5871F, 13.2844F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chest5 = treasurechest3.addOrReplaceChild("chest5", CubeListBuilder.create().texOffs(2, 1006).addBox(8.1752F, -6.0F, 45.8671F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 2.0F, -48.5F));
		PartDefinition closedchest2 = valuablecargo.addOrReplaceChild("closedchest2", CubeListBuilder.create(), PartPose.offsetAndRotation(22.9005F, 4.4833F, 0.2568F, 0.0F, 0.48F, 0.0F));
		PartDefinition chestlid3 = closedchest2.addOrReplaceChild("chestlid3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1736F, -3.9964F, 2.3387F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r339 = chestlid3.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1752F, -40.6185F, 7.3784F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, -40.5969F, -0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r340 = chestlid3.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1852F, 18.9272F, 30.4592F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, -35.5969F, 0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r341 = chestlid3.addOrReplaceChild("cube_r341",
				CubeListBuilder.create().texOffs(70, 1006).addBox(13.2652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 1006).addBox(8.0652F, 33.7073F, -16.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1636F, 12.035F, -38.0969F, 2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r342 = chestlid3.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(50, 1016).addBox(-4.0F, -0.342F, -1.9397F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0083F, 0.1903F, -4.6678F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r343 = chestlid3.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(52, 1010).addBox(8.1652F, 30.5871F, 13.2844F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, -35.5969F, 1.5708F, 0.0F, 0.0F));
		PartDefinition chest3 = closedchest2.addOrReplaceChild("chest3", CubeListBuilder.create().texOffs(2, 1006).addBox(8.1752F, -6.0F, 45.8671F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 2.0F, -48.5F));
		PartDefinition redbarrel3 = partdefinition.addOrReplaceChild("redbarrel3",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9005F, -4.4833F, -82.7568F, 0.0F, -0.3054F, 0.0F));
		PartDefinition redbarrel4 = partdefinition.addOrReplaceChild("redbarrel4",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0995F, -4.4833F, -82.7568F, 0.0F, 0.48F, 0.0F));
		PartDefinition redbarrel5 = partdefinition.addOrReplaceChild("redbarrel5",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0995F, -4.4833F, -74.7568F, 0.0F, 1.6581F, 0.0F));
		PartDefinition redbarrel6 = partdefinition.addOrReplaceChild("redbarrel6",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.9005F, -4.4833F, -74.7568F, 0.0F, 1.4835F, 0.0F));
		PartDefinition redbarrel7 = partdefinition.addOrReplaceChild("redbarrel7",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9005F, -4.4833F, -67.7568F, 0.0F, 2.0944F, 0.0F));
		PartDefinition redbarrel8 = partdefinition.addOrReplaceChild("redbarrel8",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169)
						.addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85).addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995)
						.addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002).addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014)
						.addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0995F, -9.4833F, -79.7568F, -1.4663F, -0.3864F, 0.4564F));
		PartDefinition redbarrel9 = partdefinition.addOrReplaceChild("redbarrel9",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169)
						.addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85).addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995)
						.addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002).addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014)
						.addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0995F, -4.4833F, -66.7568F, 1.3198F, -1.1712F, -2.4137F));
		PartDefinition redbarrel10 = partdefinition.addOrReplaceChild("redbarrel10",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0995F, -4.4833F, -74.7568F, 0.0F, 1.2217F, 0.0F));
		PartDefinition cargo = partdefinition.addOrReplaceChild("cargo", CubeListBuilder.create().texOffs(972, 6).addBox(-19.5F, -6.5F, 0.5F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 16.5F, -19.5F));
		PartDefinition cube_r344 = cargo.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(972, 6).addBox(-6.5F, -6.5F, -6.5F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));
		PartDefinition redbarrel13 = cargo.addOrReplaceChild("redbarrel13",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5995F, 2.0167F, 27.7432F, 0.0F, -1.2217F, 0.0F));
		PartDefinition redbarrel11 = cargo.addOrReplaceChild("redbarrel11",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5995F, 2.0167F, 11.7432F, 0.0F, 1.2217F, 0.0F));
		PartDefinition redbarrel12 = cargo.addOrReplaceChild("redbarrel12",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5995F, -4.9833F, 11.7432F, 0.0F, -2.3126F, 0.0F));
		PartDefinition cargo2 = partdefinition.addOrReplaceChild("cargo2", CubeListBuilder.create().texOffs(972, 6).addBox(-19.5F, -6.5F, -13.5F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 16.5F, 105.5F));
		PartDefinition cube_r345 = cargo2.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(972, 6).addBox(-6.5F, -6.5F, -6.5F, 13.0F, 13.0F, 13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition redbarrel14 = cargo2.addOrReplaceChild("redbarrel14",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5995F, 2.0167F, -27.7432F, 0.0F, 1.2217F, 0.0F));
		PartDefinition redbarrel18 = cargo2.addOrReplaceChild("redbarrel18",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.4005F, 2.0167F, -27.7432F, 0.0F, 1.9199F, 0.0F));
		PartDefinition redbarrel17 = cargo2.addOrReplaceChild("redbarrel17",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5995F, 2.0167F, -27.7432F, 0.0F, 1.2217F, 0.0F));
		PartDefinition redbarrel15 = cargo2.addOrReplaceChild("redbarrel15",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5995F, 2.0167F, -11.7432F, 0.0F, -1.2217F, 0.0F));
		PartDefinition redbarrel16 = cargo2.addOrReplaceChild("redbarrel16",
				CubeListBuilder.create().texOffs(163, 1010).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5995F, -4.9833F, -11.7432F, 0.0F, 2.3126F, 0.0F));
		PartDefinition valuablecargo2 = partdefinition.addOrReplaceChild("valuablecargo2", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 137.0F));
		PartDefinition goldbarrel3 = valuablecargo2.addOrReplaceChild("goldbarrel3",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(140, 18).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(140, 12)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.9005F, -6.4833F, -75.2432F, 0.0F, -0.48F, 0.0F));
		PartDefinition greenbarrel3 = valuablecargo2.addOrReplaceChild("greenbarrel3",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1008).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.4005F, -6.4833F, -82.2432F));
		PartDefinition redbarrel19 = valuablecargo2.addOrReplaceChild("redbarrel19",
				CubeListBuilder.create().texOffs(255, 607).addBox(-3.0F, -2.2667F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(169, 169).addBox(-3.5F, -1.0167F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(166, 85)
						.addBox(-3.5F, 2.5833F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(124, 995).addBox(-3.0F, -1.0167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1002)
						.addBox(-3.0F, -1.2667F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(124, 1014).addBox(-3.0F, -1.5167F, -3.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.9005F, -6.4833F, -72.2432F, 0.0F, 0.3054F, 0.0F));
		PartDefinition treasurechest4 = valuablecargo2.addOrReplaceChild("treasurechest4", CubeListBuilder.create(), PartPose.offsetAndRotation(-11.0F, -2.0F, -62.5F, 0.0F, 0.6981F, 0.0F));
		PartDefinition chestlid6 = treasurechest4.addOrReplaceChild("chestlid6", CubeListBuilder.create(), PartPose.offsetAndRotation(-12.0F, -9.0F, 35.5375F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r346 = chestlid6.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1752F, -40.6185F, -8.3784F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 4.1548F, 0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r347 = chestlid6.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1852F, 18.9272F, -31.4592F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -0.8452F, -0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r348 = chestlid6.addOrReplaceChild("cube_r348",
				CubeListBuilder.create().texOffs(70, 1006).addBox(13.2652F, 33.7073F, 15.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 1006).addBox(8.0652F, 33.7073F, 15.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, 1.6548F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r349 = chestlid6.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(50, 1016).addBox(8.1752F, 37.9844F, -0.3117F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, 4.1548F, -1.9199F, 0.0F, 0.0F));
		PartDefinition cube_r350 = chestlid6.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(52, 1010).addBox(8.1652F, 30.5871F, -14.2844F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -0.8452F, -1.5708F, 0.0F, 0.0F));
		PartDefinition chest6 = treasurechest4.addOrReplaceChild("chest6", CubeListBuilder.create().texOffs(2, 1006).addBox(8.1752F, -6.0F, -50.8671F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 2.0F, 48.5F));
		PartDefinition closedchest3 = valuablecargo2.addOrReplaceChild("closedchest3", CubeListBuilder.create(), PartPose.offsetAndRotation(11.0F, -2.0F, -75.5F, 0.0F, -0.48F, 0.0F));
		PartDefinition chestlid7 = closedchest3.addOrReplaceChild("chestlid7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1736F, -3.9964F, -2.3387F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r351 = chestlid7.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1752F, -40.6185F, -8.3784F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, 40.5969F, 0.9948F, 0.0F, 0.0F));
		PartDefinition cube_r352 = chestlid7.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(32, 1012).addBox(8.1852F, 18.9272F, -31.4592F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, 35.5969F, -0.9905F, 0.0F, 0.0F));
		PartDefinition cube_r353 = chestlid7.addOrReplaceChild("cube_r353",
				CubeListBuilder.create().texOffs(70, 1006).addBox(13.2652F, 33.7073F, 15.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 1006).addBox(8.0652F, 33.7073F, 15.6204F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1636F, 12.035F, 38.0969F, -2.3562F, 0.0F, 0.0F));
		PartDefinition cube_r354 = chestlid7.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(50, 1016).addBox(-4.0F, -0.342F, -0.0603F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0083F, 0.1903F, 4.6678F, -1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r355 = chestlid7.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(52, 1010).addBox(8.1652F, 30.5871F, -14.2844F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.1736F, 13.535F, 35.5969F, -1.5708F, 0.0F, 0.0F));
		PartDefinition chest7 = closedchest3.addOrReplaceChild("chest7", CubeListBuilder.create().texOffs(2, 1006).addBox(8.1752F, -6.0F, -50.8671F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 2.0F, 48.5F));
		PartDefinition algar = partdefinition.addOrReplaceChild("algar", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, 38.0F, 4.0F));
		PartDefinition cube_r356 = algar.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar2 = partdefinition.addOrReplaceChild("algar2", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 35.0F, 31.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition cube_r357 = algar2.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar3 = partdefinition.addOrReplaceChild("algar3", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 38.0F, -40.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition cube_r358 = algar3.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar4 = partdefinition.addOrReplaceChild("algar4", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 38.0F, 93.0F, 0.0F, 1.1345F, 0.0F));
		PartDefinition cube_r359 = algar4.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar5 = partdefinition.addOrReplaceChild("algar5", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 34.0F, -77.0F));
		PartDefinition cube_r360 = algar5.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar6 = partdefinition.addOrReplaceChild("algar6", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, 38.0F, -71.0F, 0.0F, -0.0436F, 0.0F));
		PartDefinition cube_r361 = algar6.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar7 = partdefinition.addOrReplaceChild("algar7", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 36.0F, 47.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r362 = algar7.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar8 = partdefinition.addOrReplaceChild("algar8", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 36.0F, 111.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r363 = algar8.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar9 = partdefinition.addOrReplaceChild("algar9", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 36.0F, 111.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r364 = algar9.addOrReplaceChild("cube_r364", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar10 = partdefinition.addOrReplaceChild("algar10", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.0F, 37.0F, 65.0F, 0.0F, -0.1309F, 0.0F));
		PartDefinition cube_r365 = algar10.addOrReplaceChild("cube_r365", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition algar11 = partdefinition.addOrReplaceChild("algar11", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 38.0F, -24.0F, 0.0F, -1.1781F, 0.0F));
		PartDefinition cube_r366 = algar11.addOrReplaceChild("cube_r366", CubeListBuilder.create().texOffs(1004, 996).addBox(0.0F, -9.0F, -5.0F, 0.0F, 18.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0036F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(606, 475).addBox(-1.0F, -23.0F, 10.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(240, 605).addBox(-1.0F, -23.0F, -34.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(232, 605)
						.addBox(-1.0F, -23.0F, -85.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(224, 605).addBox(-1.0F, -23.0F, 100.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(216, 605)
						.addBox(-1.0F, -23.0F, 54.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 0).addBox(-1.0F, -23.0F, -32.0F, 2.0F, 1.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(339, 72)
						.addBox(-1.0F, -23.0F, -64.0F, 2.0F, 1.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(180, 570).addBox(-1.0F, -23.0F, -100.0F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(438, 259)
						.addBox(-1.0F, -23.0F, 12.0F, 2.0F, 1.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(513, 502).addBox(-1.0F, -23.0F, 56.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(438, 215)
						.addBox(-1.0F, -23.0F, 102.0F, 2.0F, 1.0F, 43.0F, new CubeDeformation(0.0F)).texOffs(460, 614).addBox(18.444F, -23.0F, -66.5623F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(42, 611)
						.addBox(-20.444F, -23.0F, -66.5623F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(154, 475).addBox(-20.4625F, -23.0F, -46.5625F, 2.0F, 1.0F, 178.0F, new CubeDeformation(0.0F)).texOffs(412, 0)
						.addBox(18.4625F, -23.0F, -46.5625F, 2.0F, 1.0F, 178.0F, new CubeDeformation(0.0F)).texOffs(402, 499).addBox(18.5F, -22.0F, -34.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(394, 499)
						.addBox(18.5F, -22.0F, 11.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 0).addBox(18.5F, -22.0F, 54.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(493, 215)
						.addBox(18.5F, -22.0F, 100.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(492, 259).addBox(-20.5F, -22.0F, 100.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(344, 487)
						.addBox(-20.5F, -22.0F, 54.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(336, 487).addBox(-20.5F, -22.0F, 11.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(486, 475)
						.addBox(-20.5F, -22.0F, -34.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 39).addBox(-19.0F, -23.0F, -34.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(485, 254)
						.addBox(1.0F, -23.0F, -34.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(484, 296).addBox(-19.0F, -23.0F, 10.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(478, 302)
						.addBox(1.0F, -23.0F, 10.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(452, 170).addBox(-19.0F, -23.0F, 54.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(452, 82)
						.addBox(1.0F, -23.0F, 54.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(438, 302).addBox(-19.0F, -23.0F, 100.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(412, 170)
						.addBox(1.0F, -23.0F, 100.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(309, 61).addBox(-12.0F, -23.0F, -85.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 175)
						.addBox(1.0F, -23.0F, -85.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(204, 605).addBox(-1.0F, -23.0F, -66.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(412, 82)
						.addBox(1.0F, -23.0F, -66.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(392, 328).addBox(-19.0F, -23.0F, -66.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(438, 282)
						.addBox(-1.0F, -23.0F, -83.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-2.0F, 5.0F, -80.25F, 4.0F, 4.0F, 93.0F, new CubeDeformation(0.0F)).texOffs(455, 478)
						.addBox(20.0F, -26.0F, 16.0F, 2.0F, 3.0F, 115.0F, new CubeDeformation(0.0F)).texOffs(229, 217).addBox(-2.0F, 5.0F, 12.75F, 4.0F, 4.0F, 103.0F, new CubeDeformation(0.0F)).texOffs(281, 72)
						.addBox(-1.9F, -7.4F, 117.85F, 4.0F, 4.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(357, 209).addBox(1.0F, -23.0F, 129.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(352, 328)
						.addBox(-19.0F, -23.0F, 129.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(598, 518).addBox(-1.0F, -22.0F, 114.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 88)
						.addBox(-1.0F, -22.0F, 129.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(312, 328).addBox(-19.0F, -23.0F, 114.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(272, 328)
						.addBox(1.0F, -23.0F, 114.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(594, 0).addBox(20.0F, -26.0F, -66.0F, 2.0F, 3.0F, 82.0F, new CubeDeformation(0.0F)).texOffs(336, 475)
						.addBox(-22.0F, -26.0F, -66.0F, 2.0F, 3.0F, 115.0F, new CubeDeformation(0.0F)).texOffs(574, 475).addBox(-22.0F, -26.0F, 49.0F, 2.0F, 3.0F, 82.0F, new CubeDeformation(0.0F)).texOffs(372, 44)
						.addBox(18.5F, -22.0F, 114.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(328, 72).addBox(-20.5F, -22.0F, 114.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(340, 288)
						.addBox(18.5F, -22.3F, 129.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 43).addBox(-1.0F, -22.0F, 119.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 125)
						.addBox(1.0F, -6.0F, 129.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(232, 328).addBox(1.0F, -23.0F, 119.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(319, 210)
						.addBox(-19.0F, -23.0F, 119.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 80).addBox(-15.0F, -6.0F, 129.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(205, 0)
						.addBox(-20.5F, -22.3F, 129.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(339, 103).addBox(-15.0F, -5.0F, 114.0F, 14.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(101, 12)
						.addBox(1.0F, -5.0F, 114.0F, 14.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-17.0F, -1.0F, -96.0F, 34.0F, 0.0F, 213.0F, new CubeDeformation(0.0F)).texOffs(507, 267)
						.addBox(-1.0F, -23.0F, 96.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(552, 596).addBox(-1.0F, -23.0F, 94.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(281, 209)
						.addBox(1.0F, -23.0F, 94.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(281, 125).addBox(-19.0F, -23.0F, 94.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(325, 97)
						.addBox(-1.0F, -23.0F, 60.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(141, 187).addBox(1.0F, -23.0F, 60.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(101, 187)
						.addBox(-19.0F, -23.0F, 60.0F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(660, 515).addBox(-12.0F, -23.0F, 62.0F, 2.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(627, 216)
						.addBox(10.0F, -23.0F, 62.0F, 2.0F, 1.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-10.0F, -23.0F, 62.0F, 20.0F, 0.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 150)
						.addBox(18.0F, -24.0F, -25.0F, 2.0F, 1.0F, 38.0F, new CubeDeformation(0.0F)).texOffs(540, 741).addBox(18.0F, -24.0F, -70.0F, 2.0F, 1.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(206, 16)
						.addBox(-20.4625F, -25.0F, -66.5625F, 4.0F, 1.0F, 198.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(16.4625F, -25.0F, -66.5625F, 4.0F, 1.0F, 198.0F, new CubeDeformation(0.0F)).texOffs(373, 72)
						.addBox(1.0F, -22.0F, 114.0F, 14.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(339, 72).addBox(-15.0F, -22.0F, 114.0F, 14.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(340, 268)
						.addBox(15.0F, -22.0F, 114.0F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(339, 103).addBox(-19.0F, -22.0F, 114.0F, 4.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(101, 150)
						.addBox(-10.0F, -33.0F, 6.0F, 20.0F, 9.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 114).addBox(21.0F, -31.0F, -66.0F, 0.0F, 5.0F, 82.0F, new CubeDeformation(0.0F)).texOffs(0, 200)
						.addBox(21.0F, -31.0F, 16.0F, 0.0F, 5.0F, 115.0F, new CubeDeformation(0.0F)).texOffs(0, 200).mirror().addBox(-21.0F, -31.0F, 16.0F, 0.0F, 5.0F, 115.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 114).mirror()
						.addBox(-21.0F, -31.0F, -66.0F, 0.0F, 5.0F, 82.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r367 = bb_main.addOrReplaceChild("cube_r367",
				CubeListBuilder.create().texOffs(21, 147).mirror().addBox(1.0F, -6.5F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(438, 215).addBox(0.0F, -1.5F, 0.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.0F, -24.5F, 131.0F, 0.0F, 0.3927F, 0.0F));
		PartDefinition cube_r368 = bb_main.addOrReplaceChild("cube_r368", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(0.8642F, -6.5F, 0.0964F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(255, 585).addBox(-0.1358F,
				-1.5F, 0.0964F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.85F, -24.5F, 138.25F, 0.0F, 0.9163F, 0.0F));
		PartDefinition cube_r369 = bb_main.addOrReplaceChild("cube_r369", CubeListBuilder.create().texOffs(72, 78).mirror().addBox(1.0708F, -6.5F, -0.0366F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(591, 608).addBox(0.0708F,
				-1.5F, -0.0366F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.35F, -24.5F, 145.8F, 0.0F, 1.2217F, 0.0F));
		PartDefinition cube_r370 = bb_main.addOrReplaceChild("cube_r370",
				CubeListBuilder.create().texOffs(72, 78).addBox(-1.0708F, -6.5F, -0.0366F, 0.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(560, 608).addBox(-2.0708F, -1.5F, -0.0366F, 2.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.35F, -24.5F, 145.8F, 0.0F, -1.2217F, 0.0F));
		PartDefinition cube_r371 = bb_main.addOrReplaceChild("cube_r371",
				CubeListBuilder.create().texOffs(0, 15).addBox(-0.8642F, -6.5F, 0.0964F, 0.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(295, 585).addBox(-1.8642F, -1.5F, 0.0964F, 2.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.85F, -24.5F, 138.25F, 0.0F, -0.9163F, 0.0F));
		PartDefinition cube_r372 = bb_main.addOrReplaceChild("cube_r372",
				CubeListBuilder.create().texOffs(21, 147).addBox(-1.0F, -6.5F, 0.0F, 0.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(438, 259).addBox(-2.0F, -1.5F, 0.0F, 2.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(22.0F, -24.5F, 131.0F, 0.0F, -0.3927F, 0.0F));
		PartDefinition cube_r373 = bb_main.addOrReplaceChild("cube_r373",
				CubeListBuilder.create().texOffs(42, 150).addBox(-2.5F, -37.0547F, 2.2571F, 4.0F, 31.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(173, 12).addBox(-3.0F, -63.0547F, 6.2571F, 5.0F, 68.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.5F, -96.5F, 1.2217F, 0.0F, 0.0F));
		PartDefinition cube_r374 = bb_main.addOrReplaceChild("cube_r374",
				CubeListBuilder.create().texOffs(325, 183).addBox(-5.0F, -3.9F, -8.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(460, 596).addBox(-7.0F, -0.9F, -8.5F, 7.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -4.1F, 122.5F, 0.0F, 0.0F, 0.6109F));
		PartDefinition cube_r375 = bb_main.addOrReplaceChild("cube_r375",
				CubeListBuilder.create().texOffs(402, 491).addBox(0.0F, -3.9F, -8.5F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(380, 286).addBox(0.0F, -0.9F, -8.5F, 7.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -4.1F, 122.5F, 0.0F, 0.0F, -0.6109F));
		PartDefinition cube_r376 = bb_main.addOrReplaceChild("cube_r376",
				CubeListBuilder.create().texOffs(306, 310).addBox(-3.998F, -2.5F, -0.004F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.998F, -0.5F, -0.004F, 2.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.35F, -22.5F, 144.7125F, 0.0F, -1.3526F, 0.0F));
		PartDefinition cube_r377 = bb_main.addOrReplaceChild("cube_r377",
				CubeListBuilder.create().texOffs(574, 505).addBox(-0.002F, -2.5F, -0.004F, 4.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(281, 16).addBox(-0.002F, -0.5F, -0.004F, 2.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.35F, -22.5F, 144.7125F, 0.0F, 1.3526F, 0.0F));
		PartDefinition cube_r378 = bb_main.addOrReplaceChild("cube_r378",
				CubeListBuilder.create().texOffs(359, 523).addBox(-4.0F, -2.5F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(281, 72).addBox(-2.0F, -0.5F, -0.5F, 2.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.4625F, -22.5F, 131.4375F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r379 = bb_main.addOrReplaceChild("cube_r379",
				CubeListBuilder.create().texOffs(0, 175).addBox(-4.0138F, -2.5F, -0.0185F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(101, 150).addBox(-2.0138F, -0.5F, -0.0185F, 2.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.075F, -22.5F, 138.0375F, 0.0F, -0.9163F, 0.0F));
		PartDefinition cube_r380 = bb_main.addOrReplaceChild("cube_r380",
				CubeListBuilder.create().texOffs(218, 585).addBox(0.0138F, -2.5F, -0.0185F, 4.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(169, 144).addBox(0.0138F, -0.5F, -0.0185F, 2.0F, 14.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.075F, -22.5F, 138.0375F, 0.0F, 0.9163F, 0.0F));
		PartDefinition cube_r381 = bb_main.addOrReplaceChild("cube_r381",
				CubeListBuilder.create().texOffs(417, 523).addBox(0.0F, -2.5F, 0.0F, 4.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(310, 72).addBox(0.0F, -0.5F, 0.0F, 2.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4625F, -22.5F, 131.4375F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r382 = bb_main.addOrReplaceChild("cube_r382",
				CubeListBuilder.create().texOffs(281, 48).addBox(0.1101F, -2.5F, 0.0096F, 4.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(402, 616).addBox(0.1101F, -0.5F, 0.0096F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.7F, -22.5F, -85.4F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r383 = bb_main.addOrReplaceChild("cube_r383",
				CubeListBuilder.create().texOffs(438, 238).addBox(-1.0F, -2.5F, 3.0F, 4.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(72, 657).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -22.5F, -100.0F, 0.0F, -0.6981F, 0.0F));
		PartDefinition cube_r384 = bb_main.addOrReplaceChild("cube_r384",
				CubeListBuilder.create().texOffs(344, 44).addBox(-3.0F, -2.5F, 0.0F, 4.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(130, 657).addBox(-1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -22.5F, -100.0F, 0.0F, 0.6981F, 0.0F));
		PartDefinition cube_r385 = bb_main.addOrReplaceChild("cube_r385",
				CubeListBuilder.create().texOffs(42, 165).addBox(-4.1101F, -2.5F, 0.0096F, 4.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(336, 616).addBox(-2.1101F, -0.5F, 0.0096F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.7F, -22.5F, -85.4F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r386 = bb_main.addOrReplaceChild("cube_r386",
				CubeListBuilder.create().texOffs(336, 637).addBox(-7.0F, -4.0F, 0.0F, 14.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(662, 331).addBox(9.0F, -4.0F, 0.0F, 14.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -4.0F, 131.0F, 0.4363F, 0.0F, 0.0F));
		PartDefinition cube_r387 = bb_main.addOrReplaceChild("cube_r387", CubeListBuilder.create().texOffs(589, 505).addBox(1.0985F, -1.0734F, -0.6F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.6376F, -5.7352F, 131.0F, 0.4013F, -0.2013F, 0.5262F));
		PartDefinition cube_r388 = bb_main
				.addOrReplaceChild(
						"cube_r388", CubeListBuilder.create().texOffs(594, 69).addBox(-0.9015F, -1.0748F, 0.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(359, 296)
								.addBox(-2.6515F, -1.0734F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(293, 21).addBox(-3.9015F, -1.0748F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-17.6376F, -5.7352F, 131.0F, 0.3927F, 0.0F, 0.6109F));
		PartDefinition cube_r389 = bb_main.addOrReplaceChild("cube_r389", CubeListBuilder.create().texOffs(309, 52).addBox(1.9015F, -1.0748F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(386, 64)
				.addBox(0.6515F, -1.0734F, 0.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(594, 148).addBox(-1.0985F, -1.0748F, 0.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.6376F, -5.7352F, 131.0F, 0.3927F, 0.0F, -0.6109F));
		PartDefinition cube_r390 = bb_main.addOrReplaceChild("cube_r390", CubeListBuilder.create().texOffs(594, 111).addBox(-3.0985F, -1.0734F, -0.6F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.6376F, -5.7352F, 131.0F, 0.4013F, 0.2013F, -0.5262F));
		PartDefinition cube_r391 = bb_main.addOrReplaceChild("cube_r391", CubeListBuilder.create().texOffs(164, 191).addBox(-3.9015F, -1.0734F, 0.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.6376F, -5.7352F, 131.0F, 0.829F, 0.0F, 0.6109F));
		PartDefinition cube_r392 = bb_main.addOrReplaceChild("cube_r392",
				CubeListBuilder.create().texOffs(86, 102).addBox(0.028F, 1.5F, 5.0289F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(336, 511).addBox(0.028F, 12.5F, 0.0289F, 16.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(34, 163)
						.addBox(0.028F, 1.5F, 0.0289F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 168).addBox(0.028F, 1.5F, 10.0289F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(566, 66)
						.addBox(0.028F, -1.5F, 0.0289F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-18.3F, -21.5F, 138.5F, 0.0F, 0.9163F, 0.0F));
		PartDefinition cube_r393 = bb_main.addOrReplaceChild("cube_r393",
				CubeListBuilder.create().texOffs(89, 113).addBox(-1.028F, 1.5F, 5.0289F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(336, 475).addBox(-17.028F, 12.5F, 0.0289F, 17.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(193, 27)
						.addBox(-1.028F, 1.5F, 10.0289F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(193, 39).addBox(-1.028F, 1.5F, 0.0289F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(504, 238)
						.addBox(-1.028F, -1.5F, 0.0289F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.3F, -21.5F, 138.5F, 0.0F, -0.9163F, 0.0F));
		PartDefinition cube_r394 = bb_main.addOrReplaceChild("cube_r394",
				CubeListBuilder.create().texOffs(182, 654).addBox(-22.0F, -1.5F, 0.0F, 22.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(86, 146).addBox(-1.0F, -12.5F, 0.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(193, 51)
						.addBox(-1.0F, -12.5F, 7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(463, 238).addBox(-1.0F, -15.5F, 0.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(21.0F, -7.5F, 131.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r395 = bb_main.addOrReplaceChild("cube_r395",
				CubeListBuilder.create().texOffs(662, 345).addBox(-14.0657F, -1.5F, -0.0922F, 14.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(86, 124).addBox(-1.0657F, -12.5F, 6.9078F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(193, 15).addBox(-1.0657F, -12.5F, -0.0922F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(474, 39).addBox(-1.0657F, -15.5F, -0.0922F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5F, -7.5F, 145.3F, 0.0F, -1.309F, 0.0F));
		PartDefinition cube_r396 = bb_main.addOrReplaceChild("cube_r396",
				CubeListBuilder.create().texOffs(662, 356).addBox(0.0657F, -1.5F, -0.0922F, 14.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(89, 135).addBox(0.0657F, -12.5F, 6.9078F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(89, 157).addBox(0.0657F, -12.5F, -0.0922F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(431, 37).addBox(0.0657F, -15.5F, -0.0922F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.5F, -7.5F, 145.3F, 0.0F, 1.309F, 0.0F));
		PartDefinition cube_r397 = bb_main.addOrReplaceChild("cube_r397",
				CubeListBuilder.create().texOffs(460, 635).addBox(0.0F, -1.5F, 0.0F, 19.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(8, 150).addBox(0.0F, -12.5F, 0.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 164)
						.addBox(0.0F, -12.5F, 7.0F, 1.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 175).addBox(0.0F, -15.5F, 0.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.0F, -7.5F, 131.0F, 0.0F, 0.3491F, 0.0F));
		PartDefinition cube_r398 = bb_main.addOrReplaceChild("cube_r398", CubeListBuilder.create().texOffs(309, 64).addBox(-7.0F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.0F, -5.0F, 130.0F, 0.0F, 0.0F, 0.6632F));
		PartDefinition cube_r399 = bb_main.addOrReplaceChild("cube_r399", CubeListBuilder.create().texOffs(202, 320).addBox(0.0F, -1.0F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.0F, -5.0F, 130.0F, 0.0F, 0.0F, -0.6632F));
		PartDefinition cube_r400 = bb_main.addOrReplaceChild("cube_r400",
				CubeListBuilder.create().texOffs(0, 150).addBox(-2.0F, 0.0F, 13.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(486, 499).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(380, 505)
						.addBox(-2.0F, 0.0F, -47.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(507, 0).addBox(-2.0F, 0.0F, -90.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(507, 43)
						.addBox(-2.0F, 0.0F, -135.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.5F, -5.0F, 101.0F, 0.0F, 0.0F, 0.6981F));
		PartDefinition cube_r401 = bb_main.addOrReplaceChild("cube_r401",
				CubeListBuilder.create().texOffs(417, 499).addBox(0.0F, 0.0F, 13.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(425, 499).addBox(0.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(455, 499)
						.addBox(0.0F, 0.0F, -47.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(463, 499).addBox(0.0F, 0.0F, -90.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(478, 499)
						.addBox(0.0F, 0.0F, -135.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.5F, -5.0F, 101.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r402 = bb_main.addOrReplaceChild("cube_r402",
				CubeListBuilder.create().texOffs(380, 268).addBox(-1.9937F, -0.064F, 13.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(29, 175).addBox(-3.3937F, 8.436F, -186.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(455, 39)
						.addBox(-1.9937F, -0.064F, -167.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 64).addBox(-1.9937F, -0.064F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 109)
						.addBox(-1.9937F, -0.064F, -47.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 129).addBox(-1.9937F, -0.064F, -90.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 150)
						.addBox(-1.9937F, -0.064F, -135.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.4F, 3.4125F, 101.0F, 0.0F, 0.0F, 1.1781F));
		PartDefinition cube_r403 = bb_main.addOrReplaceChild("cube_r403",
				CubeListBuilder.create().texOffs(397, 268).addBox(-0.0063F, -0.064F, 13.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 175).addBox(1.3937F, 8.436F, -186.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(485, 238)
						.addBox(-0.0063F, -0.064F, -167.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(359, 487).addBox(-0.0063F, -0.064F, -1.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(376, 487)
						.addBox(-0.0063F, -0.064F, -47.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(384, 487).addBox(-0.0063F, -0.064F, -90.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(499, 23)
						.addBox(-0.0063F, -0.064F, -135.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.4F, 3.4125F, 101.0F, 0.0F, 0.0F, -1.1781F));
		PartDefinition cube_r404 = bb_main.addOrReplaceChild("cube_r404", CubeListBuilder.create().texOffs(169, 169).addBox(-0.75F, -1.5F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 5.0F, -85.5F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r405 = bb_main.addOrReplaceChild("cube_r405", CubeListBuilder.create().texOffs(86, 78).addBox(-0.5088F, -8.2855F, -0.25F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.2766F, 4.7057F, -85.0F, -0.05F, -0.0406F, -0.4878F));
		PartDefinition cube_r406 = bb_main.addOrReplaceChild("cube_r406", CubeListBuilder.create().texOffs(206, 15).addBox(-1.4912F, -8.2855F, -0.25F, 2.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.2766F, 4.7057F, -85.0F, -0.05F, 0.0406F, 0.4878F));
		PartDefinition cube_r407 = bb_main.addOrReplaceChild("cube_r407", CubeListBuilder.create().texOffs(164, 191).addBox(-1.25F, -1.5F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 5.0F, -85.5F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r408 = bb_main.addOrReplaceChild("cube_r408", CubeListBuilder.create().texOffs(134, 613).addBox(-2.0F, -0.7351F, 1.3248F, 4.0F, 4.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.5F, 143.5F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r409 = bb_main.addOrReplaceChild("cube_r409", CubeListBuilder.create().texOffs(309, 48).addBox(-2.0F, -4.4F, 1.0F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.5F, 138.25F, 0.5236F, 0.0F, 0.0F));
		PartDefinition cube_r410 = bb_main.addOrReplaceChild("cube_r410", CubeListBuilder.create().texOffs(402, 593).addBox(0.0F, -1.5F, -20.0F, 2.0F, 3.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-22.0F, -24.5F, -66.0F, 0.0F, -0.3491F, 0.0F));
		PartDefinition cube_r411 = bb_main.addOrReplaceChild("cube_r411",
				CubeListBuilder.create().texOffs(380, 44).addBox(7.0F, 0.0F, -20.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(485, 215).addBox(0.0F, 0.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.5F, -22.0F, -65.0F, 0.0F, 0.0F, -0.1309F));
		PartDefinition cube_r412 = bb_main.addOrReplaceChild("cube_r412",
				CubeListBuilder.create().texOffs(438, 282).addBox(6.3657F, -7.0694F, -20.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(323, 16).addBox(-0.0593F, -9.8194F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, 3.25F, -65.0F, 0.0F, 0.0F, -0.5061F));
		PartDefinition cube_r413 = bb_main.addOrReplaceChild("cube_r413",
				CubeListBuilder.create().texOffs(446, 282).addBox(-8.3657F, -7.0694F, -20.0F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(309, 16).addBox(-1.9407F, -9.8194F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(13.5F, 3.25F, -65.0F, 0.0F, 0.0F, 0.5061F));
		PartDefinition cube_r414 = bb_main.addOrReplaceChild("cube_r414",
				CubeListBuilder.create().texOffs(478, 475).addBox(-9.0F, 0.0F, -20.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(484, 259).addBox(-2.0F, 0.0F, -1.0F, 2.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.5F, -22.0F, -65.0F, 0.0F, 0.0F, 0.1309F));
		PartDefinition cube_r415 = bb_main.addOrReplaceChild("cube_r415", CubeListBuilder.create().texOffs(455, 475).addBox(-3.0F, -0.0373F, -0.0778F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 7.0F, -87.0F, 1.2828F, 0.0F, 0.0F));
		PartDefinition cube_r416 = bb_main.addOrReplaceChild("cube_r416", CubeListBuilder.create().texOffs(412, 16).addBox(-3.0F, -0.8412F, -0.5419F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -93.0F, 1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r417 = bb_main.addOrReplaceChild("cube_r417", CubeListBuilder.create().texOffs(281, 48).addBox(-3.0F, -14.0547F, -3.7429F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.5F, -96.5F, 0.6109F, 0.0F, 0.0F));
		PartDefinition cube_r418 = bb_main.addOrReplaceChild("cube_r418", CubeListBuilder.create().texOffs(344, 44).addBox(-3.0F, -13.9808F, -3.9951F, 5.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, -91.5F, 0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r419 = bb_main.addOrReplaceChild("cube_r419", CubeListBuilder.create().texOffs(424, 307).addBox(-3.0F, -14.0F, 0.0F, 5.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, -93.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r420 = bb_main.addOrReplaceChild("cube_r420", CubeListBuilder.create().texOffs(94, 613).addBox(-2.0F, -4.0F, 0.0F, 4.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.0F, 115.75F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone24.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone23.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone22.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		sail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		sail2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		sail3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone12.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone14.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone26.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone27.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone28.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone29.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone30.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		treasurechest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		goldbarrel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone33.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hexadecagon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		treasurechest2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone34.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone54.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lifeboat2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lifeboat4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone16.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone25.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone61.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lifeboat3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		greenbarrel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		closedchest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		valuablecargo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		redbarrel10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cargo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cargo2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		valuablecargo2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar9.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		algar11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
