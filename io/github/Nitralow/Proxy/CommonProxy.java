package io.github.Nitralow.Proxy;

import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy {

        public static String icegroundore;

		// Client stuff
        public void registerRenderers() {
                // Nothing here as the server doesn't render graphics or entities!
        }
        public void registerTickHandler() {
        	TickRegistry.registerTickHandler(new serverTickHandler(), Side.SERVER);
        }
        public int addArmor(String armor) {
        	return 0;
        }
}