package com.roboshark7.marble.other;

import net.minecraft.item.ItemBlock;


public class ItemMarbleBlock extends ItemBlock {

	public ItemMarbleBlock(int par1) {
		super(par1);
		setHasSubtypes(true);
	}

	public int getPlacedBlockMetadata(int i) {
		return i;
	}
}
