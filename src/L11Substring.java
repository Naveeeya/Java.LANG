import java.util.Scanner;

public class L11Substring {
    public static void main(String[] args) {

        // .substring() = A method to extract a portion of a string
        //                .substring(start, end)
        Scanner scanner= new Scanner(System.in);

        String email;
        System.out.print("Enter your email: ");
        email= scanner.next();

        if(email.contains("@")) {
            String username = email.substring(0, email.indexOf("@")); //basically we are giving the starting and the ending index of the part we want to print in the brackets
            String domain = email.substring(email.indexOf("@") + 1); // dont need to state the end index because anyways vo poora end tak hi print kar dega


            System.out.printf("the username for your email is: %s\n", username);
            System.out.printf("the domain for your email is: %s", domain);

        }
        else{
            System.out.println("your email must contain an @!");
        }
    }
}
