package com.oj.ojdoors.datagen;

import com.oj.ojdoors.oj_doors;
import com.oj.ojdoors.init.BlockInit;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockstateGenerator extends BlockStateProvider {

	public BlockstateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, oj_doors.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		doorBlock(BlockInit.DOAK_DOOR.get(), "doak_door", 
				modLoc("block/doak_door_bottom"), 
				modLoc("block/doak_door_top"));
	}

}
