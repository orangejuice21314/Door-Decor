package com.oj.ojdoors.init;

import java.util.Collection;

import com.oj.ojdoors.oj_doors;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, oj_doors.MODID);
	
	//TODO add to proper MC tag(s) so it can smelt and stuff
	
	public static final RegistryObject<BlockItem> DAROAK_DOOR = ITEMS.register("daroak_door", 
			() -> new BlockItem(BlockInit.DAROAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> CHEOAK_DOOR = ITEMS.register("cheoak_door", 
			() -> new BlockItem(BlockInit.CHEOAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> CRIOAK_DOOR = ITEMS.register("crioak_door", 
			() -> new BlockItem(BlockInit.CRIOAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> JUNOAK_DOOR = ITEMS.register("junoak_door", 
			() -> new BlockItem(BlockInit.JUNOAK_DOOR.get(), new Item.Properties())); //TODO: check 
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<BlockItem> OAKDARK_OAK_DOOR = ITEMS.register("oakdark_oak_door", 
			() -> new BlockItem(BlockInit.OAKDARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> ACADARK_OAK_DOOR = ITEMS.register("acadark_oak_door", 
			() -> new BlockItem(BlockInit.ACADARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> BIRDARK_OAK_DOOR = ITEMS.register("birdark_oak_door", 
			() -> new BlockItem(BlockInit.BIRDARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> SPRDARK_OAK_DOOR = ITEMS.register("sprdark_oak_door", 
			() -> new BlockItem(BlockInit.SPRDARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> CHEDARK_OAK_DOOR = ITEMS.register("chedark_oak_door", 
			() -> new BlockItem(BlockInit.CHEDARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> CRIDARK_OAK_DOOR = ITEMS.register("cridark_oak_door", 
			() -> new BlockItem(BlockInit.CRIDARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> WARDARK_OAK_DOOR = ITEMS.register("wardark_oak_door", 
			() -> new BlockItem(BlockInit.WARDARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> JUNDARK_OAK_DOOR = ITEMS.register("jundark_oak_door", 
			() -> new BlockItem(BlockInit.JUNDARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static final RegistryObject<BlockItem> MANDARK_OAK_DOOR = ITEMS.register("mandark_oak_door", 
			() -> new BlockItem(BlockInit.MANDARK_OAK_DOOR.get(), new Item.Properties())); //TODO: check if i can copy oak door item properties
	
	public static Collection<RegistryObject<Item>> orderedItems() {
		return ITEMS.getEntries();
	}
}
