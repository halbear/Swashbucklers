package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import hal.studios.hpm.network.HpmModVariables;
import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.CutterSeatEntity;
import hal.studios.hpm.entity.CutterSailHitboxEntity;
import hal.studios.hpm.entity.CutterPirateEntity;
import hal.studios.hpm.entity.CutterPassengerEntity;

public class CutterOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean seat = false;
		boolean passenger = false;
		boolean sail = false;
		if (!world.getEntitiesOfClass(ServerPlayer.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).isEmpty()) {
			entity.getPersistentData().putString("owner", "player");
		}
		seat = false;
		passenger = false;
		sail = false;
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(50);
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
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CutterPassengerEntity && !passenger) {
					if (0 == entityiterator.getPersistentData().getDouble("id")) {
						entityiterator.getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
						if (entity instanceof CutterPirateEntity) {
							entityiterator.getPersistentData().putBoolean("pirate", true);
						} else {
							entityiterator.getPersistentData().putBoolean("pirate", false);
						}
						passenger = true;
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
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CutterSeatEntity && !seat) {
					if (0 == entityiterator.getPersistentData().getDouble("id")) {
						entityiterator.getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
						if (entity instanceof CutterPirateEntity) {
							entityiterator.getPersistentData().putBoolean("pirate", true);
						} else {
							entityiterator.getPersistentData().putBoolean("pirate", false);
						}
						seat = true;
					}
				}
			}
		}
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CutterSailHitboxEntity(HpmModEntities.CUTTER_SAIL_HITBOX.get(), _level);
			entityToSpawn.moveTo((entity.getX() + entity.getLookAngle().x * 2 * 1.5), (y + 1.4), (entity.getZ() + entity.getLookAngle().z * 2 * 1.5), entity.getYRot(), entity.getXRot());
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		{
			final Vec3 _center = new Vec3((entity.getX() + entity.getLookAngle().x * 2 * 1.5), (y + 1.4), (entity.getZ() + entity.getLookAngle().z * 2 * 1.5));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CutterSailHitboxEntity && !sail) {
					if (0 == entityiterator.getPersistentData().getDouble("id")) {
						entityiterator.getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
						if (entity instanceof CutterPirateEntity) {
							entityiterator.getPersistentData().putBoolean("pirate", true);
						} else {
							entityiterator.getPersistentData().putBoolean("pirate", false);
						}
						sail = true;
					}
				}
			}
		}
	}
}
