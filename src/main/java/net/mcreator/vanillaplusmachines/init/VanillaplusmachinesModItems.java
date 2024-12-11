
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vanillaplusmachines.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.vanillaplusmachines.item.VpmlogoItem;
import net.mcreator.vanillaplusmachines.VanillaplusmachinesMod;

public class VanillaplusmachinesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(VanillaplusmachinesMod.MODID);
	public static final DeferredItem<Item> VPMLOGO = REGISTRY.register("vpmlogo", VpmlogoItem::new);
	public static final DeferredItem<Item> TRIPPLE_FURNACE = block(VanillaplusmachinesModBlocks.TRIPPLE_FURNACE);
	public static final DeferredItem<Item> OBSERVER_PISTON = block(VanillaplusmachinesModBlocks.OBSERVER_PISTON);
	public static final DeferredItem<Item> BABYSORTER = block(VanillaplusmachinesModBlocks.BABYSORTER);
	public static final DeferredItem<Item> CONCRETE_MIXER = block(VanillaplusmachinesModBlocks.CONCRETE_MIXER);
	public static final DeferredItem<Item> CONCRETE_MIXER_WATERED = block(VanillaplusmachinesModBlocks.CONCRETE_MIXER_WATERED);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
