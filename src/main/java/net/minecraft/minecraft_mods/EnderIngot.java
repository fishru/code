package net.minecraft.minecraft_mods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class EnderIngot extends ItemFood {
	public EnderIngot() {
		super(5, 1.0F, true);
		//this.setPotionEffect(1, 60, 2, 0.5F);
		this.setAlwaysEdible();
		this.setUnlocalizedName("ingotEnder");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	/*
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
	   
	    EntityEnderman enderman = new EntityEnderman(world);
	    enderman.setLocationAndAngles(player.posX, player.posY, player.posZ, 0, 0);
	    
	    if(!world.isRemote) {
	    world.spawnEntityInWorld(enderman);
	    }
	    if(!player.capabilities.isCreativeMode) {
		    stack.stackSize--;
	    }
	   
	    return stack;
    }
    */
	
}
