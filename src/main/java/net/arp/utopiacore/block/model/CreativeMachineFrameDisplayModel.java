package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.display.CreativeMachineFrameDisplayItem;

public class CreativeMachineFrameDisplayModel extends GeoModel<CreativeMachineFrameDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(CreativeMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "animations/creative_machine_frame.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CreativeMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "geo/creative_machine_frame.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CreativeMachineFrameDisplayItem entity) {
		return new ResourceLocation("utopiacore", "textures/block/creative_machine_frame.png");
	}
}
