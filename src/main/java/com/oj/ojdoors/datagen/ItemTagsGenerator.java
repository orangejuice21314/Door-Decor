package com.oj.ojdoors.datagen;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.oj.ojdoors.oj_doors;
import com.oj.ojdoors.init.ItemInit;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemTagsGenerator extends ItemTagsProvider  {
	
	public ItemTagsGenerator(final PackOutput output, final CompletableFuture<HolderLookup.Provider> lookupProvider,
			final CompletableFuture<TagsProvider.TagLookup<Block>> blockTags,
			@Nullable final ExistingFileHelper existingFileHelper) {
		
		super(output, lookupProvider, blockTags, oj_doors.MODID, existingFileHelper);
	}
	
	@Override
	protected void addTags(Provider p_256380_) {
    	Collection<RegistryObject<Item>> items = ItemInit.orderedItems();
    	items.stream()
    		.map(RegistryObject::get)
    		.forEach(e -> {tag(ItemTags.WOODEN_DOORS).add(e);});
	}

}
