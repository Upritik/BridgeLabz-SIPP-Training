package Day4_Arrays;
import java.util.*;
public class findfactorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Factorial of negative number doesn't exist");
        }else{
            int fact=1;
            int i=1;
            while(i<=n){
                fact *=i;
                i++;
            }
            System.out.println("fact of number" +n+ "is" +fact );
        }
    }
}
