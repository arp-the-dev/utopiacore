package net.arp.utopiacore.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.arp.utopiacore.block.display.IndustrialIronMachineFrameDisplayItem;

public class IndustrialIronMachineFrameDisplayModel extends GeoModel<IndustrialIronMachineFrameDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(IndustrialIronMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "animations/default_machine_frame_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(IndustrialIronMachineFrameDisplayItem animatable) {
		return new ResourceLocation("utopiacore", "geo/default_machine_frame_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(IndustrialIronMachineFrameDisplayItem entity) {
		return new ResourceLocation("utopiacore", "textures/block/industrial_iron_machine_frame.png");
	}
}
