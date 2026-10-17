package net.tomsquared.magical.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.tomsquared.magical.Magical;
import net.tomsquared.magical.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Magical.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // 2D item textures
        basicItem(ModItems.ROSEQUARTZ.get());
        basicItem(ModItems.ROSEDUST.get());
        basicItem(ModItems.HORSE_RADISH.get());
        basicItem(ModItems.RADISH.get());
        basicItem(ModItems.CORN_COB.get());
        basicItem(ModItems.CUT_CORN.get());
        basicItem(ModItems.COOKED_CORN.get());
        basicItem(ModItems.MINI_LEMON_TART.get());
    }

    // Two clean, reused helper methods for every wood type
    public void fenceItem(DeferredBlock<?> block, String vanillaTexturePath) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", mcLoc(vanillaTexturePath));
    }

    public void wallItem(DeferredBlock<?> block, String vanillaTexturePath) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", mcLoc(vanillaTexturePath));
    }
}