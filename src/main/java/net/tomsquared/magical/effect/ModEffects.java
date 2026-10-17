package net.tomsquared.magical.effect;


import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.tomsquared.magical.Magical;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModEffects {

    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(
                    net.minecraft.core.registries.Registries.MOB_EFFECT,
                    Magical.MOD_ID);

    public static final DeferredHolder<MobEffect, MobEffect> BLACK_DEATH =
            MOB_EFFECTS.register("black_death",
                    () -> new black_death(MobEffectCategory.HARMFUL, 0x000000));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}

