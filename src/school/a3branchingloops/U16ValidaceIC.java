/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alg1;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Meetsys
 */
public class Ukol16 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //input
        //12345672-validni
        //12345675-nevalidni
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej IČ:");
        int number=sc.nextInt();
        Boolean valid = false;
        //process
        String ic = String.valueOf(number);
        int sum = 0;
        if(ic.length()<=8){
        /*for(int i =0;i<ic.length()-1;i++){
            sum += (ic.length()-i)*Integer.parseInt(ic.substring(i,i+1));
        }*/
        int length = ic.length();
        if (length >= 2) {
            sum += 8 * Integer.parseInt(ic.substring(0, 1));
        }
        if (length >= 3) {
            sum += 7 * Integer.parseInt(ic.substring(1, 2));
        }
        if (length >= 4) {
            sum += 6 * Integer.parseInt(ic.substring(2, 3));
        }
        if (length >= 5) {
            sum += 5 * Integer.parseInt(ic.substring(3, 4));
        }
        if (length >= 6) {
            sum += 4 * Integer.parseInt(ic.substring(4, 5));
        }
        if (length >= 7) {
            sum += 3 * Integer.parseInt(ic.substring(5, 6));
        }
        if (length >= 8) {
            sum += 2 * Integer.parseInt(ic.substring(6, 7));
        }
        
        
        sum %=11;
        
        if(sum == 0&&Integer.parseInt(ic.substring(ic.length()-1,ic.length()))==1){
            valid = true;
        }else if(sum == 1&&Integer.parseInt(ic.substring(ic.length()-1,ic.length()))==0){
            valid = true;
        }else if(sum == Integer.parseInt(ic.substring(ic.length()-1,ic.length()))){
            valid = true;
        }
        
        }
         //output
        System.out.println("IČ je "+(valid?"validní":"nevalidní"));
        
        
        
        
        
    }
    
}
