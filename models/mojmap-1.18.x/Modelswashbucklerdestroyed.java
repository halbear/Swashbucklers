// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelswashbucklerdestroyed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "swashbucklerdestroyed"), "main");
	private final ModelPart bone;

	public Modelswashbucklerdestroyed(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(7.5305F, 19.5893F, -0.5F));

		PartDefinition bone8 = bone.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(80, 38)
						.addBox(3.0F, 0.0F, -1.0F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(22, 23)
						.addBox(-3.0F, 4.0F, 5.0F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(18, 92)
						.addBox(-1.0F, 4.25F, 1.0F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(16, 17)
						.mirror().addBox(1.0F, 4.0F, -1.0F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(40, 9).addBox(-3.0F, 2.0F, 19.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(80, 59).addBox(-7.0F, -1.2625F, 19.0375F, 14.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(40, 13).addBox(-0.7375F, -2.175F, 18.325F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(40, 27).addBox(-4.2625F, -2.1125F, 18.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
						.texOffs(20, 29).addBox(-1.225F, 0.775F, 19.2125F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(0, 31).addBox(-3.8875F, -0.75F, 19.2875F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(40, 6).addBox(-4.8875F, 1.65F, 19.2875F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5305F, -0.5893F, 6.5F, -0.2876F, -0.3232F, -0.0236F));

		PartDefinition cube_r1 = bone8.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(116, 65).mirror()
						.addBox(3.8278F, 2.7979F, 8.8443F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0524F, 0.0F, -0.7854F));

		PartDefinition cube_r2 = bone8.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(40, 38)
				.addBox(-7.2256F, -7.8779F, 19.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
				.addBox(-6.5992F, -7.2446F, 20.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 19).mirror()
				.addBox(2.8978F, -0.2235F, 2.0F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r3 = bone8.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(40, 33)
						.addBox(2.2256F, -7.9779F, 19.2125F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 3)
						.addBox(4.5992F, -7.2446F, 20.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(-4.8978F, -0.2235F, -2.0F, 2.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r4 = bone8
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(9, 8).addBox(-4.8612F, -2.0979F, 20.0F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r5 = bone8.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(59, 27)
						.addBox(-7.8415F, 0.0636F, 20.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 90)
						.addBox(-7.8278F, 2.1473F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r6 = bone8.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 8).addBox(2.8612F, -2.0979F, 20.0F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r7 = bone8.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(25, 59)
				.addBox(3.8415F, 0.0636F, 20.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 90).mirror()
				.addBox(5.8278F, 2.1473F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r8 = bone8
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(21, 135).addBox(-5.5854F, -7.6625F, 17.0F, 9.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r9 = bone8.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(1, 118).addBox(14.0094F, -5.9833F, 8.1783F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, -0.6981F, -0.0436F));

		PartDefinition cube_r10 = bone8.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(1, 118).addBox(-6.8878F, -5.9833F, 17.0363F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.6109F, -0.0436F));

		PartDefinition cube_r11 = bone8.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 118).addBox(5.4733F, -6.0333F, 15.25F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r12 = bone8.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(40, 17).addBox(-7.2095F, 5.5546F, 5.1158F, 2.0F, 1.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.0192F, 0.0F, 1.309F));

		PartDefinition cube_r13 = bone8.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(121, 113).addBox(-7.8278F, 2.3631F, -2.1221F, 2.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0436F, 0.0F, 0.7854F));

		PartDefinition cube_r14 = bone8.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(116, 65).addBox(-5.8278F, 2.7979F, 8.8443F, 2.0F, 1.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0524F, 0.0F, 0.7854F));

		PartDefinition cube_r15 = bone8.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(104, 23).addBox(-6.7563F, -5.0257F, 0.1629F, 2.0F, 1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0349F, 0.0F, -0.0524F));

		PartDefinition cube_r16 = bone8
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(84, 113).addBox(-3.0F, -5.0F, 2.0F, 2.0F, 1.0F, 18.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, 0.0175F));

		PartDefinition cube_r17 = bone8.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(80, 0).addBox(-1.2355F, -5.1153F, -2.0795F, 2.0F, 1.0F, 22.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.0175F, 0.0F, 0.0524F));

		PartDefinition cube_r18 = bone8.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 37)
						.addBox(-5.0F, -4.6483F, 4.151F, 2.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(22, 112)
						.addBox(5.0F, -4.6832F, 2.1516F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r19 = bone8.addOrReplaceChild(
				"cube_r19", CubeListBuilder.create().texOffs(97, 95).addBox(-6.2813F, 7.2554F, 2.9907F, 1.0F, 1.0F,
						17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r20 = bone8.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(97, 95).mirror()
						.addBox(5.2813F, 7.2554F, 2.9907F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r21 = bone8.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(40, 0).addBox(1.0F, -5.1738F, 3.9199F, 2.0F, 1.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r22 = bone8.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(80, 0).mirror()
						.addBox(5.2095F, 5.6372F, -4.0642F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0105F, 0.0F, -1.309F));

		PartDefinition cube_r23 = bone8.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(121, 113).mirror()
						.addBox(5.8278F, 2.3631F, -2.1221F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, 0.0436F, 0.0F, -0.7854F));

		PartDefinition cube_r24 = bone8.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(40, 38).mirror()
						.addBox(3.8278F, 2.1341F, -5.977F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.0087F, 0.0F, -0.7854F));

		PartDefinition cube_r25 = bone8.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(40, 17).mirror()
						.addBox(5.2095F, 5.5546F, 5.1158F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 5.0F, -1.0F, -0.0192F, 0.0F, -1.309F));

		PartDefinition water = bone8.addOrReplaceChild("water",
				CubeListBuilder.create().texOffs(139, 3)
						.addBox(-1.5F, 0.0F, -1.5F, 3.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(109, 5)
						.addBox(-1.5F, -1.0F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, -2.0F, 16.5F));

		PartDefinition cube_r26 = water.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(6, 26).addBox(-5.5F, 10.6294F, 11.4044F, 3.0F, 0.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 7.0F, -17.5F, 1.0908F, 0.0F, 0.0F));

		PartDefinition bone9 = bone.addOrReplaceChild("bone9", CubeListBuilder.create().texOffs(18, 92)
				.addBox(-1.0F, -0.75F, -16.0F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(19, 19).mirror()
				.addBox(1.0F, -1.0F, -16.0F, 2.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(14, 14)
				.addBox(-3.0F, -1.0F, -16.0F, 2.0F, 1.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(0, 111)
				.addBox(5.0F, -5.0F, -16.0F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5305F, 5.4107F, -2.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bone9.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 74)
				.addBox(-1.0F, -5.1564F, -15.9201F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(44, 113)
				.addBox(-3.0F, -5.1215F, -15.9204F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r28 = bone9.addOrReplaceChild(
				"cube_r28", CubeListBuilder.create().texOffs(116, 89).addBox(-1.0F, -3.8612F, -25.792F, 2.0F, 1.0F,
						10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r29 = bone9.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(18, 102).addBox(-2.6635F, -4.0965F, -22.792F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0695F, -0.0061F, -0.0871F));

		PartDefinition cube_r30 = bone9.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(0, 37).addBox(-4.8316F, -3.8576F, -20.792F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0697F, -0.003F, -0.0435F));

		PartDefinition cube_r31 = bone9.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 102).addBox(0.6635F, -4.0965F, -22.792F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0695F, 0.0061F, 0.0871F));

		PartDefinition cube_r32 = bone9.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(20, 17).addBox(2.8316F, -3.8576F, -20.792F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0697F, 0.003F, 0.0435F));

		PartDefinition cube_r33 = bone9.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(0, 25).addBox(-13.1756F, -4.0084F, -16.7827F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.077F, -0.4382F, -0.011F));

		PartDefinition cube_r34 = bone9.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(56, 93).addBox(-18.7015F, -4.1084F, -17.9403F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1034F, -0.8294F, 0.0326F));

		PartDefinition cube_r35 = bone9.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(16, 92).addBox(16.7015F, -4.1084F, -17.9403F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1034F, 0.8294F, -0.0326F));

		PartDefinition cube_r36 = bone9.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(20, 23).addBox(11.1756F, -4.2084F, -16.7827F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.077F, 0.4382F, 0.011F));

		PartDefinition cube_r37 = bone9.addOrReplaceChild(
				"cube_r37", CubeListBuilder.create().texOffs(0, 17).addBox(-7.1534F, -4.7879F, -16.0F, 2.0F, 1.0F,
						16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0349F));

		PartDefinition cube_r38 = bone9
				.addOrReplaceChild("cube_r38",
						CubeListBuilder.create().texOffs(0, 0).addBox(3.0F, -5.2765F, -15.8381F, 2.0F, 1.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r39 = bone9.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(106, 0).addBox(0.8417F, -4.9616F, -16.0788F, 2.0F, 1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, 0.0349F));

		PartDefinition cube_r40 = bone9.addOrReplaceChild(
				"cube_r40", CubeListBuilder.create().texOffs(104, 44).addBox(-5.0F, -4.8946F, -16.0776F, 2.0F, 1.0F,
						20.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r41 = bone9.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(80, 0).addBox(-7.2095F, 5.6372F, -4.0642F, 2.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0105F, 0.0F, 1.309F));

		PartDefinition cube_r42 = bone9.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(104, 44).addBox(-11.3017F, 14.0991F, -17.9888F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7109F, -0.2332F, 1.3086F));

		PartDefinition cube_r43 = bone9.addOrReplaceChild("cube_r43",
				CubeListBuilder.create().texOffs(80, 48).addBox(-6.2813F, 17.1264F, -18.9888F, 1.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, 1.5708F));

		PartDefinition cube_r44 = bone9.addOrReplaceChild("cube_r44",
				CubeListBuilder.create().texOffs(0, 48).addBox(-9.8875F, 10.551F, -15.0108F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.413F, -0.1451F, 1.2522F));

		PartDefinition cube_r45 = bone9.addOrReplaceChild("cube_r45",
				CubeListBuilder.create().texOffs(59, 22).addBox(-6.2813F, 13.2415F, -15.0108F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 1.5708F));

		PartDefinition cube_r46 = bone9.addOrReplaceChild("cube_r46",
				CubeListBuilder.create().texOffs(0, 89).addBox(-7.2095F, 5.8684F, -15.8915F, 2.0F, 1.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, 1.309F));

		PartDefinition cube_r47 = bone9.addOrReplaceChild("cube_r47",
				CubeListBuilder.create().texOffs(59, 38).addBox(-11.4363F, 14.1699F, -12.079F, 2.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7905F, -0.2962F, 1.1949F));

		PartDefinition cube_r48 = bone9.addOrReplaceChild("cube_r48",
				CubeListBuilder.create().texOffs(20, 48).addBox(-8.7466F, 8.109F, -16.8491F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.333F, -0.1111F, 1.0056F));

		PartDefinition cube_r49 = bone9.addOrReplaceChild("cube_r49",
				CubeListBuilder.create().texOffs(40, 0).addBox(-7.4562F, 13.4212F, -17.7669F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.736F, -0.1159F, 0.8374F));

		PartDefinition cube_r50 = bone9.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(0, 54).addBox(-7.6471F, 6.8132F, -17.442F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3079F, -0.1248F, 0.825F));

		PartDefinition cube_r51 = bone9.addOrReplaceChild(
				"cube_r51", CubeListBuilder.create().texOffs(116, 100).addBox(-5.8278F, 2.1473F, -16.0F, 2.0F, 1.0F,
						10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r52 = bone9.addOrReplaceChild("cube_r52",
				CubeListBuilder.create().texOffs(40, 38).addBox(-5.8278F, 2.1341F, -5.977F, 2.0F, 1.0F, 15.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0087F, 0.0F, 0.7854F));

		PartDefinition cube_r53 = bone9.addOrReplaceChild("cube_r53",
				CubeListBuilder.create().texOffs(40, 75).addBox(-7.8278F, 2.304F, -15.9524F, 2.0F, 1.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, 0.7854F));

		PartDefinition cube_r54 = bone9.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(28, 43)
				.addBox(-7.5407F, 9.3144F, -18.2046F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
				.addBox(-8.5407F, 9.3144F, -22.2046F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.59F, -0.2404F, 0.3057F));

		PartDefinition cube_r55 = bone9.addOrReplaceChild("cube_r55",
				CubeListBuilder.create().texOffs(19, 54).addBox(-8.5407F, 3.0389F, -17.8981F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2148F, -0.2404F, 0.3057F));

		PartDefinition cube_r56 = bone9.addOrReplaceChild("cube_r56",
				CubeListBuilder.create().texOffs(18, 19).mirror()
						.addBox(2.8978F, -0.2235F, -16.0F, 2.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r57 = bone9.addOrReplaceChild("cube_r57",
				CubeListBuilder.create().texOffs(0, 59).mirror()
						.addBox(3.6995F, 1.6408F, -19.0195F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1683F, 0.1721F, -0.0291F));

		PartDefinition cube_r58 = bone9.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(0, 59).addBox(-5.6995F, 1.6408F, -19.0195F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1683F, -0.1721F, 0.0291F));

		PartDefinition cube_r59 = bone9
				.addOrReplaceChild("cube_r59",
						CubeListBuilder.create().texOffs(59, 17).addBox(-1.0F, 1.8908F, -19.7806F, 2.0F, 1.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r60 = bone9.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(104, 44).mirror()
				.addBox(9.3017F, 14.0991F, -17.9888F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7109F, 0.2332F, -1.3086F));

		PartDefinition cube_r61 = bone9.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(80, 48).mirror()
				.addBox(5.2813F, 17.1264F, -18.9888F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7418F, 0.0F, -1.5708F));

		PartDefinition cube_r62 = bone9.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(0, 48).mirror()
						.addBox(7.8875F, 10.551F, -15.0108F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.413F, 0.1451F, -1.2522F));

		PartDefinition cube_r63 = bone9.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(59, 22).mirror()
				.addBox(5.2813F, 13.2415F, -15.0108F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r64 = bone9.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(0, 89).mirror()
				.addBox(5.2095F, 5.8684F, -15.8915F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, -1.309F));

		PartDefinition cube_r65 = bone9.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(59, 38).mirror()
						.addBox(9.4363F, 14.1699F, -12.079F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7905F, 0.2962F, -1.1949F));

		PartDefinition cube_r66 = bone9.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(20, 48).mirror()
						.addBox(6.7466F, 8.109F, -16.8491F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.333F, 0.1111F, -1.0056F));

		PartDefinition cube_r67 = bone9.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(40, 0).mirror()
				.addBox(5.4562F, 13.4212F, -17.7669F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.736F, 0.1159F, -0.8374F));

		PartDefinition cube_r68 = bone9.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(0, 54).mirror()
						.addBox(5.6471F, 6.8132F, -17.442F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3079F, 0.1248F, -0.825F));

		PartDefinition cube_r69 = bone9.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(116, 100).mirror()
						.addBox(3.8278F, 2.1473F, -16.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r70 = bone9.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(40, 75).mirror()
						.addBox(5.8278F, 2.304F, -15.9524F, 2.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0175F, 0.0F, -0.7854F));

		PartDefinition cube_r71 = bone9.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(28, 43).mirror()
						.addBox(6.5407F, 9.3144F, -18.2046F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(0, 17).mirror()
						.addBox(7.5407F, 9.3144F, -22.2046F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.59F, 0.2404F, -0.3057F));

		PartDefinition cube_r72 = bone9.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(19, 54).mirror()
						.addBox(6.5407F, 3.0389F, -17.8981F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2148F, 0.2404F, -0.3057F));

		PartDefinition cube_r73 = bone9.addOrReplaceChild(
				"cube_r73", CubeListBuilder.create().texOffs(97, 95).addBox(-6.2813F, 7.2554F, -16.0093F, 1.0F, 1.0F,
						17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r74 = bone9.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(97, 95).mirror()
				.addBox(5.2813F, 7.2554F, -16.0093F, 1.0F, 1.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r75 = bone9.addOrReplaceChild(
				"cube_r75", CubeListBuilder.create().texOffs(23, 23).addBox(-4.8978F, -0.2235F, -15.0F, 2.0F, 1.0F,
						13.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone6 = bone9.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.35F, -29.925F));

		PartDefinition cube_r76 = bone6.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(20, 8)
				.addBox(-4.9791F, 9.159F, -25.5836F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 48)
				.addBox(-4.9791F, 9.159F, -18.5836F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.35F, 29.925F, -0.5729F, -0.1323F, 0.0849F));

		PartDefinition cube_r77 = bone6.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(28, 48).mirror()
						.addBox(2.9791F, 9.159F, -18.5836F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -1.35F, 29.925F, -0.5729F, 0.1323F, -0.0849F));

		PartDefinition cube_r78 = bone6.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(107, 114).addBox(-1.0F, 8.409F, -27.1575F, 2.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.35F, 29.925F, -0.5672F, 0.0F, 0.0F));

		PartDefinition bone7 = bone9.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(12, 19)
						.addBox(-0.5F, -6.5F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 17)
						.addBox(-1.0F, -7.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -5.0F, 0.0F, 0.0F, 1.0908F));

		PartDefinition wheel = bone7.addOrReplaceChild("wheel",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 1.25F, -0.1188F, 0.0552F, 0.4331F));

		PartDefinition mast = bone9.addOrReplaceChild("mast",
				CubeListBuilder.create().texOffs(80, 65)
						.addBox(-11.0F, -11.5F, -2.0F, 22.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 67)
						.addBox(-11.0F, -23.0F, -2.0F, 22.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 19)
						.addBox(-0.75F, -29.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0F, -8.0F, 0.0F, 0.0F, -1.2217F));

		PartDefinition cube_r79 = mast.addOrReplaceChild(
				"cube_r79", CubeListBuilder.create().texOffs(80, 33).addBox(-11.0F, -20.7441F, -20.7238F, 22.0F, 2.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 8.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r80 = mast.addOrReplaceChild(
				"cube_r80", CubeListBuilder.create().texOffs(80, 31).addBox(-11.0F, -23.4762F, -15.1675F, 22.0F, 2.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 8.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r81 = mast.addOrReplaceChild(
				"cube_r81", CubeListBuilder.create().texOffs(80, 23).addBox(-11.0F, 19.784F, -11.2137F, 22.0F, 4.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 8.0F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r82 = mast.addOrReplaceChild(
				"cube_r82", CubeListBuilder.create().texOffs(80, 27).addBox(-11.0F, -20.7822F, -2.2923F, 22.0F, 2.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 8.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r83 = mast.addOrReplaceChild(
				"cube_r83", CubeListBuilder.create().texOffs(80, 29).addBox(-11.0F, -21.4738F, -7.5942F, 22.0F, 2.0F,
						0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 8.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone2 = mast.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -10.5F, -10.1569F));

		PartDefinition cube_r84 = bone2.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(16, 130).addBox(-6.2678F, -30.0F, 4.7678F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.5F, 18.1569F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r85 = bone3.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(8, 130).addBox(-20.2066F, -32.0F, 4.9711F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2875F, 17.5F, 18.1569F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r86 = bone3.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(12, 130).addBox(17.8069F, -32.0F, 9.775F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2875F, 17.5F, 18.1569F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r87 = bone4.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(0, 130).addBox(-20.4011F, -32.0F, 19.3077F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2875F, 17.5F, 18.4319F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r88 = bone4.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(4, 130).addBox(28.0819F, -32.0F, -0.225F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2875F, 17.5F, 18.4319F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r89 = bone5.addOrReplaceChild("cube_r89",
				CubeListBuilder.create().texOffs(32, 74).addBox(-6.0556F, -32.0F, 19.5109F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.575F, 17.5F, 18.4319F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r90 = bone5.addOrReplaceChild("cube_r90",
				CubeListBuilder.create().texOffs(72, 75).addBox(10.2125F, -32.0F, 17.3694F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.575F, 17.5F, 18.4319F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r91 = bone5.addOrReplaceChild("cube_r91",
				CubeListBuilder.create().texOffs(110, 75).addBox(18.0819F, -32.0F, -10.5125F, 1.0F, 25.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.575F, 17.5F, 18.4319F, 0.0F, 1.5708F, 0.0F));

		PartDefinition flag = mast.addOrReplaceChild("flag",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 15)
						.addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3789F, -27.0F, 0.1616F, 0.0F, -1.4399F, 0.0F));

		PartDefinition cube_r92 = flag.addOrReplaceChild("cube_r92",
				CubeListBuilder.create().texOffs(9, 10).addBox(0.2563F, -33.5F, -3.9151F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3789F, 32.0F, 7.8384F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r93 = flag.addOrReplaceChild("cube_r93",
				CubeListBuilder.create().texOffs(0, 15).addBox(-1.7297F, -33.5F, -5.4894F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3789F, 32.0F, 7.8384F, 0.0F, -0.2618F, 0.0F));

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