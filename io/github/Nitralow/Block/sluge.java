package io.github.Nitralow.Block;

import io.github.Nitralow.Interesting;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class sluge extends Block {

	public sluge(int id, Material material) {
		super(id, material);
		setHardness(0.2F)
		.setStepSound(soundGrassFootstep)
		.setTextureName("nitra:sluge");
		setLightOpacity(3);
		setLightValue(3);
		setCreativeTab(Interesting.Extra_Blockss);
	
	}
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.slimeBall.itemID;
    }
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.setInWeb();
   }
}
