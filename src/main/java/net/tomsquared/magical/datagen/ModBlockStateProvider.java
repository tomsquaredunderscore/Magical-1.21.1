package net.tomsquared.magical.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.tomsquared.magical.Magical;
import net.tomsquared.magical.block.ModBlocks;
import net.tomsquared.magical.block.ModBlocks;
import net.tomsquared.magical.world.level.block.BulbVinesBlock;
import net.tomsquared.magical.world.level.block.BulbVinesPlantBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Magical.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(
                ModBlocks.SICLE.get(),
                models().cross(
                        "sicle",
                        blockTexture(ModBlocks.SICLE.get())
                ).renderType("cutout")
        );
        simpleBlock(
                ModBlocks.POTTED_SICLE.get(),
                models().withExistingParent(
                                "potted_sicle",
                                mcLoc("block/flower_pot_cross")
                        ).texture("plant", blockTexture(ModBlocks.SICLE.get()))
                        .renderType("cutout")
        );
        BlockModelBuilder bulbVine = models()
                .cross("bulb_vine", modLoc("block/bulb_vine"))
                .renderType("cutout");

        getVariantBuilder(ModBlocks.BULB_VINE.get())
                .forAllStates(state -> {
                    boolean berries = state.getValue(BulbVinesBlock.BERRIES);

                    return ConfiguredModel.builder()
                            .modelFile(bulbVine)
                            .build();
                });
    }


    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void pillarBlockWithItem(DeferredBlock<?> deferredBlock, ResourceLocation endTexture, ResourceLocation sideTexture) {
        BlockModelBuilder model = models().cubeColumn(
                deferredBlock.getId().getPath(),
                endTexture,
                sideTexture
        );
        logBlock((RotatedPillarBlock) deferredBlock.get());
        simpleBlockItem(deferredBlock.get(), model);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("magical:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("magical:block/" + deferredBlock.getId().getPath() + appendix));
    }
}