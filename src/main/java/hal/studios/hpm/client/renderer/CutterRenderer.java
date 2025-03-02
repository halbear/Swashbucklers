
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterEntity;
import hal.studios.hpm.client.model.Modelcutterremastered;

public class CutterRenderer extends MobRenderer<CutterEntity, Modelcutterremastered<CutterEntity>> {
	public CutterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterremastered(context.bakeLayer(Modelcutterremastered.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterremastered.png");
	}
}
