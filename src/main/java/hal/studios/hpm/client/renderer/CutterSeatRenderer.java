
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterSeatEntity;
import hal.studios.hpm.client.model.ModelCutterPassenger;

public class CutterSeatRenderer extends MobRenderer<CutterSeatEntity, ModelCutterPassenger<CutterSeatEntity>> {
	public CutterSeatRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCutterPassenger(context.bakeLayer(ModelCutterPassenger.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterSeatEntity entity) {
		return new ResourceLocation("hpm:textures/entities/transparent.png");
	}
}
