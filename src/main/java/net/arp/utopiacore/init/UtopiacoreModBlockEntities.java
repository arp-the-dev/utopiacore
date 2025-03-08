package net.arp.utopiacore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.arp.utopiacore.block.entity.SteelMachineFrameTileEntity;
import net.arp.utopiacore.block.entity.IndustrialIronMachineFrameTileEntity;
import net.arp.utopiacore.block.entity.CreativeMachineFrameTileEntity;
import net.arp.utopiacore.block.entity.CopperMachineFrameTileEntity;
import net.arp.utopiacore.block.entity.BronzeMachineFrameTileEntity;
import net.arp.utopiacore.block.entity.BrassMachineFrameTileEntity;
import net.arp.utopiacore.block.entity.AndesiteMachineFrameTileEntity;
import net.arp.utopiacore.UtopiacoreMod;

public class UtopiacoreModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, UtopiacoreMod.MODID);
	public static final RegistryObject<BlockEntityType<CreativeMachineFrameTileEntity>> CREATIVE_MACHINE_FRAME = REGISTRY.register("creative_machine_frame",
			() -> BlockEntityType.Builder.of(CreativeMachineFrameTileEntity::new, UtopiacoreModBlocks.CREATIVE_MACHINE_FRAME.get()).build(null));
	public static final RegistryObject<BlockEntityType<AndesiteMachineFrameTileEntity>> ANDESITE_MACHINE_FRAME = REGISTRY.register("andesite_machine_frame",
			() -> BlockEntityType.Builder.of(AndesiteMachineFrameTileEntity::new, UtopiacoreModBlocks.ANDESITE_MACHINE_FRAME.get()).build(null));
	public static final RegistryObject<BlockEntityType<CopperMachineFrameTileEntity>> COPPER_MACHINE_FRAME = REGISTRY.register("copper_machine_frame",
			() -> BlockEntityType.Builder.of(CopperMachineFrameTileEntity::new, UtopiacoreModBlocks.COPPER_MACHINE_FRAME.get()).build(null));
	public static final RegistryObject<BlockEntityType<BrassMachineFrameTileEntity>> BRASS_MACHINE_FRAME = REGISTRY.register("brass_machine_frame",
			() -> BlockEntityType.Builder.of(BrassMachineFrameTileEntity::new, UtopiacoreModBlocks.BRASS_MACHINE_FRAME.get()).build(null));
	public static final RegistryObject<BlockEntityType<BronzeMachineFrameTileEntity>> BRONZE_MACHINE_FRAME = REGISTRY.register("bronze_machine_frame",
			() -> BlockEntityType.Builder.of(BronzeMachineFrameTileEntity::new, UtopiacoreModBlocks.BRONZE_MACHINE_FRAME.get()).build(null));
	public static final RegistryObject<BlockEntityType<IndustrialIronMachineFrameTileEntity>> INDUSTRIAL_IRON_MACHINE_FRAME = REGISTRY.register("industrial_iron_machine_frame",
			() -> BlockEntityType.Builder.of(IndustrialIronMachineFrameTileEntity::new, UtopiacoreModBlocks.INDUSTRIAL_IRON_MACHINE_FRAME.get()).build(null));
	public static final RegistryObject<BlockEntityType<SteelMachineFrameTileEntity>> STEEL_MACHINE_FRAME = REGISTRY.register("steel_machine_frame",
			() -> BlockEntityType.Builder.of(SteelMachineFrameTileEntity::new, UtopiacoreModBlocks.STEEL_MACHINE_FRAME.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
