package com.weight_sort;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortLogic {
    static Scanner scan = new Scanner(System.in);
    static int[] input = new int[3];

    public static void sortLogic() {
        try {
            for (int i = 0; i < input.length; i++) {
                System.out.print("Enter your weight: ");
                input[i] = scan.nextInt();
            }
            scan.nextLine();

            Arrays.sort(input);
            int min = input[0];
            int mid = input[1];
            int max = input[2];

            System.out.println("\nThe largest weight is: " + max + "\nMiddle weight is: " + mid + "\nThe smallest weight is: " + min);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, please try again.");
            scan.nextLine();
        }
    }

    public static boolean playAgain() {
        System.out.print("\nDo you want to play again? (Y/N): ");
        String ans = scan.nextLine().trim().toUpperCase();
        while (!ans.equals("Y") && !ans.equals("N")) {
            System.out.println("Invalid input, please type: 'Y' or 'N'.");
            ans = scan.nextLine().trim().toUpperCase();
        }
        if (ans.equals("N")) {
            System.out.println("See you later!");
            return false;
        }
        return true;
    }
}
