package hal.studios.hpm.procedures;

import net.minecraft.world.entity.Entity;

public class WoodDebrisEntityDiesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
