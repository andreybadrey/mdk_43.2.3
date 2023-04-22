package com.bodryak.gmod;

import com.bodryak.gmod.client.gui.init.GmodModMenus;
import com.bodryak.gmod.entitys.GmodModEntities;
import com.bodryak.gmod.items.GmodModItems;
import com.bodryak.gmod.items.ModCreativeTabs;
import com.bodryak.gmod.network.ModMessages;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GmodMod.MODID)
public class GmodMod
{
    public static final String MODID = "gmod";

    public GmodMod()
    {
        ModCreativeTabs.load();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        GmodModEntities.REGISTRY.register(bus);
        GmodModItems.REGISTRY.register(bus);

        GmodModMenus.REGISTRY.register(bus);




    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        //Register networking
        ModMessages.register();
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }

}
