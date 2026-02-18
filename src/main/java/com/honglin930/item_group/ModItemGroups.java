package com.honglin930.item_group;

import com.honglin930.XMIB;
import com.honglin930.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public final class ModItemGroups {
    public static final ItemGroup MORE_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of("xmib", "more_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.COMPRESSED_WOODEN_SWORD))
            .displayName(Text.translatable("itemGroup.xmib.more_items"))
            .entries((context, entries) -> {
                //注册块
                //WOODEN_SWORD
                entries.add(ModItems.COMPRESSED_WOODEN_SWORD);
                entries.add(ModItems.DOUBLE_WOODEN_SWORD);
                entries.add(ModItems.TRIPLE_WOODEN_SWORD);
                entries.add(ModItems.QUADRUPLE_WOODEN_SWORD);
                entries.add(ModItems.QUINTUPLE_WOODEN_SWORD);
                entries.add(ModItems.SEXTUPLE_WOODEN_SWORD);
                entries.add(ModItems.SEPTUPLE_WOODEN_SWORD);
                entries.add(ModItems.OCTUPLE_WOODEN_SWORD);
                entries.add(ModItems.NONUPLE_WOODEN_SWORD);
                entries.add(ModItems.TENFOLD_WOODEN_SWORD);
                //WOODEN_AXE
                entries.add(ModItems.COMPRESSED_WOODEN_AXE);
                entries.add(ModItems.DOUBLE_WOODEN_AXE);
                entries.add(ModItems.TRIPLE_WOODEN_AXE);
                entries.add(ModItems.QUADRUPLE_WOODEN_AXE);
                entries.add(ModItems.QUINTUPLE_WOODEN_AXE);
                entries.add(ModItems.SEXTUPLE_WOODEN_AXE);
                entries.add(ModItems.SEPTUPLE_WOODEN_AXE);
                entries.add(ModItems.OCTUPLE_WOODEN_AXE);
                entries.add(ModItems.NONUPLE_WOODEN_AXE);
                entries.add(ModItems.TENFOLD_WOODEN_AXE);

                //
            })
            .build());
    public static void Initialize(){
        XMIB.LOGGER.info("Registering XMIB's Item Groups");
    }
}
