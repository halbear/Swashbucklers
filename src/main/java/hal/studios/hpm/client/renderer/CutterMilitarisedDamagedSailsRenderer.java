
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterMilitarisedDamagedSailsEntity;
import hal.studios.hpm.client.model.Modelcutterweaponisedremastered;

public class CutterMilitarisedDamagedSailsRenderer extends MobRenderer<CutterMilitarisedDamagedSailsEntity, Modelcutterweaponisedremastered<CutterMilitarisedDamagedSailsEntity>> {
	public CutterMilitarisedDamagedSailsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterweaponisedremastered(context.bakeLayer(Modelcutterweaponisedremastered.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterMilitarisedDamagedSailsEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterweaponisedsailsdamagedremastered.png");
	}
}
