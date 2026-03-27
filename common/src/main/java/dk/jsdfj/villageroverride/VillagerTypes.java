package dk.jsdfj.villageroverride;

import dev.isxander.yacl3.api.NameableEnum;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.villager.VillagerType;
import org.apache.commons.lang3.StringUtils;

public enum VillagerTypes implements NameableEnum {
    BIOME(null),
    DESERT(VillagerType.DESERT),
    JUNGLE(VillagerType.JUNGLE),
    PLAINS(VillagerType.PLAINS),
    SAVANNA(VillagerType.SAVANNA),
    SNOW(VillagerType.SNOW),
    SWAMP(VillagerType.SWAMP),
    TAIGA(VillagerType.TAIGA);

    public final ResourceKey<VillagerType> type;

    VillagerTypes(ResourceKey<VillagerType> type) {
        this.type = type;
    }

    @Override
    public Component getDisplayName() {
        if (this == BIOME) {
            return Component.translatable("selectWorld.mapType.normal").withColor(TextColor.fromRgb(0xFF0000).getValue());
        } else if (this == SNOW) {
            return Component.translatable("block.minecraft.snow");
        } else {
            return Component.translatable("biome.minecraft." + name().toLowerCase());
        }
    }
}
