public class Patterns {

    public static void main(String[] args) {

        int rows = 11;
        int cols = 11;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

            
                if (i == 1 || i == 6 || i == 11) {
                    System.out.print("*");
                }
            
                else if (j == 1 || j == 6 || j == 11) {
                    System.out.print("*");
                }
                
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
