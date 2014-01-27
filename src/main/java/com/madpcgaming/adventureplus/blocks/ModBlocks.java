package com.madpcgaming.adventureplus.blocks;

import net.minecraft.block.Block;
import com.madpcgaming.adventureplus.blocks.PaladiumOre;
import com.madpcgaming.adventureplus.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Blocks added by the mod. 
 * 
 * @author Advtech92
 *
 */
public class ModBlocks
{
	//Registering Blocks 
	public static Block PaladiumOre;
	
	public static void init()
	{
		//Registering Blocks
		PaladiumOre = new PaladiumOre();
		
		//GameRegistry
		GameRegistry.registerBlock(PaladiumOre, Strings.PALADIUM_ORE_NAME);
	}
}
