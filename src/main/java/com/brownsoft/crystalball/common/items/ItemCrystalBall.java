package com.brownsoft.crystalball.common.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by chrisfirenze on 5/31/2016.
 */
public class ItemCrystalBall extends ItemBase {
    public ItemCrystalBall() {
        super("crystalBall");

        setMaxStackSize(16);
        setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.RARE;
    }
}
