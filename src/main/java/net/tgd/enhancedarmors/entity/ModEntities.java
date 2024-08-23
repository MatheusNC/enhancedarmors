package net.tgd.enhancedarmors.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tgd.enhancedarmors.EnhancedArmors;
import net.tgd.enhancedarmors.entity.custom.ArmoredBossEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EnhancedArmors.MOD_ID);

    public static final RegistryObject<EntityType<ArmoredBossEntity>> ARMORED_BOSS =
            ENTITY_TYPES.register("armored_boss", () -> EntityType.Builder.of(ArmoredBossEntity::new, MobCategory.MONSTER)
                    .sized(1F, 3.0F).build("armored_boss"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
