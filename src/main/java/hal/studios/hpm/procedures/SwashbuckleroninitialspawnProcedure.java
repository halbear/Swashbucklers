package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import hal.studios.hpm.network.HpmModVariables;

public class SwashbuckleroninitialspawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(25);
		entity.getPersistentData().putDouble("id", HpmModVariables.MapVariables.get(world).IDcounter);
		HpmModVariables.MapVariables.get(world).IDcounter = HpmModVariables.MapVariables.get(world).IDcounter + 1;
		HpmModVariables.MapVariables.get(world).syncData(world);
	}
}
