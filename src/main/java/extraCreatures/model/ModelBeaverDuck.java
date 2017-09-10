package extraCreatures.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBeaverDuck extends ModelBase{
	
	public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer Head;
    public ModelRenderer LegLF;
    public ModelRenderer LegLB;
    public ModelRenderer LegRF;
    public ModelRenderer LegRB;
    public ModelRenderer Beak;
    public ModelRenderer FeetLF;
    public ModelRenderer FeetLB;
    public ModelRenderer FeetRF;
    public ModelRenderer FeetRB;

    public ModelBeaverDuck() {
    	this.textureWidth = 64;
        this.textureHeight = 64;
        this.FeetRB = new ModelRenderer(this, 0, 0);
        this.FeetRB.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.FeetRB.addBox(-2.0F, 0.0F, -3.0F, 4, 0, 4, 0.0F);
        this.FeetLB = new ModelRenderer(this, 0, 0);
        this.FeetLB.setRotationPoint(-2.0F, 7.0F, 0.0F);
        this.FeetLB.addBox(0.0F, -2.0F, -3.0F, 4, 0, 4, 0.0F);
        this.LegRB = new ModelRenderer(this, 36, 0);
        this.LegRB.setRotationPoint(-5.0F, 2.0F, 6.0F);
        this.LegRB.addBox(-1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F);
        this.Beak = new ModelRenderer(this, 32, 24);
        this.Beak.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.Beak.addBox(-3.0F, 0.0F, -4.0F, 6, 1, 8, 0.0F);
        this.LegLB = new ModelRenderer(this, 36, 0);
        this.LegLB.setRotationPoint(5.0F, 2.0F, 6.0F);
        this.LegLB.addBox(-1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F);
        this.LegRF = new ModelRenderer(this, 36, 0);
        this.LegRF.setRotationPoint(-5.0F, 2.0F, -6.0F);
        this.LegRF.addBox(-1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F);
        this.Head = new ModelRenderer(this, 0, 24);
        this.Head.setRotationPoint(0.0F, -1.0F, -10.0F);
        this.Head.addBox(-4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Body.addBox(-5.0F, -4.0F, -8.0F, 10, 8, 16, 0.0F);
        this.Tail = new ModelRenderer(this, 0, 40);
        this.Tail.setRotationPoint(0.0F, 1.0F, 13.0F);
        this.Tail.addBox(-4.0F, 0.0F, -5.0F, 8, 1, 10, 0.0F);
        this.FeetLF = new ModelRenderer(this, 0, 0);
        this.FeetLF.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.FeetLF.addBox(0.0F, 0.0F, -3.0F, 4, 0, 4, 0.0F);
        this.LegLF = new ModelRenderer(this, 36, 0);
        this.LegLF.setRotationPoint(5.0F, 2.0F, -6.0F);
        this.LegLF.addBox(-1.0F, -1.0F, -1.0F, 2, 6, 2, 0.0F);
        this.FeetRF = new ModelRenderer(this, 0, 0);
        this.FeetRF.setRotationPoint(-2.0F, 5.0F, 0.0F);
        this.FeetRF.addBox(0.0F, 0.0F, -3.0F, 4, 0, 4, 0.0F);
        this.LegRB.addChild(this.FeetRB);
        this.LegLB.addChild(this.FeetLB);
        this.Body.addChild(this.LegRB);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.LegLB);
        this.Body.addChild(this.LegRF);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.Tail);
        this.LegLF.addChild(this.FeetLF);
        this.Body.addChild(this.LegLF);
        this.LegRF.addChild(this.FeetRF);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) {
    	this.Head.rotateAngleY=netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX=headPitch * 0.017453292F;
    	this.LegRF.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LegLF.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LegRB.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LegLB.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
