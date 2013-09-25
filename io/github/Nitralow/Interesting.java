package io.github.Nitralow;

// This Import list will grow longer with each additional tutorial.
// It's not pruned between full class postings, unlike other tutorial code.
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
        public EnumToolMaterial Extra = EnumHelper.addToolMaterial("Frost", 3, 80000, 13.5F, 20.5F, 45);
        public EnumToolMaterial Extrapaper = EnumHelper.addToolMaterial("paper", 1, 3, 1.5F, 0.5F, 50);
        public EnumToolMaterial Extrareeds = EnumHelper.addToolMaterial("reeds", 2, 50, 3.5F, 2.5F, 40);
        public EnumToolMaterial Extrapumpkien = EnumHelper.addToolMaterial("pump", 3, 25, 6.5F, 5.5F, 30);
        public EnumToolMaterial Extragreen = EnumHelper.addToolMaterial("green", 2, 84, 9.5F, 60.5F, 60);
        public EnumToolMaterial Extrapumpkinpiw = EnumHelper.addToolMaterial("pie", 3, 1000, 50.5F, 20.5F, 90);
        public EnumToolMaterial Extracake = EnumHelper.addToolMaterial("cake", 3, 100000000, 85.5F, 70.5F, 100);
        public EnumArt Carmor = EnumHelper.addArt("Caketa", "Nitralow", 16, 16, 0, 0);
        
        //public static EnumArmorMaterial cakata = EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability)
        public static EnumArmorMaterial Caketa = EnumHelper.addArmorMaterial("Nitrarmor", 2000, new int[]{12, 17, 35, 52}, 80);
        public static EnumArmorMaterial paper = EnumHelper.addArmorMaterial("paper", 2000, new int[]{1, 3, 2, 1}, 40);
        public static EnumArmorMaterial fish = EnumHelper.addArmorMaterial("fish", 2000, new int[]{1, 1, 1, 1}, 32);
        public static EnumArmorMaterial wood = EnumHelper.addArmorMaterial("wood", 2000, new int[]{5, 8, 6, 5}, 33);
        public static EnumArmorMaterial stone = EnumHelper.addArmorMaterial("stone", 2000, new int[]{6, 9, 7, 6}, 34);
        public static EnumArmorMaterial cactus = EnumHelper.addArmorMaterial("cactus", 2000, new int[]{12, 17, 35, 52}, 36);
        public static EnumArmorMaterial C418 = EnumHelper.addArmorMaterial("C418", 2000, new int[]{22, 30, 28, 22}, 35);
        
        
        //Block
        public static final Block Sluge = new sluge(600, Material.vine).setUnlocalizedName("Sluge");
        public static final Block IcegroundOre = new iceomorphicOre(601, Material.ice).setUnlocalizedName("IcegroundOre");
        public static final Block Iceground = new iceomorphic(602, Material.ice).setUnlocalizedName("Iceground");
        //Items
      
        public static Item Lumpofsluge = new Lump(5041, 8, 8.4F, true).setUnlocalizedName("Lump").setCreativeTab(Interesting.Extra_Food).setTextureName("extraall:rmigb");
        
        public Item Caketahelm = new Caketahelm(5037, Caketa, ModLoader.addArmor("Caketa"), 0).setCreativeTab(this.Extra_Items).setUnlocalizedName("Chelm").setTextureName("extraall:Canadate35");;
        public Item Caketaches = new Caketaches(5038, Caketa, ModLoader.addArmor("Caketa"), 1).setCreativeTab(this.Extra_Items).setUnlocalizedName("Cchest").setTextureName("extraall:Canadate35");;
        public Item Caketalegg = new Caketalegg(5039, Caketa, ModLoader.addArmor("Caketa"), 2).setCreativeTab(this.Extra_Items).setUnlocalizedName("Clegg").setTextureName("extraall:Canadate35");;
        public Item Caketaboot = new Caketaboot(5040, Caketa, ModLoader.addArmor("Caketa"), 3).setCreativeTab(this.Extra_Items).setUnlocalizedName("CBoots").setTextureName("extraall:Canadate35");;
        
        public Item paperhelm = new paperhelm(5037, paper, ModLoader.addArmor("paper"), 0).setCreativeTab(this.Extra_Items).setUnlocalizedName("HCpaper").setTextureName("extraall:Canadate35");;
        public Item paperaches = new paperches(5038, paper, ModLoader.addArmor("paper"), 1).setCreativeTab(this.Extra_Items).setUnlocalizedName("CCpaper").setTextureName("extraall:Canadate35");;
        public Item paperlegg = new paperlegg(5039, paper, ModLoader.addArmor("paper"), 2).setCreativeTab(this.Extra_Items).setUnlocalizedName("LCpaper").setTextureName("extraall:Canadate35");;
        public Item paperboot = new paperboot(5040, paper, ModLoader.addArmor("paper"), 3).setCreativeTab(this.Extra_Items).setUnlocalizedName("BCpaper").setTextureName("extraall:Canadate35");;
        
        public Item fishhelm = new fishhelm(5037, fish, ModLoader.addArmor("fish"), 0).setCreativeTab(this.Extra_Items).setUnlocalizedName("HCfish").setTextureName("extraall:Canadate35");;
        public Item fishches = new fishches(5038, fish, ModLoader.addArmor("fish"), 1).setCreativeTab(this.Extra_Items).setUnlocalizedName("CCfish").setTextureName("extraall:Canadate35");;
        public Item fishlegg = new fishlegg(5039, fish, ModLoader.addArmor("fish"), 2).setCreativeTab(this.Extra_Items).setUnlocalizedName("LCfish").setTextureName("extraall:Canadate35");;
        public Item fishboot = new fishboot(5040, fish, ModLoader.addArmor("fish"), 3).setCreativeTab(this.Extra_Items).setUnlocalizedName("BCfish").setTextureName("extraall:Canadate35");;
        
        public Item woodhelm = new woodhelm(5037, wood, ModLoader.addArmor("wood"), 0).setCreativeTab(this.Extra_Items).setUnlocalizedName("HCwood").setTextureName("extraall:Canadate35");;
        public Item woodches = new woodches(5038, wood, ModLoader.addArmor("wood"), 1).setCreativeTab(this.Extra_Items).setUnlocalizedName("CCwood").setTextureName("extraall:Canadate35");;
        public Item woodlegg = new woodlegg(5039, wood, ModLoader.addArmor("wood"), 2).setCreativeTab(this.Extra_Items).setUnlocalizedName("LCwood").setTextureName("extraall:Canadate35");;
        public Item woodboot = new woodboot(5040, wood, ModLoader.addArmor("wood"), 3).setCreativeTab(this.Extra_Items).setUnlocalizedName("BCwood").setTextureName("extraall:Canadate35");;
        
        public Item stonehelm = new stonehelm(5037, stone, ModLoader.addArmor("stone"), 0).setCreativeTab(this.Extra_Items).setUnlocalizedName("HCstone").setTextureName("extraall:Canadate35");;
        public Item stoneches = new stoneches(5038, stone, ModLoader.addArmor("stone"), 1).setCreativeTab(this.Extra_Items).setUnlocalizedName("CCstone").setTextureName("extraall:Canadate35");;
        public Item stonelegg = new stonelegg(5039, stone, ModLoader.addArmor("stone"), 2).setCreativeTab(this.Extra_Items).setUnlocalizedName("LCstone").setTextureName("extraall:Canadate35");;
        public Item stoneboot = new stoneboot(5040, stone, ModLoader.addArmor("stone"), 3).setCreativeTab(this.Extra_Items).setUnlocalizedName("BCstone").setTextureName("extraall:Canadate35");;
        
        public Item cactushelm = new cactushelm(5037, cactus, ModLoader.addArmor("cactus"), 0).setCreativeTab(this.Extra_Items).setUnlocalizedName("Hcactus").setTextureName("extraall:Canadate35");;
        public Item cactusches = new cactusches(5038, cactus, ModLoader.addArmor("cactus"), 1).setCreativeTab(this.Extra_Items).setUnlocalizedName("CCcactus").setTextureName("extraall:Canadate35");;
        public Item cactuslegg = new cactuslegg(5039, cactus, ModLoader.addArmor("cactus"), 2).setCreativeTab(this.Extra_Items).setUnlocalizedName("LCcactus").setTextureName("extraall:Canadate35");;
        public Item cactusboot = new cactusboot(5040, cactus, ModLoader.addArmor("cactus"), 3).setCreativeTab(this.Extra_Items).setUnlocalizedName("BCcactus").setTextureName("extraall:Canadate35");;
        
        public Item C418helm = new C418helm(5037, Caketa, ModLoader.addArmor("C418"), 0).setCreativeTab(this.Extra_Items).setUnlocalizedName("HC418").setTextureName("extraall:Canadate35");;
        public Item C418taches = new C418ches(5038, Caketa, ModLoader.addArmor("C418"), 1).setCreativeTab(this.Extra_Items).setUnlocalizedName("CC418").setTextureName("extraall:Canadate35");;
        public Item C418legg = new C418legg(5039, Caketa, ModLoader.addArmor("C418"), 2).setCreativeTab(this.Extra_Items).setUnlocalizedName("LC418").setTextureName("extraall:Canadate35");;
        public Item C418boot = new C418boot(5040, Caketa, ModLoader.addArmor("C418"), 3).setCreativeTab(this.Extra_Items).setUnlocalizedName("BC418").setTextureName("extraall:Canadate35");;
        
       
        
        public static final Item Tringot = new tringot(5006).setFull3D().setPotionEffect("potion.moveSpeed");
        public final Item paperSword = new paperSword(5007, Extrapaper).setCreativeTab(this.Extra_Items).setUnlocalizedName("paperSword").setTextureName("extraall:Canadate35");
        public final Item paperaxe = new paperAxe(5008, Extrapaper).setCreativeTab(this.Extra_Items).setUnlocalizedName("paperaxe").setTextureName("extraall:Canadate35");
        public final Item paperhoe = new paperHoe(5009, Extrapaper).setCreativeTab(this.Extra_Items).setUnlocalizedName("paperhoe").setTextureName("extraall:Canadate35");
        public final Item paperpickaxe = new paperPickaxe(5010, Extrapaper).setCreativeTab(this.Extra_Items).setUnlocalizedName("paperpickaxe").setTextureName("extraall:Canadate35");
        public final Item papershovel = new paperShovel(5011, Extrapaper).setCreativeTab(this.Extra_Items).setUnlocalizedName("paperspade").setTextureName("extraall:Canadate35");

        public final Item reedsSword = new reedsSword(5012, Extrareeds).setCreativeTab(this.Extra_Items).setUnlocalizedName("reedsSword").setTextureName("extraall:Canadate35");
        public final Item reedsaxe = new reedsAxe(5013, Extrareeds).setCreativeTab(this.Extra_Items).setUnlocalizedName("reedsaxe").setTextureName("extraall:Canadate35");
        public final Item reedshoe = new reedsHoe(5014, Extrareeds).setCreativeTab(this.Extra_Items).setUnlocalizedName("reedshoe").setTextureName("extraall:Canadate35");
        public final Item reedspickaxe = new reedsPickaxe(5015, Extrareeds).setCreativeTab(this.Extra_Items).setUnlocalizedName("reedspickaxe").setTextureName("extraall:Canadate35");
        public final Item reedsshovel = new reedsShovel(5016, Extrareeds).setCreativeTab(this.Extra_Items).setUnlocalizedName("reedsspade").setTextureName("extraall:Canadate35");

        public final Item pumpSword = new pumpSword(5017, Extrapumpkien).setCreativeTab(this.Extra_Items).setUnlocalizedName("pumpSword").setTextureName("extraall:Canadate35");
        public final Item pumpaxe = new pumpAxe(5018, Extrapumpkien).setCreativeTab(this.Extra_Items).setUnlocalizedName("pumpaxe").setTextureName("extraall:Canadate35");
        public final Item pumphoe = new pumpHoe(5019, Extrapumpkien).setCreativeTab(this.Extra_Items).setUnlocalizedName("pumphoe").setTextureName("extraall:Canadate35");
        public final Item pumppickaxe = new pumpPickaxe(5020, Extra).setCreativeTab(this.Extra_Items).setUnlocalizedName("pumppickaxe").setTextureName("extraall:Canadate35");
        public final Item pumpshovel = new pumpShovel(5021, Extrapumpkien).setCreativeTab(this.Extra_Items).setUnlocalizedName("pumpspade").setTextureName("extraall:Canadate35");

        public final Item greenSword = new greenSword(5022, Extragreen).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenSword").setTextureName("extraall:Canadate35");
        public final Item greenaxe = new greenAxe(5023, Extragreen).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenaxe").setTextureName("extraall:Canadate35");
        public final Item greenhoe = new greenHoe(5024, Extragreen).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenhoe").setTextureName("extraall:Canadate35");
        public final Item greenpickaxe = new greenPickaxe(5025, Extragreen).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenpickaxe").setTextureName("extraall:Canadate35");
        public final Item greenshovel = new greenShovel(5026, Extragreen).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenspade").setTextureName("extraall:Canadate35");

        public final Item pieSword = new pieSword(5027, Extrapumpkinpiw).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenSword").setTextureName("extraall:Canadate35");
        public final Item pieaxe = new pieAxe(5028, Extrapumpkinpiw).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenaxe").setTextureName("extraall:Canadate35");
        public final Item piehoe = new pieHoe(5029, Extrapumpkinpiw).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenhoe").setTextureName("extraall:Canadate35");
        public final Item piepickaxe = new piePickaxe(5030, Extrapumpkinpiw).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenpickaxe").setTextureName("extraall:Canadate35");
        public final Item pieshovel = new pieShovel(5031, Extrapumpkinpiw).setCreativeTab(this.Extra_Items).setUnlocalizedName("greenspade").setTextureName("extraall:Canadate35");

        public final Item cakeSword = new cakeSword(5032, Extracake).setCreativeTab(this.Extra_Items).setUnlocalizedName("cakeSword").setTextureName("extraall:Canadate35");
        public final Item cakeaxe = new cakeAxe(5033, Extracake).setCreativeTab(this.Extra_Items).setUnlocalizedName("cakeaxe").setTextureName("extraall:Canadate35");
        public final Item cakehoe = new cakeHoe(5034, Extracake).setCreativeTab(this.Extra_Items).setUnlocalizedName("cakehoe").setTextureName("extraall:Canadate35");
        public final Item cakepickaxe = new cakePickaxe(5035, Extracake).setCreativeTab(this.Extra_Items).setUnlocalizedName("cakepickaxe").setTextureName("extraall:Canadate35");
        public final Item cakeshovel = new cakeShovel(5036, Extracake).setCreativeTab(this.Extra_Items).setUnlocalizedName("cakespade").setTextureName("extraall:Canadate35");

        public final Item FrostSword = new FrostSword(5001, Extra).setCreativeTab(this.Extra_Items).setUnlocalizedName("FrostSword").setTextureName("extraall:Canadate35");
        public final Item Frostaxe = new FrostAxe(5002, Extra).setCreativeTab(this.Extra_Items).setUnlocalizedName("Frostaxe").setTextureName("extraall:Canadate35");
        public final Item Frosthoe = new FrostHoe(5003, Extra).setCreativeTab(this.Extra_Items).setUnlocalizedName("Frosthoe").setTextureName("extraall:Canadate35");
        public final Item Frostpickaxe = new FrostPickaxe(5004, Extra).setCreativeTab(this.Extra_Items).setUnlocalizedName("Frostpickaxe").setTextureName("extraall:Canadate35");
        public final Item Frostshovel = new FrostShovel(5005, Extra).setCreativeTab(this.Extra_Items).setUnlocalizedName("Frostspade").setTextureName("extraall:Canadate35");

        
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
           
           GameRegistry.addShapedRecipe(new ItemStack(Lumpofsluge), new Object[]{" WRS "," QRW "," QRS ", 'R',this.Sluge, 'S',Item.slimeBall, 'W',Item.bed, 'Q',Item.emptyMap});
        }
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) 
        {
                // Stub Method
        }
}