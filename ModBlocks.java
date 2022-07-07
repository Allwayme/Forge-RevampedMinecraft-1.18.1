package net.drgalaxy.epicmod.block;

import net.drgalaxy.epicmod.EpicMod;
import net.drgalaxy.epicmod.block.custom.*;

import net.drgalaxy.epicmod.item.ModCreativeModeTab;
import net.drgalaxy.epicmod.item.ModItems;
import net.drgalaxy.epicmod.sound.ModSounds;
import net.drgalaxy.epicmod.world.feature.tree.MangoTreeGrower;
import net.drgalaxy.epicmod.world.feature.tree.MapleTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public abstract class ModBlocks {

public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, EpicMod.MOD_ID);



public static final RegistryObject<Block> GREEN_RUBY_BLOCK = registerBlock("green_ruby_block",
        ()-> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL)
                .strength(8.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> GREEN_RUBY_ORE = registerBlock("green_ruby_ore",
            ()-> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(9f).requiresCorrectToolForDrops(),UniformInt.of(1,4)), ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> DEEPSLATE_GREEN_RUBY_ORE = registerBlock("deepslate_green_ruby_ore",
            ()-> new OreBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(10.5f).requiresCorrectToolForDrops(),UniformInt.of(1,4)), ModCreativeModeTab.EPICMOD_TAB2);



    public static final RegistryObject<Block> BLIND_STEP_BLOCK = registerBlock("blind_step_block",
            ()-> new BlindnessBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(6.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.EPICMOD_TAB2,"tooltip.epicmod.block.blind_step_block");

    public static final RegistryObject<Block> DEAD_STONE = registerBlock("dead_stone",
            ()-> new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .strength(6.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.EPICMOD_TAB2);


    public static final RegistryObject<Block> SAND_OF_HARM = registerBlock("sand_of_harm",
            ()-> new SandOfHarm(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> SAND_OF_POISON = registerBlock("sand_of_poison",
            ()-> new SandOfPoison(BlockBehaviour.Properties.copy(Blocks.SMOOTH_SANDSTONE).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()), ModCreativeModeTab.EPICMOD_TAB2);




    public static final RegistryObject<Block> PINK_DANDELION = registerBlock("pink_dandelion",
            ()-> new FlowerBlock(MobEffects.LEVITATION,2,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> POTTED_PINK_DANDELION = registerBlockWithoutBlockItem("potted_pink_dandelion",
            () -> new FlowerPotBlock(null, ModBlocks.PINK_DANDELION,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));









    public static final RegistryObject<Block> CORN_PLANT = BLOCKS.register("corn_plant",
            ()-> new CornPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> MANGO_LEAVES = registerBlock("a",
            ()-> new MangoBushBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES).noOcclusion().randomTicks()), ModCreativeModeTab.EPICMOD_TAB3);







    public static final RegistryObject<Block> DREAM_BLOCK = registerBlock("dream_block",
            ()-> new DreamBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).lightLevel(BlockState -> 5)
                    .strength(32.7f).requiresCorrectToolForDrops()), ModCreativeModeTab.EPICMOD_TAB2);



    public static final RegistryObject<Block> A_PORTAL = registerBlockWithoutBlockItem("a_portal",
            PortalBlock::new);



    public static final RegistryObject<Block> MAGIC_GRASS_BLOCK = registerBlock("magic_grass_block",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).requiresCorrectToolForDrops()), ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> MAGIC_DIRT = registerBlock("magic_dirt",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).requiresCorrectToolForDrops()), ModCreativeModeTab.EPICMOD_TAB2);



    public static final RegistryObject<Block> SUNNY_GLASS = registerBlock("sunny_glass",
            ()-> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS)
                    .strength(0.4f).noOcclusion().lightLevel(BlockState-> 7).noOcclusion()), ModCreativeModeTab.EPICMOD_TAB2);



    public static final RegistryObject<Block> OLD_TREE_TRUNK = registerBlock("old_tree_trunk",
            ()-> new OldTreeTrunkBlock(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(2.6f).requiresCorrectToolForDrops().noOcclusion())
            , ModCreativeModeTab.EPICMOD_TAB2);



    public static final RegistryObject<Block> RED_LAMP = registerBlock("lamp",
            () -> new RedLamp(BlockBehaviour.Properties.of(Material.WOOL).sound(SoundType.GLASS) .strength(1.7f).noOcclusion().lightLevel((state)-> state.getValue(RedLamp.CLICKED)? 14 : 0)),
            ModCreativeModeTab.EPICMOD_TAB2);




    public static final RegistryObject<Block> LITTLE_STONES = registerBlock("little_stones",
            () -> new GemCuttingStationBlock(BlockBehaviour.Properties.copy(Blocks.STONE).noOcclusion()),
            ModCreativeModeTab.EPICMOD_TAB2);



    public static final RegistryObject<Block> MAPLE_SIGN = BLOCKS.register("maple_planks_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.of(Material.WOOD), ModWoodTypes.MAPLE));


    public static final RegistryObject<Block> MAPLE_WALL_SIGN = BLOCKS.register("maple_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.of(Material.WOOD), ModWoodTypes.MAPLE));

    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG))
                   , ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> MAPLE_WOOD = registerBlock("maple_wood",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD))
            , ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG))
            , ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            ()-> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD))
            , ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            ()-> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves",
            ()-> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.EPICMOD_TAB2);

    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling",
            ()-> new SaplingBlock(new MapleTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING))
            , ModCreativeModeTab.EPICMOD_TAB3);

    public static final RegistryObject<Block> MANGO_TREE_SAPLING = registerBlock("mango_tree_sapling",
            ()-> new SaplingBlock(new MangoTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING))
            , ModCreativeModeTab.EPICMOD_TAB3);












    private static <T extends  Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }









    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                      CreativeModeTab tab, String tooltipKey){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T>block,
                                                                           CreativeModeTab tab, String tooltipKey){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(),
                new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack p_40572_, @Nullable Level p_40573_, List<Component> p_40574_, TooltipFlag p_40575_) {
                p_40574_.add(new TranslatableComponent(tooltipKey));
            }
        });
    }


private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn, tab);
            return toReturn;
}

private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T>block,
                                                                       CreativeModeTab tab){
    return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(),
           new Item.Properties().tab(tab)));
}

public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
 }

    protected abstract void spawnDestroyParticles(Level pLevel, Player pPlayer, BlockPos pPos, BlockState pState);
}
