package com.glagworld.glaggleland.entity.client.giggler;

import com.glagworld.glaggleland.Glaggleland;
import com.glagworld.glaggleland.entity.custom.GigglerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GigglerRenderer extends MobRenderer<GigglerEntity, GigglerModel<GigglerEntity>> {
    public GigglerRenderer(EntityRendererProvider.Context context) {
        super(context, new GigglerModel<>(context.bakeLayer(GigglerModel.LAYER_LOCATION)), .25f);
    }

    @Override
    public ResourceLocation getTextureLocation(GigglerEntity gigglerEntity) {
        return ResourceLocation.fromNamespaceAndPath(Glaggleland.MODID, "textures/entity/giggler.png");
    }

    @Override
    public void render(GigglerEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.45f,0.45f,0.45f);
        } else {
            poseStack.scale(1f,1f,1f);
        }

        super.render(entity,entityYaw,partialTicks,poseStack,buffer,packedLight);
    }

}
