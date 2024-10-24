package school.a3branchingloops;

import java.util.Scanner;

public class U22PrimeNumber {

    public static void main(String[] args) {
        /*
        test IN  11, 4, 15, 25
        test OUT je, není, je, není
         */

        Scanner sc = new Scanner(System.in);
        boolean again = true;

        while (again) {
            //in
            System.out.println("Napiš KLADNÉ číslo, které chceš zjistit jestli je prvočíslo:");
            int number = sc.nextInt();
            boolean isPrimeNumber = true;
            //processing
            if (number == 1) {
                isPrimeNumber = false;
            }
            int possibleDivisor = 2;
            while (possibleDivisor <= Math.sqrt(number) && isPrimeNumber){ //for (int i = 2; i <= Math.sqrt(number) && isPrimeNumber; i++) {
                if (number % possibleDivisor == 0) {
                    isPrimeNumber = false;
                    //break;
                }
                possibleDivisor++;
            }
            //out
            System.out.println("Číslo " + (isPrimeNumber ? "je" : "není") + " prvočíslo");
            
            //repeat app
            System.out.println("Chcete pokračovat? (A, a)");
//            String s = sc.next().toUpperCase();
//            again = "A".equals(s);
            char input = sc.next().toUpperCase().charAt(0);
            if (input != 'A') {
                again = false;
            }
        }
    }

}
