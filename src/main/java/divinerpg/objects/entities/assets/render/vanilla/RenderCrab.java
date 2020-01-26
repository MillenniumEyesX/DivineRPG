package divinerpg.objects.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vanilla.ModelCrab;
import divinerpg.objects.entities.entity.vanilla.EntityCrab;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderCrab extends RenderLiving<EntityCrab> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/crab.png");

    public RenderCrab(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelCrab(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityCrab entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntityCrab> {
        @Override
        public Render<? super EntityCrab> createRenderFor(RenderManager manager) {
            return new RenderCrab(manager, new ModelCrab(), 0F);
        }
    }
}