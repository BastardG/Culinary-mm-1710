package ru.bastard.culinary.generation;

import cpw.mods.fml.common.registry.GameRegistry;

public class GenerationRegistry
{
    public static void init()
    {
        MWorldGen MWorldGen = new MWorldGen();
        GameRegistry.registerWorldGenerator(MWorldGen, 1);
    }
}
