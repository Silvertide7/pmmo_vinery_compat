package net.silvertide.pmmo_vinery_compat.forge.mixin;

import net.silvertide.pmmo_vinery_compat.forge.util.EventUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import satisfyu.vinery.block.entity.ApplePressBlockEntity;
import satisfyu.vinery.recipe.ApplePressRecipe;

@Mixin(ApplePressBlockEntity.class)
public abstract class ApplePressCraftMixin {
    @ModifyArg(method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lsatisfyu/vinery/block/entity/ApplePressBlockEntity;)V", at = @At(value = "INVOKE", target = "satisfyu/vinery/block/entity/ApplePressBlockEntity.craftItem (Lsatisfyu/vinery/block/entity/ApplePressBlockEntity;Lsatisfyu/vinery/recipe/ApplePressRecipe;)V"), index = 0, remap = false)
    public ApplePressBlockEntity modifyArgCraftItem(ApplePressBlockEntity entity, ApplePressRecipe recipe) {
        EventUtil.postPlayerCraftEvent(entity.getLevel(), entity.getBlockPos(), recipe.assemble());
        return entity;
    }
}
