package appalachia.rtg.world.biome.realistic.appalachia;

import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;

import appalachia.api.AppalachiaBiomes;
import appalachia.rtg.world.gen.surface.appalachia.SurfaceAPLBlueRidgeBeach;
import appalachia.rtg.world.gen.terrain.appalachia.TerrainAPLBlueRidgeBeach;

import rtg.api.biome.BiomeConfig;
import rtg.util.BlockUtil;

public class RealisticBiomeAPLBlueRidgeBeach extends RealisticBiomeAPLBase {

    public static Biome biome = AppalachiaBiomes.blueRidgeBeach;
    public static Biome river = Biomes.RIVER;

    public RealisticBiomeAPLBlueRidgeBeach(BiomeConfig config) {

        super(config, biome, river,
            new TerrainAPLBlueRidgeBeach(),
            new SurfaceAPLBlueRidgeBeach(config, biome.topBlock, biome.fillerBlock, BlockUtil.getStateDirt(2), 12f, 0.27f)
        );
    }
}