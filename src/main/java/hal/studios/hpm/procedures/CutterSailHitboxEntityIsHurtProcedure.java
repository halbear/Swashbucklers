package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.Registry;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import hal.studios.hpm.init.HpmModParticleTypes;
import hal.studios.hpm.entity.CutterPirateEntity;

public class CutterSailHitboxEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Repeat = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:cutter_ship_pristine"))) && entityiterator instanceof CutterPirateEntity
						&& entityiterator.getPersistentData().getDouble("id") == entity.getPersistentData().getDouble("id")) {
					Repeat = Math.round(20 * Math.random());
					for (int index0 = 0; index0 < (int) Repeat; index0++) {
						world.addParticle((SimpleParticleType) (HpmModParticleTypes.RIPPED_SAIL_PIRATE.get()), (x + -0.5 + 1 * Math.random()), (y + -1 + 3 * Math.random()), (z + -0.5 + 1 * Math.random()),
								(entity.getDeltaMovement().x() + -1 + 2 * Math.random()), (entity.getDeltaMovement().y() + Math.random()), (entity.getDeltaMovement().z() + -1 + 2 * Math.random()));
					}
					break;
				} else if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:cutter_ship_pristine")))
						&& entityiterator.getPersistentData().getDouble("id") == entity.getPersistentData().getDouble("id")) {
					Repeat = Math.round(20 * Math.random());
					for (int index1 = 0; index1 < (int) Repeat; index1++) {
						world.addParticle((SimpleParticleType) (HpmModParticleTypes.RIPPED_SAIL.get()), (x + -0.5 + 1 * Math.random()), (y + -1 + 3 * Math.random()), (z + -0.5 + 1 * Math.random()),
								(entity.getDeltaMovement().x() + -1 + 2 * Math.random()), (entity.getDeltaMovement().y() + Math.random()), (entity.getDeltaMovement().z() + -1 + 2 * Math.random()));
					}
					break;
				}
			}
		}
	}
}
