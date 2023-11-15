package org.example;

import org.example.dto.*;

public class main {
    public static void main(String[] args) {
        RestaurantManagementSystem r = new RestaurantManagementSystem();
        Dish fries = new Dish("French fries", 5, FoodType.VEGETARIAN );
        Beverage coke = new Beverage("Coke", 3 , false);
        Combo cokeAndFries = new Combo("Coke & Fries");
        cokeAndFries.addDish(fries);
        cokeAndFries.addBeverage(coke);
        r.addCombo(cokeAndFries);

        System.out.println(r);

    }
}
