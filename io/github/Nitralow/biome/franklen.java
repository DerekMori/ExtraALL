package io.github.Nitralow.biome;

import io.github.Nitralow.Interesting;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;


public class franklen extends BiomeGenBase
{
public franklen(int par1)
{
super(par1);
this.topBlock = (byte)Interesting.Iceground.blockID;
this.fillerBlock = (byte)Block.cake.blockID;
}
} 
