package school.a1introduction;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author steve
 */
public class BanknotesCounts {
    private static final int[] HODNOTY_BANKOVEK = {100, 50, 20, 10, 5, 2, 1};
    public static Scanner scanner = new Scanner(System.in);
    public static Random rnd = new Random();
    
    //JV je to metoda "logiky", at vraci pole s počtem bankovek ať nic nevypisuje, pole hodnot bankovek může být globální konstanta 
    
    public static int[] calcAmount(int amount){
        //vytvorime si nove pole o stejne velikosti delky pole bankovek a do nej potom budeme pridavat k jednotlivym indexum hodnot bankovek  pocet
        int[] pocetBankovek = new int[HODNOTY_BANKOVEK.length];
        //projedeme cele pole hodnot bankovek
        for (int i = 0; i < HODNOTY_BANKOVEK.length; i++) {
            pocetBankovek[i] = amount/HODNOTY_BANKOVEK[i];
            amount = (amount % HODNOTY_BANKOVEK[i]);
        }
        //JV nová metoda uzivatelskeho rozhrani 
        return pocetBankovek;
    }
    // Uživatelské rozhraní pro výpis
    public static void printResult(int[] pocetBankovek) {
        for (int i = 0; i < HODNOTY_BANKOVEK.length; i++) {
            if (HODNOTY_BANKOVEK[i] >= 100) {
                System.out.println("Počet bankovek hodnoty " + HODNOTY_BANKOVEK[i] + " : " + pocetBankovek[i]);
            } else {
                System.out.println("Počet mincí hodnoty " + HODNOTY_BANKOVEK[i] + " : " + pocetBankovek[i]);
            }
        }
    }
    public static int getUserInput() {
        //metoda pro vstup uzivatele
        int amount = -100;
        while (amount < 0) {
            System.out.println("Zadej kladou částku:  ");
            try {
                amount = scanner.nextInt();
                
                if (amount < 0) {
                    System.out.println("Zadat můžeš jenom hodnotu která je kladná");
                }
            } 
            catch (InputMismatchException e) {
                System.out.println("Zadej číslo");

                scanner.next(); 
            }
        }
        return amount;
    }

   public static void main(String[] args) {
        int inputUzivatel = getUserInput();
        System.out.println("Input uživatele: " + inputUzivatel +  "  Kč");
        int[] vysledek = calcAmount(inputUzivatel);
        printResult(vysledek);
        
        //random hodnota
        int penizky = rnd.nextInt(150,10000);
        System.out.println("Defaultní hodnota " + penizky + " Kč");
        printResult(calcAmount(penizky));
        
        
        if ( args.length > 0) {
            try {
                int amount = Integer.parseInt( args[0]);
                System.out.println("Částka je:  " + args[0] + " Kč");
                printResult(calcAmount(amount));
            } 
            
            catch (NumberFormatException e) {
                System.out.println("Tohle není číslo");
            }
        } 
        else {
            System.out.println("Při spuštění z konzole nebyla zadána částka jako parametr....");
        }
        
        
        //druha varianta bez pouziti pole a cyklu ktera ja hure napsana
        
        System.out.println("Nyní ještě zadej hodnotu pro jednoduché řešení");
        //v tomto případě ztrácíme možnost ověření že je hodnota kladná
        int amount =  scanner.nextInt();
        
        final int bankovka100 = 100;
        final int mince50 = 50;
        final int mince20 = 20;
        final int mince10 = 10;
        final int mince5 = 5;
        final int mince2 = 2;
        final int mince1 = 1;
        
        int pocetBankovka100 = 0;        
        int pocetMince50 = 0;
        int pocetMince20 = 0;
        int pocetMince10 = 0;
        int pocetMince5 = 0;
        int pocetMince2 = 0;
        int pocetMince1 = 0;
                
        boolean workedWell = false;
        
        int zbytek = 0;
        System.out.println("\nZjednodušené řešení pro hodnotu: " + amount + " Kč");
        pocetBankovka100 = (amount/bankovka100);
        zbytek = amount%bankovka100;
        pocetMince50 = (zbytek/mince50);
        zbytek = zbytek%mince50;
        pocetMince20 =  (zbytek/mince20);
        zbytek = zbytek%mince20;
        pocetMince10 = (zbytek/mince10);
        zbytek = zbytek%mince10;
        pocetMince5 = (zbytek/mince5);
        zbytek = zbytek%mince5;
        pocetMince2 =  (zbytek/mince2);
        zbytek = zbytek%mince2;
        pocetMince1 =  (zbytek/mince1);
        zbytek = zbytek%mince1;
        if (zbytek == 0) {
               workedWell = true;
            }
        
        
        //vystup
        System.out.println("Počet mincí pro hodnotu 100:" + (amount/bankovka100));
        System.out.println("Počet mincí pro hodnotu 50:" + (pocetMince50));
        System.out.println("Počet mincí pro hodnotu 20:" + (pocetMince20));
        System.out.println("Počet mincí pro hodnotu 10:" + (pocetMince10));
        System.out.println("Počet mincí pro hodnotu 5:" + (pocetMince5));
        System.out.println("Počet mincí pro hodnotu 2:" + (pocetMince2));
        System.out.println("Počet mincí pro hodnotu 1:" + (pocetMince1) + "\n");
        if (workedWell) {
            System.out.println("Operace proběhly v pořádku \n");
        }
        else{
            System.out.println("Něco se nepovedlo \n");
        }
        
        //jeste jsem pridal zavreni scanneru na konci programu
        scanner.close();
    }
   
   //JV skuste prosim ještě program napsat celý do main bez pouziti pole a cyklu
}
