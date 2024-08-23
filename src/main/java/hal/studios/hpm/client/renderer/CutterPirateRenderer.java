
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterPirateEntity;
import hal.studios.hpm.client.model.Modelcutterpirate;

public class CutterPirateRenderer extends MobRenderer<CutterPirateEntity, Modelcutterpirate<CutterPirateEntity>> {
	public CutterPirateRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterpirate(context.bakeLayer(Modelcutterpirate.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterPirateEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterpirate.png");
	}
}
