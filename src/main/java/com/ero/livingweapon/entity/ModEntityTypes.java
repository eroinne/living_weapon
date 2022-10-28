package com.ero.livingweapon.entity;

import com.ero.livingweapon.LivingWeapon;
import com.ero.livingweapon.entity.custom.NavoriEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, LivingWeapon.MOD_ID);

    public static final RegistryObject<EntityType<NavoriEntity>> NAVORI =
            ENTITY_TYPES.register("navori",
                    () -> EntityType.Builder.of(NavoriEntity::new, MobCategory.CREATURE)
                            .sized(0.4f, 1.5f)
                            .build(new ResourceLocation(LivingWeapon.MOD_ID, "navori").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
