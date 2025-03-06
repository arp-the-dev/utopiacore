package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.entity.CopperMachineFrameTileEntity;

public class CopperMachineFrameBlockModel extends GeoModel<CopperMachineFrameTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CopperMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "textures/block/copper_machine_frame.png");
	}
}
