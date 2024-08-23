package hal.studios.hpm.procedures;

import net.minecraft.world.entity.Entity;

import hal.studios.hpm.network.HpmModVariables;

public class RotateshipleftkeyliftednotpressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.left = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
