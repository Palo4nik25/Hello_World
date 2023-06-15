import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] input = new int[3];
        while(true) {
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
                System.out.println("The largest weight is: " + max + "\nMiddle weight is: " + mid + "\nThe smallest weight is: " + min);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input, please try again.");
                scan.nextLine();
            }
        }
    }
}
