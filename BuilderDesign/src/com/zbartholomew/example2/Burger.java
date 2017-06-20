package com.zbartholomew.example2;

// Create abstract classes implementing the item interface providing default functionalities.

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
