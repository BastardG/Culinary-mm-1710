package ru.bastard.culinary.blocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.init.Blocks;
import ru.bastard.culinary.Main;
import ru.bastard.culinary.blocks.crops.*;
import ru.bastard.culinary.items.ModItems;

public class ModBlocks
{
    public static Block milletCrop;
    public static Block maizeCrop;
    public static Block riceCrop;
    public static Block barleyCrop;
    public static Block oatsCrop;
    public static Block ryeCrop;
    public static Block pepperCrop;
    public static Block peaCrop;

    public static void init()
    {
        milletCrop = new MilletBlockCrop().setBlockName("millet crop").setBlockTextureName(Main.MODID + ":millet_crop");
        maizeCrop = new MaizeBlockCrop().setBlockName("maize crop").setBlockTextureName(Main.MODID + ":maize_crop");
        riceCrop = new RiceBlockCrop().setBlockName("rice crop").setBlockTextureName(Main.MODID + ":rice_crop");
        barleyCrop = new BarleyBlockCrop().setBlockName("barley crop").setBlockTextureName(Main.MODID + ":barley_crop");
        oatsCrop =  new OatsBlockCrop().setBlockName("oats crop").setBlockTextureName(Main.MODID + ":oats_crop");
        ryeCrop = new RyeBlockCrop().setBlockName("rye crop").setBlockTextureName(Main.MODID + ":rye_crop");
        pepperCrop = new PepperBlockCrop().setBlockName("pepper crop").setBlockTextureName(Main.MODID + ":pepper_crop");
        peaCrop = new PeaBlockCrop().setBlockName("pea crop").setBlockTextureName(Main.MODID + ":pea_crop");
        GameRegistry.registerBlock(milletCrop, milletCrop.getUnlocalizedName());
        GameRegistry.registerBlock(maizeCrop, maizeCrop.getUnlocalizedName());
        GameRegistry.registerBlock(riceCrop, riceCrop.getUnlocalizedName());
        GameRegistry.registerBlock(barleyCrop, barleyCrop.getUnlocalizedName());
        GameRegistry.registerBlock(oatsCrop, oatsCrop.getUnlocalizedName());
        GameRegistry.registerBlock(ryeCrop, ryeCrop.getUnlocalizedName());
        GameRegistry.registerBlock(pepperCrop, pepperCrop.getUnlocalizedName());
        GameRegistry.registerBlock(peaCrop, peaCrop.getUnlocalizedName());
    }
}