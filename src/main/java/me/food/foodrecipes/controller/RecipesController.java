package me.food.foodrecipes.controller;

import me.food.foodrecipes.model.Recipes;
import me.food.foodrecipes.service.RecipesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import static me.food.foodrecipes.util.RecipesConstants.ITEMS_PER_PAGE;

@RestController
@RequestMapping("/recipes")
public class RecipesController {

    private static final Logger LOG = LoggerFactory.getLogger(RecipesController.class);

    @Value("#{defaultRecipesService}")
    private RecipesService recipesService;

    public RecipesController(RecipesService recipesService) {
        this.recipesService = recipesService;
    }

    @GetMapping("/pageNo")
    public
    @ResponseBody
    Recipes list(@RequestParam(value = "pageNo", required = false) String pageNo) {
        LOG.debug("pageNo: " + pageNo);
        Recipes recipes;
        if (pageNo != null) {
            recipes = recipesService.listRecipes(Integer.parseInt(pageNo), ITEMS_PER_PAGE);
        } else {
            recipes = recipesService.listRecipes();
        }
        LOG.debug("Recipes Size: " + recipes.getRecipes().size());
        return recipes;
    }
}
