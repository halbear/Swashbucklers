package hal.studios.hpm.procedures;

import net.minecraft.world.entity.Entity;

import hal.studios.hpm.network.HpmModVariables;

public class SailspeedupOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.sailspeedup = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
