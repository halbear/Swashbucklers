// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcutterpiratedplayeramaged<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cutterpiratedplayeramaged"), "main");
	private final ModelPart bone28;

	public Modelcutterpiratedplayeramaged(ModelPart root) {
		this.bone28 = root.getChild("bone28");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone28 = partdefinition.addOrReplaceChild("bone28", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -8.0F, 34.0F, 2.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(65, 197)
				.addBox(12.0F, -14.0F, -21.0F, 0.0F, 4.0F, 55.0F, new CubeDeformation(0.0F)).texOffs(26, 49)
				.addBox(-7.8312F, -6.025F, 32.9313F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 19)
				.addBox(-5.8312F, -10.125F, 32.9313F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
				.addBox(-2.3375F, -7.3375F, 32.8188F, 11.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 70)
				.addBox(-6.8938F, -12.1688F, 31.375F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 70)
				.addBox(-1.6062F, -12.2625F, 31.4875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
				.addBox(-10.5F, -10.8937F, 32.5562F, 21.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 2)
				.mirror().addBox(1.5F, -3.0F, -21.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(96, 58).addBox(-1.5F, -2.625F, -21.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F))
				.texOffs(60, 2).addBox(-4.5F, -3.0F, -21.5F, 3.0F, 2.0F, 54.0F, new CubeDeformation(0.0F))
				.texOffs(132, 171).addBox(4.5F, -9.0F, 5.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F))
				.texOffs(39, 169).addBox(7.5F, -9.0F, -21.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F))
				.texOffs(89, 25).addBox(-4.5F, -6.0F, 32.5F, 9.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(30, 16).addBox(-1.0F, -17.0F, 10.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.5F, -16.5F, 12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-8.0F, -8.0F, -10.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 250)
				.addBox(-12.0F, -16.0F, 34.0F, 24.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(65, 197).mirror()
				.addBox(-12.0F, -14.0F, -21.0F, 0.0F, 4.0F, 55.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 28.0F, -21.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r1 = bone28.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(165, 173)
						.addBox(-7.5F, -7.4724F, 3.2264F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(72, 171)
						.addBox(7.5F, -7.5247F, 3.2273F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(36, 161)
						.addBox(4.5F, -8.4147F, -23.7571F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone28.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(129, 171)
						.addBox(-7.5F, -7.8419F, -24.1164F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
						.texOffs(178, 0).addBox(1.5F, -8.2608F, 2.8799F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone28.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 175).addBox(1.2626F, -7.9425F, -24.1182F, 3.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r4 = bone28
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(178, 114).addBox(-4.5F, -8.0F, 3.0F, 3.0F, 2.0F, 27.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, 0.0175F));

		PartDefinition cube_r5 = bone28.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(36, 175)
				.addBox(-4.5F, -8.1822F, -23.8806F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(200, 93)
				.addBox(-1.5F, -8.2346F, -23.8801F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone28.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 161).addBox(-10.1344F, -8.0386F, 0.2444F, 3.0F, 2.0F, 30.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0349F, 0.0F, -0.0524F));

		PartDefinition cube_r7 = bone28.addOrReplaceChild(
				"cube_r7", CubeListBuilder.create().texOffs(135, 174).addBox(-10.7301F, -7.6818F, -24.0F, 3.0F, 2.0F,
						24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, 0.0349F));

		PartDefinition cube_r8 = bone28.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 193).addBox(-1.8533F, -8.173F, 2.8808F, 3.0F, 2.0F, 27.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0175F, 0.0F, 0.0524F));

		PartDefinition cube_r9 = bone28.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(89, 0).addBox(16.7634F, -6.8126F, -25.1741F, 3.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.077F, 0.4382F, 0.011F));

		PartDefinition cube_r10 = bone28.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(84, 131).addBox(25.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.1034F, 0.8294F, -0.0326F));

		PartDefinition cube_r11 = bone28.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(144, 137).addBox(-28.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.1034F, -0.8294F, 0.0326F));

		PartDefinition cube_r12 = bone28.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(89, 9).addBox(-19.7634F, -6.5126F, -25.1741F, 3.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.077F, -0.4382F, -0.011F));

		PartDefinition cube_r13 = bone28.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(60, 10).addBox(4.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0697F, 0.003F, 0.0435F));

		PartDefinition cube_r14 = bone28.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(146, 0).addBox(0.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0695F, 0.0061F, 0.0871F));

		PartDefinition cube_r15 = bone28.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(60, 25).addBox(-7.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0697F, -0.003F, -0.0435F));

		PartDefinition cube_r16 = bone28.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(146, 12).addBox(-3.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0695F, -0.0061F, -0.0871F));

		PartDefinition cube_r17 = bone28.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(179, 93).addBox(-1.5F, -6.2918F, -38.688F, 3.0F, 2.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bone28.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(41, 222).addBox(-1.5F, 11.6135F, -44.7362F, 3.0F, 3.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone28.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(67, 223).addBox(-1.0F, -0.8324F, -11.8662F, 2.0F, 2.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.0F, -39.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bone28.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(101, 37).addBox(-7.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.5729F, -0.1323F, 0.0849F));

		PartDefinition cube_r21 = bone28.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(147, 25).addBox(-0.25F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.74F, -7.0236F, -33.4552F, -0.581F, -0.2055F, 0.1332F));

		PartDefinition cube_r22 = bone28.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 131).addBox(-8.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.1683F, -0.1721F, 0.0291F));

		PartDefinition cube_r23 = bone28.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(60, 131).addBox(-1.5F, 2.3361F, -29.6709F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bone28.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(53, 200).addBox(7.422F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.7418F, 0.0F, -1.5708F));

		PartDefinition cube_r25 = bone28.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(120, 0).addBox(7.422F, 10.3831F, -24.014F, 2.0F, 2.0F, 54.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r26 = bone28.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(66, 40).addBox(7.422F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r27 = bone28.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(114, 246).addBox(0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9628F, -12.422F, -21.0407F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r28 = bone28.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(132, 238).addBox(-0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5128F, -12.422F, -26.4907F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r29 = bone28.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(132, 238).mirror()
						.addBox(0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-9.5128F, -12.422F, -26.4907F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r30 = bone28.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(114, 246).mirror()
						.addBox(-0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.9628F, -12.422F, -21.0407F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r31 = bone28.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 106).addBox(-10.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0192F, 0.0F, 1.309F));

		PartDefinition cube_r32 = bone28.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(198, 171).addBox(-10.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0105F, 0.0F, 1.309F));

		PartDefinition cube_r33 = bone28.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(0, 161).addBox(-16.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.7109F, -0.2332F, 1.3086F));

		PartDefinition cube_r34 = bone28.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(85, 200).addBox(-9.922F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.7418F, 0.0F, 1.5708F));

		PartDefinition cube_r35 = bone28.addOrReplaceChild(
				"cube_r35", CubeListBuilder.create().texOffs(120, 115).addBox(-9.922F, 10.3831F, -24.014F, 2.0F, 2.0F,
						54.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r36 = bone28.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(120, 25).addBox(-14.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.413F, -0.1451F, 1.2522F));

		PartDefinition cube_r37 = bone28.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(131, 60).addBox(-9.922F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.4363F, 0.0F, 1.5708F));

		PartDefinition cube_r38 = bone28.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(120, 137).addBox(-10.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0175F, 0.0F, 1.309F));

		PartDefinition cube_r39 = bone28.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(120, 48).addBox(-17.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.7905F, -0.2962F, 1.1949F));

		PartDefinition cube_r40 = bone28.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(120, 33).addBox(-13.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.333F, -0.1111F, 1.0056F));

		PartDefinition cube_r41 = bone28.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(60, 0).addBox(-11.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.736F, -0.1159F, 0.8374F));

		PartDefinition cube_r42 = bone28.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(120, 114).addBox(-11.4706F, 9.7197F, -26.1629F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.3079F, -0.1248F, 0.825F));

		PartDefinition cube_r43 = bone28.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(194, 56)
				.addBox(-8.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(105, 171)
				.addBox(-11.7417F, 2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(0, 139)
				.addBox(-11.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r44 = bone28.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(178, 143).addBox(-8.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0524F, 0.0F, 0.7854F));

		PartDefinition cube_r45 = bone28.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(60, 106).addBox(-8.7417F, 2.7012F, -8.9654F, 3.0F, 2.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0087F, 0.0F, 0.7854F));

		PartDefinition cube_r46 = bone28.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(194, 73).addBox(-11.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0436F, 0.0F, 0.7854F));

		PartDefinition cube_r47 = bone28.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(120, 114).addBox(-11.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0175F, 0.0F, 0.7854F));

		PartDefinition cube_r48 = bone28.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(60, 139)
				.addBox(-11.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 28)
				.addBox(-12.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.59F, -0.2404F, 0.3057F));

		PartDefinition cube_r49 = bone28.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(120, 122).addBox(-12.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.2148F, -0.2404F, 0.3057F));

		PartDefinition cube_r50 = bone28.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 114)
				.addBox(-7.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 54.0F, new CubeDeformation(0.0F)).texOffs(103, 66)
				.addBox(6.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(89, 18)
				.addBox(2.8384F, -12.4668F, 28.8188F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r51 = bone28.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(60, 114)
				.mirror().addBox(4.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 54.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(72, 34).addBox(-9.8988F, -10.8669F, 30.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(89, 32).addBox(-11.3384F, -12.3168F, 28.875F, 8.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r52 = bone28.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(0, 131).mirror()
						.addBox(5.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.1683F, 0.1721F, -0.0291F));

		PartDefinition cube_r53 = bone28.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(147, 25).mirror()
						.addBox(-1.75F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.74F, -7.0236F, -33.4552F, -0.581F, 0.2055F, -0.1332F));

		PartDefinition cube_r54 = bone28.addOrReplaceChild("cube_r54",
				CubeListBuilder.create().texOffs(101, 37).mirror()
						.addBox(4.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.5729F, 0.1323F, -0.0849F));

		PartDefinition cube_r55 = bone28.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(30, 28).mirror()
				.addBox(11.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 139).mirror()
				.addBox(9.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.59F, 0.2404F, -0.3057F));

		PartDefinition cube_r56 = bone28.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(120, 122).mirror()
						.addBox(9.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.2148F, 0.2404F, -0.3057F));

		PartDefinition cube_r57 = bone28.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(60, 0).mirror()
				.addBox(8.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.736F, 0.1159F, -0.8374F));

		PartDefinition cube_r58 = bone28.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(120, 114).mirror()
						.addBox(8.4706F, 9.7197F, -26.1629F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.3079F, 0.1248F, -0.825F));

		PartDefinition cube_r59 = bone28.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 161).mirror()
				.addBox(13.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.7109F, 0.2332F, -1.3086F));

		PartDefinition cube_r60 = bone28.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(120, 48).mirror()
						.addBox(14.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.7905F, 0.2962F, -1.1949F));

		PartDefinition cube_r61 = bone28.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(120, 33).mirror()
						.addBox(10.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.333F, 0.1111F, -1.0056F));

		PartDefinition cube_r62 = bone28.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(120, 25).mirror()
						.addBox(11.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.413F, 0.1451F, -1.2522F));

		PartDefinition cube_r63 = bone28.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(120, 137).mirror()
						.addBox(7.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0175F, 0.0F, -1.309F));

		PartDefinition cube_r64 = bone28.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(120, 114).mirror()
						.addBox(8.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0175F, 0.0F, -0.7854F));

		PartDefinition cube_r65 = bone28.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(194, 56).mirror()
						.addBox(5.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(105, 171).mirror()
						.addBox(8.7417F, 2.721F, 12.0F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(89, 122).addBox(5.7622F, -0.4046F, 30.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r66 = bone28.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(60, 106).mirror()
						.addBox(5.7417F, 2.7012F, -8.9654F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0087F, 0.0F, -0.7854F));

		PartDefinition cube_r67 = bone28.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(178, 143).mirror()
						.addBox(5.7417F, 3.6968F, 13.2665F, 3.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0524F, 0.0F, -0.7854F));

		PartDefinition cube_r68 = bone28.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(0, 106).mirror()
						.addBox(7.8142F, 7.8319F, 7.6737F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, -0.0192F, 0.0F, -1.309F));

		PartDefinition cube_r69 = bone28.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(194, 73).mirror()
						.addBox(8.7417F, 3.0446F, -3.1832F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0436F, 0.0F, -0.7854F));

		PartDefinition cube_r70 = bone28.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(198, 171).mirror()
						.addBox(7.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0105F, 0.0F, -1.309F));

		PartDefinition cube_r71 = bone28.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(14, 29).addBox(4.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r72 = bone28
				.addOrReplaceChild("cube_r72",
						CubeListBuilder.create().texOffs(30, 28).addBox(-7.2917F, -2.6468F, 30.0F, 3.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 2.5F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r73 = bone28.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(238, 92).addBox(0.2846F, -18.1356F, -30.118F, 0.0F, 18.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.688F, -13.7857F, 9.7298F, -0.0173F, 0.0023F, -0.2182F));

		PartDefinition cube_r74 = bone28.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(238, 92).addBox(0.2846F, -31.1356F, -5.118F, 0.0F, 31.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.688F, -13.7857F, 9.7298F, -0.0174F, -0.0008F, -0.3927F));

		PartDefinition cube_r75 = bone28.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(238, 92).mirror()
						.addBox(-0.2846F, -31.1356F, -5.118F, 0.0F, 31.0F, 9.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-11.688F, -13.7857F, 9.7298F, -0.0174F, 0.0008F, 0.3927F));

		PartDefinition cube_r76 = bone28.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(238, 123).mirror()
						.addBox(-0.3098F, -14.1271F, -4.9048F, 0.0F, 14.0F, 9.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-11.688F, -13.7857F, -15.2702F, 0.0038F, -0.017F, -1.4399F));

		PartDefinition cannon3 = bone28.addOrReplaceChild("cannon3", CubeListBuilder.create().texOffs(93, 27).mirror()
				.addBox(1.4286F, -0.9316F, -2.3186F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 26).addBox(-2.5714F, -0.9316F, -2.3186F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(93, 27).mirror()
				.addBox(32.4286F, -0.9316F, -2.3186F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(92, 26).addBox(28.4286F, -0.9316F, -2.3186F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0714F, -10.3684F, -13.8564F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r77 = cannon3.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(96, 134).mirror()
						.addBox(30.5F, 1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(96, 134).mirror()
						.addBox(-0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.4286F, -3.1316F, -0.1436F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r78 = cannon3.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(104, 235)
				.mirror().addBox(30.0F, 0.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(129, 238).mirror().addBox(29.5F, -0.5F, 2.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(104, 235).mirror()
				.addBox(-1.0F, 0.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(129, 238)
				.mirror().addBox(-1.5F, -0.5F, 2.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0714F, -2.6316F, -4.6436F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r79 = cannon3.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(36, 119)
				.addBox(30.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 119).mirror()
				.addBox(34.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(36, 119)
				.addBox(-0.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 119).mirror()
				.addBox(3.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.0714F, 1.3684F, -3.1436F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cannon2 = bone28.addOrReplaceChild("cannon2", CubeListBuilder.create().texOffs(93, 27)
				.addBox(-2.4286F, -0.9316F, -2.3186F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(92, 26)
				.mirror().addBox(1.5714F, -0.9316F, -2.3186F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(93, 27).addBox(-33.4286F, -0.9316F, -2.3186F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(92, 26).mirror()
				.addBox(-29.4286F, -0.9316F, -2.3186F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-8.0714F, -10.3684F, -13.8564F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r80 = cannon2.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(96, 134)
						.addBox(-31.5F, 1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(96, 134)
						.addBox(-0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4286F, -3.1316F, -0.1436F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r81 = cannon2.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(104, 235)
						.addBox(-32.0F, 0.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(129, 238)
						.addBox(-32.5F, -0.5F, 2.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 235)
						.addBox(-1.0F, 0.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(129, 238)
						.addBox(-1.5F, -0.5F, 2.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0714F, -2.6316F, -4.6436F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r82 = cannon2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(36, 119)
				.mirror().addBox(-31.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(36, 119).addBox(-35.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(36, 119).mirror().addBox(-0.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(36, 119).addBox(-4.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0714F, 1.3684F, -3.1436F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cannon = bone28.addOrReplaceChild("cannon",
				CubeListBuilder.create().texOffs(93, 27)
						.addBox(-2.3333F, -5.755F, -13.5032F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
						.texOffs(92, 26).mirror()
						.addBox(1.6667F, -5.755F, -13.5032F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-0.1667F, -6.545F, -15.6718F));

		PartDefinition cube_r83 = cannon.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(96, 134).addBox(-0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3333F, -7.955F, -11.3282F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r84 = cannon.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(104, 235)
						.addBox(-1.0F, 0.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(129, 238)
						.addBox(-1.5F, -0.5F, 2.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1667F, -7.455F, -15.8282F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r85 = cannon.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(36, 119).mirror()
						.addBox(-0.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(36, 119).addBox(-4.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.1667F, -3.455F, -14.3282F, -0.5672F, 0.0F, 0.0F));

		PartDefinition mast = bone28.addOrReplaceChild("mast",
				CubeListBuilder.create().texOffs(18, 16)
						.addBox(-0.75F, -57.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(178, 169)
						.addBox(-13.0F, -37.5F, -2.0F, 26.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(177, 169)
						.addBox(-13.0F, -49.0F, -2.0F, 26.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.0F, -14.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r86 = mast.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(156, 56).addBox(0.125F, -0.5F, -18.0F, 1.0F, 1.0F, 36.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -14.5F, -2.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r87 = mast.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(86, 225).addBox(-13.0F, -23.4762F, -15.1675F, 26.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, 8.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r88 = mast.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(86, 223).addBox(-13.0F, -20.7441F, -20.7238F, 26.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, 8.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r89 = mast.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(68, 58).addBox(-20.0F, -3.992F, 0.0261F, 34.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.9875F, -2.6375F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r90 = mast.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(0, 58).addBox(-15.0F, -5.425F, -0.325F, 34.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.334F, -2.9637F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r91 = mast.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(0, 66).addBox(-17.0F, -0.008F, 0.0261F, 34.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.825F, -2.6125F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r92 = mast.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(68, 62).addBox(-17.0F, -0.5F, -0.25F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -33.075F, -1.725F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r93 = mast.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(86, 233).addBox(-13.0F, -20.7822F, -2.2923F, 26.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, 8.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r94 = mast.addOrReplaceChild("cube_r94",
				CubeListBuilder.create().texOffs(86, 231).addBox(-13.0F, -21.4738F, -7.5942F, 26.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, 8.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r95 = mast.addOrReplaceChild("cube_r95",
				CubeListBuilder.create().texOffs(86, 227).addBox(-13.0F, 19.784F, -11.2137F, 26.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, 8.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r96 = mast.addOrReplaceChild("cube_r96",
				CubeListBuilder.create().texOffs(68, 64).addBox(-21.0F, -1.5F, -0.25F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.7375F, -1.75F, 0.4363F, 0.0F, 0.0F));

		PartDefinition bone2 = mast.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -13.5F, 11.8431F));

		PartDefinition cube_r97 = bone2.addOrReplaceChild("cube_r97",
				CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r98 = bone3.addOrReplaceChild(
				"cube_r98", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r99 = bone3.addOrReplaceChild(
				"cube_r99", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r100 = bone4.addOrReplaceChild(
				"cube_r100", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r101 = bone4.addOrReplaceChild(
				"cube_r101", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r102 = bone5.addOrReplaceChild(
				"cube_r102", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r103 = bone5.addOrReplaceChild(
				"cube_r103", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r104 = bone5
				.addOrReplaceChild("cube_r104",
						CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone7 = mast.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.5F, 11.8431F));

		PartDefinition cube_r105 = bone7.addOrReplaceChild("cube_r105",
				CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 22.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r106 = bone8.addOrReplaceChild(
				"cube_r106", CubeListBuilder.create().texOffs(16, 106).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r107 = bone8.addOrReplaceChild(
				"cube_r107", CubeListBuilder.create().texOffs(29, 106).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r108 = bone9.addOrReplaceChild(
				"cube_r108", CubeListBuilder.create().texOffs(8, 106).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r109 = bone9.addOrReplaceChild(
				"cube_r109", CubeListBuilder.create().texOffs(12, 106).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r110 = bone10.addOrReplaceChild(
				"cube_r110", CubeListBuilder.create().texOffs(48, 0).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r111 = bone10.addOrReplaceChild(
				"cube_r111", CubeListBuilder.create().texOffs(0, 106).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r112 = bone10
				.addOrReplaceChild("cube_r112",
						CubeListBuilder.create().texOffs(4, 106).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 22.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone24 = mast.addOrReplaceChild("bone24", CubeListBuilder.create(),
				PartPose.offset(0.0F, -31.5F, 11.8431F));

		PartDefinition cube_r113 = bone24.addOrReplaceChild("cube_r113",
				CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone25 = bone24.addOrReplaceChild("bone25", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r114 = bone25.addOrReplaceChild(
				"cube_r114", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r115 = bone25.addOrReplaceChild(
				"cube_r115", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone26 = bone24.addOrReplaceChild("bone26", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r116 = bone26.addOrReplaceChild(
				"cube_r116", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r117 = bone26.addOrReplaceChild(
				"cube_r117", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone27 = bone26.addOrReplaceChild("bone27", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r118 = bone27.addOrReplaceChild(
				"cube_r118", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r119 = bone27.addOrReplaceChild(
				"cube_r119", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r120 = bone27
				.addOrReplaceChild("cube_r120",
						CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition flag = mast.addOrReplaceChild("flag",
				CubeListBuilder.create().texOffs(34, 32)
						.addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3789F, -55.0F, 0.1616F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r121 = flag.addOrReplaceChild("cube_r121",
				CubeListBuilder.create().texOffs(4, 31).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, 0.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r122 = flag.addOrReplaceChild("cube_r122",
				CubeListBuilder.create().texOffs(30, 32).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, 0.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone = bone28.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(8.0F, 0.0F, 17.0F));

		PartDefinition cube_r123 = bone.addOrReplaceChild("cube_r123",
				CubeListBuilder.create().texOffs(207, 222)
						.addBox(-2.0F, -2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 215)
						.addBox(-2.0F, -1.75F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 209)
						.addBox(-2.0F, -1.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238)
						.addBox(-2.5F, 1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, -1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233)
						.addBox(-2.0F, -3.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -13.0F, 12.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition bone29 = bone28.addOrReplaceChild("bone29", CubeListBuilder.create(),
				PartPose.offset(5.0F, 8.0F, -12.0F));

		PartDefinition cube_r124 = bone29.addOrReplaceChild("cube_r124",
				CubeListBuilder.create().texOffs(207, 222)
						.addBox(-2.0F, -2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 215)
						.addBox(-2.0F, -1.75F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 209)
						.addBox(-2.0F, -1.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238)
						.addBox(-2.5F, 1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, -1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233)
						.addBox(-2.0F, -4.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -13.0F, 12.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition bone30 = bone28.addOrReplaceChild("bone30", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.4805F, -5.625F, -7.1749F, -0.8091F, 0.2143F, -0.2194F));

		PartDefinition cube_r125 = bone30.addOrReplaceChild("cube_r125",
				CubeListBuilder.create().texOffs(207, 222)
						.addBox(-2.0F, -2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 215)
						.addBox(-2.0F, -1.75F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 209)
						.addBox(-2.0F, -1.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238)
						.addBox(-2.5F, 1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, -1.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233)
						.addBox(-2.0F, -3.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));

		PartDefinition flag2 = bone28.addOrReplaceChild("flag2",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3789F, -65.0F, 10.1616F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r126 = flag2.addOrReplaceChild("cube_r126",
				CubeListBuilder.create().texOffs(10, 0).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, 0.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r127 = flag2.addOrReplaceChild("cube_r127",
				CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, 0.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone19 = bone28.addOrReplaceChild("bone19", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-6.0F, -14.0F, 28.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition chestlid = bone19.addOrReplaceChild("chestlid", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 3.0F, -21.0375F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r128 = chestlid.addOrReplaceChild("cube_r128",
				CubeListBuilder.create().texOffs(154, 213).addBox(-4.0F, -25.8801F, -1.7618F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -4.1548F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r129 = chestlid.addOrReplaceChild("cube_r129",
				CubeListBuilder.create().texOffs(154, 213).addBox(-3.99F, 4.6253F, 20.6501F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r130 = chestlid.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(157, 209)
				.addBox(1.09F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(157, 209)
				.addBox(-4.11F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, -1.6548F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r131 = chestlid.addOrReplaceChild("cube_r131",
				CubeListBuilder.create().texOffs(172, 217).addBox(-4.0F, 21.5677F, 3.9022F, 8.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, -4.1548F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r132 = chestlid.addOrReplaceChild("cube_r132",
				CubeListBuilder.create().texOffs(174, 211).addBox(-4.01F, 13.2483F, 12.9228F, 8.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest = bone19.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(124, 207)
				.addBox(-4.0F, -13.0F, 30.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, -34.0F));

		PartDefinition bone31 = bone28.addOrReplaceChild("bone31", CubeListBuilder.create(),
				PartPose.offsetAndRotation(3.0F, -2.0F, 0.0F, -1.309F, -0.6545F, 0.0F));

		PartDefinition chestlid2 = bone31.addOrReplaceChild("chestlid2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.0F, -3.0F, -21.0375F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r133 = chestlid2.addOrReplaceChild("cube_r133",
				CubeListBuilder.create().texOffs(154, 213).addBox(-4.0F, -25.8801F, -1.7618F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -4.1548F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r134 = chestlid2.addOrReplaceChild("cube_r134",
				CubeListBuilder.create().texOffs(154, 213).addBox(-3.99F, 4.6253F, 20.6501F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r135 = chestlid2.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(157, 209)
				.addBox(1.09F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(157, 209)
				.addBox(-4.11F, 21.1913F, -4.6157F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, -1.6548F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r136 = chestlid2.addOrReplaceChild("cube_r136",
				CubeListBuilder.create().texOffs(172, 217).addBox(-4.0F, 21.5677F, 3.9022F, 8.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, -4.1548F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r137 = chestlid2.addOrReplaceChild("cube_r137",
				CubeListBuilder.create().texOffs(174, 211).addBox(-4.01F, 13.2483F, 12.9228F, 8.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest2 = bone31.addOrReplaceChild("chest2", CubeListBuilder.create().texOffs(124, 207)
				.addBox(-4.0F, -13.0F, 30.0F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 8.0F, -34.0F));

		PartDefinition mast2 = bone28.addOrReplaceChild("mast2", CubeListBuilder.create().texOffs(18, 16).addBox(-0.75F,
				-57.0F, -18.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -10.0F, 28.0F));

		PartDefinition bone6 = mast2.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(0.0F, -13.5F, -6.1569F));

		PartDefinition cube_r138 = bone6.addOrReplaceChild("cube_r138",
				CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone11 = bone6.addOrReplaceChild("bone11", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r139 = bone11.addOrReplaceChild(
				"cube_r139", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r140 = bone11.addOrReplaceChild(
				"cube_r140", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone12 = bone6.addOrReplaceChild("bone12", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r141 = bone12.addOrReplaceChild(
				"cube_r141", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r142 = bone12.addOrReplaceChild(
				"cube_r142", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone14 = bone12.addOrReplaceChild("bone14", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r143 = bone14.addOrReplaceChild(
				"cube_r143", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r144 = bone14.addOrReplaceChild(
				"cube_r144", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r145 = bone14
				.addOrReplaceChild("cube_r145",
						CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone20 = mast2.addOrReplaceChild("bone20", CubeListBuilder.create(),
				PartPose.offset(0.0F, -31.5F, -6.1569F));

		PartDefinition cube_r146 = bone20.addOrReplaceChild("cube_r146",
				CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r147 = bone21.addOrReplaceChild(
				"cube_r147", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r148 = bone21.addOrReplaceChild(
				"cube_r148", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone22 = bone20.addOrReplaceChild("bone22", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r149 = bone22.addOrReplaceChild(
				"cube_r149", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r150 = bone22.addOrReplaceChild(
				"cube_r150", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone23 = bone22.addOrReplaceChild("bone23", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r151 = bone23.addOrReplaceChild(
				"cube_r151", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r152 = bone23.addOrReplaceChild(
				"cube_r152", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r153 = bone23
				.addOrReplaceChild("cube_r153",
						CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone15 = mast2.addOrReplaceChild("bone15", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.5F, -6.1569F));

		PartDefinition cube_r154 = bone15.addOrReplaceChild("cube_r154",
				CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 22.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r155 = bone16.addOrReplaceChild(
				"cube_r155", CubeListBuilder.create().texOffs(16, 106).addBox(7.9853F, -21.5F, 7.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r156 = bone16.addOrReplaceChild(
				"cube_r156", CubeListBuilder.create().texOffs(29, 106).addBox(0.15F, -21.5F, -11.9375F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r157 = bone17.addOrReplaceChild(
				"cube_r157", CubeListBuilder.create().texOffs(8, 106).addBox(7.9853F, -21.5F, -9.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r158 = bone17.addOrReplaceChild(
				"cube_r158", CubeListBuilder.create().texOffs(12, 106).addBox(-11.85F, -21.5F, 0.0625F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r159 = bone18.addOrReplaceChild(
				"cube_r159", CubeListBuilder.create().texOffs(48, 0).addBox(-8.9853F, -21.5F, -9.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r160 = bone18.addOrReplaceChild(
				"cube_r160", CubeListBuilder.create().texOffs(0, 106).addBox(-12.3625F, -21.5F, -1.0625F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r161 = bone18
				.addOrReplaceChild("cube_r161",
						CubeListBuilder.create().texOffs(4, 106).addBox(0.15F, -21.5F, 12.0625F, 1.0F, 22.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition wheel = bone28.addOrReplaceChild("wheel", CubeListBuilder.create().texOffs(183, 222)
				.addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 12.25F));

		PartDefinition bone13 = bone28.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(120, 0)
						.addBox(-0.625F, -25.0F, 32.0F, 1.0F, 1.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(177, 169)
						.addBox(-13.0F, -59.0F, 30.0F, 26.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(178, 169)
						.addBox(-13.0F, -47.5F, 30.0F, 26.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -22.0F));

		PartDefinition cube_r162 = bone13.addOrReplaceChild("cube_r162",
				CubeListBuilder.create().texOffs(68, 64).addBox(-17.0F, -1.5F, -0.25F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.7375F, 30.25F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r163 = bone13.addOrReplaceChild("cube_r163",
				CubeListBuilder.create().texOffs(68, 58).addBox(-17.0F, -3.992F, 0.0261F, 34.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -25.9875F, 29.3625F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r164 = bone13.addOrReplaceChild("cube_r164",
				CubeListBuilder.create().texOffs(0, 58).addBox(-17.0F, -5.425F, -0.325F, 34.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -35.334F, 29.0363F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r165 = bone13.addOrReplaceChild("cube_r165",
				CubeListBuilder.create().texOffs(0, 66).addBox(-17.0F, -0.008F, 0.0261F, 34.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -41.825F, 29.3875F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r166 = bone13.addOrReplaceChild("cube_r166",
				CubeListBuilder.create().texOffs(68, 62).addBox(-17.0F, -0.5F, -0.25F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -43.075F, 30.275F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r167 = bone13.addOrReplaceChild("cube_r167",
				CubeListBuilder.create().texOffs(86, 232).addBox(-13.0F, -20.7822F, -2.2923F, 26.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 40.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r168 = bone13.addOrReplaceChild("cube_r168",
				CubeListBuilder.create().texOffs(86, 231).addBox(-13.0F, -21.4738F, -7.5942F, 26.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 40.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r169 = bone13.addOrReplaceChild("cube_r169",
				CubeListBuilder.create().texOffs(86, 227).addBox(-13.0F, 19.784F, -11.2137F, 26.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 40.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r170 = bone13.addOrReplaceChild("cube_r170",
				CubeListBuilder.create().texOffs(86, 225).addBox(-13.0F, -23.4762F, -15.1675F, 26.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 40.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r171 = bone13.addOrReplaceChild("cube_r171",
				CubeListBuilder.create().texOffs(86, 223).addBox(-13.0F, -20.7441F, -20.7238F, 26.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.0F, 40.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r172 = bone13.addOrReplaceChild("cube_r172",
				CubeListBuilder.create().texOffs(156, 56).addBox(-0.875F, -19.5F, -18.0F, 1.0F, 1.0F, 36.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -24.5F, 31.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r173 = bone13.addOrReplaceChild("cube_r173",
				CubeListBuilder.create().texOffs(156, 56).addBox(0.125F, -0.5F, -18.0F, 1.0F, 1.0F, 36.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -24.5F, 30.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r174 = bone13.addOrReplaceChild("cube_r174",
				CubeListBuilder.create().texOffs(156, 56).addBox(-0.875F, -21.5F, -11.0F, 1.0F, 1.0F, 36.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -24.5F, 7.0F, 0.0F, -1.5708F, -0.48F));

		PartDefinition cube_r175 = bone13.addOrReplaceChild("cube_r175",
				CubeListBuilder.create().texOffs(0, 200).addBox(0.0F, -1.0F, -0.5F, 0.0F, 18.0F, 22.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -61.0F, 30.0F, 2.618F, -0.7854F, 3.1416F));

		PartDefinition cube_r176 = bone13.addOrReplaceChild("cube_r176",
				CubeListBuilder.create().texOffs(52, 52).addBox(0.0F, -7.0F, -61.0F, 0.0F, 31.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -37.0F, -5.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone28.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}