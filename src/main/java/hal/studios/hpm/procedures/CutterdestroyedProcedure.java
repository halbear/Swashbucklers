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
import hal.studios.hpm.entity.CutterwreckfrontEntity;
import hal.studios.hpm.entity.CutterwreckbackEntity;

public class CutterdestroyedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CutterwreckbackEntity(HpmModEntities.CUTTERWRECKBACK.get(), _level);
			entityToSpawn.moveTo((x - 0.1), y, (z - 0.1), entity.getYRot(), entity.getXRot());
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CutterwreckfrontEntity(HpmModEntities.CUTTERWRECKFRONT.get(), _level);
			entityToSpawn.moveTo((x + 0.1), y, (z + 0.1), entity.getYRot(), entity.getXRot());
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		for (int index0 = 0; index0 < (int) (25); index0++) {
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x + Math.random()), (y + Math.random()), (z - Math.random()), 0.1, 0.3, 0.1);
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x + 1), (y + Math.random()), (z + 1), 0.1, 0.3, 0.1);
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x - 1), (y + Math.random()), (z - 1), 0.1, 0.3, 0.1);
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x - 2), (y + Math.random()), (z - 2), 0.1, 0.3, 0.1);
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, (x + 2), (y + Math.random()), (z + 2), 0.1, 0.3, 0.1);
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, (float) 0.5, Explosion.BlockInteraction.BREAK);
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
