package dk.jsdfj.villageroverride;

import com.google.gson.GsonBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;

public class VillagerOverrideConfig {
    public static ConfigClassHandler<VillagerOverrideConfig> HANDLER = ConfigClassHandler.createBuilder(VillagerOverrideConfig.class)
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setPath(Villageroverride.platform.getConfigDir().resolve("villageroverride.json5"))
                    .appendGsonBuilder(GsonBuilder::setPrettyPrinting) // not needed, pretty print by default
                    .setJson5(true)
                    .build())
            .build();

    @SerialEntry
    public VillagerTypes type = VillagerTypes.BIOME;
}
