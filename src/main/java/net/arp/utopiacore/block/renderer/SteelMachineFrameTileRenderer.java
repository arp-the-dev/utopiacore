package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.SteelMachineFrameBlockModel;
import net.arp.utopiacore.block.entity.SteelMachineFrameTileEntity;

public class SteelMachineFrameTileRenderer extends GeoBlockRenderer<SteelMachineFrameTileEntity> {
	public SteelMachineFrameTileRenderer() {
		super(new SteelMachineFrameBlockModel());
	}

	@Override
	public RenderType getRenderType(SteelMachineFrameTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
