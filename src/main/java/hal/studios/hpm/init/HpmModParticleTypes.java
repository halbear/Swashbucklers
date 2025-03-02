
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package hal.studios.hpm.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import hal.studios.hpm.HpmMod;

public class HpmModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HpmMod.MODID);
	public static final RegistryObject<ParticleType<?>> RIPPED_SAIL = REGISTRY.register("ripped_sail", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> RIPPED_SAIL_PIRATE = REGISTRY.register("ripped_sail_pirate", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> PLANK_SPLINTER = REGISTRY.register("plank_splinter", () -> new SimpleParticleType(false));
	public static final RegistryObject<ParticleType<?>> SPLINTERS = REGISTRY.register("splinters", () -> new SimpleParticleType(false));
}
