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
    public static Block saltOre;

    public static void init()
    {
        milletCrop = new MilletBlockCrop().setBlockName("millet crop").setBlockTextureName(Main.MODID + ":milletcrop");
        maizeCrop = new MaizeBlockCrop().setBlockName("maize crop").setBlockTextureName(Main.MODID + ":maizecrop");
        riceCrop = new RiceBlockCrop().setBlockName("rice crop").setBlockTextureName(Main.MODID + ":ricecrop");
        barleyCrop = new BarleyBlockCrop().setBlockName("barley crop").setBlockTextureName(Main.MODID + ":barleycrop");
        oatsCrop =  new OatsBlockCrop().setBlockName("oats crop").setBlockTextureName(Main.MODID + ":oatscrop");
        ryeCrop = new RyeBlockCrop().setBlockName("rye crop").setBlockTextureName(Main.MODID + ":ryecrop");
        pepperCrop = new PepperBlockCrop().setBlockName("pepper crop").setBlockTextureName(Main.MODID + "peppercrop");
        saltOre = new SaltOreBlock().setBlockName("salt ore").setBlockTextureName(Main.MODID + "saltore").setHardness(2.0F).setStepSound(Block.soundTypeStone);
        GameRegistry.registerBlock(milletCrop, milletCrop.getUnlocalizedName());
        GameRegistry.registerBlock(maizeCrop, maizeCrop.getUnlocalizedName());
        GameRegistry.registerBlock(riceCrop, riceCrop.getUnlocalizedName());
        GameRegistry.registerBlock(barleyCrop, barleyCrop.getUnlocalizedName());
        GameRegistry.registerBlock(oatsCrop, oatsCrop.getUnlocalizedName());
        GameRegistry.registerBlock(ryeCrop, ryeCrop.getUnlocalizedName());
        GameRegistry.registerBlock(pepperCrop, pepperCrop.getUnlocalizedName());
        GameRegistry.registerBlock(saltOre, saltOre.getUnlocalizedName());
    }
}

class SaltOreBlock extends BlockOre
{

}