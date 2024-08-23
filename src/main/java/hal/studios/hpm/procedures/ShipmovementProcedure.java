package hal.studios.hpm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import hal.studios.hpm.network.HpmModVariables;

@Mod.EventBusSubscriber
public class ShipmovementProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger() && ((entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:large_ship")))
				|| (entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:medium_ship")))
				|| (entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:small_ship"))))) {
			if ((entity.getVehicle()).isInWaterOrBubble()) {
				(entity.getVehicle()).setDeltaMovement(new Vec3(
						(HpmModVariables.WorldVariables.get(world).shipspeedmultiplier * (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed
								* ((entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).sailspeed / 100) * (entity.getVehicle()).getLookAngle().x),
						((entity.getVehicle()).getDeltaMovement().y()),
						(HpmModVariables.WorldVariables.get(world).shipspeedmultiplier * (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed
								* ((entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).sailspeed / 100) * (entity.getVehicle()).getLookAngle().z)));
			}
		}
	}
}
