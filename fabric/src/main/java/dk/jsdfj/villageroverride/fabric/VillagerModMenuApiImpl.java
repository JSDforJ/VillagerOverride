package dk.jsdfj.villageroverride.fabric;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import dk.jsdfj.villageroverride.Villageroverride;

public class VillagerModMenuApiImpl implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parentScreen -> Villageroverride.getYACLConfig().build().generateScreen(parentScreen);
    }
}
