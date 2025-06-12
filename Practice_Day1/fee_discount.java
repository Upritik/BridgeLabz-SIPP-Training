import java.util.Scanner;

public class fee_discount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course fee:");
        double fee=sc.nextDouble();
        System.out.println("Enter the discount Percentage:");
        double discount=sc.nextDouble();
        double discount_amount=fee*discount/100;
        double final_fee=fee-discount_amount;
        System.out.println("The final fee after discount is: "+final_fee);

    }
}
