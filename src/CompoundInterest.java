import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double principle;
        double rate;
        double timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle= scanner.nextDouble();

        System.out.print("Enter the rate of interest (in %): ");
        rate= scanner.nextDouble()/100; //since rate is in percentage, we will do 5% as 0.05

        System.out.print("Enter the number(#) of times compounded per year: ");
        timesCompounded= scanner.nextDouble();

        System.out.print("Enter the # of years: ");
        years= scanner.nextInt();

        amount= principle* Math.pow((1 + rate/timesCompounded),timesCompounded*years);
        System.out.printf("The amount after %d years is %,.2f", years, amount);
        scanner.close();

    }
}
