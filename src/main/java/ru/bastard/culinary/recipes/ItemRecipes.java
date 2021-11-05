package ru.bastard.culinary.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
        GameRegistry.addRecipe(new ItemStack(ModItems.pestle_and_mortar), "   ", "XYX", "XXX", 'X', Blocks.cobblestone, 'Y', Items.stick);
    }
}