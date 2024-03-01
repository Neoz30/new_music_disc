package net.neoz30.new_music_disc;

import net.fabricmc.api.ModInitializer;

import net.neoz30.new_music_disc.item.ModItemGroups;
import net.neoz30.new_music_disc.item.ModItems;
import net.neoz30.new_music_disc.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewMusicDisc implements ModInitializer {
	public static final String MOD_ID = "new_music_disc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModSounds.registerSounds();
	}
}