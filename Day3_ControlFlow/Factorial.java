package Day3_ControlFlow;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num < 0){
        System.out.println("Enter positive Integer Number: ");
    }else{
        int i=1;
        int fact=1;

        while (i <= num) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        }

    }
}
