package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.display.AndesiteMachineFrameDisplayItem;

public class AndesiteMachineFrameDisplayModel extends GeoModel<AndesiteMachineFrameDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(AndesiteMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(AndesiteMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(AndesiteMachineFrameDisplayItem entity) {
		return new ResourceLocation("utopiacore", "textures/block/andesite_machine_frame.png");
	}
}
