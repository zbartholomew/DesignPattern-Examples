package com.zbartholomew.example2;

// Create concrete classes implementing the Packing interface.

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
