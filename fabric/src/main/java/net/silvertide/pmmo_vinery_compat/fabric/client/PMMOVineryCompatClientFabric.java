package net.silvertide.pmmo_vinery_compat.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.silvertide.pmmo_vinery_compat.client.NetherVineryClient;

public class PMMOVineryCompatClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        NetherVineryClient.onInitializeClient();
    }
}
