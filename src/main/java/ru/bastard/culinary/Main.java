package ru.bastard.culinary;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import ru.bastard.culinary.blocks.ModBlocks;
import ru.bastard.culinary.events.ModEventHandler;
import ru.bastard.culinary.events.ModFMLEventHandler;
import ru.bastard.culinary.generation.GenerationRegistry;
import ru.bastard.culinary.items.ModItems;
import ru.bastard.culinary.recipes.BlockRecipes;
import ru.bastard.culinary.recipes.FurnaceRecipes;
import ru.bastard.culinary.recipes.ItemRecipes;
import ru.bastard.culinary.recipes.RecipesRemover;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main
{
    public static final String MODID = "culinary";
    public static final String VERSION = "1.0";
    public static final String NAME = "Culinary";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
        GenerationRegistry.init();
        RecipesRemover.init();
        BlockRecipes.init();
        ItemRecipes.init();
        FurnaceRecipes.init();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        MinecraftForge.EVENT_BUS.register(new ModEventHandler());
        FMLCommonHandler.instance().bus().register(new ModFMLEventHandler());
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
