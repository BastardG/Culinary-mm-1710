package ru.bastard.culinary.recipes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import ru.bastard.culinary.items.ModItems;

public class ItemRecipes {
    public static void init() {
        //GameRegistry.addRecipe(new ItemStack(Items.bread), "XXX", "XXX", "XXX", 'X', Items.bed); пример
        //GameRegistry.addShapelessRecipe(new ItemStack(Items.flint_and_steel), Items.iron_ingot, Items.flint); пример
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), Items.wheat, ModItems.pestle_and_mortar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), ModItems.barley, ModItems.pestle_and_mortar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), ModItems.maize_seeds, ModItems.pestle_and_mortar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), ModItems.rice_seeds, ModItems.pestle_and_mortar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), ModItems.rye, ModItems.pestle_and_mortar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), ModItems.oats, ModItems.pestle_and_mortar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), ModItems.millet, ModItems.pestle_and_mortar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ground_pepper), ModItems.pepper_seeds, ModItems.pestle_and_mortar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough),ModItems.flour, ModItems.flour, ModItems.flour, new ItemStack(Items.potionitem, 4));
        GameRegistry.addRecipe(new ItemStack(ModItems.pestle_and_mortar), "   ", "XYX", "XXX", 'X', Blocks.stone, 'Y', Items.stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.cake_layer, 3), "SY ", "XXX", "   ", 'S', Items.sugar, 'Y', ModItems.bottle_of_salt, 'X', ModItems.bread);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.apple_pie), ModItems.cake_layer, Items.sugar, Items.apple, Items.egg);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.potato_chicken_pie), ModItems.cake_layer, Items.potato, Items.chicken, ModItems.ground_pepper);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fish_pie), ModItems.cake_layer, ModItems.boiled_rice, Items.fish, Items.egg);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pumpkin_pie), ModItems.cake_layer, Blocks.pumpkin, Items.sugar, Items.egg);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.beef_pie), ModItems.fried_beef_mince, ModItems.cake_layer);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.beef_mince), ModItems.bottle_of_salt, ModItems.ground_pepper, ModItems.rice_seeds, Items.egg, Items.beef, Items.sugar);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cocoa_powder), ModItems.pestle_and_mortar, new ItemStack(Items.dye, 1, 3));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough_for_cookies), ModItems.dough, Items.sugar, ModItems.cocoa_powder);
        GameRegistry.addRecipe(new ItemStack(ModItems.dark_chocolate), "CCC", "CWC", "CCC", 'C', ModItems.cocoa_powder, 'W', Items.water_bucket);
        GameRegistry.addRecipe(new ItemStack(ModItems.milk_chocolate), "SSS","SMC","CCC", 'S',Items.sugar, 'M', Items.milk_bucket, 'C', ModItems.cocoa_powder);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.cookie, 8), ModItems.dough_for_cookies, ModItems.milk_chocolate);
    }
}