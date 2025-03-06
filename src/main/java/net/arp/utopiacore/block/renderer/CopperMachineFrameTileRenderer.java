package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.CopperMachineFrameBlockModel;
import net.arp.utopiacore.block.entity.CopperMachineFrameTileEntity;

public class CopperMachineFrameTileRenderer extends GeoBlockRenderer<CopperMachineFrameTileEntity> {
	public CopperMachineFrameTileRenderer() {
		super(new CopperMachineFrameBlockModel());
	}

	@Override
	public RenderType getRenderType(CopperMachineFrameTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
