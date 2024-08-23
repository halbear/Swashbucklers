
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterpiratedamagedEntity;
import hal.studios.hpm.client.model.Modelcutterpiratedamaged;

public class CutterpiratedamagedRenderer extends MobRenderer<CutterpiratedamagedEntity, Modelcutterpiratedamaged<CutterpiratedamagedEntity>> {
	public CutterpiratedamagedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterpiratedamaged(context.bakeLayer(Modelcutterpiratedamaged.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterpiratedamagedEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterpiratedamaged.png");
	}
}
