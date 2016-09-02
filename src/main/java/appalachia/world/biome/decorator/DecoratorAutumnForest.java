package appalachia.world.biome.decorator;

import java.util.Random;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import appalachia.world.biome.BiomeAutumnForest;
import appalachia.world.gen.feature.tree.AppalachiaTree;

public class DecoratorAutumnForest extends AppalachiaDecorator
{


    public DecoratorAutumnForest() {

        super();
    }

    @Override
    public void decorate(World worldIn, Random random, Biome biome, BlockPos pos)
    {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(worldIn, random, pos));
        super.decorate(worldIn, random, biome, pos);
        this.generateTrees(biome, worldIn, random);
        //this.generateFlowers(biome, worldIn, random);
        //this.generateGrass(biome, worldIn, random);
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(worldIn, random, pos));
    }

    protected void generateTrees(Biome biomeIn, World worldIn, Random random) {

        if (TerrainGen.decorate(worldIn, random, chunkPos, DecorateBiomeEvent.Decorate.EventType.TREE)) {

            if (biomeIn instanceof BiomeAutumnForest) {

                BiomeAutumnForest biome = (BiomeAutumnForest)biomeIn;

                if (biome.appalachiaTrees.size() > 0) {

                    AppalachiaTree tree = biome.appalachiaTrees.get(random.nextInt(biome.appalachiaTrees.size()));

                    for (int j2 = 0; j2 < treesPerChunk; ++j2) {

                        int k6 = random.nextInt(16) + 8;
                        int l = random.nextInt(16) + 8;

                        BlockPos blockpos = worldIn.getHeight(this.chunkPos.add(k6, 0, l));

                        tree.generate(worldIn, random, blockpos);
                    }
                }
            }
        }
    }
}