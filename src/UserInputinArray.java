import java.util.Scanner;

public class UserInputinArray {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        String[] books;
        int size;

        System.out.print("Enter the number of books you want to add in cart: ");
        size = scanner.nextInt();
        scanner.nextLine();

        books = new String[size];
        for(int i = 0; i < books.length; i++){
            System.out.print("Enter book: ");
            books[i] = scanner.nextLine();
        }

        for(String book : books){
           System.out.println(book);
        }


    }
}
