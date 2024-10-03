
package school.a1introduction;

public class ToSeconds {
    public static void main(String[] args) {
        //Vstup
        int pocetHodin = 10;
        int pocetMinut = 10;
        int pocetSekund = 10;
        
        //Zpracovani 
        int celkem = (pocetHodin * 3600) + (pocetMinut * 60) + pocetSekund;
        
        //Vystup
        System.out.format("Čas závodníka je %d vteřin", celkem);
    }
}
