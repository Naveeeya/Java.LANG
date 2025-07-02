public class Car {

    String model = "Mustang";
    String make = "Ford";
    int year = 1964;
    int mileage = 33;
    boolean isRunning = false;


    void start(){
        System.out.println("YOU STARTED THE ENGINE");
        isRunning = true;
    }

    void stop(){
        System.out.println("YOU STOPPED THE ENGINE");
        isRunning = false;
    }

    void drive(){
        System.out.println("you are driving the " + model);
    }



}
