package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.WoodDebrisEntity;
import hal.studios.hpm.entity.CutterMilitarisedWreckEntity;
import hal.studios.hpm.entity.BarrelDebrisEntity;

public class CuttermilitariseddamagedEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CutterMilitarisedWreckEntity(HpmModEntities.CUTTER_MILITARISED_WRECK.get(), _level);
			entityToSpawn.moveTo(x, y, z, entity.getYRot(), 0);
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		for (int index0 = 0; index0 < Math.round(3 + 7 * Math.random()); index0++) {
			if (Math.random() > 0.3) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new WoodDebrisEntity(HpmModEntities.WOOD_DEBRIS.get(), _level);
					entityToSpawn.moveTo(x, (1 + y), z, (float) (360 * Math.random()), 0);
					entityToSpawn.setYBodyRot((float) (360 * Math.random()));
					entityToSpawn.setYHeadRot((float) (360 * Math.random()));
					entityToSpawn.setDeltaMovement((-0.4 + 0.8 * Math.random()), (0.1 + 0.7 * Math.random()), (-0.4 + 0.8 * Math.random()));
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new BarrelDebrisEntity(HpmModEntities.BARREL_DEBRIS.get(), _level);
					entityToSpawn.moveTo(x, (1 + y), z, (float) (360 * Math.random()), 0);
					entityToSpawn.setYBodyRot((float) (360 * Math.random()));
					entityToSpawn.setYHeadRot((float) (360 * Math.random()));
					entityToSpawn.setDeltaMovement((-0.4 + 0.8 * Math.random()), (0.1 + 0.7 * Math.random()), (-0.4 + 0.8 * Math.random()));
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
