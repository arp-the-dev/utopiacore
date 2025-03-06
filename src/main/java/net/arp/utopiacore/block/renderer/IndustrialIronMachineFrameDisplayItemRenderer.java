package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.IndustrialIronMachineFrameDisplayModel;
import net.arp.utopiacore.block.display.IndustrialIronMachineFrameDisplayItem;

public class IndustrialIronMachineFrameDisplayItemRenderer extends GeoItemRenderer<IndustrialIronMachineFrameDisplayItem> {
	public IndustrialIronMachineFrameDisplayItemRenderer() {
		super(new IndustrialIronMachineFrameDisplayModel());
	}

	@Override
	public RenderType getRenderType(IndustrialIronMachineFrameDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
