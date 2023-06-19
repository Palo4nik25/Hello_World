package com.weight_sort;

public class Main {
    public static void main(String[] args) {
        boolean isOn = true;
        while (isOn) {
            SortLogic.sortLogic();
            isOn = SortLogic.playAgain();
        }
    }




}