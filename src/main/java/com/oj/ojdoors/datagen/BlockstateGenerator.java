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
		doorBlock(BlockInit.DAROAK_DOOR.get(), "daroak_door", 
				modLoc("block/daroak_door_bottom"), 
				modLoc("block/daroak_door_top"));
		doorBlock(BlockInit.CHEOAK_DOOR.get(), "cheoak_door", 
				modLoc("block/cheoak_door_bottom"),
				modLoc("block/cheoak_door_top"));
		doorBlock(BlockInit.CRIOAK_DOOR.get(), "crioak_door", 
				modLoc("block/crioak_door_bottom"), 
				modLoc("block/crioak_door_top"));
		
		///////////////////////////////////////////////////////////////
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
		doorBlock(BlockInit.CHEDARK_OAK_DOOR.get(), "chedark_oak_door", 
				modLoc("block/chedark_oak_door_bottom"), 
				modLoc("block/chedark_oak_door_top"));
		doorBlock(BlockInit.CRIDARK_OAK_DOOR.get(), "cridark_oak_door", 
				modLoc("block/cridark_oak_door_bottom"), 
				modLoc("block/cridark_oak_door_top"));
		doorBlock(BlockInit.WARDARK_OAK_DOOR.get(), "wardark_oak_door", 
				modLoc("block/wardark_oak_door_bottom"), 
				modLoc("block/wardark_oak_door_top"));
		doorBlock(BlockInit.JUNDARK_OAK_DOOR.get(), "jundark_oak_door", 
				modLoc("block/jundark_oak_door_bottom"), 
				modLoc("block/jundark_oak_door_top"));
		doorBlock(BlockInit.MANDARK_OAK_DOOR.get(), "mandark_oak_door", 
				modLoc("block/mandark_oak_door_bottom"), 
				modLoc("block/mandark_oak_door_top"));
	}

}
