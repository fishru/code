package net.minecraft.minecraft_mods;

import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {
	
	@SubscribeEvent
	public void sendMessage(BreakEvent event){
		
		
		if (!event.getWorld().isRemote){
			//String message = new String("嚙踐嚙踐僮嚙踐��蕭");
			//try {
				//byte[] utf_str = "嚙踐嚙踐僮嚙踐��蕭".getBytes("UTF-8");
				//String str = new String(utf_str, "UTF-8");
				//event.getPlayer().addChatMessage(new ChatComponentText(EnumChatFormatting.GOLD + "嚙踐嚙踐僮�����蕭"));
			//} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
			
			
			
			
		}
		System.out.println("isRemote? >> "+event.getWorld().isRemote);
		
	}
}
