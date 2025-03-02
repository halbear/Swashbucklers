package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;

import hal.studios.hpm.init.HpmModParticleTypes;

public class SplinterParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Repeat = 0;
		Repeat = Math.round(20 * Math.random());
		for (int index0 = 0; index0 < (int) Repeat; index0++) {
			world.addParticle((SimpleParticleType) (HpmModParticleTypes.SPLINTERS.get()), (x + -1 + 2 * Math.random()), (y + -1 + 3 * Math.random()), (z + -1 + 2 * Math.random()), (entity.getDeltaMovement().x() + -0.3 + 0.6 * Math.random()),
					(entity.getDeltaMovement().y() + Math.random()), (entity.getDeltaMovement().z() + -0.3 + 0.6 * Math.random()));
		}
		for (int index1 = 0; index1 < (int) Repeat; index1++) {
			world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + -0.5 + 1 * Math.random()), (y + -0.5 + 1 * Math.random()), (z + -0.5 + 1 * Math.random()), (entity.getDeltaMovement().x() + -0.05 + 0.1 * Math.random()),
					(entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + -0.05 + 0.1 * Math.random()));
		}
		Repeat = Math.round(13 * Math.random());
		for (int index2 = 0; index2 < (int) Repeat; index2++) {
			world.addParticle((SimpleParticleType) (HpmModParticleTypes.PLANK_SPLINTER.get()), (x + -1 + 2 * Math.random()), (y + -1 + 3 * Math.random()), (z + -1 + 2 * Math.random()), (entity.getDeltaMovement().x() + -0.3 + 0.6 * Math.random()),
					(entity.getDeltaMovement().y() + Math.random()), (entity.getDeltaMovement().z() + -0.3 + 0.6 * Math.random()));
		}
	}
}
