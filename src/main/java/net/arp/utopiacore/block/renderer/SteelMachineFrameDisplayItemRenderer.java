package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.SteelMachineFrameDisplayModel;
import net.arp.utopiacore.block.display.SteelMachineFrameDisplayItem;

public class SteelMachineFrameDisplayItemRenderer extends GeoItemRenderer<SteelMachineFrameDisplayItem> {
	public SteelMachineFrameDisplayItemRenderer() {
		super(new SteelMachineFrameDisplayModel());
	}

	@Override
	public RenderType getRenderType(SteelMachineFrameDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
