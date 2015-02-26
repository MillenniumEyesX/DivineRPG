package net.divinerpg.client.render.entity;

import net.divinerpg.blocks.twilight.TileEntityEdenChest;
import net.divinerpg.client.render.EntityResourceLocation;
import net.divinerpg.client.render.RenderDivineBoss;
import net.divinerpg.client.render.RenderDivineMob;
import net.divinerpg.client.render.RenderProjectile;
import net.divinerpg.client.render.RenderSpecialProjectile;
import net.divinerpg.client.render.block.RenderEdenChest;
import net.divinerpg.client.render.entity.twilight.RenderBunny;
import net.divinerpg.client.render.entity.twilight.RenderDAR;
import net.divinerpg.client.render.entity.twilight.RenderEnchantedArcher;
import net.divinerpg.client.render.entity.twilight.RenderEternalArcher;
import net.divinerpg.client.render.entity.twilight.RenderTwilightArcher;
import net.divinerpg.client.render.entity.twilight.model.ModelAngryBunny;
import net.divinerpg.client.render.entity.twilight.model.ModelBasalisk;
import net.divinerpg.client.render.entity.twilight.model.ModelBunny;
import net.divinerpg.client.render.entity.twilight.model.ModelCadillion;
import net.divinerpg.client.render.entity.twilight.model.ModelCori;
import net.divinerpg.client.render.entity.twilight.model.ModelDenseDemon;
import net.divinerpg.client.render.entity.twilight.model.ModelDensos;
import net.divinerpg.client.render.entity.twilight.model.ModelEnchantedArcher;
import net.divinerpg.client.render.entity.twilight.model.ModelEnchantedWarrior;
import net.divinerpg.client.render.entity.twilight.model.ModelEternalArcher;
import net.divinerpg.client.render.entity.twilight.model.ModelGreenfeet;
import net.divinerpg.client.render.entity.twilight.model.ModelKarot;
import net.divinerpg.client.render.entity.twilight.model.ModelMadivel;
import net.divinerpg.client.render.entity.twilight.model.ModelMoonWolf;
import net.divinerpg.client.render.entity.twilight.model.ModelSamek;
import net.divinerpg.client.render.entity.twilight.model.ModelSkythernFiend;
import net.divinerpg.client.render.entity.twilight.model.ModelSoulFiend;
import net.divinerpg.client.render.entity.twilight.model.ModelSoulStealer;
import net.divinerpg.client.render.entity.twilight.model.ModelTomo;
import net.divinerpg.client.render.entity.twilight.model.ModelTwilightArcher;
import net.divinerpg.client.render.entity.twilight.model.ModelTwilightDemon;
import net.divinerpg.client.render.entity.twilight.model.ModelTwilightGolem;
import net.divinerpg.client.render.entity.twilight.model.ModelVamacheron;
import net.divinerpg.client.render.entity.vanilla.RenderModBiped;
import net.divinerpg.client.render.item.ItemRendererEdenChest;
import net.divinerpg.entities.base.EntityStats;
import net.divinerpg.entities.twilight.EntityAngryBunny;
import net.divinerpg.entities.twilight.EntityApalachiaArcher;
import net.divinerpg.entities.twilight.EntityApalachiaCadillion;
import net.divinerpg.entities.twilight.EntityApalachiaGolem;
import net.divinerpg.entities.twilight.EntityApalachiaTomo;
import net.divinerpg.entities.twilight.EntityApalachiaWarrior;
import net.divinerpg.entities.twilight.EntityBaslisk;
import net.divinerpg.entities.twilight.EntityBunny;
import net.divinerpg.entities.twilight.EntityDensos;
import net.divinerpg.entities.twilight.EntityEdenCadillion;
import net.divinerpg.entities.twilight.EntityEdenCori;
import net.divinerpg.entities.twilight.EntityEdenTomo;
import net.divinerpg.entities.twilight.EntityEternalArcher;
import net.divinerpg.entities.twilight.EntityGreenfeet;
import net.divinerpg.entities.twilight.EntityKarot;
import net.divinerpg.entities.twilight.EntityMadivel;
import net.divinerpg.entities.twilight.EntityMoonWolf;
import net.divinerpg.entities.twilight.EntityMortumCadillion;
import net.divinerpg.entities.twilight.EntityMortumDemon;
import net.divinerpg.entities.twilight.EntityParticleBullet;
import net.divinerpg.entities.twilight.EntityReyvor;
import net.divinerpg.entities.twilight.EntitySamek;
import net.divinerpg.entities.twilight.EntitySkythernArcher;
import net.divinerpg.entities.twilight.EntitySkythernCori;
import net.divinerpg.entities.twilight.EntitySkythernFiend;
import net.divinerpg.entities.twilight.EntitySkythernGolem;
import net.divinerpg.entities.twilight.EntitySoulFiend;
import net.divinerpg.entities.twilight.EntitySoulStealer;
import net.divinerpg.entities.twilight.EntityTwilightArcher;
import net.divinerpg.entities.twilight.EntityTwilightDemon;
import net.divinerpg.entities.twilight.EntityVamacheron;
import net.divinerpg.entities.twilight.EntityVerek;
import net.divinerpg.entities.twilight.EntityWildwoodCadillion;
import net.divinerpg.entities.twilight.EntityWildwoodGolem;
import net.divinerpg.entities.twilight.EntityWildwoodTomo;
import net.divinerpg.entities.twilight.projectile.EntityCoriShot;
import net.divinerpg.utils.Util;
import net.divinerpg.utils.blocks.TwilightBlocks;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class TwilightEntityRenderer {
	
	private static EntityResourceLocation x;
	private static EntityStats s;
	
	public static void init() {
        RenderingRegistry.registerEntityRenderingHandler(EntityCoriShot.class, new RenderSpecialProjectile(x.coriShot));
        RenderingRegistry.registerEntityRenderingHandler(EntityParticleBullet.class, new RenderProjectile());

        RenderingRegistry.registerEntityRenderingHandler(EntityEdenCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.edenCadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.edenTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityBunny.class, new RenderBunny(new ModelBunny(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderBunny(new ModelAngryBunny(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEdenCori.class, new RenderDivineMob(new ModelCori(), 0.0F, x.edenCori));
        RenderingRegistry.registerEntityRenderingHandler(EntityMadivel.class, new RenderDivineMob(new ModelMadivel(), 0.0F, x.madivel));
        RenderingRegistry.registerEntityRenderingHandler(EntityGreenfeet.class, new RenderDivineMob(new ModelGreenfeet(), 0.0F, x.greenfeet));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildwoodGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.wildwoodGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildwoodTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.wildwoodTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildwoodCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.wildwoodCadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityVerek.class, new RenderDivineMob(new ModelSamek(), 0.0F, x.varek));
        RenderingRegistry.registerEntityRenderingHandler(EntityMoonWolf.class, new RenderDivineMob(new ModelMoonWolf(), 0.0F, x.wildwoodWolf));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.apalachiaCadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.apalachiaTomo));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.apalachiaGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaWarrior.class, new RenderModBiped(new ModelEnchantedWarrior(), x.apalachiaWarrior));
        RenderingRegistry.registerEntityRenderingHandler(EntityApalachiaArcher.class, new RenderEnchantedArcher(new ModelEnchantedArcher(), x.apalachiaArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernArcher.class, new RenderEnchantedArcher(new ModelEnchantedArcher(), x.skythernArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightArcher.class, new RenderTwilightArcher(new ModelTwilightArcher(), x.twilightArcher));
        RenderingRegistry.registerEntityRenderingHandler(EntitySamek.class, new RenderDivineMob(new ModelSamek(), 0.0F, x.samek));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.skythernGolem));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernCori.class, new RenderDivineMob(new ModelCori(), 0.0F, x.skythernCori));
        RenderingRegistry.registerEntityRenderingHandler(EntitySkythernFiend.class, new RenderDivineMob(new ModelSkythernFiend(), 0.0F, x.skythernFiend));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.mortumCadillion));
        RenderingRegistry.registerEntityRenderingHandler(EntityMortumDemon.class, new RenderDivineMob(new ModelDenseDemon(), 0.0F, x.mortumDemon));
        RenderingRegistry.registerEntityRenderingHandler(EntityBaslisk.class, new RenderDivineMob(new ModelBasalisk(), 0.0F, x.basalisk));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderDivineMob(new ModelSoulStealer(), 0.0F, x.soulStealer));
        
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDAR(new ModelDensos(), 0.0F, x.densos, s.densosBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderDAR(new ModelDensos(), 0.0F, x.reyvor, s.reyvorBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderDivineBoss(new ModelTwilightDemon(), 0.0F, 2.0F, x.twilightDemon, s.twilightDemonBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderDivineBoss(new ModelSoulFiend(), 0.0F, 1.0F, x.soulFiend, s.soulFiendBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderDivineBoss(new ModelVamacheron(), 0.0F, 3.0F, x.vamacheron, s.vamacheronBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderDivineBoss(new ModelKarot(), 0.0F, 5.0F, x.karot, s.karotBossID));
        RenderingRegistry.registerEntityRenderingHandler(EntityEternalArcher.class, new RenderEternalArcher(new ModelEternalArcher(), 0.0F, 2.5F, x.eternalArcher, s.eternalArcherBossID));
        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityEdenChest.class, new RenderEdenChest());
        MinecraftForgeClient.registerItemRenderer(Util.toItem(TwilightBlocks.edenChest), new ItemRendererEdenChest());
	}	
}