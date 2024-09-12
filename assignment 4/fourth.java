
import java.util.Scanner;

public class fourth {

    // Declare the Scanner object globally to avoid redeclaring it in each method
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Call each solution method here
        calculateAverage();
        checkEven();
        checkPalindrome();
        sumDigits();
    }

    // Solution 1: Calculate average
    public static void calculateAverage() {
        System.out.print("Input the first number: ");
        double x = sc.nextDouble();
        System.out.print("Input the second number: ");
        double y = sc.nextDouble();
        System.out.print("Input the third number: ");
        double z = sc.nextDouble();
        System.out.print("The average value is " + average(x, y, z) + "\n");
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }

    // Solution 2: Check if a number is even or odd
    public static void checkEven() {
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Solution 3: Check if a number is a palindrome
    public static void checkPalindrome() {
        System.out.print("Please Enter a number: ");
        int palindrome = sc.nextInt();
        if (isPalindrome(palindrome)) {
            System.out.println("Number: " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number: " + palindrome + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        return number == reverse;
    }

    // Solution 4: Sum the digits of a number
    public static void sumDigits() {
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        return sumOfDigits;
    }
}
