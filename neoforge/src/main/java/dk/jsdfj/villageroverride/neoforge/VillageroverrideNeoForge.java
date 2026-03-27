package dk.jsdfj.villageroverride.neoforge;

import dk.jsdfj.villageroverride.Villageroverride;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(Villageroverride.MOD_ID)
public final class VillageroverrideNeoForge {
    public VillageroverrideNeoForge() {
        // Run our common setup.
        Villageroverride.init();

        ModLoadingContext.get().registerExtensionPoint(
                IConfigScreenFactory.class,
                () -> (client, parent) -> Villageroverride.getYACLConfig().build()
                        .generateScreen(parent)
        );
    }
}
