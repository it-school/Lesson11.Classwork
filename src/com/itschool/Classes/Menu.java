package com.itschool.Classes;

import java.util.ArrayList;

public class Menu {
    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public void AddMeal(Meal meal)
    {
        meals.add(meal);
    }

    ArrayList<Meal> meals;

    public Menu() {
        meals = new ArrayList<>();
    }

    @Override
    public String toString() {
        String res =  "Meals{";
        for (Meal meal : meals)
            res += meals + ", ";
        res = res.substring(0, res.length()-2);
        return res + '}';
    }
}
