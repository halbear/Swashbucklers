
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterwreckfrontEntity;
import hal.studios.hpm.client.model.Modelcutterwreckfront;

public class CutterwreckfrontRenderer extends MobRenderer<CutterwreckfrontEntity, Modelcutterwreckfront<CutterwreckfrontEntity>> {
	public CutterwreckfrontRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterwreckfront(context.bakeLayer(Modelcutterwreckfront.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterwreckfrontEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterwrecked.png");
	}
}
