package hal.studios.hpm.procedures;

import net.minecraft.world.entity.Entity;

public class CutterPassengerSolidBoundingBoxConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getDeltaMovement().z() > 0.1 || entity.getDeltaMovement().x() > 0.1) {
			return false;
		}
		return true;
	}
}
