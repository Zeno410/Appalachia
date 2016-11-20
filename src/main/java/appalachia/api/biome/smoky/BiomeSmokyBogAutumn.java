package appalachia.api.biome.smoky;

import net.minecraft.util.math.BlockPos;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appalachia.api.AppalachiaBiomeTypes;
import appalachia.api.biome.IAppalachiaBiome;

public class BiomeSmokyBogAutumn extends BiomeSmokyBog implements IAppalachiaBiome {

    public BiomeSmokyBogAutumn(BiomeProperties props) {

        super(props);

        biomeTypes = new BiomeDictionary.Type[]{
            BiomeDictionary.Type.SWAMP,
            BiomeDictionary.Type.LUSH,
            AppalachiaBiomeTypes.AUTUMN,
            AppalachiaBiomeTypes.SMOKY
        };
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getFoliageColorAtPos(BlockPos pos) {

        int noise = (int) (simplex.noise(pos.getX()/16, pos.getZ()/16)*9+9);
        return leafColours[noise];
    }
}