/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package school.a3branchingloops;

import java.util.Scanner;

/**
 *
 * @author matas
 */
public class U36Kosoctverec {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.println("Velikost?");
        int velikost = sc.nextInt();
        int mezera = velikost - 1;
        
       
        
                for(int i = 0;i <= velikost - 1; i++){
                    
                        for(int j = 1; j <= mezera - i; j++){
                            System.out.format(" ");
                                                        
                        }
                        
                        for(int k = 0; k <= i; k++){
                            System.out.format("*");
                            System.out.format(" ");
                        }
                        
                        System.out.println();
                    }
                    for(int i = mezera; i >= 1; i--){
                        
                        for(int j = 1; j <= velikost - i;j++){
                            System.out.format(" ");
                        }
                        
                        for(int k = 1; k <= i; k++){
                            System.out.format("* ");
                            
                        }
                        
                        System.out.println();
                    }
                    
                    
        }
    }
}
