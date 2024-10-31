package school.a3branchingloops;

import java.util.Scanner;

public class U38GuessingNumber {
    static Scanner sc = new Scanner(System.in); //globalni promenna
    static int min = 1;
    static int max = 100;
    
    public static void main(String[] args) {
        boolean end = false;
        int choice;
        do {
            displayMenu();
            choice = choose();
            switch (choice) {
                case 1:changeRange(); break;
                case 2:computerGuesses();break;
                case 3:userGuesses(); break;
                case 0: end = true; break;
                default: System.out.println("Spatna volba.");
            }
        } while (!end);
    }

    private static void displayMenu() {
        System.out.println("1. Zmena rozsahu");
        System.out.println("2. Hada pocitac");
        System.out.println("3. Hada uzivatel");
        System.out.println("0. Konec");
    }

    private static int choose() {
        //return 0;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //input.
        System.out.println("Zadej volbu");
        int answer = sc.nextInt();
        return answer;
    }

    private static void changeRange() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void computerGuesses() {
        System.out.println("Mysli si cislo");
        int lower = min; //! pozor, nechceme menit globalni promenne
        int upper = max;
        boolean found = false;
        do{
            int middle = (lower + upper)/2;
            System.out.println("Myslel jsi si cislo " + middle + "?");
            System.out.println("Vyber \n0. Uhodl \n1. Myslene cislo je vetsi \n-1. Myslene cislo je mensi");
            int answer = sc.nextInt();
            if(answer == 0){
                found = true;
            }else if(answer == 1){
                lower = middle + 1;
            }else if (answer == -1){
                upper = middle - 1;
            }
        }while (!found && lower <= upper);
        
        if(found){
            System.out.println("Huraa");
        } else {
            System.out.println("Pravdepodobne jsi si myslel cislo mimo rozsah");
        }
    }
    
    //testing main
//    public static void main(String[] args) {
//        //Test 50, 64, 37, limitni - 1, 100, 10.5, 105
//        computerGuesses();
//    }

    private static void userGuesses() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
