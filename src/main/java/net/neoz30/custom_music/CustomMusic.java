package net.neoz30.custom_music;

import net.fabricmc.api.ModInitializer;

import net.neoz30.custom_music.datagen.ModItemTagProvider;
import net.neoz30.custom_music.item.ModItems;
import net.neoz30.custom_music.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomMusic implements ModInitializer {
	public static final String MOD_ID = "custom_music";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.registerSounds();
	}
}