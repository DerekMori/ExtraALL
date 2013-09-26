package io.github.Nitralow.Proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
        
        @Override
        public void registerRenderers() {
                // This is for rendering entities and so forth later on
        }
        @Override
        public int addArmor(String armor) {
        	return RenderingRegistry.addNewArmourRendererPrefix(armor);
        }
        
}
