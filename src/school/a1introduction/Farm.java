
package school.a1introduction;


public class Farm {
    
    public static void main(String[] args) {
        //input
        int pocetHus = 5;
        int pocetKraliku = 4;
        int pocetZvirat;
        int pocetNohou;
        final int HUSA_NOHY = 2;
        final int KRALIK_NOHY = 4;
        
        //processing
        pocetZvirat = pocetHus + pocetKraliku;
        pocetNohou = pocetHus * HUSA_NOHY + pocetKraliku * KRALIK_NOHY;

        //output
        System.out.println("Pocet hus: " + pocetHus + "\nPocet kraliku: " + pocetKraliku);
        System.out.println(String.format("Na farme je %d zvirat a maji %d nohou.", pocetZvirat, pocetNohou));
        //System.out.format("Na farme je %d zvirat a maji %d nohou.", pocetZvirat, pocetNohou);
    }
}
