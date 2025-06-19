package Day4_Arrays;
import java.util.*;
public class problem_8 {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid number");
        }else{
            int sum = n*(n+1)/2;
            System.out.println(sum);
        }
    }   
}
