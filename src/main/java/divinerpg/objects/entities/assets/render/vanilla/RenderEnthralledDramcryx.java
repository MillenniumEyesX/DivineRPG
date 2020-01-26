package divinerpg.objects.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vanilla.ModelEnthralledDramcryx;
import divinerpg.objects.entities.entity.vanilla.EntityEnthralledDramcryx;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderEnthralledDramcryx extends RenderLiving<EntityEnthralledDramcryx> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/enthralled_dramcryx.png");

    public RenderEnthralledDramcryx(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelEnthralledDramcryx(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityEnthralledDramcryx entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntityEnthralledDramcryx> {
        @Override
        public Render<? super EntityEnthralledDramcryx> createRenderFor(RenderManager manager) {
            return new RenderEnthralledDramcryx(manager, new ModelEnthralledDramcryx(), 0F);
        }
    }
}