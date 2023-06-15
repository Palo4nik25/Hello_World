import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean playAgain = true;
        int[] input = new int[3];
        while (playAgain) {
            try {
                for (int i = 0; i < input.length; i++) {
                    System.out.print("Enter your weight: ");
                    input[i] = scan.nextInt();
                }

                int min = input[0], max = input[0], mid = input[0];
                for (int i = 0; i < input.length; i++) {
                    if (input[i] < min) {
                        mid = max;
                        max = min;
                        min = input[i];
                    } else if (input[i] > max) {
                        mid = max;
                        max = input[i];
                    } else if (input[i] > min && input[i] < max) {
                        mid = input[i];
                    }
                }
                System.out.println("\nThe largest weight is: " + max + "\nMiddle weight is: " + mid + "\nThe smallest weight is: " + min);

                System.out.println("\nDo you want to play again? (Y/N): ");
                scan.nextLine();
                String ans = scan.nextLine().trim().toUpperCase();
                while (!ans.equals("Y") && !ans.equals("N")) {
                    System.out.println("Invalid input, please type: 'Y' or 'N'.");
                    ans = scan.nextLine().trim().toUpperCase();
                }
                if (ans.equals("N")) {
                    System.out.println("See you later!");
                    playAgain = false;
                    scan.close();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again.");
                scan.nextLine();
            }
        }
    }
}