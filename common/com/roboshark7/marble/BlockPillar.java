package com.roboshark7.marble;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockPillar extends BlockContainer {

	public BlockPillar(int blockId, int textureIndex) {
		super(blockId, textureIndex, Material.rock);
		setHardness(5F);
		setResistance(7F);
		/* crucial for showing up in the inventory */
		setTextureFile(CommonProxy.MARBLE_BLOCK_ITEMS); 
		setBlockName("blockPillar");
		setCreativeTab(CreativeTabs.tabBlock);
		setRequiresSelfNotify(); // absolutely needed
	}
	
	// to make it drop an item, uncomment the lines below
	/* public int idDropped()
	{
	return Item.ingotIron; // you might need .shiftedIndex, i just wrote it here without eclipse
	}
	*/
	
	@Override
	public int quantityDropped(Random par1Random) {
		return 1;
	}
	// if you want your block to drop itself more then once, change it to an higher number.
	
	
	@Override
	public TileEntity createNewTileEntity(World var1) {
		return new PillarEntity();
	}
	
	@Override
	public int getRenderType() {
		return Marble.PILLAR_RENDER_ID;
	} // where and what to render


	@Override
	public boolean isOpaqueCube() {
		return false;
	} // make it opaque cube, or else you will be able to see trough the world !
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	} // offcourse, because it's not a 1x1x1 block


	/**
	* Determines the damage on the item the block drops. Used in cloth and wood.
	*/
	@Override
	public int damageDropped(int par1)
	{
		return par1;
	}


	public boolean blockActivated(World world, int x, int y, int z, EntityPlayer player) {
		//i don't know what this is for, so we better keep that there
		int p = MathHelper.floor_double((player.rotationYaw * 4F) / 360F + 0.5D) & 3; 

		byte byte0 = 3;

		if (p == 0)	{
			byte0 = 4;
		}
		if (p == 1)	{
			byte0 = 3;
		}
		if (p == 2)	{
			byte0 = 2;
		}
		if (p == 3)	{
			byte0 = 1;
		}

		world.setBlockMetadataWithNotify(x, y, z, byte0);
		player.openGui(Marble.instance, 0, world, x, y, z);
		
		return true;
	}
	
	public TileEntity getBlockEntity() {
		return new PillarEntity();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		/* add to inventory */
		par3List.add(new ItemStack(par1, 1, 0));
	} // to get all sub blocks. make it more or less ass you please.

}
