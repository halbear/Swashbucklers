package hal.studios.hpm.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

public class CorvetteSteamshipOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double yawStart = 0;
		double size = 0;
		Entity followedEntity = null;
		world.addParticle(ParticleTypes.LARGE_SMOKE, (entity.getX() - entity.getLookAngle().x * 2 * 1), (y + 4), (entity.getZ() - entity.getLookAngle().z * 2 * 1), 0.1, 0.3, 0.1);
		world.addParticle(ParticleTypes.LARGE_SMOKE, ((entity.getX() - entity.getLookAngle().x * 2 * 1) - Math.random()), (y + 4), ((entity.getZ() - entity.getLookAngle().z * 2 * 1) - Math.random()), 0.1, 0.2, 0.1);
		world.addParticle(ParticleTypes.LARGE_SMOKE, ((entity.getX() - entity.getLookAngle().x * 2 * 1) - Math.random()), (y + 4), ((entity.getZ() - entity.getLookAngle().z * 2 * 1) - Math.random()), 0.1, 0.2, 0.1);
		SmallShipBuoyancyProcedure.execute(world, x, y, z, entity);
		ShipRotationProcedure.execute(world, x, y, z, entity);
	}
}
