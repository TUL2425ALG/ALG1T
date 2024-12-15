package school.a6array;

import java.util.Scanner;

/**
 *
 * @author lucaf
 */
public class reversedArrayValue {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int [] reversed = reversedArrayValue(a);
        
        for (int i = 0; i < reversed.length; i++) {
             System.out.print(reversed[i] + " ");
        }
    }
    
    /**
    * 
    * @param origin 
    * @return reversed array
    */  
    public static int[] reversedArrayValue(int[] origin) {
        int[] reversed = new int[origin.length];

        for (int i = 0; i < origin.length; i++) {
            reversed[i] = origin[origin.length - 1 - i];
        }
        return reversed;
    }  
}
