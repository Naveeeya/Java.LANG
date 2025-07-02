public class CAR2 {


    String name;
    String color;
    int year;

    CAR2(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }

    void drive(){
        System.out.println("you drive a " + color + " " + name + " that was manufactured in year " + year);
    }

}
