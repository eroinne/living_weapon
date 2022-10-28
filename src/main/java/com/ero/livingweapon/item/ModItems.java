package com.ero.livingweapon.item;

import com.ero.livingweapon.LivingWeapon;
import com.ero.livingweapon.entity.ModEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LivingWeapon.MOD_ID);

    public static final RegistryObject<Item> NAVORI = ITEMS.register("navori",
            () -> new ForgeSpawnEggItem(ModEntityTypes.NAVORI, 0x22b341,0x19732e
                    ,new Item.Properties().tab(ModCreativeModeTab.LIVINGWEAPON_TAB).stacksTo(1)));

    public static final RegistryObject<Item> SOULS_LINK = ITEMS.register("souls_link",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LIVINGWEAPON_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

