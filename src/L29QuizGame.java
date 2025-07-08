import java.util.Scanner;

public class L29QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(""" 
                              *                            *
                             * * WELCOME TO THE QUIZ GAME * *
                              |                            |
                             """);

        String[] Questions = {"Q1. Choose the drawing tool from below-",
                "Q2. Choose the type of bottle you want-",
                "Q3. Why is a shark dangerous?"};

        String[][] Options = {{"1. pistol", "2. glue", "3. syrup", "4. brush" },
                {"1. plastic", "2. Steel", "3. copper", "4. gold" },
                {"1. It has teeth", "2. It can swim", "3. it can eat human", "4. it dances to make you dizzy"}};

        int[] Answers = {4, 2, 3};
        int score = 0;
        int guess;

        for(int i =0; i < Questions.length;i++ ){
            System.out.println(Questions[i]);
            for(String option : Options[i]){
                System.out.println(option);


            }
            System.out.print("Guess an option [1/2/3/4]: ");
            guess = scanner.nextInt();

            if(guess == Answers[i]){
                System.out.println("correct answer");
                System.out.println("*******************************");
                score += guess;
            }
            else{
                System.out.println("Wrong");
                System.out.println("********************************");
            }

        }

        System.out.println("Your total score is: " + score);
        System.out.println("********************************");
        scanner.close();



    }
}
