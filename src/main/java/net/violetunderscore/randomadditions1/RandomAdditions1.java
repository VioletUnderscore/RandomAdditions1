package net.violetunderscore.randomadditions1;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomAdditions1 implements ModInitializer {
	public static final String MOD_ID = "randomadditions1";
    public static final Logger LOGGER = LoggerFactory.getLogger("randomadditions1");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}