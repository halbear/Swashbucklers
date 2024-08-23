// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcutterwreckback<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cutterwreckback"), "main");
	private final ModelPart bone2;

	public Modelcutterwreckback(ModelPart root) {
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-0.649F, -0.8537F, 11.8744F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(145, 215)
				.addBox(12.351F, -6.8537F, -25.1256F, 0.0F, 4.0F, 37.0F, new CubeDeformation(0.0F)).texOffs(145, 215)
				.mirror().addBox(-11.649F, -6.8537F, -25.1256F, 0.0F, 4.0F, 37.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(0, 250)
				.addBox(-11.649F, -8.8537F, 11.8744F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-7.649F, -0.8537F, -32.1256F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(132, 171)
				.addBox(4.851F, -1.8537F, -16.6256F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(119, 81)
				.addBox(-1.149F, 4.5213F, -18.6256F, 3.0F, 2.0F, 31.0F, new CubeDeformation(0.0F)).texOffs(86, 28)
				.mirror().addBox(1.851F, 4.1463F, -17.6256F, 3.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(86, 28).addBox(-4.149F, 4.1463F, -17.6256F, 3.0F, 2.0F, 28.0F, new CubeDeformation(0.0F))
				.texOffs(0, 42).addBox(-10.149F, -3.7474F, 10.4307F, 21.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 70).addBox(-1.2553F, -5.1162F, 9.3619F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 70).addBox(-6.5428F, -5.0224F, 9.2494F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(60, 19).addBox(-5.4803F, -2.9787F, 10.8057F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(26, 49).addBox(-7.4803F, 1.1213F, 10.8057F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(89, 25).addBox(-4.149F, 1.1463F, 10.3744F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.351F, 18.8537F, 5.1256F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(89, 32)
				.addBox(-11.3384F, -12.3168F, 28.875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 34)
				.addBox(-9.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(79, 133)
				.mirror().addBox(4.3467F, 0.1647F, -5.0F, 3.0F, 1.0F, 35.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(89, 18)
				.addBox(2.8384F, -12.4668F, 28.8188F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(103, 66)
				.addBox(6.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(79, 133)
				.addBox(-7.3467F, 0.1647F, -5.0F, 3.0F, 1.0F, 35.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 28).addBox(-7.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 139)
				.addBox(-11.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(105, 171)
				.addBox(-11.7417F, 2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(14, 29).addBox(4.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(198, 171).mirror()
						.addBox(7.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0105F, 0.0F, -1.309F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(194, 73).mirror()
						.addBox(8.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0436F, 0.0F, -0.7854F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 106).mirror()
						.addBox(7.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, -0.0192F, 0.0F, -1.309F));

		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(60, 106).mirror()
						.addBox(5.7417F, 2.7012F, -8.9654F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, -0.0087F, 0.0F, -0.7854F));

		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(194, 73).addBox(-11.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0436F, 0.0F, 0.7854F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(178, 143).addBox(-8.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0524F, 0.0F, 0.7854F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 106).addBox(-10.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, -0.0192F, 0.0F, 1.309F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(142, 22).mirror()
						.addBox(-9.422F, 10.3831F, -2.014F, 2.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(142, 22).addBox(7.422F, 10.3831F, -2.014F, 2.0F, 2.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 193).addBox(-1.8533F, -8.173F, 2.8808F, 3.0F, 2.0F, 27.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, -0.0175F, 0.0F, 0.0524F));

		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 161).addBox(-10.1344F, -8.0386F, 0.2444F, 3.0F, 2.0F, 30.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0349F, 0.0F, -0.0524F));

		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(178, 114).addBox(-4.5F, -8.0F, 3.0F, 3.0F, 2.0F, 27.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0F, 0.0F, 0.0175F));

		PartDefinition cube_r18 = bone2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(72, 171)
						.addBox(7.5F, -7.5247F, 3.2273F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(165, 173)
						.addBox(-7.5F, -7.4724F, 3.2264F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(178, 0).addBox(1.5F, -8.2608F, 2.8799F, 3.0F, 2.0F, 27.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, 6.1463F, -19.6256F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone2.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(238, 92).addBox(0.2846F, -31.1356F, -5.118F, 0.0F, 31.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.039F, -6.6394F, -12.3957F, -0.0094F, -0.0147F, -1.3526F));

		PartDefinition bone = bone2.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(6.8315F, -6.4787F, 4.6996F, -0.0668F, 0.6516F, 1.461F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(207, 222)
						.addBox(-2.0F, -2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 215)
						.addBox(-2.0F, -1.75F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 209)
						.addBox(-2.0F, -1.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238)
						.addBox(-2.5F, 1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, -1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233)
						.addBox(-2.0F, -3.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));

		PartDefinition bone19 = bone2.addOrReplaceChild("bone19", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-5.649F, -8.8537F, 5.8744F, -0.3491F, -0.6545F, 0.0F));

		PartDefinition chestlid = bone19.addOrReplaceChild("chestlid", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.9625F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r22 = chestlid.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(154, 213).addBox(-4.0F, -25.6017F, 0.2188F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.3602F, -24.0935F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r23 = chestlid.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(154, 213).addBox(-3.99F, 6.326F, 19.5977F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.3602F, -19.0935F, 0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r24 = chestlid.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(157, 209)
				.addBox(1.09F, 20.5073F, -6.4951F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(157, 209)
				.addBox(-4.11F, 20.5073F, -6.4951F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 9.8602F, -21.5935F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r25 = chestlid.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(172, 217).addBox(-4.0F, 21.742F, 1.9098F, 8.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 11.3602F, -24.0935F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r26 = chestlid.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(174, 211).addBox(-4.01F, 14.0935F, 11.1102F, 8.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.3602F, -19.0935F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest = bone19.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(124, 207)
				.addBox(-4.0F, -11.0F, 30.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, -34.0F));

		PartDefinition mast2 = bone2.addOrReplaceChild("mast2",
				CubeListBuilder.create().texOffs(18, 16)
						.addBox(-0.75F, -40.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(120, 0)
						.addBox(-0.625F, -16.0F, 0.0F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, -7.5F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 16)
						.addBox(-1.0F, -8.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.351F, -1.8537F, -12.1256F, 0.0F, 0.0F, -0.9599F));

		PartDefinition cube_r27 = mast2.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(40, 40).addBox(0.0F, -7.0F, -61.0F, 0.0F, 31.0F, 35.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -28.0F, -37.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone6 = mast2.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(0.0F, -16.5F, 11.8431F));

		PartDefinition cube_r28 = bone6.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone11 = bone6.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r29 = bone11.addOrReplaceChild(
				"cube_r29", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -19.5F, 7.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r30 = bone11.addOrReplaceChild(
				"cube_r30", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -19.5F, -11.9375F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone12 = bone6.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r31 = bone12.addOrReplaceChild(
				"cube_r31", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -19.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r32 = bone12.addOrReplaceChild(
				"cube_r32", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -19.5F, 0.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone14 = bone12.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r33 = bone14.addOrReplaceChild(
				"cube_r33", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -19.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r34 = bone14.addOrReplaceChild(
				"cube_r34", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -19.5F, -1.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r35 = bone14
				.addOrReplaceChild("cube_r35",
						CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -19.5F, 12.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone15 = mast2.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.5F, 11.8431F));

		PartDefinition cube_r36 = bone15.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 22.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r37 = bone16.addOrReplaceChild(
				"cube_r37", CubeListBuilder.create().texOffs(16, 106).addBox(7.9853F, -19.5F, 7.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r38 = bone16.addOrReplaceChild(
				"cube_r38", CubeListBuilder.create().texOffs(29, 106).addBox(0.15F, -19.5F, -11.9375F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r39 = bone17.addOrReplaceChild(
				"cube_r39", CubeListBuilder.create().texOffs(8, 106).addBox(7.9853F, -19.5F, -9.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r40 = bone17.addOrReplaceChild(
				"cube_r40", CubeListBuilder.create().texOffs(12, 106).addBox(-11.85F, -19.5F, 0.0625F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r41 = bone18.addOrReplaceChild(
				"cube_r41", CubeListBuilder.create().texOffs(48, 0).addBox(-8.9853F, -19.5F, -9.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r42 = bone18.addOrReplaceChild(
				"cube_r42", CubeListBuilder.create().texOffs(0, 106).addBox(-12.3625F, -19.5F, -1.0625F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r43 = bone18
				.addOrReplaceChild("cube_r43",
						CubeListBuilder.create().texOffs(4, 106).addBox(0.15F, -19.5F, 12.0625F, 1.0F, 22.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition flag2 = mast2.addOrReplaceChild("flag2",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3789F, -38.0F, 0.1616F));

		PartDefinition cube_r44 = flag2.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(10, 0).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, 0.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r45 = flag2.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, 0.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));

		PartDefinition wheel = mast2.addOrReplaceChild("wheel", CubeListBuilder.create().texOffs(183, 222).addBox(-4.0F,
				-4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 2.25F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}