
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterSailsDamagedEntity;
import hal.studios.hpm.client.model.ModelcutterDamagedSails;

public class CutterSailsDamagedRenderer extends MobRenderer<CutterSailsDamagedEntity, ModelcutterDamagedSails<CutterSailsDamagedEntity>> {
	public CutterSailsDamagedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelcutterDamagedSails(context.bakeLayer(ModelcutterDamagedSails.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterSailsDamagedEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterremasteredsailsdamaged.png");
	}
}
