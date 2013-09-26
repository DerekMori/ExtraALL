package io.github.Nitralow;

// This Import list will grow longer with each additional tutorial.
// It's not pruned between full class postings, unlike other tutorial code.
import java.util.Stack;

import io.github.Nitralow.Armor.C418boot;
import io.github.Nitralow.Armor.C418ches;
import io.github.Nitralow.Armor.C418helm;
import io.github.Nitralow.Armor.C418legg;
import io.github.Nitralow.Armor.Caketaboot;
import io.github.Nitralow.Armor.Caketaches;
import io.github.Nitralow.Armor.Caketahelm;
import io.github.Nitralow.Armor.Caketalegg;
import io.github.Nitralow.Armor.cactusboot;
import io.github.Nitralow.Armor.cactusches;
import io.github.Nitralow.Armor.cactushelm;
import io.github.Nitralow.Armor.cactuslegg;
import io.github.Nitralow.Armor.fishboot;
import io.github.Nitralow.Armor.fishches;
import io.github.Nitralow.Armor.fishhelm;
import io.github.Nitralow.Armor.fishlegg;
import io.github.Nitralow.Armor.paperboot;
import io.github.Nitralow.Armor.paperches;
import io.github.Nitralow.Armor.paperhelm;
import io.github.Nitralow.Armor.paperlegg;
import io.github.Nitralow.Armor.stoneboot;
import io.github.Nitralow.Armor.stoneches;
import io.github.Nitralow.Armor.stonehelm;
import io.github.Nitralow.Armor.stonelegg;
import io.github.Nitralow.Armor.woodboot;
import io.github.Nitralow.Armor.woodches;
import io.github.Nitralow.Armor.woodhelm;
import io.github.Nitralow.Armor.woodlegg;
import io.github.Nitralow.Block.iceomorphic;
import io.github.Nitralow.Block.iceomorphicOre;
import io.github.Nitralow.Block.sluge;
import io.github.Nitralow.Food.Lump;
import io.github.Nitralow.Proxy.CommonProxy;
import io.github.Nitralow.Tools.FrostAxe;
import io.github.Nitralow.Tools.FrostHoe;
import io.github.Nitralow.Tools.FrostPickaxe;
import io.github.Nitralow.Tools.FrostShovel;
import io.github.Nitralow.Tools.FrostSword;
import io.github.Nitralow.Tools.cakeAxe;
import io.github.Nitralow.Tools.cakeHoe;
import io.github.Nitralow.Tools.cakePickaxe;
import io.github.Nitralow.Tools.cakeShovel;
import io.github.Nitralow.Tools.cakeSword;
import io.github.Nitralow.Tools.greenAxe;
import io.github.Nitralow.Tools.greenHoe;
import io.github.Nitralow.Tools.greenPickaxe;
import io.github.Nitralow.Tools.greenShovel;
import io.github.Nitralow.Tools.greenSword;
import io.github.Nitralow.Tools.paperAxe;
import io.github.Nitralow.Tools.paperHoe;
import io.github.Nitralow.Tools.paperPickaxe;
import io.github.Nitralow.Tools.paperShovel;
import io.github.Nitralow.Tools.paperSword;
import io.github.Nitralow.Tools.pieAxe;
import io.github.Nitralow.Tools.pieHoe;
import io.github.Nitralow.Tools.piePickaxe;
import io.github.Nitralow.Tools.pieShovel;
import io.github.Nitralow.Tools.pieSword;
import io.github.Nitralow.Tools.pumpAxe;
import io.github.Nitralow.Tools.pumpHoe;
import io.github.Nitralow.Tools.pumpPickaxe;
import io.github.Nitralow.Tools.pumpShovel;
import io.github.Nitralow.Tools.pumpSword;
import io.github.Nitralow.Tools.reedsAxe;
import io.github.Nitralow.Tools.reedsHoe;
import io.github.Nitralow.Tools.reedsPickaxe;
import io.github.Nitralow.Tools.reedsShovel;
import io.github.Nitralow.Tools.reedsSword;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.src.ModLoader;
import net.minecraft.util.EnumArt;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid="extraall", name="ExtraALL", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Interesting {
	
	public static BiomeGenBase tutorialBiome;
	;
	
	
    public static CreativeTabs Extra_Blockss = new CreativeTabs("Extra Block") {

		private Block Sluge;

		public ItemStack getIconItemStack() {
                return new ItemStack(Interesting.Sluge, 1, 0);
        }
};

public static CreativeTabs Extra_Items = new CreativeTabs("Extra Items") {
        private Block Tringot;

		public ItemStack getIconItemStack() {
                return new ItemStack(Interesting.Tringot, 1, 0);
        }
}; 

public static CreativeTabs Extra_Food = new CreativeTabs("Extra food") {

		public ItemStack getIconItemStack() {
                return new ItemStack(Interesting.Lumpofsluge, 1, 0);
        }
}; 
        //public EnumToolMaterial test = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
        public static EnumToolMaterial Extra = EnumHelper.addToolMaterial("Frost", 3, 80000, 13.5F, 20.5F, 45);
        public static EnumToolMaterial Extrapaper = EnumHelper.addToolMaterial("paper", 1, 3, 1.5F, 0.5F, 50);
        public static EnumToolMaterial Extrareeds = EnumHelper.addToolMaterial("reeds", 2, 50, 3.5F, 2.5F, 40);
        public static EnumToolMaterial Extrapumpkien = EnumHelper.addToolMaterial("pump", 3, 25, 6.5F, 5.5F, 30);
        public static EnumToolMaterial Extragreen = EnumHelper.addToolMaterial("green", 2, 84, 9.5F, 60.5F, 60);
        public static EnumToolMaterial Extrapumpkinpiw = EnumHelper.addToolMaterial("pie", 3, 1000, 50.5F, 20.5F, 90);
        public static EnumToolMaterial Extracake = EnumHelper.addToolMaterial("cake", 3, 100000000, 85.5F, 70.5F, 100);
        public static EnumArt Carmor = EnumHelper.addArt("Caketa", "Nitralow", 16, 16, 0, 0);
        
        //public static EnumArmorMaterial cakata = EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability)
        public static EnumArmorMaterial Caketa = EnumHelper.addArmorMaterial("Nitrarmor", 2000, new int[]{12, 17, 35, 52}, 80);
        public static EnumArmorMaterial paper = EnumHelper.addArmorMaterial("paper", 2000, new int[]{1, 3, 2, 1}, 40);
        public static EnumArmorMaterial fish = EnumHelper.addArmorMaterial("fish", 2000, new int[]{1, 1, 1, 1}, 32);
        public static EnumArmorMaterial wood = EnumHelper.addArmorMaterial("wood", 2000, new int[]{5, 8, 6, 5}, 33);
        public static EnumArmorMaterial stone = EnumHelper.addArmorMaterial("stone", 2000, new int[]{6, 9, 7, 6}, 34);
        public static EnumArmorMaterial cactus = EnumHelper.addArmorMaterial("cactus", 2000, new int[]{12, 17, 35, 52}, 36);
        public static EnumArmorMaterial C418 = EnumHelper.addArmorMaterial("C418", 2000, new int[]{22, 30, 28, 22}, 35);
        
        //Block
        public static Block Sluge = new sluge(1100, Material.vine).setUnlocalizedName("Sluge");
        public static Block IcegroundOre = new iceomorphicOre(1101, Material.ice).setUnlocalizedName("IcegroundOre");
        public static Block Iceground = new iceomorphic(1102, Material.ice).setUnlocalizedName("Iceground");
        //Items
        public static Item Lumpofsluge = new Lump(5041, 8, 8.4F, true).setUnlocalizedName("Lump").setCreativeTab(Interesting.Extra_Food).setTextureName("extraall:rmigb");
        
        static int renderExtraArmor = proxy.addArmor("Caketa");
        static int renderpaperArmor = proxy.addArmor("paper");
        static int renderfishArmor = proxy.addArmor("fish");
        static int renderwoodArmor = proxy.addArmor("wood");
        static int renderstoneArmor = proxy.addArmor("stone");
        static int rendercactusArmor = proxy.addArmor("cactus");
        static int renderC418Armor = proxy.addArmor("C418");
        
        public static Item Caketahelm = new Caketahelm(5037, Caketa, renderExtraArmor, 0).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("Chelm").setTextureName("extraall:Canadate35");
        public static Item Caketaches = new Caketaches(5038, Caketa, renderExtraArmor, 1).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("Cchest").setTextureName("extraall:Canadate35");
        public static Item Caketalegg = new Caketalegg(5039, Caketa, renderExtraArmor, 2).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("Clegg").setTextureName("extraall:Canadate35");
        public static Item Caketaboot = new Caketaboot(5040, Caketa, renderExtraArmor, 3).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("CBoots").setTextureName("extraall:Canadate35");
        
        public static Item paperhelm = new paperhelm(5037, paper, renderpaperArmor, 0).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("HCpaper").setTextureName("extraall:Canadate35");
        public static Item paperaches = new paperches(5038, paper, renderpaperArmor, 1).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("CCpaper").setTextureName("extraall:Canadate35");
        public static Item paperlegg = new paperlegg(5039, paper, renderpaperArmor, 2).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("LCpaper").setTextureName("extraall:Canadate35");
        public static Item paperboot = new paperboot(5040, paper, renderpaperArmor, 3).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("BCpaper").setTextureName("extraall:Canadate35");
        
        public static Item fishhelm = new fishhelm(5037, fish, renderfishArmor, 0).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("HCfish").setTextureName("extraall:Canadate35");
        public static Item fishches = new fishches(5038, fish, renderfishArmor, 1).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("CCfish").setTextureName("extraall:Canadate35");
        public static Item fishlegg = new fishlegg(5039, fish, renderfishArmor, 2).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("LCfish").setTextureName("extraall:Canadate35");
        public static Item fishboot = new fishboot(5040, fish, renderfishArmor, 3).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("BCfish").setTextureName("extraall:Canadate35");
        
        public static Item woodhelm = new woodhelm(5037, wood, renderwoodArmor, 0).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("HCwood").setTextureName("extraall:Canadate35");
        public static Item woodches = new woodches(5038, wood, renderwoodArmor, 1).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("CCwood").setTextureName("extraall:Canadate35");
        public static Item woodlegg = new woodlegg(5039, wood, renderwoodArmor, 2).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("LCwood").setTextureName("extraall:Canadate35");
        public static Item woodboot = new woodboot(5040, wood, renderwoodArmor, 3).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("BCwood").setTextureName("extraall:Canadate35");
        
        public static Item stonehelm = new stonehelm(5037, stone, renderstoneArmor, 0).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("HCstone").setTextureName("extraall:Canadate35");
        public static Item stoneches = new stoneches(5038, stone, renderstoneArmor, 1).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("CCstone").setTextureName("extraall:Canadate35");
        public static Item stonelegg = new stonelegg(5039, stone, renderstoneArmor, 2).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("LCstone").setTextureName("extraall:Canadate35");
        public static Item stoneboot = new stoneboot(5040, stone, renderstoneArmor, 3).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("BCstone").setTextureName("extraall:Canadate35");
        
        public static Item cactushelm = new cactushelm(5037, cactus, rendercactusArmor, 0).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("Hcactus").setTextureName("extraall:Canadate35");
        public static Item cactusches = new cactusches(5038, cactus, rendercactusArmor, 1).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("CCcactus").setTextureName("extraall:Canadate35");
        public static Item cactuslegg = new cactuslegg(5039, cactus, rendercactusArmor, 2).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("LCcactus").setTextureName("extraall:Canadate35");
        public static Item cactusboot = new cactusboot(5040, cactus, rendercactusArmor, 3).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("BCcactus").setTextureName("extraall:Canadate35");
        
        public static Item C418helm = new C418helm(5037, Caketa, renderC418Armor, 0).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("HC418").setTextureName("extraall:Canadate35");
        public static Item C418taches = new C418ches(5038, Caketa, renderC418Armor, 1).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("CC418").setTextureName("extraall:Canadate35");
        public static Item C418legg = new C418legg(5039, Caketa, renderC418Armor, 2).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("LC418").setTextureName("extraall:Canadate35");
        public static Item C418boot = new C418boot(5040, Caketa, renderC418Armor, 3).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("BC418").setTextureName("extraall:Canadate35");
       
        
        public static final Item Tringot = new tringot(5006).setFull3D().setPotionEffect("potion.moveSpeed");
        public static final Item paperSword = new paperSword(5007, Extrapaper).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("paperSword").setTextureName("extraall:Canadate35");
        public static final Item paperaxe = new paperAxe(5008, Extrapaper).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("paperaxe").setTextureName("extraall:Canadate35");
        public static final Item paperhoe = new paperHoe(5009, Extrapaper).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("paperhoe").setTextureName("extraall:Canadate35");
        public static final Item paperpickaxe = new paperPickaxe(5010, Extrapaper).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("paperpickaxe").setTextureName("extraall:Canadate35");
        public static final Item papershovel = new paperShovel(5011, Extrapaper).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("paperspade").setTextureName("extraall:Canadate35");

        public static final Item reedsSword = new reedsSword(5012, Extrareeds).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("reedsSword").setTextureName("extraall:Canadate35");
        public static final Item reedsaxe = new reedsAxe(5013, Extrareeds).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("reedsaxe").setTextureName("extraall:Canadate35");
        public static final Item reedshoe = new reedsHoe(5014, Extrareeds).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("reedshoe").setTextureName("extraall:Canadate35");
        public static final Item reedspickaxe = new reedsPickaxe(5015, Extrareeds).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("reedspickaxe").setTextureName("extraall:Canadate35");
        public static final Item reedsshovel = new reedsShovel(5016, Extrareeds).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("reedsspade").setTextureName("extraall:Canadate35");

        public static final Item pumpSword = new pumpSword(5017, Extrapumpkien).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("pumpSword").setTextureName("extraall:Canadate35");
        public static final Item pumpaxe = new pumpAxe(5018, Extrapumpkien).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("pumpaxe").setTextureName("extraall:Canadate35");
        public static final Item pumphoe = new pumpHoe(5019, Extrapumpkien).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("pumphoe").setTextureName("extraall:Canadate35");
        public static final Item pumppickaxe = new pumpPickaxe(5020, Extra).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("pumppickaxe").setTextureName("extraall:Canadate35");
        public static final Item pumpshovel = new pumpShovel(5021, Extrapumpkien).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("pumpspade").setTextureName("extraall:Canadate35");

        public static final Item greenSword = new greenSword(5022, Extragreen).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenSword").setTextureName("extraall:Canadate35");
        public static final Item greenaxe = new greenAxe(5023, Extragreen).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenaxe").setTextureName("extraall:Canadate35");
        public static final Item greenhoe = new greenHoe(5024, Extragreen).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenhoe").setTextureName("extraall:Canadate35");
        public static final Item greenpickaxe = new greenPickaxe(5025, Extragreen).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenpickaxe").setTextureName("extraall:Canadate35");
        public static final Item greenshovel = new greenShovel(5026, Extragreen).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenspade").setTextureName("extraall:Canadate35");

        public static final Item pieSword = new pieSword(5027, Extrapumpkinpiw).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenSword").setTextureName("extraall:Canadate35");
        public static final Item pieaxe = new pieAxe(5028, Extrapumpkinpiw).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenaxe").setTextureName("extraall:Canadate35");
        public static final Item piehoe = new pieHoe(5029, Extrapumpkinpiw).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenhoe").setTextureName("extraall:Canadate35");
        public static final Item piepickaxe = new piePickaxe(5030, Extrapumpkinpiw).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenpickaxe").setTextureName("extraall:Canadate35");
        public static final Item pieshovel = new pieShovel(5031, Extrapumpkinpiw).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("greenspade").setTextureName("extraall:Canadate35");

        public static final Item cakeSword = new cakeSword(5032, Extracake).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("cakeSword").setTextureName("extraall:Canadate35");
        public static final Item cakeaxe = new cakeAxe(5033, Extracake).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("cakeaxe").setTextureName("extraall:Canadate35");
        public static final Item cakehoe = new cakeHoe(5034, Extracake).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("cakehoe").setTextureName("extraall:Canadate35");
        public static final Item cakepickaxe = new cakePickaxe(5035, Extracake).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("cakepickaxe").setTextureName("extraall:Canadate35");
        public static final Item cakeshovel = new cakeShovel(5036, Extracake).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("cakespade").setTextureName("extraall:Canadate35");

        public static final Item FrostSword = new FrostSword(5001, Extra).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("FrostSword").setTextureName("extraall:Canadate35");
        public static final Item Frostaxe = new FrostAxe(5002, Extra).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("Frostaxe").setTextureName("extraall:Canadate35");
        public static final Item Frosthoe = new FrostHoe(5003, Extra).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("Frosthoe").setTextureName("extraall:Canadate35");
        public static final Item Frostpickaxe = new FrostPickaxe(5004, Extra).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("Frostpickaxe").setTextureName("extraall:Canadate35");
        public static final Item Frostshovel = new FrostShovel(5005, Extra).setCreativeTab(Interesting.Extra_Items).setUnlocalizedName("Frostspade").setTextureName("extraall:Canadate35");

        public static BiomeGenBase Ootoguto = new io.github.Nitralow.biome.Ootoguto(53).setBiomeName("Ootoguto").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase cake = new io.github.Nitralow.biome.cake(54).setBiomeName("cake").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase frost = new io.github.Nitralow.biome.frost(55).setBiomeName("Cold Canadian Eh!").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase kanmor = new io.github.Nitralow.biome.kanmor(56).setBiomeName("Karmor").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase pofff = new io.github.Nitralow.biome.pofff(57).setBiomeName("pink").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase Tutorial = new io.github.Nitralow.biome.Tutorial(58).setBiomeName("Tutorial").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase caketa = new io.github.Nitralow.biome.caketa(59).setBiomeName("Cake").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase hounyjuice = new io.github.Nitralow.biome.hounyjuice(60).setBiomeName("cake").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase franklen = new io.github.Nitralow.biome.franklen(61).setBiomeName("Honney Juice").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase jeff = new io.github.Nitralow.biome.jeff(62).setBiomeName("Jeff").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase tim = new io.github.Nitralow.biome.tim(63).setBiomeName("Tim").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase jim = new io.github.Nitralow.biome.jim(64).setBiomeName("Jim").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase fread = new io.github.Nitralow.biome.fread(65).setBiomeName("Fread").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase arthor = new io.github.Nitralow.biome.arthor(66).setBiomeName("Book").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase snickta = new io.github.Nitralow.biome.snickta(67).setBiomeName("Sticks").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase personta = new io.github.Nitralow.biome.personta(68).setBiomeName("Persone").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase juice = new io.github.Nitralow.biome.juice(69).setBiomeName("Juice").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase applejuice = new io.github.Nitralow.biome.applejuice(70).setBiomeName("Apple Juice").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase disaprea = new io.github.Nitralow.biome.disaprea(71).setBiomeName("Gone").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase anguse = new io.github.Nitralow.biome.anguse(72).setBiomeName("Amnesia").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase Direwolf20 = new io.github.Nitralow.biome.Direwolf20(73).setBiomeName("Direwold20").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase Sorayn = new io.github.Nitralow.biome.Sorayn(74).setBiomeName("Soryan").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase gen = new io.github.Nitralow.biome.gen(75).setBiomeName("Structure Gen").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase Ooto = new io.github.Nitralow.biome.Ooto(76).setBiomeName("Ooto").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase howto = new io.github.Nitralow.biome.howto(77).setBiomeName("Make it").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase newto = new io.github.Nitralow.biome.newto(78).setBiomeName("Brand New").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase redstone = new io.github.Nitralow.biome.redstone(79).setBiomeName("Restone").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase lapise = new io.github.Nitralow.biome.lapise(80).setBiomeName("Lapise").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase C3P0 = new io.github.Nitralow.biome.C3P0(81).setBiomeName("Wasteland").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase haligen = new io.github.Nitralow.biome.haligen(82).setBiomeName("Fly").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase motherearth = new io.github.Nitralow.biome.motherearth(83).setBiomeName("Mother Earth").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase franklyin = new io.github.Nitralow.biome.franklyin(84).setBiomeName("Lyne").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase bastion = new io.github.Nitralow.biome.bastion(85).setBiomeName("Bastion").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase mollry = new io.github.Nitralow.biome.mollry(86).setBiomeName("Malvorin").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase dragon = new io.github.Nitralow.biome.dragon(87).setBiomeName("Dragon").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase happy = new io.github.Nitralow.biome.happy(88).setBiomeName("Happy land").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase sad = new io.github.Nitralow.biome.sad(89).setBiomeName(")=").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase cool = new io.github.Nitralow.biome.cool(90).setBiomeName("(}=").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase warm = new io.github.Nitralow.biome.warm(91).setBiomeName("Warm").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase hot = new io.github.Nitralow.biome.hot(92).setBiomeName("Volcano").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase damp = new io.github.Nitralow.biome.damp(93).setBiomeName("Green Swamp").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase indinigia = new io.github.Nitralow.biome.indinigia(94).setBiomeName("Indian dessert").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase africansavana = new io.github.Nitralow.biome.africansavana(53).setBiomeName("Savana").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase tall = new io.github.Nitralow.biome.tall(95).setBiomeName("Tall Forst").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase sort = new io.github.Nitralow.biome.sort(96).setBiomeName("Small Forst").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase inuite = new io.github.Nitralow.biome.inuite(97).setBiomeName("Intuice").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase france = new io.github.Nitralow.biome.france(98).setBiomeName("France").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase forst = new io.github.Nitralow.biome.forst(99).setBiomeName("Deep Forest").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase killer = new io.github.Nitralow.biome.killer(100).setBiomeName("Blood spill legune").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase inupdown = new io.github.Nitralow.biome.inupdown(101).setBiomeName("Upsidedown").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase sidewas = new io.github.Nitralow.biome.sidewas(102).setBiomeName("Sidewas").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase upsidedown = new io.github.Nitralow.biome.upsidedown(103).setBiomeName("downsideup").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase dance = new io.github.Nitralow.biome.dance(104).setBiomeName("disco").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase music = new io.github.Nitralow.biome.music(105).setBiomeName("Music").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase playon = new io.github.Nitralow.biome.playon(107).setBiomeName("ice Biome").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase hero = new io.github.Nitralow.biome.hero(108).setBiomeName("Func").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);
        public static BiomeGenBase Nitralow = new io.github.Nitralow.biome.Nitralow(109).setBiomeName("Nitralow").setEnableSnow().setDisableRain().setTemperatureRainfall(1F, 0.5F).setMinMaxHeight(0.2F, 1F);

        
        @Instance(value="extraall")
        public static Interesting instance;
        
        @SidedProxy(clientSide="io.github.Nitralow.Proxy.ClientProxy",
                        serverSide="io.github.Nitralow.Proxy.CommonProxy")
        public static CommonProxy proxy;

		private boolean someConfigFlag;
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) 
        {
        	
        }
        
        @EventHandler
        public void load(FMLInitializationEvent event)        
        {
           proxy.registerRenderers();
           proxy.registerTickHandler();
           
           //Biomes
           GameRegistry.addBiome(tutorialBiome);
           GameRegistry.addBiome(C3P0);
           GameRegistry.addBiome(Direwolf20);
           GameRegistry.addBiome(Nitralow);
           GameRegistry.addBiome(Ooto);
           GameRegistry.addBiome(Ootoguto);
           GameRegistry.addBiome(Sorayn);
           GameRegistry.addBiome(Tutorial);
           GameRegistry.addBiome(africansavana);
           GameRegistry.addBiome(anguse);
           GameRegistry.addBiome(applejuice);
           GameRegistry.addBiome(arthor);
           GameRegistry.addBiome(bastion);
           GameRegistry.addBiome(cake);
           GameRegistry.addBiome(caketa);
           GameRegistry.addBiome(cool);
           GameRegistry.addBiome(damp);
           GameRegistry.addBiome(dance);
           GameRegistry.addBiome(disaprea);
           GameRegistry.addBiome(dragon);
           GameRegistry.addBiome(forst);
           GameRegistry.addBiome(france);
           GameRegistry.addBiome(franklen);
           GameRegistry.addBiome(fread);
           GameRegistry.addBiome(frost);
           GameRegistry.addBiome(frost);          
           GameRegistry.addBiome(gen);
           GameRegistry.addBiome(haligen);
           GameRegistry.addBiome(happy);
           GameRegistry.addBiome(hero);
           GameRegistry.addBiome(hot);
           GameRegistry.addBiome(hounyjuice);
           GameRegistry.addBiome(howto);
           GameRegistry.addBiome(indinigia);
           GameRegistry.addBiome(inuite);
           GameRegistry.addBiome(inupdown);
           GameRegistry.addBiome(jeff);
           GameRegistry.addBiome(jim);
           GameRegistry.addBiome(juice);
           GameRegistry.addBiome(kanmor);
           GameRegistry.addBiome(killer);
           GameRegistry.addBiome(lapise);
           GameRegistry.addBiome(mollry);
           GameRegistry.addBiome(motherearth);
           GameRegistry.addBiome(music);
           GameRegistry.addBiome(newto);
           GameRegistry.addBiome(personta);
           GameRegistry.addBiome(playon);
           GameRegistry.addBiome(pofff);
           GameRegistry.addBiome(redstone);
           GameRegistry.addBiome(sad);
           GameRegistry.addBiome(sidewas);
           GameRegistry.addBiome(snickta);
           GameRegistry.addBiome(sort);
           GameRegistry.addBiome(tall);
           GameRegistry.addBiome(tim);
           GameRegistry.addBiome(upsidedown);
           GameRegistry.addBiome(warm);
  
           //Blocks
           LanguageRegistry.addName(Sluge, "Sluge");
           GameRegistry.registerBlock(Sluge, "Sluge");
           MinecraftForge.setBlockHarvestLevel(Sluge, "shovel", 0);
           
           LanguageRegistry.addName(Iceground, "Iceomorphic");
           GameRegistry.registerBlock(Iceground, "Iceomorphic");
           MinecraftForge.setBlockHarvestLevel(Iceground, "pickaxe", 2);
           
           LanguageRegistry.addName(IcegroundOre, "Iceomorphic Ore");
           GameRegistry.registerBlock(IcegroundOre, "IceomorphicOre");
           MinecraftForge.setBlockHarvestLevel(IcegroundOre, "pickaxe", 3);
           
           
           //Registering many many tool sets
           LanguageRegistry.addName(Tringot, "Tringot");
           GameRegistry.registerItem(Tringot, "Tringot");
           
           GameRegistry.registerItem(FrostSword, "Frost Sword");
           LanguageRegistry.addName(FrostSword, "Frost Sword");
           
           GameRegistry.registerItem(Frostpickaxe, "Frost Pickaxe");
           LanguageRegistry.addName(Frostpickaxe, "Frost Pickaxe");
           
           GameRegistry.registerItem(Frosthoe, "Frost Hoe");
           LanguageRegistry.addName(Frosthoe, "Frost Hoe");
           
           GameRegistry.registerItem(Frostaxe, "Frost Axe");
           LanguageRegistry.addName(Frostaxe, "Frost Axe");
           
           GameRegistry.registerItem(Frostshovel, "Frost Shovel");
           LanguageRegistry.addName(Frostshovel, "Frost Shovel");

           GameRegistry.registerItem(paperSword, "paper Sword");
           LanguageRegistry.addName(paperSword, "paper Sword");
           
           GameRegistry.registerItem(paperpickaxe, "paper Pickaxe");
           LanguageRegistry.addName(paperpickaxe, "paper Pickaxe");
           
           GameRegistry.registerItem(paperhoe, "paper Hoe");
           LanguageRegistry.addName(paperhoe, "paper Hoe");
           
           GameRegistry.registerItem(paperaxe, "paper Axe");
           LanguageRegistry.addName(paperaxe, "paper Axe");
           
           GameRegistry.registerItem(papershovel, "paper Shovel");
           LanguageRegistry.addName(papershovel, "paper Shovel");

           GameRegistry.registerItem(reedsSword, "Reed Sword");
           LanguageRegistry.addName(reedsSword, "Reed Sword");
           
           GameRegistry.registerItem(reedspickaxe, "Reed Pickaxe");
           LanguageRegistry.addName(reedspickaxe, "Reed Pickaxe");
           
           GameRegistry.registerItem(reedshoe, "Reed Hoe");
           LanguageRegistry.addName(reedshoe, "Reed Hoe");
           
           GameRegistry.registerItem(reedsaxe, "Reed Axe");
           LanguageRegistry.addName(Frostaxe, "Reed Axe");
           
           GameRegistry.registerItem(reedsshovel, "Reed Shovel");
           LanguageRegistry.addName(reedsshovel, "Reed Shovel");

           GameRegistry.registerItem(pumpSword, "Pumpkien Sword");
           LanguageRegistry.addName(pumpSword, "Pumpkien Sword");
           
           GameRegistry.registerItem(pumppickaxe, "Pumpkien Pickaxe");
           LanguageRegistry.addName(pumppickaxe, "Pumpkien Pickaxe");
           
           GameRegistry.registerItem(pumphoe, "Pumpkien Hoe");
           LanguageRegistry.addName(Frosthoe, "Pumpkien Hoe");
           
           GameRegistry.registerItem(pumpaxe, "Pumpkien Axe");
           LanguageRegistry.addName(Frostaxe, "Pumpkien Axe");
           
           GameRegistry.registerItem(pumpshovel, "Pumpkien Shovel");
           LanguageRegistry.addName(pumpshovel, "pumpkien Shovel");

           GameRegistry.registerItem(greenSword, "Emerald Sword");
           LanguageRegistry.addName(greenSword, "Emerald Sword");
           
           GameRegistry.registerItem(greenpickaxe, "Emerald Pickaxe");
           LanguageRegistry.addName(greenpickaxe, "Emerald Pickaxe");
           
           GameRegistry.registerItem(greenhoe, "Emerald Hoe");
           LanguageRegistry.addName(greenhoe, "Emerald Hoe");
           
           GameRegistry.registerItem(greenaxe, "Emeralds Axe");
           LanguageRegistry.addName(greenaxe, "Emerald Axe");
           
           GameRegistry.registerItem(greenshovel, "Emerald Shovel");
           LanguageRegistry.addName(greenshovel, "Emerald Shovel");    

           GameRegistry.registerItem(pieSword, "Pumpkienpie Sword");
           LanguageRegistry.addName(pieSword, "Pumpkienpie Sword");
           
           GameRegistry.registerItem(piepickaxe, "Pumpkienpie Pickaxe");
           LanguageRegistry.addName(piepickaxe, "Pumpkienpie Pickaxe");
           
           GameRegistry.registerItem(piehoe, "Pumpkienpie Hoe");
           LanguageRegistry.addName(piehoe, "Pumpkienpie Hoe");
           
           GameRegistry.registerItem(pieaxe, "Pumpkienpie Axe");
           LanguageRegistry.addName(pieaxe, "Pumpkienpie Axe");
           
           GameRegistry.registerItem(pieshovel, "Pumpkienpie Shovel");
           LanguageRegistry.addName(pieshovel, "Pumpkienpie Shovel");

           GameRegistry.registerItem(cakeSword, "Cake Sword");
           LanguageRegistry.addName(cakeSword, "Cake Sword");
           
           GameRegistry.registerItem(cakepickaxe, "Cake Pickaxe");
           LanguageRegistry.addName(cakepickaxe, "Cake Pickaxe");
           
           GameRegistry.registerItem(cakehoe, "Cake Hoe");
           LanguageRegistry.addName(cakehoe, "Cake Hoe");
           
           GameRegistry.registerItem(cakeaxe, "Cake Axe");
           LanguageRegistry.addName(cakeaxe, "Cake Axe");
           
           GameRegistry.registerItem(cakeshovel, "Cake Shovel");
           LanguageRegistry.addName(cakeshovel, "Cake Shovel");
           
           //armor 
           GameRegistry.registerItem(Caketahelm, "Cake Helmet");
           LanguageRegistry.addName(Caketahelm, "Cake Helmet"); 
           
           GameRegistry.registerItem(Caketaches, "Cake Chestplate");
           LanguageRegistry.addName(Caketaches, "Cake Chestplate"); 
           
           GameRegistry.registerItem(Caketalegg, "Cake Leggins");
           LanguageRegistry.addName(Caketalegg, "Cake Leggins"); 
           
           GameRegistry.registerItem(Caketaboot, "Cake boots");
           LanguageRegistry.addName(Caketaboot, "Cake boots"); 
           
           //food
           GameRegistry.registerItem(Lumpofsluge, "Lump of Sluge");
           LanguageRegistry.addName(Lumpofsluge, "Lump of Sluge");
           
           LanguageRegistry.instance().addStringLocalization("Extra_Blocks", "en_US", "Extra Blocks");
           LanguageRegistry.instance().addStringLocalization("Extra_Items", "en_US", "Extra Items");
           LanguageRegistry.instance().addStringLocalization("Extra_Food", "en_US", "Extra food");
           
           GameRegistry.addShapedRecipe(new ItemStack(paperSword), new Object[]{" R ", " R "," S ", 'R',Item.paper, 'S',Item.stick });
           GameRegistry.addShapedRecipe(new ItemStack(paperaxe), new Object[]{"RR ", " RS "," S ", 'R',Item.paper, 'S',Item.stick });
           GameRegistry.addShapedRecipe(new ItemStack(paperhoe), new Object[]{" RR ", " S "," S ", 'R',Item.paper, 'S',Item.stick });
           GameRegistry.addShapedRecipe(new ItemStack(paperpickaxe), new Object[]{" RRR ", " S "," S ", 'R',Item.paper, 'S',Item.stick });
           
           GameRegistry.addShapedRecipe(new ItemStack(Caketahelm), new Object[]{" RRR ", " R R ",'R',Item.cake});
           GameRegistry.addShapedRecipe(new ItemStack(Caketaches), new Object[]{" R R ", " RRR "," RRR ", 'R',Item.cake});
           GameRegistry.addShapedRecipe(new ItemStack(Caketalegg), new Object[]{" RRR ", " R R "," R R ", 'R',Item.cake});
           GameRegistry.addShapedRecipe(new ItemStack(Caketaboot), new Object[]{" R R ", " R R ","  ", 'R',Item.cake});
           
           GameRegistry.addShapedRecipe(new ItemStack(fishhelm), new Object[]{" RRR ", " R R ",'R',Item.fishRaw});
           GameRegistry.addShapedRecipe(new ItemStack(fishches), new Object[]{" R R ", " RRR "," RRR ", 'R',Item.fishCooked});
           GameRegistry.addShapedRecipe(new ItemStack(fishlegg), new Object[]{" RRR ", " R R "," R R ", 'R',Item.fishCooked});
           GameRegistry.addShapedRecipe(new ItemStack(fishboot), new Object[]{" R R ", " R R ","  ", 'R',Item.fishRaw});
           
           GameRegistry.addShapedRecipe(new ItemStack(paperhelm), new Object[]{" RRR ", " R R ",'R',Item.cake});
           GameRegistry.addShapedRecipe(new ItemStack(paperaches), new Object[]{" R R ", " RRR "," RRR ", 'R',Item.paper});
           GameRegistry.addShapedRecipe(new ItemStack(paperlegg), new Object[]{" RRR ", " R R "," R R ", 'R',Item.paper});
           GameRegistry.addShapedRecipe(new ItemStack(paperboot), new Object[]{" R R ", " R R ","  ", 'R',Item.paper});
           
           GameRegistry.addShapedRecipe(new ItemStack(woodhelm), new Object[]{" RRR ", " R R ",'R',Block.wood});
           GameRegistry.addShapedRecipe(new ItemStack(woodches), new Object[]{" R R ", " RRR "," RRR ", 'R',Block.wood});
           GameRegistry.addShapedRecipe(new ItemStack(woodlegg), new Object[]{" RRR ", " R R "," R R ", 'R',Block.wood});
           GameRegistry.addShapedRecipe(new ItemStack(woodboot), new Object[]{" R R ", " R R ","  ", 'R',Block.wood});
           
           GameRegistry.addShapedRecipe(new ItemStack(stonehelm), new Object[]{" RRR ", " R R ",'R',Block.stone});
           GameRegistry.addShapedRecipe(new ItemStack(stoneches), new Object[]{" R R ", " RRR "," RRR ", 'R',Block.stone});
           GameRegistry.addShapedRecipe(new ItemStack(stonelegg), new Object[]{" RRR ", " R R "," R R ", 'R',Block.stone});
           GameRegistry.addShapedRecipe(new ItemStack(stoneboot), new Object[]{" R R ", " R R ","  ", 'R',Block.stone});
           
           GameRegistry.addShapedRecipe(new ItemStack(cactushelm), new Object[]{" RRR ", " R R ",'R',Block.cactus});
           GameRegistry.addShapedRecipe(new ItemStack(cactusches), new Object[]{" R R ", " RRR "," RRR ", 'R',Block.cactus});
           GameRegistry.addShapedRecipe(new ItemStack(cactuslegg), new Object[]{" RRR ", " R R "," R R ", 'R',Block.cactus});
           GameRegistry.addShapedRecipe(new ItemStack(cactusboot), new Object[]{" R R ", " R R ","  ", 'R',Block.cactus});
           
           GameRegistry.addShapedRecipe(new ItemStack(C418helm), new Object[]{" RRR ", " R R ",'R',Item.recordBlocks});
           GameRegistry.addShapedRecipe(new ItemStack(C418taches), new Object[]{" R R ", " RRR "," RRR ", 'R',Item.record11});
           GameRegistry.addShapedRecipe(new ItemStack(C418legg), new Object[]{" RRR ", " R R "," R R ", 'R',Item.recordWait});
           GameRegistry.addShapedRecipe(new ItemStack(C418boot), new Object[]{" R R ", " R R ","  ", 'R',Item.recordCat});
           
           GameRegistry.addShapedRecipe(new ItemStack(Lumpofsluge), new Object[]{" WRS "," QRW "," QRS ", 'R',this.Sluge, 'S',Item.slimeBall, 'W',Item.bed, 'Q',Item.emptyMap});
        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) 
        {
                // Stub Method
        }
}