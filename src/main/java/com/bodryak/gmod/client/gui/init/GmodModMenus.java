package com.bodryak.gmod.client.gui.init;

import com.bodryak.gmod.GmodMod;
import com.bodryak.gmod.client.gui.DialogMenu;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;


public class GmodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GmodMod.MODID);
	public static final RegistryObject<MenuType<DialogMenu>> DIALOG_GUI = REGISTRY.register("dialoggui", () -> IForgeMenuType.create(DialogMenu::new));
}
