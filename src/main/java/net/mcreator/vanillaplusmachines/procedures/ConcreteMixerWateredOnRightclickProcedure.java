package net.mcreator.vanillaplusmachines.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ConcreteMixerWateredOnRightclickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.WHITE_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.WHITE_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.WHITE_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.ORANGE_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.ORANGE_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.ORANGE_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.MAGENTA_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.MAGENTA_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.MAGENTA_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_BLUE_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.LIGHT_BLUE_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.LIGHT_BLUE_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.YELLOW_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.YELLOW_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.YELLOW_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIME_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.LIME_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.LIME_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PINK_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.PINK_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.PINK_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GRAY_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.GRAY_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.GRAY_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.LIGHT_GRAY_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.LIGHT_GRAY_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.LIGHT_GRAY_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.CYAN_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.CYAN_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.CYAN_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.PURPLE_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.PURPLE_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.PURPLE_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BLUE_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.BLUE_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.BLUE_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BROWN_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.BROWN_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.BROWN_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.GREEN_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.GREEN_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.GREEN_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.RED_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.RED_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.RED_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Blocks.BLACK_CONCRETE_POWDER.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.BLACK_CONCRETE_POWDER);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.BLACK_CONCRETE).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
