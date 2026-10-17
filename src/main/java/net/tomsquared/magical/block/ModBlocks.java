package net.tomsquared.magical.block;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tomsquared.magical.Magical;
import net.tomsquared.magical.item.ModItems;
import net.tomsquared.magical.world.level.block.BulbVinesBlock;
import net.tomsquared.magical.world.level.block.BulbVinesPlantBlock;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Magical.MOD_ID);

    public static final DeferredBlock<BulbVinesPlantBlock> BULB_VINE_PLANT =
            registerBlock("bulb_vine_plant",
                    () -> new BulbVinesPlantBlock(
                            BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES_PLANT)
                                    .noOcclusion()));

    public static final DeferredBlock<BulbVinesBlock> BULB_VINE =
            registerBlock("bulb_vine",
                    () -> new BulbVinesBlock(
                            BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES)
                                    .noOcclusion()));

    public static final DeferredBlock<FlowerBlock> SICLE =
            registerBlock("sicle",
                    () -> new FlowerBlock(
                            MobEffects.CONFUSION, 5,
                            BlockBehaviour.Properties.ofFullCopy(Blocks.ALLIUM)
                                    .noOcclusion().noCollission()));

    public static final DeferredBlock<FlowerPotBlock> POTTED_SICLE =
            BLOCKS.register("potted_sicle",
                    () -> new FlowerPotBlock(
                            () -> (FlowerPotBlock) Blocks.FLOWER_POT,
                            SICLE,
                            BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_ALLIUM)
                                    .noOcclusion()));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);

    }


}
