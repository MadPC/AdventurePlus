package com.madpcgaming.adventureplus.lib;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;

public class AdventureConfig
{
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void initProps(File location)
	{
		File newFile = new File(location + "/Adventure+.config");
		try
		{
			newFile.createNewFile();
		}
		catch(IOException e)
		{
			//AdventurePlus.logger.severe("Could not create configuration file for Advtenture+. Reason:");
			//AdventurePlus.logger.severe(e.getLocalizedMessage());
		}
		
		Configuration config = new Configuration(newFile);
		cfglocation = location;
		
		config.load();
		
		//Allows for other mods
		boolean ic2 = true;
		boolean xycraft = true;
		try
		{
			Class c = Class.forName("ic2.core.IC2");
			ic2 = false;
		}
		catch (Exception e)
		{
		}
		try
		{
			Class C = Class.forName("soaryn.xycraft.core.XyCraft");
			xycraft = false;
		}
		catch(Exception e)
		{
		}
		//Allows you disable the generation of ore
		generatePaladium = config.get("Worldgen Disabler", "Generate Paladium", true).getBoolean(true);
		
		//Allows to tweak the density of the ores underground
		paladiumuDensity = config.get("WorldGen", "Palladium Underground Density", 3).getInt(3);
		
		//Allows you to set the lowest point your ore can be found
		paladiumuMinY = config.get("WorldGen", "Palladium Underground Min Y", 10).getInt(10);
		//Allows you to set the highest point your ore can be found.
		paladiumuMaxY = config.get("WorldGen", "Palladium Underground Max Y", 55).getInt(55);
		
	}
	
	public static File cfglocation;
	
	public static boolean generatePaladium;
	
	public static int paladiumuDensity;
	
	public static int paladiumuMinY;
	public static int paladiumuMaxY;
}
