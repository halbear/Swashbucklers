package hal.studios.hpm.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.client.Minecraft;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

import hal.studios.hpm.network.HpmModVariables;
import hal.studios.hpm.init.HpmModItems;
import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.HandCannonEntity;

public class FireOnKeyReleasedProcedure {
	public static void execute(LevelAccessor world, double y, Entity entity) {
		if (entity == null)
			return;
		double vectorY = 0;
		double vectorX = 0;
		Entity ship = null;
		if (entity.isPassenger() && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).CanFire) {
			ship = entity.getVehicle();
			if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HpmModItems.CANNONBALL.get())) : false) || new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
					} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
					}
					return false;
				}
			}.checkGamemode(entity)) {
				if (!(entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
						&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("hpm:warfare_achievement"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("hpm:warfare_achievement"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
				}
				if ((entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:front_cannon")))) {
					vectorX = (entity.getVehicle()).getLookAngle().x;
					vectorY = (entity.getVehicle()).getLookAngle().z;
					if (world instanceof ServerLevel projectileLevel) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new HandCannonEntity(HpmModEntities.HAND_CANNON.get(), level);
								entityToSpawn.setOwner(shooter);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, (entity.getVehicle()), 4, 0, (byte) 2);
						_entityToSpawn.setPos(((entity.getVehicle()).getX() + (entity.getVehicle()).getLookAngle().x * 2 * 2), (y + 1), ((entity.getVehicle()).getZ() + (entity.getVehicle()).getLookAngle().z * 2 * 2));
						_entityToSpawn.shoot(vectorX, 0.1, vectorY, 3, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
					{
						boolean _setval = false;
						entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.CanFire = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					for (int index0 = 0; index0 < 15; index0++) {
						for (int index1 = 0; index1 < 3; index1++) {
							world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, ((entity.getVehicle()).getX() + (entity.getVehicle()).getLookAngle().x * 2 * 2), (y + 1),
									((entity.getVehicle()).getZ() + (entity.getVehicle()).getLookAngle().z * 2 * 2), ((entity.getVehicle()).getLookAngle().x * 2 * 1 * 0.5 * (0.7 + 0.3 * Math.random())), (-0.1 + 0.2 * Math.random()),
									((entity.getVehicle()).getLookAngle().z * 2 * 1 * 0.5 * (0.7 + 0.3 * Math.random())));
						}
						world.addParticle(ParticleTypes.LARGE_SMOKE, ((entity.getVehicle()).getX() + (entity.getVehicle()).getLookAngle().x * 2 * 2), (y + 1), ((entity.getVehicle()).getZ() + (entity.getVehicle()).getLookAngle().z * 2 * 2),
								((entity.getVehicle()).getLookAngle().x * 2 * 1 * 0.3 * Math.random()), (-0.1 + 0.2 * Math.random()), ((entity.getVehicle()).getLookAngle().z * 2 * 1 * 0.3 * Math.random()));
						world.addParticle(ParticleTypes.FLAME, ((entity.getVehicle()).getX() + (entity.getVehicle()).getLookAngle().x * 2 * 2), (y + 1), ((entity.getVehicle()).getZ() + (entity.getVehicle()).getLookAngle().z * 2 * 2),
								((entity.getVehicle()).getLookAngle().x * 2 * 1 * 0.1 * Math.random()), (-0.1 + 0.2 * Math.random()), ((entity.getVehicle()).getLookAngle().z * 2 * 1 * 0.1 * Math.random()));
					}
					if (new Object() {
						public boolean checkGamemode(Entity _ent) {
							if (_ent instanceof ServerPlayer _serverPlayer) {
								return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SURVIVAL;
							} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
								return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
										&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SURVIVAL;
							}
							return false;
						}
					}.checkGamemode(entity)) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(HpmModItems.CANNONBALL.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
						}
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							{
								boolean _setval = true;
								entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.CanFire = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 20);
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Missing cannon ammunition"), true);
			}
		} else if (!(entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).CanFire
				&& (entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:front_cannon")))) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent("Cannon on cooldown"), true);
		}
	}
}
