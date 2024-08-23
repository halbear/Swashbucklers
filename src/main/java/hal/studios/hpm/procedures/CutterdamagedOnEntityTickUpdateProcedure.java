package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CutterdamagedOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x - Math.random()), y, (z - Math.random()), 0.03, 0.1, 0.03);
		if ((world.getBlockState(new BlockPos(x, y + 0.425, z))).getBlock() == Blocks.WATER) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.03, (entity.getDeltaMovement().z())));
		}
	}
}
