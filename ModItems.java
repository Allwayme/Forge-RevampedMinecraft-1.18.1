package net.drgalaxy.epicmod.item;

import net.drgalaxy.epicmod.EpicMod;
import net.drgalaxy.epicmod.block.ModBlocks;
import net.drgalaxy.epicmod.entity.ModEntityTypes;
import net.drgalaxy.epicmod.item.custom.*;
import net.drgalaxy.epicmod.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.decoration.Painting;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS, EpicMod.MOD_ID);

    public static final RegistryObject<Item> GREEN_RUBY = ITEMS.register("green_ruby",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<Item> MELTED_GREEN_RUBY = ITEMS.register("melted_green_ruby",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> ICE_PIECES = ITEMS.register("ice_pieces",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).rarity(Rarity.UNCOMMON)));





    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB3).food(ModFoods.CORN)));

    public static final RegistryObject<Item> CORN_SEED= ITEMS.register("corn_seed",
            ()-> new ItemNameBlockItem(ModBlocks.CORN_PLANT.get(),new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB3)));

    public static final RegistryObject<Item>  MANGO = ITEMS.register("mango",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB3).food(ModFoods.MANGO)));

    public static final RegistryObject<Item>  PEELED_MANGO = ITEMS.register("peeled_mango",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB3).food(ModFoods.PEELED_MANGO)));

    public static final RegistryObject<Item> CHEF_KNIFE= ITEMS.register("chef_knife",
            ()-> new ChefKnife(ModTiers.CHEF_KNIFE,2,-1.0f,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB3)));




    public static final RegistryObject<Item>  ELEPHANT_HORN= ITEMS.register("elephant_horn",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).stacksTo(16)));
    public static final RegistryObject<Item>  ELEPHANT_SKIN= ITEMS.register("elephant_skin",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).stacksTo(16)));
    public static final RegistryObject<Item> RAW_ELEPHANT_MEAT= ITEMS.register("raw_elephant_meat",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB3).food(ModFoods.RAW_ELEPHANT_MEAT).stacksTo(16)));
    public static final RegistryObject<Item> COOKED_ELEPHANT_MEAT= ITEMS.register("cooked_elephant_meat",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB3).food(ModFoods.COOKED_ELEPHANT_MEAT).stacksTo(16)));
    public static final RegistryObject<Item> ELEPHANT_HORN_SWORD= ITEMS.register("elephant_horn_sword",
            ()-> new ChefKnife(ModTiers.ELEPHANT_HORN_SWORD,3,1.5f,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));


    public static final RegistryObject<Item> STAFF_OF_PORTALS = ITEMS.register("staff_of_portals", StaffOfPortals::new);




    public static final RegistryObject<Item> MAPLE_SIGN_ITEM = ITEMS.register("maple_sign",
            () -> new SignItem(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB2).stacksTo(16),
                    ModBlocks.MAPLE_SIGN.get(), ModBlocks.MAPLE_WALL_SIGN.get()));



    public static final RegistryObject<Item> GREEN_RUBY_BOW = ITEMS.register("green_ruby_bow",
            ()-> new BowItem(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).durability(523)));



    public static final RegistryObject<Item> GREEN_RUBY_SWORD= ITEMS.register("green_ruby_sword",
            ()-> new UnluckSwordItem(ModTiers.GREEN_RUBY,4,-2.1f,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<Item> GREEN_RUBY_AXE = ITEMS.register("green_ruby_axe",
            ()-> new AxeItem(ModTiers.MELTED_GREEN_RUBY,3,-2.4f,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<Item> GREEN_RUBY_PICKAXE= ITEMS.register("green_ruby_pickaxe",
            ()-> new PickaxeItem(ModTiers.MELTED_GREEN_RUBY,1,-2,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<Item> GREEN_RUBY_HOE= ITEMS.register("green_ruby_hoe",
            ()-> new HoeItem(ModTiers.MELTED_GREEN_RUBY,2,-2,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<Item> GREEN_RUBY_SHOVEL= ITEMS.register("green_ruby_shovel",
            ()-> new ShovelItem(ModTiers.MELTED_GREEN_RUBY,1,-2,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));


    public static final RegistryObject<Item> ANGEL_SWORD= ITEMS.register("angel_sword",
            ()-> new AngelSwordItem(ModTiers.GREEN_RUBY,3,-1.6f,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));



    public static final RegistryObject<Item> GREEN_RUBY_HELMET= ITEMS.register("green_ruby_helmet",
            ()-> new GreenRubyArmorItem(ModArmorMaterials.GREEN_RUBY, EquipmentSlot.HEAD,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<Item> GREEN_RUBY_LEGGINGS= ITEMS.register("green_ruby_leggings",
            ()-> new  GreenRubyArmorItem(ModArmorMaterials.GREEN_RUBY,EquipmentSlot.LEGS,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<Item> GREEN_RUBY_CHESTPLATE= ITEMS.register("green_ruby_chestplate",
            ()-> new  GreenRubyArmorItem(ModArmorMaterials.GREEN_RUBY,EquipmentSlot.CHEST,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<Item> GREEN_RUBY_BOOTS= ITEMS.register("green_ruby_boots",
            ()-> new  GreenRubyArmorItem(ModArmorMaterials.GREEN_RUBY,EquipmentSlot.FEET,new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));







    public static final RegistryObject<Item> MAGIC_POWDER= ITEMS.register("magic_powder",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).rarity(Rarity.EPIC)));




    public static final RegistryObject<ForgeSpawnEggItem> JUNGLE_PIGLIN_SPAWN_EGG = ITEMS.register("jungle_piglin_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.JUNGLE_PIGLIN,0x034707, 0x600606,
                    new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));



    public static final RegistryObject<ForgeSpawnEggItem> FUNGAL_STICK_SPAWN_EGG = ITEMS.register("fungal_stick_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FUNGAL_STICK,0x948e8d, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<ForgeSpawnEggItem> FARMLAND_GOLEM_SPAWN_EGG = ITEMS.register("farmland_golem_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FARMLAND_GOLEM,0x79553a, 0xb89f2a,
                    new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));

    public static final RegistryObject<ForgeSpawnEggItem> SPRINTER_SPAWN_EGG = ITEMS.register("sprinter_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.SPRINTER_EINTIY,0x8b6831, 0xe5d5bc,
                    new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));









    public static final RegistryObject<Item> RONDO_ALLA_TURCA_RECORD = ITEMS.register("rondo_alla_turca_music_disc",
            () -> new RecordItem(4, ModSounds.RONDO_ALLA_TURCA,
                    new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).stacksTo(1)));

    public static final RegistryObject<Item> EINE_KLEINE_NACHTMUSIK_RECORD = ITEMS.register("eine_kleine_nachtmusik_music_disc",
            () -> new RecordItem(4, ModSounds.EINE_KLEINE_NACHTMUSIK,
                    new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).stacksTo(1)));

    public static final RegistryObject<Item> CONCERNING_HOBBITS_RECORD = ITEMS.register("concerning_hobbits_music_disc",
            () -> new RecordItem(4, ModSounds.CONCERNING_HOBBITS,
                    new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).stacksTo(1)));

    public static final RegistryObject<Item> JURASSIC_PARK_RECORD = ITEMS.register("jurassic_park_music_disc",
            () -> new RecordItem(4, ModSounds.JURASSIC_PARK,
                    new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1).stacksTo(1)));


    public static final RegistryObject<Item> BROKEN_BLACK_STAINED_GLASS = ITEMS.register("broken_black_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_BLUE_STAINED_GLASS = ITEMS.register("broken_blue_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_BROWN_STAINED_GLASS = ITEMS.register("broken_brown_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_CYAN_STAINED_GLASS = ITEMS.register("broken_cyan_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_GLASS = ITEMS.register("broken_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_GRAY_STAINED_GLASS = ITEMS.register("broken_gray_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_GREEN_STAINED_GLASS = ITEMS.register("broken_green_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_LIGHT_BLUE_STAINED_GLASS = ITEMS.register("broken_light_blue_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_LIGHT_GRAY_STAINED_GLASS = ITEMS.register("broken_light_gray_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_LIME_STAINED_GLASS = ITEMS.register("broken_lime_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_MAGENTA_STAINED_GLASS = ITEMS.register("broken_magenta_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_ORANGE_STAINED_GLASS = ITEMS.register("broken_orange_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_PINK_STAINED_GLASS = ITEMS.register("broken_pink_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_PURPLE_STAINED_GLASS = ITEMS.register("broken_purple_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_RED_STAINED_GLASS = ITEMS.register("broken_red_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_SUNNY_GLASS = ITEMS.register("broken_sunny_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_TINTED_GLASS = ITEMS.register("broken_tinted_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_WHITE_STAINED_GLASS = ITEMS.register("broken_white_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));
    public static final RegistryObject<Item> BROKEN_YELLOW_STAINED_GLASS = ITEMS.register("broken_yellow_stained_glass",
            ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EPICMOD_TAB1)));












public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
}

}
