package Day_5;

import java.util.Scanner;

public class StringComparison {

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.next();

        System.out.print("Enter second string: ");
        String str2 = scanner.next();
        boolean resultCharAt = compareUsingCharAt(str1, str2);

        boolean resultEquals = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);

        if (resultCharAt == resultEquals) {
            System.out.println("Both comparison methods give the SAME result.");
        } else {
            System.out.println("Comparison methods give DIFFERENT results.");
        }
    }
}
