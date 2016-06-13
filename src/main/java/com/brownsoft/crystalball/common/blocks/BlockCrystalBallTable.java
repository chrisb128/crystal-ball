package com.brownsoft.crystalball.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

/**
 * Created by chrisfirenze on 5/31/2016.
 */
public class BlockCrystalBallTable extends BlockBase {
    public BlockCrystalBallTable() {
        super("crystalBallTable", Material.wood);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

        playerIn.displayGui(new InterfaceCrystalBallMap(worldIn, pos));
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullyOpaque(IBlockState state) {
        return false;
    }

    public class InterfaceCrystalBallMap implements IInteractionObject {

        private final World worldIn;
        private final BlockPos pos;

        public InterfaceCrystalBallMap(World worldIn, BlockPos pos) {

            this.worldIn = worldIn;
            this.pos = pos;
        }

        @Override
        public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {

            return new Container() {
                @Override
                public boolean canInteractWith(EntityPlayer playerIn) {
                    return false;
                }
            };
        }

        @Override
        public String getGuiID() {
            return "minecraft:crafting_table";
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public boolean hasCustomName() {
            return false;
        }

        @Override
        public ITextComponent getDisplayName() {
            return new TextComponentString("Crystal Ball Map");
        }
    }
}
