package com.macraft.item;

import com.macraft.MaCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class ModItems{
    public static final Item MANACRYSTAL = registerItem("manacrystal", new Item(new FabricItemSettings()));
    public static final Item MANAPOWDER = registerItem("manapowder", new Item(new FabricItemSettings()));
    

    private static void addItemsToIngridientItemGroup(FabricItemGroupEntries entries){
        entries.add(MANACRYSTAL);
        entries.add(MANAPOWDER);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM,  new Identifier(MaCraft.MOD_ID, name), item);
    }


    public static void registerModItems(){
        MaCraft.LOGGER.info("Registering Mod Items for " + MaCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngridientItemGroup );
    }
    
}
