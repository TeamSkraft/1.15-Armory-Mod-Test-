package com.teamskraft.armorymod.items;

import com.teamskraft.armorymod.ArmoryMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ArmoryMod.MODI));
    }
}
