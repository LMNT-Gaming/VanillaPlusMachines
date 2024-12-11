
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vanillaplusmachines.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.vanillaplusmachines.world.inventory.TrippleFurnaceGuiMenu;
import net.mcreator.vanillaplusmachines.world.inventory.ObserverPistonGuiMenu;
import net.mcreator.vanillaplusmachines.VanillaplusmachinesMod;

public class VanillaplusmachinesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, VanillaplusmachinesMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TrippleFurnaceGuiMenu>> TRIPPLE_FURNACE_GUI = REGISTRY.register("tripple_furnace_gui", () -> IMenuTypeExtension.create(TrippleFurnaceGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<ObserverPistonGuiMenu>> OBSERVER_PISTON_GUI = REGISTRY.register("observer_piston_gui", () -> IMenuTypeExtension.create(ObserverPistonGuiMenu::new));
}
