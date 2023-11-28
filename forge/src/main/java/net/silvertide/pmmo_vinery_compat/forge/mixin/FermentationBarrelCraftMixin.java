package net.silvertide.pmmo_vinery_compat.forge.mixin;

import net.silvertide.pmmo_vinery_compat.PMMOVineryCompat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import satisfyu.vinery.block.entity.FermentationBarrelBlockEntity;

@Mixin(FermentationBarrelBlockEntity.class)
public class FermentationBarrelCraftMixin {
    @Inject(method = "craft(Lnet/minecraft/world/item/crafting/Recipe;Lnet/minecraft/core/RegistryAccess;)V",at = @At("HEAD"), remap = false)
    private void modifyArgFunctionHere(CallbackInfo info) {
        PMMOVineryCompat.LOGGER.info("Craft stuff!");
    }
}
