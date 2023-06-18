package com.oop;
import java.util.Scanner;
public class Logic {
    static int x = 0;
    static int y = 0;
    static Scanner scan = new Scanner(System.in);

    private static String inputDirection() {
        String direction = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Please enter direction (H/V): ");
            direction = scan.nextLine().trim().toUpperCase();
            if (direction.equals("H") || direction.equals("V")) {
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid direction.");
            }
        }

        return direction;
    }

    private static int inputDistance() {
        int distance = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter the distance: ");
            if (scan.hasNextInt()) {
                distance = scan.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter a valid integer distance.");
                scan.nextLine();
            }
        }

        scan.nextLine();
        return distance;
    }

    public static void countCode() {
        String direct = inputDirection();
        int dist = inputDistance();

        if(direct.equals("H")) {
            x += dist;
        } else if (direct.equals("V")) {
            y += dist;
        }
        System.out.println("X cords: " + x + "\nY cords: " + y + "\n");
    }

    public boolean playAgain() {
        System.out.print("Do you want to play again? (Y/N): ");
        String input = scan.nextLine().trim().toUpperCase();

        while (!input.equals("Y") && !input.equals("N")) {
            System.out.print("Invalid input, try again with correct value (Y/N): ");
            input = scan.nextLine().trim().toUpperCase();
        }

        if (input.equals("N")) {
            System.out.println("See you later!");
            return false;
        }

        return true;
    }
}
