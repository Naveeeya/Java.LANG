
public class L18methods {


    /*
        String name= FullName("Navya", "Khanna");
        System.out.println(name);
     */

    /*
        double result= cube(3);
        System.out.println(result);   //OR DIRECTLY:-  System.out.print(square(3));
     */


    /*
        String name="Manny";
        int age= 20;


        HappyBirthday(name, age);
        HappyBirthday(name, age);
        HappyBirthday(name, age);

    }
    static void HappyBirthday(String birthdayboi, int age){
        System.out.println("Happy birthday!");
        System.out.println("ughh parties are boring..");
        System.out.printf("Are you %d years old?\n", age);
        System.out.printf("ha! %s you've lost your teens\n", birthdayboi);
    }
     */


    public static void main(String[] args) {

        int age= 10;

        if(CheckAge(age)){
            System.out.println("you may sign up!");
        }
        else{
            System.out.println("you must be 18+ to sign up");
        }

    }
    static double square(double number){return number * number;}
    static double cube(double number){return number * number * number;}
    static String FullName(String first, String last){return first+" "+last;}
    static boolean CheckAge(int age){
        boolean status= (age >= 18) ? true:false; //idhar bhi if-else use hora tha, instead do this
        return status;

    }




}
