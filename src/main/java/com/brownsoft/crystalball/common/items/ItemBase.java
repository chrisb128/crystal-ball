package com.brownsoft.crystalball.common.items;

import com.brownsoft.crystalball.CrystalBallMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by chrisfirenze on 5/31/2016.
 */
public class ItemBase extends Item {
    public ItemBase(String name) {
        super();

        setUnlocalizedName(name);
        setRegistryName(new ResourceLocation(CrystalBallMod.MODID, name));

        GameRegistry.register(this);

        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(CrystalBallMod.MODID + ":" + name, "inventory");
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, 0, modelResourceLocation);
    }
}
