
package school.a3branchingloops;

import java.util.Scanner;

public class U28PerfectNumber {

    public static void main(String[] args) {
        //tests 6 = True; 29 = False; 496 = True
        
        
        Scanner scanner = new Scanner(System.in);
        int cislo;
        int soucetDelitelu = 0;
        boolean isPerfect = false;
        

        while (true) {
            System.out.print("Zadejte kladné číslo (nebo 0 pro ukončení): ");
            cislo = scanner.nextInt();

            if (cislo == 0) {
                System.out.println("Program ukončen.");
                break;
            }

                for (int i = 1; i <= cislo / 2; i++) {
                    if (cislo % i == 0) {
                        soucetDelitelu += i;
                    }
                }
                
                isPerfect = soucetDelitelu == cislo;
                soucetDelitelu =0;
                System.out.println("Cislo " + (isPerfect ? "je " : "neni ") + "dokonale.");
                
                /*if (soucetDelitelu == cislo) {
                    soucetDelitelu = 0;
                    isPerfect = true;
                    //System.out.println(cislo + " je dokonalé číslo.");
                } else {
                    soucetDelitelu = 0;
                    //System.out.println(cislo + " není dokonalé číslo.");
                }*/
          
        }

        scanner.close();
    }
}

