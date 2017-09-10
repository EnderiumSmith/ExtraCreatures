package extraCreatures.model;

import org.lwjgl.opengl.GL11;

import extraCreatures.ExtraCreatures;
import extraCreatures.entity.EntityMegaMoose;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderMegaMoose extends RenderLiving<EntityMegaMoose>{

	public static final Factory FACTORY = new Factory();
	
	public RenderMegaMoose(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelMegaMoose(), 1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityMegaMoose entity) {
		return new ResourceLocation(ExtraCreatures.MODID, "textures/entity/mega_moose.png");
	}
	
	@Override
	protected void preRenderCallback(EntityMegaMoose entitylivingbaseIn, float partialTickTime) {
		GL11.glScalef(1.4F, 1.4F, 1.4F);
	}
	
	public static class Factory implements IRenderFactory<EntityMegaMoose> {

        @Override
        public Render<? super EntityMegaMoose> createRenderFor(RenderManager manager) {
            return new RenderMegaMoose(manager);
        }

    }

}
