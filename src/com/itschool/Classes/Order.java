package com.itschool.Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Order {
    ArrayList<Meal> meals;
    Date time;
    boolean isFinished;

    public void AddMeal(Meal meal)
    {
        this.meals.add(meal);
    }

    public Order() {
        meals = new ArrayList<>();
        time = new Date();
        isFinished = false;
    }

    public Order(ArrayList<Meal> meals, Date time, boolean isFinished) {
        this.meals = meals;
        this.time = time;
        this.isFinished = isFinished;
    }

    public void Close()
    {
        isFinished = true;
    }

    @Override
    public String toString() {
        return "Order{"+ time +
                "\nmeals=" + Arrays.toString(meals.toArray()) +
                "\nisFinished=" + isFinished + '}';
    }
}
