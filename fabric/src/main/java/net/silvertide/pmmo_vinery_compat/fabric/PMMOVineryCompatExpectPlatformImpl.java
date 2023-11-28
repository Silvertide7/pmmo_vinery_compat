package net.silvertide.pmmo_vinery_compat.fabric;

import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class PMMOVineryCompatExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
