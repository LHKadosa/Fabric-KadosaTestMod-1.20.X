package net.kadosa.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kadosa.testmod.Kadosa_Test_Mod;
import net.kadosa.testmod.block.ModBlocks;
import net.kadosa.testmod.item.custom.MetalDetectorItem;
import net.kadosa.testmod.item.custom.ModArmorItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));

    public static final Item METAL_DETECTOR = registerItem("metal_detector",
            new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));

    public static final Item RUBY_STAFF = registerItem("ruby_staff",
            new Item(new FabricItemSettings().maxCount(1)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new PickaxeItem(ModToolMaterials.RUBY, 2, 2f, new FabricItemSettings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new AxeItem(ModToolMaterials.RUBY, 3, 1f, new FabricItemSettings()));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterials.RUBY, 0, 0f, new FabricItemSettings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterials.RUBY, 5, 3f, new FabricItemSettings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new HoeItem(ModToolMaterials.RUBY, 0, 0f, new FabricItemSettings()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings())); //This has the FullArmorEffect code
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));
    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings()));

    /* ///Outdated: Ruby has a separate ItemGroup
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }*/

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Kadosa_Test_Mod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Kadosa_Test_Mod.LOGGER.info("Registering Mod Items for " + Kadosa_Test_Mod.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
