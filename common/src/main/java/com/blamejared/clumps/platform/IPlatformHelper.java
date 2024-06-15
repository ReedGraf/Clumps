package com.blamejared.clumps.platform;

import net.minecraft.world.item.ItemStack;

public interface IPlatformHelper {
    
    default float getRepairRatio(ItemStack stack) {
        
        return 1;
    }
    
}
