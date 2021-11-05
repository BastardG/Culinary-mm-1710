package ru.bastard.culinary.recipes;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

import java.util.Iterator;
import java.util.List;

public class RecipesRemover
{
    public static void init()
    {
        Iterator<IRecipe> removerRecipes = CraftingManager.getInstance().getRecipeList().iterator();

        while (removerRecipes.hasNext())
        {
            ItemStack itemStack = removerRecipes.next().getRecipeOutput();
            if(itemStack != null && itemStack.getItem() == Items.bread)
            {
                removerRecipes.remove();
            }
        }
    }

}

