import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age= scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favourite color: ");
        String color = scanner.nextLine(); //this nextLine() picks up the new line method '/n' as an input when we press enter on the console after entering the age, so we type scanner.nextLine() to clear the input buffer

        System.out.println("Your age is "+ age);
        System.out.println("your favourite color is " + color);

        scanner.close();

    }
}
