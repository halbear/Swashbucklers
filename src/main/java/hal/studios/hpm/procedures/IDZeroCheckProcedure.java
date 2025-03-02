package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import hal.studios.hpm.network.HpmModVariables;

public class IDZeroCheckProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("id") == 0) {
			entity.getPersistentData().putDouble("id", HpmModVariables.MapVariables.get(world).IDcounter);
			HpmModVariables.MapVariables.get(world).IDcounter = HpmModVariables.MapVariables.get(world).IDcounter + 1;
			HpmModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
