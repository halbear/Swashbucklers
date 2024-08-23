
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterwreckbackEntity;
import hal.studios.hpm.client.model.Modelcutterwreckback;

public class CutterwreckbackRenderer extends MobRenderer<CutterwreckbackEntity, Modelcutterwreckback<CutterwreckbackEntity>> {
	public CutterwreckbackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterwreckback(context.bakeLayer(Modelcutterwreckback.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterwreckbackEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterwrecked.png");
	}
}
