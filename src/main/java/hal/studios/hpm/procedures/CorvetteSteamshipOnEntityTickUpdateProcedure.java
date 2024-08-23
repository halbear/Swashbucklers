package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class CorvetteSteamshipOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWaterOrBubble()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.03, (entity.getDeltaMovement().z())));
		}
		world.addParticle(ParticleTypes.LARGE_SMOKE, x, (y + 4), z, 0.1, 0.3, 0.1);
		world.addParticle(ParticleTypes.LARGE_SMOKE, (x + Math.random()), (y + 4), (z + Math.random()), 0.1, 0.2, 0.1);
		world.addParticle(ParticleTypes.LARGE_SMOKE, (x - Math.random()), (y + 4), (z - Math.random()), 0.1, 0.2, 0.1);
		ShipRotationProcedure.execute(world, x, y, z, entity);
	}
}
