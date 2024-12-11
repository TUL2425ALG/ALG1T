package school.a2numbers;

//Test: input: 1 1, 5 1, 1 4 output: 12, 6
//Test: input: 12 23, -4,5 7, 2 -5 output: 66,36 151

import java.util.Scanner;

public class U17TriangleCalculations {
    public static void main(String[] args) {
        
        //input
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Zadej souradnice x a y bodu A (napr. 1 1):");
        double A_x = sc.nextDouble();
        double A_y = sc.nextDouble();
        
        System.out.println("Zadej souradnice x a y bodu B (napr. 5 1):");
        double B_x = sc.nextDouble();
        double B_y = sc.nextDouble();
        
        System.out.println("Zadej souradnice x a y bodu C (napr. 1 4):");
        double C_x = sc.nextDouble();
        double C_y = sc.nextDouble();
        
        //process
        //mohlo by se jeste testovat, jestli body skutecne tvori trojuhelnik  
        //vypocet delky stran trojuhelniku
        double strana_c = Math.sqrt((B_x - A_x) * (B_x - A_x) + (B_y - A_y) * (B_y - A_y));
        double strana_b = Math.sqrt((C_x - A_x) * (C_x - A_x) + (C_y - A_y) * (C_y - A_y));
        double strana_a = Math.sqrt((B_x - C_x) * (B_x - C_x) + (B_y - C_y) * (B_y - C_y));
        
        //obvod trojuhelniku
        double obvod = strana_a + strana_b + strana_c;
       
        //obsah trojuhelniku pomoci Heronova vzorce
        double s = obvod/2;
        double obsah = Math.sqrt(s * (s - strana_a) * (s - strana_b) * (s - strana_c));
        
        //output
        
        System.out.format("Obvod trojuhelniku je: %.2f%n", obvod);
        System.out.format("Obsah trojuhelniku je: %.2f%n", obsah);
    }
}
