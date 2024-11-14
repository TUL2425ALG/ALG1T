package school.a6array;

import java.util.Scanner;

public class LoadPrintArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //1. varianta
        //int[] numbers = loadIntArray(sc);
//        System.out.println("Zadej pocet cisel"); 
//        int n = sc.nextInt();
//        int[] numbers = new int[n];
//        System.out.println("Zadej hodnoty");
//        for(int i = 0; i < numbers.length; i++){
//            numbers[i] = sc.nextInt();
//        }
        //2. varianta
        System.out.println("Zadej pocet cisel"); 
        int n = sc.nextInt();
        int[] numbers1 = new int[n];
        System.out.println("Zadej hodnoty");
        loadArray(numbers1);
        
        printArray(numbers1);
        System.out.println("");
        print(numbers1);
    }
    
    public static int[] loadIntArray(Scanner sc){
        System.out.println("Zadej pocet cisel"); 
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Zadej hodnoty");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
    
    public static double[] loadDoubleArray(Scanner sc){
        System.out.println("Zadej pocet cisel"); 
        int n = sc.nextInt();
        double[] numbers = new double[n];
        System.out.println("Zadej hodnoty");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextDouble();
        }
        return numbers;
    }
    
    //overloading pretizeni metod - rozdilny pocet nebo typ vstupnich parametru
    public static void loadArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
    }
    
    public static void loadArray(double[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextDouble();
        }
    }
    
    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); 
        }
    }
    
    public static void printArray(double[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.format("%.2f ",numbers[i]); 
        }
    }
    
    public static void print(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length - 1; i++) { //po predposledni prvek
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1] + "]"); //vypis posledniho prvku
    }
    
    
}
