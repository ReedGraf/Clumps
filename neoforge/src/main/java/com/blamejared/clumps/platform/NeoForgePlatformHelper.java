package com.blamejared.clumps.platform;

import net.minecraft.world.item.ItemStack;

public class NeoForgePlatformHelper implements IPlatformHelper {
    
    @Override
    public float getRepairRatio(ItemStack stack) {
        
        return stack.getXpRepairRatio();
    }
    
}
