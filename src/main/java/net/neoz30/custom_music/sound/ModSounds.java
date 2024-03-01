package net.neoz30.custom_music.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.neoz30.custom_music.CustomMusic;

public class ModSounds {
    public static final SoundEvent MUSIC_DISC_SHRIEKER = registerSoundsEvent("music_disc.shrieker");
    public static final SoundEvent MUSIC_DISC_THE_WITHER = registerSoundsEvent("music_disc.the_wither");
    public static final SoundEvent MUSIC_DISC_TIME = registerSoundsEvent("music_disc.time");
    public static final SoundEvent MUSIC_DISC_EMERALD_MELODY = registerSoundsEvent("music_disc.emerald_melody");
    public static final SoundEvent MUSIC_DISC_FORT_STRESS = registerSoundsEvent("music_disc.fort-stress");
    public static final SoundEvent MUSIC_DISC_SHULK = registerSoundsEvent("music_disc.shulk");
    public static final SoundEvent MUSIC_DISC_AMETHYST_MELODY = registerSoundsEvent("music_disc.amethyst_melody");
    public static final SoundEvent MUSIC_DISC_FOREST = registerSoundsEvent("music_disc.forest");
    private static SoundEvent registerSoundsEvent(String name) {
        Identifier id = new Identifier(CustomMusic.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        CustomMusic.LOGGER.info("Register sounds for " + CustomMusic.MOD_ID);
    }
}
