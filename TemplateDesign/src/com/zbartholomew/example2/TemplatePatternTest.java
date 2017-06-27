package com.zbartholomew.example2;

// Use the Game's template method play() to demonstrate a defined way of playing game.

public class TemplatePatternTest {

    public static void main(String[] args) {

        Game game = new Soccer();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
