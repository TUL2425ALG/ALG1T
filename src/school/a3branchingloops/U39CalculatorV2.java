package school.a3branchingloops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//chatGPT mi vyhodil tohle:


public class U39CalculatorV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        System.out.print("Zadejte číslo: ");
        numbers.add(sc.nextFloat());

        while (true) {
            System.out.print("Zadejte operátor (+, -, *, /), = pro výsledek: ");
            char zn = sc.next().charAt(0);

            if (zn == '=') {
                break;
            }

            if (zn != '+' && zn != '-' && zn != '*' && zn != '/') {
                System.out.println("Neplatný operátor.");
                continue;
            }

            System.out.print("Zadejte další číslo: ");
            float b = sc.nextFloat();

            if ((zn == '/' && b == 0)) {
                System.out.println("Dělení nulou nelze.");
                continue;
            }

            numbers.add(b);
            operators.add(zn);
        }


        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            if (op == '*' || op == '/') {
                float result = (op == '*') ? numbers.get(i) * numbers.get(i + 1) : numbers.get(i) / numbers.get(i + 1);
                numbers.set(i, result);
                numbers.remove(i + 1);
                operators.remove(i);
                i--;
            }
        }


        while (!operators.isEmpty()) {
            char op = operators.get(0);
            float result = (op == '+') ? numbers.get(0) + numbers.get(1) : numbers.get(0) - numbers.get(1);
            numbers.set(0, result);
            numbers.remove(1);
            operators.remove(0);
        }

        System.out.println("Výsledek: " + numbers.get(0));
    }
}
