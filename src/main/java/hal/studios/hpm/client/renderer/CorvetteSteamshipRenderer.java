
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CorvetteSteamshipEntity;
import hal.studios.hpm.client.model.Modelcorvetteclass;

public class CorvetteSteamshipRenderer extends MobRenderer<CorvetteSteamshipEntity, Modelcorvetteclass<CorvetteSteamshipEntity>> {
	public CorvetteSteamshipRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorvetteclass(context.bakeLayer(Modelcorvetteclass.LAYER_LOCATION)), 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorvetteSteamshipEntity entity) {
		return new ResourceLocation("hpm:textures/entities/corvetteclass.png");
	}
}
