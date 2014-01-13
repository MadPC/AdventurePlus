package adventurecore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import blocks.PaladiumOre;
import adventurecore.Eventmanager;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = AdventurePlus.modid, name = "Adventure +", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)


public class AdventurePlus {


	public static final String modid = "YourName_ModName";

	private static final IWorldGenerator Eventmanager = null;
    
    public static Block PaladiumOre;
    
    public static Item PaladiumIngot;
   
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
          PaladiumOre = new PaladiumOre(500, Material.rock).setUnlocalizedName("PaladiumOre");
         
          GameRegistry.registerBlock(PaladiumOre, modid + PaladiumOre.getUnlocalizedName());
         
          LanguageRegistry.addName(PaladiumOre, "Paladium Ore");
         
          PaladiumIngot = new items.PaladiumIngot(5000).setUnlocalizedName("PaladiumIngot");
         
          LanguageRegistry.addName(PaladiumIngot, "Paladium Ingot");
    
          GameRegistry.registerWorldGenerator(Eventmanager);    
    }
}
