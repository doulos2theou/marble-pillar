package com.roboshark7.marble.other;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


public class ItemPillar extends ItemBlock {
	public ItemPillar(int par1, Block block) {
		super(par1);
		setHasSubtypes(true);
	}

	@Override
	public String getItemNameIS(ItemStack itemstack) {
		String name = "";
		switch(itemstack.getItemDamage()) {
			case 0:
				name = "WoodPillar";
				break;
			case 1:
				name = "BrickPillar";
				break;
			default: name = "WoodPillar";
		}
		return itemstack.getItem().getItemName() + "." + name;
	}
	// for every block, you need a name. it doesn't matter, really. its just so all your blocks wont have the same name. delete this part and all your blocks have the same name.

	@Override
	public int getMetadata(int par1) {
		return par1;
	}
}

