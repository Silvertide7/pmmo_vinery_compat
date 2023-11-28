package net.silvertide.pmmo_vinery_compat.forge.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegisterEvent;
import net.silvertide.pmmo_vinery_compat.PMMOVineryCompat;

@Mod.EventBusSubscriber(modid = PMMOVineryCompat.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class PMMOVineryCompatClientForge {

    @SubscribeEvent
    public static void beforeClientSetup(RegisterEvent event) {
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
    }

}
