package com.dashie.convenientstorage.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.dashie.convenientstorage.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HoldingBlock extends Block
{
	public static final Block RainbowBlock = (new DyeHolderBlock(3167, 9)).addADrop(1).addADrop(14).addADrop(11).addADrop(2).addADrop(4).addADrop(5).addADrop(0).addADrop(15).addADrop(9).setUnlocalizedName(Strings.RAINBOW_BLOCK_NAME).setTextureName(Strings.RAINBOW_BLOCK_ICON);
	public static final Block BlackBlock = (new DyeHolderBlock(3168, 9)).addADrop(0).addADrop(0).addADrop(0).addADrop(0).addADrop(0).addADrop(0).addADrop(0).addADrop(0).addADrop(0).setUnlocalizedName(Strings.BLACK_BLOCK_NAME).setTextureName(Strings.BLACK_BLOCK_ICON);
	public static final Block RedBlock = (new DyeHolderBlock(3169, 9)).addADrop(1).addADrop(1).addADrop(1).addADrop(1).addADrop(1).addADrop(1).addADrop(1).addADrop(1).addADrop(1).setUnlocalizedName(Strings.RED_BLOCK_NAME).setTextureName(Strings.RED_BLOCK_ICON);
	public static final Block GreenBlock = (new DyeHolderBlock(3170, 9)).addADrop(2).addADrop(2).addADrop(2).addADrop(2).addADrop(2).addADrop(2).addADrop(2).addADrop(2).addADrop(2).setUnlocalizedName(Strings.GREEN_BLOCK_NAME).setTextureName(Strings.GREEN_BLOCK_ICON);
	public static final Block BrownBlock = (new DyeHolderBlock(3171, 9)).addADrop(3).addADrop(3).addADrop(3).addADrop(3).addADrop(3).addADrop(3).addADrop(3).addADrop(3).addADrop(3).setUnlocalizedName(Strings.BROWN_BLOCK_NAME).setTextureName(Strings.BROWN_BLOCK_ICON);
	public static final Block BlueBlock =  (new DyeHolderBlock(3172, 9)).addADrop(4).addADrop(4).addADrop(4).addADrop(4).addADrop(4).addADrop(4).addADrop(4).addADrop(4).addADrop(4).setUnlocalizedName(Strings.BLUE_BLOCK_NAME).setTextureName(Strings.BLUE_BLOCK_ICON);
	public static final Block PurpleBlock = (new DyeHolderBlock(3173, 9)).addADrop(5).addADrop(5).addADrop(5).addADrop(5).addADrop(5).addADrop(5).addADrop(5).addADrop(5).addADrop(5).setUnlocalizedName(Strings.PURPLE_BLOCK_NAME).setTextureName(Strings.PURPLE_BLOCK_ICON);
	public static final Block CyanBlock = (new DyeHolderBlock(3174, 9)).addADrop(6).addADrop(6).addADrop(6).addADrop(6).addADrop(6).addADrop(6).addADrop(6).addADrop(6).addADrop(6).setUnlocalizedName(Strings.CYAN_BLOCK_NAME).setTextureName(Strings.CYAN_BLOCK_ICON);
	public static final Block SilverBlock = (new DyeHolderBlock(3175, 9)).addADrop(7).addADrop(7).addADrop(7).addADrop(7).addADrop(7).addADrop(7).addADrop(7).addADrop(7).addADrop(7).setUnlocalizedName(Strings.SILVER_BLOCK_NAME).setTextureName(Strings.SILVER_BLOCK_ICON);
	public static final Block GrayBlock = (new DyeHolderBlock(3176, 9)).addADrop(8).addADrop(8).addADrop(8).addADrop(8).addADrop(8).addADrop(8).addADrop(8).addADrop(8).addADrop(8).setUnlocalizedName(Strings.GRAY_BLOCK_NAME).setTextureName(Strings.GRAY_BLOCK_ICON);
	public static final Block PinkBlock = (new DyeHolderBlock(3177, 9)).addADrop(9).addADrop(9).addADrop(9).addADrop(9).addADrop(9).addADrop(9).addADrop(9).addADrop(9).addADrop(9).setUnlocalizedName(Strings.PINK_BLOCK_NAME).setTextureName(Strings.PINK_BLOCK_ICON);
	public static final Block LimeBlock = (new DyeHolderBlock(3178, 9)).addADrop(10).addADrop(10).addADrop(10).addADrop(10).addADrop(10).addADrop(10).addADrop(10).addADrop(10).setUnlocalizedName(Strings.LIME_BLOCK_NAME).setTextureName(Strings.LIME_BLOCK_ICON);
	public static final Block YellowBlock = (new DyeHolderBlock(3179, 9)).addADrop(11).addADrop(11).addADrop(11).addADrop(11).addADrop(11).addADrop(11).addADrop(11).addADrop(11).setUnlocalizedName(Strings.YELLOW_BLOCK_NAME).setTextureName(Strings.YELLOW_BLOCK_ICON);
	public static final Block LightBlueBlock = (new DyeHolderBlock(3180, 9)).addADrop(12).addADrop(12).addADrop(12).addADrop(12).addADrop(12).addADrop(12).addADrop(12).addADrop(12).setUnlocalizedName(Strings.LIGHT_BLUE_BLOCK_NAME).setTextureName(Strings.LIGHT_BLUE_BLOCK_ICON);
	public static final Block MagentaBlock = (new DyeHolderBlock(3181, 9)).addADrop(13).addADrop(13).addADrop(13).addADrop(13).addADrop(13).addADrop(13).addADrop(13).addADrop(13).setUnlocalizedName(Strings.MAGENTA_BLOCK_NAME).setTextureName(Strings.MAGENTA_BLOCK_ICON);
	public static final Block OrangeBlock = (new DyeHolderBlock(3182, 9)).addADrop(14).addADrop(14).addADrop(14).addADrop(14).addADrop(14).addADrop(14).addADrop(14).addADrop(14).setUnlocalizedName(Strings.ORANGE_BLOCK_NAME).setTextureName(Strings.ORANGE_BLOCK_ICON);
	public static final Block WhiteBlock = (new DyeHolderBlock(3183, 9)).addADrop(15).addADrop(15).addADrop(15).addADrop(15).addADrop(15).addADrop(15).addADrop(15).addADrop(15).setUnlocalizedName(Strings.WHITE_BLOCK_NAME).setTextureName(Strings.WHITE_BLOCK_ICON);
	
	public int amountOfDropsCounted = 0;
	public int[] hasWhatDamage;
	public int dropsWhatId;
	
	/**
	 * 
	 * @param id The id of the block being created
	 * @param material The material of the block being created
	 * @param id2 The id of the block being dropped
	 * @param drops The number of blocks being dropped
	 */
	public HoldingBlock(int id, Material material, int id2, int drops)
	{
		super(id, material);
		dropsWhatId = id2;
		hasWhatDamage = new int[drops];
	}
	 
    /**
     * This returns a complete list of items dropped from this block.
     *
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z Position
     * @param metadata Current metadata
     * @param fortune Breakers fortune level
     * @return A ArrayList containing all items this block drops
     */
	@Override
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        if(amountOfDropsCounted == 0)
        {
        	ret.add(new ItemStack(this.blockID, 1, 0));
        }
        else
        {
        	for(int i = 0; i < amountOfDropsCounted; i++)
        	{
    			ret.add(new ItemStack(dropsWhatId, 1, hasWhatDamage[i]));
        	}
        }
        return ret;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister regester)
	{
		blockIcon = regester.registerIcon(Strings.TEXTURE_LOCATION + this.getTextureName());
	}
	
	/**
	 * 
	 * @param damage The damage of one of the items being returned
	 * @return Send it back out to be changed again
	 */
	public HoldingBlock addADrop(int damage)
	{
		hasWhatDamage[amountOfDropsCounted] = damage;
		amountOfDropsCounted++;
		return this;
	}
			
}
