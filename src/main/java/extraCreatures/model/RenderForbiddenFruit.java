package extraCreatures.model;

import org.lwjgl.opengl.GL11;

import extraCreatures.ExtraCreatures;
import extraCreatures.entity.EntityForbiddenFruit;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderForbiddenFruit extends RenderLiving<EntityForbiddenFruit>{
	
public static final Factory FACTORY = new Factory();
	
	public RenderForbiddenFruit(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelForbiddenFruit(), 1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityForbiddenFruit entity) {
		return new ResourceLocation(ExtraCreatures.MODID, "textures/entity/forbidden_fruit.png");
	}
	
	@Override
	protected void preRenderCallback(EntityForbiddenFruit entitylivingbaseIn, float partialTickTime) {
		GL11.glTranslatef(0F, -0.2F, 0F);
	}
	
	public static class Factory implements IRenderFactory<EntityForbiddenFruit> {

        @Override
        public Render<? super EntityForbiddenFruit> createRenderFor(RenderManager manager) {
            return new RenderForbiddenFruit(manager);
        }

    }
	
}
