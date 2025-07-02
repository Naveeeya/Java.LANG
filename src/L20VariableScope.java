public class L20VariableScope {

    static int x = 3;

    public static void main(String[] args) {

        int x = 1;
        System.out.println(x);

        anothermethod();
    }
    static void anothermethod(){
        int x = 2;
        System.out.println(x);
    }
}
/*
java prefers LOCAL variables over the CLASS variables
 */
