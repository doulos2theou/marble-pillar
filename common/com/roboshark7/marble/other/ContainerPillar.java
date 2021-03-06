package com.roboshark7.marble.other;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.roboshark7.marble.PillarEntity;


/**
 * Connects the inventory of the player and tile entity to the GUI
 * Defines the position on screen and the shift-click behaviour
 */

public class ContainerPillar extends Container {
	
	protected PillarEntity tileEntity;
	
	public ContainerPillar (InventoryPlayer inventoryPlayer, PillarEntity te){
        tileEntity = te;

        //the Slot constructor takes the IInventory and the slot number in that it binds to
        //and the x-y coordinates it resides on-screen
        addSlotToContainer(new Slot(tileEntity, 0, 76, 37));

        //commonly used vanilla code that adds the player's inventory
        bindPlayerInventory(inventoryPlayer);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tileEntity.isUseableByPlayer(player);
	}

	protected void bindPlayerInventory(InventoryPlayer inventoryPlayer) {
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 9; j++) {
                        addSlotToContainer(new Slot(inventoryPlayer, j + i * 9 + 9,
                                        8 + j * 18, 84 + i * 18));
                }
        }

        for (int i = 0; i < 9; i++) {
                addSlotToContainer(new Slot(inventoryPlayer, i, 8 + i * 18, 142));
        }
	}
	
	/**
	 * This method will attempt to place the given itemStack within the Container slots 
	 * between start and end. It will try to fill from end to start if backwards=true, 
	 * and vice versa. You can use the transferStackInSlot method for "intelligent" shift-clicking, 
	 * like putting smeltable items in the top slot of a furnance and fuel in the bottom slot.
	 */
	public ItemStack transferStackInSlot(int slot) {
        ItemStack stack = null;
        Slot slotObject = (Slot) inventorySlots.get(slot);

        //null checks and checks if the item can be stacked (maxStackSize > 1)
        if (slotObject != null && slotObject.getHasStack()) {
                ItemStack stackInSlot = slotObject.getStack();
                stack = stackInSlot.copy();

                //merges the item into player inventory since its in the tileEntity
                //this assumes only 1 slot, for inventories with > 1 slots, check out the Chest Container.
                /** 
                * mergItemStock:
                * @param itemStack ItemStack to merge into inventory
                * @param start minimum slot to attempt fill
                * @param end maximum slot to attempt fill
                * @param backwards go backwards
                * @return true if stacks merged successfully
                */
                if (slot == 0) {
                        if (!mergeItemStack(stackInSlot, 1,
                                        inventorySlots.size(), true)) {
                                return null;
                        }
                //places it into the tileEntity is possible since its in the player inventory
                } else if (!mergeItemStack(stackInSlot, 0, 1, false)) {
                        return null;
                }

                if (stackInSlot.stackSize == 0) {
                        slotObject.putStack(null);
                } else {
                        slotObject.onSlotChanged();
                }
        }

        return stack;
	}
}
