package io.github.Nitralow.Food;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class Lump extends ItemFood {

	public Lump(int id, int Hunger, float Saturation, boolean Wolffood) {
		super(id, Hunger, Saturation, Wolffood);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcon(IconRegister par1Iconregister) {
		this.itemIcon = par1Iconregister.registerIcon("extraall:rmigb");
	}

	public Lump(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
	}

}
