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
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> CHEOAK_DOOR = BLOCKS.register("cheoak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> CRIOAK_DOOR = BLOCKS.register("crioak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
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
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DARACACIA_DOOR = BLOCKS.register("daracacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> CHEACACIA_DOOR = BLOCKS.register("cheacacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> CRIACACIA_DOOR = BLOCKS.register("criacacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
	public static final RegistryObject<DoorBlock> JUNACACIA_DOOR = BLOCKS.register("junacacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.JUNGLE_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> OAKACACIA_DOOR = BLOCKS.register("oakacacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> BIRACACIA_DOOR = BLOCKS.register("biracacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> MANACACIA_DOOR = BLOCKS.register("manacacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static final RegistryObject<DoorBlock> WARACACIA_DOOR = BLOCKS.register("waracacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> SPRACACIA_DOOR = BLOCKS.register("spracacia_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DARJUNGLE_DOOR = BLOCKS.register("darjungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> CHEJUNGLE_DOOR = BLOCKS.register("chejungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> CRIJUNGLE_DOOR = BLOCKS.register("crijungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
	public static final RegistryObject<DoorBlock> ACAJUNGLE_DOOR = BLOCKS.register("acajungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> OAKJUNGLE_DOOR = BLOCKS.register("oakjungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> BIRJUNGLE_DOOR = BLOCKS.register("birjungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> MANJUNGLE_DOOR = BLOCKS.register("manjungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static final RegistryObject<DoorBlock> WARJUNGLE_DOOR = BLOCKS.register("warjungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> SPRJUNGLE_DOOR = BLOCKS.register("sprjungle_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DARCHERRY_DOOR = BLOCKS.register("darcherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> JUNCHERRY_DOOR = BLOCKS.register("juncherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> CRICHERRY_DOOR = BLOCKS.register("cricherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
	public static final RegistryObject<DoorBlock> ACACHERRY_DOOR = BLOCKS.register("acacherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> OAKCHERRY_DOOR = BLOCKS.register("oakcherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> BIRCHERRY_DOOR = BLOCKS.register("bircherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> MANCHERRY_DOOR = BLOCKS.register("mancherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static final RegistryObject<DoorBlock> WARCHERRY_DOOR = BLOCKS.register("warcherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> SPRCHERRY_DOOR = BLOCKS.register("sprcherry_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DARBIRCH_DOOR = BLOCKS.register("darbirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> JUNBIRCH_DOOR = BLOCKS.register("junbirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> CRIBIRCH_DOOR = BLOCKS.register("cribirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
	public static final RegistryObject<DoorBlock> ACABIRCH_DOOR = BLOCKS.register("acabirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> OAKBIRCH_DOOR = BLOCKS.register("oakbirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> CHEBIRCH_DOOR = BLOCKS.register("chebirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> MANBIRCH_DOOR = BLOCKS.register("manbirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static final RegistryObject<DoorBlock> WARBIRCH_DOOR = BLOCKS.register("warbirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> SPRBIRCH_DOOR = BLOCKS.register("sprbirch_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DARCRIMSON_DOOR = BLOCKS.register("darcrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> JUNCRIMSON_DOOR = BLOCKS.register("juncrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> BIRCRIMSON_DOOR = BLOCKS.register("bircrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> ACACRIMSON_DOOR = BLOCKS.register("acacrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> OAKCRIMSON_DOOR = BLOCKS.register("oakcrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> CHECRIMSON_DOOR = BLOCKS.register("checrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> MANCRIMSON_DOOR = BLOCKS.register("mancrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static final RegistryObject<DoorBlock> WARCRIMSON_DOOR = BLOCKS.register("warcrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> SPRCRIMSON_DOOR = BLOCKS.register("sprcrimson_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DARWARPED_DOOR = BLOCKS.register("darwarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> JUNWARPED_DOOR = BLOCKS.register("junwarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> BIRWARPED_DOOR = BLOCKS.register("birwarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> ACAWARPED_DOOR = BLOCKS.register("acawarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> OAKWARPED_DOOR = BLOCKS.register("oakwarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> CHEWARPED_DOOR = BLOCKS.register("chewarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> MANWARPED_DOOR = BLOCKS.register("manwarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static final RegistryObject<DoorBlock> CRIWARPED_DOOR = BLOCKS.register("criwarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
	public static final RegistryObject<DoorBlock> SPRWARPED_DOOR = BLOCKS.register("sprwarped_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DARMANGROVE_DOOR = BLOCKS.register("darmangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> JUNMANGROVE_DOOR = BLOCKS.register("junmangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> BIRMANGROVE_DOOR = BLOCKS.register("birmangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> ACAMANGROVE_DOOR = BLOCKS.register("acamangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> OAKMANGROVE_DOOR = BLOCKS.register("oakmangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> CHEMANGROVE_DOOR = BLOCKS.register("chemangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> WARMANGROVE_DOOR = BLOCKS.register("warmangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> CRIMANGROVE_DOOR = BLOCKS.register("crimangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
	public static final RegistryObject<DoorBlock> SPRMANGROVE_DOOR = BLOCKS.register("sprmangrove_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.SPRUCE));
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static final RegistryObject<DoorBlock> DARSPRUCE_DOOR = BLOCKS.register("darspruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.DARK_OAK_DOOR), BlockSetType.DARK_OAK));
	
	public static final RegistryObject<DoorBlock> JUNSPRUCE_DOOR = BLOCKS.register("junspruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.SPRUCE_DOOR), BlockSetType.JUNGLE));
	
	public static final RegistryObject<DoorBlock> BIRSPRUCE_DOOR = BLOCKS.register("birspruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.BIRCH_DOOR), BlockSetType.BIRCH));
	
	public static final RegistryObject<DoorBlock> ACASPRUCE_DOOR = BLOCKS.register("acaspruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.ACACIA_DOOR), BlockSetType.ACACIA));
	
	public static final RegistryObject<DoorBlock> OAKSPRUCE_DOOR = BLOCKS.register("oakspruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
	
	public static final RegistryObject<DoorBlock> CHESPRUCE_DOOR = BLOCKS.register("chespruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
	
	public static final RegistryObject<DoorBlock> WARSPRUCE_DOOR = BLOCKS.register("warspruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.WARPED_DOOR), BlockSetType.WARPED));
	
	public static final RegistryObject<DoorBlock> CRISPRUCE_DOOR = BLOCKS.register("crispruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.CRIMSON_DOOR), BlockSetType.CRIMSON));
	
	public static final RegistryObject<DoorBlock> MANSPRUCE_DOOR = BLOCKS.register("manspruce_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.MANGROVE_DOOR), BlockSetType.MANGROVE));
	
	public static Collection<RegistryObject<Block>> orderedItems() {
		return BLOCKS.getEntries();
	}
}
