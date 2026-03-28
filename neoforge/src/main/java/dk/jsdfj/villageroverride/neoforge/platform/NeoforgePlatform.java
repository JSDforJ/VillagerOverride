package dk.jsdfj.villageroverride.neoforge.platform;

import dk.jsdfj.villageroverride.platform.CommonPlatform;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public class NeoforgePlatform implements CommonPlatform {
    @Override
    public Path getConfigDir() {
        return FMLPaths.CONFIGDIR.get();
    }
}
