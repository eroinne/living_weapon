package com.ero.livingweapon.event;

import com.ero.livingweapon.LivingWeapon;
import com.ero.livingweapon.entity.ModEntityTypes;
import com.ero.livingweapon.entity.custom.NavoriEntity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = LivingWeapon.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.NAVORI.get(), NavoriEntity.setAttributes());
        }
    }}