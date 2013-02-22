package com.roboshark7.marble;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

/** 
 * Always needs to extend CommonProxy
 */
public class ClientProxy extends CommonProxy {

	@Override
	/**
	 * Required for registering the Renderer 
	 */
	public void registerRenderInformation() {
		MinecraftForgeClient.preloadTexture(MARBLE_BLOCK_PNG);
		MinecraftForgeClient.preloadTexture(MARBLE_BLOCK_ITEMS);
		Marble.PILLAR_RENDER_ID = RenderingRegistry.getNextAvailableRenderId();
		ClientRegistry.registerTileEntity(PillarEntity.class, "Marble Pillar", new PillarEntityRenderer());
	}
	
//	private static int textureIndex = 0;
//	// This is the current MC texture index for BC
//	private static int coreTextureIndex = -1;
//	private static String customTexture = "/com/roboshark7/marble/marble_textures.png";
//		
//	/**
//	 * Required to override to the main texture file
//	 */
//	@SuppressWarnings("rawtypes")
//	public static void addCustomTexture() {
//		try {
//			HashMap textures = new HashMap();
//			textures = (HashMap) ModLoader.getPrivateValue(RenderEngine.class, ModLoader.getMinecraftInstance().renderEngine, 1);
//			coreTextureIndex = (Integer) textures.get(customTexture);
//			ModTextureStatic modtexturestatic;
//			modtexturestatic = new ModTextureStatic(textureIndex, coreTextureIndex, ModLoader.loadImage(
//							ModLoader.getMinecraftInstance().renderEngine, customTexture));
//			ModLoader.getMinecraftInstance().renderEngine.registerTextureFX(modtexturestatic);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
}
