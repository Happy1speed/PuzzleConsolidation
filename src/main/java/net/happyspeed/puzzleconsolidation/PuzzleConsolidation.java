package net.happyspeed.puzzleconsolidation;

import net.fabricmc.api.ModInitializer;
import net.happyspeed.puzzleconsolidation.item.ModItemGroups;
import net.happyspeed.puzzleconsolidation.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PuzzleConsolidation implements ModInitializer {
	public static final String MOD_ID = "puzzleconsolidation";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}