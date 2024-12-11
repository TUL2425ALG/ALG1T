
package school.a1introduction;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author steve
 */
public class BanknotesCounts {
    public static Scanner scanner = new Scanner(System.in);
    public static Random rnd = new Random();
    public static void calcAmount(int amount){
        //deklarujeme vsechny mozne hodnoty bankovek
        int[] hodnotyBankovek = {100, 50, 20, 10,5, 2,1};
        //vytvorime si nove pole o stejne velikosti delky pole bankovek a do nej potom budeme pridavat k jednotlivym indexum hodnot bankovek  pocet
        int[] pocetBankovek = new int[hodnotyBankovek.length];
        //projedeme cele pole hodnot bankovek
        for (int i = 0; i < hodnotyBankovek.length; i++) {
//            if (amount%hodnotyBankovek[i] == 0) {
//                
//            }
            pocetBankovek[i] = amount/hodnotyBankovek[i];
            amount = (amount % hodnotyBankovek[i]);
        }
        //vypis konecnych hodnot
        for (int k = 0; k < pocetBankovek.length; k++) {
            if (hodnotyBankovek[k] >= 100) {
                System.out.println("Počet bankovek hodnoty " + hodnotyBankovek[k] + "  :  "+ pocetBankovek[k]);
            }
            else{
                System.out.println("Počet mincí hodnoty " + hodnotyBankovek[k] + "  :  "+ pocetBankovek[k]);
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
        System.out.println("Napiš číslo:");
        int inputUzivatel = getUserInput();
        System.out.println("Input uživatele: " + inputUzivatel +  "  Kč");
        calcAmount(inputUzivatel);
        int penizky = rnd.nextInt(150,10000);
        
        System.out.println("Defaultní hodnota " + penizky + " Kč");
        calcAmount(penizky);
        if ( args.length > 0) {
            try {
                int amount = Integer.parseInt( args[0]);
                System.out.println("Částka je:  " + args[0] + " Kč");
                calcAmount(amount);
            } 
            
            catch (NumberFormatException e) {
                System.out.println("Tohle není číslo");
            }
        } 
        else {
            System.out.println("Při spuštění z konzole nebyla zadána částka jako parametr....");
        }
    }
}
