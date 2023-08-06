package com.oj.ojdoors.datagen;

import java.util.Collection;

import com.oj.ojdoors.oj_doors;
import com.oj.ojdoors.init.ItemInit;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemGenerator extends ItemModelProvider{

	public ItemGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, oj_doors.MODID, exFileHelper);
	}

	@Override
	protected void registerModels() {		
    	Collection<RegistryObject<Item>> items = ItemInit.orderedItems();
		items.stream()
		.forEach(
				e -> {
					String design = e.getId().toString().substring(9,12);
					String mcDoor = e.getId().toString().substring(12);
					basicItem(modLoc(design+mcDoor));
				});
	}
}
