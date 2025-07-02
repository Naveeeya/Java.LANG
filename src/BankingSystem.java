import java.util.Scanner;

public class BankingSystem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        double balance = 100;
        boolean running = true;
        int choice;

        while(running) {
            System.out.println("     ***     ");
            System.out.println("BANKING SYSTEM");
            System.out.println("     ***     ");

            System.out.println("1. CheckBalance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. EXIT");

            System.out.print("Choose options (1-4): ");
            choice = scanner.nextInt();
            if (choice == 1) {
                ShowBalance(balance);
            } else if (choice == 2) {
                balance += Deposit();
            } else if (choice == 3) {
                balance -= Withdraw(balance);
            } else if (choice == 4 || !running) {
                System.out.println("EXIT");
            } else {
                System.out.println("Invalid choice");
            }
        }

    }

    static void ShowBalance(double balance){
        System.out.println("Balance: " + balance);
    }

    static double Deposit(){


        double amount;
        System.out.print("Enter the amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount<0){
            System.out.println("Amount cannot be negative: ");
            return 0; //you have to return in both the conditions (if and else) because the method returns a double in it
        }
        else{
            return amount; //return karna is zaroori
        }

    }

    static double Withdraw(double balance){

        double amount;
        System.out.print("Enter the amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient balance in the account.");
            return 0;
        }
        else{
            return amount;
        }
    }
}

