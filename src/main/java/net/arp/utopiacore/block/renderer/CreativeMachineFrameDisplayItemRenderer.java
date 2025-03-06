package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.CreativeMachineFrameDisplayModel;
import net.arp.utopiacore.block.display.CreativeMachineFrameDisplayItem;

public class CreativeMachineFrameDisplayItemRenderer extends GeoItemRenderer<CreativeMachineFrameDisplayItem> {
	public CreativeMachineFrameDisplayItemRenderer() {
		super(new CreativeMachineFrameDisplayModel());
	}

	@Override
	public RenderType getRenderType(CreativeMachineFrameDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
