
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HpmModTabs {
	public static CreativeModeTab TAB_SWASHBUCKLERS;

	public static void load() {
		TAB_SWASHBUCKLERS = new CreativeModeTab("tabswashbucklers") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HpmModItems.CUTTERITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
