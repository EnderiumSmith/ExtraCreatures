package extraCreatures.model;

import extraCreatures.ExtraCreatures;
import extraCreatures.entity.EntityBombardierBeetle;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBombardierBeetle extends RenderLiving<EntityBombardierBeetle>{

	public static final Factory FACTORY = new Factory();
	
	public RenderBombardierBeetle(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelBombardierBeetle(), 1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBombardierBeetle entity) {
		return new ResourceLocation(ExtraCreatures.MODID, "textures/entity/bombardier_beetle.png");
	}
	
	public static class Factory implements IRenderFactory<EntityBombardierBeetle> {

        @Override
        public Render<? super EntityBombardierBeetle> createRenderFor(RenderManager manager) {
            return new RenderBombardierBeetle(manager);
        }

    }

	
}
