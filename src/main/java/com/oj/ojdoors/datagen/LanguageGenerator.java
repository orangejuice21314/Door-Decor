package com.oj.ojdoors.datagen;

import java.util.Collection;

import com.oj.ojdoors.oj_doors;
import com.oj.ojdoors.init.BlockInit;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class LanguageGenerator extends LanguageProvider{

	public LanguageGenerator(PackOutput output) {
		super(output, oj_doors.MODID, "en_us");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void addTranslations() {
    	Collection<RegistryObject<Block>> blocks = BlockInit.orderedItems();
    	blocks.stream()
		.forEach(
				e -> {
					String design = null;
					String mcDoor = null;
					
					if (e.getId().toString().substring(9,12).equals("dar")) {
						design = "Dark Oak";
					}
					if (e.getId().toString().substring(9,12).equals("jun")) {
						design = "Jungle";
					}
					if (e.getId().toString().substring(9,12).equals("cri")) {
						design = "Crimson";
					}
					if (e.getId().toString().substring(9,12).equals("aca")) {
						design = "Acacia";
					}
					if (e.getId().toString().substring(9,12).equals("bir")) {
						design = "Birch";
					}
					if (e.getId().toString().substring(9,12).equals("man")) {
						design = "Mangrove";
					}
					if (e.getId().toString().substring(9,12).equals("war")) {
						design = "Warped";
					}
					if (e.getId().toString().substring(9,12).equals("spr")) {
						design = "Spruce";
					}
					if (e.getId().toString().substring(9,12).equals("oak")) {
						design = "Oak";
					}
					if (e.getId().toString().substring(9,12).equals("che")) {
						design = "Cherry";
					}
					//////////////////////////////////////////////////////////
					if ( e.getId().toString().substring(12).equals("dark_oak_door")) {
						mcDoor = "Dark Oak Door";
					}
					if ( e.getId().toString().substring(12).equals("jungle_door")) {
						mcDoor = "Jungle Door";
					}
					if ( e.getId().toString().substring(12).equals("crimson_door")) {
						mcDoor = "Crimson Door";
					}
					if ( e.getId().toString().substring(12).equals("acacia_door")) {
						mcDoor = "Acacia Door";
					}
					if ( e.getId().toString().substring(12).equals("birch_door")) {
						mcDoor = "Birch Door";
					}
					if ( e.getId().toString().substring(12).equals("mangrove_door")) {
						mcDoor = "Mangrove Door";
					}
					if ( e.getId().toString().substring(12).equals("spruce_door")) {
						mcDoor = "Spruce Door";
					}
					if ( e.getId().toString().substring(12).equals("oak_door")) {
						mcDoor = "Oak Door";
					}
					if ( e.getId().toString().substring(12).equals("cherry_door")) {
						mcDoor = "Cherry Door";
					}
					if ( e.getId().toString().substring(12).equals("warped_door")) {
						mcDoor = "Warped Door";
					}
					
					addBlock(e, design+" "+mcDoor);
				});
	}

}
