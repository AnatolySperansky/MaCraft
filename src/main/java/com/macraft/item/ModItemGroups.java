package com.macraft.item;

import com.macraft.MaCraft;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PINK_GARcom_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MaCraft.MOD_ID, "manacrystal_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.manacrystal_group"))
                    .icon(() -> new ItemStack(ModItems.MANACRYSTAL)).entries((displayContext, entries) -> {

            }).build());
        public static void registerItemGroups() {

    }
    
    
}
