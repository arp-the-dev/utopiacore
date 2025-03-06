package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.entity.CreativeMachineFrameTileEntity;

public class CreativeMachineFrameBlockModel extends GeoModel<CreativeMachineFrameTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CreativeMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "animations/creative_machine_frame.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CreativeMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "geo/creative_machine_frame.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CreativeMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "textures/block/creative_machine_frame.png");
	}
}
