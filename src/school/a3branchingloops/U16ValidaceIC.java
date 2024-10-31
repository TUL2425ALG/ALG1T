package school.a3branchingloops;

import java.util.Scanner;

/**
 *
 * @author Meetsys
 */
public class U16ValidaceIC {
    
    public static void main(String[] args) {
        //input
        //12345672-valid
        //12345675-invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej IČ:");
        int number=sc.nextInt();
        Boolean valid = false;
		
        //process
        String ic = String.valueOf(number);
        int sum = 0;
        if(ic.length()<=8){
		
        /*for(int i =0;i<ic.length()-1;i++){
            sum += (ic.length()-i)*(ic.charAt(i)-'0');
        }*/
		
        int length = ic.length();
        if (length >= 2) {
            sum += 8 * (ic.charAt(0)-'0');
        }
        if (length >= 3) {
            sum += 7 * (ic.charAt(1)-'0');
        }
        if (length >= 4) {
            sum += 6 * (ic.charAt(2)-'0');
        }
        if (length >= 5) {
            sum += 5 * (ic.charAt(3)-'0');
        }
        if (length >= 6) {
            sum += 4 * (ic.charAt(4)-'0');
        }
        if (length >= 7) {
            sum += 3 * (ic.charAt(5)-'0');
        }
        if (length >= 8) {
            sum += 2 * (ic.charAt(6)-'0');
        }
        
        
        int remainder = sum %=11;
        int lastDigit = ic.charAt(ic.length()-1)-'0';
		
        if(remainder == 0 && lastDigit==1){
            valid = true;
        }else if(remainder == 1 && lastDigit==0){
            valid = true;
        }else if(lastDigit==11-remainder){
            valid = true;
        }
        
        }
		
         //output
        System.out.println("IČ je "+(valid?"validní":"nevalidní"));
        
        
        
        
        
    }
    
}
