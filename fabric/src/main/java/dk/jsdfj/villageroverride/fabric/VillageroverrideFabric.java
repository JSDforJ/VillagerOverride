package dk.jsdfj.villageroverride.fabric;

import dk.jsdfj.villageroverride.Villageroverride;
import net.fabricmc.api.ModInitializer;

public final class VillageroverrideFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Villageroverride.init();
    }
}
