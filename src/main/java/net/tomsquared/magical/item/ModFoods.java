package net.tomsquared.magical.item;

import net.minecraft.world.effect.MobEffectInstance;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.tomsquared.magical.effect.ModEffects;
public class ModFoods {



    public static final FoodProperties PITCHER_OIL = new FoodProperties.Builder().nutrition(-1).fast()
            .saturationModifier(-0.2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1f).alwaysEdible().build();

    public static final FoodProperties BULB_BERRIES = new FoodProperties.Builder().nutrition(-1).fast()
            .saturationModifier(-0.2f).effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 200), 1f).build();

    public static final FoodProperties HORSE_RADISH = new FoodProperties.Builder().nutrition(1).fast()
            .saturationModifier(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1f).build();

    public static final FoodProperties RADISH = new FoodProperties.Builder().nutrition(2).fast()
            .saturationModifier(0.5f).build();

    public static final FoodProperties CORN_COB = new FoodProperties.Builder().nutrition(3).fast()
            .saturationModifier(1f).build();

    public static final FoodProperties CUT_CORN = new FoodProperties.Builder().nutrition(3).fast()
            .saturationModifier(0.9f).build();

    public static final FoodProperties COOKED_CORN = new FoodProperties.Builder().nutrition(6).fast()
            .saturationModifier(1.9f).build();

    public static final FoodProperties RADISH_AND_BEEF_STEW = new FoodProperties.Builder().nutrition(10).fast()
            .saturationModifier(1f).build();

    public static final FoodProperties MINI_LEMON_TART = new FoodProperties.Builder().nutrition(1).fast()
            .saturationModifier(0.5f).build();

    public static final FoodProperties ROOT_BEER_MUG = new FoodProperties.Builder().nutrition(1).fast()
            .saturationModifier(0.5f).build();

    public static final FoodProperties GREENTEA = new FoodProperties.Builder().nutrition(1).fast()
            .saturationModifier(0.5f).build();

    public static final FoodProperties TORCHFLOWER_OIL = new FoodProperties.Builder().nutrition(-1).fast()
            .saturationModifier(-0.2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1f).alwaysEdible().build();

    public static final FoodProperties BULB_VINE_OIL = new FoodProperties.Builder().nutrition(-1).fast()
            .saturationModifier(-0.2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1f).alwaysEdible().build();


    public static final FoodProperties SICLE_OIL = new FoodProperties.Builder().nutrition(-1).fast()
            .saturationModifier(-0.2f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1f).alwaysEdible().build();



    public static final FoodProperties VERY_OLD_WINE = new FoodProperties.Builder().nutrition(-20).fast()
            .saturationModifier(-5f).effect(() ->new MobEffectInstance(ModEffects.BLACK_DEATH, 200), 1f)
            .alwaysEdible().build();




    public static final FoodProperties ALCOHOLS = new FoodProperties.Builder().nutrition(2).fast()
            .saturationModifier(1f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.2f).alwaysEdible().build();


    public static final FoodProperties BLACKSLUDGE = new FoodProperties.Builder().nutrition(2).fast()
            .saturationModifier(1f).effect(() -> new MobEffectInstance(MobEffects.WITHER, 200), 0.2f).alwaysEdible().build();





}