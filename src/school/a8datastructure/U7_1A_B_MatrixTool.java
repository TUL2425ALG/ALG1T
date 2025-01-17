package DU71;

import java.util.Scanner;

public class U7_1A_B_MatrixTool{

    public static double[][] addMatrices(double[][] matrixA, double[][] matrixB) {
        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            throw new IllegalArgumentException("Matice musí mít stejné rozměry.");
        }

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    public static double[][] multiplyMatrices(double[][] matrixA, double[][] matrixB) {
        if (matrixA[0].length != matrixB.length) {
            throw new IllegalArgumentException("Počet sloupců první matice musí odpovídat počtu řádků druhé matice.");
        }

        int rows = matrixA.length;
        int cols = matrixB[0].length;
        int common = matrixA[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static double[][] readMatrix(Scanner scanner) {
        System.out.print("Zadejte počet řádků matice: ");
        int rows = scanner.nextInt();
        System.out.print("Zadejte počet sloupců matice: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Zadejte prvky matice (po řádcích):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        return matrix;
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Načítání první matice:");
        double[][] matrixA = readMatrix(scanner);

        System.out.println("Načítání druhé matice:");
        double[][] matrixB = readMatrix(scanner);

        System.out.println("\nVýběr operace:");
        System.out.println("1. Součet matic");
        System.out.println("2. Součin matic");
        System.out.print("Zadejte volbu: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                try {
                    double[][] sum = addMatrices(matrixA, matrixB);
                    System.out.println("Součet matic:");
                    printMatrix(sum);
                } catch (IllegalArgumentException e) {
                    System.out.println("Chyba: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    double[][] product = multiplyMatrices(matrixA, matrixB);
                    System.out.println("Součin matic:");
                    printMatrix(product);
                } catch (IllegalArgumentException e) {
                    System.out.println("Chyba: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Neplatná volba.");
        }

        scanner.close();
    }
}
