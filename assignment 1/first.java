
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of two numbers is: " + sum);
        int a = 10;
        int b = 20;
        int c = 30;
        int avg = (a + b + c) / 3;
        System.out.println("Average of three numbers is: " + avg);

        int side = 5;
        int area = side * side;
        System.out.println("Area of square is: " + area);

        //bill of stationary items
        int pen = 10;
        int pencil = 5;
        int eraser = 2;

        int total = pen + pencil + eraser;
        System.out.println("Total bill of stationary items is: " + total);

    }
}
