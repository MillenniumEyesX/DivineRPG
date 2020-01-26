package divinerpg.objects.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vanilla.ModelHusk;
import divinerpg.objects.entities.entity.vanilla.EntityHusk;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderHusk extends RenderLiving<EntityHusk> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/husk.png");

    public RenderHusk(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelHusk(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityHusk entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntityHusk> {
        @Override
        public Render<? super EntityHusk> createRenderFor(RenderManager manager) {
            return new RenderHusk(manager, new ModelHusk(), 0F);
        }
    }
}