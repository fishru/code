package net.minecraft.minecraft_mods;

import java.util.Random;

import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PigsDroppingDiamonds {
	
	@SubscribeEvent
	public void dropDiamonds(LivingDeathEvent event){
		if(!(event.getEntity() instanceof EntityPig)) {
			return;
		}
		
		Random random = new Random();
		if(!event.getEntity().worldObj.isRemote) {
		    event.getEntity().dropItem(Items.golden_carrot ,random.nextInt(3));
		    event.getEntity().dropItem(Item.getItemFromBlock(Blocks.cobblestone) ,random.nextInt(3));
		}
	}

}
