package com.zbartholomew.example2;

// Create concrete classes implementing the Packing interface.

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
