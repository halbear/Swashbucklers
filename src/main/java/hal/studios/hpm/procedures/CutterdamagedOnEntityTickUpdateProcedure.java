package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CutterdamagedOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double yawStart = 0;
		Entity followedEntity = null;
		if (entity.getPersistentData().getDouble("SmokePos") == 0) {
			entity.getPersistentData().putDouble("SmokePos", (-1.2 + 4.4 * Math.random()));
		}
		world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, ((entity.getX() + entity.getLookAngle().x * entity.getPersistentData().getDouble("SmokePos") * 1) - Math.random()), y,
				((entity.getZ() + entity.getLookAngle().z * entity.getPersistentData().getDouble("SmokePos") * 1) - Math.random()), 0.03, 0.1, 0.03);
		if ((world.getBlockState(new BlockPos(x, y + 0.425, z))).getBlock() == Blocks.WATER || (world.getBlockState(new BlockPos(x, y + 0.425, z))).getBlock() instanceof SimpleWaterloggedBlock
				&& (world.getBlockState(new BlockPos(x, y + 0.425, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp14 && (world.getBlockState(new BlockPos(x, y + 0.425, z))).getValue(_getbp14)) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.03, (entity.getDeltaMovement().z())));
		}
		ShipRotationProcedure.execute(world, x, y, z, entity);
	}
}
