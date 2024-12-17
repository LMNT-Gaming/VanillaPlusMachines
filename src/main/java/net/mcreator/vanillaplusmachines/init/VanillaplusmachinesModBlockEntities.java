
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vanillaplusmachines.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.vanillaplusmachines.block.entity.TrippleFurnaceBlockEntity;
import net.mcreator.vanillaplusmachines.block.entity.SchleifsteinBlockEntity;
import net.mcreator.vanillaplusmachines.block.entity.ObserverPistonBlockEntity;
import net.mcreator.vanillaplusmachines.block.entity.GrindererBlockEntity;
import net.mcreator.vanillaplusmachines.block.entity.BabysorterBlockEntity;
import net.mcreator.vanillaplusmachines.VanillaplusmachinesMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class VanillaplusmachinesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, VanillaplusmachinesMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> TRIPPLE_FURNACE = register("tripple_furnace", VanillaplusmachinesModBlocks.TRIPPLE_FURNACE, TrippleFurnaceBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> OBSERVER_PISTON = register("observer_piston", VanillaplusmachinesModBlocks.OBSERVER_PISTON, ObserverPistonBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BABYSORTER = register("babysorter", VanillaplusmachinesModBlocks.BABYSORTER, BabysorterBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> GRINDERER = register("grinderer", VanillaplusmachinesModBlocks.GRINDERER, GrindererBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> SCHLEIFSTEIN = register("schleifstein", VanillaplusmachinesModBlocks.SCHLEIFSTEIN, SchleifsteinBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TRIPPLE_FURNACE.get(), (blockEntity, side) -> ((TrippleFurnaceBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, OBSERVER_PISTON.get(), (blockEntity, side) -> ((ObserverPistonBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, BABYSORTER.get(), (blockEntity, side) -> ((BabysorterBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, GRINDERER.get(), (blockEntity, side) -> ((GrindererBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, SCHLEIFSTEIN.get(), (blockEntity, side) -> ((SchleifsteinBlockEntity) blockEntity).getItemHandler());
	}
}
