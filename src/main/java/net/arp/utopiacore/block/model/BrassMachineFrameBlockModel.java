package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.entity.BrassMachineFrameTileEntity;

public class BrassMachineFrameBlockModel extends GeoModel<BrassMachineFrameTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrassMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrassMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrassMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "textures/block/brass_machine_frame.png");
	}
}
