package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S70;

public class ItemSlabOakH30S70 extends AppalachiaItemSlab {

    public ItemSlabOakH30S70(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_70.getDefaultState().withProperty(BlockPlanksOakH30S70.DOUBLE, Boolean.valueOf(true));
    }
}