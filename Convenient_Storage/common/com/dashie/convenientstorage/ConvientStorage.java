package com.dashie.convenientstorage;

import com.dashie.convenientstorage.block.Blocks;
import com.dashie.convenientstorage.crafting.Recipes;
import com.dashie.convenientstorage.lib.Refrence;
import com.dashie.convenientstorage.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * 
 * @author Dashie
 * @version 0.1.0
 *
 */

@Mod(modid = Refrence.MOD_ID, name = Refrence.MOD_NAME, version = Refrence.VERSION)
public class ConvientStorage 
{
	@Instance(Refrence.MOD_ID)
	public static ConvientStorage instance;
	@SidedProxy(clientSide = Refrence.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	/**
	 * The jawn that makes the blocks and word shit
	 * 
	 * @param event
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Blocks.initBlocks();
	}
	
	/**
	 * The jawn that makes those recipes
	 * 
	 * @param event
	 */
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		Recipes.addRecipes();
	}
	
	/**
	 * I forget what this jawn does, but it's ok caus we dont use it
	 * 
	 * @param event
	 */
	@EventHandler
	public void postInit(FMLInitializationEvent event)
	{
		//nothing to do here
	}
}