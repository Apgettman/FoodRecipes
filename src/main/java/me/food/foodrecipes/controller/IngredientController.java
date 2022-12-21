package me.food.foodrecipes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IngredientController {

    @GetMapping
    public String IngredientController() {
        return "Приложение запущено!";
    }
}

