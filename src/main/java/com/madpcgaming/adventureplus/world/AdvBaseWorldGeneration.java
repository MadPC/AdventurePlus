package com.madpcgaming.adventureplus.world;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.madpcgaming.adventureplus.blocks.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;

public class AdvBaseWorldGeneration implements IWorldGenerator
{
	
	//public AdvbaseWorldGeneration()
	{
		//paladium = new WorldGenMinable(ModBlocks.PaladiumOre, 3, Blocks.stone);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		if(world.provider.terrainType != WorldType.FLAT)
		{
			generateSurface(random, chunkX * 16, chunkZ * 16, world);
		}
	}
	
	void generateSurface(Random random, int xChunk, int zChunk, World world)
	{
		String biomeName = world.getWorldChunkManager().getBiomeGenAt(xChunk, zChunk).biomeName;
		
		generateUndergroundOres(random, xChunk, zChunk, world);
		
		if(biomeName == "Extreme Hills Edge" || biomeName == "Extreme Hills")
		{
			generateUndergroundOres(random, xChunk, zChunk, world);
		}
	}
	
	void generateUndergroundOres(Random random, int xChunk, int zChunk, World world)
	{
		int xPos, yPos, zPos;
		
	}

}
