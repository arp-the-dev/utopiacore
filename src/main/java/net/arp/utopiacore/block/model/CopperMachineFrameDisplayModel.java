package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.display.CopperMachineFrameDisplayItem;

public class CopperMachineFrameDisplayModel extends GeoModel<CopperMachineFrameDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CopperMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CopperMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CopperMachineFrameDisplayItem entity) {
		return new ResourceLocation("utopiacore", "textures/block/copper_machine_frame.png");
	}
}
