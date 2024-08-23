
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.ShipwreckswashbucklerEntity;
import hal.studios.hpm.client.model.Modelswashbucklerdestroyed;

public class ShipwreckswashbucklerRenderer extends MobRenderer<ShipwreckswashbucklerEntity, Modelswashbucklerdestroyed<ShipwreckswashbucklerEntity>> {
	public ShipwreckswashbucklerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelswashbucklerdestroyed(context.bakeLayer(Modelswashbucklerdestroyed.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShipwreckswashbucklerEntity entity) {
		return new ResourceLocation("hpm:textures/entities/swashbucklerdestroyed.png");
	}
}
