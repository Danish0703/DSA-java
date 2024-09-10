
import java.util.Scanner;

public class third {

    public static void main(String[] args) {
        // Print numbers 1, 4, 7
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            i += 2;
        }

        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        // Read numbers from user until user chooses to stop
        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();

            // Calculate sum of even and odd numbers
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("Do you want to continue? 1 for yes, 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);

        // Print sum of even and odd numbers
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

        // Calculate factorial of a number
        int num;
        int fact = 1;
        System.out.println("Enter any positive integer: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " = " + fact);

        // Print multiplication table of a number
        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        System.out.println("Multiplication table of " + N + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}
