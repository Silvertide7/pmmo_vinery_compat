package net.silvertide.pmmo_vinery_compat.fabric;

import net.fabricmc.api.ModInitializer;
import net.silvertide.pmmo_vinery_compat.PMMOVineryCompat;

public class PMMOVineryCompatFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        PMMOVineryCompat.init();
        PMMOVineryCompat.commonSetup();
    }
}
