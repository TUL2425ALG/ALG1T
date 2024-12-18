/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author kubaj
 */
public class U5EratosthenovoSito {
    
                public static List<Integer> eratosthenovoSito(int limit) {
        limit += 1;
        //array plnej booleanu o velikosti limit(naše číslo + 1)
        boolean[] sito = new boolean[limit];

        //nastavíme všechny prvky na true
        for (int i = 2; i < limit; i++) {
            sito[i] = true;
        }
        //procházíme všechny prvky dokud je i*i menší jak limit a pokud je prvek true tak nastavíme všechny násobky tohoto čísla na false
        for (int i = 2; i * i < limit; i++) {
            if (sito[i]) {
                //procházíme násobky čísla i a nastavíme je na false
                for (int j = i * i; j < limit; j += i) {
                    sito[j] = false;
                }
            }
        }

        //přidáme všechny prvky které jsou true do nového listu listu
        List<Integer> prvocisla = new ArrayList<>();
        for (int i = 2; i < limit; i++) {
            if (sito[i]) {
                prvocisla.add(i);
            }
        }
        //vrátíme nový list s prvočísly
        return prvocisla;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pokracovat = "A";


        int limit;
        while ("A".equalsIgnoreCase(pokracovat)) {
            System.out.println("Zadejte celé číslo větší jak 2: ");
            try {
                limit = scanner.nextInt();
                if (limit < 2)
                {
                    System.out.println("Číslo nemůže být menší jak 2!");
                    limit = scanner.nextInt();
                }
                else{
                    List<Integer> prvocisla = eratosthenovoSito(limit);
                    System.out.println("Prvočísla do " + limit + ": " + prvocisla);
                }
              }
              catch(Exception e) {
                System.out.println("Číslo musí být kladné číslo od větší než 2!");
                limit = scanner.nextInt();
              }

              System.out.println("Chcete pokračovat A/N");
              pokracovat = scanner.next();
        }

    }
}
