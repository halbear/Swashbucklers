package hal.studios.hpm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import hal.studios.hpm.network.HpmModVariables;

@Mod.EventBusSubscriber
public class ShipIDRegisterToPlayerProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getPlayer().getUsedItemHand())
			return;
		execute(event, event.getWorld(), event.getTarget(), event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("hpm:ship"))) || entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:small_ship")))
				|| entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:medium_ship"))) || entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:large_ship")))) {
			if (entity.getPersistentData().getDouble("id") == 0) {
				entity.getPersistentData().putDouble("id", HpmModVariables.MapVariables.get(world).IDcounter);
				HpmModVariables.MapVariables.get(world).IDcounter = HpmModVariables.MapVariables.get(world).IDcounter + 1;
				HpmModVariables.MapVariables.get(world).syncData(world);
			}
			{
				double _setval = entity.getPersistentData().getDouble("id");
				sourceentity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.shipPilotingID = _setval;
					capability.syncPlayerVariables(sourceentity);
				});
			}
		}
	}
}
