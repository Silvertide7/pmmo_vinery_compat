package net.silvertide.pmmo_vinery_compat;

import net.minecraft.resources.ResourceLocation;

public class PMMOVineryCompatIdentifier extends ResourceLocation {

    public PMMOVineryCompatIdentifier(String path) {
        super(PMMOVineryCompat.MODID, path);
    }

    public static String asString(String path) {
        return (PMMOVineryCompat.MODID + ":" + path);
    }
}
