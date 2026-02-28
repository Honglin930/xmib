package com.honglin930.item;

import com.honglin930.XMIB;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //物品注册
    //WOODEN_SWORD
    public static final Item COMPRESSED_WOODEN_SWORD = ItemRegister("compressed_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV1,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV1, 3, -2.4F))));
    public static final Item DOUBLE_WOODEN_SWORD = ItemRegister("double_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV2,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV2, 6, -2.4F))));
    public static final Item TRIPLE_WOODEN_SWORD = ItemRegister("triple_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV3,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV3, 11, -2.4F))));
    public static final Item QUADRUPLE_WOODEN_SWORD = ItemRegister("quadruple_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV4,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV4, 18, -2.4F))));
    public static final Item QUINTUPLE_WOODEN_SWORD = ItemRegister("quintuple_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV5,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV5, 29, -2.4F))));
    public static final Item SEXTUPLE_WOODEN_SWORD = ItemRegister("sextuple_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV6,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV6, 45, -2.4F))));
    public static final Item SEPTUPLE_WOODEN_SWORD = ItemRegister("septuple_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV7,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV7, 55, -2.4F))));
    public static final Item OCTUPLE_WOODEN_SWORD = ItemRegister("octuple_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV8,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV8, 84, -2.4F))));
    public static final Item NONUPLE_WOODEN_SWORD = ItemRegister("nonuple_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LV9,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LV9, 128, -2.4F))));
    public static final Item TENFOLD_WOODEN_SWORD = ItemRegister("tenfold_wooden_sword", new SwordItem(ModToolMaterials.WOODEN_SWORD_LVX,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.WOODEN_SWORD_LVX, 194, -2.4F))));
    //WOODEN_AXE
    public static final Item COMPRESSED_WOODEN_AXE = ItemRegister("compressed_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV1,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV1, 8, -3.0F))));
    public static final Item DOUBLE_WOODEN_AXE = ItemRegister("double_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV2,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV2, 14, -2.8F))));
    public static final Item TRIPLE_WOODEN_AXE = ItemRegister("triple_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV3,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV3, 23, -2.6F))));
    public static final Item QUADRUPLE_WOODEN_AXE = ItemRegister("quadruple_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV4,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV4, 36, -2.4F))));
    public static final Item QUINTUPLE_WOODEN_AXE = ItemRegister("quintuple_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV5,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV5, 56, -2.2F))));
    public static final Item SEXTUPLE_WOODEN_AXE = ItemRegister("sextuple_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV6,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV6, 86, -2.0F))));
    public static final Item SEPTUPLE_WOODEN_AXE = ItemRegister("septuple_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV7,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV7, 131, -1.8F))));
    public static final Item OCTUPLE_WOODEN_AXE = ItemRegister("octuple_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV8,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV8, 201, -1.6F))));
    public static final Item NONUPLE_WOODEN_AXE = ItemRegister("nonuple_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LV9,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LV9, 299, -1.4F))));
    public static final Item TENFOLD_WOODEN_AXE = ItemRegister("tenfold_wooden_axe", new AxeItem(ModToolMaterials.WOODEN_AXE_LVX,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_AXE_LVX, 450, -1.2F))));
    //WOODEN_HOE
    public static final Item COMPRESSED_WOODEN_HOE = ItemRegister("compressed_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV1,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV1, 0, -2.8F))));
    public static final Item DOUBLE_WOODEN_HOE = ItemRegister("double_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV2,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV2, 0, -2.6F))));
    public static final Item TRIPLE_WOODEN_HOE = ItemRegister("triple_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV3,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV3, 0, -2.4F))));
    public static final Item QUADRUPLE_WOODEN_HOE = ItemRegister("quadruple_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV4,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV4, 0, -2.2F))));
    public static final Item QUINTUPLE_WOODEN_HOE = ItemRegister("quintuple_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV5,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV5, 0, -2.0F))));
    public static final Item SEXTUPLE_WOODEN_HOE = ItemRegister("sextuple_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV6,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV6, 0, -1.8F))));
    public static final Item SEPTUPLE_WOODEN_HOE = ItemRegister("septuple_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV7,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV7, 0, -1.6F))));
    public static final Item OCTUPLE_WOODEN_HOE = ItemRegister("octuple_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV8,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV8, 0, -1.4F))));
    public static final Item NONUPLE_WOODEN_HOE = ItemRegister("nonuple_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LV9,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LV9, 0, -1.2F))));
    public static final Item TENFOLD_WOODEN_HOE = ItemRegister("tenfold_wooden_hoe", new HoeItem(ModToolMaterials.WOODEN_HOE_LVX,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.WOODEN_HOE_LVX, 0, -1.0F))));
    //WOODEN_PICKAXE
    public static final Item COMPRESSED_WOODEN_PICKAXE = ItemRegister("compressed_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV1,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV1, 2, -2.6F))));
    public static final Item DOUBLE_WOODEN_PICKAXE = ItemRegister("double_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV2,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV2, 5, -2.4F))));
    public static final Item TRIPLE_WOODEN_PICKAXE = ItemRegister("triple_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV3,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV3, 9, -2.2F))));
    public static final Item QUADRUPLE_WOODEN_PICKAXE = ItemRegister("quadruple_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV4,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV4, 15, -2.0F))));
    public static final Item QUINTUPLE_WOODEN_PICKAXE = ItemRegister("quintuple_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV5,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV5, 24, -1.8F))));
    public static final Item SEXTUPLE_WOODEN_PICKAXE = ItemRegister("sextuple_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV6,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV6, 38, -1.6F))));
    public static final Item SEPTUPLE_WOODEN_PICKAXE = ItemRegister("septuple_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV7,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV7, 59, -1.4F))));
    public static final Item OCTUPLE_WOODEN_PICKAXE = ItemRegister("octuple_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV8,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV8, 90, -1.2F))));
    public static final Item NONUPLE_WOODEN_PICKAXE = ItemRegister("nonuple_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LV9,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LV9, 137, -1.0F))));
    public static final Item TENFOLD_WOODEN_PICKAXE = ItemRegister("tenfold_wooden_pickaxe", new PickaxeItem(ModToolMaterials.WOODEN_PICKAXE_LVX,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.WOODEN_PICKAXE_LVX, 207, -0.8F))));
    //WOODEN_SHOVEL
    public static final Item COMPRESSED_WOODEN_SHOVEL = ItemRegister("compressed_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV1,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV1, 0, -2.8F))));
    public static final Item DOUBLE_WOODEN_SHOVEL = ItemRegister("double_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV2,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV2, 2, -2.6F))));
    public static final Item TRIPLE_WOODEN_SHOVEL = ItemRegister("triple_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV3,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV3, 5, -2.4F))));
    public static final Item QUADRUPLE_WOODEN_SHOVEL = ItemRegister("quadruple_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV4,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV4, 9, -2.2F))));
    public static final Item QUINTUPLE_WOODEN_SHOVEL = ItemRegister("quintuple_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV5,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV5, 15, -2.0F))));
    public static final Item SEXTUPLE_WOODEN_SHOVEL = ItemRegister("sextuple_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV6,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV6, 24, -1.8F))));
    public static final Item SEPTUPLE_WOODEN_SHOVEL = ItemRegister("septuple_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV7,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV7, 38, -1.6F))));
    public static final Item OCTUPLE_WOODEN_SHOVEL = ItemRegister("octuple_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV8,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV8, 59, -1.4F))));
    public static final Item NONUPLE_WOODEN_SHOVEL = ItemRegister("nonuple_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LV9,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LV9, 90, -1.2F))));
    public static final Item TENFOLD_WOODEN_SHOVEL = ItemRegister("tenfold_wooden_shovel", new ShovelItem(ModToolMaterials.WOODEN_SHOVEL_LVX,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.WOODEN_SHOVEL_LVX, 137, -1.0F))));


    //物品注册系统
    public static Item ItemRegister(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(XMIB.MOD_ID, id) ,item);
    }
    //初始化
    public static void Initialize(){
        XMIB.LOGGER.info("Registering XMIB's Item");
    }
}
