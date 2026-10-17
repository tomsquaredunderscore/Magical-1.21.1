package net.tomsquared.magical.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.tomsquared.magical.Magical;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Magical.MOD_ID);


    public static final DeferredItem<Item> SICLE_OIL = ITEMS.register("sicle_oil",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ROSEQUARTZ = ITEMS.register("rose_quartz",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> BULB_BERRIES = ITEMS.register("bulb_berries",
            () -> new Item(new Item.Properties().food(ModFoods.BULB_BERRIES)));

    public static final DeferredItem<Item> HORSE_RADISH = ITEMS.register("horse_radish",
            () -> new Item(new Item.Properties().food(ModFoods.HORSE_RADISH)));

    public static final DeferredItem<Item> RADISH = ITEMS.register("radish",
            () -> new Item(new Item.Properties().food(ModFoods.RADISH)));

    public static final DeferredItem<Item> CORN_COB = ITEMS.register("corn_cob",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_COB)));

    public static final DeferredItem<Item> CUT_CORN = ITEMS.register("cut_corn",
            () -> new Item(new Item.Properties().food(ModFoods.CUT_CORN)));

    public static final DeferredItem<Item> COOKED_CORN = ITEMS.register("cooked_corn",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_CORN)));



    public static final DeferredItem<Item> MINI_LEMON_TART = ITEMS.register("mini_lemon_tart",
            () -> new Item(new Item.Properties().food(ModFoods.MINI_LEMON_TART)));


    public static final DeferredItem<Item> ROSEDUST = ITEMS.register("rose_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> STAFF_ROD = ITEMS.register("staff_rod",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> FISH_STICKS = ITEMS.register("fish_sticks",
            () -> new Item(new Item.Properties()));


    public static final DeferredItem<Item> NET = ITEMS.register("net",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> SICLE_SEED = ITEMS.register("sicle_seed",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> SLING_SHOT = ITEMS.register("sling_shot",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> COPPER_RING = ITEMS.register("copper_ring",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static final DeferredItem<Item> SPELL_PAPER = ITEMS.register("spell_paper",
            () -> new Item(new Item.Properties().stacksTo(1)));





    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
    }

}
