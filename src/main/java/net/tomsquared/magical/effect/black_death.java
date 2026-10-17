package net.tomsquared.magical.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class black_death extends MobEffect {
    public black_death(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);

    }

    @Override
    public boolean applyEffectTick(LivingEntity entity, int amplifier) {
        if (entity.getHealth() > 0.5F) {
            entity.hurt(entity.damageSources().magic(), 0.1F);

            if (entity instanceof Player player) {
                player.causeFoodExhaustion(0.005F * (amplifier + 1));
            }
        }

        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}