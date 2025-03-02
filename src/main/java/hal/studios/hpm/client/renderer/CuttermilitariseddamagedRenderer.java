
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CuttermilitariseddamagedEntity;
import hal.studios.hpm.client.model.ModelcutterArmedDamaged;

public class CuttermilitariseddamagedRenderer extends MobRenderer<CuttermilitariseddamagedEntity, ModelcutterArmedDamaged<CuttermilitariseddamagedEntity>> {
	public CuttermilitariseddamagedRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelcutterArmedDamaged(context.bakeLayer(ModelcutterArmedDamaged.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CuttermilitariseddamagedEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterweaponiseddamagedremastered.png");
	}
}
