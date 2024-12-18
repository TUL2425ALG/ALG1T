package school.a3branchingloops;

import java.util.Scanner;

public class U39Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a, b;
        char zn;

        System.out.print("Zadejte číslo: ");
        a = sc.nextFloat();

        while (true) {
            System.out.print("Zadejte operátor (+, -, *, /), = pro výsledek: ");
            zn = sc.next().charAt(0);

            if (zn == '=') {
                break;
            }

            System.out.print("Zadejte další číslo: ");
            b = sc.nextFloat();

            switch (zn) {
                case '+': a += b; break;
                case '-': a -= b; break;
                case '*': a *= b; break;
                case '/':
                    if (b != 0) {
                        a /= b;
                    } else {
                        System.out.println("Dělení nulou nelze.");
                    }
                    break;
                default:
                    System.out.println("Neplatný operátor.");
            }
        }

        System.out.println("Výsledek: " + a);

    }
}
