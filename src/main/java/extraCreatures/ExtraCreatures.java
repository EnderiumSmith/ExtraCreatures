package extraCreatures;

import extraCreatures.core.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=ExtraCreatures.MODID, name=ExtraCreatures.MODNAME, version=ExtraCreatures.VERSION)
public class ExtraCreatures {
	
	public static final String MODID="extracreatures";
	public static final String MODNAME="ExtraCreatures";
	public static final String VERSION="1.2.0";
	
	@Mod.Instance
	public static ExtraCreatures INSTANCE;
	
	@SidedProxy(clientSide="extraCreatures.core.ClientProxy",
			serverSide="extraCreatures.core.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.preInit(event);
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
}
