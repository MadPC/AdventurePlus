package com.madpcgaming.adventureplus.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.madpcgaming.adventureplus.blocks.ModBlocks;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Items added by the Mod.
 * 
 * @author Advtech92
 *
 */
public class ModItems
{
	public static Item PaladiumIngot;
	
	public static void init()
	{
		//Block Registition
		PaladiumIngot = new PaladiumIngot();
		
		//Smelting Recipes
		GameRegistry.addSmelting(ModBlocks.PaladiumOre, new ItemStack(PaladiumIngot), 0.7F);
	}
}
