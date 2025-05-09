package net.kadosa.testmod.util;

import net.kadosa.testmod.Kadosa_Test_Mod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS =
                createTag("metal_detector_detectable_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Kadosa_Test_Mod.MOD_ID, name));
        }
    }

    //Probably unused. It`s here to show how to expand the concept
    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Kadosa_Test_Mod.MOD_ID, name));
        }
    }
}
