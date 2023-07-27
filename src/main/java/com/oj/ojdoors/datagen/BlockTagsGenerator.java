package com.oj.ojdoors.datagen;

import java.util.Collection;
import java.util.concurrent.CompletableFuture;

import org.jetbrains.annotations.Nullable;

import com.oj.ojdoors.oj_doors;
import com.oj.ojdoors.init.BlockInit;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockTagsGenerator extends BlockTagsProvider  {

	public BlockTagsGenerator(PackOutput output, CompletableFuture<Provider> lookupProvider,
			@Nullable ExistingFileHelper existingFileHelper) {
		
		super(output, lookupProvider, oj_doors.MODID, existingFileHelper);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void addTags(Provider p_256380_) {
    	Collection<RegistryObject<Block>> blocks = BlockInit.orderedItems();
    	blocks.stream()
    		.map(RegistryObject::get)
    		.forEach(e -> {tag(BlockTags.WOODEN_DOORS).add(e);});
	}

}
