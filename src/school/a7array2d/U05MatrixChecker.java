package school.a7array2d;

import java.util.Scanner;

/**
 * 5. Program kontroluje, zda zadaná čtvercová matice řádu N obsahuje všechny
 * hodnoty 1, 2, ..., N^2.
 *
 * @author Stastny
 * @version 1.0 02/12/2024
 */
public class U05MatrixChecker {

    public static void main(String[] args) {
        // Uzivatelske rozhrani - nacitani matice
        try (Scanner scanner = new Scanner(System.in)) {
            // Uzivatelske rozhrani - nacitani matice
            System.out.print("Zadejte velikost matice (N): ");
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            System.out.println("Zadejte prvky matice:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            // Logika programu
            if (isMatrixValid(matrix, n)) {
                System.out.println("Matice obsahuje vsechny hodnoty 1 az " + (n * n) + ".");
            } else {
                System.out.println("Matice neobsahuje vsechny hodnoty 1 az " + (n * n) + ".");
            }
        }
    }

    // Kontroluje, zda matice obsahuje vsechny hodnoty od 1 do N^2.
    public static boolean isMatrixValid(int[][] matrix, int n) {
        boolean[] foundNumbers = new boolean[n * n + 1];
        // Prochazeni matice a oznacovani nalezenych cisel
        for (int[] row : matrix) {
            for (int value : row) {
                if (value >= 1 && value <= n * n) {
                    foundNumbers[value] = true;
                }
            }
        }
        // Kontrola, zda vsechna cisla byla nalezena
        for (int i = 1; i <= n * n; i++) {
            if (!foundNumbers[i]) {
                return false;
            }
        }
        return true;
    }
}
