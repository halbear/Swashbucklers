package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;

import hal.studios.hpm.network.HpmModVariables;

public class ShipspeedmultiplieresetProcedure {
	public static void execute(LevelAccessor world) {
		HpmModVariables.WorldVariables.get(world).shipspeedmultiplier = 1;
		HpmModVariables.WorldVariables.get(world).syncData(world);
	}
}
