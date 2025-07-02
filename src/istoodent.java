public class istoodent {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    istoodent(String a, int b, double c){  //CONSTRUCTOR :-syntax = "name of class"(attributes (egs- name, age){ this.attribute = name; ...}
        this.name = a;
        this.age = b;
        this.gpa = c;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name+ " studies.");
    }

}
