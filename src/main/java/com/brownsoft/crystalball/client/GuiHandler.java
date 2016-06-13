package com.brownsoft.crystalball.client;

import com.brownsoft.crystalball.CrystalBallMod;
import com.brownsoft.crystalball.client.gui.GuiCrystalBallMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

/**
 * Created by chrisfirenze on 6/1/2016.
 */
public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return getGuiElement(ID, player, world, x, y, z);
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return getGuiElement(ID, player, world, x, y, z);
    }

    private Object getGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        if (ID == CrystalBallMod.CrystalBallTableMapID) {
            return new GuiCrystalBallMap();
        }
        return null;
    }
}
