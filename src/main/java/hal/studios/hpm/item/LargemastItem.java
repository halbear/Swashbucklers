
package hal.studios.hpm.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import hal.studios.hpm.init.HpmModTabs;

public class LargemastItem extends Item {
	public LargemastItem() {
		super(new Item.Properties().tab(HpmModTabs.TAB_SWASHBUCKLERS).stacksTo(64).rarity(Rarity.COMMON));
	}
}