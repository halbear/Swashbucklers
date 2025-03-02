package hal.studios.hpm.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;

import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Comparator;

import hal.studios.hpm.network.HpmModVariables;
import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.CuttermilitarisedEntity;
import hal.studios.hpm.entity.CutterSailsDamagedEntity;
import hal.studios.hpm.entity.CutterPirateEntity;
import hal.studios.hpm.entity.CutterPirateDamagedSailsEntity;
import hal.studios.hpm.entity.CutterMilitarisedDamagedSailsEntity;
import hal.studios.hpm.entity.CutterEntity;

public class CutterSailHitboxEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double iterator = 0;
		Entity NewShip = null;
		Entity Pilot = null;
		Entity Cutter = null;
		boolean pilotexists = false;
		boolean Cuttermaritime = false;
		boolean CutterWeaponised = false;
		boolean CutterPirate = false;
		Cuttermaritime = false;
		CutterWeaponised = false;
		CutterPirate = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CutterEntity && entity.getPersistentData().getDouble("id") == entityiterator.getPersistentData().getDouble("id")) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new CutterSailsDamagedEntity(HpmModEntities.CUTTER_SAILS_DAMAGED.get(), _level);
						entityToSpawn.moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), entityiterator.getYRot(), 0);
						entityToSpawn.setYBodyRot(entityiterator.getYRot());
						entityToSpawn.setYHeadRot(entityiterator.getYRot());
						entityToSpawn.setDeltaMovement((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z()));
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(CutterSailsDamagedEntity.class, AABB.ofSize(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()))).findFirst().orElse(null)).getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
					Cutter = entityiterator;
					Cuttermaritime = true;
				}
				if (entityiterator instanceof CutterPirateEntity && entity.getPersistentData().getDouble("id") == entityiterator.getPersistentData().getDouble("id")) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new CutterPirateDamagedSailsEntity(HpmModEntities.CUTTER_PIRATE_DAMAGED_SAILS.get(), _level);
						entityToSpawn.moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), entityiterator.getYRot(), 0);
						entityToSpawn.setYBodyRot(entityiterator.getYRot());
						entityToSpawn.setYHeadRot(entityiterator.getYRot());
						entityToSpawn.setDeltaMovement((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z()));
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(CutterPirateDamagedSailsEntity.class, AABB.ofSize(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()))).findFirst().orElse(null)).getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
					if ((entityiterator.getPersistentData().getString("owner")).equals("player")) {
						((Entity) world.getEntitiesOfClass(CutterPirateDamagedSailsEntity.class, AABB.ofSize(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), 1, 1, 1), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()))).findFirst().orElse(null)).getPersistentData().putString("owner", "player");
					}
					Cutter = entityiterator;
					CutterPirate = true;
				}
				if (entityiterator instanceof CuttermilitarisedEntity && entity.getPersistentData().getDouble("id") == entityiterator.getPersistentData().getDouble("id")) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new CutterMilitarisedDamagedSailsEntity(HpmModEntities.CUTTER_MILITARISED_DAMAGED_SAILS.get(), _level);
						entityToSpawn.moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), entityiterator.getYRot(), 0);
						entityToSpawn.setYBodyRot(entityiterator.getYRot());
						entityToSpawn.setYHeadRot(entityiterator.getYRot());
						entityToSpawn.setDeltaMovement((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z()));
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(CutterMilitarisedDamagedSailsEntity.class, AABB.ofSize(new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()))).findFirst().orElse(null)).getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
					Cutter = entityiterator;
					CutterWeaponised = true;
				}
			}
		}
		pilotexists = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (Cuttermaritime && entityiterator instanceof CutterSailsDamagedEntity && entity.getPersistentData().getDouble("id") == entityiterator.getPersistentData().getDouble("id")) {
					NewShip = entityiterator;
				}
				if (CutterWeaponised && entityiterator instanceof CutterMilitarisedDamagedSailsEntity && entity.getPersistentData().getDouble("id") == entityiterator.getPersistentData().getDouble("id")) {
					NewShip = entityiterator;
				}
				if (CutterPirate && entityiterator instanceof CutterPirateDamagedSailsEntity && entity.getPersistentData().getDouble("id") == entityiterator.getPersistentData().getDouble("id")) {
					NewShip = entityiterator;
				}
				if (entityiterator instanceof ServerPlayer
						&& (entityiterator.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).shipPilotingID == entity.getPersistentData().getDouble("id")) {
					Pilot = entityiterator;
					pilotexists = true;
				}
			}
		}
		if (!(Cutter.getDisplayName().getString()).equals("cutter")) {
			NewShip.setCustomName(new TextComponent((Cutter.getDisplayName().getString())));
		}
		if (NewShip instanceof LivingEntity _entity)
			_entity.setHealth(Cutter instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
		iterator = 0;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			Cutter.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					{
						final int _slotid = (int) iterator;
						final ItemStack _setstack = (new Object() {
							public ItemStack getItemStack(int sltid, Entity entity) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
								return _retval.get();
							}
						}.getItemStack((int) iterator, Cutter));
						_setstack.setCount((itemstackiterator).getCount());
						NewShip.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable _modHandler)
								_modHandler.setStackInSlot(_slotid, _setstack);
						});
					}
					iterator = iterator + 1;
				}
			}
		}
		if (pilotexists) {
			Pilot.startRiding(NewShip);
		}
		if (!Cutter.level.isClientSide())
			Cutter.discard();
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
