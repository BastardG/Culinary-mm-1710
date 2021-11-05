package ru.bastard.culinary.blocks.crops;

import cpw.mods.fml.common.Mod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import ru.bastard.culinary.items.ModItems;

public class OatsBlockCrop extends BlockCrops
{
    public Item func_149866_i()
    {
        return ModItems.oats_seeds;
    }

    public Item func_149865_P()
    {
        return ModItems.oats;
    }
}
