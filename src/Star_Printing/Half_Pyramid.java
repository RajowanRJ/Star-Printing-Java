package Star_Printing;

public class Half_Pyramid {

    public static void loop (int size) {
        for(int row = 1; row <= size; row++) {
            for(int col = row; col >= 1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int size = 4;
        loop(size);
    }
    
}
