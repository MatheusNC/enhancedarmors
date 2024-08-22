package net.tgd.enhancedarmors.datagen;

import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.tgd.enhancedarmors.init.ModItems;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.IRON_BOOTS), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.IRON_BOSS_BOOTS.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.IRON_BOSS_BOOTS.getId()))
                .save(consumer, ModItems.IRON_BOSS_BOOTS.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.IRON_LEGGINGS), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.IRON_BOSS_LEGGINGS.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.IRON_BOSS_LEGGINGS.getId()))
                .save(consumer, ModItems.IRON_BOSS_LEGGINGS.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.IRON_CHESTPLATE), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.IRON_BOSS_CHESTPLATE.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.IRON_BOSS_CHESTPLATE.getId()))
                .save(consumer, ModItems.IRON_BOSS_CHESTPLATE.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.IRON_HELMET), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.IRON_BOSS_HELMET.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.IRON_BOSS_HELMET.getId()))
                .save(consumer, ModItems.IRON_BOSS_HELMET.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.GOLDEN_BOOTS), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.GOLD_BOSS_BOOTS.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.GOLD_BOSS_BOOTS.getId()))
                .save(consumer, ModItems.GOLD_BOSS_BOOTS.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.GOLDEN_LEGGINGS), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.GOLD_BOSS_LEGGINGS.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.GOLD_BOSS_LEGGINGS.getId()))
                .save(consumer, ModItems.GOLD_BOSS_LEGGINGS.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.GOLDEN_CHESTPLATE), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.GOLD_BOSS_CHESTPLATE.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.GOLD_BOSS_CHESTPLATE.getId()))
                .save(consumer, ModItems.GOLD_BOSS_CHESTPLATE.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.GOLDEN_HELMET), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.GOLD_BOSS_HELMET.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.GOLD_BOSS_HELMET.getId()))
                .save(consumer, ModItems.GOLD_BOSS_HELMET.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.DIAMOND_BOOTS), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.DIAMOND_BOSS_BOOTS.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.DIAMOND_BOSS_BOOTS.getId()))
                .save(consumer, ModItems.DIAMOND_BOSS_BOOTS.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.DIAMOND_LEGGINGS), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.DIAMOND_BOSS_LEGGINGS.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.DIAMOND_BOSS_LEGGINGS.getId()))
                .save(consumer, ModItems.DIAMOND_BOSS_LEGGINGS.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.DIAMOND_CHESTPLATE), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.DIAMOND_BOSS_CHESTPLATE.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.DIAMOND_BOSS_CHESTPLATE.getId()))
                .save(consumer, ModItems.DIAMOND_BOSS_CHESTPLATE.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.DIAMOND_HELMET), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.DIAMOND_BOSS_HELMET.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.DIAMOND_BOSS_HELMET.getId()))
                .save(consumer, ModItems.DIAMOND_BOSS_HELMET.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.NETHERITE_BOOTS), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.NETHERITE_BOSS_BOOTS.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.NETHERITE_BOSS_BOOTS.getId()))
                .save(consumer, ModItems.NETHERITE_BOSS_BOOTS.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.NETHERITE_LEGGINGS), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.NETHERITE_BOSS_LEGGINGS.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.NETHERITE_BOSS_LEGGINGS.getId()))
                .save(consumer, ModItems.NETHERITE_BOSS_LEGGINGS.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.NETHERITE_CHESTPLATE), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.NETHERITE_BOSS_CHESTPLATE.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.NETHERITE_BOSS_CHESTPLATE.getId()))
                .save(consumer, ModItems.NETHERITE_BOSS_CHESTPLATE.getId());

        SmithingTransformRecipeBuilder.smithing(Ingredient.EMPTY, Ingredient.of(Items.NETHERITE_HELMET), Ingredient.of(ModItems.BOSS_ARMOR_SHARD.get()), RecipeCategory.MISC, ModItems.NETHERITE_BOSS_HELMET.get())
                .unlocks("has_item", RecipeUnlockedTrigger.unlocked(ModItems.NETHERITE_BOSS_HELMET.getId()))
                .save(consumer, ModItems.NETHERITE_BOSS_HELMET.getId());
    }
}
