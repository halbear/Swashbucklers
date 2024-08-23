
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.ShipwreckedraftEntity;
import hal.studios.hpm.client.model.Modelraftwrecked;

public class ShipwreckedraftRenderer extends MobRenderer<ShipwreckedraftEntity, Modelraftwrecked<ShipwreckedraftEntity>> {
	public ShipwreckedraftRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelraftwrecked(context.bakeLayer(Modelraftwrecked.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShipwreckedraftEntity entity) {
		return new ResourceLocation("hpm:textures/entities/raftwrecked.png");
	}
}
