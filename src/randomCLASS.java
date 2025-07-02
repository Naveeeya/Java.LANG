import java.util.Random;

public class randomCLASS {
    public static void main(String[] args) {
        Random random= new Random();

        int number;
        number= random.nextInt(60,70);
        System.out.println(number);

        if(number==69){
            System.out.println("Hehehe notty hore ho!!!");
        }
        else{
            System.out.println("🙂");
        }


    }
}
