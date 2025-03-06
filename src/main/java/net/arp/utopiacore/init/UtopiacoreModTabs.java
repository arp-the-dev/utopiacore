
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.arp.utopiacore.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.arp.utopiacore.UtopiacoreMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UtopiacoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UtopiacoreMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(UtopiacoreModBlocks.CREATIVE_MACHINE_FRAME.get().asItem());
			tabData.accept(UtopiacoreModBlocks.ANDESITE_MACHINE_FRAME.get().asItem());
			tabData.accept(UtopiacoreModBlocks.COPPER_MACHINE_FRAME.get().asItem());
			tabData.accept(UtopiacoreModBlocks.BRASS_MACHINE_FRAME.get().asItem());
			tabData.accept(UtopiacoreModBlocks.BRONZE_MACHINE_FRAME.get().asItem());
			tabData.accept(UtopiacoreModBlocks.INDUSTRIAL_IRON_MACHINE_FRAME.get().asItem());
			tabData.accept(UtopiacoreModBlocks.STEEL_MACHINE_FRAME.get().asItem());
		}
	}
}
