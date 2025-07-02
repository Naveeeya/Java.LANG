public class L19methodOVERLOAD {
    public static void main(String[] args) {
        // hre in the main function we actually call our method and execute our program from here.


        // methods can have same name, but they must have different parameters
        // signature of a method = name + parameter

       String ingredients = add("flour", "eggs", "Pineapple", "oven");

        System.out.println(ingredients);

    }
    static String add(String numberone, String numbertwo,String numberthree){
        return "baking a banana bread using "+ numberone + " , two " + numbertwo + " , " + numberthree;
    }
    static String add(String numberone, String numbertwo, String numberthree, String numberfour){
        return "baking a banana bread using "+ numberone + " , two " + numbertwo + " , " + numberthree + "..., should also use an " + numberfour + " you know..uske bina kasie banaega bhondu!";
    }
}
