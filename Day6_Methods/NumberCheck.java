package Day6_Methods;
import java.util.*;
public class NumberCheck {
    public static int checkNumberSign(int number){
        if(number>0){
            return 1;
        }else if(number<0){
            return -1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result=checkNumberSign(number);
        if (result == 1) {
                System.out.println("The number is positive.");
            } else if (result == -1) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
        }
    }
}
