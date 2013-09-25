package io.github.Nitralow;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class tringot extends Item {

	private ItemStack tringot;

	public tringot(int par1) {
		super(par1);
		
		setFull3D();
		setMaxStackSize(64);
		setCreativeTab(Interesting.Extra_Items);
		setUnlocalizedName("Tri");
		setTextureName("extraall:rmigb");
	}

}
