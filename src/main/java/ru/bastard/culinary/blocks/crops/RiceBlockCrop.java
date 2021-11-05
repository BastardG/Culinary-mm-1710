package ru.bastard.culinary.blocks.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import ru.bastard.culinary.items.ModItems;

public class RiceBlockCrop extends BlockCrops
{
    @Override
    public Item func_149866_i()
    {
        return ModItems.rice_seeds;
    }

    @Override
    public Item func_149865_P()
    {
        return ModItems.rice_seeds;
    }
}
