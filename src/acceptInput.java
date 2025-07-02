import java.util.Scanner; // util=package, Scanner= class; scanner=(name of the object); we need to first call an object
/*
a scanner is an object
that allows to accept user input in java
 */
public class acceptInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double length;
        double width;
        double area;

        System.out.print("enter the length: ");
        length= scanner.nextDouble();

        System.out.print("Enter the breadth: ");
        width= scanner.nextDouble();

        area= length*width;

        System.out.println("the area is: "+area+"cm^2");
        scanner.close();

    }
}
