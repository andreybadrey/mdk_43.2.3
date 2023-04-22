package com.bodryak.gmod.items;

import com.bodryak.gmod.GmodMod;
import com.bodryak.gmod.entitys.GmodModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class GmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GmodMod.MODID);
	public static final RegistryObject<Item> GARIK_SPAWN_EGG = REGISTRY.register("garik_spawn_egg",
			() -> new ForgeSpawnEggItem(GmodModEntities.GARIK, -1, -1, new Item.Properties().tab(ModCreativeTabs.NPS)));
}
