package hal.studios.hpm.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

import hal.studios.hpm.init.HpmModItems;
import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.CutterSeatEntity;
import hal.studios.hpm.entity.CutterSailHitboxEntity;
import hal.studios.hpm.entity.CutterPassengerEntity;

public class CutterEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double itemiterator = 0;
		double iterator = 0;
		boolean Passenger = false;
		boolean Seat = false;
		boolean sail = false;
		boolean pilotexists = false;
		Entity Pilot = null;
		Entity Cutter = null;
		Entity NewShip = null;
		SplinterParticlesProcedure.execute(world, x, y, z, entity);
		if (sourceentity.isShiftKeyDown() && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HpmModItems.SPANNER.get()) {
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, itemstackiterator);
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HpmModItems.CUTTERITEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (!entity.level.isClientSide())
				entity.discard();
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HpmModItems.SPANNER.get()) {
			Passenger = false;
			Seat = false;
			sail = false;
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof CutterPassengerEntity && entityiterator.getPersistentData().getDouble("id") == entity.getPersistentData().getDouble("id")) {
						Passenger = true;
					}
					if (entityiterator instanceof CutterSeatEntity && entityiterator.getPersistentData().getDouble("id") == entity.getPersistentData().getDouble("id")) {
						Seat = true;
					}
					if (entityiterator instanceof CutterSailHitboxEntity && entityiterator.getPersistentData().getDouble("id") == entity.getPersistentData().getDouble("id")) {
						sail = true;
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
			if (sail == false) {
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
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof CutterSailHitboxEntity && !sail) {
							if (0 == entityiterator.getPersistentData().getDouble("id")) {
								entityiterator.getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
								sail = true;
							}
						}
					}
				}
				if (sourceentity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Ship Front Hitbox repaired"), true);
			}
		}
	}
}
