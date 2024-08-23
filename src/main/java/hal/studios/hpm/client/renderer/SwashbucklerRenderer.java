
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.SwashbucklerEntity;
import hal.studios.hpm.client.model.Modelswashbuckler;

public class SwashbucklerRenderer extends MobRenderer<SwashbucklerEntity, Modelswashbuckler<SwashbucklerEntity>> {
	public SwashbucklerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswashbuckler(context.bakeLayer(Modelswashbuckler.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(SwashbucklerEntity entity) {
		return new ResourceLocation("hpm:textures/entities/swashbuckler.png");
	}
}
