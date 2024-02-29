package net.neoz30.custom_music.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.neoz30.custom_music.CustomMusic;
import net.neoz30.custom_music.sound.ModSounds;

public class ModItems {
    public static final Item MUSIC_DISC_SHRIEKER = registerItem("music_disc.shrieker", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_SHRIEKER, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 129));
    public static final Item MUSIC_DISC_THE_WITHER = registerItem("music_disc.the_wither", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_THE_WITHER, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 148));
    public static final Item MUSIC_DISC_TIME = registerItem("music_disc.time", new MusicDiscItem(15,
            ModSounds.MUSIC_DISC_TIME, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 132));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(MUSIC_DISC_SHRIEKER);
        entries.add(MUSIC_DISC_THE_WITHER);
        entries.add(MUSIC_DISC_TIME);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CustomMusic.MOD_ID, name), item);
    }
    public static void registerModItems() {
        CustomMusic.LOGGER.info("Registering Mod Items for " + CustomMusic.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
