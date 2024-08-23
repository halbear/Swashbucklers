
package hal.studios.hpm.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import hal.studios.hpm.procedures.RaftitemRightclickedProcedure;
import hal.studios.hpm.init.HpmModTabs;

public class RaftitemItem extends Item {
	public RaftitemItem() {
		super(new Item.Properties().tab(HpmModTabs.TAB_SWASHBUCKLERS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RaftitemRightclickedProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
