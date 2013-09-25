package io.github.Nitralow.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class iceomorphic extends Block {

	public iceomorphic(int id, Material material) {
		super(id, material);
		
		setTextureName("extraall:iceground");
		setHardness(0.5F);
		setLightOpacity(3);
		setStepSound(soundGlassFootstep);
		setLightOpacity(1);
		setBurnProperties(id, blockID, id);
		setBlockBoundsForItemRender();
	}

}
