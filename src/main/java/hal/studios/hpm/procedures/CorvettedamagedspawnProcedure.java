package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import hal.studios.hpm.init.HpmModEntities;
import hal.studios.hpm.entity.CorvettesteamshipdamagedEntity;

public class CorvettedamagedspawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CorvettesteamshipdamagedEntity(HpmModEntities.CORVETTESTEAMSHIPDAMAGED.get(), _level);
			entityToSpawn.moveTo(x, y, z, entity.getYRot(), 0);
			entityToSpawn.setYBodyRot(entity.getYRot());
			entityToSpawn.setYHeadRot(entity.getYRot());
			entityToSpawn.setDeltaMovement(0, 0, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CorvettesteamshipdamagedEntity && entityiterator.getPersistentData().getDouble("id") == 0) {
					entityiterator.getPersistentData().putDouble("id", (entity.getPersistentData().getDouble("id")));
				}
			}
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, (y + 1), z, 3, Explosion.BlockInteraction.NONE);
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
