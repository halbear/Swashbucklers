
package hal.studios.hpm.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import hal.studios.hpm.entity.RaftEntity;
import hal.studios.hpm.client.model.Modelraft;

public class RaftRenderer extends MobRenderer<RaftEntity, Modelraft<RaftEntity>> {
	public RaftRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelraft(context.bakeLayer(Modelraft.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(RaftEntity entity) {
		return new ResourceLocation("hpm:textures/entities/raft.png");
	}
}
