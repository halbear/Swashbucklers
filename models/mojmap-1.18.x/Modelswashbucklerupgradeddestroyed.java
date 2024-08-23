// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelswashbucklerupgradeddestroyed<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "swashbucklerupgradeddestroyed"), "main");
	private final ModelPart bone;
	private final ModelPart wheel;
	private final ModelPart cannon;
	private final ModelPart chest;
	private final ModelPart mast;
	private final ModelPart bone11;
	private final ModelPart bb_main;

	public Modelswashbucklerupgradeddestroyed(ModelPart root) {
		this.bone = root.getChild("bone");
		this.wheel = root.getChild("wheel");
		this.cannon = root.getChild("cannon");
		this.chest = root.getChild("chest");
		this.mast = root.getChild("mast");
		this.bone11 = root.getChild("bone11");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 74)
				.addBox(-8.5305F, 1.6607F, -26.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(40, 1)
				.addBox(-10.5305F, 1.4107F, -26.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).texOffs(40, 1)
				.mirror().addBox(-6.5305F, 1.4107F, -26.5F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(7.5305F, 19.5893F, -0.5F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 59).mirror()
						.addBox(-2.0F, -0.1699F, -3.9726F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5305F, 1.5875F, -26.39F, -0.1683F, 0.1721F, -0.0291F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 59).addBox(0.0F, -0.1699F, -3.9726F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5305F, 1.5875F, -26.39F, -0.1683F, -0.1721F, 0.0291F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(59, 17).addBox(-1.0F, -0.75F, -4.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.5305F, 2.4107F, -26.5F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(104, 44).mirror()
						.addBox(-0.75F, -1.0F, -3.5F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.3234F, -1.8706F, -33.0905F, -0.7109F, 0.2332F, -1.3086F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(80, 48).mirror()
				.addBox(-0.1294F, -1.1304F, -8.8794F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.9F, -3.0F, -30.2875F, -0.7418F, 0.0F, -1.5708F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(78, 76).mirror()
				.addBox(-0.1294F, -1.0251F, -0.0093F, 1.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.75F, -3.0F, -26.5F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 48).mirror()
						.addBox(-0.75F, -0.6625F, -2.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8017F, -1.8706F, -27.9935F, -0.413F, 0.1451F, -1.2522F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(59, 22).mirror()
				.addBox(-0.1294F, -1.0251F, -4.0093F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.75F, -3.0F, -26.5F, -0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 89).mirror()
				.addBox(-1.1294F, -1.0251F, -0.0093F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.5F, -2.0F, -26.5F, -0.0175F, 0.0F, -1.309F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(59, 38).mirror()
				.addBox(-0.1946F, -1.0851F, -2.6872F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2448F, 0.0689F, -30.0F, -0.7905F, 0.2962F, -1.1949F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(20, 48).mirror()
						.addBox(0.0808F, -0.995F, -3.75F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2448F, 0.5689F, -26.5F, -0.333F, 0.1111F, -1.0056F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 54).mirror()
						.addBox(-1.9192F, -0.995F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.2448F, 0.5689F, -26.5F, -0.3079F, 0.1248F, -0.825F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(116, 100).mirror()
						.addBox(-0.0613F, -1.0347F, -16.0F, 2.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(40, 90).mirror()
						.addBox(1.9387F, -1.0347F, 8.0F, 2.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.5305F, 1.9107F, -10.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(116, 65).mirror()
						.addBox(-1.0F, -0.5F, -3.5F, 2.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.2448F, 0.8689F, 2.0F, 0.0524F, 0.0F, -0.7854F));

		PartDefinition cube_r15 = bone.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(28, 43).mirror()
				.addBox(-1.7346F, -0.9168F, -3.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0065F, 1.3564F, -30.25F, -0.59F, 0.2404F, -0.3057F));

		PartDefinition cube_r16 = bone.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(19, 54).mirror()
						.addBox(-1.9659F, -0.7588F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-2.694F, 1.6689F, -26.5F, -0.2148F, 0.2404F, -0.3057F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(0.0F, -1.0F, -16.0F, 2.0F, 1.0F, 36.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.5305F, 2.4107F, -10.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(40, 17).mirror()
						.addBox(-1.0F, -0.375F, -5.5F, 2.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.0192F, 0.0F, -1.309F));

		PartDefinition cube_r19 = bone.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(80, 0).addBox(-1.0F, -0.5F, -4.5F, 2.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.061F, -2.0F, -10.0F, 0.0105F, 0.0F, 1.309F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(80, 48).addBox(-0.8706F, -1.1304F, -8.8794F, 1.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.161F, -3.0F, -30.2875F, -0.7418F, 0.0F, 1.5708F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(78, 76).addBox(-0.8706F, -1.0251F, -0.0093F, 1.0F, 1.0F, 36.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.811F, -3.0F, -26.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 48).addBox(-1.25F, -0.6625F, -2.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2593F, -1.8706F, -27.9935F, -0.413F, -0.1451F, 1.2522F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(59, 22).addBox(-0.8706F, -1.0251F, -4.0093F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.811F, -3.0F, -26.5F, -0.4363F, 0.0F, 1.5708F));

		PartDefinition cube_r24 = bone.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 89).addBox(-0.8706F, -1.0251F, -0.0093F, 2.0F, 1.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.561F, -2.0F, -26.5F, -0.0175F, 0.0F, 1.309F));

		PartDefinition cube_r25 = bone.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 54).addBox(-0.0808F, -0.995F, -4.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.8162F, 0.5689F, -26.5F, -0.3079F, -0.1248F, 0.825F));

		PartDefinition cube_r26 = bone.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(116, 100).addBox(-1.9387F, -1.0347F, -16.0F, 2.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.5305F, 1.9107F, -10.5F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r27 = bone.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(121, 113).addBox(-1.0F, -0.5F, -5.0F, 2.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2923F, -0.4835F, -7.5F, 0.0436F, 0.0F, 0.7854F));

		PartDefinition cube_r28 = bone.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(40, 75).addBox(-1.0F, -0.5F, -7.0F, 2.0F, 1.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.2304F, -0.5453F, -19.5F, -0.0175F, 0.0F, 0.7854F));

		PartDefinition cube_r29 = bone.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(28, 43)
						.addBox(0.7346F, -0.9168F, -3.0245F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-0.2654F, -0.9168F, -7.0245F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0545F, 1.3564F, -30.25F, -0.59F, -0.2404F, 0.3057F));

		PartDefinition cube_r30 = bone.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(19, 54).addBox(-0.0341F, -0.7588F, -4.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.367F, 1.6689F, -26.5F, -0.2148F, -0.2404F, 0.3057F));

		PartDefinition cube_r31 = bone.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -1.0F, -16.0F, 2.0F, 1.0F, 36.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.5305F, 2.4107F, -10.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone6 = bone.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(-7.5305F, 3.7607F, -30.425F));

		PartDefinition cube_r32 = bone6.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(20, 8)
						.addBox(0.0F, -0.9388F, -8.9294F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 48)
						.addBox(0.0F, -0.9388F, -1.9294F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.3125F, -2.0902F, -0.0305F, -0.5729F, -0.1323F, 0.0849F));

		PartDefinition cube_r33 = bone6.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(28, 48).mirror()
						.addBox(-2.0F, -0.9388F, -1.9294F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.3125F, -2.0902F, -0.0305F, -0.5729F, 0.1323F, -0.0849F));

		PartDefinition cube_r34 = bone6.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(107, 114).addBox(-1.0F, -1.7485F, -10.0036F, 2.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition wheel = partdefinition.addOrReplaceChild("wheel",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 17)
						.addBox(-1.0F, -1.0F, -2.25F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 19)
						.addBox(-0.5F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, 19.0F, 0.25F, -1.0472F, 0.0F, -0.829F));

		PartDefinition cannon = partdefinition.addOrReplaceChild("cannon", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.1667F, 17.455F, -27.6718F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r35 = cannon.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(14, 14).addBox(-0.5F, 1.5F, 0.0F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3333F, -4.955F, 0.6718F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r36 = cannon.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(22, 115)
						.addBox(-1.0F, 0.0F, -3.5F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(47, 118)
						.addBox(-1.5F, -0.5F, 2.5F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1667F, -4.455F, -3.8282F, -0.1745F, 0.0F, 0.0F));

		PartDefinition chest = partdefinition.addOrReplaceChild("chest",
				CubeListBuilder.create().texOffs(154, 6).addBox(-4.0F, -2.0F, -2.5F, 8.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -15.5F, -0.9525F, 0.7205F, -0.0631F));

		PartDefinition chestlid = chest.addOrReplaceChild("chestlid", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -2.0F, 2.4625F, -2.3998F, 0.0F, 0.0F));

		PartDefinition cube_r37 = chestlid.addOrReplaceChild("cube_r37",
				CubeListBuilder.create().texOffs(21, 148).addBox(-4.0F, -3.8158F, -2.843F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, -4.1548F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r38 = chestlid.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(21, 148).addBox(-3.99F, -5.2507F, 0.8899F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r39 = chestlid.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(24, 144).mirror()
						.addBox(1.09F, -0.166F, 1.0294F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(59, 142).addBox(-4.11F, -0.166F, 1.0294F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, 0.5626F, -1.6548F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r40 = chestlid.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(39, 152).addBox(-4.0F, -0.1743F, -0.0076F, 8.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 2.0626F, -4.1548F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r41 = chestlid.addOrReplaceChild("cube_r41",
				CubeListBuilder.create().texOffs(41, 146).addBox(-4.01F, -5.8452F, 1.8126F, 8.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0626F, 0.8452F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mast = partdefinition.addOrReplaceChild("mast",
				CubeListBuilder.create().texOffs(3, 19).addBox(-0.75F, -35.0F, -0.75F, 1.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 17.0F, -19.0F, 0.0F, 0.0F, -1.2654F));

		PartDefinition bone2 = mast.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -16.5F, -0.1569F));

		PartDefinition cube_r42 = bone2.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(16, 130).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r43 = bone3
				.addOrReplaceChild("cube_r43",
						CubeListBuilder.create().texOffs(8, 130).addBox(-0.5F, -14.5F, -1.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r44 = bone3
				.addOrReplaceChild("cube_r44",
						CubeListBuilder.create().texOffs(12, 130).addBox(0.15F, -14.5F, 0.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r45 = bone4
				.addOrReplaceChild("cube_r45",
						CubeListBuilder.create().texOffs(0, 130).addBox(-0.5F, -14.5F, -1.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r46 = bone4
				.addOrReplaceChild("cube_r46",
						CubeListBuilder.create().texOffs(4, 130).addBox(0.15F, -14.5F, 0.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r47 = bone5
				.addOrReplaceChild("cube_r47",
						CubeListBuilder.create().texOffs(32, 74).addBox(-0.5F, -14.5F, -1.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r48 = bone5.addOrReplaceChild(
				"cube_r48", CubeListBuilder.create().texOffs(72, 75).addBox(-0.3625F, -14.5F, -1.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r49 = bone5
				.addOrReplaceChild("cube_r49",
						CubeListBuilder.create().texOffs(110, 75).addBox(0.15F, -14.5F, 0.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone7 = mast.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.5F, -0.1569F));

		PartDefinition cube_r50 = bone7.addOrReplaceChild("cube_r50",
				CubeListBuilder.create().texOffs(16, 130).addBox(-0.5F, -12.5F, -1.0F, 1.0F, 18.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r51 = bone8
				.addOrReplaceChild("cube_r51",
						CubeListBuilder.create().texOffs(8, 130).addBox(-0.5F, -14.5F, -1.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r52 = bone8
				.addOrReplaceChild("cube_r52",
						CubeListBuilder.create().texOffs(12, 130).addBox(0.15F, -14.5F, 0.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone9 = bone7.addOrReplaceChild("bone9", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r53 = bone9
				.addOrReplaceChild("cube_r53",
						CubeListBuilder.create().texOffs(0, 130).addBox(-0.5F, -14.5F, -1.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r54 = bone9
				.addOrReplaceChild("cube_r54",
						CubeListBuilder.create().texOffs(4, 130).addBox(0.15F, -14.5F, 0.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r55 = bone10
				.addOrReplaceChild("cube_r55",
						CubeListBuilder.create().texOffs(32, 74).addBox(-0.5F, -14.5F, -1.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r56 = bone10.addOrReplaceChild(
				"cube_r56", CubeListBuilder.create().texOffs(72, 75).addBox(-0.3625F, -14.5F, -1.0625F, 1.0F, 18.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r57 = bone10
				.addOrReplaceChild("cube_r57",
						CubeListBuilder.create().texOffs(110, 75).addBox(0.15F, -14.5F, 0.0625F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition flag = mast.addOrReplaceChild("flag",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(0.1289F, -1.5F, 5.9009F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 15)
						.addBox(0.1289F, -1.5F, 0.0884F, 0.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3789F, -33.0F, 0.1616F, 0.0F, -1.4835F, 0.0F));

		PartDefinition cube_r58 = flag.addOrReplaceChild("cube_r58",
				CubeListBuilder.create().texOffs(9, 10).addBox(-0.006F, -1.5F, -0.0384F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.3711F, 0.0F, 4.0259F, 0.0F, 0.2618F, 0.0F));

		PartDefinition cube_r59 = flag.addOrReplaceChild("cube_r59",
				CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.1289F, 0.0F, 2.0884F, 0.0F, -0.2618F, 0.0F));

		PartDefinition bone13 = mast.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(53, 88).mirror()
						.addBox(-0.4375F, 4.5F, -22.5F, 1.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0625F, -15.5F, -1.5F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r60 = bone13.addOrReplaceChild("cube_r60",
				CubeListBuilder.create().texOffs(72, 141).mirror()
						.addBox(0.0F, -7.0F, -12.0F, 0.0F, 19.0F, 23.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.0625F, -7.5F, -11.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition bone12 = mast.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(73, 127)
						.addBox(0.0625F, -10.75F, 0.25F, 0.0F, 14.0F, 22.0F, new CubeDeformation(0.0F)).texOffs(53, 88)
						.addBox(-0.5625F, 3.25F, -0.75F, 1.0F, 1.0F, 23.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.0625F, -19.25F, 0.75F, 0.0F, -1.0472F, 0.0F));

		PartDefinition bone11 = partdefinition.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(109, 5).addBox(-1.5F, -1.4809F, -0.4435F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 15.4809F, 5.4435F, 0.0F, 0.0F, -1.9199F));

		PartDefinition cube_r61 = bone11.addOrReplaceChild("cube_r61",
				CubeListBuilder.create().texOffs(6, 26).addBox(-2.0F, 1.0F, -1.5F, 3.0F, 0.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, -0.4809F, -1.9435F, 1.0908F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(80, 59)
				.addBox(-7.0F, -8.2625F, 9.0375F, 14.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 27)
				.addBox(-4.2625F, -9.1125F, 8.25F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 13)
				.addBox(-0.7375F, -9.175F, 8.325F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 29)
				.addBox(-1.225F, -6.225F, 9.2125F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
				.addBox(-3.8875F, -7.75F, 9.2875F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 34)
				.addBox(-2.5F, -9.3F, -31.175F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 34).mirror()
				.addBox(1.5F, -9.3F, -31.175F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r62 = bb_main.addOrReplaceChild("cube_r62",
				CubeListBuilder.create().texOffs(5, 144).mirror()
						.addBox(-0.5F, -4.0F, 1.0F, 1.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.0F, -7.0F, -32.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r63 = bb_main.addOrReplaceChild("cube_r63",
				CubeListBuilder.create().texOffs(5, 144).addBox(-0.5F, -4.0F, 2.0F, 1.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -7.0F, -32.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r64 = bb_main.addOrReplaceChild("cube_r64",
				CubeListBuilder.create().texOffs(1, 118).addBox(-1.425F, -0.5F, 0.5125F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7589F, -7.6963F, 5.6688F, 0.0F, 0.6109F, -0.0436F));

		PartDefinition cube_r65 = bb_main.addOrReplaceChild("cube_r65",
				CubeListBuilder.create().texOffs(1, 118).addBox(-2.0375F, -0.5F, -0.875F, 1.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.228F, -7.7604F, 6.25F, 0.0F, -0.6981F, -0.0436F));

		PartDefinition cube_r66 = bb_main.addOrReplaceChild("cube_r66",
				CubeListBuilder.create().texOffs(0, 118).addBox(-0.75F, -1.05F, -2.0F, 2.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -7.25F, 6.25F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r67 = bb_main.addOrReplaceChild("cube_r67",
				CubeListBuilder.create().texOffs(21, 135).addBox(-0.5F, -2.0F, 0.5F, 9.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -10.0F, 5.5F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r68 = bb_main.addOrReplaceChild("cube_r68",
				CubeListBuilder.create().texOffs(0, 102).addBox(1.0F, -0.25F, -13.5F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.5F, -20.0F, -0.0695F, 0.0061F, 0.0871F));

		PartDefinition cube_r69 = bb_main.addOrReplaceChild("cube_r69",
				CubeListBuilder.create().texOffs(16, 92).addBox(0.7561F, -0.8606F, -11.2451F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9725F, -6.1184F, -27.0312F, -0.1034F, 0.8294F, -0.0326F));

		PartDefinition cube_r70 = bb_main.addOrReplaceChild("cube_r70",
				CubeListBuilder.create().texOffs(20, 23).addBox(-0.9939F, -0.9606F, -4.4951F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9725F, -6.1184F, -27.0312F, -0.077F, 0.4382F, 0.011F));

		PartDefinition cube_r71 = bb_main.addOrReplaceChild("cube_r71",
				CubeListBuilder.create().texOffs(56, 93).addBox(-2.7561F, -0.8606F, -11.2451F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9725F, -6.1184F, -27.0312F, -0.1034F, -0.8294F, 0.0326F));

		PartDefinition cube_r72 = bb_main.addOrReplaceChild("cube_r72",
				CubeListBuilder.create().texOffs(0, 25).addBox(-1.0061F, -0.7606F, -4.4951F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.9725F, -6.1184F, -27.0312F, -0.077F, -0.4382F, -0.011F));

		PartDefinition cube_r73 = bb_main.addOrReplaceChild("cube_r73",
				CubeListBuilder.create().texOffs(0, 37).addBox(-5.0F, 0.0F, -11.5F, 2.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.5F, -20.0F, -0.0697F, -0.003F, -0.0435F));

		PartDefinition cube_r74 = bb_main.addOrReplaceChild("cube_r74",
				CubeListBuilder.create().texOffs(18, 102).addBox(-3.0F, -0.25F, -13.5F, 2.0F, 1.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.5F, -20.0F, -0.0695F, -0.0061F, -0.0871F));

		PartDefinition cube_r75 = bb_main.addOrReplaceChild("cube_r75",
				CubeListBuilder.create().texOffs(116, 89).addBox(-1.0F, 0.0F, -16.5F, 2.0F, 1.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.5F, -20.0F, -0.0698F, 0.0F, 0.0F));

		PartDefinition cube_r76 = bb_main
				.addOrReplaceChild("cube_r76",
						CubeListBuilder.create().texOffs(40, 33).addBox(-2.5F, -0.5F, -1.2875F, 5.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(6.5F, -8.0F, 9.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r77 = bb_main.addOrReplaceChild("cube_r77",
				CubeListBuilder.create().texOffs(40, 38).addBox(-2.5F, -0.4F, -1.25F, 5.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.5F, -8.0F, 9.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r78 = bb_main.addOrReplaceChild("cube_r78",
				CubeListBuilder.create().texOffs(20, 0).addBox(-0.825F, -0.6375F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.2875F, -6.8875F, 9.5F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r79 = bb_main.addOrReplaceChild("cube_r79",
				CubeListBuilder.create().texOffs(20, 3).addBox(-1.175F, -0.6375F, -0.5F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.2875F, -6.8875F, 9.5F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r80 = bb_main.addOrReplaceChild("cube_r80",
				CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -2.0F, 9.5F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r81 = bb_main.addOrReplaceChild("cube_r81",
				CubeListBuilder.create().texOffs(25, 59).addBox(-0.0653F, -3.1007F, -0.5F, 4.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -2.525F, 9.5F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r82 = bb_main.addOrReplaceChild("cube_r82",
				CubeListBuilder.create().texOffs(22, 112).addBox(-1.0F, -0.5F, -7.0F, 2.0F, 1.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -6.5F, -2.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r83 = bb_main.addOrReplaceChild("cube_r83",
				CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -0.5F, -8.0F, 2.0F, 1.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -6.5F, -19.0F, 0.0F, 0.0F, 0.0349F));

		PartDefinition cube_r84 = bb_main.addOrReplaceChild("cube_r84",
				CubeListBuilder.create().texOffs(104, 23).addBox(-1.0F, 2.5F, -8.0F, 2.0F, 1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -6.5F, -3.0F, 0.2531F, 0.0F, -0.0524F));

		PartDefinition cube_r85 = bb_main.addOrReplaceChild("cube_r85",
				CubeListBuilder.create().texOffs(104, 44).addBox(-1.0F, -0.5F, -10.0F, 2.0F, 1.0F, 20.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -6.5F, -17.0F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r86 = bb_main.addOrReplaceChild("cube_r86",
				CubeListBuilder.create().texOffs(0, 37).addBox(-1.0F, -0.5F, -6.0F, 2.0F, 1.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -6.5F, -1.0F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r87 = bb_main.addOrReplaceChild("cube_r87",
				CubeListBuilder.create().texOffs(40, 0).addBox(-1.0F, 0.5F, -6.0F, 2.0F, 1.0F, 16.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -6.5F, -1.0F, 0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r88 = bb_main.addOrReplaceChild("cube_r88",
				CubeListBuilder.create().texOffs(44, 113).addBox(-1.0F, -0.5F, -9.0F, 2.0F, 1.0F, 18.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -6.5F, -18.0F, 0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wheel.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		cannon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		chest.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		mast.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone11.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}