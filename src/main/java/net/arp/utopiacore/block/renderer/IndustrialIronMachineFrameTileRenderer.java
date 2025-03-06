package net.arp.utopiacore.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.arp.utopiacore.block.model.IndustrialIronMachineFrameBlockModel;
import net.arp.utopiacore.block.entity.IndustrialIronMachineFrameTileEntity;

public class IndustrialIronMachineFrameTileRenderer extends GeoBlockRenderer<IndustrialIronMachineFrameTileEntity> {
	public IndustrialIronMachineFrameTileRenderer() {
		super(new IndustrialIronMachineFrameBlockModel());
	}

	@Override
	public RenderType getRenderType(IndustrialIronMachineFrameTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
