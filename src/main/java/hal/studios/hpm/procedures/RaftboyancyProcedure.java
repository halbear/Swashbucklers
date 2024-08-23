package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class RaftboyancyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterOrBubble()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.03, (entity.getDeltaMovement().z())));
		}
	}
}
