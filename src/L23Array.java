import java.util.Arrays;
public class L23Array {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "peach", "orange"};


        /*
        //fruits[0] = "pineapple";
        //int NumberOfFruits = fruits.length;

        for(int i = 0; i < fruits.length; i++ ){
            System.out.println(fruits[i]);
        }
         */

        Arrays.sort(fruits);  //Arrays is a class that has methods; sorts in alphabetical order
        Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){      //an enhnced for loop that cycle once for each element in a for loop
            System.out.println(fruit);   //for('datatype of each element' 'a unique identifier for each element' : 'array that we are iterating thru')
        }

    }
}
