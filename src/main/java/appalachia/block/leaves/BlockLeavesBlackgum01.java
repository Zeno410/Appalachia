package appalachia.block.leaves;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockLeavesBlackgum01 extends AppalachiaBlockLeaves implements IAppalachiaBlock {

    public BlockLeavesBlackgum01() {

        super("leaves.blackgum.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(AppalachiaBlocks.sapling_blackgum_01);
    }
}