package org.example.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
@Setter

public class Beverage {
    private static int nextId = 1;

    private String id;
    private String name;
    private double price;
    private boolean alcoholic;

    public Beverage(String name, double price, boolean alcoholic) {
        this.id = String.format("B%03d",nextId++);
        this.name = name;
        this.price = price;
        this.alcoholic = alcoholic;
    }
}
