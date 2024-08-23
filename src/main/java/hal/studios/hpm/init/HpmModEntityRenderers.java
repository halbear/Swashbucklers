
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import hal.studios.hpm.client.renderer.WreckedswashbucklerupgradeRenderer;
import hal.studios.hpm.client.renderer.SwashbucklerupgradedRenderer;
import hal.studios.hpm.client.renderer.SwashbucklerRenderer;
import hal.studios.hpm.client.renderer.ShipwreckswashbucklerRenderer;
import hal.studios.hpm.client.renderer.ShipwreckedraftRenderer;
import hal.studios.hpm.client.renderer.RaftRenderer;
import hal.studios.hpm.client.renderer.CutterwreckfrontRenderer;
import hal.studios.hpm.client.renderer.CutterwreckbackRenderer;
import hal.studios.hpm.client.renderer.CutterpiratewreckRenderer;
import hal.studios.hpm.client.renderer.CutterpiratedamagedRenderer;
import hal.studios.hpm.client.renderer.CuttermilitariseddamagedRenderer;
import hal.studios.hpm.client.renderer.CuttermilitarisedRenderer;
import hal.studios.hpm.client.renderer.CutterdamagedRenderer;
import hal.studios.hpm.client.renderer.CutterRenderer;
import hal.studios.hpm.client.renderer.CutterPirateRenderer;
import hal.studios.hpm.client.renderer.CorvettesteamshipdamagedRenderer;
import hal.studios.hpm.client.renderer.CorvetteSteamshipRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HpmModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HpmModEntities.SWASHBUCKLER.get(), SwashbucklerRenderer::new);
		event.registerEntityRenderer(HpmModEntities.SWASHBUCKLERUPGRADED.get(), SwashbucklerupgradedRenderer::new);
		event.registerEntityRenderer(HpmModEntities.HAND_CANNON.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HpmModEntities.SHIPWRECKSWASHBUCKLER.get(), ShipwreckswashbucklerRenderer::new);
		event.registerEntityRenderer(HpmModEntities.RAFT.get(), RaftRenderer::new);
		event.registerEntityRenderer(HpmModEntities.SHIPWRECKEDRAFT.get(), ShipwreckedraftRenderer::new);
		event.registerEntityRenderer(HpmModEntities.WRECKEDSWASHBUCKLERUPGRADE.get(), WreckedswashbucklerupgradeRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTER.get(), CutterRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTERWRECKFRONT.get(), CutterwreckfrontRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTERWRECKBACK.get(), CutterwreckbackRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTERDAMAGED.get(), CutterdamagedRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTER_PIRATE.get(), CutterPirateRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTERPIRATEDAMAGED.get(), CutterpiratedamagedRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTERPIRATEWRECK.get(), CutterpiratewreckRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTERMILITARISED.get(), CuttermilitarisedRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CUTTERMILITARISEDDAMAGED.get(), CuttermilitariseddamagedRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CORVETTE_STEAMSHIP.get(), CorvetteSteamshipRenderer::new);
		event.registerEntityRenderer(HpmModEntities.CORVETTESTEAMSHIPDAMAGED.get(), CorvettesteamshipdamagedRenderer::new);
	}
}
