package org.bukkit.inventory;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.recipe.CraftingBookCategory;
import org.bukkit.material.MaterialData;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a shapeless recipe, where the arrangement of the ingredients on
 * the crafting grid does not matter.
 */
public class ShapelessRecipe implements Recipe, Keyed {
    private final NamespacedKey key;
    private final ItemStack output;
    private final List<RecipeChoice> ingredients = new ArrayList<>();
    private String group = "";
    private CraftingBookCategory category = CraftingBookCategory.MISC;

    @Deprecated
    public ShapelessRecipe(@NotNull ItemStack result) {
        Preconditions.checkArgument(result.getType() != ItemType.AIR, "Recipe must have non-AIR result.");
        this.key = NamespacedKey.randomKey();
        this.output = new ItemStack(result);
    }

    /**
     * Create a shapeless recipe to craft the specified ItemStack. The
     * constructor merely determines the result and type; to set the actual
     * recipe, you'll need to call the appropriate methods.
     *
     * @param key the unique recipe key
     * @param result The item you want the recipe to create.
     * @see ShapelessRecipe#addIngredient(ItemType)
     * @see ShapelessRecipe#addIngredient(MaterialData)
     * @see ShapelessRecipe#addIngredient(int,ItemType)
     * @see ShapelessRecipe#addIngredient(int,MaterialData)
     */
    public ShapelessRecipe(@NotNull NamespacedKey key, @NotNull ItemStack result) {
        Preconditions.checkArgument(result.getType() != ItemType.AIR, "Recipe must have non-AIR result.");
        this.key = key;
        this.output = new ItemStack(result);
    }

    /**
     * Adds the specified ingredient.
     *
     * @param ingredient The ingredient to add.
     * @return The changed recipe, so you can chain calls.
     */
    @NotNull
    public ShapelessRecipe addIngredient(@NotNull MaterialData ingredient) {
        return addIngredient(1, ingredient);
    }

    /**
     * Adds the specified ingredient.
     *
     * @param ingredient The ingredient to add.
     * @return The changed recipe, so you can chain calls.
     */
    @NotNull
    public ShapelessRecipe addIngredient(@NotNull ItemType ingredient) {
        return addIngredient(1, ingredient);
    }

    /**
     * Adds multiples of the specified ingredient.
     *
     * @param count How many to add (can't be more than 9!)
     * @param ingredient The ingredient to add.
     * @return The changed recipe, so you can chain calls.
     */
    @NotNull
    public ShapelessRecipe addIngredient(int count, @NotNull MaterialData ingredient) {
        return addIngredient(count, ingredient.getItemType().asItemType());
    }

    /**
     * Adds multiples of the specified ingredient.
     *
     * @param count How many to add (can't be more than 9!)
     * @param ingredient The ingredient to add.
     * @return The changed recipe, so you can chain calls.
     */
    @NotNull
    public ShapelessRecipe addIngredient(int count, @NotNull ItemType ingredient) {
        Preconditions.checkArgument(ingredients.size() + count <= 9, "Shapeless recipes cannot have more than 9 ingredients");

        while (count-- > 0) {
            ingredients.add(new RecipeChoice.ItemTypeChoice(Collections.singletonList(ingredient)));
        }
        return this;
    }

    @NotNull
    public ShapelessRecipe addIngredient(@NotNull RecipeChoice ingredient) {
        Preconditions.checkArgument(ingredients.size() + 1 <= 9, "Shapeless recipes cannot have more than 9 ingredients");

        ingredients.add(ingredient);
        return this;
    }

    /**
     * Removes an ingredient from the list.
     *
     * @param ingredient The ingredient to remove
     * @return The changed recipe.
     */
    @NotNull
    public ShapelessRecipe removeIngredient(@NotNull RecipeChoice ingredient) {
        ingredients.remove(ingredient);

        return this;
    }

    /**
     * Removes an ingredient from the list. If the ingredient occurs multiple
     * times, only one instance of it is removed. Only removes exact matches,
     * with a data value of 0.
     *
     * @param ingredient The ingredient to remove
     * @return The changed recipe.
     */
    @NotNull
    public ShapelessRecipe removeIngredient(@NotNull ItemType ingredient) {
        return removeIngredient(1, ingredient);
    }

    /**
     * Removes an ingredient from the list. If the ingredient occurs multiple
     * times, only one instance of it is removed. If the data value is -1,
     * only ingredients with a -1 data value will be removed.
     *
     * @param ingredient The ingredient to remove
     * @return The changed recipe.
     */
    @NotNull
    public ShapelessRecipe removeIngredient(@NotNull MaterialData ingredient) {
        return removeIngredient(ingredient.getItemType().asItemType());
    }

    /**
     * Removes multiple instances of an ingredient from the list. If there are
     * less instances then specified, all will be removed. Only removes exact
     * matches, with a data value of 0.
     *
     * @param count The number of copies to remove.
     * @param ingredient The ingredient to remove
     * @return The changed recipe.
     */
    @NotNull
    public ShapelessRecipe removeIngredient(int count, @NotNull ItemType ingredient) {
        Iterator<RecipeChoice> iterator = ingredients.iterator();
        while (count > 0 && iterator.hasNext()) {
            ItemStack stack = iterator.next().getItemStack();
            if (stack.getType() == ingredient) {
                iterator.remove();
                count--;
            }
        }
        return this;
    }

    /**
     * Removes multiple instances of an ingredient from the list. If there are
     * less instances then specified, all will be removed. If the data value
     * is -1, only ingredients with a -1 data value will be removed.
     *
     * @param count The number of copies to remove.
     * @param ingredient The ingredient to remove.
     * @return The changed recipe.
     */
    @NotNull
    public ShapelessRecipe removeIngredient(int count, @NotNull MaterialData ingredient) {
        return removeIngredient(count, ingredient.getItemType().asItemType());
    }

    /**
     * Get the result of this recipe.
     *
     * @return The result stack.
     */
    @Override
    @NotNull
    public ItemStack getResult() {
        return output.clone();
    }

    /**
     * Get the list of ingredients used for this recipe.
     *
     * @return The input list
     */
    @NotNull
    public List<ItemStack> getIngredientList() {
        ArrayList<ItemStack> result = new ArrayList<ItemStack>(ingredients.size());
        for (RecipeChoice ingredient : ingredients) {
            result.add(ingredient.getItemStack().clone());
        }
        return result;
    }

    @NotNull
    public List<RecipeChoice> getChoiceList() {
        List<RecipeChoice> result = new ArrayList<>(ingredients.size());
        for (RecipeChoice ingredient : ingredients) {
            result.add(ingredient.clone());
        }
        return result;
    }

    @NotNull
    @Override
    public NamespacedKey getKey() {
        return key;
    }

    /**
     * Get the group of this recipe. Recipes with the same group may be grouped
     * together when displayed in the client.
     *
     * @return recipe group. An empty string denotes no group. May not be null.
     */
    @NotNull
    public String getGroup() {
        return group;
    }

    /**
     * Set the group of this recipe. Recipes with the same group may be grouped
     * together when displayed in the client.
     *
     * @param group recipe group. An empty string denotes no group. May not be
     * null.
     */
    public void setGroup(@NotNull String group) {
        Preconditions.checkArgument(group != null, "group cannot be null");
        this.group = group;
    }

    /**
     * Gets the category which this recipe will appear in the recipe book under.
     *
     * Defaults to {@link CraftingBookCategory#MISC} if not set.
     *
     * @return recipe book category
     */
    @NotNull
    public CraftingBookCategory getCategory() {
        return category;
    }

    /**
     * Sets the category which this recipe will appear in the recipe book under.
     *
     * Defaults to {@link CraftingBookCategory#MISC} if not set.
     *
     * @param category recipe book category
     */
    public void setCategory(@NotNull CraftingBookCategory category) {
        Preconditions.checkArgument(category != null, "category cannot be null");
        this.category = category;
    }
}
