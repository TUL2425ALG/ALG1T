package school.a5libraryclasses;

import java.util.Scanner;

/**
 *
 * @author Honza
 */
public class DateTimeTools {

    int den, mesic, rok, K, J;
    String day;

    //JV toto ma byt knihovni trida, tj trida, ktera obsahuje !staticke! metody (neobsahuje instancni promenne nahore - den, mesic, ...), ktere jsou nezavisle - kdyz je zavolam nic k tomu nepotrebuju.
    // Vy to mate naprogramovane tak, ze musite vytvorit objekt tridy DateTimeTools, abyste mohl zavolat metodu - chceme analogii ke tride Math
    public String den_tydne(int den, int mesic, int rok) { //JV vracejte int, ktery reprezentuje poradove cislo v tydnu
        if (mesic > 12 || mesic < 0) {  //JV projde i mesic 0
            return "spatne zadany mesic"; //JV neni vhodne vracet String, ktery vraci validni vystupy i chyby. At metoda vrati treba -1, kdyz je vstupne datum nevalidni. Jinak se na to pouzivaji vyjimky
        }
        if (mesic % 2 == 1 && den > 30 || mesic == 2 && den > 29 && rok % 4 != 0 && rok % 100 == 0 && rok % 400 != 0 || mesic == 2 && den > 28 || den > 31 || den < 1) {
            return "spatne zadany den"; //JV neprojde napr. 31. 7. - 30 a 31 se nestridaji uplne pravidelne
        }
        this.den = den;

        if (mesic > 3) {
            this.mesic = mesic;
            this.K = rok % 100;
        } else {
            this.mesic = mesic + 12;
            this.K = (rok % 100) - 1;
        }
        this.rok = rok;
        this.J = rok / 100;
        int h = (this.den + (13 * (this.mesic + 1) / 5) + this.K + this.K / 4 + this.J / 4 - 2 * this.J) % 7;
        h = ((h + 5) % 7) + 1;

        //JV dejte do nove metody - zadate poradove cislo, vrati Vam den jako String
        switch (h) {
            case 1:
                this.day = "Pondeli";
                break;
            case 2:
                this.day = "Utery";
                break;
            case 3:
                this.day = "Streda";
                break;
            case 4:
                this.day = "Ctvrtek";
                break;
            case 5:
                this.day = "Patek";
                break;
            case 6:
                this.day = "Sobota";
                break;
            case 7:
                this.day = "Nedele";
                break;
        }
        return this.day;
    }

    public static void main(String[] args) {
        DateTimeTools test = new DateTimeTools();
        Scanner sc = new Scanner(System.in);
        boolean pokracovat = true;
        while (pokracovat) {
            System.out.println("Napiste den pr 11");
            int den = sc.nextInt();
            System.out.println("Napiste mesic pr 1");
            int mesic = sc.nextInt();
            System.out.println("Napiste rok pr 1981");
            int rok = sc.nextInt();
            System.out.println(test.den_tydne(den, mesic, rok));
            System.out.println("Chcete pokracovat? Y/N");
            if (sc.next().toUpperCase().charAt(0) != 'Y') {
                pokracovat = false;
            }
        }
    }
}
