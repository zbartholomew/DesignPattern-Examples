package com.zbartholomew.example1;

public class Main {

    public static void main(String[] args) {

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new CanFly());

        System.out.println("Dog: " + sparky.tryToFly());
    }
}
