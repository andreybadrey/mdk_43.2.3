package com.bodryak.gmod.network;

import com.bodryak.gmod.GmodMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModMessages {
    private static SimpleChannel INSTANCE;
    private static int packetId = 0;
    private static int id(){return packetId++;}

    public static <MSG> void sendToServer(MSG message){
        INSTANCE.sendToServer(message);
    }
    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }

    public static void register(){
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(GmodMod.MODID, "messages"))
                .networkProtocolVersion(()->"1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();
        INSTANCE = net;
    }
}
