package com.ero.livingweapon.entity.client;

import com.ero.livingweapon.LivingWeapon;
import com.ero.livingweapon.entity.custom.NavoriEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class NavoriRenderer extends GeoEntityRenderer<NavoriEntity> {
    public NavoriRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new NavoriModel());
        this.shadowRadius = 0.3f;
    }
    @Override
    public ResourceLocation getTextureLocation(NavoriEntity instance) {
        return new ResourceLocation(LivingWeapon.MOD_ID, "textures/entity/navori_texture.png");
    }

    @Override
    public RenderType getRenderType(NavoriEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
