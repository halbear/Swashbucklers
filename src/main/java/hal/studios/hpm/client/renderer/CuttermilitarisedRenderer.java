
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CuttermilitarisedEntity;
import hal.studios.hpm.client.model.Modelcuttermilitarised;

public class CuttermilitarisedRenderer extends MobRenderer<CuttermilitarisedEntity, Modelcuttermilitarised<CuttermilitarisedEntity>> {
	public CuttermilitarisedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcuttermilitarised(context.bakeLayer(Modelcuttermilitarised.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CuttermilitarisedEntity entity) {
		return new ResourceLocation("hpm:textures/entities/warcutter.png");
	}
}
