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
import net.minecraft.server.level.ServerLevel;

import hal.studios.hpm.init.HpmModItems;
import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.HandCannonEntity;
import hal.studios.hpm.entity.CuttermilitarisedEntity;

public class CannonLeftOnKeyReleasedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger()) {
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HpmModItems.CANNONBALL.get())) : false) {
				if (!world.getEntitiesOfClass(CuttermilitarisedEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.3, 1.3, 1.3), e -> true).isEmpty()) {
					if (world instanceof ServerLevel projectileLevel) {
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
						_entityToSpawn.setPos(x, (y + 1), z);
						_entityToSpawn.shoot((((entity.getVehicle()).getLookAngle().x * 3) / 2), ((entity.getVehicle()).getLookAngle().y * 1), (((entity.getVehicle()).getLookAngle().z * 3) / 2), 4, 0);
						projectileLevel.addFreshEntity(_entityToSpawn);
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
