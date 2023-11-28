package net.silvertide.pmmo_vinery_compat;

import dev.architectury.injectables.annotations.ExpectPlatform;

import java.nio.file.Path;

public class PMMOVineryCompatExpectPlatform {
    @ExpectPlatform
    public static Path getConfigDirectory() {
        throw new AssertionError();
    }
}
