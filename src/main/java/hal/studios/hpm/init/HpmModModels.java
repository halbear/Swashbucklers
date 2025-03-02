
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import hal.studios.hpm.client.model.Modelswashbucklerupgradeddestroyed;
import hal.studios.hpm.client.model.Modelswashbucklerupgraded;
import hal.studios.hpm.client.model.Modelswashbucklerdestroyed;
import hal.studios.hpm.client.model.Modelswashbuckler;
import hal.studios.hpm.client.model.Modelraftwrecked;
import hal.studios.hpm.client.model.Modelraft;
import hal.studios.hpm.client.model.Modelplankowood;
import hal.studios.hpm.client.model.Modelfloating_barrel;
import hal.studios.hpm.client.model.Modeldrifting_wood;
import hal.studios.hpm.client.model.Modelcutterwreckfront;
import hal.studios.hpm.client.model.Modelcutterwreckback;
import hal.studios.hpm.client.model.Modelcutterweaponisedremastered;
import hal.studios.hpm.client.model.Modelcutterremastered;
import hal.studios.hpm.client.model.Modelcutterpiratewreck;
import hal.studios.hpm.client.model.Modelcutterpiratedplayeramaged;
import hal.studios.hpm.client.model.Modelcutterpiratedamaged;
import hal.studios.hpm.client.model.Modelcutterpirate;
import hal.studios.hpm.client.model.Modelcuttermilitarised;
import hal.studios.hpm.client.model.Modelcutterdamagedremade;
import hal.studios.hpm.client.model.Modelcutterdamaged;
import hal.studios.hpm.client.model.ModelcutterdWreckFrontremade;
import hal.studios.hpm.client.model.ModelcutterRearWreckremade;
import hal.studios.hpm.client.model.ModelcutterDamagedSails;
import hal.studios.hpm.client.model.ModelcutterArmedWreck;
import hal.studios.hpm.client.model.ModelcutterArmedDamaged;
import hal.studios.hpm.client.model.Modelcutter;
import hal.studios.hpm.client.model.Modelcorvetteclassdamaged;
import hal.studios.hpm.client.model.Modelcorvetteclass;
import hal.studios.hpm.client.model.ModelCutterPassenger;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HpmModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelcutterRearWreckremade.LAYER_LOCATION, ModelcutterRearWreckremade::createBodyLayer);
		event.registerLayerDefinition(Modelcutterpiratedamaged.LAYER_LOCATION, Modelcutterpiratedamaged::createBodyLayer);
		event.registerLayerDefinition(Modelcutterwreckback.LAYER_LOCATION, Modelcutterwreckback::createBodyLayer);
		event.registerLayerDefinition(Modelfloating_barrel.LAYER_LOCATION, Modelfloating_barrel::createBodyLayer);
		event.registerLayerDefinition(Modelswashbucklerdestroyed.LAYER_LOCATION, Modelswashbucklerdestroyed::createBodyLayer);
		event.registerLayerDefinition(ModelcutterArmedDamaged.LAYER_LOCATION, ModelcutterArmedDamaged::createBodyLayer);
		event.registerLayerDefinition(Modelswashbuckler.LAYER_LOCATION, Modelswashbuckler::createBodyLayer);
		event.registerLayerDefinition(Modelswashbucklerupgradeddestroyed.LAYER_LOCATION, Modelswashbucklerupgradeddestroyed::createBodyLayer);
		event.registerLayerDefinition(Modelcutterwreckfront.LAYER_LOCATION, Modelcutterwreckfront::createBodyLayer);
		event.registerLayerDefinition(Modelswashbucklerupgraded.LAYER_LOCATION, Modelswashbucklerupgraded::createBodyLayer);
		event.registerLayerDefinition(Modelcutterdamaged.LAYER_LOCATION, Modelcutterdamaged::createBodyLayer);
		event.registerLayerDefinition(Modelraftwrecked.LAYER_LOCATION, Modelraftwrecked::createBodyLayer);
		event.registerLayerDefinition(ModelcutterDamagedSails.LAYER_LOCATION, ModelcutterDamagedSails::createBodyLayer);
		event.registerLayerDefinition(Modelraft.LAYER_LOCATION, Modelraft::createBodyLayer);
		event.registerLayerDefinition(Modelcutterweaponisedremastered.LAYER_LOCATION, Modelcutterweaponisedremastered::createBodyLayer);
		event.registerLayerDefinition(Modelplankowood.LAYER_LOCATION, Modelplankowood::createBodyLayer);
		event.registerLayerDefinition(Modelcuttermilitarised.LAYER_LOCATION, Modelcuttermilitarised::createBodyLayer);
		event.registerLayerDefinition(Modelcutterpirate.LAYER_LOCATION, Modelcutterpirate::createBodyLayer);
		event.registerLayerDefinition(Modelcorvetteclassdamaged.LAYER_LOCATION, Modelcorvetteclassdamaged::createBodyLayer);
		event.registerLayerDefinition(ModelcutterArmedWreck.LAYER_LOCATION, ModelcutterArmedWreck::createBodyLayer);
		event.registerLayerDefinition(ModelCutterPassenger.LAYER_LOCATION, ModelCutterPassenger::createBodyLayer);
		event.registerLayerDefinition(Modelcutterdamagedremade.LAYER_LOCATION, Modelcutterdamagedremade::createBodyLayer);
		event.registerLayerDefinition(Modelcorvetteclass.LAYER_LOCATION, Modelcorvetteclass::createBodyLayer);
		event.registerLayerDefinition(Modelcutterpiratedplayeramaged.LAYER_LOCATION, Modelcutterpiratedplayeramaged::createBodyLayer);
		event.registerLayerDefinition(Modelcutterpiratewreck.LAYER_LOCATION, Modelcutterpiratewreck::createBodyLayer);
		event.registerLayerDefinition(Modelcutterremastered.LAYER_LOCATION, Modelcutterremastered::createBodyLayer);
		event.registerLayerDefinition(Modelcutter.LAYER_LOCATION, Modelcutter::createBodyLayer);
		event.registerLayerDefinition(ModelcutterdWreckFrontremade.LAYER_LOCATION, ModelcutterdWreckFrontremade::createBodyLayer);
		event.registerLayerDefinition(Modeldrifting_wood.LAYER_LOCATION, Modeldrifting_wood::createBodyLayer);
	}
}
