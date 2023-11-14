package Star_Printing;

public class Solid_Rectangle {
    
    public static void main(String[] args) {
        
        int size = 4;

    for(int row = 1; row <= size; row++) {
        for (int col = 1; col <= size; col++) {
            System.out.print("* ");
        }
            System.out.println();
        }
    }
    
}

