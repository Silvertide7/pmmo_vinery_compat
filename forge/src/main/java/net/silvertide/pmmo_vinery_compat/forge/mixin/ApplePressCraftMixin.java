package net.silvertide.pmmo_vinery_compat.forge.mixin;

import net.silvertide.pmmo_vinery_compat.PMMOVineryCompat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import satisfyu.vinery.block.entity.ApplePressBlockEntity;
import satisfyu.vinery.block.entity.FermentationBarrelBlockEntity;

@Mixin(ApplePressBlockEntity.class)
public class ApplePressCraftMixin {
    @Inject(method = "craftItem(Lsatisfyu/vinery/block/entity/ApplePressBlockEntity;Lsatisfyu/vinery/recipe/ApplePressRecipe;)V", at = @At("HEAD"), remap = false)
    private static void init(CallbackInfo info) {
        PMMOVineryCompat.LOGGER.info("Craft stuff!");
    }
}
