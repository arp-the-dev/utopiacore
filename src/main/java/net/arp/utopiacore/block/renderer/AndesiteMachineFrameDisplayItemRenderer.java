package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.AndesiteMachineFrameDisplayModel;
import net.arp.utopiacore.block.display.AndesiteMachineFrameDisplayItem;

public class AndesiteMachineFrameDisplayItemRenderer extends GeoItemRenderer<AndesiteMachineFrameDisplayItem> {
	public AndesiteMachineFrameDisplayItemRenderer() {
		super(new AndesiteMachineFrameDisplayModel());
	}

	@Override
	public RenderType getRenderType(AndesiteMachineFrameDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
