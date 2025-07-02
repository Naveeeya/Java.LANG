public class L28TwoDArray {
    public static void main(String[] args) {

        /*
        String[] Books = {"Selfhelp", "fiction", "economics", "history"};
        String[] Sports = {"Tennis", "Basketball", "Badminton", "football"};
        String[] food = {"pizza", "burger", "pasta", "baraf"};

        String[][] Randoms = {Books, Sports, food};
                                     OR

         */
        String[][] Randoms = {{"Selfhelp", "fiction", "economics", "history"},
                              {"Tennis", "Basketball", "Badminton", "football"},
                              {"pizza", "burger", "pasta", "baraf"} };

        Randoms[0][1] = "geography";

        for(String[] random : Randoms){   //iterating over the strings in Random; these strings have datatype: String[]
            for(String things : random){  //nested loop iteration of the strings further into the already iterated array
                System.out.print(things + " ");
            }
            System.out.println(); //new like after every iteration of every array
        }



    }
}
