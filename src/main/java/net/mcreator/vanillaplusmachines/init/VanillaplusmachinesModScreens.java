
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vanillaplusmachines.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.vanillaplusmachines.client.gui.TrippleFurnaceGuiScreen;
import net.mcreator.vanillaplusmachines.client.gui.ObserverPistonGuiScreen;
import net.mcreator.vanillaplusmachines.client.gui.GrinderGUIScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class VanillaplusmachinesModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(VanillaplusmachinesModMenus.TRIPPLE_FURNACE_GUI.get(), TrippleFurnaceGuiScreen::new);
		event.register(VanillaplusmachinesModMenus.OBSERVER_PISTON_GUI.get(), ObserverPistonGuiScreen::new);
		event.register(VanillaplusmachinesModMenus.GRINDER_GUI.get(), GrinderGUIScreen::new);
	}
}
