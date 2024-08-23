
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import hal.studios.hpm.entity.WreckedswashbucklerupgradeEntity;
import hal.studios.hpm.entity.SwashbucklerupgradedEntity;
import hal.studios.hpm.entity.SwashbucklerEntity;
import hal.studios.hpm.entity.ShipwreckswashbucklerEntity;
import hal.studios.hpm.entity.ShipwreckedraftEntity;
import hal.studios.hpm.entity.RaftEntity;
import hal.studios.hpm.entity.HandCannonEntity;
import hal.studios.hpm.entity.CutterwreckfrontEntity;
import hal.studios.hpm.entity.CutterwreckbackEntity;
import hal.studios.hpm.entity.CutterpiratewreckEntity;
import hal.studios.hpm.entity.CutterpiratedamagedEntity;
import hal.studios.hpm.entity.CuttermilitariseddamagedEntity;
import hal.studios.hpm.entity.CuttermilitarisedEntity;
import hal.studios.hpm.entity.CutterdamagedEntity;
import hal.studios.hpm.entity.CutterPirateEntity;
import hal.studios.hpm.entity.CutterEntity;
import hal.studios.hpm.entity.CorvettesteamshipdamagedEntity;
import hal.studios.hpm.entity.CorvetteSteamshipEntity;
import hal.studios.hpm.HpmMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HpmModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, HpmMod.MODID);
	public static final RegistryObject<EntityType<SwashbucklerEntity>> SWASHBUCKLER = register("swashbuckler",
			EntityType.Builder.<SwashbucklerEntity>of(SwashbucklerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SwashbucklerEntity::new)

					.sized(1.5f, 0.45f));
	public static final RegistryObject<EntityType<SwashbucklerupgradedEntity>> SWASHBUCKLERUPGRADED = register("swashbucklerupgraded",
			EntityType.Builder.<SwashbucklerupgradedEntity>of(SwashbucklerupgradedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(SwashbucklerupgradedEntity::new)

					.sized(1.3f, 0.45f));
	public static final RegistryObject<EntityType<HandCannonEntity>> HAND_CANNON = register("projectile_hand_cannon",
			EntityType.Builder.<HandCannonEntity>of(HandCannonEntity::new, MobCategory.MISC).setCustomClientFactory(HandCannonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShipwreckswashbucklerEntity>> SHIPWRECKSWASHBUCKLER = register("shipwreckswashbuckler", EntityType.Builder.<ShipwreckswashbucklerEntity>of(ShipwreckswashbucklerEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShipwreckswashbucklerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RaftEntity>> RAFT = register("raft",
			EntityType.Builder.<RaftEntity>of(RaftEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RaftEntity::new)

					.sized(2f, 0.4f));
	public static final RegistryObject<EntityType<ShipwreckedraftEntity>> SHIPWRECKEDRAFT = register("shipwreckedraft", EntityType.Builder.<ShipwreckedraftEntity>of(ShipwreckedraftEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ShipwreckedraftEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WreckedswashbucklerupgradeEntity>> WRECKEDSWASHBUCKLERUPGRADE = register("wreckedswashbucklerupgrade",
			EntityType.Builder.<WreckedswashbucklerupgradeEntity>of(WreckedswashbucklerupgradeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(WreckedswashbucklerupgradeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CutterEntity>> CUTTER = register("cutter",
			EntityType.Builder.<CutterEntity>of(CutterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CutterEntity::new)

					.sized(1.8f, 0.7f));
	public static final RegistryObject<EntityType<CutterwreckfrontEntity>> CUTTERWRECKFRONT = register("cutterwreckfront", EntityType.Builder.<CutterwreckfrontEntity>of(CutterwreckfrontEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CutterwreckfrontEntity::new).fireImmune().sized(1.5f, 1.8f));
	public static final RegistryObject<EntityType<CutterwreckbackEntity>> CUTTERWRECKBACK = register("cutterwreckback", EntityType.Builder.<CutterwreckbackEntity>of(CutterwreckbackEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CutterwreckbackEntity::new).fireImmune().sized(1.5f, 1.8f));
	public static final RegistryObject<EntityType<CutterdamagedEntity>> CUTTERDAMAGED = register("cutterdamaged",
			EntityType.Builder.<CutterdamagedEntity>of(CutterdamagedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CutterdamagedEntity::new)

					.sized(1.8f, 0.7f));
	public static final RegistryObject<EntityType<CutterPirateEntity>> CUTTER_PIRATE = register("cutter_pirate",
			EntityType.Builder.<CutterPirateEntity>of(CutterPirateEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CutterPirateEntity::new)

					.sized(1.6f, 1.5f));
	public static final RegistryObject<EntityType<CutterpiratedamagedEntity>> CUTTERPIRATEDAMAGED = register("cutterpiratedamaged",
			EntityType.Builder.<CutterpiratedamagedEntity>of(CutterpiratedamagedEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CutterpiratedamagedEntity::new)

					.sized(1.6f, 1.5f));
	public static final RegistryObject<EntityType<CutterpiratewreckEntity>> CUTTERPIRATEWRECK = register("cutterpiratewreck", EntityType.Builder.<CutterpiratewreckEntity>of(CutterpiratewreckEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CutterpiratewreckEntity::new).fireImmune().sized(1.5f, 1.8f));
	public static final RegistryObject<EntityType<CuttermilitarisedEntity>> CUTTERMILITARISED = register("cuttermilitarised",
			EntityType.Builder.<CuttermilitarisedEntity>of(CuttermilitarisedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CuttermilitarisedEntity::new)

					.sized(2f, 0.7f));
	public static final RegistryObject<EntityType<CuttermilitariseddamagedEntity>> CUTTERMILITARISEDDAMAGED = register("cuttermilitariseddamaged",
			EntityType.Builder.<CuttermilitariseddamagedEntity>of(CuttermilitariseddamagedEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CuttermilitariseddamagedEntity::new)

					.sized(2f, 0.7f));
	public static final RegistryObject<EntityType<CorvetteSteamshipEntity>> CORVETTE_STEAMSHIP = register("corvette_steamship",
			EntityType.Builder.<CorvetteSteamshipEntity>of(CorvetteSteamshipEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorvetteSteamshipEntity::new)

					.sized(4f, 1.3f));
	public static final RegistryObject<EntityType<CorvettesteamshipdamagedEntity>> CORVETTESTEAMSHIPDAMAGED = register("corvettesteamshipdamaged",
			EntityType.Builder.<CorvettesteamshipdamagedEntity>of(CorvettesteamshipdamagedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(CorvettesteamshipdamagedEntity::new)

					.sized(4f, 1.2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SwashbucklerEntity.init();
			SwashbucklerupgradedEntity.init();
			ShipwreckswashbucklerEntity.init();
			RaftEntity.init();
			ShipwreckedraftEntity.init();
			WreckedswashbucklerupgradeEntity.init();
			CutterEntity.init();
			CutterwreckfrontEntity.init();
			CutterwreckbackEntity.init();
			CutterdamagedEntity.init();
			CutterPirateEntity.init();
			CutterpiratedamagedEntity.init();
			CutterpiratewreckEntity.init();
			CuttermilitarisedEntity.init();
			CuttermilitariseddamagedEntity.init();
			CorvetteSteamshipEntity.init();
			CorvettesteamshipdamagedEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SWASHBUCKLER.get(), SwashbucklerEntity.createAttributes().build());
		event.put(SWASHBUCKLERUPGRADED.get(), SwashbucklerupgradedEntity.createAttributes().build());
		event.put(SHIPWRECKSWASHBUCKLER.get(), ShipwreckswashbucklerEntity.createAttributes().build());
		event.put(RAFT.get(), RaftEntity.createAttributes().build());
		event.put(SHIPWRECKEDRAFT.get(), ShipwreckedraftEntity.createAttributes().build());
		event.put(WRECKEDSWASHBUCKLERUPGRADE.get(), WreckedswashbucklerupgradeEntity.createAttributes().build());
		event.put(CUTTER.get(), CutterEntity.createAttributes().build());
		event.put(CUTTERWRECKFRONT.get(), CutterwreckfrontEntity.createAttributes().build());
		event.put(CUTTERWRECKBACK.get(), CutterwreckbackEntity.createAttributes().build());
		event.put(CUTTERDAMAGED.get(), CutterdamagedEntity.createAttributes().build());
		event.put(CUTTER_PIRATE.get(), CutterPirateEntity.createAttributes().build());
		event.put(CUTTERPIRATEDAMAGED.get(), CutterpiratedamagedEntity.createAttributes().build());
		event.put(CUTTERPIRATEWRECK.get(), CutterpiratewreckEntity.createAttributes().build());
		event.put(CUTTERMILITARISED.get(), CuttermilitarisedEntity.createAttributes().build());
		event.put(CUTTERMILITARISEDDAMAGED.get(), CuttermilitariseddamagedEntity.createAttributes().build());
		event.put(CORVETTE_STEAMSHIP.get(), CorvetteSteamshipEntity.createAttributes().build());
		event.put(CORVETTESTEAMSHIPDAMAGED.get(), CorvettesteamshipdamagedEntity.createAttributes().build());
	}
}
