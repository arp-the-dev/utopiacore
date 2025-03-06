package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.BrassMachineFrameDisplayModel;
import net.arp.utopiacore.block.display.BrassMachineFrameDisplayItem;

public class BrassMachineFrameDisplayItemRenderer extends GeoItemRenderer<BrassMachineFrameDisplayItem> {
	public BrassMachineFrameDisplayItemRenderer() {
		super(new BrassMachineFrameDisplayModel());
	}

	@Override
	public RenderType getRenderType(BrassMachineFrameDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
