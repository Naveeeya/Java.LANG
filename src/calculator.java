import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;
        boolean ValidOperation = true;

        System.out.print("Enter the first number: ");
        num1= scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2= scanner.nextDouble();

        System.out.print("Enter the operation (+,-,*,/,^): ");
        operator= scanner.next().charAt(0); //next() accepts string with no space; charAt() would further accept only first item of the string; one character gets accepted



        switch(operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Denominator cannot be 0.");
                    ValidOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("invalid operation");
                ValidOperation = false;
            }


        }

        System.out.println(result);
        scanner.close();

    }
}
