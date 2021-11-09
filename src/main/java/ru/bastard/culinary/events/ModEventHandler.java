package ru.bastard.culinary.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import ru.bastard.culinary.items.ModItems;

public class ModEventHandler {


    @SubscribeEvent
    public void onEntityHorseDrops(LivingDropsEvent event) {
        if (event.source.getDamageType().equals("player")) {
            if (event.entityLiving instanceof EntityHorse) {
                double rand;
                rand = Math.random();
                event.entityLiving.dropItem(ModItems.horse_meat, (int) (rand * 3) + 1);
            }
        } else if (event.source.getDamageType().equals("onFire")) {
            if (event.entityLiving instanceof EntityHorse) {
                double rand;
                rand = Math.random();
                event.entityLiving.dropItem(ModItems.horse_cooked_meat, 1);
            }
        }
    }

    @SubscribeEvent
    public void onEntitySheepDrops(LivingDropsEvent event) {
        if (event.source.getDamageType().equals("player")) {
            if (event.entityLiving instanceof EntitySheep) {
                double rand;
                rand = Math.random();
                event.entityLiving.dropItem(ModItems.mutton, (int) (rand * 2) + 1);
            }
        } else if (event.source.getDamageType().equals("onFire")) {
            if (event.entityLiving instanceof EntitySheep) {
                double rand;
                rand = Math.random();
                event.entityLiving.dropItem(ModItems.cooked_mutton, (int) (rand * 2) + 1);
            }
        }
    }
}