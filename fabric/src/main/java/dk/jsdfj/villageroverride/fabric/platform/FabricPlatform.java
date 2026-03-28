package dk.jsdfj.villageroverride.fabric.platform;

import dk.jsdfj.villageroverride.platform.CommonPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class FabricPlatform implements CommonPlatform {
    @Override
    public Path getConfigDir() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
