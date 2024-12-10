package school.a3branchingloops;

import java.util.Scanner;
import java.util.Stack;

public class U39CalculatorV2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte výraz oddělenými mezerami (např. 4 + 3 * 6): ");
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        Stack<Float> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (String index : parts) {
            if (isNumber(index)) {
                numbers.push(Float.parseFloat(index));
            } else if (isOperator(index.charAt(0))) {
                char operator = index.charAt(0);

                // AI
                while (!operators.isEmpty() && hasPrecedence(operator, operators.peek())) {
                    numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
                }
                operators.push(operator);
            }
        }

        // AI
        while (!operators.isEmpty()) {
            numbers.push(applyOperation(operators.pop(), numbers.pop(), numbers.pop()));
        }


        System.out.println("Výsledek: " + numbers.pop());
    }


    public static boolean isNumber(String token) {

        try {
            Float.parseFloat(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(char zn) {
        return zn == '+' || zn == '-' || zn == '*' || zn == '/';
    }

    // AI
    private static boolean hasPrecedence(char op1, char op2) {
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    private static float applyOperation(char zn, float b, float a) {
        switch (zn) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Dělení nulou není povoleno.");
                }
                return a / b;
            default: return 0;
        }
    }
}
