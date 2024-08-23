
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.SwashbucklerupgradedEntity;
import hal.studios.hpm.client.model.Modelswashbucklerupgraded;

public class SwashbucklerupgradedRenderer extends MobRenderer<SwashbucklerupgradedEntity, Modelswashbucklerupgraded<SwashbucklerupgradedEntity>> {
	public SwashbucklerupgradedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswashbucklerupgraded(context.bakeLayer(Modelswashbucklerupgraded.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(SwashbucklerupgradedEntity entity) {
		return new ResourceLocation("hpm:textures/entities/swashbucklerupgraded.png");
	}
}
