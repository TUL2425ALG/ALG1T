package school.a7array2d;

import java.util.Scanner;

public class U04StochasticMatrix {

    public static boolean nonNegativeNumbers(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean rowEqualsOne(int[][] matrix) {
        int sum;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean IsStochastic(int[][] matrix) {
        int sum;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    return false;
                }
                sum = sum + matrix[i][j];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean IsStochasticMatrix;
        //int[][] matrix={{1,0,0,0},
        //                {0,1,0,0},
        //                {0,0,1,0}};

        int n_rows = sc.nextInt();
        int n_cols = sc.nextInt();
        int[][] matrix1 = new int[n_rows][n_cols];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        IsStochasticMatrix = nonNegativeNumbers(matrix1) && rowEqualsOne(matrix1);
        System.out.println("Matice " + (IsStochasticMatrix ? "je " : "neni ") + "stochasticka");
    }
}
