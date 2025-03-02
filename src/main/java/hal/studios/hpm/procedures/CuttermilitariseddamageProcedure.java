package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;

import java.util.Comparator;

import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.WoodDebrisEntity;
import hal.studios.hpm.entity.CuttermilitariseddamagedEntity;
import hal.studios.hpm.entity.BarrelDebrisEntity;

public class CuttermilitariseddamageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double ItemIterator = 0;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CuttermilitariseddamagedEntity(HpmModEntities.CUTTERMILITARISEDDAMAGED.get(), _level);
			entityToSpawn.moveTo(x, y, z, entity.getYRot(), 0);
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		((Entity) world.getEntitiesOfClass(CuttermilitariseddamagedEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
		if (!(entity.getDisplayName().getString()).equals("cutter")) {
			((Entity) world.getEntitiesOfClass(CuttermilitariseddamagedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)).setCustomName(new TextComponent((entity.getDisplayName().getString())));
		}
		for (int index0 = 0; index0 < Math.round(2 + 4 * Math.random()); index0++) {
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
