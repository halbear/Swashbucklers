package hal.studios.hpm.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import hal.studios.hpm.network.HpmModVariables;

public class SailspeeddowntoggleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger() && (entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("hpm:ship")))) {
			if ((entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).sailspeed > -40) {
				{
					boolean _setval = true;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.sailspeeddown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
