package net.silvertide.pmmo_vinery_compat.forge.util;

import harmonised.pmmo.storage.ChunkDataHandler;
import harmonised.pmmo.storage.ChunkDataProvider;
import harmonised.pmmo.storage.IChunkData;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;

import java.util.UUID;

public class EventUtil {
    public static void postPlayerCraftEvent(Level level, BlockPos pos, ItemStack stack) {
        if(level == null || level.isClientSide) return;
        IChunkData cap = level.getChunkAt(pos).getCapability(ChunkDataProvider.CHUNK_CAP).orElseGet(ChunkDataHandler::new);
        UUID pid = cap.checkPos(pos);
        if (pid == null) return;

        ServerPlayer player = level.getServer().getPlayerList().getPlayer(pid);
        if (player == null) return;
        MinecraftForge.EVENT_BUS.post(new PlayerEvent.ItemCraftedEvent(player, stack, new SimpleContainer(0)));
    }
}
