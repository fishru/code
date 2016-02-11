package net.minecraft.minecraft_mods;

import java.io.UnsupportedEncodingException;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {
	
	@SubscribeEvent
	public void sendMessage(BreakEvent event){
		
		
		if (!event.world.isRemote){
			//String message = new String("敲破方塊");
			//try {
				//byte[] utf_str = "敲破方塊".getBytes("UTF-8");
				//String str = new String(utf_str, "UTF-8");
				event.getPlayer().addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "敲破了方塊"));
			//} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
			
			
			
			
		}
		System.out.println("isRemote? >> "+event.world.isRemote);
		
	}
}
