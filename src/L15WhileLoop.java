import java.util.Scanner;

public class L15WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number= 0 ;

        do{
            System.out.print("Enter number between 1-10: ");
            number= scanner.nextInt();
        }while(number<1 || number>10);

        System.out.println("Your number is: "+ number);

        scanner.close();
    }
}
