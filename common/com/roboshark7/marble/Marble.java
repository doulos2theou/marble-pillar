package com.roboshark7.marble;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "MarbleMod_roboshark7", name = "Marble", version = "0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false 
,clientPacketHandlerSpec = @SidedPacketHandler(channels = {"MarbleMod" }, packetHandler = ClientPacketHandler.class),
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"MarbleMod" }, packetHandler = ServerPacketHandler.class)
)
public class Marble
{
	/* Proxy classes */
	@SidedProxy(clientSide = "com.roboshark7.marble.ClientProxy", serverSide = "com.roboshark7.marble.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance("Technical")
	public static Marble instance;
	
	/* Blocks */
	public static Block marbleBlock;
	public static Block blockPillar;
	
	public static int MARBLE_BLOCK_ID = 146;
	public static int PILLAR_BLOCK_ID = 147;
	public static int PILLAR_RENDER_ID = 0;
	
	Configuration config;
	
	//you can put all of your statics and public statics here. 
	@cpw.mods.fml.common.Mod.Init
	//this is were you can put all of your registries and such.
	public void Init(FMLInitializationEvent event){
		
		/* load a config file */
//		config = new Configuration(new File(CoreProxy.getBuildCraftBase(), "config/foobar.cfg"));
//		config.load();
//		boolean toggle = Boolean.parseBoolean(config.get(Configuration.CATEGORY_GENERAL, "toggle", false).value);
//		config.save();

		/* call the proxy */
		proxy.registerRenderInformation();
		
		/* instantiate the blocks */
		marbleBlock = new MarbleBlock(MARBLE_BLOCK_ID);
		blockPillar = new BlockPillar(PILLAR_BLOCK_ID, 0); 

		/* register the blocks */
		GameRegistry.registerBlock(marbleBlock);
		GameRegistry.registerBlock(blockPillar);
		
		/* register names for the inventory */
		LanguageRegistry.addName(marbleBlock, "Marble");
		LanguageRegistry.addName(blockPillar, "Marble Pillar");
						 
		/* register the Network */
		NetworkRegistry.instance().registerGuiHandler(this, proxy);
		
//		Item.itemsList[MARBLE_BLOCK_ID] = new ItemMarbleBlock(MARBLE_BLOCK_ID-256).setItemName("marble");
		
		/* register to be aware of time passing */
//		TickRegistry.registerTickHandler(new ServerTickHandler(EnumSet.of(TickType.SERVER)), Side.SERVER);
		
		
		/* add a shaped recipe to use the crafting table */
		GameRegistry.addRecipe(new ItemStack(blockPillar, 1), new Object[]
				  { " X ", " X ", " X ", Character.valueOf('X'), new ItemStack(marbleBlock) });
	}

	//this method is not commonly used however i still add it just in case. 
	//i also added an output for debug purposes.
	@cpw.mods.fml.common.Mod.PreInit
	public void PreInit(FMLPreInitializationEvent event){
		System.out.println("Put Text Here"); //the text you put in this spot will be outputed to the command prompt when you launch the mod.
		config = new Configuration(event.getSuggestedConfigurationFile());
	}
}
