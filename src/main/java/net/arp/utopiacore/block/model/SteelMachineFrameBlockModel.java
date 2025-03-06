package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.entity.SteelMachineFrameTileEntity;

public class SteelMachineFrameBlockModel extends GeoModel<SteelMachineFrameTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(SteelMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SteelMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SteelMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "textures/block/steel_machine_frame.png");
	}
}
