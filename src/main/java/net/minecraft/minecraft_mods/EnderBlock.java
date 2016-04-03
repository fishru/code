package net.minecraft.minecraft_mods;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EnderBlock extends Block{
	
	public EnderBlock() {
		super(Material.iron);
		this.setUnlocalizedName("enderBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setResistance(5.0F);
		this.setHardness(10.0F);
		this.setLightLevel(1.0F);
	}
	
	/*
	public void addLightningBolt(World world, BlockPos pos){
		EntityLightningBolt lightning = new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ());
		world.addWeatherEffect(lightning);
	}
	*/
	
	/*
	@Override
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
		IBlockState block = world.getBlockState(pos.add(0, -1, 0));

		world.setBlockState(pos, block);
		//addLightningBolt(world, pos);
		EntityLightningBolt lightning = new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ());
		world.addWeatherEffect(lightning);
	}
	
	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumFacing side, float hitX, float hitY, float hitZ) {
		if(!world.isRemote)
			return false;
		
		player.addChatMessage(new ChatComponentText(EnumChatFormatting.DARK_PURPLE + "You have clicked on the majestic ENDERIUM BLOCK!!!"));
		//EntityEnderEye eye = new EntityEnderEye(world, pos.getX()+0.5, pos.getY()+1.5, pos.getZ()+0.5);
		//eye.motionY=0;
		//eye.motionX=-2.0;
		//eye.motionX=2.0;
		//world.spawnEntityInWorld(eye);
		return true;
	}
	*/

	@Override
	public void onLanded(World world, Entity entity){

		if( ! (entity instanceof EntityPlayer) ) {
			return;
		}
		//addLightningBolt(world, entity.getPosition());
		BlockPos pos = entity.getPosition();
		/*
		EntityLightningBolt lightning = new EntityLightningBolt(world, pos.getX(), pos.getY(), pos.getZ());
		world.addWeatherEffect(lightning);
		*/
		world.addWeatherEffect(new EntityLightningBolt(world, pos.getX()+2, pos.getY(), pos.getZ()+2));
		world.addWeatherEffect(new EntityLightningBolt(world, pos.getX()+2, pos.getY(), pos.getZ()-2));
		world.addWeatherEffect(new EntityLightningBolt(world, pos.getX()-2, pos.getY(), pos.getZ()-2));
		world.addWeatherEffect(new EntityLightningBolt(world, pos.getX()-2, pos.getY(), pos.getZ()+2));

	}
	

	public Item getItemDropped(int i1, Random random, int i2) 
	{
		/*
		EnderIngot enderIngot = new EnderIngot();
		return enderIngot;
		*/
		return Main.enderIngot;
	}
    
	public int quantityDropped(Random random)
	{
		return random.nextInt(2) + 3;
	}
	
}
