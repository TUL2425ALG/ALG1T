/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.a8datastructure;

import java.util.Scanner;

/**
 *
 * @author tkach
 */
public class U10Students {
    // 1 10 4 5 4 5 8 9 8 9 10 12
    public static int[] average(int[][] a) {
        int[] _averages = new int[a.length];
        int sumStudent;
        for (int i = 0; i < a.length; i++) {
            sumStudent = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumStudent += a[i][j];
            }
            _averages[i] = sumStudent / a[i].length;
        }
        return _averages;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Zadejte pocet studentu
        System.out.print("Zadejte pocet studentu: ");
        int studentCount = sc.nextInt();

        // Vytvorime pole pro znamky jednotlivych studentu
        int[][] students = new int[studentCount][];

        // Zadani znamky pro kazdeho studenta
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Zadejte pocet znamek pro studenta " + (i + 1) + ": ");
            int gradesCount = sc.nextInt();
            students[i] = new int[gradesCount];
            for (int j = 0; j < gradesCount; j++) {
                System.out.print("Zadejte znamku " + (j + 1) + ": ");
                students[i][j] = sc.nextInt();
            }
        }

        // Vypocet prumeru
        int[] averages = average(students);

        // Vypis prumernych znamek
        System.out.println("Prumerne znamky studentu:");
        for (int i = 0; i < averages.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + averages[i]);
        }

        sc.close();
    }
}


