
import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: Check if a number is positive or negative
        int N = sc.nextInt();
        if (N >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

        // Part 2: Check if a patient is suffering from fever
        System.out.println("Enter the temperature of patient: ");
        double temp = sc.nextInt();
        if (temp > 100) {
            System.out.println("patient is suffering from fever");
        } else {
            System.out.println("patient is not suffering from fever");
        }

        // Part 3: Print the day of the week based on the day number
        System.out.println("Enter the day number: ");
        int Day = sc.nextInt();
        switch (Day) {
            case 1 ->
                System.out.println("Monday");
            case 2 ->
                System.out.println("Tuesday");
            case 3 ->
                System.out.println("Wednesday");
            case 4 ->
                System.out.println("Thursday");
            case 5 ->
                System.out.println("Friday");
            case 6 ->
                System.out.println("Saturday");
            case 7 ->
                System.out.println("Sunday");
            default ->
                System.out.println("day not not valid");
        }

        // Part 4: Check if a year is a leap year or not
        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}
