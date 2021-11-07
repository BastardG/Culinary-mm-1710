package ru.bastard.culinary.events;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import ru.bastard.culinary.items.ModItems;

import java.beans.EventHandler;

public class ModEventHandler
{


    @SubscribeEvent
    public void onEntityHorse(LivingDropsEvent event)
    {
        if (event.source.getDamageType().equals("player")) {
            if (event.entityLiving instanceof EntityHorse) {
                double rand;
                rand = Math.random();
                event.entityLiving.dropItem(ModItems.horse_meat,(int) (rand * 3) + 1);
            }
        }
        else if(event.source.getDamageType().equals("onFire")){
            if (event.entityLiving instanceof EntityHorse){
                double rand;
                rand = Math.random();
                event.entityLiving.dropItem(ModItems.horse_fried_meat,1);
            }
        }
    }

    @SubscribeEvent
    public void onEntitySheep(LivingDropsEvent event)
    {
        if(event.source.getDamageType().equals("player")) {
            if (event.entityLiving instanceof EntitySheep) {
                double rand;
                rand = Math.random();
                event.entityLiving.dropItem(ModItems.sheep_meat, (int) (rand * 2) + 1);
            }
        }
        else if(event.source.getDamageType().equals("onFire"))
        {
            if (event.entityLiving instanceof EntitySheep){
                double rand;
                rand = Math.random();
                event.entityLiving.dropItem(ModItems.sheep_fried_meat, (int) (rand * 2) + 1);
            }
        }
    }
}
