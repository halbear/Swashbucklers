
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CorvettesteamshipdamagedEntity;
import hal.studios.hpm.client.model.Modelcorvetteclassdamaged;

public class CorvettesteamshipdamagedRenderer extends MobRenderer<CorvettesteamshipdamagedEntity, Modelcorvetteclassdamaged<CorvettesteamshipdamagedEntity>> {
	public CorvettesteamshipdamagedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcorvetteclassdamaged(context.bakeLayer(Modelcorvetteclassdamaged.LAYER_LOCATION)), 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(CorvettesteamshipdamagedEntity entity) {
		return new ResourceLocation("hpm:textures/entities/corvetteclassdamaged.png");
	}
}
