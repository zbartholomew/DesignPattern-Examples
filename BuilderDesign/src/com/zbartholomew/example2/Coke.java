package com.zbartholomew.example2;

// Create concrete classes extending Burger and ColdDrink classes

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
