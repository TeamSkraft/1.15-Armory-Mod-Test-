package com.teamskraft.armorymod;



import com.teamskraft.armorymod.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




@Mod("armory")
public class ArmoryMod
{

    private static final Logger LOGGER = LogManager.getLogger();
    public  static  final  String MOD_ID = "armory";

    public ArmoryMod() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }


    public static final ItemGroup MODI = new ItemGroup("mod_items") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.ENDERITE_SCRAP.get());
        }
    };

    public static final ItemGroup ARMY = new ItemGroup("armory") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.VIBRANIUM_AXE.get());
        }
    };


}
