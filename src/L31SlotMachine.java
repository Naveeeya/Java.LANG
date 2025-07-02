import java.util.Random;
import java.util.Scanner;

public class L31SlotMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("************************");
        System.out.println("Welcome to the slot game");
        System.out.println("************************");
        System.out.println("symbols used : 🥨 🍧 🍾 🥚 💸");
        System.out.println("********************");

        while(balance > 0){
            System.out.print("Enter bet amount: ");
            bet = scanner.nextInt();
            if(bet > balance){
                System.out.println("Insufficient Balance");
            }else if(bet <= 0){
                System.out.println("Bet amount cannot be zero or negative.");
            }else{
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = SpinRow();
            payout = Getpayout(row, bet);

            if(payout>0){
                System.out.println("you won!");
                balance += bet;
                System.out.println("your new balance is: " + balance);
            }
            else{
                System.out.println("you lost...");
            }

            System.out.println("try again");






        }


        //get payout
        // ask to play again
        //exit

        scanner.close();

    }

    static String[] SpinRow(){
        Random random = new Random();

        String[] symbols = {"🥨", "🍧", "🍾", "🥚", "💸"};
        String[] row = new String[3];

        for(int i= 0; i<3; i++){
            row[i] = symbols[random.nextInt(0, symbols.length)];
        }

        System.out.print(row[0] + row[1] + row[2]);
        System.out.println();

        return row;
    }
    static int getMultiplier(String symbol){
        return switch(symbol){
            case "🥨" -> 3;
            case "🍧" -> 2;
            case "🍾" -> 4;
            case "🥚" -> 5;
            case "💸" -> 10;
            default -> 0;
        };
    }
    static int Getpayout(String[] row, int bet){
        if (row[0].equals(row[1])) {
            return bet * getMultiplier(row[0]);
        } else if (row[1].equals(row[2])) {
            return bet * getMultiplier(row[1]);
        }
        return 0;
    }




}
