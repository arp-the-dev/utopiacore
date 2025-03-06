package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.AndesiteMachineFrameBlockModel;
import net.arp.utopiacore.block.entity.AndesiteMachineFrameTileEntity;

public class AndesiteMachineFrameTileRenderer extends GeoBlockRenderer<AndesiteMachineFrameTileEntity> {
	public AndesiteMachineFrameTileRenderer() {
		super(new AndesiteMachineFrameBlockModel());
	}

	@Override
	public RenderType getRenderType(AndesiteMachineFrameTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
