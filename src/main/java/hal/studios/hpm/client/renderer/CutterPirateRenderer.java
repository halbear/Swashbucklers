
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.CutterPirateEntity;
import hal.studios.hpm.client.model.Modelcutterweaponisedremastered;

public class CutterPirateRenderer extends MobRenderer<CutterPirateEntity, Modelcutterweaponisedremastered<CutterPirateEntity>> {
	public CutterPirateRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcutterweaponisedremastered(context.bakeLayer(Modelcutterweaponisedremastered.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(CutterPirateEntity entity) {
		return new ResourceLocation("hpm:textures/entities/cutterpirateremastered.png");
	}
}
