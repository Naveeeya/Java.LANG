public class Mini2DProject {
    public static void main(String[] args) {

        char[][] Telephone = { {'1', '2', '3'},
                               {'4', '5', '6'},
                               {'7', '8', '9'},
                               {'*', '0', '#'}};

        for(char[] numbers: Telephone){
            for(char number : numbers){
                System.out.print(number+ " ");
            }
            System.out.println();
        }

    }
}
