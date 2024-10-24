/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.a3branchingloops;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class U22PrimeNumber {

    public static void main(String[] args) {
        /*
        test IN  11, 4, 15, 25
        test OUT je, není, je, není
         */

        Scanner sc = new Scanner(System.in);
        boolean again = true;
        
        while (again) {
            System.out.println("Napiš KLADNÉ číslo, které chceš zjistit jestli je prvočíslo:");
            int number = sc.nextInt();
            boolean isPrimeNumber = true;

            if (number == 1) {
                isPrimeNumber = false;
            }
            for (int i = 2; i <= Math.sqrt(number) && isPrimeNumber; i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                    //break;
                }
            }
            System.out.println("Číslo " + (isPrimeNumber ? "je" : "není") + " prvočíslo");
            System.out.println("Chcete pokračovat? (A/N)");
            
            char input = sc.next().toUpperCase().charAt(0);
            
            if (input != 'A') {
                again = false;
            }
        }
    }

}
