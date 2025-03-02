
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterwreckbackEntity;
import hal.studios.hpm.client.model.ModelcutterRearWreckremade;

public class CutterwreckbackRenderer extends MobRenderer<CutterwreckbackEntity, ModelcutterRearWreckremade<CutterwreckbackEntity>> {
	public CutterwreckbackRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelcutterRearWreckremade(context.bakeLayer(ModelcutterRearWreckremade.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterwreckbackEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterremasteredwreck.png");
	}
}
