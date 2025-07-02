import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int number;
        double radius;
        double circumference;
        double area;
        double volume;
        char symbol='!';

        System.out.print("Enter the radius: ");
        radius = scanner.nextInt();

        System.out.print("Enter a number: ");
        number= scanner.nextInt();

        number = (int) Math.pow(number,2);  //Math.pow() always returns a double value regardless of the input type; so to get Math.pow() as an int we need to prefix the method with "(int)"
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.printf("the square of the number is: %,d %c\n", number, symbol); //"%,d" the comma seperated every 1000th place
        System.out.printf("The circumference is: %+.2fcm\n", circumference); //"%+.2f" the +sign specifies the value here as +ve (- would have specified -ve), .2= there can be upto 2 numbers after decimal
        System.out.printf("The area is: %.1fcm", area);

        scanner.close();

        /*
        //%[flags][width][.precision][specifier-character]
        // + = output a plus
        // , = comma grouping separator
        // ( = (only) negative numbers are enclosed in ()
        // space = displey a minus if negative, space if positive

        %d=int
        %f=double
        %c= char
        %b= boolean
        %s= string
         */
        int id1= 1;
        int id2= 23;
        int id3= 456;
        int id4= 7890;
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
        // o = zero padding (eg:- %04d by 4 characters)
        // number= right justified padding                  {WIDTH}
        // negative number = left justified padding
    }
}
