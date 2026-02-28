package com.honglin930.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;

public enum
ModToolMaterials implements ToolMaterial {
    //wooden
    WOODEN_SWORD_LV1(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 89, 10, 2, 15, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV2(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 134,10, 2, 15, ()-> Ingredient.ofItems(ModItems.DOUBLE_WOODEN_SWORD)),
    WOODEN_SWORD_LV3(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 201,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TRIPLE_WOODEN_SWORD)),
    WOODEN_SWORD_LV4(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 302,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUADRUPLE_WOODEN_SWORD)),
    WOODEN_SWORD_LV5(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 453,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUINTUPLE_WOODEN_SWORD)),
    WOODEN_SWORD_LV6(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 680,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEXTUPLE_WOODEN_SWORD)),
    WOODEN_SWORD_LV7(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1020,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEPTUPLE_WOODEN_SWORD)),
    WOODEN_SWORD_LV8(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1530,10, 2, 15, ()-> Ingredient.ofItems(ModItems.OCTUPLE_WOODEN_SWORD)),
    WOODEN_SWORD_LV9(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 2295,10, 2, 15, ()-> Ingredient.ofItems(ModItems.NONUPLE_WOODEN_SWORD)),
    WOODEN_SWORD_LVX(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 3443,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TENFOLD_WOODEN_SWORD)),

    WOODEN_AXE_LV1(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 89,10, 2, 15, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_AXE)),
    WOODEN_AXE_LV2(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 134,10, 2, 15, ()-> Ingredient.ofItems(ModItems.DOUBLE_WOODEN_AXE)),
    WOODEN_AXE_LV3(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 201,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TRIPLE_WOODEN_AXE)),
    WOODEN_AXE_LV4(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 302,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUADRUPLE_WOODEN_AXE)),
    WOODEN_AXE_LV5(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 453,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUINTUPLE_WOODEN_AXE)),
    WOODEN_AXE_LV6(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 680,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEXTUPLE_WOODEN_AXE)),
    WOODEN_AXE_LV7(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1020,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEPTUPLE_WOODEN_AXE)),
    WOODEN_AXE_LV8(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1530,10, 2, 15, ()-> Ingredient.ofItems(ModItems.OCTUPLE_WOODEN_AXE)),
    WOODEN_AXE_LV9(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 2295,10, 2, 15, ()-> Ingredient.ofItems(ModItems.NONUPLE_WOODEN_AXE)),
    WOODEN_AXE_LVX(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 3443,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TENFOLD_WOODEN_AXE)),

    WOODEN_HOE_LV1(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 89,10, 2, 15, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_HOE)),
    WOODEN_HOE_LV2(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 134,10, 2, 15, ()-> Ingredient.ofItems(ModItems.DOUBLE_WOODEN_HOE)),
    WOODEN_HOE_LV3(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 201,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TRIPLE_WOODEN_HOE)),
    WOODEN_HOE_LV4(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 302,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUADRUPLE_WOODEN_HOE)),
    WOODEN_HOE_LV5(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 453,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUINTUPLE_WOODEN_HOE)),
    WOODEN_HOE_LV6(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 680,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEXTUPLE_WOODEN_HOE)),
    WOODEN_HOE_LV7(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1020,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEPTUPLE_WOODEN_HOE)),
    WOODEN_HOE_LV8(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1530,10, 2, 15, ()-> Ingredient.ofItems(ModItems.OCTUPLE_WOODEN_HOE)),
    WOODEN_HOE_LV9(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 2295,10, 2, 15, ()-> Ingredient.ofItems(ModItems.NONUPLE_WOODEN_HOE)),
    WOODEN_HOE_LVX(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 3443,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TENFOLD_WOODEN_HOE)),

    WOODEN_PICKAXE_LV1(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 89,10, 2, 15, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LV2(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 134,10, 2, 15, ()-> Ingredient.ofItems(ModItems.DOUBLE_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LV3(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 201,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TRIPLE_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LV4(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 302,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUADRUPLE_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LV5(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 453,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUINTUPLE_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LV6(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 680,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEXTUPLE_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LV7(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1020,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEPTUPLE_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LV8(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1530,10, 2, 15, ()-> Ingredient.ofItems(ModItems.OCTUPLE_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LV9(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 2295,10, 2, 15, ()-> Ingredient.ofItems(ModItems.NONUPLE_WOODEN_PICKAXE)),
    WOODEN_PICKAXE_LVX(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 3443,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TENFOLD_WOODEN_PICKAXE)),

    WOODEN_SHOVEL_LV1(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 89,10, 2, 15, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LV2(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 134,10, 2, 15, ()-> Ingredient.ofItems(ModItems.DOUBLE_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LV3(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 201,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TRIPLE_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LV4(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 302,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUADRUPLE_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LV5(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 453,10, 2, 15, ()-> Ingredient.ofItems(ModItems.QUINTUPLE_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LV6(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 680,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEXTUPLE_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LV7(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1020,10, 2, 15, ()-> Ingredient.ofItems(ModItems.SEPTUPLE_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LV8(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1530,10, 2, 15, ()-> Ingredient.ofItems(ModItems.OCTUPLE_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LV9(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 2295,10, 2, 15, ()-> Ingredient.ofItems(ModItems.NONUPLE_WOODEN_SHOVEL)),
    WOODEN_SHOVEL_LVX(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 3443,10, 2, 15, ()-> Ingredient.ofItems(ModItems.TENFOLD_WOODEN_SHOVEL));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
