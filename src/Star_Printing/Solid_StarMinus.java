package Star_Printing;

public class Solid_StarMinus {

    public static void loop (int row_size, int col_size) {
        for(int row = 1; row <= row_size; row++) {
            for(int col = 1; col <= col_size; col++) {
                if(col % 2 == 0) 
                System.out.print("* ");
                else
                System.out.print("- ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row_size = 4;
        int col_size = 5;
        loop(row_size, col_size);
    }
    
}
