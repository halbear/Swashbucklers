
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import hal.studios.hpm.item.SwashbucklerupgradeItem;
import hal.studios.hpm.item.SwashbuckleritemItem;
import hal.studios.hpm.item.SpannerItem;
import hal.studios.hpm.item.SmallhullItem;
import hal.studios.hpm.item.SmallMastItem;
import hal.studios.hpm.item.RaftitemItem;
import hal.studios.hpm.item.LargemastItem;
import hal.studios.hpm.item.LargehullItem;
import hal.studios.hpm.item.HandCannonItem;
import hal.studios.hpm.item.CuttermilitariseditemItem;
import hal.studios.hpm.item.CutteritemItem;
import hal.studios.hpm.item.CannonballItem;
import hal.studios.hpm.HpmMod;

public class HpmModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HpmMod.MODID);
	public static final RegistryObject<Item> CANNONBALL = REGISTRY.register("cannonball", () -> new CannonballItem());
	public static final RegistryObject<Item> SMALLHULL = REGISTRY.register("smallhull", () -> new SmallhullItem());
	public static final RegistryObject<Item> SMALL_MAST = REGISTRY.register("small_mast", () -> new SmallMastItem());
	public static final RegistryObject<Item> SWASHBUCKLERITEM = REGISTRY.register("swashbuckleritem", () -> new SwashbuckleritemItem());
	public static final RegistryObject<Item> SWASHBUCKLERUPGRADE = REGISTRY.register("swashbucklerupgrade", () -> new SwashbucklerupgradeItem());
	public static final RegistryObject<Item> HAND_CANNON = REGISTRY.register("hand_cannon", () -> new HandCannonItem());
	public static final RegistryObject<Item> RAFTITEM = REGISTRY.register("raftitem", () -> new RaftitemItem());
	public static final RegistryObject<Item> LARGEHULL = REGISTRY.register("largehull", () -> new LargehullItem());
	public static final RegistryObject<Item> LARGEMAST = REGISTRY.register("largemast", () -> new LargemastItem());
	public static final RegistryObject<Item> CUTTERITEM = REGISTRY.register("cutteritem", () -> new CutteritemItem());
	public static final RegistryObject<Item> CUTTERMILITARISEDITEM = REGISTRY.register("cuttermilitariseditem", () -> new CuttermilitariseditemItem());
	public static final RegistryObject<Item> SPANNER = REGISTRY.register("spanner", () -> new SpannerItem());
}
