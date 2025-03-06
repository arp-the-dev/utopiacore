package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.display.BronzeMachineFrameDisplayItem;

public class BronzeMachineFrameDisplayModel extends GeoModel<BronzeMachineFrameDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BronzeMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BronzeMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BronzeMachineFrameDisplayItem entity) {
		return new ResourceLocation("utopiacore", "textures/block/bronze_iron_machine_frame.png");
	}
}
