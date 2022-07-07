package net.drgalaxy.epicmod.event;

import net.drgalaxy.epicmod.EpicMod;
import net.drgalaxy.epicmod.block.ModBlocks;
import net.drgalaxy.epicmod.block.ModWoodTypes;
import net.drgalaxy.epicmod.entity.ModEntityTypes;

import net.drgalaxy.epicmod.entity.client.armor.GreenRubyArmorRenderer;
import net.drgalaxy.epicmod.entity.client.renderer.*;
import net.drgalaxy.epicmod.item.custom.GreenRubyArmorItem;
import net.drgalaxy.epicmod.particle.ModParticles;
import net.drgalaxy.epicmod.particle.custom.AngleParticle;
import net.drgalaxy.epicmod.particle.custom.PortalParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = EpicMod.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvent {
    @SubscribeEvent
    public static void registerRecipeTypes(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(GreenRubyArmorItem.class, new GreenRubyArmorRenderer());


    }
    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_DANDELION.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PINK_DANDELION.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CORN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OLD_TREE_TRUNK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANGO_LEAVES.get(), RenderType.cutout());



        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SUNNY_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.A_PORTAL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LITTLE_STONES.get(), RenderType.translucent());


        EntityRenderers.register(ModEntityTypes.FUNGAL_STICK.get(), FungalStickRenderer::new);
        EntityRenderers.register(ModEntityTypes.JUNGLE_PIGLIN.get(), JunglePiglinRenderer::new);
        EntityRenderers.register(ModEntityTypes.FARMLAND_GOLEM.get(), FarmLandGolemRenderer::new);
        EntityRenderers.register(ModEntityTypes.SPRINTER_EINTIY.get(), SprinterEntityRenderer::new);

        WoodType.register(ModWoodTypes.MAPLE);





    }
    @SubscribeEvent
    public static void registerParticleFactories(final ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register(ModParticles.ANGLE_PARTICLES.get(),
                AngleParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.PORTAL_PARTICLE.get(),
                PortalParticle.Provider::new);
    }
}

