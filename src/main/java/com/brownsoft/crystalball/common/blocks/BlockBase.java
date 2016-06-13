package com.brownsoft.crystalball.common.blocks;

import com.brownsoft.crystalball.CrystalBallMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by chrisfirenze on 5/31/2016.
 */
public class BlockBase extends Block {
    public BlockBase(String name, Material materialIn) {
        super(materialIn);

        setUnlocalizedName(name);
        setRegistryName(new ResourceLocation(CrystalBallMod.MODID, name));
        setCreativeTab(CreativeTabs.tabBlock);

        GameRegistry.register(this);

        Item itemBlockSimple = new ItemBlock(this).setRegistryName(getRegistryName());
        GameRegistry.register(itemBlockSimple);

        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(CrystalBallMod.MODID + ":" + name, "inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
                itemBlockSimple, 0, modelResourceLocation);
    }
}
