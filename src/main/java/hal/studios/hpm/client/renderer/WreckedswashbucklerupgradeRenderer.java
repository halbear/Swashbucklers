
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.WreckedswashbucklerupgradeEntity;
import hal.studios.hpm.client.model.Modelswashbucklerupgradeddestroyed;

public class WreckedswashbucklerupgradeRenderer extends MobRenderer<WreckedswashbucklerupgradeEntity, Modelswashbucklerupgradeddestroyed<WreckedswashbucklerupgradeEntity>> {
	public WreckedswashbucklerupgradeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswashbucklerupgradeddestroyed(context.bakeLayer(Modelswashbucklerupgradeddestroyed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WreckedswashbucklerupgradeEntity entity) {
		return new ResourceLocation("hpm:textures/entities/swashbucklerupgradeddestroyed.png");
	}
}
