package com.dashie.convenientstorage.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes 
{
	public static void addRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(3167, 1, 0), new Object[] {new ItemStack(Item.dyePowder, 1, 1), new ItemStack(Item.dyePowder, 1, 14), new ItemStack(Item.dyePowder, 1, 11), new ItemStack(Item.dyePowder, 1, 2), new ItemStack(Item.dyePowder, 1, 4), new ItemStack(Item.dyePowder, 1, 5), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 15), new ItemStack(Item.dyePowder, 1, 9)});
		GameRegistry.addShapelessRecipe(new ItemStack(3168, 1, 0), new Object[] {new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 0), new ItemStack(Item.dyePowder, 1, 0)});
	}
}
