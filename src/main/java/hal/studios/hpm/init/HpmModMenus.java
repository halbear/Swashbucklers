
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import hal.studios.hpm.world.inventory.SwashbucklerinventoryMenu;
import hal.studios.hpm.world.inventory.RaftinventoryMenu;
import hal.studios.hpm.world.inventory.CutterinventoryMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HpmModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<SwashbucklerinventoryMenu> SWASHBUCKLERINVENTORY = register("swashbucklerinventory", (id, inv, extraData) -> new SwashbucklerinventoryMenu(id, inv, extraData));
	public static final MenuType<RaftinventoryMenu> RAFTINVENTORY = register("raftinventory", (id, inv, extraData) -> new RaftinventoryMenu(id, inv, extraData));
	public static final MenuType<CutterinventoryMenu> CUTTERINVENTORY = register("cutterinventory", (id, inv, extraData) -> new CutterinventoryMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
