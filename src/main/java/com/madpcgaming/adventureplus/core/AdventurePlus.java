package com.madpcgaming.adventureplus.core;
import com.madpcgaming.adventureplus.blocks.ModBlocks;
import com.madpcgaming.adventureplus.items.ModItems;
import com.madpcgaming.adventureplus.lib.AdventureConfig;
import com.madpcgaming.adventureplus.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class AdventurePlus 
{
	@Instance("Adv+")
	public static AdventurePlus instance;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		AdventureConfig.initProps(event.getModConfigurationDirectory());
		ModBlocks.init();
		ModItems.init();
	}
   
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
  
    }
}
