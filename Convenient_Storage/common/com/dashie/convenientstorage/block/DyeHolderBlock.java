package com.dashie.convenientstorage.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class DyeHolderBlock extends HoldingBlock
{

	private static final int dyeId = 351;

	/**
	 * 
	 * @param id  the ID of the block being constructed
	 * @param drops the number of items being dropped
	 */
	public DyeHolderBlock(int id, int drops)
	{
		super(id, Material.ground, dyeId, drops);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(1F);
		this.setStepSound(Block.soundStoneFootstep);
	}	

}
