package dk.jsdfj.villageroverride;

import dev.isxander.yacl3.api.*;
import dev.isxander.yacl3.api.controller.EnumControllerBuilder;
import net.minecraft.network.chat.Component;

public final class Villageroverride {
    public static final String MOD_ID = "villageroverride";

    public static VillagerTypes villagerTypeOption = VillagerTypes.BIOME;

    public static final String CONFIG_FILE_NAME = "villageroverride.yml";
    private static YetAnotherConfigLib.Builder YACLConfig;
    public static CommonPlatform platform;

    public static VillagerOverrideConfig CONFIG;

    public static void init(CommonPlatform platform) {
        Villageroverride.platform = platform;
        YACLConfig = YetAnotherConfigLib.createBuilder()
                .title(Component.literal("Used for narration. Could be used to render a title in the future."))
                .category(ConfigCategory.createBuilder()
                        .name(Component.literal("Name of the category"))
                        .tooltip(Component.literal("This text will appear as a tooltip when you hover or focus the button with Tab. There is no need to add \n to wrap as YACL will do it for you."))
                        .option(Option.<VillagerTypes>createBuilder()
                                .name(Component.literal("Villager Type"))
                                .description(OptionDescription.of(Component.literal("The type of villager that should be forced.")))
                                .controller(opt -> EnumControllerBuilder.create(opt)
                                        .enumClass(VillagerTypes.class))
                                .binding(
                                        VillagerTypes.BIOME, // the default value
                                        () -> villagerTypeOption, // a getter to get the current value from
                                        newVal -> villagerTypeOption = newVal
                                )
                                .build())
                        .build());
    }

    public static YetAnotherConfigLib.Builder getYACLConfig() {
        return YACLConfig;
    }
}
