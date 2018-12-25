package extraCreatures.entity;

import java.util.List;

import extraCreatures.ExtraCreatures;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

public class EntityGhastlyBoat extends EntityMob{

	public static final ResourceLocation LOOT=new ResourceLocation(ExtraCreatures.MODID, "entitys/ghastly_boat");
	
	public EntityGhastlyBoat(World worldIn) {
		super(worldIn);
		this.setSize(1.375F, 0.5625F);
		this.setPathPriority(PathNodeType.WATER, 0.0F);
	}
	
	@Override
	protected PathNavigate createNavigator(World worldIn) {
		return new PathNavigateSwimmer(this, worldIn);
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		//this.tasks.addTask(1, new EntityAIGhastlyAttack(this));
		this.tasks.addTask(3, new EntityAIWander(this, 1D));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[] {}));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<>(this, EntityGuardian.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, true));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget<>(this, EntitySquid.class, true));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(100D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.5D);
	}
	
	@Override
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingdata) {
		livingdata=super.onInitialSpawn(difficulty, livingdata);
		if(this.world.rand.nextInt(10)==0){
			EntitySkeleton skeleton=new EntitySkeleton(this.world);
			skeleton.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0F);
			skeleton.onInitialSpawn(difficulty, (IEntityLivingData)null); 
			this.world.spawnEntity(skeleton);
			skeleton.startRiding(this);
		}
		return livingdata;
	}
	
	@Override
	public void onDeath(DamageSource cause) {
		if(cause==DamageSource.ON_FIRE&&this.world.isDaytime()){
			List<Entity> passagers=this.getPassengers();
			for(int i=0;i<passagers.size();i++){
				if(passagers.get(i) instanceof EntitySkeleton){
					passagers.get(i).setDead();
				}
			}
		}
		super.onDeath(cause);
	}
	
	protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_GHAST_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
    {
        return SoundEvents.ENTITY_GHAST_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_GHAST_DEATH;
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
    	return EnumCreatureAttribute.UNDEAD;
    }
    
    @Override
    public void onStruckByLightning(EntityLightningBolt lightningBolt) {
    	this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
    	this.heal(20F);
    }
    
    @Override
    public boolean canBreatheUnderwater() {
    	return true;
    }
    
    @Override
    protected float getWaterSlowDown() {
    	return 1F;
    }
    
    @Override
    protected float getJumpUpwardsMotion() {
    	return super.getJumpUpwardsMotion()/4;
    }
    
    @Override
    public boolean isPushedByWater() {
    	return false;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox() {
    	return this.isEntityAlive() ? this.getEntityBoundingBox() : null;
    }
    
    @Override
    protected void updateAITasks() {
        if (this.world.isDaytime() && !this.world.isRemote)
        {
	        this.attackEntityFrom(DamageSource.ON_FIRE, 1F);
	        this.setFire(8);
        }
    }
    
    @Override
    public void onLivingUpdate() {
    	if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }
    	super.onLivingUpdate();
    }
    
    @Override
    protected ResourceLocation getLootTable() {
    	return EntityGhastlyBoat.LOOT;
    }
    
}
