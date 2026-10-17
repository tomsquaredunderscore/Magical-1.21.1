package net.tomsquared.magical.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.tomsquared.magical.Magical;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Magical.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)

        ;



        this.tag(BlockTags.LOGS_THAT_BURN)
                     ;

        tag(BlockTags.MINEABLE_WITH_AXE)
              ;

       tag(BlockTags.WOODEN_FENCES)
              ;


        tag(BlockTags.PLANKS)
              ;



        tag(BlockTags.WALLS)
              ;

        tag(BlockTags.NEEDS_STONE_TOOL)
              ;





    }
}

