import java.util.Scanner;

public class L10StringMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        int length;
        length= name.length();
        /*

        int letter;
        int index;
        int lastindex;


        name= name.charAt(2);
        name= name.indexOf("y");
        name= name.lastIndexOf("n");
        name= name.toLowerCase();
        name= name.toLowerCase();
        name= name.trim();
        name= name.replace("y","v");
         */

        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }
        else{
            System.out.println("hello "+ name);
        }
         */

        /*
        if(name.contains(" ")){
            System.out.println("your name contains space");
        }
        else{
            System.out.println("good name 😏");
        }
         */

        if(name.equals("Pickleman")){
            System.out.println("Pickle is tangyyy!!!");
        }
        else{
            System.out.println("Hello "+ name +". How are you?" );
        }

        System.out.println("Your name is " + length + " letter long.");

    }
}
