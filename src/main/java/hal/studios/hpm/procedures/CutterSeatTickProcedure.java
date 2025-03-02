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

public class CutterSeatTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity Parent = null;
		double size = 0;
		double X = 0;
		double Z = 0;
		size = 1.8;
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
			if (Parent.getDeltaMovement().x() > 0.01 || Parent.getDeltaMovement().x() < -0.01 || Parent.getDeltaMovement().z() > 0.01 || Parent.getDeltaMovement().z() < -0.01) {
				size = 1.8;
				entity.setDeltaMovement(new Vec3((Parent.getDeltaMovement().x() + ((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)) - x) / 1), (Parent.getDeltaMovement().y() + ((Parent.getY() + 0.9) - y) / 1),
						(Parent.getDeltaMovement().z() + ((Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)) - z) / 1)));
				if (entity.getX() > Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1) + 0.2 || entity.getX() < (Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)) - 0.2
						|| entity.getZ() > Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1) + 0.2 || entity.getZ() < (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)) - 0.2) {
					{
						Entity _ent = entity;
						_ent.teleportTo((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (entity.getY()), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (entity.getY()), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)), _ent.getYRot(), _ent.getXRot());
					}
				}
				if (entity.getY() > Parent.getY() + 1.2 || entity.getY() < Parent.getY() + 0.6) {
					{
						Entity _ent = entity;
						_ent.teleportTo((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (Parent.getY() + 0.9), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (Parent.getY() + 0.9), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)), _ent.getYRot(), _ent.getXRot());
					}
				}
			} else {
				if (entity.getX() > Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1) + 0.05 || entity.getX() < (Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)) - 0.05
						|| entity.getZ() > Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1) + 0.05 || entity.getZ() < (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)) - 0.05) {
					{
						Entity _ent = entity;
						_ent.teleportTo((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (entity.getY()), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((Parent.getX() + Parent.getLookAngle().x * 2 * (size - 1)), (entity.getY()), (Parent.getZ() + Parent.getLookAngle().z * 2 * (size - 1)), _ent.getYRot(), _ent.getXRot());
					}
				}
				if (entity.getY() > Parent.getY() + 1.05 || entity.getY() < Parent.getY() + 0.75) {
					{
						Entity _ent = entity;
						_ent.teleportTo((entity.getX()), (Parent.getY() + 0.9), (entity.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getX()), (Parent.getY() + 0.9), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
					}
				}
				entity.setDeltaMovement(new Vec3(0, (Parent.getDeltaMovement().y() + ((Parent.getY() + 0.9) - y) / 10), 0));
			}
		} else {
			if (!entity.level.isClientSide())
				entity.discard();
		}
	}
}
