package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import hal.studios.hpm.entity.CutterpiratedamagedEntity;

public class CutterpiratedamagedNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getEntitiesOfClass(CutterpiratedamagedEntity.class, AABB.ofSize(new Vec3(x, y, z), 64, 64, 64), e -> true).isEmpty() == false) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WATER
					|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER && (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.AIR) {
				return true;
			}
		}
		return false;
	}
}
