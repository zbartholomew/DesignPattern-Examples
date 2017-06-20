package com.zbartholomew.example2;

// Create concrete classes extending Burger and ColdDrink classes

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
