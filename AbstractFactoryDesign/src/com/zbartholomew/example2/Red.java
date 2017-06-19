package com.zbartholomew.example2;

// Create concrete classes implementing the same interface.

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
