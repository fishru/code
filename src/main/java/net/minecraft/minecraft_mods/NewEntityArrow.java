package net.minecraft.minecraft_mods;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityTippedArrow;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NewEntityArrow extends EntityTippedArrow {
	public int ticks = 0;
	int i = -1;
	int j = -1;
	int k = -1;
	//public BlockPos pos = new BlockPos(this);
	
	
	public NewEntityArrow(World worldIn) {
		super(worldIn);
		//this.set
	}
	
	public NewEntityArrow(World worldIn, EntityLivingBase shooter){
	        super(worldIn, shooter);
	}
	
	
	public void destroyBlock(BlockPos pos){
        for(i =-1; i <=1; i=i+1){
        	for(j =-1; j <= 1; j=j+1){
        		for(k=-1 ; k <= 1; k=k+1){
        			//if((i != 0) && (j != 0) && (k != 0)){
        				//pos = pos.add(i, j, k);
        				this.worldObj.destroyBlock(pos.add(i, j, k), true);
        	
        			//}
        		}
        	}
        }
	}
	
	
	public void onUpdate() {
		super.onUpdate();
		
        if (this.inGround)
        {
        	//int x,y,z;
        	//this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 2, true);
        	BlockPos pos = this.getPosition();
        	destroyBlock(pos);



            /*
        	this.worldObj.destroyBlock(pos.add(0, 0, 1), true);
        	this.worldObj.destroyBlock(pos.add(0, 0, -1), true);
        	this.worldObj.destroyBlock(pos.add(0, 1, 0), true);
        	this.worldObj.destroyBlock(pos.add(0, 1, 1), true);
        	this.worldObj.destroyBlock(pos.add(0, 1, -1), true);
        	this.worldObj.destroyBlock(pos.add(0, -1, 0), true);
        	this.worldObj.destroyBlock(pos.add(0, -1, 1), true);
        	this.worldObj.destroyBlock(pos.add(0, -1, -1), true);
        	this.worldObj.destroyBlock(pos.add(1, 0, 0), true);
        	this.worldObj.destroyBlock(pos.add(1, 0, 1), true);
        	this.worldObj.destroyBlock(pos.add(1, 1, 0), true);
        	this.worldObj.destroyBlock(pos.add(1, 1, 1), true);
        	this.worldObj.destroyBlock(pos.add(1, 1, -1), true);
        	this.worldObj.destroyBlock(pos.add(1, -1, 0), true);
        	this.worldObj.destroyBlock(pos.add(1, -1, 1), true);
        	this.worldObj.destroyBlock(pos.add(1, -1, -1), true);
        	this.worldObj.destroyBlock(pos.add(-1, 0, 0), true);
        	this.worldObj.destroyBlock(pos.add(-1, 0, 1), true);
        	this.worldObj.destroyBlock(pos.add(-1, 1, 0), true);
        	this.worldObj.destroyBlock(pos.add(-1, 1, 1), true);
        	this.worldObj.destroyBlock(pos.add(-1, 1, -1), true);
        	this.worldObj.destroyBlock(pos.add(-1, -1, 0), true);
        	this.worldObj.destroyBlock(pos.add(-1, -1, 1), true);
        	this.worldObj.destroyBlock(pos.add(-1, -1, -1), true);
        	*/
            ticks++;
            
        	if (ticks == 100) {
        		this.setDead();
        	}
            
        }
	}
	

}
