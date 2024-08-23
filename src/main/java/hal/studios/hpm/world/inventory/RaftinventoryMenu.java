
package hal.studios.hpm.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

import hal.studios.hpm.init.HpmModMenus;

public class RaftinventoryMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public RaftinventoryMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(HpmModMenus.RAFTINVENTORY, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(97);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 105, 16) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 123, 16) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 141, 16) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 159, 16) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 177, 16) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 195, 16) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 213, 16) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 231, 16) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 249, 16) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 105, 34) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 123, 34) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 141, 34) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 159, 34) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 177, 34) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 195, 34) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 213, 34) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 231, 34) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 249, 34) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 105, 52) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 123, 52) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 141, 52) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 159, 52) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 177, 52) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 195, 52) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 213, 52) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 231, 52) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 249, 52) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 105, 70) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 123, 70) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 141, 70) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 159, 70) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 177, 70) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 195, 70) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 213, 70) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 231, 70) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 249, 70) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 267, 16) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 285, 16) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 303, 16) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 321, 16) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 339, 16) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 285, 52) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 303, 52) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 321, 52) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 339, 52) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 15, 16) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 87, 34) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 69, 34) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 51, 34) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 33, 16) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 33, 34) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 15, 34) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 15, 52) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 33, 52) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 51, 52) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 69, 52) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 87, 52) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 15, 70) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 33, 70) {
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 51, 70) {
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 69, 70) {
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 87, 70) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 51, 16) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 87, 16) {
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 267, 34) {
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 285, 34) {
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 303, 34) {
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 321, 34) {
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 339, 34) {
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 267, 52) {
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 267, 70) {
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 285, 70) {
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 303, 70) {
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 321, 70) {
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 69, 16) {
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 339, 70) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 97 + 8 + sj * 18, 17 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 97 + 8 + si * 18, 17 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 76) {
				if (!this.moveItemStackTo(itemstack1, 76, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 76, false)) {
				if (index < 76 + 27) {
					if (!this.moveItemStackTo(itemstack1, 76 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 76, 76 + 27, false)) {
						return ItemStack.EMPTY;
					}
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}