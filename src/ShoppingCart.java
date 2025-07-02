import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency='₹';
        double total;

        System.out.print("Enter the item to purchase: ");
        item= scanner.nextLine();

        System.out.print("Enter each item price: ");
        price= scanner.nextDouble();

        System.out.print("Enter quantity: ");
        quantity= scanner.nextInt();

        total= price*quantity;

        System.out.println("You purchased " + item + " for " + currency + total);
        scanner.close();
    }
}
