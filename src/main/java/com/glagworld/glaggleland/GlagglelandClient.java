package com.glagworld.glaggleland;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(value = Glaggleland.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = Glaggleland.MODID, value = Dist.CLIENT)
public class GlagglelandClient {
    @SuppressWarnings("unused")
    public GlagglelandClient(ModContainer container) {
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        Glaggleland.LOGGER.info("Glaggleland client setup complete.");
    }
}
