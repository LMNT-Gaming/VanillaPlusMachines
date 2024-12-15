
package net.mcreator.vanillaplusmachines.network;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.vanillaplusmachines.world.inventory.TrippleFurnaceGuiMenu;
import net.mcreator.vanillaplusmachines.procedures.TrippleFurnaceXPButtonProcedure;
import net.mcreator.vanillaplusmachines.VanillaplusmachinesMod;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record TrippleFurnaceGuiButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<TrippleFurnaceGuiButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(VanillaplusmachinesMod.MODID, "tripple_furnace_gui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, TrippleFurnaceGuiButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, TrippleFurnaceGuiButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new TrippleFurnaceGuiButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<TrippleFurnaceGuiButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final TrippleFurnaceGuiButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = TrippleFurnaceGuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TrippleFurnaceXPButtonProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		VanillaplusmachinesMod.addNetworkMessage(TrippleFurnaceGuiButtonMessage.TYPE, TrippleFurnaceGuiButtonMessage.STREAM_CODEC, TrippleFurnaceGuiButtonMessage::handleData);
	}
}
