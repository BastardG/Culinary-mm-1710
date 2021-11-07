package ru.bastard.culinary.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

import java.awt.*;
import java.util.Iterator;
import java.util.List;

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
    public static Item dough_for_cookies;
    public static Item cocoa_powder;
    public static Item dark_chocolate;
    public static Item milk_chocolate;
    public static Item hot_chocolate;
    public static Item cocoa_drink;
    public static Item tea;
    public static Item green_tea;
    public static Item coffee;
    public static Item pea;
    public static Item horse_meat;
    public static Item horse_fried_meat;
    public static Item pea_soup_with_horse_meat;
    public static Item sheep_meat;
    public static Item sheep_fried_meat;

    public static void init()
    {
        ItemsInitialization.init();
        ItemsRegistration.init();
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
class ItemFatFood extends ItemFood{

    public ItemFatFood(int hunger, float saturation, boolean can_be_eaten_by_dogs) {
        super(hunger, saturation, can_be_eaten_by_dogs);
        setMaxStackSize(1);
    }
    public ItemStack onEaten(ItemStack is, World world, EntityPlayer player){
        super.onEaten(is, world, player);
        if(!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5 * 20, 1));
        }
        return is;
    }
    @Override
    public int getMaxItemUseDuration(ItemStack is){
        return 128;
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
class ItemFatDrink extends ItemFood{
    public ItemFatDrink(int hunger, float saturation, boolean can_be_eaten_by_dogs){
        super(hunger, saturation, can_be_eaten_by_dogs);
        setMaxStackSize(4);
    }

    public ItemStack onEaten(ItemStack is, World world, EntityPlayer player){
        super.onEaten(is, world, player);
        if(!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 20 * 20, 2));
        }
        return is;
    }

    public EnumAction getItemUseAction(ItemStack is) {
        return EnumAction.drink;
    }
}
class ItemCoffeeDrink extends ItemFood{
    public ItemCoffeeDrink(int hunger, float saturation, boolean can_be_eaten_by_dogs) {
        super(hunger, saturation, can_be_eaten_by_dogs);
        setMaxStackSize(4);
    }
    public ItemStack onEaten(ItemStack is, World world, EntityPlayer player){
        super.onEaten(is, world, player);
        if(!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 60 * 20, 1));
            player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 10 * 20, 1));
        }
        return is;
    }
    public EnumAction getItemUseAction(ItemStack is) {
        return EnumAction.drink;
    }
}

class ItemPeaSoup extends ItemFood {

    public ItemPeaSoup(int hunger, float saturation, boolean can_eaten_by_dogs) {
        super(hunger, saturation, can_eaten_by_dogs);
        setMaxStackSize(1);
    }

    public ItemStack onEaten(ItemStack is, World world, EntityPlayer player){
        super.onEaten(is, world, player);
        if(!world.isRemote) {
            player.addPotionEffect(new PotionEffect(Potion.confusion.id, 5 * 20, 5));
            player.addChatMessage(new ChatComponentText("YX BLYA!!!!!"));
            player.inventory.addItemStackToInventory(new ItemStack(Items.bowl));
        }
        return is;
    }
    public int getMaxItemUseDuration(ItemStack is){
        return 5*20;
    }
}
class ItemHorseMeat extends ItemFood{

    public ItemHorseMeat(int hunger, float saturation, boolean can_be_eaten_by_dogs) {
        super(hunger, saturation, can_be_eaten_by_dogs);
    }
}