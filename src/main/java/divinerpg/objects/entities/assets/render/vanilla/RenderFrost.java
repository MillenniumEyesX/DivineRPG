package divinerpg.objects.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vanilla.ModelFrost;
import divinerpg.objects.entities.entity.vanilla.EntityFrost;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFrost extends RenderLiving<EntityFrost> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/frost.png");

    public RenderFrost(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelFrost(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityFrost entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntityFrost> {
        @Override
        public Render<? super EntityFrost> createRenderFor(RenderManager manager) {
            return new RenderFrost(manager, new ModelFrost(), 0F);
        }
    }
}