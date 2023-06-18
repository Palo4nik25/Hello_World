package com.oop;
public class Main {
    static boolean bool = true;
    public static void main(String[] args) {
        Logic game = new Logic();
        while (bool) {
            Logic.countCode();
            bool = game.playAgain();
        }
    }
}



