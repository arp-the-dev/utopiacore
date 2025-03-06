
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.arp.utopiacore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.arp.utopiacore.block.SteelMachineFrameBlock;
import net.arp.utopiacore.block.IndustrialIronMachineFrameBlock;
import net.arp.utopiacore.block.CreativeMachineFrameBlock;
import net.arp.utopiacore.block.CopperMachineFrameBlock;
import net.arp.utopiacore.block.BronzeMachineFrameBlock;
import net.arp.utopiacore.block.BrassMachineFrameBlock;
import net.arp.utopiacore.block.AndesiteMachineFrameBlock;
import net.arp.utopiacore.UtopiacoreMod;

public class UtopiacoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UtopiacoreMod.MODID);
	public static final RegistryObject<Block> CREATIVE_MACHINE_FRAME = REGISTRY.register("creative_machine_frame", () -> new CreativeMachineFrameBlock());
	public static final RegistryObject<Block> ANDESITE_MACHINE_FRAME = REGISTRY.register("andesite_machine_frame", () -> new AndesiteMachineFrameBlock());
	public static final RegistryObject<Block> COPPER_MACHINE_FRAME = REGISTRY.register("copper_machine_frame", () -> new CopperMachineFrameBlock());
	public static final RegistryObject<Block> BRASS_MACHINE_FRAME = REGISTRY.register("brass_machine_frame", () -> new BrassMachineFrameBlock());
	public static final RegistryObject<Block> BRONZE_MACHINE_FRAME = REGISTRY.register("bronze_machine_frame", () -> new BronzeMachineFrameBlock());
	public static final RegistryObject<Block> INDUSTRIAL_IRON_MACHINE_FRAME = REGISTRY.register("industrial_iron_machine_frame", () -> new IndustrialIronMachineFrameBlock());
	public static final RegistryObject<Block> STEEL_MACHINE_FRAME = REGISTRY.register("steel_machine_frame", () -> new SteelMachineFrameBlock());
}
