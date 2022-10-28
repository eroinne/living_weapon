package com.ero.livingweapon.entity.client;

import com.ero.livingweapon.LivingWeapon;
import com.ero.livingweapon.entity.custom.NavoriEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NavoriModel extends AnimatedGeoModel<NavoriEntity> {
    @Override
    public ResourceLocation getModelResource(NavoriEntity object) {
        return new ResourceLocation(LivingWeapon.MOD_ID, "geo/navori.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NavoriEntity object) {
        return new ResourceLocation(LivingWeapon.MOD_ID, "textures/entity/navori_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NavoriEntity animatable) {
        return new ResourceLocation(LivingWeapon.MOD_ID, "animations/navori.animation.json");
    }
}
