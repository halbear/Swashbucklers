package hal.studios.hpm.procedures;

import net.minecraft.world.entity.Entity;

import hal.studios.hpm.network.HpmModVariables;

public class CanUseCannonHandProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).CanFire) {
			return true;
		}
		return false;
	}
}
