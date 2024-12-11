
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vanillaplusmachines.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.vanillaplusmachines.VanillaplusmachinesMod;

public class VanillaplusmachinesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VanillaplusmachinesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> VPMTAB = REGISTRY.register("vpmtab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.vanillaplusmachines.vpmtab")).icon(() -> new ItemStack(VanillaplusmachinesModItems.VPMLOGO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(VanillaplusmachinesModBlocks.TRIPPLE_FURNACE.get().asItem());
				tabData.accept(VanillaplusmachinesModBlocks.OBSERVER_PISTON.get().asItem());
				tabData.accept(VanillaplusmachinesModBlocks.BABYSORTER.get().asItem());
				tabData.accept(VanillaplusmachinesModBlocks.CONCRETE_MIXER.get().asItem());
				tabData.accept(VanillaplusmachinesModBlocks.CONCRETE_MIXER_WATERED.get().asItem());
			})

					.build());
}
