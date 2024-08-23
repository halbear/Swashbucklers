
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterpiratewreckEntity;
import hal.studios.hpm.client.model.Modelcutterpiratewreck;

public class CutterpiratewreckRenderer extends MobRenderer<CutterpiratewreckEntity, Modelcutterpiratewreck<CutterpiratewreckEntity>> {
	public CutterpiratewreckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterpiratewreck(context.bakeLayer(Modelcutterpiratewreck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterpiratewreckEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterpiratedwrecked.png");
	}
}
