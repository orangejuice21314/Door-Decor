package com.oj.ojdoors.datagen;

import java.util.Collection;

import com.oj.ojdoors.oj_doors;
import com.oj.ojdoors.init.BlockInit;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockstateGenerator extends BlockStateProvider {

	public BlockstateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, oj_doors.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {	
    	Collection<RegistryObject<Block>> blocks = BlockInit.orderedItems();
		blocks.stream()
			.forEach(
					e -> {
						String design = e.getId().toString().substring(9,12);
						String mcDoor = e.getId().toString().substring(12);
						
						doorBlock((DoorBlock) e.get(), design+mcDoor, 
								modLoc("block/"+design+mcDoor+"_bottom"), 
								modLoc("block/"+design+mcDoor+"_top"));
					});
	}

}
