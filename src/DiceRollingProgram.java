import java.util.Scanner;
import java.util.Random;

public class DiceRollingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random random = new Random();

        int NumOfDices;
        int total = 0;

        System.out.print("Enter number of dices: ");
        NumOfDices = scanner.nextInt();

        if(NumOfDices>0){
            for(int i=0; i<NumOfDices; i++){
                int roll = random.nextInt(1,7);
                System.out.println("you rolled "+roll+":");
                ASCII(roll);
                total = total + roll;
                }System.out.println("total of the dices rolled is: " + total);

        }
        else{
            System.out.println("Enter a valid number.");
        }
    }

    static void ASCII(int roll){

        String Dice1 = """
                          -----
                         |     |
                         |  ●  |
                         |     |
                          -----""";

        String Dice2 = """
                          -----
                         |     |
                         |●   ●|
                         |     |
                          -----""";
        String Dice3 = """
                          -----
                         |●    |
                         |  ●  |
                         |    ●|
                          -----""";
        String Dice4 = """
                          -----
                         |●   ●|
                         |     |
                         |●   ●|
                          -----""";
        String Dice5 = """
                          -----
                         |●   ●|
                         |  ●  |
                         |●   ●|
                          -----""";
        String Dice6 = """
                          -----
                         |● ● ●|
                         |● ● ●|
                         |● ● ●|
                          -----""";


        switch(roll){
            case 1 -> System.out.println(Dice1);
            case 2 -> System.out.println(Dice2);
            case 3 -> System.out.println(Dice3);
            case 4 -> System.out.println(Dice4);
            case 5 -> System.out.println(Dice5);
            case 6 -> System.out.println(Dice6);

        }
    }
}
