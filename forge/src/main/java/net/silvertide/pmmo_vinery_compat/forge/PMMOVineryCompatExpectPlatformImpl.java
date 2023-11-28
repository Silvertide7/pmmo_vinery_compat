package net.silvertide.pmmo_vinery_compat.forge;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class PMMOVineryCompatExpectPlatformImpl {
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
}
