package hal.studios.hpm.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import javax.annotation.Nullable;

import java.util.Comparator;

import hal.studios.hpm.network.HpmModVariables;
import hal.studios.hpm.entity.SwashbucklerupgradedEntity;
import hal.studios.hpm.entity.SwashbucklerEntity;
import hal.studios.hpm.entity.RaftEntity;
import hal.studios.hpm.entity.CuttermilitariseddamagedEntity;
import hal.studios.hpm.entity.CuttermilitarisedEntity;
import hal.studios.hpm.entity.CutterdamagedEntity;
import hal.studios.hpm.entity.CutterEntity;
import hal.studios.hpm.entity.CorvettesteamshipdamagedEntity;
import hal.studios.hpm.entity.CorvetteSteamshipEntity;

@Mod.EventBusSubscriber
public class ShipspeedsettingsProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.isPassenger() && ((entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:small_ship")))
				|| (entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:medium_ship")))
				|| (entity.getVehicle()).getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("forge:large_ship"))))) {
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(SwashbucklerEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.6) {
				{
					double _setval = 0.6;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(SwashbucklerupgradedEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.7) {
				{
					double _setval = 0.7;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(RaftEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.45) {
				{
					double _setval = 0.45;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(CutterEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.65) {
				{
					double _setval = 0.55;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(CutterdamagedEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.25) {
				{
					double _setval = 0.25;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(CuttermilitarisedEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.65) {
				{
					double _setval = 0.65;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(CuttermilitariseddamagedEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.25) {
				{
					double _setval = 0.25;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(CorvetteSteamshipEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.8) {
				{
					double _setval = 0.8;
					entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.maxspeed = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getVehicle()) == ((Entity) world.getEntitiesOfClass(CorvettesteamshipdamagedEntity.class, AABB.ofSize(new Vec3(x, y, z), 2, 2, 2), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) && (entity.getCapability(HpmModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HpmModVariables.PlayerVariables())).maxspeed != 0.4) {
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
