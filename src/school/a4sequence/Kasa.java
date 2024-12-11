package school.a4sequence;

import java.util.Scanner;

public class Kasa {
//10,3 3 1   20 4 2   170,9 2 1 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cena = 0;
        int pocet = 0;
        int typ = 0;
        double soucet = 0;
        int mnozstvipot = 0;
        double soucetpot = 0;
        final int CENA_NALEPKY = 200;
        double nejlevnejsiPolozka = Double.MAX_VALUE;
        
        System.out.println("Zadej cenu polozky nebo ukonci stisknutim 0");
        while ((cena = sc.nextDouble()) != 0) {

            System.out.println("Zadej pocet kusu a misto nakupu");
            pocet = sc.nextInt();
            typ = sc.nextInt();

            soucet = soucet + cena * pocet;
            if (typ == 1) {
                mnozstvipot = mnozstvipot + pocet;
                soucetpot = soucetpot + cena * pocet;
            }
            System.out.format("Prubezna cena %.2f \n", soucet);
            
            if (cena < nejlevnejsiPolozka) {
                nejlevnejsiPolozka = cena;
            }
            
            System.out.println("Zadej cenu polozky nebo ukonci stisknutim 0");

        }
        
        System.out.format("Cena nakupu %.2f \n", soucet);
        System.out.format("Mnozstvi polozek potravin %d \n", mnozstvipot);
        System.out.format("Cena vsech potravin %.2f \n", soucetpot);
        System.out.format("Cena nakupu %d \n", Math.round(soucet));

        int pocetSamolepek = (int) Math.floor(soucet / CENA_NALEPKY);

        String samolepky = (pocetSamolepek >= 1) ? "Má nárok na samolepku/y " + pocetSamolepek : "Nemá nárok na samolepku";
        System.out.println(samolepky);
        System.out.format("Minimální cena položky %.2f Kč \n", nejlevnejsiPolozka);
    }

}
