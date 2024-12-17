
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
import net.mcreator.vanillaplusmachines.item.StringedDiamondCoatedIronPickaxeItem;
import net.mcreator.vanillaplusmachines.item.StringedCopperCoatedIronPickaxeItem;
import net.mcreator.vanillaplusmachines.item.DiamondCoatedIronPickaxeItem;
import net.mcreator.vanillaplusmachines.item.CopperCoatedShovelItem;
import net.mcreator.vanillaplusmachines.item.CopperCoatedIronPickaxeItem;
import net.mcreator.vanillaplusmachines.item.CoatingTrimShovelItem;
import net.mcreator.vanillaplusmachines.item.CoatingTrimItem;
import net.mcreator.vanillaplusmachines.item.CoatingTrimClayShovelItem;
import net.mcreator.vanillaplusmachines.item.CoatingTrimClayItem;
import net.mcreator.vanillaplusmachines.VanillaplusmachinesMod;

public class VanillaplusmachinesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(VanillaplusmachinesMod.MODID);
	public static final DeferredItem<Item> VPMLOGO = REGISTRY.register("vpmlogo", VpmlogoItem::new);
	public static final DeferredItem<Item> TRIPPLE_FURNACE = block(VanillaplusmachinesModBlocks.TRIPPLE_FURNACE);
	public static final DeferredItem<Item> OBSERVER_PISTON = block(VanillaplusmachinesModBlocks.OBSERVER_PISTON);
	public static final DeferredItem<Item> BABYSORTER = block(VanillaplusmachinesModBlocks.BABYSORTER);
	public static final DeferredItem<Item> CONCRETE_MIXER = block(VanillaplusmachinesModBlocks.CONCRETE_MIXER);
	public static final DeferredItem<Item> CONCRETE_MIXER_WATERED = block(VanillaplusmachinesModBlocks.CONCRETE_MIXER_WATERED);
	public static final DeferredItem<Item> COPPER_COATED_IRON_PICKAXE = REGISTRY.register("copper_coated_iron_pickaxe", CopperCoatedIronPickaxeItem::new);
	public static final DeferredItem<Item> STRINGED_COPPER_COATED_IRON_PICKAXE = REGISTRY.register("stringed_copper_coated_iron_pickaxe", StringedCopperCoatedIronPickaxeItem::new);
	public static final DeferredItem<Item> DIAMOND_COATED_IRON_PICKAXE = REGISTRY.register("diamond_coated_iron_pickaxe", DiamondCoatedIronPickaxeItem::new);
	public static final DeferredItem<Item> STRINGED_DIAMOND_COATED_IRON_PICKAXE = REGISTRY.register("stringed_diamond_coated_iron_pickaxe", StringedDiamondCoatedIronPickaxeItem::new);
	public static final DeferredItem<Item> COATING_TRIM = REGISTRY.register("coating_trim", CoatingTrimItem::new);
	public static final DeferredItem<Item> COATING_TRIM_CLAY = REGISTRY.register("coating_trim_clay", CoatingTrimClayItem::new);
	public static final DeferredItem<Item> COPPER_COATED_SHOVEL = REGISTRY.register("copper_coated_shovel", CopperCoatedShovelItem::new);
	public static final DeferredItem<Item> COATING_TRIM_CLAY_SHOVEL = REGISTRY.register("coating_trim_clay_shovel", CoatingTrimClayShovelItem::new);
	public static final DeferredItem<Item> COATING_TRIM_SHOVEL = REGISTRY.register("coating_trim_shovel", CoatingTrimShovelItem::new);
	public static final DeferredItem<Item> GRINDERER = block(VanillaplusmachinesModBlocks.GRINDERER);
	public static final DeferredItem<Item> SCHLEIFSTEIN = block(VanillaplusmachinesModBlocks.SCHLEIFSTEIN);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
