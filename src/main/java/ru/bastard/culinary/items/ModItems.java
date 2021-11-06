package ru.bastard.culinary.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import ru.bastard.culinary.Main;
import ru.bastard.culinary.blocks.ModBlocks;

public class ModItems extends Items {
    public static Item dough;
    public static Item flour;
    public static Item pestle_and_mortar;
    public static Item millet_seeds;
    public static Item maize_seeds;
    public static Item rice_seeds;
    public static Item barley_seeds;
    public static Item oats_seeds;
    public static Item rye_seeds;
    public static Item pepper_seeds;
    public static Item millet;
    public static Item maize;
    public static Item barley;
    public static Item oats;
    public static Item rye;
    public static Item ground_pepper;
    public static Item cake_layer;
    public static Item apple_pie;
    public static Item potato_chicken_pie;
    public static Item fish_pie;
    public static Item beef_pie;
    public static Item rice_in_bowl;
    public static Item boiled_rice;
    public static Item beef_mince;
    public static Item fried_beef_mince;
    public static Item bottle_of_salt;

    public static void init()
    {
        dough = new ItemFood(1, 0F, false).setUnlocalizedName("dough").setTextureName(Main.MODID + ":dough").setCreativeTab(CreativeTabs.tabFood);
        flour = new ItemFood(1, 0F, false).setUnlocalizedName("flour").setTextureName(Main.MODID + ":flour").setCreativeTab(CreativeTabs.tabFood);
        pestle_and_mortar = new PestleAndMortar().setUnlocalizedName("pestle and mortar").setTextureName(Main.MODID + ":mortar").setCreativeTab(CreativeTabs.tabMaterials);
        millet_seeds = new ItemSeeds(ModBlocks.milletCrop, Blocks.farmland).setUnlocalizedName("millet_seeds").setTextureName(Main.MODID + ":millet_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        maize_seeds = new ItemSeeds(ModBlocks.maizeCrop, Blocks.farmland).setUnlocalizedName("maize_seeds").setTextureName(Main.MODID + ":maize_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        rice_seeds = new ItemSeedFood(1, 0F, ModBlocks.riceCrop, Blocks.farmland).setUnlocalizedName("rice").setTextureName(Main.MODID + ":rice").setCreativeTab(CreativeTabs.tabMaterials);
        barley_seeds = new ItemSeeds(ModBlocks.barleyCrop, Blocks.farmland).setUnlocalizedName("barley_seeds").setTextureName(Main.MODID + ":barley_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        oats_seeds = new ItemSeeds(ModBlocks.oatsCrop, Blocks.farmland).setUnlocalizedName("oats_seeds").setTextureName(Main.MODID + ":oats_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        rye_seeds = new ItemSeeds(ModBlocks.ryeCrop, Blocks.farmland).setUnlocalizedName("rye_seeds").setTextureName(Main.MODID + ":rye_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        pepper_seeds = new ItemSeeds(ModBlocks.pepperCrop, Blocks.farmland).setUnlocalizedName("pepper").setTextureName(Main.MODID + ":pepper").setCreativeTab(CreativeTabs.tabMaterials);
        millet = new Item().setUnlocalizedName("millet").setTextureName(Main.MODID + ":millet").setCreativeTab(CreativeTabs.tabMaterials);
        maize = new ItemFood(2, 0.1F, false).setUnlocalizedName("ear of corn").setTextureName(Main.MODID + ":corn").setCreativeTab(CreativeTabs.tabFood);
        barley = new Item().setUnlocalizedName("barley").setTextureName(Main.MODID + ":barley").setCreativeTab(CreativeTabs.tabMaterials);
        oats = new Item().setUnlocalizedName("oats").setTextureName(Main.MODID + ":oats").setCreativeTab(CreativeTabs.tabMaterials);
        rye = new Item().setUnlocalizedName("rye").setTextureName(Main.MODID + ":rye").setCreativeTab(CreativeTabs.tabMaterials);
        ground_pepper = new ItemFood(1, 0F, false).setUnlocalizedName("ground pepper").setTextureName(Main.MODID + "ground_pepper").setCreativeTab(CreativeTabs.tabFood);
        cake_layer = new ItemFood(2, 0.01F, false).setUnlocalizedName("cake layer").setTextureName(Main.MODID + ":cake_layer").setCreativeTab(CreativeTabs.tabFood);
        apple_pie = new ItemFood(6, 2F, false).setUnlocalizedName("apple pie").setTextureName(Main.MODID + "apple_pie").setCreativeTab(CreativeTabs.tabFood);
        potato_chicken_pie = new ItemFood(10, 5.0F, false).setUnlocalizedName("chicken pie").setTextureName(Main.MODID + ":chicken_pie").setCreativeTab(CreativeTabs.tabFood);
        fish_pie = new ItemFood(12, 5.0F, false).setUnlocalizedName("fish pie").setTextureName(Main.MODID + ":fish_pie").setCreativeTab(CreativeTabs.tabFood);
        beef_pie = new BeefPie(20, 10F, true).setUnlocalizedName("beef pie").setTextureName(Main.MODID + ":beef_pie").setCreativeTab(CreativeTabs.tabFood);
        rice_in_bowl = new ItemFood(1, 0F, false).setUnlocalizedName("rice bowl").setTextureName(Main.MODID + ":rice_bowl").setCreativeTab(CreativeTabs.tabFood);
        boiled_rice = new ItemFood(3, 0.2F, false).setUnlocalizedName("boiled rice").setTextureName(Main.MODID + ":boiled_rice").setCreativeTab(CreativeTabs.tabFood).setContainerItem(Items.bowl);
        beef_mince = new ItemFood(3, 0.01F, true).setUnlocalizedName("mince").setTextureName(Main.MODID + ":mince").setCreativeTab(CreativeTabs.tabFood);
        fried_beef_mince = new ItemFood(6, 1F, true).setUnlocalizedName("fried mince").setTextureName(Main.MODID + ":fried_mince").setCreativeTab(CreativeTabs.tabFood);
        bottle_of_salt = new BottleOfSalt().setUnlocalizedName("vaporized salt").setTextureName(Main.MODID + ":vaporized_salt").setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(dough, dough.getUnlocalizedName());
        GameRegistry.registerItem(flour, flour.getUnlocalizedName());
        GameRegistry.registerItem(pestle_and_mortar, pestle_and_mortar.getUnlocalizedName());
        GameRegistry.registerItem(millet_seeds, millet_seeds.getUnlocalizedName());
        GameRegistry.registerItem(maize_seeds, maize_seeds.getUnlocalizedName());
        GameRegistry.registerItem(rice_seeds, rice_seeds.getUnlocalizedName());
        GameRegistry.registerItem(barley_seeds, barley_seeds.getUnlocalizedName());
        GameRegistry.registerItem(oats_seeds, oats_seeds.getUnlocalizedName());
        GameRegistry.registerItem(rye_seeds, rye_seeds.getUnlocalizedName());
        GameRegistry.registerItem(pepper_seeds, pepper_seeds.getUnlocalizedName());
        GameRegistry.registerItem(millet, millet.getUnlocalizedName());
        GameRegistry.registerItem(maize, maize.getUnlocalizedName());
        GameRegistry.registerItem(barley, barley.getUnlocalizedName());
        GameRegistry.registerItem(oats, oats.getUnlocalizedName());
        GameRegistry.registerItem(rye, rye.getUnlocalizedName());
        GameRegistry.registerItem(ground_pepper, ground_pepper.getUnlocalizedName());
        GameRegistry.registerItem(cake_layer, cake_layer.getUnlocalizedName());
        GameRegistry.registerItem(apple_pie, apple_pie.getUnlocalizedName());
        GameRegistry.registerItem(potato_chicken_pie, potato_chicken_pie.getUnlocalizedName());
        GameRegistry.registerItem(fish_pie, fish_pie.getUnlocalizedName());
        GameRegistry.registerItem(beef_pie, beef_pie.getUnlocalizedName());
        GameRegistry.registerItem(rice_in_bowl, rice_in_bowl.getUnlocalizedName());
        GameRegistry.registerItem(boiled_rice, boiled_rice.getUnlocalizedName());
        GameRegistry.registerItem(beef_mince, beef_mince.getUnlocalizedName());
        GameRegistry.registerItem(fried_beef_mince, fried_beef_mince.getUnlocalizedName());
        GameRegistry.registerItem(bottle_of_salt, bottle_of_salt.getUnlocalizedName());
        //Seeds from grass
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.millet_seeds), 25);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.barley_seeds), 25);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.maize_seeds), 10);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.oats_seeds), 25);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.rye_seeds), 25);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.rice_seeds), 10);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.pepper_seeds), 10);
    }


}

class PestleAndMortar extends Item{
    public PestleAndMortar(){
        setContainerItem(this);
        setNoRepair();
        setMaxStackSize(1);
    }

    public ItemStack getContainerItem(ItemStack is) {
        return super.getContainerItem(is);
    }

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack) {
        return false;
    }
}
class BeefPie extends ItemFood{

    public BeefPie(int hunger, float saturation, boolean can_be_eaten_by_dogs) {
        super(hunger, saturation, can_be_eaten_by_dogs);
    }
    public ItemStack onEaten(ItemStack is, World world, EntityPlayer player){
        super.onEaten(is, world, player);
        if(!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5 * 20, 1));
        }
        return is;
    }
}
class BottleOfSalt extends Item{
    public BottleOfSalt(){
        setContainerItem(Items.glass_bottle);
    }
    public ItemStack getContainerItem(ItemStack is){return super.getContainerItem(is);}

    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack stack) {
        return false;
    }
}