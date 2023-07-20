package com.macraft.block;

import com.macraft.MaCraft;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MANACRYSTAL_ORE = registerBlock("manacrystal_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    //private static void addBlocksToBlocksItemGroup(FabricItemGroupEntries entries){
    //    entries.add(MANACRYSTAL_ORE);
    //}



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MaCraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MaCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        MaCraft.LOGGER.info("Registering ModBlocks for " + MaCraft.MOD_ID);
    }
}
