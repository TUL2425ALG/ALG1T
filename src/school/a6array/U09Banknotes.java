
package school.a6array;
//test: in:9999 out: 1*5000 2*2000 1*500 2*200 1*50 2*20 1*5 2*2
//test: in:-10 out: konec programu

import java.util.Scanner;


public class U09Banknotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej sumu:");
        int suma = sc.nextInt();
        int zbytek = suma;
        while(zbytek >= 0){
              
 
        int[] bankovky ={5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] pocty = new int[bankovky.length];

        
        for (int i =0; i < bankovky.length; i++){
            pocty[i] = zbytek/bankovky[i];
           zbytek = zbytek % bankovky[i];
        }
        
        //výpis
        System.out.println("Suma " + suma + " se da vyplatit:"); 
        for (int i = 0; i < pocty.length; i++) {
            if (pocty[i] != 0){
            System.out.println(pocty[i] + "*" + bankovky[i]);
            }
        }
        System.out.println("Zadej sumu:");
        zbytek = sc.nextInt();
     }   
      
    }
}
