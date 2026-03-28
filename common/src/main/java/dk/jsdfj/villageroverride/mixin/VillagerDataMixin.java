package dk.jsdfj.villageroverride.mixin;

import dk.jsdfj.villageroverride.VillagerTypes;
import dk.jsdfj.villageroverride.Villageroverride;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.npc.villager.VillagerData;
import net.minecraft.world.entity.npc.villager.VillagerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(VillagerData.class)
public class VillagerDataMixin {
    @Inject(
            method = {"type"},
            at = {@At("HEAD")},
            cancellable = true
    )
    private void forceVillagerType(CallbackInfoReturnable<Holder<VillagerType>> cir) {
        if (Villageroverride.CONFIG.type == VillagerTypes.BIOME) return;
        cir.setReturnValue(BuiltInRegistries.VILLAGER_TYPE.getOrThrow(Villageroverride.CONFIG.type.type));
    }
}
