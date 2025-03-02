package hal.studios.hpm.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityAnchorArgument;

public class ChildEntitySmoothingProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double good_direction = 0;
		double real_direction = 0;
		if (!(null == (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null))) {
			real_direction = entity.getYRot();
			entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX()), ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY()),
					((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ())));
			good_direction = entity.getYRot();
			{
				Entity _ent = entity;
				_ent.setYRot((float) real_direction);
				_ent.setXRot(0);
				_ent.setYBodyRot(_ent.getYRot());
				_ent.setYHeadRot(_ent.getYRot());
				_ent.yRotO = _ent.getYRot();
				_ent.xRotO = _ent.getXRot();
				if (_ent instanceof LivingEntity _entity) {
					_entity.yBodyRotO = _entity.getYRot();
					_entity.yHeadRotO = _entity.getYRot();
				}
			}
			if (Math.abs(good_direction - real_direction) > Math.abs((good_direction + 360) - real_direction)) {
				good_direction = good_direction + 360;
			} else if (Math.abs(good_direction - real_direction) > Math.abs((good_direction - 360) - real_direction)) {
				good_direction = good_direction - 360;
			}
			return good_direction - real_direction;
		}
		return 0;
	}
}
