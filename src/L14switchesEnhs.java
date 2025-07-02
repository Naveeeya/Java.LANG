import java.util.Scanner;

public class L14switchesEnhs {
    public static void main(String[] args) {

        // Enhanced switch - A replacement to many else if statements (Java14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();
        // day= day.substring(0,1).toLowerCase() + day.substring(1).toUpperCase();❌❌ find out the correct way


        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("It is a weekday 😊");
            case "Saturday", "Sunday" ->
                    System.out.println("It is the weekend 😎");
            default -> System.out.println(day + " is not a day");
        }
    }
}

