package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.entity.AndesiteMachineFrameTileEntity;

public class AndesiteMachineFrameBlockModel extends GeoModel<AndesiteMachineFrameTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(AndesiteMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AndesiteMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AndesiteMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "textures/block/andesite_machine_frame.png");
	}
}
