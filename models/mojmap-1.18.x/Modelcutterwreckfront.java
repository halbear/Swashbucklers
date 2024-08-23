// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcutterwreckfront<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cutterwreckfront"), "main");
	private final ModelPart bone;

	public Modelcutterwreckfront(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(39, 169)
						.addBox(7.5F, -4.0F, -8.5F, 3.0F, 2.0F, 27.0F, new CubeDeformation(0.0F)).texOffs(84, 24)
						.addBox(-4.5F, 2.0F, -8.5F, 3.0F, 2.0F, 30.0F, new CubeDeformation(0.0F)).texOffs(127, 89)
						.addBox(-1.5F, 2.375F, -8.5F, 3.0F, 2.0F, 23.0F, new CubeDeformation(0.0F)).texOffs(84, 24)
						.mirror().addBox(1.5F, 2.0F, -8.5F, 3.0F, 2.0F, 30.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 21.0F, -3.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(194, 56).mirror()
						.addBox(5.7417F, 2.721F, -24.0F, 3.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(120, 114).mirror()
						.addBox(8.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0175F, 0.0F, -0.7854F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(120, 137).mirror()
				.addBox(7.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0175F, 0.0F, -1.309F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(120, 25).mirror()
				.addBox(11.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.413F, 0.1451F, -1.2522F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 33).mirror()
				.addBox(10.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.333F, 0.1111F, -1.0056F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(120, 48).mirror()
				.addBox(14.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.7905F, 0.2962F, -1.1949F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 161).mirror()
				.addBox(13.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.7109F, 0.2332F, -1.3086F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(120, 114).mirror()
						.addBox(8.4706F, 9.7197F, -26.1629F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.3079F, 0.1248F, -0.825F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(60, 0).mirror()
				.addBox(8.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.736F, 0.1159F, -0.8374F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(120, 122).mirror()
						.addBox(9.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.2148F, 0.2404F, -0.3057F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(60, 139).mirror()
				.addBox(9.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(30, 28).mirror()
				.addBox(11.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.59F, 0.2404F, -0.3057F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(101, 37).mirror()
				.addBox(4.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.5729F, 0.1323F, -0.0849F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(147, 25).mirror()
						.addBox(-1.75F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(1.74F, -2.0236F, -20.4552F, -0.581F, 0.2055F, -0.1332F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 131).mirror()
						.addBox(5.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.1683F, 0.1721F, -0.0291F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(63, 109).mirror()
						.addBox(4.3467F, 0.1647F, -24.0F, 3.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r16 = bone.addOrReplaceChild(
				"cube_r16", CubeListBuilder.create().texOffs(63, 109).addBox(-7.3467F, 0.1647F, -24.0F, 3.0F, 1.0F,
						20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(120, 122).addBox(-12.8111F, 4.0584F, -26.8471F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.2148F, -0.2404F, 0.3057F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(30, 28)
				.addBox(-12.3111F, 13.4715F, -33.3069F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(60, 139)
				.addBox(-11.8111F, 13.4715F, -27.3069F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.59F, -0.2404F, 0.3057F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(120, 114).addBox(-11.7417F, 2.956F, -23.9286F, 3.0F, 2.0F, 21.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0175F, 0.0F, 0.7854F));

		PartDefinition cube_r20 = bone.addOrReplaceChild(
				"cube_r20", CubeListBuilder.create().texOffs(194, 56).addBox(-8.7417F, 2.721F, -24.0F, 3.0F, 2.0F,
						15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(120, 114).addBox(-11.4706F, 9.7197F, -26.1629F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.3079F, -0.1248F, 0.825F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(60, 0).addBox(-11.1843F, 19.6318F, -26.6504F, 3.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.736F, -0.1159F, 0.8374F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(120, 33).addBox(-13.1199F, 11.6635F, -25.2737F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.333F, -0.1111F, 1.0056F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(120, 48).addBox(-17.1544F, 20.7548F, -18.1185F, 3.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.7905F, -0.2962F, 1.1949F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(120, 137).addBox(-10.8142F, 8.3026F, -23.8372F, 3.0F, 2.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0175F, 0.0F, 1.309F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(131, 60).addBox(-9.922F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.4363F, 0.0F, 1.5708F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(120, 25).addBox(-14.8312F, 15.3265F, -22.5162F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.413F, -0.1451F, 1.2522F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(85, 200).addBox(-9.922F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.7418F, 0.0F, 1.5708F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 161).addBox(-16.9526F, 20.6486F, -26.9831F, 3.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.7109F, -0.2332F, 1.3086F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(114, 246).mirror()
						.addBox(-0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.9628F, -7.422F, -8.0407F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(132, 238).mirror()
				.addBox(0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-9.5128F, -7.422F, -13.4907F, 0.0F, -0.7418F, 0.0F));

		PartDefinition cube_r32 = bone.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(132, 238).addBox(-0.0328F, -1.575F, -14.0002F, 0.0F, 4.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.5128F, -7.422F, -13.4907F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r33 = bone.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(114, 246).addBox(0.05F, -1.575F, -5.975F, 0.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.9628F, -7.422F, -8.0407F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r34 = bone.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(66, 40).addBox(7.422F, 19.3622F, -22.5162F, 2.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r35 = bone.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(157, 37).mirror()
				.addBox(-9.422F, 10.3831F, -24.014F, 2.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r36 = bone.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(157, 37).addBox(7.422F, 10.3831F, -24.014F, 2.0F, 2.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r37 = bone.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(53, 200).addBox(7.422F, 25.1896F, -28.4831F, 2.0F, 2.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.7418F, 0.0F, -1.5708F));

		PartDefinition cube_r38 = bone.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(60, 131).addBox(-1.5F, 2.3361F, -29.6709F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(0, 131).addBox(-8.5492F, 1.9611F, -28.5292F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.1683F, -0.1721F, 0.0291F));

		PartDefinition cube_r40 = bone.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(147, 25).addBox(-0.25F, -1.0F, -5.5F, 2.0F, 2.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.74F, -2.0236F, -20.4552F, -0.581F, -0.2055F, 0.1332F));

		PartDefinition cube_r41 = bone.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(101, 37).addBox(-7.4686F, 13.2385F, -27.8754F, 3.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.5729F, -0.1323F, 0.0849F));

		PartDefinition cube_r42 = bone.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(67, 223)
				.addBox(-1.0F, 11.6135F, -53.7362F, 2.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(41, 222)
				.addBox(-1.5F, 12.6135F, -44.7362F, 3.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r43 = bone.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(200, 93)
				.addBox(-1.5F, -8.2346F, -23.8801F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(36, 175)
				.addBox(-4.5F, -8.1822F, -23.8806F, 3.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r44 = bone.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(179, 93).addBox(-1.5F, -6.2918F, -38.688F, 3.0F, 2.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r45 = bone.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(146, 12).addBox(-3.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0695F, -0.0061F, -0.0871F));

		PartDefinition cube_r46 = bone.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(60, 25).addBox(-7.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0697F, -0.003F, -0.0435F));

		PartDefinition cube_r47 = bone.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(146, 0).addBox(0.9952F, -6.6448F, -34.188F, 3.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0695F, 0.0061F, 0.0871F));

		PartDefinition cube_r48 = bone.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(60, 10).addBox(4.2474F, -6.2863F, -31.188F, 3.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0697F, 0.003F, 0.0435F));

		PartDefinition cube_r49 = bone.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(89, 9).addBox(-19.7634F, -6.5126F, -25.1741F, 3.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.077F, -0.4382F, -0.011F));

		PartDefinition cube_r50 = bone.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(144, 137).addBox(-28.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.1034F, -0.8294F, 0.0326F));

		PartDefinition cube_r51 = bone.addOrReplaceChild("cube_r51",
				CubeListBuilder.create().texOffs(84, 131).addBox(25.0523F, -6.6626F, -26.9105F, 3.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.1034F, 0.8294F, -0.0326F));

		PartDefinition cube_r52 = bone.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(89, 0).addBox(16.7634F, -6.8126F, -25.1741F, 3.0F, 2.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.077F, 0.4382F, 0.011F));

		PartDefinition cube_r53 = bone.addOrReplaceChild(
				"cube_r53", CubeListBuilder.create().texOffs(135, 174).addBox(-10.7301F, -7.6818F, -24.0F, 3.0F, 2.0F,
						24.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0F, 0.0F, 0.0349F));

		PartDefinition cube_r54 = bone.addOrReplaceChild(
				"cube_r54", CubeListBuilder.create().texOffs(36, 161).addBox(4.5F, -8.4147F, -23.7571F, 3.0F, 2.0F,
						12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r55 = bone.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(14, 171).addBox(1.2626F, -7.9425F, -24.1182F, 3.0F, 2.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r56 = bone.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(129, 171).addBox(-7.5F, -7.8419F, -24.1164F, 3.0F, 2.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r57 = bone.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(198, 171).mirror()
						.addBox(7.8142F, 7.9558F, -6.0964F, 3.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 4.0F, 15.5F, 0.0105F, 0.0F, -1.309F));

		PartDefinition cube_r58 = bone.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(238, 123).addBox(0.3098F, -14.1271F, -4.9048F, 0.0F, 14.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.688F, -8.7857F, -1.2702F, -0.0118F, 0.0129F, 0.4799F));

		PartDefinition cube_r59 = bone.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(238, 123).mirror()
				.addBox(-0.3098F, -14.1271F, -4.9048F, 0.0F, 14.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.688F, -8.7857F, -1.2702F, -0.0118F, -0.0129F, -0.4799F));

		PartDefinition mast = bone.addOrReplaceChild("mast", CubeListBuilder.create().texOffs(18, 16).addBox(-0.75F,
				-37.0F, -18.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 17.0F));

		PartDefinition bone2 = mast.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -13.5F, -6.1569F));

		PartDefinition cube_r60 = bone2.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(163, 114).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r61 = bone3.addOrReplaceChild(
				"cube_r61", CubeListBuilder.create().texOffs(155, 114).addBox(7.9853F, -19.5F, 7.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r62 = bone3.addOrReplaceChild(
				"cube_r62", CubeListBuilder.create().texOffs(159, 114).addBox(0.15F, -19.5F, -11.9375F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r63 = bone4.addOrReplaceChild(
				"cube_r63", CubeListBuilder.create().texOffs(147, 114).addBox(7.9853F, -19.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r64 = bone4.addOrReplaceChild(
				"cube_r64", CubeListBuilder.create().texOffs(151, 114).addBox(-11.85F, -19.5F, 0.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r65 = bone5.addOrReplaceChild(
				"cube_r65", CubeListBuilder.create().texOffs(76, 106).addBox(-8.9853F, -19.5F, -9.4853F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r66 = bone5.addOrReplaceChild(
				"cube_r66", CubeListBuilder.create().texOffs(109, 0).addBox(-12.3625F, -19.5F, -1.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r67 = bone5
				.addOrReplaceChild("cube_r67",
						CubeListBuilder.create().texOffs(138, 0).addBox(0.15F, -19.5F, 12.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone7 = mast.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 4.5F, -6.1569F));

		PartDefinition cube_r68 = bone7.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(33, 106).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 22.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -12.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r69 = bone8.addOrReplaceChild(
				"cube_r69", CubeListBuilder.create().texOffs(16, 106).addBox(7.9853F, -19.5F, 7.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r70 = bone8.addOrReplaceChild(
				"cube_r70", CubeListBuilder.create().texOffs(29, 106).addBox(0.15F, -19.5F, -11.9375F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r71 = bone9.addOrReplaceChild(
				"cube_r71", CubeListBuilder.create().texOffs(8, 106).addBox(7.9853F, -19.5F, -9.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r72 = bone9.addOrReplaceChild(
				"cube_r72", CubeListBuilder.create().texOffs(12, 106).addBox(-11.85F, -19.5F, 0.0625F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r73 = bone10.addOrReplaceChild(
				"cube_r73", CubeListBuilder.create().texOffs(48, 0).addBox(-8.9853F, -19.5F, -9.4853F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r74 = bone10.addOrReplaceChild(
				"cube_r74", CubeListBuilder.create().texOffs(0, 106).addBox(-12.3625F, -19.5F, -1.0625F, 1.0F, 22.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r75 = bone10
				.addOrReplaceChild("cube_r75",
						CubeListBuilder.create().texOffs(4, 106).addBox(0.15F, -19.5F, 12.0625F, 1.0F, 22.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone22 = bone.addOrReplaceChild("bone22", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5195F, -12.625F, -9.1749F, 1.4477F, 0.7816F, 1.4839F));

		PartDefinition cube_r76 = bone22.addOrReplaceChild("cube_r76",
				CubeListBuilder.create().texOffs(207, 222)
						.addBox(-2.0F, 2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 215)
						.addBox(-2.0F, 2.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(207, 209)
						.addBox(-2.0F, 2.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238)
						.addBox(-2.5F, 5.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 2.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233)
						.addBox(-2.0F, 1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, 0.625F, 2.1749F, 0.0F, 0.6981F, 0.0F));

		PartDefinition bone21 = bone.addOrReplaceChild("bone21", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.5195F, -8.625F, -13.1749F, -0.7418F, 0.3927F, 0.0F));

		PartDefinition cube_r77 = bone21.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(218, 232)
						.addBox(-2.0F, 2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 232)
						.addBox(-2.0F, 2.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 232)
						.addBox(-2.0F, 2.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238)
						.addBox(-2.5F, 5.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 2.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233)
						.addBox(-2.0F, 1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, -3.375F, 2.1749F, 0.0F, 0.6981F, 0.0F));

		PartDefinition bone20 = bone.addOrReplaceChild("bone20", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.5195F, -2.625F, 10.8251F, 1.0036F, -0.2618F, 0.0F));

		PartDefinition cube_r78 = bone20.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(218, 226)
						.addBox(-2.0F, 2.0F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(218, 220)
						.addBox(-2.0F, 2.25F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(218, 214)
						.addBox(-2.0F, 2.5F, -5.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(176, 238)
						.addBox(-2.5F, 5.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(176, 230)
						.addBox(-2.5F, 2.5F, -5.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(204, 233)
						.addBox(-2.0F, 1.0F, -5.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5195F, -3.375F, 2.1749F, 0.0F, 0.6981F, 0.0F));

		PartDefinition flag = bone.addOrReplaceChild("flag",
				CubeListBuilder.create().texOffs(34, 32)
						.addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.3789F, -42.0F, -0.8384F));

		PartDefinition cube_r79 = flag.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(4, 31).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, 0.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r80 = flag.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(30, 32).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, 0.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone13 = bone.addOrReplaceChild("bone13", CubeListBuilder.create(),
				PartPose.offset(0.0F, 3.0F, -9.0F));

		PartDefinition cube_r81 = bone13.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(68, 64).addBox(-17.0F, -1.5F, 0.25F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -22.7375F, 7.75F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r82 = bone13.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(68, 58).addBox(-17.0F, -3.992F, -0.0261F, 34.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.9875F, 8.6375F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bone13.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(0, 58).addBox(-17.0F, -5.425F, 0.325F, 34.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -33.334F, 8.9637F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r84 = bone13.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(0, 66).addBox(-17.0F, -0.008F, -0.0261F, 34.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -39.825F, 8.6125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r85 = bone13.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(68, 62).addBox(-17.0F, -0.5F, 0.25F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -41.075F, 7.725F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bone13.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(156, 56).addBox(0.125F, -0.5F, -18.0F, 1.0F, 1.0F, 36.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.125F, -22.5F, 7.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r87 = bone13.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(105, 183).addBox(0.0F, -7.0F, -21.0F, 0.0F, 31.0F, 35.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -35.0F, -5.0F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}