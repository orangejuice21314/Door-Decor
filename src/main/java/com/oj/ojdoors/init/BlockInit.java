package com.oj.ojdoors.init;

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

	public static final RegistryObject<DoorBlock> DOAK_DOOR = BLOCKS.register("doak_door",
			() -> new DoorBlock(Block.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
}
