public class L13TernaryOperator {
    public static void main(String[] args) {

        /*
        int score=70;

        String PassOrFail= (score >= 70) ? "PASS":"FAIL";
        System.out.println(PassOrFail);
        */
        /*
        int hours= 13;

        String timeOFday= (hours < 12) ? "A.M.":"P.M.";
        System.out.println(timeOFday);
         */

        int income= 60000;
        double taxrate= (income >= 40000) ? 0.25:0.15; //1) declare a variable, 2)put condition (in bracket), 3) ? is a ternary operator, 4) a:b (if condn true then a, if not then b gets printed)
        System.out.println(taxrate);

    }
}
