package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class CutterPassengerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double size = 0;
		Entity Parent = null;
		size = 2;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:cutter_ship")))) {
					if (entityiterator.getPersistentData().getDouble("id") == entity.getPersistentData().getDouble("id")) {
						Parent = entityiterator;
					}
				}
			}
		}
		if (!(Parent == null)) {
			if (Parent.getDeltaMovement().x() > 0 || Parent.getDeltaMovement().x() < 0 || Parent.getDeltaMovement().z() > 0 || Parent.getDeltaMovement().z() < 0) {
				size = 2.2;
			}
			entity.setDeltaMovement(new Vec3((Parent.getDeltaMovement().x()), (Parent.getDeltaMovement().y() + ((Parent.getY() + 0) - y) / 1), (Parent.getDeltaMovement().z())));
			{
				Entity _ent = entity;
				_ent.teleportTo((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (entity.getY()), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (entity.getY()), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)), _ent.getYRot(), _ent.getXRot());
			}
			if (entity.getY() > Parent.getY() + 0.4 || entity.getY() < Parent.getY() - 0.4) {
				{
					Entity _ent = entity;
					_ent.teleportTo((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (Parent.getY()), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (Parent.getY()), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)), _ent.getYRot(), _ent.getXRot());
				}
				entity.setDeltaMovement(new Vec3((Parent.getDeltaMovement().x()), (Parent.getDeltaMovement().y()), (Parent.getDeltaMovement().z())));
			}
		} else {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
