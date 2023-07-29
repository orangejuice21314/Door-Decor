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
	
	//TODO: check if i can copy door item properties 
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<BlockItem> DAROAK_DOOR = ITEMS.register("daroak_door", 
			() -> new BlockItem(BlockInit.DAROAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CHEOAK_DOOR = ITEMS.register("cheoak_door", 
			() -> new BlockItem(BlockInit.CHEOAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CRIOAK_DOOR = ITEMS.register("crioak_door", 
			() -> new BlockItem(BlockInit.CRIOAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> JUNOAK_DOOR = ITEMS.register("junoak_door", 
			() -> new BlockItem(BlockInit.JUNOAK_DOOR.get(), new Item.Properties()));  

	public static final RegistryObject<BlockItem> BIROAK_DOOR = ITEMS.register("biroak_door", 
			() -> new BlockItem(BlockInit.BIROAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> MANOAK_DOOR = ITEMS.register("manoak_door", 
			() -> new BlockItem(BlockInit.MANOAK_DOOR.get(), new Item.Properties()));  
	
	public static final RegistryObject<BlockItem> WAROAK_DOOR = ITEMS.register("waroak_door", 
			() -> new BlockItem(BlockInit.WAROAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> SPROAK_DOOR = ITEMS.register("sproak_door", 
			() -> new BlockItem(BlockInit.SPROAK_DOOR.get(), new Item.Properties()));  
	
	public static final RegistryObject<BlockItem> ACAOAK_DOOR = ITEMS.register("acaoak_door", 
			() -> new BlockItem(BlockInit.ACAOAK_DOOR.get(), new Item.Properties()));  
	
	///////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<BlockItem> OAKDARK_OAK_DOOR = ITEMS.register("oakdark_oak_door", 
			() -> new BlockItem(BlockInit.OAKDARK_OAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> ACADARK_OAK_DOOR = ITEMS.register("acadark_oak_door", 
			() -> new BlockItem(BlockInit.ACADARK_OAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> BIRDARK_OAK_DOOR = ITEMS.register("birdark_oak_door", 
			() -> new BlockItem(BlockInit.BIRDARK_OAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> SPRDARK_OAK_DOOR = ITEMS.register("sprdark_oak_door", 
			() -> new BlockItem(BlockInit.SPRDARK_OAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CHEDARK_OAK_DOOR = ITEMS.register("chedark_oak_door", 
			() -> new BlockItem(BlockInit.CHEDARK_OAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CRIDARK_OAK_DOOR = ITEMS.register("cridark_oak_door", 
			() -> new BlockItem(BlockInit.CRIDARK_OAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> WARDARK_OAK_DOOR = ITEMS.register("wardark_oak_door", 
			() -> new BlockItem(BlockInit.WARDARK_OAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> JUNDARK_OAK_DOOR = ITEMS.register("jundark_oak_door", 
			() -> new BlockItem(BlockInit.JUNDARK_OAK_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> MANDARK_OAK_DOOR = ITEMS.register("mandark_oak_door", 
			() -> new BlockItem(BlockInit.MANDARK_OAK_DOOR.get(), new Item.Properties())); 
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<BlockItem> DARACACIA_DOOR = ITEMS.register("daracacia_door", 
			() -> new BlockItem(BlockInit.DARACACIA_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CHEACACIA_DOOR = ITEMS.register("cheacacia_door", 
			() -> new BlockItem(BlockInit.CHEACACIA_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CRIACACIA_DOOR = ITEMS.register("criacacia_door", 
			() -> new BlockItem(BlockInit.CRIACACIA_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> JUNACACIA_DOOR = ITEMS.register("junacacia_door", 
			() -> new BlockItem(BlockInit.JUNACACIA_DOOR.get(), new Item.Properties()));  

	public static final RegistryObject<BlockItem> BIRACACIA_DOOR = ITEMS.register("biracacia_door", 
			() -> new BlockItem(BlockInit.BIRACACIA_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> MANACACIA_DOOR = ITEMS.register("manacacia_door", 
			() -> new BlockItem(BlockInit.MANACACIA_DOOR.get(), new Item.Properties()));  
	
	public static final RegistryObject<BlockItem> WARACACIA_DOOR = ITEMS.register("waracacia_door", 
			() -> new BlockItem(BlockInit.WARACACIA_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> SPRACACIA_DOOR = ITEMS.register("spracacia_door", 
			() -> new BlockItem(BlockInit.SPRACACIA_DOOR.get(), new Item.Properties()));  
	
	public static final RegistryObject<BlockItem> OAKACACIA_DOOR = ITEMS.register("oakacacia_door", 
			() -> new BlockItem(BlockInit.OAKACACIA_DOOR.get(), new Item.Properties()));  
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<BlockItem> DARJUNGLE_DOOR = ITEMS.register("darjungle_door", 
			() -> new BlockItem(BlockInit.DARJUNGLE_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CHEJUNGLE_DOOR = ITEMS.register("chejungle_door", 
			() -> new BlockItem(BlockInit.CHEJUNGLE_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CRIJUNGLE_DOOR = ITEMS.register("crijungle_door", 
			() -> new BlockItem(BlockInit.CRIJUNGLE_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> ACAJUNGLE_DOOR = ITEMS.register("acajungle_door", 
			() -> new BlockItem(BlockInit.ACAJUNGLE_DOOR.get(), new Item.Properties())); 

	public static final RegistryObject<BlockItem> BIRJUNGLE_DOOR = ITEMS.register("birjungle_door", 
			() -> new BlockItem(BlockInit.BIRJUNGLE_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> MANJUNGLE_DOOR = ITEMS.register("manjungle_door", 
			() -> new BlockItem(BlockInit.MANJUNGLE_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> WARJUNGLE_DOOR = ITEMS.register("warjungle_door", 
			() -> new BlockItem(BlockInit.WARJUNGLE_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> SPRJUNGLE_DOOR = ITEMS.register("sprjungle_door", 
			() -> new BlockItem(BlockInit.SPRJUNGLE_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> OAKJUNGLE_DOOR = ITEMS.register("oakjungle_door", 
			() -> new BlockItem(BlockInit.OAKJUNGLE_DOOR.get(), new Item.Properties())); 
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<BlockItem> DARCHERRY_DOOR = ITEMS.register("darcherry_door", 
			() -> new BlockItem(BlockInit.DARCHERRY_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> JUNCHERRY_DOOR = ITEMS.register("juncherry_door", 
			() -> new BlockItem(BlockInit.JUNCHERRY_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> CRICHERRY_DOOR = ITEMS.register("cricherry_door", 
			() -> new BlockItem(BlockInit.CRICHERRY_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> ACACHERRY_DOOR = ITEMS.register("acacherry_door", 
			() -> new BlockItem(BlockInit.ACACHERRY_DOOR.get(), new Item.Properties())); 

	public static final RegistryObject<BlockItem> BIRCHERRY_DOOR = ITEMS.register("bircherry_door", 
			() -> new BlockItem(BlockInit.BIRCHERRY_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> MANCHERRY_DOOR = ITEMS.register("mancherry_door", 
			() -> new BlockItem(BlockInit.MANCHERRY_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> WARCHERRY_DOOR = ITEMS.register("warcherry_door", 
			() -> new BlockItem(BlockInit.WARCHERRY_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> SPRCHERRY_DOOR = ITEMS.register("sprcherry_door", 
			() -> new BlockItem(BlockInit.SPRCHERRY_DOOR.get(), new Item.Properties())); 
	
	public static final RegistryObject<BlockItem> OAKCHERRY_DOOR = ITEMS.register("oakcherry_door", 
			() -> new BlockItem(BlockInit.OAKCHERRY_DOOR.get(), new Item.Properties())); 
	
	public static Collection<RegistryObject<Item>> orderedItems() {
		return ITEMS.getEntries();
	}
}
