package com.xkball.xkballs_railway.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class Register {
    
    @SubscribeEvent
    public static void onBlockReg(RegistryEvent.Register<Block> event){
    
    }
    
    @SubscribeEvent
    public static void onItemReg(RegistryEvent.Register<Item> event){
    
    }
}
