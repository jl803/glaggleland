package com.glagworld.glaggleland;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Glaggleland.MODID)
public class Glaggleland {
    public static final String MODID = "glaggleland";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GLAGGLELAND_TAB = CREATIVE_MODE_TABS.register("glaggleland", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.glaggleland"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> Items.YELLOW_DYE.getDefaultInstance())
            .displayItems((parameters, output) -> {
            })
            .build());

    @SuppressWarnings("unused")
    public Glaggleland(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Glaggleland common setup complete.");
    }
}
