package com.oj.ojdoors.init;

import java.util.Collection;

import com.oj.ojdoors.oj_doors;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, oj_doors.MODID);

	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DAROAK_DOOR = BLOCKS.register("daroak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> CHEOAK_DOOR = BLOCKS.register("cheoak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> CRIOAK_DOOR = BLOCKS.register("crioak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.MANGROVE));
	
	public static final RegistryObject<DoorBlock> JUNOAK_DOOR = BLOCKS.register("junoak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> ACAOAK_DOOR = BLOCKS.register("acaoak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> BIROAK_DOOR = BLOCKS.register("biroak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> MANOAK_DOOR = BLOCKS.register("manoak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static final RegistryObject<DoorBlock> WAROAK_DOOR = BLOCKS.register("waroak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> SPROAK_DOOR = BLOCKS.register("sproak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> OAKDARK_OAK_DOOR = BLOCKS.register("oakdark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> ACADARK_OAK_DOOR = BLOCKS.register("acadark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> BIRDARK_OAK_DOOR = BLOCKS.register("birdark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> SPRDARK_OAK_DOOR = BLOCKS.register("sprdark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));

	public static final RegistryObject<DoorBlock> CHEDARK_OAK_DOOR = BLOCKS.register("chedark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> CRIDARK_OAK_DOOR = BLOCKS.register("cridark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
	public static final RegistryObject<DoorBlock> WARDARK_OAK_DOOR = BLOCKS.register("wardark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> JUNDARK_OAK_DOOR = BLOCKS.register("jundark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> MANDARK_OAK_DOOR = BLOCKS.register("mandark_oak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static Collection<RegistryObject<Block>> orderedItems() {
		return BLOCKS.getEntries();
	}
}
