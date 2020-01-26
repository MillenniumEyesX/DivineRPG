package divinerpg.objects.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vanilla.ModelTheWatcher;
import divinerpg.objects.entities.entity.vanilla.EntityTheWatcher;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderTheWatcher extends RenderLiving<EntityTheWatcher> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/the_watcher.png");

    public RenderTheWatcher(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelTheWatcher(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityTheWatcher entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntityTheWatcher> {
        @Override
        public Render<? super EntityTheWatcher> createRenderFor(RenderManager manager) {
            return new RenderTheWatcher(manager, new ModelTheWatcher(), 0F);
        }
    }
}