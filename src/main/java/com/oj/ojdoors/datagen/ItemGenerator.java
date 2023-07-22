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
		basicItem(modLoc("chedark_oak_door"));
		basicItem(modLoc("cridark_oak_door"));
		basicItem(modLoc("wardark_oak_door"));
		basicItem(modLoc("jundark_oak_door"));		
		basicItem(modLoc("mandark_oak_door"));	
		
		basicItem(modLoc("daroak_door"));
		basicItem(modLoc("acaoak_door"));
		basicItem(modLoc("biroak_door"));
		basicItem(modLoc("sproak_door"));	
		basicItem(modLoc("cheoak_door"));
		basicItem(modLoc("crioak_door"));
		basicItem(modLoc("waroak_door"));
		basicItem(modLoc("junoak_door"));		
		basicItem(modLoc("manoak_door"));	
	}
}
