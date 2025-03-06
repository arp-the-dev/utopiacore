package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.entity.IndustrialIronMachineFrameTileEntity;

public class IndustrialIronMachineFrameBlockModel extends GeoModel<IndustrialIronMachineFrameTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(IndustrialIronMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndustrialIronMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndustrialIronMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "textures/block/industrial_iron_machine_frame.png");
	}
}
