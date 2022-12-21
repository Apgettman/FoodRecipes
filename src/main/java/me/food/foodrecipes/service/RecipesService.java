package me.food.foodrecipes.service;

import me.food.foodrecipes.model.Recipes;

public interface RecipesService {

    Recipes listRecipes();

    Recipes listRecipes(int pageNo, int itemsPerPage);
}
