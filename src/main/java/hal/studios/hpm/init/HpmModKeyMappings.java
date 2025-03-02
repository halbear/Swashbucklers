
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import hal.studios.hpm.network.SailspeedupMessage;
import hal.studios.hpm.network.SailspeeddownMessage;
import hal.studios.hpm.network.RotateshiprightMessage;
import hal.studios.hpm.network.RotateshipleftMessage;
import hal.studios.hpm.network.FireMortarKeyMessage;
import hal.studios.hpm.network.FireMessage;
import hal.studios.hpm.network.CannonRightMessage;
import hal.studios.hpm.network.CannonLeftMessage;
import hal.studios.hpm.HpmMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HpmModKeyMappings {
	public static final KeyMapping FIRE = new KeyMapping("key.hpm.fire", GLFW.GLFW_KEY_H, "key.categories.swashbucklers");
	public static final KeyMapping SAILSPEEDUP = new KeyMapping("key.hpm.sailspeedup", GLFW.GLFW_KEY_W, "key.categories.swashbucklers");
	public static final KeyMapping SAILSPEEDDOWN = new KeyMapping("key.hpm.sailspeeddown", GLFW.GLFW_KEY_S, "key.categories.swashbucklers");
	public static final KeyMapping ROTATESHIPLEFT = new KeyMapping("key.hpm.rotateshipleft", GLFW.GLFW_KEY_A, "key.categories.swashbucklers");
	public static final KeyMapping ROTATESHIPRIGHT = new KeyMapping("key.hpm.rotateshipright", GLFW.GLFW_KEY_D, "key.categories.swashbucklers");
	public static final KeyMapping CANNON_LEFT = new KeyMapping("key.hpm.cannon_left", GLFW.GLFW_KEY_G, "key.categories.swashbucklers");
	public static final KeyMapping CANNON_RIGHT = new KeyMapping("key.hpm.cannon_right", GLFW.GLFW_KEY_J, "key.categories.swashbucklers");
	public static final KeyMapping FIRE_MORTAR_KEY = new KeyMapping("key.hpm.fire_mortar_key", GLFW.GLFW_KEY_H, "key.categories.swashbucklers");
	private static long FIRE_LASTPRESS = 0;
	private static long SAILSPEEDUP_LASTPRESS = 0;
	private static long SAILSPEEDDOWN_LASTPRESS = 0;
	private static long ROTATESHIPLEFT_LASTPRESS = 0;
	private static long ROTATESHIPRIGHT_LASTPRESS = 0;
	private static long CANNON_LEFT_LASTPRESS = 0;
	private static long CANNON_RIGHT_LASTPRESS = 0;
	private static long FIRE_MORTAR_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(FIRE);
		ClientRegistry.registerKeyBinding(SAILSPEEDUP);
		ClientRegistry.registerKeyBinding(SAILSPEEDDOWN);
		ClientRegistry.registerKeyBinding(ROTATESHIPLEFT);
		ClientRegistry.registerKeyBinding(ROTATESHIPRIGHT);
		ClientRegistry.registerKeyBinding(CANNON_LEFT);
		ClientRegistry.registerKeyBinding(CANNON_RIGHT);
		ClientRegistry.registerKeyBinding(FIRE_MORTAR_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == FIRE.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						FIRE_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - FIRE_LASTPRESS);
						HpmMod.PACKET_HANDLER.sendToServer(new FireMessage(1, dt));
						FireMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == SAILSPEEDUP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						HpmMod.PACKET_HANDLER.sendToServer(new SailspeedupMessage(0, 0));
						SailspeedupMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						SAILSPEEDUP_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - SAILSPEEDUP_LASTPRESS);
						HpmMod.PACKET_HANDLER.sendToServer(new SailspeedupMessage(1, dt));
						SailspeedupMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == SAILSPEEDDOWN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						HpmMod.PACKET_HANDLER.sendToServer(new SailspeeddownMessage(0, 0));
						SailspeeddownMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						SAILSPEEDDOWN_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - SAILSPEEDDOWN_LASTPRESS);
						HpmMod.PACKET_HANDLER.sendToServer(new SailspeeddownMessage(1, dt));
						SailspeeddownMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == ROTATESHIPLEFT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						HpmMod.PACKET_HANDLER.sendToServer(new RotateshipleftMessage(0, 0));
						RotateshipleftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						ROTATESHIPLEFT_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - ROTATESHIPLEFT_LASTPRESS);
						HpmMod.PACKET_HANDLER.sendToServer(new RotateshipleftMessage(1, dt));
						RotateshipleftMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == ROTATESHIPRIGHT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						HpmMod.PACKET_HANDLER.sendToServer(new RotateshiprightMessage(0, 0));
						RotateshiprightMessage.pressAction(Minecraft.getInstance().player, 0, 0);
						ROTATESHIPRIGHT_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - ROTATESHIPRIGHT_LASTPRESS);
						HpmMod.PACKET_HANDLER.sendToServer(new RotateshiprightMessage(1, dt));
						RotateshiprightMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == CANNON_LEFT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						CANNON_LEFT_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - CANNON_LEFT_LASTPRESS);
						HpmMod.PACKET_HANDLER.sendToServer(new CannonLeftMessage(1, dt));
						CannonLeftMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == CANNON_RIGHT.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						CANNON_RIGHT_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - CANNON_RIGHT_LASTPRESS);
						HpmMod.PACKET_HANDLER.sendToServer(new CannonRightMessage(1, dt));
						CannonRightMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == FIRE_MORTAR_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						FIRE_MORTAR_KEY_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - FIRE_MORTAR_KEY_LASTPRESS);
						HpmMod.PACKET_HANDLER.sendToServer(new FireMortarKeyMessage(1, dt));
						FireMortarKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
