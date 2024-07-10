package net.herrobriam.nocopper;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoMoreCopper implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("no-more-copper");

	@Override
	public void onInitialize() {
		LOGGER.info("Removing Copper...");
	}
}