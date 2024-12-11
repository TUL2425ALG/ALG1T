package school.a2numbers;

import java.util.Scanner;

//Test in: 1 out: 3,14 6,28
//Test in: 1,25 out: 4,91 7,85 
public class U06CicleCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Zadej poloměr kruhu (například 1,52): ");
        double r = sc.nextDouble();
        final double PI = Math.PI;
        //procces
        double obsah = PI*Math.pow(r, 2);
        
        double obvod = 2*PI*r;
        
        //output
        System.out.format("Obsah kruhu je: %.2f a obvod je  %.2f\n" , obsah,obvod);
    }
    
}
