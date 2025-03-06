package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.CopperMachineFrameDisplayModel;
import net.arp.utopiacore.block.display.CopperMachineFrameDisplayItem;

public class CopperMachineFrameDisplayItemRenderer extends GeoItemRenderer<CopperMachineFrameDisplayItem> {
	public CopperMachineFrameDisplayItemRenderer() {
		super(new CopperMachineFrameDisplayModel());
	}

	@Override
	public RenderType getRenderType(CopperMachineFrameDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
