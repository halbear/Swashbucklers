package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Iterator;
import java.util.Comparator;

import hal.studios.hpm.network.HpmModVariables;
import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.CutterSeatEntity;
import hal.studios.hpm.entity.CutterPassengerEntity;

public class CutterSailsDamagedRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		boolean Seat = false;
		boolean sail = false;
		boolean Passenger = false;
		{
			double _setval = entity.getYRot();
			sourceentity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.shipyaw = _setval;
				capability.syncPlayerVariables(sourceentity);
			});
		}
		if (!(sourceentity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel && _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("hpm:cutter_achievement"))).isDone())) {
			if (sourceentity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("hpm:cutter_achievement"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
		Passenger = false;
		sail = false;
		Seat = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CutterPassengerEntity && entityiterator.getPersistentData().getDouble("id") == entity.getPersistentData().getDouble("id")) {
					Passenger = true;
				}
				if (entityiterator instanceof CutterSeatEntity && entityiterator.getPersistentData().getDouble("id") == entity.getPersistentData().getDouble("id")) {
					Seat = true;
				}
			}
		}
		if (Seat == false) {
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
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof CutterSeatEntity && !Seat) {
						if (0 == entityiterator.getPersistentData().getDouble("id")) {
							entityiterator.getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
							Seat = true;
						}
					}
				}
			}
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Ship 2nd seat repaired"), true);
		}
		if (Passenger == false) {
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
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof CutterPassengerEntity && !Passenger) {
						if (0 == entityiterator.getPersistentData().getDouble("id")) {
							entityiterator.getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
							Passenger = true;
						}
					}
				}
			}
			if (sourceentity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Ship Front Hitbox repaired"), true);
		}
	}
}
