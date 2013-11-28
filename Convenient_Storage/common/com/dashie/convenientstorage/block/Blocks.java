package com.dashie.convenientstorage.block;

import net.minecraft.block.Block;

import com.dashie.convenientstorage.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks 
{
	
	public static Block rainbowBlock;
	public static Block blackBlock;
	public static Block redBlock;
	public static Block greenBlock;
	public static Block brownBlock;
	public static Block blueBlock;
	public static Block purpleBlock;
	public static Block cyanBlock;
	public static Block silverBlock;
	public static Block grayBlock;
	public static Block pinkBlock;
	public static Block limeBlock;
	public static Block yellowBlock;
	public static Block lightBlueBlock;
	public static Block magentaBlock;
	public static Block orangeBlock;
	public static Block whiteBlock;
	
	/**
	 * Creates blocks
	 */
	public static void initBlocks()
	{
		rainbowBlock = HoldingBlock.RainbowBlock;
		blackBlock = HoldingBlock.BlackBlock;
		redBlock = HoldingBlock.RedBlock;
		greenBlock = HoldingBlock.GreenBlock;
		brownBlock = HoldingBlock.BrownBlock;
		blueBlock = HoldingBlock.BlueBlock;
		purpleBlock = HoldingBlock.PurpleBlock;
		cyanBlock = HoldingBlock.CyanBlock;
		silverBlock = HoldingBlock.SilverBlock;
		grayBlock = HoldingBlock.GrayBlock;
		pinkBlock = HoldingBlock.PinkBlock;
		limeBlock = HoldingBlock.LimeBlock;
		yellowBlock = HoldingBlock.YellowBlock;
		lightBlueBlock = HoldingBlock.LightBlueBlock;
		magentaBlock = HoldingBlock.MagentaBlock;
		orangeBlock = HoldingBlock.OrangeBlock;
		whiteBlock = HoldingBlock.WhiteBlock;
		
		/**Register Blocks*/
		GameRegistry.registerBlock(rainbowBlock, Strings.RAINBOW_BLOCK_NAME);
		GameRegistry.registerBlock(blackBlock, Strings.BLACK_BLOCK_NAME);
		GameRegistry.registerBlock(redBlock, Strings.RED_BLOCK_NAME);
		GameRegistry.registerBlock(greenBlock, Strings.GREEN_BLOCK_NAME);
		GameRegistry.registerBlock(brownBlock, Strings.BROWN_BLOCK_NAME);
		GameRegistry.registerBlock(blueBlock, Strings.BLUE_BLOCK_NAME);
		GameRegistry.registerBlock(purpleBlock, Strings.PURPLE_BLOCK_NAME);
		GameRegistry.registerBlock(cyanBlock, Strings.CYAN_BLOCK_NAME);
		GameRegistry.registerBlock(silverBlock, Strings.SILVER_BLOCK_NAME);
		GameRegistry.registerBlock(grayBlock, Strings.GRAY_BLOCK_NAME);
		GameRegistry.registerBlock(pinkBlock, Strings.PINK_BLOCK_NAME);
		GameRegistry.registerBlock(limeBlock, Strings.LIME_BLOCK_NAME);
		GameRegistry.registerBlock(yellowBlock, Strings.YELLOW_BLOCK_NAME);
		GameRegistry.registerBlock(lightBlueBlock, Strings.LIGHT_BLUE_BLOCK_NAME);
		GameRegistry.registerBlock(magentaBlock, Strings.MAGENTA_BLOCK_NAME);
		GameRegistry.registerBlock(orangeBlock, Strings.ORANGE_BLOCK_NAME);
		GameRegistry.registerBlock(whiteBlock, Strings.WHITE_BLOCK_NAME);		
		
		/**Language Register*/
		LanguageRegistry.addName(rainbowBlock, Strings.RAINBOW_BLOCK_IGN);
		LanguageRegistry.addName(blackBlock, Strings.BLACK_BLOCK_IGN);
		LanguageRegistry.addName(redBlock, Strings.RED_BLOCK_IGN);
		LanguageRegistry.addName(greenBlock, Strings.GREEN_BLOCK_IGN);
		LanguageRegistry.addName(brownBlock, Strings.BROWN_BLOCK_IGN);
		LanguageRegistry.addName(blueBlock, Strings.BLUE_BLOCK_IGN);
		LanguageRegistry.addName(purpleBlock, Strings.PURPLE_BLOCK_IGN);
		LanguageRegistry.addName(cyanBlock, Strings.CYAN_BLOCK_IGN);
		LanguageRegistry.addName(silverBlock, Strings.PURPLE_BLOCK_IGN);
		LanguageRegistry.addName(grayBlock, Strings.GRAY_BLOCK_IGN);
		LanguageRegistry.addName(pinkBlock, Strings.PINK_BLOCK_IGN);
		LanguageRegistry.addName(limeBlock, Strings.LIME_BLOCK_IGN);
		LanguageRegistry.addName(magentaBlock, Strings.MAGENTA_BLOCK_IGN);
		LanguageRegistry.addName(orangeBlock, Strings.ORANGE_BLOCK_IGN);
		LanguageRegistry.addName(whiteBlock, Strings.WHITE_BLOCK_IGN);
	}
}
