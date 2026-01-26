package com.honglin930.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    WOODEN_SWORD_LV1(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 89, 10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV2(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 134,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV3(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 201,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV4(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 302,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV5(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 453,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV6(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 680,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV7(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1020,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV8(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1530,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LV9(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 2295,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD)),
    WOODEN_SWORD_LVX(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 3443,10, 2, 2, ()-> Ingredient.ofItems(ModItems.COMPRESSED_WOODEN_SWORD));

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
        return (Ingredient)this.repairIngredient.get();
    }
}
