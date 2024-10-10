
package school.a1introduction;
//Test: in: 1 1 1 out: 3661
//Test: in: 25 45 21 out: 92721

import java.util.Scanner;

public class ToSeconds {
    public static void main(String[] args) {
        //Vstup
        Scanner sc = new Scanner(System.in);
//        int pocetHodin = 25;
//        int pocetMinut = 45;
//        int pocetSekund = 21;
        System.out.println("Zadej pocet hodin minut a sekund:");
        int pocetHodin = sc.nextInt();
        int pocetMinut = sc.nextInt();
        int pocetSekund = sc.nextInt();
        final int SEC_IN_HOUR = 3600;
        final int SEC_IN_MIN = 60;
        
        //Zpracovani 
        int celkem = (pocetHodin * SEC_IN_HOUR) + (pocetMinut * SEC_IN_MIN) + pocetSekund;
        
        //Vystup
        System.out.format("Čas závodníka je %d vteřin%n\n", celkem);
    }
    
    public static int convertToSeconds(int pocetHodin, int pocetMinut, int pocetSekund){
        final int SEC_IN_HOUR = 3600;
        final int SEC_IN_MIN = 60;
        int celkem = (pocetHodin * SEC_IN_HOUR) + (pocetMinut * SEC_IN_MIN) + pocetSekund;
        return celkem;
    }
    
}
