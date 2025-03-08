package net.arp.utopiacore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.arp.utopiacore.block.display.SteelMachineFrameDisplayItem;
import net.arp.utopiacore.block.display.IndustrialIronMachineFrameDisplayItem;
import net.arp.utopiacore.block.display.CreativeMachineFrameDisplayItem;
import net.arp.utopiacore.block.display.CopperMachineFrameDisplayItem;
import net.arp.utopiacore.block.display.BronzeMachineFrameDisplayItem;
import net.arp.utopiacore.block.display.BrassMachineFrameDisplayItem;
import net.arp.utopiacore.block.display.AndesiteMachineFrameDisplayItem;
import net.arp.utopiacore.UtopiacoreMod;

public class UtopiacoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UtopiacoreMod.MODID);
	public static final RegistryObject<Item> CREATIVE_MACHINE_FRAME = REGISTRY.register(UtopiacoreModBlocks.CREATIVE_MACHINE_FRAME.getId().getPath(),
			() -> new CreativeMachineFrameDisplayItem(UtopiacoreModBlocks.CREATIVE_MACHINE_FRAME.get(), new Item.Properties()));
	public static final RegistryObject<Item> ANDESITE_MACHINE_FRAME = REGISTRY.register(UtopiacoreModBlocks.ANDESITE_MACHINE_FRAME.getId().getPath(),
			() -> new AndesiteMachineFrameDisplayItem(UtopiacoreModBlocks.ANDESITE_MACHINE_FRAME.get(), new Item.Properties()));
	public static final RegistryObject<Item> COPPER_MACHINE_FRAME = REGISTRY.register(UtopiacoreModBlocks.COPPER_MACHINE_FRAME.getId().getPath(),
			() -> new CopperMachineFrameDisplayItem(UtopiacoreModBlocks.COPPER_MACHINE_FRAME.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRASS_MACHINE_FRAME = REGISTRY.register(UtopiacoreModBlocks.BRASS_MACHINE_FRAME.getId().getPath(),
			() -> new BrassMachineFrameDisplayItem(UtopiacoreModBlocks.BRASS_MACHINE_FRAME.get(), new Item.Properties()));
	public static final RegistryObject<Item> BRONZE_MACHINE_FRAME = REGISTRY.register(UtopiacoreModBlocks.BRONZE_MACHINE_FRAME.getId().getPath(),
			() -> new BronzeMachineFrameDisplayItem(UtopiacoreModBlocks.BRONZE_MACHINE_FRAME.get(), new Item.Properties()));
	public static final RegistryObject<Item> INDUSTRIAL_IRON_MACHINE_FRAME = REGISTRY.register(UtopiacoreModBlocks.INDUSTRIAL_IRON_MACHINE_FRAME.getId().getPath(),
			() -> new IndustrialIronMachineFrameDisplayItem(UtopiacoreModBlocks.INDUSTRIAL_IRON_MACHINE_FRAME.get(), new Item.Properties()));
	public static final RegistryObject<Item> STEEL_MACHINE_FRAME = REGISTRY.register(UtopiacoreModBlocks.STEEL_MACHINE_FRAME.getId().getPath(),
			() -> new SteelMachineFrameDisplayItem(UtopiacoreModBlocks.STEEL_MACHINE_FRAME.get(), new Item.Properties()));
}
