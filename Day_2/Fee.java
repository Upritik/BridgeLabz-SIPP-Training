package Day_2;

public class Fee {
    public static void main(String[] args){
        double fee=12500;
        double discountpercent=10;
        double discount=(discountpercent / 100)*fee;
        double final_fee=fee-discount;

        System.out.println("Original Course Fee: ₹" + fee);
        System.out.println("Discount Amount: ₹" + discount);
        System.out.println("Discounted Price to Pay: ₹" + final_fee);
    }
}
