public class Conditions {
    public static void main(String[] args) {
        String name= "Navya";
        boolean isStudent= false;
        int year= 2005;
        String month= "December";
        double age= 19.45;
        char symbol= '!';

        System.out.println("If you were born in"+" " +month+" "+year+" "+"then you must be"+" "+age+" "+"years old"+symbol);
        if(isStudent){
            System.out.println(name+" is a student.");
        }
        else{
            System.out.println(name+" is not a student.");
        }
    }
}
