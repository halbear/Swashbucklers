
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterPirateDamagedSailsEntity;
import hal.studios.hpm.client.model.Modelcutterweaponisedremastered;

public class CutterPirateDamagedSailsRenderer extends MobRenderer<CutterPirateDamagedSailsEntity, Modelcutterweaponisedremastered<CutterPirateDamagedSailsEntity>> {
	public CutterPirateDamagedSailsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterweaponisedremastered(context.bakeLayer(Modelcutterweaponisedremastered.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterPirateDamagedSailsEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterpiratesailsdamagedremastered.png");
	}
}
