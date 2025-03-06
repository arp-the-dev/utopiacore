package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.CreativeMachineFrameBlockModel;
import net.arp.utopiacore.block.entity.CreativeMachineFrameTileEntity;

public class CreativeMachineFrameTileRenderer extends GeoBlockRenderer<CreativeMachineFrameTileEntity> {
	public CreativeMachineFrameTileRenderer() {
		super(new CreativeMachineFrameBlockModel());
	}

	@Override
	public RenderType getRenderType(CreativeMachineFrameTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
