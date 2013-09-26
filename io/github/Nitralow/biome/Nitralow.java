package io.github.Nitralow.biome;

import io.github.Nitralow.Interesting;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;


public class Nitralow extends BiomeGenBase
{
public Nitralow(int par1)
{
super(par1);
this.topBlock = (byte)Interesting.IcegroundOre.blockID;
this.fillerBlock = (byte)Block.cake.blockID;
}
} 