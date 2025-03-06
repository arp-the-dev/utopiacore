package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.display.SteelMachineFrameDisplayItem;

public class SteelMachineFrameDisplayModel extends GeoModel<SteelMachineFrameDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(SteelMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SteelMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SteelMachineFrameDisplayItem entity) {
		return new ResourceLocation("utopiacore", "textures/block/steel_machine_frame.png");
	}
}
