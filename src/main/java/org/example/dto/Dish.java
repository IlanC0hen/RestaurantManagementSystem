package org.example.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter

public class Dish {
    private static int nextId = 1;

    private String id;
    private String name;
    private double price;
    private FoodType foodType;

    public Dish(String name, double price, FoodType foodType) {
        this.id = String.format("D%03d",nextId++);
        this.name = name;
        this.price = price;
        this.foodType = foodType;
    }


}
