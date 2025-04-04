package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class SmallShipBuoyancyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y + 0.3, z))).getBlock() instanceof LiquidBlock || (world.getBlockState(new BlockPos(x, y + 0.3, z))).getBlock() instanceof SimpleWaterloggedBlock
				&& ((world.getBlockState(new BlockPos(x, y + 0.3, z))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp5 && (world.getBlockState(new BlockPos(x, y + 0.3, z))).getValue(_getbp5)) == true) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0.03, (entity.getDeltaMovement().z())));
		}
		ShipRotationProcedure.execute(world, x, y, z, entity);
	}
}
