package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import hal.studios.hpm.init.HpmModItems;
import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.SwashbucklerupgradedEntity;
import hal.studios.hpm.entity.HandCannonEntity;
import hal.studios.hpm.entity.CuttermilitarisedEntity;

public class FireOnKeyReleasedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HpmModItems.CANNONBALL.get())) : false) {
				if (!world.getEntitiesOfClass(SwashbucklerupgradedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.3, 1.3, 1.3), e -> true).isEmpty()) {
					{
						Entity _shootFrom = (entity.getVehicle());
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new HandCannonEntity(HpmModEntities.HAND_CANNON.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setSecondsOnFire(100);
									entityToSpawn.setCritArrow(true);
									entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, (entity.getVehicle()), 4, 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HpmModItems.CANNONBALL.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
		if (entity.isPassenger()) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HpmModItems.CANNONBALL.get())) : false) {
				if (!world.getEntitiesOfClass(CuttermilitarisedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.3, 1.3, 1.3), e -> true).isEmpty()) {
					{
						Entity _shootFrom = (entity.getVehicle());
						Level projectileLevel = _shootFrom.level;
						if (!projectileLevel.isClientSide()) {
							Projectile _entityToSpawn = new Object() {
								public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
									AbstractArrow entityToSpawn = new HandCannonEntity(HpmModEntities.HAND_CANNON.get(), level);
									entityToSpawn.setOwner(shooter);
									entityToSpawn.setBaseDamage(damage);
									entityToSpawn.setKnockback(knockback);
									entityToSpawn.setSilent(true);
									entityToSpawn.setSecondsOnFire(100);
									entityToSpawn.setCritArrow(true);
									entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
									return entityToSpawn;
								}
							}.getArrow(projectileLevel, (entity.getVehicle()), 4, 0);
							_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
							_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4, 0);
							projectileLevel.addFreshEntity(_entityToSpawn);
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(HpmModItems.CANNONBALL.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
			}
		}
	}
}
