package ru.bastard.culinary.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import ru.bastard.culinary.Main;
import ru.bastard.culinary.blocks.ModBlocks;

public class ItemsInitialization
{
    public static void init()
    {
        ModItems.dough = new ItemFood(1, 0F, false).setUnlocalizedName("dough").setTextureName(Main.MODID + ":dough").setCreativeTab(CreativeTabs.tabFood);
        ModItems.flour = new ItemFood(1, 0F, false).setUnlocalizedName("flour").setTextureName(Main.MODID + ":flour").setCreativeTab(CreativeTabs.tabFood);
        ModItems.pestle_and_mortar = new PestleAndMortar().setUnlocalizedName("pestle and mortar").setTextureName(Main.MODID + ":mortar").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.millet_seeds = new ItemSeeds(ModBlocks.milletCrop, Blocks.farmland).setUnlocalizedName("millet_seeds").setTextureName(Main.MODID + ":millet_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.maize_seeds = new ItemSeeds(ModBlocks.maizeCrop, Blocks.farmland).setUnlocalizedName("maize_seeds").setTextureName(Main.MODID + ":maize_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.rice_seeds = new ItemSeedFood(1, 0F, ModBlocks.riceCrop, Blocks.farmland).setUnlocalizedName("rice").setTextureName(Main.MODID + ":rice").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.barley_seeds = new ItemSeeds(ModBlocks.barleyCrop, Blocks.farmland).setUnlocalizedName("barley_seeds").setTextureName(Main.MODID + ":barley_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.oats_seeds = new ItemSeeds(ModBlocks.oatsCrop, Blocks.farmland).setUnlocalizedName("oats_seeds").setTextureName(Main.MODID + ":oats_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.rye_seeds = new ItemSeeds(ModBlocks.ryeCrop, Blocks.farmland).setUnlocalizedName("rye_seeds").setTextureName(Main.MODID + ":rye_seeds").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.pepper_seeds = new ItemSeeds(ModBlocks.pepperCrop, Blocks.farmland).setUnlocalizedName("pepper").setTextureName(Main.MODID + ":pepper").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.millet = new Item().setUnlocalizedName("millet").setTextureName(Main.MODID + ":millet").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.maize = new ItemFood(2, 0.1F, false).setUnlocalizedName("ear of corn").setTextureName(Main.MODID + ":corn").setCreativeTab(CreativeTabs.tabFood);
        ModItems.barley = new Item().setUnlocalizedName("barley").setTextureName(Main.MODID + ":barley").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.oats = new Item().setUnlocalizedName("oats").setTextureName(Main.MODID + ":oats").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.rye = new Item().setUnlocalizedName("rye").setTextureName(Main.MODID + ":rye").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.ground_pepper = new ItemFood(1, 0F, false).setUnlocalizedName("ground pepper").setTextureName(Main.MODID + "ground_pepper").setCreativeTab(CreativeTabs.tabFood);
        ModItems.cake_layer = new ItemFood(2, 0.5F, false).setUnlocalizedName("cake layer").setTextureName(Main.MODID + ":cake_layer").setCreativeTab(CreativeTabs.tabFood);
        ModItems.apple_pie = new ItemFood(6, 6F, false).setUnlocalizedName("apple pie").setTextureName(Main.MODID + "apple_pie").setCreativeTab(CreativeTabs.tabFood);
        ModItems.potato_chicken_pie = new ItemFood(10, 10F, false).setUnlocalizedName("chicken pie").setTextureName(Main.MODID + ":chicken_pie").setCreativeTab(CreativeTabs.tabFood);
        ModItems.fish_pie = new ItemFood(12, 12F, false).setUnlocalizedName("fish pie").setTextureName(Main.MODID + ":fish_pie").setCreativeTab(CreativeTabs.tabFood);
        ModItems.beef_pie = new ItemFatFood(20, 20F, true).setUnlocalizedName("beef pie").setTextureName(Main.MODID + ":beef_pie").setCreativeTab(CreativeTabs.tabFood);
        ModItems.rice_in_bowl = new ItemFood(1, 0F, false).setUnlocalizedName("rice bowl").setTextureName(Main.MODID + ":rice_bowl").setCreativeTab(CreativeTabs.tabFood);
        ModItems.boiled_rice = new ItemFood(3, 0.5F, false).setUnlocalizedName("boiled rice").setTextureName(Main.MODID + ":boiled_rice").setCreativeTab(CreativeTabs.tabFood).setContainerItem(Items.bowl);
        ModItems.beef_mince = new ItemFood(3, 1.5F, true).setUnlocalizedName("mince").setTextureName(Main.MODID + ":mince").setCreativeTab(CreativeTabs.tabFood);
        ModItems.fried_beef_mince = new ItemFood(6, 3F, true).setUnlocalizedName("fried mince").setTextureName(Main.MODID + ":fried_mince").setCreativeTab(CreativeTabs.tabFood);
        ModItems.bottle_of_salt = new BottleOfSalt().setUnlocalizedName("vaporized salt").setTextureName(Main.MODID + ":vaporized_salt").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.dough_for_cookies = new ItemFood(2, 0.5F, false).setUnlocalizedName("cookie dough").setTextureName(Main.MODID + ":cookie_dough").setCreativeTab(CreativeTabs.tabFood);
        ModItems.cocoa_powder = new Item().setUnlocalizedName("cocoa powder").setTextureName(Main.MODID + ":cocoa_powder").setCreativeTab(CreativeTabs.tabMaterials);
        ModItems.dark_chocolate = new ItemFood(3, 1F, false).setUnlocalizedName("dark chocolate").setTextureName(Main.MODID + ":dark_choco").setCreativeTab(CreativeTabs.tabFood);
        ModItems.milk_chocolate = new ItemFood(6, 1.5F, false).setUnlocalizedName("milk chocolate").setTextureName(Main.MODID + ":milk_choco").setCreativeTab(CreativeTabs.tabFood);
        ModItems.hot_chocolate = new ItemFatDrink(6, 1F, false).setUnlocalizedName("hot chocolate").setTextureName(Main.MODID + ":hot_chocolate").setCreativeTab(CreativeTabs.tabFood);
        ModItems.cocoa_drink = new ItemFatDrink(4, 1F, false).setUnlocalizedName("cocoa").setTextureName(Main.MODID + ":cocoa_drink").setCreativeTab(CreativeTabs.tabFood);
        ModItems.tea = new ItemCoffeeDrink(0, 0F, false).setUnlocalizedName("tea").setTextureName(Main.MODID + ":tea").setCreativeTab(CreativeTabs.tabFood);
        ModItems.green_tea = new ItemCoffeeDrink(0, 0F, false).setUnlocalizedName("green tea").setTextureName(Main.MODID + ":green_tea").setCreativeTab(CreativeTabs.tabFood);
        ModItems.coffee = new ItemCoffeeDrink(0, 0F, false).setUnlocalizedName("coffee").setTextureName(Main.MODID + ":coffee");
        ModItems.pea = new ItemSeedFood(1, 0F, ModBlocks.peaCrop, Blocks.farmland).setUnlocalizedName("pea").setTextureName(Main.MODID + "pea").setCreativeTab(CreativeTabs.tabFood);
        ModItems.horse_meat = new ItemHorseMeat(3, 1.2F, true).setUnlocalizedName("horse meat").setTextureName(Main.MODID + ":horse_meat").setCreativeTab(CreativeTabs.tabFood);
        ModItems.horse_fried_meat = new ItemFood(6, 3F, true).setUnlocalizedName("fried horse meat").setTextureName(Main.MODID + ":horse_fried_meat").setCreativeTab(CreativeTabs.tabFood);
        ModItems.pea_soup_with_horse_meat = new ItemPeaSoup(20, 10F, true).setUnlocalizedName("pea soup").setTextureName(Main.MODID + ":pea_soup").setCreativeTab(CreativeTabs.tabFood);
        ModItems.sheep_meat = new ItemFood(2, 1.2F,true).setUnlocalizedName("sheep meat").setTextureName(Main.MODID + ":sheep_meat").setCreativeTab(CreativeTabs.tabFood);
        ModItems.sheep_fried_meat = new ItemFood(6, 9.6F, true).setUnlocalizedName("sheep fried meat").setTextureName(Main.MODID + ":sheep_fried_meat").setCreativeTab(CreativeTabs.tabFood);
    }
}
