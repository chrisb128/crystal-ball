package com.brownsoft.crystalball;

import com.brownsoft.crystalball.common.blocks.ModBlocks;

import com.brownsoft.crystalball.common.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = CrystalBallMod.MODID, version = CrystalBallMod.VERSION)
public class CrystalBallMod
{
    public static final String MODID = "crystalball";
    public static final String VERSION = "0.1";
    public static int CrystalBallTableMapID;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModBlocks.load();
        ModItems.load();
    }
}
