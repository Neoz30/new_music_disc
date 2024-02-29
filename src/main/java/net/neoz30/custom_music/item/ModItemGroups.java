package net.neoz30.custom_music.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.neoz30.custom_music.CustomMusic;

public class ModItemGroups {
    public static final ItemGroup MUSIC_DISC = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CustomMusic.MOD_ID, "music_disc"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.music_disc"))
                    .icon(() -> new ItemStack(Items.MUSIC_DISC_OTHERSIDE)).entries((displayContext, entries) -> {

                        entries.add(Items.MUSIC_DISC_5);
                        entries.add(Items.MUSIC_DISC_11);
                        entries.add(Items.MUSIC_DISC_13);
                        entries.add(Items.MUSIC_DISC_BLOCKS);
                        entries.add(Items.MUSIC_DISC_CAT);
                        entries.add(Items.MUSIC_DISC_CHIRP);
                        entries.add(Items.MUSIC_DISC_FAR);
                        entries.add(Items.MUSIC_DISC_MALL);
                        entries.add(Items.MUSIC_DISC_MELLOHI);
                        entries.add(Items.MUSIC_DISC_OTHERSIDE);
                        entries.add(Items.MUSIC_DISC_PIGSTEP);
                        entries.add(Items.MUSIC_DISC_RELIC);
                        entries.add(Items.MUSIC_DISC_STAL);
                        entries.add(Items.MUSIC_DISC_STRAD);
                        entries.add(Items.MUSIC_DISC_WAIT);
                        entries.add(Items.MUSIC_DISC_WARD);

                        entries.add(ModItems.MUSIC_DISC_SHRIEKER);
                        entries.add(ModItems.MUSIC_DISC_THE_WITHER);
                        entries.add(ModItems.MUSIC_DISC_TIME);
                        entries.add(ModItems.MUSIC_DISC_EMERALD_MELODY);

                    }).build());
    public static void registerItemGroups() {
        CustomMusic.LOGGER.info("Registering item groups for " + CustomMusic.MOD_ID);
    }
}
