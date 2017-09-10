package extraCreatures.entity;

import extraCreatures.ExtraCreatures;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityMegaMoose extends EntityCreatureWithAttack{

	public static final ResourceLocation LOOT=new ResourceLocation(ExtraCreatures.MODID, "/entitys/mega_moose");
	
	public EntityMegaMoose(World worldIn) {
		super(worldIn);
		this.setSize(1.9F, 2.9F);
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackMelee(this, 1F, false));
		this.tasks.addTask(3, new EntityAIEatGrass(this));
		this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 0.8D));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8F));
		this.tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true, new Class[0]));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(7D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1D);
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(80D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
	}
	
	protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_COW_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
    {
        return SoundEvents.ENTITY_COW_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_COW_DEATH;
    }
    
    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_COW_STEP, 0.15F, 1.0F);
    }
    
    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
    	boolean flag=super.attackEntityAsMob(entityIn);
    	if(flag){
    		if (entityIn instanceof EntityLivingBase)
            {
                int i = 0;

                if (this.world.getDifficulty() == EnumDifficulty.NORMAL)
                {
                    i = 7;
                }
                else if (this.world.getDifficulty() == EnumDifficulty.HARD)
                {
                    i = 15;
                }

                if (i > 0)
                {
                    ((EntityLivingBase)entityIn).addPotionEffect(new PotionEffect(MobEffects.POISON, i * 20, 0));
                }
            }
    	}
    	return flag;
    }
    
    @Override
    protected boolean canDespawn() {
    	return this.ticksExisted>2400;
    }
    
    @Override
    protected void collideWithEntity(Entity entityIn) {
    	super.collideWithEntity(entityIn);
    	if(entityIn instanceof EntityLivingBase&&this.getAttackTarget()==null&&!(entityIn instanceof EntityMegaMoose)){
    		this.setAttackTarget((EntityLivingBase)entityIn);
    	}
    }
    
    @Override
    public void eatGrassBonus() {
    	this.heal(2F);
    }
    
    @Override
    protected ResourceLocation getLootTable() {
    	return EntityMegaMoose.LOOT;
    }
    
    @Override
    public void fall(float distance, float damageMultiplier) {
    	super.fall(distance, damageMultiplier*4);
    }

}
