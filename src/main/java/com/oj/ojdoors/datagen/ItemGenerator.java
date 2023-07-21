package com.oj.ojdoors.datagen;

import com.oj.ojdoors.oj_doors;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemGenerator extends ItemModelProvider{

	public ItemGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, oj_doors.MODID, exFileHelper);
	}

	@Override
	protected void registerModels() {
		basicItem(modLoc("oakdark_oak_door"));
		basicItem(modLoc("acadark_oak_door"));
		basicItem(modLoc("birdark_oak_door"));
		basicItem(modLoc("sprdark_oak_door"));		
	}
}
