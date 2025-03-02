
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.BarrelDebrisEntity;
import hal.studios.hpm.client.model.Modelfloating_barrel;

public class BarrelDebrisRenderer extends MobRenderer<BarrelDebrisEntity, Modelfloating_barrel<BarrelDebrisEntity>> {
	public BarrelDebrisRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfloating_barrel(context.bakeLayer(Modelfloating_barrel.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(BarrelDebrisEntity entity) {
		return new ResourceLocation("hpm:textures/entities/floatingbarrel.png");
	}
}
