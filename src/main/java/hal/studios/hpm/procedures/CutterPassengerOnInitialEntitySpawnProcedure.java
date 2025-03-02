package hal.studios.hpm.procedures;

import net.minecraft.world.entity.Entity;

public class CutterPassengerOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setNoGravity(true);
	}
}
