/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.a72darray;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class U03SymmetricalMatrix {

    public static void main(String[] args) {
        int[][] testMatrix = {{1, 2, 1, 8},
        {2, 4, 9, 5},
        {1, 9, 8, 4},
        {8, 5, 4, 5}};
        int[][] testMatrix2 = {{1, 3, 1, 8},
        {2, 4, 9, 5},
        {1, 9, 8, 4},
        {8, 5, 4, 5}};

        int[][] testMatrix3 = {
            {5, 4, 5, 8},
            {4, 8, 9, 5},
            {5, 9, 8, 4},
            {8, 5, 4, 5}};
        int[][] testMatrix4 = {
            {5, 4, 4, 5},
            {4, 8, 8, 4},
            {5, 9, 9, 5},
            {8, 5, 5, 8}};
        
        int[][] testMatrix5 = {
            {5, 4, 4, 5},
            {4, 8, 8, 4},
            {4, 8, 8, 4},
            {5, 4, 4, 5}};
        //System.out.println((IsMainAxisSymmetrical(testMatrix)));
        //System.out.println((IsMainAxisSymmetrical(testMatrix2)));

        //System.out.println((IsSideAxisSymmetrical(testMatrix3)));
        //System.out.println((IsSideAxisSymmetrical(testMatrix)));
        
        //System.out.println((IsVerticalAxisSymmetrical(testMatrix4)));
        //System.out.println((IsVerticalAxisSymmetrical(testMatrix)));
        
        System.out.println((IsHorizontalAxisSymmetrical(testMatrix5)));
        System.out.println((IsHorizontalAxisSymmetrical(testMatrix)));
    }

    public static boolean IsMainAxisSymmetrical(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = matrix.length - 1; j > i; j--) {
                //for (int j = i + 1; j < matrix.length ; j++) {}
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean IsSideAxisSymmetrical(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - 1 - i; j++) {
                if (matrix[i][j] != matrix[matrix.length - 1 - j][matrix.length - 1 - i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean IsVerticalAxisSymmetrical(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                if (matrix[i][j] != matrix[i][matrix.length - 1 - j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public static boolean IsHorizontalAxisSymmetrical(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix.length ; j++) {
                if (matrix[i][j] != matrix[matrix.length - 1 - i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
