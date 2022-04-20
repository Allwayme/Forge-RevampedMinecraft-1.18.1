package net.drgalaxy.epicmod;

import net.drgalaxy.epicmod.block.ModBlocks;
import net.drgalaxy.epicmod.config.EpicModClientConfigs;
import net.drgalaxy.epicmod.config.EpicModCommonConfigs;
import net.drgalaxy.epicmod.effect.ModEffects;
import net.drgalaxy.epicmod.enchantment.ModEnchantments;

import net.drgalaxy.epicmod.entity.ModEntityTypes;

import net.drgalaxy.epicmod.entity.client.FungalStickRenderer;
import net.drgalaxy.epicmod.entity.client.TestRenderer;
import net.drgalaxy.epicmod.item.ModItems;


import net.drgalaxy.epicmod.painting.ModPaintings;
import net.drgalaxy.epicmod.potion.ModPotions;
import net.drgalaxy.epicmod.sound.ModSounds;
import net.drgalaxy.epicmod.util.BetterBrewingRecipe;

import net.drgalaxy.epicmod.villager.ModVillagers;
import net.drgalaxy.epicmod.world.structure.ModStructures;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(EpicMod.MOD_ID)
public class EpicMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "epicmod";

    public EpicMod() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModPaintings.register(eventBus);
        ModEnchantments.register(eventBus);
        ModEffects.register(eventBus);
        ModPotions.register(eventBus);
        ModEntityTypes.register(eventBus);
        ModStructures.register(eventBus);
        ModVillagers.register(eventBus);
        ModSounds.register(eventBus);



        GeckoLib.initialize();

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, EpicModClientConfigs.SPEC,"EpicMod-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, EpicModCommonConfigs.SPEC,"EpicMod-common.toml");


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_DANDELION.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PINK_DANDELION.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CORN_PLANT.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.TALL_ROS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_TALL_ROS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OLD_TREE_TRUNK.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAPLE_SAPLING.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SUNNY_GLASS.get(), RenderType.translucent());

        EntityRenderers.register(ModEntityTypes.TEST.get(), TestRenderer::new);
        EntityRenderers.register(ModEntityTypes.FUNGAL_STICK.get(), FungalStickRenderer::new);








    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(()-> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PINK_DANDELION.getId(), ModBlocks.POTTED_PINK_DANDELION);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.TALL_ROS.getId(), ModBlocks.POTTED_TALL_ROS);
            ComposterBlock.COMPOSTABLES.put(ModItems.CORN_SEED.get(),0.3f);
            ComposterBlock.COMPOSTABLES.put(ModItems.CORN.get(),0.65f);
            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    ModItems.ICE_PIECES.get(), ModPotions.FREEZE_POTION.get()));

            ModVillagers.registerPOIs();
        });

    }

}
