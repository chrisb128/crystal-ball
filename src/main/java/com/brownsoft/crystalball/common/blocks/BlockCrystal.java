package com.brownsoft.crystalball.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by chrisfirenze on 6/1/2016.
 */
public class BlockCrystal extends BlockBase {
    public BlockCrystal() {
        super("crystal", Material.rock);
        setLightLevel(6F);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isFullyOpaque(IBlockState state) {
        return true;
    }
}
