package com.glagworld.glaggleland.entity.event;

import com.glagworld.glaggleland.Glaggleland;
import com.glagworld.glaggleland.entity.ModEntities;
import com.glagworld.glaggleland.entity.client.giggler.GigglerModel;
import com.glagworld.glaggleland.entity.client.glagglecannon.GlaggleCannonModel;
import com.glagworld.glaggleland.entity.custom.GigglerEntity;
import com.glagworld.glaggleland.entity.custom.GlaggleCannonEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@EventBusSubscriber(modid = Glaggleland.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(GigglerModel.LAYER_LOCATION, GigglerModel::createBodyLayer);

        event.registerLayerDefinition(GlaggleCannonModel.LAYER_LOCATION, GlaggleCannonModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GIGGLER.get(), GigglerEntity.createMobAttributes().build());

        event.put(ModEntities.GLAGGLE_CANNON.get(), GlaggleCannonEntity.createMobAttributes().build());
    }



}
