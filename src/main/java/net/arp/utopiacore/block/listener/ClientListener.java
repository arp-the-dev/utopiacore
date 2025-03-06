package net.arp.utopiacore.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.arp.utopiacore.init.UtopiacoreModBlockEntities;
import net.arp.utopiacore.block.renderer.SteelMachineFrameTileRenderer;
import net.arp.utopiacore.block.renderer.IndustrialIronMachineFrameTileRenderer;
import net.arp.utopiacore.block.renderer.CreativeMachineFrameTileRenderer;
import net.arp.utopiacore.block.renderer.CopperMachineFrameTileRenderer;
import net.arp.utopiacore.block.renderer.BronzeMachineFrameTileRenderer;
import net.arp.utopiacore.block.renderer.BrassMachineFrameTileRenderer;
import net.arp.utopiacore.block.renderer.AndesiteMachineFrameTileRenderer;
import net.arp.utopiacore.UtopiacoreMod;

@Mod.EventBusSubscriber(modid = UtopiacoreMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(UtopiacoreModBlockEntities.CREATIVE_MACHINE_FRAME.get(), context -> new CreativeMachineFrameTileRenderer());
		event.registerBlockEntityRenderer(UtopiacoreModBlockEntities.ANDESITE_MACHINE_FRAME.get(), context -> new AndesiteMachineFrameTileRenderer());
		event.registerBlockEntityRenderer(UtopiacoreModBlockEntities.COPPER_MACHINE_FRAME.get(), context -> new CopperMachineFrameTileRenderer());
		event.registerBlockEntityRenderer(UtopiacoreModBlockEntities.BRASS_MACHINE_FRAME.get(), context -> new BrassMachineFrameTileRenderer());
		event.registerBlockEntityRenderer(UtopiacoreModBlockEntities.BRONZE_MACHINE_FRAME.get(), context -> new BronzeMachineFrameTileRenderer());
		event.registerBlockEntityRenderer(UtopiacoreModBlockEntities.INDUSTRIAL_IRON_MACHINE_FRAME.get(), context -> new IndustrialIronMachineFrameTileRenderer());
		event.registerBlockEntityRenderer(UtopiacoreModBlockEntities.STEEL_MACHINE_FRAME.get(), context -> new SteelMachineFrameTileRenderer());
	}
}
