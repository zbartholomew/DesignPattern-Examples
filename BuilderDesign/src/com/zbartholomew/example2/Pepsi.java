package com.zbartholomew.example2;

// Create concrete classes extending Burger and ColdDrink classes

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}