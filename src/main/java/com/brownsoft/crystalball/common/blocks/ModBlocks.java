package com.brownsoft.crystalball.common.blocks;

/**
 * Created by chrisfirenze on 5/31/2016.
 */
public class ModBlocks {
    public static BlockCrystalBallTable crystalBallTable;
    public static BlockCrystal crystal;

    public static final void load() {
        crystalBallTable = new BlockCrystalBallTable();
        crystal = new BlockCrystal();
    }
}
