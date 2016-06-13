package com.brownsoft.crystalball.client.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

/**
 * Created by chrisfirenze on 6/1/2016.
 */
public class GuiCrystalBallMap extends GuiContainer {
    public GuiCrystalBallMap() {
        super(new Container() {
            @Override
            public boolean canInteractWith(EntityPlayer playerIn) {
                return false;
            }
        });
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {

    }
}
