package com.zbartholomew;

/**
 * Created by Zach on 6/15/2017.
 */
public class Bird extends Animal{

    // The constructor initializes all objects

    public Bird(){

        super();

        setSound("Tweet");

        // We set the Fly interface polymorphically
        // This sets the behavior as a non-flying Animal

        flyingType = new CanFly();

    }
}
