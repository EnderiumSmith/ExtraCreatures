package extraCreatures.model;

import extraCreatures.entity.EntityGhastlyBoat;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGhastlyBoat extends RenderLiving<EntityGhastlyBoat>{
	
	public static final Factory FACTORY = new Factory();
	
	public RenderGhastlyBoat(RenderManager rendermanagerIn) {
		super(rendermanagerIn, new ModelGhastlyBoat(), 1F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityGhastlyBoat entity) {
		return new ResourceLocation("minecraft:textures/entity/boat/boat_darkoak.png");
	}
	
	public static class Factory implements IRenderFactory<EntityGhastlyBoat> {

        @Override
        public Render<? super EntityGhastlyBoat> createRenderFor(RenderManager manager) {
            return new RenderGhastlyBoat(manager);
        }

    }
}
