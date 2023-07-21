package com.oj.ojdoors.init;

import java.util.Collection;

import com.oj.ojdoors.oj_doors;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, oj_doors.MODID);
    
    public static final RegistryObject<CreativeModeTab> DOOR_DECOR_TAB = CREATIVE_MODE_TABS.register(oj_doors.MODID, () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ItemInit.OAKDARK_OAK_DOOR.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                add(output, ItemInit.orderedItems());
            }).build());
	
	
	
	//thanks choonster
	private static void add(final CreativeModeTab.Output output, final Collection<RegistryObject<Item>> items) {
		items.stream()
				.map(RegistryObject::get)
				.forEach(output::accept);
	}
	
}
