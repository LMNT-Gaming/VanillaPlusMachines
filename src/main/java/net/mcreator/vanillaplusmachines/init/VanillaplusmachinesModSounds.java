
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vanillaplusmachines.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.vanillaplusmachines.VanillaplusmachinesMod;

public class VanillaplusmachinesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, VanillaplusmachinesMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> GRINDERMACHINE = REGISTRY.register("grindermachine", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("vanillaplusmachines", "grindermachine")));
}
