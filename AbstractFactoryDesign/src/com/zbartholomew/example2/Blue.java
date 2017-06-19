package com.zbartholomew.example2;

// Create concrete classes implementing the same interface.

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
