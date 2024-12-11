package school.a3branchingloops;

import java.util.Scanner;

/**
 *
 * @author matas
 */
public class U36Kosoctverec {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) { //nedelat nekonecnou smycku, dat moznost programove vyskocit napr. na zadani 0 nebo zaporne cislo
            System.out.println("Velikost?");
            int velikost = sc.nextInt();
            int mezera = velikost - 1;

            for (int i = 0; i <= velikost - 1; i++) {

                for (int j = 1; j <= mezera - i; j++) {
                    System.out.format(" ");

                }

                for (int k = 0; k <= i; k++) {
                    System.out.format("*");
                    System.out.format(" ");
                }

                System.out.println();
            }
            for (int i = mezera; i >= 1; i--) {

                for (int j = 1; j <= velikost - i; j++) {
                    System.out.format(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.format("* ");

                }

                System.out.println();
            }

        }
    }
}
