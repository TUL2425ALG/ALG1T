/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.a8datastructure;

import java.util.Scanner;

/**
 *
 * @author Vitvarova-J-31c9
 */
public class u10students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napis pocet studentu: ");
        int pocetStudenti = sc.nextInt();
        /*System.out.println("Kolik znamek: ");
        int pocetZnamek = sc.nextInt();
        int[][] matice = new int[pocetStudenti][pocetZnamek];
        for(int i = 0; i < matice.length ;i++){
            System.out.println("Zadej znamky studenta" + (i+1));
            for(int j = 0; j < matice[i].length; j++){
                matice[i][j] = sc.nextInt();
            }
        }*/
         int[][] matice = new int[pocetStudenti][];
         for(int i = 0; i < matice.length ;i++){
            System.out.println("Kolik znamek ma student cislo" + (i+1));
            int pocetZnamek = sc.nextInt();
            matice[i] = new int[pocetZnamek];
            for(int j = 0; j < matice[i].length; j++){
                matice[i][j] = sc.nextInt();
            }
        }
         double[] averages = avg(matice);
         for(int i=0 ; i < averages.length; i++){
             System.out.format("Student %d %.2f %n",(i+1),averages[i]);
         }
        }
    
    public static double[] avg(int[][] pole){
        double[] average = new double[pole.length];
        for(int i = 0; i < pole.length; i++){
            int sum = 0;
            for(int j = 0; j < pole[i].length; j++){
               sum += pole[i][j];
            }
            average[i] = (double)sum /pole[i].length;
            
        }
            
           return average;
    }
}
