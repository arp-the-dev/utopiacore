package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.display.BrassMachineFrameDisplayItem;

public class BrassMachineFrameDisplayModel extends GeoModel<BrassMachineFrameDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BrassMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrassMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrassMachineFrameDisplayItem entity) {
		return new ResourceLocation("utopiacore", "textures/block/brass_machine_frame.png");
	}
}
