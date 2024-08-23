package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.ShipwreckedraftEntity;

public class ShiupwreckraftspawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new ShipwreckedraftEntity(HpmModEntities.SHIPWRECKEDRAFT.get(), _level);
			entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
