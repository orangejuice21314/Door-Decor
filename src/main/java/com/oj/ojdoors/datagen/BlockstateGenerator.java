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
		doorBlock(BlockInit.OAKDARK_OAK_DOOR.get(), "oakdark_oak_door", 
				modLoc("block/oakdark_oak_door_bottom"), 
				modLoc("block/oakdark_oak_door_top"));
		doorBlock(BlockInit.ACADARK_OAK_DOOR.get(), "acadark_oak_door", 
				modLoc("block/acadark_oak_door_bottom"), 
				modLoc("block/acadark_oak_door_top"));
		doorBlock(BlockInit.BIRDARK_OAK_DOOR.get(), "birdark_oak_door", 
				modLoc("block/birdark_oak_door_bottom"), 
				modLoc("block/birdark_oak_door_top"));
		doorBlock(BlockInit.SPRDARK_OAK_DOOR.get(), "sprdark_oak_door", 
				modLoc("block/sprdark_oak_door_bottom"), 
				modLoc("block/sprdark_oak_door_top"));
	}

}
