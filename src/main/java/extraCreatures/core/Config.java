package extraCreatures.core;

import net.minecraftforge.common.config.Configuration;

public class Config {
	
	public static int fireWhirlWeight=50, bombBeetleWeight=2, beaverDuckWeight=5,
			megaMooseTaigaWeight=2; 
	
	public static void readcfg(){
		Configuration cfg=CommonProxy.config;
		try{
			cfg.load();
			initCfg(cfg);
		} catch(Exception e){
			System.out.println("Exra Creatures could not load config");
		} finally{
			if(cfg.hasChanged()){
				cfg.save();
			}
		}
	}
	private static void initCfg(Configuration cfg){
		cfg.addCustomCategoryComment("general", "Configuration");
		fireWhirlWeight=cfg.getInt("FireWhirlWeight", "general", 50, 0, Integer.MAX_VALUE, "Spawn weight of the fire whirl. Higher means more spawns");
		bombBeetleWeight=cfg.getInt("BombardierBeetleWeight", "general", 2, 0, Integer.MAX_VALUE, "Spawn weight of the bombardier beetle. Ocelot spawn weight is 2");
		beaverDuckWeight=cfg.getInt("BeaverDuckWeight", "general", 5, 0, Integer.MAX_VALUE, "Spawn weight of the beaver duck. Witch spawn weight is 5");
		megaMooseTaigaWeight=cfg.getInt("SaberMooseWeight", "general", 2, 0, Integer.MAX_VALUE, "Spawn weight of the saber moose");
	}
}
