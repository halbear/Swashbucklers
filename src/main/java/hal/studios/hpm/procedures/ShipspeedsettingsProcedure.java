package hal.studios.hpm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import hal.studios.hpm.network.HpmModVariables;
import hal.studios.hpm.entity.SwashbucklerupgradedEntity;
import hal.studios.hpm.entity.SwashbucklerEntity;
import hal.studios.hpm.entity.RaftEntity;
import hal.studios.hpm.entity.CutterpiratedamagedEntity;
import hal.studios.hpm.entity.CuttermilitariseddamagedEntity;
import hal.studios.hpm.entity.CuttermilitarisedEntity;
import hal.studios.hpm.entity.CutterdamagedEntity;
import hal.studios.hpm.entity.CutterSailsDamagedEntity;
import hal.studios.hpm.entity.CutterPirateEntity;
import hal.studios.hpm.entity.CutterPirateDamagedSailsEntity;
import hal.studios.hpm.entity.CutterMilitarisedDamagedSailsEntity;
import hal.studios.hpm.entity.CutterEntity;
import hal.studios.hpm.entity.CorvettesteamshipdamagedEntity;
import hal.studios.hpm.entity.CorvetteSteamshipEntity;

@Mod.EventBusSubscriber
public class ShipspeedsettingsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger() && ((entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:small_ship")))
				|| (entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:medium_ship")))
				|| (entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:large_ship"))))) {
			if ((entity.getVehicle()) instanceof SwashbucklerEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.6) {
				{
					double _setval = 0.6;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof SwashbucklerupgradedEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.7) {
				{
					double _setval = 0.7;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof RaftEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.45) {
				{
					double _setval = 0.45;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CutterEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.65) {
				{
					double _setval = 0.55;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CutterdamagedEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.25) {
				{
					double _setval = 0.25;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CutterSailsDamagedEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.25) {
				{
					double _setval = 0.25;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CuttermilitarisedEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.65) {
				{
					double _setval = 0.65;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CutterPirateEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.68) {
				{
					double _setval = 0.68;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CutterpiratedamagedEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.28) {
				{
					double _setval = 0.28;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CuttermilitariseddamagedEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.25) {
				{
					double _setval = 0.25;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CutterMilitarisedDamagedSailsEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.25) {
				{
					double _setval = 0.25;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CutterPirateDamagedSailsEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.25) {
				{
					double _setval = 0.25;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CorvetteSteamshipEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.8) {
				{
					double _setval = 0.8;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) instanceof CorvettesteamshipdamagedEntity && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.4) {
				{
					double _setval = 0.4;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
