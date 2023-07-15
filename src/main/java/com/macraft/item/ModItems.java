package com.macraft.item;

import com.macraft.MaCraft;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;

public class ModItems{
    
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,  new Identifier(MaCraft.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MaCraft.LOGGER.info("registeringmoditems" + MaCraft.MOD_ID);
    }
    
}
