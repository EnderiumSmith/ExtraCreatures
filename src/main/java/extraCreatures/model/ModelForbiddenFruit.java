package extraCreatures.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelForbiddenFruit extends ModelBase{
	
	public ModelRenderer Base2;
    public ModelRenderer Base1;
    public ModelRenderer PetalLA2;
    public ModelRenderer PetalRA2;
    public ModelRenderer PetalFA2;
    public ModelRenderer PetalBA2;
    public ModelRenderer PetalLB2;
    public ModelRenderer PetalRB2;
    public ModelRenderer PetalFB2;
    public ModelRenderer PetalBB2;
    public ModelRenderer PetalLA;
    public ModelRenderer PetalRA;
    public ModelRenderer PetalFA;
    public ModelRenderer PetalBA;
    public ModelRenderer CoreA;
    public ModelRenderer CoreB;
    public ModelRenderer PetalLB;
    public ModelRenderer PetalRB;
    public ModelRenderer PetalFB;
    public ModelRenderer PetalBB;

    public ModelForbiddenFruit() {
        this.textureWidth = 160;
        this.textureHeight = 32;
        this.PetalBA2 = new ModelRenderer(this, 48, 0);
        this.PetalBA2.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.PetalBA2.addBox(-8.0F, 0.0F, 0.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(PetalBA2, -0.4363323129985824F, 0.0F, 0.0F);
        this.PetalBB = new ModelRenderer(this, 96, 0);
        this.PetalBB.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.PetalBB.addBox(-8.0F, 0.0F, 0.0F, 16, 0, 32, 0.0F);
        this.setRotateAngle(PetalBB, 0.4363323129985824F, 0.0F, 0.0F);
        this.PetalRA2 = new ModelRenderer(this, 48, 0);
        this.PetalRA2.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.PetalRA2.addBox(-16.0F, 0.0F, -8.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(PetalRA2, 0.0F, 0.0F, -0.4363323129985824F);
        this.PetalLB2 = new ModelRenderer(this, 48, 16);
        this.PetalLB2.setRotationPoint(16.0F, 0.0F, 0.0F);
        this.PetalLB2.addBox(0.0F, 0.0F, -8.0F, 32, 0, 16, 0.0F);
        this.setRotateAngle(PetalLB2, 0.0F, 0.0F, -0.4363323129985824F);
        this.PetalRA = new ModelRenderer(this, 48, 0);
        this.PetalRA.setRotationPoint(-8.0F, 0.0F, 0.0F);
        this.PetalRA.addBox(-16.0F, 0.0F, -8.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(PetalRA, 0.0F, 0.0F, -0.4363323129985824F);
        this.PetalFA = new ModelRenderer(this, 48, 0);
        this.PetalFA.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.PetalFA.addBox(-8.0F, 0.0F, -16.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(PetalFA, 0.4363323129985824F, 0.0F, 0.0F);
        this.PetalFB = new ModelRenderer(this, 96, 0);
        this.PetalFB.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.PetalFB.addBox(-8.0F, 0.0F, -32.0F, 16, 0, 32, 0.0F);
        this.setRotateAngle(PetalFB, -0.4363323129985824F, 0.0F, 0.0F);
        this.PetalFB2 = new ModelRenderer(this, 96, 0);
        this.PetalFB2.setRotationPoint(0.0F, 0.0F, -16.0F);
        this.PetalFB2.addBox(-8.0F, 0.0F, -32.0F, 16, 0, 32, 0.0F);
        this.setRotateAngle(PetalFB2, -0.4363323129985824F, 0.0F, 0.0F);
        this.PetalLA = new ModelRenderer(this, 48, 0);
        this.PetalLA.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.PetalLA.addBox(0.0F, 0.0F, -8.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(PetalLA, 0.0F, 0.0F, 0.4363323129985824F);
        this.CoreB = new ModelRenderer(this, 0, 0);
        this.CoreB.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CoreB.addBox(-8.0F, -8.0F, 0.0F, 16, 16, 0, 0.0F);
        this.setRotateAngle(CoreB, 0.0F, -0.7853981633974483F, 0.0F);
        this.PetalRB = new ModelRenderer(this, 48, 16);
        this.PetalRB.setRotationPoint(-16.0F, 0.0F, 0.0F);
        this.PetalRB.addBox(-32.0F, 0.0F, -8.0F, 32, 0, 16, 0.0F);
        this.setRotateAngle(PetalRB, 0.0F, 0.0F, 0.4363323129985824F);
        this.PetalFA2 = new ModelRenderer(this, 48, 0);
        this.PetalFA2.setRotationPoint(0.0F, 0.0F, -8.0F);
        this.PetalFA2.addBox(-8.0F, 0.0F, -16.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(PetalFA2, 0.4363323129985824F, 0.0F, 0.0F);
        this.PetalRB2 = new ModelRenderer(this, 48, 16);
        this.PetalRB2.setRotationPoint(-16.0F, 0.0F, 0.0F);
        this.PetalRB2.addBox(-32.0F, 0.0F, -8.0F, 32, 0, 16, 0.0F);
        this.setRotateAngle(PetalRB2, 0.0F, 0.0F, 0.4363323129985824F);
        this.PetalBA = new ModelRenderer(this, 48, 0);
        this.PetalBA.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.PetalBA.addBox(-8.0F, 0.0F, 0.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(PetalBA, -0.4363323129985824F, 0.0F, 0.0F);
        this.CoreA = new ModelRenderer(this, 0, 0);
        this.CoreA.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.CoreA.addBox(-8.0F, -8.0F, 0.0F, 16, 16, 0, 0.0F);
        this.setRotateAngle(CoreA, 0.0F, 0.7853981633974483F, 0.0F);
        this.Base2 = new ModelRenderer(this, 80, 0);
        this.Base2.setRotationPoint(0.0F, 20.0F, 0.0F);
        this.Base2.addBox(-8.0F, 0.0F, -8.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(Base2, 0.0F, 0.7853981633974483F, 0.0F);
        this.PetalLB = new ModelRenderer(this, 48, 16);
        this.PetalLB.setRotationPoint(16.0F, 0.0F, 0.0F);
        this.PetalLB.addBox(0.0F, 0.0F, -8.0F, 32, 0, 16, 0.0F);
        this.setRotateAngle(PetalLB, 0.0F, 0.0F, -0.4363323129985824F);
        this.PetalBB2 = new ModelRenderer(this, 96, 0);
        this.PetalBB2.setRotationPoint(0.0F, 0.0F, 16.0F);
        this.PetalBB2.addBox(-8.0F, 0.0F, 0.0F, 16, 0, 32, 0.0F);
        this.setRotateAngle(PetalBB2, 0.4363323129985824F, 0.0F, 0.0F);
        this.PetalLA2 = new ModelRenderer(this, 48, 0);
        this.PetalLA2.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.PetalLA2.addBox(0.0F, 0.0F, -8.0F, 16, 0, 16, 0.0F);
        this.setRotateAngle(PetalLA2, 0.0F, 0.0F, 0.4363323129985824F);
        this.Base1 = new ModelRenderer(this, 80, 0);
        this.Base1.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Base1.addBox(-8.0F, 0.0F, -8.0F, 16, 0, 16, 0.0F);
        this.Base2.addChild(this.PetalBA2);
        this.PetalBA.addChild(this.PetalBB);
        this.Base2.addChild(this.PetalRA2);
        this.PetalLA2.addChild(this.PetalLB2);
        this.Base1.addChild(this.PetalRA);
        this.Base1.addChild(this.PetalFA);
        this.PetalFA.addChild(this.PetalFB);
        this.PetalFA2.addChild(this.PetalFB2);
        this.Base1.addChild(this.PetalLA);
        this.Base1.addChild(this.CoreB);
        this.PetalRA.addChild(this.PetalRB);
        this.Base2.addChild(this.PetalFA2);
        this.PetalRA2.addChild(this.PetalRB2);
        this.Base1.addChild(this.PetalBA);
        this.Base1.addChild(this.CoreA);
        this.PetalLA.addChild(this.PetalLB);
        this.PetalBA2.addChild(this.PetalBB2);
        this.Base2.addChild(this.PetalLA2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Base2.render(f5);
        this.Base1.render(f5);
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
