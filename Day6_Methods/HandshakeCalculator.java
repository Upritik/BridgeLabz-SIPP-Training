package Day6_Methods;
import java.util.Scanner;

public class HandshakeCalculator {

    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Get input from user
            System.out.print("Enter the number of students: ");
            int numberOfStudents = scanner.nextInt();

            // Validate input
            if (numberOfStudents < 0) {
                System.out.println("Number of students cannot be negative.");
            } else {
                int handshakes = calculateHandshakes(numberOfStudents);
                System.out.println("Maximum number of handshakes possible: " + handshakes);
            }
    }

}
