/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.a3branchingloops;

/**
 *
 * @author d
 */
import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        //tests 6 = True; 29 = False; 496 = True
        
        
        Scanner scanner = new Scanner(System.in);
        int cislo;
        int soucetDelitelu = 0;
        

        while (true) {
            System.out.print("Zadejte kladné číslo (nebo 0 pro ukončení): ");
            cislo = scanner.nextInt();

            if (cislo == 0) {
                System.out.println("Program ukončen.");
                break;
            }

            if (cislo > 0) {

                for (int i = 1; i <= cislo / 2; i++) {
                    if (cislo % i == 0) {
                        soucetDelitelu += i;
                    }
                }

                if (soucetDelitelu == cislo) {
                    soucetDelitelu = 0;
                    System.out.println(cislo + " je dokonalé číslo.");
                } else {
                    soucetDelitelu = 0;
                    System.out.println(cislo + " není dokonalé číslo.");
                }
            } else {
                System.out.println("Zadané číslo musí být kladné.");
            }
        }

        scanner.close();
    }
}

