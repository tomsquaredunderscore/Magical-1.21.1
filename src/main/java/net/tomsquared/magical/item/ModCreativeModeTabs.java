package net.tomsquared.magical.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tomsquared.magical.block.ModBlocks;
import net.tomsquared.magical.item.ModItems;



public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "magical");

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAGICAL_TAB =
            CREATIVE_MODE_TABS.register("magical_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.magical.tab"))
                    .icon(() -> new ItemStack(ModItems.SICLE_OIL.get()))
                    .displayItems((parameters, output) -> {

                        output.accept(ModItems.SICLE_OIL.get());
                        output.accept(ModItems.ROSEQUARTZ.get());
                        output.accept(ModItems.ROSEDUST.get());
                        output.accept(ModItems.STAFF_ROD.get());
                        output.accept(ModItems.FISH_STICKS.get());
                        output.accept(ModItems.NET.get());
                        output.accept(ModItems.SICLE_SEED.get());
                        output.accept(ModItems.SLING_SHOT.get());
                        output.accept(ModItems.COPPER_RING.get());
                        output.accept(ModItems.SPELL_PAPER.get());

                        output.accept(ModItems.BULB_BERRIES.get());
                        output.accept(ModItems.HORSE_RADISH.get());
                        output.accept(ModItems.RADISH.get());
                        output.accept(ModItems.CORN_COB.get());
                        output.accept(ModItems.CUT_CORN.get());
                        output.accept(ModItems.COOKED_CORN.get());
                        output.accept(ModItems.MINI_LEMON_TART.get());

                        output.accept(ModBlocks.BULB_VINE_PLANT.get());
                        output.accept(ModBlocks.BULB_VINE.get());
                        output.accept(ModBlocks.SICLE.get());

                    })
                    .build()
            );

}