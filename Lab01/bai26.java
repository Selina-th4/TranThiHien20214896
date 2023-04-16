package thuchanh1;
import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solving first-degree equation ax + b = 0");

        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("a cannot be zero. Please try again.");
            return;
        }

        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();

        double x = -b / a;

        System.out.println("The root of the equation is: " + x);
    }
}

