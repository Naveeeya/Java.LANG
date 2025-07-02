public class User {

    String name;
    String email;
    int age;


    User(){
        this.name = "guest";
        this.email = "not provided";
        this.age = 0;
    }

    User(String username){
        this.name = username;
        this.email = "not provided";
        this.age = 0;
    }

    User(String username, String email){
        this.name = username;
        this.email = email;
        this.age = 0;
    }

}
