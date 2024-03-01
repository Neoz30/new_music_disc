package net.neoz30.new_music_disc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.neoz30.new_music_disc.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);

    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_SHRIEKER);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_SHRIEKER);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_THE_WITHER);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_THE_WITHER);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_TIME);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_TIME);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_EMERALD_MELODY);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_EMERALD_MELODY);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_FORT_STRESS);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_FORT_STRESS);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_SHULK);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_SHULK);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_AMETHYST_MELODY);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_AMETHYST_MELODY);
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS).add(ModItems.MUSIC_DISC_FOREST);
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_FOREST);
    }
}
