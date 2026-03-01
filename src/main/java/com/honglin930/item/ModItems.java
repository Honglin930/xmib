package com.honglin930.item;

import com.honglin930.XMIB;
import net.minecraft.item.*;
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
    //STONE_SWORD
    public static final Item COMPRESSED_STONE_SWORD = ItemRegister("compressed_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV1,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV1, 5, -2.2F))));
    public static final Item DOUBLE_STONE_SWORD = ItemRegister("double_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV2,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV2, 9, -2.0F))));
    public static final Item TRIPLE_STONE_SWORD = ItemRegister("triple_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV3,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV3, 15, -1.8F))));
    public static final Item QUADRUPLE_STONE_SWORD = ItemRegister("quadruple_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV4,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV4, 24, -1.6F))));
    public static final Item QUINTUPLE_STONE_SWORD = ItemRegister("quintuple_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV5,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV5, 38, -1.4F))));
    public static final Item SEXTUPLE_STONE_SWORD = ItemRegister("sextuple_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV6,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV6, 59, -1.2F))));
    public static final Item SEPTUPLE_STONE_SWORD = ItemRegister("septuple_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV7,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV7, 90, -1.0F))));
    public static final Item OCTUPLE_STONE_SWORD = ItemRegister("octuple_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV8,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV8, 137, -0.8F))));
    public static final Item NONUPLE_STONE_SWORD = ItemRegister("nonuple_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LV9,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LV9, 207, -0.6F))));
    public static final Item TENFOLD_STONE_SWORD = ItemRegister("tenfold_stone_sword", new SwordItem(ModToolMaterials.STONE_SWORD_LVX,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STONE_SWORD_LVX, 312, -0.4F))));
    //STONE_AXE
    public static final Item COMPRESSED_STONE_AXE = ItemRegister("compressed_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV1,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV1, 8, -3.0F))));
    public static final Item DOUBLE_STONE_AXE = ItemRegister("double_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV2,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV2, 14, -2.8F))));
    public static final Item TRIPLE_STONE_AXE = ItemRegister("triple_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV3,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV3, 23, -2.6F))));
    public static final Item QUADRUPLE_STONE_AXE = ItemRegister("quadruple_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV4,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV4, 36, -2.4F))));
    public static final Item QUINTUPLE_STONE_AXE = ItemRegister("quintuple_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV5,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV5, 56, -2.2F))));
    public static final Item SEXTUPLE_STONE_AXE = ItemRegister("sextuple_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV6,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV6, 86, -2.0F))));
    public static final Item SEPTUPLE_STONE_AXE = ItemRegister("septuple_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV7,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV7, 131, -1.8F))));
    public static final Item OCTUPLE_STONE_AXE = ItemRegister("octuple_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV8,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV8, 198, -1.6F))));
    public static final Item NONUPLE_STONE_AXE = ItemRegister("nonuple_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LV9,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LV9, 299, -1.4F))));
    public static final Item TENFOLD_STONE_AXE = ItemRegister("tenfold_stone_axe", new AxeItem(ModToolMaterials.STONE_AXE_LVX,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STONE_AXE_LVX, 450, -1.2F))));
    //STONE_HOE
    public static final Item COMPRESSED_STONE_HOE = ItemRegister("compressed_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV1,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV1, 0, -1.8F))));
    public static final Item DOUBLE_STONE_HOE = ItemRegister("double_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV2,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV2, 0, -1.6F))));
    public static final Item TRIPLE_STONE_HOE = ItemRegister("triple_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV3,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV3, 0, -1.4F))));
    public static final Item QUADRUPLE_STONE_HOE = ItemRegister("quadruple_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV4,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV4, 0, -1.2F))));
    public static final Item QUINTUPLE_STONE_HOE = ItemRegister("quintuple_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV5,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV5, 0, -1.0F))));
    public static final Item SEXTUPLE_STONE_HOE = ItemRegister("sextuple_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV6,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV6, 0, -0.8F))));
    public static final Item SEPTUPLE_STONE_HOE = ItemRegister("septuple_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV7,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV7, 0, -0.6F))));
    public static final Item OCTUPLE_STONE_HOE = ItemRegister("octuple_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV8,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV8, 0, -0.4F))));
    public static final Item NONUPLE_STONE_HOE = ItemRegister("nonuple_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LV9,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LV9, 0, -0.2F))));
    public static final Item TENFOLD_STONE_HOE = ItemRegister("tenfold_stone_hoe", new HoeItem(ModToolMaterials.STONE_HOE_LVX,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STONE_HOE_LVX, 0, 0.0F))));
    //STONE_PICKAXE
    public static final Item COMPRESSED_STONE_PICKAXE = ItemRegister("compressed_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV1,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV1, 0, -2.6F))));
    public static final Item DOUBLE_STONE_PICKAXE = ItemRegister("double_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV2,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV2, 0, -2.4F))));
    public static final Item TRIPLE_STONE_PICKAXE = ItemRegister("triple_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV3,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV3, 2, -2.2F))));
    public static final Item QUADRUPLE_STONE_PICKAXE = ItemRegister("quadruple_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV4,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV4, 5, -2.0F))));
    public static final Item QUINTUPLE_STONE_PICKAXE = ItemRegister("quintuple_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV5,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV5, 9, -1.8F))));
    public static final Item SEXTUPLE_STONE_PICKAXE = ItemRegister("sextuple_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV6,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV6, 15, -1.6F))));
    public static final Item SEPTUPLE_STONE_PICKAXE = ItemRegister("septuple_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV7,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV7, 24, -1.4F))));
    public static final Item OCTUPLE_STONE_PICKAXE = ItemRegister("octuple_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV8,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV8, 38, -1.2F))));
    public static final Item NONUPLE_STONE_PICKAXE = ItemRegister("nonuple_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LV9,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LV9, 59, -1.0F))));
    public static final Item TENFOLD_STONE_PICKAXE = ItemRegister("tenfold_stone_pickaxe", new PickaxeItem(ModToolMaterials.STONE_PICKAXE_LVX,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STONE_PICKAXE_LVX, 90, -0.8F))));
    //STONE_SHOVEL
    public static final Item COMPRESSED_STONE_SHOVEL = ItemRegister("compressed_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV1,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV1, 0, -2.8F))));
    public static final Item DOUBLE_STONE_SHOVEL = ItemRegister("double_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV2,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV2, 2, -2.6F))));
    public static final Item TRIPLE_STONE_SHOVEL = ItemRegister("triple_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV3,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV3, 5, -2.4F))));
    public static final Item QUADRUPLE_STONE_SHOVEL = ItemRegister("quadruple_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV4,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV4, 9, -2.2F))));
    public static final Item QUINTUPLE_STONE_SHOVEL = ItemRegister("quintuple_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV5,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV5, 15, -2.0F))));
    public static final Item SEXTUPLE_STONE_SHOVEL = ItemRegister("sextuple_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV6,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV6, 24, -1.8F))));
    public static final Item SEPTUPLE_STONE_SHOVEL = ItemRegister("septuple_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV7,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV7, 38, -1.6F))));
    public static final Item OCTUPLE_STONE_SHOVEL = ItemRegister("octuple_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV8,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV8, 59, -1.4F))));
    public static final Item NONUPLE_STONE_SHOVEL = ItemRegister("nonuple_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LV9,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LV9, 90, -1.2F))));
    public static final Item TENFOLD_STONE_SHOVEL = ItemRegister("tenfold_stone_shovel", new ShovelItem(ModToolMaterials.STONE_SHOVEL_LVX,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STONE_SHOVEL_LVX, 137, -1.0F))));
    //IRON_SWORD
    public static final Item COMPRESSED_IRON_SWORD = ItemRegister("compressed_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV1,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV1, 2, -2.2F))));
    public static final Item DOUBLE_IRON_SWORD = ItemRegister("double_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV2,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV2, 5, -2.0F))));
    public static final Item TRIPLE_IRON_SWORD = ItemRegister("triple_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV3,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV3, 9, -1.8F))));
    public static final Item QUADRUPLE_IRON_SWORD = ItemRegister("quadruple_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV4,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV4, 15, -1.6F))));
    public static final Item QUINTUPLE_IRON_SWORD = ItemRegister("quintuple_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV5,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV5, 24, -1.4F))));
    public static final Item SEXTUPLE_IRON_SWORD = ItemRegister("sextuple_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV6,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV6, 38, -1.2F))));
    public static final Item SEPTUPLE_IRON_SWORD = ItemRegister("septuple_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV7,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV7, 59, -1.0F))));
    public static final Item OCTUPLE_IRON_SWORD = ItemRegister("octuple_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV8,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV8, 90, -0.8F))));
    public static final Item NONUPLE_IRON_SWORD = ItemRegister("nonuple_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LV9,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LV9, 137, -0.6F))));
    public static final Item TENFOLD_IRON_SWORD = ItemRegister("tenfold_iron_sword", new SwordItem(ModToolMaterials.IRON_SWORD_LVX,
            new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.IRON_SWORD_LVX, 207, -0.4F))));
    //IRON_AXE
    public static final Item COMPRESSED_IRON_AXE = ItemRegister("compressed_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV1,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV1, 6, -2.9F))));
    public static final Item DOUBLE_IRON_AXE = ItemRegister("double_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV2,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV2, 11, -2.7F))));
    public static final Item TRIPLE_IRON_AXE = ItemRegister("triple_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV3,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV3, 18, -2.5F))));
    public static final Item QUADRUPLE_IRON_AXE = ItemRegister("quadruple_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV4,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV4, 29, -2.3F))));
    public static final Item QUINTUPLE_IRON_AXE = ItemRegister("quintuple_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV5,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV5, 45, -2.1F))));
    public static final Item SEXTUPLE_IRON_AXE = ItemRegister("sextuple_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV6,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV6, 69, -1.9F))));
    public static final Item SEPTUPLE_IRON_AXE = ItemRegister("septuple_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV7,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV7, 105, -1.7F))));
    public static final Item OCTUPLE_IRON_AXE = ItemRegister("octuple_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV8,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV8, 159, -1.5F))));
    public static final Item NONUPLE_IRON_AXE = ItemRegister("nonuple_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LV9,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LV9, 240, -1.3F))));
    public static final Item TENFOLD_IRON_AXE = ItemRegister("tenfold_iron_axe", new AxeItem(ModToolMaterials.IRON_AXE_LVX,
            new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.IRON_AXE_LVX, 362, -1.1F))));
    //IRON_HOE
    public static final Item COMPRESSED_IRON_HOE = ItemRegister("compressed_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV1,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV1, -3, -0.8F))));
    public static final Item DOUBLE_IRON_HOE = ItemRegister("double_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV2,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV2, -3, -0.6F))));
    public static final Item TRIPLE_IRON_HOE = ItemRegister("triple_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV3,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV3, -3, -0.4F))));
    public static final Item QUADRUPLE_IRON_HOE = ItemRegister("quadruple_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV4,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV4, -3, -0.2F))));
    public static final Item QUINTUPLE_IRON_HOE = ItemRegister("quintuple_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV5,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV5, -3, 0.0F))));
    public static final Item SEXTUPLE_IRON_HOE = ItemRegister("sextuple_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV6,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV6, -3, 0.2F))));
    public static final Item SEPTUPLE_IRON_HOE = ItemRegister("septuple_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV7,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV7, -3, 0.4F))));
    public static final Item OCTUPLE_IRON_HOE = ItemRegister("octuple_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV8,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV8, -3, 0.6F))));
    public static final Item NONUPLE_IRON_HOE = ItemRegister("nonuple_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LV9,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LV9, -3, 0.8F))));
    public static final Item TENFOLD_IRON_HOE = ItemRegister("tenfold_iron_hoe", new HoeItem(ModToolMaterials.IRON_HOE_LVX,
            new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.IRON_HOE_LVX, -3, 1.0F))));
    //IRON_PICKAXE
    public static final Item COMPRESSED_IRON_PICKAXE = ItemRegister("compressed_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV1,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV1, -1, -2.6F))));
    public static final Item DOUBLE_IRON_PICKAXE = ItemRegister("double_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV2,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV2, 0, -2.4F))));
    public static final Item TRIPLE_IRON_PICKAXE = ItemRegister("triple_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV3,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV3, 2, -2.2F))));
    public static final Item QUADRUPLE_IRON_PICKAXE = ItemRegister("quadruple_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV4,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV4, 5, -2.0F))));
    public static final Item QUINTUPLE_IRON_PICKAXE = ItemRegister("quintuple_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV5,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV5, 9, -1.8F))));
    public static final Item SEXTUPLE_IRON_PICKAXE = ItemRegister("sextuple_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV6,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV6, 15, -1.6F))));
    public static final Item SEPTUPLE_IRON_PICKAXE = ItemRegister("septuple_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV7,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV7, 24, -1.4F))));
    public static final Item OCTUPLE_IRON_PICKAXE = ItemRegister("octuple_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV8,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV8, 38, -1.2F))));
    public static final Item NONUPLE_IRON_PICKAXE = ItemRegister("nonuple_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LV9,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LV9, 59, -1.0F))));
    public static final Item TENFOLD_IRON_PICKAXE = ItemRegister("tenfold_iron_pickaxe", new PickaxeItem(ModToolMaterials.IRON_PICKAXE_LVX,
            new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.IRON_PICKAXE_LVX, 90, -0.8F))));
    //IRON_SHOVEL
    public static final Item COMPRESSED_IRON_SHOVEL = ItemRegister("compressed_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV1,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV1, 0, -2.8F))));
    public static final Item DOUBLE_IRON_SHOVEL = ItemRegister("double_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV2,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV2, 2, -2.6F))));
    public static final Item TRIPLE_IRON_SHOVEL = ItemRegister("triple_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV3,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV3, 5, -2.4F))));
    public static final Item QUADRUPLE_IRON_SHOVEL = ItemRegister("quadruple_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV4,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV4, 9, -2.2F))));
    public static final Item QUINTUPLE_IRON_SHOVEL = ItemRegister("quintuple_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV5,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV5, 15, -2.0F))));
    public static final Item SEXTUPLE_IRON_SHOVEL = ItemRegister("sextuple_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV6,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV6, 24, -1.8F))));
    public static final Item SEPTUPLE_IRON_SHOVEL = ItemRegister("septuple_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV7,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV7, 38, -1.6F))));
    public static final Item OCTUPLE_IRON_SHOVEL = ItemRegister("octuple_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV8,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV8, 59, -1.4F))));
    public static final Item NONUPLE_IRON_SHOVEL = ItemRegister("nonuple_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LV9,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LV9, 90, -1.2F))));
    public static final Item TENFOLD_IRON_SHOVEL = ItemRegister("tenfold_iron_shovel", new ShovelItem(ModToolMaterials.IRON_SHOVEL_LVX,
            new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.IRON_SHOVEL_LVX, 137, -1.0F))));

    //物品注册系统
    public static Item ItemRegister(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(XMIB.MOD_ID, id) ,item);
    }
    //初始化
    public static void Initialize(){
        XMIB.LOGGER.info("Registering XMIB's Item");
    }
}
