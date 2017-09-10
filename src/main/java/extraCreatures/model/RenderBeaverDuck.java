package extraCreatures.model;

import extraCreatures.ExtraCreatures;
import extraCreatures.entity.EntityBeaverDuck;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBeaverDuck extends RenderLiving<EntityBeaverDuck>{

	public static final Factory FACTORY = new Factory();
	
	public RenderBeaverDuck(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelBeaverDuck(), 1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBeaverDuck entity) {
		return new ResourceLocation(ExtraCreatures.MODID, "textures/entity/beaver_duck.png");
	}
	
	public static class Factory implements IRenderFactory<EntityBeaverDuck> {

        @Override
        public Render<? super EntityBeaverDuck> createRenderFor(RenderManager manager) {
            return new RenderBeaverDuck(manager);
        }

    }

}
