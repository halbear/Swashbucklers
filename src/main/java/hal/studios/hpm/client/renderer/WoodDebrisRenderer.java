
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.WoodDebrisEntity;
import hal.studios.hpm.client.model.Modeldrifting_wood;

public class WoodDebrisRenderer extends MobRenderer<WoodDebrisEntity, Modeldrifting_wood<WoodDebrisEntity>> {
	public WoodDebrisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldrifting_wood(context.bakeLayer(Modeldrifting_wood.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(WoodDebrisEntity entity) {
		return new ResourceLocation("hpm:textures/entities/shipwoodplank.png");
	}
}
