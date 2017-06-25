package com.zbartholomew.example2;

// Use the facade to draw various types of shapes.

public class FacadePatternTest {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}