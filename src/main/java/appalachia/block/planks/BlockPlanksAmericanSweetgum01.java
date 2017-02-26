package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksAmericanSweetgum01 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksAmericanSweetgum01() {

        super("planks.american_sweetgum.01");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_american_sweetgum_01 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}