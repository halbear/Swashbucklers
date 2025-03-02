package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class CutterPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double Xv = 0;
		double Yv = 0;
		double Zv = 0;
		Yv = sourceentity.getDeltaMovement().y() + 0.01;
		Xv = sourceentity.getDeltaMovement().x();
		Zv = sourceentity.getDeltaMovement().z();
		if (entity.getDeltaMovement().x() > 0 || entity.getDeltaMovement().x() < 0 || entity.getDeltaMovement().z() > 0 || entity.getDeltaMovement().z() < 0) {
			sourceentity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (sourceentity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
		} else if (entity.getDeltaMovement().y() > sourceentity.getDeltaMovement().y() && sourceentity.getY() - entity.getY() < 0.1) {
			sourceentity.setDeltaMovement(new Vec3(Xv, (entity.getDeltaMovement().y()), Zv));
		}
	}
}
