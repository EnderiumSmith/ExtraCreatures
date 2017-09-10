package extraCreatures.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelMegaMoose extends ModelBase{
	
	public ModelRenderer Body;
    public ModelRenderer LegLB1;
    public ModelRenderer LegRB1;
    public ModelRenderer LegRF1;
    public ModelRenderer LegLF1;
    public ModelRenderer Neck;
    public ModelRenderer LegLB2;
    public ModelRenderer LegLBHoove;
    public ModelRenderer LegRB2;
    public ModelRenderer LegRBHoove;
    public ModelRenderer LegRF2;
    public ModelRenderer LegRFHoove;
    public ModelRenderer LegLF2;
    public ModelRenderer LegLFHoove;
    public ModelRenderer Head;
    public ModelRenderer Fang;
    public ModelRenderer HornL1;
    public ModelRenderer HornR1;
    public ModelRenderer HornL2;
    public ModelRenderer HornL3;
    public ModelRenderer HornL4;
    public ModelRenderer HornL5;
    public ModelRenderer HornL6;
    public ModelRenderer HornL7;
    public ModelRenderer HornL8;
    public ModelRenderer HornL2_1;
    public ModelRenderer HornL3_1;
    public ModelRenderer HornL4_1;
    public ModelRenderer HornL5_1;
    public ModelRenderer HornL6_1;
    public ModelRenderer HornL7_1;
    public ModelRenderer HornL8_1;

    public ModelMegaMoose() {
    	this.textureWidth = 128;
        this.textureHeight = 64;
        this.HornL2 = new ModelRenderer(this, 58, 31);
        this.HornL2.setRotationPoint(7.0F, 0.0F, 0.0F);
        this.HornL2.addBox(-2.5F, -0.5F, 0.0F, 5, 1, 10, 0.0F);
        this.setRotateAngle(HornL2, 0.4363323129985824F, 0.17453292519943295F, -0.08726646259971647F);
        this.HornL8 = new ModelRenderer(this, 0, 34);
        this.HornL8.setRotationPoint(2.0F, 0.0F, 5.0F);
        this.HornL8.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(HornL8, 0.0F, 1.0471975511965976F, -0.4363323129985824F);
        this.LegLB1 = new ModelRenderer(this, 0, 0);
        this.LegLB1.setRotationPoint(4.0F, 0.0F, 9.0F);
        this.LegLB1.addBox(-2.0F, 0.0F, -2.5F, 4, 9, 5, 0.0F);
        this.LegRB1 = new ModelRenderer(this, 44, 0);
        this.LegRB1.setRotationPoint(-4.0F, 0.0F, 9.0F);
        this.LegRB1.addBox(-2.0F, 0.0F, -2.5F, 4, 9, 5, 0.0F);
        this.HornL1 = new ModelRenderer(this, 102, 22);
        this.HornL1.setRotationPoint(1.0F, -2.0F, 1.0F);
        this.HornL1.addBox(0.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F);
        this.LegRF1 = new ModelRenderer(this, 62, 0);
        this.LegRF1.setRotationPoint(-4.0F, 0.0F, -9.0F);
        this.LegRF1.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.HornL2_1 = new ModelRenderer(this, 2, 34);
        this.HornL2_1.setRotationPoint(-7.0F, 0.0F, 0.0F);
        this.HornL2_1.addBox(-2.5F, -0.5F, 0.0F, 5, 1, 10, 0.0F);
        this.setRotateAngle(HornL2_1, 0.4363323129985824F, -0.17453292519943295F, 0.08726646259971647F);
        this.HornL7_1 = new ModelRenderer(this, 42, 34);
        this.HornL7_1.setRotationPoint(-2.0F, 0.0F, 9.0F);
        this.HornL7_1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(HornL7_1, 0.2617993877991494F, -0.7853981633974483F, 0.3490658503988659F);
        this.LegRB2 = new ModelRenderer(this, 114, 10);
        this.LegRB2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.LegRB2.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.HornL4_1 = new ModelRenderer(this, 109, 33);
        this.HornL4_1.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.HornL4_1.addBox(-6.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F);
        this.setRotateAngle(HornL4_1, 0.0F, -0.7853981633974483F, 0.4363323129985824F);
        this.LegRF2 = new ModelRenderer(this, 68, 19);
        this.LegRF2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.LegRF2.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.HornR1 = new ModelRenderer(this, 102, 26);
        this.HornR1.setRotationPoint(-1.0F, -2.0F, 1.0F);
        this.HornR1.addBox(-6.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F);
        this.HornL6_1 = new ModelRenderer(this, 30, 34);
        this.HornL6_1.setRotationPoint(2.0F, 0.0F, 10.0F);
        this.HornL6_1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(HornL6_1, 0.4363323129985824F, 0.0F, 0.0F);
        this.HornL7 = new ModelRenderer(this, 102, 30);
        this.HornL7.setRotationPoint(2.0F, 0.0F, 9.0F);
        this.HornL7.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(HornL7, 0.2617993877991494F, 0.7853981633974483F, -0.3490658503988659F);
        this.HornL3_1 = new ModelRenderer(this, 109, 31);
        this.HornL3_1.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.HornL3_1.addBox(-8.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.setRotateAngle(HornL3_1, 0.0F, -0.17453292519943295F, 0.0F);
        this.Fang = new ModelRenderer(this, 0, 0);
        this.Fang.setRotationPoint(0.0F, 5.0F, -10.0F);
        this.Fang.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 0, 0.0F);
        this.LegLB2 = new ModelRenderer(this, 114, 0);
        this.LegLB2.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.LegLB2.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.HornL5_1 = new ModelRenderer(this, 22, 34);
        this.HornL5_1.setRotationPoint(-6.0F, 0.0F, 0.0F);
        this.HornL5_1.addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(HornL5_1, -0.7853981633974483F, 0.0F, 0.0F);
        this.LegLFHoove = new ModelRenderer(this, 44, 15);
        this.LegLFHoove.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.LegLFHoove.addBox(-2.0F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
        this.HornL5 = new ModelRenderer(this, 112, 24);
        this.HornL5.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.HornL5.addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F);
        this.setRotateAngle(HornL5, -0.7853981633974483F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 78, 22);
        this.Head.setRotationPoint(0.0F, -7.0F, 2.5F);
        this.Head.addBox(-2.5F, -2.5F, -10.0F, 5, 5, 14, 0.0F);
        this.LegLBHoove = new ModelRenderer(this, 58, 12);
        this.LegLBHoove.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegLBHoove.addBox(-2.0F, 7.0F, -2.0F, 4, 3, 4, 0.0F);
        this.Neck = new ModelRenderer(this, 90, 0);
        this.Neck.setRotationPoint(0.0F, -5.0F, -12.0F);
        this.Neck.addBox(-2.0F, -9.0F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(Neck, 0.6108652381980153F, 0.0F, 0.0F);
        this.LegLF1 = new ModelRenderer(this, 76, 0);
        this.LegLF1.setRotationPoint(4.0F, 0.0F, -9.0F);
        this.LegLF1.addBox(-1.5F, 0.0F, -2.0F, 3, 8, 4, 0.0F);
        this.HornL6 = new ModelRenderer(this, 78, 30);
        this.HornL6.setRotationPoint(-2.0F, 0.0F, 10.0F);
        this.HornL6.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(HornL6, 0.4363323129985824F, 0.0F, 0.0F);
        this.LegRFHoove = new ModelRenderer(this, 0, 14);
        this.LegRFHoove.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.LegRFHoove.addBox(-2.0F, 0.0F, -2.0F, 4, 3, 4, 0.0F);
        this.HornL8_1 = new ModelRenderer(this, 54, 34);
        this.HornL8_1.setRotationPoint(-2.0F, 0.0F, 5.0F);
        this.HornL8_1.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 5, 0.0F);
        this.setRotateAngle(HornL8_1, 0.0F, -1.0471975511965976F, 0.4363323129985824F);
        this.LegRBHoove = new ModelRenderer(this, 74, 12);
        this.LegRBHoove.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LegRBHoove.addBox(-2.0F, 7.0F, -2.0F, 4, 3, 4, 0.0F);
        this.HornL3 = new ModelRenderer(this, 0, 21);
        this.HornL3.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.HornL3.addBox(0.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F);
        this.setRotateAngle(HornL3, 0.0F, 0.17453292519943295F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.Body.addBox(-5.0F, -5.0F, -12.0F, 10, 10, 24, 0.0F);
        this.LegLF2 = new ModelRenderer(this, 80, 19);
        this.LegLF2.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.LegLF2.addBox(-1.5F, 0.0F, -1.5F, 3, 8, 3, 0.0F);
        this.HornL4 = new ModelRenderer(this, 44, 22);
        this.HornL4.setRotationPoint(6.0F, 0.0F, 0.0F);
        this.HornL4.addBox(0.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F);
        this.setRotateAngle(HornL4, 0.0F, 0.7853981633974483F, -0.4363323129985824F);
        this.HornL1.addChild(this.HornL2);
        this.HornL2.addChild(this.HornL8);
        this.Body.addChild(this.LegLB1);
        this.Body.addChild(this.LegRB1);
        this.Head.addChild(this.HornL1);
        this.Body.addChild(this.LegRF1);
        this.HornR1.addChild(this.HornL2_1);
        this.HornL2_1.addChild(this.HornL7_1);
        this.LegRB1.addChild(this.LegRB2);
        this.HornR1.addChild(this.HornL4_1);
        this.LegRF1.addChild(this.LegRF2);
        this.Head.addChild(this.HornR1);
        this.HornL2_1.addChild(this.HornL6_1);
        this.HornL2.addChild(this.HornL7);
        this.HornR1.addChild(this.HornL3_1);
        this.Head.addChild(this.Fang);
        this.LegLB1.addChild(this.LegLB2);
        this.HornR1.addChild(this.HornL5_1);
        this.LegLF2.addChild(this.LegLFHoove);
        this.HornL1.addChild(this.HornL5);
        this.Neck.addChild(this.Head);
        this.LegLB2.addChild(this.LegLBHoove);
        this.Body.addChild(this.Neck);
        this.Body.addChild(this.LegLF1);
        this.HornL2.addChild(this.HornL6);
        this.LegRF2.addChild(this.LegRFHoove);
        this.HornL2_1.addChild(this.HornL8_1);
        this.LegRB2.addChild(this.LegRBHoove);
        this.HornL1.addChild(this.HornL3);
        this.LegLF1.addChild(this.LegLF2);
        this.HornL1.addChild(this.HornL4);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
    		float headPitch, float scaleFactor, Entity entityIn) {
    	this.Neck.rotateAngleY=netHeadYaw * 0.017453292F;
    	this.Neck.rotateAngleX=headPitch * 0.017453292F + 0.6108652381980153F;
    	this.LegRF1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.LegLF1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LegRB1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.LegLB1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
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
