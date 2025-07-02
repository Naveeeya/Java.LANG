import java.util.Scanner;

public class printMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        char character;

        System.out.print("enter number of rows: ");
        rows = scanner.nextInt();

        System.out.print("enter number of columns: ");
        columns = scanner.nextInt();

        System.out.print("enter the symbol: ");
        character = scanner.next().charAt(0);

        for(int i = 0; i < rows ;i++){
            for(int j = 0 ; j < columns ; j++){
                System.out.print(character);//for columns new line is not required print only
            }System.out.println();//for rows we need to skip to new line
        }


    scanner.close();
    }
}
