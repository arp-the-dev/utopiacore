package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.BrassMachineFrameBlockModel;
import net.arp.utopiacore.block.entity.BrassMachineFrameTileEntity;

public class BrassMachineFrameTileRenderer extends GeoBlockRenderer<BrassMachineFrameTileEntity> {
	public BrassMachineFrameTileRenderer() {
		super(new BrassMachineFrameBlockModel());
	}

	@Override
	public RenderType getRenderType(BrassMachineFrameTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
