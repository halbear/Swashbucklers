
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import hal.studios.hpm.client.particle.SplintersParticle;
import hal.studios.hpm.client.particle.RippedSailPirateParticle;
import hal.studios.hpm.client.particle.RippedSailParticle;
import hal.studios.hpm.client.particle.PlankSplinterParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HpmModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HpmModParticleTypes.RIPPED_SAIL.get(), RippedSailParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HpmModParticleTypes.RIPPED_SAIL_PIRATE.get(), RippedSailPirateParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HpmModParticleTypes.PLANK_SPLINTER.get(), PlankSplinterParticle::provider);
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) HpmModParticleTypes.SPLINTERS.get(), SplintersParticle::provider);
	}
}
