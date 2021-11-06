package ru.bastard.culinary.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.bastard.culinary.items.ModItems;
public class FurnaceRecipes
{
    public static void init()
    {
        GameRegistry.addSmelting(ModItems.dough, new ItemStack(Items.bread), 0.1F);
        GameRegistry.addSmelting(ModItems.beef_mince, new ItemStack(ModItems.fried_beef_mince), 0.1F);
        GameRegistry.addSmelting(new ItemStack(Items.potionitem), new ItemStack(ModItems.bottle_of_salt), 0.1F);
    }
}
