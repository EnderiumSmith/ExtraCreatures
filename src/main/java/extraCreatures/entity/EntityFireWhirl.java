package extraCreatures.entity;

import extraCreatures.ExtraCreatures;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWanderAvoidWater;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class EntityFireWhirl extends EntityMob{

	public static final ResourceLocation LOOT=new ResourceLocation(ExtraCreatures.MODID, "entitys/fire_whirl");
	
	public EntityFireWhirl(World worldIn) {
		super(worldIn);
		this.setSize(0.5F, 1);
		this.setPathPriority(PathNodeType.WATER, -1.0F);
        this.setPathPriority(PathNodeType.LAVA, 8.0F);
        this.setPathPriority(PathNodeType.DANGER_FIRE, 0.0F);
        this.setPathPriority(PathNodeType.DAMAGE_FIRE, 0.0F);
        this.isImmuneToFire = true;
        this.experienceValue = 10;
	}
	
	@Override
	protected void initEntityAI() {
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(4, new EntityAIAttackMelee(this, 1, false));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1));
		this.tasks.addTask(7, new EntityAIWanderAvoidWater(this, 1, 0));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
		this.targetTasks.addTask(2, new EntityAIFireWhirlTarget<>(this, EntityLivingBase.class, false));
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(6.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.23000000417232513D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(16.0D);
        this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(16.0D);
	}
	
	protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_BLAZE_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_184601_1_)
    {
        return SoundEvents.ENTITY_BLAZE_HURT;
    }

    protected SoundEvent getDeathSound()
    {
        return SoundEvents.ENTITY_BLAZE_DEATH;
    }
    
    @Override
    public void onLivingUpdate() {
    	if(this.world.isRemote){
    		for(int i=0;i<10;i++){
    			this.world.spawnParticle(EnumParticleTypes.FLAME, this.posX + (this.rand.nextDouble() - 0.5D), this.posY + this.rand.nextDouble() * 3, this.posZ + (this.rand.nextDouble() - 0.5D), 0.0D, 0.05D, 0.0D);
    		}
    		if (this.rand.nextInt(24) == 0 && !this.isSilent())
            {
                this.world.playSound(this.posX + 0.5D, this.posY + 0.5D, this.posZ + 0.5D, SoundEvents.ENTITY_BLAZE_BURN, this.getSoundCategory(), 1.0F + this.rand.nextFloat(), this.rand.nextFloat() * 0.7F + 0.3F, false);
            }
    	}
    	//slow fall
    	if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }
    	super.onLivingUpdate();
    }
    
    @Override
    protected void updateAITasks() {
    	if (this.isWet())
        {
            this.attackEntityFrom(DamageSource.DROWN, 1.0F);
        }
    }
    
    @Override
    protected void damageEntity(DamageSource damageSrc, float damageAmount) {
    	//only take magic and water damage
    	if(damageSrc==DamageSource.DROWN || damageSrc.isMagicDamage() || damageSrc.isExplosion())
    		super.damageEntity(damageSrc, damageAmount);
    }
    
    @Override
    public boolean attackEntityAsMob(Entity entityIn) {
    	float f = (float)this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).getAttributeValue();
        int i = 0;

        if (entityIn instanceof EntityLivingBase)
        {
            f += EnchantmentHelper.getModifierForCreature(this.getHeldItemMainhand(), ((EntityLivingBase)entityIn).getCreatureAttribute());
            i += EnchantmentHelper.getKnockbackModifier(this);
        }

        boolean flag;
        
        if(entityIn instanceof EntityLivingBase){
        	if(((EntityLivingBase)entityIn).getActivePotionEffect(MobEffects.FIRE_RESISTANCE)==null){
        		flag=entityIn.attackEntityFrom(DamageSource.causeMobDamage(this).setFireDamage(), f);
        	}else
        		flag=false;
        }else{
        	flag=entityIn.attackEntityFrom(DamageSource.causeMobDamage(this).setFireDamage(), f);
        }

        if (flag)
        {
            if (entityIn instanceof EntityLivingBase)
            {
                ((EntityLivingBase)entityIn).knockBack(this, (float)i * 0.5F, (double)MathHelper.sin(this.rotationYaw * 0.017453292F), (double)(-MathHelper.cos(this.rotationYaw * 0.017453292F)));
                ((EntityLivingBase)entityIn).motionY+=0.6D;
                this.motionX *= 0.6D;
                this.motionZ *= 0.6D;
            }

            int j = EnchantmentHelper.getFireAspectModifier(this);

            entityIn.setFire(8+j*4);

            if (entityIn instanceof EntityPlayer)
            {
                EntityPlayer entityplayer = (EntityPlayer)entityIn;
                ItemStack itemstack = this.getHeldItemMainhand();
                ItemStack itemstack1 = entityplayer.isHandActive() ? entityplayer.getActiveItemStack() : ItemStack.EMPTY;

                if (!itemstack.isEmpty() && !itemstack1.isEmpty() && itemstack.getItem().canDisableShield(itemstack, itemstack1, entityplayer, this) && itemstack1.getItem().isShield(itemstack1, entityplayer))
                {
                    float f1 = 0.25F + (float)EnchantmentHelper.getEfficiencyModifier(this) * 0.05F;

                    if (this.rand.nextFloat() < f1)
                    {
                        entityplayer.getCooldownTracker().setCooldown(itemstack1.getItem(), 100);
                        this.world.setEntityState(entityplayer, (byte)30);
                    }
                }
            }

            this.applyEnchantments(this, entityIn);
        }

        return flag;
    }
    
    @Override
    protected void collideWithEntity(Entity entityIn) {
    	super.collideWithEntity(entityIn);
    	entityIn.setFire(5);
    }
    
    @Override
    public void fall(float distance, float damageMultiplier) {
    	
    }
    
    @Override
    public void onDeath(DamageSource cause) {
    	BlockPos blockpos = new BlockPos(this);
    	if (world.getBlockState(blockpos).getMaterial() == Material.AIR && Blocks.FIRE.canPlaceBlockAt(world, blockpos))
        {
            world.setBlockState(blockpos, Blocks.FIRE.getDefaultState());
        }
    	super.onDeath(cause);
    }
    
    public class EntityAIFireWhirlTarget<T extends EntityLivingBase> extends EntityAINearestAttackableTarget<EntityLivingBase>{

		public EntityAIFireWhirlTarget(EntityCreature creature, Class<EntityLivingBase> classTarget,
				boolean checkSight) {
			super(creature, classTarget, checkSight);
			// TODO Auto-generated constructor stub
		}
		@Override
		protected boolean isSuitableTarget(EntityLivingBase target, boolean includeInvincibles) {
			return (!target.isImmuneToFire()&&target.getActivePotionEffect(MobEffects.FIRE_RESISTANCE)==null&&super.isSuitableTarget(target, includeInvincibles));
		}
    	
    }
	@Override
    protected ResourceLocation getLootTable() {
    	return EntityFireWhirl.LOOT;
    }

}
