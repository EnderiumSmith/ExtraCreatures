package extraCreatures.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntitySpectralFireball extends EntitySmallFireball{

	public EntitySpectralFireball(World worldIn, EntityLivingBase shooter, double accelX, double accelY,
			double accelZ) {
		super(worldIn, shooter, accelX, accelY, accelZ);
	}
	
	@Override
	protected void onImpact(RayTraceResult result) {
		if (!this.world.isRemote)
        {
            if (result.entityHit != null&&!(result.entityHit instanceof EntityGhastlyBoat))
            {
		        boolean flag = result.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 5.0F);
		        if (flag)
		        {
			        this.applyEnchantments(this.shootingEntity, result.entityHit);
			        if(result.entityHit instanceof EntityLivingBase){
			        	((EntityLivingBase)result.entityHit).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 20));
			        	((EntityLivingBase)result.entityHit).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 5*20));
			        }
		        }
            }
            
            this.setDead();
        }
	}
	
	@Override
	protected boolean isFireballFiery() {
		return false;
	}
	
	@Override
	protected EnumParticleTypes getParticleType() {
		return EnumParticleTypes.SLIME;
	}

}
