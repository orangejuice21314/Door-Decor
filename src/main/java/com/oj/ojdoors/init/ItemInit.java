package com.oj.ojdoors.init;

import com.oj.ojdoors.oj_doors;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, oj_doors.MODID);
	
	public static final RegistryObject<BlockItem> DOAK_DOOR = ITEMS.register("doak_door", 
			() -> new BlockItem(BlockInit.DOAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
}
