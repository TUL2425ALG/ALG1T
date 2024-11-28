/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.a72darray;

/**
 *
 * @author Vitvarova-J-31c9
 */

import java.util.Scanner;
public class U04StochasticMatrix {
    
    public static boolean NonNegativeNumbers (int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0 ) return false;
            }
        }
        return true;
    }
    public static boolean RowEqualsOne (int[][] matrix)
    {
        int sum;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
            if(sum!=1)return false;
            
        }
        return true;
    }
    public static boolean IsStochastic (int[][] matrix)
    {
        int sum;
        for (int i = 0; i < matrix.length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < 0 ) return false;
                sum = sum + matrix[i][j];
            }
            if(sum!=1)return false;
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
        IsStochasticMatrix = NonNegativeNumbers(matrix1) && RowEqualsOne(matrix1);
        System.out.println("Matice " + (IsStochasticMatrix ? "je " : "neni ") + "stochasticka");
    }
}
