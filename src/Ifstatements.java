import java.util.Scanner;

public class Ifstatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;


        System.out.print("ENTER YOUR NAME: ");
        name = scanner.nextLine();

        if(name.isEmpty()){
            System.out.print("You have not entered your name.");
        }
        else{
            System.out.println("continue for the next step" + " " + name);

            System.out.print("ENTER YOUR AGE: ");
            age = scanner.nextInt();
            if(age>=60 ){
                    System.out.println("You are a senior citizen.");
            }
            else if(age>=20){
                System.out.println("You belong to the woking class.");
            }
            else if(age==0){
                System.out.println("you are a baby.");
            }
            else if(age < 0){
                System.out.println("you havent been born yet.");
            }
            else {
                System.out.println("You are a student.");
            }
            }
        }

}
