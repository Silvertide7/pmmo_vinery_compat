package net.silvertide.pmmo_vinery_compat.forge.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.silvertide.pmmo_vinery_compat.forge.util.EventUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import satisfyu.vinery.block.entity.FermentationBarrelBlockEntity;

@Mixin(FermentationBarrelBlockEntity.class)
public class FermentationBarrelCraftMixin {
    @ModifyArg(method = "craft(Lnet/minecraft/world/item/crafting/Recipe;Lnet/minecraft/core/RegistryAccess;)V", at = @At(value = "INVOKE", target = "satisfyu/vinery/block/entity/FermentationBarrelBlockEntity.setItem (ILnet/minecraft/world/item/ItemStack;)V"), index = 1, remap = true)
    private ItemStack modifyArgFunctionHere(ItemStack resultStack) {
        Level level = ((FermentationBarrelBlockEntity)(Object)this).getLevel();
        BlockPos pos = ((FermentationBarrelBlockEntity)(Object)this).getBlockPos();
        for(int i = 0; i < resultStack.getCount(); i++){
            EventUtil.postPlayerCraftEvent(level, pos, resultStack);
        }
        return resultStack;
    }
}
