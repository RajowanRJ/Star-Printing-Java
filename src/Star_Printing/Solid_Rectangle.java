package Star_Printing;

import java.util.*;

public class Solid_Rectangle {

    public static void loop (int size) {
        for(int row = 1; row <= size; row++) {
        for (int col = 1; col <= size; col++) {
            System.out.print("* ");
        }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);
        int size = x.nextInt();
        loop(size);
    }
    
}

