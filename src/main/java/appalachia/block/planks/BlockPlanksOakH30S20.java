package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksOakH30S20 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksOakH30S20() {

        super("planks.oak.30.20");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_oak_30_20 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}