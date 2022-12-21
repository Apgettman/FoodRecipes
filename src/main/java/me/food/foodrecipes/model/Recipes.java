package me.food.foodrecipes.model;

import java.util.ArrayList;
import java.util.List;

public class Recipes {

    private List<Recipe> recipes = new ArrayList<Recipe>();

    private int totalItems;

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }
}
