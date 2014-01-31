package com.madpcgaming.adventureplus.lib;

import java.io.File;
import java.io.IOException;

import net.minecraftforge.common.config.Configuration;

public class AdventureConfig
{
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
		
		generatePaladium = config.get("Worldgen Disabler", "Generate Paladium", true).getBoolean(true);
		
	}
	
	public static File cfglocation;
	
	public static boolean generatePaladium;
}
