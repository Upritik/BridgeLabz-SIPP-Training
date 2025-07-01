package Day6_Methods;

import java.util.Scanner;

public class DivisionCalculate {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[] {remainder, quotient};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        int divisor=sc.nextInt();
        if (divisor == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                int[] result = findRemainderAndQuotient(number, divisor);
                System.out.println("Quotient: " + result[1]);
                System.out.println("Remainder: " + result[0]);
        }
    }
}
