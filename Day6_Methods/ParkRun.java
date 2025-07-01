package Day6_Methods;
import java.util.Scanner;
public class ParkRun {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; 
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter side 1 of the triangle (in meters): ");
            double side1 = scanner.nextDouble();

            System.out.print("Enter side 2 of the triangle (in meters): ");
            double side2 = scanner.nextDouble();

            System.out.print("Enter side 3 of the triangle (in meters): ");
            double side3 = scanner.nextDouble();

            if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
                (side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
                System.out.println("Invalid triangle sides.");
            } else {
                double rounds = calculateRounds(side1, side2, side3);
                System.out.printf("The athlete must complete approximately %.2f rounds to complete 5 km.\n", rounds);
            }

    } 
}

