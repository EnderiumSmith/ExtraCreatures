package extraCreatures.core;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class FartEventHandler {
	
	@SubscribeEvent
	public void onEntityUpdate(LivingUpdateEvent event){
		if(event.getEntityLiving() instanceof EntityPig){
			//fart every 1 minute. vary the time between each pig.
			if(event.getEntityLiving().ticksExisted%1200==0){
				if(event.getEntityLiving().isBurning()||event.getEntityLiving().world.getBlockState(event.getEntityLiving().getPosition()).getBlock()==Blocks.TORCH){
					if(!event.getEntityLiving().world.isRemote){
						event.getEntityLiving().motionY+=2D;
						event.getEntityLiving().addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 100, 5));
						event.getEntityLiving().world.newExplosion(event.getEntityLiving(), event.getEntityLiving().posX, event.getEntityLiving().posY, event.getEntityLiving().posZ, 3, true, false);
						List<EntityLivingBase> list=event.getEntityLiving().world.getEntitiesWithinAABB(EntityLivingBase.class, new AxisAlignedBB(event.getEntityLiving().posX-5, event.getEntityLiving().posY-5, event.getEntityLiving().posZ-5, event.getEntityLiving().posX+5, event.getEntityLiving().posY+5, event.getEntityLiving().posZ+5));
						for(EntityLivingBase entity:list){
							entity.setFire(200);
						}
					}else
						for(int x=-5;x<=5;x++){
							for(int y=-5;y<=5;y++){
								for(int z=-5;z<=5;z++){
									event.getEntityLiving().world.spawnParticle(EnumParticleTypes.FLAME, event.getEntityLiving().posX+x, event.getEntityLiving().posY+y, event.getEntityLiving().posZ+z, 0.0D, 0.1D, 0.0D, new int[0]);
								}
							}
						}
				}else{
					if(!event.getEntityLiving().world.isRemote){
						event.getEntityLiving().motionY+=2D;
						event.getEntityLiving().addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 100, 5));
						event.getEntityLiving().world.playSound(null, event.getEntityLiving().getPosition(), SoundEvents.ENTITY_GHAST_DEATH, SoundCategory.MASTER, 1F, 1F);
						List<EntityLivingBase> list=event.getEntityLiving().world.getEntitiesWithinAABB(EntityLivingBase.class, new AxisAlignedBB(event.getEntityLiving().posX-5, event.getEntityLiving().posY-5, event.getEntityLiving().posZ-5, event.getEntityLiving().posX+5, event.getEntityLiving().posY+5, event.getEntityLiving().posZ+5));
						for(EntityLivingBase entity:list){
							if(!(entity instanceof EntityPig)){
								entity.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 600));
								entity.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 200));
								entity.addPotionEffect(new PotionEffect(MobEffects.POISON, 40));
							}
						}
					}else
						for(int x=-5;x<=5;x++){
							for(int y=-5;y<=5;y++){
								for(int z=-5;z<=5;z++){
									event.getEntityLiving().world.spawnParticle(EnumParticleTypes.SLIME, event.getEntityLiving().posX+x, event.getEntityLiving().posY+y, event.getEntityLiving().posZ+z, 0.0D, 0.1D, 0.0D, new int[0]);
								}
							}
						}
				}
			}
		}
	}
	
}
