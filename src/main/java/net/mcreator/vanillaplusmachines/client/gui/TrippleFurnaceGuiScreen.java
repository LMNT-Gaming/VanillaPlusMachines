package net.mcreator.vanillaplusmachines.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.vanillaplusmachines.world.inventory.TrippleFurnaceGuiMenu;
import net.mcreator.vanillaplusmachines.procedures.TrppleFurnaceGUIProcRProcedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcUpProcedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcUp90Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcUp75Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcUp50Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcR90Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcR75Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcR50Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcLProcedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcL90Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcL75Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIProcL50Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIFuelProcedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIFuel90Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIFuel60Procedure;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceGUIFuel30Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TrippleFurnaceGuiScreen extends AbstractContainerScreen<TrippleFurnaceGuiMenu> {
	private final static HashMap<String, Object> guistate = TrippleFurnaceGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public TrippleFurnaceGuiScreen(TrippleFurnaceGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("vanillaplusmachines:textures/screens/tripple_furnace_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 75 && mouseX < leftPos + 99 && mouseY > topPos + 39 && mouseY < topPos + 63)
			guiGraphics.renderTooltip(font, Component.literal(TrippleFurnaceGUIFuelProcedure.execute(world, x, y, z)), mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (TrppleFurnaceGUIProcRProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnace25.png"), this.leftPos + 106, this.topPos + 53, 0, 0, 34, 3, 34, 3);
		}
		if (TrippleFurnaceGUIProcR50Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnace50.png"), this.leftPos + 106, this.topPos + 53, 0, 0, 34, 3, 34, 3);
		}
		if (TrippleFurnaceGUIProcR75Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnace75.png"), this.leftPos + 106, this.topPos + 53, 0, 0, 34, 3, 34, 3);
		}
		if (TrippleFurnaceGUIFuel30Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/flame30.png"), this.leftPos + 80, this.topPos + 45, 0, 0, 13, 13, 13, 13);
		}
		if (TrippleFurnaceGUIFuel60Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/flame60.png"), this.leftPos + 80, this.topPos + 45, 0, 0, 13, 13, 13, 13);
		}
		if (TrippleFurnaceGUIFuel90Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/flame100.png"), this.leftPos + 80, this.topPos + 45, 0, 0, 13, 13, 13, 13);
		}
		if (TrippleFurnaceGUIProcR90Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnace90.png"), this.leftPos + 106, this.topPos + 53, 0, 0, 34, 3, 34, 3);
		}
		if (TrippleFurnaceGUIProcLProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnace25l.png"), this.leftPos + 34, this.topPos + 53, 0, 0, 34, 3, 34, 3);
		}
		if (TrippleFurnaceGUIProcL50Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnace50l.png"), this.leftPos + 34, this.topPos + 53, 0, 0, 34, 3, 34, 3);
		}
		if (TrippleFurnaceGUIProcL75Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnace75l.png"), this.leftPos + 34, this.topPos + 53, 0, 0, 34, 3, 34, 3);
		}
		if (TrippleFurnaceGUIProcL90Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnace90l.png"), this.leftPos + 34, this.topPos + 53, 0, 0, 34, 3, 34, 3);
		}
		if (TrippleFurnaceGUIProcUpProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnaceh25.png"), this.leftPos + 97, this.topPos + 8, 0, 0, 3, 34, 3, 34);
		}
		if (TrippleFurnaceGUIProcUp50Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnaceh50.png"), this.leftPos + 97, this.topPos + 8, 0, 0, 3, 34, 3, 34);
		}
		if (TrippleFurnaceGUIProcUp75Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnaceh75.png"), this.leftPos + 97, this.topPos + 8, 0, 0, 3, 34, 3, 34);
		}
		if (TrippleFurnaceGUIProcUp90Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/furnaceh90.png"), this.leftPos + 97, this.topPos + 8, 0, 0, 3, 34, 3, 34);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
	}
}
