package net.mcreator.vanillaplusmachines.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.vanillaplusmachines.world.inventory.GrinderGUIMenu;
import net.mcreator.vanillaplusmachines.procedures.TapGrindButtonVisibleProcedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder90Procedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder80Procedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder70Procedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder60Procedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder50Procedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder40Procedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder30Procedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder20Procedure;
import net.mcreator.vanillaplusmachines.procedures.Grinder10Procedure;
import net.mcreator.vanillaplusmachines.network.GrinderGUIButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class GrinderGUIScreen extends AbstractContainerScreen<GrinderGUIMenu> {
	private final static HashMap<String, Object> guistate = GrinderGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_grind;
	Button button_start;

	public GrinderGUIScreen(GrinderGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("vanillaplusmachines:textures/screens/grinder_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/leiste.png"), this.leftPos + 6, this.topPos + 31, 0, 0, 162, 14, 162, 14);

		if (Grinder10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/10.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
		}
		if (Grinder20Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/20.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
		}
		if (Grinder30Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/30.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
		}
		if (Grinder40Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/40.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
		}
		if (Grinder50Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/50.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
		}
		if (Grinder60Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/60.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
		}
		if (Grinder70Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/70.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
		}
		if (Grinder80Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/80.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
		}
		if (Grinder90Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(ResourceLocation.parse("vanillaplusmachines:textures/screens/90.png"), this.leftPos + 7, this.topPos + 32, 0, 0, 160, 12, 160, 12);
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
		button_grind = Button.builder(Component.translatable("gui.vanillaplusmachines.grinder_gui.button_grind"), e -> {
			if (TapGrindButtonVisibleProcedure.execute(world, x, y, z)) {
				PacketDistributor.sendToServer(new GrinderGUIButtonMessage(0, x, y, z));
				GrinderGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 52, 51, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = TapGrindButtonVisibleProcedure.execute(world, x, y, z);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_grind", button_grind);
		this.addRenderableWidget(button_grind);
		button_start = Button.builder(Component.translatable("gui.vanillaplusmachines.grinder_gui.button_start"), e -> {
			if (TapGrindButtonVisibleProcedure.execute(world, x, y, z)) {
				PacketDistributor.sendToServer(new GrinderGUIButtonMessage(1, x, y, z));
				GrinderGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 6, this.topPos + 52, 51, 20).build(builder -> new Button(builder) {
			@Override
			public void renderWidget(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				this.visible = TapGrindButtonVisibleProcedure.execute(world, x, y, z);
				super.renderWidget(guiGraphics, gx, gy, ticks);
			}
		});
		guistate.put("button:button_start", button_start);
		this.addRenderableWidget(button_start);
	}
}
