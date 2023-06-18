package com.moving_logic;
public class Main {
    static boolean isPlaying = true;
    public static void main(String[] args) {
        Logic game = new Logic();
        while (isPlaying) {
            Logic.countCode();
            isPlaying = game.playAgain();
        }
    }
}



