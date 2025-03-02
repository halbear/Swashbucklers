package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import hal.studios.hpm.entity.CutterSeatEntity;

public class CutterSailHitboxRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		Entity Cutter = null;
		Entity FrontSeat = null;
		boolean Front = false;
		boolean Back = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:cutter_ship"))) && entity.getPersistentData().getDouble("id") == entityiterator.getPersistentData().getDouble("id")) {
					Cutter = entityiterator;
					if (entityiterator.isVehicle()) {
						Back = false;
					} else {
						Back = true;
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof CutterSeatEntity && entity.getPersistentData().getDouble("id") == entityiterator.getPersistentData().getDouble("id")) {
					FrontSeat = entityiterator;
					if (entityiterator.isVehicle()) {
						Front = false;
					} else {
						Front = true;
					}
				}
			}
		}
		if (Back && !(Cutter == null)) {
			sourceentity.startRiding(Cutter);
		} else if (Front && !(FrontSeat == null)) {
			sourceentity.startRiding(FrontSeat);
		}
	}
}
