
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterdamagedEntity;
import hal.studios.hpm.client.model.Modelcutterdamagedremade;

public class CutterdamagedRenderer extends MobRenderer<CutterdamagedEntity, Modelcutterdamagedremade<CutterdamagedEntity>> {
	public CutterdamagedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterdamagedremade(context.bakeLayer(Modelcutterdamagedremade.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterdamagedEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterremastereddamaged.png");
	}
}
