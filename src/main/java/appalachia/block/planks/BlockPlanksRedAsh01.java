package appalachia.block.planks;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.IAppalachiaBlock;

public class BlockPlanksRedAsh01 extends AppalachiaBlockPlanks implements IAppalachiaBlock {

    public BlockPlanksRedAsh01() {

        super("planks.red_ash.01");
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {

        return Item.getItemFromBlock(state.getValue(DOUBLE).booleanValue() ? AppalachiaBlocks.slab_red_ash_01 : this);
    }

    @Override
    public String registryName() {

        return super.registryName();
    }
}