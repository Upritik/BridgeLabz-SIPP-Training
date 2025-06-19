package Day4_Arrays;
import java.util.*;
public class Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b && a<c){
            System.out.println("A is Smaller");
        }else if(b<a && b<c){
            System.out.println("B is Smaller");
        }else{
            System.out.println("C is Smaller");
        }
    }
}
