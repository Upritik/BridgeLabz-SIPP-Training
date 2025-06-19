package Day4_Arrays;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=0){
        System.out.println("Please enter a positive number");
    }else{
            if(n%3==0 && n%5==0){
                System.out.println("FizzBuzz");
            }else if(n%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }
        }
    }
  }