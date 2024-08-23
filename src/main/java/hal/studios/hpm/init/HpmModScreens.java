
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import hal.studios.hpm.client.gui.SwashbucklerinventoryScreen;
import hal.studios.hpm.client.gui.RaftinventoryScreen;
import hal.studios.hpm.client.gui.CutterinventoryScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HpmModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HpmModMenus.SWASHBUCKLERINVENTORY, SwashbucklerinventoryScreen::new);
			MenuScreens.register(HpmModMenus.RAFTINVENTORY, RaftinventoryScreen::new);
			MenuScreens.register(HpmModMenus.CUTTERINVENTORY, CutterinventoryScreen::new);
		});
	}
}
