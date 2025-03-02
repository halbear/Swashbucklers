
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterpiratewreckEntity;
import hal.studios.hpm.client.model.ModelcutterArmedWreck;

public class CutterpiratewreckRenderer extends MobRenderer<CutterpiratewreckEntity, ModelcutterArmedWreck<CutterpiratewreckEntity>> {
	public CutterpiratewreckRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelcutterArmedWreck(context.bakeLayer(ModelcutterArmedWreck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterpiratewreckEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterpiratedamagedremastered.png");
	}
}
