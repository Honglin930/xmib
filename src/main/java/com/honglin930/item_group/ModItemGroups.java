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
                //WOODEN_HOE
                entries.add(ModItems.COMPRESSED_WOODEN_HOE);
                entries.add(ModItems.DOUBLE_WOODEN_HOE);
                entries.add(ModItems.TRIPLE_WOODEN_HOE);
                entries.add(ModItems.QUADRUPLE_WOODEN_HOE);
                entries.add(ModItems.QUINTUPLE_WOODEN_HOE);
                entries.add(ModItems.SEXTUPLE_WOODEN_HOE);
                entries.add(ModItems.SEPTUPLE_WOODEN_HOE);
                entries.add(ModItems.OCTUPLE_WOODEN_HOE);
                entries.add(ModItems.NONUPLE_WOODEN_HOE);
                entries.add(ModItems.TENFOLD_WOODEN_HOE);
                //WOODEN_PICKAXE
                entries.add(ModItems.COMPRESSED_WOODEN_PICKAXE);
                entries.add(ModItems.DOUBLE_WOODEN_PICKAXE);
                entries.add(ModItems.TRIPLE_WOODEN_PICKAXE);
                entries.add(ModItems.QUADRUPLE_WOODEN_PICKAXE);
                entries.add(ModItems.QUINTUPLE_WOODEN_PICKAXE);
                entries.add(ModItems.SEXTUPLE_WOODEN_PICKAXE);
                entries.add(ModItems.SEPTUPLE_WOODEN_PICKAXE);
                entries.add(ModItems.OCTUPLE_WOODEN_PICKAXE);
                entries.add(ModItems.NONUPLE_WOODEN_PICKAXE);
                entries.add(ModItems.TENFOLD_WOODEN_PICKAXE);
                //WOODEN_SHOVEL
                entries.add(ModItems.COMPRESSED_WOODEN_SHOVEL);
                entries.add(ModItems.DOUBLE_WOODEN_SHOVEL);
                entries.add(ModItems.TRIPLE_WOODEN_SHOVEL);
                entries.add(ModItems.QUADRUPLE_WOODEN_SHOVEL);
                entries.add(ModItems.QUINTUPLE_WOODEN_SHOVEL);
                entries.add(ModItems.SEXTUPLE_WOODEN_SHOVEL);
                entries.add(ModItems.SEPTUPLE_WOODEN_SHOVEL);
                entries.add(ModItems.OCTUPLE_WOODEN_SHOVEL);
                entries.add(ModItems.NONUPLE_WOODEN_SHOVEL);
                entries.add(ModItems.TENFOLD_WOODEN_SHOVEL);
                //STONE_SWORD
                entries.add(ModItems.COMPRESSED_STONE_SWORD);
                entries.add(ModItems.DOUBLE_STONE_SWORD);
                entries.add(ModItems.TRIPLE_STONE_SWORD);
                entries.add(ModItems.QUADRUPLE_STONE_SWORD);
                entries.add(ModItems.QUINTUPLE_STONE_SWORD);
                entries.add(ModItems.SEXTUPLE_STONE_SWORD);
                entries.add(ModItems.SEPTUPLE_STONE_SWORD);
                entries.add(ModItems.OCTUPLE_STONE_SWORD);
                entries.add(ModItems.NONUPLE_STONE_SWORD);
                entries.add(ModItems.TENFOLD_STONE_SWORD);
                //STONE_AXE
                entries.add(ModItems.COMPRESSED_STONE_AXE);
                entries.add(ModItems.DOUBLE_STONE_AXE);
                entries.add(ModItems.TRIPLE_STONE_AXE);
                entries.add(ModItems.QUADRUPLE_STONE_AXE);
                entries.add(ModItems.QUINTUPLE_STONE_AXE);
                entries.add(ModItems.SEXTUPLE_STONE_AXE);
                entries.add(ModItems.SEPTUPLE_STONE_AXE);
                entries.add(ModItems.OCTUPLE_STONE_AXE);
                entries.add(ModItems.NONUPLE_STONE_AXE);
                entries.add(ModItems.TENFOLD_STONE_AXE);
                //STONE_HOE
                entries.add(ModItems.COMPRESSED_STONE_HOE);
                entries.add(ModItems.DOUBLE_STONE_HOE);
                entries.add(ModItems.TRIPLE_STONE_HOE);
                entries.add(ModItems.QUADRUPLE_STONE_HOE);
                entries.add(ModItems.QUINTUPLE_STONE_HOE);
                entries.add(ModItems.SEXTUPLE_STONE_HOE);
                entries.add(ModItems.SEPTUPLE_STONE_HOE);
                entries.add(ModItems.OCTUPLE_STONE_HOE);
                entries.add(ModItems.NONUPLE_STONE_HOE);
                entries.add(ModItems.TENFOLD_STONE_HOE);
                //STONE_PICKAXE
                entries.add(ModItems.COMPRESSED_STONE_PICKAXE);
                entries.add(ModItems.DOUBLE_STONE_PICKAXE);
                entries.add(ModItems.TRIPLE_STONE_PICKAXE);
                entries.add(ModItems.QUADRUPLE_STONE_PICKAXE);
                entries.add(ModItems.QUINTUPLE_STONE_PICKAXE);
                entries.add(ModItems.SEXTUPLE_STONE_PICKAXE);
                entries.add(ModItems.SEPTUPLE_STONE_PICKAXE);
                entries.add(ModItems.OCTUPLE_STONE_PICKAXE);
                entries.add(ModItems.NONUPLE_STONE_PICKAXE);
                entries.add(ModItems.TENFOLD_STONE_PICKAXE);
                //STONE_SHOVEL
                entries.add(ModItems.COMPRESSED_STONE_SHOVEL);
                entries.add(ModItems.DOUBLE_STONE_SHOVEL);
                entries.add(ModItems.TRIPLE_STONE_SHOVEL);
                entries.add(ModItems.QUADRUPLE_STONE_SHOVEL);
                entries.add(ModItems.QUINTUPLE_STONE_SHOVEL);
                entries.add(ModItems.SEXTUPLE_STONE_SHOVEL);
                entries.add(ModItems.SEPTUPLE_STONE_SHOVEL);
                entries.add(ModItems.OCTUPLE_STONE_SHOVEL);
                entries.add(ModItems.NONUPLE_STONE_SHOVEL);
                entries.add(ModItems.TENFOLD_STONE_SHOVEL);
                //IRON_SWORD
                entries.add(ModItems.COMPRESSED_IRON_SWORD);
                entries.add(ModItems.DOUBLE_IRON_SWORD);
                entries.add(ModItems.TRIPLE_IRON_SWORD);
                entries.add(ModItems.QUADRUPLE_IRON_SWORD);
                entries.add(ModItems.QUINTUPLE_IRON_SWORD);
                entries.add(ModItems.SEXTUPLE_IRON_SWORD);
                entries.add(ModItems.SEPTUPLE_IRON_SWORD);
                entries.add(ModItems.OCTUPLE_IRON_SWORD);
                entries.add(ModItems.NONUPLE_IRON_SWORD);
                entries.add(ModItems.TENFOLD_IRON_SWORD);
                //IRON_AXE
                entries.add(ModItems.COMPRESSED_IRON_AXE);
                entries.add(ModItems.DOUBLE_IRON_AXE);
                entries.add(ModItems.TRIPLE_IRON_AXE);
                entries.add(ModItems.QUADRUPLE_IRON_AXE);
                entries.add(ModItems.QUINTUPLE_IRON_AXE);
                entries.add(ModItems.SEXTUPLE_IRON_AXE);
                entries.add(ModItems.SEPTUPLE_IRON_AXE);
                entries.add(ModItems.OCTUPLE_IRON_AXE);
                entries.add(ModItems.NONUPLE_IRON_AXE);
                entries.add(ModItems.TENFOLD_IRON_AXE);
                //IRON_HOE
                entries.add(ModItems.COMPRESSED_IRON_HOE);
                entries.add(ModItems.DOUBLE_IRON_HOE);
                entries.add(ModItems.TRIPLE_IRON_HOE);
                entries.add(ModItems.QUADRUPLE_IRON_HOE);
                entries.add(ModItems.QUINTUPLE_IRON_HOE);
                entries.add(ModItems.SEXTUPLE_IRON_HOE);
                entries.add(ModItems.SEPTUPLE_IRON_HOE);
                entries.add(ModItems.OCTUPLE_IRON_HOE);
                entries.add(ModItems.NONUPLE_IRON_HOE);
                entries.add(ModItems.TENFOLD_IRON_HOE);
                //IRON_PICKAXE
                entries.add(ModItems.COMPRESSED_IRON_PICKAXE);
                entries.add(ModItems.DOUBLE_IRON_PICKAXE);
                entries.add(ModItems.TRIPLE_IRON_PICKAXE);
                entries.add(ModItems.QUADRUPLE_IRON_PICKAXE);
                entries.add(ModItems.QUINTUPLE_IRON_PICKAXE);
                entries.add(ModItems.SEXTUPLE_IRON_PICKAXE);
                entries.add(ModItems.SEPTUPLE_IRON_PICKAXE);
                entries.add(ModItems.OCTUPLE_IRON_PICKAXE);
                entries.add(ModItems.NONUPLE_IRON_PICKAXE);
                entries.add(ModItems.TENFOLD_IRON_PICKAXE);
                //IRON_SHOVEL
                entries.add(ModItems.COMPRESSED_IRON_SHOVEL);
                entries.add(ModItems.DOUBLE_IRON_SHOVEL);
                entries.add(ModItems.TRIPLE_IRON_SHOVEL);
                entries.add(ModItems.QUADRUPLE_IRON_SHOVEL);
                entries.add(ModItems.QUINTUPLE_IRON_SHOVEL);
                entries.add(ModItems.SEXTUPLE_IRON_SHOVEL);
                entries.add(ModItems.SEPTUPLE_IRON_SHOVEL);
                entries.add(ModItems.OCTUPLE_IRON_SHOVEL);
                entries.add(ModItems.NONUPLE_IRON_SHOVEL);
                entries.add(ModItems.TENFOLD_IRON_SHOVEL);
            })
            .build());

    public static void Initialize(){
        XMIB.LOGGER.info("Registering XMIB's Item Groups : {}", MORE_ITEMS);
    }
}
