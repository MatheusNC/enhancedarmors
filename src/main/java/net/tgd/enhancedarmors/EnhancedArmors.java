package net.tgd.enhancedarmors;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.tgd.enhancedarmors.entity.ModEntities;
import net.tgd.enhancedarmors.entity.client.ArmoredBossRenderer;
import net.tgd.enhancedarmors.init.ModArmorMaterials;
import net.tgd.enhancedarmors.init.ModCreativeModTabs;
import net.tgd.enhancedarmors.init.ModItems;
import net.tgd.enhancedarmors.loot.ModLootModifiers;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(EnhancedArmors.MOD_ID)
public class EnhancedArmors
{
    public static final String MOD_ID = "enhancedarmors";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EnhancedArmors()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.BOSS_ARMOR_SHARD);
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.IRON_BOSS_BOOTS);
            event.accept(ModItems.IRON_BOSS_LEGGINGS);
            event.accept(ModItems.IRON_BOSS_CHESTPLATE);
            event.accept(ModItems.IRON_BOSS_HELMET);
            event.accept(ModItems.GOLD_BOSS_BOOTS);
            event.accept(ModItems.GOLD_BOSS_LEGGINGS);
            event.accept(ModItems.GOLD_BOSS_CHESTPLATE);
            event.accept(ModItems.GOLD_BOSS_HELMET);
            event.accept(ModItems.DIAMOND_BOSS_BOOTS);
            event.accept(ModItems.DIAMOND_BOSS_LEGGINGS);
            event.accept(ModItems.DIAMOND_BOSS_CHESTPLATE);
            event.accept(ModItems.DIAMOND_BOSS_HELMET);
            event.accept(ModItems.NETHERITE_BOSS_BOOTS);
            event.accept(ModItems.NETHERITE_BOSS_LEGGINGS);
            event.accept(ModItems.NETHERITE_BOSS_CHESTPLATE);
            event.accept(ModItems.NETHERITE_BOSS_HELMET);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.ARMORED_BOSS.get(), ArmoredBossRenderer::new);
        }
    }
}
