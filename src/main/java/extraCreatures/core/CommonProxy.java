package extraCreatures.core;

import java.io.File;

import extraCreatures.entity.EntityManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	
	public static Configuration config;
	
	public void preInit(FMLPreInitializationEvent event){
		File file=event.getModConfigurationDirectory();
		config=new Configuration(new File(file.getPath(),"extra_creatures.cfg"));
		Config.readcfg();
		EntityManager.init();
	}
	public void init(FMLInitializationEvent event){
		if(Config.aprilFools)
			MinecraftForge.EVENT_BUS.register(new FartEventHandler());
	}
	public void postInit(FMLPostInitializationEvent event){
		EntityManager.initSpawn();
		if(config.hasChanged()){
			config.save();
		}
	}
}
