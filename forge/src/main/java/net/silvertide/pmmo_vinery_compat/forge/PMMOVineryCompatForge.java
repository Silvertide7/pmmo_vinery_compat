package net.silvertide.pmmo_vinery_compat.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.silvertide.pmmo_vinery_compat.PMMOVineryCompat;
import net.silvertide.pmmo_vinery_compat.util.PMMOVineryCompatPre;

@Mod(PMMOVineryCompat.MODID)
public class PMMOVineryCompatForge {
    public PMMOVineryCompatForge() {
        EventBuses.registerModEventBus(PMMOVineryCompat.MODID, FMLJavaModLoadingContext.get().getModEventBus());
        PMMOVineryCompatPre.preInit();
        PMMOVineryCompat.init();
        PMMOVineryCompat.commonSetup();
    }
}
