package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import hal.studios.hpm.network.HpmModVariables;
import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.CutterSeatEntity;
import hal.studios.hpm.entity.CutterPassengerEntity;

public class CutterpirateoninitialspawnProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(100);
		entity.getPersistentData().putDouble("id", HpmModVariables.MapVariables.get(world).IDcounter);
		HpmModVariables.MapVariables.get(world).IDcounter = HpmModVariables.MapVariables.get(world).IDcounter + 1;
		HpmModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CutterPassengerEntity(HpmModEntities.CUTTER_PASSENGER.get(), _level);
			entityToSpawn.moveTo((entity.getX() + entity.getLookAngle().x * 2 * 1), y, (entity.getZ() + entity.getLookAngle().z * 2 * 1), entity.getYRot(), entity.getXRot());
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		{
			final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * 2 * 1), y, (entity.getZ() + entity.getLookAngle().z * 2 * 1));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CutterPassengerEntity) {
					if (0 == entityiterator.getPersistentData().getDouble("id")) {
						entityiterator.getPersistentData().putDouble("id", (HpmModVariables.MapVariables.get(world).IDcounter - 1));
					}
				}
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CutterSeatEntity(HpmModEntities.CUTTER_SEAT.get(), _level);
			entityToSpawn.moveTo((entity.getX() + entity.getLookAngle().x * 2 * 1), y, (entity.getZ() + entity.getLookAngle().z * 2 * 1), entity.getYRot(), entity.getXRot());
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		{
			final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * 2 * 1), y, (entity.getZ() + entity.getLookAngle().z * 2 * 1));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CutterSeatEntity) {
					if (0 == entityiterator.getPersistentData().getDouble("id")) {
						entityiterator.getPersistentData().putDouble("id", (HpmModVariables.MapVariables.get(world).IDcounter - 1));
					}
				}
			}
		}
	}
}
