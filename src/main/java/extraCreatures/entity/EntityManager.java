package extraCreatures.entity;

import java.util.HashSet;
import java.util.Set;

import extraCreatures.ExtraCreatures;
import extraCreatures.core.Config;
import extraCreatures.model.RenderBeaverDuck;
import extraCreatures.model.RenderBombardierBeetle;
import extraCreatures.model.RenderFireWhirl;
import extraCreatures.model.RenderMegaMoose;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityManager {
	
	public static void init(){
		EntityRegistry.registerModEntity(new ResourceLocation(ExtraCreatures.MODID, "fire_whilr"), EntityFireWhirl.class, "fire_whirl", 1, ExtraCreatures.INSTANCE, 64, 3, true, 0xffa500, 0xff0000);
		EntityRegistry.registerModEntity(new ResourceLocation(ExtraCreatures.MODID, "bomb_beetle"), EntityBombardierBeetle.class, "bombardier_beetle", 2, ExtraCreatures.INSTANCE, 64, 3, true, 0x000000, 0xffa500);
		EntityRegistry.registerModEntity(new ResourceLocation(ExtraCreatures.MODID, "beaver_duck"), EntityBeaverDuck.class, "beaver_duck", 3, ExtraCreatures.INSTANCE, 64, 3, true, 0x310C0C, 0xffa500);
		EntityRegistry.registerModEntity(new ResourceLocation(ExtraCreatures.MODID, "megamoose"), EntityMegaMoose.class, "saber_moose", 4, ExtraCreatures.INSTANCE, 64, 3, true, 0x310C0C, 0xD8C37F);
		
		LootTableList.register(EntityFireWhirl.LOOT);
		LootTableList.register(EntityBombardierBeetle.LOOT);
		LootTableList.register(EntityBeaverDuck.LOOT);
		LootTableList.register(EntityMegaMoose.LOOT);
	}
	public static void initSpawn(){
		Set<Biome> jungle=new HashSet<Biome>(BiomeDictionary.getBiomes(Type.HOT));
		jungle.retainAll(BiomeDictionary.getBiomes(Type.WET));
		jungle.retainAll(BiomeDictionary.getBiomes(Type.JUNGLE));
		jungle.retainAll(BiomeDictionary.getBiomes(Type.DENSE));
		Set<Biome> swamp=new HashSet<Biome>(BiomeDictionary.getBiomes(Type.WET));
		swamp.retainAll(BiomeDictionary.getBiomes(Type.SWAMP));
		Set<Biome> taiga=new HashSet<Biome>(BiomeDictionary.getBiomes(Type.COLD));
		taiga.retainAll(BiomeDictionary.getBiomes(Type.CONIFEROUS));
		taiga.retainAll(BiomeDictionary.getBiomes(Type.FOREST));
		taiga.add(Biomes.MUTATED_REDWOOD_TAIGA);
		taiga.add(Biomes.MUTATED_REDWOOD_TAIGA_HILLS);
		EntityRegistry.addSpawn(EntityFireWhirl.class, Config.fireWhirlWeight, 1, 1, EnumCreatureType.MONSTER, BiomeDictionary.getBiomes(Type.NETHER).toArray(new Biome[0]));
		EntityRegistry.addSpawn(EntityBombardierBeetle.class, Config.bombBeetleWeight, 1, 1, EnumCreatureType.MONSTER, jungle.toArray(new Biome[0]));
		EntityRegistry.addSpawn(EntityBeaverDuck.class, Config.beaverDuckWeight, 1, 4, EnumCreatureType.MONSTER, swamp.toArray(new Biome[0]));
		EntityRegistry.addSpawn(EntityMegaMoose.class, Config.megaMooseTaigaWeight, 1, 1, EnumCreatureType.MONSTER, taiga.toArray(new Biome[0]));
		
	}
	public static void initModel(){
		RenderingRegistry.registerEntityRenderingHandler(EntityFireWhirl.class, RenderFireWhirl.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityBombardierBeetle.class, RenderBombardierBeetle.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityBeaverDuck.class, RenderBeaverDuck.FACTORY);
		RenderingRegistry.registerEntityRenderingHandler(EntityMegaMoose.class, RenderMegaMoose.FACTORY);
	}
}
