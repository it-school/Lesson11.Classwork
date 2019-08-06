package com.itschool.Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Orders {
    ArrayList<Order> orders;

    public void Add(Order order)
    {
        this.orders.add(order);
    }

    public Orders() {
        this.orders = new ArrayList<>();
    }

    @Override
    public String toString() {
        String result = "Orders: \n";
        for (Order order : orders)
           result += order + "\n";
        return result;
    }
}
