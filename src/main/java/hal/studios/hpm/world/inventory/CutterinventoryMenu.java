
package hal.studios.hpm.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
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

public class CutterinventoryMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public CutterinventoryMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(HpmModMenus.CUTTERINVENTORY, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(229);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null)
					boundEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity != null)
					boundBlockEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 13, 14) {
			private final int slot = 0;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 31, 14) {
			private final int slot = 1;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 49, 14) {
			private final int slot = 2;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 67, 14) {
			private final int slot = 3;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 85, 14) {
			private final int slot = 4;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 103, 14) {
			private final int slot = 5;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 121, 14) {
			private final int slot = 6;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 139, 14) {
			private final int slot = 7;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 157, 14) {
			private final int slot = 8;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 175, 14) {
			private final int slot = 9;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 193, 14) {
			private final int slot = 10;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 211, 14) {
			private final int slot = 11;
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 229, 14) {
			private final int slot = 12;
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 247, 14) {
			private final int slot = 13;
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 265, 14) {
			private final int slot = 14;
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 283, 14) {
			private final int slot = 15;
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 301, 14) {
			private final int slot = 16;
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 319, 14) {
			private final int slot = 17;
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 337, 14) {
			private final int slot = 18;
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 355, 14) {
			private final int slot = 19;
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 373, 14) {
			private final int slot = 20;
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 391, 14) {
			private final int slot = 21;
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 13, 32) {
			private final int slot = 22;
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 31, 32) {
			private final int slot = 23;
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 49, 32) {
			private final int slot = 24;
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 67, 32) {
			private final int slot = 25;
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 85, 32) {
			private final int slot = 26;
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 103, 32) {
			private final int slot = 27;
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 121, 32) {
			private final int slot = 28;
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 139, 32) {
			private final int slot = 29;
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 157, 32) {
			private final int slot = 30;
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 175, 32) {
			private final int slot = 31;
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 193, 32) {
			private final int slot = 32;
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 211, 32) {
			private final int slot = 33;
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 229, 32) {
			private final int slot = 34;
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 247, 32) {
			private final int slot = 35;
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 265, 32) {
			private final int slot = 36;
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 283, 32) {
			private final int slot = 37;
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 301, 32) {
			private final int slot = 38;
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 319, 32) {
			private final int slot = 39;
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 337, 32) {
			private final int slot = 40;
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 355, 32) {
			private final int slot = 41;
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 373, 32) {
			private final int slot = 42;
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 391, 32) {
			private final int slot = 43;
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 13, 50) {
			private final int slot = 44;
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 31, 50) {
			private final int slot = 45;
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 49, 50) {
			private final int slot = 46;
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 67, 50) {
			private final int slot = 47;
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 85, 50) {
			private final int slot = 48;
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 103, 50) {
			private final int slot = 49;
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 121, 50) {
			private final int slot = 50;
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 139, 50) {
			private final int slot = 51;
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 157, 50) {
			private final int slot = 52;
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 175, 50) {
			private final int slot = 53;
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 193, 50) {
			private final int slot = 54;
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 211, 50) {
			private final int slot = 55;
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 229, 50) {
			private final int slot = 56;
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 247, 50) {
			private final int slot = 57;
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 265, 50) {
			private final int slot = 58;
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 283, 50) {
			private final int slot = 59;
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 301, 50) {
			private final int slot = 60;
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 319, 50) {
			private final int slot = 61;
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 337, 50) {
			private final int slot = 62;
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 355, 50) {
			private final int slot = 63;
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 373, 50) {
			private final int slot = 64;
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 391, 50) {
			private final int slot = 65;
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 13, 68) {
			private final int slot = 66;
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 31, 68) {
			private final int slot = 67;
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 49, 68) {
			private final int slot = 68;
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 67, 68) {
			private final int slot = 69;
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 85, 68) {
			private final int slot = 70;
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 103, 68) {
			private final int slot = 71;
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 121, 68) {
			private final int slot = 72;
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 139, 68) {
			private final int slot = 73;
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 157, 68) {
			private final int slot = 74;
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 175, 68) {
			private final int slot = 75;
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 193, 68) {
			private final int slot = 76;
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 211, 68) {
			private final int slot = 77;
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 229, 68) {
			private final int slot = 78;
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 247, 68) {
			private final int slot = 79;
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 265, 68) {
			private final int slot = 80;
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 283, 68) {
			private final int slot = 81;
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 301, 68) {
			private final int slot = 82;
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 319, 68) {
			private final int slot = 83;
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 337, 68) {
			private final int slot = 84;
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 355, 68) {
			private final int slot = 85;
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 373, 68) {
			private final int slot = 86;
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 391, 68) {
			private final int slot = 87;
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 13, 86) {
			private final int slot = 88;
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 31, 86) {
			private final int slot = 89;
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 49, 86) {
			private final int slot = 90;
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 67, 86) {
			private final int slot = 91;
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 85, 86) {
			private final int slot = 92;
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 103, 86) {
			private final int slot = 93;
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 121, 86) {
			private final int slot = 94;
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 139, 86) {
			private final int slot = 95;
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 157, 86) {
			private final int slot = 96;
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 175, 86) {
			private final int slot = 97;
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 193, 86) {
			private final int slot = 98;
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 211, 86) {
			private final int slot = 99;
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 229, 86) {
			private final int slot = 100;
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 247, 86) {
			private final int slot = 101;
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 265, 86) {
			private final int slot = 102;
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 283, 86) {
			private final int slot = 103;
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 301, 86) {
			private final int slot = 104;
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 319, 86) {
			private final int slot = 105;
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 337, 86) {
			private final int slot = 106;
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 355, 86) {
			private final int slot = 107;
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 373, 86) {
			private final int slot = 108;
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 391, 86) {
			private final int slot = 109;
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 13, 104) {
			private final int slot = 110;
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 31, 104) {
			private final int slot = 111;
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 49, 104) {
			private final int slot = 112;
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 67, 104) {
			private final int slot = 113;
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 85, 104) {
			private final int slot = 114;
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 103, 104) {
			private final int slot = 115;
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 121, 104) {
			private final int slot = 116;
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 139, 104) {
			private final int slot = 117;
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 157, 104) {
			private final int slot = 118;
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 175, 104) {
			private final int slot = 119;
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, 193, 104) {
			private final int slot = 120;
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 211, 104) {
			private final int slot = 121;
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 229, 104) {
			private final int slot = 122;
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 247, 104) {
			private final int slot = 123;
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 265, 104) {
			private final int slot = 124;
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 283, 104) {
			private final int slot = 125;
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 301, 104) {
			private final int slot = 126;
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 319, 104) {
			private final int slot = 127;
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 337, 104) {
			private final int slot = 128;
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 355, 104) {
			private final int slot = 129;
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 373, 104) {
			private final int slot = 130;
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 391, 104) {
			private final int slot = 131;
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 13, 122) {
			private final int slot = 132;
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 31, 122) {
			private final int slot = 133;
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 49, 122) {
			private final int slot = 134;
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, 67, 122) {
			private final int slot = 135;
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 85, 122) {
			private final int slot = 136;
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 103, 122) {
			private final int slot = 137;
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 121, 122) {
			private final int slot = 138;
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 139, 122) {
			private final int slot = 139;
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 157, 122) {
			private final int slot = 140;
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 175, 122) {
			private final int slot = 141;
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 193, 122) {
			private final int slot = 142;
		}));
		this.customSlots.put(143, this.addSlot(new SlotItemHandler(internal, 143, 211, 122) {
			private final int slot = 143;
		}));
		this.customSlots.put(144, this.addSlot(new SlotItemHandler(internal, 144, 229, 122) {
			private final int slot = 144;
		}));
		this.customSlots.put(145, this.addSlot(new SlotItemHandler(internal, 145, 247, 122) {
			private final int slot = 145;
		}));
		this.customSlots.put(146, this.addSlot(new SlotItemHandler(internal, 146, 265, 122) {
			private final int slot = 146;
		}));
		this.customSlots.put(147, this.addSlot(new SlotItemHandler(internal, 147, 283, 122) {
			private final int slot = 147;
		}));
		this.customSlots.put(148, this.addSlot(new SlotItemHandler(internal, 148, 301, 122) {
			private final int slot = 148;
		}));
		this.customSlots.put(149, this.addSlot(new SlotItemHandler(internal, 149, 319, 122) {
			private final int slot = 149;
		}));
		this.customSlots.put(150, this.addSlot(new SlotItemHandler(internal, 150, 337, 122) {
			private final int slot = 150;
		}));
		this.customSlots.put(151, this.addSlot(new SlotItemHandler(internal, 151, 355, 122) {
			private final int slot = 151;
		}));
		this.customSlots.put(152, this.addSlot(new SlotItemHandler(internal, 152, 373, 122) {
			private final int slot = 152;
		}));
		this.customSlots.put(153, this.addSlot(new SlotItemHandler(internal, 153, 391, 122) {
			private final int slot = 153;
		}));
		this.customSlots.put(154, this.addSlot(new SlotItemHandler(internal, 154, 13, 140) {
			private final int slot = 154;
		}));
		this.customSlots.put(155, this.addSlot(new SlotItemHandler(internal, 155, 31, 140) {
			private final int slot = 155;
		}));
		this.customSlots.put(156, this.addSlot(new SlotItemHandler(internal, 156, 31, 140) {
			private final int slot = 156;
		}));
		this.customSlots.put(157, this.addSlot(new SlotItemHandler(internal, 157, 49, 140) {
			private final int slot = 157;
		}));
		this.customSlots.put(158, this.addSlot(new SlotItemHandler(internal, 158, 67, 140) {
			private final int slot = 158;
		}));
		this.customSlots.put(159, this.addSlot(new SlotItemHandler(internal, 159, 85, 140) {
			private final int slot = 159;
		}));
		this.customSlots.put(160, this.addSlot(new SlotItemHandler(internal, 160, 103, 140) {
			private final int slot = 160;
		}));
		this.customSlots.put(161, this.addSlot(new SlotItemHandler(internal, 161, 121, 140) {
			private final int slot = 161;
		}));
		this.customSlots.put(162, this.addSlot(new SlotItemHandler(internal, 162, 139, 140) {
			private final int slot = 162;
		}));
		this.customSlots.put(163, this.addSlot(new SlotItemHandler(internal, 163, 157, 140) {
			private final int slot = 163;
		}));
		this.customSlots.put(164, this.addSlot(new SlotItemHandler(internal, 164, 175, 140) {
			private final int slot = 164;
		}));
		this.customSlots.put(165, this.addSlot(new SlotItemHandler(internal, 165, 193, 140) {
			private final int slot = 165;
		}));
		this.customSlots.put(166, this.addSlot(new SlotItemHandler(internal, 166, 211, 140) {
			private final int slot = 166;
		}));
		this.customSlots.put(167, this.addSlot(new SlotItemHandler(internal, 167, 229, 140) {
			private final int slot = 167;
		}));
		this.customSlots.put(168, this.addSlot(new SlotItemHandler(internal, 168, 247, 140) {
			private final int slot = 168;
		}));
		this.customSlots.put(169, this.addSlot(new SlotItemHandler(internal, 169, 265, 140) {
			private final int slot = 169;
		}));
		this.customSlots.put(170, this.addSlot(new SlotItemHandler(internal, 170, 283, 140) {
			private final int slot = 170;
		}));
		this.customSlots.put(171, this.addSlot(new SlotItemHandler(internal, 171, 301, 140) {
			private final int slot = 171;
		}));
		this.customSlots.put(172, this.addSlot(new SlotItemHandler(internal, 172, 319, 140) {
			private final int slot = 172;
		}));
		this.customSlots.put(173, this.addSlot(new SlotItemHandler(internal, 173, 337, 140) {
			private final int slot = 173;
		}));
		this.customSlots.put(174, this.addSlot(new SlotItemHandler(internal, 174, 355, 140) {
			private final int slot = 174;
		}));
		this.customSlots.put(175, this.addSlot(new SlotItemHandler(internal, 175, 373, 140) {
			private final int slot = 175;
		}));
		this.customSlots.put(176, this.addSlot(new SlotItemHandler(internal, 176, 391, 140) {
			private final int slot = 176;
		}));
		this.customSlots.put(177, this.addSlot(new SlotItemHandler(internal, 177, 175, 158) {
			private final int slot = 177;
		}));
		this.customSlots.put(178, this.addSlot(new SlotItemHandler(internal, 178, 193, 158) {
			private final int slot = 178;
		}));
		this.customSlots.put(179, this.addSlot(new SlotItemHandler(internal, 179, 211, 158) {
			private final int slot = 179;
		}));
		this.customSlots.put(180, this.addSlot(new SlotItemHandler(internal, 180, 229, 158) {
			private final int slot = 180;
		}));
		this.customSlots.put(181, this.addSlot(new SlotItemHandler(internal, 181, 247, 158) {
			private final int slot = 181;
		}));
		this.customSlots.put(182, this.addSlot(new SlotItemHandler(internal, 182, 265, 158) {
			private final int slot = 182;
		}));
		this.customSlots.put(183, this.addSlot(new SlotItemHandler(internal, 183, 283, 158) {
			private final int slot = 183;
		}));
		this.customSlots.put(184, this.addSlot(new SlotItemHandler(internal, 184, 301, 158) {
			private final int slot = 184;
		}));
		this.customSlots.put(185, this.addSlot(new SlotItemHandler(internal, 185, 319, 158) {
			private final int slot = 185;
		}));
		this.customSlots.put(186, this.addSlot(new SlotItemHandler(internal, 186, 337, 158) {
			private final int slot = 186;
		}));
		this.customSlots.put(187, this.addSlot(new SlotItemHandler(internal, 187, 355, 158) {
			private final int slot = 187;
		}));
		this.customSlots.put(188, this.addSlot(new SlotItemHandler(internal, 188, 373, 158) {
			private final int slot = 188;
		}));
		this.customSlots.put(189, this.addSlot(new SlotItemHandler(internal, 189, 391, 158) {
			private final int slot = 189;
		}));
		this.customSlots.put(190, this.addSlot(new SlotItemHandler(internal, 190, 175, 176) {
			private final int slot = 190;
		}));
		this.customSlots.put(191, this.addSlot(new SlotItemHandler(internal, 191, 193, 176) {
			private final int slot = 191;
		}));
		this.customSlots.put(192, this.addSlot(new SlotItemHandler(internal, 192, 211, 176) {
			private final int slot = 192;
		}));
		this.customSlots.put(193, this.addSlot(new SlotItemHandler(internal, 193, 229, 176) {
			private final int slot = 193;
		}));
		this.customSlots.put(194, this.addSlot(new SlotItemHandler(internal, 194, 247, 176) {
			private final int slot = 194;
		}));
		this.customSlots.put(195, this.addSlot(new SlotItemHandler(internal, 195, 265, 176) {
			private final int slot = 195;
		}));
		this.customSlots.put(196, this.addSlot(new SlotItemHandler(internal, 196, 283, 176) {
			private final int slot = 196;
		}));
		this.customSlots.put(197, this.addSlot(new SlotItemHandler(internal, 197, 301, 176) {
			private final int slot = 197;
		}));
		this.customSlots.put(198, this.addSlot(new SlotItemHandler(internal, 198, 319, 176) {
			private final int slot = 198;
		}));
		this.customSlots.put(199, this.addSlot(new SlotItemHandler(internal, 199, 337, 176) {
			private final int slot = 199;
		}));
		this.customSlots.put(200, this.addSlot(new SlotItemHandler(internal, 200, 355, 176) {
			private final int slot = 200;
		}));
		this.customSlots.put(201, this.addSlot(new SlotItemHandler(internal, 201, 373, 176) {
			private final int slot = 201;
		}));
		this.customSlots.put(202, this.addSlot(new SlotItemHandler(internal, 202, 391, 176) {
			private final int slot = 202;
		}));
		this.customSlots.put(203, this.addSlot(new SlotItemHandler(internal, 203, 175, 194) {
			private final int slot = 203;
		}));
		this.customSlots.put(204, this.addSlot(new SlotItemHandler(internal, 204, 193, 194) {
			private final int slot = 204;
		}));
		this.customSlots.put(205, this.addSlot(new SlotItemHandler(internal, 205, 211, 194) {
			private final int slot = 205;
		}));
		this.customSlots.put(206, this.addSlot(new SlotItemHandler(internal, 206, 229, 194) {
			private final int slot = 206;
		}));
		this.customSlots.put(207, this.addSlot(new SlotItemHandler(internal, 207, 247, 194) {
			private final int slot = 207;
		}));
		this.customSlots.put(208, this.addSlot(new SlotItemHandler(internal, 208, 265, 194) {
			private final int slot = 208;
		}));
		this.customSlots.put(209, this.addSlot(new SlotItemHandler(internal, 209, 283, 194) {
			private final int slot = 209;
		}));
		this.customSlots.put(210, this.addSlot(new SlotItemHandler(internal, 210, 301, 194) {
			private final int slot = 210;
		}));
		this.customSlots.put(211, this.addSlot(new SlotItemHandler(internal, 211, 319, 194) {
			private final int slot = 211;
		}));
		this.customSlots.put(212, this.addSlot(new SlotItemHandler(internal, 212, 337, 194) {
			private final int slot = 212;
		}));
		this.customSlots.put(213, this.addSlot(new SlotItemHandler(internal, 213, 355, 194) {
			private final int slot = 213;
		}));
		this.customSlots.put(214, this.addSlot(new SlotItemHandler(internal, 214, 373, 194) {
			private final int slot = 214;
		}));
		this.customSlots.put(215, this.addSlot(new SlotItemHandler(internal, 215, 391, 194) {
			private final int slot = 215;
		}));
		this.customSlots.put(216, this.addSlot(new SlotItemHandler(internal, 216, 175, 212) {
			private final int slot = 216;
		}));
		this.customSlots.put(217, this.addSlot(new SlotItemHandler(internal, 217, 193, 212) {
			private final int slot = 217;
		}));
		this.customSlots.put(218, this.addSlot(new SlotItemHandler(internal, 218, 211, 212) {
			private final int slot = 218;
		}));
		this.customSlots.put(219, this.addSlot(new SlotItemHandler(internal, 219, 229, 212) {
			private final int slot = 219;
		}));
		this.customSlots.put(220, this.addSlot(new SlotItemHandler(internal, 220, 247, 212) {
			private final int slot = 220;
		}));
		this.customSlots.put(221, this.addSlot(new SlotItemHandler(internal, 221, 265, 212) {
			private final int slot = 221;
		}));
		this.customSlots.put(222, this.addSlot(new SlotItemHandler(internal, 222, 283, 212) {
			private final int slot = 222;
		}));
		this.customSlots.put(223, this.addSlot(new SlotItemHandler(internal, 223, 301, 212) {
			private final int slot = 223;
		}));
		this.customSlots.put(224, this.addSlot(new SlotItemHandler(internal, 224, 319, 212) {
			private final int slot = 224;
		}));
		this.customSlots.put(225, this.addSlot(new SlotItemHandler(internal, 225, 337, 212) {
			private final int slot = 225;
		}));
		this.customSlots.put(226, this.addSlot(new SlotItemHandler(internal, 226, 355, 212) {
			private final int slot = 226;
		}));
		this.customSlots.put(227, this.addSlot(new SlotItemHandler(internal, 227, 373, 212) {
			private final int slot = 227;
		}));
		this.customSlots.put(228, this.addSlot(new SlotItemHandler(internal, 228, 391, 212) {
			private final int slot = 228;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 4 + 8 + sj * 18, 84 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 4 + 8 + si * 18, 84 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 229) {
				if (!this.moveItemStackTo(itemstack1, 229, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 229, false)) {
				if (index < 229 + 27) {
					if (!this.moveItemStackTo(itemstack1, 229 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 229, 229 + 27, false)) {
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
