package net.tomsquared.magical.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import java.util.List;


public class StaffTypeSystemItem extends Item {
    public StaffTypeSystemItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext context,
                                List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        pTooltipComponents.add(Component.translatable("tooltip.magical.staff_type_basic.tooltip"));
        super.appendHoverText(pStack, context, pTooltipComponents, pIsAdvanced);
    }
}