package extraCreatures.model;

import extraCreatures.entity.EntityFireWhirl;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFireWhirl extends RenderLiving<EntityFireWhirl> {

    public static final Factory FACTORY = new Factory();

    public RenderFireWhirl(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelEmpty(), 0F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityFireWhirl entity) {
        return null;
    }

    public static class Factory implements IRenderFactory<EntityFireWhirl> {

        @Override
        public Render<? super EntityFireWhirl> createRenderFor(RenderManager manager) {
            return new RenderFireWhirl(manager);
        }

    }

}
