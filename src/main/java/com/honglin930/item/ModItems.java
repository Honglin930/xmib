package com.honglin930.item;

import com.honglin930.XMIB;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //物品注册
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
    //物品注册系统
    public static Item ItemRegister(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(XMIB.MOD_ID, id) ,item);
    }
    //初始化
    public static void Initialize(){
        XMIB.LOGGER.info("Registering XMIB's Item");
    }
}
