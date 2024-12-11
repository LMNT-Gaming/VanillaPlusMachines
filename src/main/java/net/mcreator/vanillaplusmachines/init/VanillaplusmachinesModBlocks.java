
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vanillaplusmachines.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.vanillaplusmachines.block.TrippleFurnaceBlock;
import net.mcreator.vanillaplusmachines.block.ObserverPistonBlock;
import net.mcreator.vanillaplusmachines.block.ConcreteMixerWateredBlock;
import net.mcreator.vanillaplusmachines.block.ConcreteMixerBlock;
import net.mcreator.vanillaplusmachines.block.BabysorterBlock;
import net.mcreator.vanillaplusmachines.VanillaplusmachinesMod;

public class VanillaplusmachinesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(VanillaplusmachinesMod.MODID);
	public static final DeferredBlock<Block> TRIPPLE_FURNACE = REGISTRY.register("tripple_furnace", TrippleFurnaceBlock::new);
	public static final DeferredBlock<Block> OBSERVER_PISTON = REGISTRY.register("observer_piston", ObserverPistonBlock::new);
	public static final DeferredBlock<Block> BABYSORTER = REGISTRY.register("babysorter", BabysorterBlock::new);
	public static final DeferredBlock<Block> CONCRETE_MIXER = REGISTRY.register("concrete_mixer", ConcreteMixerBlock::new);
	public static final DeferredBlock<Block> CONCRETE_MIXER_WATERED = REGISTRY.register("concrete_mixer_watered", ConcreteMixerWateredBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
