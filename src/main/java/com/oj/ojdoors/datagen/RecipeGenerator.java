package com.oj.ojdoors.datagen;

import java.util.Collection;
import java.util.function.Consumer;

import com.oj.ojdoors.init.BlockInit;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

public class RecipeGenerator extends RecipeProvider {
	
	public RecipeGenerator(PackOutput p_248933_) {
		super(p_248933_);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> recipeConsumer) {	
    	Collection<RegistryObject<Block>> blocks = BlockInit.orderedItems();
		blocks.stream()
			.forEach(
					e -> {
					Block mcPlank = null;
					//System.out.println(e.getId().toString().substring(9,12));
					//TODO: replace with switch 
					if (e.getId().toString().substring(9,12).equals("aca")) {
						mcPlank = Blocks.ACACIA_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("dar")) {
						mcPlank = Blocks.DARK_OAK_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("che")) {
						mcPlank = Blocks.CHERRY_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("cri")) {
						mcPlank = Blocks.CRIMSON_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("jun")) {
						mcPlank = Blocks.JUNGLE_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("bir")) {
						mcPlank = Blocks.BIRCH_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("man")) {
						mcPlank = Blocks.MANGROVE_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("war")) {
						mcPlank = Blocks.WARPED_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("spr")) {
						mcPlank = Blocks.SPRUCE_PLANKS;
					}
					if (e.getId().toString().substring(9,12).equals("oak")) {
						mcPlank = Blocks.OAK_PLANKS;
					}
					
					//TODO: make this more efficient by getting rid of if statement spam
					String doorName = e.getId().toString().substring(12);
					Block mcDoor = null;
					if (doorName.equals("oak_door")) {
						mcDoor = Blocks.OAK_DOOR;
					}
					if (doorName.equals("dark_oak_door")) {
						mcDoor = Blocks.DARK_OAK_DOOR;
					}
					if (doorName.equals("cherry_door")) {
						mcDoor = Blocks.CHERRY_DOOR;
					}
					if (doorName.equals("crimson_door")) {
						mcDoor = Blocks.CRIMSON_DOOR;
					}
					if (doorName.equals("jungle_door")){
						mcDoor = Blocks.JUNGLE_DOOR;
					}
					if (doorName.equals("acacia_door")) {
						mcDoor = Blocks.ACACIA_DOOR;
					}
					if (doorName.equals("birch_door")) {
						mcDoor = Blocks.BIRCH_DOOR;
					}
					if (doorName.equals("mangrove_door")) {
						mcDoor = Blocks.MANGROVE_DOOR;
					}
					if (doorName.equals("warped_door")) {
						mcDoor = Blocks.WARPED_DOOR;
					}
					if (doorName.equals("spruce_door")) {
						mcDoor = Blocks.SPRUCE_DOOR;
					}
					if (mcPlank != null && mcDoor != null) {
						{
						ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, e.get())
						.group(new ResourceLocation("oj_doors", "customized_wooden_doors").toString())
						.requires(mcPlank)
						.requires(mcDoor)
						.unlockedBy("has_"+mcPlank.getName().toString(), has(mcPlank.asItem()))
						.unlockedBy("has_"+mcDoor.getName().toString(), has(mcDoor))
						.save(recipeConsumer);
						}
					}
			
					});
	}
	
	
}
