package net.minecraft.minecraft_mods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArrow;

public class ItemTestArrow extends ItemArrow {
    public ItemTestArrow()
    {
    	this.setUnlocalizedName("testArrow");
        this.setCreativeTab(CreativeTabs.tabCombat);
    }
	

}
