package net.batty.battystuff;

import net.batty.battystuff.item.ModItemGroups;
import net.batty.battystuff.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BattyStuff  implements ModInitializer {
	public static final String MOD_ID = "battystuff";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}