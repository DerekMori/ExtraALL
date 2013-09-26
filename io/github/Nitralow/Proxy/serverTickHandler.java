package io.github.Nitralow.Proxy;

import io.github.Nitralow.Interesting;

import java.util.EnumSet;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class serverTickHandler implements ITickHandler {

	private void onPlayerTick(EntityPlayer player) {
		if (player.getCurrentItemOrArmor(4) != null){
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			
			if (helmet.getItem() == Interesting.paperhelm) {
				player.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 40 , 2));			
				
			}
		}
		if (player.getCurrentItemOrArmor(3) != null){
			ItemStack chestplate = player.getCurrentItemOrArmor(3);
			
			if (chestplate.getItem() == Interesting.paperaches) {
				player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), 40 , 1));			
				
			}
		}
		if (player.getCurrentItemOrArmor(2) != null){
			ItemStack leggins = player.getCurrentItemOrArmor(2);
			
			if (leggins.getItem() == Interesting.paperlegg) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 40 , 2));			
				
			}
		}
		if (player.getCurrentItemOrArmor(1) != null){
			ItemStack helmet = player.getCurrentItemOrArmor(1);
			
			if (helmet.getItem() == Interesting.paperboot) {
				player.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 40 , 2));			
				
			}
		}
		
	}
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		// TODO Auto-generated method stub

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		// TODO Auto-generated method stub

	}

	@Override
	public EnumSet<TickType> ticks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}

}
