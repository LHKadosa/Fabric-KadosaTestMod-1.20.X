package net.kadosa.testmod;

import net.fabricmc.api.ModInitializer;

import net.kadosa.testmod.block.ModBlocks;
import net.kadosa.testmod.item.ModItemGroups;
import net.kadosa.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Kadosa_Test_Mod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}