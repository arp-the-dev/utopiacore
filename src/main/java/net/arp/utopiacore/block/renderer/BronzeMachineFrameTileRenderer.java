package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.BronzeMachineFrameBlockModel;
import net.arp.utopiacore.block.entity.BronzeMachineFrameTileEntity;

public class BronzeMachineFrameTileRenderer extends GeoBlockRenderer<BronzeMachineFrameTileEntity> {
	public BronzeMachineFrameTileRenderer() {
		super(new BronzeMachineFrameBlockModel());
	}

	@Override
	public RenderType getRenderType(BronzeMachineFrameTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
