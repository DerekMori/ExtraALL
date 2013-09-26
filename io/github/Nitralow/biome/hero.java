package io.github.Nitralow.biome;

import io.github.Nitralow.Interesting;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;


public class hero extends BiomeGenBase
{
public hero(int par1)
{
super(par1);
this.topBlock = (byte)Block.carpet.blockID;
this.fillerBlock = (byte)Block.cloth.blockID;
}
} 
