package com.bodryak.gmod.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeTabs {
    public static CreativeModeTab NPS;

    public static void load() {
        NPS = new CreativeModeTab("nps") {
            @Override public ItemStack makeIcon() { return new ItemStack(Blocks.PLAYER_HEAD); }
            @Override public boolean hasSearchBar() { return true; }
        }.setBackgroundSuffix("item_search.png");
    }

}
