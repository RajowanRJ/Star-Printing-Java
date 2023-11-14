package Star_Printing;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        int size = 4;

        for(int row = 1; row <= size; row++) {
            for(int col = 1; col <= size; col++) {
                if (col == 1 || col == size || row == 1 || row == size) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
