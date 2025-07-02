public class Varargs {
    public static void main(String[] args) {

        //varargs = allow a method to accept a varying # of arguments
        //          which avoids method overload;
        //          Java packs the arguments into an "array"
        //          ... (ellipsis)
        //          ... (a unique name for the array that it will form)

        System.out.println(average(1,3,5,7));

    }

    static double average(double... numbers){

        double sum = 0;

        if(numbers.length==0){  //in case no numbers are added when the method is called then the prgrm returns 0 instead of nill
            return 0;
        }

        for(double number: numbers){
            sum += number;
        }
        return sum/numbers.length;

    }


}
