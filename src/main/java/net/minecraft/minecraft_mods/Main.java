package net.minecraft.minecraft_mods;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main {
	public static final String MODID = "myMods";
	public static final String VERSION = "1.0";
	public static final String NAME = "mymods";
	public static Block enderBlock;
	public static Item enderIngot;
	
	@EventHandler
	public void init(FMLPreInitializationEvent event)
	{
		


		

		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		enderBlock = new EnderBlock();
		enderIngot = new EnderIngot();
		
		GameRegistry.registerBlock(enderBlock, "enderBlock");
		GameRegistry.registerItem(enderIngot, "Ender Ingot");
		
		GameRegistry.addRecipe(
				new ItemStack(Blocks.cobblestone),
				"dd",
				"dd",
				'd', Blocks.dirt);
		
		GameRegistry.addRecipe(
				new ItemStack(enderBlock, 3),
				"e e",
				" o ",
				"e e",
				'o', Blocks.obsidian,
				'e', Items.ender_eye);
		
		GameRegistry.addShapelessRecipe(
				new ItemStack(enderIngot,9),
				new ItemStack(enderBlock),
				new ItemStack(Items.iron_ingot));
		
		GameRegistry.addSmelting(Items.ender_pearl,
				new ItemStack(enderIngot, 2),
				1.0F);
		
		
		Item enderBlockItem = GameRegistry.findItem("mymods", "enderBlock");
		ModelResourceLocation enderBlockModel = new ModelResourceLocation("mymods:enderBlock", "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(enderBlockItem, 0, enderBlockModel);
		
		
		//MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
		//MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
		//MinecraftForge.EVENT_BUS.register(new ExplodingAnvils());
		//MinecraftForge.EVENT_BUS.register(new PigsDroppingDiamonds());
		MinecraftForge.EVENT_BUS.register(new ZombieKnights());
		

	}

}
