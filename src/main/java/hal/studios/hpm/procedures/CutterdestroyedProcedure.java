package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.WoodDebrisEntity;
import hal.studios.hpm.entity.CutterwreckfrontEntity;
import hal.studios.hpm.entity.CutterwreckbackEntity;
import hal.studios.hpm.entity.BarrelDebrisEntity;

public class CutterdestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double random = 0;
		random = 0.3 * Math.random();
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CutterwreckbackEntity(HpmModEntities.CUTTERWRECKBACK.get(), _level);
			entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement((entity.getLookAngle().x * (-1) * random), Math.random(), (entity.getLookAngle().z * (-1) * random));
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CutterwreckfrontEntity(HpmModEntities.CUTTERWRECKFRONT.get(), _level);
			entityToSpawn.moveTo((x + entity.getLookAngle().x * 1.5), y, (z + entity.getLookAngle().z * 1.5), entity.getYRot(), entity.getXRot());
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement((entity.getLookAngle().x * random), Math.random(), (entity.getLookAngle().z * random));
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		for (int index0 = 0; index0 < 25; index0++) {
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x + Math.random()), (y + Math.random()), (z - Math.random()), 0.1, 0.3, 0.1);
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x + 1), (y + Math.random()), (z + 1), 0.1, 0.3, 0.1);
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x - 1), (y + Math.random()), (z - 1), 0.1, 0.3, 0.1);
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x - 2), (y + Math.random()), (z - 2), 0.1, 0.3, 0.1);
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x + 2), (y + Math.random()), (z + 2), 0.1, 0.3, 0.1);
		}
		for (int index1 = 0; index1 < Math.round(3 + 7 * Math.random()); index1++) {
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
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + entity.getLookAngle().x * 0.7), y, (z + entity.getLookAngle().z * 0.7), (float) 0.5, Explosion.BlockInteraction.BREAK);
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
