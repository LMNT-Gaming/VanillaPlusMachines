package net.mcreator.vanillaplusmachines.procedures;

import net.minecraft.world.item.ItemStack;

public class TrippleFurnaceFuelSlotProcedure {
	public static boolean execute(ItemStack itemstack) {
		return !(itemstack.getBurnTime(null) > 0);
	}
}
