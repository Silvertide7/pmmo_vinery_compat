package net.silvertide.pmmo_vinery_compat.fabric;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.silvertide.pmmo_vinery_compat.util.PMMOVineryCompatPre;

public class PMMOVineryCompatFabricPre implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        PMMOVineryCompatPre.preInit();
    }
}
