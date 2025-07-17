import java.util.Scanner;

class IceCream {
    String flavour;
    int sales;
    IceCream(String flavour, int sales) {
        this.flavour = flavour;
        this.sales = sales;
    }
    void display() {
        System.out.println(flavour + " - " + sales + " sales");
    }
}

public class IceCreamRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] flavourNames = {
            "Vanilla", "Chocolate", "Strawberry", "Butterscotch",
            "Mango", "Pista", "Blueberry", "Black Currant"
        };

        IceCream[] iceCreams = new IceCream[8];
        System.out.println("Enter weekly sales for each flavour:");
        for (int i = 0; i < flavourNames.length; i++) {
            System.out.print(flavourNames[i] + ": ");
            int sales = sc.nextInt();
            iceCreams[i] = new IceCream(flavourNames[i], sales);
        }

        for (int i = 0; i < iceCreams.length - 1; i++) {
            for (int j = 0; j < iceCreams.length - i - 1; j++) {
                if (iceCreams[j].sales < iceCreams[j + 1].sales) {
                    IceCream temp = iceCreams[j];
                    iceCreams[j] = iceCreams[j + 1];
                    iceCreams[j + 1] = temp;
                }
            }
        }
        System.out.println("\nFlavours sorted by popularity:");
        for (IceCream ic : iceCreams) {
            ic.display();
        }
    }
}
