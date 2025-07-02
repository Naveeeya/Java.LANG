import java.util.Locale;
import java.util.Random;
import java.util.Scanner;


public class L30RockPaperScissor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"ROCK", "PAPER", "SCISSOR"};

        String playerchoice;
        String computerchoice;
        String playagain = "yes";


        do {
            System.out.print("Enter your move (rock/paper/scissor): ");
            playerchoice = scanner.nextLine().toLowerCase();

            if(!playerchoice.equals("rock")&&!playerchoice.equals("paper")&&!playerchoice.equals("scissor")){
                System.out.println("Enter a valid move.");
                continue;
            }

            computerchoice = choices[random.nextInt(3)]; //nextInt(any index from 0-3)
            System.out.println("Computer: " + computerchoice);

            if (playerchoice.equals(computerchoice)) {
                System.out.println("TIE");
            } else if ((playerchoice.equals("rock") && computerchoice.equals("scissor")) ||
                    (playerchoice.equals("scissor") && computerchoice.equals("paper")) ||
                    (playerchoice.equals("paper") && computerchoice.equals("rock"))) {
                System.out.println("you won!");
            } else {
                System.out.println("you lost");
            }


            System.out.print("Play again (yes/no): ");
            playagain = scanner.nextLine().toLowerCase();
        } while (playagain.equals("yes"));

        System.out.println("thanks for playing");











        //CHOICE FROM USER
        //RANDOM COMPUTER CHOICE
        //WIN OR LOSE STATEMENT
        //PLAY AGAIN? [YES/NO]



    }
}
