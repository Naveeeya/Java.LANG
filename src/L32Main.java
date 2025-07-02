public class L32Main {
    public static void main(String[] args) {


        /*
        Car car = new Car();
        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println("is your car running?: " + car.isRunning);

        // we can also reassign the attribute:-
        // car.isRunning = true;

        car.start();
        System.out.println("is your car running?: " + car.isRunning);
        car.stop();
        System.out.println("is your car running?: " + car.isRunning);

        car.drive();
         */


        /*
        istoodent student1 = new istoodent("navya", 19, 2);
        istoodent student2 = new istoodent("pingu", 20, 4.0);
        istoodent student3 = new istoodent("jojo", 19, 3.4);

        System.out.println(student1.name);
        System.out.println(student1.gpa);
        student2.study();
        */


        /*
        User user1 = new User("spongebob", "Sp@mail.in");
        User user2 = new User();
        User user3 = new User("Pickleman");


        System.out.println(user1.email);
        System.out.println(user2.email);
        System.out.println(user2.name);
        System.out.println(user3.age);
        System.out.println(user3.name);
        */


        CAR2[] cars = {(new CAR2("MUSTANG", "red", 1964)),
                       (new CAR2("toyota", "white", 2000)),
                       (new CAR2("jeep", "black", 1930))   };


        for(CAR2 car : cars){
            car.color = "blue";
        }

        for(CAR2 car : cars){
            car.drive();
        }


    }
}
