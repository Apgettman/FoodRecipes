package me.food.foodrecipes.builder;

import me.food.foodrecipes.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeBuilder {

    private final Recipe recipe = new Recipe();

    public Recipe build() {
        return recipe;
    }

    public RecipeBuilder withId(String id) {
        recipe.setId(id);
        return this;
    }

    public RecipeBuilder withName(String name) {
        recipe.setName(name);
        return this;
    }

    public RecipeBuilder withCookingMinutes(int minutes) {
        recipe.setCookingMinutes(minutes);
        return this;
    }

    public RecipeBuilder addIngredients(String... ingredients) {
        for (String ingredient : ingredients) {
            recipe.getMainIngredients().add(ingredient);
        }
        return this;
    }

    public static List<Recipe> getOneRecipe() {
        Recipe lemonChicken = buildRecipe("1", "Lemon Chicken", 30,
                "Lemon", "Chicken", "Thyme");

        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(lemonChicken);
        return recipeList;
    }

    public static List<Recipe> getThreeRecipes() {
        Recipe lemonChicken = buildRecipe("1", "Lemon Chicken", 30,
                "Lemon", "Chicken", "Thyme");
        Recipe beefStroganoff = buildRecipe("2", "Beef Stroganoff", 30,
                "Beef", "Mustard", "Mushrooms");
        Recipe caesarSalad = buildRecipe("3", "Caesar Salad", 25,
                "Lettuce", "Croutons", "Parmesan");

        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(lemonChicken);
        recipeList.add(beefStroganoff);
        recipeList.add(caesarSalad);
        return recipeList;
    }

    public static List<Recipe> getSevenRecipes() {
        Recipe beefStroganoff = buildRecipe("1", "Beef Stroganoff", 30,
                "Beef", "Mustard", "Mushrooms");
        Recipe caesarSalad = buildRecipe("2", "Caesar Salad", 25,
                "Lettuce", "Croutons", "Parmesan");
        Recipe gheeRice = buildRecipe("3", "Ghee Rice", 20,
                "Rice", "Ghee");
        Recipe corianderRice = buildRecipe("4", "Coriander Rice", 25,
                "Coriander", "Rice");
        Recipe chickenPizza = buildRecipe("5", "Chicken Pizza", 30,
                "Chicken", "Flour", "Onions");
        Recipe cheesePizza = buildRecipe("6", "Cheese Pizza", 30,
                "Mozzarella Cheese", "Flour", "Mushrooms");
        Recipe supremePizza = buildRecipe("7", "Supreme Pizza", 25,
                "Cheddar Cheese", "Flour", "Onions");

        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(beefStroganoff);
        recipeList.add(caesarSalad);
        recipeList.add(gheeRice);
        recipeList.add(corianderRice);
        recipeList.add(chickenPizza);
        recipeList.add(cheesePizza);
        recipeList.add(supremePizza);

        return recipeList;
    }

    public static List<Recipe> getNineRecipes() {
        Recipe lemonChicken = buildRecipe("1", "Lemon Chicken", 30,
                "Lemon", "Chicken", "Thyme");
        Recipe beefStroganoff = buildRecipe("2", "Beef Stroganoff", 30,
                "Beef", "Mustard", "Mushrooms");
        Recipe caesarSalad = buildRecipe("3", "Caesar Salad", 25,
                "Lettuce", "Croutons", "Parmesan");

        Recipe lemonRice = buildRecipe("4", "Lemon Rice", 15,
                "Lemon", "Rice", "Green Chillies");
        Recipe gheeRice = buildRecipe("5", "Ghee Rice", 20,
                "Rice", "Ghee");
        Recipe corianderRice = buildRecipe("6", "Coriander Rice", 25,
                "Coriander", "Rice");

        Recipe chickenPizza = buildRecipe("7", "Chicken Pizza", 30,
                "Chicken", "Flour", "Onions");
        Recipe cheesePizza = buildRecipe("8", "Cheese Pizza", 30,
                "Mozzarella Cheese", "Flour", "Mushrooms");
        Recipe supremePizza = buildRecipe("9", "Supreme Pizza", 25,
                "Cheddar Cheese", "Flour", "Onions");

        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(lemonChicken);
        recipeList.add(beefStroganoff);
        recipeList.add(caesarSalad);
        recipeList.add(lemonRice);
        recipeList.add(gheeRice);
        recipeList.add(corianderRice);
        recipeList.add(chickenPizza);
        recipeList.add(cheesePizza);
        recipeList.add(supremePizza);

        return recipeList;
    }

    public static Recipe buildRecipe(String id, String name, int cookingMinutes, String... ingredients) {
        return new RecipeBuilder().withId(id).withName(name).withCookingMinutes(cookingMinutes).addIngredients(ingredients).build();
    }
    ///public static List<Recipe> getRecipes() {
    //return Collections.<Recipe>emptyList();
    //return getOneRecipe();
    //return getThreeRecipes();
    //return getTenRecipes();
    //return getTwelveRecipes();
    //}
}
