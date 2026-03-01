package com.honglin930;

import com.honglin930.item.ModItems;
import com.honglin930.item_group.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XMIB implements ModInitializer {
	public static final String MOD_ID = "xmib";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Launching for Xirao's More Item and Block!");
		ModItems.Initialize();
		ModItemGroups.Initialize();
	}
}