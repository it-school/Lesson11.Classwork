package com.itschool;

import com.itschool.Classes.Meal;
import com.itschool.Classes.Menu;
import com.itschool.Classes.Order;
import com.itschool.Classes.Orders;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Meal meal = new Meal("RoastBeaf", "Roasted pork", "600", 30);
        System.out.println(meal);

        Menu menu = new Menu();
        menu.AddMeal(meal);
        menu.AddMeal(new Meal("Orange juice", "Fresh orange juice", "10", 1));

        System.out.println(menu);

        Order order = new Order();
        order.AddMeal(menu.getMeals().get(1));
        order.AddMeal(menu.getMeals().get(1));

        System.out.println(order);
        order.Close();
        System.out.println(order);

        Orders orders = new Orders();
        orders.Add(order);
        ArrayList<Meal> meals = new ArrayList();
        meals.add(meal);
        meals.add(new Meal("Roasted potato", "", "300", 15));
        orders.Add(new Order(meals, new Date(), false));

        System.out.println("\n\n"+orders);

    }
}
