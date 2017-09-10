package extraCreatures.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelBombardierBeetle extends ModelBase{
	
	public ModelRenderer Thorax;
    public ModelRenderer LegL3;
    public ModelRenderer LegL1;
    public ModelRenderer Head;
    public ModelRenderer LegR3;
    public ModelRenderer LegR2;
    public ModelRenderer LegR1;
    public ModelRenderer LegL2;
    public ModelRenderer Jaw;
    public ModelRenderer ButtL;
    public ModelRenderer ButtR;
    public ModelRenderer Abdomen;

    public ModelBombardierBeetle() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Abdomen = new ModelRenderer(this, 0, 12);
        this.Abdomen.setRotationPoint(0.0F, 15.0F, 9.0F);
        this.Abdomen.addBox(-5.0F, -4.0F, -6.0F, 10, 8, 12, 0.0F);
        this.LegR3 = new ModelRenderer(this, 18, 0);
        this.LegR3.setRotationPoint(4.0F, 15.0F, 2.0F);
        this.LegR3.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.Thorax = new ModelRenderer(this, 0, 0);
        this.Thorax.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Thorax.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6, 0.0F);
        this.LegL1 = new ModelRenderer(this, 18, 0);
        this.LegL1.setRotationPoint(-4.0F, 15.0F, -1.0F);
        this.LegL1.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.LegR1 = new ModelRenderer(this, 18, 0);
        this.LegR1.setRotationPoint(4.0F, 15.0F, -1.0F);
        this.LegR1.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.Jaw = new ModelRenderer(this, 42, 20);
        this.Jaw.setRotationPoint(0.0F, 3.0F, -8.0F);
        this.Jaw.addBox(-3.0F, 0.0F, -4.0F, 6, 0, 4, 0.0F);
        this.LegL2 = new ModelRenderer(this, 18, 0);
        this.LegL2.setRotationPoint(-4.0F, 15.0F, 1.0F);
        this.LegL2.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.Head = new ModelRenderer(this, 32, 4);
        this.Head.setRotationPoint(0.0F, 15.0F, -3.0F);
        this.Head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
        this.Head.addChild(this.Jaw);
        this.ButtL = new ModelRenderer(this, 46, 24);
        this.ButtL.setRotationPoint(-2.0F, 16.0F, 15.0F);
        this.ButtL.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.LegR2 = new ModelRenderer(this, 18, 0);
        this.LegR2.setRotationPoint(4.0F, 15.0F, 1.0F);
        this.LegR2.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.ButtR = new ModelRenderer(this, 46, 24);
        this.ButtR.setRotationPoint(1.0F, 16.0F, 15.0F);
        this.ButtR.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.LegL3 = new ModelRenderer(this, 18, 0);
        this.LegL3.setRotationPoint(-4.0F, 15.0F, 2.0F);
        this.LegL3.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.Thorax.render(scale);
        this.Head.render(scale);
        this.Abdomen.render(scale);
        this.ButtL.render(scale);
        this.ButtR.render(scale);
        this.LegL1.render(scale);
        this.LegL2.render(scale);
        this.LegL3.render(scale);
        this.LegR1.render(scale);
        this.LegR2.render(scale);
        this.LegR3.render(scale);
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) {
    	this.Head.rotateAngleY=netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX=headPitch * 0.017453292F;
    	float f = ((float)Math.PI / 4F);
    	float f2= 0.58119464F;
    	this.LegR1.rotateAngleZ=f;
    	this.LegL1.rotateAngleZ=-f;
    	this.LegR2.rotateAngleZ=f2;
    	this.LegL2.rotateAngleZ=-f2;
    	this.LegR3.rotateAngleZ=f;
    	this.LegL3.rotateAngleZ=-f;
    	f2=0.3926991F;
    	this.LegR1.rotateAngleY=f;
    	this.LegL1.rotateAngleY=-f;
    	this.LegR2.rotateAngleY=-f2;
    	this.LegL2.rotateAngleY=f2;
    	this.LegR3.rotateAngleY=-f;
    	this.LegL3.rotateAngleY=f;
    	float f3 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbSwingAmount;
        //float f4 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * limbSwingAmount;
        float f5 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * limbSwingAmount;
        float f6 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
        float f7 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + 0.0F) * 0.4F) * limbSwingAmount;
        //float f8 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + (float)Math.PI) * 0.4F) * limbSwingAmount;
        float f9 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * limbSwingAmount;
        float f10 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;
        this.LegR1.rotateAngleY += f3;
        this.LegL1.rotateAngleY += -f3;
        this.LegR2.rotateAngleY += f5;
        this.LegL2.rotateAngleY += -f5;
        this.LegR3.rotateAngleY += f6;
        this.LegL3.rotateAngleY += -f6;
        this.LegR1.rotateAngleZ += f7;
        this.LegL1.rotateAngleZ += -f7;
        this.LegR2.rotateAngleZ += f9;
        this.LegL2.rotateAngleZ += -f9;
        this.LegR3.rotateAngleZ += f10;
        this.LegL3.rotateAngleZ += -f10;
    	
    }
}
