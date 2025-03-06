package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.BronzeMachineFrameDisplayModel;
import net.arp.utopiacore.block.display.BronzeMachineFrameDisplayItem;

public class BronzeMachineFrameDisplayItemRenderer extends GeoItemRenderer<BronzeMachineFrameDisplayItem> {
	public BronzeMachineFrameDisplayItemRenderer() {
		super(new BronzeMachineFrameDisplayModel());
	}

	@Override
	public RenderType getRenderType(BronzeMachineFrameDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
