package net.neoz30.custom_music.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.neoz30.custom_music.CustomMusic;
import net.neoz30.custom_music.sound.ModSounds;

public class ModItems {
    public static final Item MUSIC_DISC_RAINBOW = registerItem("music_disc_rainbow", new Item(new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC)));
    public static final Item MUSIC_DISC_SHRIEKER = registerItem("music_disc_shrieker", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_SHRIEKER, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 129));
    public static final Item MUSIC_DISC_THE_WITHER = registerItem("music_disc_the_wither", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_THE_WITHER, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 148));
    public static final Item MUSIC_DISC_TIME = registerItem("music_disc_time", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_TIME, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 132));
    public static final Item MUSIC_DISC_EMERALD_MELODY = registerItem("music_disc_emerald_melody", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_EMERALD_MELODY, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 140));
    public static final Item MUSIC_DISC_FORT_STRESS = registerItem("music_disc_fort-stress", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_FORT_STRESS, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 246));
    public static final Item MUSIC_DISC_SHULK = registerItem("music_disc_shulk", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_SHULK, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 109));
    public static final Item MUSIC_DISC_AMETHYST_MELODY = registerItem("music_disc_amethyst_melody", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_AMETHYST_MELODY, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 128));
    public static final Item MUSIC_DISC_FOREST = registerItem("music_disc_forest", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_FOREST, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 143));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CustomMusic.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CustomMusic.LOGGER.info("Registering Mod Items for " + CustomMusic.MOD_ID);
    }
}
