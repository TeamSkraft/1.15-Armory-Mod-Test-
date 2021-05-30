package com.teamskraft.armorymod.util;

import com.teamskraft.armorymod.ArmoryMod;
import com.teamskraft.armorymod.armor.ModArmorMaterial;
import com.teamskraft.armorymod.blocks.BlockItemBase;
import com.teamskraft.armorymod.blocks.EnderOreBlock;
import com.teamskraft.armorymod.blocks.EnderiteDebrisBlock;
import com.teamskraft.armorymod.blocks.TinOreBlock;
import com.teamskraft.armorymod.items.ItemBase;
import com.teamskraft.armorymod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ArmoryMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ArmoryMod.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public  static  final RegistryObject<Item> TIN = ITEMS.register("tin", ItemBase::new);
    public  static  final RegistryObject<Item> ENDUR_INGOT = ITEMS.register("endur_ingot", ItemBase::new);
    public  static  final RegistryObject<Item> ENDERITE_SCRAP = ITEMS.register("enderite_scrap", ItemBase::new);
    public  static  final RegistryObject<Item> ENDERITE_INGOT = ITEMS.register("enderite_ingot", ItemBase::new);
    public  static  final RegistryObject<Item> VIBRANIUM_INGOT = ITEMS.register("vibranium_ingot", ItemBase::new);

    //Blocks
    public  static final RegistryObject<Block> TIN_ORE_BLOCK = BLOCKS.register("tin_ore", TinOreBlock::new);
    public  static final RegistryObject<Block> ENDERITE_DEBRIS_BLOCK = BLOCKS.register("enderite_debris", EnderiteDebrisBlock::new);
    public  static final RegistryObject<Block> ENDER_ORE = BLOCKS.register("ender_ore", EnderOreBlock::new);

    //Block Items
    public static final RegistryObject<Item> TIN_ORE_BLOCK_ITEM = ITEMS.register("tin_ore",
            () -> new BlockItemBase(TIN_ORE_BLOCK.get()));
    public static final RegistryObject<Item> ENDERITE_DEBRIS_BLOCK_ITEM = ITEMS.register("enderite_debris",
            () -> new BlockItemBase(ENDERITE_DEBRIS_BLOCK.get()));
    public static final RegistryObject<Item> ENDER_ORE_BLOCK_ITEM = ITEMS.register("ender_ore",
            () -> new BlockItemBase(ENDER_ORE.get()));

    //VIBRANIUM TOOLS
    public static final RegistryObject<SwordItem> VIBRANIUM_SWORD = ITEMS.register("vibranium_sword",
            () -> new SwordItem(ModItemTier.VIBRANIUM, 9, -3.0F, new Item.Properties().group(ArmoryMod.ARMY)));

    public static final RegistryObject<PickaxeItem> VIBRANIUM_PICKAXE = ITEMS.register("vibranium_pickaxe",
            () -> new PickaxeItem(ModItemTier.VIBRANIUM, 3, 0.0F, new Item.Properties().group(ArmoryMod.ARMY)));

    public static final RegistryObject<AxeItem> VIBRANIUM_AXE = ITEMS.register("vibranium_axe",
            () -> new AxeItem(ModItemTier.VIBRANIUM, 12, -3.0F, new Item.Properties().group(ArmoryMod.ARMY)));

    public static final RegistryObject<ShovelItem> VIBRANIUM_SHOVEL = ITEMS.register("vibranium_shovel",
            () -> new ShovelItem(ModItemTier.VIBRANIUM, 2, -3.0F, new Item.Properties().group(ArmoryMod.ARMY)));


    public static final RegistryObject<HoeItem> VIBRANIUM_HOE = ITEMS.register("vibranium_hoe",
            () -> new HoeItem(ModItemTier.VIBRANIUM, -1.0F, new Item.Properties().group(ArmoryMod.ARMY)));

    //Vibranium Armor
    public static final RegistryObject<ArmorItem> VIBRANIUM_HELMET = ITEMS.register("vibranium_helmet",
            () -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.HEAD, new Item.Properties().group(ArmoryMod.ARMY)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_CHESTPLATE = ITEMS.register("vibranium_chestplate",
            () -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.CHEST, new Item.Properties().group(ArmoryMod.ARMY)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_LEGGINGS = ITEMS.register("vibranium_leggings",
            () -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.LEGS, new Item.Properties().group(ArmoryMod.ARMY)));

    public static final RegistryObject<ArmorItem> VIBRANIUM_BOOTS = ITEMS.register("vibranium_boots",
            () -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.FEET, new Item.Properties().group(ArmoryMod.ARMY)));

}
