// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelraft<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "raft"), "main");
	private final ModelPart mast;
	private final ModelPart bone;
	private final ModelPart bone6;
	private final ModelPart bone8;
	private final ModelPart bone7;
	private final ModelPart bb_main;

	public Modelraft(ModelPart root) {
		this.mast = root.getChild("mast");
		this.bone = root.getChild("bone");
		this.bone6 = root.getChild("bone6");
		this.bone8 = root.getChild("bone8");
		this.bone7 = root.getChild("bone7");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mast = partdefinition.addOrReplaceChild("mast", CubeListBuilder.create(),
				PartPose.offset(0.0F, 20.0F, 3.0F));

		PartDefinition bone2 = mast.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, -13.5F, -6.1569F));

		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 0).addBox(-0.5F, -23.5F, -1.0F, 1.0F, 36.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 10.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = bone3
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(20, 0).addBox(-7.5711F, -26.5F, -8.0711F, 1.0F, 36.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r3 = bone3
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(24, 0).addBox(0.15F, -26.5F, 10.0625F, 1.0F, 36.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = bone2.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, -0.275F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r4 = bone4
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(12, 0).addBox(-7.5711F, -26.5F, 6.0711F, 1.0F, 36.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r5 = bone4
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(16, 0).addBox(10.15F, -26.5F, 0.0625F, 1.0F, 36.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone5 = bone4.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-0.2875F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r6 = bone5
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(0, 0).addBox(6.5711F, -26.5F, 6.0711F, 1.0F, 36.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

		PartDefinition cube_r7 = bone5
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(4, 0).addBox(9.6375F, -26.5F, -1.0625F, 1.0F, 36.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r8 = bone5
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(8, 0).addBox(0.15F, -26.5F, -9.9375F, 1.0F, 36.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 53)
						.addBox(-11.0F, -15.0F, 9.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 33)
						.addBox(-11.5F, -13.5F, 8.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 25)
						.addBox(-11.5F, -10.5F, 8.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 78)
						.addBox(-11.0F, -13.5F, 9.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-11.0F, -13.75F, 9.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 90)
						.addBox(-11.0F, -14.0F, 9.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, 0.0F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create().texOffs(24, 53)
				.addBox(-5.2539F, -5.4619F, -2.7335F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 33)
				.addBox(-5.7539F, -3.9619F, -3.2335F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 25)
				.addBox(-5.7539F, -0.9619F, -3.2335F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, 15.5F, 18.0F, 0.5059F, 0.3082F, 0.9083F));

		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-9.0F, 18.0F, 3.0F, 0.0F, -0.6545F, 0.0F));

		PartDefinition chest = bone8.addOrReplaceChild("chest", CubeListBuilder.create().texOffs(58, 66)
				.addBox(-15.7258F, -12.0F, 27.8117F, 8.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, 6.0F, -31.0F));

		PartDefinition chestlid = bone8.addOrReplaceChild("chestlid", CubeListBuilder.create(),
				PartPose.offsetAndRotation(12.0F, -3.0F, -18.0375F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r9 = chestlid.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(28, 43).addBox(-15.7258F, -23.574F, -1.076F, 8.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, -5.0F, -0.9948F, 0.0F, 0.0F));

		PartDefinition cube_r10 = chestlid.addOrReplaceChild(
				"cube_r10", CubeListBuilder.create().texOffs(58, 41).addBox(-15.7158F, 4.3242F, 18.2631F, 8.0F, 3.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, 0.0F, 0.9905F, 0.0F, 0.0F));

		PartDefinition cube_r11 = chestlid.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(32, 30)
				.addBox(-10.6358F, 18.793F, -4.8069F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
				.addBox(-15.8358F, 18.793F, -4.8069F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.01F, -1.25F, -2.5F, 2.3562F, 0.0F, 0.0F));

		PartDefinition cube_r12 = chestlid.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(30, 28).addBox(-15.7258F, 19.4749F, 2.7153F, 8.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.01F, 0.25F, -5.0F, 1.9199F, 0.0F, 0.0F));

		PartDefinition cube_r13 = chestlid.addOrReplaceChild(
				"cube_r13", CubeListBuilder.create().texOffs(21, 37).addBox(-15.7358F, 11.6877F, 11.0917F, 8.0F, 5.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(0, 53)
						.addBox(-3.0F, -6.5F, -3.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(58, 33)
						.addBox(-3.5F, -5.0F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(58, 25)
						.addBox(-3.5F, -2.0F, -3.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 15.5F, 18.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-13.0F, -8.0F, -24.0F, 5.0F, 5.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
				.addBox(-17.0F, -41.0F, 5.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
				.addBox(-0.75F, -48.0F, 6.25F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 36)
				.addBox(-13.75F, -8.5F, -21.0F, 28.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 36)
				.addBox(-13.75F, -8.5F, 19.0F, 28.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 36)
				.addBox(-13.75F, -8.5F, 8.0F, 28.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 36)
				.addBox(-13.75F, -8.5F, -10.0F, 28.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 0).mirror()
				.addBox(-17.0F, -23.5F, 5.0F, 34.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(19, 79).addBox(-4.5F, -2.0F, -4.0F, 6.0F, 0.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.0F, -12.0F, 19.5F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(32, 0).addBox(-0.0795F, 0.2452F, -0.1466F, 0.0F, 27.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -32.25F, 6.5F, -0.0174F, 0.0008F, 0.3927F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(116, 4).addBox(-17.0F, -0.5F, -0.25F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -40.0F, 5.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(116, 6).addBox(-17.0F, -0.008F, 0.0261F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -38.75F, 4.1125F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r18 = bb_main.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(58, 111).addBox(-17.0F, -7.425F, 0.0F, 34.0F, 10.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -34.209F, 3.7863F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r19 = bb_main.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(116, 8).addBox(-17.0F, -1.5F, -0.25F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -23.6125F, 5.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r20 = bb_main.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(116, 10).addBox(-17.0F, -1.992F, 0.0261F, 34.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -24.8625F, 4.1125F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r21 = bb_main.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(34, 0).addBox(-0.1705F, 0.2452F, -0.1466F, 0.0F, 27.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -32.25F, 6.5F, -0.0174F, -0.0008F, -0.3927F));

		PartDefinition cube_r22 = bb_main.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 53).addBox(-2.5F, -2.5F, -24.0F, 5.0F, 5.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.25F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r23 = bb_main.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(58, 5).addBox(-2.5F, -2.5F, -24.0F, 5.0F, 5.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r24 = bb_main.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(58, 58).addBox(-2.5F, -2.5F, -24.0F, 5.0F, 5.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.25F, -5.5F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r25 = bb_main.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 106).addBox(-2.5F, -2.5F, -24.0F, 5.0F, 5.0F, 48.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.5F, 0.0F, 0.0F, 0.0F, -0.0436F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		mast.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}