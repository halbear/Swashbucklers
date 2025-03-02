
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterwreckfrontEntity;
import hal.studios.hpm.client.model.ModelcutterdWreckFrontremade;

public class CutterwreckfrontRenderer extends MobRenderer<CutterwreckfrontEntity, ModelcutterdWreckFrontremade<CutterwreckfrontEntity>> {
	public CutterwreckfrontRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelcutterdWreckFrontremade(context.bakeLayer(ModelcutterdWreckFrontremade.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterwreckfrontEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterremasteredwreck.png");
	}
}
