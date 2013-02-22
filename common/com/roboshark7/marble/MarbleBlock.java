package com.roboshark7.marble;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;


/**
 * Custom Block implementation
 */
public class MarbleBlock extends Block {
//	public static final int INDEX_IN_TEXTURE = 187;
	public static final int INDEX_IN_TEXTURE = 0;
	
	public MarbleBlock(int blockId) {
		super(blockId, INDEX_IN_TEXTURE, Material.rock);
		/* set step sound */
		this.setStepSound(Block.soundStoneFootstep);
		/* set hardness */
		this.setHardness(3.0F);
		/* set resistance */
		this.setResistance(10.0F);
		/* set block name */
		this.setBlockName("marble");
		/* adds the block to the Block tab in Creative Mode */
		this.setCreativeTab(CreativeTabs.tabBlock);
		/* texture index in the Texture File */
		blockIndexInTexture=INDEX_IN_TEXTURE;
	}
	
	@Override
	public String getTextureFile() {
		return CommonProxy.MARBLE_BLOCK_PNG;
	}
	
	 @Override
	public int damageDropped(int i) {
         return i;
	 }

    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     * side 0 = Bottom
	 * side 1 = Top
	 * side 2 = East
	 * side 3 = West
	 * side 4 = North
	 * side 5 = South 
     */
    @Override
	public int getBlockTexture(IBlockAccess iBlockAccess, int x, int y, int z, int side) {
    	int absX = Math.abs(x);
    	int absY = Math.abs(y);
    	int absZ = Math.abs(z);
    	
    	if (side == 0) {
    		/* works! */
    		blockIndexInTexture = (absX % 4) + (absZ % 4)*16;
    	} else if (side == 1)  {
    		/* works! */
    		blockIndexInTexture = - (absX % 4) + (absZ % 4)*16 + 3;
    	} else if (side == 2)  {
    		/* works! */
    		blockIndexInTexture = (absX % 4) - (absY % 4)*16;
    	} else if (side == 3)  {
    		/* works! */
    		blockIndexInTexture = - (absX % 4) - (absY % 4)*16 - 12;
    	} else if (side == 4){
    		/* works! */
    		blockIndexInTexture = (absZ % 4) - (absY % 4)*16;
    	} else if (side == 5){
    		/* works! */ 
    		blockIndexInTexture = -(absZ % 4) - (absY % 4)*16 + 3;
    	}
    	return this.getBlockTextureFromSideAndMetadata(side, iBlockAccess.getBlockMetadata(x, y, z));
	}

//	 /**
//     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
//     */
//    @Override
//	public int getBlockTextureFromSideAndMetadata(int side, int metadata) {
//    	return metadata;
////        return this.getBlockTextureFromSide(side);
//    }

}
