
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterSailHitboxEntity;
import hal.studios.hpm.client.model.ModelCutterPassenger;

public class CutterSailHitboxRenderer extends MobRenderer<CutterSailHitboxEntity, ModelCutterPassenger<CutterSailHitboxEntity>> {
	public CutterSailHitboxRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutterPassenger(context.bakeLayer(ModelCutterPassenger.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterSailHitboxEntity entity) {
		return new ResourceLocation("hpm:textures/entities/transparent.png");
	}
}
