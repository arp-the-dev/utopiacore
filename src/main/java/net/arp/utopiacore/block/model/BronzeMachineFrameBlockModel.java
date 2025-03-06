package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.entity.BronzeMachineFrameTileEntity;

public class BronzeMachineFrameBlockModel extends GeoModel<BronzeMachineFrameTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BronzeMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BronzeMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BronzeMachineFrameTileEntity animatable) {
		return new ResourceLocation("utopiacore", "textures/block/bronze_iron_machine_frame.png");
	}
}
