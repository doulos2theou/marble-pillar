package com.roboshark7.marble;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

/** From Forge Tutorial:
 * Your main proxy class (common) will often be for server side, and contain all methods 
 * for both client and server. Any client-only methods should be blank/return null in the common proxy.
 */
public class CommonProxy implements IGuiHandler {
	
	public static final String MARBLE_BLOCK_PNG = "/images/marble_mod.png";
	public static final String MARBLE_BLOCK_ITEMS = "/images/marble_items.png";
	
	/**
	 * Client side only register stuff...
	 */
	public void registerRenderInformation() {
		// unused server side. -- see ClientProxy for implementation
	}

	@Override
	/**
	 * Server side for GUI (custom slots)
	 */
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
//        if (tileEntity instanceof PillarEntity) {
//            return new ContainerPillar(player.inventory, (PillarEntity) tileEntity);
//        }
        return null;
	}

	@Override
	/**
	 * Client side for GUI (custom slots)
	 */
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
//        if (tileEntity instanceof PillarEntity) {
//            return new GuiPillar(player.inventory, (PillarEntity) tileEntity);
//        }
        return null;
	}

}// End class CommonProxy

