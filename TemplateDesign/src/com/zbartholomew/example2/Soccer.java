package com.zbartholomew.example2;

// Create concrete classes extending the above class.

public class Soccer extends Game {

    @Override
    void endPlay() {
        System.out.println("Soccer Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Soccer Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Soccer Game Started. Enjoy the game!");
    }
}
