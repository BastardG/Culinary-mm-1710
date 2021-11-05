package ru.bastard.culinary.items;

import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.*;
import net.minecraftforge.common.MinecraftForge;
import ru.bastard.culinary.Main;
import ru.bastard.culinary.blocks.ModBlocks;

public class ModItems extends Items {
    public static ItemFood dough;
    public static ItemFood flour;
    public static Item pestle_and_mortar;
    public static ItemSeeds millet_seeds;
    public static ItemSeeds maize_seeds;
    public static ItemSeeds rice_seeds;
    public static ItemSeeds barley_seeds;
    public static ItemSeeds oats_seeds;
    public static ItemSeeds rye_seeds;
    public static ItemSeeds pepper_seeds;
    public static Item millet;
    public static Item maize;
    public static Item barley;
    public static Item oats;
    public static Item rye;
    public static Item ground_pepper;
    public static Item salt;

    public static void init()
    {
        dough = (ItemFood) new ItemFood(1, 0F, false).setUnlocalizedName("dough").setTextureName(Main.MODID + ":dough").setCreativeTab(CreativeTabs.tabFood);
        flour = (ItemFood) new ItemFood(1, 0F, false).setUnlocalizedName("flour").setTextureName(Main.MODID + ":flour").setCreativeTab(CreativeTabs.tabFood);
        pestle_and_mortar = new PestleAndMortar().setUnlocalizedName("pestle and mortar").setTextureName(Main.MODID + ":mortar").setCreativeTab(CreativeTabs.tabMaterials);
        millet_seeds = (ItemSeeds) new ItemSeeds(ModBlocks.milletCrop, Blocks.farmland).setUnlocalizedName("millet_seeds").setTextureName(Main.MODID + ":millet_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        maize_seeds = (ItemSeeds) new ItemSeeds(ModBlocks.maizeCrop, Blocks.farmland).setUnlocalizedName("maize_seeds").setTextureName(Main.MODID + ":maize_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        rice_seeds = (ItemSeeds) new ItemSeeds(ModBlocks.riceCrop, Blocks.farmland).setUnlocalizedName("rice").setTextureName(Main.MODID + ":rice").setCreativeTab(CreativeTabs.tabMaterials);
        barley_seeds = (ItemSeeds) new ItemSeeds(ModBlocks.barleyCrop, Blocks.farmland).setUnlocalizedName("barley_seeds").setTextureName(Main.MODID + ":barley_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        oats_seeds = (ItemSeeds) new ItemSeeds(ModBlocks.oatsCrop, Blocks.farmland).setUnlocalizedName("oats_seeds").setTextureName(Main.MODID + ":oats_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        rye_seeds = (ItemSeeds) new ItemSeeds(ModBlocks.ryeCrop, Blocks.farmland).setUnlocalizedName("rye_seeds").setTextureName(Main.MODID + ":rye_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        pepper_seeds = (ItemSeeds) new ItemSeeds(ModBlocks.pepperCrop, Blocks.farmland).setUnlocalizedName("pepper").setTextureName(Main.MODID + ":pepper").setCreativeTab(CreativeTabs.tabMaterials);
        millet = new Item().setUnlocalizedName("millet").setTextureName(Main.MODID + ":millet").setCreativeTab(CreativeTabs.tabMaterials);
        maize = new Item().setUnlocalizedName("ear of corn").setTextureName(Main.MODID + ":corn").setCreativeTab(CreativeTabs.tabFood);
        barley = new Item().setUnlocalizedName("barley").setTextureName(Main.MODID + ":barley").setCreativeTab(CreativeTabs.tabMaterials);
        oats = new Item().setUnlocalizedName("oats").setTextureName(Main.MODID + ":oats").setCreativeTab(CreativeTabs.tabMaterials);
        rye = new Item().setUnlocalizedName("rye").setTextureName(Main.MODID + ":rye").setCreativeTab(CreativeTabs.tabMaterials);
        ground_pepper = new ItemFood(1, 0F, false).setUnlocalizedName("ground pepper").setTextureName(Main.MODID + "gpepper").setCreativeTab(CreativeTabs.tabFood);
        salt = new Salt().setUnlocalizedName("Salt").setTextureName(Main.MODID + ":salt").setCreativeTab(CreativeTabs.tabMaterials);

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
        GameRegistry.registerItem(salt, salt.getUnlocalizedName());

        //Seeds from grass
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.millet_seeds), 1);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.barley_seeds), 1);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.maize_seeds), 1);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.oats_seeds), 1);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.rye_seeds), 1);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.rice_seeds), 1);
        MinecraftForge.addGrassSeed(new ItemStack(ModItems.pepper_seeds), 1);
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

class Salt extends Item{

}