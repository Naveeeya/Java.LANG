import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double weight;
        double NewWeight;
        int choice;

        System.out.println("WEIGHT CONVERSION");
        System.out.println("1. lbs to Kgs");
        System.out.println("2. Kgs to lbs");

        System.out.print("Choose from the above options:- ");
        choice= scanner.nextInt();

        if(choice==1){
            System.out.print("enter the weight in lbs: ");
            weight = scanner.nextDouble();
            NewWeight= weight*0.4535;
            System.out.println("The new weight in Kgs is: "+NewWeight);
        }
        else if(choice==2){
            System.out.print("enter the weight in Kgs: ");
            weight = scanner.nextDouble();
            NewWeight= weight*2.2046;
            System.out.println("The new weight in lbs is: "+NewWeight);
        }
        else{
            System.out.println("enter a valid choice-");
        }

        scanner.close();

    }
}
