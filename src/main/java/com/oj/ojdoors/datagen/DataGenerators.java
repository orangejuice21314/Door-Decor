package com.oj.ojdoors.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.oj.ojdoors.oj_doors;

@Mod.EventBusSubscriber(modid = oj_doors.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		final DataGenerator gen = event.getGenerator();
		final ExistingFileHelper filehelper = event.getExistingFileHelper();
		final PackOutput output = gen.getPackOutput(); 
		final var lookupProvider = event.getLookupProvider();
		
		gen.addProvider(
				event.includeClient(),
			    new BlockstateGenerator(output, filehelper)
		);
		gen.addProvider(
				event.includeClient(),
			    new ItemGenerator(output, filehelper)
		);
		gen.addProvider(
				event.includeServer(),
			    new RecipeGenerator(output)
		);
		final var blockTagsGenerator = new BlockTagsGenerator(output, lookupProvider, filehelper);
		gen.addProvider(
				event.includeServer(),
			    new ItemTagsGenerator(output, lookupProvider, blockTagsGenerator.contentsGetter(), filehelper)
		);
		gen.addProvider(
				event.includeServer(),
			    blockTagsGenerator
		);
	} 
}
