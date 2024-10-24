package school.a3branchingloops;

import java.util.Scanner;

/**
 *
 * @author Miroslav Košek
 */

//Test IN: 1700 OUT: false 365
//Test IN: 2000 OUT: true 366
//Test IN: 2001 OUT: false 365
//Test IN: 2024 OUT: true 366
public class U14LeapYear {
    
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Zadejte rok:");
        int year = sc.nextInt();
        
        //processing
        boolean isLeap = isLeap(year);
        
        int days = isLeap ? 366 : 365;
        
        //output
        if (isLeap) {
            System.out.format("Rok %d je prestupny a ma %d dni\n", year, days);
        }
        else {
            System.out.format("Rok %d neni prestupny a ma %d dni\n", year, days);
        }
    }
    
    public static boolean isLeap(int year) {
        boolean isLeap = year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0));
        
        return isLeap;
    }
    
}
