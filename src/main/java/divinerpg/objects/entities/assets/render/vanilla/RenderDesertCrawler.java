package divinerpg.objects.entities.assets.render.vanilla;

import javax.annotation.Nullable;

import divinerpg.objects.entities.assets.model.vanilla.ModelCrawler;
import divinerpg.objects.entities.entity.vanilla.EntityDesertCrawler;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDesertCrawler extends RenderLiving<EntityDesertCrawler> {
    public static final IRenderFactory FACTORY = new Factory();
    ResourceLocation texture = new ResourceLocation("divinerpg:textures/entity/desert_crawler.png");

    public RenderDesertCrawler(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, new ModelCrawler(), shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityDesertCrawler entity) {
        return texture;
    }

    public static class Factory implements IRenderFactory<EntityDesertCrawler> {
        @Override
        public Render<? super EntityDesertCrawler> createRenderFor(RenderManager manager) {
            return new RenderDesertCrawler(manager, new ModelCrawler(), 0F);
        }
    }
}